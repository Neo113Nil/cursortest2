package u6;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends x {
    public final t6.a U(t6.b bVar, String str, int i5) {
        Parcel O = O();
        j7.g.b(O, bVar);
        O.writeString(str);
        O.writeInt(i5);
        Parcel f6 = f(O, 2);
        t6.a V = t6.b.V(f6.readStrongBinder());
        f6.recycle();
        return V;
    }

    public final t6.a V(t6.b bVar, String str, int i5) {
        Parcel O = O();
        j7.g.b(O, bVar);
        O.writeString(str);
        O.writeInt(i5);
        Parcel f6 = f(O, 4);
        t6.a V = t6.b.V(f6.readStrongBinder());
        f6.recycle();
        return V;
    }

    public final t6.a W(t6.b bVar, String str, boolean z5, long j) {
        Parcel O = O();
        j7.g.b(O, bVar);
        O.writeString(str);
        O.writeInt(z5 ? 1 : 0);
        O.writeLong(j);
        Parcel f6 = f(O, 7);
        t6.a V = t6.b.V(f6.readStrongBinder());
        f6.recycle();
        return V;
    }

    public final t6.a X(t6.b bVar, String str, int i5, t6.b bVar2) {
        Parcel O = O();
        j7.g.b(O, bVar);
        O.writeString(str);
        O.writeInt(i5);
        j7.g.b(O, bVar2);
        Parcel f6 = f(O, 8);
        t6.a V = t6.b.V(f6.readStrongBinder());
        f6.recycle();
        return V;
    }
}
