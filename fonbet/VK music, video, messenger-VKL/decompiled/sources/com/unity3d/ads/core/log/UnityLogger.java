package com.unity3d.ads.core.log;

import android.util.Log;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import xsna.gzs;
import xsna.zcl;

/* compiled from: UnityLogger.kt */
/* loaded from: classes14.dex */
public final class UnityLogger implements Logger {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UnityAds";
    private LogLevelInternal _fileLogLevel;
    private LogLevelInternal _userLogLevel = LogLevelInternal.INFO;
    private final SessionRepository sessionRepository;

    /* compiled from: UnityLogger.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public UnityLogger(SessionRepository sessionRepository, CreateFile createFile) {
        this.sessionRepository = sessionRepository;
        try {
            if (createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
                this._fileLogLevel = LogLevelInternal.TRACE;
                debug("Unity logger initialized in TRACE mode");
            }
        } catch (Throwable unused) {
        }
    }

    private final boolean canLog(int i) {
        return i >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(String str) {
        canLog(3);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(String str, Throwable th) {
        if (canLog(6)) {
            Log.e("UnityAds", str, th);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public LogLevelInternal getLogLevel() {
        if (this.sessionRepository.isNativeConfigReady() && this.sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing()) {
            return LogLevelInternal.TRACE;
        }
        LogLevelInternal logLevelInternal = this._fileLogLevel;
        return logLevelInternal == null ? this._userLogLevel : logLevelInternal;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(String str) {
        canLog(4);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(LogLevelInternal logLevelInternal) {
        this._userLogLevel = logLevelInternal;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(String str, Throwable th) {
        canLog(2);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(gzs<String> gzsVar) {
        if (canLog(3)) {
            debug(gzsVar.invoke());
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(gzs<String> gzsVar) {
        if (canLog(2)) {
            gzsVar.invoke();
        }
    }
}
