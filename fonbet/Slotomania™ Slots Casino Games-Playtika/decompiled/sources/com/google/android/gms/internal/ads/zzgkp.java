package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgkp extends RuntimeException {
    public zzgkp() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgkp(int i) {
        super(r1.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 3);
        sb.append("r: ");
        sb.append(i);
    }

    public zzgkp(int i, Throwable th) {
        super("r: 2", th);
    }
}
