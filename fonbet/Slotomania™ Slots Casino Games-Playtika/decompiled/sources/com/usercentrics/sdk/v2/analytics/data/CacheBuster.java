package com.usercentrics.sdk.v2.analytics.data;

import com.usercentrics.sdk.core.time.DateTime;
import kotlin.Metadata;
import kotlin.random.Random;

/* compiled from: CacheBuster.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/usercentrics/sdk/v2/analytics/data/CacheBuster;", "", "()V", "generate", "", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheBuster {
    public static final CacheBuster INSTANCE = new CacheBuster();

    private CacheBuster() {
    }

    public final String generate() {
        long timestamp = new DateTime().timestamp();
        return new StringBuilder().append(timestamp).append(Random.INSTANCE.nextInt(0, 10000)).toString();
    }
}
