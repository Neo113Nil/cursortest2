package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3136j f32574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f32575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f32576c;

    public r1(s1 s1Var, AbstractC3136j abstractC3136j, String str) {
        this.f32574a = abstractC3136j;
        this.f32575b = str;
        Objects.requireNonNull(s1Var);
        this.f32576c = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        s1 s1Var = this.f32576c;
        if (s1Var.k() > 0) {
            AbstractC3136j abstractC3136j = this.f32574a;
            if (s1Var.l() != null) {
                bundle = s1Var.l().getBundle(this.f32575b);
            } else {
                bundle = null;
            }
            abstractC3136j.onCreate(bundle);
        }
        if (s1Var.k() >= 2) {
            this.f32574a.onStart();
        }
        if (s1Var.k() >= 3) {
            this.f32574a.onResume();
        }
        if (s1Var.k() >= 4) {
            this.f32574a.onStop();
        }
        if (s1Var.k() >= 5) {
            this.f32574a.onDestroy();
        }
    }
}
