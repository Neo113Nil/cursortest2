package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.internal.k0;
import com.facebook.w;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.PlayerKt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xsk {
    public static final xsk a = new xsk();
    public static WeakReference b = new WeakReference(null);
    public static Method c;

    public static final View a(View view) {
        if (!cw3.a.contains(xsk.class)) {
            while (view != null) {
                try {
                    xsk xskVar = a;
                    boolean z = false;
                    if (!cw3.a.contains(xskVar)) {
                        try {
                            z = view.getClass().getName().equals("com.facebook.react.ReactRootView");
                        } catch (Throwable th) {
                            cw3.a(xskVar, th);
                        }
                    }
                    if (!z) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th2) {
                    cw3.a(xsk.class, th2);
                }
            }
        }
        return null;
    }

    public static final ArrayList b(View view) {
        if (cw3.a.contains(xsk.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            cw3.a(xsk.class, th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0066, code lost:
    
        if (r7.isInstance(r4) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0062 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:55:0x0027, B:59:0x0030, B:64:0x0047, B:67:0x0050, B:71:0x0062, B:33:0x005d, B:79:0x0041, B:75:0x003b), top: B:54:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(View view) {
        Class<?> cls;
        Class cls2;
        Set set = cw3.a;
        if (set.contains(xsk.class)) {
            return 0;
        }
        try {
            view.getClass();
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            boolean contains = set.contains(xsk.class);
            xsk xskVar = a;
            if (!contains) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        if (!set.contains(xskVar)) {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                            } catch (Throwable th) {
                                cw3.a(xskVar, th);
                            }
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = cw3.a.contains(xskVar) ? null : o9d.class;
                                if (cls2 != null) {
                                }
                            }
                        }
                        cls = null;
                        if (cls != null) {
                        }
                        if (cw3.a.contains(xskVar)) {
                        }
                        if (cls2 != null) {
                        }
                    }
                    i |= 512;
                } catch (Throwable th2) {
                    cw3.a(xsk.class, th2);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? i | C.DEFAULT_BUFFER_SEGMENT_SIZE : view instanceof RadioGroup ? i | 16384 : ((view instanceof ViewGroup) && xskVar.m(view, (View) b.get())) ? i | 64 : i;
                }
                return i | 4096;
            }
            int i2 = i | IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
            if (view instanceof Button) {
                i2 = i | IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID;
                if (view instanceof Switch) {
                    i2 = i | 9221;
                } else if (view instanceof CheckBox) {
                    i2 = 33797 | i;
                }
            }
            int i3 = i2;
            return view instanceof EditText ? i3 | a.o : i3;
        } catch (Throwable th3) {
            cw3.a(xsk.class, th3);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (cw3.a.contains(xsk.class)) {
            return null;
        }
        try {
            view.getClass();
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                n(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList b2 = b(view);
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(d((View) b2.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            cw3.a(xsk.class, th);
            return null;
        }
    }

    public static final View.OnClickListener f(View view) {
        if (cw3.a.contains(xsk.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass();
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            cw3.a(xsk.class, th);
            return null;
        }
    }

    public static final View.OnTouchListener g(View view) {
        try {
            if (!cw3.a.contains(xsk.class)) {
                try {
                    try {
                        Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(view);
                        if (obj != null) {
                            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                            declaredField2.setAccessible(true);
                            Object obj2 = declaredField2.get(obj);
                            obj2.getClass();
                            return (View.OnTouchListener) obj2;
                        }
                    } catch (NoSuchFieldException unused) {
                        w wVar = w.a;
                    }
                } catch (ClassNotFoundException unused2) {
                    w wVar2 = w.a;
                } catch (IllegalAccessException unused3) {
                    w wVar3 = w.a;
                }
            }
            return null;
        } catch (Throwable th) {
            cw3.a(xsk.class, th);
            return null;
        }
    }

    public static final String h(View view) {
        if (cw3.a.contains(xsk.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String obj = hint.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            cw3.a(xsk.class, th);
            return null;
        }
    }

    public static final ViewGroup i(View view) {
        if (!cw3.a.contains(xsk.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th) {
                cw3.a(xsk.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String j(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (cw3.a.contains(xsk.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else if (view instanceof DatePicker) {
                valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
            } else if (view instanceof TimePicker) {
                Integer currentHour = ((TimePicker) view).getCurrentHour();
                currentHour.getClass();
                int intValue = currentHour.intValue();
                Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                currentMinute.getClass();
                valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
            } else if (view instanceof RadioGroup) {
                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                int childCount = ((RadioGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = ((RadioGroup) view).getChildAt(i);
                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                        valueOf = ((RadioButton) childAt).getText();
                        break;
                    }
                }
                valueOf = null;
            } else {
                if (view instanceof RatingBar) {
                    valueOf = String.valueOf(((RatingBar) view).getRating());
                }
                valueOf = null;
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            cw3.a(xsk.class, th);
            return null;
        }
    }

    public static final void n(View view, JSONObject jSONObject) {
        if (cw3.a.contains(xsk.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String j = j(view);
                String h = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (p4h.v(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", k0.d(k0.K(j)));
                }
                jSONObject.put("hint", k0.d(k0.K(h)));
                if (tag != null) {
                    jSONObject.put("tag", k0.d(k0.K(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", k0.d(k0.K(contentDescription.toString())));
                }
                jSONObject.put("dimension", a.e(view));
            } catch (JSONException unused) {
                w wVar = w.a;
            }
        } catch (Throwable th) {
            cw3.a(xsk.class, th);
        }
    }

    public final JSONObject e(View view) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PlayerKt.E_SPORTS_TOP, view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException unused) {
                return jSONObject;
            }
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final View k(View view, float[] fArr) {
        if (!cw3.a.contains(this)) {
            try {
                l();
                Method method = c;
                if (method != null && view != null) {
                    try {
                        Object invoke = method.invoke(null, fArr, view);
                        invoke.getClass();
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            parent.getClass();
                            return (View) parent;
                        }
                    } catch (IllegalAccessException unused) {
                        w wVar = w.a;
                    } catch (InvocationTargetException unused2) {
                        w wVar2 = w.a;
                    }
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void l() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            if (c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                w wVar = w.a;
            } catch (NoSuchMethodException unused2) {
                w wVar2 = w.a;
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final boolean m(View view, View view2) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            view.getClass();
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!set.contains(this)) {
                try {
                    view.getLocationOnScreen(new int[2]);
                    fArr = new float[]{r4[0], r4[1]};
                } catch (Throwable th) {
                    cw3.a(this, th);
                }
            }
            View k = k(view2, fArr);
            if (k != null) {
                return k.getId() == view.getId();
            }
            return false;
        } catch (Throwable th2) {
            cw3.a(this, th2);
            return false;
        }
    }
}
