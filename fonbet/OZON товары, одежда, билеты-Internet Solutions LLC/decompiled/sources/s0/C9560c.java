package s0;

import B0.C0;
import kotlin.jvm.functions.Function1;
import m0.C8008p;
import m0.InterfaceC7976A;
import org.jetbrains.annotations.NotNull;
import r0.C9112M;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9560c implements InterfaceC9559b<Float, C8008p> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7976A<Float> f98042a;

    public C9560c(@NotNull InterfaceC7976A<Float> interfaceC7976A) {
        this.f98042a = interfaceC7976A;
    }

    @Override // s0.InterfaceC9559b
    public final Object a(C9112M.a aVar, Float f7, Float f11, Function1 function1, kotlin.coroutines.d dVar) {
        Object a11 = C9573p.a(aVar, f7.floatValue(), C0.a(0.0f, 28, f11.floatValue()), this.f98042a, function1, (kotlin.coroutines.jvm.internal.c) dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : (C9558a) a11;
    }
}
