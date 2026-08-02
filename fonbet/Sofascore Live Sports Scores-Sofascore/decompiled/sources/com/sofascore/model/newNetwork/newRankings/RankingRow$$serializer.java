package com.sofascore.model.newNetwork.newRankings;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Country$$serializer;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/newRankings/RankingRow.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/newRankings/RankingRow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/newRankings/RankingRow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/newRankings/RankingRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RankingRow$$serializer implements iw8 {

    @NotNull
    public static final RankingRow$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RankingRow$$serializer rankingRow$$serializer = new RankingRow$$serializer();
        INSTANCE = rankingRow$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.newRankings.RankingRow", rankingRow$$serializer, 19);
        uyeVar.j("id", false);
        uyeVar.j("position", false);
        uyeVar.j("year", false);
        uyeVar.j("team", false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        uyeVar.j("country", false);
        uyeVar.j("lastEvent", false);
        uyeVar.j("name", false);
        uyeVar.j("points", false);
        uyeVar.j("previousPosition", false);
        uyeVar.j("bestPosition", false);
        uyeVar.j("bestPositionTimestamp", false);
        uyeVar.j("tournamentsPlayed", false);
        uyeVar.j("previousPoints", false);
        uyeVar.j("nextWinPoints", false);
        uyeVar.j("maxPoints", false);
        uyeVar.j("playingTeams", false);
        uyeVar.j("totalTeams", false);
        uyeVar.j("currentTournamentName", false);
        descriptor = uyeVar;
    }

    private RankingRow$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = RankingRow.$childSerializers;
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W((KSerializer) joaVarArr[3].getValue());
        KSerializer W3 = l98.W(UniqueTournament$$serializer.INSTANCE);
        KSerializer W4 = l98.W(Country$$serializer.INSTANCE);
        KSerializer W5 = l98.W(EventSerializer.INSTANCE);
        uhi uhiVar = uhi.a;
        KSerializer W6 = l98.W(uhiVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, a7aVar, W, W2, W3, W4, W5, W6, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(lkb.a), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RankingRow deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        String str;
        Event event;
        int i;
        Long l;
        Event event2;
        String str2;
        Event event3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = RankingRow.$childSerializers;
        Long l2 = null;
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        Integer num3 = null;
        String str3 = null;
        int i2 = 0;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str4 = null;
        Event event4 = null;
        boolean z = true;
        int i3 = 0;
        int i4 = 0;
        Integer num6 = null;
        Team team = null;
        UniqueTournament uniqueTournament = null;
        Country country = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    l = l2;
                    event2 = event4;
                    z = false;
                    event4 = event2;
                    l2 = l;
                case 0:
                    l = l2;
                    str2 = str3;
                    event3 = event4;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    event4 = event3;
                    str3 = str2;
                    l2 = l;
                case 1:
                    l = l2;
                    str2 = str3;
                    i4 = b.l(serialDescriptor, 1);
                    i2 |= 2;
                    str3 = str2;
                    l2 = l;
                case 2:
                    l = l2;
                    str2 = str3;
                    event3 = event4;
                    num6 = (Integer) b.i(serialDescriptor, 2, a7a.a, num6);
                    i2 |= 4;
                    event4 = event3;
                    str3 = str2;
                    l2 = l;
                case 3:
                    l = l2;
                    str2 = str3;
                    event3 = event4;
                    team = (Team) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), team);
                    i2 |= 8;
                    event4 = event3;
                    str3 = str2;
                    l2 = l;
                case 4:
                    l = l2;
                    str2 = str3;
                    event3 = event4;
                    uniqueTournament = (UniqueTournament) b.i(serialDescriptor, 4, UniqueTournament$$serializer.INSTANCE, uniqueTournament);
                    i2 |= 16;
                    event4 = event3;
                    str3 = str2;
                    l2 = l;
                case 5:
                    l = l2;
                    str2 = str3;
                    event3 = event4;
                    country = (Country) b.i(serialDescriptor, 5, Country$$serializer.INSTANCE, country);
                    i2 |= 32;
                    event4 = event3;
                    str3 = str2;
                    l2 = l;
                case 6:
                    l = l2;
                    str2 = str3;
                    event4 = (Event) b.i(serialDescriptor, 6, EventSerializer.INSTANCE, event4);
                    i2 |= 64;
                    str3 = str2;
                    l2 = l;
                case 7:
                    event2 = event4;
                    l = l2;
                    str3 = (String) b.i(serialDescriptor, 7, uhi.a, str3);
                    i2 |= 128;
                    event4 = event2;
                    l2 = l;
                case 8:
                    str = str3;
                    event = event4;
                    d = (Double) b.i(serialDescriptor, 8, h75.a, d);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    event4 = event;
                    str3 = str;
                case 9:
                    str = str3;
                    event = event4;
                    num2 = (Integer) b.i(serialDescriptor, 9, a7a.a, num2);
                    i2 |= 512;
                    event4 = event;
                    str3 = str;
                case 10:
                    str = str3;
                    event = event4;
                    num = (Integer) b.i(serialDescriptor, 10, a7a.a, num);
                    i2 |= 1024;
                    event4 = event;
                    str3 = str;
                case 11:
                    str = str3;
                    event = event4;
                    l2 = (Long) b.i(serialDescriptor, 11, lkb.a, l2);
                    i2 |= a.o;
                    event4 = event;
                    str3 = str;
                case 12:
                    str = str3;
                    event = event4;
                    num3 = (Integer) b.i(serialDescriptor, 12, a7a.a, num3);
                    i2 |= 4096;
                    event4 = event;
                    str3 = str;
                case 13:
                    str = str3;
                    event = event4;
                    d2 = (Double) b.i(serialDescriptor, 13, h75.a, d2);
                    i2 |= 8192;
                    event4 = event;
                    str3 = str;
                case 14:
                    str = str3;
                    event = event4;
                    d3 = (Double) b.i(serialDescriptor, 14, h75.a, d3);
                    i2 |= 16384;
                    event4 = event;
                    str3 = str;
                case 15:
                    str = str3;
                    event = event4;
                    d4 = (Double) b.i(serialDescriptor, 15, h75.a, d4);
                    i = 32768;
                    i2 |= i;
                    event4 = event;
                    str3 = str;
                case 16:
                    str = str3;
                    event = event4;
                    num4 = (Integer) b.i(serialDescriptor, 16, a7a.a, num4);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    event4 = event;
                    str3 = str;
                case 17:
                    str = str3;
                    event = event4;
                    num5 = (Integer) b.i(serialDescriptor, 17, a7a.a, num5);
                    i = 131072;
                    i2 |= i;
                    event4 = event;
                    str3 = str;
                case 18:
                    event = event4;
                    str = str3;
                    str4 = (String) b.i(serialDescriptor, 18, uhi.a, str4);
                    i = 262144;
                    i2 |= i;
                    event4 = event;
                    str3 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Long l3 = l2;
        Integer num7 = num6;
        b.c(serialDescriptor);
        Integer num8 = num4;
        Integer num9 = num5;
        return new RankingRow(i2, i3, i4, num7, team, uniqueTournament, country, event4, str3, d, num2, num, l3, num3, d2, d3, d4, num8, num9, str4, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RankingRow value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RankingRow.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
