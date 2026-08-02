package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363nk extends Jc {

    /* renamed from: a, reason: collision with root package name */
    public final wo f14367a;

    public C0363nk() {
        this(C0353na.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(int i5) {
        wo woVar = this.f14367a;
        synchronized (woVar) {
            yo yoVar = woVar.f14882a;
            yoVar.a(yoVar.a().put("last_migration_api_level", i5));
        }
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final int b() {
        int optInt;
        wo woVar = this.f14367a;
        synchronized (woVar) {
            optInt = woVar.f14882a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final SparseArray<Ic> c() {
        SparseArray<Ic> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0388ok(this.f14367a));
        sparseArray.put(115, new C0413pk());
        sparseArray.put(BuildConfig.API_LEVEL, new C0487sk());
        return sparseArray;
    }

    public C0363nk(wo woVar) {
        this.f14367a = woVar;
    }
}
