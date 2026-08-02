package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.b;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30093a;

    /* renamed from: b, reason: collision with root package name */
    public final b.a f30094b;

    public d(Context context, b.a aVar) {
        this.f30093a = context.getApplicationContext();
        this.f30094b = aVar;
    }

    @Override // com.bumptech.glide.manager.k
    public void a() {
    }

    @Override // com.bumptech.glide.manager.k
    public void b() {
        k();
    }

    @Override // com.bumptech.glide.manager.k
    public void d() {
        f();
    }

    public final void f() {
        q.a(this.f30093a).d(this.f30094b);
    }

    public final void k() {
        q.a(this.f30093a).e(this.f30094b);
    }
}
