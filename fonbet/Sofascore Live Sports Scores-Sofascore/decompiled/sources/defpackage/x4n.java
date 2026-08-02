package defpackage;

import java.util.BitSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x4n extends map {
    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        BitSet bitSet = new BitSet();
        e7nVar.zza();
        int Q0 = e7nVar.Q0();
        int i = 0;
        while (Q0 != 2) {
            int i2 = Q0 - 1;
            if (i2 == 5 || i2 == 6) {
                int u0 = e7nVar.u0();
                if (u0 != 0) {
                    if (u0 != 1) {
                        String P0 = e7nVar.P0();
                        zzl.h("Invalid bitset value ", fn0.a(u0, 48) + P0.length(), ", expected 0 or 1; at path ", P0, u0);
                        return null;
                    }
                    bitSet.set(i);
                    i++;
                    Q0 = e7nVar.Q0();
                } else {
                    continue;
                    i++;
                    Q0 = e7nVar.Q0();
                }
            } else {
                if (i2 != 7) {
                    String T = b0a.T(Q0);
                    String I0 = e7nVar.I0();
                    throw new o9p(fc6.o(new StringBuilder(T.length() + 37 + I0.length()), "Invalid bitset value type: ", T, "; at path ", I0), 16);
                }
                if (!e7nVar.g0()) {
                    i++;
                    Q0 = e7nVar.Q0();
                }
                bitSet.set(i);
                i++;
                Q0 = e7nVar.Q0();
            }
        }
        e7nVar.M();
        return bitSet;
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        f7nVar.m();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            f7nVar.a0(bitSet.get(i) ? 1L : 0L);
        }
        f7nVar.n();
    }
}
