package mf0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;
import ze.EnumC11113a;
import ze.k;

/* renamed from: mf0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8139a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C11115c f74831a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<T> f74832b;

    public C8139a() {
        EnumC11113a onBufferOverflow = EnumC11113a.DROP_LATEST;
        Intrinsics.checkNotNullParameter(onBufferOverflow, "onBufferOverflow");
        C11115c a11 = k.a(Integer.MAX_VALUE, 4, onBufferOverflow);
        this.f74831a = a11;
        this.f74832b = C2399j.H(a11);
    }

    @NotNull
    public final InterfaceC2395h<T> a() {
        return this.f74832b;
    }

    public final void b(InterfaceC8141c interfaceC8141c) {
        this.f74831a.b(interfaceC8141c);
    }
}
