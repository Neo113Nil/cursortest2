package com.inmobi.media;

import android.content.Context;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Cc extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Dc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc(Dc dc, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = dc;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Cc(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Cc(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object a;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            Dc dc = this.b;
            String str = dc.a;
            int i2 = dc.b;
            int i3 = dc.c;
            IntRange intRange = AbstractC3446gf.a;
            dc.g = new Xe(str, null, null, null, new Vi(i2, i3 * 1000, 0), false, 46);
            Dc dc2 = this.b;
            Xe xe = dc2.g;
            Context context = AbstractC3424fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                if ((System.currentTimeMillis() / 1000) - Pa.a(context, "mraid_js_store").a.getLong("last_ts", 0L) > dc2.d && xe != null) {
                    F9 f9 = (F9) Ve.c.getValue();
                    this.a = 1;
                    a = f9.a.a(xe, this);
                    if (a == lu3Var) {
                        return lu3Var;
                    }
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        a = obj;
        InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) a;
        Context context2 = AbstractC3424fj.a;
        if (!Fl.a(interfaceC3317bf)) {
            Dc dc3 = this.b;
            InterfaceC3880x9 interfaceC3880x9 = dc3.e;
            if (interfaceC3880x9 != null) {
                String str2 = dc3.f;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).b(str2, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            ConcurrentHashMap concurrentHashMap2 = Qa.b;
            Qa a2 = Pa.a(context2, "mraid_js_store");
            IntRange intRange2 = AbstractC3446gf.a;
            interfaceC3317bf.getClass();
            String r = interfaceC3317bf.d().r(Charsets.UTF_8);
            r.getClass();
            a2.a("mraid_js_string", r, false);
            a2.a("last_ts", System.currentTimeMillis() / 1000, false);
        }
        return Unit.a;
    }
}
