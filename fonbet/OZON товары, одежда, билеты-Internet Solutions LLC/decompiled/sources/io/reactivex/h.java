package io.reactivex;

import Bl0.C2645f;
import Kc.C3493a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.InterfaceC6948a;
import hg.InterfaceC6949b;
import sc.C9653a;
import sc.C9656b;
import tc.InterfaceCallableC9806h;
import wc.C10496q;
import wc.K;
import wc.M;
import wc.S;

/* loaded from: classes.dex */
public abstract class h<T> implements InterfaceC6948a<T> {

    /* renamed from: a, reason: collision with root package name */
    static final int f66519a = Math.max(1, Integer.getInteger("rx2.buffer-size", UserVerificationMethods.USER_VERIFY_PATTERN).intValue());

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f66520b = 0;

    public static int c() {
        return f66519a;
    }

    @Override // hg.InterfaceC6948a
    public final void a(InterfaceC6949b<? super T> interfaceC6949b) {
        if (interfaceC6949b instanceof j) {
            i((j) interfaceC6949b);
        } else {
            C9656b.c(interfaceC6949b, "s is null");
            i(new Ec.f(interfaceC6949b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h e(ru.ozon.app.android.network.websockets.a aVar) {
        int i11 = f66519a;
        C9656b.d(i11, "maxConcurrency");
        C9656b.d(i11, "bufferSize");
        if (!(this instanceof InterfaceCallableC9806h)) {
            return new wc.r(this, aVar, i11, i11);
        }
        T call = ((InterfaceCallableC9806h) this).call();
        return call == null ? C10496q.f104024c : M.a(call, aVar);
    }

    public final wc.y f(x xVar) {
        C9656b.c(xVar, "scheduler is null");
        int i11 = f66519a;
        C9656b.d(i11, "bufferSize");
        return new wc.y(this, xVar, i11);
    }

    public final K h() {
        return new K(this, C9653a.c());
    }

    public final void i(j<? super T> jVar) {
        C9656b.c(jVar, "s is null");
        try {
            j(jVar);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            C2645f.c(th2);
            C3493a.f(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    protected abstract void j(j jVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final h k(DJ.e eVar) {
        int i11 = f66519a;
        C9656b.d(i11, "bufferSize");
        if (!(this instanceof InterfaceCallableC9806h)) {
            return new S(this, eVar, i11);
        }
        T call = ((InterfaceCallableC9806h) this).call();
        return call == null ? C10496q.f104024c : M.a(call, eVar);
    }
}
