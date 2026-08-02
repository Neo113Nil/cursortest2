package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/MmaStatisticArea.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/MmaStatisticArea;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/MmaStatisticArea;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/MmaStatisticArea;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class MmaStatisticArea$$serializer implements iw8 {

    @NotNull
    public static final MmaStatisticArea$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MmaStatisticArea$$serializer mmaStatisticArea$$serializer = new MmaStatisticArea$$serializer();
        INSTANCE = mmaStatisticArea$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.MmaStatisticArea", mmaStatisticArea$$serializer, 12);
        uyeVar.j(U3.i.l, false);
        uyeVar.j("head", false);
        uyeVar.j("body", false);
        uyeVar.j("legs", false);
        uyeVar.j("distance", false);
        uyeVar.j("clinch", false);
        uyeVar.j("ground", false);
        uyeVar.j("p1", false);
        uyeVar.j("p3", false);
        uyeVar.j("p4", false);
        uyeVar.j("p5", false);
        uyeVar.j("p6", false);
        descriptor = uyeVar;
    }

    private MmaStatisticArea$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        MmaStatisticClass$$serializer mmaStatisticClass$$serializer = MmaStatisticClass$$serializer.INSTANCE;
        return new KSerializer[]{l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer), l98.W(mmaStatisticClass$$serializer)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final MmaStatisticArea deserialize(@NotNull Decoder decoder) {
        boolean z;
        MmaStatisticClass mmaStatisticClass;
        MmaStatisticClass mmaStatisticClass2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        MmaStatisticClass mmaStatisticClass3 = null;
        MmaStatisticClass mmaStatisticClass4 = null;
        MmaStatisticClass mmaStatisticClass5 = null;
        boolean z2 = true;
        MmaStatisticClass mmaStatisticClass6 = null;
        int i = 0;
        MmaStatisticClass mmaStatisticClass7 = null;
        MmaStatisticClass mmaStatisticClass8 = null;
        MmaStatisticClass mmaStatisticClass9 = null;
        MmaStatisticClass mmaStatisticClass10 = null;
        MmaStatisticClass mmaStatisticClass11 = null;
        MmaStatisticClass mmaStatisticClass12 = null;
        MmaStatisticClass mmaStatisticClass13 = null;
        MmaStatisticClass mmaStatisticClass14 = null;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    mmaStatisticClass2 = mmaStatisticClass3;
                    z2 = false;
                    mmaStatisticClass3 = mmaStatisticClass2;
                case 0:
                    mmaStatisticClass2 = mmaStatisticClass3;
                    mmaStatisticClass7 = (MmaStatisticClass) b.i(serialDescriptor, 0, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass7);
                    i |= 1;
                    z2 = z2;
                    mmaStatisticClass3 = mmaStatisticClass2;
                case 1:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass8 = (MmaStatisticClass) b.i(serialDescriptor, 1, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass8);
                    i |= 2;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 2:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass9 = (MmaStatisticClass) b.i(serialDescriptor, 2, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass9);
                    i |= 4;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 3:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass10 = (MmaStatisticClass) b.i(serialDescriptor, 3, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass10);
                    i |= 8;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 4:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass11 = (MmaStatisticClass) b.i(serialDescriptor, 4, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass11);
                    i |= 16;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 5:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass12 = (MmaStatisticClass) b.i(serialDescriptor, 5, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass12);
                    i |= 32;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 6:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass13 = (MmaStatisticClass) b.i(serialDescriptor, 6, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass13);
                    i |= 64;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 7:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass14 = (MmaStatisticClass) b.i(serialDescriptor, 7, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass14);
                    i |= 128;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 8:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass6 = (MmaStatisticClass) b.i(serialDescriptor, 8, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass6);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 9:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass5 = (MmaStatisticClass) b.i(serialDescriptor, 9, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass5);
                    i |= 512;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 10:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass4 = (MmaStatisticClass) b.i(serialDescriptor, 10, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass4);
                    i |= 1024;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                case 11:
                    z = z2;
                    mmaStatisticClass = mmaStatisticClass7;
                    mmaStatisticClass3 = (MmaStatisticClass) b.i(serialDescriptor, 11, MmaStatisticClass$$serializer.INSTANCE, mmaStatisticClass3);
                    i |= a.o;
                    z2 = z;
                    mmaStatisticClass7 = mmaStatisticClass;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MmaStatisticArea(i, mmaStatisticClass7, mmaStatisticClass8, mmaStatisticClass9, mmaStatisticClass10, mmaStatisticClass11, mmaStatisticClass12, mmaStatisticClass13, mmaStatisticClass14, mmaStatisticClass6, mmaStatisticClass5, mmaStatisticClass4, mmaStatisticClass3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MmaStatisticArea value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        MmaStatisticArea.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
