package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dfg implements kbg, View.OnAttachStateChangeListener, mig {
    public final afg a;
    public final efg b;
    public final pgg c;
    public final mjg d;
    public final nig e;
    public final List f;
    public final Function1 g;
    public xag h;
    public adg i;
    public ViewGroup j;

    public dfg(afg afgVar, efg efgVar, pgg pggVar, mjg mjgVar, nig nigVar, List list) {
        j9g j9gVar = new j9g(27);
        this.a = afgVar;
        this.b = efgVar;
        this.c = pggVar;
        this.d = mjgVar;
        this.e = nigVar;
        this.f = list;
        this.g = j9gVar;
        ((pig) nigVar).o = this;
    }

    @Override // defpackage.kbg
    public final boolean c() {
        return false;
    }

    @Override // defpackage.kbg
    public final Object d(Context context, sq3 sq3Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        efg efgVar = this.b;
        ViewGroup a = efgVar.a(context);
        Integer num = efgVar.c;
        afg afgVar = this.a;
        if (num != null) {
            int intValue = num.intValue();
            try {
                ((TextView) a.findViewById(intValue)).setText(afgVar.a);
            } catch (Exception unused) {
                throw new wo0(lnb.k(intValue, "The titleTextViewId '", "' is invalid: the view either doesn't exist or is not a TextView."));
            }
        }
        Integer num2 = efgVar.d;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            try {
                ((TextView) a.findViewById(intValue2)).setText(afgVar.b);
            } catch (Exception unused2) {
                throw new wo0(lnb.k(intValue2, "The bodyTextViewId '", "' is invalid: the view either doesn't exist or is not a TextView."));
            }
        }
        Integer num3 = efgVar.e;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            try {
                Button button = (Button) a.findViewById(intValue3);
                button.setText(afgVar.c);
                final int i = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: bfg
                    public final /* synthetic */ dfg b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = i;
                        rq3 rq3Var = null;
                        dfg dfgVar = this.b;
                        switch (i2) {
                            case 0:
                                hs4 hs4Var = z45.a;
                                xw3.L(s9a.c(rob.a), null, null, new cfg(dfgVar, rq3Var, 0), 3);
                                break;
                            default:
                                hs4 hs4Var2 = z45.a;
                                xw3.L(s9a.c(rob.a), null, null, new cfg(dfgVar, rq3Var, 1), 3);
                                break;
                        }
                    }
                });
            } catch (Exception unused3) {
                throw new wo0(lnb.k(intValue3, "The callToActionButtonId '", "' is invalid: the view either doesn't exist or is not a Button."));
            }
        }
        Integer num4 = efgVar.f;
        if (num4 != null) {
            int intValue4 = num4.intValue();
            try {
                ((TextView) a.findViewById(intValue4)).setText(afgVar.d);
            } catch (Exception unused4) {
                throw new wo0(lnb.k(intValue4, "The advertiserTextViewId '", "' is invalid: the view either doesn't exist or is not a TextView."));
            }
        }
        Integer num5 = efgVar.g;
        if (num5 != null) {
            int intValue5 = num5.intValue();
            try {
                RatingBar ratingBar = (RatingBar) a.findViewById(intValue5);
                Double d = afgVar.e;
                ratingBar.setRating(d != null ? (float) d.doubleValue() : 5.0f);
            } catch (Exception unused5) {
                throw new wo0(lnb.k(intValue5, "The ratingBarId '", "' is invalid: the view either doesn't exist or is not a RatingBar."));
            }
        }
        Integer num6 = efgVar.h;
        Function1 function1 = this.g;
        if (num6 != null) {
            int intValue6 = num6.intValue();
            zeg zegVar = afgVar.f;
            if (zegVar != null) {
                try {
                    ((ViewGroup) a.findViewById(intValue6)).addView(qea.x(context, zegVar, function1), new ViewGroup.LayoutParams(-1, -1));
                } catch (Exception unused6) {
                    throw new wo0(lnb.k(intValue6, "The iconImageViewId '", "' is invalid: the view either doesn't exist or is not a ViewGroup."));
                }
            }
        }
        Integer num7 = efgVar.i;
        if (num7 != null) {
            int intValue7 = num7.intValue();
            zeg zegVar2 = afgVar.g;
            if (zegVar2 != null) {
                try {
                    ((ViewGroup) a.findViewById(intValue7)).addView(qea.x(context, zegVar2, function1), new ViewGroup.LayoutParams(-1, -2));
                } catch (Exception unused7) {
                    throw new wo0(lnb.k(intValue7, "The mainViewId '", "' is invalid: the view either doesn't exist or is not a ViewGroup."));
                }
            }
        }
        try {
            viewGroup = (ViewGroup) a.findViewById(R.id.customer_feedback_container_view);
        } catch (Exception unused8) {
            viewGroup = null;
        }
        nig nigVar = this.e;
        if (viewGroup == null) {
            RelativeLayout relativeLayout = new RelativeLayout(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            ViewParent parent = a.getParent();
            ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(a);
            }
            relativeLayout.addView(a, layoutParams);
            FrameLayout frameLayout = new FrameLayout(context);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            relativeLayout.addView(frameLayout, layoutParams2);
            ((pig) nigVar).c(gig.SMALL);
            viewGroup2 = relativeLayout;
            viewGroup = frameLayout;
        } else {
            viewGroup2 = a;
        }
        viewGroup.addView(((pig) nigVar).m);
        a.addOnAttachStateChangeListener(this);
        final int i2 = 1;
        viewGroup2.setOnClickListener(new View.OnClickListener(this) { // from class: bfg
            public final /* synthetic */ dfg b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                rq3 rq3Var = null;
                dfg dfgVar = this.b;
                switch (i22) {
                    case 0:
                        hs4 hs4Var = z45.a;
                        xw3.L(s9a.c(rob.a), null, null, new cfg(dfgVar, rq3Var, 0), 3);
                        break;
                    default:
                        hs4 hs4Var2 = z45.a;
                        xw3.L(s9a.c(rob.a), null, null, new cfg(dfgVar, rq3Var, 1), 3);
                        break;
                }
            }
        });
        this.j = a;
        rjg d2 = this.d.d(a, this.f, false, false, this.c);
        if (d2 != null) {
            d2.a(4, ((pig) nigVar).m);
            hkg.T().post(new ojg(d2, 7));
        }
        return viewGroup2;
    }

    @Override // defpackage.kbg
    public final void onAdLifecycleConfigured(xag xagVar) {
        xagVar.getClass();
        this.h = xagVar;
        adg adgVar = this.i;
        if (adgVar != null) {
            adgVar.a();
        }
    }

    @Override // defpackage.mig
    public final void onCustomerFeedbackDialogDismissed(boolean z) {
        xag xagVar;
        if (!z || (xagVar = this.h) == null) {
            return;
        }
        ((zag) xagVar).n((View) ((pig) this.e).n.getValue());
    }

    @Override // defpackage.kbg
    public final void onDestroy() {
        rjg b;
        ViewGroup viewGroup = this.j;
        if (viewGroup == null || (b = this.d.b(viewGroup)) == null) {
            return;
        }
        b.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        adg adgVar = new adg(new e6g(this, 2));
        adgVar.a();
        this.i = adgVar;
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            rjg b = this.d.b(viewGroup);
            if (b != null) {
                hkg.T().post(new ojg(b, 8));
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }

    @Override // defpackage.mig
    public final void onCustomerFeedbackDialogShow() {
    }

    @Override // defpackage.kbg
    public final void a(boolean z, boolean z2) {
    }
}
