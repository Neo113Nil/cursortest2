package com.bumptech.glide;

import j6.AbstractC7287a;
import java.util.List;
import p6.f;

/* loaded from: classes.dex */
final class k implements f.b<j> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f57609a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f57610b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f57611c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC7287a f57612d;

    k(c cVar, List list, AbstractC7287a abstractC7287a) {
        this.f57610b = cVar;
        this.f57611c = list;
        this.f57612d = abstractC7287a;
    }

    @Override // p6.f.b
    public final j get() {
        if (this.f57609a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        this.f57609a = true;
        try {
            return l.a(this.f57610b, this.f57611c, this.f57612d);
        } finally {
            this.f57609a = false;
        }
    }
}
