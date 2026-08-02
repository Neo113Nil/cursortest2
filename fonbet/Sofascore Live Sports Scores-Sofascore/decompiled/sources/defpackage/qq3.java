package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qq3 implements KSerializer {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public final Object d;

    public qq3(KClass kClass, KSerializer[] kSerializerArr) {
        this.a = 0;
        kClass.getClass();
        this.b = kClass;
        List asList = Arrays.asList(kSerializerArr);
        asList.getClass();
        this.c = asList;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (StringsKt.R("kotlinx.serialization.ContextualSerializer")) {
            a70.p("Blank serial names are prohibited");
            throw null;
        }
        nii niiVar = nii.f;
        o5h o5hVar = o5h.f;
        if (o5hVar == niiVar) {
            a70.p("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            throw null;
        }
        vv2 vv2Var = new vv2("kotlinx.serialization.ContextualSerializer");
        km5 km5Var = km5.a;
        km5Var.getClass();
        vv2Var.b = km5Var;
        Unit unit = Unit.a;
        this.d = new fq3(new m5h("kotlinx.serialization.ContextualSerializer", o5hVar, vv2Var.c.size(), ph0.X(serialDescriptorArr), vv2Var), kClass);
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                decoder.getClass();
                KClass kClass = (KClass) obj;
                KSerializer g = decoder.a().g(kClass, (List) this.c);
                if (g != null) {
                    return decoder.y(g);
                }
                throw new v5h(s9a.E(kClass));
            case 1:
                Enum[] enumArr = (Enum[]) obj;
                decoder.getClass();
                int f = decoder.f(getDescriptor());
                if (f >= 0 && f < enumArr.length) {
                    return enumArr[f];
                }
                throw new v5h(f + " is not among valid " + getDescriptor().h() + " enum values, values size is " + enumArr.length);
            case 2:
                return new c6d((SnapshotStateList) decoder.y((qq3) this.c));
            case 3:
                decoder.getClass();
                SerialDescriptor descriptor = getDescriptor();
                uf3 b = decoder.b(descriptor);
                int o = b.o(getDescriptor());
                if (o != -1) {
                    throw new v5h(ljg.j(o, "Unexpected index "));
                }
                Unit unit = Unit.a;
                b.c(descriptor);
                return obj;
            default:
                decoder.getClass();
                List list = (List) decoder.y((xg0) this.c);
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.addAll(CollectionsKt.S0(list));
                return snapshotStateList;
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (fq3) obj;
            case 1:
                return (SerialDescriptor) ((mqi) obj).getValue();
            case 2:
                return (yll) obj;
            case 3:
                return (SerialDescriptor) ((joa) obj).getValue();
            default:
                return (yll) obj;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                encoder.getClass();
                obj.getClass();
                KClass kClass = (KClass) obj2;
                KSerializer g = encoder.a().g(kClass, (List) this.c);
                if (g == null) {
                    throw new v5h(s9a.E(kClass));
                }
                encoder.l(g, obj);
                return;
            case 1:
                Enum r5 = (Enum) obj;
                encoder.getClass();
                r5.getClass();
                Enum[] enumArr = (Enum[]) obj2;
                int G = ph0.G(r5, enumArr);
                if (G != -1) {
                    encoder.j(getDescriptor(), G);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String h = getDescriptor().h();
                String arrays = Arrays.toString(enumArr);
                arrays.getClass();
                sb.append(" is not a valid enum ");
                sb.append(h);
                sb.append(", must be one of ");
                sb.append(arrays);
                throw new v5h(sb.toString());
            case 2:
                encoder.l((qq3) this.c, ((c6d) obj).a);
                return;
            case 3:
                encoder.getClass();
                obj.getClass();
                encoder.b(getDescriptor()).c(getDescriptor());
                return;
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                encoder.getClass();
                snapshotStateList.getClass();
                encoder.l((xg0) this.c, snapshotStateList);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qq3(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        this.a = 3;
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.c = asList;
    }

    public qq3(String str, Object obj) {
        this.a = 3;
        obj.getClass();
        this.b = obj;
        this.c = km5.a;
        this.d = ypa.a(ysa.b, new ixa(24, str, this));
    }

    public qq3(KSerializer kSerializer, int i) {
        this.a = i;
        switch (i) {
            case 4:
                kSerializer.getClass();
                this.b = kSerializer;
                xg0 xg0Var = new xg0(kSerializer, 0);
                this.c = xg0Var;
                this.d = aik.j("androidx.compose.runtime.SnapshotStateList", (sg0) xg0Var.c);
                break;
            default:
                this.b = kSerializer;
                qq3 qq3Var = new qq3(kSerializer, 4);
                this.c = qq3Var;
                this.d = aik.j("androidx.navigation3.runtime.NavBackStack", (yll) qq3Var.d);
                break;
        }
    }

    public qq3(String str, Enum[] enumArr) {
        this.a = 1;
        str.getClass();
        enumArr.getClass();
        this.b = enumArr;
        this.d = ypa.b(new h84(10, this, str));
    }
}
