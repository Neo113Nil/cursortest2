package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class i6l implements iw8 {
    public static final i6l a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i6l i6lVar = new i6l();
        a = i6lVar;
        uye uyeVar = new uye("com.sofascore.results.widget.WidgetDataHelper.Page", i6lVar, 4);
        uyeVar.j("visibleFavorites", false);
        uyeVar.j("index", false);
        uyeVar.j("hasPrevious", false);
        uyeVar.j("hasNext", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{k6l.e[0].getValue(), a7a.a, gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = k6l.e;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        List list = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                list = (List) b.w(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), list);
                i |= 1;
            } else if (o == 1) {
                i2 = b.l(serialDescriptor, 1);
                i |= 2;
            } else if (o == 2) {
                z2 = b.B(serialDescriptor, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                z3 = b.B(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new k6l(i, list, i2, z2, z3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k6l k6lVar = (k6l) obj;
        encoder.getClass();
        k6lVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.f(serialDescriptor, 0, (KSerializer) k6l.e[0].getValue(), k6lVar.a);
        b.u(1, k6lVar.b, serialDescriptor);
        b.x(serialDescriptor, 2, k6lVar.c);
        b.x(serialDescriptor, 3, k6lVar.d);
        b.c(serialDescriptor);
    }
}
