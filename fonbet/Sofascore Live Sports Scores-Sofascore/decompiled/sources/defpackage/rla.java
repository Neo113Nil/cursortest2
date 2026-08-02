package defpackage;

import android.media.ImageReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class rla implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ lj2 a;

    public rla(lj2 lj2Var) {
        this.a = lj2Var;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        p2g p2gVar = w2g.b;
        this.a.resumeWith(imageReader.acquireLatestImage());
    }
}
