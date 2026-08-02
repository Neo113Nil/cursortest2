package c4;

import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import te.k0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends kotlin.coroutines.a implements CoroutineExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(kotlin.coroutines.f fVar, int i5) {
        super(fVar);
        this.f3633b = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void W(Throwable th2, CoroutineContext coroutineContext) {
        int i5 = this.f3633b;
        eg.x xVar = eg.y.f9241c;
        Object[] objArr = 0;
        switch (i5) {
            case 0:
                break;
            case 1:
                eg.y yVar = (eg.y) coroutineContext.r(xVar);
                String str = yVar != null ? yVar.f9242b : null;
                if (str == null) {
                    str = "handlerCoroutineException";
                }
                pc.u.r(th2, str, new io.sentry.e(""));
                break;
            default:
                if (!(th2 instanceof CancellationException)) {
                    eg.y yVar2 = (eg.y) coroutineContext.r(xVar);
                    String str2 = yVar2 != null ? yVar2.f9242b : null;
                    w wVar = zc.a.f25907a;
                    jg.d dVar = MyApp.f6830c;
                    lg.e eVar = m0.f9201a;
                    c0.t(dVar, lg.d.f20063c, null, new k0(th2, str2, objArr == true ? 1 : 0, 3), 2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(pc.u uVar) {
        super(eg.x.f9236a);
        this.f3633b = 1;
    }

    private final void c0(Throwable th2, CoroutineContext coroutineContext) {
    }
}
