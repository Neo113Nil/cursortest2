package ai.verisoul.sdk.helpers.emulator;

import ai.verisoul.sdk.logger.Logger;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.twilio.voice.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0012\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0003J\b\u0010\u000e\u001a\u00020\u0006H\u0002J#\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\nH\u0003J\b\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lai/verisoul/sdk/helpers/emulator/EmulatorHelperImpl;", "Lai/verisoul/sdk/helpers/emulator/EmulatorHelper;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isCheckPackage", "", "isTelephony", "mListPackageName", "", "", "tag", "checkAdvanced", "checkBasic", "checkDeviceId", "checkFiles", "targets", "", "type", "([Ljava/lang/String;Ljava/lang/String;)Z", "checkImsi", "checkIp", "checkOperatorNameAndroid", "checkPackageName", "checkPhoneNumber", "checkQEmuDrivers", "checkQEmuProps", "checkTelephony", "detect", "getProp", "context", "property", "isEmulator", "isSupportTelePhony", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmulatorHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmulatorHelperImpl.kt\nai/verisoul/sdk/helpers/emulator/EmulatorHelperImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,418:1\n731#2,9:419\n37#3,2:428\n*S KotlinDebug\n*F\n+ 1 EmulatorHelperImpl.kt\nai/verisoul/sdk/helpers/emulator/EmulatorHelperImpl\n*L\n274#1:419,9\n274#1:428,2\n*E\n"})
/* loaded from: classes.dex */
public final class EmulatorHelperImpl implements EmulatorHelper {

    @NotNull
    private static final String IP = "10.0.2.15";
    private static final int MIN_PROPERTIES_THRESHOLD = 5;
    private boolean isCheckPackage;
    private boolean isTelephony;

    @NotNull
    private final Context mContext;

    @NotNull
    private final List<String> mListPackageName;

