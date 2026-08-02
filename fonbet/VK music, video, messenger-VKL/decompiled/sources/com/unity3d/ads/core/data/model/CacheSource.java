package com.unity3d.ads.core.data.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheSource.kt */
/* loaded from: classes14.dex */
public final class CacheSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CacheSource[] $VALUES;
    public static final CacheSource LOCAL = new CacheSource("LOCAL", 0);
    public static final CacheSource REMOTE = new CacheSource("REMOTE", 1);

    private static final /* synthetic */ CacheSource[] $values() {
        return new CacheSource[]{LOCAL, REMOTE};
    }

    static {
        CacheSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private CacheSource(String str, int i) {
    }

    public static zrp<CacheSource> getEntries() {
        return $ENTRIES;
    }

    public static CacheSource valueOf(String str) {
        return (CacheSource) Enum.valueOf(CacheSource.class, str);
    }

    public static CacheSource[] values() {
        return (CacheSource[]) $VALUES.clone();
    }
}
