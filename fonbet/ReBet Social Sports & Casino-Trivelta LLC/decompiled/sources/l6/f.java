package l6;

import T7.Y;
import android.util.Log;
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
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.facebook.react.uimanager.ViewProps;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f55644a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final String f55645b = f.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f55646c = new WeakReference(null);

    /* renamed from: d, reason: collision with root package name */
    public static Method f55647d;

    public static final View a(View view) {
        if (Y7.a.d(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f55644a.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th2) {
                Y7.a.b(th2, f.class);
            }
        }
        return null;
    }

    public static final List b(View view) {
        int childCount;
        if (Y7.a.d(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                    if (i11 >= childCount) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final int c(View view) {
        if (Y7.a.d(f.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            int i10 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i10 |= 32;
            }
            if (o(view)) {
                i10 |= 512;
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    return view instanceof RatingBar ? 65536 | i10 : view instanceof RadioGroup ? i10 | 16384 : ((view instanceof ViewGroup) && f55644a.p(view, (View) f55646c.get())) ? i10 | 64 : i10;
                }
                return i10 | 4096;
            }
            int i11 = i10 | 1025;
            if (view instanceof Button) {
                i11 = i10 | 1029;
                if (view instanceof Switch) {
                    i11 = i10 | 9221;
                } else if (view instanceof CheckBox) {
                    i11 = 33797 | i10;
                }
            }
            return view instanceof EditText ? i11 | 2048 : i11;
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (Y7.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f55646c = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List b10 = b(view);
                int size = b10.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(d((View) b10.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e10) {
                Log.e(f55645b, "Failed to create JSONObject for view.", e10);
                return jSONObject;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        Field declaredField;
        if (Y7.a.d(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        Field declaredField;
        try {
            if (Y7.a.d(f.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        return (View.OnTouchListener) obj2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                } catch (NoSuchFieldException e10) {
                    Y y10 = Y.f11042a;
                    Y.j0(f55645b, e10);
                    return null;
                }
            } catch (ClassNotFoundException e11) {
                Y y11 = Y.f11042a;
                Y.j0(f55645b, e11);
                return null;
            } catch (IllegalAccessException e12) {
                Y y12 = Y.f11042a;
                Y.j0(f55645b, e12);
                return null;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final String i(View view) {
        if (Y7.a.d(f.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String obj = hint.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final ViewGroup j(View view) {
        if (Y7.a.d(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final String k(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (Y7.a.d(f.class)) {
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
                int year = ((DatePicker) view).getYear();
                int month = ((DatePicker) view).getMonth();
                int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
            } else if (view instanceof TimePicker) {
                Integer currentHour = ((TimePicker) view).getCurrentHour();
                Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                int intValue = currentHour.intValue();
                Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                int intValue2 = currentMinute.intValue();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
            } else if (view instanceof RadioGroup) {
                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                int childCount = ((RadioGroup) view).getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View childAt = ((RadioGroup) view).getChildAt(i10);
                        if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                            valueOf = ((RadioButton) childAt).getText();
                            break;
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
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
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return null;
        }
    }

    public static final boolean o(View view) {
        if (Y7.a.d(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            f fVar = f55644a;
            Class f10 = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (f10 != null && f10.isInstance(parent)) {
                return true;
            }
            Class f11 = fVar.f("androidx.core.view.NestedScrollingChild");
            if (f11 != null) {
                if (f11.isInstance(parent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Object obj = null;
            try {
                try {
                    field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        field2 = null;
                        if (field != null) {
                        }
                        view.setOnClickListener(onClickListener);
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                field = null;
            }
            if (field != null || field2 == null) {
                view.setOnClickListener(onClickListener);
                return;
            }
            field.setAccessible(true);
            field2.setAccessible(true);
            try {
                field.setAccessible(true);
                obj = field.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(onClickListener);
            } else {
                field2.set(obj, onClickListener);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public static final void s(View view, JSONObject json) {
        if (Y7.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String k10 = k(view);
                String i10 = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", c(view));
                json.put(StackTraceHelper.ID_KEY, view.getId());
                if (d.g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", Y.k(Y.I0(k10), ""));
                }
                json.put("hint", Y.k(Y.I0(i10), ""));
                if (tag != null) {
                    json.put("tag", Y.k(Y.I0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", Y.k(Y.I0(contentDescription.toString()), ""));
                }
                json.put("dimension", f55644a.e(view));
            } catch (JSONException e10) {
                Y y10 = Y.f11042a;
                Y.j0(f55645b, e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, f.class);
        }
    }

    public final JSONObject e(View view) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ViewProps.TOP, view.getTop());
                jSONObject.put(ViewProps.LEFT, view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e10) {
                Log.e(f55645b, "Failed to create JSONObject for dimension.", e10);
                return jSONObject;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final Class f(String str) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final View l(float[] fArr, View view) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = f55647d;
            if (method != null && view != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object invoke = method.invoke(null, fArr, view);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    View view2 = (View) invoke;
                    if (view2.getId() > 0) {
                        Object parent = view2.getParent();
                        if (parent != null) {
                            return (View) parent;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                } catch (IllegalAccessException e10) {
                    Y y10 = Y.f11042a;
                    Y.j0(f55645b, e10);
                } catch (InvocationTargetException e11) {
                    Y y11 = Y.f11042a;
                    Y.j0(f55645b, e11);
                }
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final float[] m(View view) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r2[0], r2[1]};
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final void n() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (f55647d != null) {
                return;
            }
            try {
                TouchTargetHelper touchTargetHelper = TouchTargetHelper.INSTANCE;
                Method declaredMethod = TouchTargetHelper.class.getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f55647d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e10) {
                Y y10 = Y.f11042a;
                Y.j0(f55645b, e10);
            } catch (NoSuchMethodException e11) {
                Y y11 = Y.f11042a;
                Y.j0(f55645b, e11);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final boolean p(View view, View view2) {
        View l10;
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") && (l10 = l(m(view), view2)) != null) {
                if (l10.getId() == view.getId()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean q(View view) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }
}
