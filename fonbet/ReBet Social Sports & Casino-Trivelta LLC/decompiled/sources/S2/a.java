package S2;

import Q2.AbstractC1508t;
import Q2.F;
import Q2.InterfaceC1491b;
import R2.InterfaceC1545v;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final String f10543e = AbstractC1508t.i("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1545v f10544a;

    /* renamed from: b, reason: collision with root package name */
    public final F f10545b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1491b f10546c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f10547d = new HashMap();

    /* renamed from: S2.a$a, reason: collision with other inner class name */
    public class RunnableC0203a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f10548a;

        public RunnableC0203a(WorkSpec workSpec) {
            this.f10548a = workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1508t.e().a(a.f10543e, "Scheduling work " + this.f10548a.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
            a.this.f10544a.b(this.f10548a);
        }
    }

    public a(InterfaceC1545v interfaceC1545v, F f10, InterfaceC1491b interfaceC1491b) {
        this.f10544a = interfaceC1545v;
        this.f10545b = f10;
        this.f10546c = interfaceC1491b;
    }

    public void a(WorkSpec workSpec, long j10) {
        Runnable runnable = (Runnable) this.f10547d.remove(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
        if (runnable != null) {
            this.f10545b.a(runnable);
        }
        RunnableC0203a runnableC0203a = new RunnableC0203a(workSpec);
        this.f10547d.put(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String, runnableC0203a);
        this.f10545b.b(j10 - this.f10546c.a(), runnableC0203a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f10547d.remove(str);
        if (runnable != null) {
            this.f10545b.a(runnable);
        }
    }
}
