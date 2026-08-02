package com.vk.movika.sdk.common;

import android.R;
import com.vk.movika.sdk.utils.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;

/* loaded from: classes3.dex */
public class b<T> implements c {
    public Object b = EmptyList.b;

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Iterable, java.lang.Object] */
    public final void A(izs<? super T, s3q0> izsVar) {
        if (f.b.b - 1 <= 0 && f.a && f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
            this.b.size();
        }
        if (this.b.isEmpty()) {
            return;
        }
        if (f.b.b - 1 > 0 || !f.a) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                izsVar.invoke((Object) it.next());
            }
            return;
        }
        for (R r : this.b) {
            if (f.b.b - 1 <= 0) {
                com.vk.movika.sdk.utils.c.a(this, null);
                izsVar.toString();
            }
            izsVar.invoke(r);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
    public final void D(T t) {
        if (this.b.contains(t)) {
            ArrayList s0 = j5g.s0(this.b, t);
            this.b = s0;
            s0.isEmpty();
        }
    }

    @Override // com.vk.movika.sdk.common.c
    public final void destroy() {
        C();
        this.b = EmptyList.b;
        z();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    public final void y(T t) {
        if (this.b.contains(t)) {
            return;
        }
        this.b = j5g.v0(t, this.b);
        B(t);
    }

    public void C() {
    }

    public void z() {
    }

    public void B(T t) {
    }
}
