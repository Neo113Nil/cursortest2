package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import java.util.Map;

/* loaded from: classes2.dex */
public final class B implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f32330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f32331b;

    public B(D d10, BasePendingResult basePendingResult) {
        this.f32331b = d10;
        this.f32330a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.h.a
    public final void a(Status status) {
        Map map;
        map = this.f32331b.f32340a;
        map.remove(this.f32330a);
    }
}
