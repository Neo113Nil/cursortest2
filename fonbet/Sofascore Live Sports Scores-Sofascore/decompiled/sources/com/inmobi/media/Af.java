package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Af extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AdConfig.OmidConfig c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Af(AdConfig.OmidConfig omidConfig, Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = omidConfig;
        this.d = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Af af = new Af(this.c, this.d, rq3Var);
        af.b = obj;
        return af;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Af) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r14 == r1) goto L33;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
        } catch (Throwable th) {
            p2g p2gVar = w2g.b;
            u2gVar = new u2g(th);
        }
        if (i == 0) {
            y6a.M(obj);
            AdConfig.OmidConfig omidConfig = this.c;
            p2g p2gVar2 = w2g.b;
            this.a = 1;
            String url = omidConfig.getUrl();
            int maxRetries = omidConfig.getMaxRetries();
            int retryInterval = omidConfig.getRetryInterval();
            IntRange intRange = AbstractC3446gf.a;
            Xe xe = new Xe(url, null, null, null, new Vi(maxRetries, retryInterval * 1000, 0), false, 46);
            hs4 hs4Var = z45.a;
            obj = xw3.R(hq4.c, new Hf(xe, null), this);
            if (obj == lu3Var) {
                return lu3Var;
            }
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
        u2gVar = (String) obj;
        p2g p2gVar3 = w2g.b;
        if (w2g.a(u2gVar) != null) {
            Df.b.set(0);
        }
        Context context = this.d;
        if (!(u2gVar instanceof u2g)) {
            String str = (String) u2gVar;
            Df.b.set(1);
            Gf gf = Df.c;
            if (gf == null) {
                gf = new Gf(context);
                Df.c = gf;
            }
            this.b = u2gVar;
            this.a = 2;
            hs4 hs4Var2 = z45.a;
            Object R = xw3.R(hq4.c, new Ff(gf, str, null), this);
            if (R != lu3.a) {
                R = Unit.a;
            }
        }
        return Unit.a;
    }
}
