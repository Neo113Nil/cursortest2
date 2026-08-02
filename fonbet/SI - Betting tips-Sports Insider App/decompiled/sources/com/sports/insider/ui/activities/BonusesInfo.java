package com.sports.insider.ui.activities;

import a2.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.q4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.lifecycle.b;
import androidx.lifecycle.d1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cd.d;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.R;
import com.sports.insider.ui.views.HowToGetABonusBtn;
import eg.c0;
import gf.k;
import gf.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import t1.c;
import u6.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/ui/activities/BonusesInfo;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BonusesInfo extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final t f6881a;

    /* renamed from: b, reason: collision with root package name */
    public final pd.a f6882b;

    /* renamed from: c, reason: collision with root package name */
    public q4 f6883c;

    public BonusesInfo() {
        super(R.layout.bonuses_layout);
        this.f6881a = k.b(new id.a(25));
        this.f6882b = new pd.a(this, 0);
    }

    public final pd.t F() {
        p0 owner = requireActivity();
        Intrinsics.checkNotNullExpressionValue(owner, "requireActivity(...)");
        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
        Intrinsics.checkNotNullParameter(owner, "owner");
        o1 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        m1 factory = owner.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(owner, "owner");
        c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(pd.t.class, "modelClass");
        ag.c modelClass = h.m(pd.t.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (pd.t) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.bonuses_layout, viewGroup, false);
        int i5 = R.id.btn_How_to_get_a_bonus;
        HowToGetABonusBtn howToGetABonusBtn = (HowToGetABonusBtn) y3.j(R.id.btn_How_to_get_a_bonus, inflate);
        if (howToGetABonusBtn != null) {
            i5 = R.id.express_count;
            TextView textView = (TextView) y3.j(R.id.express_count, inflate);
            if (textView != null) {
                i5 = R.id.express_count_x;
                TextView textView2 = (TextView) y3.j(R.id.express_count_x, inflate);
                if (textView2 != null) {
                    i5 = R.id.express_frame;
                    if (((LinearLayout) y3.j(R.id.express_frame, inflate)) != null) {
                        i5 = R.id.prem_count;
                        TextView textView3 = (TextView) y3.j(R.id.prem_count, inflate);
                        if (textView3 != null) {
                            i5 = R.id.prem_count_x;
                            TextView textView4 = (TextView) y3.j(R.id.prem_count_x, inflate);
                            if (textView4 != null) {
                                i5 = R.id.prem_frame;
                                if (((LinearLayout) y3.j(R.id.prem_frame, inflate)) != null) {
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                                    this.f6883c = new q4(swipeRefreshLayout, howToGetABonusBtn, textView, textView2, textView3, textView4, swipeRefreshLayout, 3);
                                    Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout, "getRoot(...)");
                                    return swipeRefreshLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6883c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onStart();
        q4 q4Var = this.f6883c;
        if (q4Var != null) {
            TextView textView = (TextView) q4Var.f896f;
            ((uc.c) this.f6881a.getValue()).getClass();
            textView.setText(String.valueOf(uc.c.f24220a));
            TextView textView2 = (TextView) q4Var.f894d;
            ((uc.c) this.f6881a.getValue()).getClass();
            textView2.setText(String.valueOf(uc.c.f24221b));
        }
        d1.a(F().f21796f).e(getViewLifecycleOwner(), this.f6882b);
        q4 q4Var2 = this.f6883c;
        if (q4Var2 != null) {
            io.sentry.config.a.y((HowToGetABonusBtn) q4Var2.f893c, 600L, new f(16, this));
        }
        q4 q4Var3 = this.f6883c;
        if (q4Var3 == null || (swipeRefreshLayout = (SwipeRefreshLayout) q4Var3.f898h) == null) {
            return;
        }
        swipeRefreshLayout.setOnRefreshListener(new io.sentry.android.core.internal.gestures.c(14, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        SwipeRefreshLayout swipeRefreshLayout;
        super.onStop();
        q4 q4Var = this.f6883c;
        if (q4Var != null) {
            ((HowToGetABonusBtn) q4Var.f893c).setOnClickListener(null);
        }
        q4 q4Var2 = this.f6883c;
        if (q4Var2 != null && (swipeRefreshLayout = (SwipeRefreshLayout) q4Var2.f898h) != null) {
            swipeRefreshLayout.setOnRefreshListener(null);
        }
        d1.a(F().f21796f).i(this.f6882b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((uc.c) this.f6881a.getValue()).getClass();
        Continuation continuation = null;
        new d().c("click_bonus", null);
        c0.t(d1.g(this), null, null, new b(this, (Continuation) null, 19), 3);
        q4 q4Var = this.f6883c;
        if (q4Var != null) {
            HowToGetABonusBtn howToGetABonusBtn = (HowToGetABonusBtn) q4Var.f893c;
            me.d blockRegular = new me.d(1, new zc.k(), zc.k.class, "arimoRegular", "arimoRegular()Landroid/graphics/Typeface;", 4, 24);
            me.d blockBold = new me.d(1, new zc.k(), zc.k.class, "arimoBold", "arimoBold()Landroid/graphics/Typeface;", 4, 25);
            Intrinsics.checkNotNullParameter(blockRegular, "blockRegular");
            Intrinsics.checkNotNullParameter(blockBold, "blockBold");
            c0.t(howToGetABonusBtn.f7543n, null, null, new u0(howToGetABonusBtn, blockRegular, blockBold, continuation, 18), 3);
        }
    }
}
