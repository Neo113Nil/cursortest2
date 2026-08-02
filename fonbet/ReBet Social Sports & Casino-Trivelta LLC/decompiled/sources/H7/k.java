package H7;

import android.graphics.ColorSpace;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.ImageMetaData;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.WebpUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import u7.C6528b;

/* loaded from: classes2.dex */
public class k implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f4849n;

    /* renamed from: a, reason: collision with root package name */
    public final H6.a f4850a;

    /* renamed from: b, reason: collision with root package name */
    public final D6.n f4851b;

    /* renamed from: c, reason: collision with root package name */
    public u7.c f4852c;

    /* renamed from: d, reason: collision with root package name */
    public int f4853d;

    /* renamed from: e, reason: collision with root package name */
    public int f4854e;

    /* renamed from: f, reason: collision with root package name */
    public int f4855f;

    /* renamed from: g, reason: collision with root package name */
    public int f4856g;

    /* renamed from: h, reason: collision with root package name */
    public int f4857h;

    /* renamed from: i, reason: collision with root package name */
    public int f4858i;

    /* renamed from: j, reason: collision with root package name */
    public B7.b f4859j;

    /* renamed from: k, reason: collision with root package name */
    public ColorSpace f4860k;

    /* renamed from: l, reason: collision with root package name */
    public String f4861l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4862m;

    public k(H6.a aVar) {
        this.f4852c = u7.c.f66212d;
        this.f4853d = -1;
        this.f4854e = 0;
        this.f4855f = -1;
        this.f4856g = -1;
        this.f4857h = 1;
        this.f4858i = -1;
        D6.k.b(Boolean.valueOf(H6.a.isValid(aVar)));
        this.f4850a = aVar.clone();
        this.f4851b = null;
    }

    public static boolean b2(k kVar) {
        return kVar.f4853d >= 0 && kVar.f4855f >= 0 && kVar.f4856g >= 0;
    }

    public static k k(k kVar) {
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    public static void r(k kVar) {
        if (kVar != null) {
            kVar.close();
        }
    }

    public u7.c A0() {
        d2();
        return this.f4852c;
    }

    public void B(k kVar) {
        this.f4852c = kVar.A0();
        this.f4855f = kVar.getWidth();
        this.f4856g = kVar.getHeight();
        this.f4853d = kVar.Y0();
        this.f4854e = kVar.K0();
        this.f4857h = kVar.n1();
        this.f4858i = kVar.y1();
        this.f4859j = kVar.U();
        this.f4860k = kVar.w0();
        this.f4862m = kVar.Y1();
    }

    public InputStream D0() {
        D6.n nVar = this.f4851b;
        if (nVar != null) {
            return (InputStream) nVar.get();
        }
        H6.a B10 = H6.a.B(this.f4850a);
        if (B10 == null) {
            return null;
        }
        try {
            return new G6.j((G6.h) B10.z0());
        } finally {
            H6.a.U(B10);
        }
    }

    public H6.a J() {
        return H6.a.B(this.f4850a);
    }

    public int K0() {
        d2();
        return this.f4854e;
    }

    public String T1() {
        return this.f4861l;
    }

    public B7.b U() {
        return this.f4859j;
    }

    public int Y0() {
        d2();
        return this.f4853d;
    }

    public boolean Y1() {
        return this.f4862m;
    }

    public final void Z1() {
        u7.c d10 = u7.e.d(D0());
        this.f4852c = d10;
        Pair<Integer, Integer> f22 = C6528b.b(d10) ? f2() : e2().getDimensions();
        if (d10 == C6528b.f66196b && this.f4853d == -1) {
            if (f22 != null) {
                int orientation = JfifUtil.getOrientation(D0());
                this.f4854e = orientation;
                this.f4853d = JfifUtil.getAutoRotateAngleFromOrientation(orientation);
                return;
            }
            return;
        }
        if (d10 == C6528b.f66206l && this.f4853d == -1) {
            int orientation2 = HeifExifUtil.getOrientation(D0());
            this.f4854e = orientation2;
            this.f4853d = JfifUtil.getAutoRotateAngleFromOrientation(orientation2);
        } else if (this.f4853d == -1) {
            this.f4853d = 0;
        }
    }

    public boolean a2(int i10) {
        u7.c cVar = this.f4852c;
        if ((cVar != C6528b.f66196b && cVar != C6528b.f66207m) || this.f4851b != null) {
            return true;
        }
        D6.k.g(this.f4850a);
        G6.h hVar = (G6.h) this.f4850a.z0();
        return i10 >= 2 && hVar.s(i10 + (-2)) == -1 && hVar.s(i10 - 1) == -39;
    }

    public void c2() {
        if (!f4849n) {
            Z1();
        } else {
            if (this.f4862m) {
                return;
            }
            Z1();
            this.f4862m = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        H6.a.U(this.f4850a);
    }

    public k d() {
        k kVar;
        D6.n nVar = this.f4851b;
        if (nVar != null) {
            kVar = new k(nVar, this.f4858i);
        } else {
            H6.a B10 = H6.a.B(this.f4850a);
            if (B10 == null) {
                kVar = null;
            } else {
                try {
                    kVar = new k(B10);
                } finally {
                    H6.a.U(B10);
                }
            }
        }
        if (kVar != null) {
            kVar.B(this);
        }
        return kVar;
    }

    public final void d2() {
        if (this.f4855f < 0 || this.f4856g < 0) {
            c2();
        }
    }

    public final ImageMetaData e2() {
        InputStream inputStream;
        try {
            inputStream = D0();
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            ImageMetaData decodeDimensionsAndColorSpace = BitmapUtil.decodeDimensionsAndColorSpace(inputStream);
            this.f4860k = decodeDimensionsAndColorSpace.getColorSpace();
            Pair<Integer, Integer> dimensions = decodeDimensionsAndColorSpace.getDimensions();
            if (dimensions != null) {
                this.f4855f = dimensions.component1().intValue();
                this.f4856g = dimensions.component2().intValue();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return decodeDimensionsAndColorSpace;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public final Pair f2() {
        InputStream D02 = D0();
        if (D02 == null) {
            return null;
        }
        Pair<Integer, Integer> size = WebpUtil.getSize(D02);
        if (size != null) {
            this.f4855f = size.component1().intValue();
            this.f4856g = size.component2().intValue();
        }
        return size;
    }

    public void g2(B7.b bVar) {
        this.f4859j = bVar;
    }

    public int getHeight() {
        d2();
        return this.f4856g;
    }

    public int getWidth() {
        d2();
        return this.f4855f;
    }

    public void h2(int i10) {
        this.f4854e = i10;
    }

    public void i2(int i10) {
        this.f4856g = i10;
    }

    public synchronized boolean isValid() {
        boolean z10;
        if (!H6.a.isValid(this.f4850a)) {
            z10 = this.f4851b != null;
        }
        return z10;
    }

    public void j2(u7.c cVar) {
        this.f4852c = cVar;
    }

    public void k2(int i10) {
        this.f4853d = i10;
    }

    public void l2(int i10) {
        this.f4857h = i10;
    }

    public InputStream m1() {
        return (InputStream) D6.k.g(D0());
    }

    public void m2(String str) {
        this.f4861l = str;
    }

    public int n1() {
        return this.f4857h;
    }

    public void n2(int i10) {
        this.f4855f = i10;
    }

    public ColorSpace w0() {
        d2();
        return this.f4860k;
    }

    public int y1() {
        H6.a aVar = this.f4850a;
        return (aVar == null || aVar.z0() == null) ? this.f4858i : ((G6.h) this.f4850a.z0()).size();
    }

    public String z0(int i10) {
        H6.a J10 = J();
        if (J10 == null) {
            return "";
        }
        int min = Math.min(y1(), i10);
        byte[] bArr = new byte[min];
        try {
            G6.h hVar = (G6.h) J10.z0();
            if (hVar == null) {
                return "";
            }
            hVar.i(0, bArr, 0, min);
            J10.close();
            StringBuilder sb2 = new StringBuilder(min * 2);
            for (int i11 = 0; i11 < min; i11++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i11])));
            }
            return sb2.toString();
        } finally {
            J10.close();
        }
    }

    public static boolean isValid(k kVar) {
        return kVar != null && kVar.isValid();
    }

    public k(D6.n nVar) {
        this.f4852c = u7.c.f66212d;
        this.f4853d = -1;
        this.f4854e = 0;
        this.f4855f = -1;
        this.f4856g = -1;
        this.f4857h = 1;
        this.f4858i = -1;
        D6.k.g(nVar);
        this.f4850a = null;
        this.f4851b = nVar;
    }

    public k(D6.n nVar, int i10) {
        this(nVar);
        this.f4858i = i10;
    }
}
