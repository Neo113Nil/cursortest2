package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m2 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f820b;

    public /* synthetic */ m2(int i5, Object obj) {
        this.f819a = i5;
        this.f820b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i5, long j) {
        g2 g2Var;
        switch (this.f819a) {
            case 0:
                if (i5 != -1 && (g2Var = ((s2) this.f820b).f919c) != null) {
                    g2Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f820b).g(i5);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i5 = this.f819a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
