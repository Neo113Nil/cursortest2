package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreSmallRatingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dse extends p8 {
    public final String c;
    public final List d;
    public final int e;
    public final yzc f;
    public final yj1 g;
    public final j22 h;
    public final List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dse(View view, String str, ArrayList arrayList, int i, yzc yzcVar, yj1 yj1Var) {
        super(view);
        view.getClass();
        str.getClass();
        arrayList.getClass();
        yzcVar.getClass();
        this.c = str;
        this.d = arrayList;
        this.e = i;
        this.f = yzcVar;
        this.g = yj1Var;
        j22 a = j22.a(view);
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) a.p;
        this.h = a;
        this.i = b.j(a.d, a.e, a.f, (TextView) a.g);
        if (str.equals(Sports.VOLLEYBALL)) {
            scrollInterceptorHorizontalScrollView.setPaddingRelative(scrollInterceptorHorizontalScrollView.getPaddingStart(), scrollInterceptorHorizontalScrollView.getPaddingTop(), 0, scrollInterceptorHorizontalScrollView.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = scrollInterceptorHorizontalScrollView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                throw null;
            }
            tl3 tl3Var = (tl3) layoutParams;
            tl3Var.B = 0;
            scrollInterceptorHorizontalScrollView.setLayoutParams(tl3Var);
            LinearLayout linearLayout = (LinearLayout) a.o;
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), 0, linearLayout.getPaddingBottom());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0288, code lost:
    
        if ((r3 == null ? defpackage.km5.a : r3).contains(com.sofascore.model.mvvm.model.BaseballRole.Pitcher) == false) goto L109;
     */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        j22 j22Var;
        TextView textView;
        Integer num;
        int i3;
        int i4;
        int i5;
        String u;
        int i6;
        Iterator it;
        TextView textView2;
        int i7;
        int i8;
        i22 i22Var = (i22) obj;
        i22Var.getClass();
        List list = i22Var.p;
        Player player = i22Var.n;
        Boolean bool = i22Var.r;
        ArrayList arrayList = i22Var.u;
        m22 m22Var = i22Var.m;
        boolean z = m22Var.i;
        String str = m22Var.a;
        j22 j22Var2 = this.h;
        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) j22Var2.q;
        if (z) {
            sofascoreSmallRatingView.setVisibility(0);
            SofascoreSmallRatingView.k(sofascoreSmallRatingView, i22Var.A, 6);
        } else {
            sofascoreSmallRatingView.setVisibility(8);
        }
        TextView textView3 = (TextView) j22Var2.j;
        TextView textView4 = (TextView) j22Var2.h;
        View view = j22Var2.n;
        TextView textView5 = (TextView) j22Var2.i;
        ImageView imageView = j22Var2.m;
        TextView textView6 = (TextView) j22Var2.l;
        ConstraintLayout constraintLayout = j22Var2.b;
        LinearLayout linearLayout = (LinearLayout) j22Var2.o;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) j22Var2.p;
        textView3.setVisibility(Intrinsics.c(i22Var.C, Boolean.TRUE) ? 0 : 8);
        boolean z2 = i22Var.z;
        List list2 = this.i;
        String str2 = this.c;
        if (z2) {
            j22Var = j22Var2;
            boolean z3 = constraintLayout.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
            if (z3) {
                constraintLayout.setLayoutDirection(1);
            }
            imageView.setVisibility(8);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                TextView textView7 = (TextView) it2.next();
                textView7.getClass();
                textView7.setVisibility(8);
                it2 = it3;
            }
            scrollInterceptorHorizontalScrollView.setVisibility(0);
            textView = textView6;
            scrollInterceptorHorizontalScrollView.setOnTouchListener(new an1(new GestureDetector(constraintLayout.getContext(), new wsk(linearLayout, scrollInterceptorHorizontalScrollView, constraintLayout)), 2));
            scrollInterceptorHorizontalScrollView.post(new ti5(z3, this, i22Var, 1));
            if (linearLayout.getChildCount() > 0) {
                linearLayout.removeAllViews();
            }
            int i9 = 0;
            for (Iterator it4 = arrayList.iterator(); it4.hasNext(); it4 = it) {
                Object next = it4.next();
                int i10 = i9 + 1;
                if (i9 < 0) {
                    b.q();
                    throw null;
                }
                y12 y12Var = (y12) next;
                if (i9 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i9);
                    if (childAt == null) {
                        yhk.s("null cannot be cast to non-null type android.widget.TextView");
                        return;
                    } else {
                        textView2 = (TextView) childAt;
                        textView2.setVisibility(0);
                        it = it4;
                    }
                } else {
                    Context context = linearLayout.getContext();
                    context.getClass();
                    AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                    Context context2 = linearLayout.getContext();
                    context2.getClass();
                    it = it4;
                    appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(ao2.s(42, context2), -1));
                    appCompatTextView.setTextAppearance(R.style.BodyMedium);
                    appCompatTextView.setGravity(17);
                    appCompatTextView.setTextDirection(3);
                    linearLayout.addView(appCompatTextView);
                    textView2 = appCompatTextView;
                }
                if (!Intrinsics.c(y12Var, i22Var.v) || Intrinsics.c(str2, Sports.BASEBALL)) {
                    haa.C(textView2);
                } else {
                    haa.G(textView2);
                }
                String str3 = y12Var.i;
                if (str3 == null) {
                    i7 = 0;
                    i8 = 8;
                } else if (str3.length() == 0) {
                    i8 = 8;
                    i7 = 0;
                } else {
                    i7 = 0;
                    textView2.setVisibility(0);
                    textView2.setText(str3);
                    textView2.setVisibility(i7);
                    textView2.setText(str3);
                    i9 = i10;
                }
                textView2.setVisibility(i8);
                textView2.setVisibility(i7);
                textView2.setText(str3);
                i9 = i10;
            }
            scrollInterceptorHorizontalScrollView.setOnScrollChangeListener(new bn1(2, this, i22Var));
            num = null;
        } else {
            j22Var = j22Var2;
            textView = textView6;
            imageView.setVisibility(0);
            as9.l(imageView, player.getId(), null);
            scrollInterceptorHorizontalScrollView.setVisibility(8);
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                if (!((y12) next2).g) {
                    arrayList2.add(next2);
                }
            }
            int i11 = 0;
            for (Object obj2 : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    b.q();
                    throw null;
                }
                TextView textView8 = (TextView) obj2;
                if (i11 < this.e) {
                    y12 y12Var2 = (y12) CollectionsKt.a0(i11, arrayList2);
                    if (!Intrinsics.c(y12Var2, i22Var.v) || Intrinsics.c(str2, Sports.BASEBALL)) {
                        textView8.getClass();
                        haa.C(textView8);
                    } else {
                        textView8.getClass();
                        haa.G(textView8);
                    }
                    textView8.setText(y12Var2 != null ? y12Var2.i : null);
                    textView8.setVisibility(0);
                } else {
                    textView8.getClass();
                    textView8.setVisibility(8);
                }
                i11 = i12;
            }
            num = null;
        }
        if (Intrinsics.c(str2, Sports.BASKETBALL) && Intrinsics.c(bool, Boolean.FALSE)) {
            i3 = 0;
            view.setVisibility(0);
            textView4.setVisibility(!i22Var.z ? 0 : 8);
        } else {
            i3 = 0;
            view.setVisibility(8);
            textView4.setVisibility(8);
        }
        boolean c = Intrinsics.c(str2, Sports.BASEBALL);
        Context context3 = this.b;
        if (c) {
            ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (Intrinsics.c(bool, Boolean.TRUE)) {
                if (!Intrinsics.c(str, "BATTING_SUMMARY")) {
                    if (Intrinsics.c(str, "FIELDING_SUMMARY")) {
                    }
                }
                i6 = 32;
                marginLayoutParams.setMarginStart(ao2.s(i6, context3));
                textView5.setLayoutParams(marginLayoutParams);
            }
            i6 = 16;
            marginLayoutParams.setMarginStart(ao2.s(i6, context3));
            textView5.setLayoutParams(marginLayoutParams);
        }
        if (Intrinsics.c(i22Var.t, Boolean.TRUE)) {
            haa.B(textView5);
        } else {
            haa.C(textView5);
        }
        textView5.setText(tba.C(player));
        String str4 = i22Var.o;
        Integer num2 = i22Var.B;
        if (num2 == null || !((Boolean) this.g.invoke()).booleanValue()) {
            num2 = num;
        }
        TextView textView9 = textView;
        textView9.setVisibility((str4 == null && num2 == null) ? 8 : i3);
        textView9.setText(str4);
        Object R = num2 != null ? pco.R(num2.intValue()) : num;
        ua5 ua5Var = ua5.a;
        Integer valueOf = Integer.valueOf(ao2.s(16, context3));
        Context context4 = textView9.getContext();
        context4.getClass();
        apf a = ajh.a(context4);
        Context context5 = textView9.getContext();
        context5.getClass();
        ht9 ht9Var = new ht9(context5);
        ht9Var.c = R;
        ht9Var.d = new pfj(textView9, ua5Var, valueOf);
        a.a(ht9Var.a());
        if (str4 == null || str4.length() == 0) {
            i4 = 8;
            i5 = i3;
        } else {
            i4 = 8;
            i5 = ao2.s(8, context3);
        }
        textView9.setCompoundDrawablePadding(i5);
        j22 j22Var3 = j22Var;
        TextView textView10 = (TextView) j22Var3.k;
        if (list != null) {
            u = CollectionsKt.f0(list, null, null, null, new jie(13), 31);
        } else {
            String str5 = i22Var.q;
            u = str5 != null ? dti.u(context3, player.getGender(), str2, str5, i22Var.z) : "";
        }
        textView10.setText(u);
        View view2 = j22Var3.c;
        List list3 = this.d;
        view2.setVisibility((i == list3.size() + (-1) || !(list3.get(i + 1) instanceof i22)) ? i4 : i3);
    }
}
