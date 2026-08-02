package androidx.media3.common;

import androidx.annotation.Nullable;
import java.io.IOException;
import xsna.h5s;

/* loaded from: classes12.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(int i, @Nullable String str, @Nullable Throwable th, boolean z) {
        super(str, th);
        this.contentIsMalformed = z;
        this.dataType = i;
    }

    public static ParserException a(@Nullable RuntimeException runtimeException, @Nullable String str) {
        return new ParserException(1, str, runtimeException, true);
    }

    public static ParserException b(@Nullable Exception exc, @Nullable String str) {
        return new ParserException(4, str, exc, true);
    }

    public static ParserException c(@Nullable String str) {
        return new ParserException(1, str, null, false);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.contentIsMalformed);
        sb.append(", dataType=");
        return h5s.c(this.dataType, "}", sb);
    }
}
