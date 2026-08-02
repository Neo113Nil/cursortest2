package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y3p {
    public Object[] a;
    public int b;
    public x3p c;

    public y3p(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }

    public final void a(Object obj, Object obj2) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, i3p.a(length, i2));
        }
        kda.X(obj, obj2);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.b = i3 + 1;
    }

    public final i5p b() {
        x3p x3pVar = this.c;
        if (x3pVar != null) {
            throw x3pVar.a();
        }
        i5p m = i5p.m(this.b, this.a, this);
        x3p x3pVar2 = this.c;
        if (x3pVar2 == null) {
            return m;
        }
        throw x3pVar2.a();
    }

    public y3p() {
        this(4);
    }
}
