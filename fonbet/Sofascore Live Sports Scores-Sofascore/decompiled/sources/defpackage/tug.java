package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tug {
    public Function1 a;
    public final ArrayList b = new ArrayList();

    public final void a(HorizontalScrollView horizontalScrollView, Function1 function1) {
        horizontalScrollView.getClass();
        sug sugVar = new sug(this, function1);
        horizontalScrollView.setOnScrollChangeListener(sugVar);
        this.b.add(new Pair(horizontalScrollView, sugVar));
    }

    public final ScrollInterceptorHorizontalScrollView b() {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((HorizontalScrollView) ((Pair) obj).a).isAttachedToWindow()) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        HorizontalScrollView horizontalScrollView = pair != null ? (HorizontalScrollView) pair.a : null;
        if (horizontalScrollView instanceof ScrollInterceptorHorizontalScrollView) {
            return (ScrollInterceptorHorizontalScrollView) horizontalScrollView;
        }
        return null;
    }

    public final Integer c() {
        ScrollInterceptorHorizontalScrollView b = b();
        if (b != null) {
            return Integer.valueOf(b.getScrollX());
        }
        return null;
    }

    public final void d(HorizontalScrollView horizontalScrollView) {
        horizontalScrollView.getClass();
        this.b.removeIf(new rug(0, new qfg(horizontalScrollView, 8)));
    }

    public final void e(Context context) {
        Pair pair;
        HorizontalScrollView horizontalScrollView;
        View childAt;
        context.getClass();
        boolean c0 = hkg.c0(context);
        ArrayList arrayList = this.b;
        int width = (!c0 || (pair = (Pair) CollectionsKt.firstOrNull(arrayList)) == null || (horizontalScrollView = (HorizontalScrollView) pair.a) == null || (childAt = horizontalScrollView.getChildAt(0)) == null) ? 0 : childAt.getWidth();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) pair2.a;
            sug sugVar = (sug) pair2.b;
            if (horizontalScrollView2.getScrollX() != width) {
                horizontalScrollView2.scrollTo(width, 0);
            }
            Function1 function1 = sugVar.a;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(width));
            }
        }
    }

    public final void f(int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ((Pair) it.next()).a;
            horizontalScrollView.getClass();
            ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) horizontalScrollView;
            int c = llf.c(i, 0, scrollInterceptorHorizontalScrollView.getMaxScrollDistance());
            if (c != scrollInterceptorHorizontalScrollView.getScrollX()) {
                hug hugVar = scrollInterceptorHorizontalScrollView.f;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView2 = hugVar.b;
                super/*android.view.View*/.setOnScrollChangeListener(hugVar);
                hugVar.a = c;
                scrollInterceptorHorizontalScrollView2.smoothScrollTo(c, 0);
            }
        }
    }
}
