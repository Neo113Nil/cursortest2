package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w40 implements k1c {
    public final /* synthetic */ rsk a;
    public final /* synthetic */ wma b;

    public w40(rsk rskVar, wma wmaVar) {
        this.a = rskVar;
        this.b = wmaVar;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        rsk rskVar = this.a;
        ViewGroup.LayoutParams layoutParams = rskVar.getLayoutParams();
        layoutParams.getClass();
        rskVar.measure(makeMeasureSpec, b50.m(0, i, layoutParams.height));
        return rskVar.getMeasuredWidth();
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        rsk rskVar = this.a;
        if (rskVar.getChildCount() == 0) {
            return m1c.G0(m1cVar, an3.j(j), an3.i(j), ry.t);
        }
        if (an3.j(j) != 0) {
            rskVar.getChildAt(0).setMinimumWidth(an3.j(j));
        }
        if (an3.i(j) != 0) {
            rskVar.getChildAt(0).setMinimumHeight(an3.i(j));
        }
        int j2 = an3.j(j);
        int h = an3.h(j);
        ViewGroup.LayoutParams layoutParams = rskVar.getLayoutParams();
        layoutParams.getClass();
        int m = b50.m(j2, h, layoutParams.width);
        int i = an3.i(j);
        int g = an3.g(j);
        ViewGroup.LayoutParams layoutParams2 = rskVar.getLayoutParams();
        layoutParams2.getClass();
        rskVar.measure(m, b50.m(i, g, layoutParams2.height));
        return m1c.G0(m1cVar, rskVar.getMeasuredWidth(), rskVar.getMeasuredHeight(), new u40(rskVar, this.b, 1));
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        rsk rskVar = this.a;
        ViewGroup.LayoutParams layoutParams = rskVar.getLayoutParams();
        layoutParams.getClass();
        rskVar.measure(makeMeasureSpec, b50.m(0, i, layoutParams.height));
        return rskVar.getMeasuredWidth();
    }

    @Override // defpackage.k1c
    public final int i(l9a l9aVar, List list, int i) {
        rsk rskVar = this.a;
        ViewGroup.LayoutParams layoutParams = rskVar.getLayoutParams();
        layoutParams.getClass();
        rskVar.measure(b50.m(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return rskVar.getMeasuredHeight();
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
        rsk rskVar = this.a;
        ViewGroup.LayoutParams layoutParams = rskVar.getLayoutParams();
        layoutParams.getClass();
        rskVar.measure(b50.m(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return rskVar.getMeasuredHeight();
    }
}
