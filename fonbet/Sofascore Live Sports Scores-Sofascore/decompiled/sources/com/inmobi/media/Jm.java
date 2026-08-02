package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.rob;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Jm extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Nm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jm(Nm nm, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = nm;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Jm jm = new Jm(this.c, rq3Var);
        jm.b = obj;
        return jm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Jm jm = new Jm(this.c, (rq3) obj2);
        jm.b = (AbstractC3712qm) obj;
        return jm.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            AbstractC3712qm abstractC3712qm = (AbstractC3712qm) this.b;
            Nm nm = this.c;
            this.a = 1;
            if (nm.c.b.isEmpty()) {
                C3906y9 c3906y9 = nm.e;
                if (c3906y9 != null) {
                    c3906y9.a("VideoExperienceManager", "Companion Ads are Empty");
                }
                obj2 = Unit.a;
            } else {
                if (nm.i == null) {
                    nm.i = new S3(nm.a, nm.b, nm.c.h, nm.e);
                    nm.c();
                }
                S3 s3 = nm.i;
                if ((s3 == null || !Intrinsics.c(s3.i, U3.a)) ? false : abstractC3712qm instanceof Hn) {
                    S3 s32 = nm.i;
                    if (s32 != null) {
                        s32.a(nm.c.b);
                    }
                } else if (abstractC3712qm instanceof C3660om) {
                    S3 s33 = nm.i;
                    if (s33 != null) {
                        if (Intrinsics.c(s33.i, T3.a)) {
                            hs4 hs4Var = z45.a;
                            obj2 = xw3.R(rob.a, new Lm(nm, s33, null), this);
                            if (obj2 != obj3) {
                            }
                        } else {
                            C3906y9 c3906y92 = nm.e;
                            if (c3906y92 != null) {
                                c3906y92.a("VideoExperienceManager", "Companion Ad is not Available");
                            }
                            Map a = Hk.a(nm.c.h.a);
                            C3839vk c3839vk = C3839vk.a;
                            C3839vk.b("CompanionAdDropped", a, EnumC3943zk.SDK);
                            hs4 hs4Var2 = z45.a;
                            obj2 = xw3.R(rob.a, new Km(s33, null), this);
                            if (obj2 != obj3) {
                                obj2 = Unit.a;
                            }
                        }
                        if (obj2 != obj3) {
                            obj2 = Unit.a;
                        }
                    }
                    obj2 = Unit.a;
                    if (obj2 != obj3) {
                    }
                }
                obj2 = Unit.a;
            }
            if (obj2 == obj3) {
                return obj3;
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
