package com.google.android.gms.internal.cast;

import android.widget.RelativeLayout;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdb extends UIController {
    public final RelativeLayout b;

    public zzdb(RelativeLayout relativeLayout) {
        this.b = relativeLayout;
        relativeLayout.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        this.b.setEnabled(true);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        this.b.setEnabled(false);
        this.a = null;
    }
}
