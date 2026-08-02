package com.google.android.gms.internal.ads;

import defpackage.d2a;
import defpackage.lio;
import defpackage.qio;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgxv extends lio {
    public Object[] d;
    public int e;

    public zzgxv() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgxh
    public final /* bridge */ /* synthetic */ zzgxh a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int t = zzgxw.t(this.b);
            Object[] objArr = this.d;
            if (t <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int I = d2a.I(hashCode);
                while (true) {
                    int i = I & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        c(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        I = i + 1;
                    }
                }
            }
        }
        this.d = null;
        c(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            d(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final zzgxw h() {
        zzgxw y;
        int i = this.b;
        if (i == 0) {
            return t.j;
        }
        if (i == 1) {
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            return new qio(obj);
        }
        if (this.d == null || zzgxw.t(i) != this.d.length) {
            y = zzgxw.y(this.b, this.a);
            this.b = y.size();
        } else {
            int i2 = this.b;
            Object[] objArr = this.a;
            int length = objArr.length;
            if (i2 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            y = new t(this.e, r8.length - 1, this.b, objArr, this.d);
        }
        this.c = true;
        this.d = null;
        return y;
    }
}
