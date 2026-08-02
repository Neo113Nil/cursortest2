package w30;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import g30.InterfaceC6618a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String[] f103531e = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String[] f103532f = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String[] f103533g = {"fstab.andy", "ueventd.andy.rc"};

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String[] f103534h = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Object f103535i = U.j(new Pair("init.svc.qemud", null), new Pair("init.svc.qemu-props", null), new Pair("qemu.hw.mainkeys", null), new Pair("qemu.sf.fake_camera", null), new Pair("qemu.sf.lcd_density", null), new Pair("ro.bootloader", "unknown"), new Pair("ro.bootmode", "unknown"), new Pair("ro.hardware", "goldfish"), new Pair("ro.kernel.android.qemud", null), new Pair("ro.kernel.qemu.gles", null), new Pair("ro.kernel.qemu", "1"), new Pair("ro.product.device", "generic"), new Pair("ro.product.model", "sdk"), new Pair("ro.product.name", "sdk"), new Pair("ro.serialno", "null"));

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String[] f103536j = {"/mnt/windows/BstSharedFolder"};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f103537a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f103538b;

    /* renamed from: c, reason: collision with root package name */
    private final TelephonyManager f103539c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f103540d;

    public n(@NotNull Context context, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f103537a = fintechAnalyticInteractor;
        this.f103538b = U.l(new Pair("brand", Build.BRAND), new Pair(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, Build.PRODUCT), new Pair("device", Build.DEVICE), new Pair("fingerprint", Build.FINGERPRINT), new Pair("board", Build.BOARD), new Pair("bootloader", Build.BOOTLOADER), new Pair("hardware", Build.HARDWARE));
        TelephonyManager telephonyManager = null;
        try {
            Object systemService = context.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            }
        } catch (Exception unused) {
            L80.a.a("EmulatorInfoProvider", "Error while get TelephonyManager");
        }
        this.f103539c = telephonyManager;
        this.f103540d = Sc.k.b(new B50.b(this, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(n nVar) {
        LinkedHashMap linkedHashMap;
        Object[] objArr;
        TelephonyManager telephonyManager;
        boolean D11;
        Process process;
        boolean z11 = true;
        nVar.getClass();
        Iterator it = f103535i.entrySet().iterator();
        int i11 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = nVar.f103538b;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Process process2 = null;
            r8 = null;
            r8 = null;
            r8 = null;
            r8 = null;
            r8 = null;
            r8 = null;
            String str2 = null;
            try {
                process = Runtime.getRuntime().exec("getprop " + str);
                try {
                    String readLine = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
                    if (readLine != null && readLine.length() != 0) {
                        str2 = readLine;
                    }
                    try {
                        try {
                            process.exitValue();
                        } catch (Exception unused) {
                            Unit unit = Unit.f71690a;
                        }
                    } catch (Exception unused2) {
                        process.destroy();
                        Unit unit2 = Unit.f71690a;
                        if (str2 != null) {
                        }
                    }
                } catch (IOException unused3) {
                    if (process != null) {
                        try {
                            process.exitValue();
                        } catch (Exception unused4) {
                            process.destroy();
                            Unit unit22 = Unit.f71690a;
                            if (str2 != null) {
                            }
                        }
                    }
                    if (str2 != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    process2 = process;
                    if (process2 != null) {
                        try {
                            try {
                                process2.exitValue();
                            } catch (Exception unused5) {
                                Unit unit3 = Unit.f71690a;
                            }
                        } catch (Exception unused6) {
                            process2.destroy();
                            Unit unit4 = Unit.f71690a;
                        }
                    }
                    throw th;
                }
            } catch (IOException unused7) {
                process = null;
            } catch (Throwable th3) {
                th = th3;
            }
            if (str2 != null) {
                if (entry.getValue() != null) {
                    if (entry.getValue() != null) {
                        String str3 = (String) entry.getValue();
                        Intrinsics.checkNotNullParameter(str2, "<this>");
                        if (str3 != null ? kotlin.text.h.t(str2, str3, false) : false) {
                        }
                    }
                }
                linkedHashMap.put(entry.getKey(), str2);
                i11++;
            }
        }
        if ((i11 >= 5) == false) {
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            if (!kotlin.text.h.e0(BRAND, "generic", false)) {
                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                if (!kotlin.text.h.t(BRAND, "AndyOS", false)) {
                    String BOARD = Build.BOARD;
                    Intrinsics.checkNotNullExpressionValue(BOARD, "BOARD");
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = BOARD.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (!kotlin.text.h.e0(lowerCase, "nox", false)) {
                        String BOOTLOADER = Build.BOOTLOADER;
                        Intrinsics.checkNotNullExpressionValue(BOOTLOADER, "BOOTLOADER");
                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                        String lowerCase2 = BOOTLOADER.toLowerCase(ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        if (!kotlin.text.h.e0(lowerCase2, "nox", false)) {
                            String DEVICE = Build.DEVICE;
                            if (!DEVICE.equals("generic_x86_arm")) {
                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                if (!kotlin.text.h.t(DEVICE, "vbox86p", false)) {
                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                    if (!kotlin.text.h.t(DEVICE, "AndyWin", false)) {
                                        String FINGERPRINT = Build.FINGERPRINT;
                                        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                        if (!kotlin.text.h.t(FINGERPRINT, "sdk_gphone_x86", false)) {
                                            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                            if (!kotlin.text.h.t(FINGERPRINT, "sdk_gphone64_arm64", false)) {
                                                Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
                                                if (!kotlin.text.h.e0(FINGERPRINT, "generic", false)) {
                                                    String HARDWARE = Build.HARDWARE;
                                                    if (!HARDWARE.equals("goldfish") && !HARDWARE.equals("ranchu") && !HARDWARE.equals("qemu") && !HARDWARE.equals("vbox86") && !HARDWARE.equals("andy")) {
                                                        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                                        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                        String lowerCase3 = HARDWARE.toLowerCase(ROOT);
                                                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                                                        if (!kotlin.text.h.e0(lowerCase3, "nox", false)) {
                                                            String MANUFACTURER = Build.MANUFACTURER;
                                                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                            if (!kotlin.text.h.t(MANUFACTURER, "Genymotion", false)) {
                                                                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                if (!kotlin.text.h.t(MANUFACTURER, "Andy OSInc", false)) {
                                                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                                                    if (!kotlin.text.h.t(MANUFACTURER, "TiantianVM", false)) {
                                                                        String MODEL = Build.MODEL;
                                                                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                        if (!kotlin.text.h.t(MODEL, "google_sdk", false)) {
                                                                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                            if (!kotlin.text.h.t(MODEL, "Emulator", false)) {
                                                                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                                if (!kotlin.text.h.t(MODEL, "Android SDK built for x86", false)) {
                                                                                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                                                                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                                                    String lowerCase4 = MODEL.toLowerCase(ROOT);
                                                                                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                                                                                    if (!kotlin.text.h.t(lowerCase4, "droid4x", false)) {
                                                                                        String PRODUCT = Build.PRODUCT;
                                                                                        if (!PRODUCT.equals("sdk") && !PRODUCT.equals("vbox86p")) {
                                                                                            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                                                            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                                                                            String lowerCase5 = PRODUCT.toLowerCase(ROOT);
                                                                                            Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                                                                                            if (!lowerCase5.equals("nox")) {
                                                                                                objArr = false;
                                                                                                if (objArr == false && !b(f103531e) && !b(f103533g) && !b(f103534h) && !b(f103532f)) {
                                                                                                    telephonyManager = nVar.f103539c;
                                                                                                    if (telephonyManager != null) {
                                                                                                        D11 = false;
                                                                                                    } else {
                                                                                                        String networkOperatorName = telephonyManager.getNetworkOperatorName();
                                                                                                        Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
                                                                                                        String lowerCase6 = networkOperatorName.toLowerCase(Locale.ROOT);
                                                                                                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
                                                                                                        D11 = kotlin.text.h.D(lowerCase6, "android", true);
                                                                                                    }
                                                                                                    if (!D11 && !b(f103536j)) {
                                                                                                        z11 = false;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            objArr = true;
            if (objArr == false) {
                telephonyManager = nVar.f103539c;
                if (telephonyManager != null) {
                }
                if (!D11) {
                    z11 = false;
                }
            }
        }
        if (z11) {
            nVar.f103537a.Z0(linkedHashMap);
        }
        return z11;
    }

    private static boolean b(String[] strArr) {
        for (String str : strArr) {
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        return ((Boolean) this.f103540d.getValue()).booleanValue();
    }
}
