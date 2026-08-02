package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f225c;

    public f(g gVar, AlertController$RecycleListView alertController$RecycleListView, j jVar) {
        this.f225c = gVar;
        this.f223a = alertController$RecycleListView;
        this.f224b = jVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
        g gVar = this.f225c;
        boolean[] zArr = gVar.E;
        AlertController$RecycleListView alertController$RecycleListView = this.f223a;
        if (zArr != null) {
            zArr[i5] = alertController$RecycleListView.isItemChecked(i5);
        }
        gVar.I.onClick(this.f224b.f261b, i5, alertController$RecycleListView.isItemChecked(i5));
    }
}
