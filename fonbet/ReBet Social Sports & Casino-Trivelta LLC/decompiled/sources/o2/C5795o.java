package o2;

import androidx.media3.common.a;
import com.plaid.internal.EnumC3631g;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import f1.AbstractC4230h;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;
import o2.L;

/* renamed from: o2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5795o implements InterfaceC5793m {
    private static final float[] PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final O f59112a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59113b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.J f59114c;

    /* renamed from: e, reason: collision with root package name */
    public final w f59116e;

    /* renamed from: f, reason: collision with root package name */
    public b f59117f;

    /* renamed from: g, reason: collision with root package name */
    public long f59118g;

    /* renamed from: h, reason: collision with root package name */
    public String f59119h;

    /* renamed from: i, reason: collision with root package name */
    public H1.O f59120i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f59121j;
    private final boolean[] prefixFlags = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final a f59115d = new a(128);

    /* renamed from: k, reason: collision with root package name */
    public long f59122k = -9223372036854775807L;

    /* renamed from: o2.o$a */
    public static final class a {
        private static final byte[] START_CODE = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        public boolean f59123a;

        /* renamed from: b, reason: collision with root package name */
        public int f59124b;

        /* renamed from: c, reason: collision with root package name */
        public int f59125c;

        /* renamed from: d, reason: collision with root package name */
        public int f59126d;
        public byte[] data;

        public a(int i10) {
            this.data = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f59123a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i13 = this.f59125c;
                if (length < i13 + i12) {
                    this.data = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.data, this.f59125c, i12);
                this.f59125c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f59124b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f59125c -= i11;
                                this.f59123a = false;
                                return true;
                            }
                        } else if ((i10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) != 32) {
                            AbstractC4156x.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f59126d = this.f59125c;
                            this.f59124b = 4;
                        }
                    } else if (i10 > 31) {
                        AbstractC4156x.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f59124b = 3;
                    }
                } else if (i10 != 181) {
                    AbstractC4156x.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f59124b = 2;
                }
            } else if (i10 == 176) {
                this.f59124b = 1;
                this.f59123a = true;
            }
            byte[] bArr = START_CODE;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f59123a = false;
            this.f59125c = 0;
            this.f59124b = 0;
        }
    }

    /* renamed from: o2.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final H1.O f59127a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f59128b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f59129c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f59130d;

        /* renamed from: e, reason: collision with root package name */
        public int f59131e;

        /* renamed from: f, reason: collision with root package name */
        public int f59132f;

        /* renamed from: g, reason: collision with root package name */
        public long f59133g;

        /* renamed from: h, reason: collision with root package name */
        public long f59134h;

        public b(H1.O o10) {
            this.f59127a = o10;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f59129c) {
                int i12 = this.f59132f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f59132f = i12 + (i11 - i10);
                } else {
                    this.f59130d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f59129c = false;
                }
            }
        }

        public void b(long j10, int i10, boolean z10) {
            AbstractC4134a.g(this.f59134h != -9223372036854775807L);
            if (this.f59131e == 182 && z10 && this.f59128b) {
                this.f59127a.g(this.f59134h, this.f59130d ? 1 : 0, (int) (j10 - this.f59133g), i10, null);
            }
            if (this.f59131e != 179) {
                this.f59133g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f59131e = i10;
            this.f59130d = false;
            this.f59128b = i10 == 182 || i10 == 179;
            this.f59129c = i10 == 182;
            this.f59132f = 0;
            this.f59134h = j10;
        }

        public void d() {
            this.f59128b = false;
            this.f59129c = false;
            this.f59130d = false;
            this.f59131e = -1;
        }
    }

    public C5795o(O o10, String str) {
        this.f59112a = o10;
        this.f59113b = str;
        if (o10 != null) {
            this.f59116e = new w(EnumC3631g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 128);
            this.f59114c = new e1.J();
        } else {
            this.f59116e = null;
            this.f59114c = null;
        }
    }

    public static androidx.media3.common.a f(a aVar, int i10, String str, String str2) {
        byte[] copyOf = Arrays.copyOf(aVar.data, aVar.f59125c);
        e1.I i11 = new e1.I(copyOf);
        i11.s(i10);
        i11.s(4);
        i11.q();
        i11.r(8);
        if (i11.g()) {
            i11.r(4);
            i11.r(3);
        }
        int h10 = i11.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = i11.h(8);
            int h12 = i11.h(8);
            if (h12 == 0) {
                AbstractC4156x.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = h11 / h12;
            }
        } else {
            float[] fArr = PIXEL_WIDTH_HEIGHT_RATIO_BY_ASPECT_RATIO_INFO;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                AbstractC4156x.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (i11.g()) {
            i11.r(2);
            i11.r(1);
            if (i11.g()) {
                i11.r(15);
                i11.q();
                i11.r(15);
                i11.q();
                i11.r(15);
                i11.q();
                i11.r(3);
                i11.r(11);
                i11.q();
                i11.r(15);
                i11.q();
            }
        }
        if (i11.h(2) != 0) {
            AbstractC4156x.i("H263Reader", "Unhandled video object layer shape");
        }
        i11.q();
        int h13 = i11.h(16);
        i11.q();
        if (i11.g()) {
            if (h13 == 0) {
                AbstractC4156x.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i12 = 0;
                for (int i13 = h13 - 1; i13 > 0; i13 >>= 1) {
                    i12++;
                }
                i11.r(i12);
            }
        }
        i11.q();
        int h14 = i11.h(13);
        i11.q();
        int h15 = i11.h(13);
        i11.q();
        i11.q();
        return new a.b().j0(str).W(str2).y0("video/mp4v-es").F0(h14).h0(h15).u0(f10).k0(Collections.singletonList(copyOf)).P();
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        AbstractC4134a.i(this.f59117f);
        AbstractC4134a.i(this.f59120i);
        int g10 = j10.g();
        int j11 = j10.j();
        byte[] f10 = j10.f();
        this.f59118g += j10.a();
        this.f59120i.a(j10, j10.a());
        while (true) {
            int e10 = AbstractC4230h.e(f10, g10, j11, this.prefixFlags);
            if (e10 == j11) {
                break;
            }
            int i10 = e10 + 3;
            int i11 = j10.f()[i10] & UByte.MAX_VALUE;
            int i12 = e10 - g10;
            int i13 = 0;
            if (!this.f59121j) {
                if (i12 > 0) {
                    this.f59115d.a(f10, g10, e10);
                }
                if (this.f59115d.b(i11, i12 < 0 ? -i12 : 0)) {
                    H1.O o10 = this.f59120i;
                    a aVar = this.f59115d;
                    o10.c(f(aVar, aVar.f59126d, (String) AbstractC4134a.e(this.f59119h), this.f59113b));
                    this.f59121j = true;
                }
            }
            this.f59117f.a(f10, g10, e10);
            w wVar = this.f59116e;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(f10, g10, e10);
                } else {
                    i13 = -i12;
                }
                if (this.f59116e.b(i13)) {
                    w wVar2 = this.f59116e;
                    ((e1.J) Z.i(this.f59114c)).Z(this.f59116e.nalData, AbstractC4230h.L(wVar2.nalData, wVar2.f59286d));
                    ((O) Z.i(this.f59112a)).b(this.f59122k, this.f59114c);
                }
                if (i11 == 178 && j10.f()[e10 + 2] == 1) {
                    this.f59116e.e(i11);
                }
            }
            int i14 = j11 - e10;
            this.f59117f.b(this.f59118g - i14, i14, this.f59121j);
            this.f59117f.c(i11, this.f59122k);
            g10 = i10;
        }
        if (!this.f59121j) {
            this.f59115d.a(f10, g10, j11);
        }
        this.f59117f.a(f10, g10, j11);
        w wVar3 = this.f59116e;
        if (wVar3 != null) {
            wVar3.a(f10, g10, j11);
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        AbstractC4230h.c(this.prefixFlags);
        this.f59115d.c();
        b bVar = this.f59117f;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f59116e;
        if (wVar != null) {
            wVar.d();
        }
        this.f59118g = 0L;
        this.f59122k = -9223372036854775807L;
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
        AbstractC4134a.i(this.f59117f);
        if (z10) {
            this.f59117f.b(this.f59118g, 0, this.f59121j);
            this.f59117f.d();
        }
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        this.f59119h = dVar.b();
        H1.O c10 = rVar.c(dVar.c(), 2);
        this.f59120i = c10;
        this.f59117f = new b(c10);
        O o10 = this.f59112a;
        if (o10 != null) {
            o10.c(rVar, dVar);
        }
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        this.f59122k = j10;
    }
}
