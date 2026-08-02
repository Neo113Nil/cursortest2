package com.facebook.imagepipeline.animated.impl;

import A7.n;
import D6.i;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6713d f30566a;

    /* renamed from: b, reason: collision with root package name */
    public final n f30567b;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f30569d = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final n.b f30568c = new a();

    public class a implements n.b {
        public a() {
        }

        @Override // A7.n.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC6713d interfaceC6713d, boolean z10) {
            c.this.f(interfaceC6713d, z10);
        }
    }

    public static class b implements InterfaceC6713d {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6713d f30571a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30572b;

        public b(InterfaceC6713d interfaceC6713d, int i10) {
            this.f30571a = interfaceC6713d;
            this.f30572b = i10;
        }

        @Override // w6.InterfaceC6713d
        public String a() {
            return null;
        }

        @Override // w6.InterfaceC6713d
        public boolean b(Uri uri) {
            return this.f30571a.b(uri);
        }

        @Override // w6.InterfaceC6713d
        public boolean c() {
            return false;
        }

        @Override // w6.InterfaceC6713d
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f30572b == bVar.f30572b && this.f30571a.equals(bVar.f30571a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // w6.InterfaceC6713d
        public int hashCode() {
            return (this.f30571a.hashCode() * 1013) + this.f30572b;
        }

        public String toString() {
            return i.b(this).b("imageCacheKey", this.f30571a).a("frameIndex", this.f30572b).toString();
        }
    }

    public c(InterfaceC6713d interfaceC6713d, n nVar) {
        this.f30566a = interfaceC6713d;
        this.f30567b = nVar;
    }

    public H6.a a(int i10, H6.a aVar) {
        return this.f30567b.c(e(i10), aVar, this.f30568c);
    }

    public boolean b(int i10) {
        return this.f30567b.contains(e(i10));
    }

    public H6.a c(int i10) {
        return this.f30567b.get(e(i10));
    }

    public H6.a d() {
        H6.a d10;
        do {
            InterfaceC6713d g10 = g();
            if (g10 == null) {
                return null;
            }
            d10 = this.f30567b.d(g10);
        } while (d10 == null);
        return d10;
    }

    public final b e(int i10) {
        return new b(this.f30566a, i10);
    }

    public synchronized void f(InterfaceC6713d interfaceC6713d, boolean z10) {
        try {
            if (z10) {
                this.f30569d.add(interfaceC6713d);
            } else {
                this.f30569d.remove(interfaceC6713d);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized InterfaceC6713d g() {
        InterfaceC6713d interfaceC6713d;
        Iterator it = this.f30569d.iterator();
        if (it.hasNext()) {
            interfaceC6713d = (InterfaceC6713d) it.next();
            it.remove();
        } else {
            interfaceC6713d = null;
        }
        return interfaceC6713d;
    }
}
