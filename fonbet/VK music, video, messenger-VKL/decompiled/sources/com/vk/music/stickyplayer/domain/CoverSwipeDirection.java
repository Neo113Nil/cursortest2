package com.vk.music.stickyplayer.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoverSwipeDirection.kt */
/* loaded from: classes3.dex */
public final class CoverSwipeDirection {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CoverSwipeDirection[] $VALUES;
    public static final CoverSwipeDirection Next;
    public static final CoverSwipeDirection Prev;

    static {
        CoverSwipeDirection coverSwipeDirection = new CoverSwipeDirection("Next", 0);
        Next = coverSwipeDirection;
        CoverSwipeDirection coverSwipeDirection2 = new CoverSwipeDirection("Prev", 1);
        Prev = coverSwipeDirection2;
        CoverSwipeDirection[] coverSwipeDirectionArr = {coverSwipeDirection, coverSwipeDirection2};
        $VALUES = coverSwipeDirectionArr;
        $ENTRIES = new asp(coverSwipeDirectionArr);
    }

    public CoverSwipeDirection() {
        throw null;
    }

    public static CoverSwipeDirection valueOf(String str) {
        return (CoverSwipeDirection) Enum.valueOf(CoverSwipeDirection.class, str);
    }

    public static CoverSwipeDirection[] values() {
        return (CoverSwipeDirection[]) $VALUES.clone();
    }
}
