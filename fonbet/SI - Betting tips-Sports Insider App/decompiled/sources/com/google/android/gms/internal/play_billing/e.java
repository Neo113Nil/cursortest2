package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.sports.insider.data.room.general.table.AccountTable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5433a;

    public /* synthetic */ e(int i5) {
        this.f5433a = i5;
    }

    public static void O(Parcel parcel) {
        int i5 = g7.b.f9884a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(androidx.appcompat.widget.c1.i(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void P(Parcel parcel) {
        int i5 = l7.a.f19391a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(androidx.appcompat.widget.c1.i(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public abstract boolean N(Parcel parcel, int i5);

    public abstract boolean Q(int i5, Parcel parcel, Parcel parcel2);

    public abstract boolean R(int i5, Parcel parcel, Parcel parcel2);

    public boolean S(int i5, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean T(Parcel parcel, int i5);

    public abstract boolean U(int i5, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i5 = this.f5433a;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (super.onTransact(r8, r9, r10, r11) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        if (super.onTransact(r8, r9, r10, r11) != false) goto L95;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i10) {
        boolean z5;
        boolean z7 = false;
        int i11 = 1;
        switch (this.f5433a) {
            case 0:
                if (i5 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i5, parcel, parcel2, i10)) {
                    return true;
                }
                return U(i5, parcel, parcel2);
            case 1:
                if (i5 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                com.google.android.play.core.integrity.f fVar = (com.google.android.play.core.integrity.f) this;
                if (i5 != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i12 = d8.i.f8297a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(androidx.appcompat.widget.c1.i(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                d8.c cVar = fVar.f6037h.f6041d;
                w7.g gVar = fVar.f6036g;
                synchronized (cVar.f8285f) {
                    cVar.f8284e.remove(gVar);
                }
                cVar.a().post(new d8.b(i11, cVar));
                fVar.f6035f.a("onRequestIntegrityToken", new Object[0]);
                fVar.f6037h.f6040c.getClass();
                int i13 = bundle.getInt("error");
                com.google.android.play.core.integrity.a aVar = i13 == 0 ? null : new com.google.android.play.core.integrity.a(i13, null);
                if (aVar != null) {
                    fVar.f6036g.c(aVar);
                } else {
                    String string = bundle.getString(AccountTable.tokenColumn);
                    if (string == null) {
                        fVar.f6036g.c(new com.google.android.play.core.integrity.a(-100, null));
                    } else {
                        bundle.getLong("request.token.sid");
                        String str = fVar.f6037h.f6039b;
                        ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("IntegrityDialogWrapper");
                        fVar.f6036g.d(new com.google.android.play.core.integrity.k(string));
                    }
                }
                return true;
            case 2:
                if (i5 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i5, parcel, parcel2, i10)) {
                    return true;
                }
                return R(i5, parcel, parcel2);
            case 3:
                if (i5 > 16777215) {
                    z7 = super.onTransact(i5, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (z7) {
                    return true;
                }
                return N(parcel, i5);
            case 4:
                if (i5 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i5, parcel, parcel2, i10)) {
                    return true;
                }
                return Q(i5, parcel, parcel2);
            case 5:
                if (i5 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i5, parcel, parcel2, i10)) {
                    return true;
                }
                return S(i5, parcel, parcel2);
            case 6:
                if (i5 > 16777215) {
                    z5 = super.onTransact(i5, parcel, parcel2, i10);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z5 = false;
                }
                if (!z5) {
                    b7.e eVar = (b7.e) this;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            Status status = (Status) l7.a.a(parcel, Status.CREATOR);
                            P(parcel);
                            Intrinsics.checkNotNullParameter(status, "status");
                            throw new UnsupportedOperationException();
                        }
                        if (i5 == 3) {
                            Status status2 = (Status) l7.a.a(parcel, Status.CREATOR);
                            P(parcel);
                            Intrinsics.checkNotNullParameter(status2, "status");
                            throw new UnsupportedOperationException();
                        }
                        if (i5 == 4) {
                            Status status3 = (Status) l7.a.a(parcel, Status.CREATOR);
                            P(parcel);
                            Intrinsics.checkNotNullParameter(status3, "status");
                            throw new UnsupportedOperationException();
                        }
                        if (i5 != 5) {
                            return false;
                        }
                        Status status4 = (Status) l7.a.a(parcel, Status.CREATOR);
                        P(parcel);
                        Intrinsics.checkNotNullParameter(status4, "status");
                        throw new UnsupportedOperationException();
                    }
                    Status status5 = (Status) l7.a.a(parcel, Status.CREATOR);
                    PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) l7.a.a(parcel, PendingGetCredentialHandle.CREATOR);
                    P(parcel);
                    Intrinsics.checkNotNullParameter(status5, "status");
                    com.google.android.gms.internal.measurement.y3.y(status5, pendingGetCredentialHandle, eVar.f3087f);
                }
                return true;
            case 7:
                if (i5 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i5, parcel, parcel2, i10)) {
                    return true;
                }
                return T(parcel, i5);
            default:
                if (i5 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                com.google.android.play.core.appupdate.h hVar = (com.google.android.play.core.appupdate.h) this;
                if (i5 == 2) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i14 = y7.d.f25692a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 > 0) {
                        throw new BadParcelableException(androidx.appcompat.widget.c1.i(dataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    hVar.t(bundle2);
                } else {
                    if (i5 != 3) {
                        return false;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    int i15 = y7.d.f25692a;
                    Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 > 0) {
                        throw new BadParcelableException(androidx.appcompat.widget.c1.i(dataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    hVar.b(bundle3);
                }
                return true;
        }
    }

    public e(String str, int i5) {
        this.f5433a = i5;
        switch (i5) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 6:
            default:
                attachInterface(this, str);
                break;
            case 7:
                attachInterface(this, str);
                break;
        }
    }
}
