package O7;

import H7.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u7.C6528b;

/* loaded from: classes2.dex */
public final class g implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8353d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8354a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8355b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8356c = "SimpleImageTranscoder";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bitmap.CompressFormat b(u7.c cVar) {
            return cVar == null ? Bitmap.CompressFormat.JPEG : cVar == C6528b.f66196b ? Bitmap.CompressFormat.JPEG : cVar == C6528b.f66197c ? Bitmap.CompressFormat.PNG : C6528b.a(cVar) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }

        public a() {
        }
    }

    public g(boolean z10, int i10) {
        this.f8354a = z10;
        this.f8355b = i10;
    }

    @Override // O7.c
    public String a() {
        return this.f8356c;
    }

    @Override // O7.c
    public b b(k encodedImage, OutputStream outputStream, B7.h hVar, B7.g gVar, u7.c cVar, Integer num, ColorSpace colorSpace) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Integer num2 = num == null ? 85 : num;
        B7.h a10 = hVar == null ? B7.h.f853c.a() : hVar;
        int e10 = e(encodedImage, a10, gVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = e10;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(encodedImage.D0(), null, options);
            if (decodeStream == null) {
                E6.a.m("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new b(2);
            }
            Matrix g10 = e.g(encodedImage, a10);
            if (g10 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), g10, false);
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    bitmap = decodeStream;
                    E6.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar = new b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                try {
                    bitmap.compress(f8353d.b(cVar), num2.intValue(), outputStream);
                    b bVar2 = new b(e10 > 1 ? 0 : 1);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar2;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    E6.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    b bVar3 = new b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar3;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap.recycle();
                decodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e13) {
            E6.a.n("SimpleImageTranscoder", "Out-Of-Memory during transcode", e13);
            return new b(2);
        }
    }

    @Override // O7.c
    public boolean c(u7.c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == C6528b.f66206l || imageFormat == C6528b.f66196b;
    }

    @Override // O7.c
    public boolean d(k encodedImage, B7.h hVar, B7.g gVar) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (hVar == null) {
            hVar = B7.h.f853c.a();
        }
        return this.f8354a && O7.a.b(hVar, gVar, encodedImage, this.f8355b) > 1;
    }

    public final int e(k kVar, B7.h hVar, B7.g gVar) {
        if (this.f8354a) {
            return O7.a.b(hVar, gVar, kVar, this.f8355b);
        }
        return 1;
    }
}
