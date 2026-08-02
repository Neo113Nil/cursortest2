package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540p extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1540p f10044c = new C1540p();

    public C1540p() {
        super(8, 9);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
