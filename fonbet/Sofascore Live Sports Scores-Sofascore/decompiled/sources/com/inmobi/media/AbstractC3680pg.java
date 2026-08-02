package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.pg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3680pg {
    public final Fg a;
    public final InterfaceC3576lg b;
    public final C3860wf c;
    public volatile EnumC3602mg d;
    public final ConcurrentHashMap e;

    public AbstractC3680pg(Fg fg, InterfaceC3576lg interfaceC3576lg, C3860wf c3860wf) {
        fg.getClass();
        c3860wf.getClass();
        this.a = fg;
        this.b = interfaceC3576lg;
        this.c = c3860wf;
        this.d = EnumC3602mg.STOPPED;
        this.e = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (r5.invoke(r2, r3) != r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3473hg c3473hg, Function2 function2, sq3 sq3Var) {
        C3654og c3654og;
        int i;
        Function2 function22;
        C3473hg c3473hg2 = c3473hg;
        if (sq3Var instanceof C3654og) {
            c3654og = (C3654og) sq3Var;
            int i2 = c3654og.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3654og.e = i2 - Integer.MIN_VALUE;
                Object obj = c3654og.c;
                lu3 lu3Var = lu3.a;
                i = c3654og.e;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.d != EnumC3602mg.STARTED) {
                        return Unit.a;
                    }
                    if (this.e.containsKey(c3473hg2.b)) {
                        return Unit.a;
                    }
                    this.e.put(c3473hg2.b, c3473hg2.a);
                    C3860wf c3860wf = this.c;
                    c3654og.a = c3473hg2;
                    function22 = function2;
                    c3654og.b = function22;
                    c3654og.e = 1;
                    c3860wf.getClass();
                    HashMap hashMap = new HashMap(c3473hg2.c);
                    hashMap.put(Command.HTTP_HEADER_USER_AGENT, AbstractC3424fj.c());
                    obj = c3860wf.a.a.a(new Xe(c3473hg2.a, hashMap, null, null, null, c3473hg2.d, 28), c3654og);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c3473hg2 = c3654og.a;
                        y6a.M(obj);
                        this.e.remove(c3473hg2.b);
                        return Unit.a;
                    }
                    Function2 function23 = c3654og.b;
                    C3473hg c3473hg3 = c3654og.a;
                    y6a.M(obj);
                    function22 = function23;
                    c3473hg2 = c3473hg3;
                }
                C3628ng a = a(c3473hg2, (InterfaceC3317bf) obj);
                c3654og.a = c3473hg2;
                c3654og.b = null;
                c3654og.e = 2;
            }
        }
        c3654og = new C3654og(this, sq3Var);
        Object obj2 = c3654og.c;
        lu3 lu3Var2 = lu3.a;
        i = c3654og.e;
        if (i != 0) {
        }
        C3628ng a2 = a(c3473hg2, (InterfaceC3317bf) obj2);
        c3654og.a = c3473hg2;
        c3654og.b = null;
        c3654og.e = 2;
    }

    public abstract Unit b();

    public static C3628ng a(C3473hg c3473hg, InterfaceC3317bf interfaceC3317bf) {
        String str = c3473hg.a;
        interfaceC3317bf.c();
        interfaceC3317bf.e();
        return new C3628ng(c3473hg, interfaceC3317bf.c(), interfaceC3317bf.e());
    }

    public static AdConfig.PingsV2Config a() {
        return ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getPingV2();
    }

    public final Object a(sq3 sq3Var) {
        EnumC3602mg enumC3602mg = this.d;
        EnumC3602mg enumC3602mg2 = EnumC3602mg.STARTED;
        EnumC3602mg enumC3602mg3 = EnumC3602mg.STOPPED;
        Objects.toString(enumC3602mg);
        if (this.d == enumC3602mg3) {
            this.d = enumC3602mg2;
            Unit b = b();
            return b == lu3.a ? b : Unit.a;
        }
        return Unit.a;
    }
}
