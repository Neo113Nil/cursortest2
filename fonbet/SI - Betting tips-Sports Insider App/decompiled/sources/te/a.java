package te;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ge.i f23861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ka.a f23862c;

    public /* synthetic */ a(ge.i iVar, ka.a aVar, int i5) {
        this.f23860a = i5;
        this.f23861b = iVar;
        this.f23862c = aVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f23860a) {
            case 0:
                q qVar = (q) this.f23861b.f9976b;
                if (qVar != null) {
                    qVar.c(this.f23862c);
                    break;
                }
                break;
            default:
                q qVar2 = (q) this.f23861b.f9976b;
                if (qVar2 != null) {
                    qVar2.c(this.f23862c);
                    break;
                }
                break;
        }
        return true;
    }
}
