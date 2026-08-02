package androidx.work;

import android.content.Context;
import androidx.work.b;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.kyx0;
import xsna.n7s;
import xsna.ub9;
import xsna.ugz;

/* compiled from: Worker.kt */
/* loaded from: classes.dex */
public abstract class Worker extends androidx.work.b {

    /* compiled from: Worker.kt */
    /* loaded from: classes12.dex */
    public static final class a extends Lambda implements gzs<n7s> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final n7s invoke() {
            return Worker.this.getForegroundInfo();
        }
    }

    /* compiled from: Worker.kt */
    public static final class b extends Lambda implements gzs<b.a> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final b.a invoke() {
            return Worker.this.doWork();
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract b.a doWork();

    public n7s getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // androidx.work.b
    public ugz<n7s> getForegroundInfoAsync() {
        return ub9.a(new kyx0(getBackgroundExecutor(), new a()));
    }

    @Override // androidx.work.b
    public final ugz<b.a> startWork() {
        return ub9.a(new kyx0(getBackgroundExecutor(), new b()));
    }
}
