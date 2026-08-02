package com.unity3d.ads.core.log;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0016J\u0016\u0010\u0019\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/log/UnityLogger;", "Lcom/unity3d/ads/core/log/Logger;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/CreateFile;)V", "_userLogLevel", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "_fileLogLevel", U3.i.X, "logLevel", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevelInternal;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevelInternal;)V", "canLog", "", "targetLogLevel", "", "info", "", PglCryptUtils.KEY_MESSAGE, "", "debug", "error", "e", "", "trace", "fb", "Lkotlin/Function0;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnityLogger implements Logger {

    @NotNull
    private static final String LOG_TAG = "UnityAds";

    @Nullable
    private LogLevelInternal _fileLogLevel;

    @NotNull
    private LogLevelInternal _userLogLevel;

    @NotNull
    private final SessionRepository sessionRepository;

    public UnityLogger(@NotNull SessionRepository sessionRepository, @NotNull CreateFile createFile) {
        sessionRepository.getClass();
        createFile.getClass();
        this.sessionRepository = sessionRepository;
        this._userLogLevel = LogLevelInternal.INFO;
        try {
            if (createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
                this._fileLogLevel = LogLevelInternal.TRACE;
                debug("Unity logger initialized in TRACE mode");
            }
        } catch (Throwable unused) {
        }
    }

    private final boolean canLog(int targetLogLevel) {
        return targetLogLevel >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull Function0<String> fb) {
        fb.getClass();
        if (canLog(3)) {
            debug((String) fb.invoke());
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(@NotNull String message, @Nullable Throwable e) {
        message.getClass();
        canLog(6);
    }

    @Override // com.unity3d.ads.core.log.Logger
    @NotNull
    public LogLevelInternal getLogLevel() {
        if (this.sessionRepository.isNativeConfigReady() && this.sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing()) {
            return LogLevelInternal.TRACE;
        }
        LogLevelInternal logLevelInternal = this._fileLogLevel;
        return logLevelInternal == null ? this._userLogLevel : logLevelInternal;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(@NotNull String message) {
        message.getClass();
        canLog(4);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(@NotNull LogLevelInternal logLevelInternal) {
        logLevelInternal.getClass();
        this._userLogLevel = logLevelInternal;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(@NotNull Function0<String> fb) {
        fb.getClass();
        if (canLog(2)) {
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(@NotNull String message, @Nullable Throwable e) {
        message.getClass();
        canLog(2);
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull String message) {
        message.getClass();
        canLog(3);
    }
}
