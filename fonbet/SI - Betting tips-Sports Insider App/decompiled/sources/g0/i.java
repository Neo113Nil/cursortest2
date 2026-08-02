package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import io.sentry.android.core.w0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import s.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends a.a {

    /* renamed from: e, reason: collision with root package name */
    public static final Class f9691e;

    /* renamed from: f, reason: collision with root package name */
    public static final Constructor f9692f;

    /* renamed from: g, reason: collision with root package name */
    public static final Method f9693g;

    /* renamed from: h, reason: collision with root package name */
    public static final Method f9694h;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            w0.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            method2 = null;
        }
        f9692f = constructor;
        f9691e = cls;
        f9693g = method2;
        f9694h = method;
    }

    public static boolean H(Object obj, ByteBuffer byteBuffer, int i5, int i10, boolean z5) {
        try {
            return ((Boolean) f9693g.invoke(obj, byteBuffer, Integer.valueOf(i5), null, Integer.valueOf(i10), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface I(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f9691e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f9694h.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.a
    public final Typeface k(Context context, f0.e eVar, Resources resources, int i5) {
        Object obj;
        int i10;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream m6;
        try {
            obj = f9692f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (f0.f fVar : eVar.f9277a) {
                int i11 = fVar.f9283f;
                File x10 = ci.c.x(context);
                if (x10 != null) {
                    try {
                        if (ci.c.j(x10, resources, i11)) {
                            try {
                                m6 = y4.a.m(new FileInputStream(x10), x10);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = m6.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                m6.close();
                                i10 = (mappedByteBuffer != null && H(obj, mappedByteBuffer, fVar.f9282e, fVar.f9279b, fVar.f9280c)) ? i10 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        x10.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return I(obj);
        }
        return null;
    }

    @Override // a.a
    public final Typeface l(Context context, m0.i[] iVarArr, int i5) {
        Object obj;
        try {
            obj = f9692f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            n nVar = new n(0);
            int length = iVarArr.length;
            while (true) {
                if (i10 < length) {
                    m0.i iVar = iVarArr[i10];
                    Uri uri = iVar.f20130a;
                    ByteBuffer byteBuffer = (ByteBuffer) nVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = ci.c.L(context, uri);
                        nVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !H(obj, byteBuffer, iVar.f20131b, iVar.f20132c, iVar.f20133d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface I = I(obj);
                    if (I != null) {
                        return Typeface.create(I, i5);
                    }
                }
            }
        }
        return null;
    }
}
