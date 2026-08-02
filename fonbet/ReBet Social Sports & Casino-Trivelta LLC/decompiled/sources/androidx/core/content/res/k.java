package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.h;
import androidx.core.content.res.k;
import androidx.core.graphics.v;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import x0.AbstractC6773b;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f19030a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f19031b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f19032c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f19033a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f19034b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19035c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f19033a = colorStateList;
            this.f19034b = configuration;
            this.f19035c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f19036a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f19037b;

        public d(Resources resources, Resources.Theme theme) {
            this.f19036a = resources;
            this.f19037b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f19036a.equals(dVar.f19036a) && AbstractC6773b.a(this.f19037b, dVar.f19037b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC6773b.b(this.f19036a, this.f19037b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.m
                @Override // java.lang.Runnable
                public final void run() {
                    k.e.this.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.l
                @Override // java.lang.Runnable
                public final void run() {
                    k.e.this.g(typeface);
                }
            });
        }

        public abstract void f(int i10);

        public abstract void g(Typeface typeface);
    }

    public static final class f {

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final Object f19038a = new Object();

            /* renamed from: b, reason: collision with root package name */
            public static Method f19039b;

            /* renamed from: c, reason: collision with root package name */
            public static boolean f19040c;

            public static void a(Resources.Theme theme) {
                synchronized (f19038a) {
                    if (!f19040c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f19039b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f19040c = true;
                    }
                    Method method = f19039b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f19039b = null;
                        }
                    }
                }
            }
        }

        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f19032c) {
            try {
                WeakHashMap weakHashMap = f19031b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i10, new c(colorStateList, dVar.f19036a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f19035c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(d dVar, int i10) {
        c cVar;
        synchronized (f19032c) {
            try {
                SparseArray sparseArray = (SparseArray) f19031b.get(dVar);
                if (sparseArray != null && sparseArray.size() > 0 && (cVar = (c) sparseArray.get(i10)) != null) {
                    if (cVar.f19034b.equals(dVar.f19036a.getConfiguration())) {
                        Resources.Theme theme = dVar.f19037b;
                        if (theme == null) {
                            if (cVar.f19035c != 0) {
                            }
                            return cVar.f19033a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i10);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface c(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i10, Resources.Theme theme) {
        return b.a(resources, i10, theme);
    }

    public static ColorStateList e(Resources resources, int i10, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b10 = b(dVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList l10 = l(resources, i10, theme);
        if (l10 == null) {
            return b.b(resources, i10, theme);
        }
        a(dVar, i10, l10, theme);
        return l10;
    }

    public static Drawable f(Resources resources, int i10, Resources.Theme theme) {
        return a.a(resources, i10, theme);
    }

    public static Drawable g(Resources resources, int i10, int i11, Resources.Theme theme) {
        return a.b(resources, i10, i11, theme);
    }

    public static Typeface h(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i10, TypedValue typedValue, int i11, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, typedValue, i11, eVar, null, true, false);
    }

    public static void j(Context context, int i10, e eVar, Handler handler) {
        x0.f.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            n(context, i10, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    public static TypedValue k() {
        ThreadLocal threadLocal = f19030a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList l(Resources resources, int i10, Resources.Theme theme) {
        if (m(resources, i10)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    public static boolean m(Resources resources, int i10) {
        TypedValue k10 = k();
        resources.getValue(i10, k10, true);
        int i11 = k10.type;
        return i11 >= 28 && i11 <= 31;
    }

    public static Typeface n(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface o10 = o(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (o10 != null || eVar != null || z11) {
            return o10;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface o(Context context, Resources resources, TypedValue typedValue, int i10, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
        Typeface g10 = v.g(resources, i10, charSequence2, typedValue.assetCookie, i11);
        if (g10 != null) {
            if (eVar != null) {
                eVar.d(g10, handler);
            }
            return g10;
        }
        if (z11) {
            return null;
        }
        try {
            if (!charSequence2.toLowerCase().endsWith(".xml")) {
                Typeface e10 = v.e(context, resources, i10, charSequence2, typedValue.assetCookie, i11);
                if (eVar != null) {
                    if (e10 != null) {
                        eVar.d(e10, handler);
                        return e10;
                    }
                    eVar.c(-3, handler);
                }
                return e10;
            }
            h.b b10 = h.b(resources.getXml(i10), resources);
            if (b10 == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            }
            try {
                return v.d(context, b10, resources, i10, charSequence2, typedValue.assetCookie, i11, eVar, handler, z10);
            } catch (IOException e11) {
                e = e11;
                charSequence2 = charSequence2;
                Log.e("ResourcesCompat", "Failed to read xml resource " + charSequence2, e);
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e12) {
                e = e12;
                charSequence2 = charSequence2;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + charSequence2, e);
                if (eVar != null) {
                }
                return null;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (XmlPullParserException e14) {
            e = e14;
        }
    }
}
