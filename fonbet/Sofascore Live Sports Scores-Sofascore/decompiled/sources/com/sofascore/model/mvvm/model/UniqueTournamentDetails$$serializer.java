package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/UniqueTournamentDetails.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/UniqueTournamentDetails;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/UniqueTournamentDetails;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/UniqueTournamentDetails;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class UniqueTournamentDetails$$serializer implements iw8 {

    @NotNull
    public static final UniqueTournamentDetails$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UniqueTournamentDetails$$serializer uniqueTournamentDetails$$serializer = new UniqueTournamentDetails$$serializer();
        INSTANCE = uniqueTournamentDetails$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.UniqueTournamentDetails", uniqueTournamentDetails$$serializer, 25);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("slug", false);
        uyeVar.j("category", false);
        uyeVar.j("userCount", true);
        uyeVar.j("hasEventPlayerStatistics", true);
        uyeVar.j("displayInverseHomeAwayTeams", false);
        uyeVar.j("groundType", false);
        uyeVar.j("country", false);
        uyeVar.j("owner", false);
        uyeVar.j("titleHolder", false);
        uyeVar.j("titleHolderTitles", false);
        uyeVar.j("mostTitlesTeams", false);
        uyeVar.j("mostTitles", false);
        uyeVar.j("startDateTimestamp", false);
        uyeVar.j("endDateTimestamp", false);
        uyeVar.j("linkedUniqueTournaments", false);
        uyeVar.j("upperDivisions", false);
        uyeVar.j("lowerDivisions", false);
        uyeVar.j("numberOfSets", false);
        uyeVar.j("competitionType", false);
        uyeVar.j("fieldTranslations", false);
        uyeVar.j(InneractiveMediationDefs.KEY_GENDER, false);
        uyeVar.j("showBanner", false);
        uyeVar.j("playerOfTheTournament", false);
        descriptor = uyeVar;
    }

    private UniqueTournamentDetails$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = UniqueTournamentDetails.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, uhiVar, uhiVar, Category$$serializer.INSTANCE, lkb.a, gz1Var, gz1Var, l98.W(uhiVar), l98.W(Country$$serializer.INSTANCE), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[10].getValue()), l98.W(a7aVar), joaVarArr[12].getValue(), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), joaVarArr[16].getValue(), joaVarArr[17].getValue(), joaVarArr[18].getValue(), l98.W(a7aVar), l98.W(uhiVar), l98.W(FieldTranslations$$serializer.INSTANCE), l98.W(GenderSerializer.INSTANCE), l98.W(gz1Var), l98.W(gz1Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final UniqueTournamentDetails deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        List list;
        Integer num;
        int i;
        Boolean bool;
        Integer num2;
        List list2;
        List list3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = UniqueTournamentDetails.$childSerializers;
        long j = 0;
        List list4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Gender gender = null;
        Integer num3 = null;
        String str = null;
        FieldTranslations fieldTranslations = null;
        int i2 = 0;
        Integer num4 = null;
        Integer num5 = null;
        List list5 = null;
        Integer num6 = null;
        List list6 = null;
        List list7 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        Category category = null;
        String str4 = null;
        Country country = null;
        String str5 = null;
        Team team = null;
        Integer num7 = null;
        while (z3) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    bool = bool2;
                    num2 = num3;
                    z3 = false;
                    num3 = num2;
                    bool2 = bool;
                case 0:
                    list2 = list4;
                    bool = bool2;
                    num2 = num3;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    list4 = list2;
                    num3 = num2;
                    bool2 = bool;
                case 1:
                    list3 = list4;
                    bool = bool2;
                    str2 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    list4 = list3;
                    bool2 = bool;
                case 2:
                    list3 = list4;
                    bool = bool2;
                    str3 = b.n(serialDescriptor, 2);
                    i2 |= 4;
                    list4 = list3;
                    bool2 = bool;
                case 3:
                    list2 = list4;
                    bool = bool2;
                    num2 = num3;
                    category = (Category) b.w(serialDescriptor, 3, Category$$serializer.INSTANCE, category);
                    i2 |= 8;
                    list4 = list2;
                    num3 = num2;
                    bool2 = bool;
                case 4:
                    list3 = list4;
                    bool = bool2;
                    j = b.g(serialDescriptor, 4);
                    i2 |= 16;
                    list4 = list3;
                    bool2 = bool;
                case 5:
                    list3 = list4;
                    bool = bool2;
                    z = b.B(serialDescriptor, 5);
                    i2 |= 32;
                    list4 = list3;
                    bool2 = bool;
                case 6:
                    list3 = list4;
                    bool = bool2;
                    z2 = b.B(serialDescriptor, 6);
                    i2 |= 64;
                    list4 = list3;
                    bool2 = bool;
                case 7:
                    list2 = list4;
                    bool = bool2;
                    num2 = num3;
                    str4 = (String) b.i(serialDescriptor, 7, uhi.a, str4);
                    i2 |= 128;
                    list4 = list2;
                    num3 = num2;
                    bool2 = bool;
                case 8:
                    list2 = list4;
                    bool = bool2;
                    num2 = num3;
                    country = (Country) b.i(serialDescriptor, 8, Country$$serializer.INSTANCE, country);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    list4 = list2;
                    num3 = num2;
                    bool2 = bool;
                case 9:
                    list2 = list4;
                    bool = bool2;
                    num2 = num3;
                    str5 = (String) b.i(serialDescriptor, 9, uhi.a, str5);
                    i2 |= 512;
                    list4 = list2;
                    num3 = num2;
                    bool2 = bool;
                case 10:
                    list2 = list4;
                    bool = bool2;
                    num2 = num3;
                    team = (Team) b.i(serialDescriptor, 10, (dy4) joaVarArr[10].getValue(), team);
                    i2 |= 1024;
                    list4 = list2;
                    num3 = num2;
                    bool2 = bool;
                case 11:
                    bool = bool2;
                    num2 = num3;
                    list2 = list4;
                    num7 = (Integer) b.i(serialDescriptor, 11, a7a.a, num7);
                    i2 |= a.o;
                    list4 = list2;
                    num3 = num2;
                    bool2 = bool;
                case 12:
                    bool = bool2;
                    num2 = num3;
                    list4 = (List) b.w(serialDescriptor, 12, (dy4) joaVarArr[12].getValue(), list4);
                    i2 |= 4096;
                    num3 = num2;
                    bool2 = bool;
                case 13:
                    list3 = list4;
                    bool = bool2;
                    num3 = (Integer) b.i(serialDescriptor, 13, a7a.a, num3);
                    i2 |= 8192;
                    list4 = list3;
                    bool2 = bool;
                case 14:
                    list = list4;
                    num = num3;
                    num4 = (Integer) b.i(serialDescriptor, 14, a7a.a, num4);
                    i2 |= 16384;
                    list4 = list;
                    num3 = num;
                case 15:
                    list = list4;
                    num = num3;
                    num5 = (Integer) b.i(serialDescriptor, 15, a7a.a, num5);
                    i = 32768;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 16:
                    list = list4;
                    num = num3;
                    list5 = (List) b.w(serialDescriptor, 16, (dy4) joaVarArr[16].getValue(), list5);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 17:
                    list = list4;
                    num = num3;
                    list6 = (List) b.w(serialDescriptor, 17, (dy4) joaVarArr[17].getValue(), list6);
                    i = 131072;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 18:
                    list = list4;
                    num = num3;
                    list7 = (List) b.w(serialDescriptor, 18, (dy4) joaVarArr[18].getValue(), list7);
                    i = 262144;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 19:
                    list = list4;
                    num = num3;
                    num6 = (Integer) b.i(serialDescriptor, 19, a7a.a, num6);
                    i = 524288;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 20:
                    list = list4;
                    num = num3;
                    str = (String) b.i(serialDescriptor, 20, uhi.a, str);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 21:
                    list = list4;
                    num = num3;
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 21, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i = 2097152;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 22:
                    list = list4;
                    num = num3;
                    gender = (Gender) b.i(serialDescriptor, 22, GenderSerializer.INSTANCE, gender);
                    i = 4194304;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 23:
                    list = list4;
                    num = num3;
                    bool3 = (Boolean) b.i(serialDescriptor, 23, gz1.a, bool3);
                    i = 8388608;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                case 24:
                    list = list4;
                    num = num3;
                    bool2 = (Boolean) b.i(serialDescriptor, 24, gz1.a, bool2);
                    i = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i2 |= i;
                    list4 = list;
                    num3 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Boolean bool4 = bool2;
        Category category2 = category;
        b.c(serialDescriptor);
        return new UniqueTournamentDetails(i2, i3, str2, str3, category2, j, z, z2, str4, country, str5, team, num7, list4, num3, num4, num5, list5, list6, list7, num6, str, fieldTranslations, gender, bool3, bool4, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UniqueTournamentDetails value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        UniqueTournamentDetails.write$Self(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
