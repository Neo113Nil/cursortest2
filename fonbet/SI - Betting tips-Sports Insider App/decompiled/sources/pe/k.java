package pe;

import android.os.Parcelable;
import android.os.TransactionTooLargeException;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.k1;
import com.sports.insider.ui.strip.PredictionListFragment;
import ec.b0;
import eg.c0;
import eg.m0;
import eg.z;
import hg.d1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21845b;

    /* renamed from: c, reason: collision with root package name */
    public int f21846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PredictionListFragment f21847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(PredictionListFragment predictionListFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21845b = i5;
        this.f21847d = predictionListFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21845b) {
            case 0:
                return new k(this.f21847d, continuation, 0);
            default:
                return new k(this.f21847d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21845b) {
        }
        return ((k) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        k1 layoutManager;
        int i5 = this.f21845b;
        PredictionListFragment predictionListFragment = this.f21847d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f21846c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    bd.b bVar = new bd.b(2, null, 21);
                    this.f21846c = 1;
                    if (c0.A(dVar, bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Parcelable parcelable = predictionListFragment.H().f21866e;
                if (parcelable != null) {
                    try {
                        b0 b0Var = (b0) predictionListFragment.f22459a;
                        if (b0Var != null && (layoutManager = b0Var.f8875h.getLayoutManager()) != null) {
                            layoutManager.onRestoreInstanceState(parcelable);
                        }
                    } catch (TransactionTooLargeException unused) {
                        predictionListFragment.H().f21866e = null;
                    }
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f21846c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    d1 d1Var = da.r.f8343a;
                    y lifecycle = predictionListFragment.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    x xVar = x.f2253a;
                    hg.c f6 = androidx.lifecycle.d1.f(d1Var, lifecycle);
                    c1.y yVar = new c1.y(5, predictionListFragment);
                    this.f21846c = 1;
                    if (f6.a(yVar, this) == aVar2) {
                        return aVar2;
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
