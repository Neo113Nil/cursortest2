package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class P0 extends AbstractC3163x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3163x.a f32386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(AbstractC3163x.a aVar, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.f32386c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3163x
    public final void b(C3117a.b bVar, TaskCompletionSource taskCompletionSource) {
        InterfaceC3153s interfaceC3153s;
        interfaceC3153s = this.f32386c.f32594a;
        interfaceC3153s.accept(bVar, taskCompletionSource);
    }
}
