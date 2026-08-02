package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class uye implements SerialDescriptor, rf2 {
    public final String a;
    public final iw8 b;
    public final int c;
    public int d;
    public final String[] e;
    public final List[] f;
    public ArrayList g;
    public final boolean[] h;
    public Map i;
    public final joa j;
    public final joa k;
    public final joa l;

    public uye(String str, iw8 iw8Var, int i) {
        str.getClass();
        this.a = str;
        this.b = iw8Var;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.h = new boolean[i4];
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.i = lm5Var;
        ysa ysaVar = ysa.b;
        this.j = ypa.a(ysaVar, new Function0(this) { // from class: tye
            public final /* synthetic */ uye b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i5 = i2;
                uye uyeVar = this.b;
                switch (i5) {
                    case 0:
                        iw8 iw8Var2 = uyeVar.b;
                        return (iw8Var2 == null || (childSerializers = iw8Var2.childSerializers()) == null) ? z8e.e : childSerializers;
                    case 1:
                        iw8 iw8Var3 = uyeVar.b;
                        if (iw8Var3 == null || (typeParametersSerializers = iw8Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return s9a.p(arrayList);
                    default:
                        return Integer.valueOf(pea.w(uyeVar, (SerialDescriptor[]) uyeVar.k.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.k = ypa.a(ysaVar, new Function0(this) { // from class: tye
            public final /* synthetic */ uye b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i52 = i5;
                uye uyeVar = this.b;
                switch (i52) {
                    case 0:
                        iw8 iw8Var2 = uyeVar.b;
                        return (iw8Var2 == null || (childSerializers = iw8Var2.childSerializers()) == null) ? z8e.e : childSerializers;
                    case 1:
                        iw8 iw8Var3 = uyeVar.b;
                        if (iw8Var3 == null || (typeParametersSerializers = iw8Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return s9a.p(arrayList);
                    default:
                        return Integer.valueOf(pea.w(uyeVar, (SerialDescriptor[]) uyeVar.k.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.l = ypa.a(ysaVar, new Function0(this) { // from class: tye
            public final /* synthetic */ uye b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                int i52 = i6;
                uye uyeVar = this.b;
                switch (i52) {
                    case 0:
                        iw8 iw8Var2 = uyeVar.b;
                        return (iw8Var2 == null || (childSerializers = iw8Var2.childSerializers()) == null) ? z8e.e : childSerializers;
                    case 1:
                        iw8 iw8Var3 = uyeVar.b;
                        if (iw8Var3 == null || (typeParametersSerializers = iw8Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return s9a.p(arrayList);
                    default:
                        return Integer.valueOf(pea.w(uyeVar, (SerialDescriptor[]) uyeVar.k.getValue()));
                }
            }
        });
    }

    @Override // defpackage.rf2
    public final Set a() {
        return this.i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof uye) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.c(this.a, serialDescriptor.h()) && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) ((uye) obj).k.getValue())) {
                int d = serialDescriptor.d();
                int i2 = this.c;
                if (i2 == d) {
                    for (0; i < i2; i + 1) {
                        i = (Intrinsics.c(g(i).h(), serialDescriptor.g(i).h()) && Intrinsics.c(g(i).getKind(), serialDescriptor.g(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i) {
        List list = this.f[i];
        return list == null ? km5.a : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor g(int i) {
        return ((KSerializer[]) this.j.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        ArrayList arrayList = this.g;
        return arrayList == null ? km5.a : arrayList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public mha getKind() {
        return nii.f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.h[i];
    }

    public final void j(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.h[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.i = hashMap;
        }
    }

    public final void k(Annotation annotation) {
        annotation.getClass();
        ArrayList arrayList = this.g;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.g = arrayList;
        }
        arrayList.add(annotation);
    }

    public String toString() {
        return pea.G(this);
    }
}
