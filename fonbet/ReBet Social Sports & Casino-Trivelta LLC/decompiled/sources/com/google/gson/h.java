package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public abstract class h {
    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public e c() {
        if (i()) {
            return (e) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public k e() {
        if (k()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public n f() {
        if (l()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean i() {
        return this instanceof e;
    }

    public boolean j() {
        return this instanceof j;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return this instanceof n;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            Jb.c cVar = new Jb.c(stringWriter);
            cVar.q(true);
            com.google.gson.internal.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
