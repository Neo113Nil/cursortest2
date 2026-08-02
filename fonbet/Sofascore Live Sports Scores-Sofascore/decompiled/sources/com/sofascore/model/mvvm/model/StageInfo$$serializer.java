package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dy4;
import defpackage.gz1;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/StageInfo.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/StageInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/StageInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/StageInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class StageInfo$$serializer implements iw8 {

    @NotNull
    public static final StageInfo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StageInfo$$serializer stageInfo$$serializer = new StageInfo$$serializer();
        INSTANCE = stageInfo$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.StageInfo", stageInfo$$serializer, 16);
        uyeVar.j("circuit", false);
        uyeVar.j("circuitCity", false);
        uyeVar.j("circuitCountry", false);
        uyeVar.j("circuitLength", false);
        uyeVar.j("laps", false);
        uyeVar.j("stages", false);
        uyeVar.j("raceDistance", false);
        uyeVar.j("lapRecord", false);
        uyeVar.j("weather", false);
        uyeVar.j("note", false);
        uyeVar.j("formulaOneSprintShootoutRound", false);
        uyeVar.j("formulaOneSprintRace", false);
        uyeVar.j("arrivalCity", false);
        uyeVar.j("departureCity", false);
        uyeVar.j("stageType", false);
        uyeVar.j("borderColor", false);
        descriptor = uyeVar;
    }

    private StageInfo$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = StageInfo.$childSerializers;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        c88 c88Var = c88.a;
        KSerializer W4 = l98.W(c88Var);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{W, W2, W3, W4, l98.W(a7aVar), l98.W(a7aVar), l98.W(c88Var), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(gz1.a), l98.W(uhiVar), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[14].getValue()), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final StageInfo deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Float f;
        Integer num;
        Boolean bool;
        Integer num2;
        String str;
        Float f2;
        Integer num3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = StageInfo.$childSerializers;
        Boolean bool2 = null;
        Integer num4 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        String str6 = null;
        CyclingStageType cyclingStageType = null;
        String str7 = null;
        Float f3 = null;
        Integer num5 = null;
        Integer num6 = null;
        Float f4 = null;
        boolean z = true;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    bool = bool2;
                    num2 = num5;
                    str = str8;
                    z = false;
                    num4 = num4;
                    num5 = num2;
                    str8 = str;
                    bool2 = bool;
                case 0:
                    bool = bool2;
                    num2 = num5;
                    str = (String) b.i(serialDescriptor, 0, uhi.a, str8);
                    i |= 1;
                    num4 = num4;
                    f3 = f3;
                    num5 = num2;
                    str8 = str;
                    bool2 = bool;
                case 1:
                    bool = bool2;
                    f2 = f3;
                    num3 = num5;
                    str9 = (String) b.i(serialDescriptor, 1, uhi.a, str9);
                    i |= 2;
                    str10 = str10;
                    f3 = f2;
                    num5 = num3;
                    bool2 = bool;
                case 2:
                    bool = bool2;
                    num3 = num5;
                    f2 = f3;
                    str10 = (String) b.i(serialDescriptor, 2, uhi.a, str10);
                    i |= 4;
                    f3 = f2;
                    num5 = num3;
                    bool2 = bool;
                case 3:
                    bool = bool2;
                    num3 = num5;
                    f3 = (Float) b.i(serialDescriptor, 3, c88.a, f3);
                    i |= 8;
                    num5 = num3;
                    bool2 = bool;
                case 4:
                    bool = bool2;
                    num5 = (Integer) b.i(serialDescriptor, 4, a7a.a, num5);
                    i |= 16;
                    f3 = f3;
                    bool2 = bool;
                case 5:
                    f = f3;
                    num = num5;
                    num6 = (Integer) b.i(serialDescriptor, 5, a7a.a, num6);
                    i |= 32;
                    f3 = f;
                    num5 = num;
                case 6:
                    f = f3;
                    num = num5;
                    f4 = (Float) b.i(serialDescriptor, 6, c88.a, f4);
                    i |= 64;
                    f3 = f;
                    num5 = num;
                case 7:
                    f = f3;
                    num = num5;
                    str5 = (String) b.i(serialDescriptor, 7, uhi.a, str5);
                    i |= 128;
                    f3 = f;
                    num5 = num;
                case 8:
                    f = f3;
                    num = num5;
                    str3 = (String) b.i(serialDescriptor, 8, uhi.a, str3);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    f3 = f;
                    num5 = num;
                case 9:
                    f = f3;
                    num = num5;
                    str2 = (String) b.i(serialDescriptor, 9, uhi.a, str2);
                    i |= 512;
                    f3 = f;
                    num5 = num;
                case 10:
                    f = f3;
                    num = num5;
                    num4 = (Integer) b.i(serialDescriptor, 10, a7a.a, num4);
                    i |= 1024;
                    f3 = f;
                    num5 = num;
                case 11:
                    f = f3;
                    num = num5;
                    bool2 = (Boolean) b.i(serialDescriptor, 11, gz1.a, bool2);
                    i |= a.o;
                    f3 = f;
                    num5 = num;
                case 12:
                    f = f3;
                    num = num5;
                    str4 = (String) b.i(serialDescriptor, 12, uhi.a, str4);
                    i |= 4096;
                    f3 = f;
                    num5 = num;
                case 13:
                    f = f3;
                    num = num5;
                    str6 = (String) b.i(serialDescriptor, 13, uhi.a, str6);
                    i |= 8192;
                    f3 = f;
                    num5 = num;
                case 14:
                    f = f3;
                    num = num5;
                    cyclingStageType = (CyclingStageType) b.i(serialDescriptor, 14, (dy4) joaVarArr[14].getValue(), cyclingStageType);
                    i |= 16384;
                    f3 = f;
                    num5 = num;
                case 15:
                    f = f3;
                    num = num5;
                    str7 = (String) b.i(serialDescriptor, 15, uhi.a, str7);
                    i |= 32768;
                    f3 = f;
                    num5 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Boolean bool3 = bool2;
        Integer num7 = num5;
        String str11 = str8;
        String str12 = str9;
        String str13 = str10;
        b.c(serialDescriptor);
        return new StageInfo(i, str11, str12, str13, f3, num7, num6, f4, str5, str3, str2, num4, bool3, str4, str6, cyclingStageType, str7, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull StageInfo value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        StageInfo.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
