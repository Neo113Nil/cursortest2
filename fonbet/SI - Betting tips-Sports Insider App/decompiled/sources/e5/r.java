package e5;

import android.content.Context;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.c1;
import com.google.firebase.messaging.x;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f8662e;

    /* renamed from: a, reason: collision with root package name */
    public final n5.a f8663a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.a f8664b;

    /* renamed from: c, reason: collision with root package name */
    public final j5.b f8665c;

    /* renamed from: d, reason: collision with root package name */
    public final k5.h f8666d;

    public r(n5.a aVar, n5.a aVar2, j5.b bVar, k5.h hVar, x xVar) {
        this.f8663a = aVar;
        this.f8664b = aVar2;
        this.f8665c = bVar;
        this.f8666d = hVar;
        ((Executor) xVar.f6182a).execute(new io.sentry.android.core.f(13, xVar));
    }

    public static r a() {
        j jVar = f8662e;
        if (jVar != null) {
            return (r) ((ff.a) jVar.f8648e).get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f8662e == null) {
            synchronized (r.class) {
                try {
                    if (f8662e == null) {
                        b2.e eVar = new b2.e();
                        context.getClass();
                        eVar.f2968a = context;
                        f8662e = eVar.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final q c(k kVar) {
        byte[] bytes;
        Set unmodifiableSet = kVar != null ? DesugarCollections.unmodifiableSet(c5.a.f3636d) : Collections.singleton(new b5.c("proto"));
        v0 a7 = i.a();
        kVar.getClass();
        a7.f364b = "cct";
        c5.a aVar = (c5.a) kVar;
        String str = aVar.f3639a;
        String str2 = aVar.f3640b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = c1.o("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a7.f365c = bytes;
        return new q(unmodifiableSet, a7.d(), this);
    }
}
