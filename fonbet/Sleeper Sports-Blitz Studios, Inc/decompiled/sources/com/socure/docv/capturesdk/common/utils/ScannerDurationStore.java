package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.common.logger.LoggerKt;
import kotlin.Metadata;

/* compiled from: ScannerDurationStore.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/ScannerDurationStore;", "", "scannerStartTs", "", "(J)V", "captureDuration", "captureStartTs", "totalCaptureDuration", "getAndResetCaptureDurationOnCapture", "getTotalCaptureDuration", "getTotalScannerScreenDuration", "saveCaptureDuration", "", "saveCaptureDurationOnPause", "setCaptureStart", "setCaptureStartFromRetake", "updateTotalCaptureDuration", "State", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScannerDurationStore {
    private long captureDuration;
    private long captureStartTs = State.INITIAL.getFlag();
    private final long scannerStartTs;
    private long totalCaptureDuration;

    public ScannerDurationStore(long j) {
        this.scannerStartTs = j;
    }

    private final void updateTotalCaptureDuration() {
        this.totalCaptureDuration += this.captureDuration;
    }

    public final long getTotalCaptureDuration() {
        return this.totalCaptureDuration;
    }

    public final long getTotalScannerScreenDuration() {
        return System.currentTimeMillis() - this.scannerStartTs;
    }

    public final void setCaptureStartFromRetake() {
        this.captureStartTs = State.RESET_RETAKE.getFlag();
        setCaptureStart();
    }

    public final void setCaptureStart() {
        if (this.captureStartTs < State.RESET_PAUSED.getFlag() && this.captureStartTs != State.RESET_PREVIEW.getFlag()) {
            this.captureStartTs = this.scannerStartTs;
        } else if (this.captureStartTs == State.RESET_PAUSED.getFlag()) {
            this.captureStartTs = System.currentTimeMillis();
        } else {
            LoggerKt.logD("SDLT_EDS", "Neither the first call and nor reset call, not doing anything");
        }
    }

    public final void saveCaptureDurationOnPause() {
        saveCaptureDuration();
    }

    public final long getAndResetCaptureDurationOnCapture() {
        saveCaptureDuration();
        long j = this.captureDuration;
        this.captureDuration = 0L;
        this.captureStartTs = State.RESET_PREVIEW.getFlag();
        return j;
    }

    private final void saveCaptureDuration() {
        if (this.captureStartTs > State.RESET_PAUSED.getFlag()) {
            this.captureDuration += System.currentTimeMillis() - this.captureStartTs;
            updateTotalCaptureDuration();
            this.captureStartTs = State.RESET_PAUSED.getFlag();
            return;
        }
        LoggerKt.logD("SDLT_EDS", "no capture duration to save");
    }

    /* compiled from: ScannerDurationStore.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/ScannerDurationStore$State;", "", "flag", "", "(Ljava/lang/String;IJ)V", "getFlag", "()J", "RESET_PAUSED", "RESET_PREVIEW", "RESET_RETAKE", "INITIAL", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum State {
        RESET_PAUSED(0),
        RESET_PREVIEW(-2),
        RESET_RETAKE(-3),
        INITIAL(-1);

        private final long flag;

        State(long j) {
            this.flag = j;
        }

        public final long getFlag() {
            return this.flag;
        }
    }
}
