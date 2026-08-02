package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibk implements zzibp {
    @Override // com.google.android.gms.internal.ads.zzibp
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
