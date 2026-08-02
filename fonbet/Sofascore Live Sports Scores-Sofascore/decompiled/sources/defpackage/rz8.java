package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class rz8 {
    public static final inb a;
    public static final f7a b;
    public static final uic c;
    public static final tc3 d = new tc3(-1571959902, new ed3(10), false);
    public static final tc3 e = new tc3(-1949713426, new pd3(7), false);
    public static final tc3 f = new tc3(126972041, new pd3(8), false);
    public static final int[] g = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
    public static final f8h h = new f8h(26);
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final n2f j = new n2f(3);
    public static final Object k = new Object();
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;

    static {
        int i2 = 16;
        a = new inb(i2);
        b = new f7a(i2);
        c = new uic(i2);
    }

    public static final vf8 A(Context context) {
        return new vf8(new u00(context, 0), new v00(Build.VERSION.SDK_INT >= 31 ? xg8.a.a(context) : 0));
    }

    public static void B(lw1 lw1Var, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 <= i7) {
                    lw1Var.b(i6, i5);
                    lw1Var.b(i6, i7);
                    lw1Var.b(i5, i6);
                    lw1Var.b(i7, i6);
                    i6++;
                }
            }
        }
        int i8 = i2 - i3;
        lw1Var.b(i8, i8);
        int i9 = i8 + 1;
        lw1Var.b(i9, i8);
        lw1Var.b(i8, i9);
        int i10 = i2 + i3;
        lw1Var.b(i10, i8);
        lw1Var.b(i10, i9);
        lw1Var.b(i10, i10 - 1);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:340)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:272)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:77)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:57)
        */
    public static boolean C(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.length()
            if (r6 != r7) goto L7
            goto L31
        L7:
            int r1 = r7.length()
            r2 = 0
            if (r0 == r1) goto Lf
            goto L30
        Lf:
            r1 = r2
        L10:
            if (r1 >= r0) goto L31
            char r3 = r6.charAt(r1)
            char r4 = r7.charAt(r1)
            if (r3 != r4) goto L1d
            goto L2d
        L1d:
            r3 = r3 | 32
            int r3 = r3 + (-97)
            char r3 = (char) r3
            r5 = 26
            if (r3 >= r5) goto L30
            r4 = r4 | 32
            int r4 = r4 + (-97)
            char r4 = (char) r4
            if (r3 != r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto L10
        L30:
            return r2
        L31:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz8.C(java.lang.String, java.lang.String):boolean");
    }

    public static kw1 D(kw1 kw1Var, int i2, int i3) {
        nw8 nw8Var;
        int i4 = kw1Var.b / i3;
        if (i3 == 4) {
            nw8Var = nw8.j;
        } else if (i3 == 6) {
            nw8Var = nw8.i;
        } else if (i3 == 8) {
            nw8Var = nw8.l;
        } else if (i3 == 10) {
            nw8Var = nw8.h;
        } else {
            if (i3 != 12) {
                a70.p("Unsupported word size ".concat(String.valueOf(i3)));
                return null;
            }
            nw8Var = nw8.g;
        }
        k1d k1dVar = new k1d(nw8Var);
        int i5 = i2 / i3;
        int[] iArr = new int[i5];
        int i6 = kw1Var.b / i3;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                i8 |= kw1Var.d((i7 * i3) + i9) ? 1 << ((i3 - i9) - 1) : 0;
            }
            iArr[i7] = i8;
        }
        k1dVar.p(i5 - i4, iArr);
        kw1 kw1Var2 = new kw1();
        kw1Var2.b(0, i2 % i3);
        for (int i10 = 0; i10 < i5; i10++) {
            kw1Var2.b(iArr[i10], i3);
        }
        return kw1Var2;
    }

    public static final int E(float f2) {
        return wzb.b(llf.b(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f);
    }

    public static final int F(float f2) {
        return E(1.0f - f2);
    }

    public static final void G(BroadcastReceiver broadcastReceiver, CoroutineContext coroutineContext, Function2 function2) {
        ad2 c2 = s9a.c(e.d(tz9.o(), coroutineContext));
        xw3.L(c2, null, null, new u1(function2, c2, broadcastReceiver.goAsync(), (rq3) null, 12), 3);
    }

    public static boolean H(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static final boolean I(int i2, int i3, String str) {
        str.getClass();
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && wol.m(str.charAt(i2 + 1)) != -1 && wol.m(str.charAt(i4)) != -1;
    }

    public static boolean J(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static Pair Q(List list, Context context, Function1 function1) {
        Boolean bool;
        list.getClass();
        i31 i31Var = new i31(2, new cp(function1, 14), function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            j67 j67Var = (j67) function1.invoke(obj);
            if (j67Var != null) {
                FantasyLeagueType fantasyLeagueType = j67Var.j;
                bool = Boolean.valueOf(fantasyLeagueType == FantasyLeagueType.GLOBAL || fantasyLeagueType == FantasyLeagueType.COUNTRY || fantasyLeagueType == FantasyLeagueType.RANDOM);
            } else {
                bool = null;
            }
            if (Intrinsics.c(bool, Boolean.TRUE)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new Pair(S(arrayList2, context, function1), CollectionsKt.H0(arrayList, i31Var));
    }

    public static String R(int i2, int i3, int i4, String str) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z = (i4 & 4) == 0;
        str.getClass();
        int i6 = i2;
        while (i6 < i3) {
            char charAt = str.charAt(i6);
            if (charAt == '%' || (charAt == '+' && z)) {
                x52 x52Var = new x52();
                x52Var.f1(i2, i6, str);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            x52Var.Y0(32);
                            i6++;
                        }
                        x52Var.h1(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int m2 = wol.m(str.charAt(i6 + 1));
                        int m3 = wol.m(str.charAt(i5));
                        if (m2 != -1 && m3 != -1) {
                            x52Var.Y0((m2 << 4) + m3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        x52Var.h1(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return x52Var.E0();
            }
            i6++;
        }
        return str.substring(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static List S(List list, Context context, Function1 function1) {
        ?? r0;
        List split$default;
        SharedPreferences d2;
        list.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        String string = sharedPreferences.getString("PRIVATE_LEAGUES_ORDER_PREF", null);
        if (string != null) {
            split$default = StringsKt__StringsKt.split$default(string, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
            r0 = new ArrayList();
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                if (intOrNull != null) {
                    r0.add(intOrNull);
                }
            }
        } else {
            r0 = km5.a;
        }
        nh0 X0 = CollectionsKt.X0(r0);
        int c2 = sub.c(k13.r(X0, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        Iterator it2 = X0.iterator();
        while (true) {
            sc5 sc5Var = (sc5) it2;
            if (!sc5Var.b.hasNext()) {
                return CollectionsKt.H0(list, new i31(3, rub.b(linkedHashMap, new r41((List) r0, 4)), function1));
            }
            IndexedValue indexedValue = (IndexedValue) sc5Var.next();
            linkedHashMap.put(Integer.valueOf(((Number) indexedValue.b).intValue()), Integer.valueOf(indexedValue.a));
        }
    }

    public static final void T(Point2D point2D, Point2D point2D2, Point2D point2D3, float f2) {
        point2D.getClass();
        point2D2.getClass();
        point2D3.getClass();
        point2D.setX(point2D2.getX() + ((point2D3.getX() - point2D2.getX()) * f2));
        point2D.setY(point2D2.getY() + ((point2D3.getY() - point2D2.getY()) * f2));
    }

    public static final void U(Rect rect, float f2, float f3, float f4, float f5) {
        rect.getClass();
        rect.set(wzb.b(f2), wzb.b(f3), wzb.b(f4), wzb.b(f5));
    }

    public static kw1 V(kw1 kw1Var, int i2) {
        kw1 kw1Var2 = new kw1();
        int i3 = kw1Var.b;
        int i4 = (1 << i2) - 2;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = i5 + i7;
                if (i8 >= i3 || kw1Var.d(i8)) {
                    i6 |= 1 << ((i2 - 1) - i7);
                }
            }
            int i9 = i6 & i4;
            if (i9 == i4) {
                kw1Var2.b(i9, i2);
            } else if (i9 == 0) {
                kw1Var2.b(i6 | 1, i2);
            } else {
                kw1Var2.b(i6, i2);
                i5 += i2;
            }
            i5--;
            i5 += i2;
        }
        return kw1Var2;
    }

    public static String W(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (J(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (J(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String X(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (H(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (H(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final void a(f2f f2fVar, tc3 tc3Var, ykj ykjVar, tc3 tc3Var2, of3 of3Var, int i2) {
        f2f f2fVar2;
        int i3;
        e1d e1dVar;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1221877520);
        if ((i2 & 6) == 0) {
            f2fVar2 = f2fVar;
            i3 = (av8Var.g(f2fVar2) ? 4 : 2) | i2;
        } else {
            f2fVar2 = f2fVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? av8Var.g(ykjVar) : av8Var.i(ykjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i2 & 3072;
        utc utcVar = utc.a;
        if (i4 == 0) {
            i3 |= av8Var.g(utcVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.i(null) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= av8Var.h(false) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.h(true) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= av8Var.i(tc3Var2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (av8Var.T(i5 & 1, (38347923 & i5) != 38347922)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = androidx.compose.runtime.e.f(Boolean.FALSE);
                av8Var.n0(O2);
            }
            e1d e1dVar2 = (e1d) O2;
            k1c c2 = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            if (ykjVar.b()) {
                av8Var.d0(-1891243071);
                e1dVar = e1dVar2;
                t(f2fVar2, ykjVar, ku3Var, false, e1dVar, tc3Var, av8Var, (i5 & 14) | 196608 | ((i5 >> 3) & 112) | ((i5 >> 6) & 896) | ((i5 << 15) & 3670016));
                z = false;
                av8Var.s(false);
            } else {
                e1dVar = e1dVar2;
                z = false;
                av8Var.d0(-1890863476);
                av8Var.s(false);
            }
            u(ykjVar, e1dVar, tc3Var2, av8Var, ((i5 >> 18) & 14) | 384 | ((i5 >> 3) & 112) | ((i5 >> 12) & 7168) | (57344 & (i5 << 3)) | ((i5 >> 9) & 458752));
            av8Var.s(true);
            boolean z2 = ((i5 & 896) == 256 || ((i5 & 512) != 0 && av8Var.i(ykjVar))) ? true : z;
            Object O3 = av8Var.O();
            if (z2 || O3 == a99Var) {
                O3 = new u2(ykjVar, 21);
                av8Var.n0(O3);
            }
            hz8.d(ykjVar, (Function1) O3, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(f2fVar, tc3Var, ykjVar, tc3Var2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function0 function0, xtc xtcVar, boolean z, vn4 vn4Var, uah uahVar, qz1 qz1Var, un4 un4Var, p3e p3eVar, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        boolean z2;
        vn4 vn4Var2;
        int i5;
        p3e p3eVar2;
        int i6;
        av8 av8Var;
        boolean z3;
        vn4 vn4Var3;
        p3e p3eVar3;
        eqf u;
        float f2;
        int i7;
        p3e p3eVar4;
        long j2;
        wzc wzcVar;
        vn4 vn4Var4;
        d80 d80Var;
        int i8;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1084573925);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.i(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            z2 = z;
            i4 |= av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= av8Var2.g(null) ? a.o : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    vn4Var2 = vn4Var;
                    if (av8Var2.g(vn4Var2)) {
                        i8 = 16384;
                        i4 |= i8;
                    }
                } else {
                    vn4Var2 = vn4Var;
                }
                i8 = 8192;
                i4 |= i8;
            } else {
                vn4Var2 = vn4Var;
            }
            if ((196608 & i2) == 0) {
                i4 |= av8Var2.g(uahVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
            if ((i2 & 1572864) == 0) {
                i4 |= av8Var2.g(qz1Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((i2 & 12582912) == 0) {
                i4 |= av8Var2.g(un4Var) ? 8388608 : 4194304;
            }
            i5 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i5 == 0) {
                i4 |= 100663296;
                p3eVar2 = p3eVar;
            } else {
                p3eVar2 = p3eVar;
                if ((i2 & 100663296) == 0) {
                    i4 |= av8Var2.g(p3eVar2) ? 67108864 : 33554432;
                }
            }
            if ((i2 & 805306368) == 0) {
                i4 |= av8Var2.i(tc3Var) ? 536870912 : 268435456;
            }
            i6 = i4;
            boolean z4 = true;
            if (av8Var2.T(i6 & 1, (i4 & 306783379) == 306783378)) {
                av8Var = av8Var2;
                av8Var.W();
                z3 = z2;
                vn4Var3 = vn4Var2;
                p3eVar3 = p3eVar2;
            } else {
                av8Var2.Y();
                int i10 = i2 & 1;
                Object obj = nf3.a;
                if (i10 == 0 || av8Var2.B()) {
                    if (i9 != 0) {
                        z2 = true;
                    }
                    if ((i3 & 16) != 0) {
                        t3e t3eVar = r72.a;
                        boolean d2 = av8Var2.d(2.0f) | av8Var2.d(8.0f) | av8Var2.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) | av8Var2.d(4.0f) | av8Var2.d(4.0f);
                        Object O = av8Var2.O();
                        if (d2 || O == obj) {
                            O = new vn4();
                            av8Var2.n0(O);
                        }
                        f2 = 0.0f;
                        vn4Var2 = (vn4) O;
                        i7 = i6 & (-57345);
                    } else {
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        i7 = i6;
                    }
                    p3eVar4 = i5 != 0 ? r72.a : p3eVar2;
                } else {
                    av8Var2.W();
                    i7 = (i3 & 16) != 0 ? i6 & (-57345) : i6;
                    p3eVar4 = p3eVar2;
                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                boolean z5 = z2;
                av8Var2.t();
                av8Var2.d0(497721888);
                Object O2 = av8Var2.O();
                if (O2 == obj) {
                    O2 = mz1.e(av8Var2);
                }
                wzc wzcVar2 = (wzc) O2;
                av8Var2.s(false);
                int i11 = i7 >> 6;
                av8Var2.d0(-2133647540);
                e1d g2 = androidx.compose.runtime.e.g(new r13(z5 ? un4Var.b : un4Var.d), av8Var2);
                av8Var2.s(false);
                Object O3 = av8Var2.O();
                if (O3 == obj) {
                    O3 = new b42(2);
                    av8Var2.n0(O3);
                }
                xtc a2 = o3h.a(xtcVar, false, (Function1) O3);
                av8Var2.d0(-655254499);
                e1d g3 = androidx.compose.runtime.e.g(new r13(z5 ? un4Var.a : un4Var.c), av8Var2);
                av8Var2.s(false);
                long j3 = ((r13) g3.getValue()).a;
                long c2 = r13.c(((r13) g2.getValue()).a, 1.0f);
                if (vn4Var2 == null) {
                    av8Var2.d0(498128545);
                    av8Var2.s(false);
                    wzcVar = wzcVar2;
                    j2 = c2;
                    vn4Var4 = vn4Var2;
                    d80Var = null;
                } else {
                    av8Var2.d0(1401541984);
                    av8Var2.d0(-1588756907);
                    Object O4 = av8Var2.O();
                    if (O4 == obj) {
                        O4 = new SnapshotStateList();
                        av8Var2.n0(O4);
                    }
                    SnapshotStateList snapshotStateList = (SnapshotStateList) O4;
                    boolean g4 = av8Var2.g(wzcVar2);
                    Object O5 = av8Var2.O();
                    if (g4 || O5 == obj) {
                        j2 = c2;
                        O5 = new t72(wzcVar2, snapshotStateList, null, 2);
                        av8Var2.n0(O5);
                    } else {
                        j2 = c2;
                    }
                    hz8.o(av8Var2, wzcVar2, (Function2) O5);
                    i7a i7aVar = (i7a) CollectionsKt.j0(snapshotStateList);
                    float f3 = !z5 ? f2 : i7aVar instanceof l6f ? 8.0f : ((i7aVar instanceof sf9) || (i7aVar instanceof rd8)) ? 4.0f : 2.0f;
                    Object O6 = av8Var2.O();
                    if (O6 == obj) {
                        wzcVar = wzcVar2;
                        O6 = new q50(new p75(f3), lz.h, null, 12);
                        av8Var2.n0(O6);
                    } else {
                        wzcVar = wzcVar2;
                    }
                    q50 q50Var = (q50) O6;
                    p75 p75Var = new p75(f3);
                    boolean i12 = av8Var2.i(q50Var) | av8Var2.d(f3) | ((((i11 & 14) ^ 6) > 4 && av8Var2.h(z5)) || (i11 & 6) == 4);
                    if ((((i11 & 896) ^ 384) <= 256 || !av8Var2.g(vn4Var2)) && (i11 & 384) != 256) {
                        z4 = false;
                    }
                    boolean i13 = i12 | z4 | av8Var2.i(i7aVar);
                    Object O7 = av8Var2.O();
                    if (i13 || O7 == obj) {
                        vn4Var4 = vn4Var2;
                        O7 = new u72(q50Var, f3, z5, vn4Var4, i7aVar, null, 2);
                        av8Var2.n0(O7);
                    } else {
                        vn4Var4 = vn4Var2;
                    }
                    hz8.o(av8Var2, p75Var, (Function2) O7);
                    d80Var = q50Var.c;
                    av8Var2.s(false);
                    av8Var2.s(false);
                }
                av8Var = av8Var2;
                u0a.n(function0, a2, z5, uahVar, j3, j2, qz1Var, d80Var != null ? ((p75) ((eoh) d80Var.b).getValue()).a : f2, wzcVar, yqo.H(-20345758, av8Var2, new cyb(8, g2, p3eVar4, tc3Var)), av8Var, (i7 & 14) | 805306368 | (i7 & 896) | (i11 & 7168) | (i7 & 3670016));
                p3eVar3 = p3eVar4;
                z3 = z5;
                vn4Var3 = vn4Var4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new pm1(function0, xtcVar, z3, vn4Var3, uahVar, qz1Var, un4Var, p3eVar3, tc3Var, i2, i3);
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 8) == 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i5 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i5 == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        i6 = i4;
        boolean z42 = true;
        if (av8Var2.T(i6 & 1, (i4 & 306783379) == 306783378)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void c(boolean z, Function0 function0, Function0 function02, of3 of3Var, int i2) {
        int i3;
        Function0 function03 = function02;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1843233404);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function03) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc b0 = l98.b0(bkh.d(utcVar, 1.0f), 16.0f);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.confirm, av8Var);
            Locale locale = Locale.ROOT;
            String upperCase = v.toUpperCase(locale);
            upperCase.getClass();
            mha.h(upperCase, function0, bkh.d(utcVar, 1.0f), kqh.a, null, z, false, false, 0L, 0, 0, av8Var, (i3 & 112) | 3456 | ((i3 << 15) & 458752), 0, 2000);
            String upperCase2 = oea.v(R.string.cancel, av8Var).toUpperCase(locale);
            upperCase2.getClass();
            mha.h(upperCase2, function02, bkh.d(utcVar, 1.0f), gqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i3 >> 3) & 112) | 3456, 0, 2032);
            function03 = function02;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zq2(z, function0, function03, i2);
        }
    }

    public static final void d(ar2 ar2Var, qug qugVar, Function1 function1, Function0 function0, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        String str = ar2Var.b;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1984701243);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(ar2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(qugVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.i(function0) ? a.o : 1024;
        }
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc c2 = bkh.c(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, c2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String v = oea.v(R.string.choose_your_flag_explainer, av8Var2);
            xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
            yf8 yf8Var = xth.a;
            int i4 = i3;
            udj.c(v, c0, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 48, 0, 131064);
            av8Var = av8Var2;
            o(str, ar2Var.c, ar2Var.d, av8Var, 0);
            tol.b(nyd.a.a(null), yqo.H(-548316175, av8Var, new cyb(10, ar2Var, function1, qugVar)), av8Var, 56);
            boolean z = str != null;
            boolean z2 = (i4 & 896) == 256;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new ri(2, function1);
                av8Var.n0(O);
            }
            c(z, (Function0) O, function0, av8Var, (i4 >> 3) & 896);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i2, 4, ar2Var, qugVar, function1, function0);
        }
    }

    public static final void e(br2 br2Var, qug qugVar, Function0 function0, of3 of3Var, int i2) {
        qugVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-445917993);
        int i3 = (av8Var.i(br2Var) ? 4 : 2) | i2 | (av8Var.g(qugVar) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            e1d x = rfo.x(br2Var.f, av8Var, 0);
            hof hofVar = br2Var.h;
            boolean z = (i3 & 896) == 256;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new ma0(i4, function0);
                av8Var.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var, 0, 14);
            ktm.t((vnb) x.getValue(), null, false, null, null, yqo.H(-1748585936, av8Var, new d67(6, qugVar, br2Var, function0)), av8Var, 196608, 30);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(br2Var, qugVar, function0, i2, 9);
        }
    }

    public static final void f(uv3 uv3Var, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        long j2;
        boolean z2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1097679304);
        int i3 = i2 | (av8Var2.g(uv3Var) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc e2 = bkh.e(xtcVar, 80.0f);
            if (z) {
                av8Var2.d0(1692153355);
                j2 = r13.c(lz.D(R.color.primary_default, av8Var2), 0.12f);
                av8Var2.s(false);
            } else {
                av8Var2.d0(1692154339);
                av8Var2.s(false);
                j2 = r13.h;
            }
            xtc b0 = l98.b0(tol.y(n9e.q(e2, j2, oyn.e), false, false, false, 0L, null, function0, av8Var2, 31), 8.0f);
            mv1 mv1Var = uxf.g;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            String str = uv3Var.b;
            utc utcVar = utc.a;
            td4.k(str, bkh.l(utcVar, 32.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 48, 12);
            if (z) {
                av8Var2.d0(772972622);
                xtc q = n9e.q(bkh.l(n12.a.a(utcVar, uxf.e), 16.0f), lz.D(R.color.primary_default, av8Var2), o7g.a);
                k1c c3 = e12.c(mv1Var, false);
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m3 = av8Var2.m();
                xtc C2 = fqj.C(av8Var2, q);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c3, f50Var);
                waa.K(av8Var2, m3, ff3Var);
                bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                waa.K(av8Var2, C2, f50Var3);
                kq9.b(s6a.N(R.drawable.ic_check, 6, av8Var2), null, bkh.l(utcVar, 12.0f), lz.D(R.color.surface_1, av8Var2), av8Var2, 432, 0);
                av8Var = av8Var2;
                z2 = true;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                z2 = true;
                av8Var.d0(773528080);
                av8Var.s(false);
            }
            av8Var.s(z2);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yq2(uv3Var, z, function0, xtcVar, i2, 0);
        }
    }

    public static final void g(int i2, of3 of3Var, gv9 gv9Var, xtc xtcVar, String str, Function1 function1) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-787917388);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.g(str) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = 6;
            s02.n(l98.b0(bkh.d(xtcVar, 1.0f), 16.0f), new ng0(2.0f, true, new a70(i4)), new ng0(8.0f, true, new a70(i4)), null, 4, 0, yqo.H(-275925329, av8Var, new d67(7, (Object) gv9Var, (Object) str, (Object) function1)), av8Var, 1597872, 40);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new al1(gv9Var, str, function1, xtcVar, i2, 1);
        }
    }

    public static final void h(int i2, v75 v75Var, boolean z, xtc xtcVar, of3 of3Var, int i3) {
        int i4;
        v75Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2111082904);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.g(v75Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            xtc c0 = l98.c0(bkh.d(xtcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String valueOf = String.valueOf(i2 + 1);
            utc utcVar = utc.a;
            xtc p2 = bkh.p(utcVar, 16.0f);
            yf8 yf8Var = xth.a;
            q5a.w(valueOf, p2, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.e(), av8Var, 48, 0, 131064);
            td4.G(v75Var.a, bkh.l(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 40.0f), false, 0L, av8Var, 48, 12);
            udj.c(v75Var.b, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110584);
            q5a.w(z ? v75Var.d : v75Var.c, bkh.p(l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 48.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, new p7j(6), 0L, 0, false, 0, 0, xth.e(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x80(i2, v75Var, z, xtcVar, i3);
        }
    }

    public static final void i(ImageVector imageVector, String str, String str2, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        imageVector.getClass();
        str.getClass();
        str2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1748582017);
        int i3 = i2 | (av8Var.g(imageVector) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(imageVector, null, bkh.l(l98.b0(n9e.q(utcVar, lz.D(R.color.primary_highlight, av8Var), o7g.a), 4.0f), 24.0f), lz.D(R.color.primary_default, av8Var), av8Var, (i3 & 14) | 48, 0);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, (i3 >> 3) & 14, 24960, 110586);
            av8Var.s(true);
            udj.c(str2, l98.f0(utcVar, 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, ((i3 >> 6) & 14) | 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 14, imageVector, str, str2, xtcVar2);
        }
    }

    public static final void j(wu6 wu6Var, Function1 function1, Function1 function12, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-85749949);
        int i3 = (av8Var.g(wu6Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            wkn.a(Boolean.valueOf(wu6Var.b), gz8.x(utc.a, null, null, 3), null, null, yqo.H(1457363202, av8Var, new d67(17, (Object) wu6Var, (Object) function12, function1)), av8Var, 24576, 12);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(wu6Var, function1, function12, i2, 0);
        }
    }

    public static final void k(xu6 xu6Var, Function0 function0, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-52860548);
        int i3 = (av8Var.i(xu6Var) ? 4 : 2) | i2 | (av8Var.i(function0) ? 32 : 16);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            wu6 wu6Var = (wu6) ((eoh) xu6Var.g).getValue();
            int i5 = i3 & 112;
            boolean i6 = (i5 == 32) | av8Var.i(context);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i6 || O == a99Var) {
                O = new xw5(26, function0, context);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            boolean i7 = (i5 == 32) | av8Var.i(context) | av8Var.i(xu6Var);
            Object O2 = av8Var.O();
            if (i7 || O2 == a99Var) {
                O2 = new dr6(i4, function0, context, xu6Var);
                av8Var.n0(O2);
            }
            j(wu6Var, function1, (Function1) O2, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(xu6Var, function0, i2, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static final void l(final wn1 wn1Var, final int i2, final boolean z, ad7 ad7Var, final boolean z2, final xtc xtcVar, long j2, long j3, long j4, long j5, boolean z3, of3 of3Var, final int i3, final int i4, final int i5) {
        long j6;
        long j7;
        int i6;
        ad7 ad7Var2;
        final long j8;
        final long j9;
        final long j10;
        final long j11;
        av8 av8Var;
        long j12;
        long j13;
        boolean z4;
        long j14;
        int i7;
        long j15;
        av8 av8Var2;
        zg3 zg3Var;
        long j16;
        ?? r4;
        av8 av8Var3;
        av8 av8Var4;
        Object px6Var;
        int i8;
        int i9;
        av8 av8Var5 = (av8) of3Var;
        av8Var5.f0(1717816537);
        int i10 = i3 | (av8Var5.g(wn1Var) ? 4 : 2) | (av8Var5.e(i2) ? 32 : 16) | (av8Var5.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var5.e(ad7Var == null ? -1 : ad7Var.ordinal()) ? a.o : 1024) | (av8Var5.h(z2) ? 16384 : 8192);
        if ((i3 & 196608) == 0) {
            i10 |= av8Var5.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i3 & 1572864) == 0) {
            if ((i5 & 64) == 0) {
                j6 = j2;
                if (av8Var5.f(j6)) {
                    i9 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i10 |= i9;
                }
            } else {
                j6 = j2;
            }
            i9 = 524288;
            i10 |= i9;
        } else {
            j6 = j2;
        }
        if ((i3 & 12582912) == 0) {
            if ((i5 & 128) == 0) {
                j7 = j3;
                if (av8Var5.f(j7)) {
                    i8 = 8388608;
                    i10 |= i8;
                }
            } else {
                j7 = j3;
            }
            i8 = 4194304;
            i10 |= i8;
        } else {
            j7 = j3;
        }
        if ((i3 & 100663296) == 0) {
            i10 |= ((i5 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 && av8Var5.f(j4)) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i10 |= ((i5 & 512) == 0 && av8Var5.f(j5)) ? 536870912 : 268435456;
        }
        int i11 = i5 & 1024;
        if (i11 != 0) {
            i6 = 6;
        } else if ((i4 & 6) == 0) {
            i6 = i4 | (av8Var5.h(z3) ? 4 : 2);
        } else {
            i6 = i4;
        }
        int i12 = i10;
        if (av8Var5.T(i12 & 1, ((i10 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            av8Var5.Y();
            if ((i3 & 1) == 0 || av8Var5.B()) {
                if ((i5 & 64) != 0) {
                    j6 = lz.D(R.color.surface_2, av8Var5);
                    i12 &= -3670017;
                }
                if ((i5 & 128) != 0) {
                    j7 = lz.D(R.color.n_lv_1, av8Var5);
                    i12 &= -29360129;
                }
                if ((i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    j12 = lz.D(R.color.n_lv_3, av8Var5);
                    i12 &= -234881025;
                } else {
                    j12 = j4;
                }
                if ((i5 & 512) != 0) {
                    j13 = lz.D(R.color.live, av8Var5);
                    i12 &= -1879048193;
                } else {
                    j13 = j5;
                }
                if (i11 != 0) {
                    j14 = j13;
                    i7 = i12;
                    j15 = j12;
                    z4 = true;
                } else {
                    z4 = z3;
                    j14 = j13;
                    i7 = i12;
                    j15 = j12;
                }
            } else {
                av8Var5.W();
                if ((i5 & 64) != 0) {
                    i12 &= -3670017;
                }
                if ((i5 & 128) != 0) {
                    i12 &= -29360129;
                }
                if ((i5 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    i12 &= -234881025;
                }
                if ((i5 & 512) != 0) {
                    i12 &= -1879048193;
                }
                j15 = j4;
                j14 = j5;
                z4 = z3;
                i7 = i12;
            }
            av8Var5.t();
            long j17 = wn1Var.p;
            bi4 bi4Var = bi4.PATTERN_DMMHHSS;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            String i13 = fc6.i(j17, hk4.a(bi4Var.d()));
            Context context = (Context) av8Var5.k(nz.b);
            lv1 lv1Var = uxf.m;
            av8Var5.d0(1554275290);
            long j18 = j7;
            xtc q = n9e.q(wnn.A(bkh.d(xtcVar, 1.0f), o7g.a(8.0f)), j6, oyn.e);
            utc utcVar = utc.a;
            if (z4) {
                boolean i14 = av8Var5.i(context) | ((i7 & 14) == 4);
                Object O = av8Var5.O();
                if (i14 || O == nf3.a) {
                    px6Var = new px6(context, wn1Var, 1);
                    av8Var5.n0(px6Var);
                } else {
                    px6Var = O;
                }
                xtc y = tol.y(utcVar, false, false, false, 0L, null, (Function0) px6Var, av8Var5, 31);
                av8Var2 = av8Var5;
                q = q.z(y);
            } else {
                av8Var2 = av8Var5;
            }
            av8Var2.s(false);
            xtc b0 = l98.b0(q, 8.0f);
            wxf wxfVar = ww9.b;
            long j19 = j6;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, b0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            z3 = z4;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            int i15 = i7;
            goa g2 = ljg.g(av8Var2, C, f50Var3, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, g2);
            av8Var2.h0();
            if (av8Var2.S) {
                zg3Var = zg3Var2;
                av8Var2.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            String str = wn1Var.e;
            if (str == null) {
                str = wn1Var.d;
            }
            String str2 = wn1Var.h;
            if (str2 == null) {
                str2 = wn1Var.g;
            }
            String i16 = wv8.i(str, " - ", str2);
            yf8 yf8Var = xth.a;
            zg3 zg3Var3 = zg3Var;
            av8 av8Var6 = av8Var2;
            udj.c(i16, null, j18, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var6, (i15 >> 15) & 896, 24960, 110586);
            udj.c(i13, null, j15, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var6, (i15 >> 18) & 896, 24960, 110586);
            nq8.h(av8Var6, bkh.e(utcVar, 4.0f));
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var6, 48);
            int hashCode3 = Long.hashCode(av8Var6.T);
            aee m4 = av8Var6.m();
            xtc C3 = fqj.C(av8Var6, utcVar);
            av8Var6.h0();
            if (av8Var6.S) {
                av8Var6.l(zg3Var3);
            } else {
                av8Var6.q0();
            }
            waa.K(av8Var6, a4, f50Var);
            waa.K(av8Var6, m4, ff3Var);
            bf3.s(hashCode3, av8Var6, f50Var2, av8Var6, ryVar);
            waa.K(av8Var6, C3, f50Var3);
            long j20 = j14;
            lz.o(wn1Var.b, wn1Var.c, wn1Var.j, wn1Var.k, wn1Var.c(), null, j18, j20, z2, av8Var6, ((i15 >> 3) & 3670016) | ((i15 >> 6) & 29360128) | ((i15 << 12) & 234881024), 32);
            av8 av8Var7 = av8Var6;
            if (wn1Var.t == null || !wn1Var.c()) {
                j16 = j20;
                r4 = 0;
                av8Var7.d0(-2103413365);
                av8Var7.s(false);
                av8Var3 = av8Var7;
            } else {
                av8Var7.d0(-2103760844);
                udj.c(wn1Var.t, l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), j20, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var7, ((i15 >> 21) & 896) | 48, 24960, 110584);
                j16 = j20;
                av8 av8Var8 = av8Var7;
                r4 = 0;
                av8Var8.s(false);
                av8Var3 = av8Var8;
            }
            av8Var3.s(true);
            av8Var3.s(true);
            nq8.h(av8Var3, bkh.p(utcVar, 16.0f));
            ad7Var2 = ad7Var;
            if (ad7Var2 == ad7.c && !z) {
                av8Var3.d0(-461790838);
                kq9.a(haa.t(R.drawable.ic_bench, r4, av8Var3), null, null, j18, av8Var3, ((i15 >> 12) & 7168) | 56, 4);
                av8Var3.s(r4);
                av8Var4 = av8Var3;
            } else if (wn1Var.d()) {
                av8 av8Var9 = av8Var3;
                av8Var9.d0(-461033787);
                av8Var9.s(r4);
                av8Var4 = av8Var9;
            } else {
                av8Var3.d0(-461511187);
                context.getClass();
                String valueOf2 = String.valueOf(i2);
                valueOf2.getClass();
                String string = context.getString(R.string.n_points, valueOf2);
                string.getClass();
                of3 of3Var2 = av8Var3;
                udj.c(string, null, wn1Var.c() ? j16 : j18, null, 0L, null, 0L, (ad7Var2 != ad7.d || z) ? v8j.b : v8j.d, null, 0L, 2, false, 1, 0, null, xth.i(), of3Var2, 0, 24960, 110074);
                av8 av8Var10 = of3Var2;
                av8Var10.s(r4);
                av8Var4 = av8Var10;
            }
            av8Var4.s(true);
            j11 = j16;
            j10 = j15;
            j8 = j19;
            j9 = j18;
            av8Var = av8Var4;
        } else {
            ad7Var2 = ad7Var;
            av8 av8Var11 = av8Var5;
            av8Var11.W();
            j8 = j6;
            j9 = j7;
            j10 = j4;
            j11 = j5;
            av8Var = av8Var11;
        }
        final boolean z5 = z3;
        eqf u = av8Var.u();
        if (u != null) {
            final ad7 ad7Var3 = ad7Var2;
            u.d = new Function2() { // from class: zc7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i3 | 1);
                    int K2 = aba.K(i4);
                    rz8.l(wn1.this, i2, z, ad7Var3, z2, xtcVar, j8, j9, j10, j11, z5, (of3) obj, K, K2, i5);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(vl7 vl7Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        vl7Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2064287545);
        int i3 = 16;
        int i4 = (av8Var.g(vl7Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            kg0 kg0Var = ww9.f;
            xtc A = wnn.A(fz8.d0(xtcVar, n9a.b), o7g.a(8.0f));
            boolean z = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new n37(i3, (Object) vl7Var, function1);
                av8Var.n0(O);
            }
            xtc y = tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            tl7 tl7Var = vl7Var.a;
            am7 am7Var = vl7Var.b;
            String v = oea.v(tl7Var.a, av8Var);
            yf8 yf8Var = xth.a;
            dfj c2 = xth.c();
            long D = lz.D(am7Var.b().c, av8Var);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            long D2 = lz.D(am7Var.b().a, av8Var);
            jf9 jf9Var = oyn.e;
            udj.c(v, l98.c0(n9e.q(d2, D2, jf9Var), 8.0f, 2.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, c2, av8Var, 0, 24960, 109560);
            String upperCase = oea.v(am7Var.a(), av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            udj.c(upperCase, l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(am7Var.b().b, av8Var), jf9Var), 8.0f, 6.0f), lz.D(am7Var.b().d, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 109560);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(vl7Var, function1, xtcVar, i2, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(xtc xtcVar, final int i2, final int i3, final String str, dfj dfjVar, Double d2, of3 of3Var, final int i4, final int i5) {
        final xtc xtcVar2;
        int i6;
        int i7;
        dfj dfjVar2;
        int i8;
        int i9;
        Double d3;
        int i10;
        final dfj dfjVar3;
        final Double d4;
        eqf u;
        dfj dfjVar4;
        dfj dfjVar5;
        Double d5;
        Double d6;
        Double d7;
        utc utcVar;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1264636858);
        int i11 = i5 & 1;
        if (i11 != 0) {
            i6 = i2;
            i7 = i4 | 6;
            xtcVar2 = xtcVar;
        } else if ((i4 & 6) == 0) {
            xtcVar2 = xtcVar;
            i7 = i4 | (av8Var.g(xtcVar2) ? 4 : 2);
            i6 = i2;
        } else {
            xtcVar2 = xtcVar;
            i6 = i2;
            i7 = i4;
        }
        int i12 = i7 | (av8Var.e(i6) ? 32 : 16) | (av8Var.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str) ? a.o : 1024);
        if ((i5 & 16) == 0) {
            dfjVar2 = dfjVar;
            if (av8Var.g(dfjVar2)) {
                i8 = 16384;
                int i13 = i12 | i8;
                i9 = i5 & 32;
                if (i9 == 0) {
                    i10 = i13 | 196608;
                    d3 = d2;
                } else {
                    d3 = d2;
                    i10 = i13 | (av8Var.g(d3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
                }
                if (av8Var.T(i10 & 1, (74899 & i10) == 74898)) {
                    av8Var.W();
                    dfjVar3 = dfjVar2;
                    d4 = d3;
                } else {
                    av8Var.Y();
                    int i14 = i4 & 1;
                    utc utcVar2 = utc.a;
                    if (i14 == 0 || av8Var.B()) {
                        if (i11 != 0) {
                            xtcVar2 = utcVar2;
                        }
                        if ((i5 & 16) != 0) {
                            yf8 yf8Var = xth.a;
                            dfjVar4 = xth.j();
                            i10 &= -57345;
                        } else {
                            dfjVar4 = dfjVar2;
                        }
                        if (i9 != 0) {
                            dfjVar5 = dfjVar4;
                            d5 = null;
                            av8Var.t();
                            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
                            int hashCode = Long.hashCode(av8Var.T);
                            aee m2 = av8Var.m();
                            xtc C = fqj.C(av8Var, xtcVar2);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.q0();
                            } else {
                                av8Var.l(zg3Var);
                            }
                            f50 f50Var = hf3.g;
                            waa.K(av8Var, a2, f50Var);
                            ff3 ff3Var = hf3.f;
                            waa.K(av8Var, m2, ff3Var);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var2 = hf3.j;
                            waa.K(av8Var, valueOf, f50Var2);
                            ry ryVar = hf3.k;
                            waa.J(av8Var, ryVar);
                            f50 f50Var3 = hf3.d;
                            waa.K(av8Var, C, f50Var3);
                            k1c c2 = e12.c(uxf.c, false);
                            d6 = d5;
                            xtc xtcVar3 = xtcVar2;
                            int hashCode2 = Long.hashCode(av8Var.T);
                            aee m3 = av8Var.m();
                            xtc C2 = fqj.C(av8Var, utcVar2);
                            av8Var.h0();
                            int i15 = i10;
                            if (av8Var.S) {
                                av8Var.q0();
                            } else {
                                av8Var.l(zg3Var);
                            }
                            waa.K(av8Var, c2, f50Var);
                            waa.K(av8Var, m3, ff3Var);
                            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C2, f50Var3);
                            td4.C(i6, bkh.l(utcVar2, 92.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i15 >> 3) & 14) | 48, 12);
                            xtc l2 = bkh.l(utcVar2, 32.0f);
                            mv1 mv1Var = uxf.i;
                            n12 n12Var = n12.a;
                            td4.G(i3, n12Var.a(l2, mv1Var), false, 0L, av8Var, (i15 >> 6) & 14, 12);
                            if (d6 == null) {
                                av8Var.d0(-1864245988);
                                utcVar = utcVar2;
                                z = true;
                                i9a.j(d6, false, false, bkh.l(n12Var.a(utcVar2, uxf.k), 32.0f), false, false, null, av8Var, ((i15 >> 15) & 14) | 432, 112);
                                d7 = d6;
                                av8Var = av8Var;
                                av8Var.s(false);
                            } else {
                                d7 = d6;
                                utcVar = utcVar2;
                                z = true;
                                av8Var.d0(-1863939956);
                                av8Var.s(false);
                            }
                            av8Var.s(z);
                            av8 av8Var2 = av8Var;
                            udj.c(str != null ? "" : str, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, dfjVar5, av8Var2, 48, (i15 << 9) & 29360128, 130040);
                            av8Var = av8Var2;
                            av8Var.s(z);
                            xtcVar2 = xtcVar3;
                            d4 = d7;
                            dfjVar3 = dfjVar5;
                        } else {
                            dfjVar5 = dfjVar4;
                        }
                    } else {
                        av8Var.W();
                        if ((i5 & 16) != 0) {
                            i10 &= -57345;
                        }
                        dfjVar5 = dfjVar2;
                    }
                    d5 = d3;
                    av8Var.t();
                    u23 a22 = t23.a(ww9.d, uxf.p, av8Var, 48);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m22 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, xtcVar2);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var, a22, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var, m22, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    f50 f50Var22 = hf3.j;
                    waa.K(av8Var, valueOf2, f50Var22);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var, ryVar2);
                    f50 f50Var32 = hf3.d;
                    waa.K(av8Var, C3, f50Var32);
                    k1c c22 = e12.c(uxf.c, false);
                    d6 = d5;
                    xtc xtcVar32 = xtcVar2;
                    int hashCode22 = Long.hashCode(av8Var.T);
                    aee m32 = av8Var.m();
                    xtc C22 = fqj.C(av8Var, utcVar2);
                    av8Var.h0();
                    int i152 = i10;
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, c22, f50Var4);
                    waa.K(av8Var, m32, ff3Var2);
                    bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                    waa.K(av8Var, C22, f50Var32);
                    td4.C(i6, bkh.l(utcVar2, 92.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i152 >> 3) & 14) | 48, 12);
                    xtc l22 = bkh.l(utcVar2, 32.0f);
                    mv1 mv1Var2 = uxf.i;
                    n12 n12Var2 = n12.a;
                    td4.G(i3, n12Var2.a(l22, mv1Var2), false, 0L, av8Var, (i152 >> 6) & 14, 12);
                    if (d6 == null) {
                    }
                    av8Var.s(z);
                    av8 av8Var22 = av8Var;
                    udj.c(str != null ? "" : str, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, dfjVar5, av8Var22, 48, (i152 << 9) & 29360128, 130040);
                    av8Var = av8Var22;
                    av8Var.s(z);
                    xtcVar2 = xtcVar32;
                    d4 = d7;
                    dfjVar3 = dfjVar5;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new Function2() { // from class: vx7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rz8.n(xtc.this, i2, i3, str, dfjVar3, d4, (of3) obj, aba.K(i4 | 1), i5);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            dfjVar2 = dfjVar;
        }
        i8 = 8192;
        int i132 = i12 | i8;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        if (av8Var.T(i10 & 1, (74899 & i10) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void o(String str, String str2, String str3, of3 of3Var, int i2) {
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-845167352);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.g(str3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc e0 = l98.e0(n9e.p(bkh.d(l98.b0(utcVar, 16.0f), 1.0f), wxf.E(b.j(new r13(lz.D(R.color.primary_highlight, av8Var)), new r13(r13.h)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 4), 8.0f, 16.0f, 8.0f, 24.0f);
            k1c c2 = e12.c(uxf.f, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc b0 = l98.b0(utcVar, 8.0f);
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, b0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc p2 = bkh.p(utcVar, 32.0f);
            yf8 yf8Var = xth.a;
            udj.c("11:02", p2, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 54, 0, 130040);
            td4.L(((i3 >> 6) & 14) | 48, av8Var, bkh.l(utcVar, 16.0f), str3);
            if (str != null) {
                av8Var.d0(-573966037);
                z = true;
                td4.k(str, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, (i3 & 14) | 48, 12);
                av8Var.s(false);
            } else {
                z = true;
                av8Var.d0(-573775232);
                kq9.b(s6a.N(R.drawable.team_logo_placeholder, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            }
            udj.c((str2 == null ? "" : str2).concat(":"), null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            udj.c("🏆🏆🏆", null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 6, 0, 131066);
            av8Var = av8Var;
            av8Var.s(z);
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(str, str2, str3, i2, 11);
        }
    }

    public static final void p(bq9 bq9Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(615360643);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(bq9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            q(((i3 << 12) & 3670016) | (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), bq9Var, av8Var, bq9Var.m, bq9Var.n, bq9Var.o, xtcVar, bq9Var.p, function1);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wp9(bq9Var, function1, xtcVar, i2, 1);
        }
    }

    public static final void q(int i2, w31 w31Var, of3 of3Var, ux7 ux7Var, fy7 fy7Var, gv9 gv9Var, xtc xtcVar, TeamSelection teamSelection, Function1 function1) {
        int i3;
        xtc xtcVar2;
        av8 av8Var;
        function1.getClass();
        gv9Var.getClass();
        teamSelection.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(813275335);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(w31Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(fy7Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(ux7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.i(gv9Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.e(teamSelection.ordinal()) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            xtcVar2 = xtcVar;
        }
        int i4 = 1;
        if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
            tc3 H = yqo.H(2136226126, av8Var2, new uu6(24, ux7Var, fy7Var, w31Var));
            tc3 H2 = yqo.H(1387191462, av8Var2, new xp9(i4, gv9Var, teamSelection));
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new yp9(ux7Var, w31Var, function1, fy7Var);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar2, H, H2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i3 >> 18) & 14) | 432, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zp9(w31Var, function1, fy7Var, ux7Var, gv9Var, teamSelection, xtcVar, i2);
        }
    }

    public static final void r(xtc xtcVar, Function2 function2, of3 of3Var, int i2, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1298353104);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function2) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                xtcVar = utc.a;
            }
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new xji(zic.e);
                av8Var.n0(O);
            }
            s((xji) O, xtcVar, function2, av8Var, (i4 << 3) & 1008);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uji(xtcVar, function2, i2, i3);
        }
    }

    public static final void s(xji xjiVar, xtc xtcVar, Function2 function2, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(xjiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            int hashCode = Long.hashCode(av8Var.T);
            androidx.compose.runtime.a S = z8e.S(av8Var);
            xtc C = fqj.C(av8Var, xtcVar);
            aee m2 = av8Var.m();
            zg3 zg3Var = zg3.y;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, xjiVar, xjiVar.c);
            waa.K(av8Var, S, xjiVar.d);
            waa.K(av8Var, function2, xjiVar.e);
            if3.k7.getClass();
            waa.K(av8Var, m2, hf3.f);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            av8Var.s(true);
            if (av8Var.D()) {
                av8Var.d0(-1259187287);
                av8Var.s(false);
            } else {
                av8Var.d0(-1259245908);
                boolean i4 = av8Var.i(xjiVar);
                Object O = av8Var.O();
                if (i4 || O == nf3.a) {
                    O = new o1i(xjiVar, 14);
                    av8Var.n0(O);
                }
                hz8.t((Function0) O, av8Var);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e00(xjiVar, xtcVar, function2, i2, 3);
        }
    }

    public static final void t(f2f f2fVar, ykj ykjVar, ku3 ku3Var, boolean z, e1d e1dVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1413720282);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(f2fVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? av8Var.g(ykjVar) : av8Var.i(ykjVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(ku3Var) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.g(e1dVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            String v = oea.v(R.string.tooltip_description, av8Var);
            boolean i5 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && av8Var.i(ykjVar))) | ((i3 & 896) == 256) | av8Var.i(ku3Var) | ((458752 & i3) == 131072);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new mi(7, ykjVar, ku3Var, e1dVar);
                av8Var.n0(O);
            }
            t20.a(f2fVar, (Function0) O, new g2f(z), yqo.H(-1287705660, av8Var, new kp1(i4, v, tc3Var)), av8Var, (i3 & 14) | 3072, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(f2fVar, ykjVar, ku3Var, z, e1dVar, tc3Var, i2, 0);
        }
    }

    public static final void u(ykj ykjVar, e1d e1dVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1873232064);
        int i4 = 1;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? av8Var.g(ykjVar) : av8Var.i(ykjVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(e1dVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.h(false) ? a.o : 1024;
        }
        int i6 = i2 & 24576;
        utc utcVar = utc.a;
        if (i6 == 0) {
            i3 |= av8Var.g(utcVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.i(tc3Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            xtc z = iz8.z(kik.L(koi.a(koi.a(utcVar, ykjVar, new pp1(ykjVar, i5)), ykjVar, new pp1(ykjVar, i4)).z(new g9e(new fa(9, oea.v(R.string.tooltip_label, av8Var), ku3Var, ykjVar))), new s1(18, ku3Var, ykjVar)), new zi(6, ykjVar, e1dVar));
            k1c c2 = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, z);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            fc6.v((i3 >> 15) & 14, tc3Var, av8Var, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(ykjVar, e1dVar, tc3Var, i2);
        }
    }

    public static xe4 v(ozf ozfVar, String str, jlf jlfVar, int i2) {
        Map map = Collections.EMPTY_MAP;
        Uri L = tba.L(str, jlfVar.c);
        long j2 = jlfVar.a;
        long j3 = jlfVar.b;
        String a2 = ozfVar.a();
        if (a2 == null) {
            a2 = tba.L(((o71) ozfVar.b.get(0)).a, jlfVar.c).toString();
        }
        String str2 = a2;
        z1a.y(L, "The uri must be set.");
        return new xe4(L, 0L, 1, null, awf.g, j2, j3, str2, i2);
    }

    public static String w(int i2, int i3, String str, String str2, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        int i6 = i3;
        boolean z = (i4 & 8) == 0;
        boolean z2 = (i4 & 16) == 0;
        boolean z3 = (i4 & 32) == 0;
        boolean z4 = (i4 & 64) == 0;
        str.getClass();
        return x(str, i5, i6, str2, z, z2, z3, z4, 128);
    }

    public static String x(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        char c2;
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z5 = (i4 & 8) != 0 ? false : z;
        boolean z6 = (i4 & 16) != 0 ? false : z2;
        boolean z7 = (i4 & 64) == 0 ? z4 : false;
        str.getClass();
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z7) || StringsKt.K(str2, (char) codePointAt) || ((codePointAt == 37 && (!z5 || (z6 && !I(i6, length, str)))) || (codePointAt == 43 && z3)))) {
                x52 x52Var = new x52();
                x52Var.f1(i5, i6, str);
                x52 x52Var2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (z5 && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        Unit unit = Unit.a;
                    } else {
                        if (codePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            x52Var.g1("+");
                        } else if (codePointAt2 == 43 && z3) {
                            x52Var.g1(z5 ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z7) || StringsKt.K(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z5 || (z6 && !I(i6, length, str)))))) {
                            if (x52Var2 == null) {
                                x52Var2 = new x52();
                            }
                            x52Var2.h1(codePointAt2);
                            while (!x52Var2.w()) {
                                byte readByte = x52Var2.readByte();
                                int i8 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                x52Var.Y0(37);
                                char[] cArr = l;
                                x52Var.Y0(cArr[(i8 >> 4) & 15]);
                                x52Var.Y0(cArr[readByte & 15]);
                            }
                            c2 = '%';
                            Unit unit2 = Unit.a;
                            i6 += Character.charCount(codePointAt2);
                            i7 = 128;
                        } else {
                            x52Var.h1(codePointAt2);
                        }
                    }
                    c2 = '%';
                    i6 += Character.charCount(codePointAt2);
                    i7 = 128;
                }
                return x52Var.E0();
            }
            i6 += Character.charCount(codePointAt);
        }
        return str.substring(i5, length);
    }

    public static final void y(Rect rect, PointF pointF, int i2, int i3) {
        rect.getClass();
        pointF.getClass();
        float f2 = pointF.x - (i2 / 2);
        float f3 = pointF.y - (i3 / 2);
        U(rect, f2, f3, i2 + f2, i3 + f3);
    }

    public void K() {
    }

    public void L() {
    }

    public void P() {
    }

    public void M(hdg hdgVar) {
    }

    public void N(hdg hdgVar) {
    }

    public void O(uag uagVar) {
    }
}
