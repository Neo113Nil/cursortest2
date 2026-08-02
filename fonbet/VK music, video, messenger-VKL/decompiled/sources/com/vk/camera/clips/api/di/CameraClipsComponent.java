package com.vk.camera.clips.api.di;

import com.vk.camera.clips.api.stub.CameraClipsComponentStub;
import com.vk.di.component.DiScopedComponent;
import xsna.lbk;
import xsna.lkt0;
import xsna.pwj0;
import xsna.qhd;
import xsna.qtd;
import xsna.rhd;
import xsna.vyd;
import xsna.xke;

/* compiled from: CameraClipsComponent.kt */
/* loaded from: classes.dex */
public interface CameraClipsComponent extends DiScopedComponent<pwj0> {
    public static final a Companion = a.a;

    /* compiled from: CameraClipsComponent.kt */
    /* loaded from: classes14.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final CameraClipsComponentStub STUB = new CameraClipsComponentStub();

        public final CameraClipsComponentStub getSTUB() {
            return STUB;
        }
    }

    qhd X9();

    lkt0 a5();

    lbk c4();

    qtd e1();

    xke getLogger();

    rhd p9();

    vyd sf();
}
