package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.AbstractC3190n;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class L implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.h f32652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f32653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3190n.a f32654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f32655d;

    public L(com.google.android.gms.common.api.h hVar, TaskCompletionSource taskCompletionSource, AbstractC3190n.a aVar, N n10) {
        this.f32652a = hVar;
        this.f32653b = taskCompletionSource;
        this.f32654c = aVar;
        this.f32655d = n10;
    }

    @Override // com.google.android.gms.common.api.h.a
    public final void a(Status status) {
        if (!status.l()) {
            this.f32653b.setException(AbstractC3178b.a(status));
        } else {
            this.f32653b.setResult(this.f32654c.convert(this.f32652a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
