package ru.ozon.app.android.pikazon.logging.error;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00112\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;", "", "type", "", "code", "", "exception", "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "(Ljava/lang/String;ILjava/io/IOException;)V", "getType", "()Ljava/lang/String;", "getCode", "()I", "getException", "()Ljava/io/IOException;", "Companion", "Http", "Cronet", "System", "Other", "Cancellation", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$Cancellation;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$Cronet;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$Http;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$Other;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$System;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ErrorStatus {
    private final int code;
    private final IOException exception;

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$Cancellation;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;", "<init>", "()V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancellation extends ErrorStatus {

        @NotNull
        public static final Cancellation INSTANCE = new Cancellation();

        /* JADX WARN: Multi-variable type inference failed */
        private Cancellation() {
            super("cancellation", 1, null, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$Cronet;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;", "code", "", "exception", "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "(ILjava/io/IOException;)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cronet extends ErrorStatus {
        public Cronet(int i11, IOException iOException) {
            super("cronet", i11, iOException, null);
        }

        public /* synthetic */ Cronet(int i11, IOException iOException, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : iOException);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$Http;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;", "code", "", "exception", "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "(ILjava/io/IOException;)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Http extends ErrorStatus {
        public Http(int i11, IOException iOException) {
            super("http", i11, iOException, null);
        }

        public /* synthetic */ Http(int i11, IOException iOException, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : iOException);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$Other;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;", "code", "", "exception", "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "(ILjava/io/IOException;)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Other extends ErrorStatus {
        public Other(int i11, IOException iOException) {
            super("other", i11, iOException, null);
        }

        public /* synthetic */ Other(int i11, IOException iOException, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? null : iOException);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/logging/error/ErrorStatus$System;", "Lru/ozon/app/android/pikazon/logging/error/ErrorStatus;", "code", "", "exception", "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "(ILjava/io/IOException;)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class System extends ErrorStatus {
        public System(int i11, IOException iOException) {
            super("system", i11, iOException, null);
        }

        public /* synthetic */ System(int i11, IOException iOException, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? null : iOException);
        }
    }

    public /* synthetic */ ErrorStatus(String str, int i11, IOException iOException, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, iOException);
    }

    public final int getCode() {
        return this.code;
    }

    public final IOException getException() {
        return this.exception;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    private ErrorStatus(String str, int i11, IOException iOException) {
        this.type = str;
        this.code = i11;
        this.exception = iOException;
    }
}
