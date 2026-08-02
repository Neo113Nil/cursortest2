package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3150q {

    /* renamed from: a, reason: collision with root package name */
    public final C3140l f32556a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32558c;
    private final Feature[] zab;

    public AbstractC3150q(C3140l c3140l, Feature[] featureArr, boolean z10, int i10) {
        this.f32556a = c3140l;
        this.zab = featureArr;
        this.f32557b = z10;
        this.f32558c = i10;
    }

    public void a() {
        this.f32556a.a();
    }

    public C3140l.a b() {
        return this.f32556a.b();
    }

    public Feature[] c() {
        return this.zab;
    }

    public abstract void d(C3117a.b bVar, TaskCompletionSource taskCompletionSource);

    public final int e() {
        return this.f32558c;
    }

    public final boolean f() {
        return this.f32557b;
    }
}
