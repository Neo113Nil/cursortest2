package defpackage;

import androidx.core.app.NotificationCompat;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ju8 implements iw8 {
    public static final ju8 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ju8 ju8Var = new ju8();
        a = ju8Var;
        uye uyeVar = new uye("io.ktor.util.date.GMTDate", ju8Var, 9);
        uyeVar.j("seconds", false);
        uyeVar.j("minutes", false);
        uyeVar.j("hours", false);
        uyeVar.j("dayOfWeek", false);
        uyeVar.j("dayOfMonth", false);
        uyeVar.j("dayOfYear", false);
        uyeVar.j("month", false);
        uyeVar.j("year", false);
        uyeVar.j("timestamp", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = lu8.j;
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, joaVarArr[3].getValue(), a7aVar, a7aVar, joaVarArr[6].getValue(), a7aVar, lkb.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = lu8.j;
        Object obj = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        m2l m2lVar = null;
        long j = 0;
        boolean z = true;
        zuc zucVar = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b.l(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i4 = b.l(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    m2lVar = (m2l) b.w(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), m2lVar);
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
                    zucVar = (zuc) b.w(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), zucVar);
                    i |= 64;
                    break;
                case 7:
                    i7 = b.l(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    j = b.g(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    continue;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new lu8(i, i2, i3, i4, m2lVar, i5, i6, zucVar, i7, j);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lu8 lu8Var = (lu8) obj;
        encoder.getClass();
        lu8Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = lu8.j;
        b.u(0, lu8Var.a, serialDescriptor);
        b.u(1, lu8Var.b, serialDescriptor);
        b.u(2, lu8Var.c, serialDescriptor);
        b.f(serialDescriptor, 3, (KSerializer) joaVarArr[3].getValue(), lu8Var.d);
        b.u(4, lu8Var.e, serialDescriptor);
        b.u(5, lu8Var.f, serialDescriptor);
        b.f(serialDescriptor, 6, (KSerializer) joaVarArr[6].getValue(), lu8Var.g);
        b.u(7, lu8Var.h, serialDescriptor);
        b.E(serialDescriptor, 8, lu8Var.i);
        b.c(serialDescriptor);
    }
}
