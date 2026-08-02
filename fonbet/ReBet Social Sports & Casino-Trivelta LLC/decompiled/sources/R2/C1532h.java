package R2;

import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC6912b;

/* renamed from: R2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532h extends AbstractC6912b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1532h f10036c = new C1532h();

    public C1532h() {
        super(12, 13);
    }

    @Override // z2.AbstractC6912b
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.z("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
