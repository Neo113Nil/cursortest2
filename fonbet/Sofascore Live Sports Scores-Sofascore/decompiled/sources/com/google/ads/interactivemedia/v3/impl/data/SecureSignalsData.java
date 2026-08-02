package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.iok;
import defpackage.q1p;
import defpackage.uzg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_SecureSignalsData.class)
/* loaded from: classes2.dex */
public abstract class SecureSignalsData {
    @NonNull
    public static SecureSignalsData createBy1stPartyData(@NonNull uzg uzgVar) {
        throw null;
    }

    @NonNull
    public static SecureSignalsData createBy3rdPartyData(@NonNull iok iokVar, @NonNull iok iokVar2, @NonNull String str, @NonNull String str2) {
        return createBy3rdPartyData(SecureSignalsVersionData.create(iokVar), SecureSignalsVersionData.create(iokVar2), str, str2);
    }

    @Nullable
    public abstract SecureSignalsVersionData adapterVersion();

    @NonNull
    public abstract Boolean isPublisherCreated();

    @NonNull
    public abstract String name();

    @Nullable
    public abstract SecureSignalsVersionData sdkVersion();

    @NonNull
    public abstract String signals();

    @NonNull
    public static SecureSignalsData createBy3rdPartyData(@NonNull SecureSignalsVersionData secureSignalsVersionData, @NonNull SecureSignalsVersionData secureSignalsVersionData2, @NonNull String str, @NonNull String str2) {
        return new AutoValue_SecureSignalsData(secureSignalsVersionData, secureSignalsVersionData2, str, str2, Boolean.FALSE);
    }
}
