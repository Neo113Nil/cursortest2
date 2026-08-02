package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f986b;

    public /* synthetic */ v0(int i5, Object obj) {
        this.f985a = i5;
        this.f986b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
        switch (this.f985a) {
            case 0:
                x0 x0Var = (x0) this.f986b;
                x0Var.H.setSelection(i5);
                if (x0Var.H.getOnItemClickListener() != null) {
                    x0Var.H.performItemClick(view, i5, x0Var.E.getItemId(i5));
                }
                x0Var.dismiss();
                break;
            default:
                ((SearchView) this.f986b).f(i5);
                break;
        }
    }
}
