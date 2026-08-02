package kh;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(String name, int i10, int i11) {
        this("Not enough free space to write " + name + " of " + i10 + " bytes, available " + i11 + " bytes.");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
