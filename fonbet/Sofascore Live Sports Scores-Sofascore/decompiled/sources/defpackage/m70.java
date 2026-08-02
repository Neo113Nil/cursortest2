package defpackage;

import com.sofascore.model.database.DbSavedSearches;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m70 implements b98 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public m70(b98 b98Var, CoroutineContext coroutineContext) {
        this.a = 11;
        this.b = coroutineContext;
        this.c = yfj.b(coroutineContext);
        this.d = new vki(b98Var, (rq3) null, 25);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:39)|40|41|42|43|44|(2:46|(3:48|49|50))(2:54|50)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x036d, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0464, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04df, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x055a, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05d7, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x060c, code lost:
    
        if (r6.emit((java.util.List) r12, r11) == r2) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x03e9, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0723, code lost:
    
        if (r15.emit(r1, r3) == r2) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x07a7, code lost:
    
        if (r15.emit(r1, r3) == r2) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x077e, code lost:
    
        if (r15.emit(r1, r3) == r2) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x078f, code lost:
    
        if (r0 == r2) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0807, code lost:
    
        if (((defpackage.b98) r14).emit(r0, r3) != r2) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0870, code lost:
    
        if (((defpackage.b98) r14).emit(r0, r3) != r2) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x085d, code lost:
    
        if (r0 == r2) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01fc, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ab, code lost:
    
        r8 = defpackage.w2g.b;
        r0 = new defpackage.u2g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0277, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02f1, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x05dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x036d -> B:23:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x03d2 -> B:20:0x03da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x03e3 -> B:21:0x03e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x0464 -> B:23:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x04df -> B:23:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x055a -> B:23:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x05d7 -> B:23:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x056a -> B:23:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01fc -> B:23:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0277 -> B:23:0x05db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x02f1 -> B:23:0x05db). Please report as a decompilation issue!!! */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        xf4 xf4Var;
        int i;
        x55 x55Var;
        int i2;
        i98 i98Var;
        int i3;
        fsf fsfVar;
        k98 k98Var;
        int i4;
        fsf fsfVar2;
        da8 da8Var;
        int i5;
        ga8 ga8Var;
        int i6;
        rwg rwgVar;
        Iterator it;
        Collection collection;
        b98 b98Var;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj2;
        b98 b98Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        Object obj3;
        b98 b98Var3;
        int i20;
        int i21;
        int i22;
        int i23;
        Object obj4;
        b98 b98Var4;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj5;
        b98 b98Var5;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj6;
        b98 b98Var6;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj7;
        b98 b98Var7;
        int i36;
        int i37;
        int i38;
        int i39;
        Object obj8;
        b98 b98Var8;
        int i40;
        int i41;
        int i42;
        int i43;
        Object obj9;
        b98 b98Var9;
        Object obj10;
        Iterator it2;
        int i44;
        int i45;
        int i46;
        Iterator it3;
        int i47;
        int i48;
        Object obj11;
        Iterator it4;
        IRecent iRecent;
        Object obj12 = obj;
        int i49 = this.a;
        Object obj13 = this.d;
        Object obj14 = this.c;
        Object obj15 = this.b;
        switch (i49) {
            case 0:
                axj axjVar = (axj) obj14;
                ((i8f) obj15).setValue(Boolean.valueOf(((Boolean) obj12).booleanValue() ? ((Boolean) ((Function2) ((e1d) obj13).getValue()).invoke(axjVar.a.w(), ((eoh) axjVar.d).getValue())).booleanValue() : false));
                break;
            case 1:
                if (rq3Var instanceof xf4) {
                    xf4Var = (xf4) rq3Var;
                    int i50 = xf4Var.s;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        xf4Var.s = i50 - Integer.MIN_VALUE;
                        Object obj16 = xf4Var.r;
                        lu3 lu3Var = lu3.a;
                        i = xf4Var.s;
                        if (i != 0) {
                            y6a.M(obj16);
                            b98 b98Var10 = (b98) obj15;
                            Object c = ((p0d) obj12).c((e5f) obj14);
                            if (c != null) {
                                obj13 = c;
                            }
                            xf4Var.s = 1;
                            if (b98Var10.emit(obj13, xf4Var) == lu3Var) {
                                break;
                            }
                        } else if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj16);
                        }
                        break;
                    }
                }
                xf4Var = new xf4(this, rq3Var);
                Object obj162 = xf4Var.r;
                lu3 lu3Var2 = lu3.a;
                i = xf4Var.s;
                if (i != 0) {
                }
            case 2:
                fsf fsfVar3 = (fsf) obj14;
                y55 y55Var = (y55) obj15;
                if (rq3Var instanceof x55) {
                    x55Var = (x55) rq3Var;
                    int i51 = x55Var.t;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        x55Var.t = i51 - Integer.MIN_VALUE;
                        Object obj17 = x55Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = x55Var.t;
                        if (i2 != 0) {
                            y6a.M(obj17);
                            Object invoke = y55Var.b.invoke(obj12);
                            Object obj18 = fsfVar3.a;
                            if (obj18 == rid.a || !((Boolean) y55Var.c.invoke(obj18, invoke)).booleanValue()) {
                                fsfVar3.a = invoke;
                                x55Var.t = 1;
                                if (((b98) obj13).emit(obj12, x55Var) == lu3Var3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj17);
                        }
                        break;
                    }
                }
                x55Var = new x55(this, rq3Var);
                Object obj172 = x55Var.r;
                lu3 lu3Var32 = lu3.a;
                i2 = x55Var.t;
                if (i2 != 0) {
                }
                break;
            case 3:
                i7a i7aVar = (i7a) obj12;
                ArrayList arrayList = (ArrayList) obj15;
                if (i7aVar instanceof sf9) {
                    arrayList.add(i7aVar);
                } else if (i7aVar instanceof tf9) {
                    arrayList.remove(((tf9) i7aVar).a);
                } else if (i7aVar instanceof rd8) {
                    arrayList.add(i7aVar);
                } else if (i7aVar instanceof sd8) {
                    arrayList.remove(((sd8) i7aVar).a);
                } else if (i7aVar instanceof l6f) {
                    arrayList.add(i7aVar);
                } else if (i7aVar instanceof m6f) {
                    arrayList.remove(((m6f) i7aVar).a);
                } else if (i7aVar instanceof k6f) {
                    arrayList.remove(((k6f) i7aVar).a);
                }
                xw3.L((ku3) obj14, null, null, new yp7((l88) obj13, (i7a) CollectionsKt.j0(arrayList), (rq3) null, 10), 3);
                break;
            case 4:
                fsf fsfVar4 = (fsf) obj15;
                if (rq3Var instanceof i98) {
                    i98Var = (i98) rq3Var;
                    int i52 = i98Var.u;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        i98Var.u = i52 - Integer.MIN_VALUE;
                        Object obj19 = i98Var.s;
                        lu3 lu3Var4 = lu3.a;
                        i3 = i98Var.u;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    y6a.M(obj19);
                                    break;
                                } else {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                fsfVar = i98Var.r;
                                y6a.M(obj19);
                            }
                        } else {
                            y6a.M(obj19);
                            Object obj20 = fsfVar4.a;
                            if (obj20 != k53.i) {
                                i98Var.r = fsfVar4;
                                i98Var.u = 1;
                                obj19 = ((ct8) obj14).invoke(obj20, obj12, i98Var);
                                break;
                            } else {
                                obj19 = obj12;
                            }
                            fsfVar = fsfVar4;
                        }
                        fsfVar.a = obj19;
                        Object obj21 = fsfVar4.a;
                        i98Var.r = null;
                        i98Var.u = 2;
                        break;
                    }
                }
                i98Var = new i98(this, rq3Var);
                Object obj192 = i98Var.s;
                lu3 lu3Var42 = lu3.a;
                i3 = i98Var.u;
                if (i3 == 0) {
                }
                fsfVar.a = obj192;
                Object obj212 = fsfVar4.a;
                i98Var.r = null;
                i98Var.u = 2;
            case 5:
                fsf fsfVar5 = (fsf) obj15;
                if (rq3Var instanceof k98) {
                    k98Var = (k98) rq3Var;
                    int i53 = k98Var.u;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        k98Var.u = i53 - Integer.MIN_VALUE;
                        Object obj22 = k98Var.s;
                        lu3 lu3Var5 = lu3.a;
                        i4 = k98Var.u;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    y6a.M(obj22);
                                    break;
                                } else {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                fsfVar2 = k98Var.r;
                                y6a.M(obj22);
                            }
                        } else {
                            y6a.M(obj22);
                            Object obj23 = fsfVar5.a;
                            k98Var.r = fsfVar5;
                            k98Var.u = 1;
                            obj22 = ((g61) obj14).invoke(obj23, obj12, k98Var);
                            if (obj22 != lu3Var5) {
                                fsfVar2 = fsfVar5;
                            }
                            break;
                        }
                        fsfVar2.a = obj22;
                        Object obj24 = fsfVar5.a;
                        k98Var.r = null;
                        k98Var.u = 2;
                        break;
                    }
                }
                k98Var = new k98(this, rq3Var);
                Object obj222 = k98Var.s;
                lu3 lu3Var52 = lu3.a;
                i4 = k98Var.u;
                if (i4 == 0) {
                }
                fsfVar2.a = obj222;
                Object obj242 = fsfVar5.a;
                k98Var.r = null;
                k98Var.u = 2;
            case 6:
                b98 b98Var11 = (b98) obj14;
                asf asfVar = (asf) obj15;
                if (rq3Var instanceof da8) {
                    da8Var = (da8) rq3Var;
                    int i54 = da8Var.u;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        da8Var.u = i54 - Integer.MIN_VALUE;
                        Object obj25 = da8Var.s;
                        lu3 lu3Var6 = lu3.a;
                        i5 = da8Var.u;
                        if (i5 != 0) {
                            y6a.M(obj25);
                            if (asfVar.a) {
                                da8Var.r = null;
                                da8Var.u = 1;
                                break;
                            } else {
                                da8Var.r = obj12;
                                da8Var.u = 2;
                                obj25 = ((Function2) obj13).invoke(obj12, da8Var);
                                break;
                            }
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        a70.r("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    }
                                } else {
                                    obj12 = da8Var.r;
                                    y6a.M(obj25);
                                    if (!((Boolean) obj25).booleanValue()) {
                                        asfVar.a = true;
                                        da8Var.r = null;
                                        da8Var.u = 3;
                                        break;
                                    }
                                    break;
                                }
                            }
                            y6a.M(obj25);
                        }
                        break;
                    }
                }
                da8Var = new da8(this, rq3Var);
                Object obj252 = da8Var.s;
                lu3 lu3Var62 = lu3.a;
                i5 = da8Var.u;
                if (i5 != 0) {
                }
            case 7:
                if (rq3Var instanceof ga8) {
                    ga8Var = (ga8) rq3Var;
                    int i55 = ga8Var.t;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        ga8Var.t = i55 - Integer.MIN_VALUE;
                        Object obj26 = ga8Var.r;
                        lu3 lu3Var7 = lu3.a;
                        i6 = ga8Var.t;
                        if (i6 != 0) {
                            y6a.M(obj26);
                            dsf dsfVar = (dsf) obj15;
                            int i56 = dsfVar.a + 1;
                            dsfVar.a = i56;
                            b98 b98Var12 = (b98) obj14;
                            if (i56 < 1) {
                                ga8Var.t = 1;
                                break;
                            } else {
                                ga8Var.t = 2;
                                pd0.o(b98Var12, obj12, obj13, ga8Var);
                            }
                            break;
                        } else if (i6 != 1 && i6 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj26);
                        }
                        break;
                    }
                }
                ga8Var = new ga8(this, rq3Var);
                Object obj262 = ga8Var.r;
                lu3 lu3Var72 = lu3.a;
                i6 = ga8Var.t;
                if (i6 != 0) {
                }
                break;
            case 8:
                fsf fsfVar6 = (fsf) obj15;
                f1d f1dVar = (f1d) fsfVar6.a;
                if (f1dVar != null) {
                    ((fdi) f1dVar).l(obj12);
                } else {
                    fdi a = gdi.a(obj12);
                    p2g p2gVar = w2g.b;
                    ((qa3) obj13).V(new w2g(new jof(a, bea.x(((ku3) obj14).getCoroutineContext()))));
                    fsfVar6.a = a;
                }
                break;
            case 9:
                ((Boolean) obj12).getClass();
                e70 e70Var = new e70((trg) ((eoh) ((axj) obj14).d).getValue());
                koh kohVar = (koh) obj15;
                for (e70 e70Var2 : CollectionsKt.S0(kohVar.c)) {
                    if (!Intrinsics.c(e70Var2, e70Var)) {
                        kohVar.remove(e70Var2);
                    }
                }
                g0d g0dVar = (g0d) obj13;
                long[] jArr = g0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i57 = 0;
                    while (true) {
                        long j = jArr[i57];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i58 = 8 - ((~(i57 - length)) >>> 31);
                            for (int i59 = 0; i59 < i58; i59++) {
                                if ((255 & j) < 128) {
                                    int i60 = (i57 << 3) + i59;
                                    Object obj27 = g0dVar.b[i60];
                                    float f = g0dVar.c[i60];
                                    if (!Intrinsics.c((e70) obj27, e70Var)) {
                                        g0dVar.e(i60);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i58 != 8) {
                            }
                        }
                        if (i57 != length) {
                            i57++;
                        }
                    }
                }
                break;
            case 10:
                String str = (String) obj13;
                uwg uwgVar = (uwg) obj14;
                yea yeaVar = uwgVar.c;
                if (rq3Var instanceof rwg) {
                    rwgVar = (rwg) rq3Var;
                    int i61 = rwgVar.s;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        rwgVar.s = i61 - Integer.MIN_VALUE;
                        Object obj28 = rwgVar.r;
                        lu3 lu3Var8 = lu3.a;
                        switch (rwgVar.s) {
                            case 0:
                                y6a.M(obj28);
                                List B0 = CollectionsKt.B0((List) obj12);
                                ArrayList arrayList2 = new ArrayList();
                                it = B0.iterator();
                                collection = arrayList2;
                                b98Var = (b98) obj15;
                                i7 = 0;
                                i8 = 0;
                                i9 = 0;
                                i10 = 0;
                                i11 = 0;
                                if (!it.hasNext()) {
                                    DbSavedSearches dbSavedSearches = (DbSavedSearches) it.next();
                                    String entity = dbSavedSearches.getEntity();
                                    switch (entity.hashCode()) {
                                        case -1931148883:
                                            it2 = it;
                                            if (entity.equals(SearchResponseKt.UNIQUE_STAGE_ENTITY)) {
                                                try {
                                                } catch (Throwable th) {
                                                    p2g p2gVar2 = w2g.b;
                                                    obj10 = new u2g(th);
                                                }
                                                p2g p2gVar3 = w2g.b;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(UniqueStage.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) != null) {
                                                    int id = dbSavedSearches.getId();
                                                    String entity2 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it2;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 7;
                                                    if (uwgVar.b(id, entity2, rwgVar) != lu3Var8) {
                                                        int i62 = i9;
                                                        i38 = i8;
                                                        i37 = i62;
                                                        it = it2;
                                                        b98Var8 = b98Var;
                                                        i39 = i7;
                                                        i36 = i11;
                                                        obj8 = obj10;
                                                        int i63 = i38;
                                                        i9 = i37;
                                                        i8 = i63;
                                                        obj10 = obj8;
                                                        i11 = i36;
                                                        i7 = i39;
                                                        b98Var = b98Var8;
                                                        p2g p2gVar4 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it2;
                                                    p2g p2gVar42 = w2g.b;
                                                }
                                            }
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null || (str != null && !Intrinsics.c(((IRecent) obj10).getSportSlug(), str))) {
                                                obj10 = null;
                                            }
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                                collection.add(iRecent);
                                            }
                                            if (!it.hasNext()) {
                                                rwgVar.t = null;
                                                rwgVar.w = null;
                                                rwgVar.x = null;
                                                rwgVar.y = null;
                                                rwgVar.u = i10;
                                                rwgVar.s = 10;
                                                break;
                                            }
                                            break;
                                        case -985752863:
                                            it2 = it;
                                            if (entity.equals(SearchResponseKt.PLAYER_ENTITY)) {
                                                try {
                                                } catch (Throwable th2) {
                                                    p2g p2gVar5 = w2g.b;
                                                    obj10 = new u2g(th2);
                                                }
                                                p2g p2gVar6 = w2g.b;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(Player.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) != null) {
                                                    int id2 = dbSavedSearches.getId();
                                                    String entity3 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it2;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 2;
                                                    if (uwgVar.b(id2, entity3, rwgVar) != lu3Var8) {
                                                        int i64 = i9;
                                                        i18 = i8;
                                                        i17 = i64;
                                                        it = it2;
                                                        b98Var3 = b98Var;
                                                        i19 = i7;
                                                        i16 = i11;
                                                        obj3 = obj10;
                                                        int i65 = i18;
                                                        i9 = i17;
                                                        i8 = i65;
                                                        obj10 = obj3;
                                                        i11 = i16;
                                                        i7 = i19;
                                                        b98Var = b98Var3;
                                                        p2g p2gVar7 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it2;
                                                    p2g p2gVar72 = w2g.b;
                                                }
                                            }
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null) {
                                                break;
                                            }
                                            obj10 = null;
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                            }
                                            if (!it.hasNext()) {
                                            }
                                            break;
                                        case 3555933:
                                            it2 = it;
                                            if (entity.equals("team")) {
                                                try {
                                                } catch (Throwable th3) {
                                                    p2g p2gVar8 = w2g.b;
                                                    obj10 = new u2g(th3);
                                                }
                                                p2g p2gVar9 = w2g.b;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(Team.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) != null) {
                                                    int id3 = dbSavedSearches.getId();
                                                    String entity4 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it2;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 1;
                                                    if (uwgVar.b(id3, entity4, rwgVar) != lu3Var8) {
                                                        int i66 = i9;
                                                        i14 = i8;
                                                        i13 = i66;
                                                        it = it2;
                                                        b98Var2 = b98Var;
                                                        i15 = i7;
                                                        i12 = i11;
                                                        obj2 = obj10;
                                                        int i67 = i14;
                                                        i9 = i13;
                                                        i8 = i67;
                                                        obj10 = obj2;
                                                        i11 = i12;
                                                        i7 = i15;
                                                        b98Var = b98Var2;
                                                        p2g p2gVar10 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it2;
                                                    p2g p2gVar102 = w2g.b;
                                                }
                                            }
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null) {
                                            }
                                            obj10 = null;
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                            }
                                            if (!it.hasNext()) {
                                            }
                                            break;
                                        case 96891546:
                                            it2 = it;
                                            if (entity.equals("event")) {
                                                try {
                                                } catch (Throwable th4) {
                                                    p2g p2gVar11 = w2g.b;
                                                    obj10 = new u2g(th4);
                                                }
                                                p2g p2gVar12 = w2g.b;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(Event.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) != null) {
                                                    int id4 = dbSavedSearches.getId();
                                                    String entity5 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it2;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 6;
                                                    if (uwgVar.b(id4, entity5, rwgVar) != lu3Var8) {
                                                        int i68 = i9;
                                                        i34 = i8;
                                                        i33 = i68;
                                                        it = it2;
                                                        b98Var7 = b98Var;
                                                        i35 = i7;
                                                        i32 = i11;
                                                        obj7 = obj10;
                                                        int i69 = i34;
                                                        i9 = i33;
                                                        i8 = i69;
                                                        obj10 = obj7;
                                                        i11 = i32;
                                                        i7 = i35;
                                                        b98Var = b98Var7;
                                                        p2g p2gVar13 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it2;
                                                    p2g p2gVar132 = w2g.b;
                                                }
                                            }
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null) {
                                            }
                                            obj10 = null;
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                            }
                                            if (!it.hasNext()) {
                                            }
                                            break;
                                        case 109651828:
                                            it2 = it;
                                            if (entity.equals(SearchResponseKt.SPORT_ENTITY)) {
                                                try {
                                                } catch (Throwable th5) {
                                                    p2g p2gVar14 = w2g.b;
                                                    obj10 = new u2g(th5);
                                                }
                                                p2g p2gVar15 = w2g.b;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(Sport.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) != null) {
                                                    int id5 = dbSavedSearches.getId();
                                                    String entity6 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it2;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 9;
                                                    if (uwgVar.b(id5, entity6, rwgVar) != lu3Var8) {
                                                        i44 = i7;
                                                        i45 = i10;
                                                        i46 = i11;
                                                        it3 = it2;
                                                        i47 = i8;
                                                        i48 = i9;
                                                        obj11 = obj10;
                                                        Iterator it5 = it3;
                                                        i11 = i46;
                                                        i7 = i44;
                                                        it = it5;
                                                        obj10 = obj11;
                                                        i9 = i48;
                                                        i8 = i47;
                                                        i10 = i45;
                                                        p2g p2gVar16 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it2;
                                                    p2g p2gVar162 = w2g.b;
                                                }
                                            }
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null) {
                                            }
                                            obj10 = null;
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                            }
                                            if (!it.hasNext()) {
                                            }
                                            break;
                                        case 109757182:
                                            it2 = it;
                                            if (entity.equals("stage")) {
                                                try {
                                                } catch (Throwable th6) {
                                                    p2g p2gVar17 = w2g.b;
                                                    obj10 = new u2g(th6);
                                                }
                                                p2g p2gVar18 = w2g.b;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(Stage.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) != null) {
                                                    int id6 = dbSavedSearches.getId();
                                                    String entity7 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it2;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 8;
                                                    if (uwgVar.b(id6, entity7, rwgVar) != lu3Var8) {
                                                        int i70 = i9;
                                                        i42 = i8;
                                                        i41 = i70;
                                                        it = it2;
                                                        b98Var9 = b98Var;
                                                        i43 = i7;
                                                        i40 = i11;
                                                        obj9 = obj10;
                                                        int i71 = i42;
                                                        i9 = i41;
                                                        i8 = i71;
                                                        obj10 = obj9;
                                                        i11 = i40;
                                                        i7 = i43;
                                                        b98Var = b98Var9;
                                                        p2g p2gVar19 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it2;
                                                    p2g p2gVar192 = w2g.b;
                                                }
                                            }
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null) {
                                            }
                                            obj10 = null;
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                            }
                                            if (!it.hasNext()) {
                                            }
                                            break;
                                        case 496955546:
                                            it2 = it;
                                            if (entity.equals(SearchResponseKt.LEAGUE_ENTITY)) {
                                                try {
                                                } catch (Throwable th7) {
                                                    p2g p2gVar20 = w2g.b;
                                                    obj10 = new u2g(th7);
                                                }
                                                p2g p2gVar21 = w2g.b;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(UniqueTournament.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) != null) {
                                                    int id7 = dbSavedSearches.getId();
                                                    String entity8 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it2;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 3;
                                                    if (uwgVar.b(id7, entity8, rwgVar) != lu3Var8) {
                                                        int i72 = i9;
                                                        i22 = i8;
                                                        i21 = i72;
                                                        it = it2;
                                                        b98Var4 = b98Var;
                                                        i23 = i7;
                                                        i20 = i11;
                                                        obj4 = obj10;
                                                        int i73 = i22;
                                                        i9 = i21;
                                                        i8 = i73;
                                                        obj10 = obj4;
                                                        i11 = i20;
                                                        i7 = i23;
                                                        b98Var = b98Var4;
                                                        p2g p2gVar22 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it2;
                                                    p2g p2gVar222 = w2g.b;
                                                }
                                            }
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null) {
                                            }
                                            obj10 = null;
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                            }
                                            if (!it.hasNext()) {
                                            }
                                            break;
                                        case 835260333:
                                            it2 = it;
                                            if (entity.equals(SearchResponseKt.MANAGER_ENTITY)) {
                                                try {
                                                } catch (Throwable th8) {
                                                    p2g p2gVar23 = w2g.b;
                                                    obj10 = new u2g(th8);
                                                }
                                                p2g p2gVar24 = w2g.b;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(Manager.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) != null) {
                                                    int id8 = dbSavedSearches.getId();
                                                    String entity9 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it2;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 4;
                                                    if (uwgVar.b(id8, entity9, rwgVar) != lu3Var8) {
                                                        int i74 = i9;
                                                        i26 = i8;
                                                        i25 = i74;
                                                        it = it2;
                                                        b98Var5 = b98Var;
                                                        i27 = i7;
                                                        i24 = i11;
                                                        obj5 = obj10;
                                                        int i75 = i26;
                                                        i9 = i25;
                                                        i8 = i75;
                                                        obj10 = obj5;
                                                        i11 = i24;
                                                        i7 = i27;
                                                        b98Var = b98Var5;
                                                        p2g p2gVar25 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it2;
                                                    p2g p2gVar252 = w2g.b;
                                                }
                                            }
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null) {
                                            }
                                            obj10 = null;
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                            }
                                            if (!it.hasNext()) {
                                            }
                                            break;
                                        case 1085069600:
                                            if (entity.equals(SearchResponseKt.REFEREE_ENTITY)) {
                                                try {
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    it4 = it;
                                                    break;
                                                }
                                                p2g p2gVar26 = w2g.b;
                                                it4 = it;
                                                obj10 = yeaVar.b(sha.Q(yeaVar.b, duf.b(Referee.class)), dbSavedSearches.getJson());
                                                if (w2g.a(obj10) == null) {
                                                    int id9 = dbSavedSearches.getId();
                                                    String entity10 = dbSavedSearches.getEntity();
                                                    rwgVar.t = b98Var;
                                                    rwgVar.w = collection;
                                                    rwgVar.x = it4;
                                                    rwgVar.y = obj10;
                                                    rwgVar.u = i10;
                                                    rwgVar.z = i7;
                                                    rwgVar.A = i8;
                                                    rwgVar.B = i9;
                                                    rwgVar.C = i11;
                                                    rwgVar.s = 5;
                                                    if (uwgVar.b(id9, entity10, rwgVar) != lu3Var8) {
                                                        int i76 = i9;
                                                        i30 = i8;
                                                        i29 = i76;
                                                        it = it4;
                                                        b98Var6 = b98Var;
                                                        i31 = i7;
                                                        i28 = i11;
                                                        obj6 = obj10;
                                                        int i77 = i30;
                                                        i9 = i29;
                                                        i8 = i77;
                                                        obj10 = obj6;
                                                        i11 = i28;
                                                        i7 = i31;
                                                        b98Var = b98Var6;
                                                        p2g p2gVar27 = w2g.b;
                                                        break;
                                                    }
                                                } else {
                                                    it = it4;
                                                    p2g p2gVar272 = w2g.b;
                                                }
                                            }
                                            break;
                                        default:
                                            it2 = it;
                                            it = it2;
                                            obj10 = null;
                                            if (obj10 != null) {
                                            }
                                            obj10 = null;
                                            iRecent = (IRecent) obj10;
                                            if (iRecent != null) {
                                            }
                                            if (!it.hasNext()) {
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 1:
                                i12 = rwgVar.C;
                                i13 = rwgVar.B;
                                i14 = rwgVar.A;
                                i15 = rwgVar.z;
                                i10 = rwgVar.u;
                                obj2 = rwgVar.y;
                                it = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var2 = rwgVar.t;
                                y6a.M(obj28);
                                int i672 = i14;
                                i9 = i13;
                                i8 = i672;
                                obj10 = obj2;
                                i11 = i12;
                                i7 = i15;
                                b98Var = b98Var2;
                                p2g p2gVar1022 = w2g.b;
                                break;
                            case 2:
                                i16 = rwgVar.C;
                                i17 = rwgVar.B;
                                i18 = rwgVar.A;
                                i19 = rwgVar.z;
                                i10 = rwgVar.u;
                                obj3 = rwgVar.y;
                                it = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var3 = rwgVar.t;
                                y6a.M(obj28);
                                int i652 = i18;
                                i9 = i17;
                                i8 = i652;
                                obj10 = obj3;
                                i11 = i16;
                                i7 = i19;
                                b98Var = b98Var3;
                                p2g p2gVar722 = w2g.b;
                                break;
                            case 3:
                                i20 = rwgVar.C;
                                i21 = rwgVar.B;
                                i22 = rwgVar.A;
                                i23 = rwgVar.z;
                                i10 = rwgVar.u;
                                obj4 = rwgVar.y;
                                it = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var4 = rwgVar.t;
                                y6a.M(obj28);
                                int i732 = i22;
                                i9 = i21;
                                i8 = i732;
                                obj10 = obj4;
                                i11 = i20;
                                i7 = i23;
                                b98Var = b98Var4;
                                p2g p2gVar2222 = w2g.b;
                                break;
                            case 4:
                                i24 = rwgVar.C;
                                i25 = rwgVar.B;
                                i26 = rwgVar.A;
                                i27 = rwgVar.z;
                                i10 = rwgVar.u;
                                obj5 = rwgVar.y;
                                it = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var5 = rwgVar.t;
                                y6a.M(obj28);
                                int i752 = i26;
                                i9 = i25;
                                i8 = i752;
                                obj10 = obj5;
                                i11 = i24;
                                i7 = i27;
                                b98Var = b98Var5;
                                p2g p2gVar2522 = w2g.b;
                                break;
                            case 5:
                                i28 = rwgVar.C;
                                i29 = rwgVar.B;
                                i30 = rwgVar.A;
                                i31 = rwgVar.z;
                                i10 = rwgVar.u;
                                obj6 = rwgVar.y;
                                it = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var6 = rwgVar.t;
                                y6a.M(obj28);
                                int i772 = i30;
                                i9 = i29;
                                i8 = i772;
                                obj10 = obj6;
                                i11 = i28;
                                i7 = i31;
                                b98Var = b98Var6;
                                p2g p2gVar2722 = w2g.b;
                                break;
                            case 6:
                                i32 = rwgVar.C;
                                i33 = rwgVar.B;
                                i34 = rwgVar.A;
                                i35 = rwgVar.z;
                                i10 = rwgVar.u;
                                obj7 = rwgVar.y;
                                it = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var7 = rwgVar.t;
                                y6a.M(obj28);
                                int i692 = i34;
                                i9 = i33;
                                i8 = i692;
                                obj10 = obj7;
                                i11 = i32;
                                i7 = i35;
                                b98Var = b98Var7;
                                p2g p2gVar1322 = w2g.b;
                                break;
                            case 7:
                                i36 = rwgVar.C;
                                i37 = rwgVar.B;
                                i38 = rwgVar.A;
                                i39 = rwgVar.z;
                                i10 = rwgVar.u;
                                obj8 = rwgVar.y;
                                it = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var8 = rwgVar.t;
                                y6a.M(obj28);
                                int i632 = i38;
                                i9 = i37;
                                i8 = i632;
                                obj10 = obj8;
                                i11 = i36;
                                i7 = i39;
                                b98Var = b98Var8;
                                p2g p2gVar422 = w2g.b;
                                break;
                            case 8:
                                i40 = rwgVar.C;
                                i41 = rwgVar.B;
                                i42 = rwgVar.A;
                                i43 = rwgVar.z;
                                i10 = rwgVar.u;
                                obj9 = rwgVar.y;
                                it = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var9 = rwgVar.t;
                                y6a.M(obj28);
                                int i712 = i42;
                                i9 = i41;
                                i8 = i712;
                                obj10 = obj9;
                                i11 = i40;
                                i7 = i43;
                                b98Var = b98Var9;
                                p2g p2gVar1922 = w2g.b;
                                break;
                            case 9:
                                i46 = rwgVar.C;
                                i48 = rwgVar.B;
                                i47 = rwgVar.A;
                                i44 = rwgVar.z;
                                i45 = rwgVar.u;
                                obj11 = rwgVar.y;
                                it3 = rwgVar.x;
                                collection = rwgVar.w;
                                b98Var = rwgVar.t;
                                y6a.M(obj28);
                                Iterator it52 = it3;
                                i11 = i46;
                                i7 = i44;
                                it = it52;
                                obj10 = obj11;
                                i9 = i48;
                                i8 = i47;
                                i10 = i45;
                                p2g p2gVar1622 = w2g.b;
                                break;
                            case 10:
                                y6a.M(obj28);
                                break;
                            default:
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                        }
                    }
                }
                rwgVar = new rwg(this, rq3Var);
                Object obj282 = rwgVar.r;
                lu3 lu3Var82 = lu3.a;
                switch (rwgVar.s) {
                }
            default:
                Object B02 = td4.B0((CoroutineContext) obj15, obj12, obj14, (vki) obj13, rq3Var);
                if (B02 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public m70(axj axjVar, koh kohVar, g0d g0dVar) {
        this.a = 9;
        this.c = axjVar;
        this.b = kohVar;
        this.d = g0dVar;
    }

    public /* synthetic */ m70(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
