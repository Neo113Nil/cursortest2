package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dmi;
import defpackage.h7k;
import defpackage.joa;
import defpackage.ku3;
import defpackage.w2g;
import defpackage.yda;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class U {
    public final GestureDetectorOnGestureListenerC3889xi a;
    public final Set b;
    public final long c;
    public final N d;
    public final InterfaceC3880x9 e;
    public final Context f;
    public L g;
    public M6 h;
    public final ku3 i;
    public final AtomicBoolean j;
    public yda k;
    public Wo l;
    public final O m;
    public volatile boolean n;
    public final T o;

    public U(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Set set, long j, N n, InterfaceC3880x9 interfaceC3880x9) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        set.getClass();
        n.getClass();
        this.a = gestureDetectorOnGestureListenerC3889xi;
        this.b = set;
        this.c = j;
        this.d = n;
        this.e = interfaceC3880x9;
        this.f = gestureDetectorOnGestureListenerC3889xi.getContext();
        this.i = L9.d;
        this.j = new AtomicBoolean(false);
        this.m = new O(this);
        this.o = new T(this);
    }

    public static final M a(U u) {
        Pair pair;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        u.getClass();
        Rect rect = new Rect();
        if (u.a.getRootView() == null || u.a.getVisibility() != 0 || !u.a.hasWindowFocus() || !u.n || !u.a.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = u.f;
        context.getClass();
        context.getClass();
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } catch (Exception unused) {
            pair = new Pair(0, 0);
        }
        int intValue = ((Number) pair.a).intValue();
        int intValue2 = ((Number) pair.b).intValue();
        Rect rect2 = new Rect();
        if (!u.a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        View rootView = u.a.getRootView();
        Set set = u.b;
        if (rootView instanceof ViewGroup) {
            ArrayList arrayList2 = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(rootView);
            boolean z = false;
            while (!arrayDeque.isEmpty()) {
                View view = (View) arrayDeque.pop();
                if (view.getVisibility() == 0) {
                    if (view.equals(u.a)) {
                        z = true;
                    } else if (!set.contains(view)) {
                        Rect rect3 = new Rect();
                        if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                            Rect rect4 = new Rect();
                            boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                            if (view.equals(u.a) || (globalVisibleRect && rect4.intersect(rect))) {
                                F5.a.getClass();
                                boolean z2 = !F5.y() || view.getZ() >= u.a.getZ();
                                if (z && z2) {
                                    arrayList2.add(rect4);
                                }
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) view;
                                    for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                        arrayDeque.push(viewGroup.getChildAt(childCount));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            L l = u.g;
            if (l != null && (rectF4 = l.b) != null) {
                a(rect, arrayList2, rectF4);
            }
            L l2 = u.g;
            if (l2 != null && (rectF3 = l2.b) != null) {
                a(rect, arrayList2, rectF3);
            }
            L l3 = u.g;
            if (l3 != null && (rectF2 = l3.c) != null) {
                a(rect, arrayList2, rectF2);
            }
            L l4 = u.g;
            if (l4 != null && (rectF = l4.d) != null) {
                a(rect, arrayList2, rectF);
            }
            if (arrayList2.size() == 1) {
                arrayList.add(new RectF((Rect) arrayList2.get(0)));
            } else {
                Region region = new Region();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    region.op((Rect) it.next(), Region.Op.UNION);
                }
                RegionIterator regionIterator = new RegionIterator(region);
                Rect rect5 = new Rect();
                while (regionIterator.next(rect5)) {
                    arrayList.add(new RectF(rect5));
                }
            }
        }
        return new M(new RectF(rect2), arrayList, intValue, intValue2);
    }

    public static final Unit b(U u) {
        u.getClass();
        F5.a.getClass();
        if (F5.u()) {
            u.l = new Wo(u.a, u.o, u.e);
        } else {
            InterfaceC3880x9 interfaceC3880x9 = u.e;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        u.k = N3.a(u.i, 0L, u.c, new S(u, null));
        return Unit.a;
    }

    public static final Unit c(U u) {
        yda ydaVar = u.k;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        Wo wo = u.l;
        if (wo != null) {
            wo.a();
        }
        u.l = null;
        u.k = null;
        M6 m6 = new M6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null);
        if (!m6.equals(u.h)) {
            ((C3552ki) u.d).a(m6);
            u.h = m6;
        }
        return Unit.a;
    }

    public final void b(View view) {
        view.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.e;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.b.remove(view);
    }

    public final void b() {
        InterfaceC3880x9 interfaceC3880x9;
        if (this.j.compareAndSet(true, false)) {
            Throwable a = w2g.a(P3.a(new h7k(this, 0)));
            if (a == null || (interfaceC3880x9 = this.e) == null) {
                return;
            }
            ((C3906y9) interfaceC3880x9).b("AdExposureTracker", dmi.q("Error stopping exposure tracking - ", a.getMessage()));
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.e;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).c("AdExposureTracker", "Exposure tracking is already stopped");
        }
    }

    public final void a() {
        if (this.j.compareAndSet(false, true)) {
            Throwable a = w2g.a(P3.a(new h7k(this, 1)));
            if (a != null) {
                InterfaceC3880x9 interfaceC3880x9 = this.e;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).b("AdExposureTracker", dmi.q("Error starting exposure tracking - ", a.getMessage()));
                }
                this.j.set(false);
                joa joaVar = AbstractC3286aa.a;
                AbstractC3286aa.a(new Q2(a));
                return;
            }
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.e;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).c("AdExposureTracker", "Exposure tracking is already started");
        }
    }

    public final void a(View view) {
        view.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.e;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.b.add(view);
    }

    public final void a(Throwable th) {
        InterfaceC3880x9 interfaceC3880x9 = this.e;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("AdExposureTracker", dmi.q("Error calculating exposure metrics - ", th.getMessage()));
        }
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(N3.b(rectF.left), N3.b(rectF.top), N3.b(rectF.right), N3.b(rectF.bottom)));
        }
    }
}
