package com.sofascore.results.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.c6;
import defpackage.mqi;
import defpackage.ujf;
import defpackage.ypa;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sofascore/results/view/DividerLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/graphics/Paint;", "e", "Ljoa;", "getPaint", "()Landroid/graphics/Paint;", "paint", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DividerLinearLayout extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final mqi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividerLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.a = ao2.s(1, context);
        this.e = ypa.b(new c6(context, 17));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.f, 0, 0);
        obtainStyledAttributes.getClass();
        this.b = obtainStyledAttributes.getInt(2, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    private final Paint getPaint() {
        return (Paint) this.e.getValue();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int i = this.d;
        int i2 = this.a;
        int i3 = this.c;
        int i4 = this.b;
        if (i4 == 0) {
            canvas.drawRect(i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth() - i, i2, getPaint());
        } else {
            if (i4 != 1) {
                return;
            }
            canvas.drawRect(i3, getHeight() - i2, getWidth() - i, getHeight(), getPaint());
        }
    }
}
