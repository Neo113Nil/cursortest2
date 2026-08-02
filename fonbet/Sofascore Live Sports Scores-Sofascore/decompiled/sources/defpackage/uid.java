package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uid implements KSerializer {
    public final KSerializer a;
    public final l5h b;

    public uid(KSerializer kSerializer) {
        kSerializer.getClass();
        this.a = kSerializer;
        this.b = new l5h(kSerializer.getDescriptor());
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        if (decoder.C()) {
            return decoder.y(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && uid.class == obj.getClass() && Intrinsics.c(this.a, ((uid) obj).a);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        if (obj != null) {
            encoder.l(this.a, obj);
        } else {
            encoder.p();
        }
    }
}
