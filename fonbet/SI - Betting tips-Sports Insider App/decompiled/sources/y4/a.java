package y4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.c1;
import androidx.core.view.h1;
import androidx.fragment.app.p0;
import androidx.lifecycle.o1;
import androidx.transition.o0;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.t;
import com.google.gson.reflect.TypeToken;
import g0.f;
import ge.n;
import gf.m;
import gh.b0;
import gh.d0;
import gh.e0;
import gh.m0;
import gh.v;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.d4;
import io.sentry.i1;
import io.sentry.instrumentation.file.e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.i0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import org.json.JSONArray;
import p1.p;
import pd.x;
import r4.c;
import r4.g;
import r4.i;
import r4.k;
import s.h;
import ug.s;
import zf.b;
import zf.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f25671a = true;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float A(h xValues, h yValues, float f6) {
        Intrinsics.checkNotNullParameter(xValues, "xValues");
        Intrinsics.checkNotNullParameter(yValues, "yValues");
        if (0.0f > f6 || f6 > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f6).toString());
        }
        Iterator it = j.d(0, xValues.f22558b).iterator();
        while (it.hasNext()) {
            int nextInt = ((i0) it).nextInt();
            float a7 = xValues.a(nextInt);
            int i5 = nextInt + 1;
            float a10 = xValues.a(i5 % xValues.f22558b);
            if (a10 < a7) {
                if (f6 < a7 && f6 > a10) {
                }
                int i10 = i5 % xValues.f22558b;
                float d10 = p.d(xValues.a(i10) - xValues.a(nextInt), 1.0f);
                return p.d((p.d(yValues.a(i10) - yValues.a(nextInt), 1.0f) * (d10 >= 0.001f ? 0.5f : p.d(f6 - xValues.a(nextInt), 1.0f) / d10)) + yValues.a(nextInt), 1.0f);
            }
            if (a7 <= f6 && f6 <= a10) {
                int i102 = i5 % xValues.f22558b;
                float d102 = p.d(xValues.a(i102) - xValues.a(nextInt), 1.0f);
                return p.d((p.d(yValues.a(i102) - yValues.a(nextInt), 1.0f) * (d102 >= 0.001f ? 0.5f : p.d(f6 - xValues.a(nextInt), 1.0f) / d102)) + yValues.a(nextInt), 1.0f);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void B(f[] fVarArr, Path path) {
        int i5;
        float[] fArr;
        int i10;
        f fVar;
        int i11;
        char c2;
        float f6;
        float f10;
        f fVar2;
        boolean z5;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        f[] fVarArr2 = fVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = fVarArr2.length;
        int i12 = 0;
        int i13 = 0;
        char c8 = 'm';
        while (i13 < length) {
            f fVar3 = fVarArr2[i13];
            char c10 = fVar3.f9681a;
            float[] fArr3 = fVar3.f9682b;
            float f19 = fArr2[i12];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            float f23 = fArr2[4];
            int i14 = i12;
            float f24 = fArr2[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i5 = 7;
                    break;
                case 'C':
                case 'c':
                    i5 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i5 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i5 = 4;
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i5 = 2;
                    break;
            }
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i15 = i14;
            while (i15 < fArr3.length) {
                if (c10 == 'A') {
                    fArr = fArr3;
                    i10 = i15;
                    fVar = fVar3;
                    float f29 = f27;
                    float f30 = f28;
                    i11 = i13;
                    c2 = c10;
                    int i16 = i10 + 5;
                    int i17 = i10 + 6;
                    f.a(path, f29, f30, fArr[i16], fArr[i17], fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3] != 0.0f ? 1 : i14, fArr[i10 + 4] != 0.0f ? 1 : i14);
                    f21 = fArr[i16];
                    f6 = fArr[i17];
                    f22 = f6;
                    f10 = f21;
                } else if (c10 == 'C') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    fVar = fVar3;
                    c2 = c10;
                    int i18 = i10 + 2;
                    int i19 = i10 + 3;
                    int i20 = i10 + 4;
                    int i21 = i10 + 5;
                    path2.cubicTo(fArr[i10], fArr[i10 + 1], fArr[i18], fArr[i19], fArr[i20], fArr[i21]);
                    float f31 = fArr[i20];
                    float f32 = fArr[i21];
                    f21 = fArr[i18];
                    f22 = fArr[i19];
                    f6 = f32;
                    f10 = f31;
                } else if (c10 == 'H') {
                    fArr = fArr3;
                    i10 = i15;
                    fVar = fVar3;
                    c2 = c10;
                    f6 = f28;
                    i11 = i13;
                    path2.lineTo(fArr[i10], f6);
                    f10 = fArr[i10];
                } else if (c10 == 'Q') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    fVar = fVar3;
                    c2 = c10;
                    int i22 = i10 + 1;
                    int i23 = i10 + 2;
                    int i24 = i10 + 3;
                    path2.quadTo(fArr[i10], fArr[i22], fArr[i23], fArr[i24]);
                    float f33 = fArr[i10];
                    float f34 = fArr[i22];
                    float f35 = fArr[i23];
                    float f36 = fArr[i24];
                    f21 = f33;
                    f22 = f34;
                    f10 = f35;
                    f6 = f36;
                } else if (c10 == 'V') {
                    fArr = fArr3;
                    i10 = i15;
                    i11 = i13;
                    fVar = fVar3;
                    f10 = f27;
                    c2 = c10;
                    path2.lineTo(f10, fArr[i10]);
                    f6 = fArr[i10];
                } else if (c10 != 'a') {
                    if (c10 == 'c') {
                        fArr = fArr3;
                        i10 = i15;
                        int i25 = i10 + 2;
                        int i26 = i10 + 3;
                        int i27 = i10 + 4;
                        int i28 = i10 + 5;
                        path2.rCubicTo(fArr[i10], fArr[i10 + 1], fArr[i25], fArr[i26], fArr[i27], fArr[i28]);
                        float f37 = fArr[i25] + f27;
                        float f38 = fArr[i26] + f28;
                        f27 += fArr[i27];
                        f28 += fArr[i28];
                        f21 = f37;
                        f22 = f38;
                    } else if (c10 != 'h') {
                        if (c10 != 'q') {
                            if (c10 != 'v') {
                                if (c10 == 'L') {
                                    fArr = fArr3;
                                    i10 = i15;
                                    int i29 = i10 + 1;
                                    path2.lineTo(fArr[i10], fArr[i29]);
                                    f10 = fArr[i10];
                                    f6 = fArr[i29];
                                } else if (c10 == 'M') {
                                    fArr = fArr3;
                                    i10 = i15;
                                    f10 = fArr[i10];
                                    f6 = fArr[i10 + 1];
                                    if (i10 > 0) {
                                        path2.lineTo(f10, f6);
                                    } else {
                                        path2.moveTo(f10, f6);
                                        f25 = f10;
                                        f26 = f6;
                                    }
                                } else if (c10 != 'S') {
                                    if (c10 == 'T') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                            f27 = (f27 * 2.0f) - f21;
                                            f28 = (f28 * 2.0f) - f22;
                                        }
                                        int i30 = i10 + 1;
                                        path2.quadTo(f27, f28, fArr[i10], fArr[i30]);
                                        f10 = fArr[i10];
                                        f6 = fArr[i30];
                                        fVar = fVar3;
                                        f21 = f27;
                                        f22 = f28;
                                    } else if (c10 == 'l') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        int i31 = i10 + 1;
                                        path2.rLineTo(fArr[i10], fArr[i31]);
                                        f27 += fArr[i10];
                                        f14 = fArr[i31];
                                    } else if (c10 == 'm') {
                                        fArr = fArr3;
                                        i10 = i15;
                                        float f39 = fArr[i10];
                                        f27 += f39;
                                        float f40 = fArr[i10 + 1];
                                        f28 += f40;
                                        if (i10 > 0) {
                                            path2.rLineTo(f39, f40);
                                        } else {
                                            path2.rMoveTo(f39, f40);
                                            fVar = fVar3;
                                            f10 = f27;
                                            f25 = f10;
                                            f6 = f28;
                                            f26 = f6;
                                        }
                                    } else if (c10 != 's') {
                                        if (c10 != 't') {
                                            fArr = fArr3;
                                            i10 = i15;
                                            fVar = fVar3;
                                            f10 = f27;
                                        } else {
                                            if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                                f17 = f27 - f21;
                                                f18 = f28 - f22;
                                            } else {
                                                f18 = 0.0f;
                                                f17 = 0.0f;
                                            }
                                            int i32 = i15 + 1;
                                            path2.rQuadTo(f17, f18, fArr3[i15], fArr3[i32]);
                                            float f41 = f17 + f27;
                                            float f42 = f18 + f28;
                                            float f43 = f27 + fArr3[i15];
                                            f28 += fArr3[i32];
                                            f22 = f42;
                                            fArr = fArr3;
                                            i10 = i15;
                                            fVar = fVar3;
                                            f10 = f43;
                                            f21 = f41;
                                        }
                                        f6 = f28;
                                    } else {
                                        if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                            f15 = f28 - f22;
                                            f16 = f27 - f21;
                                        } else {
                                            f16 = 0.0f;
                                            f15 = 0.0f;
                                        }
                                        int i33 = i15;
                                        int i34 = i33 + 1;
                                        int i35 = i33 + 2;
                                        int i36 = i33 + 3;
                                        fArr = fArr3;
                                        i10 = i33;
                                        path2.rCubicTo(f16, f15, fArr3[i33], fArr3[i34], fArr3[i35], fArr3[i36]);
                                        f11 = fArr[i10] + f27;
                                        f12 = fArr[i34] + f28;
                                        f27 += fArr[i35];
                                        f13 = fArr[i36];
                                    }
                                    i11 = i13;
                                    c2 = c10;
                                } else {
                                    fArr = fArr3;
                                    i10 = i15;
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        f27 = (f27 * 2.0f) - f21;
                                        f28 = (f28 * 2.0f) - f22;
                                    }
                                    float f44 = f27;
                                    float f45 = f28;
                                    int i37 = i10 + 1;
                                    int i38 = i10 + 2;
                                    int i39 = i10 + 3;
                                    path2.cubicTo(f44, f45, fArr[i10], fArr[i37], fArr[i38], fArr[i39]);
                                    f21 = fArr[i10];
                                    f22 = fArr[i37];
                                    f10 = fArr[i38];
                                    f6 = fArr[i39];
                                }
                                i11 = i13;
                                fVar = fVar3;
                                c2 = c10;
                            } else {
                                fArr = fArr3;
                                i10 = i15;
                                path2.rLineTo(0.0f, fArr[i10]);
                                f14 = fArr[i10];
                            }
                            f28 += f14;
                        } else {
                            fArr = fArr3;
                            i10 = i15;
                            int i40 = i10 + 1;
                            int i41 = i10 + 2;
                            int i42 = i10 + 3;
                            path2.rQuadTo(fArr[i10], fArr[i40], fArr[i41], fArr[i42]);
                            f11 = fArr[i10] + f27;
                            f12 = fArr[i40] + f28;
                            f27 += fArr[i41];
                            f13 = fArr[i42];
                        }
                        f28 += f13;
                        f21 = f11;
                        f22 = f12;
                    } else {
                        fArr = fArr3;
                        i10 = i15;
                        path2.rLineTo(fArr[i10], 0.0f);
                        f27 += fArr[i10];
                    }
                    fVar = fVar3;
                    f10 = f27;
                    f6 = f28;
                    i11 = i13;
                    c2 = c10;
                } else {
                    fArr = fArr3;
                    i10 = i15;
                    int i43 = i10 + 5;
                    float f46 = fArr[i43] + f27;
                    int i44 = i10 + 6;
                    float f47 = fArr[i44] + f28;
                    float f48 = fArr[i10];
                    float f49 = fArr[i10 + 1];
                    float f50 = fArr[i10 + 2];
                    if (fArr[i10 + 3] != 0.0f) {
                        fVar2 = fVar3;
                        z5 = 1;
                    } else {
                        fVar2 = fVar3;
                        z5 = i14;
                    }
                    fVar = fVar2;
                    float f51 = f27;
                    c2 = c10;
                    float f52 = f28;
                    i11 = i13;
                    f.a(path, f51, f52, f46, f47, f48, f49, f50, z5, fArr[i10 + 4] != 0.0f ? 1 : i14);
                    f10 = f51 + fArr[i43];
                    f6 = f52 + fArr[i44];
                    f21 = f10;
                    f22 = f6;
                }
                i15 = i10 + i5;
                path2 = path;
                fVar3 = fVar;
                c10 = c2;
                i13 = i11;
                f27 = f10;
                f28 = f6;
                c8 = c10;
                fArr3 = fArr;
            }
            fArr2[i14] = f27;
            fArr2[1] = f28;
            fArr2[2] = f21;
            fArr2[3] = f22;
            fArr2[4] = f25;
            fArr2[5] = f26;
            c8 = fVar3.f9681a;
            i13++;
            fVarArr2 = fVarArr;
            path2 = path;
            i12 = i14;
        }
    }

    public static void C(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void D(ViewGroup viewGroup, boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            o0.b(viewGroup, z5);
        } else if (f25671a) {
            try {
                o0.b(viewGroup, z5);
            } catch (NoSuchMethodError unused) {
                f25671a = false;
            }
        }
    }

    public static int E(c cVar, g gVar) {
        if (cVar instanceof r4.a) {
            return ((r4.a) cVar).f22291a;
        }
        int i5 = d4.j.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i5 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i5 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new m();
    }

    public static final void F(h p10) {
        int i5;
        Intrinsics.checkNotNullParameter(p10, "p");
        Boolean bool = Boolean.TRUE;
        float[] fArr = p10.f22557a;
        int i10 = p10.f22558b;
        int i11 = 0;
        while (true) {
            boolean z5 = true;
            if (i11 >= i10) {
                break;
            }
            float f6 = fArr[i11];
            if (!bool.booleanValue() || 0.0f > f6 || f6 > 1.0f) {
                z5 = false;
            }
            bool = Boolean.valueOf(z5);
            i11++;
        }
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + h.b(p10, 31)).toString());
        }
        Iterable d10 = j.d(1, p10.f22558b);
        if ((d10 instanceof Collection) && ((Collection) d10).isEmpty()) {
            i5 = 0;
        } else {
            Iterator it = d10.iterator();
            i5 = 0;
            while (((b) it).f25972c) {
                int nextInt = ((i0) it).nextInt();
                if (p10.a(nextInt) < p10.a(nextInt - 1) && (i5 = i5 + 1) < 0) {
                    u.i();
                    throw null;
                }
            }
        }
        if (i5 <= 1) {
            return;
        }
        throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + h.b(p10, 31)).toString());
    }

    public static x G(p0 owner) {
        Intrinsics.checkNotNullParameter(owner, "fragmentActivity");
        n factory = new n(8);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        o1 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        t1.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(x.class, "modelClass");
        Intrinsics.checkNotNullParameter(x.class, "<this>");
        ag.c modelClass = Reflection.getOrCreateKotlinClass(x.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 != null) {
            return (x) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static com.google.android.gms.internal.measurement.n H(d dVar, com.google.firebase.messaging.x xVar, ArrayList arrayList, boolean z5) {
        com.google.android.gms.internal.measurement.n nVar;
        ci.c.g0("reduce", arrayList, 1);
        ci.c.h0(2, "reduce", arrayList);
        com.google.android.gms.internal.measurement.n c2 = ((t) xVar.f6183b).c(xVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
        if (!(c2 instanceof com.google.android.gms.internal.measurement.h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            nVar = ((t) xVar.f6183b).c(xVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
            if (nVar instanceof com.google.android.gms.internal.measurement.f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (dVar.m() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            nVar = null;
        }
        com.google.android.gms.internal.measurement.h hVar = (com.google.android.gms.internal.measurement.h) c2;
        int m6 = dVar.m();
        int i5 = z5 ? 0 : m6 - 1;
        int i10 = z5 ? m6 - 1 : 0;
        int i11 = true == z5 ? 1 : -1;
        if (nVar == null) {
            nVar = dVar.o(i5);
            i5 += i11;
        }
        while ((i10 - i5) * i11 >= 0) {
            if (dVar.q(i5)) {
                nVar = hVar.j(xVar, Arrays.asList(nVar, dVar.o(i5), new com.google.android.gms.internal.measurement.g(Double.valueOf(i5)), dVar));
                if (nVar instanceof com.google.android.gms.internal.measurement.f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i5 += i11;
            } else {
                i5 += i11;
            }
        }
        return nVar;
    }

    public static void I(int i5, int i10) {
        String E;
        if (i5 < 0 || i5 >= i10) {
            if (i5 < 0) {
                E = a.a.E("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(k.o(new StringBuilder(String.valueOf(i10).length() + 15), "negative size: ", i10));
                }
                E = a.a.E("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(E);
        }
    }

    public static d J(d dVar, com.google.firebase.messaging.x xVar, com.google.android.gms.internal.measurement.m mVar, Boolean bool, Boolean bool2) {
        d dVar2 = new d();
        Iterator l6 = dVar.l();
        while (l6.hasNext()) {
            int intValue = ((Integer) l6.next()).intValue();
            if (dVar.q(intValue)) {
                com.google.android.gms.internal.measurement.n j = mVar.j(xVar, Arrays.asList(dVar.o(intValue), new com.google.android.gms.internal.measurement.g(Double.valueOf(intValue)), dVar));
                if (j.c().equals(bool)) {
                    break;
                }
                if (bool2 == null || j.c().equals(bool2)) {
                    dVar2.p(intValue, j);
                }
            }
        }
        return dVar2;
    }

    public static void K(int i5, int i10) {
        String F;
        if (i5 < 0 || i5 >= i10) {
            if (i5 < 0) {
                F = a.a.F("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(k.o(new StringBuilder(String.valueOf(i10).length() + 15), "negative size: ", i10));
                }
                F = a.a.F("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(F);
        }
    }

    public static void L(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? M(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? M(i10, i11, "end index") : a.a.E("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static String M(int i5, int i10, String str) {
        if (i5 < 0) {
            return a.a.E("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return a.a.E("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(k.o(new StringBuilder(String.valueOf(i10).length() + 15), "negative size: ", i10));
    }

    public static void N(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? O(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? O(i10, i11, "end index") : a.a.F("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static String O(int i5, int i10, String str) {
        if (i5 < 0) {
            return a.a.F("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return a.a.F("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(k.o(new StringBuilder(String.valueOf(i10).length() + 15), "negative size: ", i10));
    }

    public static final void b(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if ((sVar instanceof s ? sVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(sVar.getClass()));
    }

    public static final tg.k c(rg.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        tg.k kVar = bVar instanceof tg.k ? (tg.k) bVar : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(bVar.getClass()));
    }

    public static final qg.h d(String serialName, a.a kind, qg.g[] typeParameters, Function1 builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.H(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, qg.k.f22178e)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        qg.a aVar = new qg.a(serialName);
        builder.invoke(aVar);
        return new qg.h(serialName, kind, aVar.f22147c.size(), kotlin.collections.p.z(typeParameters), aVar);
    }

    public static String f(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        char[] cArr = new char[(bArr.length * 3) - 1];
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            byte b10 = bArr[i5];
            int i10 = i5 * 3;
            cArr[i10] = charArray[(b10 & 255) >>> 4];
            cArr[i10 + 1] = charArray[b10 & 15];
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            if (i5 < bArr.length - 1) {
                cArr[i10 + 2] = ':';
            }
        }
        return new String(cArr);
    }

    public static boolean g(f[] fVarArr, f[] fVarArr2) {
        if (fVarArr == null || fVarArr2 == null || fVarArr.length != fVarArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < fVarArr.length; i5++) {
            f fVar = fVarArr[i5];
            char c2 = fVar.f9681a;
            f fVar2 = fVarArr2[i5];
            if (c2 != fVar2.f9681a || fVar.f9682b.length != fVar2.f9682b.length) {
                return false;
            }
        }
        return true;
    }

    public static final void i(v vVar, String name, String value) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        vVar.f10320a.add(name);
        vVar.f10320a.add(StringsKt.Z(value).toString());
    }

    public static final long j(int i5, int i10, i iVar, g gVar, i iVar2) {
        int i11;
        int i12;
        if (!Intrinsics.areEqual(iVar, i.f22306c)) {
            i5 = E(iVar.f22307a, gVar);
            i10 = E(iVar.f22308b, gVar);
        }
        c cVar = iVar2.f22307a;
        c cVar2 = iVar2.f22308b;
        if ((cVar instanceof r4.a) && i5 != Integer.MIN_VALUE && i5 != Integer.MAX_VALUE && i5 > (i12 = ((r4.a) cVar).f22291a)) {
            i5 = i12;
        }
        if ((cVar2 instanceof r4.a) && i10 != Integer.MIN_VALUE && i10 != Integer.MAX_VALUE && i10 > (i11 = ((r4.a) cVar2).f22291a)) {
            i10 = i11;
        }
        return (i10 & 4294967295L) | (i5 << 32);
    }

    public static final double k(int i5, int i10, int i11, int i12, g gVar) {
        double d10 = i11 / i5;
        double d11 = i12 / i10;
        int i13 = d4.j.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i13 == 1) {
            return Math.max(d10, d11);
        }
        if (i13 == 2) {
            return Math.min(d10, d11);
        }
        throw new m();
    }

    public static float[] l(int i5, float[] fArr) {
        if (i5 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i5, length);
        float[] fArr2 = new float[i5];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static FileInputStream m(FileInputStream fileInputStream, File file) {
        if (!d4.d().m().isTracingEnabled()) {
            return fileInputStream;
        }
        i1 n9 = io.sentry.util.h.f17164a ? d4.d().n() : d4.d().i();
        return new e(new com.google.firebase.messaging.x(file, n9 != null ? n9.r("file.read") : null, fileInputStream, d4.d().m()));
    }

    public static FileInputStream n(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
        if (!d4.d().m().isTracingEnabled()) {
            return fileInputStream;
        }
        i1 n9 = io.sentry.util.h.f17164a ? d4.d().n() : d4.d().i();
        return new e(new com.google.firebase.messaging.x(null, n9 != null ? n9.r("file.read") : null, fileInputStream, d4.d().m()), fileDescriptor);
    }

    public static d0 o(String name, String str, m0 body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("form-data; name=");
        b0 b0Var = e0.f10140f;
        u6.h.e(sb2, name);
        if (str != null) {
            sb2.append("; filename=");
            u6.h.e(sb2, str);
        }
        String sb3 = sb2.toString();
        v vVar = new v();
        vVar.c("Content-Disposition", sb3);
        Headers d10 = vVar.d();
        Intrinsics.checkNotNullParameter(body, "body");
        if (d10.get("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (d10.get("Content-Length") == null) {
            return new d0(d10, body);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f[] p(String str) {
        int i5;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i12 < str.length()) {
            while (i12 < str.length()) {
                char charAt = str.charAt(i12);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i12++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i11, i12).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i10) == 'z' || trim.charAt(i10) == 'Z') {
                            fArr = new float[i10];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i13 = i10;
                                int i14 = 1;
                                while (i14 < length) {
                                    int i15 = i10;
                                    int i16 = i15;
                                    int i17 = i16;
                                    int i18 = i17;
                                    for (int i19 = i14; i19 < trim.length(); i19++) {
                                        char charAt2 = trim.charAt(i19);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i19 != i14 && i15 == 0) {
                                                            i15 = 0;
                                                            i17 = 1;
                                                            i18 = 1;
                                                            break;
                                                        }
                                                        i15 = 0;
                                                        break;
                                                    case '.':
                                                        if (i16 == 0) {
                                                            i15 = 0;
                                                            i16 = 1;
                                                            break;
                                                        }
                                                        i15 = 0;
                                                        i17 = 1;
                                                        i18 = 1;
                                                        break;
                                                    default:
                                                        i15 = 0;
                                                        break;
                                                }
                                            } else {
                                                i15 = 1;
                                            }
                                            if (i17 == 0) {
                                                if (i14 < i19) {
                                                    fArr2[i13] = Float.parseFloat(trim.substring(i14, i19));
                                                    i13++;
                                                }
                                                i14 = i18 == 0 ? i19 : i19 + 1;
                                                i10 = 0;
                                            }
                                        }
                                        i15 = 0;
                                        i17 = 1;
                                        if (i17 == 0) {
                                        }
                                    }
                                    if (i14 < i19) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    i10 = 0;
                                }
                                fArr = l(i13, fArr2);
                                i10 = 0;
                            } catch (NumberFormatException e7) {
                                throw new RuntimeException(c1.n("error in parsing \"", trim, "\""), e7);
                            }
                        }
                        arrayList.add(new f(trim.charAt(i10), fArr));
                    }
                    i11 = i12;
                    i12++;
                    i10 = 0;
                }
                i12++;
            }
            trim = str.substring(i11, i12).trim();
            if (!trim.isEmpty()) {
            }
            i11 = i12;
            i12++;
            i10 = 0;
        }
        if (i12 - i11 != 1 || i11 >= str.length()) {
            i5 = 0;
        } else {
            i5 = 0;
            arrayList.add(new f(str.charAt(i11), new float[0]));
        }
        return (f[]) arrayList.toArray(new f[i5]);
    }

    public static Path q(String str) {
        Path path = new Path();
        try {
            B(p(str), path);
            return path;
        } catch (RuntimeException e7) {
            throw new RuntimeException("Error in parsing ".concat(str), e7);
        }
    }

    public static f[] r(f[] fVarArr) {
        f[] fVarArr2 = new f[fVarArr.length];
        for (int i5 = 0; i5 < fVarArr.length; i5++) {
            fVarArr2[i5] = new f(fVarArr[i5]);
        }
        return fVarArr2;
    }

    public static boolean s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static y1.b0 t(y1.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Sequence b10 = bg.n.b(new ub.b(13), d0Var);
        Intrinsics.checkNotNullParameter(b10, "<this>");
        Iterator it = b10.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (y1.b0) next;
    }

    public static Object u(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return h.b.d(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (ActivityResult.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static String v(Context context) {
        JSONArray jSONArray;
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNull(packageManager);
        Intrinsics.checkNotNull(packageName);
        ArrayList arrayList = new ArrayList();
        try {
            for (Signature signature : h.b.f(packageManager, packageName)) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                Intrinsics.checkNotNullExpressionValue(messageDigest, "also(...)");
                byte[] digest = messageDigest.digest();
                Intrinsics.checkNotNull(digest);
                arrayList.add(f(digest));
            }
        } catch (Exception e7) {
            if (!(e7 instanceof PackageManager.NameNotFoundException)) {
                if (e7 instanceof NoSuchAlgorithmException) {
                    zc.d.b(6, null, e7);
                } else {
                    zc.d.b(6, null, e7);
                }
            }
        }
        try {
            jSONArray = new JSONArray(new com.google.gson.j().f(arrayList, new TypeToken<List<? extends String>>() { // from class: com.sports.insider.domain.usecase.common.SignatureUseCase$listStringToJsonArray$1
            }.getType()));
        } catch (Exception e9) {
            zc.d.b(6, null, e9);
            jSONArray = null;
        }
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return null;
    }

    public static final void w(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = name.charAt(i5);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                if (num.length() < 2) {
                    num = CommonUrlParts.Values.FALSE_INTEGER.concat(num);
                }
                sb2.append(num);
                sb2.append(" at ");
                sb2.append(i5);
                sb2.append(" in header name: ");
                sb2.append(name);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static final void x(String value, String name) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = value.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = value.charAt(i5);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                if (num.length() < 2) {
                    num = CommonUrlParts.Values.FALSE_INTEGER.concat(num);
                }
                sb2.append(num);
                sb2.append(" at ");
                sb2.append(i5);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(hh.e.j(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static char y(int i5) {
        switch (i5 / 10) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            default:
                return '9';
        }
    }

    public static char z(int i5) {
        switch (i5 % 10) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            default:
                return '9';
        }
    }

    public abstract List h(String str, List list);

    @Override // androidx.core.view.h1
    public void a() {
    }

    @Override // androidx.core.view.h1
    public void onAnimationCancel() {
    }
}
