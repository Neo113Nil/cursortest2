package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.ironsource.C4331u;
import defpackage.fsf;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pvd;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c0 extends hoi implements Function2 {
    public final /* synthetic */ fsf A;
    public final /* synthetic */ fsf B;
    public final /* synthetic */ fsf C;
    public final /* synthetic */ fsf D;
    public final /* synthetic */ fsf E;
    public /* synthetic */ Object r;
    public final /* synthetic */ XmlPullParser s;
    public final /* synthetic */ fsf t;
    public final /* synthetic */ fsf u;
    public final /* synthetic */ fsf v;
    public final /* synthetic */ fsf w;
    public final /* synthetic */ fsf x;
    public final /* synthetic */ fsf y;
    public final /* synthetic */ fsf z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, fsf fsfVar3, fsf fsfVar4, fsf fsfVar5, fsf fsfVar6, fsf fsfVar7, fsf fsfVar8, fsf fsfVar9, fsf fsfVar10, fsf fsfVar11, fsf fsfVar12) {
        super(2, rq3Var);
        this.s = xmlPullParser;
        this.t = fsfVar;
        this.u = fsfVar2;
        this.v = fsfVar3;
        this.w = fsfVar4;
        this.x = fsfVar5;
        this.y = fsfVar6;
        this.z = fsfVar7;
        this.A = fsfVar8;
        this.B = fsfVar9;
        this.C = fsfVar10;
        this.D = fsfVar11;
        this.E = fsfVar12;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        c0 c0Var = new c0(this.s, rq3Var, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E);
        c0Var.r = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String text;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        s9a.t((ku3) this.r);
        XmlPullParser xmlPullParser = this.s;
        if (d1.B(xmlPullParser)) {
            xmlPullParser.nextTag();
        }
        if (xmlPullParser.getEventType() == 1) {
            return Unit.a;
        }
        if (xmlPullParser.getEventType() != 2) {
            pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
            return null;
        }
        int depth = xmlPullParser.getDepth();
        while (xmlPullParser.getDepth() >= depth) {
            int depth2 = xmlPullParser.getDepth() - depth;
            if (depth2 != 0) {
                if (depth2 == 1) {
                    d1.C(xmlPullParser);
                }
            } else if (xmlPullParser.getEventType() == 2) {
                this.t.a = d1.u(xmlPullParser, "id");
                this.u.a = Boolean.valueOf(Intrinsics.c(d1.u(xmlPullParser, C4331u.g), "progressive"));
                this.v.a = d1.u(xmlPullParser, "type");
                String u = d1.u(xmlPullParser, "width");
                this.w.a = u != null ? StringsKt.toIntOrNull(u) : null;
                String u2 = d1.u(xmlPullParser, "height");
                this.x.a = u2 != null ? StringsKt.toIntOrNull(u2) : null;
                this.y.a = d1.u(xmlPullParser, "codec");
                String u3 = d1.u(xmlPullParser, "bitrate");
                this.z.a = u3 != null ? StringsKt.toIntOrNull(u3) : null;
                String u4 = d1.u(xmlPullParser, "minBitrate");
                this.A.a = u4 != null ? StringsKt.toIntOrNull(u4) : null;
                String u5 = d1.u(xmlPullParser, "maxBitrate");
                this.B.a = u5 != null ? StringsKt.toIntOrNull(u5) : null;
                String u6 = d1.u(xmlPullParser, "scalable");
                this.C.a = u6 != null ? Boolean.valueOf(Boolean.parseBoolean(u6)) : null;
                this.D.a = d1.u(xmlPullParser, "apiFramework");
            } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                String text2 = xmlPullParser.getText();
                text2.getClass();
                this.E.a = StringsKt.l0(text2).toString();
            } else if (xmlPullParser.getEventType() == 3) {
                return Unit.a;
            }
            xmlPullParser.next();
        }
        return Unit.a;
    }
}
