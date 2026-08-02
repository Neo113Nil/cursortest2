package com.google.gson;

/* loaded from: classes.dex */
public final class k extends JsonElement {

    /* renamed from: a, reason: collision with root package name */
    public static final k f60021a = new k();

    @Deprecated
    public k() {
    }

    @Override // com.google.gson.JsonElement
    public final JsonElement deepCopy() {
        return f60021a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof k;
    }

    public final int hashCode() {
        return k.class.hashCode();
    }
}
