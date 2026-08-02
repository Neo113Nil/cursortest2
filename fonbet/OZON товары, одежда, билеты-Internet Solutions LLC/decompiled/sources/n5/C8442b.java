package n5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n5.f;
import n5.g;
import n5.n;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.G;
import sf.z;
import v5.C10239m;
import w5.C10435g;
import w5.EnumC10434f;
import xe.C10759y0;

/* renamed from: n5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8442b implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n f76505a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f76506b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Je.f f76507c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final j f76508d;

    /* renamed from: n5.b$a */
    private static final class a extends sf.q {

        /* renamed from: a, reason: collision with root package name */
        private Exception f76509a;

        public final Exception c() {
            return this.f76509a;
        }

        @Override // sf.q, sf.M
        public final long read(@NotNull C9681g c9681g, long j11) {
            try {
                return super.read(c9681g, j11);
            } catch (Exception e11) {
                this.f76509a = e11;
                throw e11;
            }
        }
    }

    /* renamed from: n5.b$b, reason: collision with other inner class name */
    public static final class C1290b implements g.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final j f76510a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Je.f f76511b;

        public C1290b(int i11, @NotNull j jVar) {
            this.f76510a = jVar;
            this.f76511b = Je.k.a(i11);
        }

        @Override // n5.g.a
        @NotNull
        public final g a(@NotNull p5.m mVar, @NotNull C10239m c10239m) {
            return new C8442b(mVar.c(), c10239m, this.f76511b, this.f76510a);
        }

        public final boolean equals(Object obj) {
            return obj instanceof C1290b;
        }

        public final int hashCode() {
            return C1290b.class.hashCode();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {232, 46}, m = "decode")
    /* renamed from: n5.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Object f76512d;

        /* renamed from: e, reason: collision with root package name */
        Object f76513e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76514f;

        /* renamed from: h, reason: collision with root package name */
        int f76516h;

        c(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f76514f = obj;
            this.f76516h |= LinearLayoutManager.INVALID_OFFSET;
            return C8442b.this.a(this);
        }
    }

    /* renamed from: n5.b$d */
    static final class d extends AbstractC7737t implements Function0<e> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            return C8442b.b(C8442b.this, new BitmapFactory.Options());
        }
    }

    public C8442b(@NotNull n nVar, @NotNull C10239m c10239m, @NotNull Je.f fVar, @NotNull j jVar) {
        this.f76505a = nVar;
        this.f76506b = c10239m;
        this.f76507c = fVar;
        this.f76508d = jVar;
    }

    public static final e b(C8442b c8442b, BitmapFactory.Options options) {
        h hVar;
        G g10;
        boolean z11;
        int min;
        double max;
        int i11;
        boolean z12 = true;
        n nVar = c8442b.f76505a;
        a aVar = new a(nVar.d());
        G d11 = z.d(aVar);
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(d11.peek().a2(), null, options);
        Exception c11 = aVar.c();
        if (c11 != null) {
            throw c11;
        }
        options.inJustDecodeBounds = false;
        int i12 = k.f76527b;
        if (l.b(c8442b.f76508d, options.outMimeType)) {
            androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(new i(d11.peek().a2()));
            int f7 = aVar2.f(1, "Orientation");
            boolean z13 = f7 == 2 || f7 == 7 || f7 == 4 || f7 == 5;
            switch (aVar2.f(1, "Orientation")) {
                case 3:
                case 4:
                    i11 = 180;
                    break;
                case 5:
                case 8:
                    i11 = 270;
                    break;
                case 6:
                case 7:
                    i11 = 90;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            hVar = new h(z13, i11);
        } else {
            hVar = h.f76521c;
        }
        Exception c12 = aVar.c();
        if (c12 != null) {
            throw c12;
        }
        options.inMutable = false;
        C10239m c10239m = c8442b.f76506b;
        if (c10239m.d() != null) {
            options.inPreferredColorSpace = c10239m.d();
        }
        options.inPremultiplied = c10239m.l();
        Bitmap.Config e11 = c10239m.e();
        if ((hVar.b() || hVar.a() > 0) && (e11 == null || e11 == Bitmap.Config.HARDWARE)) {
            e11 = Bitmap.Config.ARGB_8888;
        }
        if (c10239m.c() && e11 == Bitmap.Config.ARGB_8888 && Intrinsics.d(options.outMimeType, "image/jpeg")) {
            e11 = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && e11 != Bitmap.Config.HARDWARE) {
            e11 = config2;
        }
        options.inPreferredConfig = e11;
        n.a c13 = nVar.c();
        if ((c13 instanceof r) && Intrinsics.d(c10239m.n(), C10435g.f103580c)) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((r) c13).a();
            options.inTargetDensity = c10239m.f().getResources().getDisplayMetrics().densityDpi;
            g10 = d11;
            z11 = false;
        } else if (options.outWidth <= 0 || options.outHeight <= 0) {
            g10 = d11;
            options.inSampleSize = 1;
            z11 = false;
            options.inScaled = false;
        } else {
            int i13 = l.a(hVar) ? options.outHeight : options.outWidth;
            int i14 = l.a(hVar) ? options.outWidth : options.outHeight;
            C10435g n11 = c10239m.n();
            EnumC10434f m11 = c10239m.m();
            C10435g c10435g = C10435g.f103580c;
            int h11 = Intrinsics.d(n11, c10435g) ? i13 : A5.k.h(n11.d(), m11);
            C10435g n12 = c10239m.n();
            int h12 = Intrinsics.d(n12, c10435g) ? i14 : A5.k.h(n12.c(), c10239m.m());
            EnumC10434f m12 = c10239m.m();
            int highestOneBit = Integer.highestOneBit(i13 / h11);
            int highestOneBit2 = Integer.highestOneBit(i14 / h12);
            int[] iArr = f.a.f76520a;
            int i15 = iArr[m12.ordinal()];
            if (i15 == 1) {
                min = Math.min(highestOneBit, highestOneBit2);
            } else {
                if (i15 != 2) {
                    throw new Sc.o();
                }
                min = Math.max(highestOneBit, highestOneBit2);
            }
            if (min < 1) {
                min = 1;
            }
            options.inSampleSize = min;
            double d12 = min;
            double d13 = i13 / d12;
            g10 = d11;
            double d14 = i14 / d12;
            double d15 = h11 / d13;
            double d16 = h12 / d14;
            int i16 = iArr[c10239m.m().ordinal()];
            if (i16 == 1) {
                max = Math.max(d15, d16);
            } else {
                if (i16 != 2) {
                    throw new Sc.o();
                }
                max = Math.min(d15, d16);
            }
            if (c10239m.b() && max > 1.0d) {
                max = 1.0d;
            }
            boolean z14 = max == 1.0d;
            options.inScaled = !z14;
            if (!z14) {
                if (max > 1.0d) {
                    options.inDensity = C6915b.b(Integer.MAX_VALUE / max);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = C6915b.b(Integer.MAX_VALUE * max);
                }
            }
            z11 = false;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(g10.a2(), null, options);
            g10.close();
            Exception c14 = aVar.c();
            if (c14 != null) {
                throw c14;
            }
            if (decodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            decodeStream.setDensity(c10239m.f().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(c10239m.f().getResources(), k.a(decodeStream, hVar));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z12 = z11;
            }
            return new e(bitmapDrawable, z12);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v12, types: [Je.f] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [Je.f] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [Je.f] */
    @Override // n5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.d<? super e> dVar) {
        c cVar;
        Wc.a aVar;
        int i11;
        Object obj;
        C8442b c8442b;
        ?? r02;
        Throwable th2;
        Object a11;
        try {
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i12 = cVar.f76516h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    cVar.f76516h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = cVar.f76514f;
                    aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = cVar.f76516h;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        cVar.f76512d = this;
                        obj = this.f76507c;
                        cVar.f76513e = obj;
                        cVar.f76516h = 1;
                        if (((Je.h) obj).d(cVar) != aVar) {
                            c8442b = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r02 = (Je.f) cVar.f76512d;
                        try {
                            Sc.s.b(obj2);
                            r02 = r02;
                            e eVar = (e) obj2;
                            r02.release();
                            return eVar;
                        } catch (Throwable th3) {
                            th2 = th3;
                            r02.release();
                            throw th2;
                        }
                    }
                    Je.f fVar = (Je.f) cVar.f76513e;
                    c8442b = (C8442b) cVar.f76512d;
                    Sc.s.b(obj2);
                    obj = fVar;
                    d dVar2 = c8442b.new d();
                    cVar.f76512d = obj;
                    cVar.f76513e = null;
                    cVar.f76516h = 2;
                    a11 = C10759y0.a(dVar2, cVar);
                    if (a11 != aVar) {
                        r02 = obj;
                        obj2 = a11;
                        e eVar2 = (e) obj2;
                        r02.release();
                        return eVar2;
                    }
                    return aVar;
                }
            }
            d dVar22 = c8442b.new d();
            cVar.f76512d = obj;
            cVar.f76513e = null;
            cVar.f76516h = 2;
            a11 = C10759y0.a(dVar22, cVar);
            if (a11 != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            r02 = obj;
            th2 = th4;
            r02.release();
            throw th2;
        }
        cVar = new c((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj22 = cVar.f76514f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar.f76516h;
        if (i11 != 0) {
        }
    }
}
