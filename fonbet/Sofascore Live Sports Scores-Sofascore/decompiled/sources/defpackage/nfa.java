package defpackage;

import kotlin.text.g;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class nfa extends fcp {
    public final n4 o;
    public final p5c p;

    public nfa(n4 n4Var, yea yeaVar) {
        yeaVar.getClass();
        this.o = n4Var;
        this.p = yeaVar.b;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final byte E() {
        n4 n4Var = this.o;
        String n = n4Var.n();
        try {
            return g.b(n);
        } catch (IllegalArgumentException unused) {
            n4.s(n4Var, dmi.j('\'', "Failed to parse type 'UByte' for input '", n), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.uf3
    public final p5c a() {
        return this.p;
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final int k() {
        n4 n4Var = this.o;
        String n = n4Var.n();
        try {
            return g.c(n);
        } catch (IllegalArgumentException unused) {
            n4.s(n4Var, dmi.j('\'', "Failed to parse type 'UInt' for input '", n), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final long m() {
        n4 n4Var = this.o;
        String n = n4Var.n();
        try {
            return g.e(n);
        } catch (IllegalArgumentException unused) {
            n4.s(n4Var, dmi.j('\'', "Failed to parse type 'ULong' for input '", n), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.uf3
    public final int o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.fcp, kotlinx.serialization.encoding.Decoder
    public final short q() {
        n4 n4Var = this.o;
        String n = n4Var.n();
        try {
            return g.g(n);
        } catch (IllegalArgumentException unused) {
            n4.s(n4Var, dmi.j('\'', "Failed to parse type 'UShort' for input '", n), 0, null, 6);
            throw null;
        }
    }
}
