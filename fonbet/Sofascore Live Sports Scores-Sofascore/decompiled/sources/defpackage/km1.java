package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.mvvm.model.BaseballEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerMatchesEventStatistics;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class km1 extends p8 {
    public final /* synthetic */ int c = 0;
    public final krk d;
    public final Object e;
    public final Object f;
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public km1(nr1 nr1Var, s26 s26Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        constraintLayout.getClass();
        this.d = nr1Var;
        this.e = s26Var;
        this.f = this.b.getDrawable(R.drawable.ic_placeholder_image);
        this.g = this.b.getDrawable(R.drawable.placeholder_rectangle);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0391  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        int i6;
        km1 km1Var;
        String str;
        String str2;
        TextView textView;
        int i7;
        TextView textView2;
        ArrayList arrayList;
        Iterator it;
        int i8 = this.c;
        String str3 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
        String str4 = "null cannot be cast to non-null type android.widget.TextView";
        Object obj2 = this.f;
        Object obj3 = this.g;
        Object obj4 = this.e;
        krk krkVar = this.d;
        int i9 = 0;
        Context context = this.b;
        switch (i8) {
            case 0:
                hm1 hm1Var = (hm1) obj;
                hm1Var.getClass();
                bv1 bv1Var = (bv1) krkVar;
                TextView textView3 = (TextView) bv1Var.c;
                ImageView imageView = (ImageView) bv1Var.e;
                TextView textView4 = (TextView) bv1Var.h;
                TextView textView5 = (TextView) bv1Var.g;
                LinearLayout linearLayout = (LinearLayout) bv1Var.f;
                textView3.setText(hm1Var.P.a);
                ((TextView) bv1Var.d).setText(hm1Var.Q.a);
                BaseballEvent baseballEvent = hm1Var.O;
                Team homeTeam$default = Event.getHomeTeam$default(baseballEvent, null, 1, null);
                int id = homeTeam$default.getId();
                Integer num = hm1Var.l;
                Team team = (num != null && id == num.intValue()) ? null : homeTeam$default;
                if (team == null) {
                    team = Event.getAwayTeam$default(baseballEvent, null, 1, null);
                }
                as9.o(imageView, team.getId());
                imageView.setOnClickListener(new cn(6, bv1Var, team));
                jfj jfjVar = hm1Var.S;
                if (jfjVar != null) {
                    textView4.setVisibility(0);
                    textView5.setVisibility(8);
                    f6a.g(textView4, jfjVar);
                }
                jfj jfjVar2 = hm1Var.R;
                if (jfjVar2 != null) {
                    textView5.setText(jfjVar2.a);
                    Integer num2 = jfjVar2.b;
                    if (num2 != null) {
                        z8e.V(context.getColor(num2.intValue()), textView5);
                    }
                    textView5.setVisibility(0);
                    textView4.setVisibility(8);
                }
                tug tugVar = (tug) obj4;
                if (tugVar != null) {
                    tugVar.a((ScrollInterceptorHorizontalScrollView) bv1Var.j, null);
                }
                v8a v8aVar = hm1Var.I;
                wse wseVar = v8aVar instanceof wse ? (wse) v8aVar : null;
                w91 w91Var = wseVar != null ? wseVar.i : null;
                List list = w91Var != null ? w91Var.b : null;
                if (list != null) {
                    int i10 = 0;
                    for (Object obj5 : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            b.q();
                            throw null;
                        }
                        yse yseVar = (yse) obj5;
                        PlayerMatchesEventStatistics playerMatchesEventStatistics = hm1Var.H;
                        if (playerMatchesEventStatistics != null) {
                            if (i10 < linearLayout.getChildCount()) {
                                View childAt = linearLayout.getChildAt(i10);
                                if (childAt == null) {
                                    yhk.s(str4);
                                    return;
                                }
                                textView = (TextView) childAt;
                                i7 = 0;
                                textView.setVisibility(0);
                                str = str3;
                                str2 = str4;
                            } else {
                                textView = u22.c(LayoutInflater.from(context), linearLayout).b;
                                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                                str = str3;
                                if (layoutParams == null) {
                                    yhk.s(str);
                                    return;
                                }
                                Context context2 = textView.getContext();
                                context2.getClass();
                                str2 = str4;
                                layoutParams.width = ao2.v(40, context2);
                                textView.setLayoutParams(layoutParams);
                                linearLayout.addView(textView);
                                i7 = 0;
                            }
                            textView.setVisibility(i7);
                            textView.setText(((Boolean) w91Var.c.invoke(playerMatchesEventStatistics)).booleanValue() ? (CharSequence) yseVar.d().invoke(playerMatchesEventStatistics) : textView.getContext().getString(R.string.hypen));
                            textView.setSelected(false);
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        i10 = i11;
                        str3 = str;
                        str4 = str2;
                    }
                }
                if (list != null) {
                    i3 = 1;
                    i4 = list.size() - 1;
                } else {
                    i3 = 1;
                    i4 = 0;
                }
                z8e.J(linearLayout, i4);
                Integer num3 = hm1Var.l;
                if (num3 != null) {
                    if (num3.intValue() == Event.getAwayTeam$default(baseballEvent, null, i3, null).getId()) {
                        i5 = 2;
                        Team homeTeam$default2 = i5 != i3 ? Event.getHomeTeam$default(baseballEvent, null, i3, null) : Event.getAwayTeam$default(baseballEvent, null, i3, null);
                        if (ok3.E(baseballEvent)) {
                            linearLayout.setOnTouchListener(null);
                            i6 = 0;
                            aba.y(linearLayout, 0, 3);
                            km1Var = this;
                            z8e.a0(linearLayout, 1000L, new im1(km1Var, hm1Var, homeTeam$default2, i5, 0));
                        } else {
                            linearLayout.setOnClickListener(null);
                            linearLayout.setOnTouchListener((jm1) obj3);
                            i6 = 0;
                            km1Var = this;
                        }
                        ((View) bv1Var.i).setVisibility(i6);
                        ((ConstraintLayout) bv1Var.b).post(new r0(22, bv1Var, km1Var));
                        return;
                    }
                }
                i5 = i3;
                Team homeTeam$default22 = i5 != i3 ? Event.getHomeTeam$default(baseballEvent, null, i3, null) : Event.getAwayTeam$default(baseballEvent, null, i3, null);
                if (ok3.E(baseballEvent)) {
                }
                ((View) bv1Var.i).setVisibility(i6);
                ((ConstraintLayout) bv1Var.b).post(new r0(22, bv1Var, km1Var));
                return;
            case 1:
                a6c a6cVar = (a6c) obj;
                Drawable drawable = (Drawable) obj3;
                Function1 function1 = (Function1) obj4;
                a6cVar.getClass();
                nr1 nr1Var = (nr1) krkVar;
                ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
                constraintLayout.getClass();
                sea.v(constraintLayout, false, ((Boolean) function1.invoke(Integer.valueOf(i))).booleanValue(), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                constraintLayout.getClass();
                constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), ((Boolean) function1.invoke(Integer.valueOf(i))).booleanValue() ? ao2.s(8, context) + ao2.s(12, context) : ao2.s(12, context));
                ImageView imageView2 = (ImageView) nr1Var.e;
                TextView textView6 = (TextView) nr1Var.h;
                ImageView imageView3 = (ImageView) nr1Var.f;
                imageView2.setClipToOutline(true);
                f9g f9gVar = a6cVar.a;
                textView6.setText(f9gVar.b);
                haa.C(textView6);
                TextView textView7 = nr1Var.b;
                String str5 = f9gVar.c;
                String str6 = f9gVar.d;
                textView7.setText(str5);
                ((TextView) nr1Var.i).setVisibility(8);
                ((TextView) nr1Var.d).setText(f9gVar.f);
                if (str6.length() > 0) {
                    as9.f(imageView2, str6, drawable);
                    imageView3.setVisibility(8);
                    return;
                } else {
                    imageView3.setVisibility(0);
                    imageView3.setImageDrawable((Drawable) obj2);
                    imageView2.setImageDrawable(drawable);
                    return;
                }
            default:
                qyi qyiVar = (qyi) obj;
                qyiVar.getClass();
                v82 v82Var = (v82) krkVar;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) v82Var.d;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) v82Var.b;
                LinearLayout linearLayout2 = (LinearLayout) v82Var.h;
                ((tug) obj4).a(scrollInterceptorHorizontalScrollView, null);
                TextView textView8 = (TextView) v82Var.e;
                Player player = qyiVar.a;
                ArrayList arrayList2 = qyiVar.c;
                textView8.setText(tba.t(player));
                TextView textView9 = (TextView) v82Var.f;
                textView9.setText(player.getJerseyNumber());
                String jerseyNumber = player.getJerseyNumber();
                textView9.setVisibility(Intrinsics.c(jerseyNumber != null ? Boolean.valueOf(StringsKt.R(jerseyNumber) ^ true) : null, Boolean.TRUE) ? 0 : 8);
                ((TextView) v82Var.g).setText(dti.u(context, player.getGender(), (String) obj2, player.getPosition(), false));
                Iterator it2 = arrayList2.iterator();
                int i12 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        b.q();
                        throw null;
                    }
                    Pair pair = (Pair) next;
                    if (i12 < linearLayout2.getChildCount()) {
                        View childAt2 = linearLayout2.getChildAt(i12);
                        if (childAt2 == null) {
                            yhk.s("null cannot be cast to non-null type android.widget.TextView");
                            return;
                        }
                        textView2 = (TextView) childAt2;
                        textView2.setVisibility(i9);
                        arrayList = arrayList2;
                        it = it2;
                    } else {
                        textView2 = u22.c(LayoutInflater.from(context), linearLayout2).b;
                        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                        if (layoutParams2 == null) {
                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            return;
                        }
                        arrayList = arrayList2;
                        Context context3 = textView2.getContext();
                        context3.getClass();
                        it = it2;
                        layoutParams2.width = ao2.v(38, context3);
                        textView2.setLayoutParams(layoutParams2);
                        linearLayout2.addView(textView2);
                    }
                    textView2.setText((CharSequence) pair.a);
                    textView2.setSelected(i12 == ((Number) ((tj4) obj3).invoke()).intValue());
                    arrayList2 = arrayList;
                    i12 = i13;
                    it2 = it;
                    i9 = 0;
                }
                z8e.J(linearLayout2, arrayList2.size() - 1);
                ((MaterialDivider) v82Var.c).setVisibility(i < i2 + (-1) ? 0 : 8);
                scrollInterceptorHorizontalScrollView.setOnTouchListener(new an1(new GestureDetector(constraintLayout2.getContext(), new wsk(linearLayout2, scrollInterceptorHorizontalScrollView, constraintLayout2)), 3));
                constraintLayout2.post(new ecg(9, v82Var, this));
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public km1(v82 v82Var, tug tugVar, String str, tj4 tj4Var) {
        super(r0);
        tugVar.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        constraintLayout.getClass();
        this.d = v82Var;
        this.e = tugVar;
        this.f = str;
        this.g = tj4Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public km1(bv1 bv1Var, tug tugVar, gt8 gt8Var) {
        super(r1);
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        constraintLayout.getClass();
        this.d = bv1Var;
        this.e = tugVar;
        this.f = gt8Var;
        this.g = new jm1(0, new csf(), new asf(), this);
    }
}
