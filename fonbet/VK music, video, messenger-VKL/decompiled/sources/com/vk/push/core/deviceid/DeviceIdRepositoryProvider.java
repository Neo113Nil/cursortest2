package com.vk.push.core.deviceid;

import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.deviceid.contentprovider.DeviceIdRemoteDataSource;
import com.vk.push.core.deviceid.generator.DeviceIdUUIDGenerator;
import com.vk.push.core.deviceid.storage.DeviceIdFileDataSource;
import com.vk.push.core.filedatastore.FileDataSource;

/* compiled from: DeviceIdRepositoryProvider.kt */
/* loaded from: classes.dex */
public final class DeviceIdRepositoryProvider {
    public static final DeviceIdRepositoryProvider INSTANCE = new DeviceIdRepositoryProvider();
    public static volatile DeviceIdRepositoryImpl a;

    public final DeviceIdRepository getInstance() {
        DeviceIdRepositoryImpl deviceIdRepositoryImpl = a;
        if (deviceIdRepositoryImpl != null) {
            return deviceIdRepositoryImpl;
        }
        throw new IllegalStateException("DeviceIdProvider was not initialized!");
    }

    public final DeviceIdRepository initIfRequired(Context context, Logger logger) {
        DeviceIdRepository deviceIdRepositoryProvider;
        DeviceIdRepositoryImpl deviceIdRepositoryImpl = a;
        if (deviceIdRepositoryImpl != null) {
            return deviceIdRepositoryImpl;
        }
        synchronized (this) {
            try {
                if (a == null) {
                    a = new DeviceIdRepositoryImpl(new DeviceIdFileDataSource(new FileDataSource(context, DeviceIdFileDataSource.DEVICE_ID_FILE_NAME, null, 4, null)), new DeviceIdRemoteDataSource(context), new DeviceIdUUIDGenerator(), null, logger, 8, null);
                }
                deviceIdRepositoryProvider = INSTANCE.getInstance();
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceIdRepositoryProvider;
    }
}
