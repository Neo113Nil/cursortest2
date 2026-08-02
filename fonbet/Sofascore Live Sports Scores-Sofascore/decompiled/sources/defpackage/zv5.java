package defpackage;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.view.graph.networkanimation.PassingNetworkAnimationView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zv5 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ aw5 a;

    public zv5(aw5 aw5Var) {
        this.a = aw5Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Object next;
        recyclerView.getClass();
        super.onScrolled(recyclerView, i, i2);
        aw5 aw5Var = this.a;
        int[] iArr = aw5Var.r;
        LinkedHashSet<PassingNetworkAnimationView> linkedHashSet = aw5Var.o;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        recyclerView.getLocationInWindow(iArr);
        int i3 = iArr[1];
        int height = recyclerView.getHeight() + i3;
        ArrayList arrayList = new ArrayList(k13.r(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (true) {
            int i4 = Integer.MAX_VALUE;
            if (!it.hasNext()) {
                break;
            }
            PassingNetworkAnimationView passingNetworkAnimationView = (PassingNetworkAnimationView) it.next();
            passingNetworkAnimationView.getLocationInWindow(iArr);
            int i5 = iArr[1];
            int height2 = passingNetworkAnimationView.getHeight() + i5;
            if (i5 >= i3 && height2 <= height) {
                int i6 = (i3 + height) / 2;
                i4 = Math.min(Math.abs(i5 - i6), Math.abs(height2 - i6));
            }
            arrayList.add(new Pair(passingNetworkAnimationView, Integer.valueOf(i4)));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((Pair) next).b).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) ((Pair) next2).b).intValue();
                    if (intValue > intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair = (Pair) next;
        if (pair != null && ((Number) pair.b).intValue() == Integer.MAX_VALUE) {
            next = null;
        }
        Pair pair2 = (Pair) next;
        PassingNetworkAnimationView passingNetworkAnimationView2 = pair2 != null ? (PassingNetworkAnimationView) pair2.a : null;
        if (passingNetworkAnimationView2 != null) {
            m41 m41Var = passingNetworkAnimationView2.i;
            if (!Intrinsics.c(m41Var != null ? Boolean.valueOf(((ValueAnimator) m41Var.d).isRunning()) : null, Boolean.TRUE)) {
                passingNetworkAnimationView2.f();
            }
        }
        for (PassingNetworkAnimationView passingNetworkAnimationView3 : linkedHashSet) {
            if (!Intrinsics.c(passingNetworkAnimationView3, passingNetworkAnimationView2)) {
                passingNetworkAnimationView3.a();
            }
        }
    }
}
