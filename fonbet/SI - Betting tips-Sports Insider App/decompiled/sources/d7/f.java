package d7;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c1;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.y3;
import k7.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8270a;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w7.g f8271f;

    public f(int i5, w7.g gVar) {
        this.f8270a = i5;
        switch (i5) {
            case 1:
                this.f8271f = gVar;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                break;
            default:
                this.f8271f = gVar;
                attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i5 = this.f8270a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (super.onTransact(r6, r7, r8, r9) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (super.onTransact(r6, r7, r8, r9) != false) goto L7;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f8270a) {
            case 0:
                if (i5 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i5 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i11 = a.f8264a;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                zzc createFromParcel2 = parcel.readInt() == 0 ? null : zzc.CREATOR.createFromParcel(parcel);
                y3.y(createFromParcel, createFromParcel2 != null ? new q5.a(createFromParcel2.f4243a, createFromParcel2.f4244b) : null, this.f8271f);
                return true;
            default:
                if (i5 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i5 != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i12 = j.f18882a;
                Status createFromParcel3 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(c1.i(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                y3.y(createFromParcel3, pendingIntent, this.f8271f);
                return true;
        }
    }
}
