package com.appsflyer.sdk_base.logger;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.mbridge.msdk.setting.i;
import defpackage.a70;
import defpackage.fc6;
import defpackage.mz1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000b\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017JH\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017J\"\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017J\"\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017J\"\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001d\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001e\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "", "<init>", "()V", "shouldExtendMsg", "", "getShouldExtendMsg", "()Z", "ts", "", "getTs", "()J", "d", "", "tag", "Lcom/appsflyer/sdk_base/logger/LogTag;", NotificationCompat.CATEGORY_MESSAGE, "", "shouldRemoteDebug", "e", "throwable", "", "printMsg", "printThrowable", "shouldReportToExManager", i.a, "w", "v", "force", "withTag", "extendedMsg", "Companion", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFLoggerBase {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long START_TIME = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public static /* synthetic */ void d$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: d");
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFLoggerBase.d(logTag, str, z);
    }

    public static /* synthetic */ void e$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: e");
            return;
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
        aFLoggerBase.e(logTag, str, th, z, z2, z3, z4);
    }

    public static /* synthetic */ void i$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: i");
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFLoggerBase.i(logTag, str, z);
    }

    public static /* synthetic */ void v$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: v");
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFLoggerBase.v(logTag, str, z);
    }

    public static /* synthetic */ void w$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: w");
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFLoggerBase.w(logTag, str, z);
    }

    public final void d(@NotNull LogTag logTag, @NotNull String str) {
        logTag.getClass();
        str.getClass();
        d$default(this, logTag, str, false, 4, null);
    }

    public final void e(@NotNull LogTag logTag, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3) {
        logTag.getClass();
        str.getClass();
        th.getClass();
        e$default(this, logTag, str, th, z, z2, z3, false, 64, null);
    }

    @NotNull
    public final String extendedMsg(@Nullable String str, @NotNull LogTag logTag) {
        logTag.getClass();
        if (str == null || StringsKt.R(str)) {
            str = "null";
        }
        String withTag = withTag(str, logTag);
        if (!getShouldExtendMsg()) {
            return withTag;
        }
        long ts = getTs() - START_TIME;
        String name = Thread.currentThread().getName();
        StringBuilder sb = new StringBuilder("(");
        sb.append(ts);
        sb.append(") [");
        sb.append(name);
        return mz1.o(sb, "] ", withTag);
    }

    public void force(@NotNull LogTag tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final long getTs() {
        return System.currentTimeMillis();
    }

    public final void i(@NotNull LogTag logTag, @NotNull String str) {
        logTag.getClass();
        str.getClass();
        i$default(this, logTag, str, false, 4, null);
    }

    public final void v(@NotNull LogTag logTag, @NotNull String str) {
        logTag.getClass();
        str.getClass();
        v$default(this, logTag, str, false, 4, null);
    }

    public final void w(@NotNull LogTag logTag, @NotNull String str) {
        logTag.getClass();
        str.getClass();
        w$default(this, logTag, str, false, 4, null);
    }

    @NotNull
    public final String withTag(@NotNull String str, @NotNull LogTag logTag) {
        str.getClass();
        logTag.getClass();
        return fc6.n(U3.j.d, logTag.getTagName(), "] ", str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appsflyer/sdk_base/logger/AFLoggerBase$Companion;", "", "<init>", "()V", "START_TIME", "", "getSTART_TIME", "()J", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getSTART_TIME() {
            return AFLoggerBase.START_TIME;
        }

        private Companion() {
        }
    }

    public void d(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    public void i(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    public void v(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    public void w(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    public final void e(@NotNull LogTag logTag, @NotNull String str, @NotNull Throwable th, boolean z) {
        logTag.getClass();
        str.getClass();
        th.getClass();
        e$default(this, logTag, str, th, z, false, false, false, 112, null);
    }

    public final void e(@NotNull LogTag logTag, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2) {
        logTag.getClass();
        str.getClass();
        th.getClass();
        e$default(this, logTag, str, th, z, z2, false, false, 96, null);
    }

    public final void e(@NotNull LogTag logTag, @NotNull String str, @NotNull Throwable th) {
        logTag.getClass();
        str.getClass();
        th.getClass();
        e$default(this, logTag, str, th, false, false, false, false, 120, null);
    }

    public void e(@NotNull LogTag tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        throwable.getClass();
    }
}
