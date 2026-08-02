package defpackage;

import java.time.format.DateTimeFormatter;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class whk implements KSerializer {
    public static final whk a = new whk();
    public static final g7f b = aik.g("kotlinx.datetime.UtcOffset", d7f.n);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        mhk mhkVar = nhk.Companion;
        String z = decoder.z();
        mqi mqiVar = rhk.a;
        qhk qhkVar = (qhk) mqiVar.getValue();
        mhkVar.getClass();
        z.getClass();
        qhkVar.getClass();
        if (qhkVar == ((qhk) mqiVar.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) thk.a.getValue();
            dateTimeFormatter.getClass();
            return thk.b(z, dateTimeFormatter);
        }
        if (qhkVar == ((qhk) rhk.b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) thk.b.getValue();
            dateTimeFormatter2.getClass();
            return thk.b(z, dateTimeFormatter2);
        }
        if (qhkVar != ((qhk) rhk.c.getValue())) {
            return (nhk) qhkVar.c(z);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) thk.c.getValue();
        dateTimeFormatter3.getClass();
        return thk.b(z, dateTimeFormatter3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nhk nhkVar = (nhk) obj;
        encoder.getClass();
        nhkVar.getClass();
        encoder.F(nhkVar.toString());
    }
}
