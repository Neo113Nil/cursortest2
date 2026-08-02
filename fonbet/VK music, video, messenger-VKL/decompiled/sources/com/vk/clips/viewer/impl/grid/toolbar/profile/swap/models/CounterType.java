package com.vk.clips.viewer.impl.grid.toolbar.profile.swap.models;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfileCounter.kt */
/* loaded from: classes17.dex */
public final class CounterType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CounterType[] $VALUES;
    public static final CounterType Followers;
    public static final CounterType Following;
    public static final CounterType Reacts;
    public static final CounterType Views;
    private final int manyRes;
    private final int pluralRes;

    static {
        CounterType counterType = new CounterType("Views", 0, R.plurals.clips_counter_views, R.string.clips_counter_views_default_plural);
        Views = counterType;
        CounterType counterType2 = new CounterType("Reacts", 1, R.plurals.clips_counter_likes, R.string.clips_counter_likes_default_plural);
        Reacts = counterType2;
        CounterType counterType3 = new CounterType("Following", 2, R.plurals.clips_counter_subscribes, R.string.clips_counter_subscribes_default_plural);
        Following = counterType3;
        CounterType counterType4 = new CounterType("Followers", 3, R.plurals.clips_counter_followers, R.string.clips_counter_followers_default_plural);
        Followers = counterType4;
        CounterType[] counterTypeArr = {counterType, counterType2, counterType3, counterType4};
        $VALUES = counterTypeArr;
        $ENTRIES = new asp(counterTypeArr);
    }

    public CounterType(String str, int i, int i2, int i3) {
        this.pluralRes = i2;
        this.manyRes = i3;
    }

    public static CounterType valueOf(String str) {
        return (CounterType) Enum.valueOf(CounterType.class, str);
    }

    public static CounterType[] values() {
        return (CounterType[]) $VALUES.clone();
    }

    public final int h() {
        return this.manyRes;
    }

    public final int i() {
        return this.pluralRes;
    }
}
