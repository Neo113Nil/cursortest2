package com.google.android.gms.internal.ads;

import defpackage.dpo;
import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhem implements zzhff {
    public final ByteArrayInputStream a;

    public zzhem(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final zzhuc a() {
        ByteArrayInputStream byteArrayInputStream = this.a;
        try {
            zziew zziewVar = zziew.b;
            int i = dpo.a;
            return zzhuc.I(byteArrayInputStream, zziew.c);
        } finally {
            byteArrayInputStream.close();
        }
    }
}
