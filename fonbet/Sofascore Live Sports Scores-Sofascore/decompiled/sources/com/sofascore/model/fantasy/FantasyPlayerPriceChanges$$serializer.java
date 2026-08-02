package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.FieldTranslations$$serializer;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dy4;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyPlayerPriceChanges.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyPlayerPriceChanges;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyPlayerPriceChanges;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyPlayerPriceChanges;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyPlayerPriceChanges$$serializer implements iw8 {

    @NotNull
    public static final FantasyPlayerPriceChanges$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyPlayerPriceChanges$$serializer fantasyPlayerPriceChanges$$serializer = new FantasyPlayerPriceChanges$$serializer();
        INSTANCE = fantasyPlayerPriceChanges$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyPlayerPriceChanges", fantasyPlayerPriceChanges$$serializer, 10);
        uyeVar.j("playerId", false);
        uyeVar.j("fantasyPlayerId", false);
        uyeVar.j("teamId", false);
        uyeVar.j("shortName", false);
        uyeVar.j("teamNameCode", false);
        uyeVar.j("position", false);
        uyeVar.j("fantasyPlayerFinalPrice", false);
        uyeVar.j("totalPriceChange", false);
        uyeVar.j("priceChanges", false);
        uyeVar.j("fieldTranslations", true);
        descriptor = uyeVar;
    }

    private FantasyPlayerPriceChanges$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FantasyPlayerPriceChanges.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        c88 c88Var = c88.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, uhiVar, uhiVar, uhiVar, c88Var, c88Var, joaVarArr[8].getValue(), l98.W(FieldTranslations$$serializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyPlayerPriceChanges deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FantasyPlayerPriceChanges.$childSerializers;
        float f = 0.0f;
        float f2 = 0.0f;
        FieldTranslations fieldTranslations = null;
        boolean z = true;
        List list = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b.l(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i4 = b.l(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = b.n(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.n(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = b.n(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    f = b.s(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    f2 = b.s(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) b.w(serialDescriptor, 8, (dy4) joaVarArr[8].getValue(), list);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 9, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FantasyPlayerPriceChanges(i, i2, i3, i4, str, str2, str3, f, f2, list, fieldTranslations, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyPlayerPriceChanges value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyPlayerPriceChanges.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
