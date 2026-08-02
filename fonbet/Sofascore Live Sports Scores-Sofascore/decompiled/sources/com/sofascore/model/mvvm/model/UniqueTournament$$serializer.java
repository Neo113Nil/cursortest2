package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
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
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/UniqueTournament.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/UniqueTournament;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/UniqueTournament;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class UniqueTournament$$serializer implements iw8 {

    @NotNull
    public static final UniqueTournament$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UniqueTournament$$serializer uniqueTournament$$serializer = new UniqueTournament$$serializer();
        INSTANCE = uniqueTournament$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.UniqueTournament", uniqueTournament$$serializer, 35);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("slug", false);
        uyeVar.j("category", true);
        uyeVar.j("userCount", true);
        uyeVar.j("hasEventPlayerStatistics", true);
        uyeVar.j("hasBoxScore", false);
        uyeVar.j("primaryColorHex", false);
        uyeVar.j("secondaryColorHex", false);
        uyeVar.j("hasPerformanceGraphFeature", true);
        uyeVar.j("displayInverseHomeAwayTeams", true);
        uyeVar.j("crowdsourcingEnabled", true);
        uyeVar.j("groundType", false);
        uyeVar.j("tennisPoints", false);
        uyeVar.j("country", false);
        uyeVar.j("yearOfFoundation", false);
        uyeVar.j("numberOfDivisions", false);
        uyeVar.j("numberOfCompetitors", false);
        uyeVar.j("owner", false);
        uyeVar.j("chairman", false);
        uyeVar.j("hasDownDistance", false);
        uyeVar.j("competitionType", false);
        uyeVar.j("hasRating", false);
        uyeVar.j("hasLiveRating", false);
        uyeVar.j("majorTrophy", false);
        uyeVar.j(InneractiveMediationDefs.KEY_GENDER, false);
        uyeVar.j("fieldTranslations", false);
        uyeVar.j("showBanner", false);
        uyeVar.j("hasAchievements", false);
        uyeVar.j("hasRounds", false);
        uyeVar.j("playerOfTheTournament", false);
        uyeVar.j("isRecent", true);
        uyeVar.j("isActive", true);
        uyeVar.j("isFavorite", true);
        uyeVar.j("webUrl", true);
        descriptor = uyeVar;
    }

    private UniqueTournament$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, W, uhiVar, Category$$serializer.INSTANCE, lkb.a, gz1Var, l98.W(gz1Var), l98.W(uhiVar), l98.W(uhiVar), gz1Var, gz1Var, gz1Var, l98.W(uhiVar), l98.W(a7aVar), l98.W(Country$$serializer.INSTANCE), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(gz1Var), l98.W(uhiVar), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(GenderSerializer.INSTANCE), l98.W(FieldTranslations$$serializer.INSTANCE), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), gz1Var, gz1Var, gz1Var, uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final UniqueTournament deserialize(@NotNull Decoder decoder) {
        FieldTranslations fieldTranslations;
        Integer num;
        String str;
        int i;
        Country country;
        Gender gender;
        Country country2;
        Integer num2;
        String str2;
        Country country3;
        int i2;
        Integer num3;
        Country country4;
        int i3;
        Integer num4;
        String str3;
        int i4;
        Integer num5;
        int i5;
        int i6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        long j = 0;
        FieldTranslations fieldTranslations2 = null;
        Gender gender2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Integer num6 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = false;
        boolean z2 = true;
        int i7 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i8 = 0;
        String str7 = null;
        String str8 = null;
        Category category = null;
        Boolean bool9 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Integer num7 = null;
        int i9 = 0;
        Country country5 = null;
        Integer num8 = null;
        Integer num9 = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str12 = null;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    fieldTranslations = fieldTranslations2;
                    num = num6;
                    str = str5;
                    i = i9;
                    country = country5;
                    gender = gender2;
                    Unit unit = Unit.a;
                    z2 = false;
                    country2 = country;
                    str5 = str;
                    i9 = i;
                    num6 = num;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 0:
                    fieldTranslations = fieldTranslations2;
                    num = num6;
                    str = str5;
                    String str13 = str8;
                    int i10 = i9;
                    country = country5;
                    gender = gender2;
                    i8 = b.l(serialDescriptor, 0);
                    i = i10 | 1;
                    Unit unit2 = Unit.a;
                    str8 = str13;
                    country2 = country;
                    str5 = str;
                    i9 = i;
                    num6 = num;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 1:
                    fieldTranslations = fieldTranslations2;
                    num = num6;
                    String str14 = str5;
                    int i11 = i9;
                    Country country6 = country5;
                    gender = gender2;
                    String str15 = (String) b.i(serialDescriptor, 1, uhi.a, str8);
                    i = i11 | 2;
                    Unit unit3 = Unit.a;
                    str8 = str15;
                    category = category;
                    country2 = country6;
                    str5 = str14;
                    i9 = i;
                    num6 = num;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 2:
                    fieldTranslations = fieldTranslations2;
                    num = num6;
                    String str16 = str5;
                    int i12 = i9;
                    Country country7 = country5;
                    gender = gender2;
                    String n = b.n(serialDescriptor, 2);
                    i = i12 | 4;
                    Unit unit4 = Unit.a;
                    str7 = n;
                    country2 = country7;
                    str5 = str16;
                    i9 = i;
                    num6 = num;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 3:
                    fieldTranslations = fieldTranslations2;
                    num2 = num6;
                    str2 = str5;
                    int i13 = i9;
                    country3 = country5;
                    gender = gender2;
                    Category category2 = (Category) b.w(serialDescriptor, 3, Category$$serializer.INSTANCE, category);
                    i2 = i13 | 8;
                    Unit unit5 = Unit.a;
                    category = category2;
                    country2 = country3;
                    num6 = num2;
                    str5 = str2;
                    i9 = i2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 4:
                    fieldTranslations = fieldTranslations2;
                    num3 = num6;
                    int i14 = i9;
                    country4 = country5;
                    gender = gender2;
                    j = b.g(serialDescriptor, 4);
                    i3 = i14 | 16;
                    Unit unit6 = Unit.a;
                    country2 = country4;
                    num6 = num3;
                    i9 = i3;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 5:
                    fieldTranslations = fieldTranslations2;
                    num3 = num6;
                    int i15 = i9;
                    country4 = country5;
                    gender = gender2;
                    z = b.B(serialDescriptor, 5);
                    i3 = i15 | 32;
                    Unit unit62 = Unit.a;
                    country2 = country4;
                    num6 = num3;
                    i9 = i3;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 6:
                    fieldTranslations = fieldTranslations2;
                    num2 = num6;
                    str2 = str5;
                    int i16 = i9;
                    country3 = country5;
                    gender = gender2;
                    Boolean bool10 = (Boolean) b.i(serialDescriptor, 6, gz1.a, bool9);
                    i2 = i16 | 64;
                    Unit unit7 = Unit.a;
                    bool9 = bool10;
                    country2 = country3;
                    num6 = num2;
                    str5 = str2;
                    i9 = i2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 7:
                    fieldTranslations = fieldTranslations2;
                    num2 = num6;
                    str2 = str5;
                    int i17 = i9;
                    country3 = country5;
                    gender = gender2;
                    String str17 = (String) b.i(serialDescriptor, 7, uhi.a, str9);
                    i2 = i17 | 128;
                    Unit unit8 = Unit.a;
                    str9 = str17;
                    country2 = country3;
                    num6 = num2;
                    str5 = str2;
                    i9 = i2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 8:
                    fieldTranslations = fieldTranslations2;
                    num2 = num6;
                    str2 = str5;
                    int i18 = i9;
                    country3 = country5;
                    gender = gender2;
                    String str18 = (String) b.i(serialDescriptor, 8, uhi.a, str10);
                    i2 = i18 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit9 = Unit.a;
                    str10 = str18;
                    country2 = country3;
                    num6 = num2;
                    str5 = str2;
                    i9 = i2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 9:
                    fieldTranslations = fieldTranslations2;
                    num3 = num6;
                    int i19 = i9;
                    country4 = country5;
                    gender = gender2;
                    z3 = b.B(serialDescriptor, 9);
                    i3 = i19 | 512;
                    Unit unit622 = Unit.a;
                    country2 = country4;
                    num6 = num3;
                    i9 = i3;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 10:
                    fieldTranslations = fieldTranslations2;
                    num3 = num6;
                    int i20 = i9;
                    country4 = country5;
                    gender = gender2;
                    z4 = b.B(serialDescriptor, 10);
                    i3 = i20 | 1024;
                    Unit unit6222 = Unit.a;
                    country2 = country4;
                    num6 = num3;
                    i9 = i3;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 11:
                    fieldTranslations = fieldTranslations2;
                    num3 = num6;
                    int i21 = i9;
                    country4 = country5;
                    gender = gender2;
                    z5 = b.B(serialDescriptor, 11);
                    i3 = i21 | a.o;
                    Unit unit62222 = Unit.a;
                    country2 = country4;
                    num6 = num3;
                    i9 = i3;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 12:
                    fieldTranslations = fieldTranslations2;
                    Integer num10 = num6;
                    int i22 = i9;
                    Country country8 = country5;
                    gender = gender2;
                    String str19 = (String) b.i(serialDescriptor, 12, uhi.a, str11);
                    i3 = i22 | 4096;
                    Unit unit10 = Unit.a;
                    str11 = str19;
                    country2 = country8;
                    num6 = num10;
                    str5 = str5;
                    i9 = i3;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 13:
                    fieldTranslations = fieldTranslations2;
                    num2 = num6;
                    str2 = str5;
                    int i23 = i9;
                    country3 = country5;
                    gender = gender2;
                    Integer num11 = (Integer) b.i(serialDescriptor, 13, a7a.a, num7);
                    i2 = i23 | 8192;
                    Unit unit11 = Unit.a;
                    num7 = num11;
                    country2 = country3;
                    num6 = num2;
                    str5 = str2;
                    i9 = i2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 14:
                    fieldTranslations = fieldTranslations2;
                    String str20 = str5;
                    Country country9 = (Country) b.i(serialDescriptor, 14, Country$$serializer.INSTANCE, country5);
                    Unit unit12 = Unit.a;
                    country2 = country9;
                    gender = gender2;
                    i9 |= 16384;
                    num6 = num6;
                    str5 = str20;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 15:
                    fieldTranslations = fieldTranslations2;
                    num4 = num6;
                    str3 = str5;
                    Integer num12 = (Integer) b.i(serialDescriptor, 15, a7a.a, num8);
                    i4 = i9 | 32768;
                    Unit unit13 = Unit.a;
                    num8 = num12;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 16:
                    fieldTranslations = fieldTranslations2;
                    str3 = str5;
                    num4 = num6;
                    Integer num13 = (Integer) b.i(serialDescriptor, 16, a7a.a, num9);
                    i4 = i9 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit14 = Unit.a;
                    num9 = num13;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 17:
                    fieldTranslations = fieldTranslations2;
                    str3 = str5;
                    num6 = (Integer) b.i(serialDescriptor, 17, a7a.a, num6);
                    Unit unit15 = Unit.a;
                    i9 |= 131072;
                    country2 = country5;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 18:
                    num5 = num6;
                    fieldTranslations = fieldTranslations2;
                    str5 = (String) b.i(serialDescriptor, 18, uhi.a, str5);
                    Unit unit16 = Unit.a;
                    i9 |= 262144;
                    country2 = country5;
                    num6 = num5;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 19:
                    num4 = num6;
                    str3 = str5;
                    str6 = (String) b.i(serialDescriptor, 19, uhi.a, str6);
                    i5 = 524288;
                    i4 = i9 | i5;
                    Unit unit17 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 20:
                    num4 = num6;
                    str3 = str5;
                    bool8 = (Boolean) b.i(serialDescriptor, 20, gz1.a, bool8);
                    i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i4 = i9 | i5;
                    Unit unit172 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 21:
                    num4 = num6;
                    str3 = str5;
                    str4 = (String) b.i(serialDescriptor, 21, uhi.a, str4);
                    i5 = 2097152;
                    i4 = i9 | i5;
                    Unit unit1722 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 22:
                    num4 = num6;
                    str3 = str5;
                    bool3 = (Boolean) b.i(serialDescriptor, 22, gz1.a, bool3);
                    i5 = 4194304;
                    i4 = i9 | i5;
                    Unit unit17222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 23:
                    num4 = num6;
                    str3 = str5;
                    bool4 = (Boolean) b.i(serialDescriptor, 23, gz1.a, bool4);
                    i5 = 8388608;
                    i4 = i9 | i5;
                    Unit unit172222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 24:
                    num4 = num6;
                    str3 = str5;
                    bool = (Boolean) b.i(serialDescriptor, 24, gz1.a, bool);
                    i5 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i4 = i9 | i5;
                    Unit unit1722222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 25:
                    num4 = num6;
                    str3 = str5;
                    gender2 = (Gender) b.i(serialDescriptor, 25, GenderSerializer.INSTANCE, gender2);
                    i5 = 33554432;
                    i4 = i9 | i5;
                    Unit unit17222222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 26:
                    num4 = num6;
                    str3 = str5;
                    fieldTranslations2 = (FieldTranslations) b.i(serialDescriptor, 26, FieldTranslations$$serializer.INSTANCE, fieldTranslations2);
                    i5 = 67108864;
                    i4 = i9 | i5;
                    Unit unit172222222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 27:
                    num4 = num6;
                    str3 = str5;
                    bool5 = (Boolean) b.i(serialDescriptor, 27, gz1.a, bool5);
                    i5 = 134217728;
                    i4 = i9 | i5;
                    Unit unit1722222222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 28:
                    num4 = num6;
                    str3 = str5;
                    bool2 = (Boolean) b.i(serialDescriptor, 28, gz1.a, bool2);
                    i5 = 268435456;
                    i4 = i9 | i5;
                    Unit unit17222222222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 29:
                    num4 = num6;
                    str3 = str5;
                    bool6 = (Boolean) b.i(serialDescriptor, 29, gz1.a, bool6);
                    i5 = 536870912;
                    i4 = i9 | i5;
                    Unit unit172222222222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 30:
                    num4 = num6;
                    str3 = str5;
                    bool7 = (Boolean) b.i(serialDescriptor, 30, gz1.a, bool7);
                    i5 = 1073741824;
                    i4 = i9 | i5;
                    Unit unit1722222222222 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i4;
                    country2 = country5;
                    num6 = num4;
                    str5 = str3;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 31:
                    num5 = num6;
                    z6 = b.B(serialDescriptor, 31);
                    int i24 = i9 | Integer.MIN_VALUE;
                    Unit unit18 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i9 = i24;
                    country2 = country5;
                    num6 = num5;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 32:
                    num5 = num6;
                    z7 = b.B(serialDescriptor, 32);
                    i6 = i7 | 1;
                    Unit unit19 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i7 = i6;
                    country2 = country5;
                    num6 = num5;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 33:
                    num5 = num6;
                    z8 = b.B(serialDescriptor, 33);
                    i6 = i7 | 2;
                    Unit unit192 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i7 = i6;
                    country2 = country5;
                    num6 = num5;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                case 34:
                    num5 = num6;
                    str12 = b.n(serialDescriptor, 34);
                    i6 = i7 | 4;
                    Unit unit1922 = Unit.a;
                    fieldTranslations = fieldTranslations2;
                    i7 = i6;
                    country2 = country5;
                    num6 = num5;
                    gender = gender2;
                    gender2 = gender;
                    fieldTranslations2 = fieldTranslations;
                    country5 = country2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num14 = num6;
        String str21 = str5;
        String str22 = str8;
        Category category3 = category;
        int i25 = i9;
        Country country10 = country5;
        Gender gender3 = gender2;
        b.c(serialDescriptor);
        return new UniqueTournament(i25, i7, i8, str22, str7, category3, j, z, bool9, str9, str10, z3, z4, z5, str11, num7, country10, num8, num9, num14, str21, str6, bool8, str4, bool3, bool4, bool, gender3, fieldTranslations2, bool5, bool2, bool6, bool7, z6, z7, z8, str12, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UniqueTournament value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        UniqueTournament.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
