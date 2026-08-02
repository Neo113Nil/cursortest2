package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.google.android.material.tabs.TabLayout;
import com.sports.insider.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f1413a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f1414b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1415c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1416d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f1417e = new k0();

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f1418f = new m0();

    public static g1 a(View view) {
        if (f1413a == null) {
            f1413a = new WeakHashMap();
        }
        g1 g1Var = (g1) f1413a.get(view);
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1Var2 = new g1(view);
        f1413a.put(view, g1Var2);
        return g1Var2;
    }

    public static k2 b(View view, k2 k2Var) {
        int i5 = Build.VERSION.SDK_INT;
        WindowInsets g10 = k2Var.g();
        if (g10 != null) {
            WindowInsets a7 = i5 >= 30 ? w0.a(view, g10) : o0.a(view, g10);
            if (!a7.equals(g10)) {
                return k2.h(view, a7);
            }
        }
        return k2Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = y0.f1406d;
        y0 y0Var = (y0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (y0Var == null) {
            y0Var = new y0();
            y0Var.f1407a = null;
            y0Var.f1408b = null;
            y0Var.f1409c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, y0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = y0Var.f1407a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = y0.f1406d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (y0Var.f1407a == null) {
                            y0Var.f1407a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = y0.f1406d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                y0Var.f1407a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    y0Var.f1407a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a7 = y0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a7 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (y0Var.f1408b == null) {
                    y0Var.f1408b = new SparseArray();
                }
                y0Var.f1408b.put(keyCode, new WeakReference(a7));
            }
        }
        return a7 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return v0.a(view);
        }
        if (f1415c) {
            return null;
        }
        if (f1414b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1414b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1415c = true;
                return null;
            }
        }
        try {
            Object obj = f1414b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1415c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = u0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(androidx.appcompat.widget.d0 d0Var) {
        return Build.VERSION.SDK_INT >= 31 ? x0.a(d0Var) : (String[]) d0Var.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static q2 h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return w0.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new q2(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void i(int i5, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z5 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z5) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z5 ? 32 : 2048);
                obtain.setContentChangeTypes(i5);
                if (z5) {
                    obtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i5 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i5);
                        return;
                    } catch (AbstractMethodError e7) {
                        io.sentry.android.core.w0.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i5);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static k2 j(View view, k2 k2Var) {
        WindowInsets g10 = k2Var.g();
        if (g10 != null) {
            WindowInsets b10 = o0.b(view, g10);
            if (!b10.equals(g10)) {
                return k2.h(view, b10);
            }
        }
        return k2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h k(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return x0.b(view, hVar);
        }
        androidx.core.widget.k kVar = (androidx.core.widget.k) view.getTag(R.id.tag_on_receive_content_listener);
        y yVar = f1417e;
        if (kVar == null) {
            if (view instanceof y) {
                yVar = (y) view;
            }
            return yVar.onReceiveContent(hVar);
        }
        h a7 = androidx.core.widget.k.a(view, hVar);
        if (a7 == null) {
            return null;
        }
        if (view instanceof y) {
            yVar = (y) view;
        }
        return yVar.onReceiveContent(a7);
    }

    public static void l(int i5, View view) {
        ArrayList f6 = f(view);
        for (int i10 = 0; i10 < f6.size(); i10++) {
            if (((q0.b) f6.get(i10)).a() == i5) {
                f6.remove(i10);
                return;
            }
        }
    }

    public static void m(View view, q0.b bVar, String str, q0.o oVar) {
        if (oVar == null && str == null) {
            l(bVar.a(), view);
            i(0, view);
            return;
        }
        q0.b bVar2 = new q0.b(null, bVar.f21910b, str, oVar, bVar.f21911c);
        View.AccessibilityDelegate d10 = d(view);
        b bVar3 = d10 == null ? null : d10 instanceof a ? ((a) d10).f1279a : new b(d10);
        if (bVar3 == null) {
            bVar3 = new b();
        }
        o(view, bVar3);
        l(bVar2.a(), view);
        f(view).add(bVar2);
        i(0, view);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            v0.b(view, context, iArr, attributeSet, typedArray, i5, 0);
        }
    }

    public static void o(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.getBridge());
    }

    public static void p(View view, CharSequence charSequence) {
        new l0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        m0 m0Var = f1418f;
        if (charSequence == null) {
            m0Var.f1356a.remove(view);
            view.removeOnAttachStateChangeListener(m0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(m0Var);
        } else {
            m0Var.f1356a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(m0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(m0Var);
            }
        }
    }

    public static void q(TabLayout.TabView tabView, h9.c cVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            s0.a(tabView, (PointerIcon) cVar.f10430b);
        }
    }

    public static void r(View view, j1 j1Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            q1.h(view, j1Var);
            return;
        }
        PathInterpolator pathInterpolator = n1.f1363e;
        View.OnApplyWindowInsetsListener m1Var = new m1(view, j1Var);
        view.setTag(R.id.tag_window_insets_animation_callback, m1Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(m1Var);
        }
    }
}
