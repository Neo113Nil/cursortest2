package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.inmobi.media.core.config.models.CrashConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        b bVar = this.a;
        if (j == 0) {
            return bVar.b;
        }
        long j2 = (bVar.d.i * j) / 1000000;
        long j3 = bVar.b;
        long j4 = bVar.c;
        long j5 = ((((j4 - j3) * j2) / bVar.f) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) + j3;
        if (j5 >= j3) {
            j3 = j5;
        }
        return j3 >= j4 ? j4 - 1 : j3;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return (this.a.f * 1000000) / r5.d.i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }
}
