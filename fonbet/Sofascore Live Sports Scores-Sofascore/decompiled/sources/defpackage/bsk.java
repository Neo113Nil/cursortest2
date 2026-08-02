package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bsk {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final nrk e = new nrk();
    public static final prk f = new prk();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static tuk b(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        tuk tukVar = (tuk) weakHashMap.get(view);
        if (tukVar != null) {
            return tukVar;
        }
        tuk tukVar2 = new tuk(view);
        a.put(view, tukVar2);
        return tukVar2;
    }

    public static x9l c(View view, x9l x9lVar) {
        WindowInsets g = x9lVar.g();
        if (g != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? yrk.a(view, g) : qrk.a(view, g);
            if (!a2.equals(g)) {
                return x9l.h(view, a2);
            }
        }
        return x9lVar;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = ask.d;
        ask askVar = (ask) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (askVar == null) {
            askVar = new ask();
            askVar.a = null;
            askVar.b = null;
            askVar.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, askVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = askVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = ask.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (askVar.a == null) {
                            askVar.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = ask.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                askVar.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    askVar.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = askVar.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = askVar.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    askVar.b = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static boolean e(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = ask.d;
            ask askVar = (ask) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (askVar == null) {
                askVar = new ask();
                askVar.a = null;
                askVar.b = null;
                askVar.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, askVar);
            }
            WeakReference weakReference2 = askVar.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                askVar.c = new WeakReference(keyEvent);
                SparseArray sparseArray = askVar.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    askVar.b = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    pvd.j();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return xrk.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence g(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = wrk.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] i(zb0 zb0Var) {
        return Build.VERSION.SDK_INT >= 31 ? zrk.a(zb0Var) : (String[]) zb0Var.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static bal j(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return yrk.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new bal(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void k(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : a.o);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static x9l l(View view, x9l x9lVar) {
        WindowInsets g = x9lVar.g();
        if (g != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(g);
            if (!onApplyWindowInsets.equals(g)) {
                return x9l.h(view, onApplyWindowInsets);
            }
        }
        return x9lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bp3 m(View view, bp3 bp3Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(bp3Var);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return zrk.b(view, bp3Var);
        }
        ofj ofjVar = (ofj) view.getTag(R.id.tag_on_receive_content_listener);
        mqd mqdVar = e;
        if (ofjVar == null) {
            if (view instanceof mqd) {
                mqdVar = (mqd) view;
            }
            return mqdVar.a(bp3Var);
        }
        bp3 a2 = ofj.a(view, bp3Var);
        if (a2 == null) {
            return null;
        }
        if (view instanceof mqd) {
            mqdVar = (mqd) view;
        }
        return mqdVar.a(a2);
    }

    public static void n(int i, View view) {
        ArrayList h = h(view);
        for (int i2 = 0; i2 < h.size(); i2++) {
            if (((x9) h.get(i2)).a() == i) {
                h.remove(i2);
                return;
            }
        }
    }

    public static void o(View view, x9 x9Var, sa saVar) {
        x9 x9Var2 = new x9(null, x9Var.b, null, saVar, x9Var.c);
        View.AccessibilityDelegate f2 = f(view);
        p9 p9Var = f2 == null ? null : f2 instanceof o9 ? ((o9) f2).a : new p9(f2);
        if (p9Var == null) {
            p9Var = new p9();
        }
        q(view, p9Var);
        n(x9Var2.a(), view);
        h(view).add(x9Var2);
        k(0, view);
    }

    public static void p(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            xrk.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void q(View view, p9 p9Var) {
        if (p9Var == null && (f(view) instanceof o9)) {
            p9Var = new p9();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(p9Var == null ? null : p9Var.b);
    }

    public static void r(View view, CharSequence charSequence) {
        new ork(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        prk prkVar = f;
        if (charSequence == null) {
            prkVar.a.remove(view);
            view.removeOnAttachStateChangeListener(prkVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(prkVar);
        } else {
            prkVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(prkVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(prkVar);
            }
        }
    }
}
