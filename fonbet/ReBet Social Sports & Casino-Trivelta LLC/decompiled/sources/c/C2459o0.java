package c;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.io.File;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: c.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2459o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26648a;

    public C2459o0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26648a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(2:2|3)|(25:5|6|7|8|(20:10|11|(1:13)|50|(1:52)|54|(2:60|(2:64|(14:68|(2:69|(2:71|(1:74)(1:73))(3:75|76|(1:82)(0)))|16|17|18|(3:21|(1:28)(1:43)|19)|46|47|29|30|31|(1:33)(3:38|(1:40)|42)|34|35)(0))(0))(0)|15|16|17|18|(1:19)|46|47|29|30|31|(0)(0)|34|35)|83|11|(0)|50|(0)|54|(4:56|58|60|(3:62|64|(15:66|68|(3:69|(0)(0)|73)|16|17|18|(1:19)|46|47|29|30|31|(0)(0)|34|35)(0))(0))(0)|15|16|17|18|(1:19)|46|47|29|30|31|(0)(0)|34|35)|86|6|7|8|(0)|83|11|(0)|50|(0)|54|(0)(0)|15|16|17|18|(1:19)|46|47|29|30|31|(0)(0)|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (kotlin.text.StringsKt.startsWith$default(r5, "generic", false, 2, (java.lang.Object) null) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0065, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) "generic", false, 2, (java.lang.Object) null) == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106 A[Catch: Exception -> 0x013a, TryCatch #1 {Exception -> 0x013a, blocks: (B:18:0x00f5, B:19:0x0100, B:21:0x0106, B:23:0x0128, B:25:0x0130), top: B:17:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b A[Catch: Exception -> 0x0165, TryCatch #2 {Exception -> 0x0165, blocks: (B:31:0x0145, B:33:0x014b, B:38:0x0156), top: B:30:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156 A[Catch: Exception -> 0x0165, TRY_LEAVE, TryCatch #2 {Exception -> 0x0165, blocks: (B:31:0x0145, B:33:0x014b, B:38:0x0156), top: B:30:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map a() {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        Iterator it;
        String str5 = null;
        if (Settings.Global.getInt(this.f26648a.getContentResolver(), "development_settings_enabled", 0) == 1) {
            z10 = true;
            Pair pair = TuplesKt.to("developer_options_enabled", Boolean.valueOf(z10));
            if (Settings.Global.getInt(this.f26648a.getContentResolver(), "adb_enabled", 0) == 1) {
                z11 = true;
                Pair pair2 = TuplesKt.to("adb_enabled", Boolean.valueOf(z11));
                str = Build.BRAND;
                String str6 = Build.DEVICE;
                str2 = Build.MODEL;
                str3 = Build.PRODUCT;
                str4 = Build.HARDWARE;
                Intrinsics.checkNotNull(str);
                if (StringsKt.startsWith$default(str, "generic", false, 2, (Object) null)) {
                    Intrinsics.checkNotNull(str6);
                }
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "google", false, 2, (Object) null)) {
                    Intrinsics.checkNotNull(str6);
                }
                Intrinsics.checkNotNull(str2);
                if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "google_sdk", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "Emulator", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
                    Intrinsics.checkNotNull(str4);
                    if (!StringsKt.contains$default((CharSequence) str4, (CharSequence) "goldfish", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str4, (CharSequence) "ranchu", false, 2, (Object) null)) {
                        Intrinsics.checkNotNull(str3);
                        if (!StringsKt.contains$default((CharSequence) str3, (CharSequence) "sdk", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str3, (CharSequence) "emulator", false, 2, (Object) null)) {
                            String[] strArr = {"/dev/socket/qemud", "/dev/qemu_pipe", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
                            i10 = 0;
                            while (true) {
                                if (i10 < 5) {
                                    String str7 = Build.FINGERPRINT;
                                    Intrinsics.checkNotNull(str7);
                                    if (!StringsKt.contains$default((CharSequence) str7, (CharSequence) "generic", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str7, (CharSequence) "unknown", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str7, (CharSequence) "test-keys", false, 2, (Object) null)) {
                                        z12 = false;
                                    }
                                } else {
                                    if (new File(strArr[i10]).exists()) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            Pair pair3 = TuplesKt.to("is_emulator", Boolean.valueOf(z12));
                            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                            Intrinsics.checkNotNull(networkInterfaces);
                            it = CollectionsKt.iterator(networkInterfaces);
                            while (it.hasNext()) {
                                String name = ((NetworkInterface) it.next()).getName();
                                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                String lowerCase = name.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "tun", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "ppp", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "pptp", false, 2, (Object) null)) {
                                    z13 = true;
                                    break;
                                }
                            }
                            z13 = false;
                            Pair pair4 = TuplesKt.to("is_vpn_active", Boolean.valueOf(z13));
                            if (Build.VERSION.SDK_INT >= 26) {
                                z14 = this.f26648a.getPackageManager().canRequestPackageInstalls();
                            } else {
                                if (Settings.Secure.getInt(this.f26648a.getContentResolver(), "install_non_market_apps", 0) == 1) {
                                    z14 = 0;
                                }
                                z14 = str5;
                            }
                            str5 = "unknown_sources_enabled";
                            pair2 = MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("unknown_sources_enabled", Boolean.valueOf(z14)));
                            return pair2;
                        }
                    }
                }
                z12 = true;
                Pair pair32 = TuplesKt.to("is_emulator", Boolean.valueOf(z12));
                Enumeration<NetworkInterface> networkInterfaces2 = NetworkInterface.getNetworkInterfaces();
                Intrinsics.checkNotNull(networkInterfaces2);
                it = CollectionsKt.iterator(networkInterfaces2);
                while (it.hasNext()) {
                }
                z13 = false;
                Pair pair42 = TuplesKt.to("is_vpn_active", Boolean.valueOf(z13));
                if (Build.VERSION.SDK_INT >= 26) {
                }
                str5 = "unknown_sources_enabled";
                pair2 = MapsKt.mapOf(pair, pair2, pair32, pair42, TuplesKt.to("unknown_sources_enabled", Boolean.valueOf(z14)));
                return pair2;
            }
            z11 = false;
            Pair pair22 = TuplesKt.to("adb_enabled", Boolean.valueOf(z11));
            str = Build.BRAND;
            String str62 = Build.DEVICE;
            str2 = Build.MODEL;
            str3 = Build.PRODUCT;
            str4 = Build.HARDWARE;
            Intrinsics.checkNotNull(str);
            if (StringsKt.startsWith$default(str, "generic", false, 2, (Object) null)) {
            }
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "google", false, 2, (Object) null)) {
            }
            Intrinsics.checkNotNull(str2);
            if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "google_sdk", false, 2, (Object) null)) {
                Intrinsics.checkNotNull(str4);
                if (!StringsKt.contains$default((CharSequence) str4, (CharSequence) "goldfish", false, 2, (Object) null)) {
                    Intrinsics.checkNotNull(str3);
                    if (!StringsKt.contains$default((CharSequence) str3, (CharSequence) "sdk", false, 2, (Object) null)) {
                        String[] strArr2 = {"/dev/socket/qemud", "/dev/qemu_pipe", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
                        i10 = 0;
                        while (true) {
                            if (i10 < 5) {
                            }
                            i10++;
                        }
                        Pair pair322 = TuplesKt.to("is_emulator", Boolean.valueOf(z12));
                        Enumeration<NetworkInterface> networkInterfaces22 = NetworkInterface.getNetworkInterfaces();
                        Intrinsics.checkNotNull(networkInterfaces22);
                        it = CollectionsKt.iterator(networkInterfaces22);
                        while (it.hasNext()) {
                        }
                        z13 = false;
                        Pair pair422 = TuplesKt.to("is_vpn_active", Boolean.valueOf(z13));
                        if (Build.VERSION.SDK_INT >= 26) {
                        }
                        str5 = "unknown_sources_enabled";
                        pair22 = MapsKt.mapOf(pair, pair22, pair322, pair422, TuplesKt.to("unknown_sources_enabled", Boolean.valueOf(z14)));
                        return pair22;
                    }
                }
            }
            z12 = true;
            Pair pair3222 = TuplesKt.to("is_emulator", Boolean.valueOf(z12));
            Enumeration<NetworkInterface> networkInterfaces222 = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNull(networkInterfaces222);
            it = CollectionsKt.iterator(networkInterfaces222);
            while (it.hasNext()) {
            }
            z13 = false;
            Pair pair4222 = TuplesKt.to("is_vpn_active", Boolean.valueOf(z13));
            if (Build.VERSION.SDK_INT >= 26) {
            }
            str5 = "unknown_sources_enabled";
            pair22 = MapsKt.mapOf(pair, pair22, pair3222, pair4222, TuplesKt.to("unknown_sources_enabled", Boolean.valueOf(z14)));
            return pair22;
        }
        z10 = false;
        Pair pair5 = TuplesKt.to("developer_options_enabled", Boolean.valueOf(z10));
        if (Settings.Global.getInt(this.f26648a.getContentResolver(), "adb_enabled", 0) == 1) {
        }
        z11 = false;
        Pair pair222 = TuplesKt.to("adb_enabled", Boolean.valueOf(z11));
        str = Build.BRAND;
        String str622 = Build.DEVICE;
        str2 = Build.MODEL;
        str3 = Build.PRODUCT;
        str4 = Build.HARDWARE;
        Intrinsics.checkNotNull(str);
        if (StringsKt.startsWith$default(str, "generic", false, 2, (Object) null)) {
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "google", false, 2, (Object) null)) {
        }
        Intrinsics.checkNotNull(str2);
        if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "google_sdk", false, 2, (Object) null)) {
        }
        z12 = true;
        Pair pair32222 = TuplesKt.to("is_emulator", Boolean.valueOf(z12));
        Enumeration<NetworkInterface> networkInterfaces2222 = NetworkInterface.getNetworkInterfaces();
        Intrinsics.checkNotNull(networkInterfaces2222);
        it = CollectionsKt.iterator(networkInterfaces2222);
        while (it.hasNext()) {
        }
        z13 = false;
        Pair pair42222 = TuplesKt.to("is_vpn_active", Boolean.valueOf(z13));
        if (Build.VERSION.SDK_INT >= 26) {
        }
        str5 = "unknown_sources_enabled";
        pair222 = MapsKt.mapOf(pair5, pair222, pair32222, pair42222, TuplesKt.to("unknown_sources_enabled", Boolean.valueOf(z14)));
        return pair222;
    }
}
