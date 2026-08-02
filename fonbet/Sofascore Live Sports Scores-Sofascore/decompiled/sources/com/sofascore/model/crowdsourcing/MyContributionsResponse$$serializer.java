package com.sofascore.model.crowdsourcing;

import com.ironsource.U3;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.ErrorResponse$$serializer;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.HeadResponse$$serializer;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/crowdsourcing/MyContributionsResponse.$serializer", "Liw8;", "Lcom/sofascore/model/crowdsourcing/MyContributionsResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/crowdsourcing/MyContributionsResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/crowdsourcing/MyContributionsResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class MyContributionsResponse$$serializer implements iw8 {

    @NotNull
    public static final MyContributionsResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MyContributionsResponse$$serializer myContributionsResponse$$serializer = new MyContributionsResponse$$serializer();
        INSTANCE = myContributionsResponse$$serializer;
        uye uyeVar = new uye("com.sofascore.model.crowdsourcing.MyContributionsResponse", myContributionsResponse$$serializer, 6);
        uyeVar.j("head", true);
        uyeVar.j("error", true);
        uyeVar.j("startDateSuggest", false);
        uyeVar.j("statusSuggest", false);
        uyeVar.j("liveIncidentSuggests", false);
        uyeVar.j("finalScoreSuggest", false);
        descriptor = uyeVar;
    }

    private MyContributionsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = MyContributionsResponse.$childSerializers;
        return new KSerializer[]{l98.W(HeadResponse$$serializer.INSTANCE), l98.W(ErrorResponse$$serializer.INSTANCE), l98.W(EventSuggest$StartDateSuggest$$serializer.INSTANCE), l98.W(EventSuggest$StatusSuggest$$serializer.INSTANCE), joaVarArr[4].getValue(), l98.W(EventSuggest$FinalScoreSuggest$$serializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final MyContributionsResponse deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = MyContributionsResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        HeadResponse headResponse = null;
        ErrorResponse errorResponse = null;
        EventSuggest.StartDateSuggest startDateSuggest = null;
        EventSuggest.StatusSuggest statusSuggest = null;
        List list = null;
        EventSuggest.FinalScoreSuggest finalScoreSuggest = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    headResponse = (HeadResponse) b.i(serialDescriptor, 0, HeadResponse$$serializer.INSTANCE, headResponse);
                    i |= 1;
                    break;
                case 1:
                    errorResponse = (ErrorResponse) b.i(serialDescriptor, 1, ErrorResponse$$serializer.INSTANCE, errorResponse);
                    i |= 2;
                    break;
                case 2:
                    startDateSuggest = (EventSuggest.StartDateSuggest) b.i(serialDescriptor, 2, EventSuggest$StartDateSuggest$$serializer.INSTANCE, startDateSuggest);
                    i |= 4;
                    break;
                case 3:
                    statusSuggest = (EventSuggest.StatusSuggest) b.i(serialDescriptor, 3, EventSuggest$StatusSuggest$$serializer.INSTANCE, statusSuggest);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    finalScoreSuggest = (EventSuggest.FinalScoreSuggest) b.i(serialDescriptor, 5, EventSuggest$FinalScoreSuggest$$serializer.INSTANCE, finalScoreSuggest);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MyContributionsResponse(i, headResponse, errorResponse, startDateSuggest, statusSuggest, list, finalScoreSuggest, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MyContributionsResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        MyContributionsResponse.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
