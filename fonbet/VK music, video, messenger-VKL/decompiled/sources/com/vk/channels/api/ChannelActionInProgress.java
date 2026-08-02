package com.vk.channels.api;

import java.util.Iterator;
import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChannelActionInProgress.kt */
/* loaded from: classes16.dex */
public final class ChannelActionInProgress {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ChannelActionInProgress[] $VALUES;
    public static final a Companion;
    public static final ChannelActionInProgress DELETING;
    public static final ChannelActionInProgress JOINING;
    public static final ChannelActionInProgress LEAVING;
    public static final ChannelActionInProgress NONE;
    private final int value;

    /* compiled from: ChannelActionInProgress.kt */
    public static final class a {
        public static ChannelActionInProgress a(int i) {
            Object obj;
            Iterator<E> it = ChannelActionInProgress.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ChannelActionInProgress) obj).i() == i) {
                    break;
                }
            }
            ChannelActionInProgress channelActionInProgress = (ChannelActionInProgress) obj;
            if (channelActionInProgress != null) {
                return channelActionInProgress;
            }
            throw new IllegalArgumentException(lhg.a(i, "ChannelActionInProgress: cannot parse value "));
        }
    }

    static {
        ChannelActionInProgress channelActionInProgress = new ChannelActionInProgress("NONE", 0, 0);
        NONE = channelActionInProgress;
        ChannelActionInProgress channelActionInProgress2 = new ChannelActionInProgress("JOINING", 1, 1);
        JOINING = channelActionInProgress2;
        ChannelActionInProgress channelActionInProgress3 = new ChannelActionInProgress("LEAVING", 2, 2);
        LEAVING = channelActionInProgress3;
        ChannelActionInProgress channelActionInProgress4 = new ChannelActionInProgress("DELETING", 3, 3);
        DELETING = channelActionInProgress4;
        ChannelActionInProgress[] channelActionInProgressArr = {channelActionInProgress, channelActionInProgress2, channelActionInProgress3, channelActionInProgress4};
        $VALUES = channelActionInProgressArr;
        $ENTRIES = new asp(channelActionInProgressArr);
        Companion = new a();
    }

    public ChannelActionInProgress(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<ChannelActionInProgress> h() {
        return $ENTRIES;
    }

    public static ChannelActionInProgress valueOf(String str) {
        return (ChannelActionInProgress) Enum.valueOf(ChannelActionInProgress.class, str);
    }

    public static ChannelActionInProgress[] values() {
        return (ChannelActionInProgress[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
