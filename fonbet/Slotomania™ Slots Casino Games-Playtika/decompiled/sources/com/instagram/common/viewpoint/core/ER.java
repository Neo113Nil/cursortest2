package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* loaded from: assets/audience_network/classes2.dex */
public class ER {

    @Nullable
    public final C2255qI A00;
    public final Throwable A01;

    public ER(@Nullable C2255qI c2255qI, Throwable th) {
        this.A00 = c2255qI;
        this.A01 = th;
    }
}
