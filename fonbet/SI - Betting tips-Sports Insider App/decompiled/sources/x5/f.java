package x5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import d6.l;
import g6.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends BasePendingResult {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f25406k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d6.j jVar, int i5) {
        super(jVar);
        this.f25406k = i5;
        v.i(jVar, "GoogleApiClient must not be null");
        v.i(s5.a.f22623a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ l r0(Status status) {
        int i5 = this.f25406k;
        return status;
    }

    public final void v0(d6.c cVar) {
        switch (this.f25406k) {
            case 0:
                d dVar = (d) cVar;
                j jVar = (j) dVar.m();
                e eVar = new e(this, 0);
                GoogleSignInOptions googleSignInOptions = dVar.B;
                Parcel a7 = jVar.a();
                int i5 = f7.l.f9493a;
                a7.writeStrongBinder(eVar);
                f7.l.b(a7, googleSignInOptions);
                jVar.e(a7, 102);
                break;
            default:
                d dVar2 = (d) cVar;
                j jVar2 = (j) dVar2.m();
                e eVar2 = new e(this, 1);
                GoogleSignInOptions googleSignInOptions2 = dVar2.B;
                Parcel a10 = jVar2.a();
                int i10 = f7.l.f9493a;
                a10.writeStrongBinder(eVar2);
                f7.l.b(a10, googleSignInOptions2);
                jVar2.e(a10, 103);
                break;
        }
    }

    public final void w0(Status status) {
        v.a("Failed result must not be success", !status.c());
        u0(r0(status));
    }
}
