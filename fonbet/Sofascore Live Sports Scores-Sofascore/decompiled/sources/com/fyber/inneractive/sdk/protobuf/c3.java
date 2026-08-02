package com.fyber.inneractive.sdk.protobuf;

import defpackage.a70;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c3 implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ e3 d;

    public c3(e3 e3Var) {
        this.d = e3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a + 1 >= this.d.b.size()) {
            if (this.d.c.isEmpty()) {
                return false;
            }
            Iterator it = this.c;
            if (it == null) {
                it = this.d.c.entrySet().iterator();
                this.c = it;
            }
            if (!it.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.b.size()) {
            return (Map.Entry) this.d.b.get(this.a);
        }
        Iterator it = this.c;
        if (it == null) {
            it = this.d.c.entrySet().iterator();
            this.c = it;
        }
        return (Map.Entry) it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            a70.r("remove() was called before next()");
            return;
        }
        this.b = false;
        e3 e3Var = this.d;
        int i = e3.h;
        e3Var.a();
        if (this.a >= this.d.b.size()) {
            Iterator it = this.c;
            if (it == null) {
                it = this.d.c.entrySet().iterator();
                this.c = it;
            }
            it.remove();
            return;
        }
        e3 e3Var2 = this.d;
        int i2 = this.a;
        this.a = i2 - 1;
        e3Var2.a();
        Object obj = ((b3) e3Var2.b.remove(i2)).b;
        if (e3Var2.c.isEmpty()) {
            return;
        }
        Iterator it2 = e3Var2.c().entrySet().iterator();
        e3Var2.b.add(new b3(e3Var2, (Map.Entry) it2.next()));
        it2.remove();
    }
}
