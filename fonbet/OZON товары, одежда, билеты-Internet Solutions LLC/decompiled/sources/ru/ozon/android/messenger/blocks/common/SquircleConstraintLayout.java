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
import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/messenger/blocks/common/SquircleConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SquircleConstraintLayout extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    private float f84887c;

    /* renamed from: d, reason: collision with root package name */
    private float f84888d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Paint f84889e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private Path f84890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquircleConstraintLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = UiExtKt.toPxF(24);
        float pxF2 = UiExtKt.toPxF(24);
        this.f84887c = pxF;
        this.f84888d = pxF2;
        this.f84890f = new Path();
        Paint paint = new Paint();
        paint.setColor(h.b(context) ? ThemeExtKt.themeColor(context, R$attr.layerFloor0) : androidx.core.content.a.getColor(context, R$color.layer_floor_1));
        this.f84889e = paint;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.m_SquircleConstraintLayout, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                r.Companion companion = r.INSTANCE;
                this.f84887c = obtainStyledAttributes.getDimension(R$styleable.m_SquircleConstraintLayout_m_width_radius, pxF);
                this.f84888d = obtainStyledAttributes.getDimension(R$styleable.m_SquircleConstraintLayout_m_height_radius, pxF2);
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                s.a(th2);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f84890f, this.f84889e);
        canvas.clipPath(this.f84890f);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f84888d;
        float f11 = this.f84887c;
        float f12 = rectF.left;
        float f13 = rectF.right;
        float f14 = rectF.top;
        float f15 = rectF.bottom;
        Path path = new Path();
        float f16 = f15 - f7;
        path.moveTo(f12, f16);
        path.lineTo(f12, f7 + f14);
        path.quadTo(f12, f14, f12, f14);
        float f17 = f13 - f11;
        path.lineTo(f17, f14);
        path.quadTo(f13, f14, f13, f14);
        path.lineTo(f13, f16);
        path.quadTo(f13, f15, f17, f15);
        path.lineTo(f11 + f12, f15);
        path.quadTo(f12, f15, f12, f16);
        this.f84890f = path;
    }
}
