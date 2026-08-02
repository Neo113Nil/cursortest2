package f1;

import a2.l;
import ag.u;
import android.content.Context;
import com.google.android.gms.internal.measurement.y3;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9307a;

    /* renamed from: b, reason: collision with root package name */
    public final h9.c f9308b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f9309c;

    /* renamed from: d, reason: collision with root package name */
    public final jg.d f9310d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9311e;

    /* renamed from: f, reason: collision with root package name */
    public volatile h9.c f9312f;

    public b(String name, h9.c cVar, Function1 produceMigrations, jg.d scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f9307a = name;
        this.f9308b = cVar;
        this.f9309c = produceMigrations;
        this.f9310d = scope;
        this.f9311e = new Object();
    }

    public final Object a(Object obj, u property) {
        h9.c cVar;
        Context thisRef = (Context) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        h9.c cVar2 = this.f9312f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f9311e) {
            try {
                if (this.f9312f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    h9.c cVar3 = this.f9308b;
                    Function1 function1 = this.f9309c;
                    Intrinsics.checkNotNull(applicationContext);
                    this.f9312f = y3.h(cVar3, (List) function1.invoke(applicationContext), this.f9310d, new l(4, applicationContext, this));
                }
                cVar = this.f9312f;
                Intrinsics.checkNotNull(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
