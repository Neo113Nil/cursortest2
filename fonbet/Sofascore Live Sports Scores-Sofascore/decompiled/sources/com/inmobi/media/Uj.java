package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.Link;
import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Uj extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Image b;
    public final /* synthetic */ Vj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uj(Image image, Vj vj, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = image;
        this.c = vj;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Uj(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Uj(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ArrayList a = H4.a("click", this.b.getTrackers());
            b1d b1dVar = this.c.d;
            Link link = this.b.getLink();
            Hj hj = new Hj(link != null ? link.getUrl() : null, a);
            this.a = 1;
            if (b1dVar.emit(hj, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
