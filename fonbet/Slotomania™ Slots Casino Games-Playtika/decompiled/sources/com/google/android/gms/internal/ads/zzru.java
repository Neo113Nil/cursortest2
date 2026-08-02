package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzru extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzru(long j, long j2) {
        super(r2.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 63 + String.valueOf(j).length());
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j2);
        sb.append(", got ");
        sb.append(j);
    }
}
