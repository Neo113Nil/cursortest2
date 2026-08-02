package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.F;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final F f29685a;

    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f29686a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f29686a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f29686a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        F f10 = new F(inputStream, bVar);
        this.f29685a = f10;
        f10.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f29685a.r();
    }

    public void c() {
        this.f29685a.k();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f29685a.reset();
        return this.f29685a;
    }
}
