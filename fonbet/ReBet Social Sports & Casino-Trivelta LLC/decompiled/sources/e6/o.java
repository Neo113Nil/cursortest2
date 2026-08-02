package e6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import com.facebook.imagepipeline.request.b;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public AtomicInteger f45731a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f45732b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f45733c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f45734d;

    /* renamed from: e, reason: collision with root package name */
    public d f45735e;

    public class a extends D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f45736a;

        public a(o oVar) {
            this.f45736a = oVar;
        }

        @Override // D7.b
        public void a(Bitmap bitmap) {
            this.f45736a.e(bitmap);
        }

        @Override // M6.b
        public void onFailureImpl(M6.c cVar) {
            this.f45736a.e(null);
        }
    }

    public class b extends D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f45738a;

        public b(o oVar) {
            this.f45738a = oVar;
        }

        @Override // D7.b
        public void a(Bitmap bitmap) {
            this.f45738a.g(bitmap);
        }

        @Override // M6.b
        public void onFailureImpl(M6.c cVar) {
            this.f45738a.g(null);
        }
    }

    public class c extends D7.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f45740a;

        public c(o oVar) {
            this.f45740a = oVar;
        }

        @Override // D7.b
        public void a(Bitmap bitmap) {
            this.f45740a.c(bitmap);
        }

        @Override // M6.b
        public void onFailureImpl(M6.c cVar) {
            this.f45740a.c(null);
        }
    }

    public interface d {
        void a(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);
    }

    public o(d dVar) {
        this.f45735e = dVar;
    }

    public final void a(Context context, Uri uri, D7.b bVar) {
        com.facebook.imagepipeline.request.b a10 = com.facebook.imagepipeline.request.c.x(uri).M(B7.f.f846d).I(b.c.FULL_FETCH).a();
        if (!com.facebook.drawee.backends.pipeline.d.c()) {
            com.facebook.drawee.backends.pipeline.d.d(context);
        }
        com.facebook.drawee.backends.pipeline.d.a().k(a10, context).g(bVar, B6.a.d());
    }

    public final void b() {
        d dVar;
        synchronized (this.f45731a) {
            try {
                if (this.f45731a.incrementAndGet() >= 3 && (dVar = this.f45735e) != null) {
                    dVar.a(this.f45732b, this.f45733c, this.f45734d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(Bitmap bitmap) {
        this.f45734d = bitmap;
        b();
    }

    public void d(Context context, String str) {
        if (str == null) {
            c(null);
            return;
        }
        try {
            a(context, Uri.parse(str), new c(this));
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to parse bigLargeIconUrl", e10);
            c(null);
        }
    }

    public void e(Bitmap bitmap) {
        this.f45733c = bitmap;
        b();
    }

    public void f(Context context, String str) {
        if (str == null) {
            e(null);
            return;
        }
        try {
            a(context, Uri.parse(str), new a(this));
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to parse bigPictureUrl", e10);
            e(null);
        }
    }

    public void g(Bitmap bitmap) {
        this.f45732b = bitmap;
        b();
    }

    public void h(Context context, String str) {
        if (str == null) {
            g(null);
            return;
        }
        try {
            a(context, Uri.parse(str), new b(this));
        } catch (Exception e10) {
            Log.e(RNPushNotification.LOG_TAG, "Failed to parse largeIconUrl", e10);
            g(null);
        }
    }
}
