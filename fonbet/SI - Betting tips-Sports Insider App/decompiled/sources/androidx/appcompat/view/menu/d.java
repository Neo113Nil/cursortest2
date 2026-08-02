package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.x2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f449b;

    public /* synthetic */ d(v vVar, int i5) {
        this.f448a = i5;
        this.f449b = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f448a) {
            case 0:
                h hVar = (h) this.f449b;
                ArrayList arrayList = hVar.f483h;
                if (hVar.a() && arrayList.size() > 0 && !((g) arrayList.get(0)).f474a.f939y) {
                    View view = hVar.f489o;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((g) it.next()).f474a.show();
                        }
                        break;
                    } else {
                        hVar.dismiss();
                        break;
                    }
                }
                break;
            default:
                e0 e0Var = (e0) this.f449b;
                x2 x2Var = e0Var.f458h;
                if (e0Var.a() && !x2Var.f939y) {
                    View view2 = e0Var.f462m;
                    if (view2 != null && view2.isShown()) {
                        x2Var.show();
                        break;
                    } else {
                        e0Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
