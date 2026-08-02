package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import com.facebook.hermes.intl.Constants;

/* loaded from: classes.dex */
public abstract class h {

    public static class a {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static u0.i a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return u0.i.b(e.b(context));
        }
        Object b10 = b(context);
        return b10 != null ? u0.i.i(a.a(b10)) : u0.i.d();
    }

    public static Object b(Context context) {
        return context.getSystemService(Constants.LOCALE);
    }
}
