package com.braze.support;

import android.util.Log;
import com.braze.support.BrazeLogger;
import com.twilio.voice.EventKeys;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\r2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u0017\u001a\u00020\r*\u00020\r¢\u0006\u0004\b\u0017\u0010\u001cJ?\u0010!\u001a\u00020\u0006*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b!\u0010\"JC\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b!\u0010#J\u0011\u0010$\u001a\u00020\r*\u00020\u0001¢\u0006\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'Rq\u0010-\u001aK\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\r¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b( \u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0006\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010\u0003\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0080\u0001\u00105\u001a`\u0012\u0013\u0012\u00110\r¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\r¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b( \u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u0006\u0018\u0001048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R0\u0010;\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\b@\u0010\u0003\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\f¨\u0006B"}, d2 = {"Lcom/braze/support/BrazeLogger;", "", "<init>", "()V", "", "returnOnDebug", "", "checkForSystemLogLevelProperty", "(Z)V", "", "initialLogLevel", "setInitialLogLevelFromConfiguration", "(I)V", "", "tag", "msg", "", "tr", "w", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", com.bumptech.glide.gifdecoder.e.f29601m, "Ljava/lang/Class;", "classForTag", "getBrazeLogTag", "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/Function0;", "toStringSafe", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/braze/support/BrazeLogger$Priority;", EventKeys.PRIORITY, "skipSdkDebug", "message", "brazelog", "(Ljava/lang/Object;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;)V", "(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;)V", "brazeLogTag", "(Ljava/lang/Object;)Ljava/lang/String;", "isSystemPropLogLevelSet", "Z", "hasLogLevelBeenSetForAppRun", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "throwable", "onLoggedCallback", "Lkotlin/jvm/functions/Function3;", "getOnLoggedCallback", "()Lkotlin/jvm/functions/Function3;", "setOnLoggedCallback", "(Lkotlin/jvm/functions/Function3;)V", "getOnLoggedCallback$annotations", "Lkotlin/Function4;", "sdkDebuggerCallback", "Lkotlin/jvm/functions/Function4;", "getSdkDebuggerCallback$android_sdk_base_release", "()Lkotlin/jvm/functions/Function4;", "setSdkDebuggerCallback$android_sdk_base_release", "(Lkotlin/jvm/functions/Function4;)V", "logLevel", "I", "getLogLevel", "()I", "setLogLevel", "getLogLevel$annotations", "Priority", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeLogger {
    private static boolean hasLogLevelBeenSetForAppRun;
    private static boolean isSystemPropLogLevelSet;
    private static Function3<? super Priority, ? super String, ? super Throwable, Unit> onLoggedCallback;
    private static Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> sdkDebuggerCallback;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/braze/support/BrazeLogger$Priority;", "", "logLevel", "", "<init>", "(Ljava/lang/String;II)V", "getLogLevel", "()I", "D", "I", "E", "V", "W", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Priority {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        private final int logLevel;

        /* renamed from: D, reason: collision with root package name */
        public static final Priority f29469D = new Priority("D", 0, 3);

        /* renamed from: I, reason: collision with root package name */
        public static final Priority f29471I = new Priority("I", 1, 4);

        /* renamed from: E, reason: collision with root package name */
        public static final Priority f29470E = new Priority("E", 2, 6);

        /* renamed from: V, reason: collision with root package name */
        public static final Priority f29472V = new Priority("V", 3, 2);

        /* renamed from: W, reason: collision with root package name */
        public static final Priority f29473W = new Priority("W", 4, 5);

        private static final /* synthetic */ Priority[] $values() {
            return new Priority[]{f29469D, f29471I, f29470E, f29472V, f29473W};
        }

        static {
            Priority[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Priority(String str, int i10, int i11) {
            this.logLevel = i11;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    private BrazeLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_logLevel_$lambda$0(int i10) {
        return "Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: " + i10;
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th2, boolean z10, Function0 function0, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            priority = Priority.f29469D;
        }
        Priority priority2 = priority;
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        Throwable th3 = th2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        brazeLogger.brazelog(obj, priority2, th3, z10, (Function0<String>) function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String brazelog$lambda$0(Function0 function0) {
        return INSTANCE.toStringSafe(function0);
    }

    @JvmStatic
    public static final void checkForSystemLogLevelProperty(boolean returnOnDebug) {
        String a10 = j.a("log.tag.BRAZE");
        if (StringsKt.equals("verbose", StringsKt.trim((CharSequence) j.a("log.tag.APPBOY")).toString(), true) || StringsKt.equals("verbose", StringsKt.trim((CharSequence) a10).toString(), true)) {
            setLogLevel(2);
            isSystemPropLogLevelSet = true;
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String checkForSystemLogLevelProperty$lambda$0;
                    checkForSystemLogLevelProperty$lambda$0 = BrazeLogger.checkForSystemLogLevelProperty$lambda$0();
                    return checkForSystemLogLevelProperty$lambda$0;
                }
            }, 6, (Object) null);
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        checkForSystemLogLevelProperty(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkForSystemLogLevelProperty$lambda$0() {
        return "BrazeLogger log level set to VERBOSE via device system property for BRAZE/APPBOY. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e$lambda$0(String str) {
        return str;
    }

    @JvmStatic
    public static final String getBrazeLogTag(Class<?> classForTag) {
        Intrinsics.checkNotNullParameter(classForTag, "classForTag");
        String name = classForTag.getName();
        int length = name.length();
        if (length <= 65) {
            Intrinsics.checkNotNull(name);
        } else {
            Intrinsics.checkNotNull(name);
            name = name.substring(length - 65);
            Intrinsics.checkNotNullExpressionValue(name, "substring(...)");
        }
        return "Braze v42.2.0 ." + name;
    }

    @JvmStatic
    public static final void setInitialLogLevelFromConfiguration(int initialLogLevel) {
        if (hasLogLevelBeenSetForAppRun) {
            return;
        }
        setLogLevel(initialLogLevel);
    }

    public static final void setLogLevel(final int i10) {
        if (isSystemPropLogLevelSet) {
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _set_logLevel_$lambda$0;
                    _set_logLevel_$lambda$0 = BrazeLogger._set_logLevel_$lambda$0(i10);
                    return _set_logLevel_$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            hasLogLevelBeenSetForAppRun = true;
            logLevel = i10;
        }
    }

    private final String toStringSafe(Function0<? extends Object> function0) {
        try {
            return String.valueOf(function0.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    public static final void w(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        w$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        w(str, str2, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w$lambda$0(String str) {
        return str;
    }

    public final String brazeLogTag(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String name = obj.getClass().getName();
        Intrinsics.checkNotNull(name);
        String substringAfterLast$default = StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(name, Typography.dollar, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
        return substringAfterLast$default.length() == 0 ? getBrazeLogTag(name) : getBrazeLogTag(substringAfterLast$default);
    }

    public final void brazelog(Object obj, Priority priority, Throwable th2, boolean z10, Function0<String> message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (logLevel <= priority.getLogLevel() || sdkDebuggerCallback != null) {
            brazelog(brazeLogTag(obj), priority, th2, z10, message);
        }
    }

    public final void setSdkDebuggerCallback$android_sdk_base_release(Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> function4) {
        sdkDebuggerCallback = function4;
    }

    @JvmStatic
    public static final void e(String tag, final String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tr, "tr");
        brazelog$default(INSTANCE, tag, Priority.f29469D, tr, false, new Function0() { // from class: Y3.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String e$lambda$0;
                e$lambda$0 = BrazeLogger.e$lambda$0(msg);
                return e$lambda$0;
            }
        }, 8, (Object) null);
    }

    @JvmStatic
    public static final void w(String tag, final String msg, Throwable tr) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.f29473W, tr, false, new Function0() { // from class: Y3.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String w$lambda$0;
                w$lambda$0 = BrazeLogger.w$lambda$0(msg);
                return w$lambda$0;
            }
        }, 8, (Object) null);
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th2, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            priority = Priority.f29469D;
        }
        Priority priority2 = priority;
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        Throwable th3 = th2;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        brazeLogger.brazelog(str, priority2, th3, z10, (Function0<String>) function0);
    }

    public final void brazelog(String tag, Priority priority, Throwable tr, boolean skipSdkDebug, final Function0<String> message) {
        Function4<? super String, ? super Priority, ? super String, ? super Throwable, Unit> function4;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: Y3.I
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String brazelog$lambda$0;
                brazelog$lambda$0 = BrazeLogger.brazelog$lambda$0(Function0.this);
                return brazelog$lambda$0;
            }
        });
        Function3<? super Priority, ? super String, ? super Throwable, Unit> function3 = onLoggedCallback;
        if (function3 != null) {
            function3.invoke(priority, lazy.getValue(), tr);
        }
        if (!skipSdkDebug && (function4 = sdkDebuggerCallback) != null) {
            function4.invoke(tag, priority, lazy.getValue(), tr);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i10 = a.f29477a[priority.ordinal()];
            if (i10 == 1) {
                if (tr == null) {
                    return;
                } else {
                    return;
                }
            }
            if (i10 == 2) {
                if (tr == null) {
                    Log.i(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.i(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i10 == 3) {
                if (tr == null) {
                    Log.w(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.e(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i10 == 4) {
                if (tr == null) {
                    Log.w(tag, (String) lazy.getValue());
                    return;
                } else {
                    Log.w(tag, (String) lazy.getValue(), tr);
                    return;
                }
            }
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (tr == null) {
            }
        }
    }

    public final String getBrazeLogTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "Braze v42.2.0 ." + str;
    }
}
