package androidx.appcompat.widget;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f711b;

    public /* synthetic */ c(int i5, Object obj) {
        this.f710a = i5;
        this.f711b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f710a) {
            case 0:
                ((n.b) this.f711b).a();
                break;
            default:
                ((Toolbar) this.f711b).collapseActionView();
                break;
        }
    }
}
