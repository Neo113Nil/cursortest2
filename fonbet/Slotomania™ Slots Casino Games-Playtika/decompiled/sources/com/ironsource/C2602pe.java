package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2602pe {
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
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2602pe(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.a = i;
        this.b = errorMessage;
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
        if (!(obj instanceof C2602pe)) {
            return false;
        }
        C2602pe c2602pe = (C2602pe) obj;
        return this.a == c2602pe.a && Intrinsics.areEqual(this.b, c2602pe.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SdkError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2602pe(IronSourceError error) {
        this(r0, r3);
        Intrinsics.checkNotNullParameter(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        Intrinsics.checkNotNullExpressionValue(errorMessage, "error.errorMessage");
    }

    public final C2602pe a(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new C2602pe(i, errorMessage);
    }

    public static /* synthetic */ C2602pe a(C2602pe c2602pe, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c2602pe.a;
        }
        if ((i2 & 2) != 0) {
            str = c2602pe.b;
        }
        return c2602pe.a(i, str);
    }
}
