package defpackage;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class aib implements KSerializer {
    public static final aib a = new aib();
    public static final g7f b = aik.g("kotlinx.datetime.LocalTime", d7f.n);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        vhb vhbVar = whb.Companion;
        String z = decoder.z();
        mqi mqiVar = zhb.a;
        yhb yhbVar = (yhb) mqiVar.getValue();
        vhbVar.getClass();
        z.getClass();
        yhbVar.getClass();
        if (yhbVar != ((yhb) mqiVar.getValue())) {
            return (whb) yhbVar.c(z);
        }
        try {
            return new whb(LocalTime.parse(z));
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
        whb whbVar = (whb) obj;
        encoder.getClass();
        whbVar.getClass();
        encoder.F(whbVar.toString());
    }
}
