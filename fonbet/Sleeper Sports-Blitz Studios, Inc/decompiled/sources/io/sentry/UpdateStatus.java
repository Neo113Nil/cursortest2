package io.sentry;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public abstract class UpdateStatus {

    public static final class UpToDate extends UpdateStatus {
        private static final UpToDate INSTANCE = new UpToDate();

        private UpToDate() {
        }

        public static UpToDate getInstance() {
            return INSTANCE;
        }

        public String toString() {
            return "UpdateStatus.UpToDate{}";
        }
    }

    public static final class NewRelease extends UpdateStatus {
        private final UpdateInfo info;

        public NewRelease(UpdateInfo updateInfo) {
            this.info = updateInfo;
        }

        public UpdateInfo getInfo() {
            return this.info;
        }

        public String toString() {
            return "UpdateStatus.NewRelease{info=" + this.info + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static final class UpdateError extends UpdateStatus {
        private final String message;

        public UpdateError(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }

        public String toString() {
            return "UpdateStatus.UpdateError{message='" + this.message + "'}";
        }
    }

    public static final class NoNetwork extends UpdateStatus {
        private final String message;

        public NoNetwork(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }

        public String toString() {
            return "UpdateStatus.NoNetwork{message='" + this.message + "'}";
        }
    }
}
