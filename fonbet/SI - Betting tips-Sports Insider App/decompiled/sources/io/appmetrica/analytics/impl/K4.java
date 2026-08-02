package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class K4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final J4 f12463a = new J4();

    /* renamed from: b, reason: collision with root package name */
    public final I4 f12464b = new I4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.f12463a.runScript(sQLiteDatabase);
        this.f12464b.runScript(sQLiteDatabase);
    }
}
