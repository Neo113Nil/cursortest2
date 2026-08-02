package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.d51;
import defpackage.g7a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CardLayoutLandscape extends d51 {
    public View e;
    public View f;
    public View g;
    public View h;

    public CardLayoutLandscape(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int e = d51.e(this.e);
        this.e.layout(0, 0, e, d51.d(this.e));
        int d = d51.d(this.f);
        this.f.layout(e, 0, measuredWidth, d);
        this.g.layout(e, d, measuredWidth, d51.d(this.g) + d);
        this.h.layout(e, measuredHeight - d51.d(this.h), measuredWidth, measuredHeight);
    }

    @Override // defpackage.d51, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.e = c(R.id.image_view);
        this.f = c(R.id.message_title);
        this.g = c(R.id.body_scroll);
        View c = c(R.id.action_bar);
        this.h = c;
        List asList = Arrays.asList(this.f, this.g, c);
        int b = b(i);
        int a = a(i2);
        int round = Math.round(((int) (0.6d * b)) / 4.0f) * 4;
        g7a.A(this.e, b, a, Integer.MIN_VALUE, 1073741824);
        if (d51.e(this.e) > round) {
            g7a.A(this.e, round, a, 1073741824, Integer.MIN_VALUE);
        }
        int d = d51.d(this.e);
        int e = d51.e(this.e);
        int i3 = b - e;
        g7a.B(this.f, i3, d);
        g7a.B(this.h, i3, d);
        g7a.A(this.g, i3, (d - d51.d(this.f)) - d51.d(this.h), Integer.MIN_VALUE, 1073741824);
        Iterator it = asList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = Math.max(d51.e((View) it.next()), i4);
        }
        setMeasuredDimension(e + i4, d);
    }
}
