package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import com.sofascore.results.calendar.MaterialCalendarView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class azb extends l {
    public final fg2 a;
    public final int b;
    public final int c;
    public final /* synthetic */ MaterialCalendarView d;

    public azb(MaterialCalendarView materialCalendarView, fg2 fg2Var) {
        int firstDayOfWeek;
        this.d = materialCalendarView;
        this.a = fg2Var;
        setHasStableIds(true);
        Calendar calendar = materialCalendarView.l;
        calendar.getClass();
        fg2Var.b(calendar);
        calendar.set(5, 1);
        int i = calendar.get(7) + 7;
        firstDayOfWeek = materialCalendarView.getFirstDayOfWeek();
        int i2 = ((i - firstDayOfWeek) % 7) + 7;
        this.b = i2;
        calendar.getClass();
        fg2Var.b(calendar);
        this.c = (calendar.getActualMaximum(5) + i2) - 1;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return 49;
    }

    @Override // androidx.recyclerview.widget.l
    public final long getItemId(int i) {
        return getItemViewType(i) == 1 ? i << 6 : i;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemViewType(int i) {
        if (i < 0 || i >= 7) {
            return (i > this.c || this.b > i) ? 1 : 2;
        }
        return 0;
    }

    public final Drawable o(int i) {
        Drawable mutate;
        MaterialCalendarView materialCalendarView = this.d;
        Drawable drawable = materialCalendarView.getContext().getDrawable(R.drawable.bg_calendar_day);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        int color = materialCalendarView.getContext().getColor(i);
        LayerDrawable layerDrawable = mutate instanceof LayerDrawable ? (LayerDrawable) mutate : null;
        Object findDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.layer_circle) : null;
        GradientDrawable gradientDrawable = findDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) findDrawableByLayerId : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
        return mutate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r14 != null ? java.lang.Boolean.valueOf(r14.p()) : null, r12) != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e3  */
    @Override // androidx.recyclerview.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(u uVar, int i) {
        int firstDayOfWeek;
        n2l weekDayFormatter;
        boolean z;
        Drawable drawable;
        fg2 fg2Var;
        fg2 fg2Var2;
        hg2 displayLogic;
        int d;
        int d2;
        boolean z2;
        Drawable drawable2;
        boolean l;
        Drawable drawable3;
        hg2 displayLogic2;
        boolean z3;
        int i2;
        TextView textView;
        zyb zybVar = (zyb) uVar;
        zybVar.getClass();
        int itemViewType = getItemViewType(i);
        MaterialCalendarView materialCalendarView = this.d;
        if (itemViewType == 0) {
            firstDayOfWeek = materialCalendarView.getFirstDayOfWeek();
            weekDayFormatter = materialCalendarView.getWeekDayFormatter();
            Calendar calendar = weekDayFormatter.a;
            calendar.set(7, (firstDayOfWeek + i) % 7);
            String displayName = calendar.getDisplayName(7, 1, Locale.getDefault());
            if (displayName == null) {
                displayName = "";
            }
            View view = zybVar.itemView;
            TextView textView2 = view instanceof TextView ? (TextView) view : null;
            if (textView2 != null) {
                textView2.setText(displayName);
                return;
            }
            return;
        }
        if (itemViewType != 2) {
            return;
        }
        fg2 fg2Var3 = this.a;
        int i3 = fg2Var3.a;
        int i4 = fg2Var3.b;
        int i5 = this.b;
        int i6 = (i - i5) + 1;
        fg2 fg2Var4 = new fg2(i3, i4, i6);
        hg2 displayLogic3 = materialCalendarView.getDisplayLogic();
        fg2 o = displayLogic3 != null ? displayLogic3.o() : new fg2();
        String valueOf = String.valueOf(i6);
        hg2 displayLogic4 = materialCalendarView.getDisplayLogic();
        Boolean valueOf2 = displayLogic4 != null ? Boolean.valueOf(displayLogic4.j(fg2Var4)) : null;
        Boolean bool = Boolean.TRUE;
        boolean c = Intrinsics.c(valueOf2, bool);
        hg2 displayLogic5 = materialCalendarView.getDisplayLogic();
        boolean z4 = (displayLogic5 != null ? displayLogic5.g() : null) != null && (fg2Var4.equals(materialCalendarView.A) || fg2Var4.equals(materialCalendarView.B));
        if (!c) {
            hg2 displayLogic6 = materialCalendarView.getDisplayLogic();
            if (Intrinsics.c(displayLogic6 != null ? Boolean.valueOf(displayLogic6.n()) : null, bool)) {
                hg2 displayLogic7 = materialCalendarView.getDisplayLogic();
                if (Intrinsics.c(displayLogic7 != null ? Boolean.valueOf(displayLogic7.h(fg2Var4)) : null, bool)) {
                    drawable = materialCalendarView.u;
                    if (drawable == null) {
                        drawable = o(R.color.primary_highlight);
                        materialCalendarView.u = drawable;
                    }
                }
            }
            if (z4) {
                Context context = materialCalendarView.getContext();
                hg2 displayLogic8 = materialCalendarView.getDisplayLogic();
                Integer g = displayLogic8 != null ? displayLogic8.g() : null;
                g.getClass();
                z = true;
                drawable = context.getDrawable(g.intValue());
            } else {
                z = true;
                drawable = null;
            }
            fg2Var = materialCalendarView.A;
            if (fg2Var == null) {
                fg2Var = o;
            }
            fg2Var2 = materialCalendarView.B;
            if (fg2Var2 != null) {
                o = fg2Var2;
            }
            displayLogic = materialCalendarView.getDisplayLogic();
            if (!Intrinsics.c(displayLogic == null ? Boolean.valueOf(displayLogic.i()) : null, bool)) {
                hg2 displayLogic9 = materialCalendarView.getDisplayLogic();
                if (!Intrinsics.c(displayLogic9 != null ? Boolean.valueOf(displayLogic9.f()) : null, bool)) {
                    hg2 displayLogic10 = materialCalendarView.getDisplayLogic();
                }
            }
            d = fg2Var.d();
            int d3 = o.d();
            d2 = fg2Var4.d();
            if (d <= d2 && d2 <= d3) {
                z2 = (!fg2Var4.equals(fg2Var) || i % 7 == 0 || i == i5) ? z : false;
                boolean z5 = (!fg2Var4.equals(o) || i % 7 == 6 || i == this.c) ? z : false;
                if (!z2 && z5) {
                    drawable2 = materialCalendarView.z;
                    if (drawable2 == null) {
                        drawable2 = o(R.color.primary_highlight);
                        materialCalendarView.z = drawable2;
                    }
                } else if (!z2) {
                    drawable2 = materialCalendarView.w;
                    if (drawable2 == null) {
                        drawable2 = q(8388611);
                        materialCalendarView.w = drawable2;
                    }
                } else if (z5) {
                    drawable2 = materialCalendarView.x;
                    if (drawable2 == null) {
                        drawable2 = q(8388613);
                        materialCalendarView.x = drawable2;
                    }
                } else {
                    drawable2 = materialCalendarView.y;
                    if (drawable2 == null) {
                        drawable2 = q(17);
                        materialCalendarView.y = drawable2;
                    }
                }
                hg2 displayLogic11 = materialCalendarView.getDisplayLogic();
                l = displayLogic11 == null ? displayLogic11.l(new fg2(fg2Var3.a, fg2Var3.b, (i - i5) + 1)) : false;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!l && c) {
                    drawable3 = materialCalendarView.t;
                    if (drawable3 == null) {
                        View view2 = zybVar.itemView;
                        TextView textView3 = view2 instanceof TextView ? (TextView) view2 : null;
                        if (textView3 != null) {
                            f = textView3.getTextSize();
                        }
                        drawable3 = p(f, R.color.surface_P);
                        materialCalendarView.t = drawable3;
                    }
                } else if (l) {
                    drawable3 = null;
                } else {
                    drawable3 = materialCalendarView.s;
                    if (drawable3 == null) {
                        View view3 = zybVar.itemView;
                        TextView textView4 = view3 instanceof TextView ? (TextView) view3 : null;
                        if (textView4 != null) {
                            f = textView4.getTextSize();
                        }
                        drawable3 = p(f, R.color.primary_default);
                        materialCalendarView.s = drawable3;
                    }
                }
                displayLogic2 = materialCalendarView.getDisplayLogic();
                if (displayLogic2 == null) {
                    z3 = z;
                    if (displayLogic2.j(fg2Var4) == z3) {
                        i2 = R.color.surface_1;
                        if (drawable == null && drawable2 != null) {
                            drawable = new LayerDrawable(new Drawable[]{drawable2, drawable}).mutate();
                        } else if (drawable == null) {
                            drawable = drawable2;
                        }
                        valueOf.getClass();
                        View view4 = zybVar.itemView;
                        textView = view4 instanceof TextView ? (TextView) view4 : null;
                        if (textView != null) {
                            textView.setText(valueOf);
                            textView.setBackground(drawable);
                            textView.setTextColor(textView.getContext().getColor(i2));
                            textView.setCompoundDrawables(null, null, null, drawable3);
                        }
                        zybVar.itemView.setOnClickListener(new au7(20, materialCalendarView, fg2Var4));
                    }
                } else {
                    z3 = z;
                }
                if (z4) {
                    hg2 displayLogic12 = materialCalendarView.getDisplayLogic();
                    i2 = (displayLogic12 == null || displayLogic12.a(fg2Var4) != z3) ? R.color.n_lv_3 : R.color.n_lv_1;
                } else {
                    i2 = R.color.on_color_primary;
                }
                if (drawable == null) {
                }
                if (drawable == null) {
                }
                valueOf.getClass();
                View view42 = zybVar.itemView;
                if (view42 instanceof TextView) {
                }
                if (textView != null) {
                }
                zybVar.itemView.setOnClickListener(new au7(20, materialCalendarView, fg2Var4));
            }
            drawable2 = null;
            hg2 displayLogic112 = materialCalendarView.getDisplayLogic();
            if (displayLogic112 == null) {
            }
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!l) {
            }
            if (l) {
            }
            displayLogic2 = materialCalendarView.getDisplayLogic();
            if (displayLogic2 == null) {
            }
            if (z4) {
            }
            if (drawable == null) {
            }
            if (drawable == null) {
            }
            valueOf.getClass();
            View view422 = zybVar.itemView;
            if (view422 instanceof TextView) {
            }
            if (textView != null) {
            }
            zybVar.itemView.setOnClickListener(new au7(20, materialCalendarView, fg2Var4));
        }
        drawable = materialCalendarView.v;
        if (drawable == null) {
            drawable = o(R.color.primary_default);
            materialCalendarView.v = drawable;
        }
        z = true;
        fg2Var = materialCalendarView.A;
        if (fg2Var == null) {
        }
        fg2Var2 = materialCalendarView.B;
        if (fg2Var2 != null) {
        }
        displayLogic = materialCalendarView.getDisplayLogic();
        if (!Intrinsics.c(displayLogic == null ? Boolean.valueOf(displayLogic.i()) : null, bool)) {
        }
        d = fg2Var.d();
        int d32 = o.d();
        d2 = fg2Var4.d();
        if (d <= d2) {
            if (fg2Var4.equals(fg2Var)) {
            }
            if (fg2Var4.equals(o)) {
            }
            if (!z2) {
            }
            if (!z2) {
            }
            hg2 displayLogic1122 = materialCalendarView.getDisplayLogic();
            if (displayLogic1122 == null) {
            }
            float f22 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!l) {
            }
            if (l) {
            }
            displayLogic2 = materialCalendarView.getDisplayLogic();
            if (displayLogic2 == null) {
            }
            if (z4) {
            }
            if (drawable == null) {
            }
            if (drawable == null) {
            }
            valueOf.getClass();
            View view4222 = zybVar.itemView;
            if (view4222 instanceof TextView) {
            }
            if (textView != null) {
            }
            zybVar.itemView.setOnClickListener(new au7(20, materialCalendarView, fg2Var4));
        }
        drawable2 = null;
        hg2 displayLogic11222 = materialCalendarView.getDisplayLogic();
        if (displayLogic11222 == null) {
        }
        float f222 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!l) {
        }
        if (l) {
        }
        displayLogic2 = materialCalendarView.getDisplayLogic();
        if (displayLogic2 == null) {
        }
        if (z4) {
        }
        if (drawable == null) {
        }
        if (drawable == null) {
        }
        valueOf.getClass();
        View view42222 = zybVar.itemView;
        if (view42222 instanceof TextView) {
        }
        if (textView != null) {
        }
        zybVar.itemView.setOnClickListener(new au7(20, materialCalendarView, fg2Var4));
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        MaterialCalendarView materialCalendarView = this.d;
        int i2 = materialCalendarView.m;
        if (i == 0) {
            TextView textView = new TextView(context);
            textView.setTextAppearance(R.style.CalendarDayOfWeek);
            textView.setBackgroundColor(context.getColor(R.color.surface_2));
            textView.setGravity(17);
            int i3 = materialCalendarView.n;
            textView.setPadding(0, i3, 0, i3);
            textView.setMaxLines(1);
            i2 = -2;
            view = textView;
        } else if (i != 2) {
            view = new Space(context);
        } else {
            TextView textView2 = new TextView(context);
            textView2.setTextAppearance(R.style.CalendarDay);
            textView2.setGravity(17);
            textView2.setMaxLines(1);
            view = textView2;
        }
        view.setLayoutParams(new hrf(-1, i2));
        return new zyb(view);
    }

    public final Drawable p(float f, int i) {
        Drawable mutate;
        MaterialCalendarView materialCalendarView = this.d;
        Drawable drawable = materialCalendarView.getContext().getDrawable(R.drawable.rectangle_2dp_corners);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        float f2 = materialCalendarView.p;
        float f3 = (f / 2.0f) + ((-materialCalendarView.m) / 2) + materialCalendarView.q + f2;
        mutate.setBounds(new Rect(0, wzb.b(f3), materialCalendarView.o, wzb.b(f2 + f3)));
        v9g.K(mutate, materialCalendarView.getContext().getColor(i));
        return mutate;
    }

    public final Drawable q(int i) {
        int i2 = R.drawable.bg_calendar_highlight_rounded_right;
        MaterialCalendarView materialCalendarView = this.d;
        if (i == 8388611) {
            Context context = materialCalendarView.getContext();
            Context context2 = materialCalendarView.getContext();
            context2.getClass();
            if (!hkg.c0(context2)) {
                i2 = R.drawable.bg_calendar_highlight_rounded_left;
            }
            return context.getDrawable(i2);
        }
        if (i != 8388613) {
            return materialCalendarView.getContext().getDrawable(R.drawable.bg_calendar_highlight_rect);
        }
        Context context3 = materialCalendarView.getContext();
        Context context4 = materialCalendarView.getContext();
        context4.getClass();
        if (hkg.c0(context4)) {
            i2 = R.drawable.bg_calendar_highlight_rounded_left;
        }
        return context3.getDrawable(i2);
    }
}
