package defpackage;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ovo extends zuo implements svo {
    @Override // defpackage.svo
    public final String R(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, IObjectWrapper iObjectWrapper4) {
        Parcel J = J();
        avo.b(J, iObjectWrapper);
        avo.b(J, iObjectWrapper2);
        avo.b(J, iObjectWrapper3);
        avo.b(J, iObjectWrapper4);
        Parcel S1 = S1(J, 17);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // defpackage.svo
    public final String q0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel J = J();
        avo.b(J, iObjectWrapper);
        avo.b(J, iObjectWrapper2);
        avo.b(J, iObjectWrapper3);
        Parcel S1 = S1(J, 14);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // defpackage.svo
    public final String s(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        avo.b(J, iObjectWrapper);
        Parcel S1 = S1(J, 13);
        String readString = S1.readString();
        S1.recycle();
        return readString;
    }

    @Override // defpackage.svo
    public final void t(IObjectWrapper iObjectWrapper) {
        Parcel J = J();
        avo.b(J, iObjectWrapper);
        Z1(J, 9);
    }
}
