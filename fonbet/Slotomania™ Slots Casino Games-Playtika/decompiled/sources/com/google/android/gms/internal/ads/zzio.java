package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzio extends IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzio(int i, int i2) {
        super(r1.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21 + String.valueOf(i2).length() + 1);
        sb.append("Buffer too small (");
        sb.append(i);
        sb.append(" < ");
        sb.append(i2);
        sb.append(")");
    }
}
