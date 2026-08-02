package com.appsflyer;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.mbridge.msdk.setting.i;
import defpackage.joa;
import defpackage.jp5;
import defpackage.kp5;
import defpackage.o13;
import defpackage.ph0;
import defpackage.wx4;
import defpackage.ypa;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ#\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J!\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\u001fJ'\u0010&\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u001fJ'\u0010'\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u001fJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)R\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010*8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010,R\u0015\u0010\u0017\u001a\u00020-8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010,"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "<init>", "()V", "", "logMessage", "", "afInfoLog", "(Ljava/lang/String;)V", "debugLogMessage", "afDebugLog", "warningLogMessage", "afWarnLog", "errorLogMessage", "", "ex", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "printThrowable", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "", "client", "registerClient", "([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V", "unregisterClient", "Lcom/appsflyer/sdk_base/logger/LogTag;", "tag", NotificationCompat.CATEGORY_MESSAGE, "shouldRemoteDebug", "d", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V", "throwable", "printMsg", "shouldReportToExManager", "e", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", i.a, "w", "v", "force", "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V", "", "AFKeystoreWrapper", "Ljoa;", "Ljava/util/concurrent/ExecutorService;", "LogLevel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFLogger extends AFLoggerBase {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    @NotNull
    private static final joa AFKeystoreWrapper = ypa.b(new c(0));

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @NotNull
    private static final joa registerClient = ypa.b(new c(1));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LogLevel {
        private static final /* synthetic */ LogLevel[] AFKeystoreWrapper;
        public static final LogLevel DEBUG;
        public static final LogLevel ERROR;
        public static final LogLevel INFO;
        public static final LogLevel NONE;
        public static final LogLevel VERBOSE;
        public static final LogLevel WARNING;
        private static final /* synthetic */ jp5 d;
        private final int level;

        static {
            LogLevel logLevel = new LogLevel("NONE", 0, 0);
            NONE = logLevel;
            LogLevel logLevel2 = new LogLevel("ERROR", 1, 1);
            ERROR = logLevel2;
            LogLevel logLevel3 = new LogLevel("WARNING", 2, 2);
            WARNING = logLevel3;
            LogLevel logLevel4 = new LogLevel("INFO", 3, 3);
            INFO = logLevel4;
            LogLevel logLevel5 = new LogLevel("DEBUG", 4, 4);
            DEBUG = logLevel5;
            LogLevel logLevel6 = new LogLevel("VERBOSE", 5, 5);
            VERBOSE = logLevel6;
            LogLevel[] logLevelArr = {logLevel, logLevel2, logLevel3, logLevel4, logLevel5, logLevel6};
            AFKeystoreWrapper = logLevelArr;
            d = new kp5(logLevelArr);
        }

        private LogLevel(String str, int i, int i2) {
            this.level = i2;
        }

        @NotNull
        public static jp5 getEntries() {
            return d;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public static LogLevel[] values() {
            return (LogLevel[]) AFKeystoreWrapper.clone();
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(Function1 function1) {
        Iterator it = ((Set) AFKeystoreWrapper.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFLoggerBase) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFLogger(LogTag logTag, String str, boolean z, AFLoggerBase aFLoggerBase) {
        aFLoggerBase.getClass();
        aFLoggerBase.w(logTag, str, z);
        return Unit.a;
    }

    @wx4
    public static final void afDebugLog(@NotNull String debugLogMessage) {
        debugLogMessage.getClass();
        INSTANCE.d(LogTag.OTHER, debugLogMessage, true);
    }

    @wx4
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        LogTag logTag = LogTag.OTHER;
        if (errorLogMessage == null || StringsKt.R(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFLoggerBase.e$default(aFLogger, logTag, str, ex, false, false, false, false, 120, null);
    }

    @wx4
    public static final void afInfoLog(@NotNull String logMessage) {
        logMessage.getClass();
        INSTANCE.i(LogTag.OTHER, logMessage, true);
    }

    @wx4
    public static final void afWarnLog(@NotNull String warningLogMessage) {
        warningLogMessage.getClass();
        AFLoggerBase.w$default(INSTANCE, LogTag.OTHER, warningLogMessage, false, 4, null);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void d(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) registerClient.getValue()).execute(new b(new a(tag, msg, shouldRemoteDebug, 3), 5));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void e(@NotNull final LogTag tag, @NotNull final String msg, @NotNull final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        throwable.getClass();
        ((ExecutorService) registerClient.getValue()).execute(new b(new Function1() { // from class: com.appsflyer.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d;
                d = AFLogger.d(LogTag.this, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug, (AFLoggerBase) obj);
                return d;
            }
        }, 3));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void force(@NotNull LogTag tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) registerClient.getValue()).execute(new b(new f(0, tag, msg), 4));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void i(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) registerClient.getValue()).execute(new b(new a(tag, msg, shouldRemoteDebug, 0), 2));
    }

    public final void registerClient(@NotNull AFLoggerBase... client) {
        client.getClass();
        ((ExecutorService) registerClient.getValue()).execute(new e(client, 0));
    }

    public final void unregisterClient(@NotNull AFLoggerBase... client) {
        client.getClass();
        ((ExecutorService) registerClient.getValue()).execute(new e(client, 1));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void v(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) registerClient.getValue()).execute(new b(new a(tag, msg, shouldRemoteDebug, 1), 0));
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public final void w(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) registerClient.getValue()).execute(new b(new a(tag, msg, shouldRemoteDebug, 2), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService AFLogger() {
        return AFc1qSDK.registerClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(LogTag logTag, String str, boolean z, AFLoggerBase aFLoggerBase) {
        aFLoggerBase.getClass();
        aFLoggerBase.d(logTag, str, z);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set unregisterClient() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unregisterClient(LogTag logTag, String str, AFLoggerBase aFLoggerBase) {
        aFLoggerBase.getClass();
        aFLoggerBase.force(logTag, str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LogTag logTag, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, AFLoggerBase aFLoggerBase) {
        aFLoggerBase.getClass();
        aFLoggerBase.e(logTag, str, th, z, z2, z3, z4);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFLoggerBase[] aFLoggerBaseArr) {
        ((Set) AFKeystoreWrapper.getValue()).removeAll(ph0.a0(aFLoggerBaseArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LogTag logTag, String str, boolean z, AFLoggerBase aFLoggerBase) {
        aFLoggerBase.getClass();
        aFLoggerBase.i(logTag, str, z);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFKeystoreWrapper(LogTag logTag, String str, boolean z, AFLoggerBase aFLoggerBase) {
        aFLoggerBase.getClass();
        aFLoggerBase.v(logTag, str, z);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AFLoggerBase[] aFLoggerBaseArr) {
        o13.w((Set) AFKeystoreWrapper.getValue(), aFLoggerBaseArr);
    }

    @wx4
    public static final void afErrorLog(@Nullable String errorLogMessage, @Nullable Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        LogTag logTag = LogTag.OTHER;
        if (errorLogMessage == null || StringsKt.R(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFLoggerBase.e$default(aFLogger, logTag, str, ex, false, printThrowable, false, false, 104, null);
    }
}
