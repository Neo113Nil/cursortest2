package com.sofascore.model.buzzer;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/buzzer/NetworkBuzzerTile.$serializer", "Liw8;", "Lcom/sofascore/model/buzzer/NetworkBuzzerTile;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/buzzer/NetworkBuzzerTile;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/buzzer/NetworkBuzzerTile;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class NetworkBuzzerTile$$serializer implements iw8 {

    @NotNull
    public static final NetworkBuzzerTile$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        NetworkBuzzerTile$$serializer networkBuzzerTile$$serializer = new NetworkBuzzerTile$$serializer();
        INSTANCE = networkBuzzerTile$$serializer;
        uye uyeVar = new uye("com.sofascore.model.buzzer.NetworkBuzzerTile", networkBuzzerTile$$serializer, 13);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("action", false);
        uyeVar.j("actionValue", false);
        uyeVar.j("eventId", false);
        uyeVar.j("position", false);
        uyeVar.j("imageUrl", false);
        uyeVar.j("sportSlug", false);
        uyeVar.j("isDismissible", false);
        uyeVar.j("text", false);
        uyeVar.j("label", false);
        uyeVar.j("labelBackground", false);
        uyeVar.j("overlay", false);
        descriptor = uyeVar;
    }

    private NetworkBuzzerTile$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(uhiVar), gz1.a, l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final NetworkBuzzerTile deserialize(@NotNull Decoder decoder) {
        int i;
        boolean z;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num = null;
        String str = null;
        String str2 = null;
        boolean z3 = true;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str4 = null;
        Integer num2 = null;
        Integer num3 = null;
        String str5 = null;
        String str6 = null;
        boolean z4 = false;
        while (z3) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    i = i3;
                    z3 = false;
                    i3 = i;
                case 0:
                    z2 = z3;
                    i2 |= 1;
                    i3 = b.l(serialDescriptor, 0);
                    z3 = z2;
                case 1:
                    z2 = z3;
                    i4 = b.l(serialDescriptor, 1);
                    i2 |= 2;
                    z3 = z2;
                case 2:
                    z2 = z3;
                    i5 = b.l(serialDescriptor, 2);
                    i2 |= 4;
                    z3 = z2;
                case 3:
                    z = z3;
                    i = i3;
                    str4 = (String) b.i(serialDescriptor, 3, uhi.a, str4);
                    i2 |= 8;
                    z3 = z;
                    i3 = i;
                case 4:
                    z = z3;
                    i = i3;
                    num2 = (Integer) b.i(serialDescriptor, 4, a7a.a, num2);
                    i2 |= 16;
                    z3 = z;
                    i3 = i;
                case 5:
                    z = z3;
                    i = i3;
                    num3 = (Integer) b.i(serialDescriptor, 5, a7a.a, num3);
                    i2 |= 32;
                    z3 = z;
                    i3 = i;
                case 6:
                    z = z3;
                    i = i3;
                    str5 = (String) b.i(serialDescriptor, 6, uhi.a, str5);
                    i2 |= 64;
                    z3 = z;
                    i3 = i;
                case 7:
                    z = z3;
                    i = i3;
                    str6 = (String) b.i(serialDescriptor, 7, uhi.a, str6);
                    i2 |= 128;
                    z3 = z;
                    i3 = i;
                case 8:
                    z2 = z3;
                    z4 = b.B(serialDescriptor, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z3 = z2;
                case 9:
                    z = z3;
                    i = i3;
                    str3 = (String) b.i(serialDescriptor, 9, uhi.a, str3);
                    i2 |= 512;
                    z3 = z;
                    i3 = i;
                case 10:
                    z = z3;
                    i = i3;
                    str2 = (String) b.i(serialDescriptor, 10, uhi.a, str2);
                    i2 |= 1024;
                    z3 = z;
                    i3 = i;
                case 11:
                    z = z3;
                    i = i3;
                    str = (String) b.i(serialDescriptor, 11, uhi.a, str);
                    i2 |= a.o;
                    z3 = z;
                    i3 = i;
                case 12:
                    z = z3;
                    i = i3;
                    num = (Integer) b.i(serialDescriptor, 12, a7a.a, num);
                    i2 |= 4096;
                    z3 = z;
                    i3 = i;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new NetworkBuzzerTile(i2, i3, i4, i5, str4, num2, num3, str5, str6, z4, str3, str2, str, num, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull NetworkBuzzerTile value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        NetworkBuzzerTile.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
