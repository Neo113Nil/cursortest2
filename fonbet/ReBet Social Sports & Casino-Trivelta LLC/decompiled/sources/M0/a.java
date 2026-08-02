package M0;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final a f7395a;

    public a(a aVar) {
        this.f7395a = aVar;
    }

    public static a b(Context context, Uri uri) {
        return new c(null, context, uri);
    }

    public abstract boolean a();

    public abstract boolean c();

    public abstract long d();
}
