package com.adsbynimbus.google;

import com.ironsource.U3;
import defpackage.iw8;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/adsbynimbus/google/RenderEvent.$serializer", "Liw8;", "Lcom/adsbynimbus/google/RenderEvent;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/adsbynimbus/google/RenderEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/adsbynimbus/google/RenderEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "google_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@wx4
/* loaded from: classes.dex */
public final class RenderEvent$$serializer implements iw8 {
    public static final RenderEvent$$serializer a;
    private static final /* synthetic */ uye descriptor;

    static {
        RenderEvent$$serializer renderEvent$$serializer = new RenderEvent$$serializer();
        a = renderEvent$$serializer;
        uye uyeVar = new uye("com.adsbynimbus.google.RenderEvent", renderEvent$$serializer, 2);
        uyeVar.j("na_id", false);
        uyeVar.j("ga_click", false);
        descriptor = uyeVar;
    }

    private RenderEvent$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public RenderEvent deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        uf3 b = decoder.b(descriptor2);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int o = b.o(descriptor2);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b.n(descriptor2, 0);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                str2 = b.n(descriptor2, 1);
                i |= 2;
            }
        }
        b.c(descriptor2);
        return new RenderEvent(i, str, str2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull RenderEvent value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        wf3 b = encoder.b(descriptor2);
        RenderEvent.write$Self$google_release(value, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.iw8
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
