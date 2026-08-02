package ve;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.d1;
import com.sports.insider.MyApp;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.views.BottomListMenuOptionView;
import com.sports.insider.ui.views.CheckPrice;
import com.sports.insider.ui.views.HomeRowView;
import com.sports.insider.ui.views.LivePrice;
import com.sports.insider.ui.views.ProfitView;
import com.sports.insider.ui.views.ProfitViewV2;
import com.sports.insider.ui.views.ToolbarView;
import com.viewer.MultiTouchViewPager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f24587b;

    public /* synthetic */ c(int i5, View view) {
        this.f24586a = i5;
        this.f24587b = view;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e7) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        ValueAnimator valueAnimator4;
        switch (this.f24586a) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
                Intrinsics.checkNotNullParameter(e7, "e");
                return true;
            case 1:
                Intrinsics.checkNotNullParameter(e7, "e");
                h hVar = (h) this.f24587b;
                if (h.b(hVar, e7.getX(), e7.getY(), hVar.f24723x)) {
                    ValueAnimator valueAnimator5 = hVar.f24719t;
                    if (valueAnimator5 == null) {
                        return true;
                    }
                    valueAnimator5.start();
                    return true;
                }
                f a7 = h.a(hVar, e7.getX(), e7.getY(), hVar.f24721v.f24701n);
                if (a7 == null || (valueAnimator = a7.j) == null) {
                    return true;
                }
                valueAnimator.start();
                return true;
            case 6:
                Intrinsics.checkNotNullParameter(e7, "e");
                ToolbarView toolbarView = (ToolbarView) this.f24587b;
                Rect rect = toolbarView.f8038k;
                int i5 = rect.left;
                int i10 = rect.right;
                int x10 = (int) e7.getX();
                if (i5 <= x10 && x10 <= i10) {
                    Rect rect2 = toolbarView.f8038k;
                    int i11 = rect2.top;
                    int i12 = rect2.bottom;
                    int y5 = (int) e7.getY();
                    if (i11 <= y5 && y5 <= i12) {
                        ValueAnimator valueAnimator6 = toolbarView.K;
                        if (valueAnimator6 != null) {
                            valueAnimator6.start();
                        }
                        return true;
                    }
                }
                Rect rect3 = toolbarView.f8054t;
                int i13 = rect3.left;
                int i14 = rect3.right;
                int x11 = (int) e7.getX();
                if (i13 <= x11 && x11 <= i14) {
                    Rect rect4 = toolbarView.f8054t;
                    int i15 = rect4.top;
                    int i16 = rect4.bottom;
                    int y10 = (int) e7.getY();
                    if (i15 <= y10 && y10 <= i16) {
                        if (toolbarView.f8053s0 >= 3 && (valueAnimator4 = toolbarView.L) != null) {
                            valueAnimator4.start();
                        }
                        return true;
                    }
                }
                Rect rect5 = toolbarView.f8060w;
                int i17 = rect5.left;
                int i18 = rect5.right;
                int x12 = (int) e7.getX();
                if (i17 <= x12 && x12 <= i18) {
                    Rect rect6 = toolbarView.f8060w;
                    int i19 = rect6.top;
                    int i20 = rect6.bottom;
                    int y11 = (int) e7.getY();
                    if (i19 <= y11 && y11 <= i20) {
                        if (toolbarView.f8053s0 >= 2 && (valueAnimator3 = toolbarView.f8033g0) != null) {
                            valueAnimator3.start();
                        }
                        return true;
                    }
                }
                Rect rect7 = toolbarView.f8065z;
                int i21 = rect7.left;
                int i22 = rect7.right;
                int x13 = (int) e7.getX();
                if (i21 <= x13 && x13 <= i22) {
                    Rect rect8 = toolbarView.f8065z;
                    int i23 = rect8.top;
                    int i24 = rect8.bottom;
                    int y12 = (int) e7.getY();
                    if (i23 <= y12 && y12 <= i24 && toolbarView.f8053s0 >= 1 && (valueAnimator2 = toolbarView.f8035h0) != null) {
                        valueAnimator2.start();
                    }
                }
                return true;
            default:
                return super.onDown(e7);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent e7) {
        switch (this.f24586a) {
            case 7:
                Intrinsics.checkNotNullParameter(e7, "e");
                ze.g gVar = (ze.g) this.f24587b;
                MultiTouchViewPager multiTouchViewPager = gVar.f25942b;
                if (multiTouchViewPager == null || !multiTouchViewPager.f8074u0) {
                    return false;
                }
                ze.g.a(gVar, e7);
                return false;
            default:
                return super.onSingleTapConfirmed(e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01b1, code lost:
    
        if (r3 == null) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onSingleTapUp(MotionEvent e7) {
        ArrayList arrayList;
        u0 u0Var;
        u0 u0Var2;
        u0 u0Var3;
        int i5 = this.f24586a;
        int i10 = -1;
        int i11 = 3;
        int i12 = 2;
        Continuation continuation = null;
        View view = this.f24587b;
        int i13 = 0;
        int i14 = 1;
        switch (i5) {
            case 0:
                Intrinsics.checkNotNullParameter(e7, "e");
                BottomListMenuOptionView bottomListMenuOptionView = (BottomListMenuOptionView) view;
                if (BottomListMenuOptionView.a(bottomListMenuOptionView, e7.getX(), e7.getY(), bottomListMenuOptionView.f7192h)) {
                    bottomListMenuOptionView.playSoundEffect(0);
                    b clickListener = bottomListMenuOptionView.getClickListener();
                    if (clickListener != null) {
                        sd.m mVar = (sd.m) clickListener;
                        sd.d dVar = mVar.f23493a;
                        if (dVar != null) {
                            sd.n nVar = sd.n.f23496c;
                            Intrinsics.checkNotNullParameter(nVar, "<set-?>");
                            dVar.f23478b = nVar;
                        }
                        kf.f fVar = mVar.f23494b;
                        if (fVar != null) {
                            sd.d dVar2 = mVar.f23493a;
                            if (dVar2 == null) {
                                dVar2 = new sd.d(null, 3);
                            }
                            gf.o oVar = gf.q.f10031a;
                            fVar.resumeWith(dVar2);
                        }
                        mVar.f23494b = null;
                        mVar.dismiss();
                    }
                } else if (BottomListMenuOptionView.a(bottomListMenuOptionView, e7.getX(), e7.getY(), bottomListMenuOptionView.f7189e)) {
                    bottomListMenuOptionView.playSoundEffect(0);
                    b clickListener2 = bottomListMenuOptionView.getClickListener();
                    if (clickListener2 != null) {
                        ((sd.m) clickListener2).b(0);
                    }
                } else {
                    for (Pair pair : bottomListMenuOptionView.f7196m) {
                        if (BottomListMenuOptionView.a(bottomListMenuOptionView, e7.getX(), e7.getY(), (RectF) pair.f19193b)) {
                            bottomListMenuOptionView.playSoundEffect(0);
                            b clickListener3 = bottomListMenuOptionView.getClickListener();
                            if (clickListener3 != null) {
                                ((sd.m) clickListener3).b(((Number) pair.f19192a).intValue());
                            }
                        }
                    }
                }
                return true;
            case 1:
                Intrinsics.checkNotNullParameter(e7, "e");
                h hVar = (h) view;
                g gVar = hVar.f24721v;
                if (h.b(hVar, e7.getX(), e7.getY(), hVar.f24723x)) {
                    e clickListener4 = hVar.getClickListener();
                    if (clickListener4 != null) {
                        sd.l lVar = (sd.l) clickListener4;
                        lVar.f23492c.setClickListener(null);
                        eg.c0.t(MyApp.f6830c, null, null, new sd.k(lVar, continuation, 6), 3);
                    }
                    hVar.playSoundEffect(0);
                } else {
                    f a7 = h.a(hVar, e7.getX(), e7.getY(), gVar.f24701n);
                    if (a7 != null) {
                        int i15 = a7.f24616a;
                        gVar.f24690b = i15;
                        hVar.requestLayout();
                        e clickListener5 = hVar.getClickListener();
                        if (clickListener5 != null) {
                            sd.l lVar2 = (sd.l) clickListener5;
                            if (i15 == 0) {
                                eg.c0.t(MyApp.f6830c, null, null, new sd.k(lVar2, continuation, i13), 3);
                            } else if (i15 == 1) {
                                eg.c0.t(MyApp.f6830c, null, null, new sd.k(lVar2, continuation, i14), 3);
                            } else if (i15 == 2) {
                                eg.c0.t(MyApp.f6830c, null, null, new sd.k(lVar2, continuation, i12), 3);
                            } else if (i15 != 3) {
                                int i16 = 4;
                                if (i15 != 4) {
                                    int i17 = 5;
                                    if (i15 != 5) {
                                        Unit unit = Unit.f19194a;
                                    } else {
                                        eg.c0.t(MyApp.f6830c, null, null, new sd.k(lVar2, continuation, i17), 3);
                                    }
                                } else {
                                    eg.c0.t(MyApp.f6830c, null, null, new sd.k(lVar2, continuation, i16), 3);
                                }
                            } else {
                                eg.c0.t(MyApp.f6830c, null, null, new sd.k(lVar2, continuation, i11), 3);
                            }
                        }
                        hVar.playSoundEffect(0);
                    }
                }
                return true;
            case 2:
                Intrinsics.checkNotNullParameter(e7, "e");
                CheckPrice checkPrice = (CheckPrice) view;
                RectF rectF = checkPrice.J;
                float f6 = rectF.left;
                float f10 = rectF.right;
                float x10 = e7.getX();
                if (f6 <= x10 && x10 <= f10) {
                    RectF rectF2 = checkPrice.J;
                    float f11 = rectF2.top;
                    float f12 = rectF2.bottom;
                    float y5 = e7.getY();
                    if (f11 <= y5 && y5 <= f12) {
                        if (checkPrice.A) {
                            checkPrice.A = false;
                            checkPrice.i();
                        }
                        i iVar = checkPrice.f7231k1;
                        if (iVar == null) {
                            return true;
                        }
                        iVar.f();
                        return true;
                    }
                }
                RectF rectF3 = checkPrice.f7224h0;
                float f13 = rectF3.left;
                float f14 = rectF3.right;
                float x11 = e7.getX();
                if (f13 <= x11 && x11 <= f14) {
                    RectF rectF4 = checkPrice.f7224h0;
                    float f15 = rectF4.top;
                    float f16 = rectF4.bottom;
                    float y10 = e7.getY();
                    if (f15 <= y10 && y10 <= f16) {
                        if (!checkPrice.A) {
                            checkPrice.A = true;
                            checkPrice.i();
                        }
                        i iVar2 = checkPrice.f7231k1;
                        if (iVar2 == null) {
                            return true;
                        }
                        iVar2.m();
                        return true;
                    }
                }
                float x12 = e7.getX();
                float y11 = e7.getY();
                boolean z5 = checkPrice.J.left <= x12 && x12 <= checkPrice.f7224h0.right;
                if (checkPrice.f7224h0.bottom + checkPrice.f7243q0 <= y11 && y11 <= checkPrice.f7216e) {
                    i13 = 1;
                }
                if (!z5 || i13 == 0) {
                    return onSingleTapConfirmed(e7);
                }
                i iVar3 = checkPrice.f7231k1;
                if (iVar3 == null) {
                    return true;
                }
                iVar3.s(checkPrice.A);
                return true;
            case 3:
                Intrinsics.checkNotNullParameter(e7, "e");
                LivePrice livePrice = (LivePrice) view;
                RectF rectF5 = livePrice.K;
                float f17 = rectF5.left;
                float f18 = rectF5.right;
                float x13 = e7.getX();
                if (f17 <= x13 && x13 <= f18) {
                    RectF rectF6 = livePrice.K;
                    float f19 = rectF6.top;
                    float f20 = rectF6.bottom;
                    float y12 = e7.getY();
                    if (f19 <= y12 && y12 <= f20) {
                        if (livePrice.B) {
                            livePrice.B = false;
                            livePrice.j();
                        }
                        y yVar = livePrice.f7618m1;
                        if (yVar == null) {
                            return true;
                        }
                        LivePayFragment livePayFragment = (LivePayFragment) yVar;
                        le.z H = livePayFragment.H();
                        androidx.fragment.app.p0 activity = livePayFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
                        H.getClass();
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        if (H.f20013i) {
                            H.f20013i = false;
                            return true;
                        }
                        H.f20013i = false;
                        H.i(activity);
                        return true;
                    }
                }
                RectF rectF7 = livePrice.f7608i0;
                float f21 = rectF7.left;
                float f22 = rectF7.right;
                float x14 = e7.getX();
                if (f21 <= x14 && x14 <= f22) {
                    RectF rectF8 = livePrice.f7608i0;
                    float f23 = rectF8.top;
                    float f24 = rectF8.bottom;
                    float y13 = e7.getY();
                    if (f23 <= y13 && y13 <= f24) {
                        if (!livePrice.B) {
                            livePrice.B = true;
                            livePrice.j();
                        }
                        y yVar2 = livePrice.f7618m1;
                        if (yVar2 == null) {
                            return true;
                        }
                        LivePayFragment livePayFragment2 = (LivePayFragment) yVar2;
                        le.z H2 = livePayFragment2.H();
                        androidx.fragment.app.p0 activity2 = livePayFragment2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(activity2, "requireActivity(...)");
                        H2.getClass();
                        Intrinsics.checkNotNullParameter(activity2, "activity");
                        if (!H2.f20013i) {
                            H2.f20013i = true;
                            return true;
                        }
                        H2.f20013i = true;
                        H2.h(activity2);
                        return true;
                    }
                }
                float x15 = e7.getX();
                float y14 = e7.getY();
                boolean z7 = livePrice.K.left <= x15 && x15 <= livePrice.f7608i0.right;
                if (livePrice.f7608i0.bottom + livePrice.f7637w0 <= y14 && y14 <= livePrice.f7597e) {
                    i13 = 1;
                }
                if (!z7 || i13 == 0) {
                    return onSingleTapConfirmed(e7);
                }
                y yVar3 = livePrice.f7618m1;
                if (yVar3 == null) {
                    return true;
                }
                boolean z10 = livePrice.B;
                LivePayFragment livePayFragment3 = (LivePayFragment) yVar3;
                le.z H3 = livePayFragment3.H();
                Context context = livePayFragment3.getContext();
                boolean z11 = !z10;
                H3.getClass();
                if (context == null) {
                    return true;
                }
                u1.a i18 = d1.i(H3);
                lg.e eVar = eg.m0.f9201a;
                eg.c0.t(i18, jg.q.f18523a, null, new hd.g(context, z11, H3, null, 1), 2);
                return true;
            case 4:
                Intrinsics.checkNotNullParameter(e7, "e");
                ProfitView profitView = (ProfitView) view;
                float x16 = e7.getX();
                float y15 = e7.getY();
                int i19 = ProfitView.A;
                if (x16 >= 1.0f && y15 >= 1.0f) {
                    Iterator it = (profitView.f7832z ? profitView.f7825s : profitView.q).iterator();
                    int i20 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i21 = i20 + 1;
                            if (i20 < 0) {
                                kotlin.collections.u.j();
                                throw null;
                            }
                            if (((RectF) next).contains(x16, y15)) {
                                i10 = i21;
                            } else {
                                i20 = i21;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                }
                if (i10 <= 0) {
                    return onSingleTapConfirmed(e7);
                }
                g0 g0Var = profitView.f7810b;
                if (g0Var == null) {
                    return true;
                }
                g0Var.y(i10);
                return true;
            case 5:
                Intrinsics.checkNotNullParameter(e7, "e");
                ProfitViewV2 profitViewV2 = (ProfitViewV2) view;
                float x17 = e7.getX();
                float y16 = e7.getY();
                i0 i0Var = profitViewV2.f7842h0;
                if (x17 >= 1.0f && y16 >= 1.0f) {
                    if (!profitViewV2.D) {
                        arrayList = i0Var.f24730a;
                        break;
                    } else {
                        arrayList = i0Var.f24731b;
                    }
                    if (arrayList != null) {
                        int i22 = 0;
                        for (Object obj : arrayList) {
                            int i23 = i22 + 1;
                            if (i22 < 0) {
                                kotlin.collections.u.j();
                                throw null;
                            }
                            if (((RectF) obj).contains(x17, y16)) {
                                i10 = i23;
                            } else {
                                i22 = i23;
                            }
                        }
                    }
                    i10 = 0;
                }
                if (i10 <= 0) {
                    return onSingleTapConfirmed(e7);
                }
                l0 l0Var = profitViewV2.f7834b;
                if (l0Var == null) {
                    return true;
                }
                LivePayFragment livePayFragment4 = (LivePayFragment) l0Var;
                if (i10 != 7) {
                    if (i10 != 8) {
                        return true;
                    }
                    le.z H4 = livePayFragment4.H();
                    Context context2 = livePayFragment4.getContext();
                    H4.f20027y.getClass();
                    new l1.a(22).y(context2, false);
                    return true;
                }
                le.z H5 = livePayFragment4.H();
                H5.getClass();
                da.d dVar3 = new da.d();
                dVar3.c("subs_live_prediction");
                Intrinsics.checkNotNullExpressionValue(dVar3, "setDestination(...)");
                H5.f20011g.h(new ic.i0(new ic.f(dVar3)));
                return true;
            case 6:
                Intrinsics.checkNotNullParameter(e7, "e");
                ToolbarView toolbarView = (ToolbarView) view;
                Rect rect = toolbarView.f8065z;
                Rect rect2 = toolbarView.f8060w;
                Rect rect3 = toolbarView.f8054t;
                Rect rect4 = toolbarView.f8038k;
                int i24 = rect4.left;
                int i25 = rect4.right;
                int x18 = (int) e7.getX();
                if (i24 <= x18 && x18 <= i25) {
                    int i26 = rect4.top;
                    int i27 = rect4.bottom;
                    int y17 = (int) e7.getY();
                    if (i26 <= y17 && y17 <= i27) {
                        if (toolbarView.getChildCount() > 0) {
                            View childAt = toolbarView.getChildAt(0);
                            HomeRowView homeRowView = childAt instanceof HomeRowView ? (HomeRowView) childAt : null;
                            if (homeRowView != null) {
                                v0 toolbarInterface = toolbarView.getToolbarInterface();
                                if (toolbarInterface != null) {
                                    MainActivity mainActivity = (MainActivity) toolbarInterface;
                                    if (homeRowView.f7523h) {
                                        mainActivity.C().e();
                                    } else {
                                        y1.b0 f25 = mainActivity.C().f25625b.f();
                                        Integer valueOf = f25 != null ? Integer.valueOf(f25.f25534b.f3017e) : null;
                                        io.sentry.internal.debugmeta.c cVar = mainActivity.f6897v0;
                                        if (cVar == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
                                            cVar = null;
                                        }
                                        Iterator it2 = ((HashSet) cVar.f16517b).iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                Object next2 = it2.next();
                                                int intValue = ((Number) next2).intValue();
                                                if (valueOf != null && intValue == valueOf.intValue()) {
                                                    continuation = next2;
                                                }
                                            }
                                        }
                                        if (continuation != null) {
                                            View d10 = mainActivity.E().d(8388611);
                                            if (!(d10 != null ? DrawerLayout.k(d10) : false)) {
                                                mainActivity.E().n();
                                            }
                                        }
                                    }
                                }
                                toolbarView.playSoundEffect(0);
                            }
                        }
                        return true;
                    }
                }
                int i28 = rect3.left;
                int i29 = rect3.right;
                int x19 = (int) e7.getX();
                if (i28 <= x19 && x19 <= i29) {
                    int i30 = rect3.top;
                    int i31 = rect3.bottom;
                    int y18 = (int) e7.getY();
                    if (i30 <= y18 && y18 <= i31) {
                        if (toolbarView.f8053s0 >= 3 && (u0Var3 = (u0) kotlin.collections.p.r(2, toolbarView.C0)) != null) {
                            int i32 = u0Var3.f24910a;
                            w0 toolbarMenuInterface = toolbarView.getToolbarMenuInterface();
                            if (toolbarMenuInterface != null) {
                                toolbarMenuInterface.k(i32);
                            }
                            w0 toolbarMenuGenerale = toolbarView.getToolbarMenuGenerale();
                            if (toolbarMenuGenerale != null) {
                                toolbarMenuGenerale.k(i32);
                            }
                            toolbarView.playSoundEffect(0);
                        }
                        return true;
                    }
                }
                int i33 = rect2.left;
                int i34 = rect2.right;
                int x20 = (int) e7.getX();
                if (i33 <= x20 && x20 <= i34) {
                    int i35 = rect2.top;
                    int i36 = rect2.bottom;
                    int y19 = (int) e7.getY();
                    if (i35 <= y19 && y19 <= i36) {
                        if (toolbarView.f8053s0 >= 2 && (u0Var2 = (u0) kotlin.collections.p.r(1, toolbarView.C0)) != null) {
                            int i37 = u0Var2.f24910a;
                            w0 toolbarMenuInterface2 = toolbarView.getToolbarMenuInterface();
                            if (toolbarMenuInterface2 != null) {
                                toolbarMenuInterface2.k(i37);
                            }
                            w0 toolbarMenuGenerale2 = toolbarView.getToolbarMenuGenerale();
                            if (toolbarMenuGenerale2 != null) {
                                toolbarMenuGenerale2.k(i37);
                            }
                            toolbarView.playSoundEffect(0);
                        }
                        return true;
                    }
                }
                int i38 = rect.left;
                int i39 = rect.right;
                int x21 = (int) e7.getX();
                if (i38 <= x21 && x21 <= i39) {
                    int i40 = rect.top;
                    int i41 = rect.bottom;
                    int y20 = (int) e7.getY();
                    if (i40 <= y20 && y20 <= i41 && toolbarView.f8053s0 >= 1 && (u0Var = (u0) kotlin.collections.p.r(0, toolbarView.C0)) != null) {
                        int i42 = u0Var.f24910a;
                        w0 toolbarMenuInterface3 = toolbarView.getToolbarMenuInterface();
                        if (toolbarMenuInterface3 != null) {
                            toolbarMenuInterface3.k(i42);
                        }
                        w0 toolbarMenuGenerale3 = toolbarView.getToolbarMenuGenerale();
                        if (toolbarMenuGenerale3 != null) {
                            toolbarMenuGenerale3.k(i42);
                        }
                        toolbarView.playSoundEffect(0);
                    }
                }
                return true;
            default:
                return super.onSingleTapUp(e7);
        }
    }
}
