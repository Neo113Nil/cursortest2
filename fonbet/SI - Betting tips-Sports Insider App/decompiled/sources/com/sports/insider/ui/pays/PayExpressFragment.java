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
import androidx.lifecycle.e0;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import c4.m;
import c4.o;
import c4.p;
import c4.y;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.messaging.x;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.views.CheckPrice;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.CustomGradientButton;
import com.sports.insider.ui.views.ProfitView;
import e.d0;
import ec.v;
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
import le.a0;
import le.d1;
import le.f1;
import le.i0;
import le.j0;
import le.n0;
import mf.c;
import q4.e;
import q4.h;
import q4.k;
import rd.a;
import ve.g0;
import ve.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/pays/PayExpressFragment;", "Lrd/a;", "Lec/v;", "Lve/i;", "Lve/g0;", "<init>", "()V", "Lle/n0;", "navArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayExpressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayExpressFragment.kt\ncom/sports/insider/ui/pays/PayExpressFragment\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,550:1\n17#2:551\n42#3,3:552\n*S KotlinDebug\n*F\n+ 1 PayExpressFragment.kt\ncom/sports/insider/ui/pays/PayExpressFragment\n*L\n153#1:551\n187#1:552,3\n*E\n"})
/* loaded from: classes.dex */
public final class PayExpressFragment extends a<v> implements i, g0 {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f6954b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f6955c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f6956d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f6957e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f6958f;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f6959g;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f6960h;

    /* renamed from: i, reason: collision with root package name */
    public t1 f6961i;
    public final d j = new d(this, 5);

