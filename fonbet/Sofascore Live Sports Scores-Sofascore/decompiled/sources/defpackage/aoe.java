package defpackage;

import com.sofascore.model.mvvm.model.DbMyPlayer;
import com.sofascore.model.mvvm.model.Player;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class aoe {
    public final k6g a;
    public final fp4 e;
    public final sz8 d = new sz8(16);
    public final s82 b = new s82(14);
    public final zne c = new zne(this, 0);

    public aoe(k6g k6gVar) {
        this.a = k6gVar;
        int i = 1;
        this.e = new fp4(11, new re9(this, i), new zne(this, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (defpackage.gz8.U(r0, r7.a, false, true, new defpackage.xne(r7, r8, r5 == true ? 1 : 0)) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(aoe aoeVar, Player player, boolean z, sq3 sq3Var) {
        une uneVar;
        int i;
        if (sq3Var instanceof une) {
            uneVar = (une) sq3Var;
            int i2 = uneVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uneVar.w = i2 - Integer.MIN_VALUE;
                Object obj = uneVar.u;
                lu3 lu3Var = lu3.a;
                i = uneVar.w;
                Object[] objArr = 0;
                if (i != 0) {
                    y6a.M(obj);
                    uneVar.r = aoeVar;
                    uneVar.s = player;
                    uneVar.t = z;
                    uneVar.w = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Boolean.valueOf(((Number) obj).longValue() != -1);
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = uneVar.t;
                    player = uneVar.s;
                    aoeVar = uneVar.r;
                    y6a.M(obj);
                }
                DbMyPlayer dbMyPlayer = new DbMyPlayer(player.getId(), z);
                uneVar.r = null;
                uneVar.s = null;
                uneVar.t = z;
                uneVar.w = 2;
                obj = gz8.U(uneVar, aoeVar.a, false, true, new ord(13, aoeVar, dbMyPlayer));
            }
        }
        uneVar = new une(aoeVar, sq3Var);
        Object obj2 = uneVar.u;
        lu3 lu3Var2 = lu3.a;
        i = uneVar.w;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        DbMyPlayer dbMyPlayer2 = new DbMyPlayer(player.getId(), z);
        uneVar.r = null;
        uneVar.s = null;
        uneVar.t = z;
        uneVar.w = 2;
        obj2 = gz8.U(uneVar, aoeVar.a, false, true, new ord(13, aoeVar, dbMyPlayer2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if (defpackage.gz8.U(r0, r2, false, true, new defpackage.yne(r9, r11, r6)) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[LOOP:1: B:26:0x0082->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object b(final aoe aoeVar, ArrayList arrayList, sq3 sq3Var) {
        vne vneVar;
        int i;
        if (sq3Var instanceof vne) {
            vneVar = (vne) sq3Var;
            int i2 = vneVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vneVar.v = i2 - Integer.MIN_VALUE;
                Object obj = vneVar.t;
                lu3 lu3Var = lu3.a;
                i = vneVar.v;
                boolean z = false;
                Object[] objArr = 0;
                final int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    final ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Player) ((Pair) it.next()).a);
                    }
                    vneVar.r = aoeVar;
                    vneVar.s = arrayList;
                    vneVar.v = 1;
                    k6g k6gVar = aoeVar.a;
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        long[] jArr = (long[]) obj;
                        int length = jArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            if (jArr[i4] != -1) {
                                z = true;
                                break;
                            }
                            i4++;
                        }
                        return Boolean.valueOf(z);
                    }
                    arrayList = vneVar.s;
                    aoeVar = vneVar.r;
                    y6a.M(obj);
                }
                final ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
                for (Pair pair : arrayList) {
                    arrayList3.add(new DbMyPlayer(((Player) pair.a).getId(), ((Boolean) pair.b).booleanValue()));
                }
                vneVar.r = null;
                vneVar.s = null;
                vneVar.v = 2;
                obj = gz8.U(vneVar, aoeVar.a, false, true, new Function1(aoeVar) { // from class: yne
                    public final /* synthetic */ aoe b;

                    {
                        this.b = aoeVar;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i5 = i3;
                        ArrayList arrayList4 = arrayList3;
                        aoe aoeVar2 = this.b;
                        glg glgVar = (glg) obj2;
                        switch (i5) {
                            case 0:
                                glgVar.getClass();
                                return aoeVar2.e.M(glgVar, arrayList4);
                            default:
                                glgVar.getClass();
                                return aoeVar2.b.c0(glgVar, arrayList4);
                        }
                    }
                });
            }
        }
        vneVar = new vne(aoeVar, sq3Var);
        Object obj2 = vneVar.t;
        lu3 lu3Var2 = lu3.a;
        i = vneVar.v;
        boolean z2 = false;
        Object[] objArr3 = 0;
        final int i32 = 1;
        if (i != 0) {
        }
        final ArrayList arrayList32 = new ArrayList(k13.r(arrayList, 10));
        while (r10.hasNext()) {
        }
        vneVar.r = null;
        vneVar.s = null;
        vneVar.v = 2;
        obj2 = gz8.U(vneVar, aoeVar.a, false, true, new Function1(aoeVar) { // from class: yne
            public final /* synthetic */ aoe b;

            {
                this.b = aoeVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                int i5 = i32;
                ArrayList arrayList4 = arrayList32;
                aoe aoeVar2 = this.b;
                glg glgVar = (glg) obj22;
                switch (i5) {
                    case 0:
                        glgVar.getClass();
                        return aoeVar2.e.M(glgVar, arrayList4);
                    default:
                        glgVar.getClass();
                        return aoeVar2.b.c0(glgVar, arrayList4);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(aoe aoeVar, int i, sq3 sq3Var) {
        wne wneVar;
        int i2;
        int i3;
        int i4;
        if (sq3Var instanceof wne) {
            wneVar = (wne) sq3Var;
            int i5 = wneVar.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                wneVar.w = i5 - Integer.MIN_VALUE;
                Object obj = wneVar.u;
                lu3 lu3Var = lu3.a;
                i2 = wneVar.w;
                if (i2 != 0) {
                    y6a.M(obj);
                    wneVar.r = aoeVar;
                    wneVar.s = i;
                    wneVar.w = 1;
                    obj = gz8.U(wneVar, aoeVar.a, false, true, new bvb(i, 15));
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = wneVar.t;
                        y6a.M(obj);
                        i3 = i4;
                        return Boolean.valueOf(i3 != 0);
                    }
                    i = wneVar.s;
                    aoeVar = wneVar.r;
                    y6a.M(obj);
                }
                i3 = ((Number) obj).intValue() <= 0 ? 1 : 0;
                if (i3 != 0) {
                    wneVar.r = null;
                    wneVar.s = i;
                    wneVar.t = i3;
                    wneVar.w = 2;
                    if (gz8.U(wneVar, aoeVar.a, false, true, new bvb(i, 13)) != lu3Var) {
                        i4 = i3;
                        i3 = i4;
                    }
                    return lu3Var;
                }
                return Boolean.valueOf(i3 != 0);
            }
        }
        wneVar = new wne(aoeVar, sq3Var);
        Object obj2 = wneVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = wneVar.w;
        if (i2 != 0) {
        }
        if (((Number) obj2).intValue() <= 0) {
        }
        if (i3 != 0) {
        }
        return Boolean.valueOf(i3 != 0);
    }
}
