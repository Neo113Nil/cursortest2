package V6;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f12529b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f12530c = true;

    /* renamed from: a, reason: collision with root package name */
    public final Queue f12531a = new ArrayBlockingQueue(20);

    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    public static c a() {
        return f12530c ? new c() : f12529b;
    }

    public void b(a aVar) {
        if (f12530c) {
            for (int i10 = 5; !this.f12531a.offer(aVar) && i10 > 0; i10--) {
                this.f12531a.poll();
            }
        }
    }

    public String toString() {
        return this.f12531a.toString();
    }
}
