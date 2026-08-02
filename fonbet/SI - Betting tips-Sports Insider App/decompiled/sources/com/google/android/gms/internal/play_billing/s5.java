package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f5583a;

    /* renamed from: b, reason: collision with root package name */
    public u5 f5584b;

    /* renamed from: c, reason: collision with root package name */
    public v5 f5585c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5586d;

    public final void finalize() {
        v5 v5Var;
        u5 u5Var = this.f5584b;
        if (u5Var != null) {
            t5 t5Var = u5Var.f5601b;
            if (!t5Var.isDone()) {
                if (r5.f5561f.w(t5Var, null, new p3(new e1("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f5583a)), 2)))) {
                    r5.d(t5Var);
                }
            }
        }
        if (this.f5586d || (v5Var = this.f5585c) == null) {
            return;
        }
        v5Var.i(null);
    }
}
