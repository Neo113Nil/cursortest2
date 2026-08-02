package com.vk.core.utils;

import android.graphics.Rect;
import xsna.an10;
import xsna.asp;
import xsna.cn70;
import xsna.zrp;

/* compiled from: ImageViewMeasurer.kt */
/* loaded from: classes17.dex */
public final class ImageViewMeasurer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageViewMeasurer.kt */
    public static final class HeightMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HeightMode[] $VALUES;
        public static final HeightMode DOUBLE_WIDTH;
        public static final HeightMode MIN_RATIO;

        static {
            HeightMode heightMode = new HeightMode("DOUBLE_WIDTH", 0);
            DOUBLE_WIDTH = heightMode;
            HeightMode heightMode2 = new HeightMode("MIN_RATIO", 1);
            MIN_RATIO = heightMode2;
            HeightMode[] heightModeArr = {heightMode, heightMode2};
            $VALUES = heightModeArr;
            $ENTRIES = new asp(heightModeArr);
        }

        public HeightMode() {
            throw null;
        }

        public static HeightMode valueOf(String str) {
            return (HeightMode) Enum.valueOf(HeightMode.class, str);
        }

        public static HeightMode[] values() {
            return (HeightMode[]) $VALUES.clone();
        }
    }

    public static void a(int i, int i2, int i3, boolean z, HeightMode heightMode, Rect rect) {
        float f;
        int b;
        int i4;
        int min = Math.min(i, cn70.b(640));
        rect.setEmpty();
        if (i2 == 0 || i3 == 0) {
            return;
        }
        if (heightMode == HeightMode.DOUBLE_WIDTH) {
            f = z ? 1.5f : i2 / i3;
            int min2 = Math.min(min, cn70.b(i2));
            if (f > 0.5f) {
                i4 = an10.b(min2 / f);
            } else {
                i4 = min2 * 2;
                min2 = (int) (i4 * f);
            }
            rect.right = min2;
            rect.bottom = i4;
            return;
        }
        f = z ? 1.5f : i2 / i3;
        if (f >= 1.0f) {
            b = an10.b(min / f);
        } else {
            b = an10.b(min / (f >= 0.75f ? f : 0.75f));
            int b2 = an10.b(b * f);
            if (b2 <= min) {
                min = b2;
            }
        }
        rect.right = min;
        rect.bottom = b;
    }
}
