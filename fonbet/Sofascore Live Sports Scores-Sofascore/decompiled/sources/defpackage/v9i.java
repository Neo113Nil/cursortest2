package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.network.response.SearchResponseKt;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class v9i implements iw8 {
    public static final v9i a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v9i v9iVar = new v9i();
        a = v9iVar;
        uye uyeVar = new uye("com.sofascore.results.league.adapter.StandingsDescriptionRow", v9iVar, 9);
        uyeVar.j("tableId", false);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        uyeVar.j("descriptionRows", false);
        uyeVar.j("legendRows", false);
        uyeVar.j("statisticsRowShort", false);
        uyeVar.j("statisticsRowFull", false);
        uyeVar.j("statisticsRowForm", false);
        uyeVar.j("viewMode", false);
        uyeVar.j("expanded", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = x9i.j;
        return new KSerializer[]{a7a.a, uhi.a, joaVarArr[2].getValue(), joaVarArr[3].getValue(), joaVarArr[4].getValue(), joaVarArr[5].getValue(), joaVarArr[6].getValue(), joaVarArr[7].getValue(), gz1.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = x9i.j;
        Object obj = null;
        boolean z = true;
        cai caiVar = null;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
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
                    str = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) b.w(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    list4 = (List) b.w(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list4);
                    i |= 32;
                    break;
                case 6:
                    list5 = (List) b.w(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list5);
                    i |= 64;
                    break;
                case 7:
                    caiVar = (cai) b.w(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), caiVar);
                    i |= 128;
                    break;
                case 8:
                    z2 = b.B(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new x9i(i, i2, str, list, list2, list3, list4, list5, caiVar, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x9i x9iVar = (x9i) obj;
        encoder.getClass();
        x9iVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = x9i.j;
        b.u(0, x9iVar.a, serialDescriptor);
        b.y(serialDescriptor, 1, x9iVar.b);
        b.f(serialDescriptor, 2, (KSerializer) joaVarArr[2].getValue(), x9iVar.c);
        b.f(serialDescriptor, 3, (KSerializer) joaVarArr[3].getValue(), x9iVar.d);
        b.f(serialDescriptor, 4, (KSerializer) joaVarArr[4].getValue(), x9iVar.e);
        b.f(serialDescriptor, 5, (KSerializer) joaVarArr[5].getValue(), x9iVar.f);
        b.f(serialDescriptor, 6, (KSerializer) joaVarArr[6].getValue(), x9iVar.g);
        b.f(serialDescriptor, 7, (KSerializer) joaVarArr[7].getValue(), x9iVar.h);
        if (b.o(serialDescriptor) || x9iVar.i) {
            b.x(serialDescriptor, 8, x9iVar.i);
        }
        b.c(serialDescriptor);
    }
}
