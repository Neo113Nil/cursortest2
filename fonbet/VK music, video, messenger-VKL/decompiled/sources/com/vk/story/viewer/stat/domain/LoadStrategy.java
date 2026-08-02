package com.vk.story.viewer.stat.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoadStrategy.kt */
/* loaded from: classes6.dex */
public final class LoadStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LoadStrategy[] $VALUES;
    public static final LoadStrategy CACHE_FIRST;
    public static final LoadStrategy ONLY_API;
    public static final LoadStrategy ONLY_CACHE;

    static {
        LoadStrategy loadStrategy = new LoadStrategy("CACHE_FIRST", 0);
        CACHE_FIRST = loadStrategy;
        LoadStrategy loadStrategy2 = new LoadStrategy("ONLY_CACHE", 1);
        ONLY_CACHE = loadStrategy2;
        LoadStrategy loadStrategy3 = new LoadStrategy("ONLY_API", 2);
        ONLY_API = loadStrategy3;
        LoadStrategy[] loadStrategyArr = {loadStrategy, loadStrategy2, loadStrategy3};
        $VALUES = loadStrategyArr;
        $ENTRIES = new asp(loadStrategyArr);
    }

    public LoadStrategy() {
        throw null;
    }

    public static LoadStrategy valueOf(String str) {
        return (LoadStrategy) Enum.valueOf(LoadStrategy.class, str);
    }

    public static LoadStrategy[] values() {
        return (LoadStrategy[]) $VALUES.clone();
    }
}
