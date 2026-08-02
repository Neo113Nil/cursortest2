package s7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends com.google.android.gms.internal.measurement.x implements a0 {
    public y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // s7.a0
    public final void A(Bundle bundle, zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, bundle);
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 19);
    }

    @Override // s7.a0
    public final void C(zzr zzrVar, zzoo zzooVar, e0 e0Var) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        com.google.android.gms.internal.measurement.z.b(O, zzooVar);
        com.google.android.gms.internal.measurement.z.c(O, e0Var);
        P(O, 29);
    }

    @Override // s7.a0
    public final void D(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 4);
    }

    @Override // s7.a0
    public final void G(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 27);
    }

    @Override // s7.a0
    public final List I(String str, String str2, boolean z5, zzr zzrVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f5372a;
        O.writeInt(z5 ? 1 : 0);
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        Parcel N = N(O, 14);
        ArrayList createTypedArrayList = N.createTypedArrayList(zzpl.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    @Override // s7.a0
    public final String J(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        Parcel N = N(O, 11);
        String readString = N.readString();
        N.recycle();
        return readString;
    }

    @Override // s7.a0
    public final List K(String str, String str2, zzr zzrVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        Parcel N = N(O, 16);
        ArrayList createTypedArrayList = N.createTypedArrayList(zzah.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    @Override // s7.a0
    public final void L(zzr zzrVar, Bundle bundle, c0 c0Var) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        com.google.android.gms.internal.measurement.z.b(O, bundle);
        com.google.android.gms.internal.measurement.z.c(O, c0Var);
        P(O, 31);
    }

    @Override // s7.a0
    public final void M(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 20);
    }

    @Override // s7.a0
    public final List g(String str, String str2, String str3, boolean z5) {
        Parcel O = O();
        O.writeString(null);
        O.writeString(str2);
        O.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f5372a;
        O.writeInt(z5 ? 1 : 0);
        Parcel N = N(O, 15);
        ArrayList createTypedArrayList = N.createTypedArrayList(zzpl.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    @Override // s7.a0
    public final void h(zzah zzahVar, zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzahVar);
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 12);
    }

    @Override // s7.a0
    public final void j(long j, String str, String str2, String str3) {
        Parcel O = O();
        O.writeLong(j);
        O.writeString(str);
        O.writeString(str2);
        O.writeString(str3);
        P(O, 10);
    }

    @Override // s7.a0
    public final void k(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 18);
    }

    @Override // s7.a0
    public final List m(String str, String str2, String str3) {
        Parcel O = O();
        O.writeString(null);
        O.writeString(str2);
        O.writeString(str3);
        Parcel N = N(O, 17);
        ArrayList createTypedArrayList = N.createTypedArrayList(zzah.CREATOR);
        N.recycle();
        return createTypedArrayList;
    }

    @Override // s7.a0
    public final void n(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 25);
    }

    @Override // s7.a0
    public final void q(zzbg zzbgVar, zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzbgVar);
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 1);
    }

    @Override // s7.a0
    public final void r(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 6);
    }

    @Override // s7.a0
    public final void s(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 26);
    }

    @Override // s7.a0
    public final void u(zzr zzrVar, zzaf zzafVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        com.google.android.gms.internal.measurement.z.b(O, zzafVar);
        P(O, 30);
    }

    @Override // s7.a0
    public final byte[] v(zzbg zzbgVar, String str) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzbgVar);
        O.writeString(str);
        Parcel N = N(O, 9);
        byte[] createByteArray = N.createByteArray();
        N.recycle();
        return createByteArray;
    }

    @Override // s7.a0
    public final void x(zzpl zzplVar, zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzplVar);
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        P(O, 2);
    }

    @Override // s7.a0
    public final zzao y(zzr zzrVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.z.b(O, zzrVar);
        Parcel N = N(O, 21);
        zzao zzaoVar = (zzao) com.google.android.gms.internal.measurement.z.a(N, zzao.CREATOR);
        N.recycle();
        return zzaoVar;
    }
}
