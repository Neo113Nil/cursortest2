package com.inmobi.media;

import defpackage.a70;
import defpackage.asf;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.dm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3376dm extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ XmlPullParser b;
    public final /* synthetic */ C3401em c;
    public final /* synthetic */ asf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3376dm(C3401em c3401em, rq3 rq3Var, asf asfVar, XmlPullParser xmlPullParser) {
        super(1, rq3Var);
        this.b = xmlPullParser;
        this.c = c3401em;
        this.d = asfVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3376dm(this.c, rq3Var, this.d, this.b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3376dm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
    
        if (r1.a((java.lang.String) r5, r4) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (r5 == r0) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            String name = this.b.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -2077435339:
                        if (name.equals("AdVerifications")) {
                            this.c.c(this.b);
                            return Unit.a;
                        }
                        break;
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            this.c.t(this.b);
                            return Unit.a;
                        }
                        break;
                    case -587420703:
                        if (name.equals("VASTAdTagURI")) {
                            this.d.a = true;
                            C3401em c3401em = this.c;
                            XmlPullParser xmlPullParser = this.b;
                            this.a = 1;
                            if (c3401em.n(xmlPullParser) != 4) {
                                throw new Sl((short) 1109);
                            }
                            String b = Nl.b(xmlPullParser.getText());
                            if (b.length() == 0) {
                                throw new Sl((short) 1108);
                            }
                            obj = Rl.a.a(b, this);
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            Je a = this.c.a("error", this.b);
                            if (a != null) {
                                this.c.i.add(a);
                            }
                            return Unit.a;
                        }
                        break;
                    case 184043572:
                        if (name.equals("Extensions")) {
                            this.c.e(this.b);
                            return Unit.a;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            this.c.f(this.b);
                            return Unit.a;
                        }
                        break;
                }
            }
            C3401em c3401em2 = this.c;
            XmlPullParser xmlPullParser2 = this.b;
            c3401em2.getClass();
            C3401em.w(xmlPullParser2);
            return Unit.a;
        }
        if (i != 1) {
            if (i == 2) {
                y6a.M(obj);
                return Unit.a;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        C3401em c3401em3 = this.c;
        this.a = 2;
    }
}
