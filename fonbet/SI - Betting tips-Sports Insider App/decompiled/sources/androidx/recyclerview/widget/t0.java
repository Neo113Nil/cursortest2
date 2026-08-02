package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2558b;

    public /* synthetic */ t0(RecyclerView recyclerView, int i5) {
        this.f2557a = i5;
        this.f2558b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        int i5 = this.f2557a;
        RecyclerView recyclerView = this.f2558b;
        switch (i5) {
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
                f1 f1Var = recyclerView.mItemAnimator;
                if (f1Var != null) {
                    r rVar = (r) f1Var;
                    long j = rVar.f2393d;
                    ArrayList arrayList = rVar.f2525h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = rVar.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = rVar.f2527k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = rVar.f2526i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            d2 d2Var = (d2) it.next();
                            View view = d2Var.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            rVar.q.add(d2Var);
                            animate.setDuration(j).alpha(0.0f).setListener(new m(rVar, d2Var, animate, view)).start();
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z7 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            rVar.f2529m.add(arrayList5);
                            arrayList2.clear();
                            l lVar = new l(0, rVar, arrayList5);
                            if (z7) {
                                lVar.run();
                            } else {
                                View view2 = ((q) arrayList5.get(0)).f2509a.itemView;
                                WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
                                view2.postOnAnimationDelayed(lVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            rVar.f2530n.add(arrayList6);
                            arrayList3.clear();
                            l lVar2 = new l(1, rVar, arrayList6);
                            if (z7) {
                                lVar2.run();
                            } else {
                                View view3 = ((p) arrayList6.get(0)).f2502a.itemView;
                                WeakHashMap weakHashMap2 = androidx.core.view.z0.f1413a;
                                view3.postOnAnimationDelayed(lVar2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            rVar.f2528l.add(arrayList7);
                            arrayList4.clear();
                            l lVar3 = new l(2, rVar, arrayList7);
                            if (!z7 || !isEmpty2 || !isEmpty3) {
                                if (z7) {
                                    j = 0;
                                }
                                long max = Math.max(!isEmpty2 ? rVar.f2394e : 0L, isEmpty3 ? 0L : rVar.f2395f) + j;
                                z5 = false;
                                View view4 = ((d2) arrayList7.get(0)).itemView;
                                WeakHashMap weakHashMap3 = androidx.core.view.z0.f1413a;
                                view4.postOnAnimationDelayed(lVar3, max);
                                recyclerView.mPostedAnimatorRunner = z5;
                                break;
                            } else {
                                lVar3.run();
                            }
                        }
                    }
                }
                z5 = false;
                recyclerView.mPostedAnimatorRunner = z5;
        }
    }
}
