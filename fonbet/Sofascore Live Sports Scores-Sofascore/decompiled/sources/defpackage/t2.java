package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class t2 extends o8 {
    public static final /* synthetic */ KProperty[] i = {new t0d(t2.class, "collapsedHeight", "getCollapsedHeight()I", 0)};
    public final a13 d;
    public boolean e;
    public ValueAnimator f;
    public Function1 g;
    public final qed h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i2 = R.id.bottom_divider;
        SofaDivider sofaDivider = (SofaDivider) nq8.B(R.id.bottom_divider, root);
        if (sofaDivider != null) {
            i2 = R.id.collapsable_section;
            View B = nq8.B(R.id.collapsable_section, root);
            if (B != null) {
                int i3 = R.id.field_image;
                ImageView imageView = (ImageView) nq8.B(R.id.field_image, B);
                if (imageView != null) {
                    i3 = R.id.icon_expand;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.icon_expand, B);
                    if (imageView2 != null) {
                        i3 = R.id.text_primary;
                        TextView textView = (TextView) nq8.B(R.id.text_primary, B);
                        if (textView != null) {
                            i3 = R.id.text_secondary;
                            TextView textView2 = (TextView) nq8.B(R.id.text_secondary, B);
                            if (textView2 != null) {
                                i3 = R.id.top_divider;
                                SofaDivider sofaDivider2 = (SofaDivider) nq8.B(R.id.top_divider, B);
                                if (sofaDivider2 != null) {
                                    djf djfVar = new djf((ConstraintLayout) B, imageView, imageView2, textView, textView2, sofaDivider2);
                                    i2 = R.id.container;
                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.container, root);
                                    if (frameLayout != null) {
                                        this.d = new a13((LinearLayout) root, sofaDivider, djfVar, frameLayout);
                                        yv4.a.getClass();
                                        this.h = new qed();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i3)));
                throw null;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    private final int getCollapsedHeight() {
        return ((Number) this.h.getValue(this, i[0])).intValue();
    }

    public static void j(t2 t2Var, int i2, Integer num, int i3, View view, boolean z, String str, Function1 function1, Function1 function12, int i4) {
        SharedPreferences d;
        if ((i4 & 8) != 0) {
            i3 = R.color.surface_1;
        }
        boolean z2 = (i4 & 32) != 0 ? true : z;
        Function1 function13 = (i4 & 128) != 0 ? null : function1;
        Function1 function14 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : function12;
        a13 a13Var = t2Var.d;
        view.getClass();
        Context context = t2Var.getContext();
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        boolean z3 = sharedPreferences.getBoolean(str.concat("_VIEW_IS_EXPANDED"), z2);
        t2Var.g = function13;
        LinearLayout linearLayout = a13Var.a;
        linearLayout.setBackgroundColor(t2Var.getContext().getColor(i3));
        djf djfVar = a13Var.c;
        ((TextView) djfVar.g).setText(t2Var.getContext().getString(i2));
        ((ImageView) djfVar.d).setImageDrawable(t2Var.getContext().getDrawable(num.intValue()));
        ((ConstraintLayout) djfVar.b).setOnClickListener(new r2(t2Var, djfVar, function14, str, 0));
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        t2Var.setCollapsedHeight(linearLayout.getMeasuredHeight());
        a13Var.d.addView(view);
        t2Var.setExpanded(z3);
    }

    public static final void l(t2 t2Var, djf djfVar, Function1 function1, String str) {
        SharedPreferences d;
        boolean z = t2Var.e;
        boolean z2 = !z;
        t2Var.e = z2;
        a13 a13Var = t2Var.d;
        ValueAnimator valueAnimator = t2Var.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = t2Var.f;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = t2Var.f;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        int i2 = 0;
        if (!z) {
            a13Var.d.setVisibility(0);
        }
        FrameLayout frameLayout = a13Var.d;
        LinearLayout linearLayout = a13Var.a;
        frameLayout.animate().alpha(!z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(250L);
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(linearLayout.getHeight(), !z ? linearLayout.getMeasuredHeight() : t2Var.getCollapsedHeight());
        ofInt.setDuration(250L);
        ofInt.addListener(new gtg(t2Var, 2, z2));
        ofInt.addUpdateListener(new s2(t2Var, i2));
        ofInt.start();
        t2Var.f = ofInt;
        z8e.s((ImageView) djfVar.e, t2Var.e);
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(t2Var.e));
        }
        boolean z3 = t2Var.e;
        Context context = t2Var.getContext();
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putBoolean(str.concat("_VIEW_IS_EXPANDED"), z3);
        Unit unit = Unit.a;
        edit.apply();
    }

    private final void setCollapsedHeight(int i2) {
        this.h.setValue(this, i[0], Integer.valueOf(i2));
    }

    @NotNull
    public final a13 getBinding() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.collapsible_view_base;
    }

    public final void setBottomDividerVisibility(boolean z) {
        this.d.b.setVisibility(z ? 0 : 8);
    }

    public final void setExpandable(boolean z) {
        a13 a13Var = this.d;
        djf djfVar = a13Var.c;
        djf djfVar2 = a13Var.c;
        ((ConstraintLayout) djfVar.b).setClickable(z);
        if (z) {
            haa.C((TextView) djfVar2.g);
            v9g.K(((ImageView) djfVar2.e).getDrawable(), getContext().getColor(R.color.n_lv_1));
        } else {
            a13Var.d.setVisibility(8);
            ((ImageView) djfVar2.e).setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            haa.D((TextView) djfVar2.g);
            v9g.K(((ImageView) djfVar2.e).getDrawable(), getContext().getColor(R.color.n_lv_4));
        }
    }

    public final void setExpanded(boolean z) {
        this.e = z;
        a13 a13Var = this.d;
        a13Var.d.setVisibility(z ? 0 : 8);
        ImageView imageView = (ImageView) a13Var.c.e;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        imageView.setRotation(z ? -180.0f : 0.0f);
        FrameLayout frameLayout = a13Var.d;
        if (z) {
            f = 1.0f;
        }
        frameLayout.setAlpha(f);
    }

    public final void setSubtitleVisibility(boolean z) {
        ((TextView) this.d.c.c).setVisibility(z ? 0 : 8);
    }

    public final void setTopDividerVisibility(boolean z) {
        ((SofaDivider) this.d.c.f).setVisibility(z ? 0 : 8);
    }
}
