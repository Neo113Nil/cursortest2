package com.appsflyer.internal;

import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFh1wSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1xSDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFh1xSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", JWKParameterNames.RSA_EXPONENT, "(Lcom/appsflyer/internal/AFh1xSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1xSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "AFAdRevenueData", "(Ljava/lang/String;Lcom/appsflyer/internal/AFh1xSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AFh1wSDK {
    public static long getMediationNetwork = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public void d(AFh1xSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void e(AFh1xSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }

    public void force(AFh1xSDK tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void i(AFh1xSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void v(AFh1xSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void w(AFh1xSDK tag, String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public static /* synthetic */ void d$default(AFh1wSDK aFh1wSDK, AFh1xSDK aFh1xSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1wSDK.d(aFh1xSDK, str, z);
    }

    public static /* synthetic */ void e$default(AFh1wSDK aFh1wSDK, AFh1xSDK aFh1xSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = true;
        }
        if ((i & 64) != 0) {
            z4 = true;
        }
        aFh1wSDK.e(aFh1xSDK, str, th, z, z2, z3, z4);
    }

    public static /* synthetic */ void i$default(AFh1wSDK aFh1wSDK, AFh1xSDK aFh1xSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1wSDK.i(aFh1xSDK, str, z);
    }

    public static /* synthetic */ void w$default(AFh1wSDK aFh1wSDK, AFh1xSDK aFh1xSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1wSDK.w(aFh1xSDK, str, z);
    }

    public static /* synthetic */ void v$default(AFh1wSDK aFh1wSDK, AFh1xSDK aFh1xSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1wSDK.v(aFh1xSDK, str, z);
    }

    protected final String AFAdRevenueData(String str, AFh1xSDK aFh1xSDK) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            str = AbstractJsonLexerKt.NULL;
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFh1xSDK);
        if (!getShouldExtendMsg()) {
            return withTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - getMediationNetwork) + ") [" + Thread.currentThread().getName() + "] " + withTag$SDK_prodRelease;
    }

    public final String withTag$SDK_prodRelease(String str, AFh1xSDK aFh1xSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        return "[" + aFh1xSDK.AFAdRevenueData + "] " + str;
    }

    public final void v(AFh1xSDK aFh1xSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFh1xSDK, str, false, 4, null);
    }

    public final void w(AFh1xSDK aFh1xSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFh1xSDK, str, false, 4, null);
    }

    public final void i(AFh1xSDK aFh1xSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFh1xSDK, str, false, 4, null);
    }

    public final void e(AFh1xSDK aFh1xSDK, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1xSDK, str, th, false, false, false, false, 120, null);
    }

    public final void e(AFh1xSDK aFh1xSDK, String str, Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1xSDK, str, th, z, false, false, false, 112, null);
    }

    public final void e(AFh1xSDK aFh1xSDK, String str, Throwable th, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1xSDK, str, th, z, z2, false, false, 96, null);
    }

    public final void e(AFh1xSDK aFh1xSDK, String str, Throwable th, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFh1xSDK, str, th, z, z2, z3, false, 64, null);
    }

    public final void d(AFh1xSDK aFh1xSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFh1xSDK, str, false, 4, null);
    }
}
