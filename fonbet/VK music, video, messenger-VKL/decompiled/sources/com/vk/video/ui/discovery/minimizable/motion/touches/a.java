package com.vk.video.ui.discovery.minimizable.motion.touches;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.aa30;
import xsna.an10;
import xsna.ari;
import xsna.asp;
import xsna.awt0;
import xsna.bbb0;
import xsna.bri;
import xsna.ei;
import xsna.epx;
import xsna.f4m;
import xsna.j5g;
import xsna.jnr;
import xsna.jw5;
import xsna.mnh0;
import xsna.msy;
import xsna.nb30;
import xsna.nmp0;
import xsna.raa;
import xsna.rl3;
import xsna.swe0;
import xsna.zpi;
import xsna.zrp;

/* compiled from: TouchActionsManager.kt */
/* loaded from: classes7.dex */
public final class a {
    public final Context a;
    public final ViewGroup b;
    public final ViewGroup c;
    public final bri d;
    public TouchActionInfo e;
    public ViewConfiguration f;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final Object m = msy.a(LazyThreadSafetyMode.NONE, new bbb0(this, 27));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TouchActionsManager.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.motion.touches.a$a, reason: collision with other inner class name */
    public static final class EnumC1991a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EnumC1991a[] $VALUES;
        public static final EnumC1991a NestedPreScroll;
        public static final EnumC1991a NestedScroll;
        public static final EnumC1991a Scroll;

        static {
            EnumC1991a enumC1991a = new EnumC1991a("Scroll", 0);
            Scroll = enumC1991a;
            EnumC1991a enumC1991a2 = new EnumC1991a("NestedScroll", 1);
            NestedScroll = enumC1991a2;
            EnumC1991a enumC1991a3 = new EnumC1991a("NestedPreScroll", 2);
            NestedPreScroll = enumC1991a3;
            EnumC1991a[] enumC1991aArr = {enumC1991a, enumC1991a2, enumC1991a3};
            $VALUES = enumC1991aArr;
            $ENTRIES = new asp(enumC1991aArr);
        }

        public EnumC1991a() {
            throw null;
        }

        public static EnumC1991a valueOf(String str) {
            return (EnumC1991a) Enum.valueOf(EnumC1991a.class, str);
        }

