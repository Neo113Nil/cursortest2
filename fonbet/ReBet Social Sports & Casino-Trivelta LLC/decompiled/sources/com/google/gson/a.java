package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Field f38069a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f38069a = field;
    }

    public String toString() {
        return this.f38069a.toString();
    }
}
