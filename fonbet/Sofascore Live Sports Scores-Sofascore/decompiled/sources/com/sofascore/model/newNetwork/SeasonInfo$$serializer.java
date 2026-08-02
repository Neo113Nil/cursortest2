package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Money;
import com.sofascore.model.Money$$serializer;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Team;
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
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/SeasonInfo.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/SeasonInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/SeasonInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/SeasonInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class SeasonInfo$$serializer implements iw8 {

    @NotNull
    public static final SeasonInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SeasonInfo$$serializer seasonInfo$$serializer = new SeasonInfo$$serializer();
        INSTANCE = seasonInfo$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.SeasonInfo", seasonInfo$$serializer, 18);
        uyeVar.j("id", false);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, false);
        uyeVar.j("hostCountries", false);
        uyeVar.j("hostCities", false);
        uyeVar.j("newcomersUpperDivision", false);
        uyeVar.j("newcomersLowerDivision", false);
        uyeVar.j("newcomersOther", false);
        uyeVar.j("totalPrizeMoneyRaw", false);
        uyeVar.j("numberOfCompetitors", false);
        uyeVar.j("goals", false);
        uyeVar.j("homeTeamWins", false);
        uyeVar.j("awayTeamWins", false);
        uyeVar.j("draws", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        uyeVar.j("tier", false);
        uyeVar.j("numberOfRounds", false);
        uyeVar.j("winner", false);
        descriptor = uyeVar;
    }

    private SeasonInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = SeasonInfo.$childSerializers;
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, Season$$serializer.INSTANCE, joaVarArr[2].getValue(), l98.W((KSerializer) joaVarArr[3].getValue()), joaVarArr[4].getValue(), joaVarArr[5].getValue(), joaVarArr[6].getValue(), l98.W(Money$$serializer.INSTANCE), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhi.a), l98.W(a7aVar), l98.W((KSerializer) joaVarArr[17].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final SeasonInfo deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Integer num;
        List list;
        List list2;
        List list3;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = SeasonInfo.$childSerializers;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Money money = null;
        int i2 = 0;
        Integer num7 = null;
        Integer num8 = null;
        String str = null;
        Integer num9 = null;
        Team team = null;
        List list4 = null;
        List list5 = null;
        boolean z = true;
        int i3 = 0;
        Season season = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num2;
                    list = list4;
                    list2 = list5;
                    z = false;
                    list4 = list;
                    num2 = num;
                    list5 = list2;
                case 0:
                    num = num2;
                    list = list4;
                    list2 = list5;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    list4 = list;
                    num2 = num;
                    list5 = list2;
                case 1:
                    num = num2;
                    list = list4;
                    list2 = list5;
                    season = (Season) b.w(serialDescriptor, 1, Season$$serializer.INSTANCE, season);
                    i2 |= 2;
                    list6 = list6;
                    list4 = list;
                    num2 = num;
                    list5 = list2;
                case 2:
                    num = num2;
                    list = list4;
                    list2 = list5;
                    list6 = (List) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list6);
                    i2 |= 4;
                    list4 = list;
                    num2 = num;
                    list5 = list2;
                case 3:
                    num = num2;
                    list = list4;
                    list2 = list5;
                    list7 = (List) b.i(serialDescriptor, 3, (dy4) joaVarArr[3].getValue(), list7);
                    i2 |= 8;
                    list4 = list;
                    num2 = num;
                    list5 = list2;
                case 4:
                    num = num2;
                    list2 = list5;
                    list = list4;
                    list8 = (List) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list8);
                    i2 |= 16;
                    list4 = list;
                    num2 = num;
                    list5 = list2;
                case 5:
                    num = num2;
                    list2 = list5;
                    list4 = (List) b.w(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list4);
                    i2 |= 32;
                    num2 = num;
                    list5 = list2;
                case 6:
                    list5 = (List) b.w(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list5);
                    i2 |= 64;
                    list4 = list4;
                    num2 = num2;
                case 7:
                    list3 = list4;
                    list2 = list5;
                    money = (Money) b.i(serialDescriptor, 7, Money$$serializer.INSTANCE, money);
                    i2 |= 128;
                    list4 = list3;
                    list5 = list2;
                case 8:
                    list3 = list4;
                    list2 = list5;
                    num5 = (Integer) b.i(serialDescriptor, 8, a7a.a, num5);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    list4 = list3;
                    list5 = list2;
                case 9:
                    list3 = list4;
                    list2 = list5;
                    num4 = (Integer) b.i(serialDescriptor, 9, a7a.a, num4);
                    i2 |= 512;
                    list4 = list3;
                    list5 = list2;
                case 10:
                    list3 = list4;
                    list2 = list5;
                    num3 = (Integer) b.i(serialDescriptor, 10, a7a.a, num3);
                    i2 |= 1024;
                    list4 = list3;
                    list5 = list2;
                case 11:
                    list3 = list4;
                    list2 = list5;
                    num2 = (Integer) b.i(serialDescriptor, 11, a7a.a, num2);
                    i2 |= a.o;
                    list4 = list3;
                    list5 = list2;
                case 12:
                    list3 = list4;
                    list2 = list5;
                    num6 = (Integer) b.i(serialDescriptor, 12, a7a.a, num6);
                    i2 |= 4096;
                    list4 = list3;
                    list5 = list2;
                case 13:
                    list3 = list4;
                    list2 = list5;
                    num7 = (Integer) b.i(serialDescriptor, 13, a7a.a, num7);
                    i2 |= 8192;
                    list4 = list3;
                    list5 = list2;
                case 14:
                    list3 = list4;
                    list2 = list5;
                    num8 = (Integer) b.i(serialDescriptor, 14, a7a.a, num8);
                    i2 |= 16384;
                    list4 = list3;
                    list5 = list2;
                case 15:
                    list3 = list4;
                    list2 = list5;
                    str = (String) b.i(serialDescriptor, 15, uhi.a, str);
                    i = 32768;
                    i2 |= i;
                    list4 = list3;
                    list5 = list2;
                case 16:
                    list3 = list4;
                    list2 = list5;
                    num9 = (Integer) b.i(serialDescriptor, 16, a7a.a, num9);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    list4 = list3;
                    list5 = list2;
                case 17:
                    list3 = list4;
                    list2 = list5;
                    team = (Team) b.i(serialDescriptor, 17, (dy4) joaVarArr[17].getValue(), team);
                    i = 131072;
                    i2 |= i;
                    list4 = list3;
                    list5 = list2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        List list9 = list4;
        List list10 = list5;
        Season season2 = season;
        List list11 = list6;
        b.c(serialDescriptor);
        Integer num10 = num9;
        return new SeasonInfo(i2, i3, season2, list11, list7, list8, list9, list10, money, num5, num4, num3, num2, num6, num7, num8, str, num10, team, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SeasonInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        SeasonInfo.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
