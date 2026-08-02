package com.sofascore.model.mvvm.model.bettingtips;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/bettingtips/BetBoost.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/bettingtips/BetBoost;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/bettingtips/BetBoost;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/bettingtips/BetBoost;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BetBoost$$serializer implements iw8 {

    @NotNull
    public static final BetBoost$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BetBoost$$serializer betBoost$$serializer = new BetBoost$$serializer();
        INSTANCE = betBoost$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.bettingtips.BetBoost", betBoost$$serializer, 8);
        uyeVar.j("name", false);
        uyeVar.j("betSlipLink", false);
        uyeVar.j("oddsDecimal", false);
        uyeVar.j("unboostedOddsDecimal", false);
        uyeVar.j("oddsFractional", false);
        uyeVar.j("unboostedOddsFractional", false);
        uyeVar.j("betBoostParticipants", false);
        uyeVar.j("id", false);
        descriptor = uyeVar;
    }

    private BetBoost$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = BetBoost.$childSerializers;
        uhi uhiVar = uhi.a;
        c88 c88Var = c88.a;
        return new KSerializer[]{uhiVar, uhiVar, c88Var, c88Var, uhiVar, uhiVar, joaVarArr[6].getValue(), a7a.a};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BetBoost deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = BetBoost.$childSerializers;
        BetBoost betBoost = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.n(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    f = b.s(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    f2 = b.s(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.n(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.n(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.w(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    i2 = b.l(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    yhk.e(o);
                    return betBoost;
            }
            betBoost = null;
        }
        b.c(serialDescriptor);
        return new BetBoost(i, str, str2, f, f2, str3, str4, list, i2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BetBoost value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BetBoost.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
