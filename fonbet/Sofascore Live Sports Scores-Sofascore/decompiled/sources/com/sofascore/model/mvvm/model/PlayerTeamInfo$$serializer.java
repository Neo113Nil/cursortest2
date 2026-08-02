package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Money;
import com.sofascore.model.Money$$serializer;
import com.sofascore.model.cuptree.CupTreeBlock;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.h75;
import defpackage.iw8;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/PlayerTeamInfo.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/PlayerTeamInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class PlayerTeamInfo$$serializer implements iw8 {

    @NotNull
    public static final PlayerTeamInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PlayerTeamInfo$$serializer playerTeamInfo$$serializer = new PlayerTeamInfo$$serializer();
        INSTANCE = playerTeamInfo$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.PlayerTeamInfo", playerTeamInfo$$serializer, 21);
        uyeVar.j("id", false);
        uyeVar.j("residence", false);
        uyeVar.j("birthplace", false);
        uyeVar.j("height", false);
        uyeVar.j("weight", false);
        uyeVar.j("plays", false);
        uyeVar.j("turnedPro", false);
        uyeVar.j("prizeCurrentRaw", false);
        uyeVar.j("prizeTotalRaw", false);
        uyeVar.j("number", false);
        uyeVar.j("birthDateTimestamp", false);
        uyeVar.j(CupTreeBlock.BLOCK_RESULT_RETIRED, false);
        uyeVar.j("deceased", false);
        uyeVar.j("dateOfDeathTimestamp", false);
        uyeVar.j("nickname", false);
        uyeVar.j("weightClass", false);
        uyeVar.j("fightingStyle", false);
        uyeVar.j("reach", false);
        uyeVar.j("currentUniqueTournamentSinceTimestamp", false);
        uyeVar.j("currentUniqueTournamentUntilTimestamp", false);
        uyeVar.j("underage", true);
        descriptor = uyeVar;
    }

    private PlayerTeamInfo$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        h75 h75Var = h75.a;
        KSerializer W3 = l98.W(h75Var);
        KSerializer W4 = l98.W(h75Var);
        KSerializer W5 = l98.W(uhiVar);
        KSerializer W6 = l98.W(uhiVar);
        Money$$serializer money$$serializer = Money$$serializer.INSTANCE;
        KSerializer W7 = l98.W(money$$serializer);
        KSerializer W8 = l98.W(money$$serializer);
        KSerializer W9 = l98.W(a7aVar);
        lkb lkbVar = lkb.a;
        KSerializer W10 = l98.W(lkbVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, W, W2, W3, W4, W5, W6, W7, W8, W9, W10, l98.W(gz1Var), l98.W(gz1Var), l98.W(lkbVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(h75Var), l98.W(lkbVar), l98.W(lkbVar), gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final PlayerTeamInfo deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        Money money;
        Money money2;
        Money money3;
        Money money4;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Boolean bool2 = null;
        Long l = null;
        Integer num = null;
        Boolean bool3 = null;
        Money money5 = null;
        int i2 = 0;
        Long l2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        Long l3 = null;
        Long l4 = null;
        Money money6 = null;
        boolean z = true;
        int i3 = 0;
        String str4 = null;
        String str5 = null;
        Double d2 = null;
        Double d3 = null;
        String str6 = null;
        String str7 = null;
        boolean z2 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    bool = bool2;
                    money = money5;
                    money2 = money6;
                    z = false;
                    money6 = money2;
                    money5 = money;
                    bool2 = bool;
                case 0:
                    bool = bool2;
                    money = money5;
                    money2 = money6;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    money6 = money2;
                    money5 = money;
                    bool2 = bool;
                case 1:
                    bool = bool2;
                    money = money5;
                    money2 = money6;
                    str4 = (String) b.i(serialDescriptor, 1, uhi.a, str4);
                    i2 |= 2;
                    str5 = str5;
                    money6 = money2;
                    money5 = money;
                    bool2 = bool;
                case 2:
                    bool = bool2;
                    money = money5;
                    money2 = money6;
                    str5 = (String) b.i(serialDescriptor, 2, uhi.a, str5);
                    i2 |= 4;
                    money6 = money2;
                    money5 = money;
                    bool2 = bool;
                case 3:
                    bool = bool2;
                    money = money5;
                    money2 = money6;
                    d2 = (Double) b.i(serialDescriptor, 3, h75.a, d2);
                    i2 |= 8;
                    money6 = money2;
                    money5 = money;
                    bool2 = bool;
                case 4:
                    bool = bool2;
                    money = money5;
                    money2 = money6;
                    d3 = (Double) b.i(serialDescriptor, 4, h75.a, d3);
                    i2 |= 16;
                    money6 = money2;
                    money5 = money;
                    bool2 = bool;
                case 5:
                    bool = bool2;
                    money = money5;
                    money2 = money6;
                    str6 = (String) b.i(serialDescriptor, 5, uhi.a, str6);
                    i2 |= 32;
                    money6 = money2;
                    money5 = money;
                    bool2 = bool;
                case 6:
                    bool = bool2;
                    money = money5;
                    money2 = money6;
                    str7 = (String) b.i(serialDescriptor, 6, uhi.a, str7);
                    i2 |= 64;
                    money6 = money2;
                    money5 = money;
                    bool2 = bool;
                case 7:
                    bool = bool2;
                    money = money5;
                    money6 = (Money) b.i(serialDescriptor, 7, Money$$serializer.INSTANCE, money6);
                    i2 |= 128;
                    money5 = money;
                    bool2 = bool;
                case 8:
                    bool = bool2;
                    money5 = (Money) b.i(serialDescriptor, 8, Money$$serializer.INSTANCE, money5);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    money6 = money6;
                    bool2 = bool;
                case 9:
                    money3 = money5;
                    money4 = money6;
                    num = (Integer) b.i(serialDescriptor, 9, a7a.a, num);
                    i2 |= 512;
                    money6 = money4;
                    money5 = money3;
                case 10:
                    money3 = money5;
                    money4 = money6;
                    l = (Long) b.i(serialDescriptor, 10, lkb.a, l);
                    i2 |= 1024;
                    money6 = money4;
                    money5 = money3;
                case 11:
                    money3 = money5;
                    money4 = money6;
                    bool2 = (Boolean) b.i(serialDescriptor, 11, gz1.a, bool2);
                    i2 |= a.o;
                    money6 = money4;
                    money5 = money3;
                case 12:
                    money3 = money5;
                    money4 = money6;
                    bool3 = (Boolean) b.i(serialDescriptor, 12, gz1.a, bool3);
                    i2 |= 4096;
                    money6 = money4;
                    money5 = money3;
                case 13:
                    money3 = money5;
                    money4 = money6;
                    l2 = (Long) b.i(serialDescriptor, 13, lkb.a, l2);
                    i2 |= 8192;
                    money6 = money4;
                    money5 = money3;
                case 14:
                    money3 = money5;
                    money4 = money6;
                    str = (String) b.i(serialDescriptor, 14, uhi.a, str);
                    i2 |= 16384;
                    money6 = money4;
                    money5 = money3;
                case 15:
                    money3 = money5;
                    money4 = money6;
                    str2 = (String) b.i(serialDescriptor, 15, uhi.a, str2);
                    i = 32768;
                    i2 |= i;
                    money6 = money4;
                    money5 = money3;
                case 16:
                    money3 = money5;
                    money4 = money6;
                    str3 = (String) b.i(serialDescriptor, 16, uhi.a, str3);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    money6 = money4;
                    money5 = money3;
                case 17:
                    money3 = money5;
                    money4 = money6;
                    d = (Double) b.i(serialDescriptor, 17, h75.a, d);
                    i = 131072;
                    i2 |= i;
                    money6 = money4;
                    money5 = money3;
                case 18:
                    money3 = money5;
                    money4 = money6;
                    l3 = (Long) b.i(serialDescriptor, 18, lkb.a, l3);
                    i = 262144;
                    i2 |= i;
                    money6 = money4;
                    money5 = money3;
                case 19:
                    money4 = money6;
                    money3 = money5;
                    l4 = (Long) b.i(serialDescriptor, 19, lkb.a, l4);
                    i = 524288;
                    i2 |= i;
                    money6 = money4;
                    money5 = money3;
                case 20:
                    z2 = b.B(serialDescriptor, 20);
                    i2 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    money6 = money6;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Money money7 = money5;
        Money money8 = money6;
        String str8 = str4;
        String str9 = str5;
        b.c(serialDescriptor);
        Long l5 = l4;
        String str10 = str7;
        String str11 = str3;
        return new PlayerTeamInfo(i2, i3, str8, str9, d2, d3, str6, str10, money8, money7, num, l, bool2, bool3, l2, str, str2, str11, d, l3, l5, z2, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PlayerTeamInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        PlayerTeamInfo.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
