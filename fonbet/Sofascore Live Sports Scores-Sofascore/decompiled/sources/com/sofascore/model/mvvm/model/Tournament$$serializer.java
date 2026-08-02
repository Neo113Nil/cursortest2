package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4227o2;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Tournament.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Tournament;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Tournament;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Tournament;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Tournament$$serializer implements iw8 {

    @NotNull
    public static final Tournament$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Tournament$$serializer tournament$$serializer = new Tournament$$serializer();
        INSTANCE = tournament$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Tournament", tournament$$serializer, 18);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("slug", false);
        uyeVar.j("category", false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        uyeVar.j("roundPrefix", false);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, false);
        uyeVar.j("isLive", false);
        uyeVar.j("fieldTranslations", false);
        uyeVar.j("location", false);
        uyeVar.j("groupName", false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j("endTimestamp", false);
        uyeVar.j("groupSign", false);
        uyeVar.j("competitionType", false);
        uyeVar.j("qualificationOrPreliminary", false);
        uyeVar.j(C4227o2.u, true);
        uyeVar.j("webUrl", true);
        descriptor = uyeVar;
    }

    private Tournament$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(UniqueTournament$$serializer.INSTANCE);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(Season$$serializer.INSTANCE);
        gz1 gz1Var = gz1.a;
        KSerializer W4 = l98.W(gz1Var);
        KSerializer W5 = l98.W(FieldTranslations$$serializer.INSTANCE);
        KSerializer W6 = l98.W(uhiVar);
        KSerializer W7 = l98.W(uhiVar);
        lkb lkbVar = lkb.a;
        return new KSerializer[]{a7aVar, uhiVar, uhiVar, Category$$serializer.INSTANCE, W, W2, W3, W4, W5, W6, W7, l98.W(lkbVar), l98.W(lkbVar), l98.W(uhiVar), l98.W(TournamentTypeSerializer.INSTANCE), l98.W(gz1Var), l98.W(a7aVar), uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Tournament deserialize(@NotNull Decoder decoder) {
        Long l;
        String str;
        UniqueTournament uniqueTournament;
        UniqueTournament uniqueTournament2;
        UniqueTournament uniqueTournament3;
        String str2;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Long l2 = null;
        String str3 = null;
        String str4 = null;
        Long l3 = null;
        FieldTranslations fieldTranslations = null;
        int i2 = 0;
        String str5 = null;
        TournamentType tournamentType = null;
        Boolean bool = null;
        Integer num = null;
        UniqueTournament uniqueTournament4 = null;
        String str6 = null;
        Season season = null;
        Boolean bool2 = null;
        boolean z = true;
        int i3 = 0;
        String str7 = null;
        String str8 = null;
        Category category = null;
        String str9 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    l = l2;
                    str = str6;
                    z = false;
                    str6 = str;
                    l2 = l;
                case 0:
                    l = l2;
                    uniqueTournament = uniqueTournament4;
                    str = str6;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    uniqueTournament4 = uniqueTournament;
                    str6 = str;
                    l2 = l;
                case 1:
                    l = l2;
                    uniqueTournament2 = uniqueTournament4;
                    str7 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    uniqueTournament4 = uniqueTournament2;
                    l2 = l;
                case 2:
                    l = l2;
                    uniqueTournament2 = uniqueTournament4;
                    str8 = b.n(serialDescriptor, 2);
                    i2 |= 4;
                    uniqueTournament4 = uniqueTournament2;
                    l2 = l;
                case 3:
                    l = l2;
                    str = str6;
                    uniqueTournament = uniqueTournament4;
                    category = (Category) b.w(serialDescriptor, 3, Category$$serializer.INSTANCE, category);
                    i2 |= 8;
                    uniqueTournament4 = uniqueTournament;
                    str6 = str;
                    l2 = l;
                case 4:
                    l = l2;
                    str = str6;
                    uniqueTournament4 = (UniqueTournament) b.i(serialDescriptor, 4, UniqueTournament$$serializer.INSTANCE, uniqueTournament4);
                    i2 |= 16;
                    str6 = str;
                    l2 = l;
                case 5:
                    uniqueTournament2 = uniqueTournament4;
                    l = l2;
                    str6 = (String) b.i(serialDescriptor, 5, uhi.a, str6);
                    i2 |= 32;
                    uniqueTournament4 = uniqueTournament2;
                    l2 = l;
                case 6:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    season = (Season) b.i(serialDescriptor, 6, Season$$serializer.INSTANCE, season);
                    i2 |= 64;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 7:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    bool2 = (Boolean) b.i(serialDescriptor, 7, gz1.a, bool2);
                    i2 |= 128;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 8:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 8, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 9:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    str4 = (String) b.i(serialDescriptor, 9, uhi.a, str4);
                    i2 |= 512;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 10:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    str3 = (String) b.i(serialDescriptor, 10, uhi.a, str3);
                    i2 |= 1024;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 11:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    l2 = (Long) b.i(serialDescriptor, 11, lkb.a, l2);
                    i2 |= a.o;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 12:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    l3 = (Long) b.i(serialDescriptor, 12, lkb.a, l3);
                    i2 |= 4096;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 13:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    str5 = (String) b.i(serialDescriptor, 13, uhi.a, str5);
                    i2 |= 8192;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 14:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    tournamentType = (TournamentType) b.i(serialDescriptor, 14, TournamentTypeSerializer.INSTANCE, tournamentType);
                    i2 |= 16384;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 15:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    bool = (Boolean) b.i(serialDescriptor, 15, gz1.a, bool);
                    i = 32768;
                    i2 |= i;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 16:
                    uniqueTournament3 = uniqueTournament4;
                    str2 = str6;
                    num = (Integer) b.i(serialDescriptor, 16, a7a.a, num);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    uniqueTournament4 = uniqueTournament3;
                    str6 = str2;
                case 17:
                    str9 = b.n(serialDescriptor, 17);
                    i2 |= 131072;
                    uniqueTournament4 = uniqueTournament4;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Long l4 = l2;
        b.c(serialDescriptor);
        return new Tournament(i2, i3, str7, str8, category, uniqueTournament4, str6, season, bool2, fieldTranslations, str4, str3, l4, l3, str5, tournamentType, bool, num, str9, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Tournament value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Tournament.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
