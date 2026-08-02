package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbr {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public zzbr() {
        new AtomicInteger(0);
    }

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.a.get(num);
    }
}
