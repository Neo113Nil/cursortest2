package kotlinx.coroutines.flow;

import Ph.C0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.q;

/* renamed from: kotlinx.coroutines.flow.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC5330l {
    public static final InterfaceC5321f a(InterfaceC5321f interfaceC5321f, int i10, Rh.d dVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && dVar != Rh.d.f10307a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            dVar = Rh.d.f10308b;
            i10 = 0;
        }
        int i11 = i10;
        Rh.d dVar2 = dVar;
        if (interfaceC5321f instanceof kotlinx.coroutines.flow.internal.q) {
            return q.a.a((kotlinx.coroutines.flow.internal.q) interfaceC5321f, null, i11, dVar2, 1, null);
        }
        return new kotlinx.coroutines.flow.internal.i(interfaceC5321f, null, i11, dVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC5321f b(InterfaceC5321f interfaceC5321f, int i10, Rh.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            dVar = Rh.d.f10307a;
        }
        return AbstractC5323h.c(interfaceC5321f, i10, dVar);
    }

    public static final void c(CoroutineContext coroutineContext) {
        if (coroutineContext.get(C0.f9001U2) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final InterfaceC5321f d(InterfaceC5321f interfaceC5321f) {
        return b(interfaceC5321f, -1, null, 2, null);
    }

    public static final InterfaceC5321f e(InterfaceC5321f interfaceC5321f, CoroutineContext coroutineContext) {
        c(coroutineContext);
        if (Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            return interfaceC5321f;
        }
        if (interfaceC5321f instanceof kotlinx.coroutines.flow.internal.q) {
            return q.a.a((kotlinx.coroutines.flow.internal.q) interfaceC5321f, coroutineContext, 0, null, 6, null);
        }
        return new kotlinx.coroutines.flow.internal.i(interfaceC5321f, coroutineContext, 0, null, 12, null);
    }
}
