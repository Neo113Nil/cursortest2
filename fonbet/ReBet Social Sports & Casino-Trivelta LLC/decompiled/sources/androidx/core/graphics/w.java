package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v0.i;

/* loaded from: classes.dex */
public class w extends C {

    /* renamed from: b, reason: collision with root package name */
    public static Class f19110b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f19111c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f19112d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f19113e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f19114f = false;

    public static boolean i(Object obj, String str, int i10, boolean z10) {
        l();
        try {
            return ((Boolean) f19112d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface j(Object obj) {
        l();
        try {
            Object newInstance = Array.newInstance((Class<?>) f19110b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f19113e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void l() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f19114f) {
            return;
        }
        f19114f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f19111c = constructor;
        f19110b = cls;
        f19112d = method2;
        f19113e = method;
    }

    private static Object m() {
        l();
        try {
            return f19111c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.C
    public Typeface a(Context context, h.c cVar, Resources resources, int i10) {
        Object m10 = m();
        for (h.d dVar : cVar.a()) {
            File e10 = D.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!D.c(e10, resources, dVar.b())) {
                    return null;
                }
                if (!i(m10, e10.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                e10.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return j(m10);
    }

    @Override // androidx.core.graphics.C
    public Typeface b(Context context, CancellationSignal cancellationSignal, i.b[] bVarArr, int i10) {
        FileInputStream fileInputStream;
        Typeface d10;
        if (bVarArr.length < 1) {
            return null;
        }
        i.b h10 = h(bVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h10.e(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File k10 = k(openFileDescriptor);
                try {
                    if (k10 != null && k10.canRead()) {
                        d10 = Typeface.createFromFile(k10);
                        openFileDescriptor.close();
                        return d10;
                    }
                    d10 = super.d(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return d10;
                } finally {
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File k(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
