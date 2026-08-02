package com.vk.content.design.view.camera;

import com.vk.content.design.view.camera.ShutterButton;
import com.vk.media.MediaUtils;
import xsna.mo9;
import xsna.zd9;

/* compiled from: CameraUIView.kt */
/* loaded from: classes17.dex */
public final class b implements ShutterButton.b {
    public final /* synthetic */ CameraUIView a;

    public b(CameraUIView cameraUIView) {
        this.a = cameraUIView;
    }

    @Override // com.vk.content.design.view.camera.ShutterButton.b
    public final void a(int i, int i2) {
        zd9 camera1View = this.a.getCamera1View();
        if (camera1View != null) {
            mo9 mo9Var = (mo9) camera1View.getCameraView();
            MediaUtils.d dVar = mo9Var.h;
            int i3 = dVar.b;
            int i4 = dVar.a;
            if (i3 * i4 == 0 || i > i4 || i2 > i3) {
                return;
            }
            mo9Var.g.getClass();
        }
    }
}
