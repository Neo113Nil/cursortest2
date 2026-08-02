package com.journeyapps.barcodescanner;

import N9.m;
import android.graphics.Rect;
import com.journeyapps.barcodescanner.c;

/* loaded from: classes9.dex */
final class j implements c.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewfinderView f60338a;

    j(ViewfinderView viewfinderView) {
        this.f60338a = viewfinderView;
    }

    @Override // com.journeyapps.barcodescanner.c.e
    public final void cameraClosed() {
    }

    @Override // com.journeyapps.barcodescanner.c.e
    public final void cameraError(Exception exc) {
    }

    @Override // com.journeyapps.barcodescanner.c.e
    public final void previewSized() {
        ViewfinderView viewfinderView = this.f60338a;
        c cVar = viewfinderView.f60265i;
        if (cVar != null) {
            Rect j11 = cVar.j();
            m l11 = viewfinderView.f60265i.l();
            if (j11 != null && l11 != null) {
                viewfinderView.f60266j = j11;
                viewfinderView.f60267k = l11;
            }
        }
        viewfinderView.invalidate();
    }

    @Override // com.journeyapps.barcodescanner.c.e
    public final void previewStarted() {
    }

    @Override // com.journeyapps.barcodescanner.c.e
    public final void previewStopped() {
    }
}
