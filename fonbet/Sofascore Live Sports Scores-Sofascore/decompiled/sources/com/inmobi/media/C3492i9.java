package com.inmobi.media;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.i9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3492i9 extends hoi implements Function1 {
    public final /* synthetic */ C3724r9 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3492i9(C3724r9 c3724r9, String str, rq3 rq3Var) {
        super(1, rq3Var);
        this.a = c3724r9;
        this.b = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3492i9(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3492i9(this.a, this.b, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        SQLiteDatabase sQLiteDatabase = this.a.d;
        int i = 0;
        if (sQLiteDatabase == null) {
            return new Integer(0);
        }
        try {
            i = (int) DatabaseUtils.longForQuery(sQLiteDatabase, this.b, null);
        } catch (SQLiteException e) {
            e.getMessage();
        }
        return new Integer(i);
    }
}
