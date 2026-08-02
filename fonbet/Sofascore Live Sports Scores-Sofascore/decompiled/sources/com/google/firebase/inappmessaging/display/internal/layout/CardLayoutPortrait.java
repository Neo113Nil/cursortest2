package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.d51;
import defpackage.g7a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CardLayoutPortrait extends d51 {
    public View e;
    public View f;
    public View g;
    public View h;

    public CardLayoutPortrait(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = getVisibleChildren().size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            View view = getVisibleChildren().get(i6);
            view.layout(0, i5, view.getMeasuredWidth(), view.getMeasuredHeight() + i5);
            view.getMeasuredWidth();
            view.getMeasuredHeight();
            i5 += view.getMeasuredHeight();
        }
    }

    @Override // defpackage.d51, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.e = c(R.id.image_view);
        this.f = c(R.id.message_title);
        this.g = c(R.id.body_scroll);
        this.h = c(R.id.action_bar);
        int b = b(i);
        int a = a(i2);
        int round = Math.round(((int) (0.8d * a)) / 4.0f) * 4;
        g7a.A(this.e, b, a, 1073741824, Integer.MIN_VALUE);
        if (d51.d(this.e) > round) {
            g7a.A(this.e, b, round, Integer.MIN_VALUE, 1073741824);
        }
        int e = d51.e(this.e);
        g7a.A(this.f, e, a, 1073741824, Integer.MIN_VALUE);
        g7a.A(this.h, e, a, 1073741824, Integer.MIN_VALUE);
        g7a.A(this.g, e, ((a - d51.d(this.e)) - d51.d(this.f)) - d51.d(this.h), 1073741824, Integer.MIN_VALUE);
        int size = getVisibleChildren().size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += d51.d(getVisibleChildren().get(i4));
        }
        setMeasuredDimension(e, i3);
    }
}
