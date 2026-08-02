package f0;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j {
    public static Handler getHandler(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void callbackFailAsync(int i5, Handler handler) {
        getHandler(handler).post(new com.google.android.material.sidesheet.b(i5, 1, this));
    }

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        getHandler(handler).post(new t(11, this, typeface));
    }

    public abstract void onFontRetrievalFailed(int i5);

    public abstract void onFontRetrieved(Typeface typeface);
}
