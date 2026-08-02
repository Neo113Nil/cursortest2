package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.c88;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyUserLeague.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyUserLeague;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyUserLeague;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyUserLeague;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyUserLeague$$serializer implements iw8 {

    @NotNull
    public static final FantasyUserLeague$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyUserLeague$$serializer fantasyUserLeague$$serializer = new FantasyUserLeague$$serializer();
        INSTANCE = fantasyUserLeague$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyUserLeague", fantasyUserLeague$$serializer, 17);
        uyeVar.j("league", false);
        uyeVar.j("rank", false);
        uyeVar.j("totalScore", false);
        uyeVar.j("joinedInRoundId", false);
        uyeVar.j("previousRank", false);
        uyeVar.j("userId", false);
        uyeVar.j("userName", false);
        uyeVar.j("userImageUrl", false);
        uyeVar.j("teamName", false);
        uyeVar.j("recalculatedAt", false);
        uyeVar.j("roundId", false);
        uyeVar.j("currentScore", false);
        uyeVar.j("wins", false);
        uyeVar.j("draws", false);
        uyeVar.j("losses", false);
        uyeVar.j("points", false);
        uyeVar.j("scoreAgainst", false);
        descriptor = uyeVar;
    }

    private FantasyUserLeague$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(FantasyLeague$$serializer.INSTANCE);
        a7a a7aVar = a7a.a;
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, W2, W3, a7aVar, W4, uhiVar, uhiVar, l98.W(uhiVar), uhiVar, lkb.a, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(c88.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyUserLeague deserialize(@NotNull Decoder decoder) {
        FantasyLeague fantasyLeague;
        String str;
        int i;
        Integer num;
        String str2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        long j = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str3 = null;
        Integer num6 = null;
        int i2 = 0;
        FantasyLeague fantasyLeague2 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Float f = null;
        String str4 = null;
        String str5 = null;
        boolean z = true;
        int i3 = 0;
        String str6 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num2;
                    str2 = str4;
                    z = false;
                    str4 = str2;
                    num2 = num;
                case 0:
                    str2 = str4;
                    num = num2;
                    fantasyLeague2 = (FantasyLeague) b.i(serialDescriptor, 0, FantasyLeague$$serializer.INSTANCE, fantasyLeague2);
                    i2 |= 1;
                    str4 = str2;
                    num2 = num;
                case 1:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num7 = (Integer) b.i(serialDescriptor, 1, a7a.a, num7);
                    i2 |= 2;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 2:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num8 = (Integer) b.i(serialDescriptor, 2, a7a.a, num8);
                    i2 |= 4;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 3:
                    fantasyLeague = fantasyLeague2;
                    i3 = b.l(serialDescriptor, 3);
                    i2 |= 8;
                    fantasyLeague2 = fantasyLeague;
                case 4:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num10 = (Integer) b.i(serialDescriptor, 4, a7a.a, num10);
                    i2 |= 16;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 5:
                    fantasyLeague = fantasyLeague2;
                    str6 = b.n(serialDescriptor, 5);
                    i2 |= 32;
                    fantasyLeague2 = fantasyLeague;
                case 6:
                    fantasyLeague = fantasyLeague2;
                    str4 = b.n(serialDescriptor, 6);
                    i2 |= 64;
                    fantasyLeague2 = fantasyLeague;
                case 7:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    str3 = (String) b.i(serialDescriptor, 7, uhi.a, str3);
                    i2 |= 128;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 8:
                    fantasyLeague = fantasyLeague2;
                    str5 = b.n(serialDescriptor, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    fantasyLeague2 = fantasyLeague;
                case 9:
                    fantasyLeague = fantasyLeague2;
                    j = b.g(serialDescriptor, 9);
                    i2 |= 512;
                    fantasyLeague2 = fantasyLeague;
                case 10:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num6 = (Integer) b.i(serialDescriptor, 10, a7a.a, num6);
                    i2 |= 1024;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 11:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num4 = (Integer) b.i(serialDescriptor, 11, a7a.a, num4);
                    i2 |= a.o;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 12:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num3 = (Integer) b.i(serialDescriptor, 12, a7a.a, num3);
                    i2 |= 4096;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 13:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num2 = (Integer) b.i(serialDescriptor, 13, a7a.a, num2);
                    i2 |= 8192;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 14:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num5 = (Integer) b.i(serialDescriptor, 14, a7a.a, num5);
                    i2 |= 16384;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 15:
                    fantasyLeague = fantasyLeague2;
                    str = str4;
                    num9 = (Integer) b.i(serialDescriptor, 15, a7a.a, num9);
                    i = 32768;
                    i2 |= i;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                case 16:
                    str = str4;
                    fantasyLeague = fantasyLeague2;
                    f = (Float) b.i(serialDescriptor, 16, c88.a, f);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    str4 = str;
                    fantasyLeague2 = fantasyLeague;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str7 = str4;
        b.c(serialDescriptor);
        return new FantasyUserLeague(i2, fantasyLeague2, num7, num8, i3, num10, str6, str7, str3, str5, j, num6, num4, num3, num2, num5, num9, f, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyUserLeague value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyUserLeague.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
