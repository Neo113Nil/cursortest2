package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class I0 extends AbstractC3167z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.a f32361b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(r.a aVar, C3140l.a aVar2) {
        super(aVar2);
        this.f32361b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3167z
    public final void b(C3117a.b bVar, TaskCompletionSource taskCompletionSource) {
        InterfaceC3153s interfaceC3153s;
        interfaceC3153s = this.f32361b.f32567b;
        interfaceC3153s.accept(bVar, taskCompletionSource);
    }
}
