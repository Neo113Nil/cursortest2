package com.sofascore.results.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.same.report.j;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import defpackage.a70;
import defpackage.ao2;
import defpackage.h6b;
import defpackage.hs4;
import defpackage.k84;
import defpackage.l84;
import defpackage.llf;
import defpackage.lu3;
import defpackage.m84;
import defpackage.nq8;
import defpackage.q8g;
import defpackage.qha;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.u1;
import defpackage.u6b;
import defpackage.wca;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yhk;
import defpackage.z45;
import defpackage.z82;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/sofascore/results/view/CupTreeView;", "Lh6b;", "", "getLayoutId", "()I", "", "Lcom/sofascore/model/cuptree/CupTree;", "cupTrees", "", "setCupTrees", "(Ljava/util/List;)V", "Landroid/widget/LinearLayout;", "getCupTreeContainerView", "()Landroid/widget/LinearLayout;", "Lq8g;", j.b, "Lq8g;", "getRowStyle", "()Lq8g;", "setRowStyle", "(Lq8g;)V", "rowStyle", "t62", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CupTreeView extends h6b {
    public static final /* synthetic */ int q = 0;
    public final z82 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    /* renamed from: j, reason: from kotlin metadata */
    public q8g rowStyle;
    public List k;
    public boolean l;
    public Integer m;
    public Integer n;
    public boolean o;
    public boolean p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CupTreeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        View root = getRoot();
        int i2 = R.id.cup_tree_bubble_container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.cup_tree_bubble_container, root);
        if (linearLayout != null) {
            i2 = R.id.cup_tree_container;
            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.cup_tree_container, root);
            if (linearLayout2 != null) {
                i2 = R.id.cup_tree_empty_state;
                GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.cup_tree_empty_state, root);
                if (graphicLarge != null) {
                    i2 = R.id.subtitle;
                    TextView textView = (TextView) nq8.B(R.id.subtitle, root);
                    if (textView != null) {
                        i2 = R.id.title;
                        TextView textView2 = (TextView) nq8.B(R.id.title, root);
                        if (textView2 != null) {
                            this.d = new z82((ViewGroup) root, linearLayout, (View) linearLayout2, (FrameLayout) graphicLarge, textView, (View) textView2, 8);
                            this.e = ao2.s(360, context);
                            this.f = ao2.v(8, context);
                            this.g = ao2.v(68, context);
                            this.h = ao2.v(80, context);
                            this.rowStyle = q8g.CARD;
                            graphicLarge.setVisibility(8);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        List list = this.k;
        if (list != null) {
            wca.x(u6bVar.getLifecycle()).c(new m84(this, list, null, 0));
        }
    }

    @NotNull
    public final LinearLayout getCupTreeContainerView() {
        return (LinearLayout) this.d.c;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.cup_tree_view;
    }

    @NotNull
    public final q8g getRowStyle() {
        return this.rowStyle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (defpackage.xw3.R(r12, r5, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(List list, sq3 sq3Var) {
        k84 k84Var;
        int i;
        if (sq3Var instanceof k84) {
            k84Var = (k84) sq3Var;
            int i2 = k84Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k84Var.t = i2 - Integer.MIN_VALUE;
                Object obj = k84Var.r;
                lu3 lu3Var = lu3.a;
                i = k84Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    k84Var.t = 1;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(rob.a, new u1(list, this, rq3Var, 14), k84Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                List list2 = (List) pair.b;
                hs4 hs4Var2 = z45.a;
                r69 r69Var = rob.a;
                l84 l84Var = new l84(this, list2, booleanValue, rq3Var, 0);
                k84Var.t = 2;
            }
        }
        k84Var = new k84(this, sq3Var);
        Object obj2 = k84Var.r;
        lu3 lu3Var2 = lu3.a;
        i = k84Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        boolean booleanValue2 = ((Boolean) pair2.a).booleanValue();
        List list22 = (List) pair2.b;
        hs4 hs4Var22 = z45.a;
        r69 r69Var2 = rob.a;
        l84 l84Var2 = new l84(this, list22, booleanValue2, rq3Var2, 0);
        k84Var.t = 2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int measuredWidth = getMeasuredWidth();
            z82 z82Var = this.d;
            this.i = llf.c((((measuredWidth - ((LinearLayout) z82Var.c).getPaddingStart()) - ((LinearLayout) z82Var.c).getPaddingEnd()) - (this.f * 3)) / 4, this.g, this.h);
        }
    }

    public final void setCupTrees(@NotNull List<CupTree> cupTrees) {
        cupTrees.getClass();
        if (this.l) {
            u6b w = qha.w(this);
            if (w != null) {
                wca.x(w.getLifecycle()).c(new m84(this, cupTrees, null, 1));
            } else {
                this.k = cupTrees;
                Unit unit = Unit.a;
            }
        }
    }

    public final void setRowStyle(@NotNull q8g q8gVar) {
        q8gVar.getClass();
        this.rowStyle = q8gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CupTreeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
