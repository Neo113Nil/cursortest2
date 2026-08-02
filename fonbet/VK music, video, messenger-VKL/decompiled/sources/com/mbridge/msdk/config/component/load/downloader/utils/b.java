package com.mbridge.msdk.config.component.load.downloader.utils;

/* compiled from: Utils.java */
/* loaded from: classes13.dex */
public final class b {
    public static int a(long j, long j2) {
        if (j == 0 || j2 == 0) {
            return 0;
        }
        if (j == j2) {
            return 100;
        }
        return (int) (((j2 * 1.0d) / (j * 1.0d)) * 100.0d);
    }
}
