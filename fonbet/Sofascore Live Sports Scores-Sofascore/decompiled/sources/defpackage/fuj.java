package defpackage;

import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import com.blaze.blazesdk.shared.results.g0;
import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fuj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ fuj(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object error;
        Object error2;
        Object error3;
        Object error4;
        Object error5;
        Object error6;
        Object error7;
        Object error8;
        Object error9;
        Object error10;
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                huj hujVar = (huj) obj;
                hujVar.getClass();
                function1.invoke(hujVar);
                break;
            case 1:
                rj0 rj0Var = (rj0) obj;
                if (!(rj0Var instanceof nj0) && !(rj0Var instanceof pj0)) {
                    if (!(rj0Var instanceof lj0)) {
                        if (!(rj0Var instanceof jj0)) {
                            zzl.b();
                            break;
                        }
                    } else if (function1 != null) {
                        function1.invoke(rj0Var);
                    }
                }
                break;
            case 2:
                Event event = (Event) obj;
                event.getClass();
                function1.invoke(event);
                break;
            case 3:
                mea meaVar = (mea) obj;
                meaVar.getClass();
                function1.invoke(meaVar);
                break;
            case 4:
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                function1.invoke(Integer.valueOf(((int) Float.intBitsToFloat((int) (dmaVar.P(0L) & 4294967295L))) + ((int) (dmaVar.e() & 4294967295L))));
                break;
            case 5:
                function1.invoke(new ugl(((Integer) obj).intValue()));
                break;
            case 6:
                function1.invoke(new qhl(((Integer) obj).intValue()));
                break;
            case 7:
                function1.invoke(new lgl((sfl) obj));
                break;
            case 8:
                function1.invoke(new ail(((Integer) obj).intValue()));
                break;
            case 9:
                function1.invoke(new vhl(((Integer) obj).intValue()));
                break;
            case 10:
                rxa rxaVar = (rxa) obj;
                rxaVar.getClass();
                function1.invoke(new yhl(rxaVar));
                break;
            case 11:
                function1.invoke(new mhl(((Integer) obj).intValue()));
                break;
            case 12:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new bil(str));
                break;
            case 13:
                function1.invoke(new ihl(((Integer) obj).intValue()));
                break;
            case 14:
                xil xilVar = (xil) obj;
                xilVar.getClass();
                function1.invoke(new zhl(xilVar));
                break;
            case 15:
                function1.invoke(new khl(((Integer) obj).intValue()));
                break;
            case 16:
                function1.invoke((BlazeResult) obj);
                break;
            case 17:
                gfm gfmVar = (gfm) obj;
                if (!(gfmVar instanceof ihm)) {
                    if (!(gfmVar instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        g0 g0Var = (g0) gfmVar;
                        error = new BlazeResult.Error(null, g0Var.b, g0Var.c, g0Var.d, null, null, 17, null);
                    }
                } else {
                    error = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error);
                break;
            case 18:
                function1.invoke((BlazeResult) obj);
                break;
            case 19:
                gfm gfmVar2 = (gfm) obj;
                if (!(gfmVar2 instanceof ihm)) {
                    if (!(gfmVar2 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        g0 g0Var2 = (g0) gfmVar2;
                        error2 = new BlazeResult.Error(null, g0Var2.b, g0Var2.c, g0Var2.d, null, null, 17, null);
                    }
                } else {
                    error2 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error2);
                break;
            case 20:
                function1.invoke((BlazeResult) obj);
                break;
            case 21:
                gfm gfmVar3 = (gfm) obj;
                if (!(gfmVar3 instanceof ihm)) {
                    if (!(gfmVar3 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        g0 g0Var3 = (g0) gfmVar3;
                        error3 = new BlazeResult.Error(null, g0Var3.b, g0Var3.c, g0Var3.d, null, null, 17, null);
                    }
                } else {
                    error3 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error3);
                break;
            case 22:
                function1.invoke((BlazeResult) obj);
                break;
            case 23:
                gfm gfmVar4 = (gfm) obj;
                if (!(gfmVar4 instanceof ihm)) {
                    if (!(gfmVar4 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        g0 g0Var4 = (g0) gfmVar4;
                        error4 = new BlazeResult.Error(null, g0Var4.b, g0Var4.c, g0Var4.d, null, null, 17, null);
                    }
                } else {
                    error4 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error4);
                break;
            case 24:
                gfm gfmVar5 = (gfm) obj;
                ErrorDomain errorDomain = ErrorDomain.UNIVERSAL_LINK;
                if (!(gfmVar5 instanceof ihm)) {
                    if (!(gfmVar5 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        if (errorDomain == null) {
                            errorDomain = ((g0) gfmVar5).b;
                        }
                        g0 g0Var5 = (g0) gfmVar5;
                        error5 = new BlazeResult.Error(null, errorDomain, g0Var5.c, g0Var5.d, null, null, 17, null);
                    }
                } else {
                    error5 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error5);
                break;
            case 25:
                gfm gfmVar6 = (gfm) obj;
                ErrorDomain errorDomain2 = ErrorDomain.UNIVERSAL_LINK;
                if (!(gfmVar6 instanceof ihm)) {
                    if (!(gfmVar6 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        if (errorDomain2 == null) {
                            errorDomain2 = ((g0) gfmVar6).b;
                        }
                        g0 g0Var6 = (g0) gfmVar6;
                        error6 = new BlazeResult.Error(null, errorDomain2, g0Var6.c, g0Var6.d, null, null, 17, null);
                    }
                } else {
                    error6 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error6);
                break;
            case 26:
                gfm gfmVar7 = (gfm) obj;
                ErrorDomain errorDomain3 = ErrorDomain.UNIVERSAL_LINK;
                if (!(gfmVar7 instanceof ihm)) {
                    if (!(gfmVar7 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        if (errorDomain3 == null) {
                            errorDomain3 = ((g0) gfmVar7).b;
                        }
                        g0 g0Var7 = (g0) gfmVar7;
                        error7 = new BlazeResult.Error(null, errorDomain3, g0Var7.c, g0Var7.d, null, null, 17, null);
                    }
                } else {
                    error7 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error7);
                break;
            case 27:
                gfm gfmVar8 = (gfm) obj;
                ErrorDomain errorDomain4 = ErrorDomain.UNIVERSAL_LINK;
                if (!(gfmVar8 instanceof ihm)) {
                    if (!(gfmVar8 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        if (errorDomain4 == null) {
                            errorDomain4 = ((g0) gfmVar8).b;
                        }
                        g0 g0Var8 = (g0) gfmVar8;
                        error8 = new BlazeResult.Error(null, errorDomain4, g0Var8.c, g0Var8.d, null, null, 17, null);
                    }
                } else {
                    error8 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error8);
                break;
            case 28:
                gfm gfmVar9 = (gfm) obj;
                rsm rsmVar = rsm.a;
                gfmVar9.getClass();
                if (!(gfmVar9 instanceof ihm)) {
                    if (!(gfmVar9 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        g0 g0Var9 = (g0) gfmVar9;
                        error9 = new BlazeResult.Error(null, g0Var9.b, g0Var9.c, g0Var9.d, null, null, 17, null);
                    }
                } else {
                    error9 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error9);
                break;
            default:
                gfm gfmVar10 = (gfm) obj;
                bxm bxmVar = bxm.a;
                gfmVar10.getClass();
                if (!(gfmVar10 instanceof ihm)) {
                    if (!(gfmVar10 instanceof g0)) {
                        zzl.b();
                        break;
                    } else {
                        g0 g0Var10 = (g0) gfmVar10;
                        error10 = new BlazeResult.Error(null, g0Var10.b, g0Var10.c, g0Var10.d, null, null, 17, null);
                    }
                } else {
                    error10 = new BlazeResult.Success(Unit.a);
                }
                function1.invoke(error10);
                break;
        }
        return null;
    }
}
