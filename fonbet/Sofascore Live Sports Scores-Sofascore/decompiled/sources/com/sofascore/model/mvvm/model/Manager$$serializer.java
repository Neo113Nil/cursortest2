package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.ManagerPerformance;
import com.sofascore.model.newNetwork.ManagerPerformance$$serializer;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Manager.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Manager;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Manager;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Manager;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Manager$$serializer implements iw8 {

    @NotNull
    public static final Manager$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Manager$$serializer manager$$serializer = new Manager$$serializer();
        INSTANCE = manager$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Manager", manager$$serializer, 19);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("shortName", false);
        uyeVar.j("slug", false);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        uyeVar.j("team", false);
        uyeVar.j("country", false);
        uyeVar.j("performance", false);
        uyeVar.j("formerPlayerId", false);
        uyeVar.j("teams", false);
        uyeVar.j("dateOfBirthTimestamp", false);
        uyeVar.j("dateOfDeathTimestamp", false);
        uyeVar.j("preferredFormation", false);
        uyeVar.j("nationalityISO2", false);
        uyeVar.j(CupTreeBlock.BLOCK_RESULT_RETIRED, true);
        uyeVar.j("deceased", true);
        uyeVar.j("fieldTranslations", false);
        uyeVar.j("isRecent", true);
        uyeVar.j("webUrl", true);
        descriptor = uyeVar;
    }

    private Manager$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Manager.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(Sport$$serializer.INSTANCE);
        KSerializer W3 = l98.W((KSerializer) joaVarArr[5].getValue());
        KSerializer W4 = l98.W(Country$$serializer.INSTANCE);
        KSerializer W5 = l98.W(ManagerPerformance$$serializer.INSTANCE);
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W((KSerializer) joaVarArr[9].getValue());
        lkb lkbVar = lkb.a;
        KSerializer W8 = l98.W(lkbVar);
        KSerializer W9 = l98.W(lkbVar);
        KSerializer W10 = l98.W(uhiVar);
        KSerializer W11 = l98.W(uhiVar);
        KSerializer W12 = l98.W(FieldTranslations$$serializer.INSTANCE);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, uhiVar, W, uhiVar, W2, W3, W4, W5, W6, W7, W8, W9, W10, W11, gz1Var, gz1Var, W12, gz1Var, uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Manager deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        String str;
        int i;
        Long l;
        String str2;
        String str3;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Manager.$childSerializers;
        Long l2 = null;
        Long l3 = null;
        List list = null;
        Integer num = null;
        String str5 = null;
        ManagerPerformance managerPerformance = null;
        int i2 = 0;
        String str6 = null;
        FieldTranslations fieldTranslations = null;
        String str7 = null;
        String str8 = null;
        Sport sport = null;
        Team team = null;
        Country country = null;
        boolean z = true;
        int i3 = 0;
        String str9 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str10 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    l = l2;
                    str2 = str8;
                    z = false;
                    str8 = str2;
                    l2 = l;
                case 0:
                    l = l2;
                    str2 = str8;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    str7 = str7;
                    str8 = str2;
                    l2 = l;
                case 1:
                    l = l2;
                    str9 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    str7 = str7;
                    l2 = l;
                case 2:
                    str2 = str8;
                    l = l2;
                    str7 = (String) b.i(serialDescriptor, 2, uhi.a, str7);
                    i2 |= 4;
                    str8 = str2;
                    l2 = l;
                case 3:
                    str3 = str7;
                    str8 = b.n(serialDescriptor, 3);
                    i2 |= 8;
                    str7 = str3;
                case 4:
                    str3 = str7;
                    str4 = str8;
                    sport = (Sport) b.i(serialDescriptor, 4, Sport$$serializer.INSTANCE, sport);
                    i2 |= 16;
                    str8 = str4;
                    str7 = str3;
                case 5:
                    str3 = str7;
                    str4 = str8;
                    team = (Team) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), team);
                    i2 |= 32;
                    str8 = str4;
                    str7 = str3;
                case 6:
                    str3 = str7;
                    str4 = str8;
                    country = (Country) b.i(serialDescriptor, 6, Country$$serializer.INSTANCE, country);
                    i2 |= 64;
                    str8 = str4;
                    str7 = str3;
                case 7:
                    str3 = str7;
                    str4 = str8;
                    managerPerformance = (ManagerPerformance) b.i(serialDescriptor, 7, ManagerPerformance$$serializer.INSTANCE, managerPerformance);
                    i2 |= 128;
                    str8 = str4;
                    str7 = str3;
                case 8:
                    str3 = str7;
                    str4 = str8;
                    num = (Integer) b.i(serialDescriptor, 8, a7a.a, num);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str8 = str4;
                    str7 = str3;
                case 9:
                    str3 = str7;
                    str4 = str8;
                    list = (List) b.i(serialDescriptor, 9, (dy4) joaVarArr[9].getValue(), list);
                    i2 |= 512;
                    str8 = str4;
                    str7 = str3;
                case 10:
                    str3 = str7;
                    str4 = str8;
                    l3 = (Long) b.i(serialDescriptor, 10, lkb.a, l3);
                    i2 |= 1024;
                    str8 = str4;
                    str7 = str3;
                case 11:
                    str3 = str7;
                    str4 = str8;
                    l2 = (Long) b.i(serialDescriptor, 11, lkb.a, l2);
                    i2 |= a.o;
                    str8 = str4;
                    str7 = str3;
                case 12:
                    str3 = str7;
                    str4 = str8;
                    str5 = (String) b.i(serialDescriptor, 12, uhi.a, str5);
                    i2 |= 4096;
                    str8 = str4;
                    str7 = str3;
                case 13:
                    str3 = str7;
                    str4 = str8;
                    str6 = (String) b.i(serialDescriptor, 13, uhi.a, str6);
                    i2 |= 8192;
                    str8 = str4;
                    str7 = str3;
                case 14:
                    str3 = str7;
                    z2 = b.B(serialDescriptor, 14);
                    i2 |= 16384;
                    str7 = str3;
                case 15:
                    str3 = str7;
                    z3 = b.B(serialDescriptor, 15);
                    i2 |= 32768;
                    str7 = str3;
                case 16:
                    str4 = str8;
                    str3 = str7;
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 16, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i2 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    str8 = str4;
                    str7 = str3;
                case 17:
                    str = str8;
                    z4 = b.B(serialDescriptor, 17);
                    i = 131072;
                    i2 |= i;
                    str8 = str;
                case 18:
                    str = str8;
                    str10 = b.n(serialDescriptor, 18);
                    i = 262144;
                    i2 |= i;
                    str8 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Long l4 = l2;
        b.c(serialDescriptor);
        return new Manager(i2, i3, str9, str7, str8, sport, team, country, managerPerformance, num, list, l3, l4, str5, str6, z2, z3, fieldTranslations, z4, str10, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Manager value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Manager.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
