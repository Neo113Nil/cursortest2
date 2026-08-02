package com.vk.newsfeed.impl.recycler.decorations.components.on_media_like;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnMediaLikeUiComponent.kt */
/* loaded from: classes4.dex */
public final class OnMediaLikeUiComponent$Companion$Position {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnMediaLikeUiComponent$Companion$Position[] $VALUES;
    public static final OnMediaLikeUiComponent$Companion$Position FIRST;
    public static final OnMediaLikeUiComponent$Companion$Position SECOND;
    public static final OnMediaLikeUiComponent$Companion$Position SINGLE;

    static {
        OnMediaLikeUiComponent$Companion$Position onMediaLikeUiComponent$Companion$Position = new OnMediaLikeUiComponent$Companion$Position("SINGLE", 0);
        SINGLE = onMediaLikeUiComponent$Companion$Position;
        OnMediaLikeUiComponent$Companion$Position onMediaLikeUiComponent$Companion$Position2 = new OnMediaLikeUiComponent$Companion$Position("FIRST", 1);
        FIRST = onMediaLikeUiComponent$Companion$Position2;
        OnMediaLikeUiComponent$Companion$Position onMediaLikeUiComponent$Companion$Position3 = new OnMediaLikeUiComponent$Companion$Position("SECOND", 2);
        SECOND = onMediaLikeUiComponent$Companion$Position3;
        OnMediaLikeUiComponent$Companion$Position[] onMediaLikeUiComponent$Companion$PositionArr = {onMediaLikeUiComponent$Companion$Position, onMediaLikeUiComponent$Companion$Position2, onMediaLikeUiComponent$Companion$Position3};
        $VALUES = onMediaLikeUiComponent$Companion$PositionArr;
        $ENTRIES = new asp(onMediaLikeUiComponent$Companion$PositionArr);
    }

    public OnMediaLikeUiComponent$Companion$Position() {
        throw null;
    }

    public static OnMediaLikeUiComponent$Companion$Position valueOf(String str) {
        return (OnMediaLikeUiComponent$Companion$Position) Enum.valueOf(OnMediaLikeUiComponent$Companion$Position.class, str);
    }

    public static OnMediaLikeUiComponent$Companion$Position[] values() {
        return (OnMediaLikeUiComponent$Companion$Position[]) $VALUES.clone();
    }
}
