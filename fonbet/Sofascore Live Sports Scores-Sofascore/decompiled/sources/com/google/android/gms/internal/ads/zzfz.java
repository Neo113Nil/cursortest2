package com.google.android.gms.internal.ads;

import defpackage.bf3;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfz extends zzgb {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public zzfz(int i, long j) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final zzga b(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzga zzgaVar = (zzga) arrayList.get(i2);
            if (zzgaVar.a == i) {
                return zzgaVar;
            }
        }
        return null;
    }

    public final zzfz c(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfz zzfzVar = (zzfz) arrayList.get(i2);
            if (zzfzVar.a == i) {
                return zzfzVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final String toString() {
        String a = zzgb.a(this.a);
        String arrays = Arrays.toString(this.c.toArray());
        String arrays2 = Arrays.toString(this.d.toArray());
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        bf3.v(sb, a, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
