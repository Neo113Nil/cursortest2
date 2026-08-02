package defpackage;

import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.BaseballInningInfo$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class z81 implements iw8 {
    public static final z81 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z81 z81Var = new z81();
        a = z81Var;
        uye uyeVar = new uye("com.sofascore.results.event.commentary.baseball.BaseballHalfInningGroupItem", z81Var, 6);
        uyeVar.j("teamId", false);
        uyeVar.j("isLive", false);
        uyeVar.j("inningInfo", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("id", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, gz1.a, BaseballInningInfo$$serializer.INSTANCE, a7aVar, a7aVar, a7aVar};
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
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        BaseballInningInfo baseballInningInfo = null;
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
                    z2 = b.B(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    baseballInningInfo = (BaseballInningInfo) b.w(serialDescriptor, 2, BaseballInningInfo$$serializer.INSTANCE, baseballInningInfo);
                    i |= 4;
                    break;
                case 3:
                    i3 = b.l(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i4 = b.l(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i5 = b.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new b91(i, i2, z2, baseballInningInfo, i3, i4, i5);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b91 b91Var = (b91) obj;
        encoder.getClass();
        b91Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        int i = b91Var.a;
        int i2 = b91Var.f;
        b.u(0, i, serialDescriptor);
        b.x(serialDescriptor, 1, b91Var.b);
        BaseballInningInfo$$serializer baseballInningInfo$$serializer = BaseballInningInfo$$serializer.INSTANCE;
        BaseballInningInfo baseballInningInfo = b91Var.c;
        b.f(serialDescriptor, 2, baseballInningInfo$$serializer, baseballInningInfo);
        b.u(3, b91Var.d, serialDescriptor);
        b.u(4, b91Var.e, serialDescriptor);
        if (b.o(serialDescriptor) || i2 != baseballInningInfo.getMockId()) {
            b.u(5, i2, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
