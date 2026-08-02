package com.squareup.moshi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.InterfaceC9682h;
import sf.K;
import sf.N;

/* loaded from: classes.dex */
public final class r implements K {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f60446a;

    r(q qVar) {
        this.f60446a = qVar;
    }

    @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        q qVar = this.f60446a;
        if (qVar.y() != 9) {
            throw new AssertionError();
        }
        int i11 = qVar.f60470a;
        qVar.f60470a = i11 - 1;
        int[] iArr = qVar.f60473d;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
    }

    @Override // sf.K, java.io.Flushable
    public final void flush() {
        InterfaceC9682h interfaceC9682h;
        interfaceC9682h = this.f60446a.f60443j;
        interfaceC9682h.flush();
    }

    @Override // sf.K
    @NotNull
    public final N timeout() {
        return N.f98683d;
    }

    @Override // sf.K
    public final void z0(@NotNull C9681g source, long j11) {
        InterfaceC9682h interfaceC9682h;
        Intrinsics.checkNotNullParameter(source, "source");
        interfaceC9682h = this.f60446a.f60443j;
        interfaceC9682h.z0(source, j11);
    }
}
