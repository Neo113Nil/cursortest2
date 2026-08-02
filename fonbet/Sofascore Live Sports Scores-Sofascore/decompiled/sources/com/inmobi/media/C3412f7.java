package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import defpackage.d2g;
import defpackage.epf;
import defpackage.h2g;
import defpackage.i2g;
import defpackage.p7a;
import defpackage.q7a;
import defpackage.q89;
import defpackage.qff;
import defpackage.qzf;
import defpackage.vuj;
import defpackage.zdc;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3412f7 implements q7a {
    public static final C3412f7 a = new C3412f7();

    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        p7aVar.getClass();
        AbstractC3386e7.a();
        epf epfVar = (epf) p7aVar;
        qzf qzfVar = epfVar.e;
        Objects.toString(qzfVar);
        if (AbstractC3386e7.a()) {
            return epfVar.b(qzfVar);
        }
        h2g h2gVar = i2g.Companion;
        ArrayList arrayList = new ArrayList(20);
        qzfVar.getClass();
        qff qffVar = qff.HTTP_1_1;
        C3437g6 c3437g6 = EnumC3489i6.b;
        i2g create = i2g.create((zdc) null, "");
        create.getClass();
        return new d2g(qzfVar, qffVar, "GDPR_COMPLIANCE_ENFORCED", PsExtractor.AUDIO_STREAM, null, new q89((String[]) arrayList.toArray(new String[0])), create, null, null, null, null, 0L, 0L, null, vuj.C7);
    }
}
