package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class jlg implements klg {
    public final /* synthetic */ long a;
    public final /* synthetic */ jv0 b;

    public /* synthetic */ jlg(long j, jv0 jv0Var) {
        this.a = j;
        this.b = jv0Var;
    }

    @Override // defpackage.klg
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        jv0 jv0Var = this.b;
        String str = jv0Var.a;
        i7f i7fVar = jv0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(m7f.a(i7fVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(m7f.a(i7fVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
