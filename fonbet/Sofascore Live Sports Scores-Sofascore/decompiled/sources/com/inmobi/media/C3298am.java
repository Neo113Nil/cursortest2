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
/* renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3298am extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ C3401em c;
    public final /* synthetic */ asf d;
    public final /* synthetic */ asf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3298am(XmlPullParser xmlPullParser, C3401em c3401em, asf asfVar, asf asfVar2, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = xmlPullParser;
        this.c = c3401em;
        this.d = asfVar;
        this.e = asfVar2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3298am(this.b, this.c, this.d, this.e, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3298am) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        boolean z;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            String name = this.b.getName();
            if (Intrinsics.c(name, "Error")) {
                Je a = this.c.a("error", this.b);
                if (a != null) {
                    this.c.h.add(a);
                }
            } else {
                boolean c = Intrinsics.c(name, "Ad");
                C3401em c3401em = this.c;
                if (c) {
                    XmlPullParser xmlPullParser = this.b;
                    c3401em.getClass();
                    try {
                        z = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"));
                    } catch (Exception unused) {
                        z = false;
                    }
                    if (z) {
                        this.d.a = true;
                        C3401em c3401em2 = this.c;
                        XmlPullParser xmlPullParser2 = this.b;
                        c3401em2.getClass();
                        C3401em.w(xmlPullParser2);
                        return Unit.a;
                    }
                    asf asfVar = this.e;
                    if (asfVar.a) {
                        C3401em c3401em3 = this.c;
                        XmlPullParser xmlPullParser3 = this.b;
                        c3401em3.getClass();
                        C3401em.w(xmlPullParser3);
                        return Unit.a;
                    }
                    asfVar.a = true;
                    C3401em c3401em4 = this.c;
                    XmlPullParser xmlPullParser4 = this.b;
                    this.a = 1;
                    if (C3401em.a(c3401em4, xmlPullParser4, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    XmlPullParser xmlPullParser5 = this.b;
                    c3401em.getClass();
                    C3401em.w(xmlPullParser5);
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
