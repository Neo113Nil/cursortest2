package c;

import Fc.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.surt.guardian.utils.Logger;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Cc.a f26464b = new Cc.a(null);

    /* renamed from: c, reason: collision with root package name */
    public static String f26465c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f26466a;

    public M0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26466a = context;
    }

    public static boolean a() {
        File file;
        try {
            file = new File("/proc/self/maps");
        } catch (Exception e10) {
            Logger.f41582a.b("EnhancedSecurityModule", "Error detecting Frida", e10);
        }
        if (file.exists() && StringsKt.contains((CharSequence) FilesKt.readText$default(file, null, 1, null), (CharSequence) "frida", true)) {
            Logger.f41582a.f("EnhancedSecurityModule", "Frida detected in process maps");
            return true;
        }
        Iterator it = CollectionsKt.listOf((Object[]) new Integer[]{27042, 27043}).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            try {
                File file2 = new File("/proc/net/tcp");
                if (file2.exists()) {
                    String readText$default = FilesKt.readText$default(file2, null, 1, null);
                    String hexString = Integer.toHexString(intValue);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
                    String upperCase = hexString.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (StringsKt.contains$default((CharSequence) readText$default, (CharSequence) upperCase, false, 2, (Object) null)) {
                        Logger.f41582a.f("EnhancedSecurityModule", "Frida port " + intValue + " detected");
                        return true;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (Exception unused) {
            }
        }
        for (String str : b.C0079b.f3669a.a()) {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "frida", false, 2, (Object) null)) {
                for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"/data/local/tmp/" + str, "/sdcard/" + str})) {
                    if (new File(str2).exists()) {
                        Logger.f41582a.f("EnhancedSecurityModule", "Frida binary found: " + str2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(String str) {
        try {
            this.f26466a.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean c() {
        try {
            if (b("com.topjohnwu.magisk")) {
                Logger.f41582a.f("EnhancedSecurityModule", "Magisk app detected");
                return true;
            }
            for (String str : CollectionsKt.listOf((Object[]) new String[]{"/sbin/.magisk", "/system/xbin/magisk", "/data/adb/magisk"})) {
                if (new File(str).exists()) {
                    Logger.f41582a.f("EnhancedSecurityModule", "Magisk file detected: " + str);
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            Logger.f41582a.b("EnhancedSecurityModule", "Error detecting Magisk", e10);
            return false;
        }
    }

    public final boolean d() {
        try {
            File file = new File("/proc/self/maps");
            if (file.exists()) {
                String readText$default = FilesKt.readText$default(file, null, 1, null);
                if (!StringsKt.contains((CharSequence) readText$default, (CharSequence) "substrate", true)) {
                    if (StringsKt.contains((CharSequence) readText$default, (CharSequence) "com.saurik", true)) {
                    }
                }
                Logger.f41582a.f("EnhancedSecurityModule", "Substrate detected in process maps");
                return true;
            }
            if (!b("com.saurik.substrate")) {
                return false;
            }
            Logger.f41582a.f("EnhancedSecurityModule", "Substrate package installed");
            return true;
        } catch (Exception e10) {
            Logger.f41582a.b("EnhancedSecurityModule", "Error detecting Substrate", e10);
            return false;
        }
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (String str : CollectionsKt.plus((Collection) b.c.f3671a.a(), (Iterable) CollectionsKt.listOf((Object[]) new String[]{"de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.ramdroid.appquarantine"}))) {
            if (b(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        try {
            try {
                Class.forName("de.robv.android.xposed.XposedBridge");
                Logger.f41582a.f("EnhancedSecurityModule", "Xposed bridge detected");
                return true;
            } catch (ClassNotFoundException unused) {
                for (String str : CollectionsKt.listOf((Object[]) new String[]{"de.robv.android.xposed.installer", "com.saurik.substrate", "com.topjohnwu.magisk"})) {
                    if (b(str)) {
                        Logger.f41582a.f("EnhancedSecurityModule", "Xposed-related package detected: " + str);
                        return true;
                    }
                }
                for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"/system/framework/XposedBridge.jar", "/system/lib/libxposed_art.so", "/system/lib64/libxposed_art.so"})) {
                    if (new File(str2).exists()) {
                        Logger.f41582a.f("EnhancedSecurityModule", "Xposed file detected: " + str2);
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e10) {
            Logger.f41582a.b("EnhancedSecurityModule", "Error detecting Xposed", e10);
            return false;
        }
    }

    public final boolean g() {
        for (String str : b.a.f3667a.a()) {
            if (new File(str).exists()) {
                Logger.f41582a.f("EnhancedSecurityModule", "Root file detected: " + str);
                return true;
            }
        }
        for (String str2 : b.c.f3671a.a()) {
            if (b(str2)) {
                Logger.f41582a.f("EnhancedSecurityModule", "Root package detected: " + str2);
                return true;
            }
        }
        for (String str3 : CollectionsKt.listOf((Object[]) new String[]{"/system", "/system/bin", "/system/xbin"})) {
            if (new File(str3).canWrite()) {
                Logger.f41582a.f("EnhancedSecurityModule", "Writable system path: " + str3);
                return true;
            }
        }
        String str4 = Build.TAGS;
        if (str4 == null || !StringsKt.contains$default((CharSequence) str4, (CharSequence) "test-keys", false, 2, (Object) null)) {
            return false;
        }
        Logger.f41582a.f("EnhancedSecurityModule", "Test keys build detected");
        return true;
    }

    public final boolean h() {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        try {
            if (f26465c == null) {
                return true;
            }
            int i10 = Build.VERSION.SDK_INT;
            PackageInfo packageInfo = i10 >= 28 ? this.f26466a.getPackageManager().getPackageInfo(this.f26466a.getPackageName(), 134217728) : this.f26466a.getPackageManager().getPackageInfo(this.f26466a.getPackageName(), 64);
            if (i10 >= 28) {
                signingInfo = packageInfo.signingInfo;
                signatureArr = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
            } else {
                signatureArr = packageInfo.signatures;
            }
            if (signatureArr != null && signatureArr.length != 0) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(signatureArr[0].toByteArray());
                Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
                boolean areEqual = Intrinsics.areEqual(ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) H0.f26430d, 30, (Object) null), f26465c);
                if (!areEqual) {
                    Logger.f41582a.f("EnhancedSecurityModule", "Signature mismatch detected");
                }
                return areEqual;
            }
            Logger.f41582a.f("EnhancedSecurityModule", "No signatures found");
            return false;
        } catch (Exception e10) {
            Logger.f41582a.b("EnhancedSecurityModule", "Error verifying signature", e10);
            return false;
        }
    }
}
