package k5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;

/* loaded from: classes8.dex */
public final class G2 extends D0<Om0.c> {

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, String> f70563g = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final PackageManager f70564e;

    /* renamed from: f, reason: collision with root package name */
    private final C7484C f70565f;

    G2(@NonNull Context context) {
        super(Mm0.e.UnsafeInstall);
        this.f70564e = context.getPackageManager();
        C7484C c7484c = new C7484C();
        c7484c.a("android.permission.READ_PHONE_STATE");
        c7484c.a("android.permission.ACCESS_COARSE_LOCATION");
        c7484c.a("android.permission.ACCESS_FINE_LOCATION");
        c7484c.a("android.permission.READ_PHONE_NUMBERS");
        c7484c.a("android.permission.BLUETOOTH_CONNECT");
        c7484c.a("android.permission.QUERY_ALL_PACKAGES");
        c7484c.a("android.permission.READ_EXTERNAL_STORAGE");
        c7484c.a("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE");
        c7484c.a("android.permission.NFC");
        c7484c.a("android.permission.INTERNET");
        c7484c.a("android.permission.READ_SMS");
        c7484c.a("android.permission.RECEIVE_SMS");
        c7484c.a("android.permission.SEND_SMS");
        c7484c.a("android.permission.WRITE_SMS");
        c7484c.a("android.permission.ACCESS_NETWORK_STATE");
        c7484c.a("android.permission.CHANGE_NETWORK_STATE");
        c7484c.a("android.permission.GET_ACCOUNTS");
        c7484c.a("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        c7484c.a("android.permission.WRITE_EXTERNAL_STORAGE");
        c7484c.a("android.permission.WAKE_LOCK");
        c7484c.a("android.permission.RECEIVE_BOOT_COMPLETED");
        c7484c.a("android.permission.REQUEST_DELETE_PACKAGES");
        c7484c.a("android.permission.FOREGROUND_SERVICE");
        c7484c.a("android.permission.SYSTEM_ALERT_WINDOW");
        c7484c.a("android.permission.READ_CONTACTS");
        c7484c.a("android.permission.WRITE_CONTACTS");
        c7484c.a("android.permission.READ_CALL_LOG");
        c7484c.a("android.permission.WRITE_CALL_LOG");
        c7484c.a("android.permission.WRITE_CALENDAR");
        c7484c.a("android.permission.READ_CALENDAR");
        c7484c.a("android.permission.CAMERA");
        c7484c.a("android.permission.RECORD_AUDIO");
        c7484c.a("android.permission.CALL_PHONE");
        c7484c.a("android.permission.ANSWER_PHONE_CALLS");
        c7484c.a("android.permission.USE_SIP");
        c7484c.a("android.permission.BODY_SENSORS");
        c7484c.a("android.permission.RECEIVE_WAP_PUSH");
        c7484c.a("android.permission.RECEIVE_MMS");
        c7484c.a("android.permission.PACKAGE_USAGE_STATS");
        c7484c.a("android.permission.BIND_DEVICE_ADMIN");
        c7484c.a("android.permission.SET_WALLPAPER");
        c7484c.a("android.permission.BIND_NFC_SERVICE");
        c7484c.a("android.permission.DUMP");
        c7484c.a("android.permission.ACCESS_WIFI_STATE");
        c7484c.a("android.permission.CHANGE_WIFI_STATE");
        this.f70565f = c7484c;
        C7499c c7499c = new C7499c();
        c7499c.a("android.intent.action.TIME_TICK");
        c7499c.a("android.intent.action.TIME_SET");
        c7499c.a("android.intent.action.TIMEZONE_CHANGED");
        c7499c.a("android.intent.action.BOOT_COMPLETED");
        c7499c.a("android.intent.action.PACKAGE_ADDED");
        c7499c.a("android.intent.action.PACKAGE_CHANGED");
        c7499c.a("android.intent.action.PACKAGE_REMOVED");
        c7499c.a("android.intent.action.PACKAGE_RESTARTED");
        c7499c.a("android.intent.action.PACKAGE_DATA_CLEARED");
        c7499c.a("android.intent.action.PACKAGES_SUSPENDED");
        c7499c.a("android.intent.action.PACKAGES_UNSUSPENDED");
        c7499c.a("android.intent.action.UID_REMOVED");
        c7499c.a("android.intent.action.BATTERY_CHANGED");
        c7499c.a("android.intent.action.ACTION_POWER_CONNECTED");
        c7499c.a("android.intent.action.ACTION_POWER_DISCONNECTED");
        c7499c.a("android.intent.action.ACTION_SHUTDOWN");
        C7557q1 c7557q1 = new C7557q1();
        c7557q1.a("android.intent.action.MAIN");
        c7557q1.a("android.intent.action.VIEW");
        c7557q1.a("android.intent.action.ATTACH_DATA");
        c7557q1.a("android.intent.action.EDIT");
        c7557q1.a("android.intent.action.PICK");
        c7557q1.a("android.intent.action.CHOOSER");
        c7557q1.a("android.intent.action.GET_CONTENT");
        c7557q1.a("android.intent.action.DIAL");
        c7557q1.a("android.intent.action.CALL");
        c7557q1.a("android.intent.action.SEND");
        c7557q1.a("android.intent.action.SENDTO");
        c7557q1.a("android.intent.action.ANSWER");
        c7557q1.a("android.intent.action.INSERT");
        c7557q1.a("android.intent.action.DELETE");
        c7557q1.a("android.intent.action.RUN");
        c7557q1.a("android.intent.action.SYNC");
        c7557q1.a("android.intent.action.PICK_ACTIVITY");
        c7557q1.a("android.intent.action.SEARCH");
        c7557q1.a("android.speech.action.WEB_SEARCH");
        c7557q1.a("android.intent.action.FACTORY_TEST");
        HashMap<String, String> hashMap = f70563g;
        hashMap.put("com.sec.android.app.samsungapps", "Samsung GalaxyStore");
        hashMap.put("com.android.vending", "Google Play");
        hashMap.put("com.huawei.appmarket", "Huawei AppGallery");
        hashMap.put("com.amazon.venezia", "Amazon Appstore");
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.c s() throws D1 {
        try {
            return w();
        } catch (Throwable unused) {
            return new Om0.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[Catch: all -> 0x00e5, LOOP:1: B:34:0x00d3->B:36:0x00d9, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00e5, blocks: (B:33:0x00c5, B:34:0x00d3, B:36:0x00d9), top: B:32:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0122 A[Catch: all -> 0x0158, TryCatch #3 {all -> 0x0158, blocks: (B:48:0x0113, B:50:0x0122, B:52:0x012c, B:53:0x0140, B:55:0x0148, B:57:0x014e, B:61:0x0135, B:62:0x013e, B:66:0x011c), top: B:47:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e A[Catch: all -> 0x0158, TryCatch #3 {all -> 0x0158, blocks: (B:48:0x0113, B:50:0x0122, B:52:0x012c, B:53:0x0140, B:55:0x0148, B:57:0x014e, B:61:0x0135, B:62:0x013e, B:66:0x011c), top: B:47:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011c A[Catch: all -> 0x0158, TryCatch #3 {all -> 0x0158, blocks: (B:48:0x0113, B:50:0x0122, B:52:0x012c, B:53:0x0140, B:55:0x0148, B:57:0x014e, B:61:0x0135, B:62:0x013e, B:66:0x011c), top: B:47:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Om0.c w() {
        List<ResolveInfo> queryIntentActivities;
        char c11;
        int i11;
        ApplicationInfo applicationInfo;
        String str;
        int i12;
        Om0.a aVar;
        int i13;
        PackageInfo packageInfo;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        SigningInfo signingInfo2;
        SigningInfo signingInfo3;
        PackageManager.PackageInfoFlags of2;
        Iterator it;
        PackageManager.ResolveInfoFlags of3;
        Om0.c cVar = new Om0.c();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        int i14 = Build.VERSION.SDK_INT;
        PackageManager packageManager = this.f70564e;
        char c12 = '!';
        int i15 = 0;
        if (i14 >= 33) {
            of3 = PackageManager.ResolveInfoFlags.of(0);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of3);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        }
        Iterator<ResolveInfo> it2 = queryIntentActivities.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().activityInfo.packageName;
            try {
                applicationInfo = packageManager.getApplicationInfo(str2, i15);
            } catch (Throwable unused) {
                c11 = c12;
                i11 = i15;
            }
            if ((applicationInfo.flags & 1) == 0) {
                String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
                try {
                    str = packageManager.getInstallerPackageName(str2);
                } catch (Throwable unused2) {
                    str = null;
                }
                if (str == null) {
                    str = "null";
                }
                HashMap<String, String> hashMap = f70563g;
                String str3 = hashMap.get(str);
                if (str3 != null) {
                    str = str3;
                }
                try {
                    i11 = i15;
                    try {
                        i12 = (int) TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - packageManager.getPackageInfo(str2, 4096).firstInstallTime);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        i12 = -1;
                        aVar = new Om0.a();
                        C7484C c7484c = this.f70565f;
                        Om0.b bVar = new Om0.b();
                        Om0.a aVar2 = new Om0.a();
                        List<String> asList = Arrays.asList(packageManager.getPackageInfo(str2, 4096).requestedPermissions);
                        Integer valueOf = Integer.valueOf(c7484c.c().size());
                        aVar2.put("d", c7484c.b(asList));
                        aVar2.put("s", valueOf);
                        bVar.add(aVar2);
                        aVar.put("permissions", bVar);
                        Om0.b bVar2 = new Om0.b();
                        it = Arrays.asList(packageManager.getPackageInfo(str2, 4).services).iterator();
                        while (it.hasNext()) {
                        }
                        aVar.put(ResultDTO.CONTENT_TYPE_SERVICES, bVar2);
                        aVar.put(AppMeasurementSdk.ConditionalUserProperty.NAME, charSequence);
                        aVar.put("package", str2);
                        aVar.put("installer", str);
                        aVar.put("time", Integer.valueOf(i12));
                        i13 = Build.VERSION.SDK_INT;
                        if (i13 < 28) {
                        }
                        c11 = '!';
                        if (i13 < 33) {
                        }
                        if (i13 < 28) {
                        }
                        if (signatureArr[i11].hashCode() != 0) {
                            cVar.add(aVar);
                        }
                        c12 = c11;
                        i15 = i11;
                    }
                } catch (PackageManager.NameNotFoundException unused4) {
                    i11 = i15;
                }
                aVar = new Om0.a();
                C7484C c7484c2 = this.f70565f;
                Om0.b bVar3 = new Om0.b();
                try {
                    Om0.a aVar22 = new Om0.a();
                    List<String> asList2 = Arrays.asList(packageManager.getPackageInfo(str2, 4096).requestedPermissions);
                    Integer valueOf2 = Integer.valueOf(c7484c2.c().size());
                    aVar22.put("d", c7484c2.b(asList2));
                    aVar22.put("s", valueOf2);
                    bVar3.add(aVar22);
                } catch (Throwable unused5) {
                }
                aVar.put("permissions", bVar3);
                Om0.b bVar22 = new Om0.b();
                try {
                    it = Arrays.asList(packageManager.getPackageInfo(str2, 4).services).iterator();
                    while (it.hasNext()) {
                        bVar22.add(((PackageItemInfo) it.next()).name);
                    }
                } catch (Throwable unused6) {
                }
                aVar.put(ResultDTO.CONTENT_TYPE_SERVICES, bVar22);
                aVar.put(AppMeasurementSdk.ConditionalUserProperty.NAME, charSequence);
                aVar.put("package", str2);
                aVar.put("installer", str);
                aVar.put("time", Integer.valueOf(i12));
                try {
                    i13 = Build.VERSION.SDK_INT;
                    int i16 = i13 < 28 ? 134217728 : 64;
                    c11 = '!';
                    if (i13 < 33) {
                        try {
                            of2 = PackageManager.PackageInfoFlags.of(i16);
                            packageInfo = packageManager.getPackageInfo(str2, of2);
                        } catch (Throwable unused7) {
                            cVar.add(aVar);
                            c12 = c11;
                            i15 = i11;
                        }
                    } else {
                        packageInfo = packageManager.getPackageInfo(str2, i16);
                    }
                    if (i13 < 28) {
                        signingInfo = packageInfo.signingInfo;
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (hasMultipleSigners) {
                            signingInfo3 = packageInfo.signingInfo;
                            signatureArr = signingInfo3.getApkContentsSigners();
                        } else {
                            signingInfo2 = packageInfo.signingInfo;
                            signatureArr = signingInfo2.getSigningCertificateHistory();
                        }
                    } else {
                        signatureArr = packageInfo.signatures;
                    }
                    if (signatureArr[i11].hashCode() != 0 && !hashMap.containsValue(str)) {
                        cVar.add(aVar);
                    }
                } catch (Throwable unused8) {
                    c11 = '!';
                }
                c12 = c11;
                i15 = i11;
            }
        }
        return cVar;
    }
}
