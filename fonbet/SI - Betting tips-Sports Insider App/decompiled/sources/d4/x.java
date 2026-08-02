package d4;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f8163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f8164c;

    public /* synthetic */ x(l lVar, Ref.BooleanRef booleanRef, int i5) {
        this.f8162a = i5;
        this.f8164c = lVar;
        this.f8163b = booleanRef;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        switch (this.f8162a) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                q4.n nVar = ((y) this.f8164c).f8167c;
                long j = y4.a.j(width, height, nVar.f22008b, nVar.f22009c, (r4.i) c4.p.f(nVar, q4.i.f21996b));
                int i5 = (int) (j >> 32);
                int i10 = (int) (j & 4294967295L);
                if (width > 0 && height > 0 && (width != i5 || height != i10)) {
                    double k6 = y4.a.k(width, height, i5, i10, ((y) this.f8164c).f8167c.f22009c);
                    boolean z5 = k6 < 1.0d;
                    this.f8163b.element = z5;
                    if (z5 || ((y) this.f8164c).f8167c.f22010d == r4.d.f22293a) {
                        imageDecoder.setTargetSize(wf.b.a(width * k6), wf.b.a(k6 * height));
                    }
                }
                y yVar = (y) this.f8164c;
                imageDecoder.setOnPartialImageListener(new u());
                q4.n nVar2 = yVar.f8167c;
                imageDecoder.setAllocator(s6.a.o(q4.j.a(nVar2)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) c4.p.f(nVar2, q4.j.f22005g)).booleanValue() ? 1 : 0);
                c4.k kVar = q4.j.f22001c;
                if (com.google.firebase.messaging.k.g(c4.p.f(nVar2, kVar)) != null) {
                    imageDecoder.setTargetColorSpace(com.google.firebase.messaging.k.g(c4.p.f(nVar2, kVar)));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) c4.p.f(nVar2, q4.j.f22002d)).booleanValue());
                return;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                q4.n nVar3 = ((g4.e) this.f8164c).f9752b;
                long j6 = y4.a.j(width2, height2, nVar3.f22008b, nVar3.f22009c, (r4.i) c4.p.f(nVar3, q4.i.f21996b));
                int i11 = (int) (j6 >> 32);
                int i12 = (int) (j6 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i11 || height2 != i12)) {
                    double k9 = y4.a.k(width2, height2, i11, i12, ((g4.e) this.f8164c).f9752b.f22009c);
                    boolean z7 = k9 < 1.0d;
                    this.f8163b.element = z7;
                    if (z7 || ((g4.e) this.f8164c).f9752b.f22010d == r4.d.f22293a) {
                        imageDecoder.setTargetSize(wf.b.a(width2 * k9), wf.b.a(k9 * height2));
                    }
                }
                q4.n nVar4 = ((g4.e) this.f8164c).f9752b;
                imageDecoder.setAllocator(s6.a.o(q4.j.a(nVar4)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) c4.p.f(nVar4, q4.j.f22005g)).booleanValue() ? 1 : 0);
                c4.k kVar2 = q4.j.f22001c;
                if (com.google.firebase.messaging.k.g(c4.p.f(nVar4, kVar2)) != null) {
                    imageDecoder.setTargetColorSpace(com.google.firebase.messaging.k.g(c4.p.f(nVar4, kVar2)));
                }
                if (c4.p.f(nVar4, g4.i.f9767b) != null) {
                    throw new ClassCastException();
                }
                imageDecoder.setPostProcessor(null);
                return;
        }
    }
}
