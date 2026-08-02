package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.z0;
import f3.x;
import io.sentry.hints.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import s.k;
import s.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b extends androidx.core.view.b {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final c NODE_ADAPTER;
    private static final d SPARSE_VALUES_ADAPTER;
    private final View mHost;
    private final AccessibilityManager mManager;
    private a mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    static {
        int i5 = 2;
        NODE_ADAPTER = new j(i5);
        SPARSE_VALUES_ADAPTER = new m3.f(i5);
    }

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = z0.f1413a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public final AccessibilityEvent a(int i5, int i10) {
        if (i5 == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
            this.mHost.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i10);
        q0.c obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i5);
        obtain2.getText().add(obtainAccessibilityNodeInfo.g());
        AccessibilityNodeInfo accessibilityNodeInfo = obtainAccessibilityNodeInfo.f21914a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i5, obtain2);
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(this.mHost, i5);
        obtain2.setPackageName(this.mHost.getContext().getPackageName());
        return obtain2;
    }

    public final q0.c b(int i5) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        q0.c cVar = new q0.c(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        cVar.j(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        obtain.setParent(this.mHost);
        onPopulateNodeForVirtualView(i5, cVar);
        if (cVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        cVar.f(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        View view = this.mHost;
        cVar.f21915b = i5;
        obtain.setSource(view, i5);
        if (this.mAccessibilityFocusedVirtualViewId == i5) {
            obtain.setAccessibilityFocused(true);
            cVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            cVar.a(64);
        }
        boolean z5 = this.mKeyboardFocusedVirtualViewId == i5;
        if (z5) {
            cVar.a(2);
        } else if (obtain.isFocusable()) {
            cVar.a(1);
        }
        obtain.setFocused(z5);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        obtain.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            cVar.f(this.mTempScreenRect);
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                obtain.setBoundsInScreen(this.mTempScreenRect);
                Rect rect2 = this.mTempScreenRect;
                if (rect2 != null && !rect2.isEmpty() && this.mHost.getWindowVisibility() == 0) {
                    Object parent = this.mHost.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            cVar.f21914a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return cVar;
    }

    public final boolean c(int i5, Rect rect) {
        Object obj;
        q0.c cVar;
        int e7;
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        int i10 = 0;
        o oVar = new o(0);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            oVar.f(((Integer) arrayList.get(i11)).intValue(), b(((Integer) arrayList.get(i11)).intValue()));
        }
        int i12 = this.mKeyboardFocusedVirtualViewId;
        q0.c cVar2 = i12 == Integer.MIN_VALUE ? null : (q0.c) oVar.d(i12);
        int i13 = -1;
        if (i5 == 1 || i5 == 2) {
            View view = this.mHost;
            WeakHashMap weakHashMap = z0.f1413a;
            boolean z5 = view.getLayoutDirection() == 1;
            d dVar = SPARSE_VALUES_ADAPTER;
            c cVar3 = NODE_ADAPTER;
            ((m3.f) dVar).getClass();
            int g10 = oVar.g();
            ArrayList arrayList2 = new ArrayList(g10);
            for (int i14 = 0; i14 < g10; i14++) {
                arrayList2.add((q0.c) oVar.h(i14));
            }
            Collections.sort(arrayList2, new e(z5, cVar3));
            if (i5 == 1) {
                int size = arrayList2.size();
                if (cVar2 != null) {
                    size = arrayList2.indexOf(cVar2);
                }
                int i15 = size - 1;
                if (i15 >= 0) {
                    obj = arrayList2.get(i15);
                    cVar = (q0.c) obj;
                }
                obj = null;
                cVar = (q0.c) obj;
            } else {
                if (i5 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (cVar2 == null ? -1 : arrayList2.lastIndexOf(cVar2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    cVar = (q0.c) obj;
                }
                obj = null;
                cVar = (q0.c) obj;
            }
        } else {
            if (i5 != 17 && i5 != 33 && i5 != 66 && i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i16 = this.mKeyboardFocusedVirtualViewId;
            if (i16 != Integer.MIN_VALUE) {
                obtainAccessibilityNodeInfo(i16).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view2 = this.mHost;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i5 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i5 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i5 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            d dVar2 = SPARSE_VALUES_ADAPTER;
            c cVar4 = NODE_ADAPTER;
            Rect rect3 = new Rect(rect2);
            if (i5 == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i5 == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i5 == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i5 != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            ((m3.f) dVar2).getClass();
            int g11 = oVar.g();
            Rect rect4 = new Rect();
            cVar = null;
            for (int i17 = 0; i17 < g11; i17++) {
                q0.c cVar5 = (q0.c) oVar.h(i17);
                if (cVar5 != cVar2) {
                    ((j) cVar4).getClass();
                    cVar5.f(rect4);
                    if (x.h0(i5, rect2, rect4)) {
                        if (x.h0(i5, rect2, rect3) && !x.G(i5, rect2, rect4, rect3)) {
                            if (!x.G(i5, rect2, rect3, rect4)) {
                                int i02 = x.i0(i5, rect2, rect4);
                                int j0 = x.j0(i5, rect2, rect4);
                                int i18 = (j0 * j0) + (i02 * 13 * i02);
                                int i03 = x.i0(i5, rect2, rect3);
                                int j02 = x.j0(i5, rect2, rect3);
                                if (i18 >= (j02 * j02) + (i03 * 13 * i03)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        cVar = cVar5;
                    }
                }
            }
        }
        q0.c cVar6 = cVar;
        if (cVar6 == null) {
            e7 = Integer.MIN_VALUE;
        } else {
            if (oVar.f22576a) {
                k.a(oVar);
            }
            int i19 = oVar.f22579d;
            while (true) {
                if (i10 >= i19) {
                    break;
                }
                if (oVar.f22578c[i10] == cVar6) {
                    i13 = i10;
                    break;
                }
                i10++;
            }
            e7 = oVar.e(i13);
        }
        return requestKeyboardFocusForVirtualView(e7);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i5) {
        if (this.mKeyboardFocusedVirtualViewId != i5) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i5, false);
        sendEventForVirtualView(i5, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        int i5;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            int i10 = this.mHoveredVirtualViewId;
            if (i10 != virtualViewAt) {
                this.mHoveredVirtualViewId = virtualViewAt;
                sendEventForVirtualView(virtualViewAt, 128);
                sendEventForVirtualView(i10, 256);
            }
            if (virtualViewAt == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i5 = this.mHoveredVirtualViewId) == Integer.MIN_VALUE) {
                return false;
            }
            if (i5 != Integer.MIN_VALUE) {
                this.mHoveredVirtualViewId = Integer.MIN_VALUE;
                sendEventForVirtualView(Integer.MIN_VALUE, 128);
                sendEventForVirtualView(i5, 256);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i5 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i10 = 33;
                                } else if (keyCode == 21) {
                                    i10 = 17;
                                } else if (keyCode != 22) {
                                    i10 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z5 = false;
                                while (i5 < repeatCount && c(i10, null)) {
                                    i5++;
                                    z5 = true;
                                }
                                return z5;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = this.mKeyboardFocusedVirtualViewId;
                    if (i11 != Integer.MIN_VALUE) {
                        onPerformActionForVirtualView(i11, 16, null);
                    }
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return c(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1, null);
                }
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.b
    public q0.f getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new a(this);
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

    public abstract int getVirtualViewAt(float f6, float f10);

    public abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i5) {
        invalidateVirtualView(i5, 0);
    }

    @NonNull
    public q0.c obtainAccessibilityNodeInfo(int i5) {
        if (i5 != -1) {
            return b(i5);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.mHost);
        q0.c cVar = new q0.c(obtain);
        View view = this.mHost;
        WeakHashMap weakHashMap = z0.f1413a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            cVar.f21914a.addChild(this.mHost, ((Integer) arrayList.get(i10)).intValue());
        }
        return cVar;
    }

    public final void onFocusChanged(boolean z5, int i5, Rect rect) {
        int i10 = this.mKeyboardFocusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i10);
        }
        if (z5) {
            c(i5, rect);
        }
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.b
    public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        onPopulateNodeForHost(cVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i5, int i10, Bundle bundle);

    public abstract void onPopulateNodeForVirtualView(int i5, q0.c cVar);

    public boolean performAction(int i5, int i10, Bundle bundle) {
        int i11;
        if (i5 == -1) {
            View view = this.mHost;
            WeakHashMap weakHashMap = z0.f1413a;
            return view.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 1) {
            return requestKeyboardFocusForVirtualView(i5);
        }
        if (i10 == 2) {
            return clearKeyboardFocusForVirtualView(i5);
        }
        if (i10 != 64) {
            if (i10 != 128) {
                return onPerformActionForVirtualView(i5, i10, bundle);
            }
            if (this.mAccessibilityFocusedVirtualViewId != i5) {
                return false;
            }
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i5, 65536);
            return true;
        }
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i11 = this.mAccessibilityFocusedVirtualViewId) == i5) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i11, 65536);
        }
        this.mAccessibilityFocusedVirtualViewId = i5;
        this.mHost.invalidate();
        sendEventForVirtualView(i5, 32768);
        return true;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i5) {
        int i10;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i10 = this.mKeyboardFocusedVirtualViewId) == i5) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i10);
        }
        if (i5 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i5;
        onVirtualViewKeyboardFocusChanged(i5, true);
        sendEventForVirtualView(i5, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i5, int i10) {
        ViewParent parent;
        if (i5 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, a(i5, i10));
    }

    public final void invalidateVirtualView(int i5, int i10) {
        ViewParent parent;
        if (i5 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent a7 = a(i5, 2048);
        a7.setContentChangeTypes(i10);
        parent.requestSendAccessibilityEvent(this.mHost, a7);
    }

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@NonNull q0.c cVar) {
    }

    public void onPopulateEventForVirtualView(int i5, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onVirtualViewKeyboardFocusChanged(int i5, boolean z5) {
    }
}
