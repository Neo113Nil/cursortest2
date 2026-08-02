package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Field f59797a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f59797a = field;
    }

    public final String toString() {
        return this.f59797a.toString();
    }
}
