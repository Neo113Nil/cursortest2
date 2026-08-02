package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import ti.C6478h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti/h;", "", "isProbablyUtf8", "(Lti/h;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(@NotNull C6478h c6478h) {
        Intrinsics.checkNotNullParameter(c6478h, "<this>");
        try {
            C6478h c6478h2 = new C6478h();
            c6478h.U(c6478h2, 0L, RangesKt.coerceAtMost(c6478h.size(), 64L));
            for (int i10 = 0; i10 < 16; i10++) {
                if (c6478h2.X0()) {
                    return true;
                }
                int d22 = c6478h2.d2();
                if (Character.isISOControl(d22) && !Character.isWhitespace(d22)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
