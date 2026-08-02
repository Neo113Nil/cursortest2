package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Point2D$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/Coordinates.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/Coordinates;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/Coordinates;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/Coordinates;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Coordinates$$serializer implements iw8 {

    @NotNull
    public static final Coordinates$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Coordinates$$serializer coordinates$$serializer = new Coordinates$$serializer();
        INSTANCE = coordinates$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.Coordinates", coordinates$$serializer, 4);
        uyeVar.j("start", false);
        uyeVar.j(TtmlNode.END, false);
        uyeVar.j("goal", false);
        uyeVar.j("block", false);
        descriptor = uyeVar;
    }

    private Coordinates$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        Point2D$$serializer point2D$$serializer = Point2D$$serializer.INSTANCE;
        return new KSerializer[]{point2D$$serializer, l98.W(point2D$$serializer), l98.W(point2D$$serializer), l98.W(point2D$$serializer)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Coordinates deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Point2D point2D = null;
        Point2D point2D2 = null;
        Point2D point2D3 = null;
        Point2D point2D4 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                point2D = (Point2D) b.w(serialDescriptor, 0, Point2D$$serializer.INSTANCE, point2D);
                i |= 1;
            } else if (o == 1) {
                point2D2 = (Point2D) b.i(serialDescriptor, 1, Point2D$$serializer.INSTANCE, point2D2);
                i |= 2;
            } else if (o == 2) {
                point2D3 = (Point2D) b.i(serialDescriptor, 2, Point2D$$serializer.INSTANCE, point2D3);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                point2D4 = (Point2D) b.i(serialDescriptor, 3, Point2D$$serializer.INSTANCE, point2D4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new Coordinates(i, point2D, point2D2, point2D3, point2D4, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Coordinates value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Coordinates.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
