package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.hbo;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.װ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0465 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ConcurrentHashMap f1515 = new ConcurrentHashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m278() {
        C0480 c0480 = (C0480) this.f1515.get(1);
        if (c0480 == null) {
            hbo.l(1, StringFog.decrypt("BrW0jY8N8bk6+v+bk1/hsz208N6MEPX8I7/t3qM7vfw=\n", "SNqU/up/h9w=\n"));
            return null;
        }
        byte[] m298 = c0480.m298();
        byte[] bArr = new byte[m298.length];
        System.arraycopy(m298, 0, bArr, 0, m298.length);
        return bArr;
    }
}
