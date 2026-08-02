package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class T implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30686a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f30687b;

    public class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g0 f30688f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e0 f30689g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.facebook.imagepipeline.request.b f30690h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3030n interfaceC3030n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, com.facebook.imagepipeline.request.b bVar) {
            super(interfaceC3030n, g0Var, e0Var, str);
            this.f30688f = g0Var2;
            this.f30689g = e0Var2;
            this.f30690h = bVar;
        }

        @Override // com.facebook.imagepipeline.producers.m0, B6.h
        public void e(Exception exc) {
            super.e(exc);
            this.f30688f.b(this.f30689g, "VideoThumbnailProducer", false);
            this.f30689g.B("local", "video");
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
            try {
                str = T.this.i(this.f30690h);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            Bitmap createVideoThumbnail = str != null ? ThumbnailUtils.createVideoThumbnail(str, T.g(this.f30690h)) : null;
            if (createVideoThumbnail == null) {
                createVideoThumbnail = T.h(T.this.f30687b, this.f30690h.getSourceUri());
            }
            if (createVideoThumbnail == null) {
                return null;
            }
            H7.f m02 = H7.f.m0(createVideoThumbnail, z7.f.a(), H7.o.f4868d, 0);
            this.f30689g.U("image_format", "thumbnail");
            m02.m1(this.f30689g.getExtras());
            return H6.a.D0(m02);
        }

        @Override // com.facebook.imagepipeline.producers.m0, B6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(H6.a aVar) {
            super.f(aVar);
            this.f30688f.b(this.f30689g, "VideoThumbnailProducer", aVar != null);
            this.f30689g.B("local", "video");
        }
    }

    public class b extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f30692a;

        public b(m0 m0Var) {
            this.f30692a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f30692a.a();
        }
    }

    public T(Executor executor, ContentResolver contentResolver) {
        this.f30686a = executor;
        this.f30687b = contentResolver;
    }

    public static int g(com.facebook.imagepipeline.request.b bVar) {
        return (bVar.getPreferredWidth() > 96 || bVar.getPreferredHeight() > 96) ? 1 : 3;
    }

    public static Bitmap h(ContentResolver contentResolver, Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            D6.k.g(openFileDescriptor);
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
                return frameAtTime;
            } catch (FileNotFoundException unused2) {
                if (mediaMetadataRetriever != null) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    try {
                        mediaMetadataRetriever2.release();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            mediaMetadataRetriever = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(com.facebook.imagepipeline.request.b bVar) {
        return com.facebook.common.util.f.e(this.f30687b, bVar.getSourceUri());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        g0 z02 = e0Var.z0();
        com.facebook.imagepipeline.request.b D02 = e0Var.D0();
        e0Var.B("local", "video");
        a aVar = new a(interfaceC3030n, z02, e0Var, "VideoThumbnailProducer", z02, e0Var, D02);
        e0Var.k(new b(aVar));
        this.f30686a.execute(aVar);
    }
}
