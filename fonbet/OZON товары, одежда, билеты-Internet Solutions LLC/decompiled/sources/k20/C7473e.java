package k20;

import hi.InterfaceC6958a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: k20.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C7473e<C extends InterfaceC6958a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<C> f70359a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7469a<C> f70360b;

    public C7473e(@NotNull kotlin.reflect.d<C> key, @NotNull InterfaceC7469a<C> provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f70359a = key;
        this.f70360b = provider;
    }

    @NotNull
    public final kotlin.reflect.d<C> a() {
        return this.f70359a;
    }

    @NotNull
    public final InterfaceC7469a<C> b() {
        return this.f70360b;
    }
}
