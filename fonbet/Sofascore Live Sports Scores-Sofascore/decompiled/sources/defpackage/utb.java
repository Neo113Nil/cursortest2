package defpackage;

import com.ironsource.U3;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class utb implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;
    public final /* synthetic */ int c;
    public final m5h d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public utb(final KSerializer kSerializer, final KSerializer kSerializer2, int i) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.c = i;
        final int i2 = 0;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                final int i3 = 1;
                this.d = aik.u("kotlin.Pair", new SerialDescriptor[0], new Function1() { // from class: stb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        KSerializer kSerializer3 = kSerializer2;
                        KSerializer kSerializer4 = kSerializer;
                        vv2 vv2Var = (vv2) obj;
                        switch (i4) {
                            case 0:
                                vv2Var.getClass();
                                SerialDescriptor descriptor = kSerializer4.getDescriptor();
                                km5 km5Var = km5.a;
                                vv2Var.a(U3.i.W, descriptor, km5Var, false);
                                vv2Var.a(U3.i.X, kSerializer3.getDescriptor(), km5Var, false);
                                break;
                            default:
                                vv2Var.getClass();
                                SerialDescriptor descriptor2 = kSerializer4.getDescriptor();
                                km5 km5Var2 = km5.a;
                                vv2Var.a("first", descriptor2, km5Var2, false);
                                vv2Var.a("second", kSerializer3.getDescriptor(), km5Var2, false);
                                break;
                        }
                        return Unit.a;
                    }
                });
                break;
            default:
                this.d = aik.w("kotlin.collections.Map.Entry", nii.h, new SerialDescriptor[0], new Function1() { // from class: stb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        KSerializer kSerializer3 = kSerializer2;
                        KSerializer kSerializer4 = kSerializer;
                        vv2 vv2Var = (vv2) obj;
                        switch (i4) {
                            case 0:
                                vv2Var.getClass();
                                SerialDescriptor descriptor = kSerializer4.getDescriptor();
                                km5 km5Var = km5.a;
                                vv2Var.a(U3.i.W, descriptor, km5Var, false);
                                vv2Var.a(U3.i.X, kSerializer3.getDescriptor(), km5Var, false);
                                break;
                            default:
                                vv2Var.getClass();
                                SerialDescriptor descriptor2 = kSerializer4.getDescriptor();
                                km5 km5Var2 = km5.a;
                                vv2Var.a("first", descriptor2, km5Var2, false);
                                vv2Var.a("second", kSerializer3.getDescriptor(), km5Var2, false);
                                break;
                        }
                        return Unit.a;
                    }
                });
                break;
        }
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        Object ttbVar;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        uf3 b = decoder.b(descriptor);
        Object obj = fcp.j;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int o = b.o(getDescriptor());
            if (o == -1) {
                if (obj2 == obj) {
                    throw new v5h("Element 'key' is missing");
                }
                if (obj3 == obj) {
                    throw new v5h("Element 'value' is missing");
                }
                switch (this.c) {
                    case 0:
                        ttbVar = new ttb(obj2, obj3);
                        break;
                    default:
                        ttbVar = new Pair(obj2, obj3);
                        break;
                }
                b.c(descriptor);
                return ttbVar;
            }
            if (o == 0) {
                obj2 = b.w(getDescriptor(), 0, this.a, null);
            } else {
                if (o != 1) {
                    throw new v5h(ljg.j(o, "Invalid index: "));
                }
                obj3 = b.w(getDescriptor(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        int i = this.c;
        return this.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        encoder.getClass();
        wf3 b = encoder.b(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                key = pair.a;
                break;
        }
        b.f(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                value = pair2.b;
                break;
        }
        b.f(descriptor2, 1, kSerializer2, value);
        b.c(getDescriptor());
    }

    public utb(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }
}
