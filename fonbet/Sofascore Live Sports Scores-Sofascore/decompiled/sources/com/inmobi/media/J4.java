package com.inmobi.media;

import android.content.ContentValues;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J4 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ K4 b;
    public final /* synthetic */ C3385e6 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(K4 k4, C3385e6 c3385e6, long j, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = k4;
        this.c = c3385e6;
        this.d = j;
        this.e = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new J4(this.b, this.c, this.d, this.e, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J4) create((C3724r9) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (r1.a(r8, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r8.a("c_data", r4, 4, r7) == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            C3724r9 c3724r9 = this.b.a;
            C3385e6 c3385e6 = this.c;
            c3385e6.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("e_data", c3385e6.a);
            contentValues.put("timestamp", Long.valueOf(c3385e6.b));
            this.a = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        String str = "DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + this.d + " ORDER BY timestamp DESC LIMIT " + this.e + ") foo);";
        C3724r9 c3724r92 = this.b.a;
        this.a = 2;
    }
}
