package D4;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.u;

/* loaded from: classes2.dex */
public final class j implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final A f2534a = A.b();

    /* renamed from: b, reason: collision with root package name */
    public final int f2535b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2536c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.load.b f2537d;

    /* renamed from: e, reason: collision with root package name */
    public final p f2538e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2539f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.load.k f2540g;

    public class a implements ImageDecoder$OnPartialImageListener {
        public a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public j(int i10, int i11, com.bumptech.glide.load.j jVar) {
        this.f2535b = i10;
        this.f2536c = i11;
        this.f2537d = (com.bumptech.glide.load.b) jVar.c(u.f30052f);
        this.f2538e = (p) jVar.c(p.f30048h);
        com.bumptech.glide.load.i iVar = u.f30056j;
        this.f2539f = jVar.c(iVar) != null && ((Boolean) jVar.c(iVar)).booleanValue();
        this.f2540g = (com.bumptech.glide.load.k) jVar.c(u.f30053g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.f2534a.f(this.f2535b, this.f2536c, this.f2539f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f2537d == com.bumptech.glide.load.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i10 = this.f2535b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f2536c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f2538e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * b10);
        int round2 = Math.round(b10 * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        com.bumptech.glide.load.k kVar = this.f2540g;
        if (kVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 28) {
                if (i12 >= 26) {
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (kVar == com.bumptech.glide.load.k.DISPLAY_P3) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named2 = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named2);
                        imageDecoder.setTargetColorSpace(colorSpace2);
                    }
                }
            }
            named2 = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named2);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}
