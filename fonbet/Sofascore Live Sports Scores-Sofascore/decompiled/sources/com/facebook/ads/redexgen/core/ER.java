package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* loaded from: assets/audience_network/classes2.dex */
public class ER {

    @Nullable
    public final C3212qI A00;
    public final Throwable A01;

    public ER(@Nullable C3212qI c3212qI, Throwable th) {
        this.A00 = c3212qI;
        this.A01 = th;
    }
}
