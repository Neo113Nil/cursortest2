package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yd8 implements wd8 {
    public final xy a;
    public final xy b;
    public final ud8 d;
    public c0d f;
    public ne8 h;
    public final ne8 c = new ne8(2, 14, null);
    public final xd8 e = new xd8(this);
    public final l0d g = new l0d(1);

    public yd8(xy xyVar, xy xyVar2) {
        this.a = xyVar;
        this.b = xyVar2;
        this.d = new ud8(this, xyVar2);
    }

    public final boolean b(boolean z) {
        c40 c40Var;
        if (g() != null) {
            ne8 g = g();
            j(null);
            if (g != null) {
                g.l1(ie8.a, ie8.d);
                if (!g.a.n) {
                    r3a.b("visitAncestors called on an unattached node");
                }
                wtc wtcVar = g.a.e;
                wma c0 = c6o.c0(g);
                while (c0 != null) {
                    if ((((wtc) c0.F.g).d & 1024) != 0) {
                        while (wtcVar != null) {
                            if ((wtcVar.c & 1024) != 0) {
                                wtc wtcVar2 = wtcVar;
                                i1d i1dVar = null;
                                while (wtcVar2 != null) {
                                    if (wtcVar2 instanceof ne8) {
                                        ((ne8) wtcVar2).l1(ie8.b, ie8.d);
                                    } else if ((wtcVar2.c & 1024) != 0 && (wtcVar2 instanceof bw4)) {
                                        int i = 0;
                                        for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                            if ((wtcVar3.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    wtcVar2 = wtcVar3;
                                                } else {
                                                    if (i1dVar == null) {
                                                        i1dVar = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar2 != null) {
                                                        i1dVar.b(wtcVar2);
                                                        wtcVar2 = null;
                                                    }
                                                    i1dVar.b(wtcVar3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    wtcVar2 = c6o.X(i1dVar);
                                }
                            }
                            wtcVar = wtcVar.e;
                        }
                    }
                    c0 = c0.v();
                    wtcVar = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
                }
            }
        }
        return true;
    }

    public final boolean c(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            b(z);
        } else {
            int ordinal = ml4.l0(this.c, i).ordinal();
            if (ordinal == 0) {
                b(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    zzl.b();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            d();
        }
        return z3;
    }

    public final void d() {
        xy xyVar = this.a;
        if (xyVar.isFocused() || xyVar.hasFocus()) {
            xyVar.clearFocus();
        } else if (xyVar.hasFocus()) {
            View findFocus = xyVar.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            xyVar.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r7 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019c A[Catch: all -> 0x0327, TryCatch #0 {all -> 0x0327, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:11:0x0025, B:13:0x0029, B:14:0x0031, B:15:0x004d, B:18:0x0058, B:20:0x005e, B:21:0x0063, B:23:0x006b, B:25:0x0070, B:27:0x0076, B:31:0x007c, B:36:0x019c, B:38:0x01a2, B:39:0x01a5, B:41:0x01b0, B:44:0x01be, B:48:0x01c8, B:51:0x01ce, B:52:0x01d3, B:54:0x01db, B:56:0x01e1, B:58:0x01e5, B:60:0x01ed, B:62:0x01f3, B:64:0x01f7, B:68:0x01fd, B:70:0x0206, B:71:0x020a, B:66:0x020d, B:77:0x0213, B:88:0x0218, B:91:0x021b, B:93:0x0221, B:100:0x0225, B:105:0x022e, B:107:0x0236, B:115:0x024d, B:116:0x024f, B:118:0x0254, B:152:0x0258, B:147:0x029c, B:120:0x0264, B:122:0x026a, B:124:0x026e, B:126:0x0276, B:128:0x027c, B:130:0x0280, B:134:0x0286, B:136:0x028f, B:137:0x0293, B:132:0x0296, B:158:0x02a1, B:162:0x02b1, B:164:0x02b6, B:198:0x02ba, B:193:0x02fe, B:166:0x02c6, B:168:0x02cc, B:170:0x02d0, B:172:0x02d8, B:174:0x02de, B:176:0x02e2, B:180:0x02e8, B:182:0x02f1, B:183:0x02f5, B:178:0x02f8, B:205:0x0305, B:207:0x030c, B:214:0x031f, B:215:0x0321, B:222:0x0084, B:224:0x008a, B:225:0x008d, B:227:0x0095, B:230:0x00a3, B:234:0x00ad, B:269:0x0104, B:271:0x0108, B:236:0x00b2, B:238:0x00b8, B:240:0x00bc, B:242:0x00c4, B:244:0x00ca, B:246:0x00ce, B:250:0x00d4, B:252:0x00dd, B:253:0x00e1, B:248:0x00e4, B:259:0x00ea, B:273:0x00ef, B:276:0x00f2, B:278:0x00f8, B:285:0x00fc, B:290:0x010e, B:292:0x0114, B:293:0x0117, B:295:0x0121, B:298:0x012f, B:302:0x0139, B:337:0x0190, B:339:0x0194, B:304:0x013e, B:306:0x0144, B:308:0x0148, B:310:0x0150, B:312:0x0156, B:314:0x015a, B:318:0x0160, B:320:0x0169, B:321:0x016d, B:316:0x0170, B:327:0x0176, B:342:0x017b, B:345:0x017e, B:347:0x0184, B:354:0x0188, B:360:0x0037, B:362:0x003b, B:364:0x0041, B:366:0x0045), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [i1d] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [i1d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [wtc] */
    /* JADX WARN: Type inference failed for: r12v25, types: [wtc] */
    /* JADX WARN: Type inference failed for: r12v29, types: [wtc] */
    /* JADX WARN: Type inference failed for: r12v30, types: [wtc] */
    /* JADX WARN: Type inference failed for: r12v36, types: [wtc] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v46, types: [wtc] */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [i1d] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(KeyEvent keyEvent, Function0 function0) {
        xv4 xv4Var;
        wtc wtcVar;
        c40 c40Var;
        xv4 xv4Var2;
        c40 c40Var2;
        c40 c40Var3;
        boolean z;
        ne8 ne8Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            long w = u0a.w(keyEvent);
            int z2 = u0a.z(keyEvent);
            if (z2 == 2) {
                c0d c0dVar = this.f;
                if (c0dVar == null) {
                    c0dVar = new c0d(3);
                    this.f = c0dVar;
                }
                c0dVar.d(w);
            } else if (z2 == 1) {
                c0d c0dVar2 = this.f;
                if (c0dVar2 == null || !c0dVar2.a(w)) {
                    return false;
                }
                c0d c0dVar3 = this.f;
                if (c0dVar3 != null) {
                    c0dVar3.e(w);
                }
            }
            ne8 R = l98.R(ne8Var);
            if (R != null) {
                if (!R.a.n) {
                    r3a.b("visitLocalDescendants called on an unattached node");
                }
                wtc wtcVar2 = R.a;
                if ((wtcVar2.d & 9216) != 0) {
                    wtcVar = null;
                    for (wtc wtcVar3 = wtcVar2.f; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                        int i = wtcVar3.c;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            wtcVar = wtcVar3;
                        }
                    }
                } else {
                    wtcVar = null;
                }
            }
            if (R != null) {
                if (!R.a.n) {
                    r3a.b("visitAncestors called on an unattached node");
                }
                wtc wtcVar4 = R.a;
                wma c0 = c6o.c0(R);
                loop11: while (true) {
                    if (c0 == null) {
                        xv4Var2 = null;
                        break;
                    }
                    if ((((wtc) c0.F.g).d & 8192) != 0) {
                        while (wtcVar4 != null) {
                            if ((wtcVar4.c & 8192) != 0) {
                                i1d i1dVar = null;
                                wtc wtcVar5 = wtcVar4;
                                while (wtcVar5 != null) {
                                    if (wtcVar5 instanceof wia) {
                                        xv4Var2 = wtcVar5;
                                        break loop11;
                                    }
                                    if ((wtcVar5.c & 8192) != 0 && (wtcVar5 instanceof bw4)) {
                                        wtc wtcVar6 = ((bw4) wtcVar5).p;
                                        int i2 = 0;
                                        wtcVar5 = wtcVar5;
                                        i1dVar = i1dVar;
                                        while (wtcVar6 != null) {
                                            if ((wtcVar6.c & 8192) != 0) {
                                                i2++;
                                                i1dVar = i1dVar;
                                                if (i2 == 1) {
                                                    Unit unit = Unit.a;
                                                    wtcVar5 = wtcVar6;
                                                } else {
                                                    if (i1dVar == null) {
                                                        i1dVar = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar5 != null) {
                                                        i1dVar.b(wtcVar5);
                                                        wtcVar5 = null;
                                                    }
                                                    i1dVar.b(wtcVar6);
                                                }
                                            }
                                            wtcVar6 = wtcVar6.f;
                                            wtcVar5 = wtcVar5;
                                            i1dVar = i1dVar;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    wtcVar5 = c6o.X(i1dVar);
                                }
                            }
                            wtcVar4 = wtcVar4.e;
                        }
                    }
                    c0 = c0.v();
                    wtcVar4 = (c0 == null || (c40Var2 = c0.F) == null) ? null : (hti) c40Var2.f;
                }
                xv4 xv4Var3 = (wia) xv4Var2;
                if (xv4Var3 != null) {
                    wtcVar = ((wtc) xv4Var3).a;
                    if (wtcVar != null) {
                        if (!wtcVar.a.n) {
                            r3a.b("visitAncestors called on an unattached node");
                        }
                        wtc wtcVar7 = wtcVar.a.e;
                        wma c02 = c6o.c0(wtcVar);
                        ArrayList arrayList = null;
                        while (c02 != null) {
                            if ((((wtc) c02.F.g).d & 8192) != 0) {
                                while (wtcVar7 != null) {
                                    if ((wtcVar7.c & 8192) != 0) {
                                        wtc wtcVar8 = wtcVar7;
                                        i1d i1dVar2 = null;
                                        while (wtcVar8 != null) {
                                            if (wtcVar8 instanceof wia) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(wtcVar8);
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            if (z && (wtcVar8.c & 8192) != 0 && (wtcVar8 instanceof bw4)) {
                                                int i3 = 0;
                                                for (wtc wtcVar9 = ((bw4) wtcVar8).p; wtcVar9 != null; wtcVar9 = wtcVar9.f) {
                                                    if ((wtcVar9.c & 8192) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            Unit unit2 = Unit.a;
                                                            wtcVar8 = wtcVar9;
                                                        } else {
                                                            if (i1dVar2 == null) {
                                                                i1dVar2 = new i1d(new wtc[16], 0);
                                                            }
                                                            if (wtcVar8 != null) {
                                                                i1dVar2.b(wtcVar8);
                                                                wtcVar8 = null;
                                                            }
                                                            i1dVar2.b(wtcVar9);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            wtcVar8 = c6o.X(i1dVar2);
                                        }
                                    }
                                    wtcVar7 = wtcVar7.e;
                                }
                            }
                            c02 = c02.v();
                            wtcVar7 = (c02 == null || (c40Var3 = c02.F) == null) ? null : (hti) c40Var3.f;
                        }
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            if (size >= 0) {
                                while (true) {
                                    int i4 = size - 1;
                                    if (((wia) arrayList.get(size)).n0(keyEvent)) {
                                        return true;
                                    }
                                    if (i4 < 0) {
                                        break;
                                    }
                                    size = i4;
                                }
                            }
                            Unit unit3 = Unit.a;
                        }
                        bw4 bw4Var = wtcVar.a;
                        ?? r0 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof wia) {
                                if (((wia) bw4Var).n0(keyEvent)) {
                                    return true;
                                }
                            } else if ((bw4Var.c & 8192) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar10 = bw4Var.p;
                                int i5 = 0;
                                r0 = r0;
                                bw4Var = bw4Var;
                                while (wtcVar10 != null) {
                                    if ((wtcVar10.c & 8192) != 0) {
                                        i5++;
                                        r0 = r0;
                                        if (i5 == 1) {
                                            Unit unit4 = Unit.a;
                                            bw4Var = wtcVar10;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r0.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r0.b(wtcVar10);
                                        }
                                    }
                                    wtcVar10 = wtcVar10.f;
                                    r0 = r0;
                                    bw4Var = bw4Var;
                                }
                                if (i5 == 1) {
                                }
                            }
                            bw4Var = c6o.X(r0);
                        }
                        if (((Boolean) function0.invoke()).booleanValue()) {
                            return true;
                        }
                        bw4 bw4Var2 = wtcVar.a;
                        ?? r14 = 0;
                        while (bw4Var2 != 0) {
                            if (bw4Var2 instanceof wia) {
                                if (((wia) bw4Var2).w0(keyEvent)) {
                                    return true;
                                }
                            } else if ((bw4Var2.c & 8192) != 0 && (bw4Var2 instanceof bw4)) {
                                wtc wtcVar11 = bw4Var2.p;
                                int i6 = 0;
                                bw4Var2 = bw4Var2;
                                r14 = r14;
                                while (wtcVar11 != null) {
                                    if ((wtcVar11.c & 8192) != 0) {
                                        i6++;
                                        r14 = r14;
                                        if (i6 == 1) {
                                            Unit unit5 = Unit.a;
                                            bw4Var2 = wtcVar11;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var2 != 0) {
                                                r14.b(bw4Var2);
                                                bw4Var2 = 0;
                                            }
                                            r14.b(wtcVar11);
                                        }
                                    }
                                    wtcVar11 = wtcVar11.f;
                                    bw4Var2 = bw4Var2;
                                    r14 = r14;
                                }
                                if (i6 == 1) {
                                }
                            }
                            bw4Var2 = c6o.X(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (((wia) arrayList.get(i7)).w0(keyEvent)) {
                                    return true;
                                }
                            }
                            Unit unit6 = Unit.a;
                        }
                        Unit unit7 = Unit.a;
                    }
                    return false;
                }
            }
            if (!ne8Var.a.n) {
                r3a.b("visitAncestors called on an unattached node");
            }
            wtc wtcVar12 = ne8Var.a.e;
            wma c03 = c6o.c0(ne8Var);
            loop15: while (true) {
                if (c03 == null) {
                    xv4Var = null;
                    break;
                }
                if ((((wtc) c03.F.g).d & 8192) != 0) {
                    while (wtcVar12 != null) {
                        if ((wtcVar12.c & 8192) != 0) {
                            wtc wtcVar13 = wtcVar12;
                            i1d i1dVar3 = null;
                            while (wtcVar13 != null) {
                                if (wtcVar13 instanceof wia) {
                                    xv4Var = wtcVar13;
                                    break loop15;
                                }
                                if ((wtcVar13.c & 8192) != 0 && (wtcVar13 instanceof bw4)) {
                                    wtc wtcVar14 = ((bw4) wtcVar13).p;
                                    int i8 = 0;
                                    wtcVar13 = wtcVar13;
                                    i1dVar3 = i1dVar3;
                                    while (wtcVar14 != null) {
                                        if ((wtcVar14.c & 8192) != 0) {
                                            i8++;
                                            i1dVar3 = i1dVar3;
                                            if (i8 == 1) {
                                                Unit unit8 = Unit.a;
                                                wtcVar13 = wtcVar14;
                                            } else {
                                                if (i1dVar3 == null) {
                                                    i1dVar3 = new i1d(new wtc[16], 0);
                                                }
                                                if (wtcVar13 != null) {
                                                    i1dVar3.b(wtcVar13);
                                                    wtcVar13 = null;
                                                }
                                                i1dVar3.b(wtcVar14);
                                            }
                                        }
                                        wtcVar14 = wtcVar14.f;
                                        wtcVar13 = wtcVar13;
                                        i1dVar3 = i1dVar3;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                wtcVar13 = c6o.X(i1dVar3);
                            }
                        }
                        wtcVar12 = wtcVar12.e;
                    }
                }
                c03 = c03.v();
                wtcVar12 = (c03 == null || (c40Var = c03.F) == null) ? null : (hti) c40Var.f;
            }
            xv4 xv4Var4 = (wia) xv4Var;
            wtcVar = xv4Var4 != null ? ((wtc) xv4Var4).a : null;
            if (wtcVar != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x011e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean f(int i, oqf oqfVar, Function1 function1) {
        boolean n;
        boolean z;
        ne8 ne8Var;
        c40 c40Var;
        boolean z2;
        ne8 ne8Var2 = this.c;
        ne8 R = l98.R(ne8Var2);
        int i2 = 6;
        xy xyVar = this.b;
        if (R != null) {
            ema layoutDirection = xyVar.getLayoutDirection();
            ae8 m1 = R.m1();
            ce8 ce8Var = m1.h;
            ce8 ce8Var2 = m1.i;
            if (i == 1) {
                ce8Var = m1.b;
            } else if (i == 2) {
                ce8Var = m1.c;
            } else if (i == 5) {
                ce8Var = m1.d;
            } else if (i == 6) {
                ce8Var = m1.e;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        zzl.b();
                        return null;
                    }
                    ce8Var = ce8Var2;
                }
                if (ce8Var == ce8.b) {
                    ce8Var = null;
                }
                if (ce8Var == null) {
                    ce8Var = m1.f;
                }
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    ce8Var = ce8Var2;
                } else if (ordinal2 != 1) {
                    zzl.b();
                    return null;
                }
                if (ce8Var == ce8.b) {
                    ce8Var = null;
                }
                if (ce8Var == null) {
                    ce8Var = m1.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    a70.r("invalid FocusDirection");
                    return null;
                }
                fj2 fj2Var = new fj2(i);
                yd8 yd8Var = (yd8) ((xy) c6o.d0(R)).getFocusOwner();
                ne8 g = yd8Var.g();
                if (i == 7) {
                    m1.j.invoke(fj2Var);
                } else {
                    m1.k.invoke(fj2Var);
                }
                ce8Var = fj2Var.b ? ce8.c : g != yd8Var.g() ? ce8.d : ce8.b;
            }
            ce8 ce8Var3 = ce8.c;
            if (!Intrinsics.c(ce8Var, ce8Var3)) {
                if (Intrinsics.c(ce8Var, ce8.d)) {
                    ne8 R2 = l98.R(ne8Var2);
                    if (R2 != null) {
                        return (Boolean) function1.invoke(R2);
                    }
                } else {
                    ce8 ce8Var4 = ce8.b;
                    if (!Intrinsics.c(ce8Var, ce8Var4)) {
                        if (ce8Var == ce8Var4) {
                            a70.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (ce8Var == ce8Var3) {
                            a70.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        i1d i1dVar = ce8Var.a;
                        int i3 = i1dVar.c;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                            z2 = false;
                        } else {
                            Object[] objArr = i1dVar.a;
                            boolean z3 = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                xv4 xv4Var = (ee8) objArr[i4];
                                if (!((wtc) xv4Var).a.n) {
                                    r3a.b("visitChildren called on an unattached node");
                                }
                                i1d i1dVar2 = new i1d(new wtc[16], 0);
                                wtc wtcVar = ((wtc) xv4Var).a;
                                wtc wtcVar2 = wtcVar.f;
                                if (wtcVar2 == null) {
                                    c6o.x(i1dVar2, wtcVar);
                                } else {
                                    i1dVar2.b(wtcVar2);
                                }
                                while (true) {
                                    int i5 = i1dVar2.c;
                                    if (i5 != 0) {
                                        wtc wtcVar3 = (wtc) i1dVar2.r(i5 - 1);
                                        if ((wtcVar3.d & 1024) == 0) {
                                            c6o.x(i1dVar2, wtcVar3);
                                        } else {
                                            while (true) {
                                                if (wtcVar3 == null) {
                                                    break;
                                                }
                                                if ((wtcVar3.c & 1024) != 0) {
                                                    i1d i1dVar3 = null;
                                                    while (wtcVar3 != null) {
                                                        if (wtcVar3 instanceof ne8) {
                                                            if (((Boolean) function1.invoke((ne8) wtcVar3)).booleanValue()) {
                                                                z3 = true;
                                                                break;
                                                            }
                                                        } else if ((wtcVar3.c & 1024) != 0 && (wtcVar3 instanceof bw4)) {
                                                            i1d i1dVar4 = i1dVar3;
                                                            int i6 = 0;
                                                            for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                                                if ((wtcVar4.c & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        wtcVar3 = wtcVar4;
                                                                    } else {
                                                                        if (i1dVar4 == null) {
                                                                            i1dVar4 = new i1d(new wtc[16], 0);
                                                                        }
                                                                        if (wtcVar3 != null) {
                                                                            i1dVar4.b(wtcVar3);
                                                                            wtcVar3 = null;
                                                                        }
                                                                        i1dVar4.b(wtcVar4);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                                i1dVar3 = i1dVar4;
                                                            } else {
                                                                i1dVar3 = i1dVar4;
                                                            }
                                                        }
                                                        wtcVar3 = c6o.X(i1dVar3);
                                                    }
                                                } else {
                                                    wtcVar3 = wtcVar3.f;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z2 = z3;
                        }
                        return Boolean.valueOf(z2);
                    }
                }
            }
            return null;
        }
        R = null;
        ema layoutDirection2 = xyVar.getLayoutDirection();
        x40 x40Var = new x40(i2, R, this, function1);
        if (i == 1 || i == 2) {
            if (i == 1) {
                n = yaa.s(ne8Var2, x40Var);
            } else {
                if (i != 2) {
                    a70.r("This function should only be used for 1-D focus search");
                    return null;
                }
                n = yaa.n(ne8Var2, x40Var);
            }
            return Boolean.valueOf(n);
        }
        if (i != 3) {
            int i7 = 4;
            if (i != 4 && i != 5 && i != 6) {
                if (i == 7) {
                    int ordinal3 = layoutDirection2.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            zzl.b();
                            return null;
                        }
                        i7 = 3;
                    }
                    ne8 R3 = l98.R(ne8Var2);
                    if (R3 != null) {
                        return w3a.V(i7, x40Var, R3, oqfVar);
                    }
                    return null;
                }
                if (i != 8) {
                    pvd.z(md8.a(i), "Focus search invoked with invalid FocusDirection ");
                    return null;
                }
                ne8 R4 = l98.R(ne8Var2);
                if (R4 != null) {
                    if (!R4.a.n) {
                        r3a.b("visitAncestors called on an unattached node");
                    }
                    wtc wtcVar5 = R4.a.e;
                    wma c0 = c6o.c0(R4);
                    loop5: while (true) {
                        if (c0 == null) {
                            ne8Var = null;
                            break;
                        }
                        if ((((wtc) c0.F.g).d & 1024) != 0) {
                            while (wtcVar5 != null) {
                                if ((wtcVar5.c & 1024) != 0) {
                                    wtc wtcVar6 = wtcVar5;
                                    i1d i1dVar5 = null;
                                    while (wtcVar6 != null) {
                                        if (wtcVar6 instanceof ne8) {
                                            ne8 ne8Var3 = (ne8) wtcVar6;
                                            if (ne8Var3.m1().a) {
                                                ne8Var = ne8Var3;
                                                break loop5;
                                            }
                                        } else if ((wtcVar6.c & 1024) != 0 && (wtcVar6 instanceof bw4)) {
                                            int i8 = 0;
                                            for (wtc wtcVar7 = ((bw4) wtcVar6).p; wtcVar7 != null; wtcVar7 = wtcVar7.f) {
                                                if ((wtcVar7.c & 1024) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        wtcVar6 = wtcVar7;
                                                    } else {
                                                        if (i1dVar5 == null) {
                                                            i1dVar5 = new i1d(new wtc[16], 0);
                                                        }
                                                        if (wtcVar6 != null) {
                                                            i1dVar5.b(wtcVar6);
                                                            wtcVar6 = null;
                                                        }
                                                        i1dVar5.b(wtcVar7);
                                                    }
                                                }
                                            }
                                            if (i8 != 1) {
                                                wtcVar6 = c6o.X(i1dVar5);
                                            }
                                        }
                                        wtcVar6 = c6o.X(i1dVar5);
                                    }
                                }
                                wtcVar5 = wtcVar5.e;
                            }
                        }
                        c0 = c0.v();
                        wtcVar5 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
                    }
                    z = false;
                } else {
                    z = false;
                    ne8Var = null;
                }
                return Boolean.valueOf((ne8Var == null || ne8Var == ne8Var2) ? z : ((Boolean) x40Var.invoke(ne8Var)).booleanValue());
            }
        }
        return w3a.V(i, x40Var, ne8Var2, oqfVar);
    }

    public final ne8 g() {
        ne8 ne8Var = this.h;
        if (ne8Var == null || !ne8Var.n) {
            return null;
        }
        return ne8Var;
    }

    public final boolean h(int i, boolean z) {
        ne8 g = g();
        xy xyVar = this.a;
        if (g == null || !g.o || !xyVar.B(i)) {
            fsf fsfVar = new fsf();
            fsfVar.a = Boolean.FALSE;
            ne8 g2 = g();
            Boolean f = f(i, xyVar.getEmbeddedViewFocusRect(), new clb(fsfVar, i, 2));
            if (!Intrinsics.c(f, Boolean.TRUE) || g2 == g()) {
                if (f != null && fsfVar.a != null) {
                    if (!f.booleanValue() || !((Boolean) fsfVar.a).booleanValue()) {
                        if ((i == 1 || i == 2) && z && c(i, false, false)) {
                            Boolean f2 = f(i, null, new uy(i, 3));
                            if (f2 != null ? f2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean i(int i) {
        if (!c(i, false, false)) {
            return false;
        }
        Boolean f = f(i, null, new uy(i, 2));
        boolean booleanValue = f != null ? f.booleanValue() : false;
        if (!booleanValue) {
            d();
        }
        return booleanValue;
    }

    public final void j(ne8 ne8Var) {
        ne8 ne8Var2 = this.h;
        this.h = ne8Var;
        l0d l0dVar = this.g;
        Object[] objArr = l0dVar.a;
        int i = l0dVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((vd8) objArr[i2]).a(ne8Var2, ne8Var);
        }
    }
}
