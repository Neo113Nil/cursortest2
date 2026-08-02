package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import defpackage.hoi;
import defpackage.km5;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3621n9 extends hoi implements Function1 {
    public final /* synthetic */ C3724r9 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3621n9(C3724r9 c3724r9, String str, rq3 rq3Var) {
        super(1, rq3Var);
        this.a = c3724r9;
        this.b = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3621n9(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3621n9(this.a, this.b, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        SQLiteDatabase sQLiteDatabase = this.a.d;
        if (sQLiteDatabase == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(this.b, null);
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (rawQuery.moveToNext());
                }
                Unit unit = Unit.a;
                rawQuery.close();
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
