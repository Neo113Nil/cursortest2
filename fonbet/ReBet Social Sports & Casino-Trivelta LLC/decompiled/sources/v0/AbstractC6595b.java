package v0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6595b {
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
