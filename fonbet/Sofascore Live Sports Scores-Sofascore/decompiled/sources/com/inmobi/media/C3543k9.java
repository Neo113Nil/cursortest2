package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3543k9 extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3543k9(String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3543k9 c3543k9 = new C3543k9(this.b, rq3Var);
        c3543k9.a = obj;
        return c3543k9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3543k9 c3543k9 = new C3543k9(this.b, (rq3) obj2);
        c3543k9.a = (C3724r9) obj;
        return c3543k9.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        SQLiteDatabase sQLiteDatabase = ((C3724r9) this.a).c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(this.b);
        }
        return Unit.a;
    }
}
