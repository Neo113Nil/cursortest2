package d0;

import e0.C6244a;
import f0.C6393d;
import p.InterfaceC8822a;

/* loaded from: classes8.dex */
public final /* synthetic */ class Z implements InterfaceC8822a {
    @Override // p.InterfaceC8822a
    public final Object apply(Object obj) {
        W w11 = (W) obj;
        try {
            return C6393d.k(new a0(C6244a.a(w11), ((C5993d) w11).a()), null);
        } catch (U e11) {
            C.S.l("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e11);
            return null;
        }
    }
}
