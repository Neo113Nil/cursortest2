package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.q9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3699q9 extends hoi implements Function1 {
    public SQLiteDatabase a;
    public int b;
    public final /* synthetic */ C3724r9 c;
    public final /* synthetic */ hoi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3699q9(C3724r9 c3724r9, Function2 function2, rq3 rq3Var) {
        super(1, rq3Var);
        this.c = c3724r9;
        this.d = (hoi) function2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hoi, kotlin.jvm.functions.Function2] */
    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3699q9(this.c, this.d, rq3Var);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hoi, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3699q9(this.c, this.d, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062 A[Catch: SQLiteException -> 0x0066, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0066, blocks: (B:23:0x005c, B:25:0x0062), top: B:22:0x005c }] */
    /* JADX WARN: Type inference failed for: r2v1, types: [hoi, kotlin.jvm.functions.Function2] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2;
        lu3 lu3Var = lu3.a;
        int i = this.b;
        try {
            if (i == 0) {
                y6a.M(obj);
                C3724r9 c3724r9 = this.c;
                sQLiteDatabase = c3724r9.c;
                if (sQLiteDatabase == 0) {
                    return null;
                }
                ?? r2 = this.d;
                if (c3724r9.b.c == 2) {
                    sQLiteDatabase.beginTransactionNonExclusive();
                } else {
                    sQLiteDatabase.beginTransaction();
                }
                try {
                    try {
                        this.a = sQLiteDatabase;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                    try {
                        this.b = 1;
                        if (r2.invoke(c3724r9, this) == lu3Var) {
                            return lu3Var;
                        }
                        sQLiteDatabase2 = sQLiteDatabase;
                    } catch (SQLiteException e2) {
                        e = e2;
                        sQLiteDatabase2 = sQLiteDatabase;
                        e.getMessage();
                        if (sQLiteDatabase2.inTransaction()) {
                        }
                        return Unit.a;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (SQLiteException e3) {
                        e3.getMessage();
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sQLiteDatabase2 = this.a;
                try {
                    y6a.M(obj);
                } catch (SQLiteException e4) {
                    e = e4;
                    e.getMessage();
                    try {
                        if (sQLiteDatabase2.inTransaction()) {
                            sQLiteDatabase2.endTransaction();
                        }
                    } catch (SQLiteException e5) {
                        e5.getMessage();
                    }
                    return Unit.a;
                }
            }
            sQLiteDatabase2.setTransactionSuccessful();
            try {
                if (sQLiteDatabase2.inTransaction()) {
                    sQLiteDatabase2.endTransaction();
                }
            } catch (SQLiteException e6) {
                e6.getMessage();
            }
            return Unit.a;
        } catch (Throwable th3) {
            sQLiteDatabase = this;
            th = th3;
        }
    }
}
