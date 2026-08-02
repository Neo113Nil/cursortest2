package com.logrocket.protobuf;

import io.sentry.b5;
import io.sentry.b6;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6685a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6686b;

    /* renamed from: c, reason: collision with root package name */
    public Iterable f6687c;

    public e1(io.sentry.cache.tape.d dVar, io.sentry.cache.tape.g gVar) {
        this.f6687c = dVar;
        this.f6686b = gVar;
    }

    public h a() {
        h hVar;
        ArrayDeque arrayDeque = (ArrayDeque) this.f6686b;
        h hVar2 = (h) this.f6687c;
        if (hVar2 == null) {
            throw new NoSuchElementException();
        }
        while (arrayDeque != null && !arrayDeque.isEmpty()) {
            j jVar = ((f1) arrayDeque.pop()).f6693f;
            while (jVar instanceof f1) {
                f1 f1Var = (f1) jVar;
                arrayDeque.push(f1Var);
                jVar = f1Var.f6692e;
            }
            hVar = (h) jVar;
            if (hVar.size() != 0) {
                break;
            }
        }
        hVar = null;
        this.f6687c = hVar;
        return hVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6685a) {
            case 0:
                return ((h) this.f6687c) != null;
            default:
                return ((io.sentry.cache.tape.g) this.f6686b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6685a) {
            case 0:
                return a();
            default:
                byte[] bArr = (byte[]) ((io.sentry.cache.tape.g) this.f6686b).next();
                b6 b6Var = ((io.sentry.cache.g) ((io.sentry.cache.tape.d) this.f6687c).f16258c.f10882b).f16254a;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.g.f16253c));
                    try {
                        io.sentry.e eVar = (io.sentry.e) b6Var.getSerializer().c(bufferedReader, io.sentry.e.class);
                        bufferedReader.close();
                        return eVar;
                    } finally {
                    }
                } catch (Throwable th2) {
                    b6Var.getLogger().b(b5.ERROR, th2, "Error reading entity from scope cache", new Object[0]);
                    return null;
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6685a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((io.sentry.cache.tape.g) this.f6686b).remove();
                return;
        }
    }

    public e1(j jVar) {
        if (jVar instanceof f1) {
            f1 f1Var = (f1) jVar;
            ArrayDeque arrayDeque = new ArrayDeque(f1Var.f6695h);
            this.f6686b = arrayDeque;
            arrayDeque.push(f1Var);
            j jVar2 = f1Var.f6692e;
            while (jVar2 instanceof f1) {
                f1 f1Var2 = (f1) jVar2;
                ((ArrayDeque) this.f6686b).push(f1Var2);
                jVar2 = f1Var2.f6692e;
            }
            this.f6687c = (h) jVar2;
            return;
        }
        this.f6686b = null;
        this.f6687c = (h) jVar;
    }
}
