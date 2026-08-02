package com.google.common.collect;

import Bl0.k0;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC5858b<T> extends f0<T> {

    /* renamed from: a, reason: collision with root package name */
    private a f59061a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private T f59062b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.google.common.collect.b$a */
    private static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a DONE;
        public static final a FAILED;
        public static final a NOT_READY;
        public static final a READY;

        static {
            a aVar = new a("READY", 0);
            READY = aVar;
            a aVar2 = new a("NOT_READY", 1);
            NOT_READY = aVar2;
            a aVar3 = new a("DONE", 2);
            DONE = aVar3;
            a aVar4 = new a("FAILED", 3);
            FAILED = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    protected AbstractC5858b() {
    }

    protected abstract T a();

    protected final void b() {
        this.f59061a = a.DONE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar = this.f59061a;
        a aVar2 = a.FAILED;
        k0.m(aVar != aVar2);
        int ordinal = this.f59061a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.f59061a = aVar2;
            this.f59062b = a();
            if (this.f59061a != a.DONE) {
                this.f59061a = a.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f59061a = a.NOT_READY;
        T t2 = this.f59062b;
        this.f59062b = null;
        return t2;
    }
}
