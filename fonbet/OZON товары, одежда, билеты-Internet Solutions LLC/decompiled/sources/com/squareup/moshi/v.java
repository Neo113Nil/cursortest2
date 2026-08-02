package com.squareup.moshi;

import kotlin.jvm.internal.Intrinsics;
import sf.C9681g;

/* loaded from: classes9.dex */
public final class v extends sf.p {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9681g f60466b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f60467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(C9681g c9681g, w wVar) {
        super(c9681g);
        this.f60466b = c9681g;
        this.f60467c = wVar;
    }

    @Override // sf.p, sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f60467c;
        if (wVar.y() == 9) {
            Object[] l02 = wVar.l0();
            int i11 = wVar.f60470a;
            if (l02[i11] == null) {
                wVar.f60470a = i11 - 1;
                C9681g source = this.f60466b;
                Intrinsics.checkNotNullParameter(source, "source");
                Object t2 = new p(source).t();
                boolean s11 = wVar.s();
                wVar.I(true);
                try {
                    wVar.d0(t2);
                    wVar.I(s11);
                    int[] iArr = wVar.f60473d;
                    int i12 = wVar.f60470a - 1;
                    iArr[i12] = iArr[i12] + 1;
                    return;
                } catch (Throwable th2) {
                    wVar.I(s11);
                    throw th2;
                }
            }
        }
        throw new AssertionError();
    }
}
