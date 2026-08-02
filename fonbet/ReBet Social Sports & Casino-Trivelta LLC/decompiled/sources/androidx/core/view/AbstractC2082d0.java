package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C2075a;
import androidx.core.view.C2111s0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k0.AbstractC5144c;
import y0.InterfaceC6837C;
import y0.z;

/* renamed from: androidx.core.view.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2082d0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f19204a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f19205b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f19206c = false;
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {AbstractC5144c.f54032b, AbstractC5144c.f54033c, AbstractC5144c.f54044n, AbstractC5144c.f54055y, AbstractC5144c.f54012B, AbstractC5144c.f54013C, AbstractC5144c.f54014D, AbstractC5144c.f54015E, AbstractC5144c.f54016F, AbstractC5144c.f54017G, AbstractC5144c.f54034d, AbstractC5144c.f54035e, AbstractC5144c.f54036f, AbstractC5144c.f54037g, AbstractC5144c.f54038h, AbstractC5144c.f54039i, AbstractC5144c.f54040j, AbstractC5144c.f54041k, AbstractC5144c.f54042l, AbstractC5144c.f54043m, AbstractC5144c.f54045o, AbstractC5144c.f54046p, AbstractC5144c.f54047q, AbstractC5144c.f54048r, AbstractC5144c.f54049s, AbstractC5144c.f54050t, AbstractC5144c.f54051u, AbstractC5144c.f54052v, AbstractC5144c.f54053w, AbstractC5144c.f54054x, AbstractC5144c.f54056z, AbstractC5144c.f54011A};

    /* renamed from: d, reason: collision with root package name */
    public static final L f19207d = new L() { // from class: androidx.core.view.c0
        @Override // androidx.core.view.L
        public final C2081d onReceiveContent(C2081d c2081d) {
            return AbstractC2082d0.a(c2081d);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final e f19208e = new e();

    /* renamed from: androidx.core.view.d0$a */
    public class a extends f {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.d0$b */
    public class b extends f {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.d0$c */
    public class c extends f {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.d(view, charSequence);
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.view.d0$d */
    public class d extends f {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        @Override // androidx.core.view.AbstractC2082d0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: androidx.core.view.d0$e */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakHashMap f19209a = new WeakHashMap();

        public void a(View view) {
            this.f19209a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        public final void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (booleanValue != z10) {
                AbstractC2082d0.U(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f19209a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f19209a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.d0$f */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f19210a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f19211b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19212c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19213d;

        public f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f19212c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f19210a);
            if (this.f19211b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                AbstractC2082d0.k(view);
                view.setTag(this.f19210a, obj);
                AbstractC2082d0.U(view, this.f19213d);
            }
        }

        public abstract boolean g(Object obj, Object obj2);

        public f(int i10, Class cls, int i11, int i12) {
            this.f19210a = i10;
            this.f19211b = cls;
            this.f19213d = i11;
            this.f19212c = i12;
        }
    }

    /* renamed from: androidx.core.view.d0$g */
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return AbstractC2092i0.f19235b ? AbstractC2092i0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.d0$h */
    public static class h {

        /* renamed from: androidx.core.view.d0$h$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public F0 f19214a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f19215b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ J f19216c;

            public a(View view, J j10) {
                this.f19215b = view;
                this.f19216c = j10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                F0 z10 = F0.z(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f19215b);
                    if (z10.equals(this.f19214a)) {
                        return this.f19216c.f(view, z10).x();
                    }
                }
                this.f19214a = z10;
                F0 f10 = this.f19216c.f(view, z10);
                if (i10 >= 30) {
                    return f10.x();
                }
                AbstractC2082d0.i0(view);
                return f10.x();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC5144c.f54030T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static F0 b(View view, F0 f02, Rect rect) {
            WindowInsets x10 = f02.x();
            if (x10 != null) {
                return F0.z(view.computeSystemWindowInsets(x10, rect), view);
            }
            rect.setEmpty();
            return f02;
        }

        public static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        public static float e(View view) {
            return view.getElevation();
        }

        public static String f(View view) {
            return view.getTransitionName();
        }

        public static float g(View view) {
            return view.getTranslationZ();
        }

        public static float h(View view) {
            return view.getZ();
        }

        public static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void l(View view, float f10) {
            view.setElevation(f10);
        }

        public static void m(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void n(View view, J j10) {
            a aVar = j10 != null ? new a(view, j10) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC5144c.f54023M, aVar);
            }
            if (view.getTag(AbstractC5144c.f54022L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC5144c.f54030T));
            }
        }

        public static void o(View view, String str) {
            view.setTransitionName(str);
        }

        public static void p(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void q(View view, float f10) {
            view.setZ(f10);
        }

        public static void r(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: androidx.core.view.d0$i */
    public static class i {
        public static F0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            F0 y10 = F0.y(rootWindowInsets);
            y10.u(y10);
            y10.d(view.getRootView());
            return y10;
        }

        public static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* renamed from: androidx.core.view.d0$j */
    public static class j {
        public static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* renamed from: androidx.core.view.d0$k */
    public static class k {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* renamed from: androidx.core.view.d0$l */
    public static class l {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* renamed from: androidx.core.view.d0$m */
    public static class m {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* renamed from: androidx.core.view.d0$n */
    public static class n {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static h1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return h1.h(windowInsetsController);
            }
            return null;
        }

        public static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: androidx.core.view.d0$o */
    public static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C2081d b(View view, C2081d c2081d) {
            ContentInfo f10 = c2081d.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f10 ? c2081d : C2081d.g(performReceiveContent);
        }
    }

    /* renamed from: androidx.core.view.d0$p */
    public static class p {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList f19217d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap f19218a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f19219b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference f19220c = null;

        public static p a(View view) {
            p pVar = (p) view.getTag(AbstractC5144c.f54028R);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(AbstractC5144c.f54028R, pVar2);
            return pVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            return c10 != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f19218a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray d() {
            if (this.f19219b == null) {
                this.f19219b = new SparseArray();
            }
            return this.f19219b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC5144c.f54029S);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f19220c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f19220c = new WeakReference(keyEvent);
            SparseArray d10 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) d10.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap weakHashMap = this.f19218a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f19217d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f19218a == null) {
                        this.f19218a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f19217d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f19218a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f19218a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static int A(View view) {
        return view.getMinimumHeight();
    }

    public static void A0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static int B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, CharSequence charSequence) {
        G0().f(view, charSequence);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(AbstractC5144c.f54025O);
    }

    public static void C0(View view, String str) {
        h.o(view, str);
    }

    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, float f10) {
        h.p(view, f10);
    }

    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, C2111s0.b bVar) {
        C2111s0.d(view, bVar);
    }

    public static ViewParent F(View view) {
        return view.getParentForAccessibility();
    }

    public static void F0(View view, float f10) {
        h.q(view, f10);
    }

    public static F0 G(View view) {
        return i.a(view);
    }

    public static f G0() {
        return new c(AbstractC5144c.f54027Q, CharSequence.class, 64, 30);
    }

    public static CharSequence H(View view) {
        return (CharSequence) G0().e(view);
    }

    public static void H0(View view) {
        h.r(view);
    }

    public static String I(View view) {
        return h.f(view);
    }

    public static float J(View view) {
        return h.g(view);
    }

    public static h1 K(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC2109r0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int L(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float M(View view) {
        return h.h(view);
    }

    public static boolean N(View view) {
        return m(view) != null;
    }

    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean Q(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean R(View view) {
        return view.isLaidOut();
    }

    public static boolean S(View view) {
        return h.i(view);
    }

    public static boolean T(View view) {
        Boolean bool = (Boolean) k0().e(view);
        return bool != null && bool.booleanValue();
    }

    public static void U(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                obtain.setContentChangeTypes(i10);
                if (z10) {
                    obtain.getText().add(o(view));
                    u0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void V(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void W(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static F0 X(View view, F0 f02) {
        WindowInsets x10 = f02.x();
        if (x10 != null) {
            WindowInsets b10 = g.b(view, x10);
            if (!b10.equals(x10)) {
                return F0.z(b10, view);
            }
        }
        return f02;
    }

    public static void Y(View view, y0.z zVar) {
        view.onInitializeAccessibilityNodeInfo(zVar.e1());
    }

    public static f Z() {
        return new b(AbstractC5144c.f54021K, CharSequence.class, 8, 28);
    }

    public static /* synthetic */ C2081d a(C2081d c2081d) {
        return c2081d;
    }

    public static boolean a0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static f b() {
        return new d(AbstractC5144c.f54020J, Boolean.class, 28);
    }

    public static C2081d b0(View view, C2081d c2081d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c2081d);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c2081d);
        }
        K k10 = (K) view.getTag(AbstractC5144c.f54024N);
        if (k10 == null) {
            return v(view).onReceiveContent(c2081d);
        }
        C2081d a10 = k10.a(view, c2081d);
        if (a10 == null) {
            return null;
        }
        return v(view).onReceiveContent(a10);
    }

    public static int c(View view, CharSequence charSequence, InterfaceC6837C interfaceC6837C) {
        int q10 = q(view, charSequence);
        if (q10 != -1) {
            d(view, new z.a(q10, charSequence, interfaceC6837C));
        }
        return q10;
    }

    public static void c0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void d(View view, z.a aVar) {
        k(view);
        g0(aVar.b(), view);
        p(view).add(aVar);
        U(view, 0);
    }

    public static void d0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void e(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        B0.b.b((View) view.getParent(), viewGroup);
    }

    public static void e0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static C2102n0 f(View view) {
        if (f19204a == null) {
            f19204a = new WeakHashMap();
        }
        C2102n0 c2102n0 = (C2102n0) f19204a.get(view);
        if (c2102n0 != null) {
            return c2102n0;
        }
        C2102n0 c2102n02 = new C2102n0(view);
        f19204a.put(view, c2102n02);
        return c2102n02;
    }

    public static void f0(View view, int i10) {
        g0(i10, view);
        U(view, 0);
    }

    public static F0 g(View view, F0 f02, Rect rect) {
        return h.b(view, f02, rect);
    }

    public static void g0(int i10, View view) {
        List p10 = p(view);
        for (int i11 = 0; i11 < p10.size(); i11++) {
            if (((z.a) p10.get(i11)).b() == i10) {
                p10.remove(i11);
                return;
            }
        }
    }

    public static F0 h(View view, F0 f02) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets x10 = f02.x();
        if (x10 != null) {
            WindowInsets a10 = i10 >= 30 ? n.a(view, x10) : g.a(view, x10);
            if (!a10.equals(x10)) {
                return F0.z(a10, view);
            }
        }
        return f02;
    }

    public static void h0(View view, z.a aVar, CharSequence charSequence, InterfaceC6837C interfaceC6837C) {
        if (interfaceC6837C == null && charSequence == null) {
            f0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, interfaceC6837C));
        }
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    public static void i0(View view) {
        g.c(view);
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    public static void j0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static void k(View view) {
        C2075a l10 = l(view);
        if (l10 == null) {
            l10 = new C2075a();
        }
        l0(view, l10);
    }

    public static f k0() {
        return new a(AbstractC5144c.f54026P, Boolean.class, 28);
    }

    public static C2075a l(View view) {
        View.AccessibilityDelegate m10 = m(view);
        if (m10 == null) {
            return null;
        }
        return m10 instanceof C2075a.C0362a ? ((C2075a.C0362a) m10).f19182a : new C2075a(m10);
    }

    public static void l0(View view, C2075a c2075a) {
        if (c2075a == null && (m(view) instanceof C2075a.C0362a)) {
            c2075a = new C2075a();
        }
        u0(view);
        view.setAccessibilityDelegate(c2075a == null ? null : c2075a.getBridge());
    }

    public static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    public static void m0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static View.AccessibilityDelegate n(View view) {
        if (f19206c) {
            return null;
        }
        if (f19205b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f19205b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f19206c = true;
                return null;
            }
        }
        try {
            Object obj = f19205b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f19206c = true;
            return null;
        }
    }

    public static void n0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static CharSequence o(View view) {
        return (CharSequence) Z().e(view);
    }

    public static void o0(View view, CharSequence charSequence) {
        Z().f(view, charSequence);
        if (charSequence != null) {
            f19208e.a(view);
        } else {
            f19208e.d(view);
        }
    }

    public static List p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC5144c.f54018H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(AbstractC5144c.f54018H, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int q(View view, CharSequence charSequence) {
        List p10 = p(view);
        for (int i10 = 0; i10 < p10.size(); i10++) {
            if (TextUtils.equals(charSequence, ((z.a) p10.get(i10)).c())) {
                return ((z.a) p10.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < p10.size(); i14++) {
                z10 &= ((z.a) p10.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void q0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, float f10) {
        h.l(view, f10);
    }

    public static Display t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static float u(View view) {
        return h.e(view);
    }

    public static void u0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static L v(View view) {
        return view instanceof L ? (L) view : f19207d;
    }

    public static void v0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.b(view, i10);
        }
    }

    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    public static void w0(View view, boolean z10) {
        h.m(view, z10);
    }

    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    public static void x0(View view, J j10) {
        h.n(view, j10);
    }

    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(view);
        }
        return 0;
    }

    public static void y0(View view, N n10) {
        j.a(view, (PointerIcon) (n10 != null ? n10.a() : null));
    }

    public static int z(View view) {
        return view.getLayoutDirection();
    }

    public static void z0(View view, boolean z10) {
        k0().f(view, Boolean.valueOf(z10));
    }
}
