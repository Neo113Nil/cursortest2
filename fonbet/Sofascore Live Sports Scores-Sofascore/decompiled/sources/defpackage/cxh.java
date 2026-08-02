package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cxh {
    @NotNull
    public final <T> KSerializer serializer(@NotNull final KSerializer kSerializer) {
        kSerializer.getClass();
        return new iw8(kSerializer) { // from class: bxh
            public final /* synthetic */ KSerializer a;

            @NotNull
            private final SerialDescriptor descriptor;

            {
                kSerializer.getClass();
                uye uyeVar = new uye("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                uyeVar.j("keys", false);
                uyeVar.j("values", false);
                this.descriptor = uyeVar;
                this.a = kSerializer;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.iw8
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{dxh.c[0].getValue(), new xg0(this.a, 0)};
            }

            @Override // defpackage.dy4
            public final Object deserialize(Decoder decoder) {
                decoder.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                uf3 b = decoder.b(serialDescriptor);
                joa[] joaVarArr = dxh.c;
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                while (z) {
                    int o = b.o(serialDescriptor);
                    if (o == -1) {
                        z = false;
                    } else if (o == 0) {
                        list = (List) b.w(serialDescriptor, 0, (dy4) joaVarArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (o != 1) {
                            yhk.e(o);
                            return null;
                        }
                        list2 = (List) b.w(serialDescriptor, 1, new xg0(this.a, 0), list2);
                        i |= 2;
                    }
                }
                b.c(serialDescriptor);
                return new dxh(i, list, list2);
            }

            @Override // defpackage.dy4
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                dxh dxhVar = (dxh) obj;
                encoder.getClass();
                dxhVar.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                wf3 b = encoder.b(serialDescriptor);
                b.f(serialDescriptor, 0, (KSerializer) dxh.c[0].getValue(), dxhVar.a);
                b.f(serialDescriptor, 1, new xg0(this.a, 0), dxhVar.b);
                b.c(serialDescriptor);
            }

            @Override // defpackage.iw8
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{this.a};
            }
        };
    }
}
