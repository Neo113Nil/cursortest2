package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.hm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3479hm {
    public static final C3479hm a = new C3479hm();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, C3870x c3870x, ArrayList arrayList, sq3 sq3Var) {
        C3453gm c3453gm;
        int i;
        Ml ml;
        Sl e;
        if (sq3Var instanceof C3453gm) {
            c3453gm = (C3453gm) sq3Var;
            int i2 = c3453gm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3453gm.d = i2 - Integer.MIN_VALUE;
                Object obj = c3453gm.b;
                lu3 lu3Var = lu3.a;
                i = c3453gm.d;
                if (i != 0) {
                    y6a.M(obj);
                    G g = c3870x.b;
                    Ml ml2 = new Ml(g);
                    C3401em c3401em = new C3401em(c3870x.b.a.b.getVastVideo(), ml2, c3870x.a.c);
                    try {
                        Map a2 = Hk.a(g);
                        C3839vk c3839vk = C3839vk.a;
                        C3839vk.b("VastParseStart", a2, EnumC3943zk.SDK);
                        c3453gm.a = ml2;
                        c3453gm.d = 1;
                        Object a3 = c3401em.a(str, arrayList, c3453gm);
                        if (a3 == lu3Var) {
                            return lu3Var;
                        }
                        ml = ml2;
                        obj = a3;
                    } catch (Sl e2) {
                        ml = ml2;
                        e = e2;
                        short s = e.a;
                        Map a4 = Hk.a(ml.a);
                        a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
                        C3839vk c3839vk2 = C3839vk.a;
                        C3839vk.b("VastParseFailure", a4, EnumC3943zk.SDK);
                        throw e;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ml = c3453gm.a;
                    try {
                        y6a.M(obj);
                    } catch (Sl e3) {
                        e = e3;
                        short s2 = e.a;
                        Map a42 = Hk.a(ml.a);
                        a42.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s2));
                        C3839vk c3839vk22 = C3839vk.a;
                        C3839vk.b("VastParseFailure", a42, EnumC3943zk.SDK);
                        throw e;
                    }
                }
                Map a5 = Hk.a(ml.a);
                C3839vk c3839vk3 = C3839vk.a;
                C3839vk.b("VastParseSuccess", a5, EnumC3943zk.SDK);
                return obj;
            }
        }
        c3453gm = new C3453gm(this, sq3Var);
        Object obj2 = c3453gm.b;
        lu3 lu3Var2 = lu3.a;
        i = c3453gm.d;
        if (i != 0) {
        }
        Map a52 = Hk.a(ml.a);
        C3839vk c3839vk32 = C3839vk.a;
        C3839vk.b("VastParseSuccess", a52, EnumC3943zk.SDK);
        return obj2;
    }
}
