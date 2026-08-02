package io.sentry.android.core.cache;

import android.os.SystemClock;
import androidx.appcompat.widget.c1;
import androidx.transition.i;
import io.appmetrica.analytics.impl.C0122e9;
import io.appmetrica.analytics.impl.ap;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.d;
import io.sentry.android.core.j1;
import io.sentry.android.core.performance.f;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.z;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.cache.c;
import io.sentry.h0;
import io.sentry.x6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: k, reason: collision with root package name */
    public static final List f15561k = Arrays.asList(new a(z.class, "ANR", "last_anr_report", new ap(27)), new a(j1.class, "Tombstone", "last_tombstone_report", new ap(28)));
    public final d j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(SentryAndroidOptions sentryAndroidOptions) {
        super(sentryAndroidOptions, r0, sentryAndroidOptions.getMaxCacheItems());
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        y4.a.C(cacheDirPath, "cacheDirPath must not be null");
        this.j = d.f15711a;
    }

    public static Long h(b6 b6Var, String str, String str2) {
        String cacheDirPath = b6Var.getCacheDirPath();
        y4.a.C(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String w10 = io.sentry.config.a.w(file);
            if (w10 != null && !w10.equals("null")) {
                return Long.valueOf(Long.parseLong(w10.trim()));
            }
            return null;
        } catch (Throwable th2) {
            if (th2 instanceof FileNotFoundException) {
                b6Var.getLogger().h(b5.DEBUG, c1.n("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            b6Var.getLogger().e(b5.ERROR, c1.n("Error reading last ", str2, " marker"), th2);
            return null;
        }
    }

    @Override // io.sentry.cache.c, io.sentry.cache.d
    public final boolean y(l1.a aVar, h0 h0Var) {
        Long valueOf;
        boolean y5 = super.y(aVar, h0Var);
        b6 b6Var = this.f16241a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) b6Var;
        g gVar = f.b().f15805d;
        if (x6.class.isInstance(h0Var.b("sentry:typeCheckHint")) && gVar.b()) {
            this.j.getClass();
            long uptimeMillis = SystemClock.uptimeMillis() - gVar.f15814c;
            if (uptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                b5 b5Var = b5.DEBUG;
                logger.h(b5Var, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(uptimeMillis));
                String outboxPath = b6Var.getOutboxPath();
                if (outboxPath == null) {
                    b6Var.getLogger().h(b5Var, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th2) {
                        b6Var.getLogger().e(b5.ERROR, "Error writing the startup crash marker file to the disk", th2);
                    }
                }
            }
        }
        for (a aVar2 : f15561k) {
            Class cls = aVar2.f15557a;
            i iVar = new i(aVar2, sentryAndroidOptions, this, 6);
            Object b10 = h0Var.b("sentry:typeCheckHint");
            if (cls.isInstance(h0Var.b("sentry:typeCheckHint")) && b10 != null) {
                a aVar3 = (a) iVar.f2706b;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) iVar.f2707c;
                b bVar = (b) iVar.f2708d;
                switch (aVar3.f15560d.f13362a) {
                    case C0122e9.H /* 27 */:
                        valueOf = Long.valueOf(((z) b10).f15897d);
                        break;
                    default:
                        valueOf = Long.valueOf(((j1) b10).f15765d);
                        break;
                }
                ILogger logger2 = sentryAndroidOptions2.getLogger();
                b5 b5Var2 = b5.DEBUG;
                String str = aVar3.f15558b;
                logger2.h(b5Var2, "Writing last reported %s marker with timestamp %d", str, valueOf);
                String str2 = aVar3.f15559c;
                b6 b6Var2 = bVar.f16241a;
                String cacheDirPath = b6Var2.getCacheDirPath();
                if (cacheDirPath == null) {
                    b6Var2.getLogger().h(b5Var2, c1.n("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str2));
                        try {
                            fileOutputStream.write(String.valueOf(valueOf).getBytes(c.f16240i));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        b6Var2.getLogger().e(b5.ERROR, c1.n("Error writing the ", str, " marker to the disk"), th5);
                    }
                }
            }
        }
        return y5;
    }
}
