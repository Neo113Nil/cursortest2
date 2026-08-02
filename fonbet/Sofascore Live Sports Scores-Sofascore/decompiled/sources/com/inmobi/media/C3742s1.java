package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.s1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3742s1 {
    public final AbstractC3587m1 a;
    public final Gk b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final C3716r1 j;

    public C3742s1(AbstractC3587m1 abstractC3587m1) {
        abstractC3587m1.getClass();
        this.a = abstractC3587m1;
        this.b = new Gk();
        this.j = new C3716r1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        String telemetryMetadataBlob;
        AdSet s = this.a.s();
        return (s == null || (ads = s.getAds()) == null || (ad = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull(ads)) == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
