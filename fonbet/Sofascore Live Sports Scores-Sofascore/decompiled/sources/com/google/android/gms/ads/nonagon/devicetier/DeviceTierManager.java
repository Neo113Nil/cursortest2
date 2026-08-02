package com.google.android.gms.ads.nonagon.devicetier;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class DeviceTierManager {
    public final Context a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicReference c = new AtomicReference(AdvertisedMemoryTier.UNKNOWN);
    public final AtomicReference d = new AtomicReference(AvailableMemoryTier.UNKNOWN);
    public final AtomicReference e = new AtomicReference(AvailableProcessorTier.UNKNOWN);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum AdvertisedMemoryTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        VERY_LOW(3),
        LOW(4),
        MID(5),
        MID_PLUS(6),
        HIGH(7),
        VERY_HIGH(8),
        EXTREME_HIGH(9);

        public final int a;

        AdvertisedMemoryTier(int i) {
            this.a = i;
        }

        @Nullable
        public static AdvertisedMemoryTier fromValue(int i) {
            for (AdvertisedMemoryTier advertisedMemoryTier : values()) {
                if (advertisedMemoryTier.a == i) {
                    return advertisedMemoryTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum AvailableMemoryTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        VERY_LOW(3),
        LOW(4),
        MID(5),
        MID_PLUS(6),
        HIGH(7),
        VERY_HIGH(8),
        EXTREME_HIGH(9);

        public final int a;

        AvailableMemoryTier(int i) {
            this.a = i;
        }

        @Nullable
        public static AvailableMemoryTier fromValue(int i) {
            for (AvailableMemoryTier availableMemoryTier : values()) {
                if (availableMemoryTier.a == i) {
                    return availableMemoryTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum AvailableProcessorTier {
        UNKNOWN(0),
        INVALID_DATA_SOURCE(1),
        EXTREME_LOW(2),
        LOW(3),
        MID(4),
        MID_PLUS(5),
        HIGH(6),
        EXTREME_HIGH(7);

        public final int a;

        AvailableProcessorTier(int i) {
            this.a = i;
        }

        @Nullable
        public static AvailableProcessorTier fromValue(int i) {
            for (AvailableProcessorTier availableProcessorTier : values()) {
                if (availableProcessorTier.a == i) {
                    return availableProcessorTier;
                }
            }
            return null;
        }

        public int getValue() {
            return this.a;
        }
    }

    public DeviceTierManager(Context context) {
        this.a = context;
    }

    @NonNull
    public AdvertisedMemoryTier getAdvertisedMemoryTier() {
        return (AdvertisedMemoryTier) this.c.get();
    }

    @NonNull
    public AvailableMemoryTier getAvailableMemoryTier() {
        return (AvailableMemoryTier) this.d.get();
    }

    @NonNull
    public AvailableProcessorTier getAvailableProcessorTier() {
        return (AvailableProcessorTier) this.e.get();
    }

    public void initialize() {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            return;
        }
        AdvertisedMemoryTier fromValue = AdvertisedMemoryTier.fromValue(this.a.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0).getInt("advertised_memory_tier", AdvertisedMemoryTier.UNKNOWN.getValue()));
        if (fromValue != null) {
            this.c.set(fromValue);
        }
        atomicBoolean.set(true);
    }

    public synchronized void setAdvertisedMemoryTier(@NonNull AdvertisedMemoryTier advertisedMemoryTier) {
        if (advertisedMemoryTier == null) {
            return;
        }
        this.c.set(advertisedMemoryTier);
        this.a.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0).edit().putInt("advertised_memory_tier", advertisedMemoryTier.getValue()).apply();
    }

    public void setAvailableMemoryTier(@NonNull AvailableMemoryTier availableMemoryTier) {
        if (availableMemoryTier != null) {
            this.d.set(availableMemoryTier);
        }
    }

    public void setAvailableProcessorTier(@NonNull AvailableProcessorTier availableProcessorTier) {
        if (availableProcessorTier != null) {
            this.e.set(availableProcessorTier);
        }
    }
}
