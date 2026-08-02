package com.vk.media.recorder;

import android.view.Surface;
import com.vk.media.MediaUtils;
import com.vk.media.recorder.RecorderBase;
import xsna.io9;
import xsna.oj9;

/* compiled from: RecorderSurfaceCompat21.java */
/* loaded from: classes3.dex */
public final class g extends i {
    public Surface L;

    @Override // com.vk.media.recorder.f
    public final Surface F() {
        if (this.r != RecorderBase.State.PREPARED) {
            return this.L;
        }
        throw null;
    }

    @Override // com.vk.media.recorder.f
    public final void N() {
        super.A();
        this.L = null;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean l() {
        return true;
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final void s(MediaUtils.e eVar) {
        oj9 oj9Var = this.c;
        MediaUtils.e eVar2 = oj9Var.e;
        boolean z = (eVar2 == null || io9.e(eVar2, eVar)) ? false : true;
        oj9Var.e = eVar;
        if (z) {
            m();
        }
    }

    @Override // com.vk.media.recorder.RecorderBase
    public final boolean z() {
        return false;
    }
}
