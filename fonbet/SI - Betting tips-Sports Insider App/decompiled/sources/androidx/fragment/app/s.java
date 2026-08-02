package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends k2 {
    public static void o(s.e eVar, View view) {
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        String f6 = androidx.core.view.q0.f(view);
        if (f6 != null) {
            eVar.put(f6, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View child = viewGroup.getChildAt(i5);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    o(eVar, child);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x04fc, code lost:
    
        if (((android.animation.AnimatorSet) r7.f2048b) != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0502, code lost:
    
        r7 = r8.f1905c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x050a, code lost:
    
        if (r8.f1912k.isEmpty() != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0529, code lost:
    
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x052d, code lost:
    
        if (r8.f1903a != r7) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x052f, code lost:
    
        r8.f1911i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0534, code lost:
    
        r6 = new androidx.fragment.app.i(r4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r15);
        r8.j.add(r6);
        r27 = r7;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0510, code lost:
    
        if (androidx.fragment.app.j1.L(r18) == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0512, code lost:
    
        android.util.Log.v(r0, "Ignoring Animator set on " + r7 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04fe, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0546, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0550, code lost:
    
        if (r1.hasNext() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0552, code lost:
    
        r3 = (androidx.fragment.app.g) r1.next();
        r4 = r3.f1994a;
        r7 = r4.f1905c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x055e, code lost:
    
        if (r2 != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x057b, code lost:
    
        if (r6 == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0598, code lost:
    
        r7 = new androidx.fragment.app.f(r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r15);
        r4.j.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0581, code lost:
    
        if (androidx.fragment.app.j1.L(r18) == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0583, code lost:
    
        android.util.Log.v(r0, "Ignoring Animation set on " + r7 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0564, code lost:
    
        if (androidx.fragment.app.j1.L(r18) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0566, code lost:
    
        android.util.Log.v(r0, "Ignoring Animation set on " + r7 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x05a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01fb, code lost:
    
        r7 = new java.util.ArrayList();
        r10 = new java.util.ArrayList();
        r9 = new s.e(0);
        r13 = new java.util.ArrayList<>();
        r17 = new java.util.ArrayList<>();
        r1 = new s.e(0);
        r20 = r13;
        r13 = new s.e(0);
        r21 = r2.iterator();
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x022d, code lost:
    
        if (r21.hasNext() == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x022f, code lost:
    
        r6 = ((androidx.fragment.app.q) r21.next()).f2046d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0239, code lost:
    
        if (r6 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023b, code lost:
    
        if (r4 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x023d, code lost:
    
        r23 = r2;
        r2 = r4.f1905c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0241, code lost:
    
        if (r8 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0243, code lost:
    
        r24 = r7;
        r7 = r8.f1905c;
        r6 = r5.y(r5.h(r6));
        r25 = r5;
        r5 = r7.getSharedElementSourceNames();
        r26 = r10;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "lastIn.fragment.sharedElementSourceNames");
        r10 = r2.getSharedElementSourceNames();
        r27 = r11;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "firstOut.fragment.sharedElementSourceNames");
        r11 = r2.getSharedElementTargetNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "firstOut.fragment.sharedElementTargetNames");
        r14 = r11.size();
        r28 = r15;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0278, code lost:
    
        if (r15 >= r14) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x027a, code lost:
    
        r17 = r14;
        r14 = r5.indexOf(r11.get(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0284, code lost:
    
        if (r14 == (-1)) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0286, code lost:
    
        r5.set(r14, r10.get(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x028d, code lost:
    
        r15 = r15 + 1;
        r14 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0292, code lost:
    
        r10 = r7.getSharedElementTargetNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "lastIn.fragment.sharedElementTargetNames");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x029b, code lost:
    
        if (r31 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x029d, code lost:
    
        r2.getExitTransitionCallback();
        r7.getEnterTransitionCallback();
        r11 = new kotlin.Pair(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02b8, code lost:
    
        if (r11.f19192a != null) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02bc, code lost:
    
        if (r11.f19193b != null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02be, code lost:
    
        r11 = r5.size();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02c3, code lost:
    
        if (r15 >= r11) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02c5, code lost:
    
        r14 = r5.get(r15);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, "exitingNames[i]");
        r0 = r10.get(r15);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "enteringNames[i]");
        r9.put(r14, r0);
        r15 = r15 + 1;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02eb, code lost:
    
        if (androidx.fragment.app.j1.L(r18) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ed, code lost:
    
        android.util.Log.v("FragmentManager", ">>> entering view names <<<");
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02fc, code lost:
    
        if (r0.hasNext() == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02fe, code lost:
    
        android.util.Log.v("FragmentManager", "Name: " + r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0314, code lost:
    
        android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
        r0 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0321, code lost:
    
        if (r0.hasNext() == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0323, code lost:
    
        android.util.Log.v("FragmentManager", "Name: " + r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0339, code lost:
    
        r0 = r2.mView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "firstOut.fragment.mView");
        o(r1, r0);
        r1.m(r5);
        r9.m(r1.keySet());
        r0 = r7.mView;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "lastIn.fragment.mView");
        o(r13, r0);
        r13.m(r10);
        r13.m(r9.values());
        r0 = androidx.fragment.app.t1.f2090a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, "namedViews");
        r0 = r9.f22575c - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0370, code lost:
    
        if ((-1) >= r0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x037c, code lost:
    
        if (r13.containsKey((java.lang.String) r9.j(r0)) != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x037e, code lost:
    
        r9.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0381, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0384, code lost:
    
        r0 = r9.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "sharedElementNameMapping.keys");
        r2 = r1.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "entries");
        r14 = 0;
        r11 = new androidx.fragment.app.r(r14, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, "predicate");
        kotlin.collections.z.p(r2, r11, false);
        r2 = r9.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "sharedElementNameMapping.values");
        r11 = r13.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "entries");
        r7 = new androidx.fragment.app.r(r14, r2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "predicate");
        kotlin.collections.z.p(r11, r7, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03c9, code lost:
    
        if (r9.isEmpty() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03cb, code lost:
    
        android.util.Log.i("FragmentManager", "Ignoring shared elements transition " + r6 + " between " + r4 + " and " + r8 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
        r24.clear();
        r26.clear();
        r17 = r5;
        r20 = r10;
        r6 = 0;
        r2 = r23;
        r7 = r24;
        r5 = r25;
        r10 = r26;
        r11 = r27;
        r15 = r28;
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0410, code lost:
    
        r17 = r5;
        r22 = r6;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0418, code lost:
    
        r6 = r14;
        r2 = r23;
        r7 = r24;
        r5 = r25;
        r10 = r26;
        r11 = r27;
        r15 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x042b, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0431, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02aa, code lost:
    
        r2.getEnterTransitionCallback();
        r7.getExitTransitionCallback();
        r11 = new kotlin.Pair(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0432, code lost:
    
        r25 = r5;
        r24 = r7;
        r26 = r10;
        r27 = r11;
        r28 = r15;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x043e, code lost:
    
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0444, code lost:
    
        r23 = r2;
        r25 = r5;
        r24 = r7;
        r26 = r10;
        r27 = r11;
        r28 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0451, code lost:
    
        if (r22 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0457, code lost:
    
        if (r23.isEmpty() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0459, code lost:
    
        r15 = "effect";
        r0 = "FragmentManager";
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x045d, code lost:
    
        r0 = r23.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0465, code lost:
    
        if (r0.hasNext() == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x046f, code lost:
    
        if (((androidx.fragment.app.q) r0.next()).f2044b != null) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0472, code lost:
    
        r15 = "effect";
        r0 = "FragmentManager";
        r1 = new androidx.fragment.app.p(r23, r4, r8, r25, r22, r24, r26, r9, r20, r17, r1, r13, r31);
        r2 = r23.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0495, code lost:
    
        if (r2.hasNext() == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0497, code lost:
    
        r3 = ((androidx.fragment.app.q) r2.next()).f1994a;
        r3.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r15);
        r3.j.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        r8 = (androidx.fragment.app.f2) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        if (androidx.fragment.app.j1.L(r18) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r4 + " to " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        r15 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r5 = ((androidx.fragment.app.f2) kotlin.collections.CollectionsKt.K(r30)).f1905c;
        r6 = r30.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010a, code lost:
    
        if (r6.hasNext() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        r7 = ((androidx.fragment.app.f2) r6.next()).f1905c.mAnimationInfo;
        r9 = r5.mAnimationInfo;
        r7.f1935b = r9.f1935b;
        r7.f1936c = r9.f1936c;
        r7.f1937d = r9.f1937d;
        r7.f1938e = r9.f1938e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        r1 = r30.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012d, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        if (r1.hasNext() == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0136, code lost:
    
        r5 = (androidx.fragment.app.f2) r1.next();
        r15.add(new androidx.fragment.app.g(r5, r31));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0146, code lost:
    
        if (r31 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0148, code lost:
    
        if (r5 != r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0152, code lost:
    
        r2.add(new androidx.fragment.app.q(r5, r31, r9));
        r7 = new androidx.fragment.app.c(r6, r29, r5);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "listener");
        r5.f1906d.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014d, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014f, code lost:
    
        if (r5 != r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0168, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
    
        if (r2.hasNext() == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        r5 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0182, code lost:
    
        if (((androidx.fragment.app.q) r5).a() != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0184, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0188, code lost:
    
        r2 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0195, code lost:
    
        if (r1.hasNext() == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0197, code lost:
    
        r5 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a2, code lost:
    
        if (((androidx.fragment.app.q) r5).b() == null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a4, code lost:
    
        r2.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a8, code lost:
    
        r1 = r2.iterator();
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b1, code lost:
    
        if (r1.hasNext() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b3, code lost:
    
        r7 = (androidx.fragment.app.q) r1.next();
        r9 = r7.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bd, code lost:
    
        if (r5 == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bf, code lost:
    
        if (r9 != r5) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ec, code lost:
    
        throw new java.lang.IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + r7.f1994a.f1905c + " returned Transition " + r7.f2044b + " which uses a different Transition type than other Fragments.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ed, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f1, code lost:
    
        if (r5 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f3, code lost:
    
        r0 = "FragmentManager";
        r27 = r11;
        r28 = r15;
        r15 = "effect";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04ab, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r3 = r28.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04bd, code lost:
    
        if (r3.hasNext() == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04bf, code lost:
    
        kotlin.collections.z.n(((androidx.fragment.app.g) r3.next()).f1994a.f1912k, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x04cd, code lost:
    
        r2 = r2.isEmpty();
        r3 = r28.iterator();
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x04da, code lost:
    
        if (r3.hasNext() == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04dc, code lost:
    
        r4 = (androidx.fragment.app.g) r3.next();
        r7 = r29.f1988a.getContext();
        r8 = r4.f1994a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "context");
        r7 = r4.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x04f5, code lost:
    
        if (r7 != null) goto L229;
     */
    @Override // androidx.fragment.app.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList operations, boolean z5) {
        i2 i2Var;
        i2 i2Var2;
        i2 i2Var3;
        int i5;
        float f6;
        Object obj;
        Object obj2;
        i2 i2Var4;
        i2 i2Var5;
        Intrinsics.checkNotNullParameter(operations, "operations");
        int i10 = 2;
        if (j1.L(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = operations.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i2Var = i2.f1959c;
            i2Var2 = i2.f1958b;
            i2Var3 = i2.f1960d;
            if (!hasNext) {
                i5 = i10;
                f6 = 0.0f;
                obj = null;
                break;
            }
            obj = it.next();
            f6 = 0.0f;
            f2 f2Var = (f2) obj;
            i5 = i10;
            View view = f2Var.f1905c.mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i2Var5 = i2Var2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(visibility, "Unknown visibility "));
                    }
                    i2Var5 = i2Var;
                }
                if (i2Var5 != i2Var2 && f2Var.f1903a != i2Var2) {
                    break;
                } else {
                    i10 = i5;
                }
            }
            i2Var5 = i2Var3;
            if (i2Var5 != i2Var2) {
            }
            i10 = i5;
        }
        f2 f2Var2 = (f2) obj;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            f2 f2Var3 = (f2) obj2;
            View view2 = f2Var3.f1905c.mView;
            Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (view2.getAlpha() != f6 || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    i2Var4 = i2Var2;
                } else if (visibility2 != 4) {
                    if (visibility2 != 8) {
                        throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(visibility2, "Unknown visibility "));
                    }
                    i2Var4 = i2Var;
                }
                if (i2Var4 == i2Var2 && f2Var3.f1903a == i2Var2) {
                    break;
                }
            }
            i2Var4 = i2Var3;
            if (i2Var4 == i2Var2) {
            }
        }
    }
}
