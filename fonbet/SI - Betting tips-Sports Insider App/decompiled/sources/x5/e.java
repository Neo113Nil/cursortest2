package x5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import f7.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.internal.play_billing.e implements i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f25405g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i5) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 2);
        this.f25404f = i5;
        this.f25405g = fVar;
    }

    @Override // x5.i
    public void B(Status status) {
        switch (this.f25404f) {
            case 1:
                this.f25405g.u0(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean R(int i5, Parcel parcel, Parcel parcel2) {
        switch (i5) {
            case 101:
                l.c(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) l.a(parcel, Status.CREATOR);
                l.c(parcel);
                w(status);
                break;
            case 103:
                Status status2 = (Status) l.a(parcel, Status.CREATOR);
                l.c(parcel);
                B(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // x5.i
    public void w(Status status) {
        switch (this.f25404f) {
            case 0:
                this.f25405g.u0(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
