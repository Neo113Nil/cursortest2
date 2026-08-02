package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class jp implements I1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14082b;

    public /* synthetic */ jp(int i5, Object obj) {
        this.f14081a = i5;
        this.f14082b = obj;
    }

    @Override // io.appmetrica.analytics.impl.I1
    public final void a(Intent intent) {
        switch (this.f14081a) {
            case 0:
                C0023ad.a((ModuleServiceLifecycleObserver) this.f14082b, intent);
                break;
            case 1:
                C0023ad.b((ModuleServiceLifecycleObserver) this.f14082b, intent);
                break;
            default:
                ((B1) this.f14082b).d(intent);
                break;
        }
    }
}
