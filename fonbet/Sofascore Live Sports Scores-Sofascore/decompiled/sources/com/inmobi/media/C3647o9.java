package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.o02;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3647o9 extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ContentValues c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3647o9(String str, ContentValues contentValues, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = str;
        this.c = contentValues;
        this.d = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3647o9 c3647o9 = new C3647o9(this.b, this.c, this.d, rq3Var);
        c3647o9.a = obj;
        return c3647o9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3647o9) create((C3724r9) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        SQLiteDatabase sQLiteDatabase = ((C3724r9) this.a).c;
        if (sQLiteDatabase != null) {
            o02.L(sQLiteDatabase.insertWithOnConflict(this.b, null, this.c, this.d));
        }
        return Unit.a;
    }
}
