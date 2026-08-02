package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.av2;
import defpackage.gmk;
import defpackage.hv2;
import defpackage.jv2;
import defpackage.k51;
import defpackage.l51;
import defpackage.m6k;
import defpackage.my4;
import defpackage.ov2;
import defpackage.pjf;
import defpackage.r9;
import defpackage.v0a;
import defpackage.w3a;
import defpackage.z1g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CircularProgressIndicator extends k51 {
    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        ov2 ov2Var = (ov2) this.a;
        av2 av2Var = new av2(ov2Var);
        Context context2 = getContext();
        v0a v0aVar = new v0a(context2, ov2Var, av2Var, ov2Var.q == 1 ? new jv2(context2, ov2Var) : new hv2(ov2Var));
        Resources resources = context2.getResources();
        gmk gmkVar = new gmk();
        ThreadLocal threadLocal = z1g.a;
        gmkVar.a = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        v0aVar.p = gmkVar;
        setIndeterminateDrawable(v0aVar);
        setProgressDrawable(new my4(getContext(), ov2Var, av2Var));
        this.i = true;
    }

    @Override // defpackage.k51
    public final l51 a(Context context, AttributeSet attributeSet) {
        ov2 ov2Var = new ov2(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        m6k.v(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = pjf.h;
        m6k.w(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        ov2Var.q = obtainStyledAttributes.getInt(0, 0);
        ov2Var.r = Math.max(w3a.y(context, obtainStyledAttributes, 4, dimensionPixelSize), ov2Var.a * 2);
        ov2Var.s = w3a.y(context, obtainStyledAttributes, 3, dimensionPixelSize2);
        ov2Var.t = obtainStyledAttributes.getInt(2, 0);
        ov2Var.u = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        ov2Var.d();
        return ov2Var;
    }

    public int getIndeterminateAnimationType() {
        return ((ov2) this.a).q;
    }

    public int getIndicatorDirection() {
        return ((ov2) this.a).t;
    }

    public int getIndicatorInset() {
        return ((ov2) this.a).s;
    }

    public int getIndicatorSize() {
        return ((ov2) this.a).r;
    }

    public void setIndeterminateAnimationType(int i) {
        l51 l51Var = this.a;
        if (((ov2) l51Var).q == i) {
            return;
        }
        if (d() && isIndeterminate()) {
            a70.r("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((ov2) l51Var).q = i;
        ((ov2) l51Var).d();
        r9 jv2Var = i == 1 ? new jv2(getContext(), (ov2) l51Var) : new hv2((ov2) l51Var);
        v0a indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.o = jv2Var;
        jv2Var.a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((ov2) this.a).t = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        l51 l51Var = this.a;
        if (((ov2) l51Var).s != i) {
            ((ov2) l51Var).s = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        l51 l51Var = this.a;
        if (((ov2) l51Var).r != max) {
            ((ov2) l51Var).r = max;
            ((ov2) l51Var).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.k51
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((ov2) this.a).d();
    }
}
