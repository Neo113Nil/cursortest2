package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.xto;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzyx implements zzxn {
    public final zzhr a;
    public final xto b;
    public int c;
    public final zzabz d;

    public zzyx(zzhr zzhrVar, zzagn zzagnVar) {
        xto xtoVar = new xto(zzagnVar, 9);
        zzabz zzabzVar = new zzabz();
        this.a = zzhrVar;
        this.b = xtoVar;
        this.d = zzabzVar;
        this.c = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }
}
