package com.sofascore.results.tutorial;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.mbridge.msdk.MBridgeConstans;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.tutorial.AbstractTutorialActivity;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bsk;
import defpackage.duf;
import defpackage.f6;
import defpackage.i5h;
import defpackage.i8;
import defpackage.j01;
import defpackage.j8;
import defpackage.mqi;
import defpackage.otk;
import defpackage.srk;
import defpackage.tsk;
import defpackage.u2k;
import defpackage.uyf;
import defpackage.w2k;
import defpackage.wca;
import defpackage.y2;
import defpackage.ypa;
import defpackage.ze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/tutorial/AbstractTutorialActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "pauseProgress", "(Landroid/view/View;)V", "resumeProgress", "i8", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractTutorialActivity extends AbstractActivity {
    public static final /* synthetic */ int R = 0;
    public final mqi J;
    public final otk K;
    public final mqi L;
    public final mqi M;
    public long N;
    public final mqi O;
    public final mqi P;
    public final mqi Q;

    public AbstractTutorialActivity() {
        final int i = 0;
        this.J = ypa.b(new Function0(this) { // from class: h8
            public final /* synthetic */ AbstractTutorialActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AbstractTutorialActivity abstractTutorialActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = AbstractTutorialActivity.R;
                        View inflate = abstractTutorialActivity.getLayoutInflater().inflate(R.layout.activity_tutorial, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        int i4 = R.id.close_button;
                        if (((ImageView) nq8.B(R.id.close_button, inflate)) != null) {
                            i4 = R.id.header_container;
                            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header_container, inflate);
                            if (frameLayout != null) {
                                i4 = R.id.provider_logo;
                                if (((ImageView) nq8.B(R.id.provider_logo, inflate)) != null) {
                                    i4 = R.id.sofa_logo;
                                    if (((ImageView) nq8.B(R.id.sofa_logo, inflate)) != null) {
                                        i4 = R.id.story_overlay;
                                        View B = nq8.B(R.id.story_overlay, inflate);
                                        if (B != null) {
                                            i4 = R.id.tab_indicator_layout;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.tab_indicator_layout, inflate);
                                            if (linearLayout != null) {
                                                i4 = R.id.tutorial_view_pager;
                                                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.tutorial_view_pager, inflate);
                                                if (viewPager2 != null) {
                                                    return new ze(constraintLayout, constraintLayout, frameLayout, B, linearLayout, viewPager2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = AbstractTutorialActivity.R;
                        List list = (List) abstractTutorialActivity.M.getValue();
                        ViewPager2 viewPager22 = abstractTutorialActivity.R().f;
                        abstractTutorialActivity.U();
                        return new w2k(list, viewPager22, abstractTutorialActivity, v2k.a);
                    case 2:
                        int i6 = AbstractTutorialActivity.R;
                        return abstractTutorialActivity.Q();
                    case 3:
                        int i7 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(1, abstractTutorialActivity));
                    case 4:
                        int i8 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(2, abstractTutorialActivity));
                    default:
                        int i9 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(4, abstractTutorialActivity));
                }
            }
        });
        final int i2 = 1;
        final int i3 = 2;
        this.K = new otk(duf.a.getOrCreateKotlinClass(u2k.class), new j8(this, i2), new j8(this, i), new j8(this, i3));
        this.L = ypa.b(new Function0(this) { // from class: h8
            public final /* synthetic */ AbstractTutorialActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AbstractTutorialActivity abstractTutorialActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = AbstractTutorialActivity.R;
                        View inflate = abstractTutorialActivity.getLayoutInflater().inflate(R.layout.activity_tutorial, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        int i4 = R.id.close_button;
                        if (((ImageView) nq8.B(R.id.close_button, inflate)) != null) {
                            i4 = R.id.header_container;
                            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header_container, inflate);
                            if (frameLayout != null) {
                                i4 = R.id.provider_logo;
                                if (((ImageView) nq8.B(R.id.provider_logo, inflate)) != null) {
                                    i4 = R.id.sofa_logo;
                                    if (((ImageView) nq8.B(R.id.sofa_logo, inflate)) != null) {
                                        i4 = R.id.story_overlay;
                                        View B = nq8.B(R.id.story_overlay, inflate);
                                        if (B != null) {
                                            i4 = R.id.tab_indicator_layout;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.tab_indicator_layout, inflate);
                                            if (linearLayout != null) {
                                                i4 = R.id.tutorial_view_pager;
                                                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.tutorial_view_pager, inflate);
                                                if (viewPager2 != null) {
                                                    return new ze(constraintLayout, constraintLayout, frameLayout, B, linearLayout, viewPager2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = AbstractTutorialActivity.R;
                        List list = (List) abstractTutorialActivity.M.getValue();
                        ViewPager2 viewPager22 = abstractTutorialActivity.R().f;
                        abstractTutorialActivity.U();
                        return new w2k(list, viewPager22, abstractTutorialActivity, v2k.a);
                    case 2:
                        int i6 = AbstractTutorialActivity.R;
                        return abstractTutorialActivity.Q();
                    case 3:
                        int i7 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(1, abstractTutorialActivity));
                    case 4:
                        int i8 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(2, abstractTutorialActivity));
                    default:
                        int i9 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(4, abstractTutorialActivity));
                }
            }
        });
        this.M = ypa.b(new Function0(this) { // from class: h8
            public final /* synthetic */ AbstractTutorialActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AbstractTutorialActivity abstractTutorialActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = AbstractTutorialActivity.R;
                        View inflate = abstractTutorialActivity.getLayoutInflater().inflate(R.layout.activity_tutorial, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        int i4 = R.id.close_button;
                        if (((ImageView) nq8.B(R.id.close_button, inflate)) != null) {
                            i4 = R.id.header_container;
                            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header_container, inflate);
                            if (frameLayout != null) {
                                i4 = R.id.provider_logo;
                                if (((ImageView) nq8.B(R.id.provider_logo, inflate)) != null) {
                                    i4 = R.id.sofa_logo;
                                    if (((ImageView) nq8.B(R.id.sofa_logo, inflate)) != null) {
                                        i4 = R.id.story_overlay;
                                        View B = nq8.B(R.id.story_overlay, inflate);
                                        if (B != null) {
                                            i4 = R.id.tab_indicator_layout;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.tab_indicator_layout, inflate);
                                            if (linearLayout != null) {
                                                i4 = R.id.tutorial_view_pager;
                                                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.tutorial_view_pager, inflate);
                                                if (viewPager2 != null) {
                                                    return new ze(constraintLayout, constraintLayout, frameLayout, B, linearLayout, viewPager2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    case 1:
                        int i5 = AbstractTutorialActivity.R;
                        List list = (List) abstractTutorialActivity.M.getValue();
                        ViewPager2 viewPager22 = abstractTutorialActivity.R().f;
                        abstractTutorialActivity.U();
                        return new w2k(list, viewPager22, abstractTutorialActivity, v2k.a);
                    case 2:
                        int i6 = AbstractTutorialActivity.R;
                        return abstractTutorialActivity.Q();
                    case 3:
                        int i7 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(1, abstractTutorialActivity));
                    case 4:
                        int i8 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(2, abstractTutorialActivity));
                    default:
                        int i9 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(4, abstractTutorialActivity));
                }
            }
        });
        final int i4 = 3;
        this.O = ypa.b(new Function0(this) { // from class: h8
            public final /* synthetic */ AbstractTutorialActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                AbstractTutorialActivity abstractTutorialActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = AbstractTutorialActivity.R;
                        View inflate = abstractTutorialActivity.getLayoutInflater().inflate(R.layout.activity_tutorial, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        int i42 = R.id.close_button;
                        if (((ImageView) nq8.B(R.id.close_button, inflate)) != null) {
                            i42 = R.id.header_container;
                            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header_container, inflate);
                            if (frameLayout != null) {
                                i42 = R.id.provider_logo;
                                if (((ImageView) nq8.B(R.id.provider_logo, inflate)) != null) {
                                    i42 = R.id.sofa_logo;
                                    if (((ImageView) nq8.B(R.id.sofa_logo, inflate)) != null) {
                                        i42 = R.id.story_overlay;
                                        View B = nq8.B(R.id.story_overlay, inflate);
                                        if (B != null) {
                                            i42 = R.id.tab_indicator_layout;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.tab_indicator_layout, inflate);
                                            if (linearLayout != null) {
                                                i42 = R.id.tutorial_view_pager;
                                                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.tutorial_view_pager, inflate);
                                                if (viewPager2 != null) {
                                                    return new ze(constraintLayout, constraintLayout, frameLayout, B, linearLayout, viewPager2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i42)));
                        return null;
                    case 1:
                        int i5 = AbstractTutorialActivity.R;
                        List list = (List) abstractTutorialActivity.M.getValue();
                        ViewPager2 viewPager22 = abstractTutorialActivity.R().f;
                        abstractTutorialActivity.U();
                        return new w2k(list, viewPager22, abstractTutorialActivity, v2k.a);
                    case 2:
                        int i6 = AbstractTutorialActivity.R;
                        return abstractTutorialActivity.Q();
                    case 3:
                        int i7 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(1, abstractTutorialActivity));
                    case 4:
                        int i8 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(2, abstractTutorialActivity));
                    default:
                        int i9 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(4, abstractTutorialActivity));
                }
            }
        });
        final int i5 = 4;
        this.P = ypa.b(new Function0(this) { // from class: h8
            public final /* synthetic */ AbstractTutorialActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AbstractTutorialActivity abstractTutorialActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = AbstractTutorialActivity.R;
                        View inflate = abstractTutorialActivity.getLayoutInflater().inflate(R.layout.activity_tutorial, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        int i42 = R.id.close_button;
                        if (((ImageView) nq8.B(R.id.close_button, inflate)) != null) {
                            i42 = R.id.header_container;
                            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header_container, inflate);
                            if (frameLayout != null) {
                                i42 = R.id.provider_logo;
                                if (((ImageView) nq8.B(R.id.provider_logo, inflate)) != null) {
                                    i42 = R.id.sofa_logo;
                                    if (((ImageView) nq8.B(R.id.sofa_logo, inflate)) != null) {
                                        i42 = R.id.story_overlay;
                                        View B = nq8.B(R.id.story_overlay, inflate);
                                        if (B != null) {
                                            i42 = R.id.tab_indicator_layout;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.tab_indicator_layout, inflate);
                                            if (linearLayout != null) {
                                                i42 = R.id.tutorial_view_pager;
                                                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.tutorial_view_pager, inflate);
                                                if (viewPager2 != null) {
                                                    return new ze(constraintLayout, constraintLayout, frameLayout, B, linearLayout, viewPager2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i42)));
                        return null;
                    case 1:
                        int i52 = AbstractTutorialActivity.R;
                        List list = (List) abstractTutorialActivity.M.getValue();
                        ViewPager2 viewPager22 = abstractTutorialActivity.R().f;
                        abstractTutorialActivity.U();
                        return new w2k(list, viewPager22, abstractTutorialActivity, v2k.a);
                    case 2:
                        int i6 = AbstractTutorialActivity.R;
                        return abstractTutorialActivity.Q();
                    case 3:
                        int i7 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(1, abstractTutorialActivity));
                    case 4:
                        int i8 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(2, abstractTutorialActivity));
                    default:
                        int i9 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(4, abstractTutorialActivity));
                }
            }
        });
        final int i6 = 5;
        this.Q = ypa.b(new Function0(this) { // from class: h8
            public final /* synthetic */ AbstractTutorialActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AbstractTutorialActivity abstractTutorialActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = AbstractTutorialActivity.R;
                        View inflate = abstractTutorialActivity.getLayoutInflater().inflate(R.layout.activity_tutorial, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        int i42 = R.id.close_button;
                        if (((ImageView) nq8.B(R.id.close_button, inflate)) != null) {
                            i42 = R.id.header_container;
                            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.header_container, inflate);
                            if (frameLayout != null) {
                                i42 = R.id.provider_logo;
                                if (((ImageView) nq8.B(R.id.provider_logo, inflate)) != null) {
                                    i42 = R.id.sofa_logo;
                                    if (((ImageView) nq8.B(R.id.sofa_logo, inflate)) != null) {
                                        i42 = R.id.story_overlay;
                                        View B = nq8.B(R.id.story_overlay, inflate);
                                        if (B != null) {
                                            i42 = R.id.tab_indicator_layout;
                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.tab_indicator_layout, inflate);
                                            if (linearLayout != null) {
                                                i42 = R.id.tutorial_view_pager;
                                                ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.tutorial_view_pager, inflate);
                                                if (viewPager2 != null) {
                                                    return new ze(constraintLayout, constraintLayout, frameLayout, B, linearLayout, viewPager2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i42)));
                        return null;
                    case 1:
                        int i52 = AbstractTutorialActivity.R;
                        List list = (List) abstractTutorialActivity.M.getValue();
                        ViewPager2 viewPager22 = abstractTutorialActivity.R().f;
                        abstractTutorialActivity.U();
                        return new w2k(list, viewPager22, abstractTutorialActivity, v2k.a);
                    case 2:
                        int i62 = AbstractTutorialActivity.R;
                        return abstractTutorialActivity.Q();
                    case 3:
                        int i7 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(1, abstractTutorialActivity));
                    case 4:
                        int i8 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(2, abstractTutorialActivity));
                    default:
                        int i9 = AbstractTutorialActivity.R;
                        return Integer.valueOf(ao2.s(4, abstractTutorialActivity));
                }
            }
        });
    }

    public static void Z(AbstractTutorialActivity abstractTutorialActivity, int i, i8 i8Var) {
        abstractTutorialActivity.getClass();
        if (i >= ((List) abstractTutorialActivity.M.getValue()).size()) {
            abstractTutorialActivity.finish();
        } else {
            abstractTutorialActivity.R().f.c(i, true);
            abstractTutorialActivity.V(i);
        }
    }

    public abstract List Q();

    public final ze R() {
        return (ze) this.J.getValue();
    }

    public boolean S() {
        return false;
    }

    public abstract f6 T();

    public abstract void U();

    public final View V(int i) {
        View w = wca.w(R().f);
        RecyclerView recyclerView = w instanceof RecyclerView ? (RecyclerView) w : null;
        if (recyclerView != null && recyclerView.getChildCount() > 0) {
            View childAt = recyclerView.getChildAt(i);
            FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
            if (frameLayout != null && frameLayout.getChildCount() > 0) {
                return frameLayout.getChildAt(0);
            }
        }
        return null;
    }

    public abstract void W();

    public final void X(double d) {
        Object obj;
        List q = i5h.q(new tsk(R().e));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : q) {
            if (obj2 instanceof LinearProgressIndicator) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LinearProgressIndicator) obj).getProgress() != 100) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) obj;
        if (linearProgressIndicator != null) {
            linearProgressIndicator.setProgress((int) (d * 100.0d));
        }
    }

    public final void Y() {
        R().f.setAdapter((w2k) this.L.getValue());
        R().f.setUserInputEnabled(false);
        R().f.post(new y2(this, 3));
        W();
        ((u2k) this.K.getValue()).k(7000L, null, this);
        R().f.setOnTouchListener(T());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R().a);
        LinearLayout linearLayout = R().e;
        j01 j01Var = new j01(linearLayout, 16, this);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(linearLayout, j01Var);
        if (S()) {
            return;
        }
        Y();
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        uyf uyfVar = ((u2k) this.K.getValue()).e;
        if (uyfVar != null) {
            uyfVar.cancel();
        }
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        u2k u2kVar = (u2k) this.K.getValue();
        Long l = u2kVar.g;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = u2kVar.f;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                AbstractTutorialActivity abstractTutorialActivity = u2kVar.h;
                if (abstractTutorialActivity != null) {
                    u2kVar.k(longValue, Long.valueOf(longValue - longValue2), abstractTutorialActivity);
                }
            }
        }
        R().d.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void pauseProgress(@NotNull View view) {
        view.getClass();
        uyf uyfVar = ((u2k) this.K.getValue()).e;
        if (uyfVar != null) {
            uyfVar.cancel();
        }
    }

    public void resumeProgress(@NotNull View view) {
        view.getClass();
        u2k u2kVar = (u2k) this.K.getValue();
        Long l = u2kVar.g;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = u2kVar.f;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                AbstractTutorialActivity abstractTutorialActivity = u2kVar.h;
                if (abstractTutorialActivity != null) {
                    u2kVar.k(longValue, Long.valueOf(longValue - longValue2), abstractTutorialActivity);
                }
            }
        }
    }
}
