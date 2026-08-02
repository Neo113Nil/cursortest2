package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import androidx.customview.widget.b;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.AbstractC6836B;
import y0.AbstractC6839b;
import y0.C6835A;
import y0.z;
import z.s;

/* loaded from: classes.dex */
public abstract class a extends C2075a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a NODE_ADAPTER = new C0367a();
    private static final b.InterfaceC0368b SPARSE_VALUES_ADAPTER = new b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    public class C0367a implements b.a {
        @Override // androidx.customview.widget.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(z zVar, Rect rect) {
            zVar.m(rect);
        }
    }

    public class b implements b.InterfaceC0368b {
        @Override // androidx.customview.widget.b.InterfaceC0368b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public z a(s sVar, int i10) {
            return (z) sVar.l(i10);
        }

        @Override // androidx.customview.widget.b.InterfaceC0368b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(s sVar) {
            return sVar.k();
        }
    }

    public class c extends C6835A {
        public c() {
        }

        @Override // y0.C6835A
        public z b(int i10) {
            return z.l0(a.this.obtainAccessibilityNodeInfo(i10));
        }

        @Override // y0.C6835A
        public z d(int i10) {
            int i11 = i10 == 2 ? a.this.mAccessibilityFocusedVirtualViewId : a.this.mKeyboardFocusedVirtualViewId;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // y0.C6835A
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.performAction(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC2082d0.x(view) == 0) {
            AbstractC2082d0.t0(view, 1);
        }
    }

    public static Rect l(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    public static int n(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final boolean c(int i10) {
        if (this.mAccessibilityFocusedVirtualViewId != i10) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i10, PKIFailureInfo.notAuthorized);
        return true;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i10) {
        if (this.mKeyboardFocusedVirtualViewId != i10) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i10, false);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public final boolean d() {
        int i10 = this.mKeyboardFocusedVirtualViewId;
        return i10 != Integer.MIN_VALUE && onPerformActionForVirtualView(i10, 16, null);
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                s(Integer.MIN_VALUE);
                return true;
            }
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            s(virtualViewAt);
            if (virtualViewAt != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int n10 = n(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && o(n10, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    d();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return o(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return o(1, null);
                }
            }
        }
        return false;
    }

    public final AccessibilityEvent e(int i10, int i11) {
        return i10 != -1 ? f(i10, i11) : g(i11);
    }

    public final AccessibilityEvent f(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        z obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i10);
        obtain.getText().add(obtainAccessibilityNodeInfo.J());
        obtain.setContentDescription(obtainAccessibilityNodeInfo.w());
        obtain.setScrollable(obtainAccessibilityNodeInfo.e0());
        obtain.setPassword(obtainAccessibilityNodeInfo.c0());
        obtain.setEnabled(obtainAccessibilityNodeInfo.V());
        obtain.setChecked(obtainAccessibilityNodeInfo.S());
        onPopulateEventForVirtualView(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(obtainAccessibilityNodeInfo.s());
        AbstractC6836B.c(obtain, this.mHost, i10);
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent g(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.C2075a
    public C6835A getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f10, float f11);

    public abstract void getVisibleVirtualViews(List list);

    public final z h(int i10) {
        z j02 = z.j0();
        j02.C0(true);
        j02.E0(true);
        j02.w0(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        j02.s0(rect);
        j02.t0(rect);
        j02.O0(this.mHost);
        onPopulateNodeForVirtualView(i10, j02);
        if (j02.J() == null && j02.w() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        j02.m(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int k10 = j02.k();
        if ((k10 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((k10 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        j02.M0(this.mHost.getContext().getPackageName());
        j02.X0(this.mHost, i10);
        if (this.mAccessibilityFocusedVirtualViewId == i10) {
            j02.q0(true);
            j02.a(128);
        } else {
            j02.q0(false);
            j02.a(64);
        }
        boolean z10 = this.mKeyboardFocusedVirtualViewId == i10;
        if (z10) {
            j02.a(2);
        } else if (j02.X()) {
            j02.a(1);
        }
        j02.F0(z10);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        j02.n(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            j02.m(this.mTempScreenRect);
            if (j02.f68195b != -1) {
                z j03 = z.j0();
                for (int i11 = j02.f68195b; i11 != -1; i11 = j03.f68195b) {
                    j03.P0(this.mHost, -1);
                    j03.s0(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i11, j03);
                    j03.m(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                j03.n0();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                j02.t0(this.mTempScreenRect);
                if (m(this.mTempScreenRect)) {
                    j02.d1(true);
                }
            }
        }
        return j02;
    }

    public final z i() {
        z k02 = z.k0(this.mHost);
        AbstractC2082d0.Y(this.mHost, k02);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (k02.r() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k02.d(this.mHost, ((Integer) arrayList.get(i10)).intValue());
        }
        return k02;
    }

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i10) {
        invalidateVirtualView(i10, 0);
    }

    public final s j() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        s sVar = new s();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sVar.i(((Integer) arrayList.get(i10)).intValue(), h(((Integer) arrayList.get(i10)).intValue()));
        }
        return sVar;
    }

    public final void k(int i10, Rect rect) {
        obtainAccessibilityNodeInfo(i10).m(rect);
    }

    public final boolean m(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean o(int i10, Rect rect) {
        z zVar;
        s j10 = j();
        int i11 = this.mKeyboardFocusedVirtualViewId;
        z zVar2 = i11 == Integer.MIN_VALUE ? null : (z) j10.e(i11);
        if (i10 == 1 || i10 == 2) {
            zVar = (z) androidx.customview.widget.b.d(j10, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, zVar2, i10, AbstractC2082d0.z(this.mHost) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.mKeyboardFocusedVirtualViewId;
            if (i12 != Integer.MIN_VALUE) {
                k(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                l(this.mHost, i10, rect2);
            }
            zVar = (z) androidx.customview.widget.b.c(j10, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, zVar2, rect2, i10);
        }
        return requestKeyboardFocusForVirtualView(zVar != null ? j10.h(j10.g(zVar)) : Integer.MIN_VALUE);
    }

    @NonNull
    public z obtainAccessibilityNodeInfo(int i10) {
        return i10 == -1 ? i() : h(i10);
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11 = this.mKeyboardFocusedVirtualViewId;
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (z10) {
            o(i10, rect);
        }
    }

    @Override // androidx.core.view.C2075a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.C2075a
    public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
        super.onInitializeAccessibilityNodeInfo(view, zVar);
        onPopulateNodeForHost(zVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle);

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i10, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public abstract void onPopulateNodeForVirtualView(int i10, z zVar);

    public void onVirtualViewKeyboardFocusChanged(int i10, boolean z10) {
    }

    public final boolean p(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? onPerformActionForVirtualView(i10, i11, bundle) : c(i10) : r(i10) : clearKeyboardFocusForVirtualView(i10) : requestKeyboardFocusForVirtualView(i10);
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? p(i10, i11, bundle) : q(i11, bundle);
    }

    public final boolean q(int i10, Bundle bundle) {
        return AbstractC2082d0.a0(this.mHost, i10, bundle);
    }

    public final boolean r(int i10) {
        int i11;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i11 = this.mAccessibilityFocusedVirtualViewId) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            c(i11);
        }
        this.mAccessibilityFocusedVirtualViewId = i10;
        this.mHost.invalidate();
        sendEventForVirtualView(i10, 32768);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i10) {
        int i11;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i11 = this.mKeyboardFocusedVirtualViewId) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i10;
        onVirtualViewKeyboardFocusChanged(i10, true);
        sendEventForVirtualView(i10, 8);
        return true;
    }

    public final void s(int i10) {
        int i11 = this.mHoveredVirtualViewId;
        if (i11 == i10) {
            return;
        }
        this.mHoveredVirtualViewId = i10;
        sendEventForVirtualView(i10, 128);
        sendEventForVirtualView(i11, 256);
    }

    public final boolean sendEventForVirtualView(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, e(i10, i11));
    }

    public final void invalidateVirtualView(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent e10 = e(i10, 2048);
        AbstractC6839b.b(e10, i11);
        parent.requestSendAccessibilityEvent(this.mHost, e10);
    }

    public void onPopulateNodeForHost(@NonNull z zVar) {
    }
}
