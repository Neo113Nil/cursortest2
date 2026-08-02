package com.sofascore.model.newNetwork.commentary;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.BaseballInningInfo$$serializer;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
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
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/commentary/Comment.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/commentary/Comment;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/commentary/Comment;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/commentary/Comment;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Comment$$serializer implements iw8 {

    @NotNull
    public static final Comment$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Comment$$serializer comment$$serializer = new Comment$$serializer();
        INSTANCE = comment$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.commentary.Comment", comment$$serializer, 32);
        uyeVar.j("text", false);
        uyeVar.j("type", false);
        uyeVar.j("goalType", false);
        uyeVar.j("periodName", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("isHome", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("playerIn", false);
        uyeVar.j("playerOut", false);
        uyeVar.j("id", false);
        uyeVar.j("time", false);
        uyeVar.j("reversedPeriodTime", false);
        uyeVar.j("reversedPeriodTimeSeconds", false);
        uyeVar.j("yardsGained", false);
        uyeVar.j("playType", false);
        uyeVar.j("driveId", false);
        uyeVar.j("yardline", false);
        uyeVar.j("yardsToFirstDown", false);
        uyeVar.j("down", false);
        uyeVar.j("isGoal", false);
        uyeVar.j("teamHalf", false);
        uyeVar.j("possession", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("atBatId", false);
        uyeVar.j("inningInfo", false);
        uyeVar.j("isScoringPlay", false);
        uyeVar.j("actionOutcome", false);
        uyeVar.j("notableActions", false);
        uyeVar.j("footballPassingNetworkAction", false);
        uyeVar.j("shouldReverseTeams", true);
        uyeVar.j("groupId", true);
        descriptor = uyeVar;
    }

    private Comment$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Comment.$childSerializers;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        KSerializer W3 = l98.W(a7aVar);
        gz1 gz1Var = gz1.a;
        KSerializer W4 = l98.W(gz1Var);
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        return new KSerializer[]{uhiVar, uhiVar, W, W2, W3, W4, l98.W(player$$serializer), l98.W(player$$serializer), l98.W(player$$serializer), a7aVar, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(gz1Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(BaseballInningInfo$$serializer.INSTANCE), l98.W(gz1Var), l98.W((KSerializer) joaVarArr[27].getValue()), l98.W((KSerializer) joaVarArr[28].getValue()), l98.W((KSerializer) joaVarArr[29].getValue()), gz1Var, l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Comment deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        BaseballInningInfo baseballInningInfo;
        Integer num;
        Integer num2;
        int i;
        String str;
        Integer num3;
        Integer num4;
        Integer num5;
        String str2;
        Integer num6;
        int i2;
        int i3;
        int i4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Comment.$childSerializers;
        BaseballInningInfo baseballInningInfo2 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Boolean bool = null;
        Integer num10 = null;
        BaseballActionOutcome baseballActionOutcome = null;
        Integer num11 = null;
        List list = null;
        List list2 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Boolean bool2 = null;
        boolean z = true;
        int i5 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num15 = null;
        Boolean bool3 = null;
        Player player = null;
        Player player2 = null;
        Player player3 = null;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        Integer num19 = null;
        int i6 = 0;
        String str7 = null;
        Integer num20 = null;
        Integer num21 = null;
        boolean z2 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    baseballInningInfo = baseballInningInfo2;
                    num = num13;
                    num2 = num14;
                    i = i6;
                    str = str7;
                    num3 = num7;
                    Unit unit = Unit.a;
                    z = false;
                    num7 = num3;
                    str7 = str;
                    i6 = i;
                    num13 = num;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 0:
                    baseballInningInfo = baseballInningInfo2;
                    num = num13;
                    num2 = num14;
                    int i7 = i6;
                    str = str7;
                    num3 = num7;
                    String n = b.n(serialDescriptor, 0);
                    i = i7 | 1;
                    Unit unit2 = Unit.a;
                    str3 = n;
                    num7 = num3;
                    str7 = str;
                    i6 = i;
                    num13 = num;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 1:
                    baseballInningInfo = baseballInningInfo2;
                    num = num13;
                    num2 = num14;
                    int i8 = i6;
                    str = str7;
                    String n2 = b.n(serialDescriptor, 1);
                    i = i8 | 2;
                    Unit unit3 = Unit.a;
                    str4 = n2;
                    num7 = num7;
                    str7 = str;
                    i6 = i;
                    num13 = num;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 2:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    int i9 = i6;
                    String str8 = str7;
                    Integer num22 = num7;
                    String str9 = (String) b.i(serialDescriptor, 2, uhi.a, str5);
                    int i10 = i9 | 4;
                    Unit unit4 = Unit.a;
                    i6 = i10;
                    num7 = num22;
                    str7 = str8;
                    str5 = str9;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 3:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    int i11 = i6;
                    String str10 = str7;
                    Integer num23 = num7;
                    String str11 = (String) b.i(serialDescriptor, 3, uhi.a, str6);
                    int i12 = i11 | 8;
                    Unit unit5 = Unit.a;
                    i6 = i12;
                    num7 = num23;
                    str7 = str10;
                    str6 = str11;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 4:
                    baseballInningInfo = baseballInningInfo2;
                    num5 = num13;
                    num2 = num14;
                    int i13 = i6;
                    str2 = str7;
                    num6 = num7;
                    Integer num24 = (Integer) b.i(serialDescriptor, 4, a7a.a, num15);
                    i2 = i13 | 16;
                    Unit unit6 = Unit.a;
                    num15 = num24;
                    num7 = num6;
                    num13 = num5;
                    str7 = str2;
                    i6 = i2;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 5:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    int i14 = i6;
                    String str12 = str7;
                    Integer num25 = num7;
                    Boolean bool4 = (Boolean) b.i(serialDescriptor, 5, gz1.a, bool3);
                    int i15 = i14 | 32;
                    Unit unit7 = Unit.a;
                    i6 = i15;
                    num7 = num25;
                    str7 = str12;
                    bool3 = bool4;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 6:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    int i16 = i6;
                    String str13 = str7;
                    Integer num26 = num7;
                    Player player4 = (Player) b.i(serialDescriptor, 6, Player$$serializer.INSTANCE, player);
                    int i17 = i16 | 64;
                    Unit unit8 = Unit.a;
                    i6 = i17;
                    num7 = num26;
                    str7 = str13;
                    player = player4;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 7:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    int i18 = i6;
                    String str14 = str7;
                    Integer num27 = num7;
                    Player player5 = (Player) b.i(serialDescriptor, 7, Player$$serializer.INSTANCE, player2);
                    int i19 = i18 | 128;
                    Unit unit9 = Unit.a;
                    i6 = i19;
                    num7 = num27;
                    str7 = str14;
                    player2 = player5;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 8:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    int i20 = i6;
                    String str15 = str7;
                    Integer num28 = num7;
                    Player player6 = (Player) b.i(serialDescriptor, 8, Player$$serializer.INSTANCE, player3);
                    int i21 = i20 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    i6 = i21;
                    num7 = num28;
                    str7 = str15;
                    player3 = player6;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 9:
                    baseballInningInfo = baseballInningInfo2;
                    num5 = num13;
                    num2 = num14;
                    int i22 = i6;
                    str2 = str7;
                    num6 = num7;
                    i5 = b.l(serialDescriptor, 9);
                    i2 = i22 | 512;
                    Unit unit11 = Unit.a;
                    num7 = num6;
                    num13 = num5;
                    str7 = str2;
                    i6 = i2;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 10:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    int i23 = i6;
                    String str16 = str7;
                    Integer num29 = num7;
                    Integer num30 = (Integer) b.i(serialDescriptor, 10, a7a.a, num16);
                    int i24 = i23 | 1024;
                    Unit unit12 = Unit.a;
                    i6 = i24;
                    num7 = num29;
                    str7 = str16;
                    num16 = num30;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 11:
                    baseballInningInfo = baseballInningInfo2;
                    num5 = num13;
                    num2 = num14;
                    int i25 = i6;
                    str2 = str7;
                    num6 = num7;
                    Integer num31 = (Integer) b.i(serialDescriptor, 11, a7a.a, num17);
                    i2 = i25 | a.o;
                    Unit unit13 = Unit.a;
                    num17 = num31;
                    num7 = num6;
                    num13 = num5;
                    str7 = str2;
                    i6 = i2;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 12:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    int i26 = i6;
                    String str17 = str7;
                    Integer num32 = num7;
                    Integer num33 = (Integer) b.i(serialDescriptor, 12, a7a.a, num18);
                    int i27 = i26 | 4096;
                    Unit unit14 = Unit.a;
                    i6 = i27;
                    num7 = num32;
                    str7 = str17;
                    num18 = num33;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 13:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    String str18 = str7;
                    Integer num34 = (Integer) b.i(serialDescriptor, 13, a7a.a, num19);
                    Unit unit15 = Unit.a;
                    i6 |= 8192;
                    num7 = num7;
                    str7 = str18;
                    num19 = num34;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 14:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    String str19 = (String) b.i(serialDescriptor, 14, uhi.a, str7);
                    i3 = i6 | 16384;
                    Unit unit16 = Unit.a;
                    str7 = str19;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 15:
                    baseballInningInfo = baseballInningInfo2;
                    num4 = num13;
                    num2 = num14;
                    Integer num35 = (Integer) b.i(serialDescriptor, 15, a7a.a, num20);
                    i3 = i6 | 32768;
                    Unit unit17 = Unit.a;
                    num20 = num35;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 16:
                    baseballInningInfo = baseballInningInfo2;
                    num2 = num14;
                    num4 = num13;
                    Integer num36 = (Integer) b.i(serialDescriptor, 16, a7a.a, num21);
                    i3 = i6 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num21 = num36;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 17:
                    baseballInningInfo = baseballInningInfo2;
                    num2 = num14;
                    num13 = (Integer) b.i(serialDescriptor, 17, a7a.a, num13);
                    Unit unit19 = Unit.a;
                    i6 |= 131072;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 18:
                    num4 = num13;
                    baseballInningInfo = baseballInningInfo2;
                    Integer num37 = (Integer) b.i(serialDescriptor, 18, a7a.a, num14);
                    Unit unit20 = Unit.a;
                    i6 |= 262144;
                    num2 = num37;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 19:
                    num4 = num13;
                    num2 = num14;
                    bool2 = (Boolean) b.i(serialDescriptor, 19, gz1.a, bool2);
                    i4 = 524288;
                    i3 = i6 | i4;
                    Unit unit21 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 20:
                    num4 = num13;
                    num2 = num14;
                    num10 = (Integer) b.i(serialDescriptor, 20, a7a.a, num10);
                    i4 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i3 = i6 | i4;
                    Unit unit212 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 21:
                    num4 = num13;
                    num2 = num14;
                    num11 = (Integer) b.i(serialDescriptor, 21, a7a.a, num11);
                    i4 = 2097152;
                    i3 = i6 | i4;
                    Unit unit2122 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 22:
                    num4 = num13;
                    num2 = num14;
                    num9 = (Integer) b.i(serialDescriptor, 22, a7a.a, num9);
                    i4 = 4194304;
                    i3 = i6 | i4;
                    Unit unit21222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 23:
                    num4 = num13;
                    num2 = num14;
                    num8 = (Integer) b.i(serialDescriptor, 23, a7a.a, num8);
                    i4 = 8388608;
                    i3 = i6 | i4;
                    Unit unit212222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 24:
                    num4 = num13;
                    num2 = num14;
                    num7 = (Integer) b.i(serialDescriptor, 24, a7a.a, num7);
                    i4 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i3 = i6 | i4;
                    Unit unit2122222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 25:
                    num4 = num13;
                    num2 = num14;
                    baseballInningInfo2 = (BaseballInningInfo) b.i(serialDescriptor, 25, BaseballInningInfo$$serializer.INSTANCE, baseballInningInfo2);
                    i4 = 33554432;
                    i3 = i6 | i4;
                    Unit unit21222222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 26:
                    num4 = num13;
                    num2 = num14;
                    bool = (Boolean) b.i(serialDescriptor, 26, gz1.a, bool);
                    i4 = 67108864;
                    i3 = i6 | i4;
                    Unit unit212222222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 27:
                    num4 = num13;
                    num2 = num14;
                    baseballActionOutcome = (BaseballActionOutcome) b.i(serialDescriptor, 27, (dy4) joaVarArr[27].getValue(), baseballActionOutcome);
                    i4 = 134217728;
                    i3 = i6 | i4;
                    Unit unit2122222222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 28:
                    num4 = num13;
                    num2 = num14;
                    list = (List) b.i(serialDescriptor, 28, (dy4) joaVarArr[28].getValue(), list);
                    i4 = 268435456;
                    i3 = i6 | i4;
                    Unit unit21222222222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 29:
                    num4 = num13;
                    num2 = num14;
                    list2 = (List) b.i(serialDescriptor, 29, (dy4) joaVarArr[29].getValue(), list2);
                    i4 = 536870912;
                    i3 = i6 | i4;
                    Unit unit212222222222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 30:
                    num4 = num13;
                    num2 = num14;
                    z2 = b.B(serialDescriptor, 30);
                    i4 = 1073741824;
                    i3 = i6 | i4;
                    Unit unit2122222222222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                case 31:
                    num4 = num13;
                    num2 = num14;
                    num12 = (Integer) b.i(serialDescriptor, 31, a7a.a, num12);
                    i4 = Integer.MIN_VALUE;
                    i3 = i6 | i4;
                    Unit unit21222222222222 = Unit.a;
                    baseballInningInfo = baseballInningInfo2;
                    i6 = i3;
                    num13 = num4;
                    num14 = num2;
                    baseballInningInfo2 = baseballInningInfo;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        BaseballInningInfo baseballInningInfo3 = baseballInningInfo2;
        int i28 = i6;
        String str20 = str7;
        Integer num38 = num7;
        String str21 = str5;
        b.c(serialDescriptor);
        List list3 = list;
        return new Comment(i28, 0, str3, str4, str21, str6, num15, bool3, player, player2, player3, i5, num16, num17, num18, num19, str20, num20, num21, num13, num14, bool2, num10, num11, num9, num8, num38, baseballInningInfo3, bool, baseballActionOutcome, list3, list2, z2, num12, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Comment value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Comment.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
