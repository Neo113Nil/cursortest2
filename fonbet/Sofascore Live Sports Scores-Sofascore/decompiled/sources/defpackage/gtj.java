package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzaqu;
import com.google.android.gms.internal.ads.zzaqz;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarr;
import com.google.android.gms.internal.ads.zzars;
import com.google.android.gms.internal.ads.zzart;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzet;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfj;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gtj implements nzg, ozg, zzarh {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;

    public gtj(String str, String str2, int i) {
        this.a = i;
        int i2 = 24;
        switch (i) {
            case 4:
                int glCreateProgram = GLES20.glCreateProgram();
                this.b = glCreateProgram;
                xw3.x();
                g(glCreateProgram, 35633, str);
                g(glCreateProgram, 35632, str2);
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = {0};
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                xw3.y("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
                GLES20.glUseProgram(glCreateProgram);
                this.f = new HashMap();
                int[] iArr2 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
                this.d = new hjg[iArr2[0]];
                int i3 = 0;
                while (i3 < iArr2[0]) {
                    int i4 = this.b;
                    int[] iArr3 = new int[1];
                    GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
                    int i5 = iArr3[0];
                    byte[] bArr = new byte[i5];
                    int i6 = i3;
                    GLES20.glGetActiveAttrib(i4, i6, i5, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i5) {
                            break;
                        } else if (bArr[i7] == 0) {
                            i5 = i7;
                        } else {
                            i7++;
                        }
                    }
                    String str3 = new String(bArr, 0, i5);
                    GLES20.glGetAttribLocation(i4, str3);
                    hjg hjgVar = new hjg();
                    ((hjg[]) this.d)[i6] = hjgVar;
                    ((HashMap) this.f).put(str3, hjgVar);
                    i3 = i6 + 1;
                }
                this.c = new HashMap();
                int[] iArr4 = new int[1];
                GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
                this.e = new dti[iArr4[0]];
                int i8 = 0;
                while (i8 < iArr4[0]) {
                    int i9 = this.b;
                    int[] iArr5 = new int[1];
                    GLES20.glGetProgramiv(i9, 35719, iArr5, 0);
                    int i10 = iArr5[0];
                    byte[] bArr2 = new byte[i10];
                    int i11 = i8;
                    GLES20.glGetActiveUniform(i9, i11, i10, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i10) {
                            break;
                        } else if (bArr2[i12] == 0) {
                            i10 = i12;
                        } else {
                            i12++;
                        }
                    }
                    String str4 = new String(bArr2, 0, i10);
                    GLES20.glGetUniformLocation(i9, str4);
                    dti dtiVar = new dti(i2);
                    ((dti[]) this.e)[i11] = dtiVar;
                    ((HashMap) this.c).put(str4, dtiVar);
                    i8 = i11 + 1;
                }
                xw3.x();
                break;
            default:
                int glCreateProgram2 = GLES20.glCreateProgram();
                this.b = glCreateProgram2;
                ok3.g();
                e(glCreateProgram2, 35633, str);
                e(glCreateProgram2, 35632, str2);
                GLES20.glLinkProgram(glCreateProgram2);
                int[] iArr6 = {0};
                GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr6, 0);
                ok3.h("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram2), iArr6[0] == 1);
                GLES20.glUseProgram(glCreateProgram2);
                this.f = new HashMap();
                int[] iArr7 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram2, 35721, iArr7, 0);
                this.d = new tnf[iArr7[0]];
                int i13 = 0;
                while (i13 < iArr7[0]) {
                    int i14 = this.b;
                    int[] iArr8 = new int[1];
                    GLES20.glGetProgramiv(i14, 35722, iArr8, 0);
                    int i15 = iArr8[0];
                    byte[] bArr3 = new byte[i15];
                    int i16 = i13;
                    GLES20.glGetActiveAttrib(i14, i16, i15, new int[1], 0, new int[1], 0, new int[1], 0, bArr3, 0);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i15) {
                            break;
                        } else if (bArr3[i17] == 0) {
                            i15 = i17;
                        } else {
                            i17++;
                        }
                    }
                    String str5 = new String(bArr3, 0, i15);
                    GLES20.glGetAttribLocation(i14, str5);
                    tnf tnfVar = new tnf(i2);
                    ((tnf[]) this.d)[i16] = tnfVar;
                    ((HashMap) this.f).put(str5, tnfVar);
                    i13 = i16 + 1;
                }
                this.c = new HashMap();
                int[] iArr9 = new int[1];
                GLES20.glGetProgramiv(this.b, 35718, iArr9, 0);
                this.e = new kpg[iArr9[0]];
                int i18 = 0;
                while (i18 < iArr9[0]) {
                    int i19 = this.b;
                    int[] iArr10 = new int[1];
                    GLES20.glGetProgramiv(i19, 35719, iArr10, 0);
                    int i20 = iArr10[0];
                    byte[] bArr4 = new byte[i20];
                    int i21 = i18;
                    GLES20.glGetActiveUniform(i19, i21, i20, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
                    int i22 = 0;
                    while (true) {
                        if (i22 >= i20) {
                            break;
                        } else if (bArr4[i22] == 0) {
                            i20 = i22;
                        } else {
                            i22++;
                        }
                    }
                    String str6 = new String(bArr4, 0, i20);
                    GLES20.glGetUniformLocation(i19, str6);
                    kpg kpgVar = new kpg(i2);
                    ((kpg[]) this.e)[i21] = kpgVar;
                    ((HashMap) this.c).put(str6, kpgVar);
                    i18 = i21 + 1;
                }
                ok3.g();
                break;
        }
    }

    public static void e(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        ok3.h(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        ok3.g();
    }

    public static void g(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        xw3.y(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        xw3.x();
    }

    public void A(String str) {
        int hashCode;
        g7d g7dVar = (g7d) this.d;
        if (str == null) {
            hashCode = 0;
        } else if (str.equals((String) g7dVar.b.g)) {
            pvd.s("Start destination ", str, " cannot use the same route as the graph ", g7dVar);
            return;
        } else if (StringsKt.R(str)) {
            a70.p("Cannot have an empty start destination route");
            return;
        } else {
            int i = s6d.f;
            hashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.b = hashCode;
        this.c = str;
    }

    public void B(int i) {
        ((Paint) this.d).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void C(int i) {
        ((Paint) this.d).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void D(float f) {
        ((Paint) this.d).setStrokeWidth(f);
    }

    public void E(int i) {
        ((Paint) this.d).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    @Override // defpackage.ozg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(j9e j9eVar) {
        djj djjVar;
        SparseArray sparseArray;
        int a;
        int size;
        int i;
        djj djjVar2;
        SparseArray sparseArray2;
        int i2;
        int i3;
        int i4;
        int i5;
        djj djjVar3;
        SparseArray sparseArray3 = (SparseArray) this.e;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f;
        nm2 nm2Var = (nm2) this.d;
        z1k z1kVar = (z1k) this.c;
        SparseArray sparseArray4 = z1kVar.h;
        SparseBooleanArray sparseBooleanArray = z1kVar.i;
        mu4 mu4Var = z1kVar.f;
        List list = z1kVar.c;
        int i6 = z1kVar.a;
        if (j9eVar.A() != 2) {
            return;
        }
        if (i6 == 1 || i6 == 2 || z1kVar.n == 1) {
            djjVar = (djj) list.get(0);
        } else {
            djjVar = new djj(((djj) list.get(0)).d());
            list.add(djjVar);
        }
        if ((j9eVar.A() & 128) == 0) {
            return;
        }
        j9eVar.O(1);
        int H = j9eVar.H();
        j9eVar.O(3);
        j9eVar.k(nm2Var.d, 0, 2);
        nm2Var.q(0);
        nm2Var.t(3);
        z1kVar.t = nm2Var.i(13);
        j9eVar.k(nm2Var.d, 0, 2);
        nm2Var.q(0);
        nm2Var.t(4);
        j9eVar.O(nm2Var.i(12));
        if (i6 == 2 && z1kVar.r == null) {
            e2k a2 = mu4Var.a(21, new fig(21, null, 0, null, nik.b));
            z1kVar.r = a2;
            if (a2 != null) {
                sparseArray = sparseArray4;
                a2.c(djjVar, z1kVar.m, new c2k(H, 21, 8192, 1));
                sparseArray3.clear();
                sparseIntArray.clear();
                a = j9eVar.a();
                while (a > 0) {
                    j9eVar.k(nm2Var.d, 0, 5);
                    nm2Var.q(0);
                    int i7 = nm2Var.i(8);
                    nm2Var.t(3);
                    int i8 = nm2Var.i(13);
                    nm2Var.t(4);
                    int i9 = nm2Var.i(12);
                    int i10 = j9eVar.b;
                    int i11 = i10 + i9;
                    int i12 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i13 = 0;
                    while (true) {
                        if (j9eVar.b >= i11) {
                            i3 = a;
                            break;
                        }
                        int A = j9eVar.A();
                        i3 = a;
                        int A2 = j9eVar.b + j9eVar.A();
                        if (A2 > i11) {
                            break;
                        }
                        nm2 nm2Var2 = nm2Var;
                        if (A == 5) {
                            long C = j9eVar.C();
                            if (C == 1094921523) {
                                i12 = 129;
                            } else if (C == 1161904947) {
                                i12 = 135;
                            } else {
                                if (C != 1094921524) {
                                    if (C == 1212503619) {
                                        i12 = 36;
                                    }
                                }
                                i12 = 172;
                            }
                            i4 = A2;
                            i5 = H;
                        } else {
                            if (A == 106) {
                                i4 = A2;
                                i5 = H;
                                djjVar3 = djjVar;
                                i12 = 129;
                            } else if (A == 122) {
                                i5 = H;
                                djjVar3 = djjVar;
                                i12 = 135;
                                i4 = A2;
                            } else if (A == 127) {
                                int A3 = j9eVar.A();
                                if (A3 != 21) {
                                    if (A3 == 14) {
                                        i12 = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                                    } else if (A3 == 33) {
                                        i12 = 139;
                                    }
                                    i4 = A2;
                                    i5 = H;
                                }
                                i12 = 172;
                                i4 = A2;
                                i5 = H;
                            } else if (A == 123) {
                                i4 = A2;
                                i12 = 138;
                                i5 = H;
                            } else if (A == 10) {
                                i4 = A2;
                                str = j9eVar.y(3, StandardCharsets.UTF_8).trim();
                                i5 = H;
                                i13 = j9eVar.A();
                            } else {
                                if (A == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (j9eVar.b < A2) {
                                        String trim = j9eVar.y(3, StandardCharsets.UTF_8).trim();
                                        j9eVar.A();
                                        djj djjVar4 = djjVar;
                                        byte[] bArr = new byte[4];
                                        j9eVar.k(bArr, 0, 4);
                                        arrayList2.add(new b2k(trim, bArr));
                                        djjVar = djjVar4;
                                        A2 = A2;
                                        H = H;
                                    }
                                    i4 = A2;
                                    i5 = H;
                                    djjVar3 = djjVar;
                                    arrayList = arrayList2;
                                    i12 = 89;
                                } else {
                                    i4 = A2;
                                    i5 = H;
                                    djjVar3 = djjVar;
                                    if (A == 111) {
                                        i12 = 257;
                                    }
                                }
                                j9eVar.O(i4 - j9eVar.b);
                                djjVar = djjVar3;
                                a = i3;
                                nm2Var = nm2Var2;
                                H = i5;
                            }
                            j9eVar.O(i4 - j9eVar.b);
                            djjVar = djjVar3;
                            a = i3;
                            nm2Var = nm2Var2;
                            H = i5;
                        }
                        djjVar3 = djjVar;
                        j9eVar.O(i4 - j9eVar.b);
                        djjVar = djjVar3;
                        a = i3;
                        nm2Var = nm2Var2;
                        H = i5;
                    }
                    nm2 nm2Var3 = nm2Var;
                    int i14 = H;
                    djj djjVar5 = djjVar;
                    j9eVar.N(i11);
                    fig figVar = new fig(i12, str, i13, arrayList, Arrays.copyOfRange(j9eVar.a, i10, i11));
                    if (i7 == 6 || i7 == 5) {
                        i7 = i12;
                    }
                    int i15 = i3 - (i9 + 5);
                    int i16 = i6 == 2 ? i7 : i8;
                    if (!sparseBooleanArray.get(i16)) {
                        e2k a3 = (i6 == 2 && i7 == 21) ? z1kVar.r : mu4Var.a(i7, figVar);
                        if (i6 != 2 || i8 < sparseIntArray.get(i16, 8192)) {
                            sparseIntArray.put(i16, i8);
                            sparseArray3.put(i16, a3);
                        }
                    }
                    a = i15;
                    djjVar = djjVar5;
                    nm2Var = nm2Var3;
                    H = i14;
                }
                int i17 = H;
                djj djjVar6 = djjVar;
                size = sparseIntArray.size();
                i = 0;
                while (i < size) {
                    int keyAt = sparseIntArray.keyAt(i);
                    int valueAt = sparseIntArray.valueAt(i);
                    sparseBooleanArray.put(keyAt, true);
                    z1kVar.j.put(valueAt, true);
                    e2k e2kVar = (e2k) sparseArray3.valueAt(i);
                    if (e2kVar != null) {
                        if (e2kVar != z1kVar.r) {
                            i2 = i17;
                            djjVar2 = djjVar6;
                            e2kVar.c(djjVar2, z1kVar.m, new c2k(i2, keyAt, 8192, 1));
                        } else {
                            djjVar2 = djjVar6;
                            i2 = i17;
                        }
                        sparseArray2 = sparseArray;
                        sparseArray2.put(valueAt, e2kVar);
                    } else {
                        djjVar2 = djjVar6;
                        sparseArray2 = sparseArray;
                        i2 = i17;
                    }
                    i++;
                    sparseArray = sparseArray2;
                    i17 = i2;
                    djjVar6 = djjVar2;
                }
                SparseArray sparseArray5 = sparseArray;
                if (i6 != 2) {
                    if (z1kVar.o) {
                        return;
                    }
                    z1kVar.m.endTracks();
                    z1kVar.n = 0;
                    z1kVar.o = true;
                    return;
                }
                sparseArray5.remove(this.b);
                int i18 = i6 == 1 ? 0 : z1kVar.n - 1;
                z1kVar.n = i18;
                if (i18 == 0) {
                    z1kVar.m.endTracks();
                    z1kVar.o = true;
                    return;
                }
                return;
            }
        }
        sparseArray = sparseArray4;
        sparseArray3.clear();
        sparseIntArray.clear();
        a = j9eVar.a();
        while (a > 0) {
        }
        int i172 = H;
        djj djjVar62 = djjVar;
        size = sparseIntArray.size();
        i = 0;
        while (i < size) {
        }
        SparseArray sparseArray52 = sparseArray;
        if (i6 != 2) {
        }
    }

    public void d(s6d s6dVar) {
        zwh zwhVar = (zwh) this.e;
        g7d g7dVar = (g7d) this.d;
        i3d i3dVar = g7dVar.b;
        s6dVar.getClass();
        i3d i3dVar2 = s6dVar.b;
        int i = i3dVar2.b;
        String str = (String) i3dVar2.g;
        if (i == 0 && str == null) {
            a70.p("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = (String) i3dVar.g;
        if (str2 != null && Intrinsics.c(str, str2)) {
            pvd.s("Destination ", s6dVar, " cannot have the same route as graph ", g7dVar);
            return;
        }
        if (i == i3dVar.b) {
            pvd.s("Destination ", s6dVar, " cannot have the same id as graph ", g7dVar);
            return;
        }
        s6d s6dVar2 = (s6d) gz8.C(zwhVar, i);
        if (s6dVar2 == s6dVar) {
            return;
        }
        if (s6dVar.c != null) {
            a70.r("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (s6dVar2 != null) {
            s6dVar2.c = null;
        }
        s6dVar.c = g7dVar;
        zwhVar.d(i3dVar2.b, s6dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        if (r33.s() == 21) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    @Override // defpackage.nzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(nkk nkkVar) {
        cjj cjjVar;
        SparseArray sparseArray;
        int c;
        int size;
        int i;
        cjj cjjVar2;
        SparseArray sparseArray2;
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        cjj cjjVar3;
        SparseArray sparseArray3 = (SparseArray) this.e;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f;
        nm2 nm2Var = (nm2) this.d;
        y1k y1kVar = (y1k) this.c;
        SparseArray sparseArray4 = y1kVar.g;
        SparseBooleanArray sparseBooleanArray = y1kVar.h;
        sz8 sz8Var = y1kVar.f;
        List list = y1kVar.c;
        int i6 = y1kVar.a;
        if (nkkVar.s() != 2) {
            return;
        }
        if (i6 == 1 || i6 == 2 || y1kVar.m == 1) {
            cjjVar = (cjj) list.get(0);
        } else {
            cjjVar = new cjj(((cjj) list.get(0)).c());
            list.add(cjjVar);
        }
        if ((nkkVar.s() & 128) == 0) {
            return;
        }
        nkkVar.F(1);
        int x = nkkVar.x();
        nkkVar.F(3);
        nkkVar.e(nm2Var.d, 0, 2);
        nm2Var.q(0);
        nm2Var.t(3);
        y1kVar.s = nm2Var.i(13);
        nkkVar.e(nm2Var.d, 0, 2);
        nm2Var.q(0);
        nm2Var.t(4);
        nkkVar.F(nm2Var.i(12));
        if (i6 == 2 && y1kVar.q == null) {
            d2k q = sz8Var.q(21, new ejg(21, (String) null, (ArrayList) null, lik.e));
            y1kVar.q = q;
            if (q != null) {
                sparseArray = sparseArray4;
                q.j(cjjVar, y1kVar.l, new c2k(x, 21, 8192, 0));
                sparseArray3.clear();
                sparseIntArray.clear();
                c = nkkVar.c();
                while (c > 0) {
                    nkkVar.e(nm2Var.d, 0, 5);
                    nm2Var.q(0);
                    int i7 = nm2Var.i(8);
                    nm2Var.t(3);
                    int i8 = nm2Var.i(13);
                    nm2Var.t(4);
                    int i9 = nm2Var.i(12);
                    int i10 = nkkVar.b;
                    int i11 = i10 + i9;
                    int i12 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    while (true) {
                        if (nkkVar.b >= i11) {
                            i3 = c;
                            break;
                        }
                        int s = nkkVar.s();
                        i3 = c;
                        int s2 = nkkVar.b + nkkVar.s();
                        if (s2 > i11) {
                            break;
                        }
                        nm2 nm2Var2 = nm2Var;
                        if (s == 5) {
                            long t = nkkVar.t();
                            if (t == 1094921523) {
                                i12 = 129;
                            } else if (t == 1161904947) {
                                i12 = 135;
                            } else {
                                if (t != 1094921524) {
                                    if (t == 1212503619) {
                                        i12 = 36;
                                    }
                                }
                                i12 = 172;
                            }
                            i4 = s2;
                            i5 = x;
                            cjjVar3 = cjjVar;
                        } else {
                            if (s == 106) {
                                i4 = s2;
                                cjjVar3 = cjjVar;
                                i12 = 129;
                                i5 = x;
                            } else if (s == 122) {
                                i5 = x;
                                cjjVar3 = cjjVar;
                                i12 = 135;
                                i4 = s2;
                            } else {
                                if (s != 127) {
                                    if (s == 123) {
                                        i4 = s2;
                                        i12 = 138;
                                        i5 = x;
                                        cjjVar3 = cjjVar;
                                    } else if (s == 10) {
                                        str = nkkVar.q(3, xp2.c).trim();
                                    } else if (s == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (nkkVar.b < s2) {
                                            String trim = nkkVar.q(3, xp2.c).trim();
                                            nkkVar.s();
                                            cjj cjjVar4 = cjjVar;
                                            byte[] bArr = new byte[4];
                                            nkkVar.e(bArr, 0, 4);
                                            arrayList2.add(new a2k(trim, bArr));
                                            cjjVar = cjjVar4;
                                            s2 = s2;
                                            x = x;
                                        }
                                        i4 = s2;
                                        i5 = x;
                                        cjjVar3 = cjjVar;
                                        arrayList = arrayList2;
                                        i12 = 89;
                                    } else {
                                        i4 = s2;
                                        i5 = x;
                                        cjjVar3 = cjjVar;
                                        if (s == 111) {
                                            i12 = 257;
                                        }
                                    }
                                }
                                i4 = s2;
                                i5 = x;
                                cjjVar3 = cjjVar;
                            }
                            nkkVar.F(i4 - nkkVar.b);
                            cjjVar = cjjVar3;
                            c = i3;
                            x = i5;
                            nm2Var = nm2Var2;
                        }
                        nkkVar.F(i4 - nkkVar.b);
                        cjjVar = cjjVar3;
                        c = i3;
                        x = i5;
                        nm2Var = nm2Var2;
                    }
                    nm2 nm2Var3 = nm2Var;
                    int i13 = x;
                    cjj cjjVar5 = cjjVar;
                    nkkVar.E(i11);
                    byte[] copyOfRange = Arrays.copyOfRange(nkkVar.a, i10, i11);
                    int i14 = i12;
                    ejg ejgVar = new ejg(i14, str, arrayList, copyOfRange);
                    if (i7 == 6 || i7 == 5) {
                        i7 = i14;
                    }
                    int i15 = i3 - (i9 + 5);
                    int i16 = i6 == 2 ? i7 : i8;
                    if (sparseBooleanArray.get(i16)) {
                        c2 = 21;
                    } else {
                        c2 = 21;
                        d2k q2 = (i6 == 2 && i7 == 21) ? y1kVar.q : sz8Var.q(i7, ejgVar);
                        if (i6 != 2 || i8 < sparseIntArray.get(i16, 8192)) {
                            sparseIntArray.put(i16, i8);
                            sparseArray3.put(i16, q2);
                        }
                    }
                    c = i15;
                    cjjVar = cjjVar5;
                    x = i13;
                    nm2Var = nm2Var3;
                }
                int i17 = x;
                cjj cjjVar6 = cjjVar;
                size = sparseIntArray.size();
                i = 0;
                while (i < size) {
                    int keyAt = sparseIntArray.keyAt(i);
                    int valueAt = sparseIntArray.valueAt(i);
                    sparseBooleanArray.put(keyAt, true);
                    y1kVar.i.put(valueAt, true);
                    d2k d2kVar = (d2k) sparseArray3.valueAt(i);
                    if (d2kVar != null) {
                        if (d2kVar != y1kVar.q) {
                            i2 = i17;
                            cjjVar2 = cjjVar6;
                            d2kVar.j(cjjVar2, y1kVar.l, new c2k(i2, keyAt, 8192, 0));
                        } else {
                            cjjVar2 = cjjVar6;
                            i2 = i17;
                        }
                        sparseArray2 = sparseArray;
                        sparseArray2.put(valueAt, d2kVar);
                    } else {
                        cjjVar2 = cjjVar6;
                        sparseArray2 = sparseArray;
                        i2 = i17;
                    }
                    i++;
                    sparseArray = sparseArray2;
                    i17 = i2;
                    cjjVar6 = cjjVar2;
                }
                SparseArray sparseArray5 = sparseArray;
                if (i6 != 2) {
                    if (y1kVar.n) {
                        return;
                    }
                    y1kVar.l.endTracks();
                    y1kVar.m = 0;
                    y1kVar.n = true;
                    return;
                }
                sparseArray5.remove(this.b);
                int i18 = i6 == 1 ? 0 : y1kVar.m - 1;
                y1kVar.m = i18;
                if (i18 == 0) {
                    y1kVar.l.endTracks();
                    y1kVar.n = true;
                    return;
                }
                return;
            }
        }
        sparseArray = sparseArray4;
        sparseArray3.clear();
        sparseIntArray.clear();
        c = nkkVar.c();
        while (c > 0) {
        }
        int i172 = x;
        cjj cjjVar62 = cjjVar;
        size = sparseIntArray.size();
        i = 0;
        while (i < size) {
        }
        SparseArray sparseArray52 = sparseArray;
        if (i6 != 2) {
        }
    }

    public s6d h(int i) {
        return l(i, (g7d) this.d, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cc  */
    @Override // com.google.android.gms.internal.ads.zzarh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(zzeu zzeuVar) {
        SparseArray sparseArray;
        int i;
        zzarw zzaraVar;
        zzarw zzaraVar2;
        SparseArray sparseArray2;
        int i2;
        if (zzeuVar.I() != 2) {
            return;
        }
        zzarr zzarrVar = (zzarr) this.c;
        List list = zzarrVar.b;
        SparseArray sparseArray3 = zzarrVar.g;
        SparseBooleanArray sparseBooleanArray = zzarrVar.h;
        int i3 = 0;
        zzfj zzfjVar = (zzfj) list.get(0);
        if ((zzeuVar.I() & 128) != 0) {
            zzeuVar.E(1);
            int J = zzeuVar.J();
            int i4 = 3;
            zzeuVar.E(3);
            zzet zzetVar = (zzet) this.d;
            zzeuVar.F(0, 2, zzetVar.a);
            zzetVar.d(0);
            zzetVar.f(3);
            int i5 = 13;
            zzarrVar.p = zzetVar.h(13);
            zzeuVar.F(0, 2, zzetVar.a);
            zzetVar.d(0);
            int i6 = 4;
            zzetVar.f(4);
            zzeuVar.E(zzetVar.h(12));
            SparseArray sparseArray4 = (SparseArray) this.e;
            sparseArray4.clear();
            SparseIntArray sparseIntArray = (SparseIntArray) this.f;
            sparseIntArray.clear();
            int B = zzeuVar.B();
            while (B > 0) {
                zzeuVar.F(i3, 5, zzetVar.a);
                zzetVar.d(i3);
                int h = zzetVar.h(8);
                zzetVar.f(i4);
                int h2 = zzetVar.h(i5);
                zzetVar.f(i6);
                int h3 = zzetVar.h(12);
                int i7 = zzeuVar.b;
                int i8 = i7 + h3;
                String str = null;
                ArrayList arrayList = null;
                int i9 = -1;
                int i10 = 0;
                while (zzeuVar.b < i8) {
                    int I = zzeuVar.I();
                    int I2 = zzeuVar.b + zzeuVar.I();
                    if (I2 > i8) {
                        SparseArray sparseArray5 = sparseArray3;
                        zzet zzetVar2 = zzetVar;
                        zzeuVar.D(i8);
                        zzart zzartVar = new zzart(i9, str, i10, arrayList, Arrays.copyOfRange(zzeuVar.a, i7, i8));
                        String str2 = str;
                        if (h != 6 || h == 5) {
                            h = i9;
                        }
                        B -= h3 + 5;
                        if (sparseBooleanArray.get(h2)) {
                            zzaqe zzaqeVar = zzarrVar.e;
                            zzaqeVar.getClass();
                            i = 3;
                            if (h != 2) {
                                if (h == 3 || h == 4) {
                                    zzaraVar2 = new zzara(new zzaqt(str2, zzartVar.a(), "video/mp2t"));
                                } else {
                                    if (h == 21) {
                                        zzaraVar = new zzara(new zzaqr());
                                    } else if (h == 27) {
                                        zzaraVar = new zzara(new zzaqo(new zzark(zzaqeVar.a(zzartVar))));
                                    } else if (h == 36) {
                                        zzaraVar = new zzara(new zzaqq(new zzark(zzaqeVar.a(zzartVar))));
                                    } else if (h == 45) {
                                        zzaraVar = new zzara(new zzaqu());
                                    } else if (h == 89) {
                                        zzaraVar = new zzara(new zzaqg(zzartVar.b));
                                    } else if (h == 172) {
                                        zzaraVar2 = new zzara(new zzaqa(str2, zzartVar.a(), "video/mp2t"));
                                    } else if (h == 257) {
                                        zzaraVar = new zzari(new zzaqz("application/vnd.dvb.ait"));
                                    } else if (h != 128) {
                                        if (h != 129) {
                                            if (h != 138) {
                                                if (h != 139) {
                                                    switch (h) {
                                                        case 15:
                                                            zzaraVar2 = new zzara(new zzaqd(zzartVar.a(), str2, "video/mp2t", false));
                                                            break;
                                                        case 16:
                                                            zzaraVar = new zzara(new zzaqm(new l2a(zzaqeVar.a(zzartVar), 25)));
                                                            break;
                                                        case 17:
                                                            zzaraVar2 = new zzara(new zzaqs(str2, zzartVar.a()));
                                                            break;
                                                        default:
                                                            switch (h) {
                                                                case 134:
                                                                    zzaraVar = new zzari(new zzaqz(MimeTypes.APPLICATION_SCTE35));
                                                                    break;
                                                                case 135:
                                                                    break;
                                                                case PRIVACY_URL_ERROR_VALUE:
                                                                    break;
                                                                default:
                                                                    zzaraVar = null;
                                                                    break;
                                                            }
                                                    }
                                                } else {
                                                    zzaraVar2 = new zzara(new zzaqf(str2, zzartVar.a(), 5408));
                                                }
                                            }
                                            zzaraVar2 = new zzara(new zzaqf(str2, zzartVar.a(), 4096));
                                        }
                                        zzaraVar2 = new zzara(new zzapx(str2, zzartVar.a(), "video/mp2t"));
                                    }
                                    sparseIntArray.put(h2, h2);
                                    sparseArray4.put(h2, zzaraVar);
                                }
                                zzaraVar = zzaraVar2;
                                sparseIntArray.put(h2, h2);
                                sparseArray4.put(h2, zzaraVar);
                            }
                            zzaraVar = new zzara(new zzaqj(new l2a(zzaqeVar.a(zzartVar), 25), "video/mp2t"));
                            sparseIntArray.put(h2, h2);
                            sparseArray4.put(h2, zzaraVar);
                        } else {
                            i = 3;
                        }
                        i4 = i;
                        zzetVar = zzetVar2;
                        sparseArray3 = sparseArray5;
                        i3 = 0;
                        i5 = 13;
                        i6 = 4;
                    } else {
                        zzet zzetVar3 = zzetVar;
                        if (I == 5) {
                            long N = zzeuVar.N();
                            if (N != 1094921523) {
                                if (N != 1161904947) {
                                    if (N != 1094921524) {
                                        if (N == 1212503619) {
                                            sparseArray2 = sparseArray3;
                                            i2 = I2;
                                            i9 = 36;
                                        }
                                        sparseArray2 = sparseArray3;
                                        i2 = I2;
                                    }
                                    sparseArray2 = sparseArray3;
                                    i2 = I2;
                                    i9 = 172;
                                }
                                sparseArray2 = sparseArray3;
                                i9 = 135;
                                i2 = I2;
                            }
                            sparseArray2 = sparseArray3;
                            i2 = I2;
                            i9 = 129;
                        } else {
                            if (I != 106) {
                                if (I != 122) {
                                    if (I == 127) {
                                        int I3 = zzeuVar.I();
                                        if (I3 != 21) {
                                            if (I3 == 14) {
                                                sparseArray2 = sparseArray3;
                                                i9 = 136;
                                            } else {
                                                if (I3 == 33) {
                                                    sparseArray2 = sparseArray3;
                                                    i2 = I2;
                                                    i9 = 139;
                                                }
                                                sparseArray2 = sparseArray3;
                                            }
                                        }
                                        sparseArray2 = sparseArray3;
                                        i2 = I2;
                                        i9 = 172;
                                    } else if (I == 123) {
                                        sparseArray2 = sparseArray3;
                                        i2 = I2;
                                        i9 = 138;
                                    } else if (I == 10) {
                                        str = zzeuVar.k(3, StandardCharsets.UTF_8).trim();
                                        i10 = zzeuVar.I();
                                        sparseArray2 = sparseArray3;
                                    } else if (I == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzeuVar.b < I2) {
                                            String trim = zzeuVar.k(3, StandardCharsets.UTF_8).trim();
                                            zzeuVar.I();
                                            byte[] bArr = new byte[4];
                                            zzeuVar.F(0, 4, bArr);
                                            arrayList2.add(new zzars(trim, bArr));
                                            I2 = I2;
                                            sparseArray3 = sparseArray3;
                                        }
                                        sparseArray2 = sparseArray3;
                                        i2 = I2;
                                        arrayList = arrayList2;
                                        i9 = 89;
                                    } else {
                                        sparseArray2 = sparseArray3;
                                        i2 = I2;
                                        if (I == 111) {
                                            i9 = 257;
                                        }
                                    }
                                    i2 = I2;
                                }
                                sparseArray2 = sparseArray3;
                                i9 = 135;
                                i2 = I2;
                            }
                            sparseArray2 = sparseArray3;
                            i2 = I2;
                            i9 = 129;
                        }
                        zzeuVar.E(i2 - zzeuVar.b);
                        zzetVar = zzetVar3;
                        sparseArray3 = sparseArray2;
                    }
                }
                SparseArray sparseArray52 = sparseArray3;
                zzet zzetVar22 = zzetVar;
                zzeuVar.D(i8);
                zzart zzartVar2 = new zzart(i9, str, i10, arrayList, Arrays.copyOfRange(zzeuVar.a, i7, i8));
                String str22 = str;
                if (h != 6) {
                }
                h = i9;
                B -= h3 + 5;
                if (sparseBooleanArray.get(h2)) {
                }
                i4 = i;
                zzetVar = zzetVar22;
                sparseArray3 = sparseArray52;
                i3 = 0;
                i5 = 13;
                i6 = 4;
            }
            SparseArray sparseArray6 = sparseArray3;
            int size = sparseIntArray.size();
            int i11 = 0;
            while (i11 < size) {
                int keyAt = sparseIntArray.keyAt(i11);
                int valueAt = sparseIntArray.valueAt(i11);
                sparseBooleanArray.put(keyAt, true);
                zzarrVar.i.put(valueAt, true);
                zzarw zzarwVar = (zzarw) sparseArray4.valueAt(i11);
                if (zzarwVar != null) {
                    zzarwVar.a(zzfjVar, zzarrVar.l, new zzarv(J, keyAt, 8192));
                    sparseArray = sparseArray6;
                    sparseArray.put(valueAt, zzarwVar);
                } else {
                    sparseArray = sparseArray6;
                }
                i11++;
                sparseArray6 = sparseArray;
            }
            sparseArray6.remove(this.b);
            zzarrVar.l.zzv();
            zzarrVar.m = true;
        }
    }

    public s6d k(String str, boolean z) {
        Object obj;
        g7d g7dVar;
        str.getClass();
        Iterator it = e5h.b(new r4((zwh) this.e, 3)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            s6d s6dVar = (s6d) obj;
            if (c.o((String) s6dVar.b.g, str, false) || s6dVar.b.a(str) != null) {
                break;
            }
        }
        s6d s6dVar2 = (s6d) obj;
        if (s6dVar2 != null) {
            return s6dVar2;
        }
        if (!z || (g7dVar = ((g7d) this.d).c) == null) {
            return null;
        }
        gtj gtjVar = g7dVar.g;
        gtjVar.getClass();
        if (StringsKt.R(str)) {
            return null;
        }
        return gtjVar.k(str, true);
    }

    public s6d l(int i, s6d s6dVar, s6d s6dVar2, boolean z) {
        g7d g7dVar = (g7d) this.d;
        zwh zwhVar = (zwh) this.e;
        s6d s6dVar3 = (s6d) gz8.C(zwhVar, i);
        if (s6dVar2 != null) {
            if (Intrinsics.c(s6dVar3, s6dVar2) && Intrinsics.c(s6dVar3.c, s6dVar2.c)) {
                return s6dVar3;
            }
            s6dVar3 = null;
        } else if (s6dVar3 != null) {
            return s6dVar3;
        }
        if (z) {
            Iterator it = e5h.b(new r4(zwhVar, 3)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    s6dVar3 = null;
                    break;
                }
                s6d s6dVar4 = (s6d) it.next();
                s6dVar3 = (!(s6dVar4 instanceof g7d) || s6dVar4.equals(s6dVar)) ? null : ((g7d) s6dVar4).g.l(i, g7dVar, s6dVar2, true);
                if (s6dVar3 != null) {
                    break;
                }
            }
        }
        if (s6dVar3 != null) {
            return s6dVar3;
        }
        g7d g7dVar2 = g7dVar.c;
        if (g7dVar2 == null || g7dVar2.equals(s6dVar)) {
            return null;
        }
        g7d g7dVar3 = g7dVar.c;
        g7dVar3.getClass();
        return g7dVar3.g.l(i, g7dVar, s6dVar2, z);
    }

    public int m(String str) {
        switch (this.a) {
            case 3:
                int glGetAttribLocation = GLES20.glGetAttribLocation(this.b, str);
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                ok3.g();
                return glGetAttribLocation;
            default:
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.b, str);
                GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                xw3.x();
                return glGetAttribLocation2;
        }
    }

    public int n() {
        Paint.Cap strokeCap = ((Paint) this.d).getStrokeCap();
        int i = strokeCap == null ? -1 : w10.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int o() {
        Paint.Join strokeJoin = ((Paint) this.d).getStrokeJoin();
        int i = strokeJoin == null ? -1 : w10.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public boolean p(gtj gtjVar, int i) {
        return gtjVar != null && lik.a(((ryf[]) this.d)[i], ((ryf[]) gtjVar.d)[i]) && lik.a(((mh6[]) this.e)[i], ((mh6[]) gtjVar.e)[i]);
    }

    public boolean q(gtj gtjVar, int i) {
        return Objects.equals(((syf[]) this.d)[i], ((syf[]) gtjVar.d)[i]) && Objects.equals(((nh6[]) this.e)[i], ((nh6[]) gtjVar.e)[i]);
    }

    public boolean r(int i) {
        switch (this.a) {
            case 0:
                if (((ryf[]) this.d)[i] != null) {
                }
                break;
            default:
                if (((syf[]) this.d)[i] != null) {
                }
                break;
        }
        return false;
    }

    public r6d s(r6d r6dVar, x6k x6kVar, boolean z, s6d s6dVar) {
        r6d r6dVar2;
        g7d g7dVar = (g7d) this.d;
        s6dVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = g7dVar.iterator();
        while (true) {
            i7d i7dVar = (i7d) it;
            if (!i7dVar.hasNext()) {
                break;
            }
            s6d s6dVar2 = (s6d) i7dVar.next();
            r6dVar2 = Intrinsics.c(s6dVar2, s6dVar) ? null : s6dVar2.n(x6kVar);
            if (r6dVar2 != null) {
                arrayList.add(r6dVar2);
            }
        }
        r6d r6dVar3 = (r6d) CollectionsKt.k0(arrayList);
        g7d g7dVar2 = g7dVar.c;
        if (g7dVar2 != null && z && !g7dVar2.equals(s6dVar)) {
            r6dVar2 = g7dVar2.r(x6kVar, g7dVar);
        }
        return (r6d) CollectionsKt.k0(ph0.x(new r6d[]{r6dVar, r6dVar3, r6dVar2}));
    }

    public void t(float f) {
        ((Paint) this.d).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void u(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        Paint paint = (Paint) this.d;
        if (Build.VERSION.SDK_INT >= 29) {
            zrj.e(i, paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(eq3.Z(i)));
        }
    }

    public void v(long j) {
        ((Paint) this.d).setColor(hkg.s0(j));
    }

    public void w(ay1 ay1Var) {
        this.f = ay1Var;
        ((Paint) this.d).setColorFilter(ay1Var != null ? ay1Var.a : null);
    }

    public void x(int i) {
        ((Paint) this.d).setFilterBitmap(!(i == 0));
    }

    public void y(c20 c20Var) {
        ((Paint) this.d).setPathEffect(c20Var != null ? c20Var.a : null);
        this.c = c20Var;
    }

    public void z(Shader shader) {
        this.e = shader;
        ((Paint) this.d).setShader(shader);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public void a(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
    }

    @Override // defpackage.ozg
    public void c(djj djjVar, pl6 pl6Var, c2k c2kVar) {
    }

    @Override // defpackage.nzg
    public void j(cjj cjjVar, ol6 ol6Var, c2k c2kVar) {
    }

    public gtj(zzarr zzarrVar, int i) {
        this.a = 10;
        this.c = zzarrVar;
        this.d = new zzet(new byte[5], 5);
        this.e = new SparseArray();
        this.f = new SparseIntArray();
        this.b = i;
    }

    public gtj(g7d g7dVar) {
        this.a = 5;
        this.d = g7dVar;
        this.e = new zwh(0);
    }

    public gtj(Paint paint) {
        this.a = 2;
        this.d = paint;
        this.b = 3;
    }

    public gtj(ryf[] ryfVarArr, mh6[] mh6VarArr, tuj tujVar, jub jubVar) {
        this.a = 0;
        this.d = ryfVarArr;
        this.e = (mh6[]) mh6VarArr.clone();
        this.f = tujVar;
        this.c = jubVar;
        this.b = ryfVarArr.length;
    }

    public /* synthetic */ gtj(Object obj, Object obj2, byte[] bArr, Object[] objArr, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = bArr;
        this.c = objArr;
        this.b = i;
    }

    public gtj(syf[] syfVarArr, nh6[] nh6VarArr, uuj uujVar, Object obj) {
        this.a = 1;
        z1a.s(syfVarArr.length == nh6VarArr.length);
        this.d = syfVarArr;
        this.e = (nh6[]) nh6VarArr.clone();
        this.f = uujVar;
        this.c = obj;
        this.b = syfVarArr.length;
    }

    public gtj(y1k y1kVar, int i) {
        this.a = 6;
        this.c = y1kVar;
        this.d = new nm2(new byte[5], 5, 2, (byte) 0);
        this.e = new SparseArray();
        this.f = new SparseIntArray();
        this.b = i;
    }

    public gtj(z1k z1kVar, int i) {
        this.a = 7;
        this.c = z1kVar;
        this.d = new nm2(new byte[5], 5, 3, (byte) 0);
        this.e = new SparseArray();
        this.f = new SparseIntArray();
        this.b = i;
    }
}
