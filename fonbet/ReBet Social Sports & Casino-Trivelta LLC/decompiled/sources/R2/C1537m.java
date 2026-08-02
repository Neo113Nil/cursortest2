package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1537m extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1537m f10041c = new C1537m();

    public C1537m() {
        super(4, 5);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db2.z("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
