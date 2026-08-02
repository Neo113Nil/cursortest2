package com.inmobi.media;

import defpackage.a70;
import defpackage.asf;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Yl extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ asf c;
    public final /* synthetic */ C3401em d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yl(C3401em c3401em, rq3 rq3Var, asf asfVar, XmlPullParser xmlPullParser) {
        super(1, rq3Var);
        this.b = xmlPullParser;
        this.c = asfVar;
        this.d = c3401em;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        XmlPullParser xmlPullParser = this.b;
        return new Yl(this.d, rq3Var, this.c, xmlPullParser);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Yl) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            if (Intrinsics.c(this.b.getName(), "VAST")) {
                this.c.a = true;
                C3401em c3401em = this.d;
                XmlPullParser xmlPullParser = this.b;
                this.a = 1;
                if (C3401em.b(c3401em, xmlPullParser, this) == lu3Var) {
                    return lu3Var;
                }
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
