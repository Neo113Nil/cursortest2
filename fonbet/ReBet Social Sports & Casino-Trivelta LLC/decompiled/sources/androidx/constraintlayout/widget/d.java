package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import g0.C4313a;
import i0.AbstractC4515a;
import i0.AbstractC4516b;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};

    /* renamed from: f, reason: collision with root package name */
    public static SparseIntArray f18248f = new SparseIntArray();

    /* renamed from: g, reason: collision with root package name */
    public static SparseIntArray f18249g = new SparseIntArray();

    /* renamed from: a, reason: collision with root package name */
    public String f18250a = "";
    private String[] mMatchLabels = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public int f18251b = 0;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f18252c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f18253d = true;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f18254e = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f18255a;

        /* renamed from: b, reason: collision with root package name */
        public String f18256b;

        /* renamed from: c, reason: collision with root package name */
        public final C0355d f18257c = new C0355d();

        /* renamed from: d, reason: collision with root package name */
        public final c f18258d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f18259e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f18260f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap f18261g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        public C0354a f18262h;

        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        public static class C0354a {
            int[] mTypeInt = new int[10];
            int[] mValueInt = new int[10];

            /* renamed from: a, reason: collision with root package name */
            public int f18263a = 0;
            int[] mTypeFloat = new int[10];
            float[] mValueFloat = new float[10];

            /* renamed from: b, reason: collision with root package name */
            public int f18264b = 0;
            int[] mTypeString = new int[5];
            String[] mValueString = new String[5];

            /* renamed from: c, reason: collision with root package name */
            public int f18265c = 0;
            int[] mTypeBoolean = new int[4];
            boolean[] mValueBoolean = new boolean[4];

            /* renamed from: d, reason: collision with root package name */
            public int f18266d = 0;

            public void a(int i10, float f10) {
                int i11 = this.f18264b;
                int[] iArr = this.mTypeFloat;
                if (i11 >= iArr.length) {
                    this.mTypeFloat = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.mValueFloat;
                    this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.mTypeFloat;
                int i12 = this.f18264b;
                iArr2[i12] = i10;
                float[] fArr2 = this.mValueFloat;
                this.f18264b = i12 + 1;
                fArr2[i12] = f10;
            }

            public void b(int i10, int i11) {
                int i12 = this.f18263a;
                int[] iArr = this.mTypeInt;
                if (i12 >= iArr.length) {
                    this.mTypeInt = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.mValueInt;
                    this.mValueInt = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.mTypeInt;
                int i13 = this.f18263a;
                iArr3[i13] = i10;
                int[] iArr4 = this.mValueInt;
                this.f18263a = i13 + 1;
                iArr4[i13] = i11;
            }

            public void c(int i10, String str) {
                int i11 = this.f18265c;
                int[] iArr = this.mTypeString;
                if (i11 >= iArr.length) {
                    this.mTypeString = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.mValueString;
                    this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.mTypeString;
                int i12 = this.f18265c;
                iArr2[i12] = i10;
                String[] strArr2 = this.mValueString;
                this.f18265c = i12 + 1;
                strArr2[i12] = str;
            }

            public void d(int i10, boolean z10) {
                int i11 = this.f18266d;
                int[] iArr = this.mTypeBoolean;
                if (i11 >= iArr.length) {
                    this.mTypeBoolean = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.mValueBoolean;
                    this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.mTypeBoolean;
                int i12 = this.f18266d;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.mValueBoolean;
                this.f18266d = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f18259e;
            bVar.f18156e = bVar2.f18312j;
            bVar.f18158f = bVar2.f18314k;
            bVar.f18160g = bVar2.f18316l;
            bVar.f18162h = bVar2.f18318m;
            bVar.f18164i = bVar2.f18320n;
            bVar.f18166j = bVar2.f18322o;
            bVar.f18168k = bVar2.f18324p;
            bVar.f18170l = bVar2.f18326q;
            bVar.f18172m = bVar2.f18327r;
            bVar.f18174n = bVar2.f18328s;
            bVar.f18176o = bVar2.f18329t;
            bVar.f18184s = bVar2.f18330u;
            bVar.f18186t = bVar2.f18331v;
            bVar.f18188u = bVar2.f18332w;
            bVar.f18190v = bVar2.f18333x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f18275H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f18276I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f18277J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f18278K;
            bVar.f18122A = bVar2.f18287T;
            bVar.f18123B = bVar2.f18286S;
            bVar.f18194x = bVar2.f18283P;
            bVar.f18196z = bVar2.f18285R;
            bVar.f18128G = bVar2.f18334y;
            bVar.f18129H = bVar2.f18335z;
            bVar.f18178p = bVar2.f18269B;
            bVar.f18180q = bVar2.f18270C;
            bVar.f18182r = bVar2.f18271D;
            bVar.f18130I = bVar2.f18268A;
            bVar.f18145X = bVar2.f18272E;
            bVar.f18146Y = bVar2.f18273F;
            bVar.f18134M = bVar2.f18289V;
            bVar.f18133L = bVar2.f18290W;
            bVar.f18136O = bVar2.f18292Y;
            bVar.f18135N = bVar2.f18291X;
            bVar.f18149a0 = bVar2.f18319m0;
            bVar.f18151b0 = bVar2.f18321n0;
            bVar.f18137P = bVar2.f18293Z;
            bVar.f18138Q = bVar2.f18295a0;
            bVar.f18141T = bVar2.f18297b0;
            bVar.f18142U = bVar2.f18299c0;
            bVar.f18139R = bVar2.f18301d0;
            bVar.f18140S = bVar2.f18303e0;
            bVar.f18143V = bVar2.f18305f0;
            bVar.f18144W = bVar2.f18307g0;
            bVar.f18147Z = bVar2.f18274G;
            bVar.f18152c = bVar2.f18308h;
            bVar.f18148a = bVar2.f18304f;
            bVar.f18150b = bVar2.f18306g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f18300d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f18302e;
            String str = bVar2.f18317l0;
            if (str != null) {
                bVar.f18153c0 = str;
            }
            bVar.f18155d0 = bVar2.f18325p0;
            bVar.setMarginStart(bVar2.f18280M);
            bVar.setMarginEnd(this.f18259e.f18279L);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f18259e.a(this.f18259e);
            aVar.f18258d.a(this.f18258d);
            aVar.f18257c.a(this.f18257c);
            aVar.f18260f.a(this.f18260f);
            aVar.f18255a = this.f18255a;
            aVar.f18262h = this.f18262h;
            return aVar;
        }

        public final void d(int i10, ConstraintLayout.b bVar) {
            this.f18255a = i10;
            b bVar2 = this.f18259e;
            bVar2.f18312j = bVar.f18156e;
            bVar2.f18314k = bVar.f18158f;
            bVar2.f18316l = bVar.f18160g;
            bVar2.f18318m = bVar.f18162h;
            bVar2.f18320n = bVar.f18164i;
            bVar2.f18322o = bVar.f18166j;
            bVar2.f18324p = bVar.f18168k;
            bVar2.f18326q = bVar.f18170l;
            bVar2.f18327r = bVar.f18172m;
            bVar2.f18328s = bVar.f18174n;
            bVar2.f18329t = bVar.f18176o;
            bVar2.f18330u = bVar.f18184s;
            bVar2.f18331v = bVar.f18186t;
            bVar2.f18332w = bVar.f18188u;
            bVar2.f18333x = bVar.f18190v;
            bVar2.f18334y = bVar.f18128G;
            bVar2.f18335z = bVar.f18129H;
            bVar2.f18268A = bVar.f18130I;
            bVar2.f18269B = bVar.f18178p;
            bVar2.f18270C = bVar.f18180q;
            bVar2.f18271D = bVar.f18182r;
            bVar2.f18272E = bVar.f18145X;
            bVar2.f18273F = bVar.f18146Y;
            bVar2.f18274G = bVar.f18147Z;
            bVar2.f18308h = bVar.f18152c;
            bVar2.f18304f = bVar.f18148a;
            bVar2.f18306g = bVar.f18150b;
            bVar2.f18300d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f18302e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f18275H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f18276I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f18277J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f18278K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f18281N = bVar.f18125D;
            bVar2.f18289V = bVar.f18134M;
            bVar2.f18290W = bVar.f18133L;
            bVar2.f18292Y = bVar.f18136O;
            bVar2.f18291X = bVar.f18135N;
            bVar2.f18319m0 = bVar.f18149a0;
            bVar2.f18321n0 = bVar.f18151b0;
            bVar2.f18293Z = bVar.f18137P;
            bVar2.f18295a0 = bVar.f18138Q;
            bVar2.f18297b0 = bVar.f18141T;
            bVar2.f18299c0 = bVar.f18142U;
            bVar2.f18301d0 = bVar.f18139R;
            bVar2.f18303e0 = bVar.f18140S;
            bVar2.f18305f0 = bVar.f18143V;
            bVar2.f18307g0 = bVar.f18144W;
            bVar2.f18317l0 = bVar.f18153c0;
            bVar2.f18283P = bVar.f18194x;
            bVar2.f18285R = bVar.f18196z;
            bVar2.f18282O = bVar.f18192w;
            bVar2.f18284Q = bVar.f18195y;
            bVar2.f18287T = bVar.f18122A;
            bVar2.f18286S = bVar.f18123B;
            bVar2.f18288U = bVar.f18124C;
            bVar2.f18325p0 = bVar.f18155d0;
            bVar2.f18279L = bVar.getMarginEnd();
            this.f18259e.f18280M = bVar.getMarginStart();
        }
    }

    public static class b {

        /* renamed from: q0, reason: collision with root package name */
        public static SparseIntArray f18267q0;

        /* renamed from: d, reason: collision with root package name */
        public int f18300d;

        /* renamed from: e, reason: collision with root package name */
        public int f18302e;

        /* renamed from: k0, reason: collision with root package name */
        public String f18315k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f18317l0;
        public int[] mReferenceIds;

        /* renamed from: a, reason: collision with root package name */
        public boolean f18294a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18296b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18298c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f18304f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f18306g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f18308h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f18310i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f18312j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f18314k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f18316l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f18318m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f18320n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f18322o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f18324p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f18326q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f18327r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f18328s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f18329t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f18330u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f18331v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f18332w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f18333x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f18334y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f18335z = 0.5f;

        /* renamed from: A, reason: collision with root package name */
        public String f18268A = null;

        /* renamed from: B, reason: collision with root package name */
        public int f18269B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f18270C = 0;

        /* renamed from: D, reason: collision with root package name */
        public float f18271D = 0.0f;

        /* renamed from: E, reason: collision with root package name */
        public int f18272E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f18273F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f18274G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f18275H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f18276I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f18277J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f18278K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f18279L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f18280M = 0;

        /* renamed from: N, reason: collision with root package name */
        public int f18281N = 0;

        /* renamed from: O, reason: collision with root package name */
        public int f18282O = Integer.MIN_VALUE;

        /* renamed from: P, reason: collision with root package name */
        public int f18283P = Integer.MIN_VALUE;

        /* renamed from: Q, reason: collision with root package name */
        public int f18284Q = Integer.MIN_VALUE;

        /* renamed from: R, reason: collision with root package name */
        public int f18285R = Integer.MIN_VALUE;

        /* renamed from: S, reason: collision with root package name */
        public int f18286S = Integer.MIN_VALUE;

        /* renamed from: T, reason: collision with root package name */
        public int f18287T = Integer.MIN_VALUE;

        /* renamed from: U, reason: collision with root package name */
        public int f18288U = Integer.MIN_VALUE;

        /* renamed from: V, reason: collision with root package name */
        public float f18289V = -1.0f;

        /* renamed from: W, reason: collision with root package name */
        public float f18290W = -1.0f;

        /* renamed from: X, reason: collision with root package name */
        public int f18291X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public int f18292Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f18293Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f18295a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f18297b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f18299c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f18301d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f18303e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f18305f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f18307g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f18309h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f18311i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f18313j0 = -1;

        /* renamed from: m0, reason: collision with root package name */
        public boolean f18319m0 = false;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f18321n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f18323o0 = true;

        /* renamed from: p0, reason: collision with root package name */
        public int f18325p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18267q0 = sparseIntArray;
            sparseIntArray.append(g.f18647l5, 24);
            f18267q0.append(g.f18655m5, 25);
            f18267q0.append(g.f18671o5, 28);
            f18267q0.append(g.f18679p5, 29);
            f18267q0.append(g.f18717u5, 35);
            f18267q0.append(g.f18710t5, 34);
            f18267q0.append(g.f18516U4, 4);
            f18267q0.append(g.f18509T4, 3);
            f18267q0.append(g.f18495R4, 1);
            f18267q0.append(g.f18391C5, 6);
            f18267q0.append(g.f18398D5, 7);
            f18267q0.append(g.f18567b5, 17);
            f18267q0.append(g.f18575c5, 18);
            f18267q0.append(g.f18583d5, 19);
            f18267q0.append(g.f18467N4, 90);
            f18267q0.append(g.f18751z4, 26);
            f18267q0.append(g.f18687q5, 31);
            f18267q0.append(g.f18695r5, 32);
            f18267q0.append(g.f18559a5, 10);
            f18267q0.append(g.f18551Z4, 9);
            f18267q0.append(g.f18419G5, 13);
            f18267q0.append(g.f18440J5, 16);
            f18267q0.append(g.f18426H5, 14);
            f18267q0.append(g.f18405E5, 11);
            f18267q0.append(g.f18433I5, 15);
            f18267q0.append(g.f18412F5, 12);
            f18267q0.append(g.f18738x5, 38);
            f18267q0.append(g.f18631j5, 37);
            f18267q0.append(g.f18623i5, 39);
            f18267q0.append(g.f18731w5, 40);
            f18267q0.append(g.f18615h5, 20);
            f18267q0.append(g.f18724v5, 36);
            f18267q0.append(g.f18544Y4, 5);
            f18267q0.append(g.f18639k5, 91);
            f18267q0.append(g.f18703s5, 91);
            f18267q0.append(g.f18663n5, 91);
            f18267q0.append(g.f18502S4, 91);
            f18267q0.append(g.f18488Q4, 91);
            f18267q0.append(g.f18390C4, 23);
            f18267q0.append(g.f18404E4, 27);
            f18267q0.append(g.f18418G4, 30);
            f18267q0.append(g.f18425H4, 8);
            f18267q0.append(g.f18397D4, 33);
            f18267q0.append(g.f18411F4, 2);
            f18267q0.append(g.f18376A4, 22);
            f18267q0.append(g.f18383B4, 21);
            f18267q0.append(g.f18745y5, 41);
            f18267q0.append(g.f18591e5, 42);
            f18267q0.append(g.f18481P4, 87);
            f18267q0.append(g.f18474O4, 88);
            f18267q0.append(g.f18447K5, 76);
            f18267q0.append(g.f18523V4, 61);
            f18267q0.append(g.f18537X4, 62);
            f18267q0.append(g.f18530W4, 63);
            f18267q0.append(g.f18384B5, 69);
            f18267q0.append(g.f18607g5, 70);
            f18267q0.append(g.f18453L4, 71);
            f18267q0.append(g.f18439J4, 72);
            f18267q0.append(g.f18446K4, 73);
            f18267q0.append(g.f18460M4, 74);
            f18267q0.append(g.f18432I4, 75);
            f18267q0.append(g.f18752z5, 84);
            f18267q0.append(g.f18377A5, 86);
            f18267q0.append(g.f18752z5, 83);
            f18267q0.append(g.f18599f5, 85);
            f18267q0.append(g.f18745y5, 87);
            f18267q0.append(g.f18591e5, 88);
            f18267q0.append(g.f18676p2, 89);
            f18267q0.append(g.f18467N4, 90);
        }

        public void a(b bVar) {
            this.f18294a = bVar.f18294a;
            this.f18300d = bVar.f18300d;
            this.f18296b = bVar.f18296b;
            this.f18302e = bVar.f18302e;
            this.f18304f = bVar.f18304f;
            this.f18306g = bVar.f18306g;
            this.f18308h = bVar.f18308h;
            this.f18310i = bVar.f18310i;
            this.f18312j = bVar.f18312j;
            this.f18314k = bVar.f18314k;
            this.f18316l = bVar.f18316l;
            this.f18318m = bVar.f18318m;
            this.f18320n = bVar.f18320n;
            this.f18322o = bVar.f18322o;
            this.f18324p = bVar.f18324p;
            this.f18326q = bVar.f18326q;
            this.f18327r = bVar.f18327r;
            this.f18328s = bVar.f18328s;
            this.f18329t = bVar.f18329t;
            this.f18330u = bVar.f18330u;
            this.f18331v = bVar.f18331v;
            this.f18332w = bVar.f18332w;
            this.f18333x = bVar.f18333x;
            this.f18334y = bVar.f18334y;
            this.f18335z = bVar.f18335z;
            this.f18268A = bVar.f18268A;
            this.f18269B = bVar.f18269B;
            this.f18270C = bVar.f18270C;
            this.f18271D = bVar.f18271D;
            this.f18272E = bVar.f18272E;
            this.f18273F = bVar.f18273F;
            this.f18274G = bVar.f18274G;
            this.f18275H = bVar.f18275H;
            this.f18276I = bVar.f18276I;
            this.f18277J = bVar.f18277J;
            this.f18278K = bVar.f18278K;
            this.f18279L = bVar.f18279L;
            this.f18280M = bVar.f18280M;
            this.f18281N = bVar.f18281N;
            this.f18282O = bVar.f18282O;
            this.f18283P = bVar.f18283P;
            this.f18284Q = bVar.f18284Q;
            this.f18285R = bVar.f18285R;
            this.f18286S = bVar.f18286S;
            this.f18287T = bVar.f18287T;
            this.f18288U = bVar.f18288U;
            this.f18289V = bVar.f18289V;
            this.f18290W = bVar.f18290W;
            this.f18291X = bVar.f18291X;
            this.f18292Y = bVar.f18292Y;
            this.f18293Z = bVar.f18293Z;
            this.f18295a0 = bVar.f18295a0;
            this.f18297b0 = bVar.f18297b0;
            this.f18299c0 = bVar.f18299c0;
            this.f18301d0 = bVar.f18301d0;
            this.f18303e0 = bVar.f18303e0;
            this.f18305f0 = bVar.f18305f0;
            this.f18307g0 = bVar.f18307g0;
            this.f18309h0 = bVar.f18309h0;
            this.f18311i0 = bVar.f18311i0;
            this.f18313j0 = bVar.f18313j0;
            this.f18317l0 = bVar.f18317l0;
            int[] iArr = bVar.mReferenceIds;
            if (iArr == null || bVar.f18315k0 != null) {
                this.mReferenceIds = null;
            } else {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            }
            this.f18315k0 = bVar.f18315k0;
            this.f18319m0 = bVar.f18319m0;
            this.f18321n0 = bVar.f18321n0;
            this.f18323o0 = bVar.f18323o0;
            this.f18325p0 = bVar.f18325p0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.Layout);
            this.f18296b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f18267q0.get(index);
                switch (i11) {
                    case 1:
                        this.f18327r = d.s(obtainStyledAttributes, index, this.f18327r);
                        break;
                    case 2:
                        this.f18278K = obtainStyledAttributes.getDimensionPixelSize(index, this.f18278K);
                        break;
                    case 3:
                        this.f18326q = d.s(obtainStyledAttributes, index, this.f18326q);
                        break;
                    case 4:
                        this.f18324p = d.s(obtainStyledAttributes, index, this.f18324p);
                        break;
                    case 5:
                        this.f18268A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f18272E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18272E);
                        break;
                    case 7:
                        this.f18273F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18273F);
                        break;
                    case 8:
                        this.f18279L = obtainStyledAttributes.getDimensionPixelSize(index, this.f18279L);
                        break;
                    case 9:
                        this.f18333x = d.s(obtainStyledAttributes, index, this.f18333x);
                        break;
                    case 10:
                        this.f18332w = d.s(obtainStyledAttributes, index, this.f18332w);
                        break;
                    case 11:
                        this.f18285R = obtainStyledAttributes.getDimensionPixelSize(index, this.f18285R);
                        break;
                    case 12:
                        this.f18286S = obtainStyledAttributes.getDimensionPixelSize(index, this.f18286S);
                        break;
                    case 13:
                        this.f18282O = obtainStyledAttributes.getDimensionPixelSize(index, this.f18282O);
                        break;
                    case 14:
                        this.f18284Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f18284Q);
                        break;
                    case 15:
                        this.f18287T = obtainStyledAttributes.getDimensionPixelSize(index, this.f18287T);
                        break;
                    case 16:
                        this.f18283P = obtainStyledAttributes.getDimensionPixelSize(index, this.f18283P);
                        break;
                    case 17:
                        this.f18304f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18304f);
                        break;
                    case 18:
                        this.f18306g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18306g);
                        break;
                    case 19:
                        this.f18308h = obtainStyledAttributes.getFloat(index, this.f18308h);
                        break;
                    case 20:
                        this.f18334y = obtainStyledAttributes.getFloat(index, this.f18334y);
                        break;
                    case 21:
                        this.f18302e = obtainStyledAttributes.getLayoutDimension(index, this.f18302e);
                        break;
                    case 22:
                        this.f18300d = obtainStyledAttributes.getLayoutDimension(index, this.f18300d);
                        break;
                    case 23:
                        this.f18275H = obtainStyledAttributes.getDimensionPixelSize(index, this.f18275H);
                        break;
                    case 24:
                        this.f18312j = d.s(obtainStyledAttributes, index, this.f18312j);
                        break;
                    case 25:
                        this.f18314k = d.s(obtainStyledAttributes, index, this.f18314k);
                        break;
                    case 26:
                        this.f18274G = obtainStyledAttributes.getInt(index, this.f18274G);
                        break;
                    case 27:
                        this.f18276I = obtainStyledAttributes.getDimensionPixelSize(index, this.f18276I);
                        break;
                    case 28:
                        this.f18316l = d.s(obtainStyledAttributes, index, this.f18316l);
                        break;
                    case 29:
                        this.f18318m = d.s(obtainStyledAttributes, index, this.f18318m);
                        break;
                    case 30:
                        this.f18280M = obtainStyledAttributes.getDimensionPixelSize(index, this.f18280M);
                        break;
                    case 31:
                        this.f18330u = d.s(obtainStyledAttributes, index, this.f18330u);
                        break;
                    case 32:
                        this.f18331v = d.s(obtainStyledAttributes, index, this.f18331v);
                        break;
                    case 33:
                        this.f18277J = obtainStyledAttributes.getDimensionPixelSize(index, this.f18277J);
                        break;
                    case 34:
                        this.f18322o = d.s(obtainStyledAttributes, index, this.f18322o);
                        break;
                    case 35:
                        this.f18320n = d.s(obtainStyledAttributes, index, this.f18320n);
                        break;
                    case 36:
                        this.f18335z = obtainStyledAttributes.getFloat(index, this.f18335z);
                        break;
                    case 37:
                        this.f18290W = obtainStyledAttributes.getFloat(index, this.f18290W);
                        break;
                    case 38:
                        this.f18289V = obtainStyledAttributes.getFloat(index, this.f18289V);
                        break;
                    case 39:
                        this.f18291X = obtainStyledAttributes.getInt(index, this.f18291X);
                        break;
                    case 40:
                        this.f18292Y = obtainStyledAttributes.getInt(index, this.f18292Y);
                        break;
                    case 41:
                        d.t(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.t(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f18269B = d.s(obtainStyledAttributes, index, this.f18269B);
                                break;
                            case 62:
                                this.f18270C = obtainStyledAttributes.getDimensionPixelSize(index, this.f18270C);
                                break;
                            case 63:
                                this.f18271D = obtainStyledAttributes.getFloat(index, this.f18271D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f18305f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f18307g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f18309h0 = obtainStyledAttributes.getInt(index, this.f18309h0);
                                        break;
                                    case 73:
                                        this.f18311i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f18311i0);
                                        break;
                                    case 74:
                                        this.f18315k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f18323o0 = obtainStyledAttributes.getBoolean(index, this.f18323o0);
                                        break;
                                    case 76:
                                        this.f18325p0 = obtainStyledAttributes.getInt(index, this.f18325p0);
                                        break;
                                    case 77:
                                        this.f18328s = d.s(obtainStyledAttributes, index, this.f18328s);
                                        break;
                                    case 78:
                                        this.f18329t = d.s(obtainStyledAttributes, index, this.f18329t);
                                        break;
                                    case 79:
                                        this.f18288U = obtainStyledAttributes.getDimensionPixelSize(index, this.f18288U);
                                        break;
                                    case 80:
                                        this.f18281N = obtainStyledAttributes.getDimensionPixelSize(index, this.f18281N);
                                        break;
                                    case 81:
                                        this.f18293Z = obtainStyledAttributes.getInt(index, this.f18293Z);
                                        break;
                                    case 82:
                                        this.f18295a0 = obtainStyledAttributes.getInt(index, this.f18295a0);
                                        break;
                                    case 83:
                                        this.f18299c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f18299c0);
                                        break;
                                    case 84:
                                        this.f18297b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f18297b0);
                                        break;
                                    case 85:
                                        this.f18303e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f18303e0);
                                        break;
                                    case 86:
                                        this.f18301d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f18301d0);
                                        break;
                                    case 87:
                                        this.f18319m0 = obtainStyledAttributes.getBoolean(index, this.f18319m0);
                                        break;
                                    case 88:
                                        this.f18321n0 = obtainStyledAttributes.getBoolean(index, this.f18321n0);
                                        break;
                                    case 89:
                                        this.f18317l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f18310i = obtainStyledAttributes.getBoolean(index, this.f18310i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f18267q0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f18267q0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: o, reason: collision with root package name */
        public static SparseIntArray f18336o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f18337a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f18338b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f18339c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f18340d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f18341e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f18342f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f18343g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f18344h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f18345i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f18346j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f18347k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f18348l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f18349m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f18350n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18336o = sparseIntArray;
            sparseIntArray.append(g.f18475O5, 1);
            f18336o.append(g.f18489Q5, 2);
            f18336o.append(g.f18517U5, 3);
            f18336o.append(g.f18468N5, 4);
            f18336o.append(g.f18461M5, 5);
            f18336o.append(g.f18454L5, 6);
            f18336o.append(g.f18482P5, 7);
            f18336o.append(g.f18510T5, 8);
            f18336o.append(g.f18503S5, 9);
            f18336o.append(g.f18496R5, 10);
        }

        public void a(c cVar) {
            this.f18337a = cVar.f18337a;
            this.f18338b = cVar.f18338b;
            this.f18340d = cVar.f18340d;
            this.f18341e = cVar.f18341e;
            this.f18342f = cVar.f18342f;
            this.f18345i = cVar.f18345i;
            this.f18343g = cVar.f18343g;
            this.f18344h = cVar.f18344h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.Motion);
            this.f18337a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f18336o.get(index)) {
                    case 1:
                        this.f18345i = obtainStyledAttributes.getFloat(index, this.f18345i);
                        break;
                    case 2:
                        this.f18341e = obtainStyledAttributes.getInt(index, this.f18341e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f18340d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f18340d = C4313a.NAMED_EASING[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f18342f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f18338b = d.s(obtainStyledAttributes, index, this.f18338b);
                        break;
                    case 6:
                        this.f18339c = obtainStyledAttributes.getInteger(index, this.f18339c);
                        break;
                    case 7:
                        this.f18343g = obtainStyledAttributes.getFloat(index, this.f18343g);
                        break;
                    case 8:
                        this.f18347k = obtainStyledAttributes.getInteger(index, this.f18347k);
                        break;
                    case 9:
                        this.f18346j = obtainStyledAttributes.getFloat(index, this.f18346j);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f18350n = resourceId;
                            if (resourceId != -1) {
                                this.f18349m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f18348l = string;
                            if (string.indexOf("/") > 0) {
                                this.f18350n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f18349m = -2;
                                break;
                            } else {
                                this.f18349m = -1;
                                break;
                            }
                        } else {
                            this.f18349m = obtainStyledAttributes.getInteger(index, this.f18350n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0355d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18351a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f18352b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f18353c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f18354d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f18355e = Float.NaN;

        public void a(C0355d c0355d) {
            this.f18351a = c0355d.f18351a;
            this.f18352b = c0355d.f18352b;
            this.f18354d = c0355d.f18354d;
            this.f18355e = c0355d.f18355e;
            this.f18353c = c0355d.f18353c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.PropertySet);
            this.f18351a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f18531W5) {
                    this.f18354d = obtainStyledAttributes.getFloat(index, this.f18354d);
                } else if (index == g.f18524V5) {
                    this.f18352b = obtainStyledAttributes.getInt(index, this.f18352b);
                    this.f18352b = d.VISIBILITY_FLAGS[this.f18352b];
                } else if (index == g.f18545Y5) {
                    this.f18353c = obtainStyledAttributes.getInt(index, this.f18353c);
                } else if (index == g.f18538X5) {
                    this.f18355e = obtainStyledAttributes.getFloat(index, this.f18355e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o, reason: collision with root package name */
        public static SparseIntArray f18356o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f18357a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f18358b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f18359c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f18360d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f18361e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f18362f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f18363g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f18364h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f18365i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f18366j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f18367k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f18368l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f18369m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f18370n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18356o = sparseIntArray;
            sparseIntArray.append(g.f18616h6, 1);
            f18356o.append(g.f18624i6, 2);
            f18356o.append(g.f18632j6, 3);
            f18356o.append(g.f18600f6, 4);
            f18356o.append(g.f18608g6, 5);
            f18356o.append(g.f18568b6, 6);
            f18356o.append(g.f18576c6, 7);
            f18356o.append(g.f18584d6, 8);
            f18356o.append(g.f18592e6, 9);
            f18356o.append(g.f18640k6, 10);
            f18356o.append(g.f18648l6, 11);
            f18356o.append(g.f18656m6, 12);
        }

        public void a(e eVar) {
            this.f18357a = eVar.f18357a;
            this.f18358b = eVar.f18358b;
            this.f18359c = eVar.f18359c;
            this.f18360d = eVar.f18360d;
            this.f18361e = eVar.f18361e;
            this.f18362f = eVar.f18362f;
            this.f18363g = eVar.f18363g;
            this.f18364h = eVar.f18364h;
            this.f18365i = eVar.f18365i;
            this.f18366j = eVar.f18366j;
            this.f18367k = eVar.f18367k;
            this.f18368l = eVar.f18368l;
            this.f18369m = eVar.f18369m;
            this.f18370n = eVar.f18370n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.Transform);
            this.f18357a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f18356o.get(index)) {
                    case 1:
                        this.f18358b = obtainStyledAttributes.getFloat(index, this.f18358b);
                        break;
                    case 2:
                        this.f18359c = obtainStyledAttributes.getFloat(index, this.f18359c);
                        break;
                    case 3:
                        this.f18360d = obtainStyledAttributes.getFloat(index, this.f18360d);
                        break;
                    case 4:
                        this.f18361e = obtainStyledAttributes.getFloat(index, this.f18361e);
                        break;
                    case 5:
                        this.f18362f = obtainStyledAttributes.getFloat(index, this.f18362f);
                        break;
                    case 6:
                        this.f18363g = obtainStyledAttributes.getDimension(index, this.f18363g);
                        break;
                    case 7:
                        this.f18364h = obtainStyledAttributes.getDimension(index, this.f18364h);
                        break;
                    case 8:
                        this.f18366j = obtainStyledAttributes.getDimension(index, this.f18366j);
                        break;
                    case 9:
                        this.f18367k = obtainStyledAttributes.getDimension(index, this.f18367k);
                        break;
                    case 10:
                        this.f18368l = obtainStyledAttributes.getDimension(index, this.f18368l);
                        break;
                    case 11:
                        this.f18369m = true;
                        this.f18370n = obtainStyledAttributes.getDimension(index, this.f18370n);
                        break;
                    case 12:
                        this.f18365i = d.s(obtainStyledAttributes, index, this.f18365i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f18248f.append(g.f18602g0, 25);
        f18248f.append(g.f18610h0, 26);
        f18248f.append(g.f18626j0, 29);
        f18248f.append(g.f18634k0, 30);
        f18248f.append(g.f18682q0, 36);
        f18248f.append(g.f18674p0, 35);
        f18248f.append(g.f18462N, 4);
        f18248f.append(g.f18455M, 3);
        f18248f.append(g.f18427I, 1);
        f18248f.append(g.f18441K, 91);
        f18248f.append(g.f18434J, 92);
        f18248f.append(g.f18747z0, 6);
        f18248f.append(g.f18372A0, 7);
        f18248f.append(g.f18511U, 17);
        f18248f.append(g.f18518V, 18);
        f18248f.append(g.f18525W, 19);
        f18248f.append(g.f18399E, 99);
        f18248f.append(g.f18553a, 27);
        f18248f.append(g.f18642l0, 32);
        f18248f.append(g.f18650m0, 33);
        f18248f.append(g.f18504T, 10);
        f18248f.append(g.f18497S, 9);
        f18248f.append(g.f18393D0, 13);
        f18248f.append(g.f18414G0, 16);
        f18248f.append(g.f18400E0, 14);
        f18248f.append(g.f18379B0, 11);
        f18248f.append(g.f18407F0, 15);
        f18248f.append(g.f18386C0, 12);
        f18248f.append(g.f18705t0, 40);
        f18248f.append(g.f18586e0, 39);
        f18248f.append(g.f18578d0, 41);
        f18248f.append(g.f18698s0, 42);
        f18248f.append(g.f18570c0, 20);
        f18248f.append(g.f18690r0, 37);
        f18248f.append(g.f18490R, 5);
        f18248f.append(g.f18594f0, 87);
        f18248f.append(g.f18666o0, 87);
        f18248f.append(g.f18618i0, 87);
        f18248f.append(g.f18448L, 87);
        f18248f.append(g.f18420H, 87);
        f18248f.append(g.f18593f, 24);
        f18248f.append(g.f18609h, 28);
        f18248f.append(g.f18704t, 31);
        f18248f.append(g.f18711u, 8);
        f18248f.append(g.f18601g, 34);
        f18248f.append(g.f18617i, 2);
        f18248f.append(g.f18577d, 23);
        f18248f.append(g.f18585e, 21);
        f18248f.append(g.f18712u0, 95);
        f18248f.append(g.f18532X, 96);
        f18248f.append(g.f18569c, 22);
        f18248f.append(g.f18625j, 43);
        f18248f.append(g.f18725w, 44);
        f18248f.append(g.f18689r, 45);
        f18248f.append(g.f18697s, 46);
        f18248f.append(g.f18681q, 60);
        f18248f.append(g.f18665o, 47);
        f18248f.append(g.f18673p, 48);
        f18248f.append(g.f18633k, 49);
        f18248f.append(g.f18641l, 50);
        f18248f.append(g.f18649m, 51);
        f18248f.append(g.f18657n, 52);
        f18248f.append(g.f18718v, 53);
        f18248f.append(g.f18719v0, 54);
        f18248f.append(g.f18539Y, 55);
        f18248f.append(g.f18726w0, 56);
        f18248f.append(g.f18546Z, 57);
        f18248f.append(g.f18733x0, 58);
        f18248f.append(g.f18554a0, 59);
        f18248f.append(g.f18469O, 61);
        f18248f.append(g.f18483Q, 62);
        f18248f.append(g.f18476P, 63);
        f18248f.append(g.f18732x, 64);
        f18248f.append(g.f18484Q0, 65);
        f18248f.append(g.f18392D, 66);
        f18248f.append(g.f18491R0, 67);
        f18248f.append(g.f18435J0, 79);
        f18248f.append(g.f18561b, 38);
        f18248f.append(g.f18428I0, 68);
        f18248f.append(g.f18740y0, 69);
        f18248f.append(g.f18562b0, 70);
        f18248f.append(g.f18421H0, 97);
        f18248f.append(g.f18378B, 71);
        f18248f.append(g.f18746z, 72);
        f18248f.append(g.f18371A, 73);
        f18248f.append(g.f18385C, 74);
        f18248f.append(g.f18739y, 75);
        f18248f.append(g.f18442K0, 76);
        f18248f.append(g.f18658n0, 77);
        f18248f.append(g.f18498S0, 78);
        f18248f.append(g.f18413G, 80);
        f18248f.append(g.f18406F, 81);
        f18248f.append(g.f18449L0, 82);
        f18248f.append(g.f18477P0, 83);
        f18248f.append(g.f18470O0, 84);
        f18248f.append(g.f18463N0, 85);
        f18248f.append(g.f18456M0, 86);
        f18249g.append(g.f18515U3, 6);
        f18249g.append(g.f18515U3, 7);
        f18249g.append(g.f18479P2, 27);
        f18249g.append(g.f18536X3, 13);
        f18249g.append(g.f18558a4, 16);
        f18249g.append(g.f18543Y3, 14);
        f18249g.append(g.f18522V3, 11);
        f18249g.append(g.f18550Z3, 15);
        f18249g.append(g.f18529W3, 12);
        f18249g.append(g.f18473O3, 40);
        f18249g.append(g.f18424H3, 39);
        f18249g.append(g.f18417G3, 41);
        f18249g.append(g.f18466N3, 42);
        f18249g.append(g.f18410F3, 20);
        f18249g.append(g.f18459M3, 37);
        f18249g.append(g.f18750z3, 5);
        f18249g.append(g.f18431I3, 87);
        f18249g.append(g.f18452L3, 87);
        f18249g.append(g.f18438J3, 87);
        f18249g.append(g.f18729w3, 87);
        f18249g.append(g.f18722v3, 87);
        f18249g.append(g.f18514U2, 24);
        f18249g.append(g.f18528W2, 28);
        f18249g.append(g.f18621i3, 31);
        f18249g.append(g.f18629j3, 8);
        f18249g.append(g.f18521V2, 34);
        f18249g.append(g.f18535X2, 2);
        f18249g.append(g.f18500S2, 23);
        f18249g.append(g.f18507T2, 21);
        f18249g.append(g.f18480P3, 95);
        f18249g.append(g.f18375A3, 96);
        f18249g.append(g.f18493R2, 22);
        f18249g.append(g.f18542Y2, 43);
        f18249g.append(g.f18645l3, 44);
        f18249g.append(g.f18605g3, 45);
        f18249g.append(g.f18613h3, 46);
        f18249g.append(g.f18597f3, 60);
        f18249g.append(g.f18581d3, 47);
        f18249g.append(g.f18589e3, 48);
        f18249g.append(g.f18549Z2, 49);
        f18249g.append(g.f18557a3, 50);
        f18249g.append(g.f18565b3, 51);
        f18249g.append(g.f18573c3, 52);
        f18249g.append(g.f18637k3, 53);
        f18249g.append(g.f18487Q3, 54);
        f18249g.append(g.f18382B3, 55);
        f18249g.append(g.f18494R3, 56);
        f18249g.append(g.f18389C3, 57);
        f18249g.append(g.f18501S3, 58);
        f18249g.append(g.f18396D3, 59);
        f18249g.append(g.f18743y3, 62);
        f18249g.append(g.f18736x3, 63);
        f18249g.append(g.f18653m3, 64);
        f18249g.append(g.f18646l4, 65);
        f18249g.append(g.f18701s3, 66);
        f18249g.append(g.f18654m4, 67);
        f18249g.append(g.f18582d4, 79);
        f18249g.append(g.f18486Q2, 38);
        f18249g.append(g.f18590e4, 98);
        f18249g.append(g.f18574c4, 68);
        f18249g.append(g.f18508T3, 69);
        f18249g.append(g.f18403E3, 70);
        f18249g.append(g.f18685q3, 71);
        f18249g.append(g.f18669o3, 72);
        f18249g.append(g.f18677p3, 73);
        f18249g.append(g.f18693r3, 74);
        f18249g.append(g.f18661n3, 75);
        f18249g.append(g.f18598f4, 76);
        f18249g.append(g.f18445K3, 77);
        f18249g.append(g.f18662n4, 78);
        f18249g.append(g.f18715u3, 80);
        f18249g.append(g.f18708t3, 81);
        f18249g.append(g.f18606g4, 82);
        f18249g.append(g.f18638k4, 83);
        f18249g.append(g.f18630j4, 84);
        f18249g.append(g.f18622i4, 85);
        f18249g.append(g.f18614h4, 86);
        f18249g.append(g.f18566b4, 97);
    }

    public static int s(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        boolean z10;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        if (i12 == 3) {
            u(obj, typedArray.getString(i10), i11);
            return;
        }
        int i13 = 0;
        if (i12 != 5) {
            dimensionPixelSize = typedArray.getInt(i10, 0);
            if (dimensionPixelSize == -4) {
                z10 = true;
                i13 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z10 = false;
            }
            if (!(obj instanceof ConstraintLayout.b)) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = i13;
                    bVar.f18149a0 = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) bVar).height = i13;
                    bVar.f18151b0 = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (i11 == 0) {
                    bVar2.f18300d = i13;
                    bVar2.f18319m0 = z10;
                    return;
                } else {
                    bVar2.f18302e = i13;
                    bVar2.f18321n0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C0354a) {
                a.C0354a c0354a = (a.C0354a) obj;
                if (i11 == 0) {
                    c0354a.b(23, i13);
                    c0354a.d(80, z10);
                    return;
                } else {
                    c0354a.b(21, i13);
                    c0354a.d(81, z10);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        i13 = dimensionPixelSize;
        z10 = false;
        if (!(obj instanceof ConstraintLayout.b)) {
        }
    }

    public static void u(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    v(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f18268A = trim2;
                    return;
                } else {
                    if (obj instanceof a.C0354a) {
                        ((a.C0354a) obj).c(5, trim2);
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
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.f18133L = parseFloat;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.f18134M = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f18300d = 0;
                            bVar3.f18290W = parseFloat;
                            return;
                        } else {
                            bVar3.f18302e = 0;
                            bVar3.f18289V = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof a.C0354a) {
                        a.C0354a c0354a = (a.C0354a) obj;
                        if (i10 == 0) {
                            c0354a.b(23, 0);
                            c0354a.a(39, parseFloat);
                            return;
                        } else {
                            c0354a.b(21, 0);
                            c0354a.a(40, parseFloat);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(trim)) {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.f18143V = max;
                            bVar4.f18137P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.f18144W = max;
                            bVar4.f18138Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f18300d = 0;
                            bVar5.f18305f0 = max;
                            bVar5.f18293Z = 2;
                            return;
                        } else {
                            bVar5.f18302e = 0;
                            bVar5.f18307g0 = max;
                            bVar5.f18295a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0354a) {
                        a.C0354a c0354a2 = (a.C0354a) obj;
                        if (i10 == 0) {
                            c0354a2.b(23, 0);
                            c0354a2.b(54, 2);
                        } else {
                            c0354a2.b(21, 0);
                            c0354a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void v(ConstraintLayout.b bVar, String str) {
        float f10 = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i11);
                    if (substring2.length() > 0) {
                        f10 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i11, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f10 = i10 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f18130I = str;
        bVar.f18131J = f10;
        bVar.f18132K = i10;
    }

    public static void x(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0354a c0354a = new a.C0354a();
        aVar.f18262h = c0354a;
        aVar.f18258d.f18337a = false;
        aVar.f18259e.f18296b = false;
        aVar.f18257c.f18351a = false;
        aVar.f18260f.f18357a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f18249g.get(index)) {
                case 2:
                    c0354a.b(2, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18278K));
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
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f18248f.get(index));
                    break;
                case 5:
                    c0354a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0354a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f18259e.f18272E));
                    break;
                case 7:
                    c0354a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f18259e.f18273F));
                    break;
                case 8:
                    c0354a.b(8, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18279L));
                    break;
                case 11:
                    c0354a.b(11, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18285R));
                    break;
                case 12:
                    c0354a.b(12, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18286S));
                    break;
                case 13:
                    c0354a.b(13, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18282O));
                    break;
                case 14:
                    c0354a.b(14, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18284Q));
                    break;
                case 15:
                    c0354a.b(15, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18287T));
                    break;
                case 16:
                    c0354a.b(16, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18283P));
                    break;
                case 17:
                    c0354a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f18259e.f18304f));
                    break;
                case 18:
                    c0354a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f18259e.f18306g));
                    break;
                case 19:
                    c0354a.a(19, typedArray.getFloat(index, aVar.f18259e.f18308h));
                    break;
                case 20:
                    c0354a.a(20, typedArray.getFloat(index, aVar.f18259e.f18334y));
                    break;
                case 21:
                    c0354a.b(21, typedArray.getLayoutDimension(index, aVar.f18259e.f18302e));
                    break;
                case 22:
                    c0354a.b(22, VISIBILITY_FLAGS[typedArray.getInt(index, aVar.f18257c.f18352b)]);
                    break;
                case 23:
                    c0354a.b(23, typedArray.getLayoutDimension(index, aVar.f18259e.f18300d));
                    break;
                case 24:
                    c0354a.b(24, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18275H));
                    break;
                case 27:
                    c0354a.b(27, typedArray.getInt(index, aVar.f18259e.f18274G));
                    break;
                case 28:
                    c0354a.b(28, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18276I));
                    break;
                case 31:
                    c0354a.b(31, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18280M));
                    break;
                case 34:
                    c0354a.b(34, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18277J));
                    break;
                case 37:
                    c0354a.a(37, typedArray.getFloat(index, aVar.f18259e.f18335z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f18255a);
                    aVar.f18255a = resourceId;
                    c0354a.b(38, resourceId);
                    break;
                case 39:
                    c0354a.a(39, typedArray.getFloat(index, aVar.f18259e.f18290W));
                    break;
                case 40:
                    c0354a.a(40, typedArray.getFloat(index, aVar.f18259e.f18289V));
                    break;
                case 41:
                    c0354a.b(41, typedArray.getInt(index, aVar.f18259e.f18291X));
                    break;
                case 42:
                    c0354a.b(42, typedArray.getInt(index, aVar.f18259e.f18292Y));
                    break;
                case 43:
                    c0354a.a(43, typedArray.getFloat(index, aVar.f18257c.f18354d));
                    break;
                case 44:
                    c0354a.d(44, true);
                    c0354a.a(44, typedArray.getDimension(index, aVar.f18260f.f18370n));
                    break;
                case 45:
                    c0354a.a(45, typedArray.getFloat(index, aVar.f18260f.f18359c));
                    break;
                case 46:
                    c0354a.a(46, typedArray.getFloat(index, aVar.f18260f.f18360d));
                    break;
                case 47:
                    c0354a.a(47, typedArray.getFloat(index, aVar.f18260f.f18361e));
                    break;
                case 48:
                    c0354a.a(48, typedArray.getFloat(index, aVar.f18260f.f18362f));
                    break;
                case 49:
                    c0354a.a(49, typedArray.getDimension(index, aVar.f18260f.f18363g));
                    break;
                case 50:
                    c0354a.a(50, typedArray.getDimension(index, aVar.f18260f.f18364h));
                    break;
                case 51:
                    c0354a.a(51, typedArray.getDimension(index, aVar.f18260f.f18366j));
                    break;
                case 52:
                    c0354a.a(52, typedArray.getDimension(index, aVar.f18260f.f18367k));
                    break;
                case 53:
                    c0354a.a(53, typedArray.getDimension(index, aVar.f18260f.f18368l));
                    break;
                case 54:
                    c0354a.b(54, typedArray.getInt(index, aVar.f18259e.f18293Z));
                    break;
                case 55:
                    c0354a.b(55, typedArray.getInt(index, aVar.f18259e.f18295a0));
                    break;
                case 56:
                    c0354a.b(56, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18297b0));
                    break;
                case 57:
                    c0354a.b(57, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18299c0));
                    break;
                case 58:
                    c0354a.b(58, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18301d0));
                    break;
                case 59:
                    c0354a.b(59, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18303e0));
                    break;
                case 60:
                    c0354a.a(60, typedArray.getFloat(index, aVar.f18260f.f18358b));
                    break;
                case 62:
                    c0354a.b(62, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18270C));
                    break;
                case 63:
                    c0354a.a(63, typedArray.getFloat(index, aVar.f18259e.f18271D));
                    break;
                case 64:
                    c0354a.b(64, s(typedArray, index, aVar.f18258d.f18338b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0354a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0354a.c(65, C4313a.NAMED_EASING[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0354a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0354a.a(67, typedArray.getFloat(index, aVar.f18258d.f18345i));
                    break;
                case 68:
                    c0354a.a(68, typedArray.getFloat(index, aVar.f18257c.f18355e));
                    break;
                case 69:
                    c0354a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0354a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0354a.b(72, typedArray.getInt(index, aVar.f18259e.f18309h0));
                    break;
                case 73:
                    c0354a.b(73, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18311i0));
                    break;
                case 74:
                    c0354a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0354a.d(75, typedArray.getBoolean(index, aVar.f18259e.f18323o0));
                    break;
                case 76:
                    c0354a.b(76, typedArray.getInt(index, aVar.f18258d.f18341e));
                    break;
                case 77:
                    c0354a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0354a.b(78, typedArray.getInt(index, aVar.f18257c.f18353c));
                    break;
                case 79:
                    c0354a.a(79, typedArray.getFloat(index, aVar.f18258d.f18343g));
                    break;
                case 80:
                    c0354a.d(80, typedArray.getBoolean(index, aVar.f18259e.f18319m0));
                    break;
                case 81:
                    c0354a.d(81, typedArray.getBoolean(index, aVar.f18259e.f18321n0));
                    break;
                case 82:
                    c0354a.b(82, typedArray.getInteger(index, aVar.f18258d.f18339c));
                    break;
                case 83:
                    c0354a.b(83, s(typedArray, index, aVar.f18260f.f18365i));
                    break;
                case 84:
                    c0354a.b(84, typedArray.getInteger(index, aVar.f18258d.f18347k));
                    break;
                case 85:
                    c0354a.a(85, typedArray.getFloat(index, aVar.f18258d.f18346j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f18258d.f18350n = typedArray.getResourceId(index, -1);
                        c0354a.b(89, aVar.f18258d.f18350n);
                        c cVar = aVar.f18258d;
                        if (cVar.f18350n != -1) {
                            cVar.f18349m = -2;
                            c0354a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f18258d.f18348l = typedArray.getString(index);
                        c0354a.c(90, aVar.f18258d.f18348l);
                        if (aVar.f18258d.f18348l.indexOf("/") > 0) {
                            aVar.f18258d.f18350n = typedArray.getResourceId(index, -1);
                            c0354a.b(89, aVar.f18258d.f18350n);
                            aVar.f18258d.f18349m = -2;
                            c0354a.b(88, -2);
                            break;
                        } else {
                            aVar.f18258d.f18349m = -1;
                            c0354a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f18258d;
                        cVar2.f18349m = typedArray.getInteger(index, cVar2.f18350n);
                        c0354a.b(88, aVar.f18258d.f18349m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f18248f.get(index));
                    break;
                case 93:
                    c0354a.b(93, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18281N));
                    break;
                case 94:
                    c0354a.b(94, typedArray.getDimensionPixelSize(index, aVar.f18259e.f18288U));
                    break;
                case 95:
                    t(c0354a, typedArray, index, 0);
                    break;
                case 96:
                    t(c0354a, typedArray, index, 1);
                    break;
                case 97:
                    c0354a.b(97, typedArray.getInt(index, aVar.f18259e.f18325p0));
                    break;
                case 98:
                    if (AbstractC4516b.f47913z) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f18255a);
                        aVar.f18255a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f18256b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f18256b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f18255a = typedArray.getResourceId(index, aVar.f18255a);
                        break;
                    }
                case 99:
                    c0354a.d(99, typedArray.getBoolean(index, aVar.f18259e.f18310i));
                    break;
            }
        }
    }

    public final String A(int i10) {
        switch (i10) {
            case 1:
                return ViewProps.LEFT;
            case 2:
                return ViewProps.RIGHT;
            case 3:
                return ViewProps.TOP;
            case 4:
                return ViewProps.BOTTOM;
            case 5:
                return "baseline";
            case 6:
                return ViewProps.START;
            case 7:
                return ViewProps.END;
            default:
                return "undefined";
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f18254e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f18254e.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC4515a.a(childAt));
            } else {
                if (this.f18253d && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1 && this.f18254e.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = (a) this.f18254e.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f18259e.f18313j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f18259e.f18309h0);
                            barrier.setMargin(aVar.f18259e.f18311i0);
                            barrier.setAllowsGoneWidget(aVar.f18259e.f18323o0);
                            b bVar = aVar.f18259e;
                            int[] iArr = bVar.mReferenceIds;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f18315k0;
                                if (str != null) {
                                    bVar.mReferenceIds = n(barrier, str);
                                    barrier.setReferencedIds(aVar.f18259e.mReferenceIds);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f18261g);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0355d c0355d = aVar.f18257c;
                        if (c0355d.f18353c == 0) {
                            childAt.setVisibility(c0355d.f18352b);
                        }
                        childAt.setAlpha(aVar.f18257c.f18354d);
                        childAt.setRotation(aVar.f18260f.f18358b);
                        childAt.setRotationX(aVar.f18260f.f18359c);
                        childAt.setRotationY(aVar.f18260f.f18360d);
                        childAt.setScaleX(aVar.f18260f.f18361e);
                        childAt.setScaleY(aVar.f18260f.f18362f);
                        e eVar = aVar.f18260f;
                        if (eVar.f18365i != -1) {
                            if (((View) childAt.getParent()).findViewById(aVar.f18260f.f18365i) != null) {
                                float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - childAt.getLeft());
                                    childAt.setPivotY(top - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f18363g)) {
                                childAt.setPivotX(aVar.f18260f.f18363g);
                            }
                            if (!Float.isNaN(aVar.f18260f.f18364h)) {
                                childAt.setPivotY(aVar.f18260f.f18364h);
                            }
                        }
                        childAt.setTranslationX(aVar.f18260f.f18366j);
                        childAt.setTranslationY(aVar.f18260f.f18367k);
                        childAt.setTranslationZ(aVar.f18260f.f18368l);
                        e eVar2 = aVar.f18260f;
                        if (eVar2.f18369m) {
                            childAt.setElevation(eVar2.f18370n);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f18254e.get(num);
            if (aVar2 != null) {
                if (aVar2.f18259e.f18313j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f18259e;
                    int[] iArr2 = bVar3.mReferenceIds;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f18315k0;
                        if (str2 != null) {
                            bVar3.mReferenceIds = n(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f18259e.mReferenceIds);
                        }
                    }
                    barrier2.setType(aVar2.f18259e.f18309h0);
                    barrier2.setMargin(aVar2.f18259e.f18311i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.o();
                    aVar2.b(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f18259e.f18294a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.b(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f18254e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f18253d && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f18254e.containsKey(Integer.valueOf(id2))) {
                this.f18254e.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f18254e.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f18261g = androidx.constraintlayout.widget.a.a(this.f18252c, childAt);
                aVar.d(id2, bVar);
                aVar.f18257c.f18352b = childAt.getVisibility();
                aVar.f18257c.f18354d = childAt.getAlpha();
                aVar.f18260f.f18358b = childAt.getRotation();
                aVar.f18260f.f18359c = childAt.getRotationX();
                aVar.f18260f.f18360d = childAt.getRotationY();
                aVar.f18260f.f18361e = childAt.getScaleX();
                aVar.f18260f.f18362f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f18260f;
                    eVar.f18363g = pivotX;
                    eVar.f18364h = pivotY;
                }
                aVar.f18260f.f18366j = childAt.getTranslationX();
                aVar.f18260f.f18367k = childAt.getTranslationY();
                aVar.f18260f.f18368l = childAt.getTranslationZ();
                e eVar2 = aVar.f18260f;
                if (eVar2.f18369m) {
                    eVar2.f18370n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f18259e.f18323o0 = barrier.getAllowsGoneWidget();
                    aVar.f18259e.mReferenceIds = barrier.getReferencedIds();
                    aVar.f18259e.f18309h0 = barrier.getType();
                    aVar.f18259e.f18311i0 = barrier.getMargin();
                }
            }
        }
    }

    public void g(d dVar) {
        this.f18254e.clear();
        for (Integer num : dVar.f18254e.keySet()) {
            a aVar = (a) dVar.f18254e.get(num);
            if (aVar != null) {
                this.f18254e.put(num, aVar.clone());
            }
        }
    }

    public void h(int i10, int i11, int i12, int i13) {
        if (!this.f18254e.containsKey(Integer.valueOf(i10))) {
            this.f18254e.put(Integer.valueOf(i10), new a());
        }
        a aVar = (a) this.f18254e.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f18259e;
                    bVar.f18312j = i12;
                    bVar.f18314k = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar2 = aVar.f18259e;
                    bVar2.f18314k = i12;
                    bVar2.f18312j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + A(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f18259e;
                    bVar3.f18316l = i12;
                    bVar3.f18318m = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f18259e;
                    bVar4.f18318m = i12;
                    bVar4.f18316l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f18259e;
                    bVar5.f18320n = i12;
                    bVar5.f18322o = -1;
                    bVar5.f18327r = -1;
                    bVar5.f18328s = -1;
                    bVar5.f18329t = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                }
                b bVar6 = aVar.f18259e;
                bVar6.f18322o = i12;
                bVar6.f18320n = -1;
                bVar6.f18327r = -1;
                bVar6.f18328s = -1;
                bVar6.f18329t = -1;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f18259e;
                    bVar7.f18326q = i12;
                    bVar7.f18324p = -1;
                    bVar7.f18327r = -1;
                    bVar7.f18328s = -1;
                    bVar7.f18329t = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                }
                b bVar8 = aVar.f18259e;
                bVar8.f18324p = i12;
                bVar8.f18326q = -1;
                bVar8.f18327r = -1;
                bVar8.f18328s = -1;
                bVar8.f18329t = -1;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f18259e;
                    bVar9.f18327r = i12;
                    bVar9.f18326q = -1;
                    bVar9.f18324p = -1;
                    bVar9.f18320n = -1;
                    bVar9.f18322o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f18259e;
                    bVar10.f18328s = i12;
                    bVar10.f18326q = -1;
                    bVar10.f18324p = -1;
                    bVar10.f18320n = -1;
                    bVar10.f18322o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                }
                b bVar11 = aVar.f18259e;
                bVar11.f18329t = i12;
                bVar11.f18326q = -1;
                bVar11.f18324p = -1;
                bVar11.f18320n = -1;
                bVar11.f18322o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f18259e;
                    bVar12.f18331v = i12;
                    bVar12.f18330u = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar13 = aVar.f18259e;
                    bVar13.f18330u = i12;
                    bVar13.f18331v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f18259e;
                    bVar14.f18333x = i12;
                    bVar14.f18332w = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar15 = aVar.f18259e;
                    bVar15.f18332w = i12;
                    bVar15.f18333x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(A(i11) + " to " + A(i13) + " unknown");
        }
    }

    public void i(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f18254e.containsKey(Integer.valueOf(i10))) {
            this.f18254e.put(Integer.valueOf(i10), new a());
        }
        a aVar = (a) this.f18254e.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f18259e;
                    bVar.f18312j = i12;
                    bVar.f18314k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + A(i13) + " undefined");
                    }
                    b bVar2 = aVar.f18259e;
                    bVar2.f18314k = i12;
                    bVar2.f18312j = -1;
                }
                aVar.f18259e.f18275H = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f18259e;
                    bVar3.f18316l = i12;
                    bVar3.f18318m = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                    }
                    b bVar4 = aVar.f18259e;
                    bVar4.f18318m = i12;
                    bVar4.f18316l = -1;
                }
                aVar.f18259e.f18276I = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f18259e;
                    bVar5.f18320n = i12;
                    bVar5.f18322o = -1;
                    bVar5.f18327r = -1;
                    bVar5.f18328s = -1;
                    bVar5.f18329t = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                    }
                    b bVar6 = aVar.f18259e;
                    bVar6.f18322o = i12;
                    bVar6.f18320n = -1;
                    bVar6.f18327r = -1;
                    bVar6.f18328s = -1;
                    bVar6.f18329t = -1;
                }
                aVar.f18259e.f18277J = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f18259e;
                    bVar7.f18326q = i12;
                    bVar7.f18324p = -1;
                    bVar7.f18327r = -1;
                    bVar7.f18328s = -1;
                    bVar7.f18329t = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                    }
                    b bVar8 = aVar.f18259e;
                    bVar8.f18324p = i12;
                    bVar8.f18326q = -1;
                    bVar8.f18327r = -1;
                    bVar8.f18328s = -1;
                    bVar8.f18329t = -1;
                }
                aVar.f18259e.f18278K = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar9 = aVar.f18259e;
                    bVar9.f18327r = i12;
                    bVar9.f18326q = -1;
                    bVar9.f18324p = -1;
                    bVar9.f18320n = -1;
                    bVar9.f18322o = -1;
                    return;
                }
                if (i13 == 3) {
                    b bVar10 = aVar.f18259e;
                    bVar10.f18328s = i12;
                    bVar10.f18326q = -1;
                    bVar10.f18324p = -1;
                    bVar10.f18320n = -1;
                    bVar10.f18322o = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                }
                b bVar11 = aVar.f18259e;
                bVar11.f18329t = i12;
                bVar11.f18326q = -1;
                bVar11.f18324p = -1;
                bVar11.f18320n = -1;
                bVar11.f18322o = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar12 = aVar.f18259e;
                    bVar12.f18331v = i12;
                    bVar12.f18330u = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                    }
                    b bVar13 = aVar.f18259e;
                    bVar13.f18330u = i12;
                    bVar13.f18331v = -1;
                }
                aVar.f18259e.f18280M = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar14 = aVar.f18259e;
                    bVar14.f18333x = i12;
                    bVar14.f18332w = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + A(i13) + " undefined");
                    }
                    b bVar15 = aVar.f18259e;
                    bVar15.f18332w = i12;
                    bVar15.f18333x = -1;
                }
                aVar.f18259e.f18279L = i14;
                return;
            default:
                throw new IllegalArgumentException(A(i11) + " to " + A(i13) + " unknown");
        }
    }

    public void j(int i10, int i11, int i12, float f10) {
        b bVar = p(i10).f18259e;
        bVar.f18269B = i11;
        bVar.f18270C = i12;
        bVar.f18271D = f10;
    }

    public void k(int i10, int i11) {
        p(i10).f18259e.f18295a0 = i11;
    }

    public void l(int i10, int i11) {
        p(i10).f18259e.f18302e = i11;
    }

    public void m(int i10, int i11) {
        p(i10).f18259e.f18300d = i11;
    }

    public final int[] n(View view, String str) {
        int i10;
        Object i11;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i12 = 0;
        int i13 = 0;
        while (i12 < split.length) {
            String trim = split[i12].trim();
            try {
                i10 = f.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, StackTraceHelper.ID_KEY, context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (i11 = ((ConstraintLayout) view.getParent()).i(0, trim)) != null && (i11 instanceof Integer)) {
                i10 = ((Integer) i11).intValue();
            }
            iArr[i13] = i10;
            i12++;
            i13++;
        }
        return i13 != split.length ? Arrays.copyOf(iArr, i13) : iArr;
    }

    public final a o(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? g.ConstraintOverride : g.Constraint);
        w(aVar, obtainStyledAttributes, z10);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final a p(int i10) {
        if (!this.f18254e.containsKey(Integer.valueOf(i10))) {
            this.f18254e.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f18254e.get(Integer.valueOf(i10));
    }

    public void q(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a o10 = o(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        o10.f18259e.f18294a = true;
                    }
                    this.f18254e.put(Integer.valueOf(o10.f18255a), o10);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ae, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f18259e.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            }
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f18258d.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            }
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                aVar = o(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            } else {
                                continue;
                            }
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f18257c.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            }
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f18260f.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            }
                        case -71750448:
                            if (name.equals("Guideline")) {
                                aVar = o(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVar.f18259e;
                                bVar.f18294a = true;
                                bVar.f18296b = true;
                                break;
                            } else {
                                continue;
                            }
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (name.equals("Barrier")) {
                                aVar = o(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVar.f18259e.f18313j0 = 1;
                                break;
                            } else {
                                continue;
                            }
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                break;
                            } else {
                                continue;
                            }
                        case 1803088381:
                            if (name.equals("Constraint")) {
                                aVar = o(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            } else {
                                continue;
                            }
                    }
                    if (aVar == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.a.b(context, xmlPullParser, aVar.f18261g);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                                break;
                            } else {
                                break;
                            }
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                                break;
                            } else {
                                break;
                            }
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                                return;
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                    this.f18254e.put(Integer.valueOf(aVar.f18255a), aVar);
                    aVar = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing XML resource", e11);
        }
    }

    public final void w(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            x(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != g.f18561b && g.f18704t != index && g.f18711u != index) {
                aVar.f18258d.f18337a = true;
                aVar.f18259e.f18296b = true;
                aVar.f18257c.f18351a = true;
                aVar.f18260f.f18357a = true;
            }
            switch (f18248f.get(index)) {
                case 1:
                    b bVar = aVar.f18259e;
                    bVar.f18327r = s(typedArray, index, bVar.f18327r);
                    break;
                case 2:
                    b bVar2 = aVar.f18259e;
                    bVar2.f18278K = typedArray.getDimensionPixelSize(index, bVar2.f18278K);
                    break;
                case 3:
                    b bVar3 = aVar.f18259e;
                    bVar3.f18326q = s(typedArray, index, bVar3.f18326q);
                    break;
                case 4:
                    b bVar4 = aVar.f18259e;
                    bVar4.f18324p = s(typedArray, index, bVar4.f18324p);
                    break;
                case 5:
                    aVar.f18259e.f18268A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f18259e;
                    bVar5.f18272E = typedArray.getDimensionPixelOffset(index, bVar5.f18272E);
                    break;
                case 7:
                    b bVar6 = aVar.f18259e;
                    bVar6.f18273F = typedArray.getDimensionPixelOffset(index, bVar6.f18273F);
                    break;
                case 8:
                    b bVar7 = aVar.f18259e;
                    bVar7.f18279L = typedArray.getDimensionPixelSize(index, bVar7.f18279L);
                    break;
                case 9:
                    b bVar8 = aVar.f18259e;
                    bVar8.f18333x = s(typedArray, index, bVar8.f18333x);
                    break;
                case 10:
                    b bVar9 = aVar.f18259e;
                    bVar9.f18332w = s(typedArray, index, bVar9.f18332w);
                    break;
                case 11:
                    b bVar10 = aVar.f18259e;
                    bVar10.f18285R = typedArray.getDimensionPixelSize(index, bVar10.f18285R);
                    break;
                case 12:
                    b bVar11 = aVar.f18259e;
                    bVar11.f18286S = typedArray.getDimensionPixelSize(index, bVar11.f18286S);
                    break;
                case 13:
                    b bVar12 = aVar.f18259e;
                    bVar12.f18282O = typedArray.getDimensionPixelSize(index, bVar12.f18282O);
                    break;
                case 14:
                    b bVar13 = aVar.f18259e;
                    bVar13.f18284Q = typedArray.getDimensionPixelSize(index, bVar13.f18284Q);
                    break;
                case 15:
                    b bVar14 = aVar.f18259e;
                    bVar14.f18287T = typedArray.getDimensionPixelSize(index, bVar14.f18287T);
                    break;
                case 16:
                    b bVar15 = aVar.f18259e;
                    bVar15.f18283P = typedArray.getDimensionPixelSize(index, bVar15.f18283P);
                    break;
                case 17:
                    b bVar16 = aVar.f18259e;
                    bVar16.f18304f = typedArray.getDimensionPixelOffset(index, bVar16.f18304f);
                    break;
                case 18:
                    b bVar17 = aVar.f18259e;
                    bVar17.f18306g = typedArray.getDimensionPixelOffset(index, bVar17.f18306g);
                    break;
                case 19:
                    b bVar18 = aVar.f18259e;
                    bVar18.f18308h = typedArray.getFloat(index, bVar18.f18308h);
                    break;
                case 20:
                    b bVar19 = aVar.f18259e;
                    bVar19.f18334y = typedArray.getFloat(index, bVar19.f18334y);
                    break;
                case 21:
                    b bVar20 = aVar.f18259e;
                    bVar20.f18302e = typedArray.getLayoutDimension(index, bVar20.f18302e);
                    break;
                case 22:
                    C0355d c0355d = aVar.f18257c;
                    c0355d.f18352b = typedArray.getInt(index, c0355d.f18352b);
                    C0355d c0355d2 = aVar.f18257c;
                    c0355d2.f18352b = VISIBILITY_FLAGS[c0355d2.f18352b];
                    break;
                case 23:
                    b bVar21 = aVar.f18259e;
                    bVar21.f18300d = typedArray.getLayoutDimension(index, bVar21.f18300d);
                    break;
                case 24:
                    b bVar22 = aVar.f18259e;
                    bVar22.f18275H = typedArray.getDimensionPixelSize(index, bVar22.f18275H);
                    break;
                case 25:
                    b bVar23 = aVar.f18259e;
                    bVar23.f18312j = s(typedArray, index, bVar23.f18312j);
                    break;
                case 26:
                    b bVar24 = aVar.f18259e;
                    bVar24.f18314k = s(typedArray, index, bVar24.f18314k);
                    break;
                case 27:
                    b bVar25 = aVar.f18259e;
                    bVar25.f18274G = typedArray.getInt(index, bVar25.f18274G);
                    break;
                case 28:
                    b bVar26 = aVar.f18259e;
                    bVar26.f18276I = typedArray.getDimensionPixelSize(index, bVar26.f18276I);
                    break;
                case 29:
                    b bVar27 = aVar.f18259e;
                    bVar27.f18316l = s(typedArray, index, bVar27.f18316l);
                    break;
                case 30:
                    b bVar28 = aVar.f18259e;
                    bVar28.f18318m = s(typedArray, index, bVar28.f18318m);
                    break;
                case 31:
                    b bVar29 = aVar.f18259e;
                    bVar29.f18280M = typedArray.getDimensionPixelSize(index, bVar29.f18280M);
                    break;
                case 32:
                    b bVar30 = aVar.f18259e;
                    bVar30.f18330u = s(typedArray, index, bVar30.f18330u);
                    break;
                case 33:
                    b bVar31 = aVar.f18259e;
                    bVar31.f18331v = s(typedArray, index, bVar31.f18331v);
                    break;
                case 34:
                    b bVar32 = aVar.f18259e;
                    bVar32.f18277J = typedArray.getDimensionPixelSize(index, bVar32.f18277J);
                    break;
                case 35:
                    b bVar33 = aVar.f18259e;
                    bVar33.f18322o = s(typedArray, index, bVar33.f18322o);
                    break;
                case 36:
                    b bVar34 = aVar.f18259e;
                    bVar34.f18320n = s(typedArray, index, bVar34.f18320n);
                    break;
                case 37:
                    b bVar35 = aVar.f18259e;
                    bVar35.f18335z = typedArray.getFloat(index, bVar35.f18335z);
                    break;
                case 38:
                    aVar.f18255a = typedArray.getResourceId(index, aVar.f18255a);
                    break;
                case 39:
                    b bVar36 = aVar.f18259e;
                    bVar36.f18290W = typedArray.getFloat(index, bVar36.f18290W);
                    break;
                case 40:
                    b bVar37 = aVar.f18259e;
                    bVar37.f18289V = typedArray.getFloat(index, bVar37.f18289V);
                    break;
                case 41:
                    b bVar38 = aVar.f18259e;
                    bVar38.f18291X = typedArray.getInt(index, bVar38.f18291X);
                    break;
                case 42:
                    b bVar39 = aVar.f18259e;
                    bVar39.f18292Y = typedArray.getInt(index, bVar39.f18292Y);
                    break;
                case 43:
                    C0355d c0355d3 = aVar.f18257c;
                    c0355d3.f18354d = typedArray.getFloat(index, c0355d3.f18354d);
                    break;
                case 44:
                    e eVar = aVar.f18260f;
                    eVar.f18369m = true;
                    eVar.f18370n = typedArray.getDimension(index, eVar.f18370n);
                    break;
                case 45:
                    e eVar2 = aVar.f18260f;
                    eVar2.f18359c = typedArray.getFloat(index, eVar2.f18359c);
                    break;
                case 46:
                    e eVar3 = aVar.f18260f;
                    eVar3.f18360d = typedArray.getFloat(index, eVar3.f18360d);
                    break;
                case 47:
                    e eVar4 = aVar.f18260f;
                    eVar4.f18361e = typedArray.getFloat(index, eVar4.f18361e);
                    break;
                case 48:
                    e eVar5 = aVar.f18260f;
                    eVar5.f18362f = typedArray.getFloat(index, eVar5.f18362f);
                    break;
                case 49:
                    e eVar6 = aVar.f18260f;
                    eVar6.f18363g = typedArray.getDimension(index, eVar6.f18363g);
                    break;
                case 50:
                    e eVar7 = aVar.f18260f;
                    eVar7.f18364h = typedArray.getDimension(index, eVar7.f18364h);
                    break;
                case 51:
                    e eVar8 = aVar.f18260f;
                    eVar8.f18366j = typedArray.getDimension(index, eVar8.f18366j);
                    break;
                case 52:
                    e eVar9 = aVar.f18260f;
                    eVar9.f18367k = typedArray.getDimension(index, eVar9.f18367k);
                    break;
                case 53:
                    e eVar10 = aVar.f18260f;
                    eVar10.f18368l = typedArray.getDimension(index, eVar10.f18368l);
                    break;
                case 54:
                    b bVar40 = aVar.f18259e;
                    bVar40.f18293Z = typedArray.getInt(index, bVar40.f18293Z);
                    break;
                case 55:
                    b bVar41 = aVar.f18259e;
                    bVar41.f18295a0 = typedArray.getInt(index, bVar41.f18295a0);
                    break;
                case 56:
                    b bVar42 = aVar.f18259e;
                    bVar42.f18297b0 = typedArray.getDimensionPixelSize(index, bVar42.f18297b0);
                    break;
                case 57:
                    b bVar43 = aVar.f18259e;
                    bVar43.f18299c0 = typedArray.getDimensionPixelSize(index, bVar43.f18299c0);
                    break;
                case 58:
                    b bVar44 = aVar.f18259e;
                    bVar44.f18301d0 = typedArray.getDimensionPixelSize(index, bVar44.f18301d0);
                    break;
                case 59:
                    b bVar45 = aVar.f18259e;
                    bVar45.f18303e0 = typedArray.getDimensionPixelSize(index, bVar45.f18303e0);
                    break;
                case 60:
                    e eVar11 = aVar.f18260f;
                    eVar11.f18358b = typedArray.getFloat(index, eVar11.f18358b);
                    break;
                case 61:
                    b bVar46 = aVar.f18259e;
                    bVar46.f18269B = s(typedArray, index, bVar46.f18269B);
                    break;
                case 62:
                    b bVar47 = aVar.f18259e;
                    bVar47.f18270C = typedArray.getDimensionPixelSize(index, bVar47.f18270C);
                    break;
                case 63:
                    b bVar48 = aVar.f18259e;
                    bVar48.f18271D = typedArray.getFloat(index, bVar48.f18271D);
                    break;
                case 64:
                    c cVar = aVar.f18258d;
                    cVar.f18338b = s(typedArray, index, cVar.f18338b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f18258d.f18340d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f18258d.f18340d = C4313a.NAMED_EASING[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f18258d.f18342f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f18258d;
                    cVar2.f18345i = typedArray.getFloat(index, cVar2.f18345i);
                    break;
                case 68:
                    C0355d c0355d4 = aVar.f18257c;
                    c0355d4.f18355e = typedArray.getFloat(index, c0355d4.f18355e);
                    break;
                case 69:
                    aVar.f18259e.f18305f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f18259e.f18307g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f18259e;
                    bVar49.f18309h0 = typedArray.getInt(index, bVar49.f18309h0);
                    break;
                case 73:
                    b bVar50 = aVar.f18259e;
                    bVar50.f18311i0 = typedArray.getDimensionPixelSize(index, bVar50.f18311i0);
                    break;
                case 74:
                    aVar.f18259e.f18315k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f18259e;
                    bVar51.f18323o0 = typedArray.getBoolean(index, bVar51.f18323o0);
                    break;
                case 76:
                    c cVar3 = aVar.f18258d;
                    cVar3.f18341e = typedArray.getInt(index, cVar3.f18341e);
                    break;
                case 77:
                    aVar.f18259e.f18317l0 = typedArray.getString(index);
                    break;
                case 78:
                    C0355d c0355d5 = aVar.f18257c;
                    c0355d5.f18353c = typedArray.getInt(index, c0355d5.f18353c);
                    break;
                case 79:
                    c cVar4 = aVar.f18258d;
                    cVar4.f18343g = typedArray.getFloat(index, cVar4.f18343g);
                    break;
                case 80:
                    b bVar52 = aVar.f18259e;
                    bVar52.f18319m0 = typedArray.getBoolean(index, bVar52.f18319m0);
                    break;
                case 81:
                    b bVar53 = aVar.f18259e;
                    bVar53.f18321n0 = typedArray.getBoolean(index, bVar53.f18321n0);
                    break;
                case 82:
                    c cVar5 = aVar.f18258d;
                    cVar5.f18339c = typedArray.getInteger(index, cVar5.f18339c);
                    break;
                case 83:
                    e eVar12 = aVar.f18260f;
                    eVar12.f18365i = s(typedArray, index, eVar12.f18365i);
                    break;
                case 84:
                    c cVar6 = aVar.f18258d;
                    cVar6.f18347k = typedArray.getInteger(index, cVar6.f18347k);
                    break;
                case 85:
                    c cVar7 = aVar.f18258d;
                    cVar7.f18346j = typedArray.getFloat(index, cVar7.f18346j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f18258d.f18350n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f18258d;
                        if (cVar8.f18350n != -1) {
                            cVar8.f18349m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i11 == 3) {
                        aVar.f18258d.f18348l = typedArray.getString(index);
                        if (aVar.f18258d.f18348l.indexOf("/") > 0) {
                            aVar.f18258d.f18350n = typedArray.getResourceId(index, -1);
                            aVar.f18258d.f18349m = -2;
                            break;
                        } else {
                            aVar.f18258d.f18349m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f18258d;
                        cVar9.f18349m = typedArray.getInteger(index, cVar9.f18350n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f18248f.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f18248f.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f18259e;
                    bVar54.f18328s = s(typedArray, index, bVar54.f18328s);
                    break;
                case 92:
                    b bVar55 = aVar.f18259e;
                    bVar55.f18329t = s(typedArray, index, bVar55.f18329t);
                    break;
                case 93:
                    b bVar56 = aVar.f18259e;
                    bVar56.f18281N = typedArray.getDimensionPixelSize(index, bVar56.f18281N);
                    break;
                case 94:
                    b bVar57 = aVar.f18259e;
                    bVar57.f18288U = typedArray.getDimensionPixelSize(index, bVar57.f18288U);
                    break;
                case 95:
                    t(aVar.f18259e, typedArray, index, 0);
                    break;
                case 96:
                    t(aVar.f18259e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f18259e;
                    bVar58.f18325p0 = typedArray.getInt(index, bVar58.f18325p0);
                    break;
            }
        }
        b bVar59 = aVar.f18259e;
        if (bVar59.f18315k0 != null) {
            bVar59.mReferenceIds = null;
        }
    }

    public void y(int i10, int i11, int i12) {
        a p10 = p(i10);
        switch (i11) {
            case 1:
                p10.f18259e.f18275H = i12;
                return;
            case 2:
                p10.f18259e.f18276I = i12;
                return;
            case 3:
                p10.f18259e.f18277J = i12;
                return;
            case 4:
                p10.f18259e.f18278K = i12;
                return;
            case 5:
                p10.f18259e.f18281N = i12;
                return;
            case 6:
                p10.f18259e.f18280M = i12;
                return;
            case 7:
                p10.f18259e.f18279L = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void z(int i10, int i11) {
        p(i10).f18257c.f18352b = i11;
    }
}
