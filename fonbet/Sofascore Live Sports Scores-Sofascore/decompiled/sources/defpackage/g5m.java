package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class g5m extends tbb {
    public final ku3 b;
    public boolean c;
    public RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5m(@NotNull j25 j25Var, @NotNull ku3 ku3Var) {
        super(j25Var);
        j25Var.getClass();
        ku3Var.getClass();
        this.b = ku3Var;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.d = recyclerView;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:12:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009d -> B:13:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(int i, sq3 sq3Var) {
        qpl qplVar;
        int i2;
        RecyclerView recyclerView;
        u findViewHolderForAdapterPosition;
        if (sq3Var instanceof qpl) {
            qplVar = (qpl) sq3Var;
            int i3 = qplVar.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qplVar.x = i3 - Integer.MIN_VALUE;
                Object obj = qplVar.v;
                lu3 lu3Var = lu3.a;
                i2 = qplVar.x;
                if (i2 != 0) {
                    y6a.M(obj);
                    recyclerView = this.d;
                    if (!this.c) {
                    }
                    findViewHolderForAdapterPosition = null;
                    if (bea.B(qplVar.getContext())) {
                    }
                    return findViewHolderForAdapterPosition;
                }
                if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = qplVar.r;
                u uVar = qplVar.u;
                recyclerView = qplVar.t;
                g5m g5mVar = qplVar.s;
                try {
                    y6a.M(obj);
                    Unit unit = Unit.a;
                    u uVar2 = uVar;
                    i = i4;
                    this = g5mVar;
                    RecyclerView recyclerView2 = recyclerView;
                    qpl qplVar2 = qplVar;
                    u uVar3 = uVar2;
                    if (!Intrinsics.c(unit, Unit.a)) {
                        return uVar3;
                    }
                    qplVar = qplVar2;
                    recyclerView = recyclerView2;
                    if (!this.c) {
                        findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
                        if (findViewHolderForAdapterPosition != null) {
                            if (bea.B(qplVar.getContext()) || findViewHolderForAdapterPosition != null) {
                                return findViewHolderForAdapterPosition;
                            }
                            if (recyclerView != null) {
                                qplVar.s = this;
                                qplVar.t = recyclerView;
                                qplVar.u = findViewHolderForAdapterPosition;
                                qplVar.r = i;
                                qplVar.x = 1;
                                lj2 lj2Var = new lj2(1, z9a.b(qplVar));
                                lj2Var.t();
                                lj2Var.v(new exm(lz.q(recyclerView, new vxm(lj2Var))));
                                Object q = lj2Var.q();
                                if (q != lu3.a) {
                                    q = Unit.a;
                                }
                                if (q == lu3Var) {
                                    return lu3Var;
                                }
                                g5mVar = this;
                                i4 = i;
                                uVar = findViewHolderForAdapterPosition;
                                Unit unit2 = Unit.a;
                                u uVar22 = uVar;
                                i = i4;
                                this = g5mVar;
                                RecyclerView recyclerView22 = recyclerView;
                                qpl qplVar22 = qplVar;
                                u uVar32 = uVar22;
                                if (!Intrinsics.c(unit2, Unit.a)) {
                                }
                            } else {
                                recyclerView22 = recyclerView;
                                qplVar22 = qplVar;
                                uVar32 = findViewHolderForAdapterPosition;
                                unit2 = null;
                                if (!Intrinsics.c(unit2, Unit.a)) {
                                }
                            }
                        }
                    }
                    findViewHolderForAdapterPosition = null;
                    if (bea.B(qplVar.getContext())) {
                    }
                    return findViewHolderForAdapterPosition;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        qplVar = new qpl(this, sq3Var);
        Object obj2 = qplVar.v;
        lu3 lu3Var2 = lu3.a;
        i2 = qplVar.x;
        if (i2 != 0) {
        }
    }

    public final void r(int i, Function1 function1) {
        xw3.L(this.b, null, null, new w1m(this, i, this.d, function1, null), 3);
    }

    public final void s(List list) {
        this.c = true;
        this.a.b(list, new xtl(this, 8));
    }
}
