package f3;

import gh.o0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 implements Function1, gh.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9390a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9391b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9392c;

    public /* synthetic */ k0(int i5, Object obj, Object obj2) {
        this.f9390a = i5;
        this.f9391b = obj;
        this.f9392c = obj2;
    }

    @Override // gh.f
    public void a(o0 o0Var) {
        eg.l lVar = (eg.l) this.f9392c;
        gf.o oVar = gf.q.f10031a;
        lVar.resumeWith(o0Var);
    }

    @Override // gh.f
    public void b(gh.e eVar, IOException iOException) {
        if (((kh.p) eVar).q) {
            return;
        }
        eg.l lVar = (eg.l) this.f9392c;
        gf.o oVar = gf.q.f10031a;
        lVar.resumeWith(h8.b.h(iOException));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9390a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof y) {
                    e3.w wVar = (e3.w) this.f9391b;
                    wVar.f8567c.compareAndSet(-256, ((y) th2).f9436a);
                }
                ((g8.b) this.f9392c).cancel(false);
                break;
            default:
                try {
                    ((kh.p) this.f9391b).cancel();
                } catch (Throwable unused) {
                }
                break;
        }
        return Unit.f19194a;
    }
}
