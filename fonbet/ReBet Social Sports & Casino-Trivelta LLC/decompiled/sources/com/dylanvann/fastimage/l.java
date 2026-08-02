package com.dylanvann.fastimage;

import android.content.Context;
import com.bumptech.glide.m;
import com.bumptech.glide.manager.o;

/* loaded from: classes2.dex */
public class l extends m {
    public l(com.bumptech.glide.c cVar, com.bumptech.glide.manager.j jVar, o oVar, Context context) {
        super(cVar, jVar, oVar, context);
    }

    @Override // com.bumptech.glide.m
    public void B(L4.h hVar) {
        if (hVar instanceof j) {
            super.B(hVar);
        } else {
            super.B(new j().a(hVar));
        }
    }

    @Override // com.bumptech.glide.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public k f(Class cls) {
        return new k(this.f30076a, this, cls, this.f30077b);
    }

    @Override // com.bumptech.glide.m
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public k k() {
        return (k) super.k();
    }

    @Override // com.bumptech.glide.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public k l() {
        return (k) super.l();
    }

    @Override // com.bumptech.glide.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public k o() {
        return (k) super.o();
    }

    @Override // com.bumptech.glide.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public k v(Object obj) {
        return (k) super.v(obj);
    }

    @Override // com.bumptech.glide.m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public k w(String str) {
        return (k) super.w(str);
    }
}
