package defpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ihb implements KSerializer {
    public static final ihb a = new ihb();
    public static final g7f b = aik.g("kotlinx.datetime.LocalDateTime", d7f.n);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        chb chbVar = ehb.Companion;
        String z = decoder.z();
        ghb ghbVar = dhb.a;
        chbVar.getClass();
        z.getClass();
        ghbVar.getClass();
        try {
            String obj = z.toString();
            obj.getClass();
            return new ehb(LocalDateTime.parse(vha.G(12, obj.toString())));
        } catch (DateTimeParseException e) {
            throw new gk4(e);
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ehb ehbVar = (ehb) obj;
        encoder.getClass();
        ehbVar.getClass();
        encoder.F(ehbVar.toString());
    }
}
