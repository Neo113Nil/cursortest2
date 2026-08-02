package u7;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.e;
import com.google.android.gms.signin.internal.zak;
import e6.a0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b extends e {
    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean Q(int i5, Parcel parcel, Parcel parcel2) {
        switch (i5) {
            case 3:
                h7.a.b(parcel);
                break;
            case 4:
                h7.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                h7.a.b(parcel);
                break;
            case 7:
                h7.a.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) h7.a.a(parcel, zak.CREATOR);
                h7.a.b(parcel);
                a0 a0Var = (a0) this;
                a0Var.f8673g.post(new g8.a(17, a0Var, zakVar, false));
                break;
            case 9:
                h7.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
