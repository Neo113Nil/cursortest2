package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class aml {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final xll a(a3 a3Var, lf3 lf3Var, tc3 tc3Var) {
        xy xyVar;
        xll xllVar;
        Object[] objArr = 0;
        if (e09.a.compareAndSet(false, true)) {
            g62 g = ml4.g(1, 6, null);
            xw3.L(s9a.c((CoroutineContext) l40.m.getValue()), null, null, new zi7(g, objArr == true ? 1 : 0, 11), 3);
            oo ooVar = new oo(g, 18);
            synchronized (snh.c) {
                snh.i = CollectionsKt.x0(snh.i, ooVar);
                Unit unit = Unit.a;
            }
            snh.c();
        }
        if (a3Var.getChildCount() > 0) {
            View childAt = a3Var.getChildAt(0);
            xyVar = childAt instanceof xy ? (xy) childAt : null;
            if (xyVar != null) {
                xyVar.setComposeViewContext(lf3Var);
                if (xyVar == null) {
                    xyVar = new xy(a3Var.getContext(), lf3Var);
                    a3Var.addView(xyVar.getView(), a);
                }
                xyVar.setComposeViewContext(lf3Var);
                if (a3Var.getComposeViewContext$ui() != null) {
                    lf3Var.c();
                    xyVar.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                Object tag = xyVar.getTag(R.id.wrapped_composition_tag);
                xllVar = tag instanceof xll ? (xll) tag : null;
                if (xllVar == null) {
                    xllVar = new xll(xyVar, new sg3(lf3Var.b, new a9k(xyVar.getRoot())));
                    xyVar.setTag(R.id.wrapped_composition_tag, xllVar);
                }
                xllVar.a(tc3Var);
                xyVar.setFrameEndScheduler$ui(new zll(lf3Var.b));
                return xllVar;
            }
        } else {
            a3Var.removeAllViews();
        }
        xyVar = null;
        if (xyVar == null) {
        }
        xyVar.setComposeViewContext(lf3Var);
        if (a3Var.getComposeViewContext$ui() != null) {
        }
        Object tag2 = xyVar.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof xll) {
        }
        if (xllVar == null) {
        }
        xllVar.a(tc3Var);
        xyVar.setFrameEndScheduler$ui(new zll(lf3Var.b));
        return xllVar;
    }
}
