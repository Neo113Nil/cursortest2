package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.f8n;
import defpackage.v8n;
import defpackage.ve6;
import java.io.IOException;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaci {
    public static final zzacc d = new zzacc(2, C.TIME_UNSET);
    public static final zzacc e = new zzacc(3, C.TIME_UNSET);
    public final v8n a;
    public f8n b;
    public IOException c;

    public zzaci() {
        String str = zzfm.a;
        this.a = new v8n(Executors.newSingleThreadExecutor(new ve6(1, "ExoPlayer:Loader:ProgressiveMediaPeriod")));
    }
}
