package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bgd {
    public final String a;
    public final int b;
    public final Notification c;

    public bgd(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(vm9 vm9Var) {
        String str = this.a;
        int i = this.b;
        Notification notification = this.c;
        tm9 tm9Var = (tm9) vm9Var;
        tm9Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vm9.v7);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            obtain.writeTypedObject(notification, 0);
            if (tm9Var.a.transact(1, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method notify is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return fc6.h(this.b, ", tag:null]", sb);
    }
}
