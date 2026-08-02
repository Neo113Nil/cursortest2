package com.google.android.play.core.integrity;

import Qa.AbstractC1520j;
import Qa.H;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class be extends H {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f36584a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f36585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f36585b = bnVar;
        this.f36584a = context;
    }

    @Override // Qa.H
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        Context context = this.f36584a;
        taskCompletionSource = this.f36585b.f36611d;
        taskCompletionSource.trySetResult(Integer.valueOf(AbstractC1520j.a(context)));
    }
}
