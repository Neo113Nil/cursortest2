package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TvEvent;
import com.sofascore.model.newNetwork.TvStageEvent;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gai extends p8 {
    public final /* synthetic */ int c = 7;
    public final Object d;
    public final Object e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gai(jai jaiVar, e92 e92Var) {
        super(r0);
        this.e = jaiVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) e92Var.e;
        constraintLayout.getClass();
        this.d = e92Var;
        g5k g5kVar = new g5k((TypeHeaderView) e92Var.b);
        hrh hrhVar = hrh.m;
        hrhVar.getClass();
        g5kVar.e = hrhVar;
        g5kVar.a();
        g5kVar.d = new g2i(this, 9);
        g5kVar.m = new ur1(jaiVar, 21);
        g5kVar.g = new tc3(-570445327, new e6i(2, jaiVar, this), true);
        g5kVar.b();
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        Drawable drawable;
        String name;
        Category category;
        Category category2;
        Sport sport;
        int i3 = this.c;
        r6 = false;
        boolean z = false;
        Context context = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                tai taiVar = (tai) obj;
                taiVar.getClass();
                boolean z2 = taiVar.f;
                e92 e92Var = (e92) obj3;
                TypeHeaderView typeHeaderView = (TypeHeaderView) e92Var.b;
                LinearLayout linearLayout = (LinearLayout) e92Var.f;
                ConstraintLayout constraintLayout = (ConstraintLayout) e92Var.e;
                jai jaiVar = (jai) obj2;
                boolean z3 = jaiVar.o;
                typeHeaderView.setStyle((z3 && z2) ? frh.m : hrh.m);
                List list = taiVar.d;
                String str = taiVar.e;
                boolean z4 = taiVar.a;
                boolean z5 = taiVar.b;
                boolean z6 = taiVar.c;
                if (z4 || z5 || z6) {
                    TypeHeaderView.z(typeHeaderView, list, str, 4);
                    linearLayout.setVisibility(8);
                } else {
                    TypeHeaderView.z(typeHeaderView, km5.a, null, 6);
                    linearLayout.setVisibility(0);
                }
                if (z3 && z2) {
                    constraintLayout.setBackgroundColor(0);
                    haa.E((TextView) e92Var.c);
                    haa.E((TextView) e92Var.d);
                }
                if (!jaiVar.n || !z2) {
                    if (!z2) {
                        constraintLayout.getClass();
                        sea.v(constraintLayout, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                        typeHeaderView.u(true);
                        break;
                    } else {
                        typeHeaderView.u(true);
                        constraintLayout.getClass();
                        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                        if (layoutParams == null) {
                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            break;
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            int s = ao2.s(4, context);
                            marginLayoutParams.setMarginStart(0);
                            marginLayoutParams.topMargin = 0;
                            marginLayoutParams.setMarginEnd(0);
                            marginLayoutParams.bottomMargin = s;
                            constraintLayout.setLayoutParams(marginLayoutParams);
                            break;
                        }
                    }
                } else {
                    typeHeaderView.u(false);
                    constraintLayout.getClass();
                    sea.v(constraintLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    break;
                }
            case 1:
                ebi ebiVar = (ebi) obj;
                ebiVar.getClass();
                ez0 ez0Var = (ez0) obj3;
                LinearLayout linearLayout2 = (LinearLayout) ez0Var.b;
                linearLayout2.getClass();
                sea.v(linearLayout2, ebiVar.e, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                TextView textView = (TextView) ez0Var.e;
                textView.setText(ebiVar.c);
                boolean z7 = ebiVar.f;
                FrameLayout frameLayout = (FrameLayout) ez0Var.d;
                if (!z7) {
                    frameLayout.setVisibility(8);
                    textView.setPaddingRelative(textView.getPaddingStart(), ao2.s(14, context), textView.getPaddingEnd(), ao2.s(6, context));
                    break;
                } else {
                    frameLayout.setVisibility(0);
                    haa.L((TextView) ez0Var.c, Integer.valueOf(R.drawable.ic_show_chart), ua5.a, Integer.valueOf(ao2.s(16, context)));
                    frameLayout.setOnClickListener(new cne(this, 29));
                    break;
                }
            case 2:
                iei ieiVar = (iei) obj;
                ieiVar.getClass();
                kqb kqbVar = (kqb) obj3;
                ConstraintLayout constraintLayout2 = kqbVar.b;
                TextView textView2 = kqbVar.d;
                constraintLayout2.getClass();
                sea.v(constraintLayout2, true, false, 0, i == 0 ? ((Number) ((ate) obj2).invoke()).intValue() : 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                textView2.setText(ieiVar.a);
                if (!ieiVar.b.isEmpty()) {
                    haa.G(textView2);
                    Drawable drawable2 = context.getDrawable(R.drawable.ic_external_link_16);
                    if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                        drawable = null;
                    } else {
                        v9g.K(drawable, context.getColor(R.color.primary_default));
                    }
                    if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
                        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                        break;
                    } else {
                        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        break;
                    }
                } else {
                    haa.C(textView2);
                    textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    break;
                }
                break;
            case 3:
                iei ieiVar2 = (iei) obj;
                ieiVar2.getClass();
                kqb kqbVar2 = (kqb) obj3;
                kqbVar2.d.setText(ieiVar2.a);
                ConstraintLayout constraintLayout3 = kqbVar2.b;
                constraintLayout3.getClass();
                sea.v(constraintLayout3, true, false, 0, i == 0 ? ((Number) ((w1i) obj2).invoke()).intValue() : 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                break;
            case 4:
                TvEvent tvEvent = (TvEvent) obj;
                tvEvent.getClass();
                int id = Event.getHomeTeam$default(tvEvent.getEvent(), null, 1, null).getId();
                int id2 = Event.getAwayTeam$default(tvEvent.getEvent(), null, 1, null).getId();
                v82 v82Var = (v82) obj3;
                ImageView imageView = (ImageView) v82Var.d;
                LinearLayout linearLayout3 = (LinearLayout) v82Var.h;
                String R = pco.R(id);
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = R;
                vt9.f(ht9Var, imageView);
                jrg jrgVar = jrg.b;
                ht9Var.q = jrgVar;
                a.a(ht9Var.a());
                ImageView imageView2 = (ImageView) v82Var.c;
                String R2 = pco.R(id2);
                apf a2 = ajh.a(imageView2.getContext());
                ht9 ht9Var2 = new ht9(imageView2.getContext());
                ht9Var2.c = R2;
                vt9.f(ht9Var2, imageView2);
                ht9Var2.q = jrgVar;
                a2.a(ht9Var2.a());
                StringBuilder sb = new StringBuilder(wyh.c(context, tvEvent.getEvent().getTournament().getCategory().getSport().getSlug()));
                sb.append(", ");
                Category category3 = tvEvent.getEvent().getTournament().getCategory();
                if (!t62.J(category3)) {
                    sb.append(tba.q(category3, context));
                    sb.append(", ");
                }
                UniqueTournament uniqueTournament = tvEvent.getEvent().getTournament().getUniqueTournament();
                if (uniqueTournament == null || (name = uniqueTournament.getName()) == null) {
                    name = tvEvent.getEvent().getTournament().getName();
                }
                sb.append(name);
                ((TextView) v82Var.g).setText(wyh.c(context, sb.toString()));
                ((TextView) v82Var.e).setText(tba.p(context, Event.getHomeTeam$default(tvEvent.getEvent(), null, 1, null)));
                ((TextView) v82Var.f).setText(qea.K(tba.p(context, Event.getAwayTeam$default(tvEvent.getEvent(), null, 1, null)), tvEvent.getEvent().shouldReverseTeams()));
                linearLayout3.removeAllViews();
                csi csiVar = (csi) obj2;
                Iterator<T> it = tvEvent.getChannels().values().iterator();
                while (it.hasNext()) {
                    linearLayout3.addView(csiVar.G((List) it.next(), tvEvent.getShowCountryFlag()));
                }
                break;
            case 5:
                TvStageEvent tvStageEvent = (TvStageEvent) obj;
                mvj mvjVar = (mvj) obj3;
                tvStageEvent.getClass();
                StageSeason stageSeason = tvStageEvent.getStage().getStageSeason();
                UniqueStage uniqueStage = stageSeason != null ? stageSeason.getUniqueStage() : null;
                String slug = (uniqueStage == null || (category2 = uniqueStage.getCategory()) == null || (sport = category2.getSport()) == null) ? null : sport.getSlug();
                if (Intrinsics.c(slug, Sports.MOTORSPORT)) {
                    slug = uniqueStage != null ? uniqueStage.getName() : null;
                }
                if (tvStageEvent.getStage().getStageEvent() != null) {
                    Stage stageEvent = tvStageEvent.getStage().getStageEvent();
                    slug = wv8.i(slug, ", ", stageEvent != null ? stageEvent.getDescription() : null);
                }
                TextView textView3 = mvjVar.f;
                LinearLayout linearLayout4 = mvjVar.c;
                textView3.setText(slug);
                as9.b(mvjVar.e, (uniqueStage == null || (category = uniqueStage.getCategory()) == null) ? null : Integer.valueOf(category.getId()), null);
                mvjVar.d.setText(tvStageEvent.getStage().tvChannelString());
                linearLayout4.removeAllViews();
                csi csiVar2 = (csi) obj2;
                Iterator<T> it2 = tvStageEvent.getChannels().values().iterator();
                while (it2.hasNext()) {
                    linearLayout4.addView(csiVar2.G((List) it2.next(), tvStageEvent.getShowCountryFlag()));
                }
                break;
            case 6:
                bs1 bs1Var = (bs1) obj;
                bs1Var.getClass();
                hs1 hs1Var = (hs1) obj3;
                LinearLayout linearLayout5 = hs1Var.b;
                TextView textView4 = hs1Var.d;
                linearLayout5.getClass();
                aba.G(linearLayout5);
                TextView textView5 = hs1Var.c;
                String str2 = bs1Var.a;
                String str3 = bs1Var.f;
                textView5.setText(str2);
                hs1Var.e.setText(bs1Var.b);
                int i4 = bs1Var.e;
                int ceil = (int) Math.ceil(i4 / ((float) Math.ceil(((v0j) obj2).n != null ? r10.intValue() * 0.25f : 1.0f)));
                int color = ceil != 1 ? ceil != 2 ? ceil != 3 ? context.getColor(R.color.rating_60) : context.getColor(R.color.rating_70) : context.getColor(R.color.rating_80) : context.getColor(R.color.rating_90);
                textView4.setText(String.valueOf(i4));
                textView4.setTextColor(color);
                Drawable mutate = textView4.getBackground().mutate();
                GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setStroke(ao2.t(context, 1.0f), color);
                }
                if (Intrinsics.c(str3, "EFFECTIVE_FIELD_GOAL_PCT")) {
                    d(R.string.basketball_effective_field_goal_pct, R.string.basketball_effective_fg_pct_info);
                } else if (Intrinsics.c(str3, "TRUE_SHOOTING_PCT")) {
                    d(R.string.basketball_true_shooting_pct, R.string.basketball_true_shooting_pct_info);
                } else {
                    haa.C(textView5);
                    textView5.setCompoundDrawablesRelative(null, null, null, null);
                }
                linearLayout5.getClass();
                sea.v(linearLayout5, false, bs1Var.d, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                linearLayout5.setMinimumHeight(ao2.s(bs1Var.d ? 40 : 32, context));
                linearLayout5.setPaddingRelative(linearLayout5.getPaddingStart(), linearLayout5.getPaddingTop(), linearLayout5.getPaddingEnd(), bs1Var.d ? ao2.s(8, context) : 0);
                break;
            case 7:
                fmj fmjVar = (fmj) obj;
                fmjVar.getClass();
                aik.r((j22) obj2, this.b, fmjVar, (String) obj3, i, true);
                break;
            default:
                TvChannel tvChannel = (TvChannel) obj;
                tvChannel.getClass();
                RadioButton radioButton = (RadioButton) ((ed) obj3).c;
                radioButton.setText(tvChannel.getName());
                int id3 = tvChannel.getId();
                Integer num = ((f3k) obj2).m;
                if (num != null && id3 == num.intValue()) {
                    z = true;
                }
                radioButton.setChecked(z);
                break;
        }
    }

    public void d(int i, int i2) {
        Drawable drawable;
        hs1 hs1Var = (hs1) this.d;
        LinearLayout linearLayout = hs1Var.b;
        TextView textView = hs1Var.c;
        Context context = this.b;
        int s = ao2.s(16, context);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_info);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(context.getColor(R.color.primary_default));
            drawable.setBounds(0, 0, s, s);
        }
        haa.G(textView);
        haa.K(textView, drawable, ua5.b, null, null);
        textView.setCompoundDrawablePadding(ao2.s(2, context));
        linearLayout.getClass();
        aba.y(linearLayout, 0, 3);
        linearLayout.getClass();
        z8e.a0(linearLayout, 1000L, new yg9(this, i, i2, 2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gai(kqb kqbVar, ate ateVar) {
        super(r0);
        ConstraintLayout constraintLayout = kqbVar.b;
        constraintLayout.getClass();
        this.d = kqbVar;
        this.e = ateVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gai(kqb kqbVar, w1i w1iVar) {
        super(r0);
        ConstraintLayout constraintLayout = kqbVar.b;
        constraintLayout.getClass();
        this.d = kqbVar;
        this.e = w1iVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gai(f3k f3kVar, ed edVar) {
        super(r2);
        this.e = f3kVar;
        FrameLayout frameLayout = (FrameLayout) edVar.b;
        frameLayout.getClass();
        this.d = edVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gai(ez0 ez0Var, fl8 fl8Var) {
        super(r0);
        LinearLayout linearLayout = (LinearLayout) ez0Var.b;
        linearLayout.getClass();
        this.d = ez0Var;
        this.e = fl8Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gai(v0j v0jVar, hs1 hs1Var) {
        super(r2);
        this.e = v0jVar;
        LinearLayout linearLayout = hs1Var.b;
        linearLayout.getClass();
        this.d = hs1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gai(csi csiVar, v82 v82Var) {
        super(r2);
        this.e = csiVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        constraintLayout.getClass();
        this.d = v82Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gai(csi csiVar, mvj mvjVar) {
        super(r2);
        this.e = csiVar;
        ConstraintLayout constraintLayout = mvjVar.b;
        constraintLayout.getClass();
        this.d = mvjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gai(View view, String str) {
        super(view);
        view.getClass();
        str.getClass();
        this.d = str;
        this.e = j22.b(view);
    }
}
