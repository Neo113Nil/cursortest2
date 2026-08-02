package androidx.work;

import android.content.Context;
import e3.g;
import e3.w;
import eg.c0;
import eg.g1;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u.k;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Le3/w;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "e3/g", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends w {

    /* renamed from: e, reason: collision with root package name */
    public final WorkerParameters f2914e;

    /* renamed from: f, reason: collision with root package name */
    public final g f2915f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f2914e = params;
        this.f2915f = g.f8518c;
    }

    @Override // e3.w
    public final k a() {
        g1 c2 = c0.c();
        g gVar = this.f2915f;
        gVar.getClass();
        return h.q(e.c(gVar, c2), new e3.h(this, null, 0));
    }

    @Override // e3.w
    public final k b() {
        g gVar = g.f8518c;
        CoroutineContext coroutineContext = this.f2915f;
        if (Intrinsics.areEqual(coroutineContext, gVar)) {
            coroutineContext = this.f2914e.f2921e;
        }
        Intrinsics.checkNotNull(coroutineContext);
        return h.q(coroutineContext.t(c0.c()), new e3.h(this, null, 1));
    }

    public abstract Object c(e3.h hVar);
}
