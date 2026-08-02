package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.PopupWindow;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentCalendarRailView;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HashMap hashMap;
        int height;
        int height2;
        int height3;
        int height4;
        int i9 = this.a;
        int i10 = 2;
        int i11 = 1;
        Object obj = this.b;
        switch (i9) {
            case 0:
                mqi mqiVar = ((s8) obj).q;
                if (i7 != i3) {
                    ((osi) mqiVar.getValue()).b();
                    ((osi) mqiVar.getValue()).a();
                    return;
                }
                return;
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                view.post(new y2(carouselLayoutManager, 25));
                return;
            case 2:
                CupTreeExtendedView.p((CupTreeExtendedView) obj, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 3:
                EventBoxScoreFragment eventBoxScoreFragment = (EventBoxScoreFragment) obj;
                krk krkVar = eventBoxScoreFragment.l;
                krkVar.getClass();
                if (((a22) krkVar).e.getChildCount() == 1) {
                    krk krkVar2 = eventBoxScoreFragment.l;
                    krkVar2.getClass();
                    ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) p12.a(((a22) krkVar2).e.getChildAt(0)).g;
                    hf9 hf9Var = (hf9) eventBoxScoreFragment.u.d();
                    if (hf9Var == null || (hashMap = hf9Var.d) == null) {
                        return;
                    }
                    m22 m22Var = eventBoxScoreFragment.y;
                    Integer num = (Integer) hashMap.get(m22Var != null ? m22Var.a : null);
                    if (num != null) {
                        scrollInterceptorHorizontalScrollView.scrollTo(num.intValue(), 0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment = (EventHockeyPlayByPlayFragment) obj;
                krk krkVar3 = eventHockeyPlayByPlayFragment.l;
                krkVar3.getClass();
                if (((yq8) krkVar3).c.canScrollVertically(1)) {
                    return;
                }
                eventHockeyPlayByPlayFragment.C();
                return;
            case 5:
                FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = (FeaturedTournamentCalendarRailView) obj;
                int i12 = FeaturedTournamentCalendarRailView.f;
                if (i == i5 && i3 == i7) {
                    return;
                }
                featuredTournamentCalendarRailView.scrollToPosition(featuredTournamentCalendarRailView.a.m);
                return;
            case 6:
                one oneVar = (one) obj;
                int i13 = oneVar.s;
                PopupWindow popupWindow = oneVar.r;
                int i14 = i4 - i2;
                int i15 = i8 - i6;
                if (!(i3 - i == i7 - i5 && i14 == i15) && popupWindow.isShowing()) {
                    oneVar.u();
                    popupWindow.update(view, (oneVar.getWidth() - popupWindow.getWidth()) - i13, (-popupWindow.getHeight()) - i13, -1, -1);
                    return;
                }
                return;
            case 7:
                tne tneVar = (tne) obj;
                one oneVar2 = tneVar.a;
                int width = (oneVar2.getWidth() - oneVar2.getPaddingLeft()) - oneVar2.getPaddingRight();
                int height5 = (oneVar2.getHeight() - oneVar2.getPaddingBottom()) - oneVar2.getPaddingTop();
                ViewGroup viewGroup = tneVar.d;
                int c = tne.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int max = Math.max(c, tne.c(tneVar.l) + tne.c(tneVar.j));
                ViewGroup viewGroup2 = tneVar.e;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z = width <= max || height5 <= (height2 * 2) + paddingBottom;
                if (tneVar.B != z) {
                    tneVar.B = z;
                    view.post(new pne(tneVar, i11));
                }
                r3 = i3 - i != i7 - i5;
                if (tneVar.B || !r3) {
                    return;
                }
                view.post(new pne(tneVar, i10));
                return;
            case 8:
                yhg yhgVar = (yhg) obj;
                sdg sdgVar = yhgVar.m;
                if (sdgVar == null) {
                    Intrinsics.i("rootLayout");
                    throw null;
                }
                WindowInsets rootWindowInsets = sdgVar.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    sdg sdgVar2 = yhgVar.m;
                    if (sdgVar2 != null) {
                        sdgVar2.dispatchApplyWindowInsets(rootWindowInsets);
                        return;
                    } else {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                }
                return;
            case 9:
                cji cjiVar = (cji) obj;
                int i16 = cjiVar.l;
                PopupWindow popupWindow2 = cjiVar.k;
                int i17 = i4 - i2;
                int i18 = i8 - i6;
                if (!(i3 - i == i7 - i5 && i17 == i18) && popupWindow2.isShowing()) {
                    cjiVar.o();
                    popupWindow2.update(view, (cjiVar.getWidth() - popupWindow2.getWidth()) - i16, (-popupWindow2.getHeight()) - i16, -1, -1);
                    return;
                }
                return;
            case 10:
                hji hjiVar = (hji) obj;
                cji cjiVar2 = hjiVar.a;
                int width2 = (cjiVar2.getWidth() - cjiVar2.getPaddingLeft()) - cjiVar2.getPaddingRight();
                int height6 = (cjiVar2.getHeight() - cjiVar2.getPaddingBottom()) - cjiVar2.getPaddingTop();
                ViewGroup viewGroup3 = hjiVar.c;
                int c2 = hji.c(viewGroup3) - (viewGroup3 != null ? viewGroup3.getPaddingRight() + viewGroup3.getPaddingLeft() : 0);
                if (viewGroup3 == null) {
                    height3 = 0;
                } else {
                    height3 = viewGroup3.getHeight();
                    ViewGroup.LayoutParams layoutParams3 = viewGroup3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        height3 += marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                    }
                }
                int paddingBottom2 = height3 - (viewGroup3 != null ? viewGroup3.getPaddingBottom() + viewGroup3.getPaddingTop() : 0);
                int max2 = Math.max(c2, hji.c(hjiVar.k) + hji.c(hjiVar.i));
                ViewGroup viewGroup4 = hjiVar.d;
                if (viewGroup4 == null) {
                    height4 = 0;
                } else {
                    height4 = viewGroup4.getHeight();
                    ViewGroup.LayoutParams layoutParams4 = viewGroup4.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        height4 += marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin;
                    }
                }
                boolean z2 = width2 <= max2 || height6 <= (height4 * 2) + paddingBottom2;
                if (hjiVar.A != z2) {
                    hjiVar.A = z2;
                    view.post(new dji(hjiVar, i11));
                }
                r3 = i3 - i != i7 - i5;
                if (hjiVar.A || !r3) {
                    return;
                }
                view.post(new dji(hjiVar, i10));
                return;
            case 11:
                mqi mqiVar2 = ((h4k) obj).m;
                ArrayList Y0 = CollectionsKt.Y0(b.j(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), b.j(Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)));
                if (!Y0.isEmpty()) {
                    Iterator it = Y0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            if (((Number) pair.a).intValue() != ((Number) pair.b).intValue()) {
                                r3 = true;
                            }
                        }
                    }
                }
                if ((r3 ? Boolean.valueOf(r3) : null) != null) {
                    ((osi) mqiVar2.getValue()).b();
                    ((osi) mqiVar2.getValue()).a();
                    return;
                }
                return;
            default:
                rlk rlkVar = (rlk) obj;
                zqk zqkVar = rlkVar.q;
                if (zqkVar != null) {
                    rlkVar.onVideoSizeChanged(zqkVar);
                    return;
                }
                return;
        }
    }
}
