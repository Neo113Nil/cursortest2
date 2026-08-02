package com.sports.insider.ui.pays;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import androidx.lifecycle.z;
import c4.m;
import c4.o;
import c4.p;
import c4.v;
import c4.y;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.messaging.x;
import com.sports.insider.R;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.views.CheckPrice;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.CustomGradientButton;
import com.sports.insider.ui.views.ProfitView;
import e.d0;
import ec.w;
import eg.c0;
import eg.m0;
import eg.t1;
import ge.d;
import ge.n;
import h8.b;
import jg.q;
import kh.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import le.f1;
import le.f2;
import le.g1;
import le.i1;
import le.o1;
import le.p1;
import le.q1;
import mf.c;
import q4.e;
import q4.h;
import q4.k;
import rd.a;
import ve.g0;
import ve.i;
import wc.j0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/pays/PayPremiumFragment;", "Lrd/a;", "Lec/w;", "Lve/i;", "Lve/g0;", "<init>", "()V", "Lle/q1;", "navArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayPremiumFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayPremiumFragment.kt\ncom/sports/insider/ui/pays/PayPremiumFragment\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,565:1\n17#2:566\n42#3,3:567\n*S KotlinDebug\n*F\n+ 1 PayPremiumFragment.kt\ncom/sports/insider/ui/pays/PayPremiumFragment\n*L\n158#1:566\n192#1:567,3\n*E\n"})
/* loaded from: classes.dex */
public final class PayPremiumFragment extends a<w> implements i, g0 {

    /* renamed from: b, reason: collision with root package name */
    public final g1 f6962b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f6963c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f6964d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f6965e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f6966f;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f6967g;

    /* renamed from: h, reason: collision with root package name */
    public final g1 f6968h;

    /* renamed from: i, reason: collision with root package name */
    public final g1 f6969i;
    public t1 j;

    /* renamed from: k, reason: collision with root package name */
    public final d f6970k = new d(this, 6);

