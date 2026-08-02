package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.b;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class kik {
    public static volatile Handler c = null;
    public static final tc3 g;
    public static final tc3 h;
    public static boolean q = true;
    public static final /* synthetic */ int r = 0;
    public static boolean s;
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ int u = 0;
    public static final /* synthetic */ int v = 0;
    public static final /* synthetic */ int w = 0;
    public static final /* synthetic */ int x = 0;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = new char[64];
    public static final int[] d = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final tc3 f = new tc3(954879418, new qs2(5), false);
    public static final int[] i = new int[0];
    public static final long[] j = new long[0];
    public static final Object[] k = new Object[0];
    public static final byte[] l = {0, 0, 0, 1};
    public static final float[] m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object n = new Object();
    public static int[] o = new int[10];
    public static final Type[] p = new Type[0];

    static {
        int i2 = 6;
        g = new tc3(1918065384, new qs2(i2), false);
        h = new tc3(1124129073, new qd3(i2), false);
    }

    public static Type A(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return W(type, cls, u(type, cls, Map.class));
        }
        ilg.c();
        return null;
    }

    public static Handler B() {
        if (c == null) {
            synchronized (kik.class) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static boolean C(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return C(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            yhk.m("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (C(type2)) {
                return true;
            }
        }
        return false;
    }

    public static int D(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    public static int E(int i2, Object obj) {
        return D(obj == null ? 0 : obj.hashCode(), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(ngj ngjVar, ct8 ct8Var, Throwable th, sq3 sq3Var) {
        r98 r98Var;
        int i2;
        try {
            if (sq3Var instanceof r98) {
                r98Var = (r98) sq3Var;
                int i3 = r98Var.t;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    r98Var.t = i3 - Integer.MIN_VALUE;
                    Object obj = r98Var.s;
                    Object obj2 = lu3.a;
                    i2 = r98Var.t;
                    if (i2 != 0) {
                        y6a.M(obj);
                        r98Var.r = th;
                        r98Var.t = 1;
                        if (ct8Var.invoke(ngjVar, th, r98Var) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = r98Var.r;
                        y6a.M(obj);
                    }
                    return Unit.a;
                }
            }
            if (i2 != 0) {
            }
            return Unit.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                de6.a(th2, th);
            }
            throw th2;
        }
        r98Var = new r98(sq3Var);
        Object obj3 = r98Var.s;
        Object obj22 = lu3.a;
        i2 = r98Var.t;
    }

    public static boolean G(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(byte[] bArr, int i2, b bVar) {
        int i3;
        if (Objects.equals(bVar.o, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(bVar.o, "video/hevc")) {
            k9 P = P(new k9e(bArr, 4, i2 + 4));
            int i4 = P.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && P.c == bVar.F - 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean I(int i2, int i3) {
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            return i3 > 0 || i3 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static IllegalArgumentException J(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder r2 = mz1.r(String.format(str, objArr), "\n    for method ");
        r2.append(method.getDeclaringClass().getSimpleName());
        r2.append(".");
        r2.append(method.getName());
        return new IllegalArgumentException(r2.toString(), exc);
    }

    public static int K(b bVar) {
        String w2 = w(bVar);
        if (Objects.equals(w2, "video/avc")) {
            return 1;
        }
        return (Objects.equals(w2, "video/hevc") || Objects.equals(w2, "video/vvc")) ? 2 : 0;
    }

    public static final xtc L(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new kd8(function1));
    }

    public static IllegalArgumentException M(Method method, int i2, String str, Object... objArr) {
        return J(method, null, fc6.n(str, " (", hie.b.c(method, i2), ")"), objArr);
    }

    public static IllegalArgumentException N(Method method, Exception exc, int i2, String str, Object... objArr) {
        return J(method, exc, fc6.n(str, " (", hie.b.c(method, i2), ")"), objArr);
    }

    public static d0 O(nm2 nm2Var, boolean z) {
        int i2;
        int i3;
        int i4 = nm2Var.i(5);
        if (i4 == 31) {
            i4 = nm2Var.i(6) + 32;
        }
        int i5 = nm2Var.i(4);
        int[] iArr = d;
        if (i5 == 15) {
            i2 = nm2Var.i(24);
        } else {
            if (i5 >= 13) {
                throw r9e.a(null, null);
            }
            i2 = iArr[i5];
        }
        int i6 = nm2Var.i(4);
        String j2 = ljg.j(i4, "mp4a.40.");
        if (i4 == 5 || i4 == 29) {
            int i7 = nm2Var.i(4);
            if (i7 == 15) {
                i3 = nm2Var.i(24);
            } else {
                if (i7 >= 13) {
                    throw r9e.a(null, null);
                }
                i3 = iArr[i7];
            }
            i2 = i3;
            int i8 = nm2Var.i(5);
            if (i8 == 31) {
                i8 = nm2Var.i(6) + 32;
            }
            i4 = i8;
            if (i4 == 22) {
                i6 = nm2Var.i(4);
            }
        }
        if (z) {
            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4 && i4 != 6 && i4 != 7 && i4 != 17) {
                switch (i4) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw r9e.b("Unsupported audio object type: " + i4);
                }
            }
            if (nm2Var.h()) {
                m6k.f0();
            }
            if (nm2Var.h()) {
                nm2Var.t(14);
            }
            boolean h2 = nm2Var.h();
            if (i6 == 0) {
                a70.i();
                return null;
            }
            if (i4 == 6 || i4 == 20) {
                nm2Var.t(3);
            }
            if (h2) {
                if (i4 == 22) {
                    nm2Var.t(16);
                }
                if (i4 == 17 || i4 == 19 || i4 == 20 || i4 == 23) {
                    nm2Var.t(3);
                }
                nm2Var.t(1);
            }
            switch (i4) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i9 = nm2Var.i(2);
                    if (i9 == 2 || i9 == 3) {
                        throw r9e.b("Unsupported epConfig: " + i9);
                    }
            }
        }
        int i10 = e[i6];
        if (i10 != -1) {
            return new d0(i2, i10, j2);
        }
        throw r9e.a(null, null);
    }

    public static k9 P(k9e k9eVar) {
        k9eVar.i();
        return new k9(k9eVar.e(6), k9eVar.e(6), k9eVar.e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y2d Q(k9e k9eVar, boolean z, int i2, y2d y2dVar) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (z) {
            int e2 = k9eVar.e(2);
            z3 = k9eVar.d();
            i6 = k9eVar.e(5);
            i7 = 0;
            for (int i8 = 0; i8 < 32; i8++) {
                if (k9eVar.d()) {
                    i7 |= 1 << i8;
                }
            }
            for (int i9 = 0; i9 < 6; i9++) {
                iArr2[i9] = k9eVar.e(8);
            }
            i3 = e2;
        } else {
            if (y2dVar == null) {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
                int e3 = k9eVar.e(8);
                int i10 = 0;
                for (int i11 = 0; i11 < i2; i11++) {
                    if (k9eVar.d()) {
                        i10 += 88;
                    }
                    if (k9eVar.d()) {
                        i10 += 8;
                    }
                }
                k9eVar.j(i10);
                if (i2 > 0) {
                    k9eVar.j((8 - i2) * 2);
                }
                return new y2d(i3, z2, i4, i5, iArr, e3);
            }
            int i12 = y2dVar.a;
            z3 = y2dVar.b;
            i6 = y2dVar.c;
            i7 = y2dVar.d;
            iArr2 = y2dVar.e;
            i3 = i12;
        }
        iArr = iArr2;
        z2 = z3;
        i4 = i6;
        i5 = i7;
        int e32 = k9eVar.e(8);
        int i102 = 0;
        while (i11 < i2) {
        }
        k9eVar.j(i102);
        if (i2 > 0) {
        }
        return new y2d(i3, z2, i4, i5, iArr, e32);
    }

    public static zid R(int i2, int i3, byte[] bArr) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        k9e k9eVar = new k9e(bArr, i4, i3 + 1);
        while (k9eVar.b(16)) {
            int e2 = k9eVar.e(8);
            int i5 = 0;
            while (e2 == 255) {
                i5 += 255;
                e2 = k9eVar.e(8);
            }
            int i6 = i5 + e2;
            int e3 = k9eVar.e(8);
            int i7 = 0;
            while (e3 == 255) {
                i7 += 255;
                e3 = k9eVar.e(8);
            }
            int i8 = i7 + e3;
            if (i8 == 0 || !k9eVar.b(i8)) {
                return null;
            }
            if (i6 == 176) {
                int f2 = k9eVar.f();
                boolean d2 = k9eVar.d();
                int f3 = d2 ? k9eVar.f() : 0;
                int f4 = k9eVar.f();
                int i9 = -1;
                for (int i10 = 0; i10 <= f4; i10++) {
                    i9 = k9eVar.f();
                    k9eVar.f();
                    int e4 = k9eVar.e(6);
                    if (e4 == 63) {
                        return null;
                    }
                    k9eVar.e(e4 == 0 ? Math.max(0, f2 - 30) : Math.max(0, (e4 + f2) - 31));
                    if (d2) {
                        int e5 = k9eVar.e(6);
                        if (e5 == 63) {
                            return null;
                        }
                        k9eVar.e(e5 == 0 ? Math.max(0, f3 - 30) : Math.max(0, (e5 + f3) - 31));
                    }
                    if (k9eVar.d()) {
                        k9eVar.j(10);
                    }
                }
                return new zid(i9, 7);
            }
            k9eVar.j(i8 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c3d S(byte[] bArr, int i2, int i3, g7h g7hVar) {
        int i4;
        int i5;
        int i6;
        int f2;
        int i7;
        int i8;
        int f3;
        int i9;
        int i10;
        int i11;
        int i12;
        int f4;
        int i13;
        float f5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        z2d z2dVar;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        z2d z2dVar2;
        k9 P = P(new k9e(bArr, i2, i3));
        int i27 = 2;
        k9e k9eVar = new k9e(bArr, i2 + 2, i3);
        k9eVar.j(4);
        int e2 = k9eVar.e(3);
        int i28 = P.b;
        boolean z = i28 != 0 && e2 == 7;
        if (g7hVar != null) {
            hv9 hv9Var = (hv9) g7hVar.b;
            if (!hv9Var.isEmpty()) {
                i4 = ((x2d) hv9Var.get(Math.min(i28, hv9Var.size() - 1))).a;
                y2d y2dVar = null;
                if (z) {
                    k9eVar.i();
                    y2dVar = Q(k9eVar, true, e2, null);
                } else if (g7hVar != null) {
                    z2d z2dVar3 = (z2d) g7hVar.c;
                    int[] iArr = z2dVar3.b;
                    hv9 hv9Var2 = z2dVar3.a;
                    int i29 = iArr[i4];
                    if (hv9Var2.size() > i29) {
                        y2dVar = (y2d) hv9Var2.get(i29);
                    }
                }
                k9eVar.f();
                if (z) {
                    int f6 = k9eVar.f();
                    if (f6 == 3) {
                        k9eVar.i();
                    }
                    int f7 = k9eVar.f();
                    int f8 = k9eVar.f();
                    if (k9eVar.d()) {
                        int f9 = k9eVar.f();
                        int f10 = k9eVar.f();
                        int f11 = k9eVar.f();
                        int f12 = k9eVar.f();
                        if (f6 != 1 && f6 != 2) {
                            i27 = 1;
                        }
                        i5 = lnb.x(f9, f10, i27, f7);
                        i6 = lnb.x(f11, f12, f6 == 1 ? 2 : 1, f8);
                    } else {
                        i5 = f7;
                        i6 = f8;
                    }
                    f2 = k9eVar.f();
                    i7 = i6;
                    i8 = f8;
                    f3 = k9eVar.f();
                    i9 = f7;
                    i10 = i5;
                } else {
                    int e3 = k9eVar.d() ? k9eVar.e(8) : -1;
                    if (g7hVar != null && (z2dVar2 = (z2d) g7hVar.d) != null) {
                        hv9 hv9Var3 = z2dVar2.a;
                        if (e3 == -1) {
                            e3 = z2dVar2.b[i4];
                        }
                        if (e3 != -1 && hv9Var3.size() > e3) {
                            a3d a3dVar = (a3d) hv9Var3.get(e3);
                            int i30 = a3dVar.a;
                            i10 = a3dVar.d;
                            i7 = a3dVar.e;
                            f2 = a3dVar.b;
                            f3 = a3dVar.c;
                            i9 = i10;
                            i8 = i7;
                        }
                    }
                    i8 = 0;
                    i9 = 0;
                    f3 = 0;
                    f2 = 0;
                    i10 = 0;
                    i7 = 0;
                }
                int f13 = k9eVar.f();
                if (z) {
                    i11 = 1;
                    i12 = -1;
                    for (int i31 = k9eVar.d() ? 0 : e2; i31 <= e2; i31++) {
                        k9eVar.f();
                        i12 = Math.max(k9eVar.f(), i12);
                        k9eVar.f();
                    }
                } else {
                    i11 = 1;
                    i12 = -1;
                }
                k9eVar.f();
                k9eVar.f();
                k9eVar.f();
                k9eVar.f();
                k9eVar.f();
                k9eVar.f();
                if (k9eVar.d()) {
                    boolean d2 = z ? k9eVar.d() : false;
                    int i32 = 6;
                    if (d2) {
                        k9eVar.j(6);
                    } else if (k9eVar.d()) {
                        int i33 = 0;
                        int i34 = 4;
                        while (i33 < i34) {
                            int i35 = i34;
                            int i36 = 0;
                            while (i36 < i32) {
                                if (k9eVar.d()) {
                                    i26 = i8;
                                    int min = Math.min(64, i11 << ((i33 << 1) + 4));
                                    if (i33 > i11) {
                                        k9eVar.g();
                                    }
                                    for (int i37 = 0; i37 < min; i37++) {
                                        k9eVar.g();
                                    }
                                } else {
                                    k9eVar.f();
                                    i26 = i8;
                                }
                                i36 += i33 == 3 ? 3 : 1;
                                i8 = i26;
                                i32 = 6;
                                i11 = 1;
                            }
                            i33++;
                            i34 = i35;
                            i32 = 6;
                            i11 = 1;
                        }
                    }
                }
                int i38 = i8;
                k9eVar.j(2);
                if (k9eVar.d()) {
                    k9eVar.j(8);
                    k9eVar.f();
                    k9eVar.f();
                    k9eVar.i();
                }
                f4 = k9eVar.f();
                i13 = 0;
                int[] iArr2 = new int[0];
                int[] iArr3 = new int[0];
                int i39 = i4;
                int i40 = i12;
                int i41 = -1;
                int i42 = -1;
                while (i13 < f4) {
                    if (i13 == 0 || !k9eVar.d()) {
                        i22 = f4;
                        i23 = i13;
                        i24 = f13;
                        i25 = i9;
                        int f14 = k9eVar.f();
                        int f15 = k9eVar.f();
                        int[] iArr4 = new int[f14];
                        int i43 = 0;
                        while (i43 < f14) {
                            iArr4[i43] = (i43 > 0 ? iArr4[i43 - 1] : 0) - (k9eVar.f() + 1);
                            k9eVar.i();
                            i43++;
                        }
                        int[] iArr5 = new int[f15];
                        int i44 = 0;
                        while (i44 < f15) {
                            iArr5[i44] = k9eVar.f() + 1 + (i44 > 0 ? iArr5[i44 - 1] : 0);
                            k9eVar.i();
                            i44++;
                        }
                        iArr2 = iArr4;
                        iArr3 = iArr5;
                        i42 = f15;
                        i41 = f14;
                    } else {
                        i22 = f4;
                        int i45 = i41 + i42;
                        int f16 = (1 - ((k9eVar.d() ? 1 : 0) * 2)) * (k9eVar.f() + 1);
                        i23 = i13;
                        int i46 = i45 + 1;
                        i24 = f13;
                        boolean[] zArr = new boolean[i46];
                        for (int i47 = 0; i47 <= i45; i47++) {
                            if (k9eVar.d()) {
                                zArr[i47] = true;
                            } else {
                                zArr[i47] = k9eVar.d();
                            }
                        }
                        int[] iArr6 = new int[i46];
                        int[] iArr7 = new int[i46];
                        int i48 = 0;
                        for (int i49 = i42 - 1; i49 >= 0; i49--) {
                            int i50 = iArr3[i49] + f16;
                            if (i50 < 0 && zArr[i41 + i49]) {
                                iArr6[i48] = i50;
                                i48++;
                            }
                        }
                        if (f16 < 0 && zArr[i45]) {
                            iArr6[i48] = f16;
                            i48++;
                        }
                        int i51 = i48;
                        i25 = i9;
                        for (int i52 = 0; i52 < i41; i52++) {
                            int i53 = iArr2[i52] + f16;
                            if (i53 < 0 && zArr[i52]) {
                                iArr6[i51] = i53;
                                i51++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr6, i51);
                        int i54 = 0;
                        for (int i55 = i41 - 1; i55 >= 0; i55--) {
                            int i56 = iArr2[i55] + f16;
                            if (i56 > 0 && zArr[i55]) {
                                iArr7[i54] = i56;
                                i54++;
                            }
                        }
                        if (f16 > 0 && zArr[i45]) {
                            iArr7[i54] = f16;
                            i54++;
                        }
                        int i57 = i54;
                        for (int i58 = 0; i58 < i42; i58++) {
                            int i59 = iArr3[i58] + f16;
                            if (i59 > 0 && zArr[i41 + i58]) {
                                iArr7[i57] = i59;
                                i57++;
                            }
                        }
                        iArr3 = Arrays.copyOf(iArr7, i57);
                        iArr2 = copyOf;
                        i42 = i57;
                        i41 = i51;
                    }
                    i13 = i23 + 1;
                    f4 = i22;
                    f13 = i24;
                    i9 = i25;
                }
                int i60 = f13;
                int i61 = i9;
                if (k9eVar.d()) {
                    int f17 = k9eVar.f();
                    for (int i62 = 0; i62 < f17; i62++) {
                        k9eVar.j(i60 + 5);
                    }
                }
                k9eVar.j(2);
                float f18 = 1.0f;
                if (k9eVar.d()) {
                    f5 = 1.0f;
                    i14 = i7;
                    i15 = i38;
                    i16 = -1;
                    i17 = -1;
                    i18 = -1;
                } else {
                    if (k9eVar.d()) {
                        int e4 = k9eVar.e(8);
                        if (e4 == 255) {
                            int e5 = k9eVar.e(16);
                            int e6 = k9eVar.e(16);
                            if (e5 != 0 && e6 != 0) {
                                f18 = e5 / e6;
                            }
                        } else if (e4 < 17) {
                            f18 = m[e4];
                        } else {
                            fn0.r(e4, "Unexpected aspect_ratio_idc value: ");
                        }
                    }
                    if (k9eVar.d()) {
                        k9eVar.i();
                    }
                    if (k9eVar.d()) {
                        k9eVar.j(3);
                        i21 = k9eVar.d() ? 1 : 2;
                        if (k9eVar.d()) {
                            int e7 = k9eVar.e(8);
                            int e8 = k9eVar.e(8);
                            k9eVar.j(8);
                            i19 = w13.f(e7);
                            i20 = w13.g(e8);
                        } else {
                            i19 = -1;
                            i20 = -1;
                        }
                    } else {
                        if (g7hVar != null && (z2dVar = (z2d) g7hVar.e) != null) {
                            hv9 hv9Var4 = z2dVar.a;
                            int i63 = z2dVar.b[i39];
                            if (hv9Var4.size() > i63) {
                                d3d d3dVar = (d3d) hv9Var4.get(i63);
                                int i64 = d3dVar.a;
                                int i65 = d3dVar.b;
                                i20 = d3dVar.c;
                                i19 = i64;
                                i21 = i65;
                            }
                        }
                        i19 = -1;
                        i20 = -1;
                        i21 = -1;
                    }
                    if (k9eVar.d()) {
                        k9eVar.f();
                        k9eVar.f();
                    }
                    k9eVar.i();
                    if (k9eVar.d()) {
                        i7 *= 2;
                    }
                    i16 = i19;
                    f5 = f18;
                    i17 = i21;
                    i14 = i7;
                    i15 = i38;
                    i18 = i20;
                }
                return new c3d(e2, y2dVar, f2, f3, i10, i14, i61, i15, f5, i40, i16, i17, i18);
            }
        }
        i4 = 0;
        y2d y2dVar2 = null;
        if (z) {
        }
        k9eVar.f();
        if (z) {
        }
        int f132 = k9eVar.f();
        if (z) {
        }
        k9eVar.f();
        k9eVar.f();
        k9eVar.f();
        k9eVar.f();
        k9eVar.f();
        k9eVar.f();
        if (k9eVar.d()) {
        }
        int i382 = i8;
        k9eVar.j(2);
        if (k9eVar.d()) {
        }
        f4 = k9eVar.f();
        i13 = 0;
        int[] iArr22 = new int[0];
        int[] iArr32 = new int[0];
        int i392 = i4;
        int i402 = i12;
        int i412 = -1;
        int i422 = -1;
        while (i13 < f4) {
        }
        int i602 = f132;
        int i612 = i9;
        if (k9eVar.d()) {
        }
        k9eVar.j(2);
        float f182 = 1.0f;
        if (k9eVar.d()) {
        }
        return new c3d(e2, y2dVar2, f2, f3, i10, i14, i612, i15, f5, i402, i16, i17, i18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g7h T(int i2, int i3, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        z2d z2dVar;
        int i4;
        int i5;
        int i6;
        vvf vvfVar;
        int i7;
        int[] iArr3;
        vvf vvfVar2;
        vvf vvfVar3;
        boolean[][] zArr;
        int i8;
        boolean[][] zArr2;
        int[] iArr4;
        int[] iArr5;
        int i9;
        int i10;
        boolean d2;
        int i11;
        int i12;
        int i13;
        boolean d3;
        int i14;
        int i15;
        boolean z;
        boolean z2;
        k9e k9eVar = new k9e(bArr, i2, i3);
        P(k9eVar);
        k9eVar.j(4);
        boolean d4 = k9eVar.d();
        boolean d5 = k9eVar.d();
        int e2 = k9eVar.e(6);
        int i16 = e2 + 1;
        int e3 = k9eVar.e(3);
        k9eVar.j(17);
        y2d Q = Q(k9eVar, true, e3, null);
        for (int i17 = k9eVar.d() ? 0 : e3; i17 <= e3; i17++) {
            k9eVar.f();
            k9eVar.f();
            k9eVar.f();
        }
        int e4 = k9eVar.e(6);
        int f2 = k9eVar.f() + 1;
        int i18 = 6;
        z2d z2dVar2 = new z2d(hv9.z(Q), new int[1], 0);
        boolean z3 = i16 >= 2 && f2 >= 2;
        boolean z4 = d4 && d5;
        int i19 = e4 + 1;
        boolean z5 = i19 >= i16;
        if (!z3 || !z4 || !z5) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) cls, f2, i19);
        int i20 = 1;
        int[] iArr7 = new int[f2];
        int[] iArr8 = new int[f2];
        iArr6[0][0] = 0;
        iArr7[0] = 1;
        iArr8[0] = 0;
        for (int i21 = 1; i21 < f2; i21++) {
            int i22 = 0;
            for (int i23 = 0; i23 <= e4; i23++) {
                if (k9eVar.d()) {
                    iArr6[i21][i22] = i23;
                    iArr8[i21] = i23;
                    i22++;
                }
                iArr7[i21] = i22;
            }
        }
        if (k9eVar.d()) {
            k9eVar.j(64);
            if (k9eVar.d()) {
                k9eVar.f();
            }
            int f3 = k9eVar.f();
            int i24 = 0;
            while (i24 < f3) {
                k9eVar.f();
                if (i24 == 0 || k9eVar.d()) {
                    boolean d6 = k9eVar.d();
                    boolean d7 = k9eVar.d();
                    z2 = d6;
                    z = d7;
                    if (d6 || d7) {
                        d2 = k9eVar.d();
                        if (d2) {
                            k9eVar.j(19);
                        }
                        k9eVar.j(8);
                        if (d2) {
                            k9eVar.j(4);
                        }
                        k9eVar.j(15);
                        i12 = d6;
                        i11 = d7;
                        i13 = 0;
                        while (i13 <= e3) {
                            boolean d8 = k9eVar.d();
                            if (!d8) {
                                d8 = k9eVar.d();
                            }
                            if (d8) {
                                k9eVar.f();
                                d3 = false;
                            } else {
                                d3 = k9eVar.d();
                            }
                            if (d3) {
                                i14 = i24;
                                i15 = 0;
                            } else {
                                i14 = i24;
                                i15 = k9eVar.f();
                            }
                            int[][] iArr9 = iArr6;
                            int i25 = i12 + i11;
                            int[] iArr10 = iArr8;
                            int i26 = 0;
                            while (i26 < i25) {
                                int i27 = i25;
                                for (int i28 = 0; i28 <= i15; i28++) {
                                    k9eVar.f();
                                    k9eVar.f();
                                    if (d2) {
                                        k9eVar.f();
                                        k9eVar.f();
                                    }
                                    k9eVar.i();
                                }
                                i26++;
                                i25 = i27;
                            }
                            i13++;
                            i24 = i14;
                            iArr6 = iArr9;
                            iArr8 = iArr10;
                        }
                        i24++;
                    }
                } else {
                    z2 = false;
                    z = false;
                }
                d2 = false;
                i12 = z2;
                i11 = z;
                i13 = 0;
                while (i13 <= e3) {
                }
                i24++;
            }
        }
        int[][] iArr11 = iArr6;
        int[] iArr12 = iArr8;
        if (!k9eVar.d()) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        int i29 = k9eVar.d;
        if (i29 > 0) {
            k9eVar.j(8 - i29);
        }
        y2d Q2 = Q(k9eVar, false, e3, Q);
        boolean d9 = k9eVar.d();
        boolean[] zArr3 = new boolean[16];
        int i30 = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            boolean d10 = k9eVar.d();
            zArr3[i31] = d10;
            if (d10) {
                i30++;
            }
        }
        if (i30 == 0 || !zArr3[1]) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        int[] iArr13 = new int[i30];
        for (int i32 = 0; i32 < i30 - (d9 ? 1 : 0); i32++) {
            iArr13[i32] = k9eVar.e(3);
        }
        int[] iArr14 = new int[i30 + 1];
        if (d9) {
            int i33 = 1;
            while (i33 < i30) {
                int[] iArr15 = iArr14;
                for (int i34 = 0; i34 < i33; i34++) {
                    iArr15[i33] = iArr13[i34] + 1 + iArr15[i33];
                }
                i33++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i30] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i16, i30);
        int[] iArr17 = new int[i16];
        iArr17[0] = 0;
        boolean d11 = k9eVar.d();
        int i35 = 1;
        while (i35 < i16) {
            if (d11) {
                i10 = i35;
                iArr17[i10] = k9eVar.e(i18);
            } else {
                i10 = i35;
                iArr17[i10] = i10;
            }
            if (d9) {
                for (int i36 = 0; i36 < i30; i36++) {
                    iArr16[i10][i36] = (iArr17[i10] & ((1 << iArr[r30]) - 1)) >> iArr[i36];
                }
            } else {
                int i37 = 0;
                while (i37 < i30) {
                    int i38 = i37;
                    iArr16[i10][i38] = k9eVar.e(iArr13[i37] + 1);
                    i37 = i38 + 1;
                }
            }
            i35 = i10 + 1;
            i18 = 6;
        }
        int[] iArr18 = new int[i19];
        int i39 = 1;
        int i40 = 0;
        while (i40 < i16) {
            iArr18[iArr17[i40]] = -1;
            int[] iArr19 = iArr18;
            int i41 = 0;
            int i42 = 0;
            while (i41 < 16) {
                if (zArr3[i41]) {
                    if (i41 == i20) {
                        iArr19[iArr17[i40]] = iArr16[i40][i42];
                    }
                    i42++;
                }
                i41++;
                i20 = 1;
            }
            if (i40 > 0) {
                int i43 = 0;
                while (true) {
                    if (i43 >= i40) {
                        i39++;
                        break;
                    }
                    int i44 = i43;
                    if (iArr19[iArr17[i40]] == iArr19[iArr17[i43]]) {
                        break;
                    }
                    i43 = i44 + 1;
                }
            }
            i40++;
            iArr18 = iArr19;
            i20 = 1;
        }
        int[] iArr20 = iArr18;
        int e5 = k9eVar.e(4);
        if (i39 < 2 || e5 == 0) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        int[] iArr21 = new int[i39];
        for (int i45 = 0; i45 < i39; i45++) {
            iArr21[i45] = k9eVar.e(e5);
        }
        int[] iArr22 = new int[i19];
        for (int i46 = 0; i46 < i16; i46++) {
            iArr22[Math.min(iArr17[i46], e4)] = i46;
        }
        zu9 s2 = hv9.s();
        int i47 = 0;
        while (i47 <= e4) {
            int[] iArr23 = iArr22;
            int i48 = i39;
            int min = Math.min(iArr20[i47], i48 - 1);
            s2.c(new x2d(iArr23[i47], min >= 0 ? iArr21[min] : -1));
            i47++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i39 = i48;
        }
        int[] iArr24 = iArr17;
        vvf g2 = s2.g();
        if (((x2d) g2.get(0)).b == -1) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        int i49 = 1;
        while (true) {
            if (i49 > e4) {
                i49 = -1;
                break;
            }
            if (((x2d) g2.get(i49)).b != -1) {
                break;
            }
            i49++;
        }
        if (i49 == -1) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        for (int i50 = 1; i50 < i16; i50++) {
            for (int i51 = 0; i51 < i50; i51++) {
                boolean[] zArr6 = zArr4[i50];
                boolean[] zArr7 = zArr5[i50];
                boolean d12 = k9eVar.d();
                zArr7[i51] = d12;
                zArr6[i51] = d12;
            }
        }
        for (int i52 = 1; i52 < i16; i52++) {
            int i53 = 0;
            while (i53 < e2) {
                boolean[][] zArr8 = zArr4;
                int i54 = 0;
                while (true) {
                    if (i54 < i52) {
                        boolean[] zArr9 = zArr5[i52];
                        if (zArr9[i54] && zArr5[i54][i53]) {
                            zArr9[i53] = true;
                            break;
                        }
                        i54++;
                    }
                }
                i53++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i19];
        for (int i55 = 0; i55 < i16; i55++) {
            int i56 = 0;
            for (int i57 = 0; i57 < i55; i57++) {
                i56 += zArr10[i55][i57] ? 1 : 0;
            }
            iArr25[iArr24[i55]] = i56;
        }
        int i58 = 0;
        for (int i59 = 0; i59 < i16; i59++) {
            if (iArr25[iArr24[i59]] == 0) {
                i58++;
            }
        }
        if (i58 > 1) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        int[] iArr26 = new int[i16];
        int[] iArr27 = new int[f2];
        if (k9eVar.d()) {
            iArr2 = iArr25;
            int i60 = 0;
            while (i60 < i16) {
                int i61 = i60;
                iArr26[i61] = k9eVar.e(3);
                i60 = i61 + 1;
            }
        } else {
            iArr2 = iArr25;
            Arrays.fill(iArr26, 0, i16, e3);
        }
        int i62 = 0;
        while (i62 < f2) {
            int i63 = i62;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int i64 = 0;
            for (int i65 = 0; i65 < iArr7[i63]; i65++) {
                i64 = Math.max(i64, iArr28[((x2d) g2.get(iArr11[i63][i65])).a]);
            }
            iArr27[i63] = i64 + 1;
            i62 = i63 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (k9eVar.d()) {
            int i66 = 0;
            while (i66 < e2) {
                int i67 = i66 + 1;
                int i68 = i67;
                while (i68 < i16) {
                    if (zArr10[i68][i66]) {
                        i9 = e2;
                        k9eVar.j(3);
                    } else {
                        i9 = e2;
                    }
                    i68++;
                    e2 = i9;
                }
                i66 = i67;
            }
        }
        k9eVar.i();
        int f4 = k9eVar.f() + 1;
        zu9 s3 = hv9.s();
        s3.c(Q);
        if (f4 > 1) {
            s3.c(Q2);
            for (int i69 = 2; i69 < f4; i69++) {
                Q2 = Q(k9eVar, k9eVar.d(), e3, Q2);
                s3.c(Q2);
            }
        }
        vvf g3 = s3.g();
        int f5 = k9eVar.f() + f2;
        if (f5 > f2) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        int e6 = k9eVar.e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, f5, i19);
        int[] iArr29 = new int[f5];
        int i70 = 0;
        int[] iArr30 = new int[f5];
        int i71 = 0;
        while (i71 < f2) {
            iArr29[i71] = i70;
            iArr30[i71] = iArr12[i71];
            if (e6 == 0) {
                i8 = i71;
                zArr2 = zArr13;
                iArr4 = iArr29;
                iArr5 = iArr27;
                Arrays.fill(zArr13[i8], i70, iArr7[i8], true);
                iArr4[i8] = iArr7[i8];
            } else {
                i8 = i71;
                zArr2 = zArr13;
                iArr4 = iArr29;
                iArr5 = iArr27;
                if (e6 == 1) {
                    int i72 = iArr12[i8];
                    for (int i73 = 0; i73 < iArr7[i8]; i73++) {
                        zArr2[i8][i73] = iArr11[i8][i73] == i72;
                    }
                    iArr4[i8] = 1;
                } else {
                    i70 = 0;
                    zArr2[0][0] = true;
                    iArr4[0] = 1;
                    i71 = i8 + 1;
                    zArr13 = zArr2;
                    iArr29 = iArr4;
                    iArr27 = iArr5;
                }
            }
            i70 = 0;
            i71 = i8 + 1;
            zArr13 = zArr2;
            iArr29 = iArr4;
            iArr27 = iArr5;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i19];
        int i74 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i19;
        iArr34[i70] = f5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i75 = 1;
        int i76 = 0;
        while (i75 < f5) {
            if (e6 == i74) {
                for (int i77 = 0; i77 < iArr7[i75]; i77++) {
                    zArr14[i75][i77] = k9eVar.d();
                    int i78 = iArr31[i75];
                    boolean z6 = zArr14[i75][i77];
                    iArr31[i75] = i78 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr30[i75] = iArr11[i75][i77];
                    }
                }
            }
            if (i76 == 0 && iArr11[i75][0] == 0 && zArr14[i75][0]) {
                for (int i79 = 1; i79 < iArr7[i75]; i79++) {
                    if (iArr11[i75][i79] == i49 && zArr14[i75][i49]) {
                        i76 = i75;
                    }
                }
            }
            int i80 = 0;
            while (i80 < iArr7[i75]) {
                if (f4 > 1) {
                    zArr15[i75][i80] = zArr14[i75][i80];
                    vvfVar3 = g3;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c2 = e75.c(f4);
                    if (!zArr[i75][i80]) {
                        int i81 = ((x2d) g2.get(iArr11[i75][i80])).a;
                        int i82 = 0;
                        while (true) {
                            if (i82 >= i80) {
                                break;
                            }
                            int i83 = i82;
                            if (zArr12[i81][((x2d) g2.get(iArr11[i75][i83])).a]) {
                                zArr[i75][i80] = true;
                                break;
                            }
                            i82 = i83 + 1;
                        }
                    }
                    if (zArr[i75][i80]) {
                        if (i76 <= 0 || i75 != i76) {
                            k9eVar.j(c2);
                        } else {
                            iArr33[i80] = k9eVar.e(c2);
                        }
                    }
                } else {
                    vvfVar3 = g3;
                    zArr = zArr15;
                }
                i80++;
                g3 = vvfVar3;
                zArr15 = zArr;
            }
            vvf vvfVar4 = g3;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i75] == 1 && iArr2[iArr30[i75]] > 0) {
                k9eVar.i();
            }
            i75++;
            g3 = vvfVar4;
            zArr15 = zArr16;
            i74 = 2;
        }
        vvf vvfVar5 = g3;
        boolean[][] zArr17 = zArr15;
        if (i76 == 0) {
            return new g7h((vvf) null, z2dVar2, (z2d) null, (z2d) null);
        }
        int f6 = k9eVar.f();
        int i84 = f6 + 1;
        zu9 t2 = hv9.t(i84);
        int[] iArr35 = new int[i16];
        int i85 = 0;
        while (i85 < i84) {
            int e7 = k9eVar.e(16);
            int e8 = k9eVar.e(16);
            if (k9eVar.d()) {
                i4 = k9eVar.e(2);
                if (i4 == 3) {
                    k9eVar.i();
                }
                i5 = k9eVar.e(4);
                i6 = k9eVar.e(4);
            } else {
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            if (k9eVar.d()) {
                int f7 = k9eVar.f();
                i7 = i85;
                int f8 = k9eVar.f();
                vvfVar2 = vvfVar5;
                int f9 = k9eVar.f();
                vvfVar = g2;
                int f10 = k9eVar.f();
                iArr3 = iArr33;
                e7 = lnb.x(f7, f8, (i4 == 1 || i4 == 2) ? 2 : 1, e7);
                e8 = lnb.x(f9, f10, i4 == 1 ? 2 : 1, e8);
            } else {
                vvfVar = g2;
                i7 = i85;
                iArr3 = iArr33;
                vvfVar2 = vvfVar5;
            }
            t2.c(new a3d(i4, i5, i6, e7, e8));
            i85 = i7 + 1;
            vvfVar5 = vvfVar2;
            g2 = vvfVar;
            iArr33 = iArr3;
        }
        vvf vvfVar6 = g2;
        int[] iArr36 = iArr33;
        vvf vvfVar7 = vvfVar5;
        if (i84 <= 1 || !k9eVar.d()) {
            for (int i86 = 1; i86 < i16; i86++) {
                iArr35[i86] = Math.min(i86, f6);
            }
        } else {
            double d13 = i84;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c3 = e75.c(d13);
            for (int i87 = 1; i87 < i16; i87++) {
                iArr35[i87] = k9eVar.e(c3);
            }
        }
        z2d z2dVar3 = new z2d(t2.g(), iArr35, 1);
        k9eVar.j(2);
        for (int i88 = 1; i88 < i16; i88++) {
            if (iArr2[iArr24[i88]] == 0) {
                k9eVar.i();
            }
        }
        for (int i89 = 1; i89 < f5; i89++) {
            boolean d14 = k9eVar.d();
            int i90 = 0;
            while (i90 < iArr32[i89]) {
                if ((i90 <= 0 || !d14) ? i90 == 0 : k9eVar.d()) {
                    for (int i91 = 0; i91 < iArr7[i89]; i91++) {
                        if (zArr17[i89][i91]) {
                            k9eVar.f();
                        }
                    }
                    k9eVar.f();
                    k9eVar.f();
                }
                i90++;
            }
        }
        int f11 = k9eVar.f() + 2;
        if (k9eVar.d()) {
            k9eVar.j(f11);
        } else {
            for (int i92 = 1; i92 < i16; i92++) {
                for (int i93 = 0; i93 < i92; i93++) {
                    if (zArr10[i92][i93]) {
                        k9eVar.j(f11);
                    }
                }
            }
        }
        int f12 = k9eVar.f();
        for (int i94 = 1; i94 <= f12; i94++) {
            k9eVar.j(8);
        }
        if (k9eVar.d()) {
            int i95 = k9eVar.d;
            if (i95 > 0) {
                k9eVar.j(8 - i95);
            }
            if (!k9eVar.d() ? k9eVar.d() : true) {
                k9eVar.i();
            }
            boolean d15 = k9eVar.d();
            boolean d16 = k9eVar.d();
            if (d15 || d16) {
                for (int i96 = 0; i96 < f2; i96++) {
                    for (int i97 = 0; i97 < iArr32[i96]; i97++) {
                        boolean d17 = d15 ? k9eVar.d() : false;
                        boolean d18 = d16 ? k9eVar.d() : false;
                        if (d17) {
                            k9eVar.j(32);
                        }
                        if (d18) {
                            k9eVar.j(18);
                        }
                    }
                }
            }
            boolean d19 = k9eVar.d();
            int e9 = d19 ? k9eVar.e(4) + 1 : i16;
            zu9 t3 = hv9.t(e9);
            int[] iArr37 = new int[i16];
            for (int i98 = 0; i98 < e9; i98++) {
                k9eVar.j(3);
                int i99 = k9eVar.d() ? 1 : 2;
                int f13 = w13.f(k9eVar.e(8));
                int g4 = w13.g(k9eVar.e(8));
                k9eVar.j(8);
                t3.c(new d3d(f13, i99, g4));
            }
            if (d19 && e9 > 1) {
                for (int i100 = 0; i100 < i16; i100++) {
                    iArr37[i100] = k9eVar.e(4);
                }
            }
            z2dVar = new z2d(t3.g(), iArr37, 2);
        } else {
            z2dVar = null;
        }
        return new g7h(vvfVar6, new z2d(vvfVar7, iArr36, 0), z2dVar3, z2dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h3d U(int i2, int i3, byte[] bArr) {
        int f2;
        int f3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean d2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        k9e k9eVar = new k9e(bArr, i2 + 1, i3);
        int e2 = k9eVar.e(8);
        int e3 = k9eVar.e(8);
        int e4 = k9eVar.e(8);
        int f4 = k9eVar.f();
        if (e2 == 100 || e2 == 110 || e2 == 122 || e2 == 244 || e2 == 44 || e2 == 83 || e2 == 86 || e2 == 118 || e2 == 128 || e2 == 138) {
            f2 = k9eVar.f();
            boolean d3 = f2 == 3 ? k9eVar.d() : false;
            int f5 = k9eVar.f();
            f3 = k9eVar.f();
            k9eVar.i();
            if (k9eVar.d()) {
                int i20 = f2 != 3 ? 8 : 12;
                i4 = 16;
                int i21 = 0;
                while (i21 < i20) {
                    if (k9eVar.d()) {
                        int i22 = i21 < 6 ? 16 : 64;
                        int i23 = 8;
                        int i24 = 8;
                        for (int i25 = 0; i25 < i22; i25++) {
                            if (i23 != 0) {
                                i23 = ((k9eVar.g() + i24) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
                            }
                            if (i23 != 0) {
                                i24 = i23;
                            }
                        }
                    }
                    i21++;
                }
            } else {
                i4 = 16;
            }
            z = d3;
            i5 = f5;
        } else {
            f2 = 1;
            i4 = 16;
            i5 = 0;
            z = false;
            f3 = 0;
        }
        int f6 = k9eVar.f() + 4;
        int f7 = k9eVar.f();
        if (f7 == 0) {
            i9 = k9eVar.f() + 4;
            i6 = e2;
            i7 = f7;
            i8 = f3;
        } else {
            if (f7 == 1) {
                boolean d4 = k9eVar.d();
                k9eVar.g();
                k9eVar.g();
                i6 = e2;
                long f8 = k9eVar.f();
                i7 = f7;
                for (int i26 = 0; i26 < f8; i26++) {
                    k9eVar.f();
                }
                i8 = f3;
                z2 = d4;
                i9 = 0;
                k9eVar.f();
                k9eVar.i();
                int f9 = k9eVar.f() + 1;
                int f10 = k9eVar.f() + 1;
                d2 = k9eVar.d();
                int i27 = 2 - (d2 ? 1 : 0);
                int i28 = f10 * i27;
                if (!d2) {
                    k9eVar.i();
                }
                k9eVar.i();
                int i29 = f9 * 16;
                int i30 = i28 * 16;
                if (k9eVar.d()) {
                    i10 = f6;
                    i11 = i8;
                    i12 = e3;
                    i13 = 1;
                } else {
                    int f11 = k9eVar.f();
                    int f12 = k9eVar.f();
                    i10 = f6;
                    int f13 = k9eVar.f();
                    i11 = i8;
                    int f14 = k9eVar.f();
                    if (f2 == 0) {
                        i12 = e3;
                        i13 = 1;
                        i19 = 1;
                    } else {
                        i12 = e3;
                        int i31 = f2 == 3 ? 1 : 2;
                        i13 = 1;
                        i27 *= f2 == 1 ? 2 : 1;
                        i19 = i31;
                    }
                    i29 = lnb.x(f11, f12, i19, i29);
                    i30 = lnb.x(f13, f14, i27, i30);
                }
                int i32 = i30;
                int i33 = i29;
                int i34 = i6;
                int i35 = ((i34 != 44 || i34 == 86 || i34 == 100 || i34 == 110 || i34 == 122 || i34 == 244) && (i12 & 16) != 0) ? 0 : i4;
                int i36 = -1;
                float f15 = 1.0f;
                if (k9eVar.d()) {
                    i14 = i35;
                    i15 = -1;
                    i16 = -1;
                    i17 = -1;
                } else {
                    if (k9eVar.d()) {
                        int e5 = k9eVar.e(8);
                        if (e5 == 255) {
                            int i37 = i4;
                            int e6 = k9eVar.e(i37);
                            int e7 = k9eVar.e(i37);
                            if (e6 != 0 && e7 != 0) {
                                f15 = e6 / e7;
                            }
                        } else if (e5 < 17) {
                            f15 = m[e5];
                        } else {
                            fn0.r(e5, "Unexpected aspect_ratio_idc value: ");
                        }
                    }
                    if (k9eVar.d()) {
                        k9eVar.i();
                    }
                    if (k9eVar.d()) {
                        k9eVar.j(3);
                        if (!k9eVar.d()) {
                            i13 = 2;
                        }
                        if (k9eVar.d()) {
                            int e8 = k9eVar.e(8);
                            int e9 = k9eVar.e(8);
                            k9eVar.j(8);
                            i36 = w13.f(e8);
                            i18 = w13.g(e9);
                        } else {
                            i18 = -1;
                        }
                    } else {
                        i18 = -1;
                        i13 = -1;
                    }
                    if (k9eVar.d()) {
                        k9eVar.f();
                        k9eVar.f();
                    }
                    if (k9eVar.d()) {
                        k9eVar.j(65);
                    }
                    boolean d5 = k9eVar.d();
                    if (d5) {
                        Z(k9eVar);
                    }
                    boolean d6 = k9eVar.d();
                    if (d6) {
                        Z(k9eVar);
                    }
                    if (d5 || d6) {
                        k9eVar.i();
                    }
                    k9eVar.i();
                    if (k9eVar.d()) {
                        k9eVar.i();
                        k9eVar.f();
                        k9eVar.f();
                        k9eVar.f();
                        k9eVar.f();
                        i35 = k9eVar.f();
                        k9eVar.f();
                    }
                    i14 = i35;
                    i17 = i18;
                    i15 = i36;
                    i16 = i13;
                }
                return new h3d(i34, i12, e4, f4, i33, i32, f15, i5, i11, z, d2, i10, i7, i9, z2, i15, i16, i17, i14);
            }
            i6 = e2;
            i7 = f7;
            i8 = f3;
            i9 = 0;
        }
        z2 = false;
        k9eVar.f();
        k9eVar.i();
        int f92 = k9eVar.f() + 1;
        int f102 = k9eVar.f() + 1;
        d2 = k9eVar.d();
        int i272 = 2 - (d2 ? 1 : 0);
        int i282 = f102 * i272;
        if (!d2) {
        }
        k9eVar.i();
        int i292 = f92 * 16;
        int i302 = i282 * 16;
        if (k9eVar.d()) {
        }
        int i322 = i302;
        int i332 = i292;
        int i342 = i6;
        if (i342 != 44) {
        }
        int i362 = -1;
        float f152 = 1.0f;
        if (k9eVar.d()) {
        }
        return new h3d(i342, i12, e4, f4, i332, i322, f152, i5, i11, z, d2, i10, i7, i9, z2, i15, i16, i17, i14);
    }

    public static final qtk V(qtk qtkVar, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        Context context = (Context) av8Var.k(nz.b);
        boolean g2 = av8Var.g(context) | av8Var.g(qtkVar);
        Object O = av8Var.O();
        if (g2 || O == nf3.a) {
            O = hkg.D(context, qtkVar);
            av8Var.n0(O);
        }
        return (qtk) O;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[LOOP:0: B:1:0x0000->B:18:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type W(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i2 = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type W = W(type, cls, componentType);
                        return componentType == W ? cls2 : new oik(W);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type W2 = W(type, cls, genericComponentType);
                    return genericComponentType == W2 ? genericArrayType : new oik(W2);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type W3 = W(type, cls, ownerType);
                    boolean z = W3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i2 < length) {
                        Type W4 = W(type, cls, actualTypeArguments[i2]);
                        if (W4 != actualTypeArguments[i2]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i2] = W4;
                        }
                        i2++;
                    }
                    return z ? new pik(W3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type W5 = W(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (W5 != lowerBounds[0]) {
                            return new qik(new Type[]{Object.class}, new Type[]{W5});
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type W6 = W(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (W6 != upperBounds[0]) {
                                return new qik(new Type[]{W6}, p);
                            }
                        }
                    }
                }
                return type5;
            }
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type u2 = u(type, cls, cls3);
                if (u2 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i2 < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i2])) {
                            type3 = ((ParameterizedType) u2).getActualTypeArguments()[i2];
                            if (type3 != typeVariable) {
                                return type3;
                            }
                            type4 = type3;
                        } else {
                            i2++;
                        }
                    }
                    yhk.d();
                    return null;
                }
            }
            type3 = typeVariable;
            if (type3 != typeVariable) {
            }
        }
    }

    public static final xtc X(xtc xtcVar, jvg jvgVar, ewd ewdVar, myd mydVar, boolean z, p78 p78Var, xzc xzcVar, i5e i5eVar) {
        ewd ewdVar2 = ewd.a;
        utc utcVar = utc.a;
        return xtcVar.z(ewdVar == ewdVar2 ? wnn.A(utcVar, jf9.c) : wnn.A(utcVar, jf9.b)).z(new uug(i5eVar, p78Var, xzcVar, ewdVar, mydVar, jvgVar, z, false));
    }

    public static final void Y(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static void Z(k9e k9eVar) {
        int f2 = k9eVar.f() + 1;
        k9eVar.j(8);
        for (int i2 = 0; i2 < f2; i2++) {
            k9eVar.f();
            k9eVar.f();
            k9eVar.i();
        }
        k9eVar.j(20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    public static final void a(kxe kxeVar, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        kxe kxeVar2;
        Function0 function02;
        av8 av8Var;
        zg3 zg3Var;
        boolean z2;
        boolean z3;
        av8 av8Var2;
        av8 av8Var3;
        kxeVar.getClass();
        String str = kxeVar.c;
        String str2 = kxeVar.d;
        xtcVar.getClass();
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(-158412802);
        if ((i2 & 6) == 0) {
            i3 = (av8Var4.g(kxeVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var4.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var4.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var4.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var4.T(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = kxeVar.e ? 0.5f : 1.0f;
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var4, 48);
            int hashCode = Long.hashCode(av8Var4.T);
            aee m2 = av8Var4.m();
            xtc C = fqj.C(av8Var4, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var2);
            } else {
                av8Var4.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var4, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var4, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var4, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var4, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var4, C, f50Var3);
            float f3 = f2;
            int i4 = kxeVar.a;
            utc utcVar = utc.a;
            td4.C(i4, bkh.l(utcVar, 40.0f), 0L, f3, av8Var4, 48, 4);
            goa d2 = bf3.d(utcVar, 16.0f, av8Var4, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var4, 0);
            int hashCode2 = Long.hashCode(av8Var4.T);
            aee m3 = av8Var4.m();
            xtc C2 = fqj.C(av8Var4, d2);
            av8Var4.h0();
            if (av8Var4.S) {
                zg3Var = zg3Var2;
                av8Var4.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var4.q0();
            }
            waa.K(av8Var4, a3, f50Var);
            waa.K(av8Var4, m3, ff3Var);
            bf3.s(hashCode2, av8Var4, f50Var2, av8Var4, ryVar);
            waa.K(av8Var4, C2, f50Var3);
            String str3 = kxeVar.b;
            yf8 yf8Var = xth.a;
            zg3 zg3Var3 = zg3Var;
            int i5 = i3;
            udj.c(str3, null, r13.c(lz.D(R.color.n_lv_1, av8Var4), f3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var4, 0, 24960, 110586);
            av8 av8Var5 = av8Var4;
            if (str2.length() <= 0 && str.length() <= 0) {
                z3 = 0;
                z2 = true;
                av8Var5.d0(1172639338);
                av8Var5.s(false);
                av8Var2 = av8Var5;
            } else {
                av8Var5.d0(1171952223);
                xtc r2 = bkh.r(utcVar, null, 3);
                l8g a4 = k8g.a(wxfVar, lv1Var, av8Var5, 48);
                int hashCode3 = Long.hashCode(av8Var5.T);
                aee m4 = av8Var5.m();
                xtc C3 = fqj.C(av8Var5, r2);
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var3);
                } else {
                    av8Var5.q0();
                }
                waa.K(av8Var5, a4, f50Var);
                waa.K(av8Var5, m4, ff3Var);
                bf3.s(hashCode3, av8Var5, f50Var2, av8Var5, ryVar);
                waa.K(av8Var5, C3, f50Var3);
                td4.k(str2, bkh.l(utcVar, 16.0f), f3, false, av8Var5, 48, 8);
                nq8.h(av8Var5, bkh.p(utcVar, 2.0f));
                udj.c(str, null, r13.c(lz.D(R.color.n_lv_3, av8Var5), f3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var5, 0, 0, 131066);
                av8 av8Var6 = av8Var5;
                z2 = true;
                av8Var6.s(true);
                z3 = 0;
                av8Var6.s(false);
                av8Var2 = av8Var6;
            }
            av8Var2.s(z2);
            kxeVar2 = kxeVar;
            Integer num = kxeVar2.f;
            if (num == null) {
                av8Var2.d0(-1483814030);
                av8Var2.s(z3);
            } else {
                av8Var2.d0(-1483814029);
                int intValue = num.intValue();
                nq8.h(av8Var2, bkh.p(utcVar, 16.0f));
                kq9.a(haa.t(intValue, z3, av8Var2), null, bkh.l(utcVar, 24.0f), r13.i, av8Var2, 3512, 0);
                Unit unit = Unit.a;
                av8Var2.s(z3);
            }
            if (z) {
                ljg.r(16.0f, -1483482825, av8Var2, av8Var2, utcVar);
                d7e t2 = haa.t(R.drawable.ic_close, z3, av8Var2);
                long D = lz.D(R.color.n_lv_1, av8Var2);
                boolean z4 = (i5 & 896) == 256;
                Object O = av8Var2.O();
                if (z4 || O == nf3.a) {
                    function02 = function0;
                    O = new v61(13, function02);
                    av8Var2.n0(O);
                } else {
                    function02 = function0;
                }
                av8 av8Var7 = av8Var2;
                av8 av8Var8 = av8Var7;
                kq9.a(t2, null, tol.y(utcVar, false, false, false, 0L, null, (Function0) O, av8Var7, 29), D, av8Var8, 56, 0);
                av8Var8.s(false);
                av8Var3 = av8Var8;
            } else {
                function02 = function0;
                av8Var2.d0(-1483135904);
                av8Var2.s(z3);
                av8Var3 = av8Var2;
            }
            av8Var3.s(true);
            av8Var = av8Var3;
        } else {
            kxeVar2 = kxeVar;
            function02 = function0;
            av8Var4.W();
            av8Var = av8Var4;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new s73(kxeVar2, z, function02, xtcVar, i2, 2);
        }
    }

    public static void a0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final void b(int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-700234120);
        int i3 = i2 | (av8Var.g(xtcVar) ? 4 : 2);
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            xtc d2 = bkh.d(xtcVar, 1.0f);
            boolean i4 = av8Var.i(context);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new c6(context, 21);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(n9e.q(tol.n(d2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function0) O, 3), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v2 = oea.v(R.string.finished_competitions, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v2, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            utc utcVar = utc.a;
            kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), null, ljg.i(utcVar, 16.0f, av8Var, utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new l63(xtcVar, i2, 8);
        }
    }

    public static String b0(long j2) {
        return p(j2, 12884901888L) ? "Rgb" : p(j2, 12884901889L) ? "Xyz" : p(j2, 12884901890L) ? "Lab" : p(j2, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final void c(ja7 ja7Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        ja7Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2073445437);
        int i3 = i2 | (av8Var.e(ja7Var.ordinal()) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc q2 = n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new n37(7, (Object) ja7Var, function1);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q2, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f, 8.0f);
            l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kq9.b(s6a.N(ja7Var.a, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v2 = oea.v(ja7Var.b, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            udj.c(oea.v(ja7Var.c, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new uu6(ja7Var, function1, xtcVar2, i2, 11);
        }
    }

    public static String c0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(fo1 fo1Var, gv9 gv9Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        av8 av8Var;
        xtc xtcVar3;
        eqf u2;
        boolean z;
        Object obj;
        int i5;
        znh znhVar;
        a99 a99Var;
        xtc xtcVar4;
        utc utcVar;
        Context context;
        jf9 jf9Var;
        av8 av8Var2;
        Object obj2;
        boolean z2;
        boolean z3;
        Object obj3;
        gv9 gv9Var2 = gv9Var;
        Function1 function12 = function1;
        jf9 jf9Var2 = oyn.e;
        mv1 mv1Var = uxf.c;
        fo1Var.getClass();
        gv9Var2.getClass();
        function12.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1742711838);
        if ((i2 & 6) == 0) {
            i4 = (av8Var3.g(fo1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var3.g(gv9Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var3.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var3.g(xtcVar2) ? a.o : 1024;
            if (av8Var3.T(i4 & 1, (i4 & 1171) == 1170)) {
                av8Var = av8Var3;
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar2 = utc.a;
                if (i6 != 0) {
                    xtcVar2 = utcVar2;
                }
                Context context2 = (Context) av8Var3.k(nz.b);
                boolean z4 = (i4 & 14) == 4;
                Object O = av8Var3.O();
                boolean z5 = z4;
                a99 a99Var2 = nf3.a;
                if (z5 || O == a99Var2) {
                    Iterator it = gv9Var2.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            i7 = -1;
                            break;
                        } else {
                            z = true;
                            if (((fo1) it.next()).a == fo1Var.a) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                    znh c2 = e.c(i7);
                    av8Var3.n0(c2);
                    obj = c2;
                } else {
                    z = true;
                    obj = O;
                }
                znh znhVar2 = (znh) obj;
                boolean z6 = znhVar2.h() != 0 ? z : false;
                boolean z7 = znhVar2.h() != gv9Var2.size() + (-1) ? z : false;
                kg0 kg0Var = ww9.h;
                lv1 lv1Var = uxf.m;
                boolean z8 = z6;
                xtc c0 = l98.c0(bkh.d(xtcVar2, 1.0f), 16.0f, 8.0f);
                l8g a2 = k8g.a(kg0Var, lv1Var, av8Var3, 54);
                int hashCode = Long.hashCode(av8Var3.T);
                aee m2 = av8Var3.m();
                xtc C = fqj.C(av8Var3, c0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var3, a2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var3, m2, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var3, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var3, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var3, C, f50Var3);
                if (z8) {
                    av8Var3.d0(1312311378);
                    xtcVar4 = xtcVar2;
                    xtc q2 = n9e.q(wnn.A(utcVar2, o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var3), jf9Var2);
                    int i8 = i4;
                    boolean g2 = ((i4 & 896) == 256 ? z : false) | ((i4 & 112) == 32 ? z : false) | av8Var3.g(znhVar2);
                    Object O2 = av8Var3.O();
                    if (g2 || O2 == a99Var2) {
                        z3 = z;
                        n56 n56Var = new n56(function12, gv9Var2, znhVar2, z3 ? 1 : 0);
                        av8Var3.n0(n56Var);
                        obj3 = n56Var;
                    } else {
                        z3 = z;
                        obj3 = O2;
                    }
                    av8Var2 = av8Var3;
                    jf9Var = jf9Var2;
                    znhVar = znhVar2;
                    context = context2;
                    i5 = i8;
                    a99Var = a99Var2;
                    xtc b0 = l98.b0(tol.y(q2, false, false, false, 0L, null, (Function0) obj3, av8Var2, 31), 4.0f);
                    k1c c3 = e12.c(mv1Var, false);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c3, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    utcVar = utcVar2;
                    kq9.b(s6a.N(R.drawable.ic_chevron_left, 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var2), av8Var2, 432, 0);
                    av8Var2.s(true);
                    av8Var2.s(false);
                } else {
                    i5 = i4;
                    znhVar = znhVar2;
                    a99Var = a99Var2;
                    xtcVar4 = xtcVar2;
                    utcVar = utcVar2;
                    context = context2;
                    jf9Var = jf9Var2;
                    av8Var2 = av8Var3;
                    av8Var2.d0(-1066024770);
                    e12.a(6, av8Var2, bkh.l(utcVar, 32.0f));
                    av8Var2.s(false);
                }
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it2 = gv9Var.iterator();
                while (it2.hasNext()) {
                    fo1 fo1Var2 = (fo1) it2.next();
                    ct8 ct8Var = null;
                    tc3 tc3Var = null;
                    pxh pxhVar = null;
                    arrayList.add(new oxh(fo1Var2, f5p.B(context, fo1Var2.d, fo1Var2.b), ct8Var, tc3Var, pxhVar, false, 252));
                }
                gv9 W = l6g.W(arrayList);
                Iterator<E> it3 = W.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (Intrinsics.c(((oxh) obj2).a, fo1Var)) {
                            break;
                        }
                    }
                }
                int i9 = 2;
                int i10 = i5;
                int i11 = i10 & 896;
                av8 av8Var4 = av8Var2;
                gv9Var2 = gv9Var;
                r4a.j(W, (oxh) obj2, function1, null, null, false, l98.B(4.0f, 2), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var4, 12582912 | i11, 888);
                function12 = function1;
                av8Var = av8Var4;
                if (z7) {
                    av8Var.d0(1313554819);
                    xtc q3 = n9e.q(wnn.A(utcVar, o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), jf9Var);
                    znh znhVar3 = znhVar;
                    boolean g3 = ((i10 & 112) == 32) | (i11 == 256) | av8Var.g(znhVar3);
                    Object O3 = av8Var.O();
                    if (g3 || O3 == a99Var) {
                        O3 = new n56(function12, gv9Var2, znhVar3, i9);
                        av8Var.n0(O3);
                    }
                    xtc b02 = l98.b0(tol.y(q3, false, false, false, 0L, null, (Function0) O3, av8Var, 31), 4.0f);
                    k1c c4 = e12.c(mv1Var, false);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m4 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, b02);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var2);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c4, hf3.g);
                    waa.K(av8Var, m4, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C3, hf3.d);
                    kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                    z2 = true;
                    av8Var.s(true);
                    av8Var.s(false);
                } else {
                    z2 = true;
                    av8Var.d0(-1065984194);
                    e12.a(6, av8Var, bkh.l(utcVar, 32.0f));
                    av8Var.s(false);
                }
                av8Var.s(z2);
                xtcVar3 = xtcVar4;
            }
            u2 = av8Var.u();
            if (u2 == null) {
                u2.d = new hj7(fo1Var, gv9Var2, function12, xtcVar3, i2, i3, 0);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var3.T(i4 & 1, (i4 & 1171) == 1170)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static int d0(byte[] bArr, int i2) {
        int i3;
        synchronized (n) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = o;
                    if (iArr.length <= i5) {
                        iArr = Arrays.copyOf(iArr, iArr.length * 2);
                        o = iArr;
                    }
                    iArr[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = o[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static final void e(mj7 mj7Var, gv9 gv9Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        mj7Var.getClass();
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1982850747);
        int i3 = i2 | (av8Var.g(mj7Var) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    mj7 mj7Var2 = (mj7) it.next();
                    mj7Var2.getClass();
                    arrayList.add(new fo1(mj7Var2.a, mj7Var2.c, mj7Var2.b, mj7Var2.d));
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            boolean z2 = (i3 & 14) == 4;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                fo1 fo1Var = new fo1(mj7Var.a, mj7Var.c, mj7Var.b, mj7Var.d);
                av8Var.n0(fo1Var);
                O2 = fo1Var;
            }
            fo1 fo1Var2 = (fo1) O2;
            boolean z3 = (i4 == 32) | ((i3 & 896) == 256);
            Object O3 = av8Var.O();
            if (z3 || O3 == a99Var) {
                O3 = new ij7(gv9Var, function1, 0);
                av8Var.n0(O3);
            }
            d(fo1Var2, gv9Var2, (Function1) O3, xtcVar, av8Var, i3 & 7168, 0);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ace(i2, 27, mj7Var, gv9Var, function1, xtcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int f(int i2, int i3, int i4, boolean z) {
        if (i3 >= i4) {
            if (z) {
                return 0;
            }
            return i4 - i3;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i4 - i3 <= i2 : i3 > i2) {
                if (z) {
                    return i4 - i3;
                }
                return 0;
            }
            if (z) {
                return i2 - i3;
            }
        }
        return i2;
    }

    public static void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        a70.p("You must call this method on the main thread");
    }

    public static final int h(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static void h0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        InneractiveUserConfig inneractiveUserConfig = new InneractiveUserConfig();
        if (bundle.containsKey("age")) {
            inneractiveUserConfig.setAge(bundle.getInt("age", 0));
        }
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
        if (bundle.containsKey(FyberMediationAdapter.KEY_MUTE_VIDEO)) {
            InneractiveAdManager.setMuteVideo(bundle.getBoolean(FyberMediationAdapter.KEY_MUTE_VIDEO, false));
        }
    }

    public static final int i(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final long i0(long j2, long j3) {
        int e2;
        int g2 = pej.g(j2);
        int f2 = pej.f(j2);
        if ((pej.g(j3) < pej.f(j2)) && (pej.g(j2) < pej.f(j3))) {
            if (pej.a(j3, j2)) {
                g2 = pej.g(j3);
                f2 = g2;
            } else {
                if (pej.a(j2, j3)) {
                    e2 = pej.e(j3);
                } else {
                    int g3 = pej.g(j3);
                    if (g2 >= pej.f(j3) || g3 > g2) {
                        f2 = pej.g(j3);
                    } else {
                        g2 = pej.g(j3);
                        e2 = pej.e(j3);
                    }
                }
                f2 -= e2;
            }
        } else if (f2 > pej.g(j3)) {
            g2 -= pej.e(j3);
            e2 = pej.e(j3);
            f2 -= e2;
        }
        return t6a.g(g2, f2);
    }

    public static Bitmap j(Bitmap bitmap, int i2) {
        int i3;
        int i4 = i2;
        if (i4 < 1) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i5 = width * height;
        int[] iArr = new int[i5];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = iArr;
        int i6 = width - 1;
        int i7 = height - 1;
        int i8 = i4 + i4;
        int i9 = i8 + 1;
        int[] iArr3 = new int[i5];
        int[] iArr4 = new int[i5];
        int[] iArr5 = new int[i5];
        int[] iArr6 = new int[Math.max(width, height)];
        char c2 = 2;
        int i10 = (i8 + 2) >> 1;
        int i11 = i10 * i10;
        int i12 = i11 * NotificationCompat.FLAG_LOCAL_ONLY;
        int[] iArr7 = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iArr7[i14] = i14 / i11;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, 3);
        int i15 = i4 + 1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < height) {
            char c3 = c2;
            int i19 = -i4;
            int i20 = i13;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            int i27 = i26;
            int i28 = i27;
            while (i19 <= i4) {
                int[][] iArr9 = iArr8;
                int[] iArr10 = iArr2;
                int i29 = i13;
                int i30 = iArr10[Math.min(i6, Math.max(i19, i29)) + i17];
                int[] iArr11 = iArr9[i19 + i4];
                iArr11[i29] = (i30 & 16711680) >> 16;
                iArr11[1] = (i30 & 65280) >> 8;
                iArr11[c3] = i30 & 255;
                int abs = i15 - Math.abs(i19);
                int i31 = iArr11[i29];
                i20 = (i31 * abs) + i20;
                int i32 = iArr11[1];
                i21 = (i32 * abs) + i21;
                int i33 = iArr11[c3];
                i22 = (abs * i33) + i22;
                if (i19 > 0) {
                    i26 += i31;
                    i27 += i32;
                    i28 += i33;
                } else {
                    i23 += i31;
                    i24 += i32;
                    i25 += i33;
                }
                i19++;
                iArr8 = iArr9;
                iArr2 = iArr10;
                i13 = 0;
            }
            int[][] iArr12 = iArr8;
            int[] iArr13 = iArr2;
            int i34 = i4;
            int i35 = 0;
            while (i35 < width) {
                iArr3[i17] = iArr7[i20];
                iArr4[i17] = iArr7[i21];
                iArr5[i17] = iArr7[i22];
                int i36 = i20 - i23;
                int i37 = i21 - i24;
                int i38 = i22 - i25;
                int[] iArr14 = iArr12[((i34 - i4) + i9) % i9];
                int i39 = i23 - iArr14[0];
                int i40 = i24 - iArr14[1];
                int i41 = i25 - iArr14[c3];
                if (i16 == 0) {
                    i3 = i35;
                    iArr6[i3] = Math.min(i35 + i4 + 1, i6);
                } else {
                    i3 = i35;
                }
                int i42 = iArr13[i18 + iArr6[i3]];
                int i43 = (i42 & 16711680) >> 16;
                iArr14[0] = i43;
                int i44 = (i42 & 65280) >> 8;
                iArr14[1] = i44;
                int i45 = i42 & 255;
                iArr14[c3] = i45;
                int i46 = i26 + i43;
                int i47 = i27 + i44;
                int i48 = i28 + i45;
                i20 = i36 + i46;
                i21 = i37 + i47;
                i22 = i38 + i48;
                i34 = (i34 + 1) % i9;
                int[] iArr15 = iArr12[i34 % i9];
                int i49 = iArr15[0];
                i23 = i39 + i49;
                int i50 = iArr15[1];
                i24 = i40 + i50;
                int i51 = iArr15[c3];
                i25 = i41 + i51;
                i26 = i46 - i49;
                i27 = i47 - i50;
                i28 = i48 - i51;
                i17++;
                i35 = i3 + 1;
            }
            i18 += width;
            i16++;
            c2 = c3;
            iArr8 = iArr12;
            iArr2 = iArr13;
            i13 = 0;
        }
        int[][] iArr16 = iArr8;
        int[] iArr17 = iArr2;
        char c4 = c2;
        int i52 = 0;
        while (i52 < width) {
            int i53 = -i4;
            int i54 = i53 * width;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            while (i53 <= i4) {
                int max = Math.max(0, i54) + i52;
                int[] iArr18 = iArr16[i53 + i2];
                iArr18[0] = iArr3[max];
                iArr18[1] = iArr4[max];
                iArr18[c4] = iArr5[max];
                int abs2 = i15 - Math.abs(i53);
                i55 = (iArr3[max] * abs2) + i55;
                i56 = (iArr4[max] * abs2) + i56;
                i57 = (iArr5[max] * abs2) + i57;
                if (i53 > 0) {
                    i61 += iArr18[0];
                    i62 += iArr18[1];
                    i63 += iArr18[c4];
                } else {
                    i58 += iArr18[0];
                    i59 += iArr18[1];
                    i60 += iArr18[c4];
                }
                if (i53 < i7) {
                    i54 += width;
                }
                i53++;
                i4 = i2;
            }
            int i64 = i2;
            int i65 = i52;
            int i66 = 0;
            while (i66 < height) {
                iArr17[i65] = (iArr17[i65] & (-16777216)) | (iArr7[i55] << 16) | (iArr7[i56] << 8) | iArr7[i57];
                int i67 = i55 - i58;
                int i68 = i56 - i59;
                int i69 = i57 - i60;
                int[] iArr19 = iArr16[((i64 - i2) + i9) % i9];
                int i70 = i58 - iArr19[0];
                int i71 = i59 - iArr19[1];
                int i72 = i60 - iArr19[c4];
                int i73 = i66;
                if (i52 == 0) {
                    iArr6[i73] = Math.min(i73 + i15, i7) * width;
                }
                int i74 = iArr6[i73] + i52;
                int i75 = iArr3[i74];
                iArr19[0] = i75;
                int i76 = iArr4[i74];
                iArr19[1] = i76;
                int i77 = iArr5[i74];
                iArr19[c4] = i77;
                int i78 = i61 + i75;
                int i79 = i62 + i76;
                int i80 = i63 + i77;
                i55 = i67 + i78;
                i56 = i68 + i79;
                i57 = i69 + i80;
                i64 = (i64 + 1) % i9;
                int[] iArr20 = iArr16[i64];
                int i81 = iArr20[0];
                i58 = i70 + i81;
                int i82 = iArr20[1];
                i59 = i71 + i82;
                int i83 = iArr20[c4];
                i60 = i72 + i83;
                i61 = i78 - i81;
                i62 = i79 - i82;
                i63 = i80 - i83;
                i65 += width;
                i66 = i73 + 1;
            }
            i52++;
            i4 = i2;
        }
        bitmap.setPixels(iArr17, 0, width, 0, 0, width, height);
        return bitmap;
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void l(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            ilg.c();
        }
    }

    public static void m(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static final void n(b98 b98Var) {
        if (b98Var instanceof ngj) {
            throw ((ngj) b98Var).a;
        }
    }

    public static boolean o(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return o(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final boolean p(long j2, long j3) {
        return j2 == j3;
    }

    public static int q(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        z1a.E(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            m(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            m(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            m(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    m(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static int r(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append(U3.j.d);
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    public static int s(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = iik.a[config.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 3) {
                return i2 != 4 ? 4 : 8;
            }
        }
        return i3;
    }

    public static final String t(KClass kClass) {
        if (kClass != null) {
            return kClass.getQualifiedName();
        }
        return null;
    }

    public static Type u(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return u(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return u(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static String v(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                zu9 s2 = hv9.s();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int q2 = q(bArr, i3, bArr.length, zArr);
                    if (q2 != bArr.length) {
                        s2.c(Integer.valueOf(q2));
                    }
                    i3 = q2 + 3;
                }
                vvf g2 = s2.g();
                for (int i4 = 0; i4 < g2.d; i4++) {
                    if (((Integer) g2.get(i4)).intValue() + 3 < length) {
                        k9e k9eVar = new k9e(bArr, ((Integer) g2.get(i4)).intValue() + 3, length);
                        k9 P = P(k9eVar);
                        if (P.a == 33 && P.b == 0) {
                            k9eVar.j(4);
                            int e2 = k9eVar.e(3);
                            k9eVar.i();
                            y2d Q = Q(k9eVar, true, e2, null);
                            return wz2.a(Q.a, Q.b, Q.c, Q.d, Q.e, Q.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String w(b bVar) {
        String str = bVar.o;
        String str2 = bVar.k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return bVar.o;
    }

    public static Type x(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder t2 = lnb.t(i2, "Index ", " not in range [0,");
        t2.append(actualTypeArguments.length);
        t2.append(") for ");
        t2.append(parameterizedType);
        throw new IllegalArgumentException(t2.toString());
    }

    public static Class y(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            ilg.c();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) y(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return y(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        String name = type.getClass().getName();
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public static ArrayList z(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
