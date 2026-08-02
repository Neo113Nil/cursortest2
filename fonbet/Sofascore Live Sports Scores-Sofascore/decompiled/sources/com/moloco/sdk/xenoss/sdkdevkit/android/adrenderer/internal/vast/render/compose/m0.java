package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.sofascore.results.R;
import defpackage.ehg;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m0 extends FrameLayout {
    public final t a;
    public final t b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar, t tVar, t tVar2) {
        super(context);
        context.getClass();
        this.a = tVar;
        this.b = tVar2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.moloco_vast_icon_max_size);
        this.c = dimensionPixelSize;
        if (rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) {
            ehg e = s.e(context, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p) rVar);
            if (e != null) {
                addView(e, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            return;
        }
        if (!(rVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q)) {
            zzl.b();
            throw null;
        }
        ImageView c = com.facebook.appevents.j.c(context, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) rVar);
        c.setLayoutParams(new ViewGroup.LayoutParams(Math.min(c.getLayoutParams().width, dimensionPixelSize), Math.min(c.getLayoutParams().height, dimensionPixelSize)));
        c.setOnClickListener(new com.facebook.internal.n0(this, 2));
        addView(c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.invoke();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.c;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), View.MeasureSpec.getMode(i) == 1073741824 ? Integer.MIN_VALUE : View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), i3), View.MeasureSpec.getMode(i2) != 1073741824 ? View.MeasureSpec.getMode(i2) : Integer.MIN_VALUE));
    }
}
