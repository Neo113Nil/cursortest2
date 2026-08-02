package com.sofascore.model.crowdsourcing;

import com.ironsource.U3;
import com.sofascore.model.crowdsourcing.EventSuggest;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.lkb;
import defpackage.uf3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/crowdsourcing/EventSuggest.StartDateSuggest.$serializer", "Liw8;", "Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/crowdsourcing/EventSuggest$StartDateSuggest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class EventSuggest$StartDateSuggest$$serializer implements iw8 {

    @NotNull
    public static final EventSuggest$StartDateSuggest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EventSuggest$StartDateSuggest$$serializer eventSuggest$StartDateSuggest$$serializer = new EventSuggest$StartDateSuggest$$serializer();
        INSTANCE = eventSuggest$StartDateSuggest$$serializer;
        uye uyeVar = new uye("eventStartDateSuggest", eventSuggest$StartDateSuggest$$serializer, 4);
        uyeVar.j("id", false);
        uyeVar.j("status", false);
        uyeVar.j("validated", false);
        uyeVar.j("startDateSuggestTimestamp", false);
        descriptor = uyeVar;
    }

    private EventSuggest$StartDateSuggest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = EventSuggest.StartDateSuggest.$childSerializers;
        return new KSerializer[]{a7a.a, joaVarArr[1].getValue(), gz1.a, lkb.a};
    }

    @Override // defpackage.dy4
    @NotNull
    public final EventSuggest.StartDateSuggest deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = EventSuggest.StartDateSuggest.$childSerializers;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        SuggestStatus suggestStatus = null;
        long j = 0;
        boolean z2 = true;
        while (z2) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z2 = false;
            } else if (o == 0) {
                i2 = b.l(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                suggestStatus = (SuggestStatus) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), suggestStatus);
                i |= 2;
            } else if (o == 2) {
                z = b.B(serialDescriptor, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                j = b.g(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new EventSuggest.StartDateSuggest(i, i2, suggestStatus, z, j, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EventSuggest.StartDateSuggest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        EventSuggest.StartDateSuggest.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
