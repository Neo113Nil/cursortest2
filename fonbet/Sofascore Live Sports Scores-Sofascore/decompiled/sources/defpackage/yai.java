package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.StandingsTableRow$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yai implements iw8 {
    public static final yai a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        yai yaiVar = new yai();
        a = yaiVar;
        uye uyeVar = new uye("com.sofascore.results.league.adapter.StandingsTeamRow", yaiVar, 11);
        uyeVar.j("tableId", false);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        uyeVar.j("row", false);
        uyeVar.j("teamIndicator", false);
        uyeVar.j("viewMode", false);
        uyeVar.j("fullColumns", false);
        uyeVar.j("shortColumns", false);
        uyeVar.j("isHomeOrAway", true);
        uyeVar.j("isLastPromotion", true);
        uyeVar.j("promotionColorIndex", true);
        uyeVar.j("isLast", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = bbi.l;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, uhi.a, StandingsTableRow$$serializer.INSTANCE, joaVarArr[3].getValue(), joaVarArr[4].getValue(), joaVarArr[5].getValue(), joaVarArr[6].getValue(), gz1Var, gz1Var, a7aVar, gz1Var};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = bbi.l;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        String str = null;
        StandingsTableRow standingsTableRow = null;
        abi abiVar = null;
        cai caiVar = null;
        List list = null;
        List list2 = null;
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
                    standingsTableRow = (StandingsTableRow) b.w(serialDescriptor, 2, StandingsTableRow$$serializer.INSTANCE, standingsTableRow);
                    i |= 4;
                    break;
                case 3:
                    abiVar = (abi) b.w(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), abiVar);
                    i |= 8;
                    break;
                case 4:
                    caiVar = (cai) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), caiVar);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.w(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) b.w(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    z2 = b.B(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    z3 = b.B(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    continue;
                case 9:
                    i3 = b.l(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    z4 = b.B(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new bbi(i, i2, str, standingsTableRow, abiVar, caiVar, list, list2, z2, z3, i3, z4);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bbi bbiVar = (bbi) obj;
        encoder.getClass();
        bbiVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = bbi.l;
        int i = bbiVar.a;
        boolean z = bbiVar.i;
        boolean z2 = bbiVar.h;
        b.u(0, i, serialDescriptor);
        b.y(serialDescriptor, 1, bbiVar.b);
        b.f(serialDescriptor, 2, StandingsTableRow$$serializer.INSTANCE, bbiVar.c);
        b.f(serialDescriptor, 3, (KSerializer) joaVarArr[3].getValue(), bbiVar.d);
        b.f(serialDescriptor, 4, (KSerializer) joaVarArr[4].getValue(), bbiVar.e);
        b.f(serialDescriptor, 5, (KSerializer) joaVarArr[5].getValue(), bbiVar.f);
        b.f(serialDescriptor, 6, (KSerializer) joaVarArr[6].getValue(), bbiVar.g);
        if (b.o(serialDescriptor) || z2) {
            b.x(serialDescriptor, 7, z2);
        }
        if (b.o(serialDescriptor) || z) {
            b.x(serialDescriptor, 8, z);
        }
        if (b.o(serialDescriptor) || bbiVar.j != -1) {
            b.u(9, bbiVar.j, serialDescriptor);
        }
        if (b.o(serialDescriptor) || bbiVar.k) {
            b.x(serialDescriptor, 10, bbiVar.k);
        }
        b.c(serialDescriptor);
    }
}
