package a6;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.y3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.internal.play_billing.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w7.g f82g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i5, w7.g gVar) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback", 3);
        this.f81f = i5;
        switch (i5) {
            case 1:
                this.f82g = gVar;
                super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback", 3);
                break;
            case 2:
                this.f82g = gVar;
                super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback", 3);
                break;
            default:
                this.f82g = gVar;
                break;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean N(Parcel parcel, int i5) {
        switch (this.f81f) {
            case 0:
                if (i5 == 1) {
                    Status status = (Status) g7.b.a(parcel, Status.CREATOR);
                    boolean z5 = parcel.readInt() != 0;
                    com.google.android.gms.internal.play_billing.e.O(parcel);
                    Intrinsics.checkNotNullParameter(status, "status");
                    y3.y(status, Boolean.valueOf(z5), this.f82g);
                    break;
                }
                break;
            case 1:
                if (i5 == 1) {
                    Status status2 = (Status) g7.b.a(parcel, Status.CREATOR);
                    CreateRestoreCredentialResponse response = (CreateRestoreCredentialResponse) g7.b.a(parcel, CreateRestoreCredentialResponse.CREATOR);
                    com.google.android.gms.internal.play_billing.e.O(parcel);
                    Intrinsics.checkNotNullParameter(status2, "status");
                    Intrinsics.checkNotNullParameter(response, "response");
                    y3.y(status2, response, this.f82g);
                    break;
                }
                break;
            default:
                if (i5 == 1) {
                    Status status3 = (Status) g7.b.a(parcel, Status.CREATOR);
                    GetRestoreCredentialResponse response2 = (GetRestoreCredentialResponse) g7.b.a(parcel, GetRestoreCredentialResponse.CREATOR);
                    com.google.android.gms.internal.play_billing.e.O(parcel);
                    Intrinsics.checkNotNullParameter(status3, "status");
                    Intrinsics.checkNotNullParameter(response2, "response");
                    y3.y(status3, response2, this.f82g);
                    break;
                }
                break;
        }
        return true;
    }
}
