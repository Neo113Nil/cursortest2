package com.sofascore.results.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.same.report.h;
import com.sofascore.results.R;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.calendar.MaterialCalendarView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.task.g;
import defpackage.ad2;
import defpackage.dg2;
import defpackage.hg2;
import defpackage.joa;
import defpackage.nq8;
import defpackage.nr1;
import defpackage.p42;
import defpackage.qv5;
import defpackage.sg2;
import defpackage.tc3;
import defpackage.ug2;
import defpackage.xg2;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yyb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR.\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/sofascore/results/calendar/CalendarView;", "Landroid/widget/LinearLayout;", "Ldg2;", "callback", "", "setCallback", "(Ldg2;)V", "Lkotlin/Function0;", a.q, "Lkotlin/jvm/functions/Function0;", "getOnDisplayCallback", "()Lkotlin/jvm/functions/Function0;", "setOnDisplayCallback", "(Lkotlin/jvm/functions/Function0;)V", "onDisplayCallback", "d", "getOnHideCallback", "setOnHideCallback", "onHideCallback", "e", "getSelectWorldCupCallback", "setSelectWorldCupCallback", "selectWorldCupCallback", "Lhg2;", U3.i.X, g.e, "Lhg2;", "getCalendarLogic", "()Lhg2;", "setCalendarLogic", "(Lhg2;)V", "calendarLogic", "Lyyb;", h.b, "Ljoa;", "getCalendarCallbacks", "()Lyyb;", "calendarCallbacks", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CalendarView extends LinearLayout {
    public static final /* synthetic */ int i = 0;
    public nr1 a;
    public dg2 b;

    /* renamed from: c, reason: from kotlin metadata */
    public Function0 onDisplayCallback;

    /* renamed from: d, reason: from kotlin metadata */
    public Function0 onHideCallback;

    /* renamed from: e, reason: from kotlin metadata */
    public Function0 selectWorldCupCallback;
    public boolean f;

    /* renamed from: g, reason: from kotlin metadata */
    public hg2 calendarLogic;

    /* renamed from: h, reason: from kotlin metadata */
    public final joa calendarCallbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.calendarCallbacks = ypa.a(ysa.c, new sg2(this, 0));
    }

    private final yyb getCalendarCallbacks() {
        return (yyb) this.calendarCallbacks.getValue();
    }

    public final void a(boolean z) {
        this.f = false;
        ad2 ad2Var = qv5.a;
        qv5.a(p42.a);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, -1.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setAnimationListener(new xg2(z, this));
        nr1 nr1Var = this.a;
        if (nr1Var != null) {
            ((LinearLayout) nr1Var.f).startAnimation(translateAnimation);
        } else {
            Intrinsics.i("binding");
            throw null;
        }
    }

    public final void b() {
        hg2 hg2Var;
        Long b;
        final int i2 = 1;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.calendar_layout, (ViewGroup) this, true);
        int i3 = R.id.button_close;
        ImageView imageView = (ImageView) nq8.B(R.id.button_close, inflate);
        if (imageView != null) {
            i3 = R.id.calendar;
            MaterialCalendarView materialCalendarView = (MaterialCalendarView) nq8.B(R.id.calendar, inflate);
            if (materialCalendarView != null) {
                i3 = R.id.calendar_holder;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.calendar_holder, inflate);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                    i3 = R.id.container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.container, inflate);
                    if (constraintLayout != null) {
                        i3 = R.id.dot_explanation_text;
                        TextView textView = (TextView) nq8.B(R.id.dot_explanation_text, inflate);
                        if (textView != null) {
                            i3 = R.id.empty_space;
                            View B = nq8.B(R.id.empty_space, inflate);
                            if (B != null) {
                                i3 = R.id.header_background;
                                View B2 = nq8.B(R.id.header_background, inflate);
                                if (B2 != null) {
                                    i3 = R.id.title;
                                    TextView textView2 = (TextView) nq8.B(R.id.title, inflate);
                                    if (textView2 != null) {
                                        this.a = new nr1(linearLayout2, imageView, materialCalendarView, linearLayout, constraintLayout, textView, B, B2, textView2);
                                        constraintLayout.setClipToOutline(true);
                                        nr1 nr1Var = this.a;
                                        if (nr1Var == null) {
                                            Intrinsics.i("binding");
                                            throw null;
                                        }
                                        final int i4 = 0;
                                        ((ImageView) nr1Var.e).setOnClickListener(new View.OnClickListener(this) { // from class: tg2
                                            public final /* synthetic */ CalendarView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i5 = i4;
                                                CalendarView calendarView = this.b;
                                                switch (i5) {
                                                    case 0:
                                                        int i6 = CalendarView.i;
                                                        calendarView.a(false);
                                                        return;
                                                    case 1:
                                                        int i7 = CalendarView.i;
                                                        calendarView.a(false);
                                                        return;
                                                    default:
                                                        hg2 hg2Var2 = calendarView.calendarLogic;
                                                        fg2 o = hg2Var2 != null ? hg2Var2.o() : new fg2();
                                                        fg2 fg2Var = new fg2();
                                                        hg2 hg2Var3 = calendarView.calendarLogic;
                                                        if (hg2Var3 != null) {
                                                            hg2Var3.q(fg2Var);
                                                        }
                                                        nr1 nr1Var2 = calendarView.a;
                                                        if (nr1Var2 != null) {
                                                            ((MaterialCalendarView) nr1Var2.d).u(fg2Var, o, true, new mi(11, calendarView, o, fg2Var));
                                                            return;
                                                        } else {
                                                            Intrinsics.i("binding");
                                                            throw null;
                                                        }
                                                }
                                            }
                                        });
                                        nr1 nr1Var2 = this.a;
                                        if (nr1Var2 == null) {
                                            Intrinsics.i("binding");
                                            throw null;
                                        }
                                        nr1Var2.g.setOnClickListener(new View.OnClickListener(this) { // from class: tg2
                                            public final /* synthetic */ CalendarView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i5 = i2;
                                                CalendarView calendarView = this.b;
                                                switch (i5) {
                                                    case 0:
                                                        int i6 = CalendarView.i;
                                                        calendarView.a(false);
                                                        return;
                                                    case 1:
                                                        int i7 = CalendarView.i;
                                                        calendarView.a(false);
                                                        return;
                                                    default:
                                                        hg2 hg2Var2 = calendarView.calendarLogic;
                                                        fg2 o = hg2Var2 != null ? hg2Var2.o() : new fg2();
                                                        fg2 fg2Var = new fg2();
                                                        hg2 hg2Var3 = calendarView.calendarLogic;
                                                        if (hg2Var3 != null) {
                                                            hg2Var3.q(fg2Var);
                                                        }
                                                        nr1 nr1Var22 = calendarView.a;
                                                        if (nr1Var22 != null) {
                                                            ((MaterialCalendarView) nr1Var22.d).u(fg2Var, o, true, new mi(11, calendarView, o, fg2Var));
                                                            return;
                                                        } else {
                                                            Intrinsics.i("binding");
                                                            throw null;
                                                        }
                                                }
                                            }
                                        });
                                        inflate.setOnClickListener(null);
                                        inflate.setVisibility(8);
                                        nr1 nr1Var3 = this.a;
                                        if (nr1Var3 == null) {
                                            Intrinsics.i("binding");
                                            throw null;
                                        }
                                        ((LinearLayout) nr1Var3.f).setVisibility(4);
                                        nr1 nr1Var4 = this.a;
                                        if (nr1Var4 == null) {
                                            Intrinsics.i("binding");
                                            throw null;
                                        }
                                        ((MaterialCalendarView) nr1Var4.d).setDisplayLogic(this.calendarLogic);
                                        nr1 nr1Var5 = this.a;
                                        if (nr1Var5 == null) {
                                            Intrinsics.i("binding");
                                            throw null;
                                        }
                                        ((MaterialCalendarView) nr1Var5.d).setDateSelectedListener(getCalendarCallbacks());
                                        hg2 hg2Var2 = this.calendarLogic;
                                        if (hg2Var2 != null) {
                                            int c = hg2Var2.c();
                                            nr1 nr1Var6 = this.a;
                                            if (nr1Var6 == null) {
                                                Intrinsics.i("binding");
                                                throw null;
                                            }
                                            nr1Var6.b.setText(c);
                                        }
                                        nr1 nr1Var7 = this.a;
                                        if (nr1Var7 == null) {
                                            Intrinsics.i("binding");
                                            throw null;
                                        }
                                        ((TextView) nr1Var7.i).setTextAppearance(R.style.SpecificAndroidHeaderTitle);
                                        nr1 nr1Var8 = this.a;
                                        if (nr1Var8 == null) {
                                            Intrinsics.i("binding");
                                            throw null;
                                        }
                                        ((TextView) nr1Var8.i).setText(R.string.menu_calendar);
                                        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.view_calendar_today, (ViewGroup) null, false);
                                        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.today, inflate2);
                                        if (materialButton == null) {
                                            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.today)));
                                            return;
                                        }
                                        LinearLayout linearLayout3 = (LinearLayout) inflate2;
                                        final int i5 = 2;
                                        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: tg2
                                            public final /* synthetic */ CalendarView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i52 = i5;
                                                CalendarView calendarView = this.b;
                                                switch (i52) {
                                                    case 0:
                                                        int i6 = CalendarView.i;
                                                        calendarView.a(false);
                                                        return;
                                                    case 1:
                                                        int i7 = CalendarView.i;
                                                        calendarView.a(false);
                                                        return;
                                                    default:
                                                        hg2 hg2Var22 = calendarView.calendarLogic;
                                                        fg2 o = hg2Var22 != null ? hg2Var22.o() : new fg2();
                                                        fg2 fg2Var = new fg2();
                                                        hg2 hg2Var3 = calendarView.calendarLogic;
                                                        if (hg2Var3 != null) {
                                                            hg2Var3.q(fg2Var);
                                                        }
                                                        nr1 nr1Var22 = calendarView.a;
                                                        if (nr1Var22 != null) {
                                                            ((MaterialCalendarView) nr1Var22.d).u(fg2Var, o, true, new mi(11, calendarView, o, fg2Var));
                                                            return;
                                                        } else {
                                                            Intrinsics.i("binding");
                                                            throw null;
                                                        }
                                                }
                                            }
                                        });
                                        hg2 hg2Var3 = this.calendarLogic;
                                        if ((hg2Var3 != null ? hg2Var3.b() : null) != null && ((hg2Var = this.calendarLogic) == null || (b = hg2Var.b()) == null || b.longValue() != 0)) {
                                            Context context = getContext();
                                            context.getClass();
                                            ComposeView composeView = new ComposeView(context, null, 6);
                                            composeView.setContent(new tc3(454935189, new ug2(this, i4), true));
                                            nr1 nr1Var9 = this.a;
                                            if (nr1Var9 == null) {
                                                Intrinsics.i("binding");
                                                throw null;
                                            }
                                            ((LinearLayout) nr1Var9.f).addView(composeView);
                                        }
                                        nr1 nr1Var10 = this.a;
                                        if (nr1Var10 != null) {
                                            ((LinearLayout) nr1Var10.f).addView(linearLayout3);
                                            return;
                                        } else {
                                            Intrinsics.i("binding");
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    @Nullable
    public final hg2 getCalendarLogic() {
        return this.calendarLogic;
    }

    @Nullable
    public final Function0<Unit> getOnDisplayCallback() {
        return this.onDisplayCallback;
    }

    @Nullable
    public final Function0<Unit> getOnHideCallback() {
        return this.onHideCallback;
    }

    @Nullable
    public final Function0<Unit> getSelectWorldCupCallback() {
        return this.selectWorldCupCallback;
    }

    public final void setCalendarLogic(@Nullable hg2 hg2Var) {
        this.calendarLogic = hg2Var;
        nr1 nr1Var = this.a;
        if (nr1Var != null) {
            ((MaterialCalendarView) nr1Var.d).setDisplayLogic(hg2Var);
            if (hg2Var != null) {
                int c = hg2Var.c();
                nr1 nr1Var2 = this.a;
                if (nr1Var2 != null) {
                    nr1Var2.b.setText(c);
                } else {
                    Intrinsics.i("binding");
                    throw null;
                }
            }
        }
    }

    public final void setCallback(@Nullable dg2 callback) {
        this.b = callback;
    }

    public final void setOnDisplayCallback(@Nullable Function0<Unit> function0) {
        this.onDisplayCallback = function0;
    }

    public final void setOnHideCallback(@Nullable Function0<Unit> function0) {
        this.onHideCallback = function0;
    }

    public final void setSelectWorldCupCallback(@Nullable Function0<Unit> function0) {
        this.selectWorldCupCallback = function0;
    }
}
