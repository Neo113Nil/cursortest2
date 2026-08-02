package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3150q f32563a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3167z f32564b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f32565c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC3153s f32566a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC3153s f32567b;

        /* renamed from: d, reason: collision with root package name */
        public C3140l f32569d;

        /* renamed from: f, reason: collision with root package name */
        public int f32571f;
        private Feature[] zae;

        /* renamed from: c, reason: collision with root package name */
        public Runnable f32568c = new Runnable() { // from class: com.google.android.gms.common.api.internal.G0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public boolean f32570e = true;

        public /* synthetic */ a(J0 j02) {
        }

        public r a() {
            AbstractC3191o.b(this.f32566a != null, "Must set register function");
            AbstractC3191o.b(this.f32567b != null, "Must set unregister function");
            AbstractC3191o.b(this.f32569d != null, "Must set holder");
            return new r(new H0(this, this.f32569d, this.zae, this.f32570e, this.f32571f), new I0(this, (C3140l.a) AbstractC3191o.n(this.f32569d.b(), "Key must not be null")), this.f32568c, null);
        }

        public a b(InterfaceC3153s interfaceC3153s) {
            this.f32566a = interfaceC3153s;
            return this;
        }

        public a c(int i10) {
            this.f32571f = i10;
            return this;
        }

        public a d(InterfaceC3153s interfaceC3153s) {
            this.f32567b = interfaceC3153s;
            return this;
        }

        public a e(C3140l c3140l) {
            this.f32569d = c3140l;
            return this;
        }
    }

    public /* synthetic */ r(AbstractC3150q abstractC3150q, AbstractC3167z abstractC3167z, Runnable runnable, K0 k02) {
        this.f32563a = abstractC3150q;
        this.f32564b = abstractC3167z;
        this.f32565c = runnable;
    }

    public static a a() {
        return new a(null);
    }
}
