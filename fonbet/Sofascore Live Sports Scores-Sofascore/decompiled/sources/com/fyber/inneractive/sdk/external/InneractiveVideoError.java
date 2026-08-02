package com.fyber.inneractive.sdk.external;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class InneractiveVideoError extends InneractiveError {
    public final Error a;
    public final Throwable b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private String errorString;
        private boolean isFatal;

        Error(String str, boolean z) {
            this.errorString = str;
            this.isFatal = z;
        }

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }
    }

    public InneractiveVideoError(Error error) {
        this.a = error;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        Throwable th = this.b;
        Error error = this.a;
        if (th == null) {
            return error.getErrorString();
        }
        return error.getErrorString() + ": " + this.b;
    }

    public Throwable getCause() {
        return this.b;
    }

    public Error getPlayerError() {
        return this.a;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.b = th;
    }
}
