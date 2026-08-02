package com.google.android.gms.internal.ads;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.inn;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyn implements zzinw {
    @Override // com.google.android.gms.internal.ads.zziol
    public final /* synthetic */ Object zzb() {
        Object arrayList = new ArrayList();
        inn innVar = zzbjg.ud;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
        }
        zzioe.a(arrayList);
        return arrayList;
    }
}
