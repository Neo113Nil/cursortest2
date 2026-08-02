package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ne, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4221ne {

    @NotNull
    public static final a c = new a(null);
    public static final int d = 2070;
    public static final int e = 2080;
    public static final int f = 2090;
    public static final int g = 2100;
    public static final int h = 2110;
    private final int a;

    @NotNull
    private final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4221ne(@NotNull IronSourceError ironSourceError) {
        this(r0, r2);
        ironSourceError.getClass();
        int errorCode = ironSourceError.getErrorCode();
        String errorMessage = ironSourceError.getErrorMessage();
        errorMessage.getClass();
    }

    public static /* synthetic */ C4221ne a(C4221ne c4221ne, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c4221ne.a;
        }
        if ((i2 & 2) != 0) {
            str = c4221ne.b;
        }
        return c4221ne.a(i, str);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4221ne)) {
            return false;
        }
        C4221ne c4221ne = (C4221ne) obj;
        return this.a == c4221ne.a && Intrinsics.c(this.b, c4221ne.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public String toString() {
        return com.appsflyer.internal.i.g(this.a, "SdkError(errorCode=", ", errorMessage=", this.b, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ne$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @NotNull
    public final C4221ne a(int i, @NotNull String str) {
        str.getClass();
        return new C4221ne(i, str);
    }

    public C4221ne(int i, @NotNull String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }
}
