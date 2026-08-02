package com.sofascore.model.newNetwork.statistics.season.player;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"com/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo.$serializer", "T", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo;", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class PlayerSeasonStatisticsInfo$$serializer<T> implements iw8 {

    @NotNull
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer typeSerial0;

    private PlayerSeasonStatisticsInfo$$serializer() {
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo", this, 8);
        uyeVar.j(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, false);
        uyeVar.j("team", false);
        uyeVar.j("previousTeams", false);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, false);
        uyeVar.j("startYear", false);
        uyeVar.j("endYear", false);
        uyeVar.j("year", false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        this.descriptor = uyeVar;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = PlayerSeasonStatisticsInfo.$childSerializers;
        KSerializer kSerializer = this.typeSerial0;
        KSerializer W = l98.W((KSerializer) joaVarArr[1].getValue());
        KSerializer W2 = l98.W((KSerializer) joaVarArr[2].getValue());
        KSerializer W3 = l98.W(Season$$serializer.INSTANCE);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{kSerializer, W, W2, W3, l98.W(a7aVar), l98.W(a7aVar), l98.W(uhi.a), l98.W(UniqueTournament$$serializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final PlayerSeasonStatisticsInfo<T> deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = this.descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = PlayerSeasonStatisticsInfo.$childSerializers;
        UniqueTournament uniqueTournament = null;
        boolean z = true;
        String str = null;
        int i = 0;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics = null;
        Team team = null;
        List list = null;
        Season season = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    abstractPlayerSeasonStatistics = (AbstractPlayerSeasonStatistics) b.w(serialDescriptor, 0, this.typeSerial0, abstractPlayerSeasonStatistics);
                    i |= 1;
                    break;
                case 1:
                    team = (Team) b.i(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), team);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    season = (Season) b.i(serialDescriptor, 3, Season$$serializer.INSTANCE, season);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) b.i(serialDescriptor, 4, a7a.a, num);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) b.i(serialDescriptor, 5, a7a.a, num2);
                    i |= 32;
                    break;
                case 6:
                    str = (String) b.i(serialDescriptor, 6, uhi.a, str);
                    i |= 64;
                    break;
                case 7:
                    uniqueTournament = (UniqueTournament) b.i(serialDescriptor, 7, UniqueTournament$$serializer.INSTANCE, uniqueTournament);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PlayerSeasonStatisticsInfo<>(i, abstractPlayerSeasonStatistics, team, list, season, num, num2, str, uniqueTournament, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PlayerSeasonStatisticsInfo<? extends T> value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = this.descriptor;
        wf3 b = encoder.b(serialDescriptor);
        PlayerSeasonStatisticsInfo.write$Self$model_release(value, b, serialDescriptor, this.typeSerial0);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerSeasonStatisticsInfo$$serializer(@NotNull KSerializer kSerializer) {
        this();
        kSerializer.getClass();
        this.typeSerial0 = kSerializer;
    }
}
