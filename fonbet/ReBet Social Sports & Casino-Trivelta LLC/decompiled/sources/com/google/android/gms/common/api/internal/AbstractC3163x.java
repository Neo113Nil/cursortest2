package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3163x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32593b;
    private final Feature[] zaa;

    /* renamed from: com.google.android.gms.common.api.internal.x$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC3153s f32594a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f32595b = true;

        /* renamed from: c, reason: collision with root package name */
        public int f32596c = 0;
        private Feature[] zac;

        public /* synthetic */ a(Q0 q02) {
        }

        public AbstractC3163x a() {
            AbstractC3191o.b(this.f32594a != null, "execute parameter required");
            return new P0(this, this.zac, this.f32595b, this.f32596c);
        }

        public a b(InterfaceC3153s interfaceC3153s) {
            this.f32594a = interfaceC3153s;
            return this;
        }

        public a c(boolean z10) {
            this.f32595b = z10;
            return this;
        }

        public a d(Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        public a e(int i10) {
            this.f32596c = i10;
            return this;
        }
    }

    public AbstractC3163x(Feature[] featureArr, boolean z10, int i10) {
        this.zaa = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f32592a = z11;
        this.f32593b = i10;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(C3117a.b bVar, TaskCompletionSource taskCompletionSource);

    public boolean c() {
        return this.f32592a;
    }

    public final int d() {
        return this.f32593b;
    }

    public final Feature[] e() {
        return this.zaa;
    }
}
