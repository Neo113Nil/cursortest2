package j9;

import io.sentry.android.core.w0;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f18324e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f18325f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f18326a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f18327b;

    /* renamed from: c, reason: collision with root package name */
    public final d f18328c;

    /* renamed from: d, reason: collision with root package name */
    public final d f18329d;

    static {
        Charset.forName("UTF-8");
        f18324e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f18325f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public i(Executor executor, d dVar, d dVar2) {
        this.f18327b = executor;
        this.f18328c = dVar;
        this.f18329d = dVar2;
    }

    public static String c(d dVar, String str) {
        e c2 = dVar.c();
        if (c2 == null) {
            return null;
        }
        try {
            return c2.f18303b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void d(String str, String str2) {
        w0.m("FirebaseRemoteConfig", "No value of type '" + str2 + "' exists for parameter key '" + str + "'.");
    }

    public final void a(i9.g gVar) {
        synchronized (this.f18326a) {
            this.f18326a.add(gVar);
        }
    }

    public final void b(String str, e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f18326a) {
            try {
                Iterator it = this.f18326a.iterator();
                while (it.hasNext()) {
                    this.f18327b.execute(new androidx.fragment.app.d((i9.g) it.next(), str, eVar, 20));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
