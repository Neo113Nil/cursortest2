package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class H0 extends AbstractC3150q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r.a f32359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(r.a aVar, C3140l c3140l, Feature[] featureArr, boolean z10, int i10) {
        super(c3140l, featureArr, z10, i10);
        this.f32359d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3150q
    public final void d(C3117a.b bVar, TaskCompletionSource taskCompletionSource) {
        InterfaceC3153s interfaceC3153s;
        interfaceC3153s = this.f32359d.f32566a;
        interfaceC3153s.accept(bVar, taskCompletionSource);
    }
}
