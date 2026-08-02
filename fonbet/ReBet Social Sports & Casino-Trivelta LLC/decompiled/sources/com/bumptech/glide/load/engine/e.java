package com.bumptech.glide.load.engine;

import java.io.File;
import z4.InterfaceC6925a;

/* loaded from: classes2.dex */
public class e implements InterfaceC6925a.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.d f29748a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29749b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.j f29750c;

    public e(com.bumptech.glide.load.d dVar, Object obj, com.bumptech.glide.load.j jVar) {
        this.f29748a = dVar;
        this.f29749b = obj;
        this.f29750c = jVar;
    }

    @Override // z4.InterfaceC6925a.b
    public boolean a(File file) {
        return this.f29748a.a(this.f29749b, file, this.f29750c);
    }
}
