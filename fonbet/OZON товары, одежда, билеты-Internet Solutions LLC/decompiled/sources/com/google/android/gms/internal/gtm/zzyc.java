package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
final class zzyc extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzyc(int i11, int i12) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i11);
        sb2.append(" of ");
        sb2.append(i12);
    }
}
