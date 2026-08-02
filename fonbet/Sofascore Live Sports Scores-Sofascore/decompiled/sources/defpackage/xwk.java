package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.header.TeamLogoView;
import com.sofascore.results.view.header.volleyball.VolleyballEventResultView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xwk extends s21 implements ua0 {
    public int A;
    public final Set j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final j89 q;
    public final TeamLogoView r;
    public final TeamLogoView s;
    public final FollowActionButton t;
    public final FollowActionButton u;
    public boolean v;
    public boolean w;
    public final mqi x;
    public final mqi y;
    public final mqi z;

    public xwk(Context context) {
        super(context);
        this.j = ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_DELAYED});
        final int i = 1;
        this.k = ao2.s(1, context);
        final int i2 = 2;
        this.l = ao2.s(2, context);
        this.m = ao2.s(4, context);
        this.n = ao2.s(16, context);
        this.o = ao2.s(24, context);
        this.p = hkg.c0(context) ? -1 : 1;
        final int i3 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.header_volleyball_event, (ViewGroup) this, false);
        addView(inflate);
        int i4 = R.id.collapsed_result_view;
        VolleyballEventResultView volleyballEventResultView = (VolleyballEventResultView) nq8.B(R.id.collapsed_result_view, inflate);
        if (volleyballEventResultView != null) {
            i4 = R.id.container_set_details;
            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.container_set_details, inflate);
            if (frameLayout != null) {
                i4 = R.id.event_date;
                TextView textView = (TextView) nq8.B(R.id.event_date, inflate);
                if (textView != null) {
                    i4 = R.id.first_team_bell;
                    FollowActionButton followActionButton = (FollowActionButton) nq8.B(R.id.first_team_bell, inflate);
                    if (followActionButton != null) {
                        i4 = R.id.first_team_image;
                        TeamLogoView teamLogoView = (TeamLogoView) nq8.B(R.id.first_team_image, inflate);
                        if (teamLogoView != null) {
                            i4 = R.id.first_team_name;
                            TextView textView2 = (TextView) nq8.B(R.id.first_team_name, inflate);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                i4 = R.id.second_team_bell;
                                FollowActionButton followActionButton2 = (FollowActionButton) nq8.B(R.id.second_team_bell, inflate);
                                if (followActionButton2 != null) {
                                    i4 = R.id.second_team_image;
                                    TeamLogoView teamLogoView2 = (TeamLogoView) nq8.B(R.id.second_team_image, inflate);
                                    if (teamLogoView2 != null) {
                                        i4 = R.id.second_team_name;
                                        TextView textView3 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                        if (textView3 != null) {
                                            i4 = R.id.toolbar_barrier;
                                            Guideline guideline = (Guideline) nq8.B(R.id.toolbar_barrier, inflate);
                                            if (guideline != null) {
                                                this.q = new j89(constraintLayout, volleyballEventResultView, frameLayout, textView, followActionButton, teamLogoView, textView2, constraintLayout, followActionButton2, teamLogoView2, textView3, guideline);
                                                TeamLogoView teamLogoView3 = getBinding().f;
                                                this.r = teamLogoView3;
                                                TeamLogoView teamLogoView4 = getBinding().j;
                                                this.s = teamLogoView4;
                                                this.t = getBinding().e;
                                                this.u = getBinding().i;
                                                this.w = true;
                                                this.x = ypa.b(new Function0(this) { // from class: rwk
                                                    public final /* synthetic */ xwk b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i5 = i3;
                                                        xwk xwkVar = this.b;
                                                        switch (i5) {
                                                            case 0:
                                                                j89 binding = xwkVar.getBinding();
                                                                return ph0.a0(new View[]{binding.e, binding.f, binding.g});
                                                            case 1:
                                                                j89 binding2 = xwkVar.getBinding();
                                                                return ph0.a0(new View[]{binding2.i, binding2.j, binding2.k});
                                                            default:
                                                                ViewParent parent = xwkVar.getParent().getParent().getParent();
                                                                if (parent instanceof AppBarLayout) {
                                                                    return (AppBarLayout) parent;
                                                                }
                                                                return null;
                                                        }
                                                    }
                                                });
                                                this.y = ypa.b(new Function0(this) { // from class: rwk
                                                    public final /* synthetic */ xwk b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i5 = i;
                                                        xwk xwkVar = this.b;
                                                        switch (i5) {
                                                            case 0:
                                                                j89 binding = xwkVar.getBinding();
                                                                return ph0.a0(new View[]{binding.e, binding.f, binding.g});
                                                            case 1:
                                                                j89 binding2 = xwkVar.getBinding();
                                                                return ph0.a0(new View[]{binding2.i, binding2.j, binding2.k});
                                                            default:
                                                                ViewParent parent = xwkVar.getParent().getParent().getParent();
                                                                if (parent instanceof AppBarLayout) {
                                                                    return (AppBarLayout) parent;
                                                                }
                                                                return null;
                                                        }
                                                    }
                                                });
                                                aba.y(teamLogoView3, 0, 1);
                                                aba.y(teamLogoView4, 0, 1);
                                                this.z = ypa.b(new Function0(this) { // from class: rwk
                                                    public final /* synthetic */ xwk b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int i5 = i2;
                                                        xwk xwkVar = this.b;
                                                        switch (i5) {
                                                            case 0:
                                                                j89 binding = xwkVar.getBinding();
                                                                return ph0.a0(new View[]{binding.e, binding.f, binding.g});
                                                            case 1:
                                                                j89 binding2 = xwkVar.getBinding();
                                                                return ph0.a0(new View[]{binding2.i, binding2.j, binding2.k});
                                                            default:
                                                                ViewParent parent = xwkVar.getParent().getParent().getParent();
                                                                if (parent instanceof AppBarLayout) {
                                                                    return (AppBarLayout) parent;
                                                                }
                                                                return null;
                                                        }
                                                    }
                                                });
                                                this.A = -1;
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
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
        throw null;
    }

    private final AppBarLayout getAppBarLayout() {
        return (AppBarLayout) this.z.getValue();
    }

    private final Set<View> getFirstTeamViewSet() {
        return (Set) this.x.getValue();
    }

    private final Set<View> getSecondTeamViewSet() {
        return (Set) this.y.getValue();
    }

    public static /* synthetic */ TextView l(xwk xwkVar, String str, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 8) != 0) {
            z = false;
        }
        return xwkVar.k(str, bool, z2, z);
    }

    public static void n(View view) {
        if (view != null) {
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    private final void setupPrematchDetails(Event event) {
        f(event.getStartTimestamp());
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ff, code lost:
    
        if (r1.height == (-1)) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
    
        if (r1.height == (-1)) goto L44;
     */
    @Override // defpackage.ua0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AppBarLayout appBarLayout, int i) {
        float f;
        ViewGroup resultView;
        Object next;
        ViewGroup resultView2;
        View view;
        int i2 = -i;
        float f2 = i2;
        appBarLayout.getTotalScrollRange();
        TextView textView = getBinding().d;
        if (textView.getVisibility() == 0) {
            textView.setAlpha(appBarLayout.getTotalScrollRange() == 0 ? 1.0f : 1.0f - (f2 / (appBarLayout.getTotalScrollRange() / 4.0f)));
        }
        int height = getBinding().h.getHeight();
        int height2 = getBinding().f.getHeight();
        int top = getBinding().f.getTop() - getBinding().l.getBottom();
        int i3 = height2 / 2;
        int i4 = i3 + top;
        int i5 = (i3 * 3) + top;
        float totalScrollRange = (appBarLayout.getTotalScrollRange() / 6.0f) + i4;
        j89 binding = getBinding();
        if (i2 >= i4) {
            this.w = true;
            int i6 = this.p;
            if (i2 >= i4) {
                float totalScrollRange2 = (i2 - i4) / appBarLayout.getTotalScrollRange();
                float f3 = 1.0f - (totalScrollRange2 * 6.0f);
                for (View view2 : getFirstTeamViewSet()) {
                    view2.setTranslationX(((height - height2) + top) * totalScrollRange2 * i6 * (-1.0f));
                    view2.setAlpha(f3);
                    f2 = f2;
                }
                f = f2;
                if (this.v && (resultView2 = getResultView()) != null && (view = (View) i5h.j(new tsk(resultView2))) != null) {
                    view.setTranslationX(((height - height2) + top) * totalScrollRange2 * i6);
                    view.setAlpha(f3);
                }
            } else {
                f = f2;
                Iterator<T> it = getFirstTeamViewSet().iterator();
                while (it.hasNext()) {
                    n((View) it.next());
                }
                binding.b.setVisibility(8);
                binding.b.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (this.v) {
                    ViewGroup resultView3 = getResultView();
                    n(resultView3 != null ? (View) i5h.i(new tsk(resultView3)) : null);
                } else {
                    n(getResultView());
                }
            }
            if (!this.v) {
                if (f >= totalScrollRange) {
                    float totalScrollRange3 = (f - totalScrollRange) / appBarLayout.getTotalScrollRange();
                    ViewGroup resultView4 = getResultView();
                    if (resultView4 != null) {
                        resultView4.setTranslationX(((height - height2) + top) * totalScrollRange3 * i6);
                    }
                    ViewGroup resultView5 = getResultView();
                    if (resultView5 != null) {
                        resultView5.setAlpha(1.0f - (totalScrollRange3 * 5.0f));
                    }
                } else {
                    n(getResultView());
                }
            }
            if (i2 < i5) {
                Iterator<T> it2 = getSecondTeamViewSet().iterator();
                while (it2.hasNext()) {
                    n((View) it2.next());
                }
                if (this.v) {
                    ViewGroup resultView6 = getResultView();
                    n(resultView6 != null ? (View) i5h.m(new tsk(resultView6)) : null);
                    return;
                }
                return;
            }
            float totalScrollRange4 = (i2 - i5) / appBarLayout.getTotalScrollRange();
            float f4 = 1.0f - (totalScrollRange4 * 6.0f);
            for (View view3 : getSecondTeamViewSet()) {
                view3.setTranslationX(((height - height2) + top) * totalScrollRange4 * i6 * (-1.0f));
                view3.setAlpha(f4);
            }
            if (this.v && (resultView = getResultView()) != null) {
                usk uskVar = (usk) new tsk(resultView).iterator();
                if (uskVar.hasNext()) {
                    next = uskVar.next();
                    while (uskVar.hasNext()) {
                        next = uskVar.next();
                    }
                } else {
                    next = null;
                }
                View view4 = (View) next;
                if (view4 != null) {
                    view4.setTranslationX(((height - height2) + top) * totalScrollRange4 * i6);
                    view4.setAlpha(f4);
                }
            }
            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                binding.f.setEnabled(false);
                binding.j.setEnabled(false);
                int i7 = this.A;
                if (i7 < 0 || i7 > i * (-1)) {
                    i7 = i * (-1);
                    this.A = i7;
                }
                float totalScrollRange5 = (i2 - i7) / (appBarLayout.getTotalScrollRange() - this.A);
                Float valueOf = Float.isNaN(totalScrollRange5) ? null : Float.valueOf(totalScrollRange5);
                float floatValue = valueOf != null ? valueOf.floatValue() : i2 == appBarLayout.getTotalScrollRange() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                VolleyballEventResultView volleyballEventResultView = binding.b;
                volleyballEventResultView.setVisibility(0);
                volleyballEventResultView.setTranslationY(-i);
                volleyballEventResultView.setAlpha(floatValue);
                return;
            }
            TeamLogoView teamLogoView = binding.f;
            VolleyballEventResultView volleyballEventResultView2 = binding.b;
            teamLogoView.setEnabled(true);
            binding.j.setEnabled(true);
            volleyballEventResultView2.setVisibility(8);
            volleyballEventResultView2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (this.v) {
                return;
            }
            ViewGroup resultView7 = getResultView();
            int i8 = (resultView7 == null || (r1 = resultView7.getLayoutParams()) == null) ? -1 : -1;
            ViewGroup resultView8 = getResultView();
            if (resultView8 != null) {
                ViewGroup.LayoutParams layoutParams = resultView8.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                } else {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.height = i8;
                    resultView8.setLayoutParams(layoutParams2);
                }
            }
            ViewGroup resultView9 = getResultView();
            if (resultView9 != null) {
                resultView9.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                resultView9.setScaleX(1.0f);
                resultView9.setScaleY(1.0f);
                return;
            }
            return;
        }
        if (!this.w) {
            return;
        }
        this.w = false;
        TeamLogoView teamLogoView2 = binding.f;
        VolleyballEventResultView volleyballEventResultView3 = binding.b;
        teamLogoView2.setEnabled(true);
        binding.j.setEnabled(true);
        Iterator<T> it3 = getFirstTeamViewSet().iterator();
        while (it3.hasNext()) {
            n((View) it3.next());
        }
        Iterator<T> it4 = getSecondTeamViewSet().iterator();
        while (it4.hasNext()) {
            n((View) it4.next());
        }
        volleyballEventResultView3.setVisibility(8);
        volleyballEventResultView3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (!this.v) {
            ViewGroup resultView10 = getResultView();
            int i9 = (resultView10 == null || (r1 = resultView10.getLayoutParams()) == null) ? -1 : -1;
            ViewGroup resultView11 = getResultView();
            if (resultView11 != null) {
                ViewGroup.LayoutParams layoutParams3 = resultView11.getLayoutParams();
                if (layoutParams3 == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                } else {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.height = i9;
                    resultView11.setLayoutParams(layoutParams4);
                }
            }
            n(getResultView());
            return;
        }
        ViewGroup resultView12 = getResultView();
        if (resultView12 == null) {
            return;
        }
        Iterator it5 = new tsk(resultView12).iterator();
        while (true) {
            usk uskVar2 = (usk) it5;
            if (!uskVar2.hasNext()) {
                return;
            } else {
                n((View) uskVar2.next());
            }
        }
    }

    @Override // defpackage.s21
    public final Pair b() {
        krk i = i(twk.b, R.layout.view_event_tennis_header_prematch, r21.f);
        i.getClass();
        psk pskVar = (psk) i;
        return new Pair(pskVar.b, pskVar.c);
    }

    @Override // defpackage.s21
    @NotNull
    public FollowActionButton getFollowButtonFirstTeam() {
        return this.t;
    }

    @Override // defpackage.s21
    @NotNull
    public FollowActionButton getFollowButtonSecondTeam() {
        return this.u;
    }

    @Override // defpackage.s21
    @NotNull
    public Set<String> getStoppedStatuses() {
        return this.j;
    }

    public final TextView h(String str, boolean z, boolean z2, boolean z3) {
        Typeface typeface;
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(R.style.DisplayLarge);
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
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i = this.n;
        marginLayoutParams.setMarginEnd(z3 ? getDpToPx8() : i);
        textView.setLayoutParams(marginLayoutParams);
        if (z) {
            haa.E(textView);
        } else {
            haa.F(textView);
        }
        if (z2) {
            str = z ? "W" : "L";
        }
        textView.setText(str);
        if (z3) {
            Context context2 = textView.getContext();
            context2.getClass();
            Integer valueOf = Integer.valueOf(R.color.on_color_primary);
            Drawable drawable2 = context2.getDrawable(R.drawable.ic_aggregate_pointer);
            if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                drawable = null;
            } else {
                drawable.setTint(context2.getColor(valueOf.intValue()));
            }
            if (drawable != null) {
                Context context3 = textView.getContext();
                context3.getClass();
                boolean c0 = hkg.c0(context3);
                int i2 = this.l;
                int i3 = this.m;
                if (c0) {
                    drawable.setBounds(i2, -i3, getDpToPx8() + i2, i - i3);
                } else {
                    drawable.setBounds(-i2, -i3, getDpToPx8() - i2, i - i3);
                }
            } else {
                drawable = null;
            }
            haa.K(textView, drawable, ua5.b, null, null);
        }
        return textView;
    }

    public final krk i(Function1 function1, int i, r21 r21Var) {
        if (getViewStatus() != r21Var) {
            getBinding().c.removeAllViews();
            setViewStatus(r21Var);
            setResultView(null);
            setLayoutChanged(true);
        }
        ViewGroup resultView = getResultView();
        if (resultView == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) getBinding().c, false);
            inflate.getClass();
            resultView = (ViewGroup) inflate;
        }
        if (getResultView() == null) {
            setResultView(resultView);
            getBinding().c.addView(resultView);
        }
        return (krk) function1.invoke(resultView);
    }

    public final View j() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.k, this.o);
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

    public final TextView k(String str, Boolean bool, boolean z, boolean z2) {
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(R.style.DisplayMicro);
        Context context = textView.getContext();
        context.getClass();
        textView.setTypeface(hkg.Y(R.font.sofascore_sans_bold, context));
        textView.setLetterSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        Context context2 = textView.getContext();
        context2.getClass();
        textView.setMinWidth(ao2.s(22, context2));
        textView.setTextAlignment(4);
        int i = this.l;
        if (z2) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMarginStart(i);
            textView.setLayoutParams(marginLayoutParams);
            textView.setIncludeFontPadding(false);
            textView.setBackgroundColor(textView.getContext().getColor(R.color.stayDarkValue));
            textView.setTextColor(textView.getContext().getColor(R.color.graphics_dark));
        } else if (z) {
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams2.setMarginStart(i);
            textView.setLayoutParams(marginLayoutParams2);
            textView.setIncludeFontPadding(false);
            textView.setBackgroundColor(textView.getContext().getColor(R.color.stayDarkLive));
            haa.E(textView);
        } else if (Intrinsics.c(bool, Boolean.TRUE)) {
            haa.E(textView);
        } else {
            haa.F(textView);
        }
        textView.setText(str);
        return textView;
    }

    public final void m(ViewGroup viewGroup, Event event, boolean z) {
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
        viewGroup.addView(j());
        viewGroup.addView(h(null, z, true, false));
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

    /* JADX WARN: Removed duplicated region for block: B:141:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0376  */
    @Override // defpackage.s21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setEvent(@NotNull Event event) {
        String str;
        String valueOf;
        boolean z;
        boolean z2;
        String str2;
        String valueOf2;
        String i;
        event.getClass();
        getBinding().b.m(event, true);
        c(event, null);
        TeamLogoView.g(this.r, Event.getHomeTeam$default(event, null, 1, null), Event.getHomeTeamSeed$default(event, null, 1, null), 12);
        TeamLogoView.g(this.s, Event.getAwayTeam$default(event, null, 1, null), Event.getAwayTeamSeed$default(event, null, 1, null), 12);
        j89 binding = getBinding();
        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
        Context context = getContext();
        context.getClass();
        String A = tba.A(context, homeTeam$default);
        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
        Context context2 = getContext();
        context2.getClass();
        String K = qea.K(tba.A(context2, awayTeam$default), event.shouldReverseTeams());
        binding.g.setText(A);
        binding.k.setText(K);
        g(getBinding().d, event.getStartTimestamp(), ok3.C(event));
        String type = event.getStatus().getType();
        if (getNotStartedStatuses().contains(type)) {
            this.v = false;
            setupPrematchDetails(event);
            return;
        }
        if (getStoppedStatuses().contains(type)) {
            this.v = false;
            e(event);
            return;
        }
        if (Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS) || Intrinsics.c(type, StatusKt.STATUS_WILL_CONTINUE)) {
            this.v = true;
            Score homeScore$default = Event.getHomeScore$default(event, null, 1, null);
            Score awayScore$default = Event.getAwayScore$default(event, null, 1, null);
            Score homeScore$default2 = Event.getHomeScore$default(event, null, 1, null);
            List<String> list = ywk.a;
            boolean z3 = (homeScore$default2.getScoreByPeriodName((String) list.get(0)) == null || Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName((String) list.get(0)) == null) ? false : true;
            qsk qskVar = (qsk) i(uwk.b, R.layout.view_event_tennis_header_result, r21.e);
            LinearLayout linearLayout = qskVar.b;
            LinearLayout linearLayout2 = qskVar.c;
            linearLayout.removeAllViews();
            linearLayout2.removeAllViews();
            String str3 = "-";
            if (z3) {
                ArrayList arrayList = new ArrayList();
                for (String str4 : list) {
                    Integer scoreByPeriodName = homeScore$default.getScoreByPeriodName(str4);
                    Integer scoreByPeriodName2 = awayScore$default.getScoreByPeriodName(str4);
                    swk swkVar = (scoreByPeriodName == null || scoreByPeriodName2 == null) ? null : new swk(str4, scoreByPeriodName.intValue(), scoreByPeriodName2.intValue());
                    if (swkVar != null) {
                        arrayList.add(swkVar);
                    }
                }
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        b.q();
                        throw null;
                    }
                    swk swkVar2 = (swk) next;
                    if (Intrinsics.c(swkVar2.a, event.getLastPeriod())) {
                        z = true;
                    } else {
                        z = true;
                        if (i2 != arrayList.size() - 1) {
                            z2 = false;
                            List list2 = ywk.a;
                            boolean a = ywk.a(swkVar2.a);
                            int i4 = swkVar2.b;
                            int i5 = swkVar2.c;
                            linearLayout.addView(k(String.valueOf(i4), Boolean.valueOf(i4 <= i5 ? z : false), z2, a));
                            linearLayout2.addView(k(String.valueOf(i5), Boolean.valueOf(i5 <= i4 ? z : false), z2, a));
                            i2 = i3;
                        }
                    }
                    z2 = z;
                    List list22 = ywk.a;
                    boolean a2 = ywk.a(swkVar2.a);
                    int i42 = swkVar2.b;
                    int i52 = swkVar2.c;
                    linearLayout.addView(k(String.valueOf(i42), Boolean.valueOf(i42 <= i52 ? z : false), z2, a2));
                    linearLayout2.addView(k(String.valueOf(i52), Boolean.valueOf(i52 <= i42 ? z : false), z2, a2));
                    i2 = i3;
                }
            } else {
                linearLayout.addView(l(this, "-", null, false, 8));
                linearLayout2.addView(l(this, "-", null, false, 8));
            }
            linearLayout.addView(j());
            linearLayout2.addView(j());
            Integer display = homeScore$default.getDisplay();
            if (display == null || (str = String.valueOf(display.intValue())) == null) {
                str = "-";
            }
            TextView h = h(str, false, false, false);
            h.setTextColor(h.getContext().getColor(R.color.stayDarkLive));
            linearLayout.addView(h);
            Integer display2 = awayScore$default.getDisplay();
            if (display2 != null && (valueOf = String.valueOf(display2.intValue())) != null) {
                str3 = valueOf;
            }
            TextView h2 = h(str3, false, false, false);
            h2.setTextColor(h2.getContext().getColor(R.color.stayDarkLive));
            linearLayout2.addView(h2);
            return;
        }
        this.v = true;
        Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
        boolean z4 = winnerCode$default != null && winnerCode$default.intValue() == 1;
        Integer winnerCode$default2 = Event.getWinnerCode$default(event, null, 1, null);
        boolean z5 = winnerCode$default2 != null && winnerCode$default2.intValue() == 2;
        Integer aggregatedWinnerCode$default = Event.getAggregatedWinnerCode$default(event, null, 1, null);
        boolean z6 = aggregatedWinnerCode$default != null && aggregatedWinnerCode$default.intValue() == 1;
        Integer aggregatedWinnerCode$default2 = Event.getAggregatedWinnerCode$default(event, null, 1, null);
        boolean z7 = aggregatedWinnerCode$default2 != null && aggregatedWinnerCode$default2.intValue() == 2;
        boolean t = me4.t(StatusKt.STATUS_INTERRUPTED, event);
        if (!z4 && !z5 && !t) {
            Pair b = b();
            TextView textView = (TextView) b.a;
            TextView textView2 = (TextView) b.b;
            if (ug5.u(event.getStartTimestamp())) {
                i = textView2.getContext().getString(R.string.today);
            } else if (ug5.w(event.getStartTimestamp())) {
                i = textView2.getContext().getString(R.string.yesterday);
            } else {
                textView2.setTextDirection(3);
                long startTimestamp = event.getStartTimestamp();
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                i = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
            }
            textView2.setText(i);
            Context context3 = getContext();
            context3.getClass();
            textView.setText(pd0.u(context3, event));
            return;
        }
        if (event.getStatus().getCode() == 91) {
            qsk qskVar2 = (qsk) i(vwk.b, R.layout.view_event_tennis_header_result, r21.e);
            LinearLayout linearLayout3 = qskVar2.b;
            LinearLayout linearLayout4 = qskVar2.c;
            linearLayout3.removeAllViews();
            linearLayout4.removeAllViews();
            m(qskVar2.b, event, z4);
            m(linearLayout4, event, z5);
            return;
        }
        Score homeScore$default3 = Event.getHomeScore$default(event, null, 1, null);
        Score awayScore$default2 = Event.getAwayScore$default(event, null, 1, null);
        List<String> list3 = ywk.a;
        ArrayList arrayList2 = new ArrayList();
        for (String str5 : list3) {
            Integer scoreByPeriodName3 = homeScore$default3.getScoreByPeriodName(str5);
            Integer scoreByPeriodName4 = awayScore$default2.getScoreByPeriodName(str5);
            swk swkVar3 = (scoreByPeriodName3 == null || scoreByPeriodName4 == null) ? null : new swk(str5, scoreByPeriodName3.intValue(), scoreByPeriodName4.intValue());
            if (swkVar3 != null) {
                arrayList2.add(swkVar3);
            }
        }
        qsk qskVar3 = (qsk) i(wwk.b, R.layout.view_event_tennis_header_result, r21.e);
        LinearLayout linearLayout5 = qskVar3.b;
        LinearLayout linearLayout6 = qskVar3.c;
        linearLayout5.removeAllViews();
        linearLayout6.removeAllViews();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            swk swkVar4 = (swk) it2.next();
            int i6 = swkVar4.b;
            String str6 = swkVar4.a;
            int i7 = swkVar4.c;
            Iterator it3 = it2;
            linearLayout5.addView(l(this, String.valueOf(i6), Boolean.valueOf(i6 > i7), ywk.a(str6), 4));
            linearLayout6.addView(l(this, String.valueOf(i7), Boolean.valueOf(i7 > i6), ywk.a(str6), 4));
            it2 = it3;
        }
        boolean e = afi.e(event.getStatus().getCode());
        linearLayout5.addView(j());
        linearLayout6.addView(j());
        String str7 = "L";
        if (t) {
            str2 = Event.getHomeScore$default(event, null, 1, null).getPoint();
        } else {
            Integer display3 = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            if (display3 == null || (str2 = String.valueOf(display3.intValue())) == null) {
                str2 = z4 ? "W" : "L";
            }
        }
        linearLayout5.addView(h(str2, z4, e, z6));
        if (t) {
            str7 = Event.getAwayScore$default(event, null, 1, null).getPoint();
        } else {
            Integer display4 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
            if (display4 != null && (valueOf2 = String.valueOf(display4.intValue())) != null) {
                str7 = valueOf2;
            } else if (z5) {
                str7 = "W";
            }
        }
        linearLayout6.addView(h(str7, z5, e, z7));
    }

    @Override // defpackage.s21
    @NotNull
    public j89 getBinding() {
        return this.q;
    }
}
