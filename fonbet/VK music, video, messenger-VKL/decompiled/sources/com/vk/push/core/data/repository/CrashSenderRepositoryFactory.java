package com.vk.push.core.data.repository;

import android.content.Context;
import com.vk.push.common.Logger;
import com.vk.push.core.data.repository.IssueKey;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.NoSuchElementException;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;
import xsna.epx;
import xsna.f4k;
import xsna.rl3;

/* compiled from: CrashSenderRepositoryFactory.kt */
/* loaded from: classes.dex */
public final class CrashSenderRepositoryFactory {

    @Deprecated
    public static final String TRACER_CRASH_REPORTER_CLASS_NAME = "ru.ok.tracer.lite.crash.report.TracerCrashReportLite";

    @Deprecated
    public static final String TRACER_LITE_CLASS_NAME = "ru.ok.tracer.lite.TracerLite";

    public final CrashReporterRepository createCrashSenderRepository(Context context, String str, IssueKeyBlackListRepository issueKeyBlackListRepository, Logger logger) {
        try {
            Object newInstance = ((Constructor) rl3.L(TracerLite.class.getConstructors())).newInstance(context, str);
            int i = TracerCrashReportLite.a;
            final Object newInstance2 = ((Constructor) rl3.L(TracerCrashReportLite.class.getConstructors())).newInstance(newInstance);
            for (final Method method : TracerCrashReportLite.class.getMethods()) {
                if (epx.f(method.getName(), "report") && method.getParameterCount() == 2) {
                    Logger.DefaultImpls.info$default(logger, "Using real crash reporter", null, 2, null);
                    return new CrashSenderImpl(new CrashReporterRepository(this) { // from class: xsna.e4k
                        @Override // com.vk.push.core.data.repository.CrashReporterRepository
                        public final void nonFatalReport(Throwable th, IssueKey issueKey) {
                            try {
                                method.invoke(newInstance2, th, issueKey.name().toLowerCase(Locale.ROOT));
                            } catch (Throwable unused) {
                            }
                        }
                    }, issueKeyBlackListRepository, null, logger, 4, null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Throwable unused) {
            Logger.DefaultImpls.info$default(logger, "Using stub crash reporter", null, 2, null);
            return new f4k();
        }
    }
}
