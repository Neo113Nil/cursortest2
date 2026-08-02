package ah;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2009a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2009a(String value) {
        super("Bad Content-Type format: " + value);
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
