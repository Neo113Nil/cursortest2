package m;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static Field f56046a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f56047b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f56048c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f56049d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f56050e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f56051f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f56052g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f56053h;

    public static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    public static void b(Resources resources) {
        Object obj;
        if (!f56053h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f56052g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f56053h = true;
        }
        Field field = f56052g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f56047b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f56046a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f56047b = true;
        }
        Field field2 = f56046a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    public static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f56049d) {
            try {
                f56048c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f56049d = true;
        }
        Class cls = f56048c;
        if (cls == null) {
            return;
        }
        if (!f56051f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f56050e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f56051f = true;
        }
        Field field = f56050e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
