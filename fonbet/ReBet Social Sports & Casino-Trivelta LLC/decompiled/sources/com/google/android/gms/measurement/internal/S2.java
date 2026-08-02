package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class S2 implements com.google.android.gms.internal.measurement.zzr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y2 f33614a;

    public S2(Y2 y22) {
        Objects.requireNonNull(y22);
        this.f33614a = y22;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i10, String str, List list, boolean z10, boolean z11) {
        int i11 = i10 - 1;
        C3376v2 u10 = i11 != 0 ? i11 != 1 ? i11 != 3 ? i11 != 4 ? this.f33614a.f33578a.a().u() : z10 ? this.f33614a.f33578a.a().s() : !z11 ? this.f33614a.f33578a.a().t() : this.f33614a.f33578a.a().r() : this.f33614a.f33578a.a().w() : z10 ? this.f33614a.f33578a.a().p() : !z11 ? this.f33614a.f33578a.a().q() : this.f33614a.f33578a.a().o() : this.f33614a.f33578a.a().v();
        int size = list.size();
        if (size == 1) {
            u10.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            u10.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u10.a(str);
        } else {
            u10.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
