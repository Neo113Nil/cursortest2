package com.sofascore.results.buzzer;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.R;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.b8;
import defpackage.duf;
import defpackage.jtd;
import defpackage.k92;
import defpackage.l1;
import defpackage.l82;
import defpackage.m82;
import defpackage.mqi;
import defpackage.otk;
import defpackage.ox1;
import defpackage.p82;
import defpackage.q82;
import defpackage.y7;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/buzzer/BuzzerActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "s9a", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BuzzerActivity extends Hilt_BuzzerActivity {
    public static final /* synthetic */ int O = 0;
    public final mqi K;
    public final otk L;
    public q82 M;
    public final mqi N;

    public BuzzerActivity() {
        final int i = 0;
        this.K = ypa.b(new Function0(this) { // from class: k82
            public final /* synthetic */ BuzzerActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BuzzerActivity buzzerActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = BuzzerActivity.O;
                        View inflate = buzzerActivity.getLayoutInflater().inflate(R.layout.buzzer_activity, (ViewGroup) null, false);
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                        int i4 = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                        if (recyclerView != null) {
                            i4 = R.id.swipe_refresh_layout;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                            if (swipeRefreshLayout != null) {
                                i4 = R.id.toolbar;
                                View B = nq8.B(R.id.toolbar, inflate);
                                if (B != null) {
                                    z3f b = z3f.b(B);
                                    if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                        return new m82(coordinatorLayout, recyclerView, swipeRefreshLayout, b);
                                    }
                                    i4 = R.id.toolbar_holder;
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = BuzzerActivity.O;
                        return new p82(buzzerActivity, "buzzer_feed");
                }
            }
        });
        final int i2 = 1;
        this.L = new otk(duf.a.getOrCreateKotlinClass(k92.class), new l82(this, i2), new l82(this, i), new l82(this, 2));
        this.N = ypa.b(new Function0(this) { // from class: k82
            public final /* synthetic */ BuzzerActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BuzzerActivity buzzerActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = BuzzerActivity.O;
                        View inflate = buzzerActivity.getLayoutInflater().inflate(R.layout.buzzer_activity, (ViewGroup) null, false);
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                        int i4 = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                        if (recyclerView != null) {
                            i4 = R.id.swipe_refresh_layout;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.swipe_refresh_layout, inflate);
                            if (swipeRefreshLayout != null) {
                                i4 = R.id.toolbar;
                                View B = nq8.B(R.id.toolbar, inflate);
                                if (B != null) {
                                    z3f b = z3f.b(B);
                                    if (((AppBarLayout) nq8.B(R.id.toolbar_holder, inflate)) != null) {
                                        return new m82(coordinatorLayout, recyclerView, swipeRefreshLayout, b);
                                    }
                                    i4 = R.id.toolbar_holder;
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = BuzzerActivity.O;
                        return new p82(buzzerActivity, "buzzer_feed");
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        ((k92) this.L.getValue()).k(false);
    }

    public final m82 Q() {
        return (m82) this.K.getValue();
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = Q().b;
        jtd.a(recyclerView, new b8(recyclerView, this));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        AbstractActivity.M(this, Q().d, getString(R.string.buzzer_feed), null, null, 60);
        z8e.X(Q().c, this, null);
        int i = 10;
        Q().c.setOnRefreshListener(new l1(this, i));
        RecyclerView recyclerView = Q().b;
        jtd.a(recyclerView, new b8(recyclerView, this));
        Q().b.setHasFixedSize(true);
        Q().b.setAdapter((p82) this.N.getValue());
        ((k92) this.L.getValue()).g.e(this, new y7(6, new ox1(this, i)));
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        q82 q82Var = this.M;
        if (q82Var != null) {
            q82Var.e();
        }
        super.onPause();
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        q82 q82Var = this.M;
        if (q82Var != null) {
            q82Var.d();
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "BuzzerScreen";
    }
}
