package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.bsk;
import defpackage.dh0;
import defpackage.ixh;
import defpackage.ljg;
import defpackage.o13;
import defpackage.ts4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public h(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static void f(dh0 dh0Var, View view) {
        WeakHashMap weakHashMap = bsk.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            dh0Var.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(dh0Var, childAt);
                }
            }
        }
    }

    public static final h j(ViewGroup viewGroup, s sVar) {
        viewGroup.getClass();
        sVar.getClass();
        sVar.N().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof h) {
            return (h) tag;
        }
        h hVar = new h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
        return hVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                y yVar = (y) it.next();
                if (!yVar.k.isEmpty()) {
                    ArrayList arrayList2 = yVar.k;
                    if (arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (!((ixh) it2.next()).a()) {
                            break;
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                o13.v(((y) it3.next()).k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(y yVar) {
        yVar.getClass();
        if (yVar.i) {
            int i = yVar.a;
            View requireView = yVar.c.requireView();
            requireView.getClass();
            ljg.a(i, requireView, this.a);
            yVar.i = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x040f, code lost:
    
        if (r6.k.isEmpty() != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x041e, code lost:
    
        if (r6.a != 3) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0420, code lost:
    
        r6.i = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0422, code lost:
    
        r6.j.add(new androidx.fragment.app.e(r4));
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0415, code lost:
    
        if (androidx.fragment.app.s.O(r21) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0417, code lost:
    
        java.util.Objects.toString(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0403, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x042f, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0437, code lost:
    
        if (r0.hasNext() == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0439, code lost:
    
        r1 = (androidx.fragment.app.d) r0.next();
        r3 = r1.a;
        r4 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0443, code lost:
    
        if (r2 != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x044f, code lost:
    
        if (r8 == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x045b, code lost:
    
        r3.j.add(new androidx.fragment.app.c(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0455, code lost:
    
        if (androidx.fragment.app.s.O(r21) == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0457, code lost:
    
        java.util.Objects.toString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0449, code lost:
    
        if (androidx.fragment.app.s.O(r21) == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x044b, code lost:
    
        java.util.Objects.toString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0466, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x019a, code lost:
    
        r6 = new java.util.ArrayList();
        r9 = new java.util.ArrayList();
        r9 = new defpackage.dh0(0);
        r11 = new java.util.ArrayList<>();
        r12 = new java.util.ArrayList<>();
        r12 = new defpackage.dh0(0);
        r17 = r12;
        r13 = new defpackage.dh0(0);
        r18 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c7, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01cc, code lost:
    
        if (r18.hasNext() == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01ce, code lost:
    
        r21 = r15;
        r15 = ((defpackage.at4) r18.next()).d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01da, code lost:
    
        if (r15 == null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01dc, code lost:
    
        if (r2 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01de, code lost:
    
        r8 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e0, code lost:
    
        if (r4 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0340, code lost:
    
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0353, code lost:
    
        r8 = r2;
        r15 = r21;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r2 = (androidx.fragment.app.y) r2;
        r1 = r27.listIterator(r27.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01e2, code lost:
    
        r6 = r4.c;
        r11 = r5.y(r5.h(r15));
        r15 = r6.getSharedElementSourceNames();
        r15.getClass();
        r7 = r8.getSharedElementSourceNames();
        r7.getClass();
        r22 = r1;
        r1 = r8.getSharedElementTargetNames();
        r1.getClass();
        r23 = r2;
        r2 = r1.size();
        r24 = r3;
        r25 = r4;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x020f, code lost:
    
        if (r3 >= r2) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0211, code lost:
    
        r17 = r2;
        r2 = r15.indexOf(r1.get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x021b, code lost:
    
        if (r2 == (-1)) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x021d, code lost:
    
        r15.set(r2, r7.get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0224, code lost:
    
        r3 = r3 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0229, code lost:
    
        r1 = r6.getSharedElementTargetNames();
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0230, code lost:
    
        if (r28 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0232, code lost:
    
        r8.getExitTransitionCallback();
        r6.getEnterTransitionCallback();
        r2 = new kotlin.Pair(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x024d, code lost:
    
        if (r2.a != null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0251, code lost:
    
        if (r2.b != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0253, code lost:
    
        r2 = r15.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r1.hasPrevious() == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0258, code lost:
    
        if (r7 >= r2) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x025a, code lost:
    
        r17 = r15.get(r7);
        r17.getClass();
        r3 = r17;
        r17 = r1.get(r7);
        r17.getClass();
        r9.put(r3, r17);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x027c, code lost:
    
        if (androidx.fragment.app.s.O(r21) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x027e, code lost:
    
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0286, code lost:
    
        if (r2.hasNext() == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0288, code lost:
    
        r3 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        r9 = r1.previous();
        r10 = (androidx.fragment.app.y) r9;
        r11 = r10.c.mView;
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x028f, code lost:
    
        r2 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0297, code lost:
    
        if (r2.hasNext() == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0299, code lost:
    
        r3 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02a0, code lost:
    
        r2 = r8.mView;
        r2.getClass();
        f(r12, r2);
        r12.n(r15);
        r9.n(r12.keySet());
        r2 = r6.mView;
        r2.getClass();
        f(r13, r2);
        r13.n(r1);
        r13.n(r9.values());
        r2 = defpackage.gq8.a;
        r2 = r9.c - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02cb, code lost:
    
        if ((-1) >= r2) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02d7, code lost:
    
        if (r13.containsKey((java.lang.String) r9.k(r2)) != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02d9, code lost:
    
        r9.i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (r11.getAlpha() != com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02dc, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02df, code lost:
    
        r6 = 15;
        defpackage.o13.y(r12.entrySet(), new defpackage.oo(r9.keySet(), r6), false);
        defpackage.o13.y(r13.entrySet(), new defpackage.oo(r9.values(), r6), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0306, code lost:
    
        if (r9.isEmpty() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0327, code lost:
    
        r8 = false;
        r6 = r11;
        r17 = r15;
        r15 = r21;
        r2 = r23;
        r3 = r24;
        r4 = r25;
        r11 = r1;
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0308, code lost:
    
        java.util.Objects.toString(r11);
        r23.toString();
        r25.toString();
        r6.clear();
        r9.clear();
        r11 = r1;
        r8 = false;
        r17 = r15;
        r15 = r21;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r4 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0338, code lost:
    
        defpackage.pvd.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x033b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x033c, code lost:
    
        defpackage.pvd.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x033f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x023f, code lost:
    
        r8.getEnterTransitionCallback();
        r6.getExitTransitionCallback();
        r2 = new kotlin.Pair(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x034a, code lost:
    
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (r11.getVisibility() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0360, code lost:
    
        r22 = r1;
        r23 = r2;
        r24 = r3;
        r25 = r4;
        r2 = r8;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x036b, code lost:
    
        if (r6 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0371, code lost:
    
        if (r24.isEmpty() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0373, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0375, code lost:
    
        r1 = r24.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x037d, code lost:
    
        if (r1.hasNext() == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0387, code lost:
    
        if (((defpackage.at4) r1.next()).b != null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x038a, code lost:
    
        r15 = r2;
        r1 = new androidx.fragment.app.g(r24, r23, r25, r5, r6, r6, r9, r9, r11, r17, r12, r13, r28);
        r2 = r24.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03a4, code lost:
    
        if (r2.hasNext() == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03a6, code lost:
    
        ((defpackage.at4) r2.next()).a.j.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x007a, code lost:
    
        r11 = r11.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x007e, code lost:
    
        if (r11 == 0) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0080, code lost:
    
        if (r11 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0082, code lost:
    
        if (r11 != 8) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0085, code lost:
    
        defpackage.a70.p(defpackage.ljg.j(r11, "Unknown visibility "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r10.a != 2) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0092, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (androidx.fragment.app.s.O(2) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        java.util.Objects.toString(r2);
        java.util.Objects.toString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        r1 = new java.util.ArrayList();
        r3 = new java.util.ArrayList();
        r5 = ((androidx.fragment.app.y) kotlin.collections.CollectionsKt.h0(r27)).c;
        r6 = r27.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (r6.hasNext() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        r9 = ((androidx.fragment.app.y) r6.next()).c.mAnimationInfo;
        r10 = r5.mAnimationInfo;
        r9.b = r10.b;
        r9.c = r10.c;
        r9.d = r10.d;
        r9.e = r10.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        r5 = r27.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r5.hasNext() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        r6 = (androidx.fragment.app.y) r5.next();
        r1.add(new androidx.fragment.app.d(r6, r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
    
        if (r28 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
    
        if (r6 != r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        r3.add(new defpackage.at4(r6, r28, r10));
        r6.d.add(new defpackage.ts4(r26, r6, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        if (r6 != r4) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        r5 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
    
        if (r3.hasNext() == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0124, code lost:
    
        r6 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        if (((defpackage.at4) r6).a() != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
    
        r3 = new java.util.ArrayList();
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        if (r5.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
    
        r6 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014f, code lost:
    
        if (((defpackage.at4) r6).b() == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0151, code lost:
    
        r3.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
    
        r5 = r3.iterator();
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        if (r5.hasNext() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        r9 = (defpackage.at4) r5.next();
        r10 = r9.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016b, code lost:
    
        if (r5 == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016d, code lost:
    
        if (r10 != r5) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        r0 = new java.lang.StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        r0.append(r9.a.c);
        r0.append(" returned Transition ");
        defpackage.ogj.h(defpackage.mz1.n(r0, r9.b, " which uses a different Transition type than other Fragments."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018f, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0191, code lost:
    
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0193, code lost:
    
        r22 = r1;
        r21 = 2;
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03b4, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r3 = r22.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03c6, code lost:
    
        if (r3.hasNext() == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03c8, code lost:
    
        defpackage.o13.v(((androidx.fragment.app.d) r3.next()).a.k, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03d6, code lost:
    
        r2 = r2.isEmpty();
        r3 = r22.iterator();
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03e3, code lost:
    
        if (r3.hasNext() == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03e5, code lost:
    
        r4 = (androidx.fragment.app.d) r3.next();
        r5 = r26.a.getContext();
        r6 = r4.a;
        r5.getClass();
        r5 = r4.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03fa, code lost:
    
        if (r5 != null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0401, code lost:
    
        if (((android.animation.AnimatorSet) r5.c) != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0407, code lost:
    
        r5 = r6.c;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 2;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y yVar = (y) obj;
            View view = yVar.c.mView;
            view.getClass();
            if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        a70.p(ljg.j(visibility, "Unknown visibility "));
                        return;
                    }
                } else if (yVar.a != 2) {
                    break;
                }
            }
        }
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o13.v(((y) it.next()).k, arrayList2);
        }
        List S0 = CollectionsKt.S0(CollectionsKt.W0(arrayList2));
        int size = S0.size();
        for (int i = 0; i < size; i++) {
            ((ixh) S0.get(i)).c(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((y) arrayList.get(i2));
        }
        List S02 = CollectionsKt.S0(arrayList);
        int size3 = S02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            y yVar = (y) S02.get(i3);
            if (yVar.k.isEmpty()) {
                yVar.b();
            }
        }
    }

    public final void d(int i, int i2, u uVar) {
        synchronized (this.b) {
            try {
                y g = g(uVar.c);
                if (g == null) {
                    Fragment fragment = uVar.c;
                    if (!fragment.mTransitioning && !fragment.mRemoving) {
                        g = null;
                    }
                    g = h(fragment);
                }
                if (g != null) {
                    g.d(i, i2);
                    return;
                }
                final y yVar = new y(i, i2, uVar);
                this.b.add(yVar);
                yVar.d.add(new Runnable() { // from class: androidx.fragment.app.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar = h.this;
                        ArrayList arrayList = hVar.b;
                        y yVar2 = yVar;
                        if (arrayList.contains(yVar2)) {
                            int i3 = yVar2.a;
                            View view = yVar2.c.mView;
                            view.getClass();
                            ljg.a(i3, view, hVar.a);
                        }
                    }
                });
                yVar.d.add(new ts4(this, yVar, 1));
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    y yVar = (y) it.next();
                    if (this.b.isEmpty() || !yVar.c.mTransitioning) {
                        z = false;
                    }
                    yVar.g = z;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    y yVar2 = (y) it2.next();
                    if (this.d) {
                        if (s.O(2)) {
                            Objects.toString(yVar2);
                        }
                        yVar2.b();
                    } else {
                        if (s.O(2)) {
                            Objects.toString(yVar2);
                        }
                        yVar2.a(this.a);
                    }
                    this.d = false;
                    if (!yVar2.f) {
                        this.c.add(yVar2);
                    }
                }
                if (!this.b.isEmpty()) {
                    n();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    b(arrayList2, this.e);
                    boolean k = k(arrayList2);
                    Iterator it3 = arrayList2.iterator();
                    boolean z2 = true;
                    while (it3.hasNext()) {
                        if (!((y) it3.next()).c.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || k) {
                        z = false;
                    }
                    this.d = z;
                    if (!z2) {
                        m(arrayList2);
                        c(arrayList2);
                    } else if (k) {
                        m(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            a((y) arrayList2.get(i));
                        }
                    }
                    this.e = false;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final y g(Fragment fragment) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y yVar = (y) obj;
            if (yVar.c.equals(fragment) && !yVar.e) {
                break;
            }
        }
        return (y) obj;
    }

    public final y h(Fragment fragment) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y yVar = (y) obj;
            if (yVar.c.equals(fragment) && !yVar.e) {
                break;
            }
        }
        return (y) obj;
    }

    public final void i() {
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                n();
                m(this.b);
                ArrayList arrayList = new ArrayList(this.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).g = false;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    y yVar = (y) it2.next();
                    if (s.O(2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(yVar);
                    }
                    yVar.a(this.a);
                }
                ArrayList arrayList2 = new ArrayList(this.b);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((y) it3.next()).g = false;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    y yVar2 = (y) it4.next();
                    if (s.O(2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(yVar2);
                    }
                    yVar2.a(this.a);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        Object obj;
        synchronized (this.b) {
            try {
                n();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    y yVar = (y) obj;
                    View view = yVar.c.mView;
                    view.getClass();
                    char c = 4;
                    if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c = 3;
                        }
                    }
                    if (yVar.a == 2 && c != 2) {
                        break;
                    }
                }
                y yVar2 = (y) obj;
                Fragment fragment = yVar2 != null ? yVar2.c : null;
                this.f = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y yVar = (y) arrayList.get(i);
            u uVar = yVar.l;
            Fragment fragment = uVar.c;
            if (!yVar.h) {
                yVar.h = true;
                int i2 = yVar.b;
                if (i2 == 2) {
                    View findFocus = fragment.mView.findFocus();
                    if (findFocus != null) {
                        fragment.setFocusedView(findFocus);
                        if (s.O(2)) {
                            findFocus.toString();
                            fragment.toString();
                        }
                    }
                    View requireView = yVar.c.requireView();
                    requireView.getClass();
                    if (requireView.getParent() == null) {
                        if (s.O(2)) {
                            fragment.toString();
                            requireView.toString();
                        }
                        uVar.a();
                        requireView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (requireView.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && requireView.getVisibility() == 0) {
                        if (s.O(2)) {
                            requireView.toString();
                        }
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (s.O(2)) {
                        fragment.getPostOnViewCreatedAlpha();
                    }
                } else if (i2 == 3) {
                    View requireView2 = fragment.requireView();
                    requireView2.getClass();
                    if (s.O(2)) {
                        Objects.toString(requireView2.findFocus());
                        requireView2.toString();
                        fragment.toString();
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o13.v(((y) it.next()).k, arrayList2);
        }
        List S0 = CollectionsKt.S0(CollectionsKt.W0(arrayList2));
        int size2 = S0.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ixh ixhVar = (ixh) S0.get(i3);
            ixhVar.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!ixhVar.a) {
                ixhVar.e(viewGroup);
            }
            ixhVar.a = true;
        }
    }

    public final void n() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            int i = 2;
            if (yVar.b == 2) {
                View requireView = yVar.c.requireView();
                requireView.getClass();
                int visibility = requireView.getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            a70.p(ljg.j(visibility, "Unknown visibility "));
                            return;
                        }
                        i = 3;
                    }
                }
                yVar.d(i, 1);
            }
        }
    }
}
