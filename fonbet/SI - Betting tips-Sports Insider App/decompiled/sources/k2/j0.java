package k2;

import android.database.SQLException;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18688b;

    /* renamed from: c, reason: collision with root package name */
    public int f18689c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f18691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(o0 o0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f18688b = i5;
        this.f18691e = o0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f18688b) {
            case 0:
                j0 j0Var = new j0(this.f18691e, continuation, 0);
                j0Var.f18690d = obj;
                return j0Var;
            default:
                j0 j0Var2 = new j0(this.f18691e, continuation, 1);
                j0Var2.f18690d = obj;
                return j0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18688b) {
            case 0:
                return ((j0) create((m2.l) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((j0) create((c0) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        switch (this.f18688b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f18689c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                m2.l lVar = (m2.l) this.f18690d;
                this.f18689c = 1;
                Object a7 = o0.a(this.f18691e, lVar, this);
                return a7 == aVar ? aVar : a7;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f18689c;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        c0Var = (c0) this.f18690d;
                        this.f18690d = c0Var;
                        this.f18689c = 1;
                        obj = c0Var.a(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return (Set) obj;
                        }
                        c0Var = (c0) this.f18690d;
                        h8.b.B(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return kotlin.collections.g0.f19206a;
                    }
                    b0 b0Var = b0.f18651b;
                    j0 j0Var = new j0(this.f18691e, null, 0);
                    this.f18690d = null;
                    this.f18689c = 2;
                    obj = c0Var.b(b0Var, j0Var, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    return (Set) obj;
                } catch (SQLException unused) {
                    return kotlin.collections.g0.f19206a;
                }
        }
    }
}
