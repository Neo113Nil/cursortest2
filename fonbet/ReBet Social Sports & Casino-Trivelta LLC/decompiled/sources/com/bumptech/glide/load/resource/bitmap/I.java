package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.u;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class I implements com.bumptech.glide.load.l {

    /* renamed from: a, reason: collision with root package name */
    public final u f30000a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f30001b;

    public static class a implements u.b {

        /* renamed from: a, reason: collision with root package name */
        public final F f30002a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.util.d f30003b;

        public a(F f10, com.bumptech.glide.util.d dVar) {
            this.f30002a = f10;
            this.f30003b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void a(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, Bitmap bitmap) {
            IOException d10 = this.f30003b.d();
            if (d10 != null) {
                if (bitmap == null) {
                    throw d10;
                }
                dVar.c(bitmap);
                throw d10;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void b() {
            this.f30002a.k();
        }
    }

    public I(u uVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f30000a = uVar;
        this.f30001b = bVar;
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v b(InputStream inputStream, int i10, int i11, com.bumptech.glide.load.j jVar) {
        boolean z10;
        F f10;
        if (inputStream instanceof F) {
            f10 = (F) inputStream;
            z10 = false;
        } else {
            z10 = true;
            f10 = new F(inputStream, this.f30001b);
        }
        com.bumptech.glide.util.d k10 = com.bumptech.glide.util.d.k(f10);
        try {
            com.bumptech.glide.load.engine.v f11 = this.f30000a.f(new com.bumptech.glide.util.i(k10), i10, i11, jVar, new a(f10, k10));
            k10.r();
            if (z10) {
                f10.r();
            }
            return f11;
        } finally {
        }
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, com.bumptech.glide.load.j jVar) {
        return this.f30000a.p(inputStream);
    }
}
