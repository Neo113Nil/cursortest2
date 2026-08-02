package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.ironsource.L6;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ XmlPullParser t;
    public final /* synthetic */ fsf u;
    public final /* synthetic */ fsf v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = xmlPullParser;
        this.u = fsfVar;
        this.v = fsfVar2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                g0 g0Var = new g0(this.t, rq3Var, this.u, this.v, 0);
                g0Var.s = obj;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0(this.t, rq3Var, this.u, this.v, 1);
                g0Var2.s = obj;
                return g0Var2;
            case 2:
                g0 g0Var3 = new g0(this.t, rq3Var, this.u, this.v, 2);
                g0Var3.s = obj;
                return g0Var3;
            case 3:
                g0 g0Var4 = new g0(this.t, rq3Var, this.u, this.v, 3);
                g0Var4.s = obj;
                return g0Var4;
            case 4:
                g0 g0Var5 = new g0(this.t, rq3Var, this.u, this.v, 4);
                g0Var5.s = obj;
                return g0Var5;
            default:
                g0 g0Var6 = new g0(this.t, rq3Var, this.u, this.v, 5);
                g0Var6.s = obj;
                return g0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((g0) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String text;
        String text2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar;
        String text3;
        String text4;
        String text5;
        String text6;
        int i = this.r;
        fsf fsfVar = this.v;
        fsf fsfVar2 = this.u;
        XmlPullParser xmlPullParser = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                s9a.t((ku3) this.s);
                if (d1.B(xmlPullParser)) {
                    xmlPullParser.nextTag();
                }
                if (xmlPullParser.getEventType() != 1) {
                    if (xmlPullParser.getEventType() != 2) {
                        pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                        break;
                    } else {
                        int depth = xmlPullParser.getDepth();
                        while (xmlPullParser.getDepth() >= depth) {
                            int depth2 = xmlPullParser.getDepth() - depth;
                            if (depth2 != 0) {
                                if (depth2 == 1) {
                                    d1.C(xmlPullParser);
                                }
                            } else if (xmlPullParser.getEventType() == 2) {
                                fsfVar2.a = d1.u(xmlPullParser, L6.B);
                                fsfVar.a = d1.u(xmlPullParser, InAppPurchaseMetaData.KEY_CURRENCY);
                            } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                                String text7 = xmlPullParser.getText();
                                text7.getClass();
                                StringsKt.l0(text7).toString();
                            } else if (xmlPullParser.getEventType() == 3) {
                                break;
                            }
                            xmlPullParser.next();
                        }
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                s9a.t((ku3) this.s);
                if (d1.B(xmlPullParser)) {
                    xmlPullParser.nextTag();
                }
                if (xmlPullParser.getEventType() != 1) {
                    if (xmlPullParser.getEventType() != 2) {
                        pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                        break;
                    } else {
                        int depth3 = xmlPullParser.getDepth();
                        while (xmlPullParser.getDepth() >= depth3) {
                            int depth4 = xmlPullParser.getDepth() - depth3;
                            if (depth4 != 0) {
                                if (depth4 == 1) {
                                    d1.C(xmlPullParser);
                                }
                            } else if (xmlPullParser.getEventType() == 2) {
                                String u = d1.u(xmlPullParser, "creativeType");
                                if (u != null) {
                                    if (kotlin.text.c.v(u, "image/", true)) {
                                        nVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n.a;
                                    } else if (StringsKt.J(u, "javascript", true)) {
                                        nVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n.b;
                                    }
                                    fsfVar2.a = nVar;
                                }
                                nVar = null;
                                fsfVar2.a = nVar;
                            } else if (xmlPullParser.getEventType() == 4 && (text2 = xmlPullParser.getText()) != null && !StringsKt.R(text2)) {
                                String text8 = xmlPullParser.getText();
                                text8.getClass();
                                fsfVar.a = StringsKt.l0(text8).toString();
                            } else if (xmlPullParser.getEventType() == 3) {
                                break;
                            }
                            xmlPullParser.next();
                        }
                        break;
                    }
                } else {
                    break;
                }
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                s9a.t((ku3) this.s);
                if (d1.B(xmlPullParser)) {
                    xmlPullParser.nextTag();
                }
                if (xmlPullParser.getEventType() != 1) {
                    if (xmlPullParser.getEventType() != 2) {
                        pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                        break;
                    } else {
                        int depth5 = xmlPullParser.getDepth();
                        while (xmlPullParser.getDepth() >= depth5) {
                            int depth6 = xmlPullParser.getDepth() - depth5;
                            if (depth6 != 0) {
                                if (depth6 == 1) {
                                    d1.C(xmlPullParser);
                                }
                            } else if (xmlPullParser.getEventType() == 2) {
                                fsfVar2.a = d1.u(xmlPullParser, "id");
                            } else if (xmlPullParser.getEventType() == 4 && (text3 = xmlPullParser.getText()) != null && !StringsKt.R(text3)) {
                                String text9 = xmlPullParser.getText();
                                text9.getClass();
                                fsfVar.a = StringsKt.l0(text9).toString();
                            } else if (xmlPullParser.getEventType() == 3) {
                                break;
                            }
                            xmlPullParser.next();
                        }
                        break;
                    }
                } else {
                    break;
                }
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                s9a.t((ku3) this.s);
                if (d1.B(xmlPullParser)) {
                    xmlPullParser.nextTag();
                }
                if (xmlPullParser.getEventType() != 1) {
                    if (xmlPullParser.getEventType() != 2) {
                        pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                        break;
                    } else {
                        int depth7 = xmlPullParser.getDepth();
                        while (xmlPullParser.getDepth() >= depth7) {
                            int depth8 = xmlPullParser.getDepth() - depth7;
                            if (depth8 != 0) {
                                if (depth8 == 1) {
                                    d1.C(xmlPullParser);
                                }
                            } else if (xmlPullParser.getEventType() == 2) {
                                String u2 = d1.u(xmlPullParser, "xmlEncoded");
                                fsfVar2.a = u2 != null ? Boolean.valueOf(Boolean.parseBoolean(u2)) : null;
                            } else if (xmlPullParser.getEventType() == 4 && (text4 = xmlPullParser.getText()) != null && !StringsKt.R(text4)) {
                                String text10 = xmlPullParser.getText();
                                text10.getClass();
                                fsfVar.a = StringsKt.l0(text10).toString();
                            } else if (xmlPullParser.getEventType() == 3) {
                                break;
                            }
                            xmlPullParser.next();
                        }
                        break;
                    }
                } else {
                    break;
                }
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                s9a.t((ku3) this.s);
                if (d1.B(xmlPullParser)) {
                    xmlPullParser.nextTag();
                }
                if (xmlPullParser.getEventType() != 1) {
                    if (xmlPullParser.getEventType() != 2) {
                        pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                        break;
                    } else {
                        int depth9 = xmlPullParser.getDepth();
                        while (xmlPullParser.getDepth() >= depth9) {
                            int depth10 = xmlPullParser.getDepth() - depth9;
                            if (depth10 != 0) {
                                if (depth10 == 1) {
                                    d1.C(xmlPullParser);
                                }
                            } else if (xmlPullParser.getEventType() == 2) {
                                fsfVar2.a = d1.u(xmlPullParser, "version");
                            } else if (xmlPullParser.getEventType() == 4 && (text5 = xmlPullParser.getText()) != null && !StringsKt.R(text5)) {
                                String text11 = xmlPullParser.getText();
                                text11.getClass();
                                fsfVar.a = StringsKt.l0(text11).toString();
                            } else if (xmlPullParser.getEventType() == 3) {
                                break;
                            }
                            xmlPullParser.next();
                        }
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                s9a.t((ku3) this.s);
                if (d1.B(xmlPullParser)) {
                    xmlPullParser.nextTag();
                }
                if (xmlPullParser.getEventType() != 1) {
                    if (xmlPullParser.getEventType() != 2) {
                        pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                        break;
                    } else {
                        int depth11 = xmlPullParser.getDepth();
                        while (xmlPullParser.getDepth() >= depth11) {
                            int depth12 = xmlPullParser.getDepth() - depth11;
                            if (depth12 != 0) {
                                if (depth12 == 1) {
                                    d1.C(xmlPullParser);
                                }
                            } else if (xmlPullParser.getEventType() == 2) {
                                fsfVar2.a = d1.u(xmlPullParser, "id");
                            } else if (xmlPullParser.getEventType() == 4 && (text6 = xmlPullParser.getText()) != null && !StringsKt.R(text6)) {
                                String text12 = xmlPullParser.getText();
                                text12.getClass();
                                fsfVar.a = StringsKt.l0(text12).toString();
                            } else if (xmlPullParser.getEventType() == 3) {
                                break;
                            }
                            xmlPullParser.next();
                        }
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return null;
    }
}
