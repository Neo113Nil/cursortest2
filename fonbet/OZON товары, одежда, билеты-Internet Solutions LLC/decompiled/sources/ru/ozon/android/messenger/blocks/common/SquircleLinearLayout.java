package ru.ozon.android.messenger.blocks.common;

import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$styleable;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/messenger/blocks/common/SquircleLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SquircleLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private float f84891a;

    /* renamed from: b, reason: collision with root package name */
    private float f84892b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Paint f84893c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Path f84894d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f84895e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f84896f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f84897g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f84898h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f84899i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquircleLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = UiExtKt.toPxF(24);
        float pxF2 = UiExtKt.toPxF(24);
        this.f84891a = pxF;
        this.f84892b = pxF2;
        this.f84894d = new Path();
        Paint paint = new Paint();
        paint.setColor(h.b(context) ? ThemeExtKt.themeColor(context, R$attr.layerFloor0) : androidx.core.content.a.getColor(context, R$color.layer_floor_1));
        this.f84893c = paint;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.m_SquircleConstraintLayout, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                r.Companion companion = r.INSTANCE;
                this.f84891a = obtainStyledAttributes.getDimension(R$styleable.m_SquircleConstraintLayout_m_width_radius, pxF);
                this.f84892b = obtainStyledAttributes.getDimension(R$styleable.m_SquircleConstraintLayout_m_height_radius, pxF2);
                this.f84895e = obtainStyledAttributes.getBoolean(R$styleable.m_SquircleConstraintLayout_m_corner_top, false);
                this.f84896f = obtainStyledAttributes.getBoolean(R$styleable.m_SquircleConstraintLayout_m_corner_bottom, false);
                this.f84897g = obtainStyledAttributes.getBoolean(R$styleable.m_SquircleConstraintLayout_m_concave_top, false);
                this.f84898h = obtainStyledAttributes.getBoolean(R$styleable.m_SquircleConstraintLayout_m_concave_bottom, false);
                int color = androidx.core.content.a.getColor(getContext(), R$color.layer_floor_1);
                int i11 = R$styleable.m_SquircleConstraintLayout_m_background_fill_color;
                Integer num = this.f84899i;
                paint.setColor(obtainStyledAttributes.getColor(i11, num != null ? num.intValue() : color));
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                s.a(th2);
            }
            obtainStyledAttributes.recycle();
        }
    }

    private final Path a(RectF rectF, float f7, float f11) {
        float f12 = rectF.left;
        float f13 = rectF.right;
        float f14 = rectF.top;
        float f15 = rectF.bottom;
        Path path = new Path();
        float f16 = f15 - f7;
        path.moveTo(f12, f16);
        float f17 = f7 + f14;
        path.lineTo(f12, f17);
        path.quadTo(f12, f14, this.f84895e ? f12 + f11 : f12, f14);
        float f18 = f13 - f11;
        path.lineTo(f18, f14);
        if (!this.f84895e) {
            f17 = f14;
        }
        path.quadTo(f13, f14, f13, f17);
        path.lineTo(f13, f16);
        if (!this.f84896f) {
            f18 = f13;
        }
        path.quadTo(f13, f15, f18, f15);
        path.lineTo(f11 + f12, f15);
        if (!this.f84896f) {
            f16 = f15;
        }
        path.quadTo(f12, f15, f12, f16);
        return path;
    }

    public final void b(Integer num) {
        this.f84899i = num;
        this.f84893c.setColor(num.intValue());
        invalidate();
    }

    public final void c(boolean z11) {
        this.f84896f = z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f84894d, this.f84893c);
        canvas.clipPath(this.f84894d);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        Path a11 = a(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f84892b, this.f84891a);
        if (!this.f84897g && !this.f84898h) {
            this.f84894d = a11;
            return;
        }
        Path path = new Path(a11);
        boolean z11 = this.f84895e;
        boolean z12 = this.f84896f;
        if (this.f84898h) {
            RectF rectF = new RectF(0.0f, getHeight() - this.f84892b, getWidth(), getHeight());
            this.f84895e = true;
            this.f84896f = false;
            path.op(a(rectF, this.f84892b, this.f84891a), Path.Op.DIFFERENCE);
        }
        if (this.f84897g) {
            RectF rectF2 = new RectF(0.0f, 0.0f, getWidth(), this.f84892b);
            this.f84895e = false;
            this.f84896f = true;
            path.op(a(rectF2, this.f84892b, this.f84891a), Path.Op.DIFFERENCE);
        }
        this.f84895e = z11;
        this.f84896f = z12;
        this.f84894d = path;
    }
}
