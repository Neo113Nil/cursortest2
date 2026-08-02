package com.vk.push.core.backoff;

/* compiled from: BackOff.kt */
/* loaded from: classes5.dex */
public interface BackOff {
    long getNextBackOff();

    void resetBackOff();
}
