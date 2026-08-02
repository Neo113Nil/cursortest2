package com.vk.stories.design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stories.design.view.ReactionView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import xsna.abg0;
import xsna.asp;
import xsna.dhr0;
import xsna.ez3;
import xsna.iah0;
import xsna.k2f0;
import xsna.krv0;
import xsna.y0f0;
import xsna.zrp;

/* compiled from: ReactionView.kt */
/* loaded from: classes6.dex */
public final class ReactionView extends View {
    public static final int l = iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION);
    public static final int m = iah0.a(50);
    public Background b;
    public Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public RLottieDrawable g;
    public RLottieDrawable h;
    public int i;
    public Drawable j;
    public y0f0 k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReactionView.kt */
    public static final class Background {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Background[] $VALUES;
        public static final Background BLACK;
        public static final Background TRANSPARENT;
        public static final Background WHITE;

        static {
            Background background = new Background("TRANSPARENT", 0);
            TRANSPARENT = background;
            Background background2 = new Background("BLACK", 1);
            BLACK = background2;
            Background background3 = new Background("WHITE", 2);
            WHITE = background3;
            Background[] backgroundArr = {background, background2, background3};
            $VALUES = backgroundArr;
            $ENTRIES = new asp(backgroundArr);
        }

        public Background() {
            throw null;
        }

        public static Background valueOf(String str) {
            return (Background) Enum.valueOf(Background.class, str);
        }

        public static Background[] values() {
            return (Background[]) $VALUES.clone();
        }
    }

    /* compiled from: ReactionView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Background.values().length];
            try {
                iArr[Background.TRANSPARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Background.BLACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Background.WHITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final boolean getAnimationEnabled() {
        return !(Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void a(Canvas canvas, RLottieDrawable rLottieDrawable) {
        float f = -((rLottieDrawable.getBounds().width() - getWidth()) / 2.0f);
        float f2 = 5;
        float a2 = iah0.a(f2) + f;
        float a3 = f - iah0.a(f2);
        int save = canvas.save();
        canvas.translate(a2, a3);
        try {
            rLottieDrawable.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void b() {
        RLottieDrawable rLottieDrawable = this.h;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        RLottieDrawable rLottieDrawable2 = this.h;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.k();
        }
        this.h = null;
    }

    public final void c() {
        y0f0 y0f0Var = this.k;
        if (y0f0Var != null) {
            animate().cancel();
            setAlpha(1.0f);
            int i = this.i + 1;
            this.i = i;
            b();
            int i2 = l * 2;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(y0f0Var.d, "main_" + y0f0Var.a, i2, i2, null, false, false, null, 496);
            ez3 ez3Var = rLottieDrawable.k;
            ez3Var.q = 1;
            rLottieDrawable.setBounds(0, 0, i2, i2);
            ez3Var.t = new k2f0(i, this, rLottieDrawable, y0f0Var);
            RLottieDrawable rLottieDrawable2 = this.g;
            this.g = rLottieDrawable;
            rLottieDrawable.setCallback(this);
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.setCallback(null);
            }
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.k();
            }
            if (getAnimationEnabled()) {
                rLottieDrawable.j();
            } else {
                d(y0f0Var, rLottieDrawable, i);
            }
            invalidate();
        }
    }

    public final void d(y0f0 y0f0Var, final RLottieDrawable rLottieDrawable, final int i) {
        String str = "menu_" + y0f0Var.a;
        String str2 = y0f0Var.c;
        int i2 = m;
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(str2, str, i2, i2, null, false, false, null, 496);
        rLottieDrawable2.k.q = -1;
        rLottieDrawable2.setBounds(0, 0, i2, i2);
        this.g = rLottieDrawable2;
        rLottieDrawable2.setCallback(this);
        if (getAnimationEnabled()) {
            rLottieDrawable2.j();
        } else {
            rLottieDrawable2.i();
        }
        this.h = rLottieDrawable;
        rLottieDrawable.i();
        invalidate();
        postOnAnimationDelayed(new Runnable() { // from class: xsna.j2f0
            @Override // java.lang.Runnable
            public final void run() {
                ReactionView reactionView = this;
                if (i == reactionView.i && reactionView.h == rLottieDrawable) {
                    reactionView.b();
                    reactionView.invalidate();
                }
            }
        }, 80L);
    }

    public final Background getBubbleBackground() {
        return this.b;
    }

    public final y0f0 getReactionItem() {
        return this.k;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.g || drawable == this.h || drawable == this.j) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        animate().cancel();
        RLottieDrawable rLottieDrawable = this.g;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        RLottieDrawable rLottieDrawable2 = this.g;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.k();
        }
        this.g = null;
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float b = iah0.b(6.0f);
        float height = getHeight() - b;
        canvas.drawCircle(b, height, b, this.c);
        Paint paint = this.d;
        canvas.drawCircle(b, height, b, paint);
        canvas.drawPath(this.e, this.c);
        canvas.drawPath(this.f, paint);
        RLottieDrawable rLottieDrawable = this.g;
        RLottieDrawable rLottieDrawable2 = this.h;
        Drawable drawable = this.j;
        if (rLottieDrawable != null) {
            a(canvas, rLottieDrawable);
            if (rLottieDrawable2 != null) {
                a(canvas, rLottieDrawable2);
                return;
            }
            return;
        }
        if (drawable != null) {
            int width = drawable.getBounds().width();
            float b2 = iah0.b(35.0f);
            float f = width;
            float width2 = (getWidth() - b2) - (f / 2.0f);
            float a2 = (-(b2 - f)) - iah0.a(5);
            int save = canvas.save();
            canvas.translate(width2, a2);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension((int) iah0.b(80.0f), (int) iah0.b(88.0f));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float b = iah0.b(35.0f);
        float b2 = iah0.b(15.0f);
        float f2 = f - b;
        float a2 = ((f - (2 * b)) + b2) - iah0.a(3);
        float a3 = (i2 - iah0.a(15)) - b2;
        Path path = this.e;
        path.reset();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f2, b, b, direction);
        path.addCircle(a2, a3, b2, direction);
        Path path2 = this.f;
        path2.reset();
        Path path3 = new Path();
        path3.addCircle(f2, b, b, direction);
        Path path4 = new Path();
        path4.addCircle(a2, a3, b2, direction);
        path2.op(path3, path4, Path.Op.UNION);
    }

    public final void setBubbleBackground(Background background) {
        int m2;
        this.b = background;
        int i = a.$EnumSwitchMapping$0[background.ordinal()];
        if (i == 1) {
            dhr0.a.getClass();
            m2 = krv0.m(R.attr.vk_ui_image_placeholder_alpha, dhr0.s());
        } else if (i == 2) {
            m2 = -16777216;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m2 = dhr0.t.c(R.attr.vk_ui_background_contrast);
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(m2);
        this.c = paint;
        invalidate();
    }

    public final void setReaction(y0f0 y0f0Var) {
        this.k = y0f0Var;
        animate().cancel();
        setAlpha(1.0f);
        this.i++;
        b();
        String str = "menu_" + y0f0Var.a;
        String str2 = y0f0Var.c;
        int i = m;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(str2, str, i, i, null, false, false, null, 496);
        rLottieDrawable.k.q = -1;
        rLottieDrawable.setBounds(0, 0, i, i);
        RLottieDrawable rLottieDrawable2 = this.g;
        this.g = rLottieDrawable;
        rLottieDrawable.setCallback(this);
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.setCallback(null);
        }
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.k();
        }
        if (getAnimationEnabled()) {
            rLottieDrawable.j();
        } else {
            rLottieDrawable.i();
        }
        invalidate();
    }

    public final void setReactionItem(y0f0 y0f0Var) {
        this.k = y0f0Var;
    }

    public final void setStatic(y0f0 y0f0Var) {
        RLottieDrawable rLottieDrawable = this.g;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        RLottieDrawable rLottieDrawable2 = this.g;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.k();
        }
        this.g = null;
        b();
        Drawable mutate = y0f0Var.b.mutate();
        float f = 50;
        mutate.setBounds(0, 0, iah0.a(f), iah0.a(f));
        this.j = mutate;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g || drawable == this.h || drawable == this.j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Drawable mutate;
        Drawable drawable = null;
        this.b = Background.TRANSPARENT;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        dhr0.a.getClass();
        paint.setColor(krv0.m(R.attr.vk_ui_image_placeholder_alpha, dhr0.s()));
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(iah0.b(1.0f));
        abg0 abg0Var = dhr0.t;
        paint2.setColor(abg0Var.c(R.attr.vk_ui_image_border_alpha));
        paint2.setShadowLayer(iah0.b(1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, context.getColor(R.color.vk_black_alpha12));
        this.d = paint2;
        this.e = new Path();
        this.f = new Path();
        Drawable a2 = abg0Var.a(R.drawable.reaction_0);
        if (a2 != null && (mutate = a2.mutate()) != null) {
            float f = 50;
            mutate.setBounds(0, 0, iah0.a(f), iah0.a(f));
            drawable = mutate;
        }
        this.j = drawable;
    }
}
