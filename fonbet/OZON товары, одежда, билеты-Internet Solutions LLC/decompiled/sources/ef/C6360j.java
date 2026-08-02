package ef;

import E0.C2942q;
import We.F;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ef.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6360j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final F f62236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62237b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f62238c;

    /* renamed from: ef.j$a */
    public static final class a {
        @NotNull
        public static C6360j a(@NotNull String statusLine) throws IOException {
            F f7;
            int i11;
            String str;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (kotlin.text.h.e0(statusLine, "HTTP/1.", false)) {
                i11 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    f7 = F.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    f7 = F.HTTP_1_1;
                }
            } else {
                if (!kotlin.text.h.e0(statusLine, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                f7 = F.HTTP_1_0;
                i11 = 4;
            }
            int i12 = i11 + 3;
            if (statusLine.length() < i12) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String substring = statusLine.substring(i11, i12);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i12) {
                    str = "";
                } else {
                    if (statusLine.charAt(i12) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    str = statusLine.substring(i11 + 4);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).substring(startIndex)");
                }
                return new C6360j(f7, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }
    }

    public C6360j(@NotNull F protocol, int i11, @NotNull String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f62236a = protocol;
        this.f62237b = i11;
        this.f62238c = message;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f62236a == F.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f62237b);
        sb2.append(' ');
        return C2942q.c(sb2, this.f62238c, "StringBuilder().apply(builderAction).toString()");
    }
}
