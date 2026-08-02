package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.c88;
import defpackage.iw8;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/VenueStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/VenueStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/VenueStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/VenueStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class VenueStatistics$$serializer implements iw8 {

    @NotNull
    public static final VenueStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        VenueStatistics$$serializer venueStatistics$$serializer = new VenueStatistics$$serializer();
        INSTANCE = venueStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.VenueStatistics", venueStatistics$$serializer, 8);
        uyeVar.j("totalMatches", false);
        uyeVar.j("homeTeamGoalsScored", false);
        uyeVar.j("awayTeamGoalsScored", false);
        uyeVar.j("avgRedCardsPerGame", false);
        uyeVar.j("avgCornerKicksPerGame", false);
        uyeVar.j("homeTeamWinsPercentage", false);
        uyeVar.j("awayTeamWinsPercentage", false);
        uyeVar.j("drawsPercentage", false);
        descriptor = uyeVar;
    }

    private VenueStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        c88 c88Var = c88.a;
        KSerializer W = l98.W(c88Var);
        KSerializer W2 = l98.W(c88Var);
        KSerializer W3 = l98.W(c88Var);
        KSerializer W4 = l98.W(c88Var);
        KSerializer W5 = l98.W(c88Var);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, W, W2, W3, W4, W5};
    }

    @Override // defpackage.dy4
    @NotNull
    public final VenueStatistics deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        VenueStatistics venueStatistics = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Float f5 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
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
                    f = (Float) b.i(serialDescriptor, 3, c88.a, f);
                    i |= 8;
                    break;
                case 4:
                    f2 = (Float) b.i(serialDescriptor, 4, c88.a, f2);
                    i |= 16;
                    break;
                case 5:
                    f3 = (Float) b.i(serialDescriptor, 5, c88.a, f3);
                    i |= 32;
                    break;
                case 6:
                    f4 = (Float) b.i(serialDescriptor, 6, c88.a, f4);
                    i |= 64;
                    break;
                case 7:
                    f5 = (Float) b.i(serialDescriptor, 7, c88.a, f5);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return venueStatistics;
            }
            venueStatistics = null;
        }
        b.c(serialDescriptor);
        return new VenueStatistics(i, i2, i3, i4, f, f2, f3, f4, f5, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull VenueStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        VenueStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