    @NotNull
    private final String tag;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] PHONE_NUMBERS = {"15555215554", "15555215556", "15555215558", "15555215560", "15555215562", "15555215564", "15555215566", "15555215568", "15555215570", "15555215572", "15555215574", "15555215576", "15555215578", "15555215580", "15555215582", "15555215584"};

    @NotNull
    private static final String[] DEVICE_IDS = {"000000000000000", "e21833235b6eef10", "012345678912345"};

    @NotNull
    private static final String[] IMSI_IDS = {"310260000000000"};

    @NotNull
    private static final String[] GENY_FILES = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    @NotNull
    private static final String[] QEMU_DRIVERS = {"goldfish"};

    @NotNull
    private static final String[] PIPES = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    @NotNull
    private static final String[] X86_FILES = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    @NotNull
    private static final String[] ANDY_FILES = {"fstab.andy", "ueventd.andy.rc"};

    @NotNull
    private static final String[] NOX_FILES = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc"};

    @NotNull
    private static final Property[] PROPERTIES = {new Property("init.svc.qemud", null), new Property("init.svc.qemu-props", null), new Property("qemu.hw.mainkeys", null), new Property("qemu.sf.fake_camera", null), new Property("qemu.sf.lcd_density", null), new Property("ro.bootloader", "unknown"), new Property("ro.bootmode", "unknown"), new Property("ro.hardware", "goldfish"), new Property("ro.kernel.android.qemud", null), new Property("ro.kernel.qemu.gles", null), new Property("ro.kernel.qemu", "1"), new Property("ro.product.device", "generic"), new Property("ro.product.model", "sdk"), new Property("ro.product.name", "sdk"), new Property("ro.serialno", null)};

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lai/verisoul/sdk/helpers/emulator/EmulatorHelperImpl$Companion;", "", "()V", "ANDY_FILES", "", "", "[Ljava/lang/String;", "DEVICE_IDS", "GENY_FILES", "IMSI_IDS", "IP", "MIN_PROPERTIES_THRESHOLD", "", "NOX_FILES", "PHONE_NUMBERS", "PIPES", "PROPERTIES", "Lai/verisoul/sdk/helpers/emulator/Property;", "[Lai/verisoul/sdk/helpers/emulator/Property;", "QEMU_DRIVERS", "X86_FILES", "deviceInfo", "getDeviceInfo", "()Ljava/lang/String;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getDeviceInfo() {
            return "Build.PRODUCT: " + Build.PRODUCT + "\nBuild.MANUFACTURER: " + Build.MANUFACTURER + "\nBuild.BRAND: " + Build.BRAND + "\nBuild.DEVICE: " + Build.DEVICE + "\nBuild.MODEL: " + Build.MODEL + "\nBuild.HARDWARE: " + Build.HARDWARE + "\nBuild.FINGERPRINT: " + Build.FINGERPRINT;
        }

        private Companion() {
        }
    }

    public EmulatorHelperImpl(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.isCheckPackage = true;
        ArrayList arrayList = new ArrayList();
        this.mListPackageName = arrayList;
        this.tag = "Verisoul-[EmulatorHelper]";
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
    }

    private final boolean checkAdvanced() {
        if (checkTelephony() || checkFiles(GENY_FILES, "Geny") || checkFiles(ANDY_FILES, "Andy") || checkFiles(NOX_FILES, "Nox") || checkQEmuDrivers() || checkFiles(PIPES, "Pipes") || checkIp()) {
            return true;
        }
        return checkQEmuProps() && checkFiles(X86_FILES, "X86");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    @SuppressLint({"HardwareIds"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean checkBasic() {
        boolean z10;
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        boolean z11 = false;
        if (!StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            if (!StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String lowerCase = MODEL.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "droid4x", false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                    if (!StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Emulator", false, 2, (Object) null)) {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        if (!StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
                            String MANUFACTURER = Build.MANUFACTURER;
                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            if (!StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
                                String HARDWARE = Build.HARDWARE;
                                if (!Intrinsics.areEqual(HARDWARE, "goldfish") && !Intrinsics.areEqual(HARDWARE, "vbox86")) {
                                    String PRODUCT = Build.PRODUCT;
                                    if (!Intrinsics.areEqual(PRODUCT, "sdk") && !Intrinsics.areEqual(PRODUCT, "google_sdk") && !Intrinsics.areEqual(PRODUCT, "sdk_x86") && !Intrinsics.areEqual(PRODUCT, "vbox86p")) {
                                        String BOARD = Build.BOARD;
                                        Intrinsics.checkNotNullExpressionValue(BOARD, "BOARD");
                                        Locale locale2 = Locale.getDefault();
                                        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                                        String lowerCase2 = BOARD.toLowerCase(locale2);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                                        if (!StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "nox", false, 2, (Object) null)) {
                                            String BOOTLOADER = Build.BOOTLOADER;
                                            Intrinsics.checkNotNullExpressionValue(BOOTLOADER, "BOOTLOADER");
                                            Locale locale3 = Locale.getDefault();
                                            Intrinsics.checkNotNullExpressionValue(locale3, "getDefault(...)");
                                            String lowerCase3 = BOOTLOADER.toLowerCase(locale3);
                                            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                                            if (!StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "nox", false, 2, (Object) null)) {
                                                Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                                                Locale locale4 = Locale.getDefault();
                                                Intrinsics.checkNotNullExpressionValue(locale4, "getDefault(...)");
                                                String lowerCase4 = HARDWARE.toLowerCase(locale4);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                                                if (!StringsKt.contains$default((CharSequence) lowerCase4, (CharSequence) "nox", false, 2, (Object) null)) {
                                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                    Locale locale5 = Locale.getDefault();
                                                    Intrinsics.checkNotNullExpressionValue(locale5, "getDefault(...)");
                                                    String lowerCase5 = PRODUCT.toLowerCase(locale5);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                                                    if (!StringsKt.contains$default((CharSequence) lowerCase5, (CharSequence) "nox", false, 2, (Object) null)) {
                                                        String SERIAL = Build.SERIAL;
                                                        Intrinsics.checkNotNullExpressionValue(SERIAL, "SERIAL");
                                                        Locale locale6 = Locale.getDefault();
                                                        Intrinsics.checkNotNullExpressionValue(locale6, "getDefault(...)");
                                                        String lowerCase6 = SERIAL.toLowerCase(locale6);
                                                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
                                                        if (!StringsKt.contains$default((CharSequence) lowerCase6, (CharSequence) "nox", false, 2, (Object) null)) {
                                                            z10 = false;
                                                            if (!z10) {
                                                                return true;
                                                            }
                                                            String BRAND = Build.BRAND;
                                                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                                            if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
                                                                String DEVICE = Build.DEVICE;
                                                                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                                                if (StringsKt.startsWith$default(DEVICE, "generic", false, 2, (Object) null)) {
                                                                    z11 = true;
                                                                }
                                                            }
                                                            if (z10 || z11) {
                                                                return true;
                                                            }
                                                            return Intrinsics.areEqual("google_sdk", Build.PRODUCT);
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
        z10 = true;
        if (!z10) {
        }
    }

    private final boolean checkDeviceId() {
        String deviceId;
        Object systemService = this.mContext.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                deviceId = telephonyManager.getImei();
                Intrinsics.checkNotNull(deviceId);
            } else {
                deviceId = telephonyManager.getDeviceId();
                Intrinsics.checkNotNull(deviceId);
            }
            for (String str : DEVICE_IDS) {
                if (StringsKt.equals(str, deviceId, true)) {
                    return true;
                }
            }
        } catch (Exception unused) {
            Logger.INSTANCE.error(this.tag, "No permission to detect access of DeviceId");
        }
        return false;
    }

    private final boolean checkFiles(String[] targets, String type) {
        for (String str : targets) {
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    private final boolean checkImsi() {
        Object systemService = this.mContext.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        try {
            String subscriberId = ((TelephonyManager) systemService).getSubscriberId();
            Intrinsics.checkNotNullExpressionValue(subscriberId, "getSubscriberId(...)");
            for (String str : IMSI_IDS) {
                if (StringsKt.equals(str, subscriberId, true)) {
                    return true;
                }
            }
        } catch (Exception unused) {
            Logger.INSTANCE.error(this.tag, "No permission to detect access of SubscriberId");
        }
        return false;
    }

    private final boolean checkIp() {
        List emptyList;
        if (AbstractC5338c.checkSelfPermission(this.mContext, "android.permission.INTERNET") != 0) {
            return false;
        }
        String[] strArr = {"/system/bin/netcfg"};
        StringBuilder sb2 = new StringBuilder();
        try {
            ProcessBuilder processBuilder = new ProcessBuilder((String[]) Arrays.copyOf(strArr, 1));
            processBuilder.directory(new File("/system/bin/"));
            processBuilder.redirectErrorStream(true);
            Process start = processBuilder.start();
            Intrinsics.checkNotNullExpressionValue(start, "start(...)");
            InputStream inputStream = start.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            byte[] bArr = new byte[1024];
            while (inputStream.read(bArr) != -1) {
                sb2.append(new String(bArr, Charsets.UTF_8));
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        if (TextUtils.isEmpty(sb3)) {
            return false;
        }
        List<String> split = new Regex(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).split(sb3, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        for (String str : (String[]) emptyList.toArray(new String[0])) {
            if ((StringsKt.contains$default((CharSequence) str, (CharSequence) "wlan0", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "tunl0", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "eth0", false, 2, (Object) null)) && StringsKt.contains$default((CharSequence) str, (CharSequence) IP, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private final boolean checkOperatorNameAndroid() {
        Object systemService = this.mContext.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        Intrinsics.checkNotNullExpressionValue(networkOperatorName, "getNetworkOperatorName(...)");
        return StringsKt.equals(networkOperatorName, Constants.PLATFORM_ANDROID, true);
    }

    private final boolean checkPackageName() {
        if (this.isCheckPackage && !this.mListPackageName.isEmpty()) {
            PackageManager packageManager = this.mContext.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            Iterator<String> it = this.mListPackageName.iterator();
            while (it.hasNext()) {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(it.next());
                if (launchIntentForPackage != null) {
                    List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, PKIFailureInfo.notAuthorized);
                    Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
                    if (!queryIntentActivities.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean checkPhoneNumber() {
        Object systemService = this.mContext.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        try {
            String line1Number = ((TelephonyManager) systemService).getLine1Number();
            Intrinsics.checkNotNullExpressionValue(line1Number, "getLine1Number(...)");
            for (String str : PHONE_NUMBERS) {
                if (StringsKt.equals(str, line1Number, true)) {
                    return true;
                }
            }
        } catch (Exception unused) {
            Logger.INSTANCE.error(this.tag, "No permission to detect access of Line1Number");
        }
        return false;
    }

    private final boolean checkQEmuDrivers() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i10 = 0; i10 < 2; i10++) {
            File file = fileArr[i10];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                String str = new String(bArr, Charsets.UTF_8);
                for (String str2 : QEMU_DRIVERS) {
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean checkQEmuProps() {
        int i10 = 0;
        for (Property property : PROPERTIES) {
            String prop = getProp(this.mContext, property.getName());
            if (property.getSeekValue() == null && prop != null) {
                i10++;
            }
            String seekValue = property.getSeekValue();
            if (seekValue != null && prop != null && StringsKt.contains$default((CharSequence) prop, (CharSequence) seekValue, false, 2, (Object) null)) {
                i10++;
            }
        }
        return i10 >= 5;
    }

    private final boolean checkTelephony() {
        if (AbstractC5338c.checkSelfPermission(this.mContext, "android.permission.READ_PHONE_STATE") == 0 && this.isTelephony && isSupportTelePhony()) {
            return checkPhoneNumber() || checkDeviceId() || checkImsi() || checkOperatorNameAndroid();
        }
        return false;
    }

    private final boolean detect() {
        boolean checkBasic = checkBasic();
        if (!checkBasic) {
            checkBasic = checkAdvanced();
        }
        return !checkBasic ? checkPackageName() : checkBasic;
    }

    @SuppressLint({"PrivateApi"})
    private final String getProp(Context context, String property) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Class<?> loadClass = classLoader.loadClass("android.os.SystemProperties");
            Intrinsics.checkNotNullExpressionValue(loadClass, "loadClass(...)");
            Method method = loadClass.getMethod("get", String.class);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            Object invoke = method.invoke(loadClass, Arrays.copyOf(new Object[]{property}, 1));
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    private final boolean isSupportTelePhony() {
        PackageManager packageManager = this.mContext.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return packageManager.hasSystemFeature("android.hardware.telephony");
    }

    @Override // ai.verisoul.sdk.helpers.emulator.EmulatorHelper
    public boolean isEmulator() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean detect = detect();
        Logger.INSTANCE.metricLog(this.tag, "is_emulator_duration", System.currentTimeMillis() - currentTimeMillis);
        return detect;
    }
}
