package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v0p extends zuo implements x0p {
    @Override // defpackage.x0p
    public final void g(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 6);
    }

    @Override // defpackage.x0p
    public final void g3() {
        Parcel J = J();
        J.writeIntArray(null);
        Z1(J, 4);
    }

    @Override // defpackage.x0p
    public final void h(int i) {
        Parcel J = J();
        J.writeInt(i);
        Z1(J, 7);
    }

    @Override // defpackage.x0p
    public final void v() {
        Z1(J(), 3);
    }

    @Override // defpackage.x0p
    public final void x(ObjectWrapper objectWrapper, String str) {
        Parcel J = J();
        avo.b(J, objectWrapper);
        J.writeString(str);
        J.writeString(null);
        Z1(J, 8);
    }

    @Override // defpackage.x0p
    public final void y(byte[] bArr) {
        Parcel J = J();
        J.writeByteArray(bArr);
        Z1(J, 5);
    }
}
