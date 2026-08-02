package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import defpackage.a70;
import defpackage.b98;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.y7k;
import defpackage.zzl;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b98 b;

    public /* synthetic */ m(b98 b98Var, int i) {
        this.a = i;
        this.b = b98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011f  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        l lVar;
        int i;
        Object obj2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l lVar2;
        int i2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0 a0Var;
        int i3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVar;
        int i4;
        boolean z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar;
        int i5;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.v vVar;
        int i6;
        int i7 = this.a;
        b98 b98Var = this.b;
        switch (i7) {
            case 0:
                if (rq3Var instanceof l) {
                    lVar = (l) rq3Var;
                    int i8 = lVar.s;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        lVar.s = i8 - Integer.MIN_VALUE;
                        Object obj3 = lVar.r;
                        lu3 lu3Var = lu3.a;
                        i = lVar.s;
                        if (i != 0) {
                            y6a.M(obj3);
                            x xVar = (x) obj;
                            obj2 = xVar instanceof w ? (w) xVar : null;
                            if (obj2 != null) {
                                lVar.s = 1;
                                if (b98Var.emit(obj2, lVar) == lu3Var) {
                                    break;
                                }
                            }
                        } else if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj3);
                        }
                        break;
                    }
                }
                lVar = new l(this, rq3Var);
                Object obj32 = lVar.r;
                lu3 lu3Var2 = lu3.a;
                i = lVar.s;
                if (i != 0) {
                }
            case 1:
                if (rq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l) {
                    lVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l) rq3Var;
                    int i9 = lVar2.s;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        lVar2.s = i9 - Integer.MIN_VALUE;
                        Object obj4 = lVar2.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = lVar2.s;
                        if (i2 != 0) {
                            y6a.M(obj4);
                            if (((Number) obj).intValue() > 0) {
                                lVar2.s = 1;
                                if (b98Var.emit(obj, lVar2) == lu3Var3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj4);
                        }
                        break;
                    }
                }
                lVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l(this, rq3Var);
                Object obj42 = lVar2.r;
                lu3 lu3Var32 = lu3.a;
                i2 = lVar2.s;
                if (i2 != 0) {
                }
            case 2:
                if (rq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0) {
                    a0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0) rq3Var;
                    int i10 = a0Var.s;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        a0Var.s = i10 - Integer.MIN_VALUE;
                        Object obj5 = a0Var.r;
                        lu3 lu3Var4 = lu3.a;
                        i3 = a0Var.s;
                        if (i3 != 0) {
                            y6a.M(obj5);
                            if (((y7k) obj).a == 0) {
                                a0Var.s = 1;
                                if (b98Var.emit(obj, a0Var) == lu3Var4) {
                                    break;
                                }
                            }
                        } else if (i3 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj5);
                        }
                        break;
                    }
                }
                a0Var = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0(this, rq3Var);
                Object obj52 = a0Var.r;
                lu3 lu3Var42 = lu3.a;
                i3 = a0Var.s;
                if (i3 != 0) {
                }
            case 3:
                if (rq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) {
                    kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) rq3Var;
                    int i11 = kVar.s;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        kVar.s = i11 - Integer.MIN_VALUE;
                        Object obj6 = kVar.r;
                        lu3 lu3Var5 = lu3.a;
                        i4 = kVar.s;
                        if (i4 != 0) {
                            y6a.M(obj6);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x xVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.x) obj;
                            if (xVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) {
                                z = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.t) xVar2).a.c;
                            } else if (xVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) {
                                z = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.v) xVar2).a.u;
                            } else if (!(xVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.u) && !(xVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.w) && xVar2 != null) {
                                zzl.b();
                                break;
                            } else {
                                z = false;
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            kVar.s = 1;
                            if (b98Var.emit(valueOf, kVar) == lu3Var5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj6);
                        }
                        break;
                    }
                }
                kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k(this, rq3Var);
                Object obj62 = kVar.r;
                lu3 lu3Var52 = lu3.a;
                i4 = kVar.s;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (rq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i) {
                    iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i) rq3Var;
                    int i12 = iVar.s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        iVar.s = i12 - Integer.MIN_VALUE;
                        Object obj7 = iVar.r;
                        lu3 lu3Var6 = lu3.a;
                        i5 = iVar.s;
                        if (i5 != 0) {
                            y6a.M(obj7);
                            int i13 = ((y7k) obj).a;
                            Object dVar = i13 == 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c.a : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d(i13);
                            iVar.s = 1;
                            if (b98Var.emit(dVar, iVar) == lu3Var6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj7);
                        }
                        break;
                    }
                }
                iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i(this, rq3Var);
                Object obj72 = iVar.r;
                lu3 lu3Var62 = lu3.a;
                i5 = iVar.s;
                if (i5 != 0) {
                }
            default:
                if (rq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.v) {
                    vVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.v) rq3Var;
                    int i14 = vVar.s;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        vVar.s = i14 - Integer.MIN_VALUE;
                        Object obj8 = vVar.r;
                        lu3 lu3Var7 = lu3.a;
                        i6 = vVar.s;
                        if (i6 != 0) {
                            y6a.M(obj8);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) obj;
                            obj2 = sVar != null ? sVar.a : null;
                            vVar.s = 1;
                            if (b98Var.emit(obj2, vVar) == lu3Var7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj8);
                        }
                        break;
                    }
                }
                vVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.v(this, rq3Var);
                Object obj82 = vVar.r;
                lu3 lu3Var72 = lu3.a;
                i6 = vVar.s;
                if (i6 != 0) {
                }
        }
        return Unit.a;
    }
}
