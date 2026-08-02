package k3;

import android.content.Context;
import com.google.firebase.messaging.x;
import e5.p;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final x f18797a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18798b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18799c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f18800d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18801e;

    public f(Context context, x taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f18797a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f18798b = applicationContext;
        this.f18799c = new Object();
        this.f18800d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f18799c) {
            Object obj2 = this.f18801e;
            if (obj2 == null || !Intrinsics.areEqual(obj2, obj)) {
                this.f18801e = obj;
                ((p) this.f18797a.f6185d).execute(new io.sentry.android.replay.util.c(9, CollectionsKt.W(this.f18800d), this));
                Unit unit = Unit.f19194a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
