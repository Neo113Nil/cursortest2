package e;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f8447a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.collections.e0 f8448b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.collections.e0 f8449c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8450d;

    /* renamed from: e, reason: collision with root package name */
    public d2.c f8451e;

    /* renamed from: f, reason: collision with root package name */
    public final z f8452f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8453g;

    public y(z onBackPressedCallback, a0 initialInfo) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Intrinsics.checkNotNullParameter(initialInfo, "info");
        boolean z5 = onBackPressedCallback.f8455b;
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
        this.f8447a = initialInfo;
        kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
        this.f8448b = e0Var;
        this.f8449c = e0Var;
        this.f8450d = z5;
        this.f8452f = onBackPressedCallback;
        this.f8453g = true;
    }

    public final void a() {
        d2.c cVar = this.f8451e;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(this, "handler");
            if (cVar.f8084c.remove(this)) {
                d2.f fVar = cVar.f8083b;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(this, "handler");
                if (Intrinsics.areEqual(this, fVar.f8095f)) {
                    if (fVar.f8096g == -1) {
                        this.f8452f.a();
                    }
                    fVar.f8095f = null;
                    fVar.f8096g = 0;
                    fVar.f8097h = null;
                }
                fVar.f8093d.remove(this);
                fVar.f8094e.remove(this);
                this.f8451e = null;
                fVar.b();
            }
        }
    }

    public final void b(boolean z5) {
        d2.f fVar;
        this.f8453g = z5;
        boolean z7 = z5 && this.f8452f.f8455b;
        if (this.f8450d == z7) {
            return;
        }
        this.f8450d = z7;
        d2.c cVar = this.f8451e;
        if (cVar == null || (fVar = cVar.f8083b) == null) {
            return;
        }
        fVar.b();
    }
}
