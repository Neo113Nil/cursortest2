package com.socure.docv.capturesdk.common.logger;

import android.util.Log;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u001a.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u001a\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a\u001a\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"TAG", "", "controlledLog", "", "tag", "msg", "level", "Lcom/socure/docv/capturesdk/common/logger/Level;", "th", "", "logD", "logDetailed", "logE", "logFullPrint", "logI", "logPiiDebug", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LoggerKt {
    private static final String TAG = "SDLT_LOG";

    /* compiled from: Logger.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[Level.I.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Level.E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Level.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void logPiiDebug(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    static /* synthetic */ void controlledLog$default(String str, String str2, Level level, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            level = Level.D;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        controlledLog(str, str2, level, th);
    }

    private static final void controlledLog(String str, String str2, Level level, Throwable th) {
        if (!ConstantsKt.getSILENCE_DEBUG_LOG() || level == Level.E) {
            int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                Log.i(str, str2);
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Log.d(str, str2);
            } else if (th != null) {
                Log.e(str, str2, th);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public static final void logD(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        controlledLog$default(tag, msg, null, null, 12, null);
    }

    public static final void logI(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        controlledLog$default(tag, msg, Level.I, null, 8, null);
    }

    public static /* synthetic */ void logE$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        logE(str, str2, th);
    }

    public static final void logE(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        controlledLog(tag, msg, Level.E, th);
    }

    public static /* synthetic */ void logFullPrint$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = TAG;
        }
        logFullPrint(str, str2);
    }

    public static final void logFullPrint(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        controlledLog$default(tag, msg, null, null, 12, null);
    }

    public static final void logDetailed(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (ConstantsKt.getPRINT_DETAILED_LOG()) {
            controlledLog$default(tag, msg, null, null, 12, null);
        }
    }
}
