package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.PlayerEventStatisticsSerializer;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/PlayerData.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/PlayerData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/PlayerData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/PlayerData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class PlayerData$$serializer implements iw8 {

    @NotNull
    public static final PlayerData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PlayerData$$serializer playerData$$serializer = new PlayerData$$serializer();
        INSTANCE = playerData$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.PlayerData", playerData$$serializer, 19);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("avgRating", false);
        uyeVar.j("seasonRatingBreakdown", true);
        uyeVar.j("jerseyNumber", false);
        uyeVar.j("position", false);
        uyeVar.j("substitute", false);
        uyeVar.j("captain", false);
        uyeVar.j("inPlay", false);
        uyeVar.j(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, false);
        uyeVar.j("gameStar", false);
        uyeVar.j("teamId", false);
        uyeVar.j("ejected", false);
        uyeVar.j("baseballAllPositions", false);
        uyeVar.j("goalIncidents", true);
        uyeVar.j("assistIncidents", true);
        uyeVar.j("cardIncidents", true);
        uyeVar.j("substitutionIncidents", true);
        uyeVar.j("fantasyPoints", true);
        uyeVar.j("info", true);
        descriptor = uyeVar;
    }

    private PlayerData$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = PlayerData.$childSerializers;
        KSerializer W = l98.W(h75.a);
        KSerializer W2 = l98.W(SeasonRatingBreakdown$$serializer.INSTANCE);
        uhi uhiVar = uhi.a;
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(uhiVar);
        gz1 gz1Var = gz1.a;
        KSerializer W5 = l98.W(gz1Var);
        KSerializer W6 = l98.W(gz1Var);
        KSerializer W7 = l98.W(gz1Var);
        KSerializer W8 = l98.W(PlayerEventStatisticsSerializer.INSTANCE);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{Player$$serializer.INSTANCE, W, W2, W3, W4, W5, W6, W7, W8, l98.W(a7aVar), l98.W(a7aVar), l98.W(gz1Var), l98.W(BaseballAdditionalPlayerData$$serializer.INSTANCE), l98.W((KSerializer) joaVarArr[13].getValue()), l98.W((KSerializer) joaVarArr[14].getValue()), l98.W((KSerializer) joaVarArr[15].getValue()), l98.W((KSerializer) joaVarArr[16].getValue()), l98.W(c88.a), l98.W(PlayerDataInfo$$serializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final PlayerData deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Boolean bool;
        Boolean bool2;
        int i;
        Boolean bool3;
        Player player;
        Boolean bool4;
        Boolean bool5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = PlayerData.$childSerializers;
        Boolean bool6 = null;
        Integer num = null;
        Integer num2 = null;
        PlayerEventStatistics playerEventStatistics = null;
        BaseballAdditionalPlayerData baseballAdditionalPlayerData = null;
        Boolean bool7 = null;
        int i2 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        Float f = null;
        PlayerDataInfo playerDataInfo = null;
        Boolean bool8 = null;
        boolean z = true;
        Player player2 = null;
        Double d = null;
        SeasonRatingBreakdown seasonRatingBreakdown = null;
        String str = null;
        String str2 = null;
        Boolean bool9 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    bool3 = bool6;
                    player = player2;
                    z = false;
                    num = num;
                    bool8 = bool8;
                    player2 = player;
                    bool6 = bool3;
                case 0:
                    bool3 = bool6;
                    player = (Player) b.w(serialDescriptor, 0, Player$$serializer.INSTANCE, player2);
                    i2 |= 1;
                    num = num;
                    bool8 = bool8;
                    bool7 = bool7;
                    player2 = player;
                    bool6 = bool3;
                case 1:
                    bool3 = bool6;
                    bool4 = bool7;
                    bool5 = bool8;
                    d = (Double) b.i(serialDescriptor, 1, h75.a, d);
                    i2 |= 2;
                    seasonRatingBreakdown = seasonRatingBreakdown;
                    bool8 = bool5;
                    bool7 = bool4;
                    bool6 = bool3;
                case 2:
                    bool3 = bool6;
                    bool4 = bool7;
                    bool5 = bool8;
                    seasonRatingBreakdown = (SeasonRatingBreakdown) b.i(serialDescriptor, 2, SeasonRatingBreakdown$$serializer.INSTANCE, seasonRatingBreakdown);
                    i2 |= 4;
                    bool8 = bool5;
                    bool7 = bool4;
                    bool6 = bool3;
                case 3:
                    bool3 = bool6;
                    bool4 = bool7;
                    bool5 = bool8;
                    str = (String) b.i(serialDescriptor, 3, uhi.a, str);
                    i2 |= 8;
                    bool8 = bool5;
                    bool7 = bool4;
                    bool6 = bool3;
                case 4:
                    bool3 = bool6;
                    bool4 = bool7;
                    bool5 = bool8;
                    str2 = (String) b.i(serialDescriptor, 4, uhi.a, str2);
                    i2 |= 16;
                    bool8 = bool5;
                    bool7 = bool4;
                    bool6 = bool3;
                case 5:
                    bool3 = bool6;
                    bool4 = bool7;
                    bool5 = bool8;
                    bool9 = (Boolean) b.i(serialDescriptor, 5, gz1.a, bool9);
                    i2 |= 32;
                    bool8 = bool5;
                    bool7 = bool4;
                    bool6 = bool3;
                case 6:
                    bool3 = bool6;
                    bool4 = bool7;
                    bool8 = (Boolean) b.i(serialDescriptor, 6, gz1.a, bool8);
                    i2 |= 64;
                    bool7 = bool4;
                    bool6 = bool3;
                case 7:
                    bool3 = bool6;
                    bool7 = (Boolean) b.i(serialDescriptor, 7, gz1.a, bool7);
                    i2 |= 128;
                    bool8 = bool8;
                    bool6 = bool3;
                case 8:
                    bool = bool7;
                    bool2 = bool8;
                    playerEventStatistics = (PlayerEventStatistics) b.i(serialDescriptor, 8, PlayerEventStatisticsSerializer.INSTANCE, playerEventStatistics);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    bool8 = bool2;
                    bool7 = bool;
                case 9:
                    bool = bool7;
                    bool2 = bool8;
                    num2 = (Integer) b.i(serialDescriptor, 9, a7a.a, num2);
                    i2 |= 512;
                    bool8 = bool2;
                    bool7 = bool;
                case 10:
                    bool = bool7;
                    bool2 = bool8;
                    num = (Integer) b.i(serialDescriptor, 10, a7a.a, num);
                    i2 |= 1024;
                    bool8 = bool2;
                    bool7 = bool;
                case 11:
                    bool = bool7;
                    bool2 = bool8;
                    bool6 = (Boolean) b.i(serialDescriptor, 11, gz1.a, bool6);
                    i2 |= a.o;
                    bool8 = bool2;
                    bool7 = bool;
                case 12:
                    bool = bool7;
                    bool2 = bool8;
                    baseballAdditionalPlayerData = (BaseballAdditionalPlayerData) b.i(serialDescriptor, 12, BaseballAdditionalPlayerData$$serializer.INSTANCE, baseballAdditionalPlayerData);
                    i2 |= 4096;
                    bool8 = bool2;
                    bool7 = bool;
                case 13:
                    bool = bool7;
                    bool2 = bool8;
                    list = (List) b.i(serialDescriptor, 13, (dy4) joaVarArr[13].getValue(), list);
                    i2 |= 8192;
                    bool8 = bool2;
                    bool7 = bool;
                case 14:
                    bool = bool7;
                    bool2 = bool8;
                    list2 = (List) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), list2);
                    i2 |= 16384;
                    bool8 = bool2;
                    bool7 = bool;
                case 15:
                    bool = bool7;
                    bool2 = bool8;
                    list3 = (List) b.i(serialDescriptor, 15, (dy4) joaVarArr[15].getValue(), list3);
                    i = 32768;
                    i2 |= i;
                    bool8 = bool2;
                    bool7 = bool;
                case 16:
                    bool = bool7;
                    bool2 = bool8;
                    list4 = (List) b.i(serialDescriptor, 16, (dy4) joaVarArr[16].getValue(), list4);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    bool8 = bool2;
                    bool7 = bool;
                case 17:
                    bool = bool7;
                    bool2 = bool8;
                    f = (Float) b.i(serialDescriptor, 17, c88.a, f);
                    i = 131072;
                    i2 |= i;
                    bool8 = bool2;
                    bool7 = bool;
                case 18:
                    bool2 = bool8;
                    bool = bool7;
                    playerDataInfo = (PlayerDataInfo) b.i(serialDescriptor, 18, PlayerDataInfo$$serializer.INSTANCE, playerDataInfo);
                    i = 262144;
                    i2 |= i;
                    bool8 = bool2;
                    bool7 = bool;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Boolean bool10 = bool6;
        Boolean bool11 = bool8;
        Player player3 = player2;
        Double d2 = d;
        SeasonRatingBreakdown seasonRatingBreakdown2 = seasonRatingBreakdown;
        b.c(serialDescriptor);
        return new PlayerData(i2, player3, d2, seasonRatingBreakdown2, str, str2, bool9, bool11, bool7, playerEventStatistics, num2, num, bool10, baseballAdditionalPlayerData, list, list2, list3, list4, f, playerDataInfo, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PlayerData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        PlayerData.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
