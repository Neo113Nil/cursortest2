package ud;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ud.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10035m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Sd.c f100658a;

    public C10035m(Sd.c cVar) {
        this.f100658a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC10030h it = (InterfaceC10030h) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.j(this.f100658a);
    }
}
