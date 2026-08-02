package gk0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class x<V extends View> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends V> f64563a;

    /* renamed from: b, reason: collision with root package name */
    private final int f64564b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6746B<V> f64565c;

    public x(@NotNull kotlin.reflect.d<? extends V> key, int i11, @NotNull InterfaceC6746B<V> provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f64563a = key;
        this.f64564b = i11;
        this.f64565c = provider;
    }

    public final int a() {
        return this.f64564b;
    }

    @NotNull
    public final kotlin.reflect.d<? extends V> b() {
        return this.f64563a;
    }

    @NotNull
    public final InterfaceC6746B<V> c() {
        return this.f64565c;
    }
}
