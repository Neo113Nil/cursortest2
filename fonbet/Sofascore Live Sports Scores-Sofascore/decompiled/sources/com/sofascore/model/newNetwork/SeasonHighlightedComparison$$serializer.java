package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Team;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/SeasonHighlightedComparison.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/SeasonHighlightedComparison;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/SeasonHighlightedComparison;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/SeasonHighlightedComparison;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class SeasonHighlightedComparison$$serializer implements iw8 {

    @NotNull
    public static final SeasonHighlightedComparison$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SeasonHighlightedComparison$$serializer seasonHighlightedComparison$$serializer = new SeasonHighlightedComparison$$serializer();
        INSTANCE = seasonHighlightedComparison$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.SeasonHighlightedComparison", seasonHighlightedComparison$$serializer, 9);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, false);
        uyeVar.j("homeTeam", false);
        uyeVar.j("awayTeam", false);
        uyeVar.j("homeTeamStatistics", false);
        uyeVar.j("awayTeamStatistics", false);
        uyeVar.j("player1", false);
        uyeVar.j("player2", false);
        uyeVar.j("player1Statistics", false);
        uyeVar.j("player2Statistics", false);
        descriptor = uyeVar;
    }

    private SeasonHighlightedComparison$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = SeasonHighlightedComparison.$childSerializers;
        KSerializer W = l98.W((KSerializer) joaVarArr[1].getValue());
        KSerializer W2 = l98.W((KSerializer) joaVarArr[2].getValue());
        FootballTeamHighlightedStatistics$$serializer footballTeamHighlightedStatistics$$serializer = FootballTeamHighlightedStatistics$$serializer.INSTANCE;
        KSerializer W3 = l98.W(footballTeamHighlightedStatistics$$serializer);
        KSerializer W4 = l98.W(footballTeamHighlightedStatistics$$serializer);
        PlayerTeam$$serializer playerTeam$$serializer = PlayerTeam$$serializer.INSTANCE;
        KSerializer W5 = l98.W(playerTeam$$serializer);
        KSerializer W6 = l98.W(playerTeam$$serializer);
        FootballPlayerHighlightedStatistics$$serializer footballPlayerHighlightedStatistics$$serializer = FootballPlayerHighlightedStatistics$$serializer.INSTANCE;
        return new KSerializer[]{Season$$serializer.INSTANCE, W, W2, W3, W4, W5, W6, l98.W(footballPlayerHighlightedStatistics$$serializer), l98.W(footballPlayerHighlightedStatistics$$serializer)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final SeasonHighlightedComparison deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = SeasonHighlightedComparison.$childSerializers;
        FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics = null;
        boolean z = true;
        FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics2 = null;
        int i = 0;
        Season season = null;
        Team team = null;
        Team team2 = null;
        FootballTeamHighlightedStatistics footballTeamHighlightedStatistics = null;
        FootballTeamHighlightedStatistics footballTeamHighlightedStatistics2 = null;
        PlayerTeam playerTeam = null;
        PlayerTeam playerTeam2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    season = (Season) b.w(serialDescriptor, 0, Season$$serializer.INSTANCE, season);
                    i |= 1;
                    break;
                case 1:
                    team = (Team) b.i(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), team);
                    i |= 2;
                    break;
                case 2:
                    team2 = (Team) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), team2);
                    i |= 4;
                    break;
                case 3:
                    footballTeamHighlightedStatistics = (FootballTeamHighlightedStatistics) b.i(serialDescriptor, 3, FootballTeamHighlightedStatistics$$serializer.INSTANCE, footballTeamHighlightedStatistics);
                    i |= 8;
                    break;
                case 4:
                    footballTeamHighlightedStatistics2 = (FootballTeamHighlightedStatistics) b.i(serialDescriptor, 4, FootballTeamHighlightedStatistics$$serializer.INSTANCE, footballTeamHighlightedStatistics2);
                    i |= 16;
                    break;
                case 5:
                    playerTeam = (PlayerTeam) b.i(serialDescriptor, 5, PlayerTeam$$serializer.INSTANCE, playerTeam);
                    i |= 32;
                    break;
                case 6:
                    playerTeam2 = (PlayerTeam) b.i(serialDescriptor, 6, PlayerTeam$$serializer.INSTANCE, playerTeam2);
                    i |= 64;
                    break;
                case 7:
                    footballPlayerHighlightedStatistics2 = (FootballPlayerHighlightedStatistics) b.i(serialDescriptor, 7, FootballPlayerHighlightedStatistics$$serializer.INSTANCE, footballPlayerHighlightedStatistics2);
                    i |= 128;
                    break;
                case 8:
                    footballPlayerHighlightedStatistics = (FootballPlayerHighlightedStatistics) b.i(serialDescriptor, 8, FootballPlayerHighlightedStatistics$$serializer.INSTANCE, footballPlayerHighlightedStatistics);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SeasonHighlightedComparison(i, season, team, team2, footballTeamHighlightedStatistics, footballTeamHighlightedStatistics2, playerTeam, playerTeam2, footballPlayerHighlightedStatistics2, footballPlayerHighlightedStatistics, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SeasonHighlightedComparison value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        SeasonHighlightedComparison.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
