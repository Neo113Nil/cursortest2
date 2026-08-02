package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class S implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30677a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f30678b;

    public class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g0 f30679f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e0 f30680g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.facebook.imagepipeline.request.b f30681h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f30682i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3030n interfaceC3030n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, com.facebook.imagepipeline.request.b bVar, CancellationSignal cancellationSignal) {
            super(interfaceC3030n, g0Var, e0Var, str);
            this.f30679f = g0Var2;
            this.f30680g = e0Var2;
            this.f30681h = bVar;
            this.f30682i = cancellationSignal;
        }

        @Override // com.facebook.imagepipeline.producers.m0, B6.h
        public void d() {
            super.d();
            this.f30682i.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.m0, B6.h
        public void e(Exception exc) {
            super.e(exc);
            this.f30679f.b(this.f30680g, "LocalThumbnailBitmapSdk29Producer", false);
            this.f30680g.B("local", "thumbnail_bitmap");
        }

        @Override // B6.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(H6.a aVar) {
            H6.a.U(aVar);
        }

        @Override // com.facebook.imagepipeline.producers.m0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(H6.a aVar) {
            return D6.g.of("createdThumbnail", String.valueOf(aVar != null));
        }

        @Override // B6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public H6.a c() {
            String str;
            Size size = new Size(this.f30681h.getPreferredWidth(), this.f30681h.getPreferredHeight());
            try {
                str = S.this.e(this.f30681h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            Bitmap createVideoThumbnail = str != null ? F6.a.c(F6.a.b(str)) ? ThumbnailUtils.createVideoThumbnail(new File(str), size, this.f30682i) : ThumbnailUtils.createImageThumbnail(new File(str), size, this.f30682i) : null;
            if (createVideoThumbnail == null) {
                createVideoThumbnail = S.this.f30678b.loadThumbnail(this.f30681h.getSourceUri(), size, this.f30682i);
            }
            if (createVideoThumbnail == null) {
                return null;
            }
            H7.f m02 = H7.f.m0(createVideoThumbnail, z7.f.a(), H7.o.f4868d, 0);
            this.f30680g.U("image_format", "thumbnail");
            m02.m1(this.f30680g.getExtras());
            return H6.a.D0(m02);
        }

        @Override // com.facebook.imagepipeline.producers.m0, B6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(H6.a aVar) {
            super.f(aVar);
            this.f30679f.b(this.f30680g, "LocalThumbnailBitmapSdk29Producer", aVar != null);
            this.f30680g.B("local", "thumbnail_bitmap");
        }
    }

    public class b extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f30684a;

        public b(m0 m0Var) {
            this.f30684a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f30684a.a();
        }
    }

    public S(Executor executor, ContentResolver contentResolver) {
        this.f30677a = executor;
        this.f30678b = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        g0 z02 = e0Var.z0();
        com.facebook.imagepipeline.request.b D02 = e0Var.D0();
        e0Var.B("local", "thumbnail_bitmap");
        a aVar = new a(interfaceC3030n, z02, e0Var, "LocalThumbnailBitmapSdk29Producer", z02, e0Var, D02, new CancellationSignal());
        e0Var.k(new b(aVar));
        this.f30677a.execute(aVar);
    }

    public final String e(com.facebook.imagepipeline.request.b bVar) {
        return com.facebook.common.util.f.e(this.f30678b, bVar.getSourceUri());
    }
}
