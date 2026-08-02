package ru.ozon.pikazon.compose.painter;

import Ae.InterfaceC2397i;
import Sc.InterfaceC4003e;
import kotlin.Unit;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements InterfaceC2397i, InterfaceC7732n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PikazonImagePainter f97666a;

    b(PikazonImagePainter pikazonImagePainter) {
        this.f97666a = pikazonImagePainter;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Unit c11 = PikazonImagePainter.c(this.f97666a, (PikazonImagePainter.State) obj);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7719a(2, this.f97666a, PikazonImagePainter.class, "updateState", "updateState(Lru/ozon/pikazon/compose/painter/PikazonImagePainter$State;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
