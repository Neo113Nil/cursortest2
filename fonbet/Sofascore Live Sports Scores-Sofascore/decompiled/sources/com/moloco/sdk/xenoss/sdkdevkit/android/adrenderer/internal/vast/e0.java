package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.mqi;
import defpackage.pvd;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ XmlPullParser v;
    public final /* synthetic */ ArrayList w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(XmlPullParser xmlPullParser, rq3 rq3Var, ArrayList arrayList, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = xmlPullParser;
        this.w = arrayList;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ArrayList arrayList = this.w;
        XmlPullParser xmlPullParser = this.v;
        switch (i) {
            case 0:
                e0 e0Var = new e0(xmlPullParser, rq3Var, arrayList, 0);
                e0Var.u = obj;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(xmlPullParser, rq3Var, arrayList, 1);
                e0Var2.u = obj;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0(xmlPullParser, rq3Var, arrayList, 2);
                e0Var3.u = obj;
                return e0Var3;
            default:
                e0 e0Var4 = new e0(xmlPullParser, rq3Var, arrayList, 3);
                e0Var4.u = obj;
                return e0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((e0) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01be -> B:101:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01c7 -> B:101:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01d3 -> B:101:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x01dd -> B:98:0x01e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01ef -> B:101:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0205 -> B:101:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0218 -> B:101:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0270 -> B:146:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0279 -> B:146:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x0285 -> B:146:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x028f -> B:143:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005a -> B:10:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x02a1 -> B:146:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x02b7 -> B:146:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x02ca -> B:146:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:10:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006f -> B:10:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0079 -> B:7:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008b -> B:10:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a1 -> B:10:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b4 -> B:10:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x010c -> B:56:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0115 -> B:56:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0121 -> B:56:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x012b -> B:53:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x013d -> B:56:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0153 -> B:56:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0166 -> B:56:0x016b). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int depth;
        String text;
        int depth2;
        String text2;
        int depth3;
        String text3;
        int depth4;
        String text4;
        int i = this.r;
        ArrayList arrayList = this.w;
        XmlPullParser xmlPullParser = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.t;
                if (i2 == 0) {
                    y6a.M(obj);
                    s9a.t((ku3) this.u);
                    if (d1.B(xmlPullParser)) {
                        xmlPullParser.nextTag();
                    }
                    if (xmlPullParser.getEventType() != 1) {
                        if (xmlPullParser.getEventType() != 2) {
                            pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                            break;
                        } else {
                            depth = xmlPullParser.getDepth();
                            if (xmlPullParser.getDepth() < depth) {
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    depth = this.s;
                    y6a.M(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) obj;
                    if (vVar != null) {
                        arrayList.add(vVar);
                    }
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth) {
                        break;
                    } else {
                        int depth5 = xmlPullParser.getDepth() - depth;
                        if (depth5 == 0) {
                            mqi mqiVar = d1.a;
                            if (xmlPullParser.getEventType() != 2) {
                                if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                                    String text5 = xmlPullParser.getText();
                                    text5.getClass();
                                    StringsKt.l0(text5).toString();
                                } else if (xmlPullParser.getEventType() == 3) {
                                    break;
                                }
                            }
                        } else if (depth5 == 1) {
                            mqi mqiVar2 = d1.a;
                            if (xmlPullParser.getEventType() == 2 && Intrinsics.c(xmlPullParser.getName(), "MediaFile")) {
                                this.s = depth;
                                this.t = 1;
                                obj = d1.k(xmlPullParser, this);
                                if (obj == lu3Var) {
                                    break;
                                }
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) obj;
                                if (vVar2 != null) {
                                }
                            }
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth) {
                        }
                    }
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    s9a.t((ku3) this.u);
                    if (d1.B(xmlPullParser)) {
                        xmlPullParser.nextTag();
                    }
                    if (xmlPullParser.getEventType() != 1) {
                        if (xmlPullParser.getEventType() != 2) {
                            pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                            break;
                        } else {
                            depth2 = xmlPullParser.getDepth();
                            if (xmlPullParser.getDepth() < depth2) {
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    depth2 = this.s;
                    y6a.M(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 b0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0) obj;
                    if (b0Var != null) {
                        arrayList.add(b0Var);
                    }
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth2) {
                        break;
                    } else {
                        int depth6 = xmlPullParser.getDepth() - depth2;
                        if (depth6 == 0) {
                            mqi mqiVar3 = d1.a;
                            if (xmlPullParser.getEventType() != 2) {
                                if (xmlPullParser.getEventType() == 4 && (text2 = xmlPullParser.getText()) != null && !StringsKt.R(text2)) {
                                    String text6 = xmlPullParser.getText();
                                    text6.getClass();
                                    StringsKt.l0(text6).toString();
                                } else if (xmlPullParser.getEventType() == 3) {
                                    break;
                                }
                            }
                        } else if (depth6 == 1) {
                            mqi mqiVar4 = d1.a;
                            if (xmlPullParser.getEventType() == 2 && Intrinsics.c(xmlPullParser.getName(), "Tracking")) {
                                this.s = depth2;
                                this.t = 1;
                                obj = d1.q(xmlPullParser, this);
                                if (obj == lu3Var2) {
                                    break;
                                }
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 b0Var2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0) obj;
                                if (b0Var2 != null) {
                                }
                            }
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth2) {
                        }
                    }
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.t;
                if (i4 == 0) {
                    y6a.M(obj);
                    s9a.t((ku3) this.u);
                    if (d1.B(xmlPullParser)) {
                        xmlPullParser.nextTag();
                    }
                    if (xmlPullParser.getEventType() != 1) {
                        if (xmlPullParser.getEventType() != 2) {
                            pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                            break;
                        } else {
                            depth3 = xmlPullParser.getDepth();
                            if (xmlPullParser.getDepth() < depth3) {
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    depth3 = this.s;
                    y6a.M(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) obj;
                    if (iVar != null) {
                        arrayList.add(iVar);
                    }
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth3) {
                        break;
                    } else {
                        int depth7 = xmlPullParser.getDepth() - depth3;
                        if (depth7 == 0) {
                            mqi mqiVar5 = d1.a;
                            if (xmlPullParser.getEventType() != 2) {
                                if (xmlPullParser.getEventType() == 4 && (text3 = xmlPullParser.getText()) != null && !StringsKt.R(text3)) {
                                    String text7 = xmlPullParser.getText();
                                    text7.getClass();
                                    StringsKt.l0(text7).toString();
                                } else if (xmlPullParser.getEventType() == 3) {
                                    break;
                                }
                            }
                        } else if (depth7 == 1) {
                            mqi mqiVar6 = d1.a;
                            if (xmlPullParser.getEventType() == 2 && Intrinsics.c(xmlPullParser.getName(), "Companion")) {
                                this.s = depth3;
                                this.t = 1;
                                obj = d1.c(xmlPullParser, this);
                                if (obj == lu3Var3) {
                                    break;
                                }
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) obj;
                                if (iVar2 != null) {
                                }
                            }
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth3) {
                        }
                    }
                }
                break;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.t;
                if (i5 == 0) {
                    y6a.M(obj);
                    s9a.t((ku3) this.u);
                    if (d1.B(xmlPullParser)) {
                        xmlPullParser.nextTag();
                    }
                    if (xmlPullParser.getEventType() != 1) {
                        if (xmlPullParser.getEventType() != 2) {
                            pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                            break;
                        } else {
                            depth4 = xmlPullParser.getDepth();
                            if (xmlPullParser.getDepth() < depth4) {
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    depth4 = this.s;
                    y6a.M(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj;
                    if (qVar != null) {
                        arrayList.add(qVar);
                    }
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth4) {
                        break;
                    } else {
                        int depth8 = xmlPullParser.getDepth() - depth4;
                        if (depth8 == 0) {
                            mqi mqiVar7 = d1.a;
                            if (xmlPullParser.getEventType() != 2) {
                                if (xmlPullParser.getEventType() == 4 && (text4 = xmlPullParser.getText()) != null && !StringsKt.R(text4)) {
                                    String text8 = xmlPullParser.getText();
                                    text8.getClass();
                                    StringsKt.l0(text8).toString();
                                } else if (xmlPullParser.getEventType() == 3) {
                                    break;
                                }
                            }
                        } else if (depth8 == 1) {
                            mqi mqiVar8 = d1.a;
                            if (xmlPullParser.getEventType() == 2 && Intrinsics.c(xmlPullParser.getName(), "Icon")) {
                                this.s = depth4;
                                this.t = 1;
                                obj = d1.g(xmlPullParser, this);
                                if (obj == lu3Var4) {
                                    break;
                                }
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj;
                                if (qVar2 != null) {
                                }
                            }
                        }
                        xmlPullParser.next();
                        if (xmlPullParser.getDepth() < depth4) {
                        }
                    }
                }
                break;
        }
        return null;
    }
}
