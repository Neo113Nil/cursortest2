package ke;

import androidx.lifecycle.d1;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import com.sports.insider.ui.onboarding.SportInsiderFragment;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19065b;

    /* renamed from: c, reason: collision with root package name */
    public int f19066c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SportInsiderFragment f19067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(SportInsiderFragment sportInsiderFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19065b = i5;
        this.f19067d = sportInsiderFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19065b) {
            case 0:
                return new u(this.f19067d, continuation, 0);
            case 1:
                return new u(this.f19067d, continuation, 1);
            default:
                return new u(this.f19067d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19065b) {
        }
        return ((u) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19065b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f19066c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f19066c = 1;
                    if (SportInsiderFragment.G(this.f19067d, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                zc.d.c("OnClickNotAutoNavigate", "SportInsiderFragment");
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f19066c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f19066c = 1;
                    if (SportInsiderFragment.G(this.f19067d, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f19066c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    SportInsiderFragment sportInsiderFragment = this.f19067d;
                    y lifecycle = sportInsiderFragment.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    x xVar = x.f2256d;
                    ab.b bVar = new ab.b(sportInsiderFragment, (Continuation) null, 17);
                    this.f19066c = 1;
                    if (d1.j(lifecycle, xVar, bVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
