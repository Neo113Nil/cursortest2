package com.vk.push.core.utils;

import android.annotation.SuppressLint;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.RemoteException;
import com.vk.push.core.domain.ComponentActions;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.c5g;
import xsna.j5g;
import xsna.ozl;

/* compiled from: PackageExtenstions.kt */
/* loaded from: classes.dex */
public final class PackageExtenstionsKt {
    public static final String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr[i2] = "0123456789ABCDEF".charAt((b & 255) >>> 4);
            cArr[i2 + 1] = "0123456789ABCDEF".charAt(b & AmfConstants.TYPE_XML_DOCUMENT_MARKER);
        }
        return new String(cArr);
    }

    public static final boolean checkAppInstalled(PackageManager packageManager, String str) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final ComponentName findServiceByAction(Context context, String str, String str2) {
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        ResolveInfo resolveServiceCompat = resolveServiceCompat(context.getPackageManager(), intent, 128);
        if (resolveServiceCompat != null) {
            return new ComponentName(str, resolveServiceCompat.serviceInfo.name);
        }
        return null;
    }

    public static final int getAppStandbyBucket(Context context) {
        Object systemService = context.getSystemService("usagestats");
        UsageStatsManager usageStatsManager = systemService instanceof UsageStatsManager ? (UsageStatsManager) systemService : null;
        if (usageStatsManager != null) {
            return usageStatsManager.getAppStandbyBucket();
        }
        return 0;
    }

    public static final String getApplicationSignature(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 134217728);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            SigningInfo signingInfo = packageInfo.signingInfo;
            Signature[] apkContentsSigners = signingInfo != null ? signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory() : null;
            if (apkContentsSigners == null) {
                apkContentsSigners = new Signature[0];
            }
            for (Signature signature : apkContentsSigners) {
                messageDigest.update(signature.toByteArray());
            }
            return a(messageDigest.digest());
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<String> getClientsPackages(PackageManager packageManager) {
        Intent intent = new Intent();
        intent.setAction(ComponentActions.CLIENT_MESSAGING_SERVICE_ACTION);
        List<ResolveInfo> queryIntentServicesCompat = queryIntentServicesCompat(packageManager, intent, 128);
        ArrayList arrayList = new ArrayList(c5g.u(queryIntentServicesCompat, 10));
        Iterator<T> it = queryIntentServicesCompat.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return arrayList;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<String> getInitializedHostPackages(PackageManager packageManager) {
        Intent intent = new Intent();
        intent.setAction("com.vk.push.HOST_SERVICE");
        List<ResolveInfo> queryIntentServicesCompat = queryIntentServicesCompat(packageManager, intent, 128);
        ArrayList arrayList = new ArrayList(c5g.u(queryIntentServicesCompat, 10));
        Iterator<T> it = queryIntentServicesCompat.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return j5g.R(arrayList);
    }

    public static final List<String> getPackagesWithDeviceId(PackageManager packageManager) {
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(8);
        ArrayList arrayList = new ArrayList(c5g.u(installedPackages, 10));
        Iterator<T> it = installedPackages.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageInfo) it.next()).packageName);
        }
        return arrayList;
    }

    public static final boolean isClientPackageInstalled(PackageManager packageManager, String str) {
        return getClientsPackages(packageManager).contains(str);
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final boolean isHostPackageInstalled(PackageManager packageManager, String str) {
        List<String> initializedHostPackages = getInitializedHostPackages(packageManager);
        return initializedHostPackages.isEmpty() ? isOldRuStoreVersionPackageInstalled(packageManager, str) : initializedHostPackages.contains(str);
    }

    public static final boolean isIgnoringBatteryOptimizations(Context context, String str) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        return powerManager != null && powerManager.isIgnoringBatteryOptimizations(str);
    }

    public static /* synthetic */ boolean isIgnoringBatteryOptimizations$default(Context context, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = context.getPackageName();
        }
        return isIgnoringBatteryOptimizations(context, str);
    }

    @ozl
    public static final boolean isOldRuStoreVersionPackageInstalled(PackageManager packageManager, String str) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<ResolveInfo> queryIntentServicesCompat(PackageManager packageManager, Intent intent, int i) {
        PackageManager.ResolveInfoFlags of;
        List<ResolveInfo> queryIntentServices;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return packageManager.queryIntentServices(intent, i);
            }
            of = PackageManager.ResolveInfoFlags.of(i);
            queryIntentServices = packageManager.queryIntentServices(intent, of);
            return queryIntentServices;
        } catch (RemoteException e) {
            e.toString();
            return EmptyList.b;
        } catch (RuntimeException e2) {
            e2.toString();
            return EmptyList.b;
        }
    }

    public static final ResolveInfo resolveServiceCompat(PackageManager packageManager, Intent intent, int i) {
        PackageManager.ResolveInfoFlags of;
        ResolveInfo resolveService;
        if (Build.VERSION.SDK_INT < 33) {
            return packageManager.resolveService(intent, i);
        }
        of = PackageManager.ResolveInfoFlags.of(i);
        resolveService = packageManager.resolveService(intent, of);
        return resolveService;
    }

    public static /* synthetic */ ResolveInfo resolveServiceCompat$default(PackageManager packageManager, Intent intent, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return resolveServiceCompat(packageManager, intent, i);
    }

    public static final boolean validateCallingPackage(Context context, String str, String str2) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str2, 134217728);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            SigningInfo signingInfo = packageInfo.signingInfo;
            Signature[] apkContentsSigners = signingInfo != null ? signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory() : null;
            if (apkContentsSigners == null) {
                apkContentsSigners = new Signature[0];
            }
            for (Signature signature : apkContentsSigners) {
                messageDigest.reset();
                messageDigest.update(signature.toByteArray());
                if (str.equalsIgnoreCase(a(messageDigest.digest()))) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return false;
    }
}
