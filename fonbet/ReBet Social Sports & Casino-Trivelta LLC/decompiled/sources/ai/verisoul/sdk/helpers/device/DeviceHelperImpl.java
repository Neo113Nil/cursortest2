package ai.verisoul.sdk.helpers.device;

import ai.verisoul.sdk.logger.Logger;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0006\u0010\t\u001a\u00020\u0006J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u001a\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000eH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lai/verisoul/sdk/helpers/device/DeviceHelperImpl;", "Lai/verisoul/sdk/helpers/device/DeviceHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "logTag", "", "collect", "Lai/verisoul/sdk/helpers/device/DeviceData;", "getBootReason", "getInternalStorageInfo", "Lkotlin/Pair;", "", "getMemoryInfo", "Lkotlin/Triple;", "", "getSupportedAbis", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceHelperImpl implements DeviceHelper {

    @NotNull
    private final Context context;

    @NotNull
    private final String logTag;

    public DeviceHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logTag = "Verisoul-[" + DeviceHelperImpl.class.getSimpleName() + "]";
    }

    private final Pair<Long, Long> getInternalStorageInfo() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long blockSizeLong = statFs.getBlockSizeLong();
            return new Pair<>(Long.valueOf(statFs.getBlockCountLong() * blockSizeLong), Long.valueOf(blockSizeLong * statFs.getAvailableBlocksLong()));
        } catch (Exception unused) {
            return new Pair<>(0L, 0L);
        }
    }

    private final Triple<Integer, Integer, Long> getMemoryInfo() {
        int i10;
        int i11;
        Object systemService = this.context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            i10 = activityManager.getMemoryClass();
            i11 = activityManager.getLargeMemoryClass();
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new Triple<>(Integer.valueOf(i10), Integer.valueOf(i11), Long.valueOf(Runtime.getRuntime().maxMemory()));
    }

    private final List<String> getSupportedAbis() {
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        if (SUPPORTED_ABIS.length == 0) {
            return CollectionsKt.listOfNotNull((Object[]) new String[]{Build.CPU_ABI, Build.CPU_ABI2});
        }
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        return ArraysKt.toList(SUPPORTED_ABIS);
    }

    @Override // ai.verisoul.sdk.helpers.device.DeviceHelper
    @NotNull
    public DeviceData collect() {
        long currentTimeMillis = System.currentTimeMillis();
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        String str4 = Build.DEVICE;
        String str5 = Build.HARDWARE;
        String str6 = Build.PRODUCT;
        String str7 = Build.VERSION.RELEASE;
        int i10 = Build.VERSION.SDK_INT;
        List<String> supportedAbis = getSupportedAbis();
        String str8 = Build.FINGERPRINT;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        long uptimeMillis = SystemClock.uptimeMillis();
        String bootReason = getBootReason();
        String str9 = Build.DISPLAY;
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        int i13 = displayMetrics.densityDpi;
        int i14 = this.context.getResources().getConfiguration().orientation;
        Pair<Long, Long> internalStorageInfo = getInternalStorageInfo();
        long longValue = internalStorageInfo.component1().longValue();
        long longValue2 = internalStorageInfo.component2().longValue();
        Triple<Integer, Integer, Long> memoryInfo = getMemoryInfo();
        int intValue = memoryInfo.component1().intValue();
        int intValue2 = memoryInfo.component2().intValue();
        long longValue3 = memoryInfo.component3().longValue();
        String str10 = Build.BOARD;
        Logger.INSTANCE.metricLog(this.logTag, "device_info_duration", System.currentTimeMillis() - currentTimeMillis);
        Intrinsics.checkNotNull(str10);
        return new DeviceData(str, str2, str3, str4, str5, str6, str10, str7, Integer.valueOf(i10), supportedAbis, str8, language, country, Long.valueOf(uptimeMillis), bootReason, str9, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Long.valueOf(longValue), Long.valueOf(longValue2), Integer.valueOf(intValue), Integer.valueOf(intValue2), Long.valueOf(longValue3));
    }

    @NotNull
    public final String getBootReason() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            Object invoke = method.invoke(null, "sys.boot.reason");
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) invoke;
            if (str.length() != 0) {
                return str;
            }
            Object invoke2 = method.invoke(null, "ro.boot.bootreason");
            Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke2;
        } catch (Exception unused) {
            return "unknown";
        }
    }
}
