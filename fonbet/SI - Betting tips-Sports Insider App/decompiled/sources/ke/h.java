package ke;

import androidx.lifecycle.d1;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import com.sports.insider.ui.onboarding.IdentifyFragment;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19035b;

    /* renamed from: c, reason: collision with root package name */
    public int f19036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IdentifyFragment f19037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(IdentifyFragment identifyFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19035b = i5;
        this.f19037d = identifyFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19035b) {
            case 0:
                return new h(this.f19037d, continuation, 0);
            case 1:
                return new h(this.f19037d, continuation, 1);
            default:
                return new h(this.f19037d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19035b) {
        }
        return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19035b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f19036c;
                IdentifyFragment identifyFragment = this.f19037d;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f19036c = 1;
                    if (IdentifyFragment.H(identifyFragment, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        zc.d.c("OnClickNotAutoNavigate", "IdentifyFragment");
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                if (identifyFragment.f6937f.get()) {
                    zc.d.c("OnClickNotAutoNavigateRepeat", "IdentifyFragment");
                    return Unit.f19194a;
                }
                this.f19036c = 2;
                if (IdentifyFragment.G(identifyFragment, this) == aVar) {
                    return aVar;
                }
                zc.d.c("OnClickNotAutoNavigate", "IdentifyFragment");
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f19036c;
                IdentifyFragment identifyFragment2 = this.f19037d;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f19036c = 1;
                    if (IdentifyFragment.H(identifyFragment2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                if (identifyFragment2.f6937f.get()) {
                    zc.d.c("OnStartedNavigateRepeat", "IdentifyFragment");
                } else {
                    this.f19036c = 2;
                    if (IdentifyFragment.G(identifyFragment2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f19194a;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f19036c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    IdentifyFragment identifyFragment3 = this.f19037d;
                    y lifecycle = identifyFragment3.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    x xVar = x.f2256d;
                    ab.b bVar = new ab.b(identifyFragment3, (Continuation) null, 15);
                    this.f19036c = 1;
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
