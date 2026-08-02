package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.c88;
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
import defpackage.z8e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyPlayer.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyPlayer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyPlayer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyPlayer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyPlayer$$serializer implements iw8 {

    @NotNull
    public static final FantasyPlayer$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyPlayer$$serializer fantasyPlayer$$serializer = new FantasyPlayer$$serializer();
        INSTANCE = fantasyPlayer$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyPlayer", fantasyPlayer$$serializer, 19);
        uyeVar.j("id", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("position", false);
        uyeVar.j("price", false);
        uyeVar.j("averageScore", false);
        uyeVar.j("averageScoreRank", false);
        uyeVar.j("form", false);
        uyeVar.j("formRank", false);
        uyeVar.j("totalScore", false);
        uyeVar.j("totalScoreRank", false);
        uyeVar.j("ownedPercentage", false);
        uyeVar.j("ownedRank", false);
        uyeVar.j("ownedCount", false);
        uyeVar.j("totalPlayersOnPosition", false);
        uyeVar.j("team", false);
        uyeVar.j("goals", false);
        uyeVar.j("assists", false);
        uyeVar.j("averageRating", false);
        uyeVar.j("averageRatingRank", false);
        descriptor = uyeVar;
    }

    private FantasyPlayer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FantasyPlayer.$childSerializers;
        a7a a7aVar = a7a.a;
        c88 c88Var = c88.a;
        return new KSerializer[]{a7aVar, Player$$serializer.INSTANCE, uhi.a, l98.W(c88Var), l98.W(c88Var), l98.W(a7aVar), l98.W(c88Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(c88Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), joaVarArr[14].getValue(), l98.W(a7aVar), l98.W(a7aVar), l98.W(c88Var), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyPlayer deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Integer num;
        Float f;
        int i;
        Integer num2;
        Integer num3;
        Float f2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FantasyPlayer.$childSerializers;
        Integer num4 = null;
        Float f3 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        int i2 = 0;
        Integer num9 = null;
        Integer num10 = null;
        Team team = null;
        Integer num11 = null;
        Float f4 = null;
        Integer num12 = null;
        Float f5 = null;
        boolean z = true;
        int i3 = 0;
        String str = null;
        Player player = null;
        Float f6 = null;
        Float f7 = null;
        Integer num13 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num2 = num4;
                    num3 = num8;
                    f2 = f5;
                    z = false;
                    f5 = f2;
                    num8 = num3;
                    num4 = num2;
                case 0:
                    num2 = num4;
                    num3 = num8;
                    f2 = f5;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    f5 = f2;
                    num8 = num3;
                    num4 = num2;
                case 1:
                    num2 = num4;
                    num3 = num8;
                    f2 = f5;
                    player = (Player) b.w(serialDescriptor, 1, Player$$serializer.INSTANCE, player);
                    i2 |= 2;
                    f6 = f6;
                    f5 = f2;
                    num8 = num3;
                    num4 = num2;
                case 2:
                    num2 = num4;
                    num3 = num8;
                    str = b.n(serialDescriptor, 2);
                    i2 |= 4;
                    num8 = num3;
                    num4 = num2;
                case 3:
                    num2 = num4;
                    num3 = num8;
                    f2 = f5;
                    f6 = (Float) b.i(serialDescriptor, 3, c88.a, f6);
                    i2 |= 8;
                    f5 = f2;
                    num8 = num3;
                    num4 = num2;
                case 4:
                    num2 = num4;
                    num3 = num8;
                    f2 = f5;
                    f7 = (Float) b.i(serialDescriptor, 4, c88.a, f7);
                    i2 |= 16;
                    f5 = f2;
                    num8 = num3;
                    num4 = num2;
                case 5:
                    num2 = num4;
                    num3 = num8;
                    f2 = f5;
                    num13 = (Integer) b.i(serialDescriptor, 5, a7a.a, num13);
                    i2 |= 32;
                    f5 = f2;
                    num8 = num3;
                    num4 = num2;
                case 6:
                    num2 = num4;
                    num3 = num8;
                    f5 = (Float) b.i(serialDescriptor, 6, c88.a, f5);
                    i2 |= 64;
                    num8 = num3;
                    num4 = num2;
                case 7:
                    num2 = num4;
                    num8 = (Integer) b.i(serialDescriptor, 7, a7a.a, num8);
                    i2 |= 128;
                    f5 = f5;
                    num4 = num2;
                case 8:
                    num = num8;
                    f = f5;
                    num6 = (Integer) b.i(serialDescriptor, 8, a7a.a, num6);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    f5 = f;
                    num8 = num;
                case 9:
                    num = num8;
                    f = f5;
                    num5 = (Integer) b.i(serialDescriptor, 9, a7a.a, num5);
                    i2 |= 512;
                    f5 = f;
                    num8 = num;
                case 10:
                    num = num8;
                    f = f5;
                    f3 = (Float) b.i(serialDescriptor, 10, c88.a, f3);
                    i2 |= 1024;
                    f5 = f;
                    num8 = num;
                case 11:
                    num = num8;
                    f = f5;
                    num4 = (Integer) b.i(serialDescriptor, 11, a7a.a, num4);
                    i2 |= a.o;
                    f5 = f;
                    num8 = num;
                case 12:
                    num = num8;
                    f = f5;
                    num7 = (Integer) b.i(serialDescriptor, 12, a7a.a, num7);
                    i2 |= 4096;
                    f5 = f;
                    num8 = num;
                case 13:
                    num = num8;
                    f = f5;
                    num9 = (Integer) b.i(serialDescriptor, 13, a7a.a, num9);
                    i2 |= 8192;
                    f5 = f;
                    num8 = num;
                case 14:
                    num = num8;
                    f = f5;
                    team = (Team) b.w(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), team);
                    i2 |= 16384;
                    f5 = f;
                    num8 = num;
                case 15:
                    num = num8;
                    f = f5;
                    num10 = (Integer) b.i(serialDescriptor, 15, a7a.a, num10);
                    i = 32768;
                    i2 |= i;
                    f5 = f;
                    num8 = num;
                case 16:
                    num = num8;
                    f = f5;
                    num11 = (Integer) b.i(serialDescriptor, 16, a7a.a, num11);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    f5 = f;
                    num8 = num;
                case 17:
                    num = num8;
                    f = f5;
                    f4 = (Float) b.i(serialDescriptor, 17, c88.a, f4);
                    i = 131072;
                    i2 |= i;
                    f5 = f;
                    num8 = num;
                case 18:
                    f = f5;
                    num = num8;
                    num12 = (Integer) b.i(serialDescriptor, 18, a7a.a, num12);
                    i = 262144;
                    i2 |= i;
                    f5 = f;
                    num8 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num14 = num8;
        Float f8 = f5;
        Player player2 = player;
        Float f9 = f6;
        b.c(serialDescriptor);
        Float f10 = f4;
        return new FantasyPlayer(i2, i3, player2, str, f9, f7, num13, f8, num14, num6, num5, f3, num4, num7, num9, team, num10, num11, f10, num12, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyPlayer value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyPlayer.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
