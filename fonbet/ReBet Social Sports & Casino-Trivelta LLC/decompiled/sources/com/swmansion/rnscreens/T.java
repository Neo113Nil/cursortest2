package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import bd.InterfaceC2417a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C3834z;
import dd.AbstractC4060g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class T extends B {

    /* renamed from: s, reason: collision with root package name */
    public static final a f41669s = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f41670h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f41671i;

    /* renamed from: j, reason: collision with root package name */
    public List f41672j;

    /* renamed from: k, reason: collision with root package name */
    public final List f41673k;

    /* renamed from: l, reason: collision with root package name */
    public List f41674l;

    /* renamed from: m, reason: collision with root package name */
    public Z f41675m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41676n;

    /* renamed from: o, reason: collision with root package name */
    public H f41677o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC2417a f41678p;

    /* renamed from: q, reason: collision with root package name */
    public List f41679q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f41680r;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean b(H h10, C3834z.d dVar) {
            if (dVar == null) {
                dVar = h10.b().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || dVar == C3834z.d.f42114d || dVar == C3834z.d.f42117g || dVar == C3834z.d.f42118h || dVar == C3834z.d.f42119i) && dVar != C3834z.d.f42112b;
        }

        public a() {
        }
    }

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public Canvas f41681a;

        /* renamed from: b, reason: collision with root package name */
        public View f41682b;

        /* renamed from: c, reason: collision with root package name */
        public long f41683c;

        public b() {
        }

        public final void a() {
            T.this.d0(this);
            this.f41681a = null;
            this.f41682b = null;
            this.f41683c = 0L;
        }

        public final Canvas b() {
            return this.f41681a;
        }

        public final View c() {
            return this.f41682b;
        }

        public final long d() {
            return this.f41683c;
        }

        public final void e(Canvas canvas) {
            this.f41681a = canvas;
        }

        public final void f(View view) {
            this.f41682b = view;
        }

        public final void g(long j10) {
            this.f41683c = j10;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C3834z.e.values().length];
            try {
                iArr[C3834z.e.f42124d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public T(Context context) {
        super(context);
        this.f41670h = new ArrayList();
        this.f41671i = new HashSet();
        this.f41672j = new ArrayList();
        this.f41673k = new ArrayList();
        this.f41674l = new ArrayList();
        this.f41679q = new ArrayList();
    }

    public static final boolean S(T t10, Z wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        return !t10.f41623a.contains(wrapper) || t10.f41671i.contains(wrapper);
    }

    public static final boolean T(Ref.ObjectRef objectRef, H it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != objectRef.element;
    }

    public static final boolean U(Ref.ObjectRef objectRef, T t10, H it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !(it == objectRef.element || CollectionsKt.contains(t10.f41671i, it)) || it.b().getActivityState() == C3834z.a.f42104a;
    }

    public static final boolean V(Ref.ObjectRef objectRef, H it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != objectRef.element;
    }

    public static final void W(H h10) {
        C3834z b10;
        if (h10 == null || (b10 = h10.b()) == null) {
            return;
        }
        b10.bringToFront();
    }

    public static final Z X(H it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Z) it;
    }

    public static final boolean Y(H it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.b().getActivityState() == C3834z.a.f42104a;
    }

    public static final boolean Z(T t10, H it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (CollectionsKt.contains(t10.f41671i, it) || it.b().getActivityState() == C3834z.a.f42104a) ? false : true;
    }

    public static final boolean a0(H it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.j();
    }

    public static final boolean b0(Ref.ObjectRef objectRef, Z it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != objectRef.element && it.j();
    }

    @Override // com.swmansion.rnscreens.B
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Z c(C3834z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return c.$EnumSwitchMapping$0[screen.getStackPresentation().ordinal()] == 1 ? new Y(screen) : new Y(screen);
    }

    public final void N(C3834z c3834z, boolean z10) {
        int i10 = z10 ? PKIFailureInfo.transactionIdInUse : 393216;
        if (Build.VERSION.SDK_INT >= 26) {
            c3834z.h(z10 ? 16 : 0, i10);
        } else {
            c3834z.i(z10, i10);
        }
    }

    public final void O(Z screenFragment) {
        Intrinsics.checkNotNullParameter(screenFragment, "screenFragment");
        this.f41671i.add(screenFragment);
        w();
    }

    public final void P() {
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new Mc.t(surfaceId, getId()));
        }
    }

    public final void Q() {
        List<b> list = this.f41674l;
        this.f41674l = new ArrayList();
        for (b bVar : list) {
            bVar.a();
            this.f41673k.add(bVar);
        }
    }

    public final b R() {
        if (this.f41673k.isEmpty()) {
            return new b();
        }
        List list = this.f41673k;
        return (b) list.remove(CollectionsKt.getLastIndex(list));
    }

    public final void c0() {
        if (this.f41676n) {
            return;
        }
        P();
    }

    public final void d0(b bVar) {
        Canvas b10 = bVar.b();
        Intrinsics.checkNotNull(b10);
        super.drawChild(b10, bVar.c(), bVar.d());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        InterfaceC2417a interfaceC2417a = this.f41678p;
        if (interfaceC2417a != null) {
            interfaceC2417a.a(this.f41674l);
        }
        Q();
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long j10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        List list = this.f41674l;
        b R10 = R();
        R10.e(canvas);
        R10.f(child);
        R10.g(j10);
        list.add(R10);
        return true;
    }

    public final boolean e0() {
        int i10;
        Iterator it = this.f41623a.iterator();
        int i11 = 0;
        while (true) {
            i10 = -1;
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((H) it.next()).b().getActivityState() != C3834z.a.f42104a) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = this.f41623a;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (((H) listIterator.previous()).b().getActivityState() != C3834z.a.f42104a) {
                i10 = listIterator.nextIndex();
                break;
            }
        }
        if (i11 < 0 || i10 <= i11) {
            return false;
        }
        int i12 = i11 + 1;
        if (i12 <= i10) {
            while (true) {
                p(((H) this.f41623a.get(i12)).b());
                if (i12 == i10) {
                    break;
                }
                i12++;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        InterfaceC2417a interfaceC2417a;
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        this.f41679q.remove(view);
        if (this.f41679q.isEmpty() && (interfaceC2417a = this.f41678p) != null) {
            interfaceC2417a.disable();
        }
        if (this.f41676n) {
            this.f41676n = false;
            P();
        }
    }

    public final boolean f0() {
        Z z10 = this.f41675m;
        if (z10 != null) {
            return Lc.q.e(z10.b()) ? Lc.q.d(z10.b()) : z10.j();
        }
        return false;
    }

    public final void g0() {
        if (this.f41623a.size() > 1 && this.f41677o != null && this.f41675m != null) {
            boolean f02 = f0();
            ArrayList arrayList = this.f41623a;
            for (H h10 : CollectionsKt.asReversed(CollectionsKt.slice((List) arrayList, RangesKt.until(0, arrayList.size() - 1)))) {
                h10.b().g(f02 ? 4 : 0);
                N(h10.b(), !f02);
                if (Intrinsics.areEqual(h10, this.f41677o)) {
                    break;
                }
            }
        }
        C3834z topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.g(0);
        }
        C3834z topScreen2 = getTopScreen();
        if (topScreen2 != null) {
            N(topScreen2, true);
        }
    }

    @NotNull
    public final ArrayList<Z> getFragments() {
        return this.f41670h;
    }

    public final boolean getGoingForward() {
        return this.f41680r;
    }

    @NotNull
    public final C3834z getRootScreen() {
        Object obj;
        C3834z b10;
        Iterator it = this.f41623a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!CollectionsKt.contains(this.f41671i, (H) obj)) {
                break;
            }
        }
        H h10 = (H) obj;
        if (h10 == null || (b10 = h10.b()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return b10;
    }

    @NotNull
    public final List<String> getScreenIds() {
        ArrayList arrayList = this.f41623a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((H) it.next()).b().getScreenId());
        }
        return arrayList2;
    }

    @Override // com.swmansion.rnscreens.B
    @Nullable
    public C3834z getTopScreen() {
        Z z10 = this.f41675m;
        if (z10 != null) {
            return z10.b();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.B
    public boolean n(H h10) {
        return super.n(h10) && !CollectionsKt.contains(this.f41671i, h10);
    }

    @Override // com.swmansion.rnscreens.B
    public void o() {
        Iterator it = this.f41670h.iterator();
        while (it.hasNext()) {
            ((Z) it.next()).E();
        }
    }

    public final void setGoingForward(boolean z10) {
        this.f41680r = z10;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        InterfaceC2417a interfaceC2417a;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view instanceof bd.e)) {
            throw new IllegalStateException(("[RNScreens] Unexpected type of ScreenStack direct subview " + view.getClass()).toString());
        }
        super.startViewTransition(view);
        if (((bd.e) view).getFragment$react_native_screens_release().isRemoving()) {
            this.f41679q.add(view);
        }
        if (!this.f41679q.isEmpty() && (interfaceC2417a = this.f41678p) != null) {
            interfaceC2417a.enable();
        }
        this.f41676n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003b, code lost:
    
        if (r3 == r0.element) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
    @Override // com.swmansion.rnscreens.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u() {
        T t10;
        C3834z.d dVar;
        boolean z10;
        C3834z b10;
        Z z11;
        int count;
        T t11;
        C3834z b11;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        this.f41678p = null;
        Sequence filter = SequencesKt.filter(CollectionsKt.asSequence(CollectionsKt.asReversedMutable(this.f41623a)), new Function1() { // from class: com.swmansion.rnscreens.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean Z10;
                Z10 = T.Z(T.this, (H) obj);
                return Boolean.valueOf(Z10);
            }
        });
        objectRef.element = SequencesKt.firstOrNull(filter);
        H h10 = (H) SequencesKt.firstOrNull(SequencesKt.dropWhile(filter, new Function1() { // from class: com.swmansion.rnscreens.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean a02;
                a02 = T.a0((H) obj);
                return Boolean.valueOf(a02);
            }
        }));
        if (h10 != null) {
            t10 = h10;
        }
        t10 = 0;
        objectRef2.element = t10;
        this.f41677o = (H) t10;
        boolean z12 = CollectionsKt.contains(this.f41670h, objectRef.element) && !CollectionsKt.contains(this.f41672j, objectRef.element);
        T t12 = objectRef.element;
        Z z13 = this.f41675m;
        boolean z14 = t12 != z13;
        if (t12 == 0 || z12) {
            if (t12 == 0 || z13 == null || !z14) {
                dVar = null;
                z10 = true;
            } else {
                dVar = (z13 == null || (b10 = z13.b()) == null) ? null : b10.getStackAnimation();
                z10 = false;
            }
        } else if (z13 != null) {
            z10 = (z13 != null && this.f41623a.contains(z13)) || (((H) objectRef.element).b().getReplaceAnimation() == C3834z.c.f42108a);
            if (z10) {
                b11 = ((H) objectRef.element).b();
            } else {
                Z z15 = this.f41675m;
                if (z15 == null || (b11 = z15.b()) == null) {
                    dVar = null;
                }
            }
            dVar = b11.getStackAnimation();
        } else {
            dVar = C3834z.d.f42112b;
            this.f41680r = true;
            z10 = true;
        }
        this.f41680r = z10;
        if (z10 && (t11 = objectRef.element) != 0 && f41669s.b((H) t11, dVar) && objectRef2.element == 0) {
            this.f41678p = new bd.d();
        } else if (objectRef.element != 0 && z12 && (z11 = this.f41675m) != null && z11.j() && !((H) objectRef.element).j() && (count = SequencesKt.count(SequencesKt.takeWhile(CollectionsKt.asSequence(CollectionsKt.asReversedMutable(this.f41670h)), new Function1() { // from class: com.swmansion.rnscreens.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean b02;
                b02 = T.b0(Ref.ObjectRef.this, (Z) obj);
                return Boolean.valueOf(b02);
            }
        }))) > 1) {
            this.f41678p = new bd.c(Math.max((CollectionsKt.getLastIndex(this.f41670h) - count) + 1, 0));
        }
        androidx.fragment.app.N g10 = g();
        if (dVar != null) {
            AbstractC4060g.a(g10, dVar, z10);
        }
        Iterator it = SequencesKt.filter(CollectionsKt.asSequence(this.f41670h), new Function1() { // from class: com.swmansion.rnscreens.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean S10;
                S10 = T.S(T.this, (Z) obj);
                return Boolean.valueOf(S10);
            }
        }).iterator();
        while (it.hasNext()) {
            g10.n(((Z) it.next()).o());
        }
        Iterator it2 = SequencesKt.filter(SequencesKt.takeWhile(CollectionsKt.asSequence(this.f41623a), new Function1() { // from class: com.swmansion.rnscreens.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean T10;
                T10 = T.T(Ref.ObjectRef.this, (H) obj);
                return Boolean.valueOf(T10);
            }
        }), new Function1() { // from class: com.swmansion.rnscreens.N
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean U10;
                U10 = T.U(Ref.ObjectRef.this, this, (H) obj);
                return Boolean.valueOf(U10);
            }
        }).iterator();
        while (it2.hasNext()) {
            g10.n(((H) it2.next()).o());
        }
        T t13 = objectRef2.element;
        if (t13 == 0 || ((H) t13).o().isAdded()) {
            T t14 = objectRef.element;
            if (t14 != 0 && !((H) t14).o().isAdded()) {
                if (Lc.q.c(((H) objectRef.element).b())) {
                    ((H) objectRef.element).o().postponeEnterTransition();
                }
                g10.b(getId(), ((H) objectRef.element).o());
            }
        } else {
            final H h11 = (H) objectRef.element;
            Iterator it3 = SequencesKt.dropWhile(CollectionsKt.asSequence(this.f41623a), new Function1() { // from class: com.swmansion.rnscreens.O
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean V10;
                    V10 = T.V(Ref.ObjectRef.this, (H) obj);
                    return Boolean.valueOf(V10);
                }
            }).iterator();
            while (it3.hasNext()) {
                g10.b(getId(), ((H) it3.next()).o()).q(new Runnable() { // from class: com.swmansion.rnscreens.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        T.W(H.this);
                    }
                });
            }
        }
        T t15 = objectRef.element;
        this.f41675m = t15 instanceof Z ? (Z) t15 : null;
        this.f41670h.clear();
        CollectionsKt.addAll(this.f41670h, SequencesKt.map(CollectionsKt.asSequence(this.f41623a), new Function1() { // from class: com.swmansion.rnscreens.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Z X10;
                X10 = T.X((H) obj);
                return X10;
            }
        }));
        this.f41672j = SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(this.f41623a), new Function1() { // from class: com.swmansion.rnscreens.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean Y10;
                Y10 = T.Y((H) obj);
                return Boolean.valueOf(Y10);
            }
        }));
        g0();
        g10.k();
    }

    @Override // com.swmansion.rnscreens.B
    public void x() {
        this.f41671i.clear();
        super.x();
    }

    @Override // com.swmansion.rnscreens.B
    public void z(int i10) {
        Set set = this.f41671i;
        TypeIntrinsics.asMutableCollection(set).remove(m(i10));
        super.z(i10);
    }
}
