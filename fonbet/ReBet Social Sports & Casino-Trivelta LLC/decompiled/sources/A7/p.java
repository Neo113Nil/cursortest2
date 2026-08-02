package A7;

import android.net.Uri;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class p implements k {

    /* renamed from: a, reason: collision with root package name */
    public static p f247a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f248b = false;

    public static synchronized p f() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f247a == null) {
                    f247a = new p();
                }
                pVar = f247a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    @Override // A7.k
    public InterfaceC6713d a(com.facebook.imagepipeline.request.b bVar, Object obj) {
        C1023b c1023b = new C1023b(e(bVar.getSourceUri()).toString(), bVar.getResizeOptions(), bVar.getRotationOptions(), bVar.getImageDecodeOptions(), null, null);
        if (f248b) {
            c1023b.d(null);
            return c1023b;
        }
        c1023b.d(obj);
        return c1023b;
    }

    @Override // A7.k
    public InterfaceC6713d b(com.facebook.imagepipeline.request.b bVar, Uri uri, Object obj) {
        return new w6.i(e(uri).toString());
    }

    @Override // A7.k
    public InterfaceC6713d c(com.facebook.imagepipeline.request.b bVar, Object obj) {
        InterfaceC6713d interfaceC6713d;
        String str;
        com.facebook.imagepipeline.request.d postprocessor = bVar.getPostprocessor();
        if (postprocessor != null) {
            InterfaceC6713d postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            str = postprocessor.getClass().getName();
            interfaceC6713d = postprocessorCacheKey;
        } else {
            interfaceC6713d = null;
            str = null;
        }
        C1023b c1023b = new C1023b(e(bVar.getSourceUri()).toString(), bVar.getResizeOptions(), bVar.getRotationOptions(), bVar.getImageDecodeOptions(), interfaceC6713d, str);
        if (f248b) {
            c1023b.d(null);
            return c1023b;
        }
        c1023b.d(obj);
        return c1023b;
    }

    @Override // A7.k
    public InterfaceC6713d d(com.facebook.imagepipeline.request.b bVar, Object obj) {
        return b(bVar, bVar.getSourceUri(), obj);
    }

    public Uri e(Uri uri) {
        return uri;
    }
}
