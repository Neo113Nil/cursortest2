package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.serializers.EventSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p6l implements iw8 {
    public static final p6l a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p6l p6lVar = new p6l();
        a = p6lVar;
        uye uyeVar = new uye("event", p6lVar, 1);
        uyeVar.j("event", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{EventSerializer.INSTANCE};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Event event = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                event = (Event) b.w(serialDescriptor, 0, EventSerializer.INSTANCE, event);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new r6l(i, event);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r6l r6lVar = (r6l) obj;
        encoder.getClass();
        r6lVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.f(serialDescriptor, 0, EventSerializer.INSTANCE, r6lVar.a);
        b.c(serialDescriptor);
    }
}
