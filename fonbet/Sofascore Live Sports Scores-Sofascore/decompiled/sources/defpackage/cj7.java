package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4227o2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo;
import com.sofascore.results.fantasy.ui.model.BasicTournamentInfo;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cj7 implements iw8 {
    public static final cj7 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        cj7 cj7Var = new cj7();
        a = cj7Var;
        uye uyeVar = new uye("com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel", cj7Var, 29);
        uyeVar.j("id", false);
        uyeVar.j("position", false);
        uyeVar.j("state", false);
        uyeVar.j(C4227o2.u, false);
        uyeVar.j("isDisabled", true);
        uyeVar.j("roundPlayerId", false);
        uyeVar.j("fantasyPlayer", false);
        uyeVar.j("teamId", false);
        uyeVar.j("teamName", false);
        uyeVar.j("teamNameCode", false);
        uyeVar.j("isSubstitute", false);
        uyeVar.j("missingData", false);
        uyeVar.j("isCaptain", false);
        uyeVar.j("pointsValue", false);
        uyeVar.j("price", false);
        uyeVar.j("priceValue", false);
        uyeVar.j("expectedPoints", false);
        uyeVar.j("expectedPointsRank", false);
        uyeVar.j("goalProbability", false);
        uyeVar.j("assistProbability", false);
        uyeVar.j("cleanSheetProbability", false);
        uyeVar.j("isLocked", false);
        uyeVar.j("isLive", false);
        uyeVar.j("fixtures", true);
        uyeVar.j("fixtureInfos", true);
        uyeVar.j("hasFixturesToPlay", true);
        uyeVar.j("priceHistory", false);
        uyeVar.j("tournamentInfo", true);
        uyeVar.j("info", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = FantasyRoundPlayerUiModel.D;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        uhi uhiVar = uhi.a;
        c88 c88Var = c88.a;
        return new KSerializer[]{a7aVar, joaVarArr[1].getValue(), l98.W((KSerializer) joaVarArr[2].getValue()), a7aVar, gz1Var, a7aVar, ie7.a, a7aVar, uhiVar, uhiVar, gz1Var, l98.W(pd7.a), gz1Var, l98.W(a7aVar), uhiVar, l98.W(c88Var), l98.W(c88Var), l98.W(a7aVar), l98.W(c88Var), l98.W(c88Var), l98.W(c88Var), gz1Var, gz1Var, joaVarArr[23].getValue(), joaVarArr[24].getValue(), gz1Var, l98.W((KSerializer) joaVarArr[26].getValue()), l98.W(rp1.a), aj7.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        Integer num;
        Integer num2;
        FantasyPlayerMissingData fantasyPlayerMissingData;
        int i;
        FantasyPlayerMissingData fantasyPlayerMissingData2;
        int i2;
        int i3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyRoundPlayerUiModel.D;
        Integer num3 = null;
        Float f = null;
        Float f2 = null;
        Integer num4 = null;
        Float f3 = null;
        FantasyPlayerMissingData fantasyPlayerMissingData3 = null;
        int i4 = 0;
        Float f4 = null;
        List list = null;
        BasicTournamentInfo basicTournamentInfo = null;
        Float f5 = null;
        List list2 = null;
        Map map = null;
        FantasyRoundPlayerInfo fantasyRoundPlayerInfo = null;
        int i5 = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
        int i6 = 1;
        boolean z2 = false;
        String str3 = null;
        boolean z3 = true;
        int i7 = 0;
        int i8 = 0;
        boolean z4 = false;
        int i9 = 0;
        rz6 rz6Var = null;
        boolean z5 = false;
        boolean z6 = false;
        yy6 yy6Var = null;
        FantasyPlayerUiModel fantasyPlayerUiModel = null;
        boolean z7 = false;
        while (z3) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData = fantasyPlayerMissingData3;
                    i = i6;
                    Unit unit = Unit.a;
                    z3 = false;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 0:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData = fantasyPlayerMissingData3;
                    i = i6;
                    rz6 rz6Var2 = rz6Var;
                    i7 = b.l(serialDescriptor, 0);
                    i4 |= 1;
                    Unit unit2 = Unit.a;
                    rz6Var = rz6Var2;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 1:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    dy4 dy4Var = (dy4) joaVarArr[i6].getValue();
                    i = i6;
                    rz6 rz6Var3 = (rz6) b.w(serialDescriptor, i, dy4Var, rz6Var);
                    i4 |= 2;
                    Unit unit3 = Unit.a;
                    rz6Var = rz6Var3;
                    yy6Var = yy6Var;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 2:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    yy6 yy6Var2 = (yy6) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), yy6Var);
                    i4 |= 4;
                    Unit unit4 = Unit.a;
                    yy6Var = yy6Var2;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 3:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    int l = b.l(serialDescriptor, 3);
                    i4 |= 8;
                    Unit unit5 = Unit.a;
                    i8 = l;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 4:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    boolean B = b.B(serialDescriptor, 4);
                    i4 |= 16;
                    Unit unit6 = Unit.a;
                    z4 = B;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 5:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    int l2 = b.l(serialDescriptor, 5);
                    i4 |= 32;
                    Unit unit7 = Unit.a;
                    i9 = l2;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 6:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    FantasyPlayerUiModel fantasyPlayerUiModel2 = (FantasyPlayerUiModel) b.w(serialDescriptor, 6, ie7.a, fantasyPlayerUiModel);
                    i4 |= 64;
                    Unit unit8 = Unit.a;
                    fantasyPlayerUiModel = fantasyPlayerUiModel2;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 7:
                    num = num3;
                    num2 = num4;
                    i5 = b.l(serialDescriptor, 7);
                    i4 |= 128;
                    Unit unit9 = Unit.a;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 8:
                    num = num3;
                    num2 = num4;
                    str = b.n(serialDescriptor, 8);
                    i4 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit92 = Unit.a;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 9:
                    num = num3;
                    num2 = num4;
                    str2 = b.n(serialDescriptor, 9);
                    i4 |= 512;
                    Unit unit922 = Unit.a;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 10:
                    num = num3;
                    num2 = num4;
                    z = b.B(serialDescriptor, 10);
                    i4 |= 1024;
                    Unit unit9222 = Unit.a;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 11:
                    num = num3;
                    num2 = num4;
                    fantasyPlayerMissingData3 = (FantasyPlayerMissingData) b.i(serialDescriptor, 11, pd7.a, fantasyPlayerMissingData3);
                    i4 |= a.o;
                    Unit unit10 = Unit.a;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 12:
                    num = num3;
                    Integer num5 = num4;
                    z2 = b.B(serialDescriptor, 12);
                    i4 |= 4096;
                    Unit unit11 = Unit.a;
                    num2 = num5;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 13:
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    num = num3;
                    Integer num6 = (Integer) b.i(serialDescriptor, 13, a7a.a, num4);
                    i4 |= 8192;
                    Unit unit12 = Unit.a;
                    num2 = num6;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 14:
                    num2 = num4;
                    str3 = b.n(serialDescriptor, 14);
                    i4 |= 16384;
                    Unit unit13 = Unit.a;
                    num = num3;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 15:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    f2 = (Float) b.i(serialDescriptor, 15, c88.a, f2);
                    i2 = 32768;
                    i4 |= i2;
                    Unit unit14 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 16:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    f = (Float) b.i(serialDescriptor, 16, c88.a, f);
                    i2 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i4 |= i2;
                    Unit unit142 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 17:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    num3 = (Integer) b.i(serialDescriptor, 17, a7a.a, num3);
                    i2 = 131072;
                    i4 |= i2;
                    Unit unit1422 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 18:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    f3 = (Float) b.i(serialDescriptor, 18, c88.a, f3);
                    i2 = 262144;
                    i4 |= i2;
                    Unit unit14222 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 19:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    f4 = (Float) b.i(serialDescriptor, 19, c88.a, f4);
                    i2 = 524288;
                    i4 |= i2;
                    Unit unit142222 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 20:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    f5 = (Float) b.i(serialDescriptor, 20, c88.a, f5);
                    i2 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i4 |= i2;
                    Unit unit1422222 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 21:
                    num2 = num4;
                    z5 = b.B(serialDescriptor, 21);
                    i3 = 2097152;
                    i4 |= i3;
                    Unit unit132 = Unit.a;
                    num = num3;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 22:
                    num2 = num4;
                    z6 = b.B(serialDescriptor, 22);
                    i3 = 4194304;
                    i4 |= i3;
                    Unit unit1322 = Unit.a;
                    num = num3;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 23:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    list2 = (List) b.w(serialDescriptor, 23, (dy4) joaVarArr[23].getValue(), list2);
                    i2 = 8388608;
                    i4 |= i2;
                    Unit unit14222222 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 24:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    map = (Map) b.w(serialDescriptor, 24, (dy4) joaVarArr[24].getValue(), map);
                    i2 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i4 |= i2;
                    Unit unit142222222 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 25:
                    num2 = num4;
                    z7 = b.B(serialDescriptor, 25);
                    i3 = 33554432;
                    i4 |= i3;
                    Unit unit13222 = Unit.a;
                    num = num3;
                    i = i6;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 26:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    list = (List) b.i(serialDescriptor, 26, (dy4) joaVarArr[26].getValue(), list);
                    i2 = 67108864;
                    i4 |= i2;
                    Unit unit1422222222 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 27:
                    num2 = num4;
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    basicTournamentInfo = (BasicTournamentInfo) b.i(serialDescriptor, 27, rp1.a, basicTournamentInfo);
                    i2 = 134217728;
                    i4 |= i2;
                    Unit unit14222222222 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                case 28:
                    fantasyPlayerMissingData2 = fantasyPlayerMissingData3;
                    num2 = num4;
                    fantasyRoundPlayerInfo = (FantasyRoundPlayerInfo) b.w(serialDescriptor, 28, aj7.a, fantasyRoundPlayerInfo);
                    i2 = 268435456;
                    i4 |= i2;
                    Unit unit142222222222 = Unit.a;
                    num = num3;
                    i = i6;
                    fantasyPlayerMissingData3 = fantasyPlayerMissingData2;
                    i6 = i;
                    num4 = num2;
                    num3 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num7 = num4;
        FantasyPlayerMissingData fantasyPlayerMissingData4 = fantasyPlayerMissingData3;
        rz6 rz6Var4 = rz6Var;
        yy6 yy6Var3 = yy6Var;
        b.c(serialDescriptor);
        FantasyRoundPlayerInfo fantasyRoundPlayerInfo2 = fantasyRoundPlayerInfo;
        FantasyPlayerUiModel fantasyPlayerUiModel3 = fantasyPlayerUiModel;
        Map map2 = map;
        return new FantasyRoundPlayerUiModel(i4, i7, rz6Var4, yy6Var3, i8, z4, i9, fantasyPlayerUiModel3, i5, str, str2, z, fantasyPlayerMissingData4, z2, num7, str3, f2, f, num3, f3, f4, f5, z5, z6, list2, map2, z7, list, basicTournamentInfo, fantasyRoundPlayerInfo2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fe, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r4, r1) == false) goto L18;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
        encoder.getClass();
        fantasyRoundPlayerUiModel.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyRoundPlayerUiModel.D;
        int i = fantasyRoundPlayerUiModel.a;
        BasicTournamentInfo basicTournamentInfo = fantasyRoundPlayerUiModel.B;
        boolean z = fantasyRoundPlayerUiModel.z;
        Map map = fantasyRoundPlayerUiModel.y;
        List list = fantasyRoundPlayerUiModel.x;
        boolean z2 = fantasyRoundPlayerUiModel.e;
        b.u(0, i, serialDescriptor);
        b.f(serialDescriptor, 1, (KSerializer) joaVarArr[1].getValue(), fantasyRoundPlayerUiModel.b);
        b.h(serialDescriptor, 2, (KSerializer) joaVarArr[2].getValue(), fantasyRoundPlayerUiModel.c);
        b.u(3, fantasyRoundPlayerUiModel.d, serialDescriptor);
        if (b.o(serialDescriptor) || z2) {
            b.x(serialDescriptor, 4, z2);
        }
        b.u(5, fantasyRoundPlayerUiModel.f, serialDescriptor);
        b.f(serialDescriptor, 6, ie7.a, fantasyRoundPlayerUiModel.g);
        b.u(7, fantasyRoundPlayerUiModel.h, serialDescriptor);
        b.y(serialDescriptor, 8, fantasyRoundPlayerUiModel.i);
        b.y(serialDescriptor, 9, fantasyRoundPlayerUiModel.j);
        b.x(serialDescriptor, 10, fantasyRoundPlayerUiModel.k);
        b.h(serialDescriptor, 11, pd7.a, fantasyRoundPlayerUiModel.l);
        b.x(serialDescriptor, 12, fantasyRoundPlayerUiModel.m);
        a7a a7aVar = a7a.a;
        b.h(serialDescriptor, 13, a7aVar, fantasyRoundPlayerUiModel.n);
        b.y(serialDescriptor, 14, fantasyRoundPlayerUiModel.o);
        c88 c88Var = c88.a;
        b.h(serialDescriptor, 15, c88Var, fantasyRoundPlayerUiModel.p);
        b.h(serialDescriptor, 16, c88Var, fantasyRoundPlayerUiModel.q);
        b.h(serialDescriptor, 17, a7aVar, fantasyRoundPlayerUiModel.r);
        b.h(serialDescriptor, 18, c88Var, fantasyRoundPlayerUiModel.s);
        b.h(serialDescriptor, 19, c88Var, fantasyRoundPlayerUiModel.t);
        b.h(serialDescriptor, 20, c88Var, fantasyRoundPlayerUiModel.u);
        b.x(serialDescriptor, 21, fantasyRoundPlayerUiModel.v);
        b.x(serialDescriptor, 22, fantasyRoundPlayerUiModel.w);
        if (b.o(serialDescriptor) || !Intrinsics.c(list, km5.a)) {
            b.f(serialDescriptor, 23, (KSerializer) joaVarArr[23].getValue(), list);
        }
        if (!b.o(serialDescriptor)) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
        }
        b.f(serialDescriptor, 24, (KSerializer) joaVarArr[24].getValue(), map);
        if (b.o(serialDescriptor) || z) {
            b.x(serialDescriptor, 25, z);
        }
        b.h(serialDescriptor, 26, (KSerializer) joaVarArr[26].getValue(), fantasyRoundPlayerUiModel.A);
        if (b.o(serialDescriptor) || basicTournamentInfo != null) {
            b.h(serialDescriptor, 27, rp1.a, basicTournamentInfo);
        }
        b.f(serialDescriptor, 28, aj7.a, fantasyRoundPlayerUiModel.C);
        b.c(serialDescriptor);
    }
}
