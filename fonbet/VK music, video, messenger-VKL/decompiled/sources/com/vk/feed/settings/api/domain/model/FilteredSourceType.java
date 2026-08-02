package com.vk.feed.settings.api.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FilteredSourceType.kt */
/* loaded from: classes18.dex */
public final class FilteredSourceType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FilteredSourceType[] $VALUES;
    public static final FilteredSourceType GROUP;
    public static final FilteredSourceType USER;

    static {
        FilteredSourceType filteredSourceType = new FilteredSourceType("USER", 0);
        USER = filteredSourceType;
        FilteredSourceType filteredSourceType2 = new FilteredSourceType("GROUP", 1);
        GROUP = filteredSourceType2;
        FilteredSourceType[] filteredSourceTypeArr = {filteredSourceType, filteredSourceType2};
        $VALUES = filteredSourceTypeArr;
        $ENTRIES = new asp(filteredSourceTypeArr);
    }

    public FilteredSourceType() {
        throw null;
    }

    public static FilteredSourceType valueOf(String str) {
        return (FilteredSourceType) Enum.valueOf(FilteredSourceType.class, str);
    }

    public static FilteredSourceType[] values() {
        return (FilteredSourceType[]) $VALUES.clone();
    }
}
