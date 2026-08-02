package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.mz1;
import defpackage.w1l;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjn extends zzau {
    public final int c;
    public final String d;
    public final int e;
    public final zzv f;
    public final int g;
    public final zzxo h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzjn(int i, Exception exc, int i2, String str, int i3, zzv zzvVar, int i4, zzxo zzxoVar, boolean z) {
        this(TextUtils.isEmpty(null) ? r1 : r1.concat(": null"), exc, i2, i, r6, r7, zzvVar, i4, zzxoVar, SystemClock.elapsedRealtime(), z);
        String str2;
        int i5;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
            str2 = str;
            i5 = i3;
        } else {
            String valueOf = String.valueOf(zzvVar);
            String str5 = zzfm.a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    defpackage.zzl.s();
                    throw null;
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(str4.length() + valueOf.length() + mz1.d(String.valueOf(str).length() + 14, 9, String.valueOf(i3)) + 19);
            str2 = str;
            i5 = i3;
            w1l.q(i5, str2, " error, index=", ", format=", sb);
            str3 = wt3.m(valueOf, ", format_supported=", sb, str4);
        }
    }

    public final zzjn a(zzxo zzxoVar) {
        String message = getMessage();
        String str = zzfm.a;
        return new zzjn(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, zzxoVar, this.b, this.i);
    }

    public zzjn(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjn(String str, Throwable th, int i, int i2, String str2, int i3, zzv zzvVar, int i4, zzxo zzxoVar, long j, boolean z) {
        super(i, j, str, th);
        int i5;
        boolean z2;
        Bundle bundle = Bundle.EMPTY;
        if (!z) {
            i5 = i2;
            z2 = true;
        } else if (i2 == 1) {
            i5 = 1;
            z2 = true;
        } else {
            i5 = i2;
            z2 = false;
        }
        zzguk.a(z2);
        zzguk.a(th != null);
        this.c = i5;
        this.d = str2;
        this.e = i3;
        this.f = zzvVar;
        this.g = i4;
        this.h = zzxoVar;
        this.i = z;
    }
}
