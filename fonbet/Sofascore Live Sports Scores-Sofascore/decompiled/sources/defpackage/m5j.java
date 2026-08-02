package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.header.TeamLogoView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m5j extends s21 implements ua0 {
    public final FollowActionButton A;
    public boolean B;
    public boolean C;
    public final mqi D;
    public final mqi E;
    public final mqi F;
    public int G;
    public final Set j;
    public final ArrayList k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final eoa w;
    public final TeamLogoView x;
    public final TeamLogoView y;
    public final FollowActionButton z;

    public m5j(Context context) {
        super(context);
        this.j = ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_DELAYED});
        final int i = 1;
        IntRange intRange = new IntRange(1, 5, 1);
        ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
        v6a it = intRange.iterator();
        while (it.c) {
            arrayList.add("period" + it.nextInt());
        }
        this.k = arrayList;
        this.l = ao2.s(1, context);
        final int i2 = 2;
        this.m = ao2.s(2, context);
        this.n = ao2.s(4, context);
        int s = ao2.s(12, context);
        this.o = s;
        this.p = ao2.s(14, context);
        this.q = ao2.s(16, context);
        this.r = ao2.s(20, context);
        this.s = ao2.s(24, context);
        this.t = ao2.s(48, context);
        this.u = s;
        this.v = hkg.c0(context) ? -1 : 1;
        final int i3 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_tennis_event_header, (ViewGroup) this, false);
        addView(inflate);
        int i4 = R.id.collapsed_result_first_team;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.collapsed_result_first_team, inflate);
        if (linearLayout != null) {
            i4 = R.id.collapsed_result_second_team;
            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.collapsed_result_second_team, inflate);
            if (linearLayout2 != null) {
                i4 = R.id.container_match_details;
                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.container_match_details, inflate);
                if (frameLayout != null) {
                    i4 = R.id.container_result_collapsed;
                    LinearLayout linearLayout3 = (LinearLayout) nq8.B(R.id.container_result_collapsed, inflate);
                    if (linearLayout3 != null) {
                        i4 = R.id.event_date;
                        TextView textView = (TextView) nq8.B(R.id.event_date, inflate);
                        if (textView != null) {
                            i4 = R.id.first_player_bell;
                            FollowActionButton followActionButton = (FollowActionButton) nq8.B(R.id.first_player_bell, inflate);
                            if (followActionButton != null) {
                                i4 = R.id.first_player_image;
                                TeamLogoView teamLogoView = (TeamLogoView) nq8.B(R.id.first_player_image, inflate);
                                if (teamLogoView != null) {
                                    i4 = R.id.first_player_name;
                                    TextView textView2 = (TextView) nq8.B(R.id.first_player_name, inflate);
                                    if (textView2 != null) {
                                        i4 = R.id.first_player_name_collapsed;
                                        TextView textView3 = (TextView) nq8.B(R.id.first_player_name_collapsed, inflate);
                                        if (textView3 != null) {
                                            i4 = R.id.first_player_ranking;
                                            TextView textView4 = (TextView) nq8.B(R.id.first_player_ranking, inflate);
                                            if (textView4 != null) {
                                                i4 = R.id.players_collapsed;
                                                LinearLayout linearLayout4 = (LinearLayout) nq8.B(R.id.players_collapsed, inflate);
                                                if (linearLayout4 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    i4 = R.id.second_player_bell;
                                                    FollowActionButton followActionButton2 = (FollowActionButton) nq8.B(R.id.second_player_bell, inflate);
                                                    if (followActionButton2 != null) {
                                                        i4 = R.id.second_player_image;
                                                        TeamLogoView teamLogoView2 = (TeamLogoView) nq8.B(R.id.second_player_image, inflate);
                                                        if (teamLogoView2 != null) {
                                                            i4 = R.id.second_player_name;
                                                            TextView textView5 = (TextView) nq8.B(R.id.second_player_name, inflate);
                                                            if (textView5 != null) {
                                                                i4 = R.id.second_player_name_collapsed;
                                                                TextView textView6 = (TextView) nq8.B(R.id.second_player_name_collapsed, inflate);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.second_player_ranking;
                                                                    TextView textView7 = (TextView) nq8.B(R.id.second_player_ranking, inflate);
                                                                    if (textView7 != null) {
                                                                        i4 = R.id.toolbar_barrier;
                                                                        Guideline guideline = (Guideline) nq8.B(R.id.toolbar_barrier, inflate);
                                                                        if (guideline != null) {
                                                                            this.w = new eoa(constraintLayout, linearLayout, linearLayout2, frameLayout, linearLayout3, textView, followActionButton, teamLogoView, textView2, textView3, textView4, linearLayout4, constraintLayout, followActionButton2, teamLogoView2, textView5, textView6, textView7, guideline);
                                                                            TeamLogoView teamLogoView3 = getBinding().h;
                                                                            this.x = teamLogoView3;
                                                                            TeamLogoView teamLogoView4 = getBinding().o;
                                                                            this.y = teamLogoView4;
                                                                            this.z = getBinding().g;
                                                                            this.A = getBinding().n;
                                                                            this.C = true;
                                                                            this.D = ypa.b(new Function0(this) { // from class: h5j
                                                                                public final /* synthetic */ m5j b;

                                                                                {
                                                                                    this.b = this;
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    int i5 = i3;
                                                                                    m5j m5jVar = this.b;
                                                                                    switch (i5) {
                                                                                        case 0:
                                                                                            eoa binding = m5jVar.getBinding();
                                                                                            return ph0.a0(new View[]{binding.g, binding.h, binding.i, binding.k});
                                                                                        case 1:
                                                                                            eoa binding2 = m5jVar.getBinding();
                                                                                            return ph0.a0(new View[]{binding2.n, binding2.o, binding2.p, binding2.r});
                                                                                        default:
                                                                                            ViewParent parent = m5jVar.getParent().getParent().getParent();
                                                                                            if (parent instanceof AppBarLayout) {
                                                                                                return (AppBarLayout) parent;
                                                                                            }
                                                                                            return null;
                                                                                    }
                                                                                }
                                                                            });
                                                                            this.E = ypa.b(new Function0(this) { // from class: h5j
                                                                                public final /* synthetic */ m5j b;

                                                                                {
                                                                                    this.b = this;
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    int i5 = i;
                                                                                    m5j m5jVar = this.b;
                                                                                    switch (i5) {
                                                                                        case 0:
                                                                                            eoa binding = m5jVar.getBinding();
                                                                                            return ph0.a0(new View[]{binding.g, binding.h, binding.i, binding.k});
                                                                                        case 1:
                                                                                            eoa binding2 = m5jVar.getBinding();
                                                                                            return ph0.a0(new View[]{binding2.n, binding2.o, binding2.p, binding2.r});
                                                                                        default:
                                                                                            ViewParent parent = m5jVar.getParent().getParent().getParent();
                                                                                            if (parent instanceof AppBarLayout) {
                                                                                                return (AppBarLayout) parent;
                                                                                            }
                                                                                            return null;
                                                                                    }
                                                                                }
                                                                            });
                                                                            aba.y(teamLogoView3, 0, 1);
                                                                            aba.y(teamLogoView4, 0, 1);
                                                                            this.F = ypa.b(new Function0(this) { // from class: h5j
                                                                                public final /* synthetic */ m5j b;

                                                                                {
                                                                                    this.b = this;
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Object invoke() {
                                                                                    int i5 = i2;
                                                                                    m5j m5jVar = this.b;
                                                                                    switch (i5) {
                                                                                        case 0:
                                                                                            eoa binding = m5jVar.getBinding();
                                                                                            return ph0.a0(new View[]{binding.g, binding.h, binding.i, binding.k});
                                                                                        case 1:
                                                                                            eoa binding2 = m5jVar.getBinding();
                                                                                            return ph0.a0(new View[]{binding2.n, binding2.o, binding2.p, binding2.r});
                                                                                        default:
                                                                                            ViewParent parent = m5jVar.getParent().getParent().getParent();
                                                                                            if (parent instanceof AppBarLayout) {
                                                                                                return (AppBarLayout) parent;
                                                                                            }
                                                                                            return null;
                                                                                    }
                                                                                }
                                                                            });
                                                                            this.G = -1;
                                                                            return;
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
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
        throw null;
    }

    private final AppBarLayout getAppBarLayout() {
        return (AppBarLayout) this.F.getValue();
    }

    private final Set<View> getFirstPlayerViewSet() {
        return (Set) this.D.getValue();
    }

    private final Set<View> getSecondPlayerViewSet() {
        return (Set) this.E.getValue();
    }

    public static /* synthetic */ TextView n(m5j m5jVar, String str, Boolean bool, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m5jVar.m(str, bool, z, false);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x037a, code lost:
    
        if (r1.height == (-1)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        if (r1.height == (-1)) goto L44;
     */
    @Override // defpackage.ua0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AppBarLayout appBarLayout, int i) {
        float f;
        ViewGroup resultView;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup resultView2;
        View view;
        ViewGroup resultView3;
        View view2;
        int i2 = -i;
        float f2 = i2;
        appBarLayout.getTotalScrollRange();
        TextView textView = getBinding().f;
        if (textView.getVisibility() == 0) {
            textView.setAlpha(appBarLayout.getTotalScrollRange() == 0 ? 1.0f : 1.0f - (f2 / (appBarLayout.getTotalScrollRange() / 4.0f)));
        }
        int height = getBinding().m.getHeight();
        int height2 = getBinding().h.getHeight();
        int top = getBinding().h.getTop() - getBinding().s.getBottom();
        int i3 = height2 / 2;
        int i4 = i3 + top;
        int i5 = (i3 * 3) + top;
        float totalScrollRange = (appBarLayout.getTotalScrollRange() / 6.0f) + i4;
        eoa binding = getBinding();
        if (i2 >= i4) {
            this.C = true;
            int i6 = this.v;
            if (i2 >= i4) {
                float totalScrollRange2 = (i2 - i4) / appBarLayout.getTotalScrollRange();
                float f3 = 1.0f - (totalScrollRange2 * 6.0f);
                for (View view3 : getFirstPlayerViewSet()) {
                    view3.setTranslationX(((height - height2) + top) * totalScrollRange2 * i6 * (-1.0f));
                    view3.setAlpha(f3);
                    f2 = f2;
                }
                f = f2;
                if (this.B && (resultView3 = getResultView()) != null && (view2 = (View) i5h.i(new tsk(resultView3))) != null) {
                    view2.setTranslationX(((height - height2) + top) * totalScrollRange2 * i6);
                    view2.setAlpha(f3);
                }
            } else {
                f = f2;
                Iterator<T> it = getFirstPlayerViewSet().iterator();
                while (it.hasNext()) {
                    q((View) it.next());
                }
                binding.l.setVisibility(8);
                binding.l.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (this.B) {
                    ViewGroup resultView4 = getResultView();
                    q(resultView4 != null ? (View) i5h.i(new tsk(resultView4)) : null);
                } else {
                    q(getResultView());
                }
            }
            if (!this.B) {
                if (f >= totalScrollRange) {
                    float totalScrollRange3 = (f - totalScrollRange) / appBarLayout.getTotalScrollRange();
                    ViewGroup resultView5 = getResultView();
                    if (resultView5 != null) {
                        resultView5.setTranslationX(((height - height2) + top) * totalScrollRange3 * i6);
                    }
                    ViewGroup resultView6 = getResultView();
                    if (resultView6 != null) {
                        resultView6.setAlpha(1.0f - (totalScrollRange3 * 5.0f));
                    }
                } else {
                    q(getResultView());
                }
            }
            if (i2 < i5) {
                Iterator<T> it2 = getSecondPlayerViewSet().iterator();
                while (it2.hasNext()) {
                    q((View) it2.next());
                }
                if (this.B) {
                    ViewGroup resultView7 = getResultView();
                    q(resultView7 != null ? (View) i5h.m(new tsk(resultView7)) : null);
                    return;
                }
                return;
            }
            float totalScrollRange4 = (i2 - i5) / appBarLayout.getTotalScrollRange();
            float f4 = 1.0f - (totalScrollRange4 * 6.0f);
            for (View view4 : getSecondPlayerViewSet()) {
                view4.setTranslationX(((height - height2) + top) * totalScrollRange4 * i6 * (-1.0f));
                view4.setAlpha(f4);
            }
            if (this.B && (resultView2 = getResultView()) != null && (view = (View) i5h.m(new tsk(resultView2))) != null) {
                view.setTranslationX(((height - height2) + top) * totalScrollRange4 * i6);
                view.setAlpha(f4);
            }
            if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                TeamLogoView teamLogoView = binding.h;
                LinearLayout linearLayout = binding.l;
                teamLogoView.setEnabled(true);
                binding.o.setEnabled(true);
                linearLayout.setVisibility(8);
                linearLayout.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (this.B) {
                    LinearLayout linearLayout2 = getBinding().e;
                    linearLayout2.setVisibility(8);
                    linearLayout2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                }
                ViewGroup resultView8 = getResultView();
                int i7 = (resultView8 == null || (r1 = resultView8.getLayoutParams()) == null) ? -1 : -1;
                ViewGroup resultView9 = getResultView();
                if (resultView9 != null) {
                    ViewGroup.LayoutParams layoutParams2 = resultView9.getLayoutParams();
                    if (layoutParams2 == null) {
                        yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        return;
                    } else {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                        layoutParams3.height = i7;
                        resultView9.setLayoutParams(layoutParams3);
                    }
                }
                ViewGroup resultView10 = getResultView();
                if (resultView10 != null) {
                    resultView10.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    resultView10.setScaleX(1.0f);
                    resultView10.setScaleY(1.0f);
                    return;
                }
                return;
            }
            binding.h.setEnabled(false);
            binding.o.setEnabled(false);
            int i8 = this.G;
            if (i8 < 0 || i8 > i * (-1)) {
                i8 = i * (-1);
                this.G = i8;
            }
            float totalScrollRange5 = (i2 - i8) / (appBarLayout.getTotalScrollRange() - this.G);
            Float valueOf = Float.isNaN(totalScrollRange5) ? null : Float.valueOf(totalScrollRange5);
            float floatValue = valueOf != null ? valueOf.floatValue() : i2 == appBarLayout.getTotalScrollRange() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f5 = this.q;
            float f6 = i6;
            float f7 = f5 * floatValue * f6;
            ViewGroup resultView11 = getResultView();
            int height3 = resultView11 != null ? resultView11.getHeight() : 0;
            LinearLayout linearLayout3 = binding.l;
            linearLayout3.setVisibility(0);
            float f8 = -i;
            linearLayout3.setTranslationY(f8);
            linearLayout3.setAlpha(floatValue);
            linearLayout3.setTranslationX(f7);
            if (this.B) {
                LinearLayout linearLayout4 = binding.e;
                linearLayout4.setVisibility(0);
                linearLayout4.setTranslationX((1.0f - floatValue) * f5 * f6);
                linearLayout4.setAlpha(floatValue);
                linearLayout4.setTranslationY(f8);
                return;
            }
            ViewGroup resultView12 = getResultView();
            if ((resultView12 == null || (layoutParams = resultView12.getLayoutParams()) == null || layoutParams.height != -2) && (resultView = getResultView()) != null) {
                ViewGroup.LayoutParams layoutParams4 = resultView.getLayoutParams();
                if (layoutParams4 == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                } else {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                    layoutParams5.height = -2;
                    resultView.setLayoutParams(layoutParams5);
                }
            }
            ViewGroup resultView13 = getResultView();
            if (resultView13 != null) {
                resultView13.setTranslationX((1.0f - floatValue) * f5 * f6);
                resultView13.setAlpha(floatValue);
                resultView13.setTranslationY((f8 - height) + this.t + height3 + (height3 / 2));
                resultView13.setScaleX(0.8f);
                resultView13.setScaleY(0.8f);
                return;
            }
            return;
        }
        if (!this.C) {
            return;
        }
        this.C = false;
        TeamLogoView teamLogoView2 = binding.h;
        LinearLayout linearLayout5 = binding.e;
        LinearLayout linearLayout6 = binding.l;
        teamLogoView2.setEnabled(true);
        binding.o.setEnabled(true);
        Iterator<T> it3 = getFirstPlayerViewSet().iterator();
        while (it3.hasNext()) {
            q((View) it3.next());
        }
        Iterator<T> it4 = getSecondPlayerViewSet().iterator();
        while (it4.hasNext()) {
            q((View) it4.next());
        }
        linearLayout6.setVisibility(8);
        linearLayout6.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        linearLayout5.setVisibility(8);
        linearLayout5.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (!this.B) {
            ViewGroup resultView14 = getResultView();
            int i9 = (resultView14 == null || (r1 = resultView14.getLayoutParams()) == null) ? -1 : -1;
            ViewGroup resultView15 = getResultView();
            if (resultView15 != null) {
                ViewGroup.LayoutParams layoutParams6 = resultView15.getLayoutParams();
                if (layoutParams6 == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                } else {
                    FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
                    layoutParams7.height = i9;
                    resultView15.setLayoutParams(layoutParams7);
                }
            }
            q(getResultView());
            return;
        }
        ViewGroup resultView16 = getResultView();
        if (resultView16 == null) {
            return;
        }
        Iterator it5 = new tsk(resultView16).iterator();
        while (true) {
            usk uskVar = (usk) it5;
            if (!uskVar.hasNext()) {
                return;
            } else {
                q((View) uskVar.next());
            }
        }
    }

    @Override // defpackage.s21
    public final Pair b() {
        krk j = j(i5j.b, R.layout.view_event_tennis_header_prematch, r21.f);
        j.getClass();
        psk pskVar = (psk) j;
        return new Pair(pskVar.b, pskVar.c);
    }

    @Override // defpackage.s21
    @NotNull
    public FollowActionButton getFollowButtonFirstTeam() {
        return this.z;
    }

    @Override // defpackage.s21
    @NotNull
    public FollowActionButton getFollowButtonSecondTeam() {
        return this.A;
    }

    @Override // defpackage.s21
    @NotNull
    public Set<String> getStoppedStatuses() {
        return this.j;
    }

    public final TextView h(String str, boolean z) {
        TextView m = m(str, Boolean.FALSE, false, z);
        ViewGroup.LayoutParams layoutParams = m.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(this.q);
        m.setLayoutParams(marginLayoutParams);
        haa.H(m);
        return m;
    }

    public final TextView i(String str, boolean z, boolean z2, boolean z3) {
        Typeface typeface;
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(z3 ? R.style.DisplayMicro : R.style.DisplayLarge);
        Context context = textView.getContext();
        context.getClass();
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        textView.setLetterSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i = this.q;
        marginLayoutParams.setMarginEnd(i);
        textView.setLayoutParams(marginLayoutParams);
        textView.setMinWidth(i);
        textView.setTextAlignment(4);
        if (z) {
            haa.E(textView);
        } else {
            haa.F(textView);
        }
        if (z2) {
            str = z ? "W" : "L";
        }
        textView.setText(str);
        return textView;
    }

    public final krk j(Function1 function1, int i, r21 r21Var) {
        if (getViewStatus() != r21Var) {
            getBinding().d.removeAllViews();
            setViewStatus(r21Var);
            setResultView(null);
            setLayoutChanged(true);
        }
        ViewGroup resultView = getResultView();
        if (resultView == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) getBinding().d, false);
            inflate.getClass();
            resultView = (ViewGroup) inflate;
        }
        if (getResultView() == null) {
            setResultView(resultView);
            getBinding().d.addView(resultView);
        }
        return (krk) function1.invoke(resultView);
    }

    public final View k(boolean z) {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.l, z ? this.o : this.s);
        layoutParams.gravity = 16;
        view.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginStart(getDpToPx8());
        marginLayoutParams.setMarginEnd(getDpToPx8());
        view.setLayoutParams(marginLayoutParams);
        view.setBackgroundColor(view.getContext().getColor(R.color.on_color_secondary));
        return view;
    }

    public final ImageView l(boolean z, boolean z2) {
        int i = z2 ? this.o : this.r;
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ball_tennis));
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginEnd(getDpToPx8());
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setVisibility(z ? 4 : 0);
        return imageView;
    }

    public final TextView m(String str, Boolean bool, boolean z, boolean z2) {
        Typeface typeface;
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(z2 ? R.style.DisplayMicro : R.style.DisplaySmall);
        Context context = textView.getContext();
        context.getClass();
        try {
            typeface = z1g.a(R.font.sofascore_sans_bold, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        textView.setLetterSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        int i = this.q;
        textView.setMinWidth(i);
        if (z2) {
            i = this.p;
        }
        textView.setMinHeight(i);
        textView.setTextAlignment(4);
        if (z) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMarginStart(this.m);
            textView.setLayoutParams(marginLayoutParams);
            textView.setIncludeFontPadding(false);
            textView.setBackgroundColor(textView.getContext().getColor(R.color.live));
            haa.E(textView);
        } else if (Intrinsics.c(bool, Boolean.TRUE)) {
            haa.E(textView);
        } else {
            haa.F(textView);
        }
        textView.setText(str);
        return textView;
    }

    public final void o(Event event, boolean z, boolean z2) {
        boolean isDoublesMatch = event.isDoublesMatch();
        eoa binding = getBinding();
        if (z) {
            haa.E(binding.i);
            haa.E(binding.j);
            haa.F(binding.p);
            haa.F(binding.q);
            if (isDoublesMatch) {
                haa.E(binding.k);
                haa.F(binding.r);
                return;
            }
            return;
        }
        if (z2) {
            haa.F(binding.i);
            haa.F(binding.j);
            haa.E(binding.p);
            haa.E(binding.q);
            if (isDoublesMatch) {
                haa.F(binding.k);
                haa.E(binding.r);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.f(this);
        }
    }

    public final void p(ViewGroup viewGroup, Event event, boolean z, boolean z2) {
        Typeface typeface;
        if (event.getStatus().getCode() == 91) {
            String string = viewGroup.getContext().getString(R.string.walkover);
            string.getClass();
            TextView textView = new TextView(getContext());
            textView.setTextAppearance(R.style.BodyMedium);
            Context context = textView.getContext();
            context.getClass();
            try {
                typeface = z1g.a(R.font.sofascore_sans_regular, context);
            } catch (Exception unused) {
                typeface = Typeface.DEFAULT;
            }
            textView.setTypeface(typeface);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            textView.setLayoutParams(layoutParams);
            textView.setTextAlignment(4);
            textView.setText(string);
            haa.E(textView);
            textView.setVisibility(z ? 0 : 4);
            viewGroup.addView(textView);
        }
        viewGroup.addView(k(z2));
        viewGroup.addView(i(null, z, true, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v26 */
    @Override // defpackage.s21
    public void setEvent(@NotNull Event event) {
        Drawable drawable;
        int i;
        Object obj;
        Object obj2;
        String str;
        String str2;
        ?? r14;
        String str3;
        boolean z;
        String valueOf;
        String i2;
        boolean z2;
        event.getClass();
        TennisEvent tennisEvent = (TennisEvent) event;
        c(event, null);
        TeamLogoView.g(this.x, Event.getHomeTeam$default(tennisEvent, null, 1, null), Event.getHomeTeamSeed$default(tennisEvent, null, 1, null), 12);
        TeamLogoView.g(this.y, Event.getAwayTeam$default(tennisEvent, null, 1, null), Event.getAwayTeamSeed$default(tennisEvent, null, 1, null), 12);
        eoa binding = getBinding();
        if (tennisEvent.isDoublesMatch()) {
            SubTeam subTeam1 = Event.getHomeTeam$default(tennisEvent, null, 1, null).getSubTeam1();
            Context context = getContext();
            context.getClass();
            String D = tba.D(subTeam1, context);
            SubTeam subTeam2 = Event.getHomeTeam$default(tennisEvent, null, 1, null).getSubTeam2();
            Context context2 = getContext();
            context2.getClass();
            String D2 = tba.D(subTeam2, context2);
            binding.i.setText(D);
            TextView textView = binding.k;
            textView.setText(D2);
            haa.E(textView);
            binding.j.setText(D + " / " + D2);
            SubTeam subTeam12 = Event.getAwayTeam$default(tennisEvent, null, 1, null).getSubTeam1();
            Context context3 = getContext();
            context3.getClass();
            String D3 = tba.D(subTeam12, context3);
            SubTeam subTeam22 = Event.getAwayTeam$default(tennisEvent, null, 1, null).getSubTeam2();
            Context context4 = getContext();
            context4.getClass();
            String D4 = tba.D(subTeam22, context4);
            binding.p.setText(D3);
            TextView textView2 = binding.r;
            textView2.setText(D4);
            haa.E(textView2);
            binding.q.setText(D3 + " / " + D4);
        } else {
            Team homeTeam$default = Event.getHomeTeam$default(tennisEvent, null, 1, null);
            Context context5 = getContext();
            context5.getClass();
            String A = tba.A(context5, homeTeam$default);
            Team awayTeam$default = Event.getAwayTeam$default(tennisEvent, null, 1, null);
            Context context6 = getContext();
            context6.getClass();
            String K = qea.K(tba.A(context6, awayTeam$default), tennisEvent.shouldReverseTeams());
            Country country = Event.getHomeTeam$default(tennisEvent, null, 1, null).getCountry();
            String alpha2 = country != null ? country.getAlpha2() : null;
            Country country2 = Event.getAwayTeam$default(tennisEvent, null, 1, null).getCountry();
            String alpha22 = country2 != null ? country2.getAlpha2() : null;
            boolean z3 = (alpha2 != null) ^ (alpha22 != null);
            Drawable drawable2 = getContext().getDrawable(R.drawable.ic_flag_placeholder);
            if (!z3) {
                drawable2 = null;
            }
            binding.i.setText(A);
            TextView textView3 = binding.j;
            textView3.setText(A);
            boolean national = Event.getHomeTeam$default(tennisEvent, null, 1, null).getNational();
            int i3 = this.n;
            int i4 = this.u;
            if (national) {
                drawable = drawable2;
            } else {
                drawable = drawable2;
                if (alpha2 != null) {
                    obj2 = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
                } else {
                    obj2 = drawable;
                }
                ua5 ua5Var = ua5.a;
                t25.a(i4);
                haa.q(textView3, obj2, ua5Var, new t25(i4));
                textView3.setCompoundDrawablePadding(i3);
            }
            binding.p.setText(K);
            TextView textView4 = binding.q;
            textView4.setText(K);
            if (!Event.getAwayTeam$default(tennisEvent, null, 1, null).getNational()) {
                if (alpha22 != null) {
                    obj = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha22, "/flag");
                } else {
                    obj = drawable;
                }
                ua5 ua5Var2 = ua5.a;
                t25.a(i4);
                haa.q(textView4, obj, ua5Var2, new t25(i4));
                textView4.setCompoundDrawablePadding(i3);
            }
            Team homeTeam$default2 = Event.getHomeTeam$default(tennisEvent, null, 1, null);
            Context context7 = getContext();
            context7.getClass();
            String w = qea.w(context7, homeTeam$default2);
            TextView textView5 = binding.k;
            if (w != null) {
                textView5.setText(w);
                i = 8;
            } else {
                i = 8;
                textView5.setVisibility(8);
            }
            Team awayTeam$default2 = Event.getAwayTeam$default(tennisEvent, null, 1, null);
            Context context8 = getContext();
            context8.getClass();
            String w2 = qea.w(context8, awayTeam$default2);
            TextView textView6 = binding.r;
            if (w2 != null) {
                textView6.setText(w2);
            } else {
                textView6.setVisibility(i);
            }
        }
        g(getBinding().f, tennisEvent.getStartTimestamp(), ok3.C(event));
        String type = tennisEvent.getStatus().getType();
        if (getNotStartedStatuses().contains(type)) {
            this.B = false;
            f(tennisEvent.getStartTimestamp());
            return;
        }
        if (getStoppedStatuses().contains(type)) {
            this.B = false;
            e(event);
            return;
        }
        boolean c = Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS);
        ArrayList arrayList = this.k;
        if (c) {
            this.B = true;
            ArrayList arrayList2 = new ArrayList();
            Score homeScore$default = Event.getHomeScore$default(tennisEvent, null, 1, null);
            Score awayScore$default = Event.getAwayScore$default(tennisEvent, null, 1, null);
            boolean z4 = (Event.getHomeScore$default(tennisEvent, null, 1, null).getScoreByPeriodName(tennisEvent.getLastPeriod()) == null || Event.getAwayScore$default(tennisEvent, null, 1, null).getScoreByPeriodName(tennisEvent.getLastPeriod()) == null) ? false : true;
            qsk qskVar = (qsk) j(j5j.b, R.layout.view_event_tennis_header_result, r21.a);
            LinearLayout linearLayout = qskVar.b;
            LinearLayout linearLayout2 = qskVar.c;
            linearLayout.removeAllViews();
            getBinding().b.removeAllViews();
            linearLayout2.removeAllViews();
            getBinding().c.removeAllViews();
            Integer firstToServe$default = ServableEvent.getFirstToServe$default(tennisEvent, null, 1, null);
            if (firstToServe$default != null && firstToServe$default.intValue() == 1) {
                linearLayout.addView(l(false, false));
                getBinding().b.addView(l(false, true));
                linearLayout2.addView(l(true, false));
                getBinding().c.addView(l(true, true));
            } else {
                Integer firstToServe$default2 = ServableEvent.getFirstToServe$default(tennisEvent, null, 1, null);
                if (firstToServe$default2 != null && firstToServe$default2.intValue() == 2) {
                    linearLayout.addView(l(true, false));
                    getBinding().b.addView(l(true, true));
                    linearLayout2.addView(l(false, false));
                    getBinding().c.addView(l(false, true));
                }
            }
            if (z4) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    Integer scoreByPeriodName = homeScore$default.getScoreByPeriodName(str4);
                    if (scoreByPeriodName != null) {
                        int intValue = scoreByPeriodName.intValue();
                        Integer scoreByPeriodName2 = awayScore$default.getScoreByPeriodName(str4);
                        if (scoreByPeriodName2 != null) {
                            arrayList2.add(new Pair(Integer.valueOf(intValue), Integer.valueOf(scoreByPeriodName2.intValue())));
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    Pair pair = (Pair) next;
                    int intValue2 = ((Number) pair.a).intValue();
                    int intValue3 = ((Number) pair.b).intValue();
                    boolean z5 = arrayList.indexOf(tennisEvent.getLastPeriod()) == i5;
                    linearLayout.addView(n(this, String.valueOf(intValue2), Boolean.valueOf(intValue2 > intValue3), z5, 8));
                    Iterator it3 = it2;
                    getBinding().b.addView(m(String.valueOf(intValue2), Boolean.valueOf(intValue2 > intValue3), z5, true));
                    linearLayout2.addView(n(this, String.valueOf(intValue3), Boolean.valueOf(intValue3 > intValue2), z5, 8));
                    getBinding().c.addView(m(String.valueOf(intValue3), Boolean.valueOf(intValue3 > intValue2), z5, true));
                    it2 = it3;
                    i5 = i6;
                }
                z2 = true;
            } else {
                z2 = true;
                linearLayout.addView(n(this, "-", null, true, 8));
                getBinding().b.addView(m("-", null, true, true));
                linearLayout2.addView(n(this, "-", null, true, 8));
                getBinding().c.addView(m("-", null, true, true));
            }
            linearLayout.addView(k(false));
            getBinding().b.addView(k(z2));
            linearLayout2.addView(k(false));
            getBinding().c.addView(k(z2));
            String point = homeScore$default.getPoint();
            if (point == null) {
                point = "-";
            }
            linearLayout.addView(h(point, false));
            LinearLayout linearLayout3 = getBinding().b;
            String point2 = homeScore$default.getPoint();
            if (point2 == null) {
                point2 = "-";
            }
            linearLayout3.addView(h(point2, true));
            String point3 = awayScore$default.getPoint();
            if (point3 == null) {
                point3 = "-";
            }
            linearLayout2.addView(h(point3, false));
            LinearLayout linearLayout4 = getBinding().c;
            String point4 = awayScore$default.getPoint();
            linearLayout4.addView(h(point4 != null ? point4 : "-", true));
            return;
        }
        this.B = true;
        Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
        boolean z6 = winnerCode$default != null && winnerCode$default.intValue() == 1;
        Integer winnerCode$default2 = Event.getWinnerCode$default(event, null, 1, null);
        boolean z7 = winnerCode$default2 != null && winnerCode$default2.intValue() == 2;
        boolean t = me4.t(StatusKt.STATUS_INTERRUPTED, event);
        if (!z6 && !z7 && !t) {
            Pair b = b();
            TextView textView7 = (TextView) b.a;
            TextView textView8 = (TextView) b.b;
            if (ug5.u(event.getStartTimestamp())) {
                i2 = textView8.getContext().getString(R.string.today);
            } else if (ug5.w(event.getStartTimestamp())) {
                i2 = textView8.getContext().getString(R.string.yesterday);
            } else {
                textView8.setTextDirection(3);
                long startTimestamp = event.getStartTimestamp();
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                i2 = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
            }
            textView8.setText(i2);
            Context context9 = getContext();
            context9.getClass();
            textView7.setText(pd0.u(context9, event));
            return;
        }
        if (event.getStatus().getCode() == 91) {
            qsk qskVar2 = (qsk) j(k5j.b, R.layout.view_event_tennis_header_result, r21.a);
            LinearLayout linearLayout5 = qskVar2.b;
            LinearLayout linearLayout6 = qskVar2.c;
            linearLayout5.removeAllViews();
            getBinding().b.removeAllViews();
            linearLayout6.removeAllViews();
            getBinding().c.removeAllViews();
            p(qskVar2.b, event, z6, false);
            p(getBinding().b, event, z6, true);
            p(linearLayout6, event, z7, false);
            p(getBinding().c, event, z7, true);
            o(event, z6, z7);
            return;
        }
        int i7 = 1;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            String str5 = (String) it4.next();
            Integer scoreByPeriodName3 = Event.getHomeScore$default(event, null, i7, null).getScoreByPeriodName(str5);
            if (scoreByPeriodName3 != null) {
                int intValue4 = scoreByPeriodName3.intValue();
                Integer scoreByPeriodName4 = Event.getAwayScore$default(event, null, i7, null).getScoreByPeriodName(str5);
                if (scoreByPeriodName4 != null) {
                    arrayList3.add(new Pair(Integer.valueOf(intValue4), Integer.valueOf(scoreByPeriodName4.intValue())));
                }
            }
            i7 = 1;
        }
        qsk qskVar3 = (qsk) j(l5j.b, R.layout.view_event_tennis_header_result, r21.a);
        LinearLayout linearLayout7 = qskVar3.b;
        LinearLayout linearLayout8 = qskVar3.c;
        linearLayout7.removeAllViews();
        getBinding().b.removeAllViews();
        linearLayout8.removeAllViews();
        getBinding().c.removeAllViews();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Pair pair2 = (Pair) it5.next();
            int intValue5 = ((Number) pair2.a).intValue();
            int intValue6 = ((Number) pair2.b).intValue();
            linearLayout7.addView(n(this, String.valueOf(intValue5), Boolean.valueOf(intValue5 > intValue6), false, 12));
            getBinding().b.addView(m(String.valueOf(intValue5), Boolean.valueOf(intValue5 > intValue6), false, true));
            linearLayout8.addView(n(this, String.valueOf(intValue6), Boolean.valueOf(intValue6 > intValue5), false, 12));
            getBinding().c.addView(m(String.valueOf(intValue6), Boolean.valueOf(intValue6 > intValue5), false, true));
        }
        boolean e = afi.e(event.getStatus().getCode());
        linearLayout7.addView(k(false));
        getBinding().b.addView(k(true));
        linearLayout8.addView(k(false));
        getBinding().c.addView(k(true));
        String str6 = "L";
        if (t) {
            str = Event.getHomeScore$default(event, null, 1, null).getPoint();
        } else {
            Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            if (display == null || (str = String.valueOf(display.intValue())) == null) {
                str = z6 ? "W" : "L";
            }
        }
        linearLayout7.addView(i(str, z6, e, false));
        LinearLayout linearLayout9 = getBinding().b;
        if (t) {
            r14 = 1;
            str2 = Event.getHomeScore$default(event, null, 1, null).getPoint();
        } else {
            Integer display2 = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            if (display2 == null || (str2 = String.valueOf(display2.intValue())) == null) {
                str2 = z6 ? "W" : "L";
            }
            r14 = 1;
        }
        linearLayout9.addView(i(str2, z6, e, r14));
        if (t) {
            str3 = Event.getAwayScore$default(event, null, r14, null).getPoint();
        } else {
            Integer display3 = Event.getAwayScore$default(event, null, r14, null).getDisplay();
            if (display3 == null || (str3 = String.valueOf(display3.intValue())) == null) {
                str3 = z7 ? "W" : "L";
            }
        }
        linearLayout8.addView(i(str3, z7, e, false));
        LinearLayout linearLayout10 = getBinding().c;
        if (t) {
            z = true;
            str6 = Event.getAwayScore$default(event, null, 1, null).getPoint();
        } else {
            Integer display4 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
            if (display4 != null && (valueOf = String.valueOf(display4.intValue())) != null) {
                str6 = valueOf;
            } else if (z7) {
                str6 = "W";
            }
            z = true;
        }
        linearLayout10.addView(i(str6, z7, e, z));
        o(event, z6, z7);
    }

    @Override // defpackage.s21
    @NotNull
    public eoa getBinding() {
        return this.w;
    }
}
