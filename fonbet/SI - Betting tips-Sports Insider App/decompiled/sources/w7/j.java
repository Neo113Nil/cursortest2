package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import s7.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements l, d, c, b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24990a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f24991b;

    /* renamed from: c, reason: collision with root package name */
    public final a f24992c;

    /* renamed from: d, reason: collision with root package name */
    public final m f24993d;

    public /* synthetic */ j(Executor executor, a aVar, m mVar, int i5) {
        this.f24990a = i5;
        this.f24991b = executor;
        this.f24992c = aVar;
        this.f24993d = mVar;
    }

    @Override // w7.l
    public final void a(Task task) {
        switch (this.f24990a) {
            case 0:
                this.f24991b.execute(new w0(14, this, task));
                break;
            default:
                this.f24991b.execute(new w0(15, this, task));
                break;
        }
    }

    @Override // w7.b
    public void b() {
        this.f24993d.o();
    }

    @Override // w7.c
    public void c(Exception exc) {
        this.f24993d.n(exc);
    }

    @Override // w7.d
    public void onSuccess(Object obj) {
        this.f24993d.m(obj);
    }
}
