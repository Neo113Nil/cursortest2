package com.inmobi.media;

import defpackage.a70;
import defpackage.dmi;
import defpackage.gc2;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zu4;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Eo extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC3880x9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eo(String str, InterfaceC3880x9 interfaceC3880x9, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = str;
        this.c = interfaceC3880x9;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Eo(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Eo(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Bo bo;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            Io io2 = Io.a;
            zu4 a = Io.a(this.b, this.c);
            this.a = 1;
            obj = a.T(this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) obj;
        Io io3 = Io.a;
        if (interfaceC3317bf != null && Fl.a(interfaceC3317bf)) {
            gc2 d = interfaceC3317bf.d();
            Charset charset = Charsets.UTF_8;
            if (d.r(charset).length() > 0 && (bo = Io.c) != null) {
                String str = this.b;
                IntRange intRange = AbstractC3446gf.a;
                String r = interfaceC3317bf.d().r(charset);
                InterfaceC3880x9 interfaceC3880x9 = this.c;
                String str2 = this.b;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).c("WebResourceHandler", dmi.q("downloadResourceAndSaveToCache() response received: ", str2));
                }
                Unit unit = Unit.a;
                bo.a(str, r, this.c);
            }
        }
        return interfaceC3317bf;
    }
}
