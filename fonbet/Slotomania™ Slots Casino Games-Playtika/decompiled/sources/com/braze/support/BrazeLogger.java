package com.braze.support;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import bo.app.y5;
import com.braze.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u00019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00172\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060'J\u0012\u0010(\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\rH\u0007J$\u0010*\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001cH\u0007J \u0010,\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001cH\u0007J\b\u0010-\u001a\u00020\u001eH\u0007J\u0014\u0010.\u001a\u00020\u00062\n\u0010/\u001a\u0006\u0012\u0002\b\u000300H\u0007J$\u00101\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u00102\u001a\u00020\u001eH\u0007J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u0004H\u0007J$\u00105\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001cH\u0007J$\u00106\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001cH\u0007J\n\u00107\u001a\u00020\u0006*\u00020\u0001J.\u0010$\u001a\u00020\u001e*\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00172\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060'J\n\u0010.\u001a\u00020\u0006*\u00020\u0006J\u0014\u00108\u001a\u00020\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0014\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014Rm\u0010\u0015\u001aK\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006:"}, d2 = {"Lcom/braze/support/BrazeLogger;", "", "()V", "DESIRED_MAX_BRAZE_TAG_LENGTH", "", "LOG_LEVEL_PROPERTY_NAME", "", "MAX_REMAINING_LENGTH_FOR_CLASS_TAG", "SUPPRESS", "getSUPPRESS$annotations", "VERBOSE", "getVERBOSE$annotations", "hasLogLevelBeenSetForAppRun", "", "isSystemPropLogLevelSet", "logLevel", "getLogLevel$annotations", "getLogLevel", "()I", "setLogLevel", "(I)V", "onLoggedCallback", "Lkotlin/Function3;", "Lcom/braze/support/BrazeLogger$Priority;", "Lkotlin/ParameterName;", "name", "priority", "message", "", "throwable", "", "getOnLoggedCallback$annotations", "getOnLoggedCallback", "()Lkotlin/jvm/functions/Function3;", "setOnLoggedCallback", "(Lkotlin/jvm/functions/Function3;)V", "brazelog", "tag", "tr", "Lkotlin/Function0;", "checkForSystemLogLevelProperty", "returnOnDebug", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "msg", "e", "enableVerboseLogging", "getBrazeLogTag", "classForTag", "Ljava/lang/Class;", "i", "resetForTesting", "setInitialLogLevelFromConfiguration", "initialLogLevel", "v", "w", "brazeLogTag", "toStringSafe", "Priority", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeLogger {
    private static final int DESIRED_MAX_BRAZE_TAG_LENGTH = 80;
    private static final String LOG_LEVEL_PROPERTY_NAME = "log.tag.APPBOY";
    private static final int MAX_REMAINING_LENGTH_FOR_CLASS_TAG = 65;
    public static final int SUPPRESS = Integer.MAX_VALUE;
    public static final int VERBOSE = 2;
    private static boolean hasLogLevelBeenSetForAppRun;
    private static boolean isSystemPropLogLevelSet;
    private static Function3<? super Priority, ? super String, ? super Throwable, Unit> onLoggedCallback;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/braze/support/BrazeLogger$Priority;", "", "logLevel", "", "(Ljava/lang/String;II)V", "getLogLevel", "()I", "D", "I", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Priority {
        D(3),
        I(4),
        E(6),
        V(2),
        W(5);

        private final int logLevel;

        Priority(int i) {
            this.logLevel = i;
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Priority.values().length];
            iArr[Priority.D.ordinal()] = 1;
            iArr[Priority.I.ordinal()] = 2;
            iArr[Priority.E.ordinal()] = 3;
            iArr[Priority.W.ordinal()] = 4;
            iArr[Priority.V.ordinal()] = 5;
            a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ Function0<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<String> function0) {
            super(0);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return BrazeLogger.INSTANCE.toStringSafe(this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "BrazeLogger log level set to " + this.b + " via device system property. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: ", Integer.valueOf(this.b));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.b;
        }
    }

    private BrazeLogger() {
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th, Function0 function0, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            priority = Priority.D;
        }
        if ((i2 & 2) != 0) {
            th = null;
        }
        brazeLogger.brazelog(obj, priority, th, (Function0<String>) function0);
    }

    @JvmStatic
    public static final synchronized void checkForSystemLogLevelProperty(boolean returnOnDebug) {
        synchronized (BrazeLogger.class) {
            BrazeLogger brazeLogger = INSTANCE;
            String a2 = y5.a(LOG_LEVEL_PROPERTY_NAME);
            if (StringsKt.equals("verbose", StringsKt.trim((CharSequence) a2).toString(), true)) {
                setLogLevel(2);
                isSystemPropLogLevelSet = true;
                brazelog$default(brazeLogger, brazeLogger, Priority.I, (Throwable) null, new c(a2), 2, (Object) null);
            }
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        checkForSystemLogLevelProperty(z);
    }

    @JvmStatic
    public static final void d(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        d$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void d(String tag, String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.brazelog(tag, Priority.D, tr, (Function0<String>) new d(msg));
    }

    public static /* synthetic */ void d$default(String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        d(str, str2, th);
    }

    @JvmStatic
    public static final void e(String tag, String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        INSTANCE.brazelog(tag, Priority.D, tr, (Function0<String>) new e(msg));
    }

    @JvmStatic
    public static final synchronized void enableVerboseLogging() {
        synchronized (BrazeLogger.class) {
            setLogLevel(2);
        }
    }

    @JvmStatic
    public static final String getBrazeLogTag(Class<?> classForTag) {
        Intrinsics.checkNotNullParameter(classForTag, "classForTag");
        String fullClassName = classForTag.getName();
        int length = fullClassName.length();
        if (length <= 65) {
            Intrinsics.checkNotNullExpressionValue(fullClassName, "{\n            // No need…  fullClassName\n        }");
        } else {
            Intrinsics.checkNotNullExpressionValue(fullClassName, "fullClassName");
            fullClassName = fullClassName.substring(length - 65);
            Intrinsics.checkNotNullExpressionValue(fullClassName, "this as java.lang.String).substring(startIndex)");
        }
        return Intrinsics.stringPlus(Constants.LOG_TAG_PREFIX, fullClassName);
    }

    public static final int getLogLevel() {
        return logLevel;
    }

    @JvmStatic
    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final Function3<Priority, String, Throwable, Unit> getOnLoggedCallback() {
        return onLoggedCallback;
    }

    @JvmStatic
    public static /* synthetic */ void getOnLoggedCallback$annotations() {
    }

    public static /* synthetic */ void getSUPPRESS$annotations() {
    }

    public static /* synthetic */ void getVERBOSE$annotations() {
    }

    @JvmStatic
    public static final void i(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        i$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void i(String tag, String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.brazelog(tag, Priority.I, tr, (Function0<String>) new f(msg));
    }

    public static /* synthetic */ void i$default(String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        i(str, str2, th);
    }

    @JvmStatic
    public static final void resetForTesting() {
        isSystemPropLogLevelSet = false;
        hasLogLevelBeenSetForAppRun = false;
        onLoggedCallback = null;
    }

    @JvmStatic
    public static final synchronized void setInitialLogLevelFromConfiguration(int initialLogLevel) {
        synchronized (BrazeLogger.class) {
            if (!hasLogLevelBeenSetForAppRun) {
                setLogLevel(initialLogLevel);
            }
        }
    }

    public static final synchronized void setLogLevel(int i2) {
        synchronized (BrazeLogger.class) {
            if (isSystemPropLogLevelSet) {
                BrazeLogger brazeLogger = INSTANCE;
                brazelog$default(brazeLogger, brazeLogger, Priority.W, (Throwable) null, new g(i2), 2, (Object) null);
            } else {
                hasLogLevelBeenSetForAppRun = true;
                logLevel = i2;
            }
        }
    }

    public static final void setOnLoggedCallback(Function3<? super Priority, ? super String, ? super Throwable, Unit> function3) {
        onLoggedCallback = function3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringSafe(Function0<? extends Object> function0) {
        try {
            return String.valueOf(function0.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    public static final void v(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        v$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void v(String tag, String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.brazelog(tag, Priority.V, tr, (Function0<String>) new h(msg));
    }

    public static /* synthetic */ void v$default(String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        v(str, str2, th);
    }

    @JvmStatic
    public static final void w(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        w$default(tag, msg, null, 4, null);
    }

    @JvmStatic
    public static final void w(String tag, String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        INSTANCE.brazelog(tag, Priority.W, tr, (Function0<String>) new i(msg));
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    public final String brazeLogTag(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String fullClassName = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(fullClassName, "fullClassName");
        String substringAfterLast$default = StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(fullClassName, Typography.dollar, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
        return substringAfterLast$default.length() == 0 ? getBrazeLogTag(fullClassName) : getBrazeLogTag(substringAfterLast$default);
    }

    public final void brazelog(Object obj, Priority priority, Throwable th, Function0<String> message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (logLevel <= priority.getLogLevel()) {
            brazelog(brazeLogTag(obj), priority, th, message);
        }
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            priority = Priority.D;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        brazeLogger.brazelog(str, priority, th, (Function0<String>) function0);
    }

    public final void brazelog(String tag, Priority priority, Throwable tr, Function0<String> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        Lazy lazy = LazyKt.lazy(new b(message));
        Function3<? super Priority, ? super String, ? super Throwable, Unit> function3 = onLoggedCallback;
        if (function3 != null) {
            function3.invoke(priority, lazy.getValue(), tr);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i2 = a.a[priority.ordinal()];
            if (i2 == 1) {
                if (tr == null) {
                    Log.d(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.d(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i2 == 2) {
                if (tr == null) {
                    Log.i(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.i(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i2 == 3) {
                if (tr == null) {
                    Log.w(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.e(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i2 == 4) {
                if (tr == null) {
                    Log.w(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.w(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i2 != 5) {
                return;
            }
            if (tr == null) {
                Log.v(tag, (String) lazy.getValue());
            } else {
                Log.v(tag, (String) lazy.getValue(), tr);
            }
        }
    }

    public final String getBrazeLogTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Intrinsics.stringPlus(Constants.LOG_TAG_PREFIX, str);
    }
}
