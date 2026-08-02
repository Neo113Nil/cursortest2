package com.google.android.play.core.integrity;

import Qa.C1517g;
import Qa.H;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
abstract class bm extends H {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f36607f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f36607f = bnVar;
    }

    @Override // Qa.H
    public final void a(Exception exc) {
        if (!(exc instanceof C1517g)) {
            super.a(exc);
        } else if (bn.k(this.f36607f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
