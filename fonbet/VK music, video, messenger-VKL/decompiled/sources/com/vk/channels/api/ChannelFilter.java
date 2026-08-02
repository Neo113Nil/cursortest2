package com.vk.channels.api;

import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelFilter.kt */
/* loaded from: classes16.dex */
public final class ChannelFilter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelFilter[] $VALUES;
    public static final ChannelFilter ALL;
    public static final ChannelFilter ARCHIVED;
    public static final a Companion;
    public static final ChannelFilter SUGGESTED;
    private final int id;

    /* compiled from: ChannelFilter.kt */
    public static final class a {
        public static ChannelFilter a(int i) {
            ChannelFilter channelFilter;
            ChannelFilter[] values = ChannelFilter.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    channelFilter = null;
                    break;
                }
                channelFilter = values[i2];
                if (channelFilter.id == i) {
                    break;
                }
                i2++;
            }
            if (channelFilter != null) {
                return channelFilter;
            }
            throw new IllegalArgumentException(lhg.a(i, "Illegal id value: "));
        }
    }

    static {
        ChannelFilter channelFilter = new ChannelFilter("ALL", 0, 0);
        ALL = channelFilter;
        ChannelFilter channelFilter2 = new ChannelFilter("ARCHIVED", 1, 1);
        ARCHIVED = channelFilter2;
        ChannelFilter channelFilter3 = new ChannelFilter("SUGGESTED", 2, 2);
        SUGGESTED = channelFilter3;
        ChannelFilter[] channelFilterArr = {channelFilter, channelFilter2, channelFilter3};
        $VALUES = channelFilterArr;
        $ENTRIES = new asp(channelFilterArr);
        Companion = new a();
    }

    public ChannelFilter(String str, int i, int i2) {
        this.id = i2;
    }

    public static zrp<ChannelFilter> h() {
        return $ENTRIES;
    }

    public static ChannelFilter valueOf(String str) {
        return (ChannelFilter) Enum.valueOf(ChannelFilter.class, str);
    }

    public static ChannelFilter[] values() {
        return (ChannelFilter[]) $VALUES.clone();
    }

    public final int i() {
        return this.id;
    }
}
