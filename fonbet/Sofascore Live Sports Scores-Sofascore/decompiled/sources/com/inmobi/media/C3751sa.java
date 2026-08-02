package com.inmobi.media;

import defpackage.d2g;
import defpackage.epf;
import defpackage.h2g;
import defpackage.hc5;
import defpackage.i2g;
import defpackage.ljg;
import defpackage.p7a;
import defpackage.pff;
import defpackage.q7a;
import defpackage.q89;
import defpackage.qff;
import defpackage.zdc;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3751sa implements q7a {
    public static final C3751sa a = new C3751sa();

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0047. Please report as an issue. */
    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        p7aVar.getClass();
        EnumC3489i6 a2 = AbstractC3420ff.a();
        if (a2 != null) {
            h2g h2gVar = i2g.Companion;
            ArrayList arrayList = new ArrayList(20);
            ((epf) p7aVar).e.getClass();
            pff pffVar = qff.b;
            int i = a2.a;
            a2.toString().getClass();
            i2g.create((zdc) null, "").getClass();
            if (i < 0) {
                hc5.f(ljg.j(i, "code < 0: "));
                return null;
            }
            new q89((String[]) arrayList.toArray(new String[0]));
            if (i != 307 && i != 308) {
                switch (i) {
                }
            }
        }
        epf epfVar = (epf) p7aVar;
        return epfVar.b(epfVar.e);
    }
}