    /* JADX WARN: Type inference failed for: r0v0, types: [le.a0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [le.a0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [le.a0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [le.a0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [le.a0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [le.a0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [le.a0] */
    public PayExpressFragment() {
        final int i5 = 0;
        this.f6954b = new q0(this) { // from class: le.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayExpressFragment f19694b;

            {
                this.f19694b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.v vVar;
                ec.v vVar2;
                y1.c0 c0Var;
                int i10 = i5;
                PayExpressFragment payExpressFragment = this.f19694b;
                switch (i10) {
                    case 0:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                            if (vVar3 != null) {
                                CheckPrice checkPrice = vVar3.f9024g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                            if (vVar4 != null) {
                                CheckPrice checkPrice2 = vVar4.f9024g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.v vVar5 = (ec.v) payExpressFragment.f22459a;
                            if (vVar5 != null) {
                                vVar5.f9027k.setText(charSequence);
                            }
                            ec.v vVar6 = (ec.v) payExpressFragment.f22459a;
                            View[] view = {vVar6 != null ? vVar6.f9027k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.v vVar7 = (ec.v) payExpressFragment.f22459a;
                            View[] view3 = {vVar7 != null ? vVar7.f9027k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            View view4 = view3[0];
                            if (view4 != null) {
                                view4.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Pair pair = (Pair) obj;
                        if (pair != null && (vVar = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = vVar.f9024g;
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
                    case 3:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (vVar2 = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = vVar2.f9024g;
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
                    case 4:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payExpressFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        ec.v vVar8 = (ec.v) payExpressFragment.f22459a;
                        if (vVar8 != null) {
                            vVar8.f9025h.setOrder(bool != null ? bool.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payExpressFragment), null, null, new m0(payExpressFragment, bool, (Continuation) null), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.v vVar9 = (ec.v) payExpressFragment.f22459a;
                        if (vVar9 != null) {
                            CheckPrice checkPrice5 = vVar9.f9024g;
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
        this.f6955c = new q0(this) { // from class: le.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayExpressFragment f19694b;

            {
                this.f19694b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.v vVar;
                ec.v vVar2;
                y1.c0 c0Var;
                int i102 = i10;
                PayExpressFragment payExpressFragment = this.f19694b;
                switch (i102) {
                    case 0:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                            if (vVar3 != null) {
                                CheckPrice checkPrice = vVar3.f9024g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                            if (vVar4 != null) {
                                CheckPrice checkPrice2 = vVar4.f9024g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.v vVar5 = (ec.v) payExpressFragment.f22459a;
                            if (vVar5 != null) {
                                vVar5.f9027k.setText(charSequence);
                            }
                            ec.v vVar6 = (ec.v) payExpressFragment.f22459a;
                            View[] view = {vVar6 != null ? vVar6.f9027k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.v vVar7 = (ec.v) payExpressFragment.f22459a;
                            View[] view3 = {vVar7 != null ? vVar7.f9027k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            View view4 = view3[0];
                            if (view4 != null) {
                                view4.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Pair pair = (Pair) obj;
                        if (pair != null && (vVar = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = vVar.f9024g;
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
                    case 3:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (vVar2 = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = vVar2.f9024g;
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
                    case 4:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payExpressFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        ec.v vVar8 = (ec.v) payExpressFragment.f22459a;
                        if (vVar8 != null) {
                            vVar8.f9025h.setOrder(bool != null ? bool.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payExpressFragment), null, null, new m0(payExpressFragment, bool, (Continuation) null), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.v vVar9 = (ec.v) payExpressFragment.f22459a;
                        if (vVar9 != null) {
                            CheckPrice checkPrice5 = vVar9.f9024g;
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
        this.f6956d = new q0(this) { // from class: le.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayExpressFragment f19694b;

            {
                this.f19694b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.v vVar;
                ec.v vVar2;
                y1.c0 c0Var;
                int i102 = i11;
                PayExpressFragment payExpressFragment = this.f19694b;
                switch (i102) {
                    case 0:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                            if (vVar3 != null) {
                                CheckPrice checkPrice = vVar3.f9024g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                            if (vVar4 != null) {
                                CheckPrice checkPrice2 = vVar4.f9024g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.v vVar5 = (ec.v) payExpressFragment.f22459a;
                            if (vVar5 != null) {
                                vVar5.f9027k.setText(charSequence);
                            }
                            ec.v vVar6 = (ec.v) payExpressFragment.f22459a;
                            View[] view = {vVar6 != null ? vVar6.f9027k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.v vVar7 = (ec.v) payExpressFragment.f22459a;
                            View[] view3 = {vVar7 != null ? vVar7.f9027k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            View view4 = view3[0];
                            if (view4 != null) {
                                view4.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Pair pair = (Pair) obj;
                        if (pair != null && (vVar = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = vVar.f9024g;
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
                    case 3:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (vVar2 = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = vVar2.f9024g;
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
                    case 4:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payExpressFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        ec.v vVar8 = (ec.v) payExpressFragment.f22459a;
                        if (vVar8 != null) {
                            vVar8.f9025h.setOrder(bool != null ? bool.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payExpressFragment), null, null, new m0(payExpressFragment, bool, (Continuation) null), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.v vVar9 = (ec.v) payExpressFragment.f22459a;
                        if (vVar9 != null) {
                            CheckPrice checkPrice5 = vVar9.f9024g;
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
        this.f6957e = new q0(this) { // from class: le.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayExpressFragment f19694b;

            {
                this.f19694b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.v vVar;
                ec.v vVar2;
                y1.c0 c0Var;
                int i102 = i12;
                PayExpressFragment payExpressFragment = this.f19694b;
                switch (i102) {
                    case 0:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                            if (vVar3 != null) {
                                CheckPrice checkPrice = vVar3.f9024g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                            if (vVar4 != null) {
                                CheckPrice checkPrice2 = vVar4.f9024g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.v vVar5 = (ec.v) payExpressFragment.f22459a;
                            if (vVar5 != null) {
                                vVar5.f9027k.setText(charSequence);
                            }
                            ec.v vVar6 = (ec.v) payExpressFragment.f22459a;
                            View[] view = {vVar6 != null ? vVar6.f9027k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.v vVar7 = (ec.v) payExpressFragment.f22459a;
                            View[] view3 = {vVar7 != null ? vVar7.f9027k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            View view4 = view3[0];
                            if (view4 != null) {
                                view4.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Pair pair = (Pair) obj;
                        if (pair != null && (vVar = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = vVar.f9024g;
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
                    case 3:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (vVar2 = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = vVar2.f9024g;
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
                    case 4:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payExpressFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        ec.v vVar8 = (ec.v) payExpressFragment.f22459a;
                        if (vVar8 != null) {
                            vVar8.f9025h.setOrder(bool != null ? bool.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payExpressFragment), null, null, new m0(payExpressFragment, bool, (Continuation) null), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.v vVar9 = (ec.v) payExpressFragment.f22459a;
                        if (vVar9 != null) {
                            CheckPrice checkPrice5 = vVar9.f9024g;
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
        this.f6958f = new q0(this) { // from class: le.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayExpressFragment f19694b;

            {
                this.f19694b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.v vVar;
                ec.v vVar2;
                y1.c0 c0Var;
                int i102 = i13;
                PayExpressFragment payExpressFragment = this.f19694b;
                switch (i102) {
                    case 0:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                            if (vVar3 != null) {
                                CheckPrice checkPrice = vVar3.f9024g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                            if (vVar4 != null) {
                                CheckPrice checkPrice2 = vVar4.f9024g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.v vVar5 = (ec.v) payExpressFragment.f22459a;
                            if (vVar5 != null) {
                                vVar5.f9027k.setText(charSequence);
                            }
                            ec.v vVar6 = (ec.v) payExpressFragment.f22459a;
                            View[] view = {vVar6 != null ? vVar6.f9027k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.v vVar7 = (ec.v) payExpressFragment.f22459a;
                            View[] view3 = {vVar7 != null ? vVar7.f9027k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            View view4 = view3[0];
                            if (view4 != null) {
                                view4.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Pair pair = (Pair) obj;
                        if (pair != null && (vVar = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = vVar.f9024g;
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
                    case 3:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (vVar2 = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = vVar2.f9024g;
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
                    case 4:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payExpressFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        ec.v vVar8 = (ec.v) payExpressFragment.f22459a;
                        if (vVar8 != null) {
                            vVar8.f9025h.setOrder(bool != null ? bool.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payExpressFragment), null, null, new m0(payExpressFragment, bool, (Continuation) null), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.v vVar9 = (ec.v) payExpressFragment.f22459a;
                        if (vVar9 != null) {
                            CheckPrice checkPrice5 = vVar9.f9024g;
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
        this.f6959g = new q0(this) { // from class: le.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayExpressFragment f19694b;

            {
                this.f19694b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.v vVar;
                ec.v vVar2;
                y1.c0 c0Var;
                int i102 = i14;
                PayExpressFragment payExpressFragment = this.f19694b;
                switch (i102) {
                    case 0:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                            if (vVar3 != null) {
                                CheckPrice checkPrice = vVar3.f9024g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                            if (vVar4 != null) {
                                CheckPrice checkPrice2 = vVar4.f9024g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.v vVar5 = (ec.v) payExpressFragment.f22459a;
                            if (vVar5 != null) {
                                vVar5.f9027k.setText(charSequence);
                            }
                            ec.v vVar6 = (ec.v) payExpressFragment.f22459a;
                            View[] view = {vVar6 != null ? vVar6.f9027k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.v vVar7 = (ec.v) payExpressFragment.f22459a;
                            View[] view3 = {vVar7 != null ? vVar7.f9027k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            View view4 = view3[0];
                            if (view4 != null) {
                                view4.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Pair pair = (Pair) obj;
                        if (pair != null && (vVar = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = vVar.f9024g;
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
                    case 3:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (vVar2 = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = vVar2.f9024g;
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
                    case 4:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payExpressFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        ec.v vVar8 = (ec.v) payExpressFragment.f22459a;
                        if (vVar8 != null) {
                            vVar8.f9025h.setOrder(bool != null ? bool.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payExpressFragment), null, null, new m0(payExpressFragment, bool, (Continuation) null), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.v vVar9 = (ec.v) payExpressFragment.f22459a;
                        if (vVar9 != null) {
                            CheckPrice checkPrice5 = vVar9.f9024g;
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
        this.f6960h = new q0(this) { // from class: le.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayExpressFragment f19694b;

            {
                this.f19694b = this;
            }

            @Override // androidx.lifecycle.q0
            public final void a(Object obj) {
                ec.v vVar;
                ec.v vVar2;
                y1.c0 c0Var;
                int i102 = i15;
                PayExpressFragment payExpressFragment = this.f19694b;
                switch (i102) {
                    case 0:
                        if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                            ec.v vVar3 = (ec.v) payExpressFragment.f22459a;
                            if (vVar3 != null) {
                                CheckPrice checkPrice = vVar3.f9024g;
                                if (checkPrice.f7234l1 != 0) {
                                    checkPrice.f7234l1 = 0;
                                    checkPrice.i();
                                    break;
                                }
                            }
                        } else {
                            ec.v vVar4 = (ec.v) payExpressFragment.f22459a;
                            if (vVar4 != null) {
                                CheckPrice checkPrice2 = vVar4.f9024g;
                                if (checkPrice2.f7234l1 != 1) {
                                    checkPrice2.f7234l1 = 1;
                                    checkPrice2.i();
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        CharSequence charSequence = (CharSequence) obj;
                        if (charSequence != null && charSequence.length() != 0) {
                            ec.v vVar5 = (ec.v) payExpressFragment.f22459a;
                            if (vVar5 != null) {
                                vVar5.f9027k.setText(charSequence);
                            }
                            ec.v vVar6 = (ec.v) payExpressFragment.f22459a;
                            View[] view = {vVar6 != null ? vVar6.f9027k : null};
                            Intrinsics.checkNotNullParameter(view, "view");
                            View view2 = view[0];
                            if (view2 != null) {
                                view2.setVisibility(0);
                                break;
                            }
                        } else {
                            ec.v vVar7 = (ec.v) payExpressFragment.f22459a;
                            View[] view3 = {vVar7 != null ? vVar7.f9027k : null};
                            Intrinsics.checkNotNullParameter(view3, "view");
                            View view4 = view3[0];
                            if (view4 != null) {
                                view4.setVisibility(8);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Pair pair = (Pair) obj;
                        if (pair != null && (vVar = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice3 = vVar.f9024g;
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
                    case 3:
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null && (vVar2 = (ec.v) payExpressFragment.f22459a) != null) {
                            CheckPrice checkPrice4 = vVar2.f9024g;
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
                    case 4:
                        ic.i0 i0Var = (ic.i0) obj;
                        ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                        ic.f fVar2 = fVar != null ? fVar : null;
                        if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                            try {
                                a.a.r(payExpressFragment).d(c0Var);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                    case 5:
                        Boolean bool = (Boolean) obj;
                        ec.v vVar8 = (ec.v) payExpressFragment.f22459a;
                        if (vVar8 != null) {
                            vVar8.f9025h.setOrder(bool != null ? bool.booleanValue() : false);
                        }
                        eg.c0.t(androidx.lifecycle.d1.g(payExpressFragment), null, null, new m0(payExpressFragment, bool, (Continuation) null), 3);
                        break;
                    default:
                        String str = (String) obj;
                        ec.v vVar9 = (ec.v) payExpressFragment.f22459a;
                        if (vVar9 != null) {
                            CheckPrice checkPrice5 = vVar9.f9024g;
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
    public static final Object G(PayExpressFragment payExpressFragment, Context context, Integer num, c cVar) {
        i0 i0Var;
        int i5;
        m image;
        payExpressFragment.getClass();
        try {
            if (cVar instanceof i0) {
                i0Var = (i0) cVar;
                int i10 = i0Var.f19825d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    i0Var.f19825d = i10 - Integer.MIN_VALUE;
                    Object obj = i0Var.f19823b;
                    lf.a aVar = lf.a.f20034a;
                    i5 = i0Var.f19825d;
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
                        i0Var.f19822a = context;
                        i0Var.f19825d = 1;
                        obj = ((c4.v) a10).c(a7, i0Var);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        context = i0Var.f19822a;
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
        i0Var = new i0(payExpressFragment, cVar);
        Object obj2 = i0Var.f19823b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = i0Var.f19825d;
    }

    @Override // rd.a
    public final b3.a F(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.pay_express_fragment, viewGroup, false);
        int i5 = R.id.btnClose;
        FrameLayout frameLayout = (FrameLayout) y3.j(R.id.btnClose, inflate);
        if (frameLayout != null) {
            i5 = R.id.btnExpress;
            CustomGradientButton customGradientButton = (CustomGradientButton) y3.j(R.id.btnExpress, inflate);
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
                                                        v vVar = new v((ConstraintLayout) inflate, frameLayout, customGradientButton, customButton, imageView, appCompatImageView, checkPrice, profitView, appCompatImageView2, frameLayout2, materialTextView, textView);
                                                        Intrinsics.checkNotNullExpressionValue(vVar, "inflate(...)");
                                                        return vVar;
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

    public final d1 H() {
        Intrinsics.checkNotNullParameter(this, "fragment");
        n factory = new n(3);
        Intrinsics.checkNotNullParameter(this, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        o1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        t1.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(d1.class, "modelClass");
        ag.c modelClass = u6.h.m(d1.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (d1) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // ve.i
    public final void f() {
        d1 H = H();
        p0 activity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
        H.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!H.f19733i) {
            H.w(activity);
        }
        H.f19733i = false;
        H.f19734k.h(Boolean.FALSE);
    }

    @Override // ve.i
    public final void m() {
        d1 H = H();
        p0 activity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
        H.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (H.f19733i) {
            H.x(activity);
        }
        H.f19733i = true;
        H.f19734k.h(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        H().k();
        d1 H = H();
        H.f19747y.e(getViewLifecycleOwner(), this.f6954b);
        H.H.e(getViewLifecycleOwner(), this.f6955c);
        H.f19735l.e(getViewLifecycleOwner(), this.f6959g);
        H.K.e(getViewLifecycleOwner(), this.f6960h);
        H.f19768e.e(getViewLifecycleOwner(), this.f6958f);
        H.L.e(getViewLifecycleOwner(), this.f6956d);
        H.M.e(getViewLifecycleOwner(), this.f6957e);
        v vVar = (v) this.f22459a;
        if (vVar != null) {
            vVar.f9025h.setListener(this);
            FrameLayout btnClose = vVar.f9019b;
            Intrinsics.checkNotNullExpressionValue(btnClose, "btnClose");
            final int i5 = 0;
            io.sentry.config.a.y(btnClose, 600L, new Function1(this) { // from class: le.b0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PayExpressFragment f19704b;

                {
                    this.f19704b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i10 = i5;
                    PayExpressFragment payExpressFragment = this.f19704b;
                    switch (i10) {
                        case 0:
                            a.a.r(payExpressFragment).e();
                            break;
                        case 1:
                            d1 H2 = payExpressFragment.H();
                            androidx.fragment.app.p0 activity = payExpressFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            if (H2.f19733i) {
                                H2.x(activity);
                            } else {
                                H2.w(activity);
                            }
                            break;
                        default:
                            d1 H3 = payExpressFragment.H();
                            H3.getClass();
                            u1.a i11 = androidx.lifecycle.d1.i(H3);
                            lg.e eVar = eg.m0.f9201a;
                            eg.c0.t(i11, jg.q.f18523a, null, new x0(H3, null, 4), 2);
                            break;
                    }
                    return Unit.f19194a;
                }
            });
            vVar.f9024g.setListenerCheckPrice(this);
            CustomGradientButton btnExpress = vVar.f9020c;
            Intrinsics.checkNotNullExpressionValue(btnExpress, "btnExpress");
            final int i10 = 1;
            io.sentry.config.a.y(btnExpress, 600L, new Function1(this) { // from class: le.b0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PayExpressFragment f19704b;

                {
                    this.f19704b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i102 = i10;
                    PayExpressFragment payExpressFragment = this.f19704b;
                    switch (i102) {
                        case 0:
                            a.a.r(payExpressFragment).e();
                            break;
                        case 1:
                            d1 H2 = payExpressFragment.H();
                            androidx.fragment.app.p0 activity = payExpressFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            if (H2.f19733i) {
                                H2.x(activity);
                            } else {
                                H2.w(activity);
                            }
                            break;
                        default:
                            d1 H3 = payExpressFragment.H();
                            H3.getClass();
                            u1.a i11 = androidx.lifecycle.d1.i(H3);
                            lg.e eVar = eg.m0.f9201a;
                            eg.c0.t(i11, jg.q.f18523a, null, new x0(H3, null, 4), 2);
                            break;
                    }
                    return Unit.f19194a;
                }
            });
            CustomButton btnVip = vVar.f9021d;
            Intrinsics.checkNotNullExpressionValue(btnVip, "btnVip");
            final int i11 = 2;
            io.sentry.config.a.y(btnVip, 600L, new Function1(this) { // from class: le.b0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PayExpressFragment f19704b;

                {
                    this.f19704b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i102 = i11;
                    PayExpressFragment payExpressFragment = this.f19704b;
                    switch (i102) {
                        case 0:
                            a.a.r(payExpressFragment).e();
                            break;
                        case 1:
                            d1 H2 = payExpressFragment.H();
                            androidx.fragment.app.p0 activity = payExpressFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                            H2.getClass();
                            Intrinsics.checkNotNullParameter(activity, "activity");
                            if (H2.f19733i) {
                                H2.x(activity);
                            } else {
                                H2.w(activity);
                            }
                            break;
                        default:
                            d1 H3 = payExpressFragment.H();
                            H3.getClass();
                            u1.a i112 = androidx.lifecycle.d1.i(H3);
                            lg.e eVar = eg.m0.f9201a;
                            eg.c0.t(i112, jg.q.f18523a, null, new x0(H3, null, 4), 2);
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.j);
        this.f6961i = c0.t(MyApp.f6830c, null, null, new le.c0(this, null, 4), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        d1 H = H();
        H.l();
        t1 t1Var = H.N;
        if (t1Var != null) {
            t1Var.k(null);
        }
        H.N = null;
        t1 t1Var2 = H.I;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        H.I = null;
        t1 t1Var3 = H.C;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        t1 t1Var4 = H.D;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        H.C = null;
        H.D = null;
        t1 t1Var5 = H.A;
        if (t1Var5 != null) {
            t1Var5.k(null);
        }
        H.A = null;
        t1 t1Var6 = H.B;
        if (t1Var6 != null) {
            t1Var6.k(null);
        }
        H.B = null;
        t1 t1Var7 = H.f19748z;
        if (t1Var7 != null) {
            t1Var7.k(null);
        }
        H.f19748z = null;
        t1 t1Var8 = H.f19745w;
        if (t1Var8 != null) {
            t1Var8.k(null);
        }
        H.f19745w = null;
        d1 H2 = H();
        H2.f19747y.i(this.f6954b);
        H2.H.i(this.f6955c);
        H2.f19735l.i(this.f6959g);
        H2.K.i(this.f6960h);
        H2.f19768e.i(this.f6958f);
        H2.L.i(this.f6956d);
        H2.M.i(this.f6957e);
        v vVar = (v) this.f22459a;
        if (vVar != null) {
            vVar.f9025h.setListener(null);
            vVar.f9024g.setListenerCheckPrice(null);
            vVar.f9020c.setOnClickListener(null);
            vVar.f9021d.setOnClickListener(null);
            vVar.f9019b.setOnClickListener(null);
        }
        t1 t1Var9 = this.f6961i;
        if (t1Var9 != null) {
            t1Var9.k(null);
        }
        this.f6961i = null;
        this.j.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        g gVar = new g(Reflection.getOrCreateKotlinClass(n0.class), new i3.i(6, this));
        d1 H = H();
        int b10 = ((n0) gVar.getValue()).b();
        int a7 = ((n0) gVar.getValue()).a();
        H.j = b10;
        H.f19765b = a7;
        wc.v vVar = H.f19730f;
        vVar.getClass();
        Continuation continuation = null;
        new cd.d().c("express_screen_show", null);
        H.f19734k.j(Boolean.FALSE);
        H.f19733i = false;
        if (H.F == null) {
            ((zc.k) vVar.f25206h.getValue()).getClass();
            H.F = zc.k.h(R.string.offer_is_limited);
        }
        c0.t(androidx.lifecycle.d1.g(this), null, null, new androidx.lifecycle.o(this, view, continuation, 27), 3);
    }

    @Override // ve.i
    public final void q(int i5, String minOddsBySub) {
        Intrinsics.checkNotNullParameter(minOddsBySub, "minOddsBySub");
        c0.t(androidx.lifecycle.d1.g(this), null, null, new j0(this, i5, (Continuation) null, 1), 3);
    }

    @Override // ve.i
    public final void s(boolean z5) {
        if (!z5) {
            d1 H = H();
            H.getClass();
            da.d dVar = new da.d();
            dVar.c("express_prediction");
            Intrinsics.checkNotNullExpressionValue(dVar, "setDestination(...)");
            H.j(dVar);
            return;
        }
        d1 H2 = H();
        Context context = getContext();
        H2.getClass();
        if (context == null) {
            return;
        }
        u1.a i5 = androidx.lifecycle.d1.i(H2);
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
            d1 H = H();
            H.getClass();
            da.d dVar = new da.d();
            dVar.c("express_prediction");
            Intrinsics.checkNotNullExpressionValue(dVar, "setDestination(...)");
            H.j(dVar);
        }
    }
}
