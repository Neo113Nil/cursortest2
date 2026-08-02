package com.sofascore.model.firebase;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/firebase/SurveyConfigData.$serializer", "Liw8;", "Lcom/sofascore/model/firebase/SurveyConfigData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/firebase/SurveyConfigData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/firebase/SurveyConfigData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class SurveyConfigData$$serializer implements iw8 {

    @NotNull
    public static final SurveyConfigData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SurveyConfigData$$serializer surveyConfigData$$serializer = new SurveyConfigData$$serializer();
        INSTANCE = surveyConfigData$$serializer;
        uye uyeVar = new uye("com.sofascore.model.firebase.SurveyConfigData", surveyConfigData$$serializer, 16);
        uyeVar.j("id", false);
        uyeVar.j("url", false);
        uyeVar.j("supportedCountries", false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j("endTimestamp", false);
        uyeVar.j("andPreconditions", false);
        uyeVar.j("orPreconditions", false);
        uyeVar.j("minDaysSinceInstall", false);
        uyeVar.j("maxDaysSinceInstall", false);
        uyeVar.j("mustBeLoggedIn", false);
        uyeVar.j("usageStreakMinDays", false);
        uyeVar.j("showAfterXSeconds", false);
        uyeVar.j("showOnScreenName", false);
        uyeVar.j("showOnTabName", false);
        uyeVar.j("showOnSelectedSport", false);
        uyeVar.j("openInBrowser", false);
        descriptor = uyeVar;
    }

    private SurveyConfigData$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = SurveyConfigData.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W((KSerializer) joaVarArr[2].getValue());
        lkb lkbVar = lkb.a;
        KSerializer W2 = l98.W(lkbVar);
        KSerializer W3 = l98.W(lkbVar);
        KSerializer W4 = l98.W((KSerializer) joaVarArr[5].getValue());
        KSerializer W5 = l98.W((KSerializer) joaVarArr[6].getValue());
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W(a7aVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, uhiVar, W, W2, W3, W4, W5, W6, W7, l98.W(gz1Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(gz1Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final SurveyConfigData deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Long l;
        Long l2;
        Integer num;
        Long l3;
        Long l4;
        Long l5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = SurveyConfigData.$childSerializers;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        Integer num4 = null;
        String str = null;
        Integer num5 = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
        Long l6 = null;
        Long l7 = null;
        List list = null;
        List list2 = null;
        boolean z = true;
        int i2 = 0;
        String str4 = null;
        List list3 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num2;
                    l3 = l7;
                    z = false;
                    l7 = l3;
                    num2 = num;
                case 0:
                    num = num2;
                    l4 = l6;
                    l3 = l7;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    l6 = l4;
                    l7 = l3;
                    num2 = num;
                case 1:
                    num = num2;
                    l5 = l6;
                    str4 = b.n(serialDescriptor, 1);
                    i |= 2;
                    l6 = l5;
                    num2 = num;
                case 2:
                    num = num2;
                    l3 = l7;
                    l4 = l6;
                    list3 = (List) b.i(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list3);
                    i |= 4;
                    l6 = l4;
                    l7 = l3;
                    num2 = num;
                case 3:
                    num = num2;
                    l3 = l7;
                    l6 = (Long) b.i(serialDescriptor, 3, lkb.a, l6);
                    i |= 8;
                    l7 = l3;
                    num2 = num;
                case 4:
                    l5 = l6;
                    num = num2;
                    l7 = (Long) b.i(serialDescriptor, 4, lkb.a, l7);
                    i |= 16;
                    l6 = l5;
                    num2 = num;
                case 5:
                    l = l6;
                    l2 = l7;
                    list = (List) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list);
                    i |= 32;
                    l6 = l;
                    l7 = l2;
                case 6:
                    l = l6;
                    l2 = l7;
                    list2 = (List) b.i(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list2);
                    i |= 64;
                    l6 = l;
                    l7 = l2;
                case 7:
                    l = l6;
                    l2 = l7;
                    num5 = (Integer) b.i(serialDescriptor, 7, a7a.a, num5);
                    i |= 128;
                    l6 = l;
                    l7 = l2;
                case 8:
                    l = l6;
                    l2 = l7;
                    num4 = (Integer) b.i(serialDescriptor, 8, a7a.a, num4);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    l6 = l;
                    l7 = l2;
                case 9:
                    l = l6;
                    l2 = l7;
                    bool = (Boolean) b.i(serialDescriptor, 9, gz1.a, bool);
                    i |= 512;
                    l6 = l;
                    l7 = l2;
                case 10:
                    l = l6;
                    l2 = l7;
                    num3 = (Integer) b.i(serialDescriptor, 10, a7a.a, num3);
                    i |= 1024;
                    l6 = l;
                    l7 = l2;
                case 11:
                    l = l6;
                    l2 = l7;
                    num2 = (Integer) b.i(serialDescriptor, 11, a7a.a, num2);
                    i |= a.o;
                    l6 = l;
                    l7 = l2;
                case 12:
                    l = l6;
                    l2 = l7;
                    str = (String) b.i(serialDescriptor, 12, uhi.a, str);
                    i |= 4096;
                    l6 = l;
                    l7 = l2;
                case 13:
                    l = l6;
                    l2 = l7;
                    str2 = (String) b.i(serialDescriptor, 13, uhi.a, str2);
                    i |= 8192;
                    l6 = l;
                    l7 = l2;
                case 14:
                    l = l6;
                    l2 = l7;
                    str3 = (String) b.i(serialDescriptor, 14, uhi.a, str3);
                    i |= 16384;
                    l6 = l;
                    l7 = l2;
                case 15:
                    l = l6;
                    l2 = l7;
                    bool2 = (Boolean) b.i(serialDescriptor, 15, gz1.a, bool2);
                    i |= 32768;
                    l6 = l;
                    l7 = l2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num6 = num2;
        b.c(serialDescriptor);
        return new SurveyConfigData(i, i2, str4, list3, l6, l7, list, list2, num5, num4, bool, num3, num6, str, str2, str3, bool2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SurveyConfigData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        SurveyConfigData.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
