package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.ironsource.Y1;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Injury;
import com.sofascore.model.Injury$$serializer;
import com.sofascore.model.Money;
import com.sofascore.model.Money$$serializer;
import com.sofascore.model.cuptree.CupTreeBlock;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Player.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Player;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Player;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Player;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Player$$serializer implements iw8 {

    @NotNull
    public static final Player$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Player$$serializer player$$serializer = new Player$$serializer();
        INSTANCE = player$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Player", player$$serializer, 40);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("firstName", false);
        uyeVar.j("lastName", false);
        uyeVar.j("slug", false);
        uyeVar.j("shortName", false);
        uyeVar.j("position", false);
        uyeVar.j("userCount", false);
        uyeVar.j("dateOfBirthTimestamp", false);
        uyeVar.j("dateOfDeathTimestamp", false);
        uyeVar.j("country", false);
        uyeVar.j("team", false);
        uyeVar.j("jerseyNumber", false);
        uyeVar.j("height", false);
        uyeVar.j("weight", false);
        uyeVar.j("preferredFoot", false);
        uyeVar.j(CupTreeBlock.BLOCK_RESULT_RETIRED, true);
        uyeVar.j("deceased", true);
        uyeVar.j("cricketPlayerInfo", false);
        uyeVar.j("managerId", false);
        uyeVar.j("marketValueRaw", false);
        uyeVar.j("proposedMarketValueRaw", false);
        uyeVar.j("contractUntilTimestamp", false);
        uyeVar.j("injury", false);
        uyeVar.j("fieldTranslations", false);
        uyeVar.j(InneractiveMediationDefs.KEY_GENDER, false);
        uyeVar.j(Y1.e, true);
        uyeVar.j("positionsDetailed", false);
        uyeVar.j("activeSeasonSuspensions", false);
        uyeVar.j("salary", true);
        uyeVar.j("status", true);
        uyeVar.j("primaryPosition", true);
        uyeVar.j("batHand", true);
        uyeVar.j("throwHand", true);
        uyeVar.j("birthCity", true);
        uyeVar.j("birthPlace", true);
        uyeVar.j("underage", true);
        uyeVar.j("isRecent", true);
        uyeVar.j("isTopRated", true);
        uyeVar.j("webUrl", true);
        descriptor = uyeVar;
    }

    private Player$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Player.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(uhiVar);
        KSerializer W5 = l98.W(uhiVar);
        lkb lkbVar = lkb.a;
        KSerializer W6 = l98.W(lkbVar);
        KSerializer W7 = l98.W(lkbVar);
        KSerializer W8 = l98.W(Country$$serializer.INSTANCE);
        KSerializer W9 = l98.W((KSerializer) joaVarArr[11].getValue());
        KSerializer W10 = l98.W(uhiVar);
        KSerializer W11 = l98.W(a7aVar);
        KSerializer W12 = l98.W(a7aVar);
        KSerializer W13 = l98.W(uhiVar);
        KSerializer W14 = l98.W(CricketPlayerInfo$$serializer.INSTANCE);
        KSerializer W15 = l98.W(a7aVar);
        Money$$serializer money$$serializer = Money$$serializer.INSTANCE;
        KSerializer W16 = l98.W(money$$serializer);
        KSerializer W17 = l98.W(money$$serializer);
        KSerializer W18 = l98.W(lkbVar);
        KSerializer W19 = l98.W(Injury$$serializer.INSTANCE);
        KSerializer W20 = l98.W(FieldTranslations$$serializer.INSTANCE);
        KSerializer W21 = l98.W(GenderSerializer.INSTANCE);
        KSerializer W22 = l98.W((KSerializer) joaVarArr[27].getValue());
        KSerializer W23 = l98.W((KSerializer) joaVarArr[28].getValue());
        KSerializer W24 = l98.W(money$$serializer);
        KSerializer W25 = l98.W(uhiVar);
        KSerializer W26 = l98.W(uhiVar);
        KSerializer W27 = l98.W(uhiVar);
        KSerializer W28 = l98.W(uhiVar);
        KSerializer W29 = l98.W(uhiVar);
        KSerializer W30 = l98.W(uhiVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, uhiVar, W, W2, W3, W4, W5, lkbVar, W6, W7, W8, W9, W10, W11, W12, W13, gz1Var, gz1Var, W14, W15, W16, W17, W18, W19, W20, W21, gz1Var, W22, W23, W24, W25, W26, W27, W28, W29, W30, gz1Var, gz1Var, gz1Var, uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Player deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Gender gender;
        Long l;
        int i;
        int i2;
        Integer num;
        FieldTranslations fieldTranslations;
        Long l2;
        Long l3;
        Integer num2;
        FieldTranslations fieldTranslations2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Player.$childSerializers;
        long j = 0;
        Gender gender2 = null;
        FieldTranslations fieldTranslations3 = null;
        Injury injury = null;
        Long l4 = null;
        List list = null;
        String str = null;
        String str2 = null;
        Money money = null;
        int i8 = 0;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = true;
        int i9 = 0;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        boolean z2 = false;
        boolean z3 = false;
        Long l5 = null;
        Long l6 = null;
        Country country = null;
        Team team = null;
        String str13 = null;
        Integer num3 = null;
        int i10 = 0;
        Integer num4 = null;
        boolean z4 = false;
        String str14 = null;
        CricketPlayerInfo cricketPlayerInfo = null;
        Integer num5 = null;
        Money money2 = null;
        Money money3 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        String str15 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    gender = gender2;
                    l = l4;
                    i = i8;
                    i2 = i10;
                    num = num4;
                    fieldTranslations = fieldTranslations3;
                    Unit unit = Unit.a;
                    z = false;
                    fieldTranslations3 = fieldTranslations;
                    num4 = num;
                    i10 = i2;
                    l4 = l;
                    i8 = i;
                    gender2 = gender;
                case 0:
                    gender = gender2;
                    l = l4;
                    i = i8;
                    int i11 = i10;
                    num = num4;
                    fieldTranslations = fieldTranslations3;
                    int l7 = b.l(serialDescriptor, 0);
                    i2 = i11 | 1;
                    Unit unit2 = Unit.a;
                    i9 = l7;
                    fieldTranslations3 = fieldTranslations;
                    num4 = num;
                    i10 = i2;
                    l4 = l;
                    i8 = i;
                    gender2 = gender;
                case 1:
                    gender = gender2;
                    l = l4;
                    i = i8;
                    int i12 = i10;
                    num = num4;
                    String n = b.n(serialDescriptor, 1);
                    i2 = i12 | 2;
                    Unit unit3 = Unit.a;
                    str7 = n;
                    fieldTranslations3 = fieldTranslations3;
                    num4 = num;
                    i10 = i2;
                    l4 = l;
                    i8 = i;
                    gender2 = gender;
                case 2:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i13 = i10;
                    Integer num6 = num4;
                    FieldTranslations fieldTranslations4 = fieldTranslations3;
                    String str16 = (String) b.i(serialDescriptor, 2, uhi.a, str8);
                    int i14 = i13 | 4;
                    Unit unit4 = Unit.a;
                    i10 = i14;
                    fieldTranslations3 = fieldTranslations4;
                    num4 = num6;
                    str8 = str16;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 3:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i15 = i10;
                    Integer num7 = num4;
                    FieldTranslations fieldTranslations5 = fieldTranslations3;
                    String str17 = (String) b.i(serialDescriptor, 3, uhi.a, str9);
                    int i16 = i15 | 8;
                    Unit unit5 = Unit.a;
                    i10 = i16;
                    fieldTranslations3 = fieldTranslations5;
                    num4 = num7;
                    str9 = str17;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 4:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i17 = i10;
                    Integer num8 = num4;
                    FieldTranslations fieldTranslations6 = fieldTranslations3;
                    String str18 = (String) b.i(serialDescriptor, 4, uhi.a, str10);
                    int i18 = i17 | 16;
                    Unit unit6 = Unit.a;
                    i10 = i18;
                    fieldTranslations3 = fieldTranslations6;
                    num4 = num8;
                    str10 = str18;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 5:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i19 = i10;
                    Integer num9 = num4;
                    FieldTranslations fieldTranslations7 = fieldTranslations3;
                    String str19 = (String) b.i(serialDescriptor, 5, uhi.a, str11);
                    int i20 = i19 | 32;
                    Unit unit7 = Unit.a;
                    i10 = i20;
                    fieldTranslations3 = fieldTranslations7;
                    num4 = num9;
                    str11 = str19;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 6:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i21 = i10;
                    Integer num10 = num4;
                    FieldTranslations fieldTranslations8 = fieldTranslations3;
                    String str20 = (String) b.i(serialDescriptor, 6, uhi.a, str12);
                    int i22 = i21 | 64;
                    Unit unit8 = Unit.a;
                    i10 = i22;
                    fieldTranslations3 = fieldTranslations8;
                    num4 = num10;
                    str12 = str20;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 7:
                    gender = gender2;
                    l3 = l4;
                    i = i8;
                    int i23 = i10;
                    num2 = num4;
                    fieldTranslations2 = fieldTranslations3;
                    j = b.g(serialDescriptor, 7);
                    i3 = i23 | 128;
                    Unit unit9 = Unit.a;
                    fieldTranslations3 = fieldTranslations2;
                    l4 = l3;
                    num4 = num2;
                    i10 = i3;
                    i8 = i;
                    gender2 = gender;
                case 8:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i24 = i10;
                    Integer num11 = num4;
                    FieldTranslations fieldTranslations9 = fieldTranslations3;
                    Long l8 = (Long) b.i(serialDescriptor, 8, lkb.a, l5);
                    int i25 = i24 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    i10 = i25;
                    fieldTranslations3 = fieldTranslations9;
                    num4 = num11;
                    l5 = l8;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 9:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i26 = i10;
                    Integer num12 = num4;
                    FieldTranslations fieldTranslations10 = fieldTranslations3;
                    Long l9 = (Long) b.i(serialDescriptor, 9, lkb.a, l6);
                    int i27 = i26 | 512;
                    Unit unit11 = Unit.a;
                    i10 = i27;
                    fieldTranslations3 = fieldTranslations10;
                    num4 = num12;
                    l6 = l9;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 10:
                    gender = gender2;
                    l3 = l4;
                    i = i8;
                    int i28 = i10;
                    num2 = num4;
                    fieldTranslations2 = fieldTranslations3;
                    Country country2 = (Country) b.i(serialDescriptor, 10, Country$$serializer.INSTANCE, country);
                    i3 = i28 | 1024;
                    Unit unit12 = Unit.a;
                    country = country2;
                    fieldTranslations3 = fieldTranslations2;
                    l4 = l3;
                    num4 = num2;
                    i10 = i3;
                    i8 = i;
                    gender2 = gender;
                case 11:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i29 = i10;
                    Integer num13 = num4;
                    FieldTranslations fieldTranslations11 = fieldTranslations3;
                    Team team2 = (Team) b.i(serialDescriptor, 11, (dy4) joaVarArr[11].getValue(), team);
                    int i30 = i29 | a.o;
                    Unit unit13 = Unit.a;
                    i10 = i30;
                    fieldTranslations3 = fieldTranslations11;
                    num4 = num13;
                    team = team2;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 12:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    int i31 = i10;
                    Integer num14 = num4;
                    FieldTranslations fieldTranslations12 = fieldTranslations3;
                    String str21 = (String) b.i(serialDescriptor, 12, uhi.a, str13);
                    int i32 = i31 | 4096;
                    Unit unit14 = Unit.a;
                    i10 = i32;
                    fieldTranslations3 = fieldTranslations12;
                    num4 = num14;
                    str13 = str21;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 13:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    Integer num15 = num4;
                    Integer num16 = (Integer) b.i(serialDescriptor, 13, a7a.a, num3);
                    Unit unit15 = Unit.a;
                    i10 |= 8192;
                    fieldTranslations3 = fieldTranslations3;
                    num4 = num15;
                    num3 = num16;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 14:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    Integer num17 = (Integer) b.i(serialDescriptor, 14, a7a.a, num4);
                    i4 = i10 | 16384;
                    Unit unit16 = Unit.a;
                    num4 = num17;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 15:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    String str22 = (String) b.i(serialDescriptor, 15, uhi.a, str14);
                    i4 = i10 | 32768;
                    Unit unit17 = Unit.a;
                    str14 = str22;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 16:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    z2 = b.B(serialDescriptor, 16);
                    i5 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i4 = i10 | i5;
                    Unit unit18 = Unit.a;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 17:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    z3 = b.B(serialDescriptor, 17);
                    i5 = 131072;
                    i4 = i10 | i5;
                    Unit unit182 = Unit.a;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 18:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    CricketPlayerInfo cricketPlayerInfo2 = (CricketPlayerInfo) b.i(serialDescriptor, 18, CricketPlayerInfo$$serializer.INSTANCE, cricketPlayerInfo);
                    i4 = i10 | 262144;
                    Unit unit19 = Unit.a;
                    cricketPlayerInfo = cricketPlayerInfo2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 19:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    Integer num18 = (Integer) b.i(serialDescriptor, 19, a7a.a, num5);
                    i4 = i10 | 524288;
                    Unit unit20 = Unit.a;
                    num5 = num18;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 20:
                    gender = gender2;
                    l2 = l4;
                    i = i8;
                    Money money4 = (Money) b.i(serialDescriptor, 20, Money$$serializer.INSTANCE, money2);
                    i4 = i10 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit21 = Unit.a;
                    money2 = money4;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 21:
                    gender = gender2;
                    i = i8;
                    l2 = l4;
                    Money money5 = (Money) b.i(serialDescriptor, 21, Money$$serializer.INSTANCE, money3);
                    i4 = i10 | 2097152;
                    Unit unit22 = Unit.a;
                    money3 = money5;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 22:
                    i = i8;
                    gender = gender2;
                    l4 = (Long) b.i(serialDescriptor, 22, lkb.a, l4);
                    Unit unit23 = Unit.a;
                    i10 |= 4194304;
                    i8 = i;
                    gender2 = gender;
                case 23:
                    l2 = l4;
                    i = i8;
                    injury = (Injury) b.i(serialDescriptor, 23, Injury$$serializer.INSTANCE, injury);
                    i6 = 8388608;
                    i4 = i10 | i6;
                    Unit unit24 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 24:
                    l2 = l4;
                    i = i8;
                    fieldTranslations3 = (FieldTranslations) b.i(serialDescriptor, 24, FieldTranslations$$serializer.INSTANCE, fieldTranslations3);
                    i6 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i4 = i10 | i6;
                    Unit unit242 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 25:
                    l2 = l4;
                    i = i8;
                    gender2 = (Gender) b.i(serialDescriptor, 25, GenderSerializer.INSTANCE, gender2);
                    i6 = 33554432;
                    i4 = i10 | i6;
                    Unit unit2422 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 26:
                    l2 = l4;
                    i = i8;
                    z4 = b.B(serialDescriptor, 26);
                    i6 = 67108864;
                    i4 = i10 | i6;
                    Unit unit24222 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 27:
                    l2 = l4;
                    i = i8;
                    list = (List) b.i(serialDescriptor, 27, (dy4) joaVarArr[27].getValue(), list);
                    i6 = 134217728;
                    i4 = i10 | i6;
                    Unit unit242222 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 28:
                    l2 = l4;
                    i = i8;
                    list2 = (List) b.i(serialDescriptor, 28, (dy4) joaVarArr[28].getValue(), list2);
                    i6 = 268435456;
                    i4 = i10 | i6;
                    Unit unit2422222 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 29:
                    l2 = l4;
                    i = i8;
                    money = (Money) b.i(serialDescriptor, 29, Money$$serializer.INSTANCE, money);
                    i6 = 536870912;
                    i4 = i10 | i6;
                    Unit unit24222222 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 30:
                    l2 = l4;
                    i = i8;
                    str3 = (String) b.i(serialDescriptor, 30, uhi.a, str3);
                    i6 = 1073741824;
                    i4 = i10 | i6;
                    Unit unit242222222 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 31:
                    l2 = l4;
                    i = i8;
                    str4 = (String) b.i(serialDescriptor, 31, uhi.a, str4);
                    i6 = Integer.MIN_VALUE;
                    i4 = i10 | i6;
                    Unit unit2422222222 = Unit.a;
                    gender = gender2;
                    i10 = i4;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 32:
                    l2 = l4;
                    str5 = (String) b.i(serialDescriptor, 32, uhi.a, str5);
                    i7 = i8 | 1;
                    Unit unit25 = Unit.a;
                    gender = gender2;
                    i = i7;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 33:
                    l2 = l4;
                    str6 = (String) b.i(serialDescriptor, 33, uhi.a, str6);
                    i7 = i8 | 2;
                    Unit unit252 = Unit.a;
                    gender = gender2;
                    i = i7;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 34:
                    l2 = l4;
                    str = (String) b.i(serialDescriptor, 34, uhi.a, str);
                    i7 = i8 | 4;
                    Unit unit2522 = Unit.a;
                    gender = gender2;
                    i = i7;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 35:
                    l2 = l4;
                    str2 = (String) b.i(serialDescriptor, 35, uhi.a, str2);
                    i7 = i8 | 8;
                    Unit unit25222 = Unit.a;
                    gender = gender2;
                    i = i7;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 36:
                    l2 = l4;
                    z5 = b.B(serialDescriptor, 36);
                    i7 = i8 | 16;
                    Unit unit252222 = Unit.a;
                    gender = gender2;
                    i = i7;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 37:
                    l2 = l4;
                    z6 = b.B(serialDescriptor, 37);
                    i7 = i8 | 32;
                    Unit unit2522222 = Unit.a;
                    gender = gender2;
                    i = i7;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 38:
                    l2 = l4;
                    z7 = b.B(serialDescriptor, 38);
                    i7 = i8 | 64;
                    Unit unit25222222 = Unit.a;
                    gender = gender2;
                    i = i7;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                case 39:
                    l2 = l4;
                    str15 = b.n(serialDescriptor, 39);
                    i7 = i8 | 128;
                    Unit unit252222222 = Unit.a;
                    gender = gender2;
                    i = i7;
                    l4 = l2;
                    i8 = i;
                    gender2 = gender;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Long l10 = l4;
        int i33 = i8;
        int i34 = i10;
        Integer num19 = num4;
        FieldTranslations fieldTranslations13 = fieldTranslations3;
        String str23 = str8;
        b.c(serialDescriptor);
        return new Player(i34, i33, i9, str7, str23, str9, str10, str11, str12, j, l5, l6, country, team, str13, num3, num19, str14, z2, z3, cricketPlayerInfo, num5, money2, money3, l10, injury, fieldTranslations13, gender2, z4, list, list2, money, str3, str4, str5, str6, str, str2, z5, z6, z7, str15, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Player value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Player.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
