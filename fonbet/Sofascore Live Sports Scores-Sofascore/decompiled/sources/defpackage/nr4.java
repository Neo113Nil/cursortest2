package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nr4 implements ImageDecoder$OnHeaderDecodedListener {
    public final e79 a = e79.a();
    public final int b;
    public final int c;
    public final rl4 d;
    public final l75 e;
    public final boolean f;
    public final p5f g;

    public nr4(int i, int i2, uvd uvdVar) {
        this.b = i;
        this.c = i2;
        this.d = (rl4) uvdVar.c(n75.f);
        this.e = (l75) uvdVar.c(l75.c);
        ivd ivdVar = n75.i;
        this.f = uvdVar.c(ivdVar) != null && ((Boolean) uvdVar.c(ivdVar)).booleanValue();
        this.g = (p5f) uvdVar.c(n75.g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        e79 e79Var = this.a;
        int i = this.b;
        int i2 = this.c;
        if (e79Var.c(i, i2, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == rl4.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new mr4());
        Size size = imageInfo.getSize();
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.e.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        p5f p5fVar = this.g;
        if (p5fVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((p5fVar == p5f.a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
