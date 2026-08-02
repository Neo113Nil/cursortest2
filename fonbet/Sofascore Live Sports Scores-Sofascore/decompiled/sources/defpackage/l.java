package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.ironsource.U3;
import com.sofascore.results.R;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class l {
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;
    public static final q89 c = new q89((String[]) new ArrayList(20).toArray(new String[0]));

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.R(str)) {
            return null;
        }
        String i0 = StringsKt.i0(StringsKt.i0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.e0('.', StringsKt.e0('/', i0, i0), ""));
    }

    public static final dvk c(ImageView imageView) {
        dvk dvkVar;
        Object tag = imageView.getTag(R.id.coil_request_manager);
        dvk dvkVar2 = tag instanceof dvk ? (dvk) tag : null;
        if (dvkVar2 != null) {
            return dvkVar2;
        }
        synchronized (imageView) {
            try {
                Object tag2 = imageView.getTag(R.id.coil_request_manager);
                dvkVar = tag2 instanceof dvk ? (dvk) tag2 : null;
                if (dvkVar == null) {
                    dvkVar = new dvk(imageView);
                    imageView.addOnAttachStateChangeListener(dvkVar);
                    imageView.setTag(R.id.coil_request_manager, dvkVar);
                }
            } finally {
            }
        }
        return dvkVar;
    }

    public static final boolean d(Uri uri) {
        return Intrinsics.c(uri.getScheme(), U3.i.b) && Intrinsics.c((String) CollectionsKt.firstOrNull(uri.getPathSegments()), "android_asset");
    }

    public static final int e(s02 s02Var, int i) {
        if (s02Var instanceof u25) {
            return ((u25) s02Var).j;
        }
        int C = wt3.C(i);
        if (C == 0) {
            return Integer.MIN_VALUE;
        }
        if (C == 1) {
            return Integer.MAX_VALUE;
        }
        zzl.b();
        return 0;
    }
}
