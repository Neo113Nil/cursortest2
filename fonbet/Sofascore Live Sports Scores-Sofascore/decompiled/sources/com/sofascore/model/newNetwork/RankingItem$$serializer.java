package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Country$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/RankingItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/RankingItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/RankingItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/RankingItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RankingItem$$serializer implements iw8 {

    @NotNull
    public static final RankingItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RankingItem$$serializer rankingItem$$serializer = new RankingItem$$serializer();
        INSTANCE = rankingItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.RankingItem", rankingItem$$serializer, 25);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("country", false);
        uyeVar.j("rankingClass", false);
        uyeVar.j("ranking", true);
        uyeVar.j("points", true);
        uyeVar.j("previousRanking", true);
        uyeVar.j("previousPoints", false);
        uyeVar.j("rowName", false);
        uyeVar.j("bestRanking", false);
        uyeVar.j("bestRankingDateTimestamp", false);
        uyeVar.j("currentRound", false);
        uyeVar.j("currentTournamentName", false);
        uyeVar.j("currentTournamentId", false);
        uyeVar.j("previousTournamentRound", false);
        uyeVar.j("previousTournamentName", false);
        uyeVar.j("previousTournamentId", false);
        uyeVar.j("nextWinPoints", false);
        uyeVar.j("maxPoints", false);
        uyeVar.j("team", false);
        uyeVar.j("tournamentsPlayed", false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        uyeVar.j("year", false);
        uyeVar.j("totalTeams", true);
        uyeVar.j("playingTeams", true);
        descriptor = uyeVar;
    }

    private RankingItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = RankingItem.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, a7aVar, Country$$serializer.INSTANCE, uhiVar, a7aVar, h75Var, a7aVar, l98.W(h75Var), l98.W(uhiVar), l98.W(a7aVar), l98.W(lkb.a), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W((KSerializer) joaVarArr[19].getValue()), l98.W(a7aVar), l98.W(UniqueTournament$$serializer.INSTANCE), l98.W(uhiVar), a7aVar, a7aVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RankingItem deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Long l;
        int i;
        String str;
        Long l2;
        String str2;
        Long l3;
        String str3;
        Long l4;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = RankingItem.$childSerializers;
        double d = 0.0d;
        String str4 = null;
        String str5 = null;
        Long l5 = null;
        String str6 = null;
        Integer num = null;
        Integer num2 = null;
        UniqueTournament uniqueTournament = null;
        int i3 = 0;
        String str7 = null;
        String str8 = null;
        Team team = null;
        Integer num3 = null;
        Double d2 = null;
        Double d3 = null;
        Country country = null;
        int i4 = 0;
        boolean z = true;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        int i7 = 0;
        Double d4 = null;
        String str10 = null;
        Integer num4 = null;
        int i8 = 0;
        int i9 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str = str4;
                    l2 = l5;
                    z = false;
                    l5 = l2;
                    str4 = str;
                case 0:
                    str = str4;
                    str2 = str5;
                    l3 = l5;
                    i5 = b.l(serialDescriptor, 0);
                    i3 |= 1;
                    l5 = l3;
                    str5 = str2;
                    str4 = str;
                case 1:
                    str = str4;
                    str2 = str5;
                    i6 = b.l(serialDescriptor, 1);
                    i3 |= 2;
                    str5 = str2;
                    str4 = str;
                case 2:
                    str = str4;
                    str2 = str5;
                    l3 = l5;
                    country = (Country) b.w(serialDescriptor, 2, Country$$serializer.INSTANCE, country);
                    i3 |= 4;
                    l5 = l3;
                    str5 = str2;
                    str4 = str;
                case 3:
                    str = str4;
                    str2 = str5;
                    str9 = b.n(serialDescriptor, 3);
                    i3 |= 8;
                    str5 = str2;
                    str4 = str;
                case 4:
                    str = str4;
                    str2 = str5;
                    i7 = b.l(serialDescriptor, 4);
                    i3 |= 16;
                    str5 = str2;
                    str4 = str;
                case 5:
                    str = str4;
                    str2 = str5;
                    d = b.D(serialDescriptor, 5);
                    i3 |= 32;
                    str5 = str2;
                    str4 = str;
                case 6:
                    str = str4;
                    str2 = str5;
                    i4 = b.l(serialDescriptor, 6);
                    i3 |= 64;
                    str5 = str2;
                    str4 = str;
                case 7:
                    str = str4;
                    str2 = str5;
                    l3 = l5;
                    d4 = (Double) b.i(serialDescriptor, 7, h75.a, d4);
                    i3 |= 128;
                    l5 = l3;
                    str5 = str2;
                    str4 = str;
                case 8:
                    str = str4;
                    str2 = str5;
                    l3 = l5;
                    str10 = (String) b.i(serialDescriptor, 8, uhi.a, str10);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    l5 = l3;
                    str5 = str2;
                    str4 = str;
                case 9:
                    str = str4;
                    str2 = str5;
                    l3 = l5;
                    num4 = (Integer) b.i(serialDescriptor, 9, a7a.a, num4);
                    i3 |= 512;
                    l5 = l3;
                    str5 = str2;
                    str4 = str;
                case 10:
                    str = str4;
                    str2 = str5;
                    l5 = (Long) b.i(serialDescriptor, 10, lkb.a, l5);
                    i3 |= 1024;
                    str5 = str2;
                    str4 = str;
                case 11:
                    l2 = l5;
                    str = str4;
                    str5 = (String) b.i(serialDescriptor, 11, uhi.a, str5);
                    i3 |= a.o;
                    l5 = l2;
                    str4 = str;
                case 12:
                    str3 = str5;
                    l4 = l5;
                    str4 = (String) b.i(serialDescriptor, 12, uhi.a, str4);
                    i3 |= 4096;
                    l5 = l4;
                    str5 = str3;
                case 13:
                    str3 = str5;
                    l4 = l5;
                    num = (Integer) b.i(serialDescriptor, 13, a7a.a, num);
                    i3 |= 8192;
                    l5 = l4;
                    str5 = str3;
                case 14:
                    str3 = str5;
                    l4 = l5;
                    str7 = (String) b.i(serialDescriptor, 14, uhi.a, str7);
                    i3 |= 16384;
                    l5 = l4;
                    str5 = str3;
                case 15:
                    str3 = str5;
                    l4 = l5;
                    str8 = (String) b.i(serialDescriptor, 15, uhi.a, str8);
                    i2 = 32768;
                    i3 |= i2;
                    l5 = l4;
                    str5 = str3;
                case 16:
                    str3 = str5;
                    l4 = l5;
                    num3 = (Integer) b.i(serialDescriptor, 16, a7a.a, num3);
                    i2 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i3 |= i2;
                    l5 = l4;
                    str5 = str3;
                case 17:
                    str3 = str5;
                    l4 = l5;
                    d2 = (Double) b.i(serialDescriptor, 17, h75.a, d2);
                    i2 = 131072;
                    i3 |= i2;
                    l5 = l4;
                    str5 = str3;
                case 18:
                    str3 = str5;
                    l4 = l5;
                    d3 = (Double) b.i(serialDescriptor, 18, h75.a, d3);
                    i2 = 262144;
                    i3 |= i2;
                    l5 = l4;
                    str5 = str3;
                case 19:
                    str3 = str5;
                    l4 = l5;
                    team = (Team) b.i(serialDescriptor, 19, (dy4) joaVarArr[19].getValue(), team);
                    i2 = 524288;
                    i3 |= i2;
                    l5 = l4;
                    str5 = str3;
                case 20:
                    str3 = str5;
                    l4 = l5;
                    num2 = (Integer) b.i(serialDescriptor, 20, a7a.a, num2);
                    i2 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i3 |= i2;
                    l5 = l4;
                    str5 = str3;
                case 21:
                    str3 = str5;
                    l4 = l5;
                    uniqueTournament = (UniqueTournament) b.i(serialDescriptor, 21, UniqueTournament$$serializer.INSTANCE, uniqueTournament);
                    i2 = 2097152;
                    i3 |= i2;
                    l5 = l4;
                    str5 = str3;
                case 22:
                    l4 = l5;
                    str3 = str5;
                    str6 = (String) b.i(serialDescriptor, 22, uhi.a, str6);
                    i2 = 4194304;
                    i3 |= i2;
                    l5 = l4;
                    str5 = str3;
                case 23:
                    l = l5;
                    i8 = b.l(serialDescriptor, 23);
                    i = 8388608;
                    i3 |= i;
                    l5 = l;
                case 24:
                    l = l5;
                    i9 = b.l(serialDescriptor, 24);
                    i = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i3 |= i;
                    l5 = l;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str11 = str4;
        Long l6 = l5;
        Country country2 = country;
        b.c(serialDescriptor);
        Integer num5 = num4;
        Double d5 = d3;
        return new RankingItem(i3, i5, i6, country2, str9, i7, d, i4, d4, str10, num5, l6, str5, str11, num, str7, str8, num3, d2, d5, team, num2, uniqueTournament, str6, i8, i9, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RankingItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RankingItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
