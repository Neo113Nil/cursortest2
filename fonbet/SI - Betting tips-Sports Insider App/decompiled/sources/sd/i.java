package sd;

import android.content.DialogInterface;
import gf.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23484b;

    public /* synthetic */ i(int i5, Object obj) {
        this.f23483a = i5;
        this.f23484b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i5 = this.f23483a;
        Object obj = this.f23484b;
        switch (i5) {
            case 0:
                l lVar = (l) obj;
                kf.f fVar = lVar.f23490a;
                if (fVar != null) {
                    gf.o oVar = q.f10031a;
                    fVar.resumeWith(null);
                }
                lVar.f23490a = null;
                break;
            case 1:
                m mVar = (m) obj;
                kf.f fVar2 = mVar.f23494b;
                if (fVar2 != null) {
                    gf.o oVar2 = q.f10031a;
                    fVar2.resumeWith(null);
                }
                mVar.f23494b = null;
                break;
            case 2:
                o oVar3 = (o) obj;
                kf.f fVar3 = oVar3.f23515b;
                if (fVar3 != null) {
                    gf.o oVar4 = q.f10031a;
                    fVar3.resumeWith(null);
                }
                oVar3.f23515b = null;
                break;
            default:
                ((ze.b) obj).f25925a.getClass();
                break;
        }
    }
}