        public static EnumC1991a[] values() {
            return (EnumC1991a[]) $VALUES.clone();
        }
    }

    /* compiled from: TouchActionsManager.kt */
    public final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        public final void a(View view, int i, int i2, Collection<? extends TouchActionInfo.c> collection, List<View> list) {
            Collection<? extends TouchActionInfo.c> collection2 = collection;
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection2) {
                if (obj instanceof TouchActionInfo.c.b) {
                    arrayList.add(obj);
                }
            }
            boolean isEmpty = arrayList.isEmpty();
            a aVar = a.this;
            if (!isEmpty) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (aVar.i(view, (TouchActionInfo.c.b) it.next())) {
                            list.add(view);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : collection2) {
                if (obj2 instanceof TouchActionInfo.c.a) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                aVar.d.getClass();
                String str = (String) j5g.a0(j5g.D0(new ari(0), j5g.S0(zpi.a.keySet())));
                if (str != null && !arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (epx.f(((TouchActionInfo.c.a) it2.next()).a, str)) {
                            if (!list.contains(view)) {
                                list.add(view);
                            }
                        }
                    }
                }
            }
            if (view instanceof ViewGroup) {
                View[] d = awt0.d((ViewGroup) view);
                if (d.length > 1) {
                    jw5.A(d, new raa(2));
                }
                rl3.k0(d);
                for (View view2 : d) {
                    if (f4m.e(view2).contains(i, i2)) {
                        a(view2, i, i2, collection, list);
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            a aVar = a.this;
            aVar.h.clear();
            aa30 state = aVar.c.getState();
            aa30.b bVar = state instanceof aa30.b ? (aa30.b) state : null;
            if ((bVar != null ? bVar.d : null) != null) {
                return false;
            }
            ArrayList arrayList = aVar.g;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TouchActionInfo touchActionInfo = (TouchActionInfo) it.next();
                TouchActionInfo.c cVar = epx.f(touchActionInfo.d, TouchActionInfo.b.C1989b.a) ? touchActionInfo.b : null;
                if (cVar != null) {
                    arrayList2.add(cVar);
                }
            }
            a(aVar.b, (int) motionEvent.getRawX(), (int) motionEvent.getRawY(), j5g.S0(arrayList2), aVar.h);
            return !aVar.h.isEmpty();
        }

        /* JADX WARN: Type inference failed for: r8v1, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            a aVar = a.this;
            ?? r8 = aVar.c;
            TouchActionInfo touchActionInfo = aVar.e;
            TouchActionInfo.Direction direction = touchActionInfo != null ? touchActionInfo.c : null;
            TouchActionInfo.Direction g = a.g(f, f2);
            if ((!g.k() || direction == null || !direction.k()) && (!g.j() || direction == null || !direction.j())) {
                return false;
            }
            aa30 state = r8.getState();
            aa30.b bVar = state instanceof aa30.b ? (aa30.b) state : null;
            ei eiVar = bVar != null ? bVar.a : null;
            if (bVar != null && eiVar != null) {
                nb30 nb30Var = eiVar.b;
                nb30 nb30Var2 = eiVar.c;
                float f3 = bVar.b;
                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 < 1.0f) {
                    if (g == direction) {
                        r8.D(nb30Var2);
                        return true;
                    }
                    r8.D(nb30Var);
                    return true;
                }
                if (f3 == 1.0f) {
                    r8.setState(new aa30.a(nb30Var2));
                    return true;
                }
                if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    r8.setState(new aa30.a(nb30Var));
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[RETURN] */
        /* JADX WARN: Type inference failed for: r5v2, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            View view;
            Pair pair;
            if (motionEvent != null) {
                a aVar = a.this;
                nb30 nb30Var = null;
                if (aVar.e == null && (Math.abs(f) > aVar.f.getScaledTouchSlop() || Math.abs(f2) > aVar.f.getScaledTouchSlop())) {
                    TouchActionInfo.Direction b = a.b(f, f2);
                    nb30 f3 = aVar.f();
                    Iterator it = aVar.h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            pair = null;
                            break;
                        }
                        View view2 = (View) it.next();
                        TouchActionInfo e = aVar.e(b, view2, f3, EnumC1991a.Scroll);
                        pair = e != null ? new Pair(view2, e) : null;
                        if (pair != null) {
                            break;
                        }
                    }
                    if (pair != null) {
                        View view3 = (View) pair.d();
                        TouchActionInfo touchActionInfo = (TouchActionInfo) pair.g();
                        aVar.e = touchActionInfo;
                        ?? r5 = aVar.c;
                        ei k3 = r5.k3(touchActionInfo.a);
                        r5.setState(new aa30.b(k3, epx.f(k3.c, f3) ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, nb30Var, 12));
                        aVar.l = touchActionInfo.c != b;
                        view = view3;
                        aVar.o(an10.b(f), an10.b(f2), false, null, view);
                        if (aVar.e == null) {
                            return true;
                        }
                    }
                }
                view = null;
                aVar.o(an10.b(f), an10.b(f2), false, null, view);
                if (aVar.e == null) {
                }
            }
            return false;
        }
    }

    /* compiled from: TouchActionsManager.kt */
    public interface c {
        void D(nb30 nb30Var);

        void Z1();

        aa30 getState();

        ei k3(nmp0 nmp0Var);

        void setState(aa30 aa30Var);
    }

    /* compiled from: TouchActionsManager.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1991a.values().length];
            try {
                iArr[EnumC1991a.Scroll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1991a.NestedScroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1991a.NestedPreScroll.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, ViewGroup viewGroup, c cVar, bri briVar) {
        this.a = context;
        this.b = viewGroup;
        this.c = (ViewGroup) cVar;
        this.d = briVar;
        this.f = ViewConfiguration.get(context);
    }

    public static int a(int i, int i2, int i3) {
        if (i2 != 0) {
            Pair pair = i3 > 0 ? new Pair(0, Integer.valueOf(i3)) : new Pair(Integer.valueOf(i3), 0);
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            int i4 = i + i2;
            if (i < intValue && i4 > intValue) {
                return i4 - intValue;
            }
            if (i > intValue && i4 < intValue) {
                return intValue - i;
            }
            if (i < intValue2 && i4 > intValue2) {
                return intValue2 - i;
            }
            if (i > intValue2 && i4 < intValue2) {
                return i4 - intValue2;
            }
            if (intValue <= i && i <= intValue2 && intValue <= i4 && i4 <= intValue2) {
                return i2;
            }
        }
        return 0;
    }

    public static TouchActionInfo.Direction b(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) ? f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? TouchActionInfo.Direction.Left : TouchActionInfo.Direction.Right : f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? TouchActionInfo.Direction.Up : TouchActionInfo.Direction.Down;
    }

    public static float d(TouchActionInfo touchActionInfo, int i, int i2, boolean z, int i3) {
        float f = touchActionInfo.c.k() ? swe0.f(i2 / i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) : swe0.f(i / i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        return z ? 1 - f : f;
    }

    public static TouchActionInfo.Direction g(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) ? f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? TouchActionInfo.Direction.Right : TouchActionInfo.Direction.Left : f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? TouchActionInfo.Direction.Down : TouchActionInfo.Direction.Up;
    }

    public final int c(TouchActionInfo touchActionInfo, boolean z) {
        TouchActionInfo.Direction i = z ? touchActionInfo.c.i() : touchActionInfo.c;
        TouchActionInfo.Direction direction = touchActionInfo.c;
        float f = touchActionInfo.f;
        boolean k = direction.k();
        ViewGroup viewGroup = this.b;
        if (k) {
            int b2 = an10.b(viewGroup.getHeight() / f);
            return i == TouchActionInfo.Direction.Down ? -b2 : b2;
        }
        int b3 = an10.b(viewGroup.getWidth() / f);
        return i == TouchActionInfo.Direction.Right ? -b3 : b3;
    }

    public final TouchActionInfo e(TouchActionInfo.Direction direction, View view, nb30 nb30Var, EnumC1991a enumC1991a) {
        Iterator it = this.g.iterator();
        TouchActionInfo touchActionInfo = null;
        while (it.hasNext()) {
            TouchActionInfo touchActionInfo2 = (TouchActionInfo) it.next();
            int i = d.$EnumSwitchMapping$0[enumC1991a.ordinal()];
            boolean z = true;
            if (i == 1) {
                z = epx.f(touchActionInfo2.d, TouchActionInfo.b.C1989b.a);
            } else if (i == 2) {
                z = touchActionInfo2.d instanceof TouchActionInfo.b.a;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                TouchActionInfo.b bVar = touchActionInfo2.d;
                if (!(bVar instanceof TouchActionInfo.b.a) || !((TouchActionInfo.b.a) bVar).a) {
                    z = false;
                }
            }
            if ((touchActionInfo != null ? touchActionInfo.c : null) != direction && i(view, touchActionInfo2.b) && z && touchActionInfo2.b() && h(nb30Var, touchActionInfo2, direction, view)) {
                touchActionInfo = touchActionInfo2;
            }
        }
        return touchActionInfo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
    public final nb30 f() {
        aa30 state = this.c.getState();
        return state instanceof aa30.a ? ((aa30.a) state).a : nb30.a.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
    public final boolean h(nb30 nb30Var, TouchActionInfo touchActionInfo, TouchActionInfo.Direction direction, View view) {
        if ((view instanceof jnr ? ((jnr) view).getAllowedScrollDirections() : TouchActionInfo.Direction.h()).contains(direction.i())) {
            nmp0 nmp0Var = touchActionInfo.a;
            TouchActionInfo.a aVar = touchActionInfo.e;
            ei k3 = this.c.k3(nmp0Var);
            TouchActionInfo.Direction direction2 = touchActionInfo.c;
            boolean z = ((aVar instanceof TouchActionInfo.a.c) || (aVar instanceof TouchActionInfo.a.C1988a)) && epx.f(nb30Var, k3.b) && direction2 == direction;
            boolean z2 = ((aVar instanceof TouchActionInfo.a.b) || (aVar instanceof TouchActionInfo.a.C1988a)) && epx.f(nb30Var, k3.c) && direction2 == direction.i();
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(View view, TouchActionInfo.c cVar) {
        if (!(cVar instanceof TouchActionInfo.c.a)) {
            if (!(cVar instanceof TouchActionInfo.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            TouchActionInfo.c.b bVar = (TouchActionInfo.c.b) cVar;
            if (bVar instanceof TouchActionInfo.c.b.a) {
                return view.getId() == ((TouchActionInfo.c.b.a) bVar).a;
            }
            if (bVar instanceof TouchActionInfo.c.b.C1990b) {
                return epx.f(view.getTag(), ((TouchActionInfo.c.b.C1990b) bVar).a);
            }
            throw new NoWhenBranchMatchedException();
        }
        TouchActionInfo.c.a aVar = (TouchActionInfo.c.a) cVar;
        if (!this.h.contains(view)) {
            return false;
        }
        String str = aVar.a;
        this.d.getClass();
        LinkedHashMap linkedHashMap = zpi.a;
        Long l = (Long) linkedHashMap.get(str);
        if (l == null) {
            return false;
        }
        long longValue = l.longValue();
        Collection values = linkedHashMap.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return true;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (longValue < ((Number) it.next()).longValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
    public final boolean j(float f, float f2) {
        TouchActionInfo touchActionInfo = this.e;
        if (touchActionInfo != null) {
            TouchActionInfo.Direction direction = touchActionInfo.c;
            TouchActionInfo.Direction g = g(-f, -f2);
            if ((g.k() && direction.k()) || (g.j() && direction.j())) {
                this.e = null;
                this.k = 0;
                this.j = 0;
                this.l = false;
                this.i = false;
                ?? r2 = this.c;
                aa30 state = r2.getState();
                aa30.b bVar = state instanceof aa30.b ? (aa30.b) state : null;
                if (bVar != null) {
                    float f3 = bVar.b;
                    ei eiVar = bVar.a;
                    if (g == direction) {
                        r2.D(eiVar.c);
                        if (f3 != 1.0f) {
                            return true;
                        }
                    } else {
                        r2.D(eiVar.b);
                        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
    public final void k(View view, int i, int i2, int[] iArr) {
        TouchActionInfo.Direction b2;
        nb30 f;
        TouchActionInfo e;
        if (this.e == null && ((i != 0 || i2 != 0) && (e = e((b2 = b(i, i2)), view, (f = f()), EnumC1991a.NestedPreScroll)) != null)) {
            this.e = e;
            this.l = e.c != b2;
            nmp0 nmp0Var = e.a;
            ?? r5 = this.c;
            ei k3 = r5.k3(nmp0Var);
            r5.setState(new aa30.b(k3, epx.f(k3.c, f) ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (nb30) null, 8));
        }
        o(i, i2, true, iArr, view);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
    public final void l(View view, int i, int i2, int[] iArr) {
        if (this.e == null) {
            if ((i == 0 && i2 == 0) || this.i) {
                this.i = true;
            } else {
                TouchActionInfo.Direction b2 = b(i, i2);
                nb30 f = f();
                TouchActionInfo e = e(b2, view, f, EnumC1991a.NestedScroll);
                if (e != null) {
                    this.e = e;
                    this.l = e.c != b2;
                    nmp0 nmp0Var = e.a;
                    ?? r0 = this.c;
                    ei k3 = r0.k3(nmp0Var);
                    r0.setState(new aa30.b(k3, epx.f(k3.c, f) ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (nb30) null, 12));
                }
            }
        }
        if (this.e != null) {
            iArr[0] = iArr[0] + i;
            iArr[1] = iArr[1] + i2;
        }
    }

    public final boolean m(int i, int i2, View view) {
        if (i2 != 0 || this.e != null) {
            return false;
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TouchActionInfo touchActionInfo = (TouchActionInfo) it.next();
            TouchActionInfo.c cVar = touchActionInfo.b;
            TouchActionInfo.Direction direction = touchActionInfo.c;
            if (i(view, cVar) && touchActionInfo.b() && (touchActionInfo.d instanceof TouchActionInfo.b.a)) {
                if (direction.k() && (i & 2) != 0) {
                    return true;
                }
                if (direction.j() && (i & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
    public final boolean n(MotionEvent motionEvent) {
        if (motionEvent == null || mnh0.m(motionEvent)) {
            return false;
        }
        boolean onTouchEvent = ((GestureDetector) this.m.getValue()).onTouchEvent(motionEvent);
        if (mnh0.r(motionEvent)) {
            this.l = false;
            this.j = 0;
            this.k = 0;
            if (this.e != null && !onTouchEvent) {
                ?? r8 = this.c;
                aa30 state = r8.getState();
                aa30.b bVar = state instanceof aa30.b ? (aa30.b) state : null;
                ei eiVar = bVar != null ? bVar.a : null;
                if (bVar != null && eiVar != null) {
                    float f = bVar.b;
                    if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < 1.0f) {
                        p();
                    } else if (f == 1.0f) {
                        r8.setState(new aa30.a(eiVar.c));
                    } else if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        r8.setState(new aa30.a(eiVar.b));
                    }
                }
            }
            this.e = null;
        }
        return onTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i, int i2, boolean z, int[] iArr, View view) {
        float f;
        char c2;
        nb30 nb30Var;
        TouchActionInfo touchActionInfo = this.e;
        if (touchActionInfo == null) {
            return;
        }
        nmp0 nmp0Var = touchActionInfo.a;
        int c3 = c(touchActionInfo, this.l);
        ?? r6 = this.c;
        ei k3 = r6.k3(nmp0Var);
        aa30 state = r6.getState();
        if (state instanceof aa30.a) {
            f = epx.f(k3.c, ((aa30.a) state).a) ? 1.0f : 0.0f;
        } else {
            if (!(state instanceof aa30.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f = ((aa30.b) state).b;
        }
        int a = a(this.j, i, c3);
        int a2 = a(this.k, i2, c3);
        int i3 = this.j + i;
        this.j = i3;
        int i4 = this.k + i2;
        this.k = i4;
        float d2 = d(touchActionInfo, i3, i4, this.l, c3);
        if (d2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || d2 == 1.0f) {
            TouchActionInfo.Direction b2 = b(i, i2);
            nb30 nb30Var2 = d2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? k3.b : k3.c;
            Iterator it = this.g.iterator();
            TouchActionInfo touchActionInfo2 = null;
            while (it.hasNext()) {
                TouchActionInfo touchActionInfo3 = (TouchActionInfo) it.next();
                nmp0 nmp0Var2 = touchActionInfo3.a;
                TouchActionInfo.b bVar = touchActionInfo3.d;
                ei k32 = r6.k3(nmp0Var2);
                boolean z2 = epx.f(k32.c, nb30Var2) || epx.f(k32.b, nb30Var2);
                boolean f2 = z ? bVar instanceof TouchActionInfo.b.a : epx.f(bVar, TouchActionInfo.b.C1989b.a);
                if ((touchActionInfo2 != null ? touchActionInfo2.c : null) != b2 && touchActionInfo3.b() && z2 && f2 && touchActionInfo3.g && epx.f(touchActionInfo.b, touchActionInfo3.b) && !nmp0Var.equals(touchActionInfo3.a)) {
                    if (h(nb30Var2, touchActionInfo3, b2, view)) {
                        touchActionInfo2 = touchActionInfo3;
                    }
                }
            }
            c2 = 1;
            if (touchActionInfo2 != null) {
                this.e = touchActionInfo2;
                ei k33 = r6.k3(touchActionInfo2.a);
                float f3 = epx.f(k33.b, nb30Var2) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
                nb30Var = null;
                r6.setState(new aa30.b(k33, f3, nb30Var, 12));
                int i5 = i - a;
                this.j = i5;
                int i6 = i2 - a2;
                this.k = i6;
                boolean z3 = touchActionInfo2.c != b2;
                this.l = z3;
                d2 = d(touchActionInfo, i5, i6, z3, c(touchActionInfo, z3));
                f = -1.0f;
                a = i;
                a2 = i2;
                if (f != d2) {
                    return;
                }
                if (iArr != null) {
                    iArr[0] = a;
                }
                if (iArr != null) {
                    iArr[c2] = a2;
                }
                aa30 state2 = r6.getState();
                aa30.b bVar2 = state2 instanceof aa30.b ? (aa30.b) state2 : nb30Var;
                if (bVar2 != 0) {
                    r6.setState(new aa30.b(bVar2.a, d2, bVar2.c, bVar2.d));
                }
                if (z) {
                    r6.Z1();
                    return;
                }
                return;
            }
        } else {
            c2 = 1;
        }
        nb30Var = null;
        if (f != d2) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, com.vk.video.ui.discovery.minimizable.motion.touches.a$c] */
    public final void p() {
        ?? r0 = this.c;
        aa30 state = r0.getState();
        aa30.b bVar = state instanceof aa30.b ? (aa30.b) state : null;
        if (bVar != null) {
            ei eiVar = bVar.a;
            nb30 nb30Var = bVar.b > 0.5f ? eiVar.c : eiVar.b;
            if (epx.f(nb30Var, nb30.a.b)) {
                return;
            }
            r0.D(nb30Var);
        }
    }
}
