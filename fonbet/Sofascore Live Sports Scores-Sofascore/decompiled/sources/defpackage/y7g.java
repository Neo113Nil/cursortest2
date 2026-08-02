package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y7g extends k53 {
    public final KSerializer o;
    public final LinkedHashMap p;
    public final p5c q = h6h.a;
    public final LinkedHashMap r = new LinkedHashMap();
    public int s = -1;

    public y7g(KSerializer kSerializer, LinkedHashMap linkedHashMap) {
        this.o = kSerializer;
        this.p = linkedHashMap;
    }

    public final void C0(Object obj) {
        String e = this.o.getDescriptor().e(this.s);
        b8d b8dVar = (b8d) this.p.get(e);
        if (b8dVar != null) {
            this.r.put(e, b8dVar instanceof i13 ? ((i13) b8dVar).h(obj) : a.c(b8dVar.f(obj)));
        } else {
            hc5.f(lnb.o("Cannot find NavType for argument ", e, ". Please provide NavType through typeMap."));
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final p5c a() {
        return this.q;
    }

    @Override // defpackage.k53
    public final void c0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        this.s = i;
    }

    @Override // defpackage.k53
    public final void d0(Object obj) {
        obj.getClass();
        C0(obj);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final Encoder k(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (waa.E(serialDescriptor)) {
            this.s = 0;
        }
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        C0(obj);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void p() {
        C0(null);
    }
}
