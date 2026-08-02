package ru.ozon.android.hardwareinfo;

import G.g;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import bd.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.utils.ContextExtKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010)\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u001a\u0010.\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R\u001b\u00103\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0011R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020;8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u0010>R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\f¨\u0006B"}, d2 = {"Lru/ozon/android/hardwareinfo/DeviceInfoManagerImpl;", "Lru/ozon/android/hardwareinfo/DeviceInfoManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/android/hardwareinfo/DeviceType;", "deviceType", "(Landroid/content/Context;Lru/ozon/android/hardwareinfo/DeviceType;)V", "Lkotlin/Pair;", "", "fetchScreenResolution", "()Lkotlin/Pair;", "updateScreenResolutionCache", "getScreenDimensions", "", "fetchScreenDensity", "()F", "", "fetchTotalRam", "()Ljava/lang/Long;", "Lru/ozon/android/hardwareinfo/CpuInfo;", "fetchCpuInfo", "()Lru/ozon/android/hardwareinfo/CpuInfo;", "", "Ljava/io/File;", "getCpuFiles", "()[Ljava/io/File;", "defineDeviceType", "()Lru/ozon/android/hardwareinfo/DeviceType;", "", "isDeviceTypeTV", "()Z", "Landroid/content/Context;", "", "deviceManufacturer", "Ljava/lang/String;", "getDeviceManufacturer", "()Ljava/lang/String;", "deviceModel", "getDeviceModel", "osVersion", "getOsVersion", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/android/hardwareinfo/DeviceType;", "getDeviceType", "fullDeviceName", "getFullDeviceName", "screenDensity$delegate", "LSc/j;", "getScreenDensity", "screenDensity", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "screenResolutionCache", "Lkotlin/Pair;", "curScreenOrientation", "I", "Lru/ozon/android/hardwareinfo/HardwareInfo;", "hardwareInfo$delegate", "getHardwareInfo", "()Lru/ozon/android/hardwareinfo/HardwareInfo;", "hardwareInfo", "getScreenResolution", "screenResolution", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeviceInfoManagerImpl implements DeviceInfoManager {

    @NotNull
    private final Context context;
    private int curScreenOrientation;

    @NotNull
    private final String deviceManufacturer;

    @NotNull
    private final String deviceModel;

    @NotNull
    private DeviceType deviceType;

    @NotNull
    private final String fullDeviceName;

    /* renamed from: hardwareInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hardwareInfo;

    @NotNull
    private final ReentrantReadWriteLock lock;

    @NotNull
    private final String osVersion;

    /* renamed from: screenDensity$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j screenDensity;
    private Pair<Integer, Integer> screenResolutionCache;

    public DeviceInfoManagerImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        this.deviceManufacturer = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        this.deviceModel = MODEL;
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        this.osVersion = RELEASE;
        this.deviceType = defineDeviceType();
        this.fullDeviceName = g.c(getDeviceManufacturer(), " ", getDeviceModel());
        this.screenDensity = k.b(new DeviceInfoManagerImpl$screenDensity$2(this));
        this.lock = new ReentrantReadWriteLock();
        this.curScreenOrientation = context.getResources().getConfiguration().orientation;
        this.hardwareInfo = k.b(new DeviceInfoManagerImpl$hardwareInfo$2(this));
    }

    private final DeviceType defineDeviceType() {
        return isDeviceTypeTV() ? DeviceType.f83814TV : this.context.getResources().getBoolean(R.bool.isTablet) ? DeviceType.TABLET : DeviceType.MOBILE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CpuInfo fetchCpuInfo() {
        long j11;
        String str;
        Long y02;
        File[] cpuFiles = getCpuFiles();
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        for (File file : cpuFiles) {
            try {
                str = (String) C7714v.M(h.k(new File(file, "/cpufreq/scaling_cur_freq")));
            } catch (Exception unused) {
            }
            if (str != null && (y02 = kotlin.text.h.y0(str)) != null) {
                j11 = y02.longValue();
                if (j11 == 0) {
                    j12 = Math.max(j12, j11);
                }
                arrayList.add(Long.valueOf(j11));
            }
            j11 = 0;
            if (j11 == 0) {
            }
            arrayList.add(Long.valueOf(j11));
        }
        int length = cpuFiles.length;
        Long valueOf = Long.valueOf(j12);
        if (j12 <= 0) {
            valueOf = null;
        }
        return new CpuInfo(length, valueOf, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float fetchScreenDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private final Pair<Integer, Integer> fetchScreenResolution() {
        Pair<Integer, Integer> updateScreenResolutionCache;
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        readLock.lock();
        try {
            if (this.curScreenOrientation == this.context.getResources().getConfiguration().orientation) {
                updateScreenResolutionCache = this.screenResolutionCache;
                if (updateScreenResolutionCache == null) {
                    updateScreenResolutionCache = updateScreenResolutionCache();
                }
            } else {
                updateScreenResolutionCache = updateScreenResolutionCache();
            }
            readLock.unlock();
            return updateScreenResolutionCache;
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long fetchTotalRam() {
        ActivityManager activityManager = (ActivityManager) androidx.core.content.a.getSystemService(this.context, ActivityManager.class);
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return Long.valueOf(memoryInfo.totalMem);
    }

    private final File[] getCpuFiles() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            return listFiles == null ? new File[0] : listFiles;
        } catch (Exception unused) {
            return new File[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCpuFiles$lambda$3(File file) {
        Regex regex = new Regex("cpu[0-9]");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return regex.f(name);
    }

    private final Pair<Integer, Integer> getScreenDimensions() {
        Context context = this.context;
        int pxToDp = ContextExtKt.pxToDp(context, context.getResources().getDisplayMetrics().widthPixels);
        Context context2 = this.context;
        return new Pair<>(Integer.valueOf(pxToDp), Integer.valueOf(ContextExtKt.pxToDp(context2, context2.getResources().getDisplayMetrics().heightPixels)));
    }

    private final boolean isDeviceTypeTV() {
        return this.context.getPackageManager().hasSystemFeature("android.software.leanback_only");
    }

    private final Pair<Integer, Integer> updateScreenResolutionCache() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.lock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Pair<Integer, Integer> screenDimensions = getScreenDimensions();
            this.curScreenOrientation = this.context.getResources().getConfiguration().orientation;
            this.screenResolutionCache = screenDimensions;
            return screenDimensions;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    @Override // ru.ozon.android.hardwareinfo.DeviceInfoManager
    @NotNull
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override // ru.ozon.android.hardwareinfo.DeviceInfoManager
    @NotNull
    public String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // ru.ozon.android.hardwareinfo.DeviceInfoManager
    @NotNull
    public DeviceType getDeviceType() {
        return this.deviceType;
    }

    @Override // ru.ozon.android.hardwareinfo.DeviceInfoManager
    @NotNull
    public String getFullDeviceName() {
        return this.fullDeviceName;
    }

    @Override // ru.ozon.android.hardwareinfo.DeviceHardwareInfoProvider
    @NotNull
    public HardwareInfo getHardwareInfo() {
        return (HardwareInfo) this.hardwareInfo.getValue();
    }

    @Override // ru.ozon.android.hardwareinfo.DeviceInfoManager
    @NotNull
    public String getOsVersion() {
        return this.osVersion;
    }

    @Override // ru.ozon.android.hardwareinfo.DeviceInfoManager
    public float getScreenDensity() {
        return ((Number) this.screenDensity.getValue()).floatValue();
    }

    @Override // ru.ozon.android.hardwareinfo.DeviceInfoManager
    @NotNull
    public Pair<Integer, Integer> getScreenResolution() {
        return fetchScreenResolution();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public DeviceInfoManagerImpl(@NotNull Context context, @NotNull DeviceType deviceType) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.deviceType = deviceType;
    }
}
