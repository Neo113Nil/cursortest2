package defpackage;

import android.content.Context;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.view.branding.BrandingHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public b32(boh bohVar, vmj vmjVar, Context context, unj unjVar, Function2 function2) {
        this.a = 4;
        this.b = bohVar;
        this.d = vmjVar;
        this.c = context;
        this.e = unjVar;
        this.f = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00e8, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0154, code lost:
    
        r6 = r6 + 1;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                boh bohVar = (boh) obj3;
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    nv.o(context, 16, (BrandLocation) obj2, (String) obj5, BrandType.BANNER);
                    bea.G(context, (String) obj);
                }
                break;
            case 1:
                Context context2 = (Context) obj4;
                w22 w22Var = (w22) obj;
                long currentTimeMillis2 = System.currentTimeMillis();
                boh bohVar2 = (boh) obj3;
                if (currentTimeMillis2 - bohVar2.h() >= 200) {
                    bohVar2.i(currentTimeMillis2);
                    nv.o(context2, (Integer) obj5, (BrandLocation) obj2, w22Var.b, BrandType.STRIPE);
                    bea.G(context2, w22Var.d);
                }
                break;
            case 2:
                Context context3 = ((BrandingHeaderView) obj3).getContext();
                context3.getClass();
                nv.q(context3, (Integer) obj4, (BrandLocation) obj2, (String) obj5, (BrandType) obj);
                break;
            case 3:
                long currentTimeMillis3 = System.currentTimeMillis();
                boh bohVar3 = (boh) obj3;
                if (currentTimeMillis3 - bohVar3.h() >= 200) {
                    bohVar3.i(currentTimeMillis3);
                    i1d i1dVar = ((ce8) obj4).a;
                    int i2 = i1dVar.c;
                    if (i2 == 0) {
                        System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                    } else {
                        Object[] objArr = i1dVar.a;
                        int i3 = 0;
                        while (i3 < i2) {
                            xv4 xv4Var = (ee8) objArr[i3];
                            wtc wtcVar = ((wtc) xv4Var).a;
                            i1d i1dVar2 = null;
                            while (true) {
                                if (wtcVar != null) {
                                    if (wtcVar instanceof ne8) {
                                        if (ml4.V((ne8) wtcVar)) {
                                        }
                                    } else if ((wtcVar.c & 1024) != 0 && (wtcVar instanceof bw4)) {
                                        int i4 = 0;
                                        for (wtc wtcVar2 = ((bw4) wtcVar).p; wtcVar2 != null; wtcVar2 = wtcVar2.f) {
                                            if ((wtcVar2.c & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    wtcVar = wtcVar2;
                                                } else {
                                                    if (i1dVar2 == null) {
                                                        i1dVar2 = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar != null) {
                                                        i1dVar2.b(wtcVar);
                                                        wtcVar = null;
                                                    }
                                                    i1dVar2.b(wtcVar2);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    wtcVar = c6o.X(i1dVar2);
                                } else {
                                    wtc wtcVar3 = (wtc) xv4Var;
                                    if (!wtcVar3.a.n) {
                                        r3a.b("visitChildren called on an unattached node");
                                    }
                                    i1d i1dVar3 = new i1d(new wtc[16], 0);
                                    wtc wtcVar4 = wtcVar3.a;
                                    wtc wtcVar5 = wtcVar4.f;
                                    if (wtcVar5 == null) {
                                        c6o.x(i1dVar3, wtcVar4);
                                    } else {
                                        i1dVar3.b(wtcVar5);
                                    }
                                    while (true) {
                                        int i5 = i1dVar3.c;
                                        if (i5 != 0) {
                                            wtc wtcVar6 = (wtc) i1dVar3.r(i5 - 1);
                                            if ((wtcVar6.d & 1024) == 0) {
                                                c6o.x(i1dVar3, wtcVar6);
                                            } else {
                                                while (true) {
                                                    if (wtcVar6 == null) {
                                                        break;
                                                    }
                                                    if ((wtcVar6.c & 1024) != 0) {
                                                        i1d i1dVar4 = null;
                                                        while (wtcVar6 != null) {
                                                            if (wtcVar6 instanceof ne8) {
                                                                if (ml4.V((ne8) wtcVar6)) {
                                                                }
                                                            } else if ((wtcVar6.c & 1024) != 0 && (wtcVar6 instanceof bw4)) {
                                                                int i6 = 0;
                                                                for (wtc wtcVar7 = ((bw4) wtcVar6).p; wtcVar7 != null; wtcVar7 = wtcVar7.f) {
                                                                    if ((wtcVar7.c & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            wtcVar6 = wtcVar7;
                                                                        } else {
                                                                            if (i1dVar4 == null) {
                                                                                i1dVar4 = new i1d(new wtc[16], 0);
                                                                            }
                                                                            if (wtcVar6 != null) {
                                                                                i1dVar4.b(wtcVar6);
                                                                                wtcVar6 = null;
                                                                            }
                                                                            i1dVar4.b(wtcVar7);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            wtcVar6 = c6o.X(i1dVar4);
                                                        }
                                                    } else {
                                                        wtcVar6 = wtcVar6.f;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ((Function2) obj2).invoke(((m44) obj5).c, Integer.valueOf(((kxe) obj).a));
                }
                break;
            default:
                unj unjVar = (unj) obj5;
                Context context4 = (Context) obj4;
                long currentTimeMillis4 = System.currentTimeMillis();
                boh bohVar4 = (boh) obj3;
                if (currentTimeMillis4 - bohVar4.h() >= 200) {
                    bohVar4.i(currentTimeMillis4);
                    vmj vmjVar = (vmj) obj2;
                    if (vmjVar != null) {
                        EventActivity.h0.C(context4, vmjVar.a, unjVar.a);
                    } else {
                        ((Function2) obj).invoke(context4, Integer.valueOf(unjVar.a));
                    }
                }
                break;
        }
        return Unit.a;
    }

    public b32(boh bohVar, Context context, Integer num, BrandLocation brandLocation, w22 w22Var) {
        this.a = 1;
        this.b = bohVar;
        this.c = context;
        this.e = num;
        this.d = brandLocation;
        this.f = w22Var;
    }

    public /* synthetic */ b32(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
