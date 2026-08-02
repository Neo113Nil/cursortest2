package com.vk.debug.ui.dev;

import com.vk.debug.ui.dev.DebugDevImageFragment;
import xsna.b780;
import xsna.gbh;
import xsna.i0q0;

/* compiled from: DebugDevImageFragment.kt */
/* loaded from: classes17.dex */
public final class a implements b780 {
    public final /* synthetic */ DebugDevImageFragment.a b;

    public a(DebugDevImageFragment.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        DebugDevImageFragment.a aVar = this.b;
        if (aVar.c.incrementAndGet() == aVar.a) {
            i0q0.f(new gbh(aVar, 5));
        }
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        DebugDevImageFragment.a aVar = this.b;
        if (aVar.c.incrementAndGet() == aVar.a) {
            i0q0.f(new gbh(aVar, 5));
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
