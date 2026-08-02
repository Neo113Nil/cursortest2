package defpackage;

import com.sofascore.model.mvvm.model.Batsman;
import com.sofascore.model.mvvm.model.Batsman$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class a6l implements iw8 {
    public static final a6l a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a6l a6lVar = new a6l();
        a = a6lVar;
        uye uyeVar = new uye("com.sofascore.results.event.scorecard.adapter.WicketRow", a6lVar, 3);
        uyeVar.j("rank", false);
        uyeVar.j("batsman", false);
        uyeVar.j("isLastItemInGroup", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a7a.a, Batsman$$serializer.INSTANCE, gz1.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        Batsman batsman = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b.l(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                batsman = (Batsman) b.w(serialDescriptor, 1, Batsman$$serializer.INSTANCE, batsman);
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
        return new c6l(i, i2, batsman, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c6l c6lVar = (c6l) obj;
        encoder.getClass();
        c6lVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, c6lVar.a, serialDescriptor);
        b.f(serialDescriptor, 1, Batsman$$serializer.INSTANCE, c6lVar.b);
        if (b.o(serialDescriptor) || c6lVar.c) {
            b.x(serialDescriptor, 2, c6lVar.c);
        }
        b.c(serialDescriptor);
    }
}
