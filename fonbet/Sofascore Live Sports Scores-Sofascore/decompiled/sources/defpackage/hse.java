package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.PlayerHistoricalRating;
import com.sofascore.results.R;
import com.sofascore.results.dialog.SofascoreRatingBottomSheetDialog;
import com.sofascore.results.view.InformationView;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hse extends o8 {
    public static final /* synthetic */ int k = 0;
    public final boolean d;
    public final mqi e;
    public ValueAnimator f;
    public AnimatorSet g;
    public boolean h;
    public int i;
    public syg j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hse(Context context, boolean z) {
        super(context, null, 0);
        context.getClass();
        final int i = 0;
        this.d = z;
        this.e = ypa.b(new xxb(this, 29));
        FrameLayout frameLayout = getBinding().a;
        frameLayout.getClass();
        frameLayout.setVisibility(8);
        if (z) {
            View view = getBinding().e;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                throw null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int s = ao2.s(8, context);
            marginLayoutParams.setMargins(s, s, s, s);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        o8.d(this, 0, 7);
        final int i2 = 1;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new b2(this, 9));
        } else {
            g6b t = qea.t(this);
            if (t != null) {
                if (t.b().compareTo(e6b.e) >= 0) {
                    l();
                    AnimatorSet animatorSet = this.g;
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    ValueAnimator valueAnimator = this.f;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                    this.h = true;
                } else {
                    t.a(new gse(t, this, this, 0));
                }
            }
        }
        getBinding().c.setOnClickListener(new View.OnClickListener(this) { // from class: fse
            public final /* synthetic */ hse b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                hse hseVar = this.b;
                switch (i3) {
                    case 0:
                        hseVar.q(true);
                        break;
                    default:
                        hseVar.q(false);
                        break;
                }
            }
        });
        getBinding().d.setOnClickListener(new View.OnClickListener(this) { // from class: fse
            public final /* synthetic */ hse b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                hse hseVar = this.b;
                switch (i3) {
                    case 0:
                        hseVar.q(true);
                        break;
                    default:
                        hseVar.q(false);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ise getBinding() {
        return (ise) this.e.getValue();
    }

    private final int getFirstVisibleRatingIndexMax() {
        int size;
        if (this.j == null || r1.b.size() - 5 < 0) {
            return 0;
        }
        return size;
    }

    private final boolean getShowPagingButtons() {
        List list;
        syg sygVar = this.j;
        return yid.m((sygVar == null || (list = sygVar.b) == null) ? null : Integer.valueOf(list.size())) > 5;
    }

    public static final void n(hse hseVar, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        View view = hseVar.getBinding().b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        ((ViewGroup.MarginLayoutParams) tl3Var).width = ((Integer) animatedValue).intValue();
        view.setLayoutParams(tl3Var);
    }

    public static float p(double d, float f, float f2) {
        if (d < 10.0d) {
            f = me4.b(f2, f, 1.0f - ((((float) d) - 5.0f) / 5.0f), f);
        }
        return Float.min(f, f2);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_last_ratings_view;
    }

    public final boolean getShowAsMediaPost() {
        return this.d;
    }

    public final void l() {
        if (getBinding().b.getVisibility() == 0) {
            int width = getBinding().e.getWidth();
            Context context = getContext();
            context.getClass();
            ValueAnimator ofInt = ValueAnimator.ofInt(1, width - ao2.s(56, context));
            ofInt.setDuration(840L);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.addUpdateListener(new s2(this, 14));
            ofInt.addListener(new j6(this, 4));
            this.f = ofInt;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
    
        r19 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList o(syg sygVar, boolean z) {
        View view;
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = new tsk(getBinding().f).iterator();
        boolean z3 = false;
        int i3 = 0;
        long j = 0;
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                if (getShowPagingButtons()) {
                    getBinding().d.setEnabled(this.i > 0 ? true : z3 ? 1 : 0);
                    ImageView imageView = getBinding().c;
                    if (this.i < getFirstVisibleRatingIndexMax()) {
                        z3 = true;
                    }
                    imageView.setEnabled(z3);
                }
                return arrayList2;
            }
            Object next = uskVar.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            view = (View) next;
            PlayerHistoricalRating playerHistoricalRating = (PlayerHistoricalRating) CollectionsKt.a0(this.i + i3, sygVar.b);
            if (playerHistoricalRating != null) {
                view.setVisibility(z3 ? 1 : 0);
                i = R.id.opponent_logo;
                ImageView imageView2 = (ImageView) nq8.B(R.id.opponent_logo, view);
                if (imageView2 == null) {
                    break;
                }
                i = R.id.opponent_logo_container;
                if (((FrameLayout) nq8.B(R.id.opponent_logo_container, view)) == null) {
                    break;
                }
                SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.rating, view);
                if (sofascoreSmallRatingView == null) {
                    arrayList = null;
                    i = R.id.rating;
                    break;
                }
                TextView textView = (TextView) nq8.B(R.id.rating_item_date, view);
                if (textView == null) {
                    arrayList = null;
                    i = R.id.rating_item_date;
                    break;
                }
                LinearLayout linearLayout = (LinearLayout) view;
                long startTimestamp = playerHistoricalRating.getStartTimestamp();
                bi4 bi4Var = bi4.PATTERN_DMM;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(startTimestamp));
                format.getClass();
                textView.setText(format);
                as9.o(imageView2, playerHistoricalRating.getOpponent().getId());
                boolean z4 = this.d;
                if (z4) {
                    SofascoreSmallRatingView.k(sofascoreSmallRatingView, playerHistoricalRating.getRating(), 6);
                    linearLayout.setBackground(null);
                    i2 = i4;
                    z2 = z4;
                } else {
                    Double rating = playerHistoricalRating.getRating();
                    sofascoreSmallRatingView.setText((CharSequence) null);
                    sofascoreSmallRatingView.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    List i5 = sofascoreSmallRatingView.i(rating, true);
                    i2 = i4;
                    z2 = z4;
                    sofascoreSmallRatingView.i = 300L;
                    Iterator it2 = i5.iterator();
                    while (it2.hasNext()) {
                        ((Animator) it2.next()).setStartDelay(j);
                    }
                    AnimatorSet animatorSet = sofascoreSmallRatingView.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(i5);
                    AnimatorSet animatorSet3 = sofascoreSmallRatingView.v;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    sofascoreSmallRatingView.v = animatorSet2;
                    arrayList2.add(animatorSet2);
                }
                if (z) {
                    tgj.p(imageView2, 0L, 3);
                    tgj.p(textView, 0L, 3);
                }
                j += 140;
                z3 = false;
                z3 = false;
                aba.y(sofascoreSmallRatingView, 0, 3);
                ViewGroup.LayoutParams layoutParams = sofascoreSmallRatingView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    return null;
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                Double rating2 = playerHistoricalRating.getRating();
                float p = p(rating2 != null ? rating2.doubleValue() : 0.0d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64.0f);
                Context context = getContext();
                context.getClass();
                layoutParams2.topMargin = ao2.t(context, p);
                sofascoreSmallRatingView.setLayoutParams(layoutParams2);
                if (!z2) {
                    view.setOnClickListener(new qh(24, playerHistoricalRating, sygVar, this));
                }
            } else {
                view.setVisibility(8);
                i2 = i4;
            }
            i3 = i2;
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final void q(boolean z) {
        syg sygVar = this.j;
        if (sygVar != null) {
            int c = llf.c(this.i + (z ? 5 : -5), 0, getFirstVisibleRatingIndexMax());
            if (c != this.i) {
                this.i = c;
                ArrayList o = o(sygVar, true);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(o);
                animatorSet.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(final syg sygVar, cwe cweVar) {
        boolean z;
        SharedPreferences sharedPreferences;
        SharedPreferences d;
        this.j = sygVar;
        if (sygVar == null) {
            FrameLayout frameLayout = getBinding().a;
            frameLayout.getClass();
            frameLayout.setVisibility(8);
            return;
        }
        FrameLayout frameLayout2 = getBinding().a;
        frameLayout2.getClass();
        frameLayout2.setVisibility(0);
        Double d2 = sygVar.c;
        if (d2 != null) {
            final double doubleValue = d2.doubleValue();
            if (doubleValue > 0.0d) {
                String n = dti.n(doubleValue, 2);
                if (this.d) {
                    SofascoreRatingView sofascoreRatingView = getBinding().h.d;
                    sofascoreRatingView.setShouldAnimate(false);
                    sofascoreRatingView.m(doubleValue, false);
                } else {
                    getBinding().h.d.m(doubleValue, true);
                }
                View view = getBinding().b;
                Context context = getContext();
                context.getClass();
                view.setBackgroundColor(kpg.v(context, n));
                View view2 = getBinding().b;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var = (tl3) layoutParams;
                float p = p(doubleValue, 76.0f, 154.0f);
                Context context2 = getContext();
                context2.getClass();
                ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = ao2.t(context2, p);
                if (this.d) {
                    ((ViewGroup.MarginLayoutParams) tl3Var).width = -1;
                }
                view2.setLayoutParams(tl3Var);
                View view3 = getBinding().b;
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var2 = (tl3) layoutParams2;
                float p2 = p(doubleValue, 76.0f, 154.0f);
                Context context3 = getContext();
                context3.getClass();
                ((ViewGroup.MarginLayoutParams) tl3Var2).topMargin = ao2.t(context3, p2);
                view3.setLayoutParams(tl3Var2);
                z8e.a0(getBinding().h.c, 1000L, new Function0() { // from class: ese
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        syg sygVar2 = syg.this;
                        String sportSlug = sygVar2.a.getSportSlug();
                        if (sportSlug != null) {
                            Context context4 = this.getContext();
                            context4.getClass();
                            SofascoreRatingBottomSheetDialog e = v9f.e(gvh.d, Double.valueOf(doubleValue), Integer.valueOf(sygVar2.a.getId()), sportSlug, null, 16);
                            if (context4 instanceof csk) {
                                context4 = ((csk) context4).getBaseContext();
                            }
                            AppCompatActivity appCompatActivity = context4 instanceof AppCompatActivity ? (AppCompatActivity) context4 : null;
                            if (appCompatActivity != null) {
                                wca.x(appCompatActivity.getLifecycle()).b(new r1(e, appCompatActivity, null, 3));
                            }
                        }
                        return Unit.a;
                    }
                });
                z = true;
                InformationView informationView = getBinding().g;
                Context context4 = informationView.getContext();
                context4.getClass();
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context4.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                informationView.p((sharedPreferences.getBoolean("PREF_PLAYER_LAST_RATINGS_INFO", true) || this.d) ? false : true, false);
                InformationView.o(informationView, informationView.getContext().getString(R.string.rating_top_players_general));
                InformationView.l(informationView, new xxb(informationView, 28));
                informationView.j();
                if (this.d) {
                    getBinding().h.b.setVisibility(8);
                    getBinding().h.c.setText(getContext().getString(R.string.average_sofascore_rating));
                    getBinding().h.c.setVisibility(z ? 0 : 8);
                    getBinding().h.d.setVisibility(z ? 0 : 8);
                } else {
                    ConstraintLayout constraintLayout = getBinding().h.a;
                    constraintLayout.getClass();
                    constraintLayout.setVisibility(8);
                }
                getBinding().b.setVisibility(!z ? 0 : 8);
                getBinding().h.d.setVisibility(!z ? 0 : 8);
                getBinding().h.d.setOnClickListener(new s61(7, cweVar));
                getBinding().c.setVisibility(!getShowPagingButtons() ? 0 : 8);
                getBinding().d.setVisibility(getShowPagingButtons() ? 0 : 8);
                this.i = getFirstVisibleRatingIndexMax();
                ArrayList o = o(sygVar, false);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(o);
                this.g = animatorSet;
                if (this.h || this.d) {
                }
                animatorSet.start();
                ValueAnimator valueAnimator = this.f;
                if (valueAnimator != null) {
                    valueAnimator.start();
                    return;
                }
                return;
            }
        }
        z = false;
        InformationView informationView2 = getBinding().g;
        Context context42 = informationView2.getContext();
        context42.getClass();
        sharedPreferences = uic.j;
        if (sharedPreferences == null) {
        }
        informationView2.p((sharedPreferences.getBoolean("PREF_PLAYER_LAST_RATINGS_INFO", true) || this.d) ? false : true, false);
        InformationView.o(informationView2, informationView2.getContext().getString(R.string.rating_top_players_general));
        InformationView.l(informationView2, new xxb(informationView2, 28));
        informationView2.j();
        if (this.d) {
        }
        getBinding().b.setVisibility(!z ? 0 : 8);
        getBinding().h.d.setVisibility(!z ? 0 : 8);
        getBinding().h.d.setOnClickListener(new s61(7, cweVar));
        getBinding().c.setVisibility(!getShowPagingButtons() ? 0 : 8);
        getBinding().d.setVisibility(getShowPagingButtons() ? 0 : 8);
        this.i = getFirstVisibleRatingIndexMax();
        ArrayList o2 = o(sygVar, false);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(o2);
        this.g = animatorSet2;
        if (this.h) {
        }
    }
}
