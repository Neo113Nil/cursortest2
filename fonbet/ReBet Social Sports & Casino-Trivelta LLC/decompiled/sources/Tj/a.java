package Tj;

import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC5459a;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC5459a.d("TalkSdk", message, new Object[0]);
    }

    public static final void b(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        AbstractC5459a.c("TalkSdk", "Exception message: " + exception.getMessage(), exception, new Object[0]);
    }
}
