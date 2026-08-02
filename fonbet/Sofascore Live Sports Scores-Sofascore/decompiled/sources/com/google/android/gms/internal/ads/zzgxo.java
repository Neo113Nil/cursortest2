package com.google.android.gms.internal.ads;

import defpackage.njo;
import defpackage.oio;
import defpackage.u0a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgxo {
    public Object[] a;
    public int b;
    public oio c;

    public zzgxo(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }

    public final void a(Object obj, Object obj2) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, zzgxh.b(length, i2));
        }
        u0a.Q(obj, obj2);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.b = i3 + 1;
    }

    public final void b(Set set) {
        if (set instanceof Collection) {
            int size = set.size() + this.b;
            Object[] objArr = this.a;
            int length = objArr.length;
            int i = size + size;
            if (i > length) {
                this.a = Arrays.copyOf(objArr, zzgxh.b(length, i));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
    }

    public final njo c() {
        return d(true);
    }

    public final njo d(boolean z) {
        oio oioVar;
        oio oioVar2;
        if (z && (oioVar2 = this.c) != null) {
            throw oioVar2.a();
        }
        njo i = njo.i(this.b, this.a, this);
        if (!z || (oioVar = this.c) == null) {
            return i;
        }
        throw oioVar.a();
    }

    public zzgxo() {
        this(4);
    }
}
