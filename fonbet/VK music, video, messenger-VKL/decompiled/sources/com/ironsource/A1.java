package com.ironsource;

import xsna.epx;
import xsna.zcl;
import xsna.zr;

/* loaded from: classes13.dex */
public final class A1 {
    private final String a;

    /* JADX WARN: Multi-variable type inference failed */
    public A1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A1) && epx.f(this.a, ((A1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return zr.a("ApplicationAuctionSettings(auctionData=", this.a, ")");
    }

    public A1(String str) {
        this.a = str;
    }

    public final A1 a(String str) {
        return new A1(str);
    }

    public /* synthetic */ A1(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ A1 a(A1 a1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = a1.a;
        }
        return a1.a(str);
    }
}
