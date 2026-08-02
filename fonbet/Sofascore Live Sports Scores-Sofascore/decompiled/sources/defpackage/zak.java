package defpackage;

import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zak implements KSerializer {
    public static final zak b = new zak();
    public final /* synthetic */ qq3 a = new qq3("kotlin.Unit", Unit.a);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        this.a.deserialize(decoder);
        return Unit.a;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Unit unit = (Unit) obj;
        encoder.getClass();
        unit.getClass();
        this.a.serialize(encoder, unit);
    }
}
