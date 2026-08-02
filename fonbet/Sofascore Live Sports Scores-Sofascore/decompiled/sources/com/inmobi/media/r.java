package com.inmobi.media;

import android.view.ViewGroup;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r extends hoi implements Function2 {
    public C3322bk a;
    public int b;
    public final /* synthetic */ C3844w c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C3844w c3844w, String str, int i, int i2, int i3, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = c3844w;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new r(this.c, this.d, this.e, this.f, this.g, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        C3322bk c3322bk;
        lu3 lu3Var = lu3.a;
        int i = this.b;
        if (i == 0) {
            y6a.M(obj);
            C3322bk c3322bk2 = new C3322bk(this.c.a);
            c3322bk2.setLayoutParams(new ViewGroup.LayoutParams(this.f, this.g));
            C3844w c3844w = this.c;
            String str = this.d;
            int i2 = this.e;
            this.a = c3322bk2;
            this.b = 1;
            Object a = C3844w.a(c3844w, c3322bk2, str, i2, this);
            if (a == lu3Var) {
                return lu3Var;
            }
            obj = a;
            c3322bk = c3322bk2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3322bk = this.a;
            y6a.M(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return c3322bk;
        }
        throw new C3702qc();
    }
}
