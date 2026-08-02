package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g1d implements KSerializer {
    public final /* synthetic */ int a;
    public final KSerializer b;
    public final SerialDescriptor c;

    public g1d(KSerializer kSerializer, int i) {
        this.a = i;
        kSerializer.getClass();
        switch (i) {
            case 1:
                KSerializer serializer = dxh.Companion.serializer(kSerializer);
                this.b = serializer;
                this.c = serializer.getDescriptor();
                break;
            default:
                this.b = kSerializer;
                mha kind = kSerializer.getDescriptor().getKind();
                this.c = kind instanceof d7f ? aik.g("kotlinx.coroutines.flow.MutableStateFlow", (d7f) kind) : aik.j("kotlinx.coroutines.flow.MutableStateFlow", kSerializer.getDescriptor());
                break;
        }
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        int i = this.a;
        KSerializer kSerializer = this.b;
        switch (i) {
            case 0:
                decoder.getClass();
                return gdi.a(decoder.y(kSerializer));
            default:
                decoder.getClass();
                dxh dxhVar = (dxh) decoder.y(kSerializer);
                List list = dxhVar.a;
                int size = list.size();
                List list2 = dxhVar.b;
                if (size != list2.size()) {
                    a70.p("Failed requirement.");
                    return null;
                }
                SparseArray sparseArray = new SparseArray(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sparseArray.append(((Number) list.get(i2)).intValue(), list2.get(i2));
                }
                return sparseArray;
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        int i = this.a;
        return this.c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i = this.a;
        KSerializer kSerializer = this.b;
        switch (i) {
            case 0:
                f1d f1dVar = (f1d) obj;
                encoder.getClass();
                f1dVar.getClass();
                encoder.l(kSerializer, ((fdi) f1dVar).getValue());
                break;
            default:
                SparseArray sparseArray = (SparseArray) obj;
                encoder.getClass();
                sparseArray.getClass();
                int size = sparseArray.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
                }
                int size2 = sparseArray.size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList2.add(sparseArray.valueAt(i3));
                }
                encoder.l(kSerializer, new dxh(arrayList, arrayList2));
                break;
        }
    }
}
