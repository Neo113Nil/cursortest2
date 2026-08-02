package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y60 implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ asf b;
    public final /* synthetic */ am4 c;

    public /* synthetic */ y60(am4 am4Var, asf asfVar, int i) {
        this.a = i;
        this.c = am4Var;
        this.b = asfVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i = this.a;
        asf asfVar = this.b;
        am4 am4Var = this.c;
        switch (i) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                tvd tvdVar = ((d70) am4Var).b;
                kjh kjhVar = tvdVar.b;
                jrg jrgVar = tvdVar.c;
                sl6 sl6Var = st9.b;
                long q = tol.q(width, height, kjhVar, jrgVar, (kjh) fqj.x(tvdVar, sl6Var));
                int i2 = (int) (q >> 32);
                int i3 = (int) (q & 4294967295L);
                if (width > 0 && height > 0 && (width != i2 || height != i3)) {
                    tvd tvdVar2 = ((d70) am4Var).b;
                    double r = tol.r(width, height, i2, i3, tvdVar2.c, (kjh) fqj.x(tvdVar2, sl6Var));
                    boolean z = r < 1.0d;
                    asfVar.a = z;
                    if (z || ((d70) am4Var).b.d == e3f.a) {
                        imageDecoder.setTargetSize(wzb.a(width * r), wzb.a(r * height));
                    }
                }
                tvd tvdVar3 = ((d70) am4Var).b;
                imageDecoder.setAllocator(pco.H(vt9.c(tvdVar3)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) fqj.x(tvdVar3, vt9.g)).booleanValue() ? 1 : 0);
                sl6 sl6Var2 = vt9.c;
                if (((ColorSpace) fqj.x(tvdVar3, sl6Var2)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) fqj.x(tvdVar3, sl6Var2));
                }
                if (fqj.x(tvdVar3, qt9.b) != null) {
                    pvd.j();
                    break;
                } else {
                    imageDecoder.setPostProcessor(null);
                    break;
                }
                break;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                tvd tvdVar4 = ((dei) am4Var).c;
                kjh kjhVar2 = tvdVar4.b;
                jrg jrgVar2 = tvdVar4.c;
                sl6 sl6Var3 = st9.b;
                long q2 = tol.q(width2, height2, kjhVar2, jrgVar2, (kjh) fqj.x(tvdVar4, sl6Var3));
                int i4 = (int) (q2 >> 32);
                int i5 = (int) (q2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i4 || height2 != i5)) {
                    tvd tvdVar5 = ((dei) am4Var).c;
                    double r2 = tol.r(width2, height2, i4, i5, tvdVar5.c, (kjh) fqj.x(tvdVar5, sl6Var3));
                    boolean z2 = r2 < 1.0d;
                    asfVar.a = z2;
                    if (z2 || ((dei) am4Var).c.d == e3f.a) {
                        imageDecoder.setTargetSize(wzb.a(width2 * r2), wzb.a(r2 * height2));
                    }
                }
                imageDecoder.setOnPartialImageListener(new aei());
                tvd tvdVar6 = ((dei) am4Var).c;
                imageDecoder.setAllocator(pco.H(vt9.c(tvdVar6)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) fqj.x(tvdVar6, vt9.g)).booleanValue() ? 1 : 0);
                sl6 sl6Var4 = vt9.c;
                if (((ColorSpace) fqj.x(tvdVar6, sl6Var4)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) fqj.x(tvdVar6, sl6Var4));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) fqj.x(tvdVar6, vt9.d)).booleanValue());
                break;
        }
    }
}
