package com.sofascore.model.odds;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Stage$$serializer;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/odds/ProviderOdds.$serializer", "Liw8;", "Lcom/sofascore/model/odds/ProviderOdds;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/odds/ProviderOdds;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/odds/ProviderOdds;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class ProviderOdds$$serializer implements iw8 {

    @NotNull
    public static final ProviderOdds$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ProviderOdds$$serializer providerOdds$$serializer = new ProviderOdds$$serializer();
        INSTANCE = providerOdds$$serializer;
        uye uyeVar = new uye("com.sofascore.model.odds.ProviderOdds", providerOdds$$serializer, 14);
        uyeVar.j("id", true);
        uyeVar.j("sourceId", false);
        uyeVar.j("isLive", false);
        uyeVar.j("choiceGroup", false);
        uyeVar.j("marketName", false);
        uyeVar.j("structureType", false);
        uyeVar.j("marketId", false);
        uyeVar.j("fid", false);
        uyeVar.j("choices", false);
        uyeVar.j("marketGroup", true);
        uyeVar.j("marketPeriod", true);
        uyeVar.j("event", false);
        uyeVar.j("stage", false);
        uyeVar.j("shouldReverseOdds", true);
        descriptor = uyeVar;
    }

    private ProviderOdds$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = ProviderOdds.$childSerializers;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, l98.W(a7aVar), gz1Var, l98.W(uhiVar), uhiVar, a7aVar, a7aVar, l98.W(a7aVar), joaVarArr[8].getValue(), uhiVar, uhiVar, l98.W(EventSerializer.INSTANCE), l98.W(Stage$$serializer.INSTANCE), gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final ProviderOdds deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        joa[] joaVarArr3;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = ProviderOdds.$childSerializers;
        Stage stage = null;
        Event event = null;
        List list = null;
        boolean z2 = true;
        Integer num = null;
        int i = 0;
        int i2 = 0;
        Integer num2 = null;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        int i3 = 0;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        boolean z4 = false;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    joaVarArr2 = joaVarArr;
                    z2 = false;
                    joaVarArr = joaVarArr2;
                case 0:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 1:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    num2 = (Integer) b.i(serialDescriptor, 1, a7a.a, num2);
                    i |= 2;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 2:
                    joaVarArr2 = joaVarArr;
                    z3 = b.B(serialDescriptor, 2);
                    i |= 4;
                    joaVarArr = joaVarArr2;
                case 3:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    str = (String) b.i(serialDescriptor, 3, uhi.a, str);
                    i |= 8;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 4:
                    joaVarArr2 = joaVarArr;
                    str2 = b.n(serialDescriptor, 4);
                    i |= 16;
                    joaVarArr = joaVarArr2;
                case 5:
                    joaVarArr2 = joaVarArr;
                    i3 = b.l(serialDescriptor, 5);
                    i |= 32;
                    joaVarArr = joaVarArr2;
                case 6:
                    joaVarArr2 = joaVarArr;
                    i4 = b.l(serialDescriptor, 6);
                    i |= 64;
                    joaVarArr = joaVarArr2;
                case 7:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    num = (Integer) b.i(serialDescriptor, 7, a7a.a, num);
                    i |= 128;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 8:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    list = (List) b.w(serialDescriptor, 8, (dy4) joaVarArr3[8].getValue(), list);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 9:
                    joaVarArr2 = joaVarArr;
                    str3 = b.n(serialDescriptor, 9);
                    i |= 512;
                    joaVarArr = joaVarArr2;
                case 10:
                    joaVarArr2 = joaVarArr;
                    str4 = b.n(serialDescriptor, 10);
                    i |= 1024;
                    joaVarArr = joaVarArr2;
                case 11:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    event = (Event) b.i(serialDescriptor, 11, EventSerializer.INSTANCE, event);
                    i |= a.o;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 12:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    stage = (Stage) b.i(serialDescriptor, 12, Stage$$serializer.INSTANCE, stage);
                    i |= 4096;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 13:
                    joaVarArr2 = joaVarArr;
                    z4 = b.B(serialDescriptor, 13);
                    i |= 8192;
                    joaVarArr = joaVarArr2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ProviderOdds(i, i2, num2, z3, str, str2, i3, i4, num, list, str3, str4, event, stage, z4, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ProviderOdds value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        ProviderOdds.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
