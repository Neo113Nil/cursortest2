package com.inmobi.media;

import android.content.ContentValues;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3331c3 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C3357d3 c;
    public final /* synthetic */ Z2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3331c3(int i, C3357d3 c3357d3, Z2 z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = i;
        this.c = c3357d3;
        this.d = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3331c3(this.b, this.c, this.d, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3331c3) create((C3724r9) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r6.a("click", r1, 5, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r1.a(r6, r5) == r0) goto L15;
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
            String k = lnb.k(this.b - 1, "DELETE FROM click WHERE ts = (SELECT ts FROM click ORDER BY ts ASC LIMIT 1) AND (SELECT COUNT(*) FROM click) > ", ";");
            C3724r9 c3724r9 = this.c.a;
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
        C3724r9 c3724r92 = this.c.a;
        ContentValues a = AbstractC3408f3.a(this.d);
        this.a = 2;
    }
}
