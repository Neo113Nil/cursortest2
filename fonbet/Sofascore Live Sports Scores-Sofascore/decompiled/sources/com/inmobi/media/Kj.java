package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wv8;
import defpackage.y6a;
import defpackage.yq5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Kj extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3322bk b;
    public final /* synthetic */ Mj c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Bitmap.Config e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kj(C3322bk c3322bk, Mj mj, String str, Bitmap.Config config, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3322bk;
        this.c = mj;
        this.d = str;
        this.e = config;
    }

    public static final void a(C3322bk c3322bk, Bitmap bitmap) {
        c3322bk.setImageBitmap(bitmap);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Kj kj = new Kj(this.b, this.c, this.d, this.e, rq3Var);
        kj.a = obj;
        return kj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Kj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        C3906y9 c3906y9;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Mj mj = this.c;
        String str = this.d;
        Bitmap.Config config = this.e;
        try {
            p2g p2gVar = w2g.b;
            Picasso picasso = C3447gg.a;
            u2gVar = C3447gg.b(mj.a).load(str).tag(mj.c).transform(new C3318bg(config)).get();
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Mj mj2 = this.c;
        Throwable a = w2g.a(u2gVar);
        if (a != null && (c3906y9 = mj2.b) != null) {
            wv8.x("Companion Load Exception: ", a.getMessage(), c3906y9, "StaticCompanionLoader");
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Bitmap bitmap = (Bitmap) u2gVar;
        if (bitmap == null) {
            throw new C3676pc("Companion Load Error");
        }
        C3322bk c3322bk = this.b;
        return Boolean.valueOf(c3322bk.post(new yq5(18, c3322bk, bitmap)));
    }
}
