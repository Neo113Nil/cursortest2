package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2467c;

    public /* synthetic */ l(int i5, Object obj, Object obj2) {
        this.f2465a = i5;
        this.f2467c = obj;
        this.f2466b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2465a) {
            case 0:
                r rVar = (r) this.f2467c;
                ArrayList arrayList = (ArrayList) this.f2466b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    d2 d2Var = qVar.f2509a;
                    int i5 = qVar.f2510b;
                    int i10 = qVar.f2511c;
                    int i11 = qVar.f2512d;
                    int i12 = qVar.f2513e;
                    rVar.getClass();
                    View view = d2Var.itemView;
                    int i13 = i11 - i5;
                    int i14 = i12 - i10;
                    if (i13 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i14 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    rVar.f2532p.add(d2Var);
                    animate.setDuration(rVar.f2394e).setListener(new n(rVar, d2Var, i13, view, i14, animate)).start();
                }
                arrayList.clear();
                rVar.f2529m.remove(arrayList);
                break;
            case 1:
                r rVar2 = (r) this.f2467c;
                ArrayList arrayList2 = (ArrayList) this.f2466b;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    p pVar = (p) it2.next();
                    ArrayList arrayList3 = rVar2.f2533r;
                    long j = rVar2.f2395f;
                    d2 d2Var2 = pVar.f2502a;
                    View view2 = d2Var2 == null ? null : d2Var2.itemView;
                    d2 d2Var3 = pVar.f2503b;
                    View view3 = d2Var3 != null ? d2Var3.itemView : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        arrayList3.add(pVar.f2502a);
                        duration.translationX(pVar.f2506e - pVar.f2504c);
                        duration.translationY(pVar.f2507f - pVar.f2505d);
                        duration.alpha(0.0f).setListener(new o(rVar2, pVar, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList3.add(pVar.f2503b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new o(rVar2, pVar, animate2, view3, 1)).start();
                    }
                }
                arrayList2.clear();
                rVar2.f2530n.remove(arrayList2);
                break;
            case 2:
                r rVar3 = (r) this.f2467c;
                ArrayList arrayList4 = (ArrayList) this.f2466b;
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    d2 d2Var4 = (d2) it3.next();
                    rVar3.getClass();
                    View view4 = d2Var4.itemView;
                    ViewPropertyAnimator animate3 = view4.animate();
                    rVar3.f2531o.add(d2Var4);
                    animate3.alpha(1.0f).setDuration(rVar3.f2392c).setListener(new m(rVar3, d2Var4, view4, animate3)).start();
                }
                arrayList4.clear();
                rVar3.f2528l.remove(arrayList4);
                break;
            default:
                f fVar = (f) this.f2467c;
                h hVar = (h) fVar.f2383e;
                if (hVar.f2408g == fVar.f2380b) {
                    List list = (List) fVar.f2382d;
                    u uVar = (u) this.f2466b;
                    hVar.f2406e = list;
                    hVar.f2407f = DesugarCollections.unmodifiableList(list);
                    uVar.f(hVar.f2402a);
                    hVar.a();
                    break;
                }
                break;
        }
    }
}
