package com.google.ads.interactivemedia.v3.impl.data;

import android.net.Uri;
import androidx.annotation.NonNull;
import defpackage.b2p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class BridgeConfiguration {
    public static BridgeConfiguration create(Uri uri, String str, String str2, b2p b2pVar, long j) {
        return new AutoValue_BridgeConfiguration(uri, str, str2, b2pVar, j);
    }

    @NonNull
    public abstract Uri baseUri();

    @NonNull
    public abstract String language();

    @NonNull
    public abstract String packageName();

    public abstract long pageCorrelator();

    public abstract b2p testingConfiguration();
}
