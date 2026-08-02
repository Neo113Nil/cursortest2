package io.sentry.instrumentation.file;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import e5.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements a, l5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f16500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16501b;

    public /* synthetic */ c(long j, i iVar) {
        this.f16500a = j;
        this.f16501b = iVar;
    }

    @Override // l5.g
    public Object apply(Object obj) {
        i iVar = (i) this.f16501b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f16500a));
        String str = iVar.f8641a;
        b5.d dVar = iVar.f8643c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(o5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f8641a);
            contentValues.put("priority", Integer.valueOf(o5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() {
        e eVar = (e) this.f16501b;
        return Long.valueOf(eVar.f16507a.skip(this.f16500a));
    }

    public /* synthetic */ c(e eVar, long j) {
        this.f16501b = eVar;
        this.f16500a = j;
    }
}
