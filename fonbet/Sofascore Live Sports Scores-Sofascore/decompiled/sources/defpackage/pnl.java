package defpackage;

import java.time.YearMonth;
import java.time.format.DateTimeParseException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pnl implements KSerializer {
    public static final pnl a = new pnl();
    public static final g7f b = aik.g("kotlinx.datetime.YearMonth", d7f.n);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        gnl gnlVar = hnl.Companion;
        String z = decoder.z();
        mqi mqiVar = nnl.b;
        d3 d3Var = (d3) mqiVar.getValue();
        gnlVar.getClass();
        z.getClass();
        d3Var.getClass();
        if (d3Var != ((d3) mqiVar.getValue())) {
            return (hnl) d3Var.c(z);
        }
        try {
            String obj = z.toString();
            obj.getClass();
            return new hnl(YearMonth.parse(vha.G(3, obj.toString())));
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
        hnl hnlVar = (hnl) obj;
        encoder.getClass();
        hnlVar.getClass();
        encoder.F(hnlVar.toString());
    }
}
