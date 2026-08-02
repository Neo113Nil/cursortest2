package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import defpackage.a70;
import defpackage.au3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.r9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3724r9 {
    public final I9 a;
    public final C3746s5 b;
    public SQLiteDatabase c;
    public SQLiteDatabase d;
    public au3 e;

    public C3724r9(I9 i9, C3746s5 c3746s5) {
        i9.getClass();
        c3746s5.getClass();
        this.a = i9;
        this.b = c3746s5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1 function1, rq3 rq3Var) {
        C3569l9 c3569l9;
        Object obj;
        lu3 lu3Var;
        int i;
        if (rq3Var instanceof C3569l9) {
            c3569l9 = (C3569l9) rq3Var;
            int i2 = c3569l9.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3569l9.d = i2 - Integer.MIN_VALUE;
                obj = c3569l9.b;
                lu3Var = lu3.a;
                i = c3569l9.d;
                if (i != 0) {
                    y6a.M(obj);
                    au3 au3Var = this.e;
                    if (au3Var != null) {
                        C3595m9 c3595m9 = new C3595m9(function1, null);
                        c3569l9.a = function1;
                        c3569l9.d = 1;
                        obj = xw3.R(au3Var, c3595m9, c3569l9);
                    }
                    c3569l9.a = null;
                    c3569l9.d = 2;
                    Object invoke = function1.invoke(c3569l9);
                    return invoke == lu3Var ? lu3Var : invoke;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function1 = c3569l9.a;
                y6a.M(obj);
                if (obj != null) {
                    return obj;
                }
                c3569l9.a = null;
                c3569l9.d = 2;
                Object invoke2 = function1.invoke(c3569l9);
                if (invoke2 == lu3Var) {
                }
            }
        }
        c3569l9 = new C3569l9(this, rq3Var);
        obj = c3569l9.b;
        lu3Var = lu3.a;
        i = c3569l9.d;
        if (i != 0) {
        }
        if (obj != null) {
        }
        c3569l9.a = null;
        c3569l9.d = 2;
        Object invoke22 = function1.invoke(c3569l9);
        if (invoke22 == lu3Var) {
        }
    }

    public static Object a(C3724r9 c3724r9, String str, ContentValues contentValues, String str2, String[] strArr, sq3 sq3Var, int i) {
        String str3 = (i & 4) != 0 ? null : str2;
        String[] strArr2 = (i & 8) != 0 ? null : strArr;
        c3724r9.getClass();
        Object a = c3724r9.a(new C3699q9(c3724r9, new C3673p9(str, contentValues, str3, strArr2, null), null), sq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    public static /* synthetic */ Object a(C3724r9 c3724r9, String str, String str2, sq3 sq3Var, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c3724r9.a(str, str2, (String[]) null, sq3Var);
    }

    public final Object a(String str, String str2, String[] strArr, rq3 rq3Var) {
        Object a = a(new C3699q9(this, new C3517j9(str, str2, strArr, null), null), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    public final Object a(String str, sq3 sq3Var) {
        Object a = a(new C3699q9(this, new C3543k9(str, null), null), sq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    public final Object a(String str, ContentValues contentValues, int i, sq3 sq3Var) {
        Object a = a(new C3699q9(this, new C3647o9(str, contentValues, i, null), null), sq3Var);
        return a == lu3.a ? a : Unit.a;
    }
}
