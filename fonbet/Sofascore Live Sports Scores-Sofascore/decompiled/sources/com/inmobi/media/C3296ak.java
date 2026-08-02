package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ak, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3296ak implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.valueOf(((Image) obj2).getWidth()).compareTo(Integer.valueOf(((Image) obj).getWidth()));
    }
}
