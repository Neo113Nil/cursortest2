package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x {
    public final List a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] b;

    public x(List list) {
        this.a = list;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i = 0; i < this.b.length; i++) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a = jVar.a(e0Var.d, 3);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = (com.fyber.inneractive.sdk.player.exoplayer2.o) this.a.get(i);
            String str = oVar.f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = oVar.a;
            if (str2 == null) {
                e0Var.b();
                str2 = e0Var.e;
            }
            a.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str2, str, oVar.x, oVar.y, oVar.z, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
            this.b[i] = a;
        }
    }
}
