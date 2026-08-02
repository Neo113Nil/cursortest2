package com.vk.core.view.components.avatar.badge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import xsna.aar0;
import xsna.asp;
import xsna.zrp;

/* compiled from: VkAvatarBadge.kt */
/* loaded from: classes17.dex */
public interface VkAvatarBadge {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkAvatarBadge.kt */
    public static final class Alignment {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment BottomCenter;
        public static final Alignment BottomLeft;
        public static final Alignment BottomRight;
        public static final Alignment TopLeft;
        public static final Alignment TopRight;

        static {
            Alignment alignment = new Alignment("TopLeft", 0);
            TopLeft = alignment;
            Alignment alignment2 = new Alignment("TopRight", 1);
            TopRight = alignment2;
            Alignment alignment3 = new Alignment("BottomLeft", 2);
            BottomLeft = alignment3;
            Alignment alignment4 = new Alignment("BottomRight", 3);
            BottomRight = alignment4;
            Alignment alignment5 = new Alignment("BottomCenter", 4);
            BottomCenter = alignment5;
            Alignment[] alignmentArr = {alignment, alignment2, alignment3, alignment4, alignment5};
            $VALUES = alignmentArr;
            $ENTRIES = new asp(alignmentArr);
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    void a(Context context, aar0 aar0Var, Canvas canvas);

    Path b(Context context, aar0 aar0Var);

    String getTag();
}
