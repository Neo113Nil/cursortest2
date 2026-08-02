package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mxf implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e92 b;

    public /* synthetic */ mxf(e92 e92Var, int i) {
        this.a = i;
        this.b = e92Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.a;
        e92 e92Var = this.b;
        switch (i2) {
            case 0:
                n layoutManager = ((RecyclerView) e92Var.b).getLayoutManager();
                layoutManager.getClass();
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
                break;
            default:
                n layoutManager2 = ((RecyclerView) e92Var.b).getLayoutManager();
                layoutManager2.getClass();
                ((LinearLayoutManager) layoutManager2).scrollToPositionWithOffset(i, 0);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
