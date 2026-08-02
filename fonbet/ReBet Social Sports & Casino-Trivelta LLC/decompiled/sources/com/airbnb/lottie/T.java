package com.airbnb.lottie;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28484a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f28485b;

    public T(Object obj) {
        this.f28484a = obj;
        this.f28485b = null;
    }

    public Throwable a() {
        return this.f28485b;
    }

    public Object b() {
        return this.f28484a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        if (b() != null && b().equals(t10.b())) {
            return true;
        }
        if (a() == null || t10.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public T(Throwable th2) {
        this.f28485b = th2;
        this.f28484a = null;
    }
}
