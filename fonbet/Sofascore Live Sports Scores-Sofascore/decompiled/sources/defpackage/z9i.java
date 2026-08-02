package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class z9i implements iw8 {
    public static final z9i a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z9i z9iVar = new z9i();
        a = z9iVar;
        uye uyeVar = new uye("com.sofascore.results.league.adapter.StandingsLastUpdateRow", z9iVar, 3);
        uyeVar.j("updatedAtTimestamp", false);
        uyeVar.j("isLive", false);
        uyeVar.j("isLast", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{lkb.a, gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        boolean z3 = true;
        while (z3) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z3 = false;
            } else if (o == 0) {
                j = b.g(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                z = b.B(serialDescriptor, 1);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                z2 = b.B(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new bai(j, i, z, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bai baiVar = (bai) obj;
        encoder.getClass();
        baiVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.E(serialDescriptor, 0, baiVar.a);
        b.x(serialDescriptor, 1, baiVar.b);
        b.x(serialDescriptor, 2, baiVar.c);
        b.c(serialDescriptor);
    }
}
