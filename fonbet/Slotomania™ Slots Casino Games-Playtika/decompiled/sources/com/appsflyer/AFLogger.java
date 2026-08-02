package com.appsflyer;

import com.appsflyer.internal.AFg1gSDK;
import com.appsflyer.internal.AFh1zSDK;
import com.braze.Constants;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0015J+\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0016J3\u0010\u0012\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0017J#\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0015J+\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b!\u0010\u000bJ'\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&JG\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010&J!\u00100\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00062\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010.\"\u00020\u0001¢\u0006\u0004\b2\u00101J'\u00103\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010&J'\u00104\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010&R\u0019\u00108\u001a\u0006*\u000205058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u0001098BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b8\u00107"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFg1gSDK;", "<init>", "()V", "", "debugLogMessage", "", "afDebugLog", "(Ljava/lang/String;)V", "", "shouldRemoteDebug", "(Ljava/lang/String;Z)V", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "afErrorLogForExcManagerOnly", "disableReporting", "logMessage", "afInfoLog", "afLogForce", "rdLogMessage", "afRDLog", "afVerboseLog", "warningLogMessage", "afWarnLog", "Lcom/appsflyer/internal/AFh1zSDK;", "tag", "msg", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFh1zSDK;Ljava/lang/String;)V", "i", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFg1gSDK;)V", "unregisterClient", "v", "w", "Ljava/util/concurrent/ExecutorService;", "getCurrencyIso4217Code", "Lkotlin/Lazy;", "getRevenue", "", "LogLevel"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFLogger extends AFg1gSDK {
    public static final AFLogger INSTANCE = new AFLogger();

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private static final Lazy getCurrencyIso4217Code = LazyKt.lazy(new Function0<Set<AFg1gSDK>>() { // from class: com.appsflyer.AFLogger.10
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1gSDK> invoke() {
            return Collections.synchronizedSet(new LinkedHashSet());
        }
    });

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    private static final Lazy getRevenue = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.AFLogger.1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    private AFLogger() {
    }

    public final void registerClient(final AFg1gSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getRevenue.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMonetizationNetwork(client);
            }
        });
    }

    public final void unregisterClient(final AFg1gSDK... client) {
        Intrinsics.checkNotNullParameter(client, "");
        ((ExecutorService) getRevenue.getValue()).execute(new Runnable() { // from class: com.appsflyer.AFLogger$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getCurrencyIso4217Code(client);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(final AFh1zSDK tag, final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getRevenue.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.5
            public final void getRevenue(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.d(AFh1zSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getRevenue(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(final AFh1zSDK tag, final String msg, final Throwable throwable, final boolean printMsg, final boolean printThrowable, final boolean shouldReportToExManager, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        ((ExecutorService) getRevenue.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.4
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getRevenue(aFg1gSDK);
                return Unit.INSTANCE;
            }

            public final void getRevenue(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.e(AFh1zSDK.this, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(final AFh1zSDK tag, final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getRevenue.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.2
            public final void getCurrencyIso4217Code(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.i(AFh1zSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getCurrencyIso4217Code(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(final AFh1zSDK tag, final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getRevenue.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.8
            public final void getMonetizationNetwork(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.w(AFh1zSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getMonetizationNetwork(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(final AFh1zSDK tag, final String msg, final boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getRevenue.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.6
            public final void getCurrencyIso4217Code(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.v(AFh1zSDK.this, msg, shouldRemoteDebug);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                getCurrencyIso4217Code(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(final AFh1zSDK tag, final String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        ((ExecutorService) getRevenue.getValue()).execute(new AFLogger$$ExternalSyntheticLambda0(new Function1<AFg1gSDK, Unit>() { // from class: com.appsflyer.AFLogger.3
            public final void AFAdRevenueData(AFg1gSDK aFg1gSDK) {
                Intrinsics.checkNotNullParameter(aFg1gSDK, "");
                aFg1gSDK.force(AFh1zSDK.this, msg);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(AFg1gSDK aFg1gSDK) {
                AFAdRevenueData(aFg1gSDK);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(String logMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFh1zSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(String debugLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFh1zSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String message, Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(ex, "");
        AFg1gSDK.e$default(INSTANCE, AFh1zSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(String warningLogMessage, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        INSTANCE.w(AFh1zSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afVerboseLog(String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFh1zSDK.OTHER, rdLogMessage, false);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.v()", imports = {}))
    @JvmStatic
    public static final void afRDLog(String rdLogMessage) {
        Intrinsics.checkNotNullParameter(rdLogMessage, "");
        INSTANCE.v(AFh1zSDK.OTHER, rdLogMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.force()", imports = {}))
    @JvmStatic
    public static final void afLogForce(String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.force(AFh1zSDK.OTHER, logMessage);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.d()", imports = {}))
    @JvmStatic
    public static final void afDebugLog(String debugLogMessage) {
        Intrinsics.checkNotNullParameter(debugLogMessage, "");
        INSTANCE.d(AFh1zSDK.OTHER, debugLogMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.i()", imports = {}))
    @JvmStatic
    public static final void afInfoLog(String logMessage) {
        Intrinsics.checkNotNullParameter(logMessage, "");
        INSTANCE.i(AFh1zSDK.OTHER, logMessage, true);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str2, ex, false, false, false, false, 120, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str2, ex, false, false, true, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str2, ex, false, false, !disableReporting, false, 64, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str2, ex, false, printThrowable, false, false, 104, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.e()", imports = {}))
    @JvmStatic
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFh1zSDK aFh1zSDK = AFh1zSDK.OTHER;
        String str = errorLogMessage;
        if (str == null || StringsKt.isBlank(str)) {
            errorLogMessage = AbstractJsonLexerKt.NULL;
        }
        String str2 = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFg1gSDK.e$default(aFLogger, aFh1zSDK, str2, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated since v6.13.0", replaceWith = @ReplaceWith(expression = "AFLogger.w()", imports = {}))
    @JvmStatic
    public static final void afWarnLog(String warningLogMessage) {
        Intrinsics.checkNotNullParameter(warningLogMessage, "");
        AFg1gSDK.w$default(INSTANCE, AFh1zSDK.OTHER, warningLogMessage, false, 4, null);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        Lazy lazy = getCurrencyIso4217Code;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            CollectionsKt.addAll((Set) value2, aFg1gSDKArr);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFg1gSDK[] aFg1gSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1gSDKArr, "");
        Lazy lazy = getCurrencyIso4217Code;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            ((Set) value2).removeAll(ArraysKt.toSet(aFg1gSDKArr));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Lazy lazy = getCurrencyIso4217Code;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        synchronized (((Set) value)) {
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            Iterator it = ((Set) value2).iterator();
            while (it.hasNext()) {
                function1.invoke((AFg1gSDK) it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
