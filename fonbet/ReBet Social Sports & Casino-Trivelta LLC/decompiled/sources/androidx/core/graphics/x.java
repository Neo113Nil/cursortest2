package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.h;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import v0.i;

/* loaded from: classes.dex */
public class x extends C {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f19115b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f19116c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f19117d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f19118e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f19116c = constructor;
        f19115b = cls;
        f19117d = method2;
        f19118e = method;
    }

    public static boolean i(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f19117d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f19115b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f19118e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean k() {
        Method method = f19117d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object l() {
        try {
            return f19116c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C
    public Typeface a(Context context, h.c cVar, Resources resources, int i10) {
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        for (h.d dVar : cVar.a()) {
            ByteBuffer b10 = D.b(context, resources, dVar.b());
            if (b10 == null || !i(l10, b10, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return j(l10);
    }

    @Override // androidx.core.graphics.C
    public Typeface b(Context context, CancellationSignal cancellationSignal, i.b[] bVarArr, int i10) {
        Object l10 = l();
        if (l10 == null) {
            return null;
        }
        z.r rVar = new z.r();
        for (i.b bVar : bVarArr) {
            Uri e10 = bVar.e();
            ByteBuffer byteBuffer = (ByteBuffer) rVar.get(e10);
            if (byteBuffer == null) {
                byteBuffer = D.f(context, cancellationSignal, e10);
                rVar.put(e10, byteBuffer);
            }
            if (byteBuffer == null || !i(l10, byteBuffer, bVar.d(), bVar.g(), bVar.h())) {
                return null;
            }
        }
        Typeface j10 = j(l10);
        if (j10 == null) {
            return null;
        }
        return Typeface.create(j10, i10);
    }
}
