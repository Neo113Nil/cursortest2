package com.vk.im.reactions.impl.assets;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.im.reactions.impl.assets.a;
import com.vk.media.qrcode.core.ui.SvgDrawable;
import com.vk.rlottie.RLottieDrawable;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.fal;
import xsna.g0f0;
import xsna.ozl;
import xsna.zrp;

/* compiled from: ReactionAssetDrawable.kt */
/* loaded from: classes2.dex */
public final class ReactionAssetDrawable extends Drawable {
    public fal a;
    public final g0f0 b;
    public RLottieDrawable c;
    public SvgDrawable d;
    public WeakReference<View> e;
    public Stage f = Stage.PREPARE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReactionAssetDrawable.kt */
    public static final class Stage {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Stage[] $VALUES;
        public static final Stage ANIMATION;
        public static final Stage BIG_ANIMATION;
        public static final Stage PREPARE;
        public static final Stage STATIC;

        static {
            Stage stage = new Stage("PREPARE", 0);
            PREPARE = stage;
            Stage stage2 = new Stage("BIG_ANIMATION", 1);
            BIG_ANIMATION = stage2;
            Stage stage3 = new Stage("ANIMATION", 2);
            ANIMATION = stage3;
            Stage stage4 = new Stage("STATIC", 3);
            STATIC = stage4;
            Stage[] stageArr = {stage, stage2, stage3, stage4};
            $VALUES = stageArr;
            $ENTRIES = new asp(stageArr);
        }

        public Stage() {
            throw null;
        }

        public static Stage valueOf(String str) {
            return (Stage) Enum.valueOf(Stage.class, str);
        }

        public static Stage[] values() {
            return (Stage[]) $VALUES.clone();
        }
    }

    /* compiled from: ReactionAssetDrawable.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Stage.values().length];
            try {
                iArr[Stage.BIG_ANIMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Stage.ANIMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Stage.STATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Stage.PREPARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReactionAssetDrawable(int i, int i2) {
        this.b = new g0f0(this, i, i2);
    }

    public final void a(a.C1134a c1134a) {
        this.b.d = c1134a.a;
        this.c = c1134a.b;
        SvgDrawable svgDrawable = c1134a.c;
        this.d = svgDrawable;
        if (svgDrawable != null) {
            svgDrawable.setBounds(getBounds());
        }
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(getBounds());
            rLottieDrawable.setCallback(new b());
            WeakReference<View> weakReference = this.e;
            rLottieDrawable.b(weakReference != null ? weakReference.get() : null);
        }
        invalidateSelf();
    }

    public final void b() {
        SvgDrawable svgDrawable = this.d;
        if (svgDrawable != null) {
            svgDrawable.setBounds(getBounds());
        }
        fal falVar = this.a;
        if (falVar != null) {
            falVar.a();
        }
        this.a = null;
        this.f = Stage.STATIC;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = a.$EnumSwitchMapping$0[this.f.ordinal()];
        Drawable drawable = null;
        if (i != 1) {
            if (i == 2) {
                drawable = this.c;
            } else if (i == 3) {
                drawable = this.d;
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        RLottieDrawable rLottieDrawable = this.c;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(i, i2, i3, i4);
        }
        SvgDrawable svgDrawable = this.d;
        if (svgDrawable != null) {
            svgDrawable.setBounds(i, i2, i3, i4);
        }
        super.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* compiled from: ReactionAssetDrawable.kt */
    public static final class b implements Drawable.Callback {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            ReactionAssetDrawable.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }
    }
}
