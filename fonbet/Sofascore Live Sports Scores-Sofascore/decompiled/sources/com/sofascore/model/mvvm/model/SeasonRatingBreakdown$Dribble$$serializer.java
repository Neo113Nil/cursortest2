package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.SeasonRatingBreakdown;
import defpackage.h75;
import defpackage.iw8;
import defpackage.l98;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/SeasonRatingBreakdown.Dribble.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/SeasonRatingBreakdown$Dribble;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class SeasonRatingBreakdown$Dribble$$serializer implements iw8 {

    @NotNull
    public static final SeasonRatingBreakdown$Dribble$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SeasonRatingBreakdown$Dribble$$serializer seasonRatingBreakdown$Dribble$$serializer = new SeasonRatingBreakdown$Dribble$$serializer();
        INSTANCE = seasonRatingBreakdown$Dribble$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.SeasonRatingBreakdown.Dribble", seasonRatingBreakdown$Dribble$$serializer, 3);
        uyeVar.j(U3.i.X, true);
        uyeVar.j("successfulDribblesPerGame", true);
        uyeVar.j("touchesPerGame", true);
        descriptor = uyeVar;
    }

    private SeasonRatingBreakdown$Dribble$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        h75 h75Var = h75.a;
        return new KSerializer[]{l98.W(h75Var), l98.W(h75Var), l98.W(h75Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final SeasonRatingBreakdown.Dribble deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                d = (Double) b.i(serialDescriptor, 0, h75.a, d);
                i |= 1;
            } else if (o == 1) {
                d2 = (Double) b.i(serialDescriptor, 1, h75.a, d2);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                d3 = (Double) b.i(serialDescriptor, 2, h75.a, d3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new SeasonRatingBreakdown.Dribble(i, d, d2, d3, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SeasonRatingBreakdown.Dribble value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        SeasonRatingBreakdown.Dribble.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
