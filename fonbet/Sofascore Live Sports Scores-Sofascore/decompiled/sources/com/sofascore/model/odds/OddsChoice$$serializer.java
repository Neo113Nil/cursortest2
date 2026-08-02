package com.sofascore.model.odds;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/odds/OddsChoice.$serializer", "Liw8;", "Lcom/sofascore/model/odds/OddsChoice;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/odds/OddsChoice;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/odds/OddsChoice;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class OddsChoice$$serializer implements iw8 {

    @NotNull
    public static final OddsChoice$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        OddsChoice$$serializer oddsChoice$$serializer = new OddsChoice$$serializer();
        INSTANCE = oddsChoice$$serializer;
        uye uyeVar = new uye("com.sofascore.model.odds.OddsChoice", oddsChoice$$serializer, 10);
        uyeVar.j("fractionalValue", false);
        uyeVar.j("initialFractionalValue", false);
        uyeVar.j("sourceId", false);
        uyeVar.j("name", false);
        uyeVar.j("reversibleName", false);
        uyeVar.j("winning", true);
        uyeVar.j("change", true);
        uyeVar.j("slipContent", false);
        uyeVar.j("team", true);
        uyeVar.j("id", true);
        descriptor = uyeVar;
    }

    private OddsChoice$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = OddsChoice.$childSerializers;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{W, W2, l98.W(a7aVar), l98.W(uhiVar), l98.W(uhiVar), gz1.a, a7aVar, l98.W(uhiVar), l98.W((KSerializer) joaVarArr[8].getValue()), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final OddsChoice deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = OddsChoice.$childSerializers;
        Integer num = null;
        Team team = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        boolean z2 = false;
        int i2 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    joaVarArr2 = joaVarArr;
                    str2 = (String) b.i(serialDescriptor, 0, uhi.a, str2);
                    i |= 1;
                    break;
                case 1:
                    joaVarArr2 = joaVarArr;
                    str3 = (String) b.i(serialDescriptor, 1, uhi.a, str3);
                    i |= 2;
                    break;
                case 2:
                    joaVarArr2 = joaVarArr;
                    num2 = (Integer) b.i(serialDescriptor, 2, a7a.a, num2);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr2 = joaVarArr;
                    str4 = (String) b.i(serialDescriptor, 3, uhi.a, str4);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr2 = joaVarArr;
                    str5 = (String) b.i(serialDescriptor, 4, uhi.a, str5);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr2 = joaVarArr;
                    z2 = b.B(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr2 = joaVarArr;
                    i2 = b.l(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    joaVarArr2 = joaVarArr;
                    str = (String) b.i(serialDescriptor, 7, uhi.a, str);
                    i |= 128;
                    break;
                case 8:
                    joaVarArr2 = joaVarArr;
                    team = (Team) b.i(serialDescriptor, 8, (dy4) joaVarArr2[8].getValue(), team);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr2 = joaVarArr;
                    num = (Integer) b.i(serialDescriptor, 9, a7a.a, num);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr = joaVarArr2;
        }
        b.c(serialDescriptor);
        return new OddsChoice(i, str2, str3, num2, str4, str5, z2, i2, str, team, num, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull OddsChoice value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        OddsChoice.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
