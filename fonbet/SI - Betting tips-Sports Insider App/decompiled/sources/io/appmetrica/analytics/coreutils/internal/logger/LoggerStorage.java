package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class LoggerStorage {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap f11710a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f11711b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f11712c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f11712c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        f11712c = getOrCreatePublicLogger(str);
        return f11712c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(String str) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) f11710a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (f11711b) {
            try {
                publicLogger = (PublicLogger) f11710a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f11710a.put(str, publicLogger);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f11710a = new HashMap();
        f11712c = PublicLogger.getAnonymousInstance();
    }
}
