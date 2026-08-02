package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t5 extends r5 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u5 f5590h;

    public t5(u5 u5Var) {
        this.f5590h = u5Var;
    }

    @Override // com.google.android.gms.internal.play_billing.r5
    public final String c() {
        s5 s5Var = (s5) this.f5590h.f5600a.get();
        return s5Var == null ? "Completer object has been garbage collected, future will fail soon" : androidx.appcompat.widget.c1.n("tag=[", String.valueOf(s5Var.f5583a), "]");
    }
}
