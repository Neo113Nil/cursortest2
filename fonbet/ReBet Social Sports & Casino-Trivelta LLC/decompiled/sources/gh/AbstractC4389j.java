package gh;

import io.ktor.utils.io.o;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gh.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4389j {
    public static final Throwable a(Throwable th2, Throwable th3) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (th3 == null || Intrinsics.areEqual(th2.getCause(), th3)) {
            return th2;
        }
        Throwable e10 = o.e(th2, th3);
        if (e10 == null) {
            return th2;
        }
        e10.setStackTrace(th2.getStackTrace());
        return e10;
    }
}
