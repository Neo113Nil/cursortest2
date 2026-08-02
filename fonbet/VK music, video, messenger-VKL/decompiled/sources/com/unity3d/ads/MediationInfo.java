package com.unity3d.ads;

import java.util.Locale;

/* compiled from: MediationInfo.kt */
/* loaded from: classes14.dex */
public final class MediationInfo {
    private final String adapterVersion;
    private final String name;
    private final String version;

    public MediationInfo(String str, String str2, String str3) {
        this.version = str2;
        this.adapterVersion = str3;
        this.name = str.toLowerCase(Locale.ROOT);
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }
}
