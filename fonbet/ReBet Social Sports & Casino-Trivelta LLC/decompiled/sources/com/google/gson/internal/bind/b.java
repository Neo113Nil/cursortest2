package com.google.gson.internal.bind;

import Jb.c;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: m, reason: collision with root package name */
    public static final Writer f38255m = new a();

    /* renamed from: n, reason: collision with root package name */
    public static final n f38256n = new n("closed");

    /* renamed from: j, reason: collision with root package name */
    public final List f38257j;

    /* renamed from: k, reason: collision with root package name */
    public String f38258k;

    /* renamed from: l, reason: collision with root package name */
    public h f38259l;

    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f38255m);
        this.f38257j = new ArrayList();
        this.f38259l = j.f38328a;
    }

    @Override // Jb.c
    public c B() {
        k kVar = new k();
        p2(kVar);
        this.f38257j.add(kVar);
        return this;
    }

    @Override // Jb.c
    public c T1() {
        p2(j.f38328a);
        return this;
    }

    @Override // Jb.c
    public c U() {
        if (this.f38257j.isEmpty() || this.f38258k != null) {
            throw new IllegalStateException();
        }
        if (!(o2() instanceof e)) {
            throw new IllegalStateException();
        }
        this.f38257j.remove(r0.size() - 1);
        return this;
    }

    @Override // Jb.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f38257j.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f38257j.add(f38256n);
    }

    @Override // Jb.c, java.io.Flushable
    public void flush() {
    }

    @Override // Jb.c
    public c g2(double d10) {
        if (D0() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            p2(new n(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // Jb.c
    public c h2(long j10) {
        p2(new n(Long.valueOf(j10)));
        return this;
    }

    @Override // Jb.c
    public c i2(Boolean bool) {
        if (bool == null) {
            return T1();
        }
        p2(new n(bool));
        return this;
    }

    @Override // Jb.c
    public c j2(Number number) {
        if (number == null) {
            return T1();
        }
        if (!D0()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        p2(new n(number));
        return this;
    }

    @Override // Jb.c
    public c k2(String str) {
        if (str == null) {
            return T1();
        }
        p2(new n(str));
        return this;
    }

    @Override // Jb.c
    public c l2(boolean z10) {
        p2(new n(Boolean.valueOf(z10)));
        return this;
    }

    @Override // Jb.c
    public c n1(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f38257j.isEmpty() || this.f38258k != null) {
            throw new IllegalStateException();
        }
        if (!(o2() instanceof k)) {
            throw new IllegalStateException();
        }
        this.f38258k = str;
        return this;
    }

    public h n2() {
        if (this.f38257j.isEmpty()) {
            return this.f38259l;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f38257j);
    }

    public final h o2() {
        return (h) this.f38257j.get(r0.size() - 1);
    }

    public final void p2(h hVar) {
        if (this.f38258k != null) {
            if (!hVar.j() || z0()) {
                ((k) o2()).m(this.f38258k, hVar);
            }
            this.f38258k = null;
            return;
        }
        if (this.f38257j.isEmpty()) {
            this.f38259l = hVar;
            return;
        }
        h o22 = o2();
        if (!(o22 instanceof e)) {
            throw new IllegalStateException();
        }
        ((e) o22).m(hVar);
    }

    @Override // Jb.c
    public c r() {
        e eVar = new e();
        p2(eVar);
        this.f38257j.add(eVar);
        return this;
    }

    @Override // Jb.c
    public c w0() {
        if (this.f38257j.isEmpty() || this.f38258k != null) {
            throw new IllegalStateException();
        }
        if (!(o2() instanceof k)) {
            throw new IllegalStateException();
        }
        this.f38257j.remove(r0.size() - 1);
        return this;
    }
}
