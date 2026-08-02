package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a8p;
import defpackage.bsk;
import defpackage.iq4;
import defpackage.lq4;
import defpackage.mq4;
import defpackage.nq4;
import defpackage.pyn;
import defpackage.vlo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ j(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.a;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.mLayoutSuppressed) {
                        recyclerView.consumePendingUpdateOperations();
                        break;
                    } else {
                        recyclerView.mLayoutWasDefered = true;
                        break;
                    }
                }
                break;
            default:
                m mVar = recyclerView.mItemAnimator;
                if (mVar != null) {
                    nq4 nq4Var = (nq4) mVar;
                    long j = nq4Var.d;
                    ArrayList arrayList = nq4Var.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = nq4Var.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = nq4Var.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = nq4Var.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            u uVar = (u) it.next();
                            View view = uVar.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            nq4Var.q.add(uVar);
                            animate.setDuration(j).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new iq4(nq4Var, uVar, animate, view)).start();
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z2 = isEmpty;
                        arrayList.clear();
                        int i2 = 5;
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            nq4Var.m.add(arrayList5);
                            arrayList2.clear();
                            vlo vloVar = new vlo(nq4Var, arrayList5, false, i2);
                            if (z2) {
                                vloVar.run();
                            } else {
                                View view2 = ((mq4) arrayList5.get(0)).a.itemView;
                                WeakHashMap weakHashMap = bsk.a;
                                view2.postOnAnimationDelayed(vloVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            nq4Var.n.add(arrayList6);
                            arrayList3.clear();
                            a8p a8pVar = new a8p(nq4Var, arrayList6, false, i2);
                            if (z2) {
                                a8pVar.run();
                            } else {
                                View view3 = ((lq4) arrayList6.get(0)).a.itemView;
                                WeakHashMap weakHashMap2 = bsk.a;
                                view3.postOnAnimationDelayed(a8pVar, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            nq4Var.l.add(arrayList7);
                            arrayList4.clear();
                            pyn pynVar = new pyn(nq4Var, arrayList7, false, 4);
                            if (!z2 || !isEmpty2 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!isEmpty2 ? nq4Var.e : 0L, isEmpty3 ? 0L : nq4Var.f) + j;
                                z = false;
                                View view4 = ((u) arrayList7.get(0)).itemView;
                                WeakHashMap weakHashMap3 = bsk.a;
                                view4.postOnAnimationDelayed(pynVar, max);
                                recyclerView.mPostedAnimatorRunner = z;
                                break;
                            } else {
                                pynVar.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.mPostedAnimatorRunner = z;
        }
    }
}
