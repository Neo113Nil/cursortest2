package com.vk.im.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.DialogTheme;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.b0u0;
import xsna.c4g0;
import xsna.cn70;
import xsna.dq;
import xsna.epx;
import xsna.fd90;
import xsna.g0l0;
import xsna.iut0;
import xsna.mq;
import xsna.msy;
import xsna.qoy;
import xsna.rq90;
import xsna.tqf0;
import xsna.uy2;
import xsna.y84;
import xsna.zrp;

/* compiled from: StencilLayout.kt */
/* loaded from: classes2.dex */
public final class StencilLayout extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public Path b;
    public final Object c;
    public final Object d;
    public final Object e;
    public boolean f;
    public Paint g;
    public Paint h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StencilLayout.kt */
    public static final class BorderWidth {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BorderWidth[] $VALUES;
        public static final BorderWidth Chat;
        public static final BorderWidth Replay;
        private final float widthDp;

        static {
            BorderWidth borderWidth = new BorderWidth("Replay", 0, cn70.a() * 1.5f);
            Replay = borderWidth;
            BorderWidth borderWidth2 = new BorderWidth("Chat", 1, cn70.a() * 2.0f);
            Chat = borderWidth2;
            BorderWidth[] borderWidthArr = {borderWidth, borderWidth2};
            $VALUES = borderWidthArr;
            $ENTRIES = new asp(borderWidthArr);
        }

        public BorderWidth(String str, int i, float f) {
            this.widthDp = f;
        }

        public static BorderWidth valueOf(String str) {
            return (BorderWidth) Enum.valueOf(BorderWidth.class, str);
        }

        public static BorderWidth[] values() {
            return (BorderWidth[]) $VALUES.clone();
        }

        public final float h() {
            return this.widthDp;
        }
    }

    /* compiled from: StencilLayout.kt */
    public static final class a {
        public final DialogTheme a;
        public final boolean b;
        public final int[] c;
        public final int d;
        public final BorderWidth e;

        public a(DialogTheme dialogTheme, boolean z, int[] iArr, int i, BorderWidth borderWidth) {
            this.a = dialogTheme;
            this.b = z;
            this.c = iArr;
            this.d = i;
            this.e = borderWidth;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && Arrays.equals(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            DialogTheme dialogTheme = this.a;
            return this.e.hashCode() + ((dq.d(qoy.b((dialogTheme != null ? dialogTheme.hashCode() : 0) * 31, 31, this.b), 31, this.c) + this.d) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BorderStyle(theme=");
            sb.append(this.a);
            sb.append(", isIncoming=");
            sb.append(this.b);
            sb.append(", gradientBubbleColors=");
            mq.f(this.c, sb, ", bubbleColor=");
            sb.append(this.d);
            sb.append(", borderWidth=");
            sb.append(this.e);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ Integer c;
        public final /* synthetic */ int d;
        public final /* synthetic */ float e;

        public b(Integer num, int i, float f) {
            this.c = num;
            this.d = i;
            this.e = f;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            Paint paint = new Paint();
            paint.setColor(this.d);
            paint.setStrokeWidth(this.e);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            StencilLayout stencilLayout = StencilLayout.this;
            stencilLayout.g = paint;
            Integer num = this.c;
            if (num != null) {
                num.intValue();
                Paint paint2 = new Paint();
                paint2.setColor(num.intValue());
                paint2.setStyle(Paint.Style.FILL);
                paint2.setAntiAlias(true);
                stencilLayout.h = paint2;
            }
            stencilLayout.f = true;
            stencilLayout.invalidate();
        }
    }

    public StencilLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fd90 fd90Var = new fd90(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, fd90Var);
        this.d = msy.a(lazyThreadSafetyMode, new tqf0(3));
        this.e = msy.a(lazyThreadSafetyMode, new y84(26));
        setWillNotDraw(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Matrix getScaleMatrix() {
        return (Matrix) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RectF getStencilBounds() {
        return (RectF) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RectF getStencilLayoutBounds() {
        return (RectF) this.d.getValue();
    }

    public final void a(int i2, float f, Integer num) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!isLaidOut()) {
            addOnLayoutChangeListener(new b(num, i2, f));
            return;
        }
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.g = paint;
        if (num != null) {
            Paint paint2 = new Paint();
            paint2.setColor(num.intValue());
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            this.h = paint2;
        }
        this.f = true;
        invalidate();
    }

    public final void b(a aVar) {
        BorderWidth borderWidth = aVar.e;
        int i2 = aVar.d;
        boolean z = aVar.b;
        DialogTheme dialogTheme = aVar.a;
        if (dialogTheme == null || !dialogTheme.b.a() || !c4g0.w(dialogTheme) || z) {
            uy2 uy2Var = DialogTheme.f;
            if (!epx.f(dialogTheme, DialogTheme.a.a()) || i2 != 0 || aVar.c.length == 0 || z) {
                a(i2, borderWidth.h(), null);
                return;
            }
        }
        int[] iArr = aVar.c;
        float h = borderWidth.h();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!isLaidOut()) {
            addOnLayoutChangeListener(new g0l0(this, h, iArr));
            return;
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(h);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight(), iArr, (float[]) null, Shader.TileMode.CLAMP));
        this.g = paint;
        this.f = true;
        invalidate();
    }

    public final void c(RectF rectF) {
        Path path = this.b;
        if (path != null) {
            getScaleMatrix().reset();
            getScaleMatrix().setRectToRect(getStencilBounds(), rectF, Matrix.ScaleToFit.CENTER);
            path.transform(getScaleMatrix());
            path.computeBounds(getStencilBounds(), true);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Path path;
        super.draw(canvas);
        if (!this.f || (path = this.b) == null) {
            return;
        }
        Paint paint = this.h;
        if (paint != null) {
            canvas.drawPath(path, paint);
        }
        Paint paint2 = this.g;
        if (paint2 != null) {
            canvas.drawPath(path, paint2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.b;
        if (path != null) {
            canvas.clipPath(path);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.b == null) {
            super.onMeasure(i2, i3);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode == 0 && mode2 == 0) {
            super.onMeasure(i2, i3);
            getStencilLayoutBounds().set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight());
            c(getStencilLayoutBounds());
        } else {
            int min = Math.min(size, size2);
            float f = min;
            getStencilLayoutBounds().set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f);
            c(getStencilLayoutBounds());
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        }
    }

    public final void setStencil(String str) {
        Path d = rq90.d(str);
        d.computeBounds(getStencilBounds(), true);
        this.b = d;
        requestLayout();
    }
}
