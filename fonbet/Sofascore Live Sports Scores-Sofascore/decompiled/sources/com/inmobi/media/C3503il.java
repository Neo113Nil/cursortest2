package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import defpackage.zu4;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.il, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3503il {
    public static final C3503il a = new C3503il();
    public static final Hh b = new Hh();
    public static final LinkedHashSet c = new LinkedHashSet();
    public static zu4 d;
    public static C3581ll e;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (a((defpackage.rq3) r0) != r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (com.inmobi.media.N3.a(r5, r1, r0) == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        C3400el c3400el;
        int i;
        if (sq3Var instanceof C3400el) {
            c3400el = (C3400el) sq3Var;
            int i2 = c3400el.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3400el.c = i2 - Integer.MIN_VALUE;
                Object obj = c3400el.a;
                lu3 lu3Var = lu3.a;
                i = c3400el.c;
                if (i != 0) {
                    y6a.M(obj);
                    Hh hh = b;
                    C3426fl c3426fl = new C3426fl(null);
                    c3400el.c = 1;
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
                c3400el.c = 2;
            }
        }
        c3400el = new C3400el(this, sq3Var);
        Object obj2 = c3400el.a;
        lu3 lu3Var2 = lu3.a;
        i = c3400el.c;
        if (i != 0) {
        }
        c3400el.c = 2;
    }

    public static Object a(rq3 rq3Var) {
        Hh hh = AbstractC3890xj.a;
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig();
        unifiedIdServiceConfig.getUrl();
        Object a2 = N3.a(b, new C3452gl(unifiedIdServiceConfig, null), rq3Var);
        return a2 == lu3.a ? a2 : Unit.a;
    }

    public static Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, rq3 rq3Var) {
        if (inMobiUnifiedIdInterface != null) {
            c.add(inMobiUnifiedIdInterface);
        }
        if (b.b.get() != null) {
            Objects.toString(inMobiUnifiedIdInterface);
            return Unit.a;
        }
        Object a2 = a(rq3Var);
        return a2 == lu3.a ? a2 : Unit.a;
    }
}
