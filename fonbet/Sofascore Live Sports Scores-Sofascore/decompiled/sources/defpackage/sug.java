package defpackage;

import android.view.View;
import android.widget.HorizontalScrollView;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sug implements View.OnScrollChangeListener {
    public final Function1 a;
    public final /* synthetic */ tug b;

    public sug(tug tugVar, Function1 function1) {
        this.b = tugVar;
        this.a = function1;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (i != i3) {
            tug tugVar = this.b;
            Iterator it = tugVar.b.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) pair.a;
                sug sugVar = (sug) pair.b;
                if (horizontalScrollView.getScrollX() != i) {
                    horizontalScrollView.scrollTo(i, 0);
                }
                Function1 function1 = sugVar.a;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i));
                }
            }
            Function1 function12 = tugVar.a;
            if (function12 != null) {
                function12.invoke(Integer.valueOf(i));
            }
        }
    }
}
