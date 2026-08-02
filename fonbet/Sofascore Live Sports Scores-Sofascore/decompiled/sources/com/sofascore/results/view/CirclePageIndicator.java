package com.sofascore.results.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.c5e;
import defpackage.ujf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/view/CirclePageIndicator;", "Lc5e;", "", "getViewHeight", "()I", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CirclePageIndicator extends c5e {
    public final int j;
    public final Paint k;
    public final float l;
    public final float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.j = 38;
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.primary_default));
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(38);
        this.k = paint;
        this.l = ao2.u(4, context);
        this.m = ao2.u(3, context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.e, R.attr.cirlcePageIndicatorStyle, 0);
        obtainStyledAttributes.getClass();
        this.m = ao2.u(obtainStyledAttributes.getInt(0, 4), context);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.c5e
    public int getViewHeight() {
        return (int) ((2.0f * this.l) + getPaddingTop() + getPaddingBottom() + 1.0f);
    }
}
