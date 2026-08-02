package le;

import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.ui.pays.LivePayFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19886b;

    /* renamed from: c, reason: collision with root package name */
    public int f19887c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LivePayFragment f19888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(LivePayFragment livePayFragment, int i5, Continuation continuation) {
        super(2, continuation);
        this.f19886b = 2;
        this.f19888d = livePayFragment;
        this.f19887c = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19886b) {
            case 0:
                return new n(this.f19888d, continuation, 0);
            case 1:
                return new n(this.f19888d, continuation, 1);
            default:
                return new n(this.f19888d, this.f19887c, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19886b) {
        }
        return ((n) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (eg.c0.A(r1, r6, r10) == r0) goto L34;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Typeface typeface;
        Typeface typeface2;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        int i5 = this.f19886b;
        LivePayFragment livePayFragment = this.f19888d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f19887c;
                try {
                } catch (Exception unused) {
                    kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
                    pair = new Pair(e0Var, e0Var);
                }
                if (i10 == 0) {
                    h8.b.B(obj);
                    z H = livePayFragment.H();
                    this.f19887c = 1;
                    H.f20027y.getClass();
                    obj = new hd.d().k(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                pair = (Pair) obj;
                lg.e eVar = eg.m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                ab.b bVar = new ab.b(livePayFragment, pair, null, 19);
                this.f19887c = 2;
                Object A = eg.c0.A(eVar2, bVar, this);
                if (A != aVar) {
                    return A;
                }
                return aVar;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f19887c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    try {
                        typeface = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).a();
                    } catch (Exception unused2) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        lg.e eVar3 = eg.m0.f9201a;
                        fg.e eVar4 = jg.q.f18523a;
                        o oVar = new o(livePayFragment, typeface, null, 0);
                        this.f19887c = 1;
                        break;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                try {
                    typeface2 = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).b();
                } catch (Exception unused3) {
                    typeface2 = null;
                }
                lg.e eVar5 = eg.m0.f9201a;
                fg.e eVar6 = jg.q.f18523a;
                o oVar2 = new o(livePayFragment, typeface2, null, 1);
                this.f19887c = 2;
                Object A2 = eg.c0.A(eVar6, oVar2, this);
                if (A2 != aVar2) {
                    return A2;
                }
                return aVar2;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ec.c0 c0Var = (ec.c0) livePayFragment.f22459a;
                if (c0Var != null && (frameLayout = c0Var.f8892h) != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
                    layoutParams.height = this.f19887c;
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(LivePayFragment livePayFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19886b = i5;
        this.f19888d = livePayFragment;
    }
}
