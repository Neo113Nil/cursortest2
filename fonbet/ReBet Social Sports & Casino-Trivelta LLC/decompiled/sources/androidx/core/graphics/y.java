package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.h;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import v0.i;

/* loaded from: classes.dex */
public class y extends w {

    /* renamed from: g, reason: collision with root package name */
    public final Class f19119g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f19120h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f19121i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f19122j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f19123k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f19124l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f19125m;

    public y() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = w();
            constructor = x(cls);
            method = t(cls);
            method2 = u(cls);
            method3 = y(cls);
            method4 = s(cls);
            method5 = v(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f19119g = cls;
        this.f19120h = constructor;
        this.f19121i = method;
        this.f19122j = method2;
        this.f19123k = method3;
        this.f19124l = method4;
        this.f19125m = method5;
    }

    @Override // androidx.core.graphics.w, androidx.core.graphics.C
    public Typeface a(Context context, h.c cVar, Resources resources, int i10) {
        if (!r()) {
            return super.a(context, cVar, resources, i10);
        }
        Object m10 = m();
        if (m10 == null) {
            return null;
        }
        h.d[] a10 = cVar.a();
        int length = a10.length;
        int i11 = 0;
        while (i11 < length) {
            h.d dVar = a10[i11];
            Context context2 = context;
            if (!o(context2, m10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                n(m10);
                return null;
            }
            i11++;
            context = context2;
        }
        if (q(m10)) {
            return j(m10);
        }
        return null;
    }

    @Override // androidx.core.graphics.w, androidx.core.graphics.C
    public Typeface b(Context context, CancellationSignal cancellationSignal, i.b[] bVarArr, int i10) {
        Typeface j10;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (r()) {
            Map h10 = D.h(context, bVarArr, cancellationSignal);
            Object m10 = m();
            if (m10 == null) {
                return null;
            }
            int length = bVarArr.length;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < length) {
                i.b bVar = bVarArr[i11];
                ByteBuffer byteBuffer = (ByteBuffer) h10.get(bVar.e());
                if (byteBuffer == null) {
                    obj = m10;
                } else {
                    boolean p10 = p(m10, byteBuffer, bVar.d(), bVar.g(), bVar.h() ? 1 : 0);
                    obj = m10;
                    if (!p10) {
                        n(obj);
                        return null;
                    }
                    z10 = true;
                }
                i11++;
                m10 = obj;
                z10 = z10;
            }
            Object obj2 = m10;
            if (!z10) {
                n(obj2);
                return null;
            }
            if (q(obj2) && (j10 = j(obj2)) != null) {
                return Typeface.create(j10, i10);
            }
            return null;
        }
        i.b h11 = h(bVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h11.e(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h11.g()).setItalic(h11.h()).build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.c(context, cancellationSignal, list, i10);
    }

    @Override // androidx.core.graphics.C
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        if (!r()) {
            return super.e(context, resources, i10, str, i11);
        }
        Object m10 = m();
        if (m10 == null) {
            return null;
        }
        if (!o(context, m10, str, 0, -1, -1, null)) {
            n(m10);
            return null;
        }
        if (q(m10)) {
            return j(m10);
        }
        return null;
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f19119g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f19125m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object m() {
        try {
            return this.f19120h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void n(Object obj) {
        try {
            this.f19124l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean o(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f19121i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean p(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f19122j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean q(Object obj) {
        try {
            return ((Boolean) this.f19123k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r() {
        if (this.f19121i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f19121i != null;
    }

    public Method s(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    public Method t(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Method u(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method v(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class w() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor x(Class cls) {
        return cls.getConstructor(null);
    }

    public Method y(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
