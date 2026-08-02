package ru.ozon.app.android.abtool;

import Lm0.a;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/abtool/AbToolLogger;", "", "<init>", "()V", "", "isLogsEnabled", "", "init", "(Z)V", "", "message", "log", "(Ljava/lang/String;)V", "", "throwable", "logError", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Z", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolLogger {

    @NotNull
    public static final AbToolLogger INSTANCE = new AbToolLogger();
    private static boolean isLogsEnabled;

    private AbToolLogger() {
    }

    public static /* synthetic */ void logError$default(AbToolLogger abToolLogger, Throwable th2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        abToolLogger.logError(th2, str);
    }

    public final void init(boolean isLogsEnabled2) {
        List unmodifiableList;
        isLogsEnabled = isLogsEnabled2;
        if (isLogsEnabled2) {
            a.f17149a.getClass();
            synchronized (a.f17150b) {
                unmodifiableList = Collections.unmodifiableList(C7714v.U0(a.f17150b));
                Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(trees.toList())");
            }
            List list = unmodifiableList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((a.c) it.next()) instanceof a.C0333a) {
                        return;
                    }
                }
            }
            a.f17149a.a(new a.C0333a());
        }
    }

    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (isLogsEnabled) {
            a.b bVar = a.f17149a;
            bVar.b("ABTool SDK");
            bVar.d(message, new Object[0]);
        }
    }

    public final void logError(Throwable throwable, String message) {
        if (isLogsEnabled) {
            a.b bVar = a.f17149a;
            bVar.b("ABTool SDK");
            bVar.e(throwable, message, new Object[0]);
        }
    }
}
