package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.InterfaceC6911a;

/* renamed from: R2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1527c implements InterfaceC6911a {
    @Override // z2.InterfaceC6911a
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
