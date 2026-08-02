package androidx.work;

import android.content.Context;
import ci.c;
import com.google.firebase.messaging.g;
import e3.n0;
import e3.u;
import e3.w;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Le3/w;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Worker extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // e3.w
    public final k a() {
        ExecutorService executorService = this.f8566b.f2920d;
        Intrinsics.checkNotNullExpressionValue(executorService, "getBackgroundExecutor(...)");
        k s8 = c.s(new g(4, executorService, new n0(this, 1)));
        Intrinsics.checkNotNullExpressionValue(s8, "getFuture(...)");
        return s8;
    }

    @Override // e3.w
    public final k b() {
        ExecutorService executorService = this.f8566b.f2920d;
        Intrinsics.checkNotNullExpressionValue(executorService, "getBackgroundExecutor(...)");
        k s8 = c.s(new g(4, executorService, new n0(this, 0)));
        Intrinsics.checkNotNullExpressionValue(s8, "getFuture(...)");
        return s8;
    }

    public abstract u c();
}
