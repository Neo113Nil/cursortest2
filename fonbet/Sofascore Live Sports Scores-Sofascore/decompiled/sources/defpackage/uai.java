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
public final /* synthetic */ class uai implements iw8 {
    public static final uai a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        uai uaiVar = new uai();
        a = uaiVar;
        uye uyeVar = new uye("com.sofascore.results.league.adapter.StandingsTableHeaderRow", uaiVar, 9);
        uyeVar.j("tableId", false);
        uyeVar.j("viewMode", false);
        uyeVar.j("fullColumns", false);
        uyeVar.j("shortColumns", false);
        uyeVar.j("year", false);
        uyeVar.j("standingsPromoName", true);
        uyeVar.j("promotionColorIndex", true);
        uyeVar.j("isHomeOrAway", true);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = wai.j;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, joaVarArr[1].getValue(), joaVarArr[2].getValue(), joaVarArr[3].getValue(), l98.W(a7aVar), l98.W(uhiVar), l98.W(a7aVar), gz1.a, uhiVar};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = wai.j;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        cai caiVar = null;
        List list = null;
        List list2 = null;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
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
                    caiVar = (cai) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), caiVar);
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
                    num = (Integer) b.i(serialDescriptor, 4, a7a.a, num);
                    i |= 16;
                    break;
                case 5:
                    str = (String) b.i(serialDescriptor, 5, uhi.a, str);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) b.i(serialDescriptor, 6, a7a.a, num2);
                    i |= 64;
                    break;
                case 7:
                    z2 = b.B(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    str2 = b.n(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    continue;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new wai(i, i2, caiVar, list, list2, num, str, num2, z2, str2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wai waiVar = (wai) obj;
        encoder.getClass();
        waiVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = wai.j;
        int i = waiVar.a;
        boolean z = waiVar.h;
        Integer num = waiVar.g;
        String str = waiVar.f;
        b.u(0, i, serialDescriptor);
        b.f(serialDescriptor, 1, (KSerializer) joaVarArr[1].getValue(), waiVar.b);
        b.f(serialDescriptor, 2, (KSerializer) joaVarArr[2].getValue(), waiVar.c);
        b.f(serialDescriptor, 3, (KSerializer) joaVarArr[3].getValue(), waiVar.d);
        a7a a7aVar = a7a.a;
        b.h(serialDescriptor, 4, a7aVar, waiVar.e);
        if (b.o(serialDescriptor) || str != null) {
            b.h(serialDescriptor, 5, uhi.a, str);
        }
        if (b.o(serialDescriptor) || num != null) {
            b.h(serialDescriptor, 6, a7aVar, num);
        }
        if (b.o(serialDescriptor) || z) {
            b.x(serialDescriptor, 7, z);
        }
        b.y(serialDescriptor, 8, waiVar.i);
        b.c(serialDescriptor);
    }
}
