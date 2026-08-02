package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x7g extends fcp {
    public final y3g o;
    public int p = -1;
    public String q = "";
    public final p5c r = h6h.a;

    public x7g(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.o = new y3g(8, bundle, linkedHashMap);
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        String str = this.q;
        str.getClass();
        y3g y3gVar = this.o;
        b8d b8dVar = (b8d) ((LinkedHashMap) y3gVar.c).get(str);
        return (b8dVar != null ? b8dVar.a((Bundle) y3gVar.b, str) : null) != null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.uf3
    public final p5c a() {
        return this.r;
    }

    @Override // defpackage.fcp
    public final Object f0() {
        return p0();
    }

    @Override // defpackage.uf3
    public final int o(SerialDescriptor serialDescriptor) {
        String e;
        serialDescriptor.getClass();
        int i = this.p;
        do {
            i++;
            if (i >= serialDescriptor.d()) {
                return -1;
            }
            e = serialDescriptor.e(i);
            e.getClass();
        } while (!((Bundle) this.o.b).containsKey(e));
        this.p = i;
        this.q = e;
        return i;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final Decoder p(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (waa.E(serialDescriptor)) {
            this.q = serialDescriptor.e(0);
            this.p = 0;
        }
        return this;
    }

    public final Object p0() {
        String str = this.q;
        str.getClass();
        y3g y3gVar = this.o;
        b8d b8dVar = (b8d) ((LinkedHashMap) y3gVar.c).get(str);
        Object a = b8dVar != null ? b8dVar.a((Bundle) y3gVar.b, str) : null;
        if (a != null) {
            return a;
        }
        i3c.i(this.q, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object y(dy4 dy4Var) {
        dy4Var.getClass();
        return p0();
    }
}
