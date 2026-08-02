package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f217b;

    public e(g gVar, j jVar) {
        this.f217b = gVar;
        this.f216a = jVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
        g gVar = this.f217b;
        DialogInterface.OnClickListener onClickListener = gVar.f249w;
        j jVar = this.f216a;
        onClickListener.onClick(jVar.f261b, i5);
        if (gVar.G) {
            return;
        }
        jVar.f261b.dismiss();
    }
}
