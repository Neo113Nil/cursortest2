package com.sofascore.results.calendar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.setting.i;
import com.sofascore.results.R;
import com.sofascore.results.calendar.MaterialCalendarView;
import com.vungle.ads.internal.task.g;
import defpackage.ao2;
import defpackage.czb;
import defpackage.dzb;
import defpackage.ezb;
import defpackage.fg2;
import defpackage.gg2;
import defpackage.hg2;
import defpackage.hs4;
import defpackage.ida;
import defpackage.j41;
import defpackage.joa;
import defpackage.k6b;
import defpackage.mi;
import defpackage.n2l;
import defpackage.o8;
import defpackage.ogb;
import defpackage.q3;
import defpackage.qha;
import defpackage.rob;
import defpackage.sw9;
import defpackage.u6b;
import defpackage.wca;
import defpackage.wg2;
import defpackage.wyb;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yyb;
import defpackage.z45;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0013!678J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010%\u001a\u00060!R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0004¨\u00069"}, d2 = {"Lcom/sofascore/results/calendar/MaterialCalendarView;", "Lo8;", "", "getLayoutId", "()I", "Landroid/widget/ImageView;", "button", "", "setupDirectionButton", "(Landroid/widget/ImageView;)V", "Lhg2;", U3.i.X, "d", "Lhg2;", "getDisplayLogic", "()Lhg2;", "setDisplayLogic", "(Lhg2;)V", "displayLogic", "Lyyb;", "e", "Lyyb;", "getDateSelectedListener", "()Lyyb;", "setDateSelectedListener", "(Lyyb;)V", "dateSelectedListener", "Lezb;", InneractiveMediationDefs.GENDER_FEMALE, "Ljoa;", "getBinding", "()Lezb;", "binding", "Lczb;", g.e, "getMonthsAdapter", "()Lczb;", "monthsAdapter", "Lgg2;", h.b, "getTitleFormatter", "()Lgg2;", "titleFormatter", "Ln2l;", i.a, "getWeekDayFormatter", "()Ln2l;", "weekDayFormatter", "Lfg2;", "getCurrentlyShownMonth", "()Lfg2;", "currentlyShownMonth", "getFirstDayOfWeek", "firstDayOfWeek", "azb", "bzb", "zyb", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MaterialCalendarView extends o8 {
    public static final /* synthetic */ int C = 0;
    public fg2 A;
    public fg2 B;

    /* renamed from: d, reason: from kotlin metadata */
    public hg2 displayLogic;

    /* renamed from: e, reason: from kotlin metadata */
    public yyb dateSelectedListener;

    /* renamed from: f, reason: from kotlin metadata */
    public final joa binding;

    /* renamed from: g, reason: from kotlin metadata */
    public final joa monthsAdapter;

    /* renamed from: h, reason: from kotlin metadata */
    public final joa titleFormatter;

    /* renamed from: i, reason: from kotlin metadata */
    public final joa weekDayFormatter;
    public final int j;
    public final int k;
    public final Calendar l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final ida r;
    public Drawable s;
    public Drawable t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public Drawable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialCalendarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: xyb
            public final /* synthetic */ MaterialCalendarView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MaterialCalendarView materialCalendarView = this.b;
                switch (i2) {
                    case 0:
                        int i3 = MaterialCalendarView.C;
                        View root = materialCalendarView.getRoot();
                        int i4 = R.id.buttonFuture;
                        ImageView imageView = (ImageView) nq8.B(R.id.buttonFuture, root);
                        if (imageView != null) {
                            i4 = R.id.buttonPast;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.buttonPast, root);
                            if (imageView2 != null) {
                                i4 = R.id.calendarTitle;
                                TextView textView = (TextView) nq8.B(R.id.calendarTitle, root);
                                if (textView != null) {
                                    i4 = R.id.pager;
                                    ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.pager, root);
                                    if (viewPager2 != null) {
                                        return new ezb((LinearLayout) root, imageView, imageView2, textView, viewPager2);
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = MaterialCalendarView.C;
                        return new czb(materialCalendarView);
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.binding = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.monthsAdapter = ypa.a(ysaVar, new Function0(this) { // from class: xyb
            public final /* synthetic */ MaterialCalendarView b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MaterialCalendarView materialCalendarView = this.b;
                switch (i22) {
                    case 0:
                        int i3 = MaterialCalendarView.C;
                        View root = materialCalendarView.getRoot();
                        int i4 = R.id.buttonFuture;
                        ImageView imageView = (ImageView) nq8.B(R.id.buttonFuture, root);
                        if (imageView != null) {
                            i4 = R.id.buttonPast;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.buttonPast, root);
                            if (imageView2 != null) {
                                i4 = R.id.calendarTitle;
                                TextView textView = (TextView) nq8.B(R.id.calendarTitle, root);
                                if (textView != null) {
                                    i4 = R.id.pager;
                                    ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.pager, root);
                                    if (viewPager2 != null) {
                                        return new ezb((LinearLayout) root, imageView, imageView2, textView, viewPager2);
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i4)));
                        return null;
                    default:
                        int i5 = MaterialCalendarView.C;
                        return new czb(materialCalendarView);
                }
            }
        });
        int i3 = 25;
        this.titleFormatter = ypa.a(ysaVar, new ogb(i3));
        this.weekDayFormatter = ypa.a(ysaVar, new ogb(26));
        this.j = 600;
        this.k = 600;
        this.l = Calendar.getInstance();
        this.m = ao2.s(44, context);
        this.n = ao2.s(8, context);
        this.o = ao2.s(8, context);
        this.p = ao2.s(4, context);
        this.q = ao2.s(2, context);
        this.r = new ida(this, 24);
        setupDirectionButton(getBinding().c);
        setupDirectionButton(getBinding().b);
        ViewPager2 viewPager2 = getBinding().e;
        viewPager2.setAdapter(getMonthsAdapter());
        viewPager2.setPageTransformer(new sw9(i3));
        viewPager2.a(new j41(this, 10));
        czb monthsAdapter = getMonthsAdapter();
        fg2 currentlyShownMonth = getCurrentlyShownMonth();
        monthsAdapter.getClass();
        currentlyShownMonth.getClass();
        viewPager2.c(currentlyShownMonth.e(monthsAdapter.o()), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ezb getBinding() {
        return (ezb) this.binding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fg2 getCurrentlyShownMonth() {
        return getMonthsAdapter().p(getBinding().e.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFirstDayOfWeek() {
        hg2 hg2Var = this.displayLogic;
        if (hg2Var != null) {
            return hg2Var.k();
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final czb getMonthsAdapter() {
        return (czb) this.monthsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg2 getTitleFormatter() {
        return (gg2) this.titleFormatter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n2l getWeekDayFormatter() {
        return (n2l) this.weekDayFormatter.getValue();
    }

    private final void setupDirectionButton(ImageView button) {
        button.setRotation(((-(Intrinsics.c(button, getBinding().b) ? 1 : -1)) * 90.0f) + getContext().getResources().getInteger(R.integer.rtl_rotation));
        button.setOnClickListener(new wyb(0, this.r));
    }

    public static final Unit v(MaterialCalendarView materialCalendarView, View view) {
        view.getClass();
        ViewPager2 viewPager2 = materialCalendarView.getBinding().e;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + (view.equals(materialCalendarView.getBinding().b) ? 1 : -1));
        return Unit.a;
    }

    @Nullable
    public final yyb getDateSelectedListener() {
        return this.dateSelectedListener;
    }

    @Nullable
    public final hg2 getDisplayLogic() {
        return this.displayLogic;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.material_calendar_view;
    }

    public final void r() {
        hg2 hg2Var = this.displayLogic;
        Boolean valueOf = hg2Var != null ? Boolean.valueOf(hg2Var.i()) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.c(valueOf, bool)) {
            s();
        } else {
            hg2 hg2Var2 = this.displayLogic;
            if (Intrinsics.c(hg2Var2 != null ? Boolean.valueOf(hg2Var2.f()) : null, bool)) {
                t();
            } else {
                hg2 hg2Var3 = this.displayLogic;
                if (Intrinsics.c(hg2Var3 != null ? Boolean.valueOf(hg2Var3.p()) : null, bool)) {
                    hg2 hg2Var4 = this.displayLogic;
                    fg2 m = hg2Var4 != null ? hg2Var4.m() : null;
                    hg2 hg2Var5 = this.displayLogic;
                    fg2 d = hg2Var5 != null ? hg2Var5.d() : null;
                    if (m != null && d != null) {
                        this.A = m;
                        this.B = d;
                    }
                }
            }
        }
        getMonthsAdapter().notifyDataSetChanged();
    }

    public final void s() {
        hg2 hg2Var = this.displayLogic;
        if (hg2Var != null) {
            fg2 o = hg2Var.o();
            this.A = fg2.a(o, -3);
            this.B = fg2.a(o, 3);
        }
    }

    public final void setDateSelectedListener(@Nullable yyb yybVar) {
        this.dateSelectedListener = yybVar;
    }

    public final void setDisplayLogic(@Nullable hg2 hg2Var) {
        this.displayLogic = hg2Var;
        r();
    }

    public final void t() {
        hg2 hg2Var = this.displayLogic;
        if (hg2Var != null) {
            fg2 o = hg2Var.o();
            DayOfWeek e = hg2Var.e();
            e.getClass();
            LocalDate with = LocalDate.of(o.a, o.b + 1, o.c).with(TemporalAdjusters.previousOrSame(e));
            LocalDate plusDays = with.plusDays(6L);
            fg2 fg2Var = new fg2(with.getYear(), with.getMonthValue() - 1, with.getDayOfMonth());
            fg2 fg2Var2 = new fg2(plusDays.getYear(), plusDays.getMonthValue() - 1, plusDays.getDayOfMonth());
            this.A = fg2Var;
            this.B = fg2Var2;
        }
    }

    public final void u(fg2 fg2Var, fg2 fg2Var2, boolean z, mi miVar) {
        if (fg2Var.e(fg2Var2) != 0) {
            czb monthsAdapter = getMonthsAdapter();
            czb monthsAdapter2 = getMonthsAdapter();
            monthsAdapter2.getClass();
            monthsAdapter.notifyItemChanged(fg2Var2.e(monthsAdapter2.o()));
        }
        int currentItem = getBinding().e.getCurrentItem();
        czb monthsAdapter3 = getMonthsAdapter();
        monthsAdapter3.getClass();
        int e = fg2Var.e(monthsAdapter3.o());
        if (currentItem != e) {
            if (miVar != null) {
                getBinding().e.a(new dzb(miVar, this));
            }
            getBinding().e.c(e, z);
        } else if (miVar != null) {
            miVar.invoke();
        }
        getMonthsAdapter().notifyItemChanged(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(fg2 fg2Var) {
        CalendarView calendarView;
        u6b w;
        hg2 hg2Var = this.displayLogic;
        fg2 o = hg2Var != null ? hg2Var.o() : new fg2();
        czb monthsAdapter = getMonthsAdapter();
        monthsAdapter.getClass();
        int e = o.e(monthsAdapter.o());
        yyb yybVar = this.dateSelectedListener;
        Object[] objArr = 0;
        if (yybVar != null && (w = qha.w((calendarView = ((wg2) yybVar).a))) != null) {
            k6b x = wca.x(w.getLifecycle());
            hs4 hs4Var = z45.a;
            xw3.L(x, rob.a, null, new q3(calendarView, objArr == true ? 1 : 0, 15), 2);
        }
        hg2 hg2Var2 = this.displayLogic;
        if (hg2Var2 != null) {
            hg2Var2.q(fg2Var);
        }
        hg2 hg2Var3 = this.displayLogic;
        Boolean valueOf = hg2Var3 != null ? Boolean.valueOf(hg2Var3.f()) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.c(valueOf, bool)) {
            t();
        } else {
            hg2 hg2Var4 = this.displayLogic;
            if (Intrinsics.c(hg2Var4 != null ? Boolean.valueOf(hg2Var4.i()) : null, bool)) {
                s();
            } else {
                hg2 hg2Var5 = this.displayLogic;
                if (Intrinsics.c(hg2Var5 != null ? Boolean.valueOf(hg2Var5.p()) : null, bool)) {
                    hg2 hg2Var6 = this.displayLogic;
                    fg2 m = hg2Var6 != null ? hg2Var6.m() : null;
                    hg2 hg2Var7 = this.displayLogic;
                    fg2 d = hg2Var7 != null ? hg2Var7.d() : null;
                    if (m != null && d != null) {
                        this.A = m;
                        this.B = d;
                    }
                }
            }
        }
        czb monthsAdapter2 = getMonthsAdapter();
        monthsAdapter2.getClass();
        int e2 = fg2Var.e(monthsAdapter2.o());
        getMonthsAdapter().notifyItemChanged(e);
        if (e2 != e) {
            getMonthsAdapter().notifyItemChanged(e2);
        }
    }

    public final void x(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fg2 fg2Var = (fg2) it.next();
            czb monthsAdapter = getMonthsAdapter();
            czb monthsAdapter2 = getMonthsAdapter();
            monthsAdapter2.getClass();
            fg2Var.getClass();
            monthsAdapter.notifyItemChanged(fg2Var.e(monthsAdapter2.o()));
        }
    }
}
