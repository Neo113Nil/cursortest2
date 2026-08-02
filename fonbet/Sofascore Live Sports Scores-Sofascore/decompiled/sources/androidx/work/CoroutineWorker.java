package androidx.work;

import android.content.Context;
import defpackage.au3;
import defpackage.bea;
import defpackage.ddb;
import defpackage.gm8;
import defpackage.kdb;
import defpackage.lu3;
import defpackage.md4;
import defpackage.o3a;
import defpackage.ou3;
import defpackage.pu3;
import defpackage.rq3;
import defpackage.wx4;
import defpackage.x2a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0019\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/work/CoroutineWorker;", "Lkdb;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lddb;", "Ljdb;", "startWork", "()Lddb;", "Lgm8;", "getForegroundInfo", "(Lrq3;)Ljava/lang/Object;", "Lmd4;", "data", "", "setProgress", "(Lmd4;Lrq3;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Lgm8;Lrq3;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Landroidx/work/WorkerParameters;", "Lau3;", "coroutineContext", "Lau3;", "getCoroutineContext", "()Lau3;", "getCoroutineContext$annotations", "ou3", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends kdb {

    @NotNull
    private final au3 coroutineContext;

    @NotNull
    private final WorkerParameters params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.params = workerParameters;
        this.coroutineContext = ou3.c;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, rq3<? super gm8> rq3Var) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(rq3 rq3Var);

    @NotNull
    /* renamed from: getCoroutineContext, reason: from getter */
    public au3 getD() {
        return this.coroutineContext;
    }

    @Nullable
    public Object getForegroundInfo(@NotNull rq3<? super gm8> rq3Var) {
        return getForegroundInfo$suspendImpl(this, rq3Var);
    }

    @Override // defpackage.kdb
    @NotNull
    public final ddb getForegroundInfoAsync() {
        return x2a.D(getD().plus(bea.a()), new pu3(this, null, 0));
    }

    @Override // defpackage.kdb
    public final void onStopped() {
        super.onStopped();
    }

    @Nullable
    public final Object setForeground(@NotNull gm8 gm8Var, @NotNull rq3<? super Unit> rq3Var) {
        ddb foregroundAsync = setForegroundAsync(gm8Var);
        foregroundAsync.getClass();
        Object o = o3a.o(foregroundAsync, rq3Var);
        return o == lu3.a ? o : Unit.a;
    }

    @Nullable
    public final Object setProgress(@NotNull md4 md4Var, @NotNull rq3<? super Unit> rq3Var) {
        ddb progressAsync = setProgressAsync(md4Var);
        progressAsync.getClass();
        Object o = o3a.o(progressAsync, rq3Var);
        return o == lu3.a ? o : Unit.a;
    }

    @Override // defpackage.kdb
    @NotNull
    public final ddb startWork() {
        CoroutineContext d = !Intrinsics.c(getD(), ou3.c) ? getD() : this.params.g;
        d.getClass();
        return x2a.D(d.plus(bea.a()), new pu3(this, null, 1));
    }

    @wx4
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
