package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hw3 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ ng2 d;
    public final /* synthetic */ jw3 e;

    public hw3(jw3 jw3Var, long j, Throwable th, Thread thread, ng2 ng2Var) {
        this.e = jw3Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = ng2Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j = this.a;
        long j2 = j / 1000;
        jw3 jw3Var = this.e;
        String d = jw3Var.d();
        if (d == null) {
            return Tasks.forResult(null);
        }
        z41 z41Var = jw3Var.c;
        z41Var.getClass();
        try {
            new File((File) ((r18) z41Var.c).c, (String) z41Var.b).createNewFile();
        } catch (IOException unused) {
        }
        q8h q8hVar = jw3Var.m;
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        q8hVar.g(this.b, this.c, "crash", new v36(j2, d, lm5Var), true);
        try {
        } catch (IOException unused2) {
        }
        if (!new File((File) jw3Var.g.c, ".ae" + j).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ng2 ng2Var = this.d;
        jw3Var.a(false, ng2Var, false);
        jw3Var.b(new jd2().a, Boolean.FALSE);
        return !jw3Var.b.i() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) ng2Var.h).get()).getTask().onSuccessTask((xx3) jw3Var.e.b, new dad(16, this, d));
    }
}
