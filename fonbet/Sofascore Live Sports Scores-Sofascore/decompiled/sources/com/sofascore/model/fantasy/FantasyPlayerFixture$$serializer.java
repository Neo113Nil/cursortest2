package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.c88;
import defpackage.h75;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyPlayerFixture.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyPlayerFixture;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyPlayerFixture;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyPlayerFixture;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyPlayerFixture$$serializer implements iw8 {

    @NotNull
    public static final FantasyPlayerFixture$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyPlayerFixture$$serializer fantasyPlayerFixture$$serializer = new FantasyPlayerFixture$$serializer();
        INSTANCE = fantasyPlayerFixture$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyPlayerFixture", fantasyPlayerFixture$$serializer, 20);
        uyeVar.j("locationType", false);
        uyeVar.j("team", false);
        uyeVar.j("eventId", false);
        uyeVar.j("homeTeamId", false);
        uyeVar.j("awayTeamId", false);
        uyeVar.j("missingType", false);
        uyeVar.j("missingReason", false);
        uyeVar.j("missingDescription", false);
        uyeVar.j("playerFixtureStatus", false);
        uyeVar.j("eventStartTimestamp", false);
        uyeVar.j("eventStatusType", false);
        uyeVar.j("fixtureDifficulty", false);
        uyeVar.j("winnerCode", false);
        uyeVar.j("playerTeamSide", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("fantasyRound", false);
        uyeVar.j("score", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("expectedPoints", false);
        descriptor = uyeVar;
    }

    private FantasyPlayerFixture$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        a7a a7aVar = a7a.a;
        return new KSerializer[]{uhiVar, BasicTeam$$serializer.INSTANCE, a7aVar, l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(uhiVar), lkb.a, uhiVar, l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(FantasyRound$$serializer.INSTANCE), l98.W(a7aVar), l98.W(h75.a), l98.W(c88.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyPlayerFixture deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        int i;
        Integer num2;
        String str2;
        Integer num3;
        String str3;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        long j = 0;
        Integer num4 = null;
        Integer num5 = null;
        String str5 = null;
        Integer num6 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        Integer num7 = null;
        Integer num8 = null;
        FantasyRound fantasyRound = null;
        Double d = null;
        Float f = null;
        String str8 = null;
        Integer num9 = null;
        boolean z = true;
        String str9 = null;
        String str10 = null;
        int i3 = 0;
        BasicTeam basicTeam = null;
        Integer num10 = null;
        Integer num11 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num2 = num4;
                    str2 = str8;
                    num3 = num9;
                    z = false;
                    str8 = str2;
                    num9 = num3;
                    num4 = num2;
                case 0:
                    num2 = num4;
                    str2 = str8;
                    num3 = num9;
                    str10 = b.n(serialDescriptor, 0);
                    i2 |= 1;
                    str8 = str2;
                    num9 = num3;
                    num4 = num2;
                case 1:
                    num2 = num4;
                    str2 = str8;
                    num3 = num9;
                    basicTeam = (BasicTeam) b.w(serialDescriptor, 1, BasicTeam$$serializer.INSTANCE, basicTeam);
                    i2 |= 2;
                    num10 = num10;
                    str8 = str2;
                    num9 = num3;
                    num4 = num2;
                case 2:
                    num2 = num4;
                    str3 = str8;
                    i3 = b.l(serialDescriptor, 2);
                    i2 |= 4;
                    str8 = str3;
                    num4 = num2;
                case 3:
                    num2 = num4;
                    str2 = str8;
                    num3 = num9;
                    num10 = (Integer) b.i(serialDescriptor, 3, a7a.a, num10);
                    i2 |= 8;
                    str8 = str2;
                    num9 = num3;
                    num4 = num2;
                case 4:
                    num2 = num4;
                    num3 = num9;
                    str2 = str8;
                    num11 = (Integer) b.i(serialDescriptor, 4, a7a.a, num11);
                    i2 |= 16;
                    str8 = str2;
                    num9 = num3;
                    num4 = num2;
                case 5:
                    num2 = num4;
                    num3 = num9;
                    str8 = (String) b.i(serialDescriptor, 5, uhi.a, str8);
                    i2 |= 32;
                    num9 = num3;
                    num4 = num2;
                case 6:
                    str3 = str8;
                    num2 = num4;
                    num9 = (Integer) b.i(serialDescriptor, 6, a7a.a, num9);
                    i2 |= 64;
                    str8 = str3;
                    num4 = num2;
                case 7:
                    str = str8;
                    num = num9;
                    str6 = (String) b.i(serialDescriptor, 7, uhi.a, str6);
                    i2 |= 128;
                    str8 = str;
                    num9 = num;
                case 8:
                    str = str8;
                    num = num9;
                    str7 = (String) b.i(serialDescriptor, 8, uhi.a, str7);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str8 = str;
                    num9 = num;
                case 9:
                    str4 = str8;
                    j = b.g(serialDescriptor, 9);
                    i2 |= 512;
                    str8 = str4;
                case 10:
                    str4 = str8;
                    str9 = b.n(serialDescriptor, 10);
                    i2 |= 1024;
                    str8 = str4;
                case 11:
                    str = str8;
                    num = num9;
                    str5 = (String) b.i(serialDescriptor, 11, uhi.a, str5);
                    i2 |= a.o;
                    str8 = str;
                    num9 = num;
                case 12:
                    str = str8;
                    num = num9;
                    num5 = (Integer) b.i(serialDescriptor, 12, a7a.a, num5);
                    i2 |= 4096;
                    str8 = str;
                    num9 = num;
                case 13:
                    str = str8;
                    num = num9;
                    num4 = (Integer) b.i(serialDescriptor, 13, a7a.a, num4);
                    i2 |= 8192;
                    str8 = str;
                    num9 = num;
                case 14:
                    str = str8;
                    num = num9;
                    num6 = (Integer) b.i(serialDescriptor, 14, a7a.a, num6);
                    i2 |= 16384;
                    str8 = str;
                    num9 = num;
                case 15:
                    str = str8;
                    num = num9;
                    num7 = (Integer) b.i(serialDescriptor, 15, a7a.a, num7);
                    i = 32768;
                    i2 |= i;
                    str8 = str;
                    num9 = num;
                case 16:
                    str = str8;
                    num = num9;
                    fantasyRound = (FantasyRound) b.i(serialDescriptor, 16, FantasyRound$$serializer.INSTANCE, fantasyRound);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    str8 = str;
                    num9 = num;
                case 17:
                    str = str8;
                    num = num9;
                    num8 = (Integer) b.i(serialDescriptor, 17, a7a.a, num8);
                    i = 131072;
                    i2 |= i;
                    str8 = str;
                    num9 = num;
                case 18:
                    str = str8;
                    num = num9;
                    d = (Double) b.i(serialDescriptor, 18, h75.a, d);
                    i = 262144;
                    i2 |= i;
                    str8 = str;
                    num9 = num;
                case 19:
                    str = str8;
                    num = num9;
                    f = (Float) b.i(serialDescriptor, 19, c88.a, f);
                    i = 524288;
                    i2 |= i;
                    str8 = str;
                    num9 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str11 = str8;
        Integer num12 = num9;
        BasicTeam basicTeam2 = basicTeam;
        Integer num13 = num10;
        b.c(serialDescriptor);
        Float f2 = f;
        return new FantasyPlayerFixture(i2, str10, basicTeam2, i3, num13, num11, str11, num12, str6, str7, j, str9, str5, num5, num4, num6, num7, fantasyRound, num8, d, f2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyPlayerFixture value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyPlayerFixture.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
