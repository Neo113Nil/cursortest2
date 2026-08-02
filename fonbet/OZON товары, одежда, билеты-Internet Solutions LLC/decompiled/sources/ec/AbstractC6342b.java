package ec;

import android.util.Log;

/* renamed from: ec.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6342b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f62108a;

    static {
        boolean z11;
        try {
            Class.forName("pl.droidsonroids.gif.GifDrawable");
            z11 = true;
        } catch (Throwable unused) {
            Log.w("MarkwonImagesPlugin", "`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder");
            z11 = false;
        }
        f62108a = z11;
    }

    public static boolean a() {
        return f62108a;
    }
}
