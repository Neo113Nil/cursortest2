package m4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import java.util.ArrayList;
import java.util.List;
import k4.o;
import l3.C7855a;
import m3.C8049B;
import m3.C8050C;
import m3.InterfaceC8068j;
import m3.N;
import m3.s;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8076a implements o {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f74390h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f74391i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f74392j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f74393a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f74394b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f74395c;

    /* renamed from: d, reason: collision with root package name */
    private final b f74396d;

    /* renamed from: e, reason: collision with root package name */
    private final C1255a f74397e;

    /* renamed from: f, reason: collision with root package name */
    private final h f74398f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f74399g;

    /* renamed from: m4.a$a, reason: collision with other inner class name */
    private static final class C1255a {

        /* renamed from: a, reason: collision with root package name */
        public final int f74400a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f74401b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f74402c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f74403d;

        public C1255a(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f74400a = i11;
            this.f74401b = iArr;
            this.f74402c = iArr2;
            this.f74403d = iArr3;
        }
    }

    /* renamed from: m4.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f74404a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74405b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74406c;

        /* renamed from: d, reason: collision with root package name */
        public final int f74407d;

        /* renamed from: e, reason: collision with root package name */
        public final int f74408e;

        /* renamed from: f, reason: collision with root package name */
        public final int f74409f;

        public b(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f74404a = i11;
            this.f74405b = i12;
            this.f74406c = i13;
            this.f74407d = i14;
            this.f74408e = i15;
            this.f74409f = i16;
        }
    }

    /* renamed from: m4.a$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f74410a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f74411b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f74412c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f74413d;

        public c(int i11, boolean z11, byte[] bArr, byte[] bArr2) {
            this.f74410a = i11;
            this.f74411b = z11;
            this.f74412c = bArr;
            this.f74413d = bArr2;
        }
    }

    /* renamed from: m4.a$d */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f74414a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74415b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f74416c;

        public d(int i11, int i12, SparseArray sparseArray) {
            this.f74414a = i11;
            this.f74415b = i12;
            this.f74416c = sparseArray;
        }
    }

    /* renamed from: m4.a$e */
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f74417a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74418b;

        public e(int i11, int i12) {
            this.f74417a = i11;
            this.f74418b = i12;
        }
    }

    /* renamed from: m4.a$f */
    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f74419a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f74420b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74421c;

        /* renamed from: d, reason: collision with root package name */
        public final int f74422d;

        /* renamed from: e, reason: collision with root package name */
        public final int f74423e;

        /* renamed from: f, reason: collision with root package name */
        public final int f74424f;

        /* renamed from: g, reason: collision with root package name */
        public final int f74425g;

        /* renamed from: h, reason: collision with root package name */
        public final int f74426h;

        /* renamed from: i, reason: collision with root package name */
        public final int f74427i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f74428j;

        public f(int i11, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f74419a = i11;
            this.f74420b = z11;
            this.f74421c = i12;
            this.f74422d = i13;
            this.f74423e = i14;
            this.f74424f = i15;
            this.f74425g = i16;
            this.f74426h = i17;
            this.f74427i = i18;
            this.f74428j = sparseArray;
        }
    }

    /* renamed from: m4.a$g */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f74429a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74430b;

        public g(int i11, int i12) {
            this.f74429a = i11;
            this.f74430b = i12;
        }
    }

    /* renamed from: m4.a$h */
    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f74431a;

        /* renamed from: b, reason: collision with root package name */
        public final int f74432b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f74433c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<C1255a> f74434d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f74435e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<C1255a> f74436f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f74437g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public b f74438h;

        /* renamed from: i, reason: collision with root package name */
        public d f74439i;

        public h(int i11, int i12) {
            this.f74431a = i11;
            this.f74432b = i12;
        }
    }

    public C8076a(List<byte[]> list) {
        C8050C c8050c = new C8050C(list.get(0));
        int L11 = c8050c.L();
        int L12 = c8050c.L();
        Paint paint = new Paint();
        this.f74393a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f74394b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f74395c = new Canvas();
        this.f74396d = new b(719, 575, 0, 719, 0, 575);
        this.f74397e = new C1255a(0, new int[]{0, -1, -16777216, -8421505}, d(), e());
        this.f74398f = new h(L11, L12);
    }

    private static byte[] c(int i11, int i12, C8049B c8049b) {
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) c8049b.h(i12);
        }
        return bArr;
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i11 = 1; i11 < 16; i11++) {
            if (i11 < 8) {
                iArr[i11] = f(255, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i11] = f(255, (i11 & 1) != 0 ? 127 : 0, (i11 & 2) != 0 ? 127 : 0, (i11 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = f(63, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & 136;
                if (i12 == 0) {
                    iArr[i11] = f(255, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 8) {
                    iArr[i11] = f(127, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 128) {
                    iArr[i11] = f(255, ((i11 & 1) != 0 ? 43 : 0) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = f(255, ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i11, int i12, int i13, int i14) {
        return (i11 << 24) | (i12 << 16) | (i13 << 8) | i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe A[LOOP:3: B:87:0x0166->B:98:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(byte[] bArr, int[] iArr, int i11, int i12, int i13, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z11;
        int h11;
        char c11;
        boolean z12;
        int i14;
        int i15;
        int h12;
        int i16;
        byte[] bArr4;
        boolean z13;
        int i17;
        int h13;
        int h14;
        int i18;
        int i19;
        boolean z14;
        int h15;
        Paint paint2 = paint;
        C8049B c8049b = new C8049B(bArr.length, bArr);
        int i21 = i12;
        int i22 = i13;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (c8049b.b() != 0) {
            int h16 = c8049b.h(8);
            if (h16 != 240) {
                int i23 = 3;
                int i24 = 4;
                switch (h16) {
                    case 16:
                        if (i11 == 3) {
                            bArr3 = bArr5 == null ? f74391i : bArr5;
                        } else if (i11 == 2) {
                            bArr3 = bArr7 == null ? f74390h : bArr7;
                        } else {
                            bArr2 = null;
                            z11 = false;
                            while (true) {
                                h11 = c8049b.h(2);
                                if (h11 == 0) {
                                    z12 = z11;
                                    i14 = h11;
                                    i15 = 1;
                                } else {
                                    if (c8049b.g()) {
                                        h12 = c8049b.h(3) + 3;
                                        i14 = c8049b.h(2);
                                    } else if (c8049b.g()) {
                                        z12 = z11;
                                        i15 = 1;
                                        i14 = 0;
                                    } else {
                                        int h17 = c8049b.h(2);
                                        if (h17 == 0) {
                                            c11 = 4;
                                            z12 = true;
                                            i14 = 0;
                                            i15 = 0;
                                        } else if (h17 == 1) {
                                            c11 = 4;
                                            z12 = z11;
                                            i15 = 2;
                                            i14 = 0;
                                        } else if (h17 == 2) {
                                            c11 = 4;
                                            z12 = z11;
                                            i15 = c8049b.h(4) + 12;
                                            i14 = c8049b.h(2);
                                        } else if (h17 != 3) {
                                            z12 = z11;
                                            i14 = 0;
                                            i15 = 0;
                                        } else {
                                            h12 = c8049b.h(8) + 29;
                                            i14 = c8049b.h(2);
                                        }
                                        if (i15 != 0 || paint2 == null) {
                                            i16 = i21;
                                        } else {
                                            if (bArr2 != 0) {
                                                i14 = bArr2[i14];
                                            }
                                            paint2.setColor(iArr[i14]);
                                            i16 = i21;
                                            canvas.drawRect(i21, i22, i21 + i15, i22 + 1, paint2);
                                        }
                                        i21 = i16 + i15;
                                        if (z12) {
                                            c8049b.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z11 = z12;
                                        }
                                    }
                                    z12 = z11;
                                    i15 = h12;
                                }
                                c11 = 4;
                                if (i15 != 0) {
                                }
                                i16 = i21;
                                i21 = i16 + i15;
                                if (z12) {
                                }
                            }
                        }
                        bArr2 = bArr3;
                        z11 = false;
                        while (true) {
                            h11 = c8049b.h(2);
                            if (h11 == 0) {
                            }
                            c11 = 4;
                            if (i15 != 0) {
                            }
                            i16 = i21;
                            i21 = i16 + i15;
                            if (z12) {
                            }
                            paint2 = paint;
                            z11 = z12;
                        }
                    case 17:
                        if (i11 == 3) {
                            bArr4 = bArr6 == null ? f74392j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        boolean z15 = false;
                        while (true) {
                            int h18 = c8049b.h(i24);
                            if (h18 != 0) {
                                z13 = z15;
                                i17 = 1;
                            } else if (c8049b.g()) {
                                if (c8049b.g()) {
                                    int h19 = c8049b.h(2);
                                    if (h19 == 0) {
                                        z13 = z15;
                                        i17 = 1;
                                    } else if (h19 == 1) {
                                        z13 = z15;
                                        i17 = 2;
                                    } else if (h19 == 2) {
                                        h13 = c8049b.h(i24) + 9;
                                        h14 = c8049b.h(i24);
                                    } else if (h19 != i23) {
                                        z13 = z15;
                                        h18 = 0;
                                        i17 = 0;
                                    } else {
                                        h13 = c8049b.h(8) + 25;
                                        h14 = c8049b.h(i24);
                                    }
                                    h18 = 0;
                                } else {
                                    h13 = c8049b.h(2) + i24;
                                    h14 = c8049b.h(i24);
                                }
                                i17 = h13;
                                h18 = h14;
                                z13 = z15;
                            } else {
                                int h21 = c8049b.h(i23);
                                if (h21 != 0) {
                                    z13 = z15;
                                    i17 = h21 + 2;
                                    h18 = 0;
                                } else {
                                    z13 = true;
                                    h18 = 0;
                                    i17 = 0;
                                }
                            }
                            if (i17 == 0 || paint2 == null) {
                                i18 = i21;
                                i19 = i23;
                            } else {
                                if (bArr4 != 0) {
                                    h18 = bArr4[h18];
                                }
                                paint2.setColor(iArr[h18]);
                                i19 = i23;
                                i18 = i21;
                                canvas.drawRect(i21, i22, i21 + i17, i22 + 1, paint2);
                            }
                            i21 = i18 + i17;
                            if (z13) {
                                c8049b.c();
                                break;
                            } else {
                                i23 = i19;
                                z15 = z13;
                                i24 = 4;
                            }
                        }
                    case 18:
                        int i25 = i21;
                        boolean z16 = false;
                        while (true) {
                            int h22 = c8049b.h(8);
                            if (h22 != 0) {
                                z14 = z16;
                                h15 = 1;
                            } else if (c8049b.g()) {
                                z14 = z16;
                                h15 = c8049b.h(7);
                                h22 = c8049b.h(8);
                            } else {
                                int h23 = c8049b.h(7);
                                if (h23 != 0) {
                                    z14 = z16;
                                    h15 = h23;
                                    h22 = 0;
                                } else {
                                    z14 = true;
                                    h22 = 0;
                                    h15 = 0;
                                }
                            }
                            if (h15 != 0 && paint2 != null) {
                                paint2.setColor(iArr[h22]);
                                canvas.drawRect(i25, i22, i25 + h15, i22 + 1, paint2);
                            }
                            i25 += h15;
                            if (z14) {
                                i21 = i25;
                                break;
                            } else {
                                z16 = z14;
                            }
                        }
                    default:
                        switch (h16) {
                            case 32:
                                bArr7 = c(4, 4, c8049b);
                                break;
                            case 33:
                                bArr5 = c(4, 8, c8049b);
                                break;
                            case 34:
                                bArr6 = c(16, 8, c8049b);
                                break;
                        }
                }
            } else {
                i22 += 2;
                i21 = i12;
            }
            paint2 = paint;
        }
    }

    private static C1255a h(C8049B c8049b, int i11) {
        int h11;
        int i12;
        int h12;
        int i13;
        int i14;
        int i15 = 8;
        int h13 = c8049b.h(8);
        c8049b.p(8);
        int i16 = 2;
        int i17 = i11 - 2;
        int i18 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] d11 = d();
        int[] e11 = e();
        while (i17 > 0) {
            int h14 = c8049b.h(i15);
            int h15 = c8049b.h(i15);
            int[] iArr2 = (h15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iArr : (h15 & 64) != 0 ? d11 : e11;
            if ((h15 & 1) != 0) {
                i13 = c8049b.h(i15);
                i14 = c8049b.h(i15);
                h11 = c8049b.h(i15);
                h12 = c8049b.h(i15);
                i12 = i17 - 6;
            } else {
                int h16 = c8049b.h(6) << i16;
                int h17 = c8049b.h(4) << 4;
                h11 = c8049b.h(4) << 4;
                i12 = i17 - 4;
                h12 = c8049b.h(i16) << 6;
                i13 = h16;
                i14 = h17;
            }
            if (i13 == 0) {
                i14 = i18;
                h11 = i14;
                h12 = 255;
            }
            double d12 = i13;
            double d13 = i14 - 128;
            double d14 = h11 - 128;
            iArr2[h14] = f((byte) (255 - (h12 & 255)), N.i((int) ((1.402d * d13) + d12), 0, 255), N.i((int) ((d12 - (0.34414d * d14)) - (d13 * 0.71414d)), 0, 255), N.i((int) ((d14 * 1.772d) + d12), 0, 255));
            i17 = i12;
            i18 = 0;
            h13 = h13;
            e11 = e11;
            i15 = 8;
            i16 = 2;
        }
        return new C1255a(h13, iArr, d11, e11);
    }

    private static c i(C8049B c8049b) {
        byte[] bArr;
        int h11 = c8049b.h(16);
        c8049b.p(4);
        int h12 = c8049b.h(2);
        boolean g10 = c8049b.g();
        c8049b.p(1);
        byte[] bArr2 = N.f74291c;
        if (h12 == 1) {
            c8049b.p(c8049b.h(8) * 16);
        } else if (h12 == 0) {
            int h13 = c8049b.h(16);
            int h14 = c8049b.h(16);
            if (h13 > 0) {
                bArr2 = new byte[h13];
                c8049b.k(h13, bArr2);
            }
            if (h14 > 0) {
                bArr = new byte[h14];
                c8049b.k(h14, bArr);
                return new c(h11, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h11, g10, bArr2, bArr);
    }

    @Override // k4.o
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<k4.c> interfaceC8068j) {
        boolean z11;
        h hVar;
        k4.c cVar;
        int i13;
        char c11;
        char c12;
        char c13;
        int i14;
        ArrayList arrayList;
        int i15;
        h hVar2;
        f fVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        f fVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        C8049B c8049b = new C8049B(i11 + i12, bArr);
        c8049b.n(i11);
        while (true) {
            int b11 = c8049b.b();
            z11 = true;
            hVar = this.f74398f;
            if (b11 >= 48 && c8049b.h(8) == 15) {
                int h11 = c8049b.h(8);
                int h12 = c8049b.h(16);
                int h13 = c8049b.h(16);
                int d11 = c8049b.d() + h13;
                if (h13 * 8 > c8049b.b()) {
                    s.f("DvbParser", "Data field length exceeds limit");
                    c8049b.p(c8049b.b());
                } else {
                    switch (h11) {
                        case 16:
                            if (h12 == hVar.f74431a) {
                                d dVar = hVar.f74439i;
                                c8049b.h(8);
                                int h14 = c8049b.h(4);
                                int h15 = c8049b.h(2);
                                c8049b.p(2);
                                int i26 = h13 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i26 > 0) {
                                    int h16 = c8049b.h(8);
                                    c8049b.p(8);
                                    i26 -= 6;
                                    sparseArray.put(h16, new e(c8049b.h(16), c8049b.h(16)));
                                }
                                d dVar2 = new d(h14, h15, sparseArray);
                                if (h15 == 0) {
                                    if (dVar != null && dVar.f74414a != h14) {
                                        hVar.f74439i = dVar2;
                                        break;
                                    }
                                } else {
                                    hVar.f74439i = dVar2;
                                    hVar.f74433c.clear();
                                    hVar.f74434d.clear();
                                    hVar.f74435e.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f74439i;
                            if (h12 == hVar.f74431a && dVar3 != null) {
                                int h17 = c8049b.h(8);
                                c8049b.p(4);
                                boolean g10 = c8049b.g();
                                c8049b.p(3);
                                int h18 = c8049b.h(16);
                                int h19 = c8049b.h(16);
                                c8049b.h(3);
                                int h21 = c8049b.h(3);
                                c8049b.p(2);
                                int h22 = c8049b.h(8);
                                int h23 = c8049b.h(8);
                                int h24 = c8049b.h(4);
                                int h25 = c8049b.h(2);
                                c8049b.p(2);
                                int i27 = h13 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i27 > 0) {
                                    int h26 = c8049b.h(16);
                                    int h27 = c8049b.h(2);
                                    c8049b.h(2);
                                    int h28 = c8049b.h(12);
                                    c8049b.p(4);
                                    int h29 = c8049b.h(12);
                                    int i28 = i27 - 6;
                                    if (h27 == 1 || h27 == 2) {
                                        c8049b.h(8);
                                        c8049b.h(8);
                                        i27 -= 8;
                                    } else {
                                        i27 = i28;
                                    }
                                    sparseArray2.put(h26, new g(h28, h29));
                                }
                                f fVar3 = new f(h17, g10, h18, h19, h21, h22, h23, h24, h25, sparseArray2);
                                SparseArray<f> sparseArray3 = hVar.f74433c;
                                if (dVar3.f74415b == 0 && (fVar2 = sparseArray3.get(h17)) != null) {
                                    int i29 = 0;
                                    while (true) {
                                        SparseArray<g> sparseArray4 = fVar2.f74428j;
                                        if (i29 < sparseArray4.size()) {
                                            fVar3.f74428j.put(sparseArray4.keyAt(i29), sparseArray4.valueAt(i29));
                                            i29++;
                                        }
                                    }
                                }
                                sparseArray3.put(fVar3.f74419a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (h12 != hVar.f74431a) {
                                if (h12 == hVar.f74432b) {
                                    C1255a h31 = h(c8049b, h13);
                                    hVar.f74436f.put(h31.f74400a, h31);
                                    break;
                                }
                            } else {
                                C1255a h32 = h(c8049b, h13);
                                hVar.f74434d.put(h32.f74400a, h32);
                                break;
                            }
                            break;
                        case 19:
                            if (h12 != hVar.f74431a) {
                                if (h12 == hVar.f74432b) {
                                    c i31 = i(c8049b);
                                    hVar.f74437g.put(i31.f74410a, i31);
                                    break;
                                }
                            } else {
                                c i32 = i(c8049b);
                                hVar.f74435e.put(i32.f74410a, i32);
                                break;
                            }
                            break;
                        case 20:
                            if (h12 == hVar.f74431a) {
                                c8049b.p(4);
                                boolean g11 = c8049b.g();
                                c8049b.p(3);
                                int h33 = c8049b.h(16);
                                int h34 = c8049b.h(16);
                                if (g11) {
                                    int h35 = c8049b.h(16);
                                    i22 = c8049b.h(16);
                                    i25 = c8049b.h(16);
                                    i23 = c8049b.h(16);
                                    i24 = h35;
                                } else {
                                    i22 = h33;
                                    i23 = h34;
                                    i24 = 0;
                                    i25 = 0;
                                }
                                hVar.f74438h = new b(h33, h34, i24, i22, i25, i23);
                                break;
                            }
                            break;
                    }
                    c8049b.q(d11 - c8049b.d());
                }
            }
        }
        d dVar4 = hVar.f74439i;
        if (dVar4 == null) {
            cVar = new k4.c(AbstractC5880y.v(), -9223372036854775807L, -9223372036854775807L);
        } else {
            b bVar2 = hVar.f74438h;
            if (bVar2 == null) {
                bVar2 = this.f74396d;
            }
            Bitmap bitmap = this.f74399g;
            Canvas canvas = this.f74395c;
            if (bitmap == null || bVar2.f74404a + 1 != bitmap.getWidth() || bVar2.f74405b + 1 != this.f74399g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f74404a + 1, bVar2.f74405b + 1, Bitmap.Config.ARGB_8888);
                this.f74399g = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i33 = 0;
            while (true) {
                SparseArray<e> sparseArray5 = dVar4.f74416c;
                if (i33 < sparseArray5.size()) {
                    canvas.save();
                    e valueAt = sparseArray5.valueAt(i33);
                    f fVar4 = hVar.f74433c.get(sparseArray5.keyAt(i33));
                    int i34 = valueAt.f74417a + bVar2.f74406c;
                    int i35 = valueAt.f74418b + bVar2.f74408e;
                    int min = Math.min(fVar4.f74421c + i34, bVar2.f74407d);
                    int i36 = fVar4.f74422d;
                    int i37 = i35 + i36;
                    boolean z12 = z11;
                    canvas.clipRect(i34, i35, min, Math.min(i37, bVar2.f74409f));
                    SparseArray<C1255a> sparseArray6 = hVar.f74434d;
                    int i38 = fVar4.f74424f;
                    C1255a c1255a = sparseArray6.get(i38);
                    if (c1255a == null && (c1255a = hVar.f74436f.get(i38)) == null) {
                        c1255a = this.f74397e;
                    }
                    int i39 = 0;
                    while (true) {
                        SparseArray<g> sparseArray7 = fVar4.f74428j;
                        if (i39 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i39);
                            g valueAt2 = sparseArray7.valueAt(i39);
                            d dVar5 = dVar4;
                            c cVar2 = hVar.f74435e.get(keyAt);
                            if (cVar2 == null) {
                                cVar2 = hVar.f74437g.get(keyAt);
                            }
                            if (cVar2 != null) {
                                Paint paint = cVar2.f74411b ? null : this.f74393a;
                                int i41 = valueAt2.f74429a + i34;
                                int i42 = valueAt2.f74430b + i35;
                                int i43 = i34;
                                int i44 = fVar4.f74423e;
                                int i45 = i35;
                                int[] iArr = i44 == 3 ? c1255a.f74403d : i44 == 2 ? c1255a.f74402c : c1255a.f74401b;
                                fVar = fVar4;
                                i18 = i39;
                                i17 = i43;
                                hVar2 = hVar;
                                i19 = i36;
                                arrayList = arrayList2;
                                i21 = i37;
                                i15 = i33;
                                i16 = i45;
                                g(cVar2.f74412c, iArr, i44, i41, i42, paint, canvas);
                                g(cVar2.f74413d, iArr, i44, i41, i42 + 1, paint, canvas);
                            } else {
                                arrayList = arrayList2;
                                i15 = i33;
                                hVar2 = hVar;
                                fVar = fVar4;
                                i16 = i35;
                                i17 = i34;
                                i18 = i39;
                                i19 = i36;
                                i21 = i37;
                            }
                            i39 = i18 + 1;
                            fVar4 = fVar;
                            i37 = i21;
                            i34 = i17;
                            i35 = i16;
                            i36 = i19;
                            dVar4 = dVar5;
                            i33 = i15;
                            hVar = hVar2;
                            arrayList2 = arrayList;
                        } else {
                            d dVar6 = dVar4;
                            ArrayList arrayList3 = arrayList2;
                            int i46 = i33;
                            h hVar3 = hVar;
                            f fVar5 = fVar4;
                            int i47 = i35;
                            int i48 = i34;
                            int i49 = i36;
                            int i51 = i37;
                            boolean z13 = fVar5.f74420b;
                            int i52 = fVar5.f74421c;
                            if (z13) {
                                int i53 = fVar5.f74423e;
                                if (i53 == 3) {
                                    i14 = c1255a.f74403d[fVar5.f74425g];
                                    c13 = 2;
                                } else {
                                    c13 = 2;
                                    i14 = i53 == 2 ? c1255a.f74402c[fVar5.f74426h] : c1255a.f74401b[fVar5.f74427i];
                                }
                                Paint paint2 = this.f74394b;
                                paint2.setColor(i14);
                                c12 = 3;
                                c11 = c13;
                                i13 = i52;
                                canvas.drawRect(i48, i47, i48 + i52, i51, paint2);
                            } else {
                                i13 = i52;
                                c11 = 2;
                                c12 = 3;
                            }
                            C7855a.C1210a c1210a = new C7855a.C1210a();
                            c1210a.f(Bitmap.createBitmap(this.f74399g, i48, i47, i13, i49));
                            float f7 = bVar2.f74404a;
                            c1210a.k(i48 / f7);
                            c1210a.l(0);
                            float f11 = bVar2.f74405b;
                            c1210a.h(i47 / f11, 0);
                            c1210a.i(0);
                            c1210a.n(i13 / f7);
                            c1210a.g(i49 / f11);
                            arrayList3.add(c1210a.a());
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            i33 = i46 + 1;
                            z11 = z12;
                            arrayList2 = arrayList3;
                            hVar = hVar3;
                            dVar4 = dVar6;
                        }
                    }
                } else {
                    cVar = new k4.c(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC8068j.accept(cVar);
    }

    @Override // k4.o
    public final void reset() {
        h hVar = this.f74398f;
        hVar.f74433c.clear();
        hVar.f74434d.clear();
        hVar.f74435e.clear();
        hVar.f74436f.clear();
        hVar.f74437g.clear();
        hVar.f74438h = null;
        hVar.f74439i = null;
    }
}
