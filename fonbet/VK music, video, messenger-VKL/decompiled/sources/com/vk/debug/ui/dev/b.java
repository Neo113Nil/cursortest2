package com.vk.debug.ui.dev;

import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.imageloader.view.VKImageView;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b780;
import xsna.enj;

/* compiled from: DebugDevImageFragment.kt */
/* loaded from: classes17.dex */
public final class b implements b780 {
    public final /* synthetic */ DebugDevImageFragment.b b;
    public final /* synthetic */ Ref$LongRef c;
    public final /* synthetic */ DebugDevImageFragment d;
    public final /* synthetic */ VKImageView e;
    public final /* synthetic */ Ref$ObjectRef<String> f;

    public b(DebugDevImageFragment.b bVar, Ref$LongRef ref$LongRef, DebugDevImageFragment debugDevImageFragment, VKImageView vKImageView, Ref$ObjectRef<String> ref$ObjectRef) {
        this.b = bVar;
        this.c = ref$LongRef;
        this.d = debugDevImageFragment;
        this.e = vKImageView;
        this.f = ref$ObjectRef;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        enj.r(this.e.getContext(), "Fail!", 0);
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        DebugDevImageFragment.b bVar = this.b;
        if (bVar.a > 0) {
            this.c.element = System.currentTimeMillis() - bVar.a;
            bVar.a = System.currentTimeMillis();
        } else {
            bVar.a = System.currentTimeMillis();
        }
        if (this.d.T.get()) {
            this.e.v0(this.f.element);
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
