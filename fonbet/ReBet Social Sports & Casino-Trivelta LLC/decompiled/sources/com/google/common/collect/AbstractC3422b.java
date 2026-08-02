package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3422b extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public a f36761a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    public Object f36762b;

    /* renamed from: com.google.common.collect.b$a */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object a();

    public final Object b() {
        this.f36761a = a.DONE;
        return null;
    }

    public final boolean c() {
        this.f36761a = a.FAILED;
        this.f36762b = a();
        if (this.f36761a == a.DONE) {
            return false;
        }
        this.f36761a = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Ra.n.p(this.f36761a != a.FAILED);
        int ordinal = this.f36761a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f36761a = a.NOT_READY;
        Object a10 = U.a(this.f36762b);
        this.f36762b = null;
        return a10;
    }
}
