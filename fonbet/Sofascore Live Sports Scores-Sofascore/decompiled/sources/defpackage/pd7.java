package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class pd7 implements iw8 {
    public static final pd7 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        pd7 pd7Var = new pd7();
        a = pd7Var;
        uye uyeVar = new uye("com.sofascore.results.fantasy.ui.model.FantasyPlayerMissingData", pd7Var, 3);
        uyeVar.j("type", false);
        uyeVar.j("reason", false);
        uyeVar.j("description", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = FantasyPlayerMissingData.d;
        return new KSerializer[]{joaVarArr[0].getValue(), joaVarArr[1].getValue(), l98.W(uhi.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyPlayerMissingData.d;
        boolean z = true;
        int i = 0;
        sd7 sd7Var = null;
        rd7 rd7Var = null;
        String str = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                sd7Var = (sd7) b.w(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), sd7Var);
                i |= 1;
            } else if (o == 1) {
                rd7Var = (rd7) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), rd7Var);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                str = (String) b.i(serialDescriptor, 2, uhi.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new FantasyPlayerMissingData(i, sd7Var, rd7Var, str);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyPlayerMissingData fantasyPlayerMissingData = (FantasyPlayerMissingData) obj;
        encoder.getClass();
        fantasyPlayerMissingData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        joa[] joaVarArr = FantasyPlayerMissingData.d;
        b.f(serialDescriptor, 0, (KSerializer) joaVarArr[0].getValue(), fantasyPlayerMissingData.a);
        b.f(serialDescriptor, 1, (KSerializer) joaVarArr[1].getValue(), fantasyPlayerMissingData.b);
        b.h(serialDescriptor, 2, uhi.a, fantasyPlayerMissingData.c);
        b.c(serialDescriptor);
    }
}
