package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Wa extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ Xa b;
    public final /* synthetic */ C3312ba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wa(Xa xa, C3312ba c3312ba, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = xa;
        this.c = c3312ba;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new Wa(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Wa(this.b, this.c, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (com.inmobi.media.Xa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (com.inmobi.media.Xa.a(r6, r1, r5) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (com.inmobi.media.Xa.a(r6, r1, r5) == r0) goto L43;
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
            CrashConfig.ANRConfig anr = this.b.a.getAnr();
            if (!Hl.a(this.c)) {
                return Unit.a;
            }
            if (this.c instanceof D1) {
                F5.a.getClass();
                if (F5.t() && anr.getAppExitReason().getUseForReporting() && this.b.c.d.a()) {
                    C3312ba c3312ba = this.c;
                    c3312ba.getClass();
                    c3312ba.a = "ANREvent";
                    Xa xa = this.b;
                    C3312ba c3312ba2 = this.c;
                    this.a = 1;
                }
            }
            if ((this.c instanceof C3869wo) && anr.getWatchdog().getUseForReporting() && this.b.c.c.a()) {
                Xa xa2 = this.b;
                C3312ba c3312ba3 = this.c;
                this.a = 2;
            } else {
                if (!(this.c instanceof C3307b5)) {
                    return Unit.a;
                }
                if (this.b.a.getCrashConfig().getEnabled() && this.b.c.a.a()) {
                    Xa xa3 = this.b;
                    C3312ba c3312ba4 = this.c;
                    this.a = 3;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        this.b.a();
        return Unit.a;
    }
}
