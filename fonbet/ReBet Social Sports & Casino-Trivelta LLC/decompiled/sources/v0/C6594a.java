package v0;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import v0.h;
import v0.i;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6594a {

    /* renamed from: a, reason: collision with root package name */
    public final i.c f66768a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f66769b;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    public class RunnableC0933a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i.c f66770a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f66771b;

        public RunnableC0933a(i.c cVar, Typeface typeface) {
            this.f66770a = cVar;
            this.f66771b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f66770a.b(this.f66771b);
        }
    }

    /* renamed from: v0.a$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i.c f66773a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f66774b;

        public b(i.c cVar, int i10) {
            this.f66773a = cVar;
            this.f66774b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f66773a.a(this.f66774b);
        }
    }

    public C6594a(i.c cVar, Executor executor) {
        this.f66768a = cVar;
        this.f66769b = executor;
    }

    public final void a(int i10) {
        this.f66769b.execute(new b(this.f66768a, i10));
    }

    public void b(h.e eVar) {
        if (eVar.a()) {
            c(eVar.f66804a);
        } else {
            a(eVar.f66805b);
        }
    }

    public final void c(Typeface typeface) {
        this.f66769b.execute(new RunnableC0933a(this.f66768a, typeface));
    }
}
