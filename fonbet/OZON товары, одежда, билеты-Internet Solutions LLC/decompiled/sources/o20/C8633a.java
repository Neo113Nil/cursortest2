package o20;

import j20.InterfaceC7243a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: o20.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8633a {

    /* renamed from: a, reason: collision with root package name */
    private final int f77628a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7243a<? extends Object> f77629b;

    public C8633a(int i11, @NotNull InterfaceC7243a<? extends Object> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f77628a = i11;
        this.f77629b = config;
    }

    @NotNull
    public final InterfaceC7243a<? extends Object> a() {
        return this.f77629b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8633a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.widget.store.cache.KeyedConfig");
        return this.f77628a == ((C8633a) obj).f77628a;
    }

    public final int hashCode() {
        return this.f77628a;
    }

    @NotNull
    public final String toString() {
        return "KeyedConfig(key=" + this.f77628a + ", config=" + this.f77629b + ")";
    }
}
