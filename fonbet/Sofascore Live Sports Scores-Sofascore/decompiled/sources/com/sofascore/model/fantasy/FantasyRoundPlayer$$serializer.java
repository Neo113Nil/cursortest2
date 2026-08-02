package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4227o2;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.t5h;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyRoundPlayer.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyRoundPlayer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyRoundPlayer$$serializer implements iw8 {

    @NotNull
    public static final FantasyRoundPlayer$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyRoundPlayer$$serializer fantasyRoundPlayer$$serializer = new FantasyRoundPlayer$$serializer();
        INSTANCE = fantasyRoundPlayer$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyRoundPlayer", fantasyRoundPlayer$$serializer, 17);
        uyeVar.j("id", false);
        uyeVar.j("fantasyPlayer", false);
        uyeVar.j("team", false);
        uyeVar.j("fixtures", false);
        uyeVar.j("priceHistory", false);
        uyeVar.j("price", false);
        uyeVar.j(C4227o2.u, true);
        uyeVar.j("score", false);
        uyeVar.j("lockedFrom", false);
        uyeVar.j("expectedPoints", false);
        uyeVar.j("expectedPointsRank", false);
        uyeVar.j("goalProbability", false);
        uyeVar.j("assistProbability", false);
        uyeVar.j("cleanSheetProbability", false);
        uyeVar.j("substitute", true);
        uyeVar.j("captain", true);
        uyeVar.j("isLive", true);
        descriptor = uyeVar;
    }

    private FantasyRoundPlayer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FantasyRoundPlayer.$childSerializers;
        a7a a7aVar = a7a.a;
        c88 c88Var = c88.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, FantasyPlayer$$serializer.INSTANCE, joaVarArr[2].getValue(), l98.W((KSerializer) joaVarArr[3].getValue()), l98.W((KSerializer) joaVarArr[4].getValue()), l98.W(c88Var), a7aVar, l98.W(a7aVar), l98.W(lkb.a), l98.W(c88Var), l98.W(a7aVar), l98.W(c88Var), l98.W(c88Var), l98.W(c88Var), gz1Var, gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyRoundPlayer deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Float f;
        int i;
        FantasyPlayer fantasyPlayer;
        int i2;
        FantasyPlayer fantasyPlayer2;
        int i3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FantasyRoundPlayer.$childSerializers;
        Float f2 = null;
        Integer num = null;
        Float f3 = null;
        Long l = null;
        Float f4 = null;
        Integer num2 = null;
        int i4 = 0;
        Float f5 = null;
        FantasyPlayer fantasyPlayer3 = null;
        Team team = null;
        List list = null;
        Map map = null;
        Float f6 = null;
        int i5 = 0;
        boolean z = true;
        int i6 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    f = f2;
                    i = i5;
                    fantasyPlayer = fantasyPlayer3;
                    z = false;
                    fantasyPlayer3 = fantasyPlayer;
                    f2 = f;
                    i5 = i;
                case 0:
                    f = f2;
                    i = i5;
                    fantasyPlayer = fantasyPlayer3;
                    i6 = b.l(serialDescriptor, 0);
                    i4 |= 1;
                    fantasyPlayer3 = fantasyPlayer;
                    f2 = f;
                    i5 = i;
                case 1:
                    i = i5;
                    f = f2;
                    fantasyPlayer3 = (FantasyPlayer) b.w(serialDescriptor, 1, FantasyPlayer$$serializer.INSTANCE, fantasyPlayer3);
                    i4 |= 2;
                    f2 = f;
                    i5 = i;
                case 2:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    team = (Team) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), team);
                    i4 |= 4;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 3:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    list = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list);
                    i4 |= 8;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 4:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    map = (Map) b.i(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), map);
                    i4 |= 16;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 5:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    f6 = (Float) b.i(serialDescriptor, 5, c88.a, f6);
                    i4 |= 32;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 6:
                    fantasyPlayer2 = fantasyPlayer3;
                    i5 = b.l(serialDescriptor, 6);
                    i4 |= 64;
                    fantasyPlayer3 = fantasyPlayer2;
                case 7:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    num2 = (Integer) b.i(serialDescriptor, 7, a7a.a, num2);
                    i4 |= 128;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 8:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    l = (Long) b.i(serialDescriptor, 8, lkb.a, l);
                    i4 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 9:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    f3 = (Float) b.i(serialDescriptor, 9, c88.a, f3);
                    i4 |= 512;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 10:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    num = (Integer) b.i(serialDescriptor, 10, a7a.a, num);
                    i4 |= 1024;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 11:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    f2 = (Float) b.i(serialDescriptor, 11, c88.a, f2);
                    i4 |= a.o;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 12:
                    fantasyPlayer2 = fantasyPlayer3;
                    i3 = i5;
                    f4 = (Float) b.i(serialDescriptor, 12, c88.a, f4);
                    i4 |= 4096;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 13:
                    i3 = i5;
                    fantasyPlayer2 = fantasyPlayer3;
                    f5 = (Float) b.i(serialDescriptor, 13, c88.a, f5);
                    i4 |= 8192;
                    i5 = i3;
                    fantasyPlayer3 = fantasyPlayer2;
                case 14:
                    i = i5;
                    z2 = b.B(serialDescriptor, 14);
                    i4 |= 16384;
                    i5 = i;
                case 15:
                    i = i5;
                    z3 = b.B(serialDescriptor, 15);
                    i2 = 32768;
                    i4 |= i2;
                    i5 = i;
                case 16:
                    i = i5;
                    z4 = b.B(serialDescriptor, 16);
                    i2 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i4 |= i2;
                    i5 = i;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        int i7 = i5;
        FantasyPlayer fantasyPlayer4 = fantasyPlayer3;
        b.c(serialDescriptor);
        return new FantasyRoundPlayer(i4, i6, fantasyPlayer4, team, list, map, f6, i7, num2, l, f3, num, f2, f4, f5, z2, z3, z4, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyRoundPlayer value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyRoundPlayer.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
