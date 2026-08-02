package g0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.sentry.android.core.w0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class j extends h {
    public final Class j;

    /* renamed from: k, reason: collision with root package name */
    public final Constructor f9695k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f9696l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f9697m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f9698n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f9699o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f9700p;

    public j() {
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
            method2 = M(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = N(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            w0.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.j = cls;
        this.f9695k = constructor;
        this.f9696l = method2;
        this.f9697m = method3;
        this.f9698n = method4;
        this.f9699o = method5;
        this.f9700p = method;
    }

    public static Method M(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean J(Context context, Object obj, String str, int i5, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9696l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface K(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9700p.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean L(Object obj) {
        try {
            return ((Boolean) this.f9698n.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method N(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // g0.h, a.a
    public final Typeface k(Context context, f0.e eVar, Resources resources, int i5) {
        Object obj;
        Method method = this.f9696l;
        if (method == null) {
            w0.m("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.k(context, eVar, resources, i5);
        }
        try {
            obj = this.f9695k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            f0.f[] fVarArr = eVar.f9277a;
            int length = fVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    f0.f fVar = fVarArr[i10];
                    Context context2 = context;
                    if (J(context2, obj, fVar.f9278a, fVar.f9282e, fVar.f9279b, fVar.f9280c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f9281d))) {
                        i10++;
                        context = context2;
                    } else {
                        try {
                            this.f9699o.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (L(obj)) {
                    return K(obj);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[SYNTHETIC] */
    @Override // g0.h, a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface l(Context context, m0.i[] iVarArr, int i5) {
        Object obj;
        Typeface K;
        boolean z5;
        boolean z7;
        Method method;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        boolean z10 = true;
        if (iVarArr.length >= 1) {
            Method method2 = this.f9696l;
            if (method2 == null) {
                w0.m("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method2 != null) {
                    HashMap hashMap = new HashMap();
                    for (m0.i iVar : iVarArr) {
                        if (iVar.f20135f == 0) {
                            Uri uri = iVar.f20130a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, ci.c.L(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f9695k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = iVarArr.length;
                        int i10 = 0;
                        boolean z11 = false;
                        while (true) {
                            Method method3 = this.f9699o;
                            if (i10 < length) {
                                m0.i iVar2 = iVarArr[i10];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f20130a);
                                if (byteBuffer == null) {
                                    z5 = z10;
                                } else {
                                    int i11 = iVar2.f20131b;
                                    int i12 = iVar2.f20132c;
                                    boolean z12 = iVar2.f20133d;
                                    try {
                                        method = this.f9697m;
                                        valueOf = Integer.valueOf(i11);
                                        valueOf2 = Integer.valueOf(i12);
                                        valueOf3 = Integer.valueOf(z12 ? 1 : 0);
                                        z5 = z10;
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z5 = z10;
                                    }
                                    try {
                                        Object[] objArr = new Object[5];
                                        objArr[0] = byteBuffer;
                                        objArr[z5 ? 1 : 0] = valueOf;
                                        objArr[2] = null;
                                        objArr[3] = valueOf2;
                                        objArr[4] = valueOf3;
                                        z7 = ((Boolean) method.invoke(obj, objArr)).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                                        z7 = false;
                                        if (z7) {
                                        }
                                    }
                                    if (z7) {
                                        method3.invoke(obj, null);
                                        break;
                                    }
                                    z11 = z5 ? 1 : 0;
                                }
                                i10++;
                                z10 = z5;
                                z11 = z11;
                            } else if (!z11) {
                                method3.invoke(obj, null);
                            } else if (L(obj) && (K = K(obj)) != null) {
                                return Typeface.create(K, i5);
                            }
                        }
                    }
                } else {
                    m0.i q = q(iVarArr, i5);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q.f20130a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(q.f20132c).setItalic(q.f20133d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    } else if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    @Override // a.a
    public final Typeface o(Context context, Resources resources, int i5, String str, int i10) {
        Object obj;
        Method method = this.f9696l;
        if (method == null) {
            w0.m("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.o(context, resources, i5, str, i10);
        }
        try {
            obj = this.f9695k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!J(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f9699o.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (L(obj)) {
                return K(obj);
            }
        }
        return null;
    }
}
