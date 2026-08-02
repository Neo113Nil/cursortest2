package com.vk.media.qrcode.core.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.hln0;
import xsna.lto0;
import xsna.mmr;
import xsna.zrp;

/* compiled from: SvgDrawable.kt */
/* loaded from: classes3.dex */
public final class SvgDrawable extends Drawable {
    public final hln0 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SvgDrawable.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode FIT_XY;
        public static final Mode TILED;

        static {
            Mode mode = new Mode("FIT_XY", 0);
            FIT_XY = mode;
            Mode mode2 = new Mode("TILED", 1);
            TILED = mode2;
            Mode[] modeArr = {mode, mode2};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: SvgDrawable.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.TILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SvgDrawable(String str, int i, int i2) {
        this(str, i, i2, Mode.FIT_XY);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = getBounds().left;
        int i2 = getBounds().top;
        hln0 hln0Var = this.a;
        if (hln0Var.a()) {
            hln0Var.d(canvas, i, i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.e.setColorFilter(colorFilter);
    }

    public SvgDrawable(String str, int i, int i2, Mode mode) {
        hln0 mmrVar;
        int i3 = a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i3 == 1) {
            mmrVar = new mmr(str, i, i2);
        } else if (i3 == 2) {
            mmrVar = new lto0(str, i, i2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.a = mmrVar;
    }
}
