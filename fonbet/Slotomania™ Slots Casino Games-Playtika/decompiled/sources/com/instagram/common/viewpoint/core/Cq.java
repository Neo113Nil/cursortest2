package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: assets/audience_network/classes2.dex */
public final class Cq {
    public static final AtomicLong A07 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C05155i A05;
    public final Map<String, List<String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Cq(long j, C05155i c05155i, long j2) {
        this(j, c05155i, r4, Collections.emptyMap(), j2, 0L, 0L);
        Uri uri;
        if (c05155i != null) {
            uri = c05155i.A06;
        } else {
            uri = null;
        }
    }

    public Cq(long j, C05155i c05155i, Uri uri, Map<String, List<String>> responseHeaders, long j2, long j3, long j4) {
        this.A03 = j;
        this.A05 = c05155i;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
