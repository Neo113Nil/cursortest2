package com.mbridge.msdk.foundation.download;

import com.mbridge.msdk.foundation.download.utils.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class DownloadResponse {
    private static final String UN_KNOWN = "unknown";
    private DownloadError _error;
    private boolean _isCancelled;
    private boolean _isSuccessful;
    private int from = 0;
    private boolean isFailed;
    private boolean isResponseStart;
    private boolean isTimeout;

    public DownloadError getError() {
        return this._error;
    }

    public String getErrorMessage() {
        return (Objects.isNull(getError()) || Objects.isNull(getError().getException())) ? "unknown" : getError().getException().getMessage();
    }

    public int getFrom() {
        return this.from;
    }

    public boolean isCancelled() {
        return this._isCancelled;
    }

    public boolean isFailed() {
        return this.isFailed;
    }

    public boolean isResponseStart() {
        return this.isResponseStart;
    }

    public boolean isSuccessful() {
        return this._isSuccessful;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setCancelled(boolean z) {
        this._isCancelled = z;
    }

    public void setError(Exception exc) {
        setError(new DownloadError(exc));
    }

    public void setFailed(boolean z) {
        this.isFailed = z;
    }

    public void setFrom(int i) {
        this.from = i;
    }

    public void setResponseStart(boolean z) {
        this.isResponseStart = z;
    }

    public void setSuccessful(boolean z) {
        this._isSuccessful = z;
    }

    public void setTimeout(boolean z) {
        this.isTimeout = z;
    }

    public void setError(DownloadError downloadError) {
        this._error = downloadError;
        setSuccessful(false);
    }
}
