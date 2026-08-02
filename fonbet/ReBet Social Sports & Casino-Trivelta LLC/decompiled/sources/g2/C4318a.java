package g2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.common.collect.AbstractC3445z;
import com.plaid.internal.EnumC3631g;
import d1.C3985a;
import e1.AbstractC4156x;
import e1.I;
import e1.InterfaceC4148o;
import e1.J;
import e1.Z;
import e2.C4163e;
import e2.s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4318a implements s {
    private static final byte[] defaultMap2To4 = {0, 7, 8, 15};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f46824a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f46825b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f46826c;

    /* renamed from: d, reason: collision with root package name */
    public final b f46827d;

    /* renamed from: e, reason: collision with root package name */
    public final C0681a f46828e;

    /* renamed from: f, reason: collision with root package name */
    public final h f46829f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f46830g;

    /* renamed from: g2.a$a, reason: collision with other inner class name */
    public static final class C0681a {

        /* renamed from: a, reason: collision with root package name */
        public final int f46831a;
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;

        public C0681a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f46831a = i10;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    /* renamed from: g2.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f46832a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46833b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46834c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46835d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46836e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46837f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f46832a = i10;
            this.f46833b = i11;
            this.f46834c = i12;
            this.f46835d = i13;
            this.f46836e = i14;
            this.f46837f = i15;
        }
    }

    /* renamed from: g2.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f46838a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46839b;
        public final byte[] bottomFieldData;
        public final byte[] topFieldData;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f46838a = i10;
            this.f46839b = z10;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    /* renamed from: g2.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f46840a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46841b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46842c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f46843d;

        public d(int i10, int i11, int i12, SparseArray sparseArray) {
            this.f46840a = i10;
            this.f46841b = i11;
            this.f46842c = i12;
            this.f46843d = sparseArray;
        }
    }

    /* renamed from: g2.a$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f46844a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46845b;

        public e(int i10, int i11) {
            this.f46844a = i10;
            this.f46845b = i11;
        }
    }

    /* renamed from: g2.a$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f46846a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46847b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46848c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46849d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46850e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46851f;

        /* renamed from: g, reason: collision with root package name */
        public final int f46852g;

        /* renamed from: h, reason: collision with root package name */
        public final int f46853h;

        /* renamed from: i, reason: collision with root package name */
        public final int f46854i;

        /* renamed from: j, reason: collision with root package name */
        public final int f46855j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray f46856k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray sparseArray) {
            this.f46846a = i10;
            this.f46847b = z10;
            this.f46848c = i11;
            this.f46849d = i12;
            this.f46850e = i13;
            this.f46851f = i14;
            this.f46852g = i15;
            this.f46853h = i16;
            this.f46854i = i17;
            this.f46855j = i18;
            this.f46856k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f46856k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f46856k.put(sparseArray.keyAt(i10), (g) sparseArray.valueAt(i10));
            }
        }
    }

    /* renamed from: g2.a$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f46857a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46858b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46859c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46860d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46861e;

        /* renamed from: f, reason: collision with root package name */
        public final int f46862f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f46857a = i10;
            this.f46858b = i11;
            this.f46859c = i12;
            this.f46860d = i13;
            this.f46861e = i14;
            this.f46862f = i15;
        }
    }

    /* renamed from: g2.a$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f46863a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46864b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f46865c = new SparseArray();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f46866d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f46867e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f46868f = new SparseArray();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray f46869g = new SparseArray();

        /* renamed from: h, reason: collision with root package name */
        public b f46870h;

        /* renamed from: i, reason: collision with root package name */
        public d f46871i;

        public h(int i10, int i11) {
            this.f46863a = i10;
            this.f46864b = i11;
        }

        public void a() {
            this.f46865c.clear();
            this.f46866d.clear();
            this.f46867e.clear();
            this.f46868f.clear();
            this.f46869g.clear();
            this.f46870h = null;
            this.f46871i = null;
        }
    }

    public C4318a(List list) {
        J j10 = new J((byte[]) list.get(0));
        int U10 = j10.U();
        int U11 = j10.U();
        Paint paint = new Paint();
        this.f46824a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f46825b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f46826c = new Canvas();
        this.f46827d = new b(719, 575, 0, 719, 0, 575);
        this.f46828e = new C0681a(0, e(), f(), g());
        this.f46829f = new h(U10, U11);
    }

    public static byte[] d(int i10, int i11, I i12) {
        byte[] bArr = new byte[i10];
        for (int i13 = 0; i13 < i10; i13++) {
            bArr[i13] = (byte) i12.h(i11);
        }
        return bArr;
    }

    public static int[] e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = h(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = h(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] g() {
        int i10;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = h(63, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & 136;
                int i13 = EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                if (i12 == 0) {
                    int i14 = ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0);
                    int i15 = ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0);
                    i10 = (i11 & 4) == 0 ? 0 : 85;
                    if ((i11 & 64) == 0) {
                        i13 = 0;
                    }
                    iArr[i11] = h(255, i14, i15, i10 + i13);
                } else if (i12 == 8) {
                    int i16 = ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0);
                    int i17 = ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0);
                    i10 = (i11 & 4) == 0 ? 0 : 85;
                    if ((i11 & 64) == 0) {
                        i13 = 0;
                    }
                    iArr[i11] = h(127, i16, i17, i10 + i13);
                } else if (i12 == 128) {
                    iArr[i11] = h(255, ((i11 & 1) != 0 ? 43 : 0) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = h(255, ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int i(I i10, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        boolean z10;
        int i13;
        int h10;
        int h11;
        boolean z11 = false;
        while (true) {
            int h12 = i10.h(2);
            if (h12 != 0) {
                z10 = z11;
                i13 = 1;
            } else {
                if (i10.g()) {
                    h10 = i10.h(3) + 3;
                    h11 = i10.h(2);
                } else {
                    if (i10.g()) {
                        z10 = z11;
                        i13 = 1;
                    } else {
                        int h13 = i10.h(2);
                        if (h13 == 0) {
                            z10 = true;
                        } else if (h13 == 1) {
                            z10 = z11;
                            i13 = 2;
                        } else if (h13 == 2) {
                            h10 = i10.h(4) + 12;
                            h11 = i10.h(2);
                        } else if (h13 != 3) {
                            z10 = z11;
                        } else {
                            h10 = i10.h(8) + 29;
                            h11 = i10.h(2);
                        }
                        h12 = 0;
                        i13 = 0;
                    }
                    h12 = 0;
                }
                z10 = z11;
                i13 = h10;
                h12 = h11;
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    h12 = bArr[h12];
                }
                paint.setColor(iArr[h12]);
                canvas.drawRect(i11, i12, i11 + i13, 1 + i12, paint);
            }
            i11 += i13;
            if (z10) {
                return i11;
            }
            z11 = z10;
        }
    }

    public static int j(I i10, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        boolean z10;
        int i13;
        int h10;
        int h11;
        boolean z11 = false;
        while (true) {
            int h12 = i10.h(4);
            if (h12 != 0) {
                z10 = z11;
                i13 = 1;
            } else if (i10.g()) {
                if (i10.g()) {
                    int h13 = i10.h(2);
                    if (h13 == 0) {
                        z10 = z11;
                        i13 = 1;
                        h12 = 0;
                    } else if (h13 == 1) {
                        h12 = 0;
                        i13 = 2;
                        z10 = z11;
                    } else if (h13 == 2) {
                        h10 = i10.h(4) + 9;
                        h11 = i10.h(4);
                    } else if (h13 != 3) {
                        z10 = z11;
                        h12 = 0;
                        i13 = 0;
                    } else {
                        h10 = i10.h(8) + 25;
                        h11 = i10.h(4);
                    }
                } else {
                    h10 = i10.h(2) + 4;
                    h11 = i10.h(4);
                }
                z10 = z11;
                i13 = h10;
                h12 = h11;
            } else {
                int h14 = i10.h(3);
                if (h14 != 0) {
                    z10 = z11;
                    i13 = h14 + 2;
                    h12 = 0;
                } else {
                    z10 = true;
                    h12 = 0;
                    i13 = 0;
                }
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    h12 = bArr[h12];
                }
                paint.setColor(iArr[h12]);
                canvas.drawRect(i11, i12, i11 + i13, 1 + i12, paint);
            }
            i11 += i13;
            if (z10) {
                return i11;
            }
            z11 = z10;
        }
    }

    public static int k(I i10, int[] iArr, byte[] bArr, int i11, int i12, Paint paint, Canvas canvas) {
        boolean z10;
        int h10;
        boolean z11 = false;
        while (true) {
            int h11 = i10.h(8);
            if (h11 != 0) {
                z10 = z11;
                h10 = 1;
            } else if (i10.g()) {
                z10 = z11;
                h10 = i10.h(7);
                h11 = i10.h(8);
            } else {
                int h12 = i10.h(7);
                if (h12 != 0) {
                    z10 = z11;
                    h10 = h12;
                    h11 = 0;
                } else {
                    z10 = true;
                    h11 = 0;
                    h10 = 0;
                }
            }
            if (h10 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i11, i12, i11 + h10, 1 + i12, paint);
            }
            i11 += h10;
            if (z10) {
                return i11;
            }
            z11 = z10;
        }
    }

    public static void l(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        I i13 = new I(bArr);
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        int i14 = i11;
        int i15 = i12;
        byte[] bArr7 = null;
        while (i13.b() != 0) {
            int h10 = i13.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                paint2 = paint3;
                                i14 = i(i13, iArr2, bArr2, i14, i15, paint2, canvas2);
                                i13.c();
                                break;
                            } else {
                                bArr3 = bArr6 == null ? defaultMap2To4 : bArr6;
                            }
                        } else {
                            bArr3 = bArr7 == null ? defaultMap2To8 : bArr7;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        i14 = i(i13, iArr2, bArr2, i14, i15, paint2, canvas2);
                        i13.c();
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        if (i10 == 3) {
                            bArr4 = bArr5 == null ? defaultMap4To8 : bArr5;
                        } else {
                            bArr4 = null;
                        }
                        paint2 = paint4;
                        i14 = j(i13, iArr2, bArr4, i14, i15, paint2, canvas2);
                        i13.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i14 = k(i13, iArr2, null, i14, i15, paint2, canvas2);
                        break;
                    default:
                        switch (h10) {
                            case 32:
                                bArr6 = d(4, 4, i13);
                                break;
                            case 33:
                                bArr7 = d(4, 8, i13);
                                break;
                            case 34:
                                bArr5 = d(16, 8, i13);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i15 += 2;
                i14 = i11;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    public static void m(c cVar, C0681a c0681a, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? c0681a.clutEntries8Bit : i10 == 2 ? c0681a.clutEntries4Bit : c0681a.clutEntries2Bit;
        l(cVar.topFieldData, iArr, i10, i11, i12, paint, canvas);
        l(cVar.bottomFieldData, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    public static C0681a o(I i10, int i11) {
        int h10;
        int i12;
        int h11;
        int i13;
        int i14;
        int i15 = 8;
        int h12 = i10.h(8);
        i10.r(8);
        int i16 = 2;
        int i17 = i11 - 2;
        int[] e10 = e();
        int[] f10 = f();
        int[] g10 = g();
        while (i17 > 0) {
            int h13 = i10.h(i15);
            int h14 = i10.h(i15);
            int[] iArr = (h14 & 128) != 0 ? e10 : (h14 & 64) != 0 ? f10 : g10;
            if ((h14 & 1) != 0) {
                i13 = i10.h(i15);
                i14 = i10.h(i15);
                h10 = i10.h(i15);
                h11 = i10.h(i15);
                i12 = i17 - 6;
            } else {
                int h15 = i10.h(6) << i16;
                int h16 = i10.h(4) << 4;
                h10 = i10.h(4) << 4;
                i12 = i17 - 4;
                h11 = i10.h(i16) << 6;
                i13 = h15;
                i14 = h16;
            }
            if (i13 == 0) {
                h11 = 255;
                i14 = 0;
                h10 = 0;
            }
            double d10 = i13;
            double d11 = i14 - 128;
            double d12 = h10 - 128;
            iArr[h13] = h((byte) (255 - (h11 & 255)), Z.o((int) (d10 + (1.402d * d11)), 0, 255), Z.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), Z.o((int) (d10 + (d12 * 1.772d)), 0, 255));
            i17 = i12;
            h12 = h12;
            i15 = 8;
            i16 = 2;
        }
        return new C0681a(h12, e10, f10, g10);
    }

    public static b p(I i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        i10.r(4);
        boolean g10 = i10.g();
        i10.r(3);
        int h10 = i10.h(16);
        int h11 = i10.h(16);
        if (g10) {
            int h12 = i10.h(16);
            int h13 = i10.h(16);
            int h14 = i10.h(16);
            i14 = i10.h(16);
            i13 = h13;
            i12 = h14;
            i11 = h12;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = h10;
            i14 = h11;
        }
        return new b(h10, h11, i11, i13, i12, i14);
    }

    public static c q(I i10) {
        byte[] bArr;
        int h10 = i10.h(16);
        i10.r(4);
        int h11 = i10.h(2);
        boolean g10 = i10.g();
        i10.r(1);
        byte[] bArr2 = Z.EMPTY_BYTE_ARRAY;
        if (h11 == 1) {
            i10.r(i10.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = i10.h(16);
            int h13 = i10.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                i10.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                i10.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    public static d r(I i10, int i11) {
        int h10 = i10.h(8);
        int h11 = i10.h(4);
        int h12 = i10.h(2);
        i10.r(2);
        int i12 = i11 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int h13 = i10.h(8);
            i10.r(8);
            i12 -= 6;
            sparseArray.put(h13, new e(i10.h(16), i10.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    public static f s(I i10, int i11) {
        int i12;
        int i13;
        int i14;
        char c10;
        int h10 = i10.h(8);
        int i15 = 4;
        i10.r(4);
        boolean g10 = i10.g();
        i10.r(3);
        int i16 = 16;
        int h11 = i10.h(16);
        int h12 = i10.h(16);
        int h13 = i10.h(3);
        int h14 = i10.h(3);
        int i17 = 2;
        i10.r(2);
        int h15 = i10.h(8);
        int h16 = i10.h(8);
        int h17 = i10.h(4);
        int h18 = i10.h(2);
        i10.r(2);
        int i18 = i11 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i18 > 0) {
            int h19 = i10.h(i16);
            int h20 = i10.h(i17);
            int h21 = i10.h(i17);
            int h22 = i10.h(12);
            i10.r(i15);
            int h23 = i10.h(12);
            int i19 = i18 - 6;
            if (h20 != 1) {
                i12 = 2;
                if (h20 != 2) {
                    i14 = 0;
                    i13 = 0;
                    i18 = i19;
                    c10 = '\b';
                    sparseArray.put(h19, new g(h20, h21, h22, h23, i14, i13));
                    i16 = 16;
                    i17 = i12;
                    i15 = 4;
                }
            } else {
                i12 = 2;
            }
            c10 = '\b';
            i18 -= 8;
            i14 = i10.h(8);
            i13 = i10.h(8);
            sparseArray.put(h19, new g(h20, h21, h22, h23, i14, i13));
            i16 = 16;
            i17 = i12;
            i15 = 4;
        }
        return new f(h10, g10, h11, h12, h13, h14, h15, h16, h17, h18, sparseArray);
    }

    public static void t(I i10, h hVar) {
        f fVar;
        int h10 = i10.h(8);
        int h11 = i10.h(16);
        int h12 = i10.h(16);
        int d10 = i10.d() + h12;
        if (h12 * 8 > i10.b()) {
            AbstractC4156x.i("DvbParser", "Data field length exceeds limit");
            i10.r(i10.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f46863a) {
                    d dVar = hVar.f46871i;
                    d r10 = r(i10, h12);
                    if (r10.f46842c == 0) {
                        if (dVar != null && dVar.f46841b != r10.f46841b) {
                            hVar.f46871i = r10;
                            break;
                        }
                    } else {
                        hVar.f46871i = r10;
                        hVar.f46865c.clear();
                        hVar.f46866d.clear();
                        hVar.f46867e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f46871i;
                if (h11 == hVar.f46863a && dVar2 != null) {
                    f s10 = s(i10, h12);
                    if (dVar2.f46842c == 0 && (fVar = (f) hVar.f46865c.get(s10.f46846a)) != null) {
                        s10.a(fVar);
                    }
                    hVar.f46865c.put(s10.f46846a, s10);
                    break;
                }
                break;
            case 18:
                if (h11 != hVar.f46863a) {
                    if (h11 == hVar.f46864b) {
                        C0681a o10 = o(i10, h12);
                        hVar.f46868f.put(o10.f46831a, o10);
                        break;
                    }
                } else {
                    C0681a o11 = o(i10, h12);
                    hVar.f46866d.put(o11.f46831a, o11);
                    break;
                }
                break;
            case 19:
                if (h11 != hVar.f46863a) {
                    if (h11 == hVar.f46864b) {
                        c q10 = q(i10);
                        hVar.f46869g.put(q10.f46838a, q10);
                        break;
                    }
                } else {
                    c q11 = q(i10);
                    hVar.f46867e.put(q11.f46838a, q11);
                    break;
                }
                break;
            case 20:
                if (h11 == hVar.f46863a) {
                    hVar.f46870h = p(i10);
                    break;
                }
                break;
        }
        i10.s(d10 - i10.d());
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        I i12 = new I(bArr, i11 + i10);
        i12.p(i10);
        interfaceC4148o.accept(n(i12));
    }

    @Override // e2.s
    public int c() {
        return 2;
    }

    public final C4163e n(I i10) {
        SparseArray sparseArray;
        int i11;
        while (i10.b() >= 48 && i10.h(8) == 15) {
            t(i10, this.f46829f);
        }
        h hVar = this.f46829f;
        d dVar = hVar.f46871i;
        if (dVar == null) {
            return new C4163e(AbstractC3445z.t(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f46870h;
        if (bVar == null) {
            bVar = this.f46827d;
        }
        Bitmap bitmap = this.f46830g;
        if (bitmap == null || bVar.f46832a + 1 != bitmap.getWidth() || bVar.f46833b + 1 != this.f46830g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f46832a + 1, bVar.f46833b + 1, Bitmap.Config.ARGB_8888);
            this.f46830g = createBitmap;
            this.f46826c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f46843d;
        int i12 = 0;
        while (i12 < sparseArray2.size()) {
            this.f46826c.save();
            e eVar = (e) sparseArray2.valueAt(i12);
            f fVar = (f) this.f46829f.f46865c.get(sparseArray2.keyAt(i12));
            int i13 = eVar.f46844a + bVar.f46834c;
            int i14 = eVar.f46845b + bVar.f46836e;
            this.f46826c.clipRect(i13, i14, Math.min(fVar.f46848c + i13, bVar.f46835d), Math.min(fVar.f46849d + i14, bVar.f46837f));
            C0681a c0681a = (C0681a) this.f46829f.f46866d.get(fVar.f46852g);
            if (c0681a == null && (c0681a = (C0681a) this.f46829f.f46868f.get(fVar.f46852g)) == null) {
                c0681a = this.f46828e;
            }
            C0681a c0681a2 = c0681a;
            SparseArray sparseArray3 = fVar.f46856k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g gVar = (g) sparseArray3.valueAt(i15);
                c cVar = (c) this.f46829f.f46867e.get(keyAt);
                if (cVar == null) {
                    cVar = (c) this.f46829f.f46869g.get(keyAt);
                }
                if (cVar != null) {
                    sparseArray = sparseArray2;
                    i11 = i15;
                    m(cVar, c0681a2, fVar.f46851f, gVar.f46859c + i13, gVar.f46860d + i14, cVar.f46839b ? null : this.f46824a, this.f46826c);
                } else {
                    sparseArray = sparseArray2;
                    i11 = i15;
                }
                i15 = i11 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray sparseArray4 = sparseArray2;
            if (fVar.f46847b) {
                int i16 = fVar.f46851f;
                this.f46825b.setColor(i16 == 3 ? c0681a2.clutEntries8Bit[fVar.f46853h] : i16 == 2 ? c0681a2.clutEntries4Bit[fVar.f46854i] : c0681a2.clutEntries2Bit[fVar.f46855j]);
                this.f46826c.drawRect(i13, i14, fVar.f46848c + i13, fVar.f46849d + i14, this.f46825b);
            }
            arrayList.add(new C3985a.b().f(Bitmap.createBitmap(this.f46830g, i13, i14, fVar.f46848c, fVar.f46849d)).k(i13 / bVar.f46832a).l(0).h(i14 / bVar.f46833b, 0).i(0).n(fVar.f46848c / bVar.f46832a).g(fVar.f46849d / bVar.f46833b).a());
            this.f46826c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f46826c.restore();
            i12++;
            sparseArray2 = sparseArray4;
        }
        return new C4163e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // e2.s
    public void reset() {
        this.f46829f.a();
    }
}
