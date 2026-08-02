package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0003¨\u0006\u0005"}, d2 = {"fromMillis", "Lcom/google/protobuf/Timestamp;", "millis", "", IronSourceConstants.EVENTS_DURATION, "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j) {
        return System.nanoTime() - j;
    }

    @NotNull
    public static final Timestamp fromMillis(long j) {
        Timestamp build = Timestamp.newBuilder().setSeconds(j / 1000).setNanos((int) ((j % 1000) * 1000000)).build();
        build.getClass();
        return build;
    }
}
