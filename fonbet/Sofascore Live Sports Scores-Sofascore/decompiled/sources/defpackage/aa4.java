package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aa4 extends Binder implements am9 {
    public final Handler a;
    public final /* synthetic */ t94 b;

    public aa4(t94 t94Var) {
        this.b = t94Var;
        attachInterface(this, am9.q7);
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = am9.q7;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        int i3 = 4;
        boolean z = false;
        Handler handler = this.a;
        t94 t94Var = this.b;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new tc0(this, readInt, bundle, 2));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new w94(this, readString, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new vlo(this, bundle3, z, i3));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new w94(this, readString2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) parcel.readTypedObject(Uri.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new x94(this, readInt2, uri, z2, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle extraCallbackWithResult = t94Var == null ? null : t94Var.extraCallbackWithResult(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedObject(extraCallbackWithResult, 1);
                return true;
            case 8:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle6 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new y94(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new a8p(this, bundle7, z, i3));
                    return true;
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new z94(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new v94(this, bundle9, 1));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                if (t94Var != null) {
                    handler.post(new v94(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
