package R2;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;
import z2.InterfaceC6911a;

/* renamed from: R2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1526b implements InterfaceC6911a {
    @Override // z2.InterfaceC6911a
    public void a(E2.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.z("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.i1("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
