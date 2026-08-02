package com.inmobi.media;

import defpackage.d2g;
import defpackage.epf;
import defpackage.i2g;
import defpackage.p7a;
import defpackage.q7a;
import defpackage.vxd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J8 implements q7a {
    public final long a;

    public J8(long j) {
        this.a = j;
    }

    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        p7aVar.getClass();
        d2g b = ((epf) p7aVar).b(((epf) p7aVar).e);
        i2g i2gVar = b.g;
        long contentLength = i2gVar != null ? i2gVar.contentLength() : 0L;
        if (contentLength <= this.a) {
            return b;
        }
        b.close();
        throw new C3623nb(vxd.m("Image size exceeds limit: ", contentLength, " Bytes"));
    }
}
