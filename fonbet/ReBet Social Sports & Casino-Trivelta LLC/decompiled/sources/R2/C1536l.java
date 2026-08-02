package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536l extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1536l f10040c = new C1536l();

    public C1536l() {
        super(3, 4);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
