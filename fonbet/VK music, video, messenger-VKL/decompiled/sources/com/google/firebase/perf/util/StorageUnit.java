package com.google.firebase.perf.util;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public abstract class StorageUnit {
    private static final /* synthetic */ StorageUnit[] $VALUES;
    public static final StorageUnit BYTES;
    public static final StorageUnit GIGABYTES;
    public static final StorageUnit KILOBYTES;
    public static final StorageUnit MEGABYTES;
    public static final StorageUnit TERABYTES;
    long numBytes;

    public enum a extends StorageUnit {
    }

    public enum b extends StorageUnit {
    }

    public enum c extends StorageUnit {
    }

    public enum d extends StorageUnit {
    }

    public enum e extends StorageUnit {
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        TERABYTES = aVar;
        b bVar = new b("GIGABYTES", 1, 1073741824L);
        GIGABYTES = bVar;
        c cVar = new c("MEGABYTES", 2, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        MEGABYTES = cVar;
        d dVar = new d("KILOBYTES", 3, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
        KILOBYTES = dVar;
        e eVar = new e("BYTES", 4, 1L);
        BYTES = eVar;
        $VALUES = new StorageUnit[]{aVar, bVar, cVar, dVar, eVar};
    }

    public StorageUnit() {
        throw null;
    }

    public StorageUnit(String str, int i, long j) {
        this.numBytes = j;
    }

    public static StorageUnit valueOf(String str) {
        return (StorageUnit) Enum.valueOf(StorageUnit.class, str);
    }

    public static StorageUnit[] values() {
        return (StorageUnit[]) $VALUES.clone();
    }

    public final long a(long j) {
        return (j * this.numBytes) / KILOBYTES.numBytes;
    }
}
