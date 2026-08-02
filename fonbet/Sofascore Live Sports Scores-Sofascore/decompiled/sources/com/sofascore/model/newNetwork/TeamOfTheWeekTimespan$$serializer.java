package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/TeamOfTheWeekTimespan.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/TeamOfTheWeekTimespan;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class TeamOfTheWeekTimespan$$serializer implements iw8 {

    @NotNull
    public static final TeamOfTheWeekTimespan$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TeamOfTheWeekTimespan$$serializer teamOfTheWeekTimespan$$serializer = new TeamOfTheWeekTimespan$$serializer();
        INSTANCE = teamOfTheWeekTimespan$$serializer;
        uye uyeVar = new uye(TeamOfTheWeekRoundsResponseKt.TOTW_TIMESPAN, teamOfTheWeekTimespan$$serializer, 9);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("periodName", false);
        uyeVar.j("tournamentId", false);
        uyeVar.j("sequence", false);
        uyeVar.j("dateFrom", false);
        uyeVar.j("dateTo", false);
        uyeVar.j("createdAtTimestamp", false);
        uyeVar.j("startDateTimestamp", false);
        uyeVar.k(new TeamOfTheWeekItem$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("type"));
        descriptor = uyeVar;
    }

    private TeamOfTheWeekTimespan$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        lkb lkbVar = lkb.a;
        KSerializer W2 = l98.W(lkbVar);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, uhiVar, uhiVar, W, a7aVar, lkbVar, lkbVar, lkbVar, W2};
    }

    @Override // defpackage.dy4
    @NotNull
    public final TeamOfTheWeekTimespan deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        TeamOfTheWeekTimespan teamOfTheWeekTimespan = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        Long l = null;
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
                    str2 = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) b.i(serialDescriptor, 3, a7a.a, num);
                    i |= 8;
                    break;
                case 4:
                    i3 = b.l(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j = b.g(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = b.g(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j3 = b.g(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) b.i(serialDescriptor, 8, lkb.a, l);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                default:
                    yhk.e(o);
                    return teamOfTheWeekTimespan;
            }
            teamOfTheWeekTimespan = null;
        }
        b.c(serialDescriptor);
        return new TeamOfTheWeekTimespan(i, i2, str, str2, num, i3, j, j2, j3, l, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull TeamOfTheWeekTimespan value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        TeamOfTheWeekTimespan.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
