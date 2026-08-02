package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.o02;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.j9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3517j9 extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3517j9(String str, String str2, String[] strArr, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = str;
        this.c = str2;
        this.d = strArr;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3517j9 c3517j9 = new C3517j9(this.b, this.c, this.d, rq3Var);
        c3517j9.a = obj;
        return c3517j9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3517j9) create((C3724r9) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        SQLiteDatabase sQLiteDatabase = ((C3724r9) this.a).c;
        if (sQLiteDatabase != null) {
            o02.K(sQLiteDatabase.delete(this.b, this.c, this.d));
        }
        return Unit.a;
    }
}
