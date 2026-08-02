package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.epx;
import xsna.gq;
import xsna.zcl;

/* renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4498pe {
    public static final a c = new a(null);
    public static final int d = 2070;
    public static final int e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;
    public static final int h = 2110;
    private final int a;
    private final String b;

    /* renamed from: com.ironsource.pe$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public C4498pe(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4498pe)) {
            return false;
        }
        C4498pe c4498pe = (C4498pe) obj;
        return this.a == c4498pe.a && epx.f(this.b, c4498pe.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        return gq.b(this.a, "SdkError(errorCode=", ", errorMessage=", this.b, ")");
    }

    public C4498pe(IronSourceError ironSourceError) {
        this(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
    }

    public final C4498pe a(int i, String str) {
        return new C4498pe(i, str);
    }

    public static /* synthetic */ C4498pe a(C4498pe c4498pe, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c4498pe.a;
        }
        if ((i2 & 2) != 0) {
            str = c4498pe.b;
        }
        return c4498pe.a(i, str);
    }
}
