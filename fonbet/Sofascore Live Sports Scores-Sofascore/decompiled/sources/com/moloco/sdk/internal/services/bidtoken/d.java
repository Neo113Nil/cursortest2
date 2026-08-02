package com.moloco.sdk.internal.services.bidtoken;

import com.facebook.c0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.a70;
import defpackage.dmi;
import defpackage.fsf;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.vxd;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends hoi implements Function2 {
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c A;
    public fsf r;
    public c0 s;
    public com.moloco.sdk.acm.recorder.c t;
    public com.moloco.sdk.acm.h u;
    public int v;
    public int w;
    public int x;
    public int y;
    public final /* synthetic */ c0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c0 c0Var, com.moloco.sdk.acm.recorder.c cVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = c0Var;
        this.A = cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new d(this.z, this.A, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0184 -> B:6:0x0189). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fsf fsfVar;
        int i;
        com.moloco.sdk.acm.recorder.c cVar;
        int i2;
        c0 c0Var;
        fsf fsfVar2;
        Object obj2;
        com.moloco.sdk.acm.h hVar;
        c0 c0Var2;
        int i3;
        int i4;
        l0 l0Var;
        int i5;
        lu3 lu3Var = lu3.a;
        int i6 = this.y;
        int i7 = 1;
        if (i6 == 0) {
            fsf g = lnb.g(obj);
            g.a = new j0(new y("retry max parameter is 0", MolocoAdError.ErrorType.UNKNOWN.getErrorCode()));
            c0 c0Var3 = this.z;
            fsfVar = g;
            i = 0;
            cVar = this.A;
            i2 = 3;
            c0Var = c0Var3;
            if (i < i2) {
            }
        } else if (i6 == 1) {
            i = this.x;
            i4 = this.w;
            i3 = this.v;
            com.moloco.sdk.acm.h hVar2 = this.u;
            cVar = this.t;
            c0 c0Var4 = this.s;
            fsf fsfVar3 = this.r;
            y6a.M(obj);
            hVar = hVar2;
            c0Var2 = c0Var4;
            fsfVar2 = fsfVar3;
            obj2 = obj;
            l0Var = (l0) obj2;
            fsfVar2.a = l0Var;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            c0Var2.getClass();
            MolocoLogger.info$default(molocoLogger, "BidTokenApi", "Received bidtoken fetch result: " + l0Var, null, false, 12, null);
            i5 = i7;
            if (l0Var instanceof j0) {
            }
        } else {
            if (i6 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = this.w;
            int i9 = this.v;
            com.moloco.sdk.acm.recorder.c cVar2 = this.t;
            c0 c0Var5 = this.s;
            fsf fsfVar4 = this.r;
            y6a.M(obj);
            i5 = 1;
            com.moloco.sdk.acm.recorder.c cVar3 = cVar2;
            c0Var = c0Var5;
            i2 = i9;
            i4 = i8;
            char c = 2;
            i = i4 + 1;
            fsfVar = fsfVar4;
            i7 = i5;
            cVar = cVar3;
            if (i < i2) {
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                c0Var.getClass();
                MolocoLogger.info$default(molocoLogger2, "BidTokenApi", "Fetching bidtoken, attempt #" + i, null, false, 12, null);
                com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
                hVar = cVar.c("sbt_api_fetch_time_ms");
                this.r = fsfVar;
                this.s = c0Var;
                this.t = cVar;
                this.u = hVar;
                this.v = i2;
                this.w = i;
                this.x = i;
                this.y = i7;
                obj2 = c0Var.b("https://sdkapi.dsp-api.moloco.com/v3/bidtoken", this);
                if (obj2 != lu3Var) {
                    int i10 = i2;
                    c0Var2 = c0Var;
                    i3 = i10;
                    fsfVar2 = fsfVar;
                    i4 = i;
                    l0Var = (l0) obj2;
                    fsfVar2.a = l0Var;
                    MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
                    c0Var2.getClass();
                    MolocoLogger.info$default(molocoLogger3, "BidTokenApi", "Received bidtoken fetch result: " + l0Var, null, false, 12, null);
                    i5 = i7;
                    if (l0Var instanceof j0) {
                        int i11 = i;
                        if (!(l0Var instanceof k0)) {
                            zzl.b();
                            return null;
                        }
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                        hVar.a("result", "success");
                        hVar.a("attempt", String.valueOf(i11));
                        cVar.b(hVar);
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("sbt_api_fetch");
                        dVar.a("result", "success");
                        dVar.a("attempt", String.valueOf(i11));
                        cVar.a(dVar);
                        return l0Var;
                    }
                    int i12 = ((y) ((j0) l0Var).a).b;
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    hVar.a("result", "failure");
                    int i13 = i;
                    hVar.a("reason", String.valueOf(i12));
                    hVar.a("attempt", String.valueOf(i13));
                    cVar.b(hVar);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("sbt_api_fetch");
                    dVar2.a("result", "failure");
                    dVar2.a("reason", String.valueOf(i12));
                    dVar2.a("attempt", String.valueOf(i13));
                    cVar.a(dVar2);
                    if (400 <= i12 && i12 < 500 && i12 != 429) {
                        MolocoLogger.info$default(molocoLogger3, "BidTokenApi", ljg.j(i12, "Received 4xx error: "), null, false, 12, null);
                        return l0Var;
                    }
                    MolocoLogger.info$default(molocoLogger3, "BidTokenApi", dmi.k(i12, i12, "Received non-4xx or ", " error: "), null, false, 12, null);
                    long j = 200 * (i13 + 1);
                    MolocoLogger.info$default(molocoLogger3, "BidTokenApi", vxd.l(j, "Retrying after delay: "), null, false, 12, null);
                    this.r = fsfVar2;
                    this.s = c0Var2;
                    this.t = cVar;
                    this.u = null;
                    this.v = i3;
                    this.w = i4;
                    c = 2;
                    this.y = 2;
                    if (n4o.y(j, this) != lu3Var) {
                        c0 c0Var6 = c0Var2;
                        i2 = i3;
                        c0Var = c0Var6;
                        cVar3 = cVar;
                        fsfVar4 = fsfVar2;
                        i = i4 + 1;
                        fsfVar = fsfVar4;
                        i7 = i5;
                        cVar = cVar3;
                        if (i < i2) {
                            return fsfVar.a;
                        }
                    }
                }
                return lu3Var;
            }
        }
    }
}
