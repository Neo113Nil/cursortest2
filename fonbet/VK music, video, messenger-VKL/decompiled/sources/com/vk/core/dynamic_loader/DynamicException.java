package com.vk.core.dynamic_loader;

import xsna.epx;
import xsna.ho8;
import xsna.vu5;
import xsna.zil0;

/* compiled from: DynamicCancellation.kt */
/* loaded from: classes17.dex */
public abstract class DynamicException extends RuntimeException {
    private final int code;
    private final String message;

    /* compiled from: DynamicCancellation.kt */
    public static final class Cancellation extends DynamicException {
        private final String message;

        public Cancellation(String str) {
            super(str, -1);
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cancellation) && epx.f(this.message, ((Cancellation) obj).message);
        }

        @Override // com.vk.core.dynamic_loader.DynamicException, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return ho8.a(new StringBuilder("Cancellation(message="), this.message, ')');
        }
    }

    /* compiled from: DynamicCancellation.kt */
    public static final class GooglePlay extends DynamicException {
        private final int code;
        private final String message;

        public GooglePlay(String str, int i) {
            super(str, i);
            this.message = str;
            this.code = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GooglePlay)) {
                return false;
            }
            GooglePlay googlePlay = (GooglePlay) obj;
            return epx.f(this.message, googlePlay.message) && this.code == googlePlay.code;
        }

        @Override // com.vk.core.dynamic_loader.DynamicException, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return Integer.hashCode(this.code) + (this.message.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("GooglePlay(message=");
            sb.append(this.message);
            sb.append(", code=");
            return vu5.b(sb, this.code, ')');
        }
    }

    /* compiled from: DynamicCancellation.kt */
    public static final class Network extends DynamicException {
        private final int code;
        private final String message;

        public Network(String str, int i) {
            super(str, i);
            this.message = str;
            this.code = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Network)) {
                return false;
            }
            Network network = (Network) obj;
            return epx.f(this.message, network.message) && this.code == network.code;
        }

        @Override // com.vk.core.dynamic_loader.DynamicException, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return Integer.hashCode(this.code) + (this.message.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("Network(message=");
            sb.append(this.message);
            sb.append(", code=");
            return vu5.b(sb, this.code, ')');
        }
    }

    /* compiled from: DynamicCancellation.kt */
    public static final class Queuing extends DynamicException {
        private final String message;

        public Queuing() {
            super("Can't add task to queue because of Internet Connection is lost!", -1);
            this.message = "Can't add task to queue because of Internet Connection is lost!";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Queuing) && epx.f(this.message, ((Queuing) obj).message);
        }

        @Override // com.vk.core.dynamic_loader.DynamicException, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return ho8.a(new StringBuilder("Queuing(message="), this.message, ')');
        }
    }

    /* compiled from: DynamicCancellation.kt */
    public static final class Session extends DynamicException {
        private final int code;
        private final String message;

        public Session(String str, int i) {
            super(str, i);
            this.message = str;
            this.code = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return false;
            }
            Session session = (Session) obj;
            return epx.f(this.message, session.message) && this.code == session.code;
        }

        @Override // com.vk.core.dynamic_loader.DynamicException, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return Integer.hashCode(this.code) + (this.message.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("Session(message=");
            sb.append(this.message);
            sb.append(", code=");
            return vu5.b(sb, this.code, ')');
        }
    }

    /* compiled from: DynamicCancellation.kt */
    public static final class Storage extends DynamicException {
        private final int code;
        private final String message;

        public Storage(String str, int i) {
            super(str, i);
            this.message = str;
            this.code = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Storage)) {
                return false;
            }
            Storage storage = (Storage) obj;
            return epx.f(this.message, storage.message) && this.code == storage.code;
        }

        @Override // com.vk.core.dynamic_loader.DynamicException, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return Integer.hashCode(this.code) + (this.message.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("Storage(message=");
            sb.append(this.message);
            sb.append(", code=");
            return vu5.b(sb, this.code, ')');
        }
    }

    /* compiled from: DynamicCancellation.kt */
    public static final class Unknown extends DynamicException {
        private final int code;
        private final String message;

        public Unknown(String str, int i) {
            super(str, i);
            this.message = str;
            this.code = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) obj;
            return epx.f(this.message, unknown.message) && this.code == unknown.code;
        }

        @Override // com.vk.core.dynamic_loader.DynamicException, java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return Integer.hashCode(this.code) + (this.message.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("Unknown(message=");
            sb.append(this.message);
            sb.append(", code=");
            return vu5.b(sb, this.code, ')');
        }
    }

    public DynamicException(String str, int i) {
        super(zil0.a(i, "Message: ", str, " | Code: "));
        this.message = str;
        this.code = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
