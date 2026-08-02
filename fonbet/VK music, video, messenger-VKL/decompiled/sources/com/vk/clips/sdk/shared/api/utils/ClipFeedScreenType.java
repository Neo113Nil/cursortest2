package com.vk.clips.sdk.shared.api.utils;

import android.content.Context;
import android.graphics.Point;
import xsna.asp;
import xsna.iah0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipFeedScreenType.kt */
/* loaded from: classes17.dex */
public final class ClipFeedScreenType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipFeedScreenType[] $VALUES;
    public static final a Companion;
    public static final ClipFeedScreenType NORMAL;
    public static final ClipFeedScreenType SQUARE;
    public static final ClipFeedScreenType TALL;

    /* compiled from: ClipFeedScreenType.kt */
    public static final class a {
        public static ClipFeedScreenType a(Context context, boolean z) {
            boolean z2 = z && !iah0.s(context);
            Point j = iah0.j(context);
            float f = j.y;
            float f2 = j.x;
            float f3 = z2 ? f2 / f : f / f2;
            return z ? ClipFeedScreenType.NORMAL : (1.7777778f > f3 || f3 > 2.0f) ? f3 > 2.0f ? ClipFeedScreenType.TALL : ClipFeedScreenType.SQUARE : ClipFeedScreenType.NORMAL;
        }
    }

    static {
        ClipFeedScreenType clipFeedScreenType = new ClipFeedScreenType("SQUARE", 0);
        SQUARE = clipFeedScreenType;
        ClipFeedScreenType clipFeedScreenType2 = new ClipFeedScreenType("NORMAL", 1);
        NORMAL = clipFeedScreenType2;
        ClipFeedScreenType clipFeedScreenType3 = new ClipFeedScreenType("TALL", 2);
        TALL = clipFeedScreenType3;
        ClipFeedScreenType[] clipFeedScreenTypeArr = {clipFeedScreenType, clipFeedScreenType2, clipFeedScreenType3};
        $VALUES = clipFeedScreenTypeArr;
        $ENTRIES = new asp(clipFeedScreenTypeArr);
        Companion = new a();
    }

    public ClipFeedScreenType() {
        throw null;
    }

    public static zrp<ClipFeedScreenType> h() {
        return $ENTRIES;
    }

    public static ClipFeedScreenType valueOf(String str) {
        return (ClipFeedScreenType) Enum.valueOf(ClipFeedScreenType.class, str);
    }

    public static ClipFeedScreenType[] values() {
        return (ClipFeedScreenType[]) $VALUES.clone();
    }

    public final boolean i() {
        return this == SQUARE;
    }
}
