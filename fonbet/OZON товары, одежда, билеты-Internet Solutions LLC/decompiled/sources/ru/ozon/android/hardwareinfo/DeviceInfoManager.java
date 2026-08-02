package ru.ozon.android.hardwareinfo;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0012\u0010\u0013\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/android/hardwareinfo/DeviceInfoManager;", "Lru/ozon/android/hardwareinfo/DeviceHardwareInfoProvider;", "screenResolution", "Lkotlin/Pair;", "", "getScreenResolution", "()Lkotlin/Pair;", "deviceType", "Lru/ozon/android/hardwareinfo/DeviceType;", "getDeviceType", "()Lru/ozon/android/hardwareinfo/DeviceType;", "deviceManufacturer", "", "getDeviceManufacturer", "()Ljava/lang/String;", "deviceModel", "getDeviceModel", "osVersion", "getOsVersion", "fullDeviceName", "getFullDeviceName", "screenDensity", "", "getScreenDensity", "()F", "Companion", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeviceInfoManager extends DeviceHardwareInfoProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087\u0002J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002¨\u0006\n"}, d2 = {"Lru/ozon/android/hardwareinfo/DeviceInfoManager$Companion;", "", "<init>", "()V", "invoke", "Lru/ozon/android/hardwareinfo/DeviceInfoManager;", "context", "Landroid/content/Context;", "deviceType", "Lru/ozon/android/hardwareinfo/DeviceType;", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @InterfaceC3999a
        @NotNull
        public final DeviceInfoManager invoke(@NotNull Context context, @NotNull DeviceType deviceType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            return new DeviceInfoManagerImpl(context, deviceType);
        }

        @NotNull
        public final DeviceInfoManager invoke(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new DeviceInfoManagerImpl(context);
        }
    }

    @NotNull
    String getDeviceManufacturer();

    @NotNull
    String getDeviceModel();

    @NotNull
    DeviceType getDeviceType();

    @NotNull
    String getFullDeviceName();

    @NotNull
    String getOsVersion();

    float getScreenDensity();

    @NotNull
    Pair<Integer, Integer> getScreenResolution();
}
