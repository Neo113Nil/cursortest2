package s0;

import B0.C0;
import kotlin.jvm.functions.Function1;
import m0.C8008p;
import m0.C8011q0;
import org.jetbrains.annotations.NotNull;
import r0.C9112M;

/* renamed from: s0.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9575r implements InterfaceC9559b<Float, C8008p> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8011q0 f98091a;

    public C9575r(@NotNull C8011q0 c8011q0) {
        this.f98091a = c8011q0;
    }

    @Override // s0.InterfaceC9559b
    public final Object a(C9112M.a aVar, Float f7, Float f11, Function1 function1, kotlin.coroutines.d dVar) {
        float floatValue = f7.floatValue();
        float floatValue2 = f11.floatValue();
        Object b11 = C9573p.b(aVar, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, C0.a(0.0f, 28, floatValue2), this.f98091a, function1, (kotlin.coroutines.jvm.internal.c) dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : (C9558a) b11;
    }
}
