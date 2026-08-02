package d4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import eg.c0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.Okio;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final r f8121a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.n f8122b;

    /* renamed from: c, reason: collision with root package name */
    public final ng.i f8123c;

    /* renamed from: d, reason: collision with root package name */
    public final o f8124d;

    public e(r rVar, q4.n nVar, ng.i iVar, o oVar) {
        this.f8121a = rVar;
        this.f8122b = nVar;
        this.f8123c = iVar;
        this.f8124d = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i b(e eVar) {
        m mVar;
        Context context;
        boolean z5;
        boolean z7;
        Bitmap createBitmap;
        int i5;
        int min;
        double max;
        int e7;
        m1.c c2;
        int e9;
        int i10;
        BitmapFactory.Options options = new BitmapFactory.Options();
        q4.n nVar = eVar.f8122b;
        b bVar = new b(eVar.f8121a.m0());
        BufferedSource buffer = Okio.buffer(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(buffer.peek().inputStream(), null, options);
        Exception exc = (Exception) bVar.f8113b;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = p.f8141a;
        String str = options.outMimeType;
        eVar.f8124d.getClass();
        if (str != null && (Intrinsics.areEqual(str, "image/jpeg") || Intrinsics.areEqual(str, "image/webp") || Intrinsics.areEqual(str, "image/heic") || Intrinsics.areEqual(str, "image/heif"))) {
            m1.g gVar = new m1.g(new n(buffer.peek().inputStream()));
            m1.c c8 = gVar.c("Orientation");
            if (c8 != null) {
                try {
                    e7 = c8.e(gVar.f20172e);
                } catch (NumberFormatException unused) {
                }
                boolean z11 = e7 != 2 || e7 == 7 || e7 == 4 || e7 == 5;
                c2 = gVar.c("Orientation");
                if (c2 != null) {
                    try {
                        e9 = c2.e(gVar.f20172e);
                    } catch (NumberFormatException unused2) {
                    }
                    switch (e9) {
                        case 3:
                        case 4:
                            i10 = 180;
                            break;
                        case 5:
                        case 8:
                            i10 = 270;
                            break;
                        case 6:
                        case 7:
                            i10 = 90;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    mVar = new m(i10, z11);
                }
                e9 = 1;
                switch (e9) {
                }
                mVar = new m(i10, z11);
            }
            e7 = 1;
            if (e7 != 2) {
            }
            c2 = gVar.c("Orientation");
            if (c2 != null) {
            }
            e9 = 1;
            switch (e9) {
            }
            mVar = new m(i10, z11);
        } else {
            mVar = m.f8135c;
        }
        int i11 = mVar.f8137b;
        boolean z12 = mVar.f8136a;
        Exception exc2 = (Exception) bVar.f8113b;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && q4.j.b(nVar) != null) {
            options.inPreferredColorSpace = (ColorSpace) c4.p.f(nVar, q4.j.f22001c);
        }
        boolean booleanValue = ((Boolean) c4.p.f(nVar, q4.j.f22002d)).booleanValue();
        Context context2 = nVar.f22007a;
        options.inPremultiplied = booleanValue;
        Bitmap.Config config = (Bitmap.Config) c4.p.f(nVar, q4.j.f22000b);
        if ((z12 || i11 > 0) && (config == null || s6.a.o(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (((Boolean) c4.p.f(nVar, q4.j.f22005g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i12 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        int i13 = options.outWidth;
        if (i13 <= 0 || (i5 = options.outHeight) <= 0) {
            context = context2;
            z5 = z12;
            options.inSampleSize = 1;
            z7 = false;
            options.inScaled = false;
        } else {
            int i14 = (i11 == 90 || i11 == 270) ? i5 : i13;
            if (i11 != 90 && i11 != 270) {
                i13 = i5;
            }
            r4.i iVar = nVar.f22008b;
            r4.g gVar2 = nVar.f22009c;
            long j = y4.a.j(i14, i13, iVar, gVar2, (r4.i) c4.p.f(nVar, q4.i.f21996b));
            int i15 = (int) (j >> 32);
            int i16 = (int) (j & 4294967295L);
            int highestOneBit = Integer.highestOneBit(i14 / i15);
            int highestOneBit2 = Integer.highestOneBit(i13 / i16);
            int[] iArr = j.$EnumSwitchMapping$0;
            context = context2;
            int i17 = iArr[gVar2.ordinal()];
            if (i17 == 1) {
                min = Math.min(highestOneBit, highestOneBit2);
            } else {
                if (i17 != 2) {
                    throw new gf.m();
                }
                min = Math.max(highestOneBit, highestOneBit2);
            }
            if (min < 1) {
                min = 1;
            }
            options.inSampleSize = min;
            z5 = z12;
            double d10 = min;
            double d11 = i14 / d10;
            double d12 = i13 / d10;
            double d13 = i15 / d11;
            double d14 = i16 / d12;
            int i18 = iArr[gVar2.ordinal()];
            if (i18 == 1) {
                max = Math.max(d13, d14);
            } else {
                if (i18 != 2) {
                    throw new gf.m();
                }
                max = Math.min(d13, d14);
            }
            if (nVar.f22010d == r4.d.f22294b && max > 1.0d) {
                max = 1.0d;
            }
            boolean z13 = max == 1.0d;
            options.inScaled = !z13;
            if (!z13) {
                if (max > 1.0d) {
                    options.inDensity = wf.b.a(Integer.MAX_VALUE / max);
                    options.inTargetDensity = Integer.MAX_VALUE;
                } else {
                    options.inDensity = Integer.MAX_VALUE;
                    options.inTargetDensity = wf.b.a(Integer.MAX_VALUE * max);
                }
            }
            z7 = false;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(buffer.inputStream(), null, options);
            buffer.close();
            Exception exc3 = (Exception) bVar.f8113b;
            if (exc3 != null) {
                throw exc3;
            }
            if (decodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z5 || i11 > 0) {
                Matrix matrix = new Matrix();
                float width = decodeStream.getWidth() / 2.0f;
                float height = decodeStream.getHeight() / 2.0f;
                if (z5) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i11 > 0) {
                    matrix.postRotate(i11, width, height);
                }
                RectF rectF = new RectF(0.0f, 0.0f, decodeStream.getWidth(), decodeStream.getHeight());
                matrix.mapRect(rectF);
                float f6 = rectF.left;
                if (f6 != 0.0f || rectF.top != 0.0f) {
                    matrix.postTranslate(-f6, -rectF.top);
                }
                if (i11 == 90 || i11 == 270) {
                    int height2 = decodeStream.getHeight();
                    int width2 = decodeStream.getWidth();
                    Bitmap.Config config4 = decodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = decodeStream.getWidth();
                    int height3 = decodeStream.getHeight();
                    Bitmap.Config config5 = decodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    createBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(createBitmap).drawBitmap(decodeStream, matrix, p.f8141a);
                decodeStream.recycle();
                decodeStream = createBitmap;
            }
            c4.m c10 = c4.p.c(new BitmapDrawable(context.getResources(), decodeStream));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = z7;
            }
            return new i(c10, z10);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v3, types: [ng.e] */
    @Override // d4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        d dVar;
        lf.a aVar;
        int i5;
        ng.i iVar;
        int i10;
        Object obj;
        Throwable th2;
        Object x10;
        try {
            if (continuation instanceof d) {
                dVar = (d) continuation;
                int i11 = dVar.f8120e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dVar.f8120e = i11 - Integer.MIN_VALUE;
                    Object obj2 = dVar.f8118c;
                    aVar = lf.a.f20034a;
                    i5 = dVar.f8120e;
                    if (i5 != 0) {
                        h8.b.B(obj2);
                        iVar = this.f8123c;
                        dVar.f8116a = iVar;
                        i10 = 0;
                        dVar.f8117b = 0;
                        dVar.f8120e = 1;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = dVar.f8116a;
                            try {
                                h8.b.B(obj2);
                                i iVar2 = (i) obj2;
                                ((ng.h) obj).d();
                                return iVar2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                ((ng.h) obj).d();
                                throw th2;
                            }
                        }
                        i10 = dVar.f8117b;
                        ?? r42 = dVar.f8116a;
                        h8.b.B(obj2);
                        iVar = r42;
                    }
                    a2.q qVar = new a2.q(9, this);
                    dVar.f8116a = iVar;
                    dVar.f8117b = i10;
                    dVar.f8120e = 2;
                    x10 = c0.x(qVar, dVar);
                    if (x10 != aVar) {
                        obj = iVar;
                        obj2 = x10;
                        i iVar22 = (i) obj2;
                        ((ng.h) obj).d();
                        return iVar22;
                    }
                    return aVar;
                }
            }
            a2.q qVar2 = new a2.q(9, this);
            dVar.f8116a = iVar;
            dVar.f8117b = i10;
            dVar.f8120e = 2;
            x10 = c0.x(qVar2, dVar);
            if (x10 != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            obj = iVar;
            th2 = th4;
            ((ng.h) obj).d();
            throw th2;
        }
        dVar = new d(this, (mf.c) continuation);
        Object obj22 = dVar.f8118c;
        aVar = lf.a.f20034a;
        i5 = dVar.f8120e;
        if (i5 != 0) {
        }
    }
}
