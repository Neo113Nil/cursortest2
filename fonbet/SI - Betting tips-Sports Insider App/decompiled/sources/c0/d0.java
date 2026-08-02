package c0;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3245a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3246b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f3247c;

    public d0(String str, int i5, Notification notification) {
        this.f3245a = str;
        this.f3246b = i5;
        this.f3247c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f3245a;
        int i5 = this.f3246b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2945b);
            obtain.writeString(str);
            obtain.writeInt(i5);
            obtain.writeString(null);
            Notification notification = this.f3247c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f2943a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f3245a);
        sb2.append(", id:");
        return r4.k.n(sb2, this.f3246b, ", tag:null]");
    }
}
