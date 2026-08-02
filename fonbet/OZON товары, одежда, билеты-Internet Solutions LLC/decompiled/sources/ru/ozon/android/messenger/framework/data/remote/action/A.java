package ru.ozon.android.messenger.framework.data.remote.action;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87655a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f87656b;

    public A(@NotNull String url, @NotNull LinkedHashMap params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f87655a = url;
        this.f87656b = params;
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.f87656b;
    }

    @NotNull
    public final String b() {
        return this.f87655a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a11 = (A) obj;
        return Intrinsics.d(this.f87655a, a11.f87655a) && this.f87656b.equals(a11.f87656b);
    }

    public final int hashCode() {
        return this.f87656b.hashCode() + (this.f87655a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ActionRequestModel(url=" + this.f87655a + ", params=" + this.f87656b + ")";
    }
}
