package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ep implements iw8 {
    public static final ep a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ep epVar = new ep();
        a = epVar;
        uye uyeVar = new uye("com.sofascore.results.event.commentary.model.AmFootballCommentaryGroupItem", epVar, 7);
        uyeVar.j("id", false);
        uyeVar.j("teamId", false);
        uyeVar.j("endReason", false);
        uyeVar.j("playCount", false);
        uyeVar.j("durationSeconds", false);
        uyeVar.j("netDriveYards", false);
        uyeVar.j("isLive", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(uhi.a);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, W, a7aVar, a7aVar, a7aVar, gz1.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        String str = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b.l(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.i(serialDescriptor, 2, uhi.a, str);
                    i |= 4;
                    break;
                case 3:
                    i4 = b.l(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i5 = b.l(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i6 = b.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.B(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new gp(i, i2, i3, str, i4, i5, i6, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (r1 != (r4 == null || r4.length() == 0)) goto L10;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        gp gpVar = (gp) obj;
        encoder.getClass();
        gpVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        int i = gpVar.a;
        boolean z = gpVar.g;
        b.u(0, i, serialDescriptor);
        b.u(1, gpVar.b, serialDescriptor);
        uhi uhiVar = uhi.a;
        String str = gpVar.c;
        b.h(serialDescriptor, 2, uhiVar, str);
        b.u(3, gpVar.d, serialDescriptor);
        b.u(4, gpVar.e, serialDescriptor);
        b.u(5, gpVar.f, serialDescriptor);
        if (!b.o(serialDescriptor)) {
        }
        b.x(serialDescriptor, 6, z);
        b.c(serialDescriptor);
    }
}
