package Qc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class f {

    public static final class a extends M6.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9625a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function1 f9626b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f9627c;

        public a(Context context, Function1 function1, Uri uri) {
            this.f9625a = context;
            this.f9626b = function1;
            this.f9627c = uri;
        }

        @Override // M6.b
        public void onFailureImpl(M6.c dataSource) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            Log.e("ImageLoader", "[RNScreens] Error loading image: " + this.f9627c, dataSource.f());
        }

        @Override // M6.b
        public void onNewResultImpl(M6.c dataSource) {
            H6.a aVar;
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            if (dataSource.d() && (aVar = (H6.a) dataSource.getResult()) != null) {
                Object z02 = aVar.z0();
                Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
                H7.e eVar = (H7.e) z02;
                if (eVar instanceof H7.f) {
                    Bitmap A12 = ((H7.f) eVar).A1();
                    Intrinsics.checkNotNullExpressionValue(A12, "getUnderlyingBitmap(...)");
                    Resources resources = this.f9625a.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    this.f9626b.invoke(new BitmapDrawable(resources, A12));
                }
                aVar.close();
            }
        }
    }

    public static final void c(Context context, String uri, final Function1 onLoaded) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(onLoaded, "onLoaded");
        Uri c10 = new g(context, uri).c(context);
        if (c10 == null) {
            return;
        }
        f(context, c10, new Function1() { // from class: Qc.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d10;
                d10 = f.d(Function1.this, (Drawable) obj);
                return d10;
            }
        });
    }

    public static final Unit d(final Function1 function1, final Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Qc.e
            @Override // java.lang.Runnable
            public final void run() {
                f.e(Function1.this, drawable);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void e(Function1 function1, Drawable drawable) {
        function1.invoke(drawable);
    }

    public static final void f(Context context, Uri uri, Function1 function1) {
        com.facebook.drawee.backends.pipeline.d.a().k(com.facebook.imagepipeline.request.c.x(uri).a(), context).g(new a(context, function1, uri), B6.a.d());
    }
}
