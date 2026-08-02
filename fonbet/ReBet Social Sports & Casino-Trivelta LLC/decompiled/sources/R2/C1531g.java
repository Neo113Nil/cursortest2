package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531g extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1531g f10035c = new C1531g();

    public C1531g() {
        super(11, 12);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
