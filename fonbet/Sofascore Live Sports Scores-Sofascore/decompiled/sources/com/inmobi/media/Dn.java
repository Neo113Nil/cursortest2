package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Dn extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ En c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dn(En en, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = en;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Dn dn = new Dn(this.c, rq3Var);
        dn.b = obj;
        return dn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Dn dn = new Dn(this.c, (rq3) obj2);
        dn.b = (ku3) obj;
        return dn.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (defpackage.n4o.y(r4, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (com.inmobi.media.En.a(r7, r6) == r0) goto L23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004f -> B:6:0x002d). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ku3Var = (ku3) this.b;
        } else if (i == 1) {
            ku3Var = (ku3) this.b;
            try {
                y6a.M(obj);
            } catch (IllegalStateException e) {
                e.toString();
            }
            long j = this.c.c;
            this.b = ku3Var;
            this.a = 2;
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku3Var = (ku3) this.b;
            y6a.M(obj);
        }
        if (!s9a.w(ku3Var)) {
            return Unit.a;
        }
        En en = this.c;
        this.b = ku3Var;
        this.a = 1;
    }
}
