package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w1m extends hoi implements Function2 {
    public g5m r;
    public RecyclerView s;
    public u t;
    public int u;
    public int v;
    public final /* synthetic */ g5m w;
    public final /* synthetic */ int x;
    public final /* synthetic */ RecyclerView y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1m(g5m g5mVar, int i, RecyclerView recyclerView, Function1<u, Unit> function1, rq3<? super w1m> rq3Var) {
        super(2, rq3Var);
        this.w = g5mVar;
        this.x = i;
        this.y = recyclerView;
        this.z = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new w1m(this.w, this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w1m) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (kotlin.Unit.a == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0087, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r10, kotlin.Unit.a) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[Catch: all -> 0x008a, CancellationException -> 0x009d, TryCatch #2 {CancellationException -> 0x009d, all -> 0x008a, blocks: (B:6:0x0012, B:7:0x007d, B:8:0x0081, B:10:0x0028, B:14:0x003a, B:18:0x0048, B:24:0x0078, B:28:0x002f), top: B:5:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:8:0x0081). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        g5m g5mVar;
        RecyclerView recyclerView;
        View view;
        u uVar;
        Unit unit;
        lu3 lu3Var = lu3.a;
        int i2 = this.v;
        u uVar2 = null;
        if (i2 == 0) {
            y6a.M(obj);
            g5m g5mVar2 = this.w;
            i = this.x;
            g5mVar = g5mVar2;
            recyclerView = this.y;
            if (!g5mVar.c) {
                u findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
                if (findViewHolderForAdapterPosition != null) {
                    uVar = findViewHolderForAdapterPosition;
                    if (bea.B(getContext()) && uVar == null) {
                        if (recyclerView == null) {
                            this.r = g5mVar;
                            this.s = recyclerView;
                            this.t = uVar;
                            this.u = i;
                            this.v = 1;
                            lj2 lj2Var = new lj2(1, z9a.b(this));
                            lj2Var.t();
                            lj2Var.v(new exm(lz.q(recyclerView, new vxm(lj2Var))));
                            Object q = lj2Var.q();
                            if (q == lu3.a) {
                                if (q == lu3Var) {
                                    return lu3Var;
                                }
                            }
                            unit = Unit.a;
                        } else {
                            unit = null;
                        }
                    }
                    uVar2 = uVar;
                    if (uVar2 != null && (view = uVar2.itemView) != null) {
                        view.post(new wxl(this.z, uVar2));
                    }
                    return Unit.a;
                }
            }
            uVar = null;
            if (bea.B(getContext())) {
                if (recyclerView == null) {
                }
            }
            uVar2 = uVar;
            if (uVar2 != null) {
                view.post(new wxl(this.z, uVar2));
            }
            return Unit.a;
        }
        if (i2 != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.u;
        uVar = this.t;
        recyclerView = this.s;
        g5mVar = this.r;
        try {
            y6a.M(obj);
            unit = Unit.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }
}
