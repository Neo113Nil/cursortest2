package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Stage$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s6l implements iw8 {
    public static final s6l a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s6l s6lVar = new s6l();
        a = s6lVar;
        uye uyeVar = new uye("stage", s6lVar, 1);
        uyeVar.j("stage", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{Stage$$serializer.INSTANCE};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Stage stage = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                stage = (Stage) b.w(serialDescriptor, 0, Stage$$serializer.INSTANCE, stage);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new u6l(i, stage);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u6l u6lVar = (u6l) obj;
        encoder.getClass();
        u6lVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.f(serialDescriptor, 0, Stage$$serializer.INSTANCE, u6lVar.a);
        b.c(serialDescriptor);
    }
}
