package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0016\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJO\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0014\u0010\nJ)\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\nJ)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0016\u0010\nJ\u001d\u0010\u0017\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "", "Lcom/appsflyer/internal/AFg1gSDK;", "p0", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1gSDK;Ljava/lang/String;)V", "i", "v", "w", "AFInAppEventParameterName", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1gSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "AFKeystoreWrapper", "Z", "getShouldExtendMsg", "()Z", "shouldExtendMsg", "<init>", "()V", "AFa1uSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFg1hSDK {

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    private final boolean shouldExtendMsg;
    public static long AFInAppEventType = System.currentTimeMillis();

    public static /* synthetic */ void d$default(AFg1hSDK aFg1hSDK, AFg1gSDK aFg1gSDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1hSDK.d(aFg1gSDK, str, z11);
    }

    public static /* synthetic */ void e$default(AFg1hSDK aFg1hSDK, AFg1gSDK aFg1gSDK, String str, Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        if ((i11 & 16) != 0) {
            z12 = true;
        }
        if ((i11 & 32) != 0) {
            z13 = true;
        }
        if ((i11 & 64) != 0) {
            z14 = true;
        }
        aFg1hSDK.e(aFg1gSDK, str, th2, z11, z12, z13, z14);
    }

    public static /* synthetic */ void i$default(AFg1hSDK aFg1hSDK, AFg1gSDK aFg1gSDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1hSDK.i(aFg1gSDK, str, z11);
    }

    public static /* synthetic */ void v$default(AFg1hSDK aFg1hSDK, AFg1gSDK aFg1gSDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1hSDK.v(aFg1gSDK, str, z11);
    }

    public static /* synthetic */ void w$default(AFg1hSDK aFg1hSDK, AFg1gSDK aFg1gSDK, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        aFg1hSDK.w(aFg1gSDK, str, z11);
    }

    @NotNull
    protected final String AFInAppEventParameterName(String str, @NotNull AFg1gSDK aFg1gSDK) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        if (str == null || kotlin.text.h.K(str)) {
            str = "null";
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1gSDK);
        if (!getShouldExtendMsg()) {
            return withTag$SDK_prodRelease;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(System.currentTimeMillis() - AFInAppEventType);
        sb2.append(") [");
        sb2.append(Thread.currentThread().getName());
        sb2.append("] ");
        sb2.append(withTag$SDK_prodRelease);
        return sb2.toString();
    }

    public final void d(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1gSDK, str, false, 4, null);
    }

    public final void e(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, @NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1gSDK, str, th2, false, false, false, false, 120, null);
    }

    public void force(@NotNull AFg1gSDK p02, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final void i(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1gSDK, str, false, 4, null);
    }

    public final void v(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1gSDK, str, false, 4, null);
    }

    public final void w(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1gSDK, str, false, 4, null);
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1gSDK aFg1gSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(aFg1gSDK.values);
        sb2.append("] ");
        sb2.append(str);
        return sb2.toString();
    }

    public void d(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
    }

    public final void e(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, @NotNull Throwable th2, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1gSDK, str, th2, z11, false, false, false, 112, null);
    }

    public void i(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
    }

    public void v(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
    }

    public void w(@NotNull AFg1gSDK p02, @NotNull String p12, boolean p22) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
    }

    public final void e(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1gSDK, str, th2, z11, z12, false, false, 96, null);
    }

    public final void e(@NotNull AFg1gSDK aFg1gSDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1gSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1gSDK, str, th2, z11, z12, z13, false, 64, null);
    }

    public void e(@NotNull AFg1gSDK p02, @NotNull String p12, @NotNull Throwable p22, boolean p32, boolean p42, boolean p52, boolean p62) {
        Intrinsics.checkNotNullParameter(p02, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p22, "");
    }
}
