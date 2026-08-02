package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.z9a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3818v extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3844w b;
    public final /* synthetic */ String c;
    public final /* synthetic */ C3322bk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3818v(C3844w c3844w, String str, C3322bk c3322bk, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3844w;
        this.c = str;
        this.d = c3322bk;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3818v(this.b, this.c, this.d, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3818v) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        C3844w c3844w = this.b;
        String str = this.c;
        C3322bk c3322bk = this.d;
        this.a = 1;
        lj2 lj2Var = new lj2(1, z9a.b(this));
        lj2Var.t();
        lj2Var.v(new C3766t(c3844w));
        Picasso picasso = C3447gg.a;
        C3447gg.b(c3844w.a).load(str).tag(c3844w.e).transform(new C3318bg(Bitmap.Config.RGB_565)).into(c3322bk, new C3792u(c3844w, lj2Var));
        Object q = lj2Var.q();
        return q == lu3Var ? lu3Var : q;
    }
}
