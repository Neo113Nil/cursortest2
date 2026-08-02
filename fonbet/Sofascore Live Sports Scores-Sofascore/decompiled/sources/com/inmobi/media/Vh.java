package com.inmobi.media;

import defpackage.hoi;
import defpackage.joa;
import defpackage.lu3;
import defpackage.ndd;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vh extends hoi implements Function1 {
    public final /* synthetic */ Xh a;
    public final /* synthetic */ Nb b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vh(Xh xh, Nb nb, JSONObject jSONObject, rq3 rq3Var) {
        super(1, rq3Var);
        this.a = xh;
        this.b = nb;
        this.c = jSONObject;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new Vh(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Vh) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r0 != com.inmobi.media.Nb.STATE) goto L32;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Nb nb;
        int ordinal;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            Pb pb = this.a.e;
            nb = this.b;
            pb.getClass();
            nb.getClass();
            ordinal = pb.a.ordinal();
        } catch (Exception e) {
            this.a.getClass();
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new ndd();
                    }
                    if (nb == Nb.STATE) {
                    }
                    return Unit.a;
                }
                if (nb != Nb.ERROR) {
                    if (nb == Nb.STATE) {
                    }
                    return Unit.a;
                }
            } else if (nb != Nb.DEBUG) {
                if (nb != Nb.ERROR) {
                }
            }
        }
        this.a.g.add(this.c);
        return Unit.a;
    }
}
