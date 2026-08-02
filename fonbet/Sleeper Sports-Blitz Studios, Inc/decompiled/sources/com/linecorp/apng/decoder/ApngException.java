package com.linecorp.apng.decoder;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApngException.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0010B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/linecorp/apng/decoder/ApngException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "throwable", "", "<init>", "(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "getErrorCode", "()Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "message", "", "getMessage", "()Ljava/lang/String;", "ErrorCode", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApngException extends Exception {
    private final ErrorCode errorCode;

    /* compiled from: ApngException.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            try {
                iArr[ErrorCode.ERR_STREAM_READ_FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorCode.ERR_UNEXPECTED_EOF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorCode.ERR_INVALID_FILE_FORMAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorCode.ERR_NOT_EXIST_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorCode.ERR_FRAME_INDEX_OUT_OF_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ErrorCode.ERR_OUT_OF_MEMORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ErrorCode.ERR_BITMAP_OPERATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ErrorCode.ERR_UNSUPPORTED_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ErrorCode.ERR_WITH_CHILD_EXCEPTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ApngException(ErrorCode errorCode, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorCode, (i & 2) != 0 ? null : th);
    }

    public final ErrorCode getErrorCode() {
        return this.errorCode;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApngException(ErrorCode errorCode, Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.errorCode = errorCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApngException(Throwable throwable) {
        this(ErrorCode.ERR_WITH_CHILD_EXCEPTION, throwable);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.errorCode.ordinal()]) {
            case 1:
                return "Can't read the stream.";
            case 2:
                return "Unexpected end of file.";
            case 3:
                return "Invalid file format.";
            case 4:
                return "Not exist native image.";
            case 5:
                return "Frame index is out of range.";
            case 6:
                return "Out of memory";
            case 7:
                return "Error in the native bitmap operation.";
            case 8:
                return "Unsupported image type.";
            case 9:
                Throwable cause = getCause();
                return "Failed with sub exception : " + (cause != null ? cause.getMessage() : null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApngException.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "ERR_STREAM_READ_FAIL", "ERR_UNEXPECTED_EOF", "ERR_INVALID_FILE_FORMAT", "ERR_NOT_EXIST_IMAGE", "ERR_FRAME_INDEX_OUT_OF_RANGE", "ERR_OUT_OF_MEMORY", "ERR_BITMAP_OPERATION", "ERR_UNSUPPORTED_TYPE", "ERR_WITH_CHILD_EXCEPTION", "Companion", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorCode[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int errorCode;
        public static final ErrorCode ERR_STREAM_READ_FAIL = new ErrorCode("ERR_STREAM_READ_FAIL", 0, -100);
        public static final ErrorCode ERR_UNEXPECTED_EOF = new ErrorCode("ERR_UNEXPECTED_EOF", 1, -101);
        public static final ErrorCode ERR_INVALID_FILE_FORMAT = new ErrorCode("ERR_INVALID_FILE_FORMAT", 2, -102);
        public static final ErrorCode ERR_NOT_EXIST_IMAGE = new ErrorCode("ERR_NOT_EXIST_IMAGE", 3, -103);
        public static final ErrorCode ERR_FRAME_INDEX_OUT_OF_RANGE = new ErrorCode("ERR_FRAME_INDEX_OUT_OF_RANGE", 4, -104);
        public static final ErrorCode ERR_OUT_OF_MEMORY = new ErrorCode("ERR_OUT_OF_MEMORY", 5, -105);
        public static final ErrorCode ERR_BITMAP_OPERATION = new ErrorCode("ERR_BITMAP_OPERATION", 6, -106);
        public static final ErrorCode ERR_UNSUPPORTED_TYPE = new ErrorCode("ERR_UNSUPPORTED_TYPE", 7, -107);
        public static final ErrorCode ERR_WITH_CHILD_EXCEPTION = new ErrorCode("ERR_WITH_CHILD_EXCEPTION", 8, -200);

        private static final /* synthetic */ ErrorCode[] $values() {
            return new ErrorCode[]{ERR_STREAM_READ_FAIL, ERR_UNEXPECTED_EOF, ERR_INVALID_FILE_FORMAT, ERR_NOT_EXIST_IMAGE, ERR_FRAME_INDEX_OUT_OF_RANGE, ERR_OUT_OF_MEMORY, ERR_BITMAP_OPERATION, ERR_UNSUPPORTED_TYPE, ERR_WITH_CHILD_EXCEPTION};
        }

        public static EnumEntries<ErrorCode> getEntries() {
            return $ENTRIES;
        }

        private ErrorCode(String str, int i, int i2) {
            this.errorCode = i2;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        static {
            ErrorCode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: ApngException.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;", "", "<init>", "()V", "fromErrorCode", "Lcom/linecorp/apng/decoder/ApngException$ErrorCode;", "errorCode", "", "fromErrorCode$apng_drawable_release", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ErrorCode fromErrorCode$apng_drawable_release(int errorCode) {
                for (ErrorCode errorCode2 : ErrorCode.values()) {
                    if (errorCode2.getErrorCode() == errorCode) {
                        return errorCode2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public static ErrorCode valueOf(String str) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) $VALUES.clone();
        }
    }
}
