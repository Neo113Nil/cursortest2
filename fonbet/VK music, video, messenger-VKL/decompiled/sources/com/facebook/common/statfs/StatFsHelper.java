package com.facebook.common.statfs;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import xsna.s200;

/* loaded from: classes12.dex */
public final class StatFsHelper {
    public static StatFsHelper h;
    public static final long i = TimeUnit.MINUTES.toMillis(2);
    public volatile File b;
    public volatile File d;
    public long e;
    public volatile StatFs a = null;
    public volatile StatFs c = null;
    public volatile boolean g = false;
    public final ReentrantLock f = new ReentrantLock();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StorageType {
        private static final /* synthetic */ StorageType[] $VALUES;
        public static final StorageType EXTERNAL;
        public static final StorageType INTERNAL;

        static {
            StorageType storageType = new StorageType("INTERNAL", 0);
            INTERNAL = storageType;
            StorageType storageType2 = new StorageType("EXTERNAL", 1);
            EXTERNAL = storageType2;
            $VALUES = new StorageType[]{storageType, storageType2};
        }

        public StorageType() {
            throw null;
        }

        public static StorageType valueOf(String str) {
            return (StorageType) Enum.valueOf(StorageType.class, str);
        }

        public static StorageType[] values() {
            return (StorageType[]) $VALUES.clone();
        }
    }

    public static synchronized StatFsHelper b() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            try {
                if (h == null) {
                    h = new StatFsHelper();
                }
                statFsHelper = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return statFsHelper;
    }

    public static StatFs d(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                return new StatFs(file.getAbsolutePath());
            }
            statFs.restat(file.getAbsolutePath());
            return statFs;
        } catch (IllegalArgumentException unused) {
            return null;
        } catch (Throwable th) {
            s200.K(th);
            throw new RuntimeException(th);
        }
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.f.lock();
        try {
            if (!this.g) {
                this.b = Environment.getDataDirectory();
                this.d = Environment.getExternalStorageDirectory();
                this.a = d(this.a, this.b);
                this.c = d(this.c, this.d);
                this.e = SystemClock.uptimeMillis();
                this.g = true;
            }
        } finally {
            this.f.unlock();
        }
    }

    public final boolean c(StorageType storageType, long j) {
        a();
        a();
        ReentrantLock reentrantLock = this.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.e > i) {
                    this.a = d(this.a, this.b);
                    this.c = d(this.c, this.d);
                    this.e = SystemClock.uptimeMillis();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        StatFs statFs = storageType == StorageType.INTERNAL ? this.a : this.c;
        long availableBlocksLong = statFs != null ? statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong() : 0L;
        return availableBlocksLong <= 0 || availableBlocksLong < j;
    }
}
