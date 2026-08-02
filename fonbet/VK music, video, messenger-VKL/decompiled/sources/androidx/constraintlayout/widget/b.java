package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonToken;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.guo;
import xsna.n2l;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public final class b {
    public static final int[] g = {0, 4, 8};
    public static final SparseIntArray h;
    public static final SparseIntArray i;
    public String a;
    public String b = "";
    public int c = 0;
    public final HashMap<String, ConstraintAttribute> d = new HashMap<>();
    public boolean e = true;
    public final HashMap<Integer, a> f = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    public static class a {
        public int a;
        public String b;
        public final d c;
        public final c d;
        public final C0021b e;
        public final e f;
        public HashMap<String, ConstraintAttribute> g;
        public C0020a h;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes11.dex */
        public static class C0020a {
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public final void a(float f, int i) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public final void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public final void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            public final void e(a aVar) {
                for (int i = 0; i < this.c; i++) {
                    int i2 = this.a[i];
                    int i3 = this.b[i];
                    int[] iArr = b.g;
                    if (i2 == 6) {
                        aVar.e.D = i3;
                    } else if (i2 == 7) {
                        aVar.e.E = i3;
                    } else if (i2 == 8) {
                        aVar.e.K = i3;
                    } else if (i2 == 27) {
                        aVar.e.F = i3;
                    } else if (i2 == 28) {
                        aVar.e.H = i3;
                    } else if (i2 == 41) {
                        aVar.e.W = i3;
                    } else if (i2 == 42) {
                        aVar.e.X = i3;
                    } else if (i2 == 61) {
                        aVar.e.A = i3;
                    } else if (i2 == 62) {
                        aVar.e.B = i3;
                    } else if (i2 == 72) {
                        aVar.e.g0 = i3;
                    } else if (i2 == 73) {
                        aVar.e.h0 = i3;
                    } else if (i2 == 88) {
                        aVar.d.l = i3;
                    } else if (i2 == 89) {
                        aVar.d.m = i3;
                    } else if (i2 == 2) {
                        aVar.e.J = i3;
                    } else if (i2 == 31) {
                        aVar.e.L = i3;
                    } else if (i2 == 34) {
                        aVar.e.I = i3;
                    } else if (i2 == 38) {
                        aVar.a = i3;
                    } else if (i2 == 64) {
                        aVar.d.b = i3;
                    } else if (i2 == 66) {
                        aVar.d.f = i3;
                    } else if (i2 == 76) {
                        aVar.d.e = i3;
                    } else if (i2 == 78) {
                        aVar.c.c = i3;
                    } else if (i2 == 97) {
                        aVar.e.p0 = i3;
                    } else if (i2 == 93) {
                        aVar.e.M = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                aVar.e.Q = i3;
                                break;
                            case 12:
                                aVar.e.R = i3;
                                break;
                            case 13:
                                aVar.e.N = i3;
                                break;
                            case 14:
                                aVar.e.P = i3;
                                break;
                            case 15:
                                aVar.e.S = i3;
                                break;
                            case 16:
                                aVar.e.O = i3;
                                break;
                            case 17:
                                aVar.e.e = i3;
                                break;
                            case 18:
                                aVar.e.f = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        aVar.e.d = i3;
                                        break;
                                    case 22:
                                        aVar.c.b = i3;
                                        break;
                                    case 23:
                                        aVar.e.c = i3;
                                        break;
                                    case 24:
                                        aVar.e.G = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                aVar.e.Y = i3;
                                                break;
                                            case 55:
                                                aVar.e.Z = i3;
                                                break;
                                            case 56:
                                                aVar.e.a0 = i3;
                                                break;
                                            case 57:
                                                aVar.e.b0 = i3;
                                                break;
                                            case 58:
                                                aVar.e.c0 = i3;
                                                break;
                                            case 59:
                                                aVar.e.d0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        aVar.d.c = i3;
                                                        break;
                                                    case 83:
                                                        aVar.f.i = i3;
                                                        break;
                                                    case 84:
                                                        aVar.d.j = i3;
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        aVar.e.T = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f; i4++) {
                    int i5 = this.d[i4];
                    float f = this.e[i4];
                    int[] iArr2 = b.g;
                    if (i5 == 19) {
                        aVar.e.g = f;
                    } else if (i5 == 20) {
                        aVar.e.x = f;
                    } else if (i5 == 37) {
                        aVar.e.y = f;
                    } else if (i5 == 60) {
                        aVar.f.b = f;
                    } else if (i5 == 63) {
                        aVar.e.C = f;
                    } else if (i5 == 79) {
                        aVar.d.g = f;
                    } else if (i5 == 85) {
                        aVar.d.i = f;
                    } else if (i5 == 39) {
                        aVar.e.V = f;
                    } else if (i5 != 40) {
                        switch (i5) {
                            case 43:
                                aVar.c.d = f;
                                break;
                            case 44:
                                e eVar = aVar.f;
                                eVar.n = f;
                                eVar.m = true;
                                break;
                            case 45:
                                aVar.f.c = f;
                                break;
                            case 46:
                                aVar.f.d = f;
                                break;
                            case 47:
                                aVar.f.e = f;
                                break;
                            case 48:
                                aVar.f.f = f;
                                break;
                            case 49:
                                aVar.f.g = f;
                                break;
                            case 50:
                                aVar.f.h = f;
                                break;
                            case 51:
                                aVar.f.j = f;
                                break;
                            case 52:
                                aVar.f.k = f;
                                break;
                            case 53:
                                aVar.f.l = f;
                                break;
                            default:
                                switch (i5) {
                                    case 67:
                                        aVar.d.h = f;
                                        break;
                                    case 68:
                                        aVar.c.e = f;
                                        break;
                                    case 69:
                                        aVar.e.e0 = f;
                                        break;
                                    case 70:
                                        aVar.e.f0 = f;
                                        break;
                                }
                        }
                    } else {
                        aVar.e.U = f;
                    }
                }
                for (int i6 = 0; i6 < this.i; i6++) {
                    int i7 = this.g[i6];
                    String str = this.h[i6];
                    int[] iArr3 = b.g;
                    if (i7 == 5) {
                        aVar.e.z = str;
                    } else if (i7 == 65) {
                        aVar.d.d = str;
                    } else if (i7 == 74) {
                        C0021b c0021b = aVar.e;
                        c0021b.k0 = str;
                        c0021b.j0 = null;
                    } else if (i7 == 77) {
                        aVar.e.l0 = str;
                    } else if (i7 == 90) {
                        aVar.d.k = str;
                    }
                }
                for (int i8 = 0; i8 < this.l; i8++) {
                    int i9 = this.j[i8];
                    boolean z = this.k[i8];
                    int[] iArr4 = b.g;
                    if (i9 == 44) {
                        aVar.f.m = z;
                    } else if (i9 == 75) {
                        aVar.e.o0 = z;
                    } else if (i9 == 80) {
                        aVar.e.m0 = z;
                    } else if (i9 == 81) {
                        aVar.e.n0 = z;
                    }
                }
            }
        }

        public a() {
            d dVar = new d();
            dVar.a = false;
            dVar.b = 0;
            dVar.c = 0;
            dVar.d = 1.0f;
            dVar.e = Float.NaN;
            this.c = dVar;
            c cVar = new c();
            cVar.a = false;
            cVar.b = -1;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = -1;
            cVar.f = 0;
            cVar.g = Float.NaN;
            cVar.h = Float.NaN;
            cVar.i = Float.NaN;
            cVar.j = -1;
            cVar.k = null;
            cVar.l = -3;
            cVar.m = -1;
            this.d = cVar;
            this.e = new C0021b();
            e eVar = new e();
            eVar.a = false;
            eVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.e = 1.0f;
            eVar.f = 1.0f;
            eVar.g = Float.NaN;
            eVar.h = Float.NaN;
            eVar.i = -1;
            eVar.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.m = false;
            eVar.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = eVar;
            this.g = new HashMap<>();
        }

        public final void a(ConstraintLayout.b bVar) {
            C0021b c0021b = this.e;
            bVar.e = c0021b.i;
            bVar.f = c0021b.j;
            bVar.g = c0021b.k;
            bVar.h = c0021b.l;
            bVar.i = c0021b.m;
            bVar.j = c0021b.n;
            bVar.k = c0021b.o;
            bVar.l = c0021b.p;
            bVar.m = c0021b.q;
            bVar.n = c0021b.r;
            bVar.o = c0021b.s;
            bVar.s = c0021b.t;
            bVar.t = c0021b.u;
            bVar.u = c0021b.v;
            bVar.v = c0021b.w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = c0021b.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = c0021b.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = c0021b.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = c0021b.J;
            bVar.A = c0021b.S;
            bVar.B = c0021b.R;
            bVar.x = c0021b.O;
            bVar.z = c0021b.Q;
            bVar.E = c0021b.x;
            bVar.F = c0021b.y;
            bVar.p = c0021b.A;
            bVar.q = c0021b.B;
            bVar.r = c0021b.C;
            bVar.G = c0021b.z;
            bVar.T = c0021b.D;
            bVar.U = c0021b.E;
            bVar.I = c0021b.U;
            bVar.H = c0021b.V;
            bVar.K = c0021b.X;
            bVar.J = c0021b.W;
            bVar.W = c0021b.m0;
            bVar.X = c0021b.n0;
            bVar.L = c0021b.Y;
            bVar.M = c0021b.Z;
            bVar.P = c0021b.a0;
            bVar.Q = c0021b.b0;
            bVar.N = c0021b.c0;
            bVar.O = c0021b.d0;
            bVar.R = c0021b.e0;
            bVar.S = c0021b.f0;
            bVar.V = c0021b.F;
            bVar.c = c0021b.g;
            bVar.a = c0021b.e;
            bVar.b = c0021b.f;
            ((ViewGroup.MarginLayoutParams) bVar).width = c0021b.c;
            ((ViewGroup.MarginLayoutParams) bVar).height = c0021b.d;
            String str = c0021b.l0;
            if (str != null) {
                bVar.Y = str;
            }
            bVar.Z = c0021b.p0;
            bVar.setMarginStart(c0021b.L);
            bVar.setMarginEnd(c0021b.K);
            bVar.a();
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            d dVar = this.c;
            boolean z = dVar.a;
            d dVar2 = aVar.c;
            dVar2.a = z;
            dVar2.b = dVar.b;
            dVar2.d = dVar.d;
            dVar2.e = dVar.e;
            dVar2.c = dVar.c;
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void c(int i, ConstraintLayout.b bVar) {
            this.a = i;
            int i2 = bVar.e;
            C0021b c0021b = this.e;
            c0021b.i = i2;
            c0021b.j = bVar.f;
            c0021b.k = bVar.g;
            c0021b.l = bVar.h;
            c0021b.m = bVar.i;
            c0021b.n = bVar.j;
            c0021b.o = bVar.k;
            c0021b.p = bVar.l;
            c0021b.q = bVar.m;
            c0021b.r = bVar.n;
            c0021b.s = bVar.o;
            c0021b.t = bVar.s;
            c0021b.u = bVar.t;
            c0021b.v = bVar.u;
            c0021b.w = bVar.v;
            c0021b.x = bVar.E;
            c0021b.y = bVar.F;
            c0021b.z = bVar.G;
            c0021b.A = bVar.p;
            c0021b.B = bVar.q;
            c0021b.C = bVar.r;
            c0021b.D = bVar.T;
            c0021b.E = bVar.U;
            c0021b.F = bVar.V;
            c0021b.g = bVar.c;
            c0021b.e = bVar.a;
            c0021b.f = bVar.b;
            c0021b.c = ((ViewGroup.MarginLayoutParams) bVar).width;
            c0021b.d = ((ViewGroup.MarginLayoutParams) bVar).height;
            c0021b.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            c0021b.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            c0021b.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            c0021b.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            c0021b.M = bVar.D;
            c0021b.U = bVar.I;
            c0021b.V = bVar.H;
            c0021b.X = bVar.K;
            c0021b.W = bVar.J;
            c0021b.m0 = bVar.W;
            c0021b.n0 = bVar.X;
            c0021b.Y = bVar.L;
            c0021b.Z = bVar.M;
            c0021b.a0 = bVar.P;
            c0021b.b0 = bVar.Q;
            c0021b.c0 = bVar.N;
            c0021b.d0 = bVar.O;
            c0021b.e0 = bVar.R;
            c0021b.f0 = bVar.S;
            c0021b.l0 = bVar.Y;
            c0021b.O = bVar.x;
            c0021b.Q = bVar.z;
            c0021b.N = bVar.w;
            c0021b.P = bVar.y;
            c0021b.S = bVar.A;
            c0021b.R = bVar.B;
            c0021b.T = bVar.C;
            c0021b.p0 = bVar.Z;
            c0021b.K = bVar.getMarginEnd();
            c0021b.L = bVar.getMarginStart();
        }

        public final void d(int i, c.a aVar) {
            c(i, aVar);
            this.c.d = aVar.r0;
            float f = aVar.u0;
            e eVar = this.f;
            eVar.b = f;
            eVar.c = aVar.v0;
            eVar.d = aVar.w0;
            eVar.e = aVar.x0;
            eVar.f = aVar.y0;
            eVar.g = aVar.z0;
            eVar.h = aVar.A0;
            eVar.j = aVar.B0;
            eVar.k = aVar.C0;
            eVar.l = aVar.D0;
            eVar.n = aVar.t0;
            eVar.m = aVar.s0;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public static class C0021b {
        public static final SparseIntArray q0;
        public int c;
        public int d;
        public int[] j0;
        public String k0;
        public String l0;
        public boolean a = false;
        public boolean b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public boolean h = true;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;
        public int A = -1;
        public int B = 0;
        public float C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public float e0 = 1.0f;
        public float f0 = 1.0f;
        public int g0 = -1;
        public int h0 = 0;
        public int i0 = -1;
        public boolean m0 = false;
        public boolean n0 = false;
        public boolean o0 = true;
        public int p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(C0021b c0021b) {
            this.a = c0021b.a;
            this.c = c0021b.c;
            this.b = c0021b.b;
            this.d = c0021b.d;
            this.e = c0021b.e;
            this.f = c0021b.f;
            this.g = c0021b.g;
            this.h = c0021b.h;
            this.i = c0021b.i;
            this.j = c0021b.j;
            this.k = c0021b.k;
            this.l = c0021b.l;
            this.m = c0021b.m;
            this.n = c0021b.n;
            this.o = c0021b.o;
            this.p = c0021b.p;
            this.q = c0021b.q;
            this.r = c0021b.r;
            this.s = c0021b.s;
            this.t = c0021b.t;
            this.u = c0021b.u;
            this.v = c0021b.v;
            this.w = c0021b.w;
            this.x = c0021b.x;
            this.y = c0021b.y;
            this.z = c0021b.z;
            this.A = c0021b.A;
            this.B = c0021b.B;
            this.C = c0021b.C;
            this.D = c0021b.D;
            this.E = c0021b.E;
            this.F = c0021b.F;
            this.G = c0021b.G;
            this.H = c0021b.H;
            this.I = c0021b.I;
            this.J = c0021b.J;
            this.K = c0021b.K;
            this.L = c0021b.L;
            this.M = c0021b.M;
            this.N = c0021b.N;
            this.O = c0021b.O;
            this.P = c0021b.P;
            this.Q = c0021b.Q;
            this.R = c0021b.R;
            this.S = c0021b.S;
            this.T = c0021b.T;
            this.U = c0021b.U;
            this.V = c0021b.V;
            this.W = c0021b.W;
            this.X = c0021b.X;
            this.Y = c0021b.Y;
            this.Z = c0021b.Z;
            this.a0 = c0021b.a0;
            this.b0 = c0021b.b0;
            this.c0 = c0021b.c0;
            this.d0 = c0021b.d0;
            this.e0 = c0021b.e0;
            this.f0 = c0021b.f0;
            this.g0 = c0021b.g0;
            this.h0 = c0021b.h0;
            this.i0 = c0021b.i0;
            this.l0 = c0021b.l0;
            int[] iArr = c0021b.j0;
            if (iArr == null || c0021b.k0 != null) {
                this.j0 = null;
            } else {
                this.j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.k0 = c0021b.k0;
            this.m0 = c0021b.m0;
            this.n0 = c0021b.n0;
            this.o0 = c0021b.o0;
            this.p0 = c0021b.p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.m);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = q0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.q = b.y(obtainStyledAttributes, index, this.q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.p = b.y(obtainStyledAttributes, index, this.p);
                        break;
                    case 4:
                        this.o = b.y(obtainStyledAttributes, index, this.o);
                        break;
                    case 5:
                        this.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.w = b.y(obtainStyledAttributes, index, this.w);
                        break;
                    case 10:
                        this.v = b.y(obtainStyledAttributes, index, this.v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 18:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.x = obtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 21:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.i = b.y(obtainStyledAttributes, index, this.i);
                        break;
                    case 25:
                        this.j = b.y(obtainStyledAttributes, index, this.j);
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.k = b.y(obtainStyledAttributes, index, this.k);
                        break;
                    case 29:
                        this.l = b.y(obtainStyledAttributes, index, this.l);
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        this.t = b.y(obtainStyledAttributes, index, this.t);
                        break;
                    case 32:
                        this.u = b.y(obtainStyledAttributes, index, this.u);
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        this.n = b.y(obtainStyledAttributes, index, this.n);
                        break;
                    case 35:
                        this.m = b.y(obtainStyledAttributes, index, this.m);
                        break;
                    case 36:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        b.z(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.z(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.A = b.y(obtainStyledAttributes, index, this.A);
                                break;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                                        this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                        this.k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                                        this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                                        this.r = b.y(obtainStyledAttributes, index, this.r);
                                        break;
                                    case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                                        this.s = b.y(obtainStyledAttributes, index, this.s);
                                        break;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case IMAGES_IMAGE_LOADED_VALUE:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 84:
                                        this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        break;
                                    case 85:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 86 */:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 87:
                                        this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                        break;
                                    case 88:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.h = obtainStyledAttributes.getBoolean(index, this.h);
                                        break;
                                    case JsonToken.BEGIN_ARRAY /* 91 */:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        sparseIntArray.get(index);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {
        public static final SparseIntArray n;
        public boolean a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public float g;
        public float h;
        public float i;
        public int j;
        public String k;
        public int l;
        public int m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.h = cVar.h;
            this.g = cVar.g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.n);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = guo.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = b.y(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getInteger(index, this.j);
                        break;
                    case 9:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.m = resourceId;
                            if (resourceId != -1) {
                                this.l = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.k = string;
                            if (string.indexOf(DomExceptionUtils.SEPARATOR) > 0) {
                                this.m = obtainStyledAttributes.getResourceId(index, -1);
                                this.l = -2;
                                break;
                            } else {
                                this.l = -1;
                                break;
                            }
                        } else {
                            this.l = obtainStyledAttributes.getInteger(index, this.m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class d {
        public boolean a;
        public int b;
        public int c;
        public float d;
        public float e;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.t);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i2 = obtainStyledAttributes.getInt(index, this.b);
                    this.b = i2;
                    this.b = b.g[i2];
                } else if (index == 4) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {
        public static final SparseIntArray o;
        public boolean a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public float n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.w);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = b.y(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        i = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 84);
        sparseIntArray.append(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 85);
        sparseIntArray.append(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static void A(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && parseFloat2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.G = str;
    }

    public static void B(a aVar, TypedArray typedArray) {
        int i2;
        int indexCount = typedArray.getIndexCount();
        a.C0020a c0020a = new a.C0020a();
        aVar.h = c0020a;
        c cVar = aVar.d;
        int i3 = 0;
        cVar.a = false;
        C0021b c0021b = aVar.e;
        c0021b.b = false;
        d dVar = aVar.c;
        dVar.a = false;
        e eVar = aVar.f;
        eVar.a = false;
        int i4 = 0;
        while (i4 < indexCount) {
            int index = typedArray.getIndex(i4);
            int i5 = i.get(index);
            SparseIntArray sparseIntArray = h;
            switch (i5) {
                case 2:
                    i2 = i3;
                    c0020a.b(2, typedArray.getDimensionPixelSize(index, c0021b.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                case 90:
                case JsonToken.BEGIN_ARRAY /* 91 */:
                case 92:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i2 = i3;
                    break;
                case 5:
                    i2 = i3;
                    c0020a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    i2 = i3;
                    c0020a.b(6, typedArray.getDimensionPixelOffset(index, c0021b.D));
                    break;
                case 7:
                    i2 = i3;
                    c0020a.b(7, typedArray.getDimensionPixelOffset(index, c0021b.E));
                    break;
                case 8:
                    i2 = i3;
                    c0020a.b(8, typedArray.getDimensionPixelSize(index, c0021b.K));
                    break;
                case 11:
                    i2 = i3;
                    c0020a.b(11, typedArray.getDimensionPixelSize(index, c0021b.Q));
                    break;
                case 12:
                    i2 = i3;
                    c0020a.b(12, typedArray.getDimensionPixelSize(index, c0021b.R));
                    break;
                case 13:
                    i2 = i3;
                    c0020a.b(13, typedArray.getDimensionPixelSize(index, c0021b.N));
                    break;
                case 14:
                    i2 = i3;
                    c0020a.b(14, typedArray.getDimensionPixelSize(index, c0021b.P));
                    break;
                case 15:
                    i2 = i3;
                    c0020a.b(15, typedArray.getDimensionPixelSize(index, c0021b.S));
                    break;
                case 16:
                    i2 = i3;
                    c0020a.b(16, typedArray.getDimensionPixelSize(index, c0021b.O));
                    break;
                case 17:
                    i2 = i3;
                    c0020a.b(17, typedArray.getDimensionPixelOffset(index, c0021b.e));
                    break;
                case 18:
                    i2 = i3;
                    c0020a.b(18, typedArray.getDimensionPixelOffset(index, c0021b.f));
                    break;
                case 19:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, c0021b.g), 19);
                    break;
                case 20:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, c0021b.x), 20);
                    break;
                case 21:
                    i2 = i3;
                    c0020a.b(21, typedArray.getLayoutDimension(index, c0021b.d));
                    break;
                case 22:
                    i2 = i3;
                    c0020a.b(22, g[typedArray.getInt(index, dVar.b)]);
                    break;
                case 23:
                    i2 = i3;
                    c0020a.b(23, typedArray.getLayoutDimension(index, c0021b.c));
                    break;
                case 24:
                    i2 = i3;
                    c0020a.b(24, typedArray.getDimensionPixelSize(index, c0021b.G));
                    break;
                case 27:
                    i2 = i3;
                    c0020a.b(27, typedArray.getInt(index, c0021b.F));
                    break;
                case 28:
                    i2 = i3;
                    c0020a.b(28, typedArray.getDimensionPixelSize(index, c0021b.H));
                    break;
                case 31:
                    i2 = i3;
                    c0020a.b(31, typedArray.getDimensionPixelSize(index, c0021b.L));
                    break;
                case 34:
                    i2 = i3;
                    c0020a.b(34, typedArray.getDimensionPixelSize(index, c0021b.I));
                    break;
                case 37:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, c0021b.y), 37);
                    break;
                case 38:
                    i2 = i3;
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0020a.b(38, resourceId);
                    break;
                case 39:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, c0021b.V), 39);
                    break;
                case 40:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, c0021b.U), 40);
                    break;
                case 41:
                    i2 = i3;
                    c0020a.b(41, typedArray.getInt(index, c0021b.W));
                    break;
                case 42:
                    i2 = i3;
                    c0020a.b(42, typedArray.getInt(index, c0021b.X));
                    break;
                case 43:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, dVar.d), 43);
                    break;
                case 44:
                    i2 = i3;
                    c0020a.d(44, true);
                    c0020a.a(typedArray.getDimension(index, eVar.n), 44);
                    break;
                case 45:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, eVar.c), 45);
                    break;
                case 46:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, eVar.d), 46);
                    break;
                case 47:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, eVar.e), 47);
                    break;
                case 48:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, eVar.f), 48);
                    break;
                case 49:
                    i2 = i3;
                    c0020a.a(typedArray.getDimension(index, eVar.g), 49);
                    break;
                case 50:
                    i2 = i3;
                    c0020a.a(typedArray.getDimension(index, eVar.h), 50);
                    break;
                case 51:
                    i2 = i3;
                    c0020a.a(typedArray.getDimension(index, eVar.j), 51);
                    break;
                case 52:
                    i2 = i3;
                    c0020a.a(typedArray.getDimension(index, eVar.k), 52);
                    break;
                case 53:
                    i2 = i3;
                    c0020a.a(typedArray.getDimension(index, eVar.l), 53);
                    break;
                case 54:
                    i2 = i3;
                    c0020a.b(54, typedArray.getInt(index, c0021b.Y));
                    break;
                case 55:
                    i2 = i3;
                    c0020a.b(55, typedArray.getInt(index, c0021b.Z));
                    break;
                case 56:
                    i2 = i3;
                    c0020a.b(56, typedArray.getDimensionPixelSize(index, c0021b.a0));
                    break;
                case 57:
                    i2 = i3;
                    c0020a.b(57, typedArray.getDimensionPixelSize(index, c0021b.b0));
                    break;
                case 58:
                    i2 = i3;
                    c0020a.b(58, typedArray.getDimensionPixelSize(index, c0021b.c0));
                    break;
                case 59:
                    i2 = i3;
                    c0020a.b(59, typedArray.getDimensionPixelSize(index, c0021b.d0));
                    break;
                case 60:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, eVar.b), 60);
                    break;
                case 62:
                    i2 = i3;
                    c0020a.b(62, typedArray.getDimensionPixelSize(index, c0021b.B));
                    break;
                case 63:
                    i2 = i3;
                    c0020a.a(typedArray.getFloat(index, c0021b.C), 63);
                    break;
                case 64:
                    i2 = i3;
                    c0020a.b(64, y(typedArray, index, cVar.b));
                    break;
                case 65:
                    i2 = i3;
                    if (typedArray.peekValue(index).type != 3) {
                        c0020a.c(65, guo.c[typedArray.getInteger(index, i2)]);
                        break;
                    } else {
                        c0020a.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    i2 = 0;
                    c0020a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0020a.a(typedArray.getFloat(index, cVar.h), 67);
                    i2 = 0;
                    break;
                case 68:
                    c0020a.a(typedArray.getFloat(index, dVar.e), 68);
                    i2 = 0;
                    break;
                case 69:
                    c0020a.a(typedArray.getFloat(index, 1.0f), 69);
                    i2 = 0;
                    break;
                case 70:
                    c0020a.a(typedArray.getFloat(index, 1.0f), 70);
                    i2 = 0;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    i2 = 0;
                    break;
                case 72:
                    c0020a.b(72, typedArray.getInt(index, c0021b.g0));
                    i2 = 0;
                    break;
                case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                    c0020a.b(73, typedArray.getDimensionPixelSize(index, c0021b.h0));
                    i2 = 0;
                    break;
                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                    c0020a.c(74, typedArray.getString(index));
                    i2 = 0;
                    break;
                case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                    c0020a.d(75, typedArray.getBoolean(index, c0021b.o0));
                    i2 = 0;
                    break;
                case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                    c0020a.b(76, typedArray.getInt(index, cVar.e));
                    i2 = 0;
                    break;
                case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                    c0020a.c(77, typedArray.getString(index));
                    i2 = 0;
                    break;
                case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                    c0020a.b(78, typedArray.getInt(index, dVar.c));
                    i2 = 0;
                    break;
                case 79:
                    c0020a.a(typedArray.getFloat(index, cVar.g), 79);
                    i2 = 0;
                    break;
                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                    c0020a.d(80, typedArray.getBoolean(index, c0021b.m0));
                    i2 = 0;
                    break;
                case IMAGES_IMAGE_LOADED_VALUE:
                    c0020a.d(81, typedArray.getBoolean(index, c0021b.n0));
                    i2 = 0;
                    break;
                case 82:
                    c0020a.b(82, typedArray.getInteger(index, cVar.c));
                    i2 = 0;
                    break;
                case 83:
                    c0020a.b(83, y(typedArray, index, eVar.i));
                    i2 = 0;
                    break;
                case 84:
                    c0020a.b(84, typedArray.getInteger(index, cVar.j));
                    i2 = 0;
                    break;
                case 85:
                    c0020a.a(typedArray.getFloat(index, cVar.i), 85);
                    i2 = 0;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 86 */:
                    int i6 = typedArray.peekValue(index).type;
                    if (i6 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.m = resourceId2;
                        c0020a.b(89, resourceId2);
                        if (cVar.m != -1) {
                            cVar.l = -2;
                            c0020a.b(88, -2);
                        }
                    } else if (i6 == 3) {
                        String string = typedArray.getString(index);
                        cVar.k = string;
                        c0020a.c(90, string);
                        if (cVar.k.indexOf(DomExceptionUtils.SEPARATOR) > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.m = resourceId3;
                            c0020a.b(89, resourceId3);
                            cVar.l = -2;
                            c0020a.b(88, -2);
                        } else {
                            cVar.l = -1;
                            c0020a.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.m);
                        cVar.l = integer;
                        c0020a.b(88, integer);
                    }
                    i2 = 0;
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    i2 = i3;
                    break;
                case JsonToken.END_ARRAY /* 93 */:
                    c0020a.b(93, typedArray.getDimensionPixelSize(index, c0021b.M));
                    i2 = i3;
                    break;
                case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                    c0020a.b(94, typedArray.getDimensionPixelSize(index, c0021b.T));
                    i2 = i3;
                    break;
                case 95:
                    z(c0020a, typedArray, index, i3);
                    i2 = i3;
                    break;
                case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                    z(c0020a, typedArray, index, 1);
                    i2 = i3;
                    break;
                case 97:
                    c0020a.b(97, typedArray.getInt(index, c0021b.p0));
                    i2 = i3;
                    break;
                case JsonToken.BOOLEAN /* 98 */:
                    if (MotionLayout.H0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                    }
                    i2 = i3;
                    break;
                case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                    c0020a.d(99, typedArray.getBoolean(index, c0021b.h));
                    i2 = i3;
                    break;
            }
            i4++;
            i3 = i2;
        }
    }

    public static String K(int i2) {
        switch (i2) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return TtmlNode.END;
            default:
                return StringUtils.UNDEFINED;
        }
    }

    public static a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R$styleable.e);
        B(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] q(Barrier barrier, String str) {
        int i2;
        String[] split = str.split(StringUtils.COMMA);
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            Integer num = null;
            try {
                i2 = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (trim != null) {
                    HashMap<String, Integer> hashMap = constraintLayout.n;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        num = constraintLayout.n.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    i2 = num.intValue();
                }
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public static a t(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? R$styleable.e : R$styleable.a);
        if (z) {
            B(aVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                C0021b c0021b = aVar.e;
                if (i2 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i2);
                    d dVar = aVar.c;
                    e eVar = aVar.f;
                    c cVar = aVar.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.a = true;
                        c0021b.b = true;
                        dVar.a = true;
                        eVar.a = true;
                    }
                    SparseIntArray sparseIntArray = h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            c0021b.q = y(obtainStyledAttributes, index, c0021b.q);
                            break;
                        case 2:
                            c0021b.J = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.J);
                            break;
                        case 3:
                            c0021b.p = y(obtainStyledAttributes, index, c0021b.p);
                            break;
                        case 4:
                            c0021b.o = y(obtainStyledAttributes, index, c0021b.o);
                            break;
                        case 5:
                            c0021b.z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            c0021b.D = obtainStyledAttributes.getDimensionPixelOffset(index, c0021b.D);
                            break;
                        case 7:
                            c0021b.E = obtainStyledAttributes.getDimensionPixelOffset(index, c0021b.E);
                            break;
                        case 8:
                            c0021b.K = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.K);
                            break;
                        case 9:
                            c0021b.w = y(obtainStyledAttributes, index, c0021b.w);
                            break;
                        case 10:
                            c0021b.v = y(obtainStyledAttributes, index, c0021b.v);
                            break;
                        case 11:
                            c0021b.Q = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.Q);
                            break;
                        case 12:
                            c0021b.R = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.R);
                            break;
                        case 13:
                            c0021b.N = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.N);
                            break;
                        case 14:
                            c0021b.P = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.P);
                            break;
                        case 15:
                            c0021b.S = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.S);
                            break;
                        case 16:
                            c0021b.O = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.O);
                            break;
                        case 17:
                            c0021b.e = obtainStyledAttributes.getDimensionPixelOffset(index, c0021b.e);
                            break;
                        case 18:
                            c0021b.f = obtainStyledAttributes.getDimensionPixelOffset(index, c0021b.f);
                            break;
                        case 19:
                            c0021b.g = obtainStyledAttributes.getFloat(index, c0021b.g);
                            break;
                        case 20:
                            c0021b.x = obtainStyledAttributes.getFloat(index, c0021b.x);
                            break;
                        case 21:
                            c0021b.d = obtainStyledAttributes.getLayoutDimension(index, c0021b.d);
                            break;
                        case 22:
                            int i3 = obtainStyledAttributes.getInt(index, dVar.b);
                            dVar.b = i3;
                            dVar.b = g[i3];
                            break;
                        case 23:
                            c0021b.c = obtainStyledAttributes.getLayoutDimension(index, c0021b.c);
                            break;
                        case 24:
                            c0021b.G = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.G);
                            break;
                        case 25:
                            c0021b.i = y(obtainStyledAttributes, index, c0021b.i);
                            break;
                        case 26:
                            c0021b.j = y(obtainStyledAttributes, index, c0021b.j);
                            break;
                        case 27:
                            c0021b.F = obtainStyledAttributes.getInt(index, c0021b.F);
                            break;
                        case 28:
                            c0021b.H = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.H);
                            break;
                        case 29:
                            c0021b.k = y(obtainStyledAttributes, index, c0021b.k);
                            break;
                        case 30:
                            c0021b.l = y(obtainStyledAttributes, index, c0021b.l);
                            break;
                        case 31:
                            c0021b.L = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.L);
                            break;
                        case 32:
                            c0021b.t = y(obtainStyledAttributes, index, c0021b.t);
                            break;
                        case 33:
                            c0021b.u = y(obtainStyledAttributes, index, c0021b.u);
                            break;
                        case 34:
                            c0021b.I = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.I);
                            break;
                        case 35:
                            c0021b.n = y(obtainStyledAttributes, index, c0021b.n);
                            break;
                        case 36:
                            c0021b.m = y(obtainStyledAttributes, index, c0021b.m);
                            break;
                        case 37:
                            c0021b.y = obtainStyledAttributes.getFloat(index, c0021b.y);
                            break;
                        case 38:
                            aVar.a = obtainStyledAttributes.getResourceId(index, aVar.a);
                            break;
                        case 39:
                            c0021b.V = obtainStyledAttributes.getFloat(index, c0021b.V);
                            break;
                        case 40:
                            c0021b.U = obtainStyledAttributes.getFloat(index, c0021b.U);
                            break;
                        case 41:
                            c0021b.W = obtainStyledAttributes.getInt(index, c0021b.W);
                            break;
                        case 42:
                            c0021b.X = obtainStyledAttributes.getInt(index, c0021b.X);
                            break;
                        case 43:
                            dVar.d = obtainStyledAttributes.getFloat(index, dVar.d);
                            break;
                        case 44:
                            eVar.m = true;
                            eVar.n = obtainStyledAttributes.getDimension(index, eVar.n);
                            break;
                        case 45:
                            eVar.c = obtainStyledAttributes.getFloat(index, eVar.c);
                            break;
                        case 46:
                            eVar.d = obtainStyledAttributes.getFloat(index, eVar.d);
                            break;
                        case 47:
                            eVar.e = obtainStyledAttributes.getFloat(index, eVar.e);
                            break;
                        case 48:
                            eVar.f = obtainStyledAttributes.getFloat(index, eVar.f);
                            break;
                        case 49:
                            eVar.g = obtainStyledAttributes.getDimension(index, eVar.g);
                            break;
                        case 50:
                            eVar.h = obtainStyledAttributes.getDimension(index, eVar.h);
                            break;
                        case 51:
                            eVar.j = obtainStyledAttributes.getDimension(index, eVar.j);
                            break;
                        case 52:
                            eVar.k = obtainStyledAttributes.getDimension(index, eVar.k);
                            break;
                        case 53:
                            eVar.l = obtainStyledAttributes.getDimension(index, eVar.l);
                            break;
                        case 54:
                            c0021b.Y = obtainStyledAttributes.getInt(index, c0021b.Y);
                            break;
                        case 55:
                            c0021b.Z = obtainStyledAttributes.getInt(index, c0021b.Z);
                            break;
                        case 56:
                            c0021b.a0 = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.a0);
                            break;
                        case 57:
                            c0021b.b0 = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.b0);
                            break;
                        case 58:
                            c0021b.c0 = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.c0);
                            break;
                        case 59:
                            c0021b.d0 = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.d0);
                            break;
                        case 60:
                            eVar.b = obtainStyledAttributes.getFloat(index, eVar.b);
                            break;
                        case 61:
                            c0021b.A = y(obtainStyledAttributes, index, c0021b.A);
                            break;
                        case 62:
                            c0021b.B = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.B);
                            break;
                        case 63:
                            c0021b.C = obtainStyledAttributes.getFloat(index, c0021b.C);
                            break;
                        case 64:
                            cVar.b = y(obtainStyledAttributes, index, cVar.b);
                            break;
                        case 65:
                            if (obtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.d = guo.c[obtainStyledAttributes.getInteger(index, 0)];
                                break;
                            } else {
                                cVar.d = obtainStyledAttributes.getString(index);
                                break;
                            }
                        case 66:
                            cVar.f = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            cVar.h = obtainStyledAttributes.getFloat(index, cVar.h);
                            break;
                        case 68:
                            dVar.e = obtainStyledAttributes.getFloat(index, dVar.e);
                            break;
                        case 69:
                            c0021b.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            c0021b.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            c0021b.g0 = obtainStyledAttributes.getInt(index, c0021b.g0);
                            break;
                        case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                            c0021b.h0 = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.h0);
                            break;
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            c0021b.k0 = obtainStyledAttributes.getString(index);
                            break;
                        case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                            c0021b.o0 = obtainStyledAttributes.getBoolean(index, c0021b.o0);
                            break;
                        case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                            cVar.e = obtainStyledAttributes.getInt(index, cVar.e);
                            break;
                        case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                            c0021b.l0 = obtainStyledAttributes.getString(index);
                            break;
                        case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                            dVar.c = obtainStyledAttributes.getInt(index, dVar.c);
                            break;
                        case 79:
                            cVar.g = obtainStyledAttributes.getFloat(index, cVar.g);
                            break;
                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                            c0021b.m0 = obtainStyledAttributes.getBoolean(index, c0021b.m0);
                            break;
                        case IMAGES_IMAGE_LOADED_VALUE:
                            c0021b.n0 = obtainStyledAttributes.getBoolean(index, c0021b.n0);
                            break;
                        case 82:
                            cVar.c = obtainStyledAttributes.getInteger(index, cVar.c);
                            break;
                        case 83:
                            eVar.i = y(obtainStyledAttributes, index, eVar.i);
                            break;
                        case 84:
                            cVar.j = obtainStyledAttributes.getInteger(index, cVar.j);
                            break;
                        case 85:
                            cVar.i = obtainStyledAttributes.getFloat(index, cVar.i);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 86 */:
                            int i4 = obtainStyledAttributes.peekValue(index).type;
                            if (i4 != 1) {
                                if (i4 != 3) {
                                    cVar.l = obtainStyledAttributes.getInteger(index, cVar.m);
                                    break;
                                } else {
                                    String string = obtainStyledAttributes.getString(index);
                                    cVar.k = string;
                                    if (string.indexOf(DomExceptionUtils.SEPARATOR) <= 0) {
                                        cVar.l = -1;
                                        break;
                                    } else {
                                        cVar.m = obtainStyledAttributes.getResourceId(index, -1);
                                        cVar.l = -2;
                                        break;
                                    }
                                }
                            } else {
                                int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                cVar.m = resourceId;
                                if (resourceId == -1) {
                                    break;
                                } else {
                                    cVar.l = -2;
                                    break;
                                }
                            }
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 88:
                        case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case JsonToken.BEGIN_ARRAY /* 91 */:
                            c0021b.r = y(obtainStyledAttributes, index, c0021b.r);
                            break;
                        case 92:
                            c0021b.s = y(obtainStyledAttributes, index, c0021b.s);
                            break;
                        case JsonToken.END_ARRAY /* 93 */:
                            c0021b.M = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.M);
                            break;
                        case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                            c0021b.T = obtainStyledAttributes.getDimensionPixelSize(index, c0021b.T);
                            break;
                        case 95:
                            z(c0021b, obtainStyledAttributes, index, 0);
                            break;
                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                            z(c0021b, obtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            c0021b.p0 = obtainStyledAttributes.getInt(index, c0021b.p0);
                            break;
                    }
                    i2++;
                } else if (c0021b.k0 != null) {
                    c0021b.j0 = null;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int y(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void z(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i2).type;
        boolean z = true;
        int i5 = 0;
        if (i4 == 3) {
            String string = typedArray.getString(i2);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                        }
                        A(bVar, trim2);
                        return;
                    }
                    if (obj instanceof C0021b) {
                        ((C0021b) obj).z = trim2;
                        return;
                    } else {
                        if (obj instanceof a.C0020a) {
                            ((a.C0020a) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                            if (i3 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                                bVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                                bVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof C0021b) {
                            C0021b c0021b = (C0021b) obj;
                            if (i3 == 0) {
                                c0021b.c = 0;
                                c0021b.V = parseFloat;
                                return;
                            } else {
                                c0021b.d = 0;
                                c0021b.U = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof a.C0020a) {
                            a.C0020a c0020a = (a.C0020a) obj;
                            if (i3 == 0) {
                                c0020a.b(23, 0);
                                c0020a.a(parseFloat, 39);
                                return;
                            } else {
                                c0020a.b(21, 0);
                                c0020a.a(parseFloat, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar3 = (ConstraintLayout.b) obj;
                            if (i3 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar3).width = 0;
                                bVar3.R = max;
                                bVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar3).height = 0;
                                bVar3.S = max;
                                bVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof C0021b) {
                            C0021b c0021b2 = (C0021b) obj;
                            if (i3 == 0) {
                                c0021b2.c = 0;
                                c0021b2.e0 = max;
                                c0021b2.Y = 2;
                                return;
                            } else {
                                c0021b2.d = 0;
                                c0021b2.f0 = max;
                                c0021b2.Z = 2;
                                return;
                            }
                        }
                        if (obj instanceof a.C0020a) {
                            a.C0020a c0020a2 = (a.C0020a) obj;
                            if (i3 == 0) {
                                c0020a2.b(23, 0);
                                c0020a2.b(54, 2);
                                return;
                            } else {
                                c0020a2.b(21, 0);
                                c0020a2.b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i4 != 5) {
            dimensionPixelSize = typedArray.getInt(i2, 0);
            if (dimensionPixelSize == -4) {
                i5 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof ConstraintLayout.b)) {
                ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar4).width = i5;
                    bVar4.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar4).height = i5;
                    bVar4.X = z;
                    return;
                }
            }
            if (obj instanceof C0021b) {
                C0021b c0021b3 = (C0021b) obj;
                if (i3 == 0) {
                    c0021b3.c = i5;
                    c0021b3.m0 = z;
                    return;
                } else {
                    c0021b3.d = i5;
                    c0021b3.n0 = z;
                    return;
                }
            }
            if (obj instanceof a.C0020a) {
                a.C0020a c0020a3 = (a.C0020a) obj;
                if (i3 == 0) {
                    c0020a3.b(23, i5);
                    c0020a3.d(80, z);
                    return;
                } else {
                    c0020a3.b(21, i5);
                    c0020a3.d(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
        z = false;
        i5 = dimensionPixelSize;
        if (!(obj instanceof ConstraintLayout.b)) {
        }
    }

    public final void C(int i2, String str) {
        u(i2).e.z = str;
    }

    public final void D(int i2, int i3, int i4) {
        a u = u(i2);
        switch (i3) {
            case 1:
                u.e.N = i4;
                return;
            case 2:
                u.e.P = i4;
                return;
            case 3:
                u.e.O = i4;
                return;
            case 4:
                u.e.Q = i4;
                return;
            case 5:
                u.e.T = i4;
                return;
            case 6:
                u.e.S = i4;
                return;
            case 7:
                u.e.R = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void E(int i2, int i3) {
        u(i2).e.e = i3;
        u(i2).e.f = -1;
        u(i2).e.g = -1.0f;
    }

    public final void F(float f, int i2) {
        u(i2).e.x = f;
    }

    public final void G(int i2, int i3, int i4) {
        a u = u(i2);
        switch (i3) {
            case 1:
                u.e.G = i4;
                return;
            case 2:
                u.e.H = i4;
                return;
            case 3:
                u.e.I = i4;
                return;
            case 4:
                u.e.J = i4;
                return;
            case 5:
                u.e.M = i4;
                return;
            case 6:
                u.e.L = i4;
                return;
            case 7:
                u.e.K = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void H(float f, int i2) {
        u(i2).f.k = f;
    }

    public final void I(float f, int i2) {
        u(i2).e.y = f;
    }

    public final void J(int i2, int i3) {
        u(i2).c.b = i3;
    }

    public final void a(MotionLayout motionLayout) {
        a aVar;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer valueOf = Integer.valueOf(id);
            HashMap<Integer, a> hashMap = this.f;
            if (!hashMap.containsKey(valueOf)) {
                n2l.d(childAt);
            } else {
                if (this.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (hashMap.containsKey(Integer.valueOf(id)) && (aVar = hashMap.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.e(childAt, aVar.g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.f;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                n2l.d(childAt);
            } else {
                if (this.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = hashMap.get(Integer.valueOf(id));
                    if (aVar != null) {
                        d dVar = aVar.c;
                        C0021b c0021b = aVar.e;
                        e eVar = aVar.f;
                        if (childAt instanceof Barrier) {
                            c0021b.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(c0021b.g0);
                            barrier.setMargin(c0021b.h0);
                            barrier.setAllowsGoneWidget(c0021b.o0);
                            int[] iArr = c0021b.j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c0021b.k0;
                                if (str != null) {
                                    int[] q = q(barrier, str);
                                    c0021b.j0 = q;
                                    barrier.setReferencedIds(q);
                                }
                            }
                        }
                        ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar.a();
                        aVar.a(bVar);
                        ConstraintAttribute.e(childAt, aVar.g);
                        childAt.setLayoutParams(bVar);
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.b);
                        }
                        childAt.setAlpha(dVar.d);
                        childAt.setRotation(eVar.b);
                        childAt.setRotationX(eVar.c);
                        childAt.setRotationY(eVar.d);
                        childAt.setScaleX(eVar.e);
                        childAt.setScaleY(eVar.f);
                        if (eVar.i != -1) {
                            if (((View) childAt.getParent()).findViewById(eVar.i) != null) {
                                float bottom = (r5.getBottom() + r5.getTop()) / 2.0f;
                                float right = (r5.getRight() + r5.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.g)) {
                                childAt.setPivotX(eVar.g);
                            }
                            if (!Float.isNaN(eVar.h)) {
                                childAt.setPivotY(eVar.h);
                            }
                        }
                        childAt.setTranslationX(eVar.j);
                        childAt.setTranslationY(eVar.k);
                        childAt.setTranslationZ(eVar.l);
                        if (eVar.m) {
                            childAt.setElevation(eVar.n);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = hashMap.get(num);
            if (aVar2 != null) {
                C0021b c0021b2 = aVar2.e;
                if (c0021b2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0021b2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0021b2.k0;
                        if (str2 != null) {
                            int[] q2 = q(barrier2, str2);
                            c0021b2.j0 = q2;
                            barrier2.setReferencedIds(q2);
                        }
                    }
                    barrier2.setType(c0021b2.g0);
                    barrier2.setMargin(c0021b2.h0);
                    androidx.constraintlayout.widget.d dVar2 = ConstraintLayout.s;
                    ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
                    barrier2.t();
                    aVar2.a(bVar2);
                    constraintLayout.addView(barrier2, bVar2);
                }
                if (c0021b2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    androidx.constraintlayout.widget.d dVar3 = ConstraintLayout.s;
                    ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
                    aVar2.a(bVar3);
                    constraintLayout.addView(guideline, bVar3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).j(constraintLayout);
            }
        }
    }

    public final void e(int i2, int i3, int i4, int i5, int i6) {
        HashMap<Integer, a> hashMap = this.f;
        if (i4 == 1 || i4 == 2) {
            l(i2, 1, i3, i4, 0);
            l(i2, 2, i5, i6, 0);
            a aVar = hashMap.get(Integer.valueOf(i2));
            if (aVar != null) {
                aVar.e.x = 0.5f;
                return;
            }
            return;
        }
        if (i4 == 6 || i4 == 7) {
            l(i2, 6, i3, i4, 0);
            l(i2, 7, i5, i6, 0);
            a aVar2 = hashMap.get(Integer.valueOf(i2));
            if (aVar2 != null) {
                aVar2.e.x = 0.5f;
                return;
            }
            return;
        }
        l(i2, 3, i3, i4, 0);
        l(i2, 4, i5, i6, 0);
        a aVar3 = hashMap.get(Integer.valueOf(i2));
        if (aVar3 != null) {
            aVar3.e.y = 0.5f;
        }
    }

    public final void f(int i2, int i3) {
        if (i3 == 0) {
            e(i2, 0, 3, 0, 4);
        } else {
            e(i2, i3, 4, i3, 3);
        }
    }

    public final void g(int i2) {
        this.f.remove(Integer.valueOf(i2));
    }

    public final void h(int i2, int i3) {
        a aVar;
        Integer valueOf = Integer.valueOf(i2);
        HashMap<Integer, a> hashMap = this.f;
        if (!hashMap.containsKey(valueOf) || (aVar = hashMap.get(Integer.valueOf(i2))) == null) {
            return;
        }
        C0021b c0021b = aVar.e;
        switch (i3) {
            case 1:
                c0021b.j = -1;
                c0021b.i = -1;
                c0021b.G = -1;
                c0021b.N = Integer.MIN_VALUE;
                return;
            case 2:
                c0021b.l = -1;
                c0021b.k = -1;
                c0021b.H = -1;
                c0021b.P = Integer.MIN_VALUE;
                return;
            case 3:
                c0021b.n = -1;
                c0021b.m = -1;
                c0021b.I = 0;
                c0021b.O = Integer.MIN_VALUE;
                return;
            case 4:
                c0021b.o = -1;
                c0021b.p = -1;
                c0021b.J = 0;
                c0021b.Q = Integer.MIN_VALUE;
                return;
            case 5:
                c0021b.q = -1;
                c0021b.r = -1;
                c0021b.s = -1;
                c0021b.M = 0;
                c0021b.T = Integer.MIN_VALUE;
                return;
            case 6:
                c0021b.t = -1;
                c0021b.u = -1;
                c0021b.L = 0;
                c0021b.S = Integer.MIN_VALUE;
                return;
            case 7:
                c0021b.v = -1;
                c0021b.w = -1;
                c0021b.K = 0;
                c0021b.R = Integer.MIN_VALUE;
                return;
            case 8:
                c0021b.C = -1.0f;
                c0021b.B = -1;
                c0021b.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void i(ConstraintLayout constraintLayout) {
        int i2;
        HashMap<Integer, a> hashMap;
        HashMap<Integer, a> hashMap2;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap3 = bVar.f;
        hashMap3.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap3.containsKey(Integer.valueOf(id))) {
                hashMap3.put(Integer.valueOf(id), new a());
            }
            a aVar = hashMap3.get(Integer.valueOf(id));
            if (aVar == null) {
                i2 = childCount;
                hashMap = hashMap3;
            } else {
                d dVar = aVar.c;
                C0021b c0021b = aVar.e;
                e eVar = aVar.f;
                HashMap<String, ConstraintAttribute> hashMap4 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                HashMap<String, ConstraintAttribute> hashMap5 = bVar.d;
                for (String str : hashMap5.keySet()) {
                    ConstraintAttribute constraintAttribute = hashMap5.get(str);
                    int i4 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2 = hashMap3;
                            try {
                                hashMap4.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                                childCount = i4;
                                hashMap3 = hashMap2;
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                                childCount = i4;
                                hashMap3 = hashMap2;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                                childCount = i4;
                                hashMap3 = hashMap2;
                            }
                        } else {
                            hashMap2 = hashMap3;
                            hashMap4.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        hashMap2 = hashMap3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        hashMap2 = hashMap3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        hashMap2 = hashMap3;
                    }
                    childCount = i4;
                    hashMap3 = hashMap2;
                }
                i2 = childCount;
                hashMap = hashMap3;
                aVar.g = hashMap4;
                aVar.c(id, bVar2);
                dVar.b = childAt.getVisibility();
                dVar.d = childAt.getAlpha();
                eVar.b = childAt.getRotation();
                eVar.c = childAt.getRotationX();
                eVar.d = childAt.getRotationY();
                eVar.e = childAt.getScaleX();
                eVar.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != ConnectivityTracker.DEFAULT_UPLINK_BITRATE || pivotY != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                eVar.j = childAt.getTranslationX();
                eVar.k = childAt.getTranslationY();
                eVar.l = childAt.getTranslationZ();
                if (eVar.m) {
                    eVar.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0021b.o0 = barrier.getAllowsGoneWidget();
                    c0021b.j0 = barrier.getReferencedIds();
                    c0021b.g0 = barrier.getType();
                    c0021b.h0 = barrier.getMargin();
                }
            }
            i3++;
            bVar = this;
            childCount = i2;
            hashMap3 = hashMap;
        }
    }

    public final void j(b bVar) {
        HashMap<Integer, a> hashMap = this.f;
        hashMap.clear();
        for (Integer num : bVar.f.keySet()) {
            a aVar = bVar.f.get(num);
            if (aVar != null) {
                hashMap.put(num, aVar.clone());
            }
        }
    }

    public final void k(int i2, int i3, int i4, int i5) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap<Integer, a> hashMap = this.f;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a());
        }
        a aVar = hashMap.get(Integer.valueOf(i2));
        if (aVar == null) {
            return;
        }
        C0021b c0021b = aVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    c0021b.i = i4;
                    c0021b.j = -1;
                    return;
                } else if (i5 == 2) {
                    c0021b.j = i4;
                    c0021b.i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + K(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    c0021b.k = i4;
                    c0021b.l = -1;
                    return;
                } else if (i5 == 2) {
                    c0021b.l = i4;
                    c0021b.k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    c0021b.m = i4;
                    c0021b.n = -1;
                    c0021b.q = -1;
                    c0021b.r = -1;
                    c0021b.s = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                }
                c0021b.n = i4;
                c0021b.m = -1;
                c0021b.q = -1;
                c0021b.r = -1;
                c0021b.s = -1;
                return;
            case 4:
                if (i5 == 4) {
                    c0021b.p = i4;
                    c0021b.o = -1;
                    c0021b.q = -1;
                    c0021b.r = -1;
                    c0021b.s = -1;
                    return;
                }
                if (i5 != 3) {
                    throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                }
                c0021b.o = i4;
                c0021b.p = -1;
                c0021b.q = -1;
                c0021b.r = -1;
                c0021b.s = -1;
                return;
            case 5:
                if (i5 == 5) {
                    c0021b.q = i4;
                    c0021b.p = -1;
                    c0021b.o = -1;
                    c0021b.m = -1;
                    c0021b.n = -1;
                    return;
                }
                if (i5 == 3) {
                    c0021b.r = i4;
                    c0021b.p = -1;
                    c0021b.o = -1;
                    c0021b.m = -1;
                    c0021b.n = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                }
                c0021b.s = i4;
                c0021b.p = -1;
                c0021b.o = -1;
                c0021b.m = -1;
                c0021b.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    c0021b.u = i4;
                    c0021b.t = -1;
                    return;
                } else if (i5 == 7) {
                    c0021b.t = i4;
                    c0021b.u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    c0021b.w = i4;
                    c0021b.v = -1;
                    return;
                } else if (i5 == 6) {
                    c0021b.v = i4;
                    c0021b.w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(K(i3) + " to " + K(i5) + " unknown");
        }
    }

    public final void l(int i2, int i3, int i4, int i5, int i6) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap<Integer, a> hashMap = this.f;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a());
        }
        a aVar = hashMap.get(Integer.valueOf(i2));
        if (aVar == null) {
            return;
        }
        C0021b c0021b = aVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    c0021b.i = i4;
                    c0021b.j = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Left to " + K(i5) + " undefined");
                    }
                    c0021b.j = i4;
                    c0021b.i = -1;
                }
                c0021b.G = i6;
                return;
            case 2:
                if (i5 == 1) {
                    c0021b.k = i4;
                    c0021b.l = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                    }
                    c0021b.l = i4;
                    c0021b.k = -1;
                }
                c0021b.H = i6;
                return;
            case 3:
                if (i5 == 3) {
                    c0021b.m = i4;
                    c0021b.n = -1;
                    c0021b.q = -1;
                    c0021b.r = -1;
                    c0021b.s = -1;
                } else {
                    if (i5 != 4) {
                        throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                    }
                    c0021b.n = i4;
                    c0021b.m = -1;
                    c0021b.q = -1;
                    c0021b.r = -1;
                    c0021b.s = -1;
                }
                c0021b.I = i6;
                return;
            case 4:
                if (i5 == 4) {
                    c0021b.p = i4;
                    c0021b.o = -1;
                    c0021b.q = -1;
                    c0021b.r = -1;
                    c0021b.s = -1;
                } else {
                    if (i5 != 3) {
                        throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                    }
                    c0021b.o = i4;
                    c0021b.p = -1;
                    c0021b.q = -1;
                    c0021b.r = -1;
                    c0021b.s = -1;
                }
                c0021b.J = i6;
                return;
            case 5:
                if (i5 == 5) {
                    c0021b.q = i4;
                    c0021b.p = -1;
                    c0021b.o = -1;
                    c0021b.m = -1;
                    c0021b.n = -1;
                    return;
                }
                if (i5 == 3) {
                    c0021b.r = i4;
                    c0021b.p = -1;
                    c0021b.o = -1;
                    c0021b.m = -1;
                    c0021b.n = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                }
                c0021b.s = i4;
                c0021b.p = -1;
                c0021b.o = -1;
                c0021b.m = -1;
                c0021b.n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    c0021b.u = i4;
                    c0021b.t = -1;
                } else {
                    if (i5 != 7) {
                        throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                    }
                    c0021b.t = i4;
                    c0021b.u = -1;
                }
                c0021b.L = i6;
                return;
            case 7:
                if (i5 == 7) {
                    c0021b.w = i4;
                    c0021b.v = -1;
                } else {
                    if (i5 != 6) {
                        throw new IllegalArgumentException("right to " + K(i5) + " undefined");
                    }
                    c0021b.v = i4;
                    c0021b.w = -1;
                }
                c0021b.K = i6;
                return;
            default:
                throw new IllegalArgumentException(K(i3) + " to " + K(i5) + " unknown");
        }
    }

    public final void m(int i2, int i3) {
        u(i2).e.Y = i3;
    }

    public final void n(int i2, int i3) {
        u(i2).e.d = i3;
    }

    public final void o(int i2, int i3) {
        u(i2).e.a0 = i3;
    }

    public final void p(int i2, int i3) {
        u(i2).e.c = i3;
    }

    public final void r(int i2, int i3, int i4, int... iArr) {
        C0021b c0021b = u(i2).e;
        c0021b.i0 = 1;
        c0021b.g0 = i3;
        c0021b.h0 = i4;
        c0021b.a = false;
        c0021b.j0 = iArr;
    }

    public final void s(int i2, int i3, int i4, int i5, int[] iArr) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        u(iArr[0]).e.W = 2;
        int i6 = 6;
        l(iArr[0], 6, i2, i3, -1);
        for (int i7 = 1; i7 < iArr.length; i7++) {
            int i8 = i7 - 1;
            l(iArr[i7], i6, iArr[i8], 7, -1);
            int i9 = i6;
            l(iArr[i8], 7, iArr[i7], i9, -1);
            i6 = i9;
        }
        l(iArr[iArr.length - 1], 7, i4, i5, -1);
    }

    public final a u(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap<Integer, a> hashMap = this.f;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i2), new a());
        }
        return hashMap.get(Integer.valueOf(i2));
    }

    public final a v(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        HashMap<Integer, a> hashMap = this.f;
        if (hashMap.containsKey(valueOf)) {
            return hashMap.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void w(int i2, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a t = t(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        t.e.a = true;
                    }
                    this.f.put(Integer.valueOf(t.a), t);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ce, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlResourceParser.getName()) {
                            case "Constraint":
                                aVar = t(context, Xml.asAttributeSet(xmlResourceParser), false);
                                break;
                            case "ConstraintOverride":
                                aVar = t(context, Xml.asAttributeSet(xmlResourceParser), true);
                                break;
                            case "Guideline":
                                aVar = t(context, Xml.asAttributeSet(xmlResourceParser), false);
                                C0021b c0021b = aVar.e;
                                c0021b.a = true;
                                c0021b.b = true;
                                break;
                            case "Barrier":
                                aVar = t(context, Xml.asAttributeSet(xmlResourceParser), false);
                                aVar.e.i0 = 1;
                                break;
                            case "PropertySet":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Transform":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Layout":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Motion":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVar.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "CustomAttribute":
                            case "CustomMethod":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                ConstraintAttribute.d(context, xmlResourceParser, aVar.g);
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    break;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    break;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    break;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    break;
                                }
                                break;
                        }
                        if (r4 == 0) {
                            return;
                        }
                        if (r4 == 1 || r4 == 2 || r4 == 3) {
                            this.f.put(Integer.valueOf(aVar.a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
