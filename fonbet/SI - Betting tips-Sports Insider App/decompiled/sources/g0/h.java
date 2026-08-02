package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.android.core.w0;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class h extends a.a {

    /* renamed from: e, reason: collision with root package name */
    public static Class f9686e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Constructor f9687f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Method f9688g = null;

    /* renamed from: h, reason: collision with root package name */
    public static Method f9689h = null;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f9690i = false;

    public static boolean H(Object obj, String str, int i5, boolean z5) {
        I();
        try {
            try {
                return ((Boolean) f9688g.invoke(obj, str, Integer.valueOf(i5), Boolean.valueOf(z5))).booleanValue();
            } catch (InvocationTargetException e7) {
                e = e7;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e9) {
            e = e9;
        }
    }

    public static void I() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f9690i) {
            return;
        }
        f9690i = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            w0.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f9687f = constructor;
        f9686e = cls;
        f9688g = method2;
        f9689h = method;
    }

    @Override // a.a
    public Typeface k(Context context, f0.e eVar, Resources resources, int i5) {
        I();
        try {
            Object newInstance = f9687f.newInstance(null);
            for (f0.f fVar : eVar.f9277a) {
                File x10 = ci.c.x(context);
                if (x10 == null) {
                    return null;
                }
                try {
                    if (!ci.c.j(x10, resources, fVar.f9283f)) {
                        return null;
                    }
                    if (!H(newInstance, x10.getPath(), fVar.f9279b, fVar.f9280c)) {
                        return null;
                    }
                    x10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    x10.delete();
                }
            }
            I();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f9686e, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f9689h.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // a.a
    public Typeface l(Context context, m0.i[] iVarArr, int i5) {
        File file;
        String readlink;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q(iVarArr, i5).f20130a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                            FileInputStream n9 = y4.a.n(new FileInputStream(fileDescriptor), fileDescriptor);
                            Typeface n10 = n(context, n9);
                            n9.close();
                            openFileDescriptor.close();
                            return n10;
                        }
                        Typeface n102 = n(context, n9);
                        n9.close();
                        openFileDescriptor.close();
                        return n102;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileDescriptor fileDescriptor2 = openFileDescriptor.getFileDescriptor();
                    FileInputStream n92 = y4.a.n(new FileInputStream(fileDescriptor2), fileDescriptor2);
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
