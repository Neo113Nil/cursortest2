package com.google.ads.conversiontracking;

import com.google.ads.conversiontracking.g;

/* loaded from: classes5.dex */
public class d {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public long h;

    public d(String str, g.c cVar, boolean z, boolean z2) {
        this.g = str;
        this.b = z2;
        this.a = z;
        this.h = 0L;
        this.d = g.a();
        this.c = 0;
        if (!z2 && z) {
            this.f = g.b(cVar);
            this.e = g.a(cVar);
        } else {
            this.f = null;
            this.e = null;
        }
    }

    public d(long j, String str, String str2, boolean z, boolean z2, String str3, long j2, int i) {
        this.h = j;
        this.g = str;
        this.f = str2;
        this.b = z;
        this.a = z2;
        this.e = str3;
        this.d = j2;
        this.c = i;
    }
}
