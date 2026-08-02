package Na;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class c {
    public static b a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new com.google.android.play.core.review.b(new g(context));
    }
}
