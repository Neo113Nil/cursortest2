package com.vk.id.internal.auth.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "", "context", "Landroid/content/Context;", "deviceIdStorage", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "<init>", "(Landroid/content/Context;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;)V", "mutex", "Ljava/util/concurrent/locks/ReentrantLock;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "setDeviceId", "", "deviceId", "", "setDeviceId$vkid_release", "getDeviceId", "getDeviceId$vkid_release", "DeviceIdStorage", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDDeviceIdProvider {

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceIdStorage deviceIdStorage;

    @NotNull
    private final InternalVKIDLogger logger;

    @NotNull
    private final ReentrantLock mutex;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "findDeviceIdByAndroidId", "(Landroid/content/Context;)Ljava/lang/String;", "DEFAULT_ID", "Ljava/lang/String;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"HardwareIds"})
        public final String findDeviceIdByAndroidId(Context context) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "", "", "getDeviceId", "()Ljava/lang/String;", "deviceId", "", "setDeviceId", "(Ljava/lang/String;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DeviceIdStorage {
        @NotNull
        String getDeviceId();

        void setDeviceId(@NotNull String deviceId);
    }

    public InternalVKIDDeviceIdProvider(@NotNull Context context, @NotNull DeviceIdStorage deviceIdStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceIdStorage, "deviceIdStorage");
        this.context = context;
        this.deviceIdStorage = deviceIdStorage;
        this.mutex = new ReentrantLock();
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("InternalVKIDDeviceIdProvider", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("InternalVKIDDeviceIdProvider");
    }

    @NotNull
    public final String getDeviceId$vkid_release() {
        ReentrantLock reentrantLock = this.mutex;
        reentrantLock.lock();
        try {
            String deviceId = this.deviceIdStorage.getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                this.logger.debug("nextDeviceId is null or empty: " + deviceId);
                String findDeviceIdByAndroidId = INSTANCE.findDeviceIdByAndroidId(this.context);
                ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(findDeviceIdByAndroidId)) {
                    findDeviceIdByAndroidId = "default";
                }
                arrayList.add(findDeviceIdByAndroidId);
                StringBuilder sb2 = new StringBuilder();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    sb2.append((String) arrayList.get(i11));
                    if (i11 < arrayList.size() - 1) {
                        sb2.append(ProductContainerDTO.RATIO_DELIMITER);
                    }
                }
                deviceId = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(deviceId, "toString(...)");
                this.logger.debug("new nextDeviceId: " + deviceId);
                this.deviceIdStorage.setDeviceId(deviceId);
            }
            reentrantLock.unlock();
            return deviceId;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void setDeviceId$vkid_release(@NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.deviceIdStorage.setDeviceId(deviceId);
    }
}
