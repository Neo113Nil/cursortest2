package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class zga implements KSerializer {

    @NotNull
    private final KSerializer tSerializer;

    public zga(KSerializer kSerializer) {
        kSerializer.getClass();
        this.tSerializer = kSerializer;
    }

    @Override // defpackage.dy4
    public final Object deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        mfa j = ufa.j(decoder);
        return j.d().a(this.tSerializer, transformDeserialize(j.j()));
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, Object obj) {
        encoder.getClass();
        vfa k = ufa.k(encoder);
        k.z(transformSerialize(hda.U(k.d(), obj, this.tSerializer)));
    }

    public abstract b transformDeserialize(b bVar);

    @NotNull
    public b transformSerialize(@NotNull b bVar) {
        bVar.getClass();
        return bVar;
    }
}
