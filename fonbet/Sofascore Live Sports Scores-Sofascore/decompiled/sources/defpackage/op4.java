package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class op4 implements b99, c99 {
    public final koa a;
    public final Context b;
    public final vff c;
    public final Set d;
    public final Executor e;

    public op4(Context context, String str, Set set, vff vffVar, Executor executor) {
        this.a = new koa(new lc3(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = vffVar;
        this.b = context;
    }

    public final Task a() {
        if (!kda.D(this.b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new np4(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!kda.D(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new np4(this, 1));
        }
    }
}
