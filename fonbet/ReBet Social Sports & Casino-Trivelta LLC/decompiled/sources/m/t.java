package m;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.C2048c;
import androidx.appcompat.widget.C2050e;
import androidx.appcompat.widget.C2057l;
import androidx.appcompat.widget.C2059n;
import androidx.appcompat.widget.C2062q;
import androidx.appcompat.widget.C2064t;
import androidx.appcompat.widget.C2068x;
import androidx.appcompat.widget.X;
import androidx.core.view.AbstractC2082d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class t {
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: a, reason: collision with root package name */
    public static final z.r f56040a = new z.r();

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final View f56041a;

        /* renamed from: b, reason: collision with root package name */
        public final String f56042b;

        /* renamed from: c, reason: collision with root package name */
        public Method f56043c;

        /* renamed from: d, reason: collision with root package name */
        public Context f56044d;

        public a(View view, String str) {
            this.f56041a = view;
            this.f56042b = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f56042b, View.class)) != null) {
                        this.f56043c = method;
                        this.f56044d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f56041a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f56041a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f56042b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f56041a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f56043c == null) {
                a(this.f56041a.getContext());
            }
            try {
                this.f56043c.invoke(this.f56044d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.j.View, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(l.j.f55314i3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(l.j.f55319j3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId)) ? context : new androidx.appcompat.view.d(context, resourceId);
    }

    public final void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            AbstractC2082d0.m0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            AbstractC2082d0.o0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            AbstractC2082d0.z0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C2048c c(Context context, AttributeSet attributeSet) {
        return new C2048c(context, attributeSet);
    }

    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public C2050e f(Context context, AttributeSet attributeSet) {
        return new C2050e(context, attributeSet);
    }

    public AppCompatEditText g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    public C2057l h(Context context, AttributeSet attributeSet) {
        return new C2057l(context, attributeSet);
    }

    public AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public C2059n j(Context context, AttributeSet attributeSet) {
        return new C2059n(context, attributeSet);
    }

    public C2062q k(Context context, AttributeSet attributeSet) {
        return new C2062q(context, attributeSet);
    }

    public androidx.appcompat.widget.r l(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    public C2064t m(Context context, AttributeSet attributeSet) {
        return new C2064t(context, attributeSet);
    }

    public AppCompatSpinner n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public C2068x o(Context context, AttributeSet attributeSet) {
        return new C2068x(context, attributeSet);
    }

    public androidx.appcompat.widget.B p(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.B(context, attributeSet);
    }

    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View l10;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = X.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                l10 = l(context2, attributeSet);
                v(l10, str);
                break;
            case "CheckedTextView":
                l10 = f(context2, attributeSet);
                v(l10, str);
                break;
            case "MultiAutoCompleteTextView":
                l10 = j(context2, attributeSet);
                v(l10, str);
                break;
            case "TextView":
                l10 = o(context2, attributeSet);
                v(l10, str);
                break;
            case "ImageButton":
                l10 = h(context2, attributeSet);
                v(l10, str);
                break;
            case "SeekBar":
                l10 = m(context2, attributeSet);
                v(l10, str);
                break;
            case "Spinner":
                l10 = n(context2, attributeSet);
                v(l10, str);
                break;
            case "RadioButton":
                l10 = k(context2, attributeSet);
                v(l10, str);
                break;
            case "ToggleButton":
                l10 = p(context2, attributeSet);
                v(l10, str);
                break;
            case "ImageView":
                l10 = i(context2, attributeSet);
                v(l10, str);
                break;
            case "AutoCompleteTextView":
                l10 = c(context2, attributeSet);
                v(l10, str);
                break;
            case "CheckBox":
                l10 = e(context2, attributeSet);
                v(l10, str);
                break;
            case "EditText":
                l10 = g(context2, attributeSet);
                v(l10, str);
                break;
            case "Button":
                l10 = d(context2, attributeSet);
                v(l10, str);
                break;
            default:
                l10 = q(context2, str, attributeSet);
                break;
        }
        if (l10 == null && context != context2) {
            l10 = t(context2, str, attributeSet);
        }
        if (l10 != null) {
            b(l10, attributeSet);
            a(context2, l10, attributeSet);
        }
        return l10;
    }

    public final View s(Context context, String str, String str2) {
        String str3;
        z.r rVar = f56040a;
        Constructor constructor = (Constructor) rVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            rVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i10 >= strArr.length) {
                    return null;
                }
                View s10 = s(context, str, strArr[i10]);
                if (s10 != null) {
                    return s10;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
