package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class z5k extends h5a {
    public static Class p = null;
    public static Constructor q = null;
    public static Method r = null;
    public static Method s = null;
    public static boolean t = false;
    public final Class i;
    public final Constructor j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;

    public z5k() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = c0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = d0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.i = cls;
        this.j = constructor;
        this.k = method2;
        this.l = method3;
        this.m = method4;
        this.n = method5;
        this.o = method;
    }

    public static boolean Y(String str, boolean z, int i, Object obj) {
        b0();
        try {
            return ((Boolean) r.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            is8.h(e);
            return false;
        }
    }

    public static void b0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (t) {
            return;
        }
        t = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        q = constructor;
        p = cls;
        r = method2;
        s = method;
    }

    public static Method c0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // defpackage.h5a
    public final Typeface G(Context context, lg8 lg8Var, Resources resources, int i) {
        Object obj;
        mg8[] mg8VarArr = lg8Var.a;
        int i2 = 0;
        if (this.k == null) {
            b0();
            try {
                Object newInstance = q.newInstance(null);
                for (mg8 mg8Var : mg8VarArr) {
                    File G = q5a.G(context);
                    if (G != null) {
                        try {
                            if (!q5a.z(G, resources, mg8Var.f)) {
                                return null;
                            }
                            if (!Y(G.getPath(), mg8Var.c, mg8Var.b, newInstance)) {
                                return null;
                            }
                            G.delete();
                        } catch (RuntimeException unused) {
                            return null;
                        } finally {
                            G.delete();
                        }
                    }
                }
                b0();
                try {
                    Object newInstance2 = Array.newInstance((Class<?>) p, 1);
                    Array.set(newInstance2, 0, newInstance);
                    return (Typeface) s.invoke(null, newInstance2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    is8.h(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                is8.h(e2);
                return null;
            }
        }
        try {
            obj = this.j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj != null) {
            int length = mg8VarArr.length;
            while (true) {
                if (i2 < length) {
                    mg8 mg8Var2 = mg8VarArr[i2];
                    z5k z5kVar = this;
                    Context context2 = context;
                    if (z5kVar.X(context2, obj, mg8Var2.a, mg8Var2.e, mg8Var2.b, mg8Var2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(mg8Var2.d))) {
                        i2++;
                        this = z5kVar;
                        context = context2;
                    } else {
                        try {
                            z5kVar.n.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    }
                } else {
                    z5k z5kVar2 = this;
                    if (z5kVar2.a0(obj)) {
                        return z5kVar2.Z(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.h5a
    public final Typeface H(Context context, yg8[] yg8VarArr, int i) {
        Object obj;
        Typeface Z;
        boolean z;
        if (yg8VarArr.length >= 1) {
            try {
                if (this.k != null) {
                    HashMap hashMap = new HashMap();
                    for (yg8 yg8Var : yg8VarArr) {
                        if (yg8Var.f == 0) {
                            Uri uri = yg8Var.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, q5a.J(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.j.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = yg8VarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method = this.n;
                            if (i2 < length) {
                                yg8 yg8Var2 = yg8VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(yg8Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.l.invoke(obj, byteBuffer, Integer.valueOf(yg8Var2.b), null, Integer.valueOf(yg8Var2.c), Integer.valueOf(yg8Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method.invoke(obj, null);
                            } else if (a0(obj) && (Z = Z(obj)) != null) {
                                return Typeface.create(Z, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                    boolean z3 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    yg8 yg8Var3 = null;
                    for (yg8 yg8Var4 : yg8VarArr) {
                        int abs = (Math.abs(yg8Var4.c - i3) * 2) + (yg8Var4.d == z3 ? 0 : 1);
                        if (yg8Var3 == null || i4 > abs) {
                            yg8Var3 = yg8Var4;
                            i4 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(yg8Var3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(yg8Var3.c).setItalic(yg8Var3.d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.h5a
    public final Typeface J(Context context, Resources resources, int i, String str) {
        Object obj;
        if (this.k != null) {
            try {
                obj = this.j.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!X(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.n.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (a0(obj)) {
                    return Z(obj);
                }
            }
        } else {
            File G = q5a.G(context);
            if (G != null) {
                try {
                    if (q5a.z(G, resources, i)) {
                        return Typeface.createFromFile(G.getPath());
                    }
                    return null;
                } catch (RuntimeException unused3) {
                    return null;
                } finally {
                    G.delete();
                }
            }
        }
        return null;
    }

    public final boolean X(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.k.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface Z(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.i, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.o.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean a0(Object obj) {
        try {
            return ((Boolean) this.m.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method d0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
