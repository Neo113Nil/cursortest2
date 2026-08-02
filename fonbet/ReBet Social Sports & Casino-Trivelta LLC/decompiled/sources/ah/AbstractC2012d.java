package ah;

import java.nio.charset.Charset;
import jh.AbstractC5135a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2012d {
    public static final Charset a(AbstractC2017i abstractC2017i) {
        Intrinsics.checkNotNullParameter(abstractC2017i, "<this>");
        String c10 = abstractC2017i.c("charset");
        if (c10 == null) {
            return null;
        }
        try {
            return Charset.forName(c10);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final C2011c b(C2011c c2011c, Charset charset) {
        Intrinsics.checkNotNullParameter(c2011c, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return c2011c.g("charset", AbstractC5135a.i(charset));
    }
}
