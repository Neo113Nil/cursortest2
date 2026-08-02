package com.vungle.ads.internal.util;

import android.util.Log;
import com.braze.Constants;
import com.ironsource.mediationsdk.metadata.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/util/Logger;", "", "()V", k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class Logger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enabled;

    @JvmStatic
    public static final int d(String str, String str2) {
        return INSTANCE.d(str, str2);
    }

    @JvmStatic
    public static final int e(String str, String str2) {
        return INSTANCE.e(str, str2);
    }

    @JvmStatic
    public static final int e(String str, String str2, Throwable th) {
        return INSTANCE.e(str, str2, th);
    }

    @JvmStatic
    public static final int i(String str, String str2) {
        return INSTANCE.i(str, str2);
    }

    @JvmStatic
    public static final int w(String str, String str2) {
        return INSTANCE.w(str, str2);
    }

    @JvmStatic
    public static final int w(String str, Function0<String> function0) {
        return INSTANCE.w(str, function0);
    }

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u001e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\n\u0010\u0012\u001a\u00020\b*\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/util/Logger$Companion;", "", "()V", "enabled", "", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "", "tag", "", "message", "e", "throwable", "", a.j, "", "i", "w", "Lkotlin/Function0;", "eraseSensitiveData", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void enable(boolean enabled) {
            Companion companion = Logger.INSTANCE;
            Logger.enabled = enabled;
        }

        @JvmStatic
        public final int d(String tag, String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.d(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        @JvmStatic
        public final int e(String tag, String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.e(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        @JvmStatic
        public final int e(String tag, String message, Throwable throwable) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (Logger.enabled) {
                return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
            }
            return -1;
        }

        @JvmStatic
        public final int w(String tag, String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.w(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        @JvmStatic
        public final int w(String tag, Function0<String> message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.w(tag, eraseSensitiveData(message.invoke()));
            }
            return -1;
        }

        @JvmStatic
        public final int i(String tag, String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.i(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final String eraseSensitiveData(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pattern compile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            Intrinsics.checkNotNullExpressionValue(compile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            return new Regex(compile).replace(str, "xxx.xxx.xxx.xxx");
        }
    }
}