    /* JADX WARN: Type inference failed for: r0v0, types: [le.g1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [le.g1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [le.g1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [le.g1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [le.g1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [le.g1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [le.g1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [le.g1] */
    public PayPremiumFragment() {
        final int i5 = 0;
        this.f6962b = new q0(this) { // from class: le.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayPremiumFragment f19794b;

            {
                this.f19794b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.material.textview.MaterialTextView] */
            /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View[], java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.w wVar;
                ec.w wVar2;
                ec.w wVar3;
                y1.c0 c0Var;
                int i10 = i5;
                PayPremiumFragment payPremiumFragment = this.f19794b;
                switch (i10) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (wVar = (ec.w) payPremiumFragment.f22459a) != null) {
                            wVar.f9035g.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar4 != null) {
                                CheckPrice checkPrice = wVar4.f9035g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.w wVar5 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar5 != null) {
                                CheckPrice checkPrice2 = wVar5.f9035g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.w wVar6 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar6 != null) {
                                wVar6.f9038k.setText(charSequence);
                            }
                            ec.w wVar7 = (ec.w) payPremiumFragment.f22459a;
                            View[] view = {wVar7 != null ? wVar7.f9038k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.w wVar8 = (ec.w) payPremiumFragment.f22459a;
                            ?? view3 = {wVar8 != null ? wVar8.f9038k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            ?? r72 = view3[0];
                            if (r72 != 0) {
                                r72.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 3:
                        Pair pair = (Pair) obj;
                        if (pair != null && (wVar2 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = wVar2.f9035g;
                            ic.b bVar = (ic.b) pair.f19192a;
                            ic.b bVar2 = (ic.b) pair.f19193b;
                            if (!Intrinsics.areEqual(checkPrice3.S0, bVar) || !Intrinsics.areEqual(checkPrice3.T0, bVar2)) {
                                checkPrice3.S0 = bVar;
                                checkPrice3.T0 = bVar2;
                                checkPrice3.i();
                                break;
                            }
                        }
                        break;
                    case 4:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (wVar3 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = wVar3.f9035g;
                            ic.b bVar3 = (ic.b) pair2.f19192a;
                            ic.b bVar4 = (ic.b) pair2.f19193b;
                            if (!Intrinsics.areEqual(checkPrice4.U0, bVar3) || !Intrinsics.areEqual(checkPrice4.V0, bVar4)) {
                                checkPrice4.U0 = bVar3;
                                checkPrice4.V0 = bVar4;
                                checkPrice4.i();
                                break;
                            }
                        }
                        break;
                    case 5:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payPremiumFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        Boolean bool2 = (Boolean) obj;
                        ec.w wVar9 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar9 != null) {
                            wVar9.f9036h.setOrder(bool2 != null ? bool2.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payPremiumFragment), null, null, new kd.e(payPremiumFragment, bool2, r2, 17), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.w wVar10 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar10 != null) {
                            CheckPrice checkPrice5 = wVar10.f9035g;
                            if (str == null) {
                                str = "*";
                            }
                            checkPrice5.setOdds(str);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f6963c = new q0(this) { // from class: le.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayPremiumFragment f19794b;

            {
                this.f19794b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.material.textview.MaterialTextView] */
            /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View[], java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.w wVar;
                ec.w wVar2;
                ec.w wVar3;
                y1.c0 c0Var;
                int i102 = i10;
                PayPremiumFragment payPremiumFragment = this.f19794b;
                switch (i102) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (wVar = (ec.w) payPremiumFragment.f22459a) != null) {
                            wVar.f9035g.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar4 != null) {
                                CheckPrice checkPrice = wVar4.f9035g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.w wVar5 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar5 != null) {
                                CheckPrice checkPrice2 = wVar5.f9035g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.w wVar6 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar6 != null) {
                                wVar6.f9038k.setText(charSequence);
                            }
                            ec.w wVar7 = (ec.w) payPremiumFragment.f22459a;
                            View[] view = {wVar7 != null ? wVar7.f9038k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.w wVar8 = (ec.w) payPremiumFragment.f22459a;
                            ?? view3 = {wVar8 != null ? wVar8.f9038k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            ?? r72 = view3[0];
                            if (r72 != 0) {
                                r72.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 3:
                        Pair pair = (Pair) obj;
                        if (pair != null && (wVar2 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = wVar2.f9035g;
                            ic.b bVar = (ic.b) pair.f19192a;
                            ic.b bVar2 = (ic.b) pair.f19193b;
                            if (!Intrinsics.areEqual(checkPrice3.S0, bVar) || !Intrinsics.areEqual(checkPrice3.T0, bVar2)) {
                                checkPrice3.S0 = bVar;
                                checkPrice3.T0 = bVar2;
                                checkPrice3.i();
                                break;
                            }
                        }
                        break;
                    case 4:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (wVar3 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = wVar3.f9035g;
                            ic.b bVar3 = (ic.b) pair2.f19192a;
                            ic.b bVar4 = (ic.b) pair2.f19193b;
                            if (!Intrinsics.areEqual(checkPrice4.U0, bVar3) || !Intrinsics.areEqual(checkPrice4.V0, bVar4)) {
                                checkPrice4.U0 = bVar3;
                                checkPrice4.V0 = bVar4;
                                checkPrice4.i();
                                break;
                            }
                        }
                        break;
                    case 5:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payPremiumFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        Boolean bool2 = (Boolean) obj;
                        ec.w wVar9 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar9 != null) {
                            wVar9.f9036h.setOrder(bool2 != null ? bool2.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payPremiumFragment), null, null, new kd.e(payPremiumFragment, bool2, r2, 17), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.w wVar10 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar10 != null) {
                            CheckPrice checkPrice5 = wVar10.f9035g;
                            if (str == null) {
                                str = "*";
                            }
                            checkPrice5.setOdds(str);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f6964d = new q0(this) { // from class: le.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayPremiumFragment f19794b;

            {
                this.f19794b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.material.textview.MaterialTextView] */
            /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View[], java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.w wVar;
                ec.w wVar2;
                ec.w wVar3;
                y1.c0 c0Var;
                int i102 = i11;
                PayPremiumFragment payPremiumFragment = this.f19794b;
                switch (i102) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (wVar = (ec.w) payPremiumFragment.f22459a) != null) {
                            wVar.f9035g.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar4 != null) {
                                CheckPrice checkPrice = wVar4.f9035g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.w wVar5 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar5 != null) {
                                CheckPrice checkPrice2 = wVar5.f9035g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.w wVar6 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar6 != null) {
                                wVar6.f9038k.setText(charSequence);
                            }
                            ec.w wVar7 = (ec.w) payPremiumFragment.f22459a;
                            View[] view = {wVar7 != null ? wVar7.f9038k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.w wVar8 = (ec.w) payPremiumFragment.f22459a;
                            ?? view3 = {wVar8 != null ? wVar8.f9038k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            ?? r72 = view3[0];
                            if (r72 != 0) {
                                r72.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 3:
                        Pair pair = (Pair) obj;
                        if (pair != null && (wVar2 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = wVar2.f9035g;
                            ic.b bVar = (ic.b) pair.f19192a;
                            ic.b bVar2 = (ic.b) pair.f19193b;
                            if (!Intrinsics.areEqual(checkPrice3.S0, bVar) || !Intrinsics.areEqual(checkPrice3.T0, bVar2)) {
                                checkPrice3.S0 = bVar;
                                checkPrice3.T0 = bVar2;
                                checkPrice3.i();
                                break;
                            }
                        }
                        break;
                    case 4:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (wVar3 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = wVar3.f9035g;
                            ic.b bVar3 = (ic.b) pair2.f19192a;
                            ic.b bVar4 = (ic.b) pair2.f19193b;
                            if (!Intrinsics.areEqual(checkPrice4.U0, bVar3) || !Intrinsics.areEqual(checkPrice4.V0, bVar4)) {
                                checkPrice4.U0 = bVar3;
                                checkPrice4.V0 = bVar4;
                                checkPrice4.i();
                                break;
                            }
                        }
                        break;
                    case 5:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payPremiumFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        Boolean bool2 = (Boolean) obj;
                        ec.w wVar9 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar9 != null) {
                            wVar9.f9036h.setOrder(bool2 != null ? bool2.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payPremiumFragment), null, null, new kd.e(payPremiumFragment, bool2, r2, 17), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.w wVar10 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar10 != null) {
                            CheckPrice checkPrice5 = wVar10.f9035g;
                            if (str == null) {
                                str = "*";
                            }
                            checkPrice5.setOdds(str);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f6965e = new q0(this) { // from class: le.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayPremiumFragment f19794b;

            {
                this.f19794b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.material.textview.MaterialTextView] */
            /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View[], java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.w wVar;
                ec.w wVar2;
                ec.w wVar3;
                y1.c0 c0Var;
                int i102 = i12;
                PayPremiumFragment payPremiumFragment = this.f19794b;
                switch (i102) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (wVar = (ec.w) payPremiumFragment.f22459a) != null) {
                            wVar.f9035g.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar4 != null) {
                                CheckPrice checkPrice = wVar4.f9035g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.w wVar5 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar5 != null) {
                                CheckPrice checkPrice2 = wVar5.f9035g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.w wVar6 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar6 != null) {
                                wVar6.f9038k.setText(charSequence);
                            }
                            ec.w wVar7 = (ec.w) payPremiumFragment.f22459a;
                            View[] view = {wVar7 != null ? wVar7.f9038k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.w wVar8 = (ec.w) payPremiumFragment.f22459a;
                            ?? view3 = {wVar8 != null ? wVar8.f9038k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            ?? r72 = view3[0];
                            if (r72 != 0) {
                                r72.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 3:
                        Pair pair = (Pair) obj;
                        if (pair != null && (wVar2 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = wVar2.f9035g;
                            ic.b bVar = (ic.b) pair.f19192a;
                            ic.b bVar2 = (ic.b) pair.f19193b;
                            if (!Intrinsics.areEqual(checkPrice3.S0, bVar) || !Intrinsics.areEqual(checkPrice3.T0, bVar2)) {
                                checkPrice3.S0 = bVar;
                                checkPrice3.T0 = bVar2;
                                checkPrice3.i();
                                break;
                            }
                        }
                        break;
                    case 4:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (wVar3 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = wVar3.f9035g;
                            ic.b bVar3 = (ic.b) pair2.f19192a;
                            ic.b bVar4 = (ic.b) pair2.f19193b;
                            if (!Intrinsics.areEqual(checkPrice4.U0, bVar3) || !Intrinsics.areEqual(checkPrice4.V0, bVar4)) {
                                checkPrice4.U0 = bVar3;
                                checkPrice4.V0 = bVar4;
                                checkPrice4.i();
                                break;
                            }
                        }
                        break;
                    case 5:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payPremiumFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        Boolean bool2 = (Boolean) obj;
                        ec.w wVar9 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar9 != null) {
                            wVar9.f9036h.setOrder(bool2 != null ? bool2.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payPremiumFragment), null, null, new kd.e(payPremiumFragment, bool2, r2, 17), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.w wVar10 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar10 != null) {
                            CheckPrice checkPrice5 = wVar10.f9035g;
                            if (str == null) {
                                str = "*";
                            }
                            checkPrice5.setOdds(str);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 4;
        this.f6966f = new q0(this) { // from class: le.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayPremiumFragment f19794b;

            {
                this.f19794b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.material.textview.MaterialTextView] */
            /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View[], java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.w wVar;
                ec.w wVar2;
                ec.w wVar3;
                y1.c0 c0Var;
                int i102 = i13;
                PayPremiumFragment payPremiumFragment = this.f19794b;
                switch (i102) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (wVar = (ec.w) payPremiumFragment.f22459a) != null) {
                            wVar.f9035g.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar4 != null) {
                                CheckPrice checkPrice = wVar4.f9035g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.w wVar5 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar5 != null) {
                                CheckPrice checkPrice2 = wVar5.f9035g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.w wVar6 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar6 != null) {
                                wVar6.f9038k.setText(charSequence);
                            }
                            ec.w wVar7 = (ec.w) payPremiumFragment.f22459a;
                            View[] view = {wVar7 != null ? wVar7.f9038k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.w wVar8 = (ec.w) payPremiumFragment.f22459a;
                            ?? view3 = {wVar8 != null ? wVar8.f9038k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            ?? r72 = view3[0];
                            if (r72 != 0) {
                                r72.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 3:
                        Pair pair = (Pair) obj;
                        if (pair != null && (wVar2 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = wVar2.f9035g;
                            ic.b bVar = (ic.b) pair.f19192a;
                            ic.b bVar2 = (ic.b) pair.f19193b;
                            if (!Intrinsics.areEqual(checkPrice3.S0, bVar) || !Intrinsics.areEqual(checkPrice3.T0, bVar2)) {
                                checkPrice3.S0 = bVar;
                                checkPrice3.T0 = bVar2;
                                checkPrice3.i();
                                break;
                            }
                        }
                        break;
                    case 4:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (wVar3 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = wVar3.f9035g;
                            ic.b bVar3 = (ic.b) pair2.f19192a;
                            ic.b bVar4 = (ic.b) pair2.f19193b;
                            if (!Intrinsics.areEqual(checkPrice4.U0, bVar3) || !Intrinsics.areEqual(checkPrice4.V0, bVar4)) {
                                checkPrice4.U0 = bVar3;
                                checkPrice4.V0 = bVar4;
                                checkPrice4.i();
                                break;
                            }
                        }
                        break;
                    case 5:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payPremiumFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        Boolean bool2 = (Boolean) obj;
                        ec.w wVar9 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar9 != null) {
                            wVar9.f9036h.setOrder(bool2 != null ? bool2.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payPremiumFragment), null, null, new kd.e(payPremiumFragment, bool2, r2, 17), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.w wVar10 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar10 != null) {
                            CheckPrice checkPrice5 = wVar10.f9035g;
                            if (str == null) {
                                str = "*";
                            }
                            checkPrice5.setOdds(str);
                            break;
                        }
                        break;
                }
            }
        };
        final int i14 = 5;
        this.f6967g = new q0(this) { // from class: le.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayPremiumFragment f19794b;

            {
                this.f19794b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.material.textview.MaterialTextView] */
            /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View[], java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.w wVar;
                ec.w wVar2;
                ec.w wVar3;
                y1.c0 c0Var;
                int i102 = i14;
                PayPremiumFragment payPremiumFragment = this.f19794b;
                switch (i102) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (wVar = (ec.w) payPremiumFragment.f22459a) != null) {
                            wVar.f9035g.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar4 != null) {
                                CheckPrice checkPrice = wVar4.f9035g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.w wVar5 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar5 != null) {
                                CheckPrice checkPrice2 = wVar5.f9035g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.w wVar6 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar6 != null) {
                                wVar6.f9038k.setText(charSequence);
                            }
                            ec.w wVar7 = (ec.w) payPremiumFragment.f22459a;
                            View[] view = {wVar7 != null ? wVar7.f9038k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.w wVar8 = (ec.w) payPremiumFragment.f22459a;
                            ?? view3 = {wVar8 != null ? wVar8.f9038k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            ?? r72 = view3[0];
                            if (r72 != 0) {
                                r72.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 3:
                        Pair pair = (Pair) obj;
                        if (pair != null && (wVar2 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = wVar2.f9035g;
                            ic.b bVar = (ic.b) pair.f19192a;
                            ic.b bVar2 = (ic.b) pair.f19193b;
                            if (!Intrinsics.areEqual(checkPrice3.S0, bVar) || !Intrinsics.areEqual(checkPrice3.T0, bVar2)) {
                                checkPrice3.S0 = bVar;
                                checkPrice3.T0 = bVar2;
                                checkPrice3.i();
                                break;
                            }
                        }
                        break;
                    case 4:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (wVar3 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = wVar3.f9035g;
                            ic.b bVar3 = (ic.b) pair2.f19192a;
                            ic.b bVar4 = (ic.b) pair2.f19193b;
                            if (!Intrinsics.areEqual(checkPrice4.U0, bVar3) || !Intrinsics.areEqual(checkPrice4.V0, bVar4)) {
                                checkPrice4.U0 = bVar3;
                                checkPrice4.V0 = bVar4;
                                checkPrice4.i();
                                break;
                            }
                        }
                        break;
                    case 5:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payPremiumFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        Boolean bool2 = (Boolean) obj;
                        ec.w wVar9 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar9 != null) {
                            wVar9.f9036h.setOrder(bool2 != null ? bool2.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payPremiumFragment), null, null, new kd.e(payPremiumFragment, bool2, r2, 17), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.w wVar10 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar10 != null) {
                            CheckPrice checkPrice5 = wVar10.f9035g;
                            if (str == null) {
                                str = "*";
                            }
                            checkPrice5.setOdds(str);
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 6;
        this.f6968h = new q0(this) { // from class: le.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayPremiumFragment f19794b;

            {
                this.f19794b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.material.textview.MaterialTextView] */
            /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View[], java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.w wVar;
                ec.w wVar2;
                ec.w wVar3;
                y1.c0 c0Var;
                int i102 = i15;
                PayPremiumFragment payPremiumFragment = this.f19794b;
                switch (i102) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (wVar = (ec.w) payPremiumFragment.f22459a) != null) {
                            wVar.f9035g.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar4 != null) {
                                CheckPrice checkPrice = wVar4.f9035g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.w wVar5 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar5 != null) {
                                CheckPrice checkPrice2 = wVar5.f9035g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.w wVar6 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar6 != null) {
                                wVar6.f9038k.setText(charSequence);
                            }
                            ec.w wVar7 = (ec.w) payPremiumFragment.f22459a;
                            View[] view = {wVar7 != null ? wVar7.f9038k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.w wVar8 = (ec.w) payPremiumFragment.f22459a;
                            ?? view3 = {wVar8 != null ? wVar8.f9038k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            ?? r72 = view3[0];
                            if (r72 != 0) {
                                r72.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 3:
                        Pair pair = (Pair) obj;
                        if (pair != null && (wVar2 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = wVar2.f9035g;
                            ic.b bVar = (ic.b) pair.f19192a;
                            ic.b bVar2 = (ic.b) pair.f19193b;
                            if (!Intrinsics.areEqual(checkPrice3.S0, bVar) || !Intrinsics.areEqual(checkPrice3.T0, bVar2)) {
                                checkPrice3.S0 = bVar;
                                checkPrice3.T0 = bVar2;
                                checkPrice3.i();
                                break;
                            }
                        }
                        break;
                    case 4:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (wVar3 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = wVar3.f9035g;
                            ic.b bVar3 = (ic.b) pair2.f19192a;
                            ic.b bVar4 = (ic.b) pair2.f19193b;
                            if (!Intrinsics.areEqual(checkPrice4.U0, bVar3) || !Intrinsics.areEqual(checkPrice4.V0, bVar4)) {
                                checkPrice4.U0 = bVar3;
                                checkPrice4.V0 = bVar4;
                                checkPrice4.i();
                                break;
                            }
                        }
                        break;
                    case 5:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payPremiumFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        Boolean bool2 = (Boolean) obj;
                        ec.w wVar9 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar9 != null) {
                            wVar9.f9036h.setOrder(bool2 != null ? bool2.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payPremiumFragment), null, null, new kd.e(payPremiumFragment, bool2, r2, 17), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.w wVar10 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar10 != null) {
                            CheckPrice checkPrice5 = wVar10.f9035g;
                            if (str == null) {
                                str = "*";
                            }
                            checkPrice5.setOdds(str);
                            break;
                        }
                        break;
                }
            }
        };
        final int i16 = 7;
        this.f6969i = new q0(this) { // from class: le.g1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayPremiumFragment f19794b;

            {
                this.f19794b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.material.textview.MaterialTextView] */
            /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View[], java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.w wVar;
                ec.w wVar2;
                ec.w wVar3;
                y1.c0 c0Var;
                int i102 = i16;
                PayPremiumFragment payPremiumFragment = this.f19794b;
                switch (i102) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        if (bool != null && (wVar = (ec.w) payPremiumFragment.f22459a) != null) {
                            wVar.f9035g.set1RubWeekCloudPayment(bool.booleanValue());
                            break;
                        }
                        break;
                    case 1:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.w wVar4 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar4 != null) {
                                CheckPrice checkPrice = wVar4.f9035g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.w wVar5 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar5 != null) {
                                CheckPrice checkPrice2 = wVar5.f9035g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.w wVar6 = (ec.w) payPremiumFragment.f22459a;
                            if (wVar6 != null) {
                                wVar6.f9038k.setText(charSequence);
                            }
                            ec.w wVar7 = (ec.w) payPremiumFragment.f22459a;
                            View[] view = {wVar7 != null ? wVar7.f9038k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.w wVar8 = (ec.w) payPremiumFragment.f22459a;
                            ?? view3 = {wVar8 != null ? wVar8.f9038k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            ?? r72 = view3[0];
                            if (r72 != 0) {
                                r72.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 3:
                        Pair pair = (Pair) obj;
                        if (pair != null && (wVar2 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = wVar2.f9035g;
                            ic.b bVar = (ic.b) pair.f19192a;
                            ic.b bVar2 = (ic.b) pair.f19193b;
                            if (!Intrinsics.areEqual(checkPrice3.S0, bVar) || !Intrinsics.areEqual(checkPrice3.T0, bVar2)) {
                                checkPrice3.S0 = bVar;
                                checkPrice3.T0 = bVar2;
                                checkPrice3.i();
                                break;
                            }
                        }
                        break;
                    case 4:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (wVar3 = (ec.w) payPremiumFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = wVar3.f9035g;
                            ic.b bVar3 = (ic.b) pair2.f19192a;
                            ic.b bVar4 = (ic.b) pair2.f19193b;
                            if (!Intrinsics.areEqual(checkPrice4.U0, bVar3) || !Intrinsics.areEqual(checkPrice4.V0, bVar4)) {
                                checkPrice4.U0 = bVar3;
                                checkPrice4.V0 = bVar4;
                                checkPrice4.i();
                                break;
                            }
                        }
                        break;
                    case 5:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payPremiumFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 6:
                        Boolean bool2 = (Boolean) obj;
                        ec.w wVar9 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar9 != null) {
                            wVar9.f9036h.setOrder(bool2 != null ? bool2.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payPremiumFragment), null, null, new kd.e(payPremiumFragment, bool2, r2, 17), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.w wVar10 = (ec.w) payPremiumFragment.f22459a;
                        if (wVar10 != null) {
                            CheckPrice checkPrice5 = wVar10.f9035g;
                            if (str == null) {
                                str = "*";
                            }
                            checkPrice5.setOdds(str);
                            break;
                        }
                        break;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #0 {Exception -> 0x0073, blocks: (B:11:0x0028, B:12:0x005d, B:14:0x0065, B:22:0x0037), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(PayPremiumFragment payPremiumFragment, Context context, Integer num, c cVar) {
        o1 o1Var;
        int i5;
        m image;
        payPremiumFragment.getClass();
        try {
            if (cVar instanceof o1) {
                o1Var = (o1) cVar;
                int i10 = o1Var.f19900d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    o1Var.f19900d = i10 - Integer.MIN_VALUE;
                    Object obj = o1Var.f19898b;
                    lf.a aVar = lf.a.f20034a;
                    i5 = o1Var.f19900d;
                    if (i5 != 0) {
                        b.B(obj);
                        e eVar = new e(context);
                        eVar.f21940c = num;
                        q4.b bVar = q4.b.f21930c;
                        eVar.f21946i = bVar;
                        eVar.f21945h = bVar;
                        eVar.j = q4.b.f21931d;
                        h a7 = eVar.a();
                        o a10 = y.a(context);
                        o1Var.f19897a = context;
                        o1Var.f19900d = 1;
                        obj = ((v) a10).c(a7, o1Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        context = o1Var.f19897a;
                        b.B(obj);
                    }
                    image = ((k) obj).getImage();
                    if (image != null) {
                        return null;
                    }
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    return p.b(image, resources);
                }
            }
            if (i5 != 0) {
            }
            image = ((k) obj).getImage();
            if (image != null) {
            }
        } catch (Exception unused) {
            return null;
        }
        o1Var = new o1(payPremiumFragment, cVar);
        Object obj2 = o1Var.f19898b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = o1Var.f19900d;
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.pay_premium_fragment, viewGroup, false);
        int i5 = R.id.btnClose;
        FrameLayout frameLayout = (FrameLayout) y3.j(R.id.btnClose, inflate);
        if (frameLayout != null) {
            i5 = R.id.btnPrem;
            CustomGradientButton customGradientButton = (CustomGradientButton) y3.j(R.id.btnPrem, inflate);
            if (customGradientButton != null) {
                i5 = R.id.btnVip;
                CustomButton customButton = (CustomButton) y3.j(R.id.btnVip, inflate);
                if (customButton != null) {
                    i5 = R.id.head_image_pay;
                    ImageView imageView = (ImageView) y3.j(R.id.head_image_pay, inflate);
                    if (imageView != null) {
                        i5 = R.id.ivCrossClose;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.ivCrossClose, inflate);
                        if (appCompatImageView != null) {
                            i5 = R.id.panelsPrice;
                            CheckPrice checkPrice = (CheckPrice) y3.j(R.id.panelsPrice, inflate);
                            if (checkPrice != null) {
                                i5 = R.id.profits;
                                ProfitView profitView = (ProfitView) y3.j(R.id.profits, inflate);
                                if (profitView != null) {
                                    i5 = R.id.shadow_light_bt_background;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) y3.j(R.id.shadow_light_bt_background, inflate);
                                    if (appCompatImageView2 != null) {
                                        i5 = R.id.space_nav;
                                        if (((FrameLayout) y3.j(R.id.space_nav, inflate)) != null) {
                                            i5 = R.id.status_space_pays;
                                            FrameLayout frameLayout2 = (FrameLayout) y3.j(R.id.status_space_pays, inflate);
                                            if (frameLayout2 != null) {
                                                i5 = R.id.timer_sale_tv;
                                                MaterialTextView materialTextView = (MaterialTextView) y3.j(R.id.timer_sale_tv, inflate);
                                                if (materialTextView != null) {
                                                    i5 = R.id.titleText;
                                                    TextView textView = (TextView) y3.j(R.id.titleText, inflate);
                                                    if (textView != null) {
                                                        w wVar = new w((ConstraintLayout) inflate, frameLayout, customGradientButton, customButton, imageView, appCompatImageView, checkPrice, profitView, appCompatImageView2, frameLayout2, materialTextView, textView);
                                                        Intrinsics.checkNotNullExpressionValue(wVar, "inflate(...)");
                                                        return wVar;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    public final f2 H() {
        Intrinsics.checkNotNullParameter(this, "fragment");
        n factory = new n(4);
        Intrinsics.checkNotNullParameter(this, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        androidx.lifecycle.o1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        t1.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(f2.class, "modelClass");
        ag.c modelClass = u6.h.m(f2.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (f2) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // ve.i
    public final void f() {
        f2 H = H();
        p0 activity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
        H.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!H.f19772i) {
            H.w(activity);
        }
        H.f19772i = false;
        H.f19773k.h(Boolean.FALSE);
    }

    @Override // ve.i
    public final void m() {
        f2 H = H();
        p0 activity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
        H.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (H.f19772i) {
            H.x(activity);
        }
        H.f19772i = true;
        H.f19773k.h(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        H().k();
        f2 H = H();
        H.f19787z.e(getViewLifecycleOwner(), this.f6963c);
        H.I.e(getViewLifecycleOwner(), this.f6964d);
        H.f19774l.e(getViewLifecycleOwner(), this.f6968h);
        H.L.e(getViewLifecycleOwner(), this.f6969i);
        H.f19768e.e(getViewLifecycleOwner(), this.f6967g);
        H.M.e(getViewLifecycleOwner(), this.f6965e);
        H.N.e(getViewLifecycleOwner(), this.f6966f);
        H.f19775m.e(getViewLifecycleOwner(), this.f6962b);
        w wVar = (w) this.f22459a;
        final int i5 = 2;
        if (wVar != null) {
            wVar.f9036h.setListener(this);
            FrameLayout btnClose = wVar.f9030b;
            Intrinsics.checkNotNullExpressionValue(btnClose, "btnClose");
            final int i10 = 1;
            io.sentry.config.a.y(btnClose, 600L, new Function1(this) { // from class: le.h1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PayPremiumFragment f19817b;

                {
                    this.f19817b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i11 = i10;
                    PayPremiumFragment payPremiumFragment = this.f19817b;
                    switch (i11) {
                        case 0:
                            f2 H2 = payPremiumFragment.H();
                            H2.getClass();
                            u1.a i12 = androidx.lifecycle.d1.i(H2);
                            lg.e eVar = eg.m0.f9201a;
                            eg.c0.t(i12, jg.q.f18523a, null, new a2(H2, null, 4), 2);
                            break;
                        case 1:
                            a.a.r(payPremiumFragment).e();
                            break;
                        default:
                            f2 H3 = payPremiumFragment.H();
                            androidx.fragment.app.p0 activity = payPremiumFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H3.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            if (H3.f19772i) {
                                H3.x(activity);
                            } else {
                                H3.w(activity);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
            wVar.f9035g.setListenerCheckPrice(this);
            CustomGradientButton btnPrem = wVar.f9031c;
            Intrinsics.checkNotNullExpressionValue(btnPrem, "btnPrem");
            io.sentry.config.a.y(btnPrem, 600L, new Function1(this) { // from class: le.h1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PayPremiumFragment f19817b;

                {
                    this.f19817b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i11 = i5;
                    PayPremiumFragment payPremiumFragment = this.f19817b;
                    switch (i11) {
                        case 0:
                            f2 H2 = payPremiumFragment.H();
                            H2.getClass();
                            u1.a i12 = androidx.lifecycle.d1.i(H2);
                            lg.e eVar = eg.m0.f9201a;
                            eg.c0.t(i12, jg.q.f18523a, null, new a2(H2, null, 4), 2);
                            break;
                        case 1:
                            a.a.r(payPremiumFragment).e();
                            break;
                        default:
                            f2 H3 = payPremiumFragment.H();
                            androidx.fragment.app.p0 activity = payPremiumFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H3.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            if (H3.f19772i) {
                                H3.x(activity);
                            } else {
                                H3.w(activity);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
            CustomButton btnVip = wVar.f9032d;
            Intrinsics.checkNotNullExpressionValue(btnVip, "btnVip");
            final int i11 = 0;
            io.sentry.config.a.y(btnVip, 600L, new Function1(this) { // from class: le.h1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PayPremiumFragment f19817b;

                {
                    this.f19817b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i112 = i11;
                    PayPremiumFragment payPremiumFragment = this.f19817b;
                    switch (i112) {
                        case 0:
                            f2 H2 = payPremiumFragment.H();
                            H2.getClass();
                            u1.a i12 = androidx.lifecycle.d1.i(H2);
                            lg.e eVar = eg.m0.f9201a;
                            eg.c0.t(i12, jg.q.f18523a, null, new a2(H2, null, 4), 2);
                            break;
                        case 1:
                            a.a.r(payPremiumFragment).e();
                            break;
                        default:
                            f2 H3 = payPremiumFragment.H();
                            androidx.fragment.app.p0 activity = payPremiumFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H3.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            if (H3.f19772i) {
                                H3.x(activity);
                            } else {
                                H3.w(activity);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f6970k);
        z g10 = d1.g(this);
        lg.e eVar = m0.f9201a;
        this.j = c0.t(g10, lg.d.f20063c, null, new i1(this, null, 4), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        f2 H = H();
        H.l();
        t1 t1Var = H.O;
        if (t1Var != null) {
            t1Var.k(null);
        }
        H.O = null;
        t1 t1Var2 = H.J;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        H.J = null;
        t1 t1Var3 = H.E;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        t1 t1Var4 = H.D;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        H.E = null;
        H.D = null;
        t1 t1Var5 = H.B;
        if (t1Var5 != null) {
            t1Var5.k(null);
        }
        H.B = null;
        t1 t1Var6 = H.C;
        if (t1Var6 != null) {
            t1Var6.k(null);
        }
        H.C = null;
        t1 t1Var7 = H.A;
        if (t1Var7 != null) {
            t1Var7.k(null);
        }
        H.A = null;
        t1 t1Var8 = H.f19785x;
        if (t1Var8 != null) {
            t1Var8.k(null);
        }
        H.f19785x = null;
        f2 H2 = H();
        H2.f19787z.i(this.f6963c);
        H2.I.i(this.f6964d);
        H2.f19774l.i(this.f6968h);
        H2.L.i(this.f6969i);
        H2.f19768e.i(this.f6967g);
        H2.M.i(this.f6965e);
        H2.N.i(this.f6966f);
        H2.f19775m.i(this.f6962b);
        w wVar = (w) this.f22459a;
        if (wVar != null) {
            wVar.f9036h.setListener(null);
            wVar.f9035g.setListenerCheckPrice(null);
            wVar.f9031c.setOnClickListener(null);
            wVar.f9032d.setOnClickListener(null);
            wVar.f9030b.setOnClickListener(null);
        }
        t1 t1Var9 = this.j;
        if (t1Var9 != null) {
            t1Var9.k(null);
        }
        this.j = null;
        this.f6970k.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        g gVar = new g(Reflection.getOrCreateKotlinClass(q1.class), new i3.i(7, this));
        f2 H = H();
        int b10 = ((q1) gVar.getValue()).b();
        int a7 = ((q1) gVar.getValue()).a();
        H.j = b10;
        H.f19765b = a7;
        j0 j0Var = H.f19769f;
        j0Var.getClass();
        Continuation continuation = null;
        new cd.d().c("premium_screen_show", null);
        androidx.lifecycle.p0 p0Var = H.f19773k;
        p0Var.j(Boolean.FALSE);
        H.f19772i = false;
        if (H.G == null) {
            ((zc.k) j0Var.f25125h.getValue()).getClass();
            H.G = zc.k.h(R.string.offer_is_limited);
        }
        p0Var.h(Boolean.valueOf(H.f19772i));
        wc.d0.i(j0Var);
        c0.t(d1.g(this), null, null, new androidx.lifecycle.o(this, view, continuation, 28), 3);
    }

    @Override // ve.i
    public final void q(int i5, String minOddsBySub) {
        Intrinsics.checkNotNullParameter(minOddsBySub, "minOddsBySub");
        c0.t(d1.g(this), null, null, new p1(this, i5, (Continuation) null, 1), 3);
    }

    @Override // ve.i
    public final void s(boolean z5) {
        if (!z5) {
            f2 H = H();
            H.getClass();
            da.d dVar = new da.d();
            dVar.c("premium_prediction");
            Intrinsics.checkNotNullExpressionValue(dVar, "setDestination(...)");
            H.j(dVar);
            return;
        }
        f2 H2 = H();
        Context context = getContext();
        H2.getClass();
        if (context == null) {
            return;
        }
        u1.a i5 = d1.i(H2);
        lg.e eVar = m0.f9201a;
        c0.t(i5, q.f18523a, null, new kd.e(context, H2, (Continuation) null, 16), 2);
    }

    @Override // ve.g0
    public final void y(int i5) {
        if (i5 != 5) {
            if (i5 != 6) {
                return;
            }
            f1.m(H(), getContext());
        } else {
            f2 H = H();
            H.getClass();
            da.d dVar = new da.d();
            dVar.c("premium_prediction");
            Intrinsics.checkNotNullExpressionValue(dVar, "setDestination(...)");
            H.j(dVar);
        }
    }
}
