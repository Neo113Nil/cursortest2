package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class m5h implements SerialDescriptor, rf2 {
    public final String a;
    public final mha b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final SerialDescriptor[] k;
    public final mqi l;

    public m5h(String str, mha mhaVar, int i, List list, vv2 vv2Var) {
        list.getClass();
        this.a = str;
        this.b = mhaVar;
        this.c = i;
        this.d = vv2Var.b;
        ArrayList arrayList = vv2Var.c;
        this.e = CollectionsKt.Q0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = s9a.p(vv2Var.e);
        this.h = (List[]) vv2Var.f.toArray(new List[0]);
        this.i = CollectionsKt.N0(vv2Var.g);
        strArr.getClass();
        nh0 nh0Var = new nh0(new z0(strArr, 16), 2);
        ArrayList arrayList2 = new ArrayList(k13.r(nh0Var, 10));
        Iterator it = nh0Var.iterator();
        while (true) {
            sc5 sc5Var = (sc5) it;
            if (!sc5Var.b.hasNext()) {
                this.j = tub.o(arrayList2);
                this.k = s9a.p(list);
                this.l = ypa.b(new e6g(this, 15));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) sc5Var.next();
            arrayList2.add(new Pair(indexedValue.b, Integer.valueOf(indexedValue.a)));
        }
    }

    @Override // defpackage.rf2
    public final Set a() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
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
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m5h) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.h()) && Arrays.equals(this.k, ((m5h) obj).k)) {
                int d = serialDescriptor.d();
                int i2 = this.c;
                if (i2 == d) {
                    for (0; i < i2; i + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.g;
                        i = (Intrinsics.c(serialDescriptorArr[i].h(), serialDescriptor.g(i).h()) && Intrinsics.c(serialDescriptorArr[i].getKind(), serialDescriptor.g(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i) {
        return this.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        return this.g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final mha getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.i[i];
    }

    public final String toString() {
        return pea.G(this);
    }
}
