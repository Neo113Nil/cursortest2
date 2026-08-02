package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class aj6 extends p9 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final a99 o;
    public static final wib p;
    public final AccessibilityManager h;
    public final View i;
    public yy j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    static {
        int i = 22;
        o = new a99(i);
        p = new wib(i);
    }

    public aj6(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.p9
    public final j0l b(View view) {
        yy yyVar = this.j;
        if (yyVar != null) {
            return yyVar;
        }
        yy yyVar2 = new yy(this, 1);
        this.j = yyVar2;
        return yyVar2;
    }

    @Override // defpackage.p9
    public final void d(View view, da daVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, daVar.a);
        s(daVar);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        u(i, false);
        w(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        da q = q(i);
        obtain2.getText().add(q.g());
        AccessibilityNodeInfo accessibilityNodeInfo = q.a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            cp4.h("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    public final da l(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        da daVar = new da(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        daVar.k("android.view.View");
        Rect rect = n;
        daVar.i(rect);
        daVar.j(rect);
        daVar.b = -1;
        View view = this.i;
        obtain.setParent(view);
        t(i, daVar);
        if (daVar.g() == null && obtain.getContentDescription() == null) {
            cp4.h("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        obtain.getBoundsInParent(rect2);
        Rect rect3 = this.d;
        daVar.f(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            cp4.h("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            cp4.h("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            cp4.h("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        obtain.setPackageName(view.getContext().getPackageName());
        daVar.c = i;
        obtain.setSource(view, i);
        if (this.k == i) {
            obtain.setAccessibilityFocused(true);
            daVar.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            daVar.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            daVar.a(2);
        } else if (obtain.isFocusable()) {
            daVar.a(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            daVar.i(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (daVar.b != -1) {
                da daVar2 = new da(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                for (int i2 = daVar.b; i2 != -1; i2 = daVar2.b) {
                    daVar2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = daVar2.a;
                    accessibilityNodeInfo.setParent(view, -1);
                    daVar2.i(rect);
                    t(i2, daVar2);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            daVar.j(rect4);
            daVar.f(rect3);
        }
        Rect rect6 = this.f;
        if (view.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect6)) {
                daVar.j(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            daVar.a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return daVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int n2 = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != n2) {
                this.m = n2;
                w(n2, 128);
                w(i2, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            if (n2 == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.m = Integer.MIN_VALUE;
                w(Integer.MIN_VALUE, 128);
                w(i, NotificationCompat.FLAG_LOCAL_ONLY);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    public final boolean p(int i, Rect rect) {
        int i2;
        Object obj;
        da daVar;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        zwh zwhVar = new zwh(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zwhVar.d(((Integer) arrayList.get(i3)).intValue(), l(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        da daVar2 = i4 == Integer.MIN_VALUE ? null : (da) gz8.C(zwhVar, i4);
        a99 a99Var = o;
        wib wibVar = p;
        View view = this.i;
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = view.getLayoutDirection() == 1;
            wibVar.getClass();
            int e = zwhVar.e();
            ArrayList arrayList2 = new ArrayList(e);
            for (int i7 = 0; i7 < e; i7++) {
                arrayList2.add((da) zwhVar.f(i7));
            }
            Collections.sort(arrayList2, new je8(z, a99Var));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (daVar2 != null) {
                    size = arrayList2.indexOf(daVar2);
                }
                int i8 = size - 1;
                obj = i8 >= 0 ? arrayList2.get(i8) : null;
            } else {
                if (i != 2) {
                    a70.p("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (daVar2 == null ? -1 : arrayList2.lastIndexOf(daVar2)) + 1;
                i2 = 0;
                obj = lastIndexOf < size2 ? arrayList2.get(lastIndexOf) : null;
            }
            daVar = (da) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                a70.p("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.l;
            if (i9 != Integer.MIN_VALUE) {
                q(i9).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        a70.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    a70.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            wibVar.getClass();
            int e2 = zwhVar.e();
            Rect rect4 = new Rect();
            daVar = null;
            for (int i10 = 0; i10 < e2; i10++) {
                da daVar3 = (da) zwhVar.f(i10);
                if (daVar3 != daVar2) {
                    a99Var.getClass();
                    daVar3.f(rect4);
                    if (td4.h0(i, rect2, rect4)) {
                        if (td4.h0(i, rect2, rect3) && !td4.P(i, rect2, rect4, rect3)) {
                            if (!td4.P(i, rect2, rect3, rect4)) {
                                int j0 = td4.j0(i, rect2, rect4);
                                int l0 = td4.l0(i, rect2, rect4);
                                int i11 = (l0 * l0) + (j0 * 13 * j0);
                                int j02 = td4.j0(i, rect2, rect3);
                                int l02 = td4.l0(i, rect2, rect3);
                                if (i11 >= (l02 * l02) + (j02 * 13 * j02)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        daVar = daVar3;
                    }
                }
            }
            i2 = 0;
        }
        da daVar4 = daVar;
        if (daVar4 != null) {
            if (zwhVar.a) {
                gz8.H(zwhVar);
            }
            int i12 = zwhVar.d;
            int i13 = i2;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                if (zwhVar.c[i13] == daVar4) {
                    i6 = i13;
                    break;
                }
                i13++;
            }
            i5 = zwhVar.c(i6);
        }
        return v(i5);
    }

    public final da q(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        da daVar = new da(obtain);
        WeakHashMap weakHashMap = bsk.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            cp4.h("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            daVar.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return daVar;
    }

    public abstract boolean r(int i, int i2, Bundle bundle);

    public abstract void t(int i, da daVar);

    public final boolean v(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        u(i, true);
        w(i, 8);
        return true;
    }

    public final void w(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }

    public void s(da daVar) {
    }

    public void u(int i, boolean z) {
    }
}
