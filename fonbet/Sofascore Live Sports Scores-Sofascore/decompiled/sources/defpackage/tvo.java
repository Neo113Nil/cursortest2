package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tvo extends zuo {
    public final IBinder l2(ObjectWrapper objectWrapper, ObjectWrapper objectWrapper2, byte[] bArr) {
        Parcel J = J();
        avo.b(J, objectWrapper);
        avo.b(J, objectWrapper2);
        J.writeByteArray(bArr);
        Parcel S1 = S1(J, 3);
        IBinder readStrongBinder = S1.readStrongBinder();
        S1.recycle();
        return readStrongBinder;
    }
}
