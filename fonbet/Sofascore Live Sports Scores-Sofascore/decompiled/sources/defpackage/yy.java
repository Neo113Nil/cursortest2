package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yy extends j0l {
    public final /* synthetic */ int f;
    public final /* synthetic */ p9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy(p9 p9Var, int i) {
        super(4);
        this.f = i;
        this.g = p9Var;
    }

    @Override // defpackage.j0l
    public void i(int i, da daVar, String str, Bundle bundle) {
        switch (this.f) {
            case 0:
                ((dz) this.g).j(i, daVar, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x0845, code lost:
    
        if (r7 == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        if (defpackage.s3h.j(4, r7).isEmpty() != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x082d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0662  */
    /* JADX WARN: Type inference failed for: r5v37, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v39, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.util.ArrayList] */
    @Override // defpackage.j0l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final da l(int i) {
        float f;
        AccessibilityManager accessibilityManager;
        zwh zwhVar;
        dz dzVar;
        xy xyVar;
        szc szcVar;
        s3h s3hVar;
        Resources resources;
        u5g u5gVar;
        l3h l3hVar;
        AccessibilityNodeInfo accessibilityNodeInfo;
        da daVar;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        u5g u5gVar2;
        int i2;
        dz dzVar2;
        boolean z;
        s3h s3hVar2;
        yeb yebVar;
        m9 m9Var;
        m9 m9Var2;
        m9 m9Var3;
        String t;
        ArrayList arrayList;
        CharSequence g;
        dcf dcfVar;
        f13 f13Var;
        wtg wtgVar;
        wtg wtgVar2;
        int d;
        xy xyVar2;
        Bundle bundle;
        int d2;
        String str;
        da daVar2;
        b50 G;
        Object g2;
        Object g3;
        wma wmaVar;
        m9 m9Var4;
        List list;
        wma v;
        boolean z2;
        boolean z3;
        ?? r5;
        ?? r52;
        int i3;
        boolean z4;
        s3h s3hVar3;
        int i4;
        int i5 = this.f;
        p9 p9Var = this.g;
        switch (i5) {
            case 0:
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                dz dzVar3 = (dz) p9Var;
                AccessibilityManager accessibilityManager2 = dzVar3.g;
                xy xyVar3 = dzVar3.d;
                if (xyVar3.getComposeViewContext().c.getLifecycle().b() == e6b.a) {
                    if (!accessibilityManager2.isEnabled()) {
                        daVar2 = new da(AccessibilityNodeInfo.obtain());
                        dzVar2 = dzVar3;
                        i2 = i;
                        if (!dzVar2.o) {
                            return daVar2;
                        }
                        if (i2 == dzVar2.k) {
                            dzVar2.m = daVar2;
                        }
                        if (i2 != dzVar2.l) {
                            return daVar2;
                        }
                        dzVar2.n = daVar2;
                        return daVar2;
                    }
                    daVar2 = null;
                    dzVar2 = dzVar3;
                    i2 = i;
                    if (!dzVar2.o) {
                    }
                } else {
                    u3h u3hVar = (u3h) dzVar3.s().b(i);
                    if (u3hVar == null) {
                        if (!accessibilityManager2.isEnabled()) {
                            daVar2 = new da(AccessibilityNodeInfo.obtain());
                            dzVar2 = dzVar3;
                            i2 = i;
                            if (!dzVar2.o) {
                            }
                        }
                        daVar2 = null;
                        dzVar2 = dzVar3;
                        i2 = i;
                        if (!dzVar2.o) {
                        }
                    } else {
                        s3h s3hVar4 = u3hVar.a;
                        l3h k = s3hVar4.k();
                        wma wmaVar2 = s3hVar4.c;
                        Object g4 = k.a.g(w3h.o);
                        if (g4 == null) {
                            g4 = null;
                        }
                        boolean c = Intrinsics.c(g4, Boolean.TRUE);
                        if (c) {
                            if (!(Build.VERSION.SDK_INT >= 34 ? q9.v(accessibilityManager2) : true)) {
                                dzVar2 = dzVar3;
                                i2 = i;
                                daVar2 = null;
                                if (!dzVar2.o) {
                                }
                            }
                        }
                        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                        da daVar3 = new da(obtain);
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 >= 34) {
                            q9.F(obtain, c);
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            daVar3.h(64, c);
                        }
                        if (i == -1) {
                            Object parentForAccessibility = xyVar3.getParentForAccessibility();
                            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                            daVar3.b = -1;
                            obtain.setParent(view);
                        } else {
                            s3h l = s3hVar4.l();
                            Integer valueOf2 = l != null ? Integer.valueOf(l.f) : null;
                            if (valueOf2 == null) {
                                r3a.c("semanticsNode " + i + " has null parent");
                                pvd.x();
                                return null;
                            }
                            int intValue = valueOf2.intValue();
                            if (intValue == xyVar3.getSemanticsOwner().a().f) {
                                intValue = -1;
                            }
                            daVar3.b = intValue;
                            obtain.setParent(xyVar3, intValue);
                        }
                        daVar3.c = i;
                        obtain.setSource(xyVar3, i);
                        daVar3.j(dzVar3.k(u3hVar));
                        szc szcVar2 = dzVar3.J;
                        zwh zwhVar2 = dzVar3.s;
                        Resources resources2 = xyVar3.getContext().getResources();
                        daVar3.k("android.view.View");
                        l3h l3hVar2 = s3hVar4.d;
                        x0d x0dVar = l3hVar2.a;
                        if (x0dVar.c(w3h.G)) {
                            daVar3.k("android.widget.EditText");
                        }
                        if (x0dVar.c(w3h.C)) {
                            daVar3.k("android.widget.TextView");
                        }
                        Object g5 = x0dVar.g(w3h.z);
                        if (g5 == null) {
                            g5 = null;
                        }
                        u5g u5gVar3 = (u5g) g5;
                        if (u5gVar3 != null) {
                            int i7 = u5gVar3.a;
                            if (!s3hVar4.o()) {
                                accessibilityManager = accessibilityManager2;
                                i4 = 4;
                                zwhVar = zwhVar2;
                                break;
                            } else {
                                accessibilityManager = accessibilityManager2;
                                i4 = 4;
                                zwhVar = zwhVar2;
                            }
                            if (i7 == i4) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                            } else if (i7 == 2) {
                                obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                            } else {
                                String P = yfa.P(i7);
                                if (i7 != 5 || s3hVar4.q() || l3hVar2.c) {
                                    daVar3.k(P);
                                }
                            }
                            Unit unit = Unit.a;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            zwhVar = zwhVar2;
                        }
                        obtain.setPackageName(xyVar3.getContext().getPackageName());
                        obtain.setImportantForAccessibility(rd0.K(s3hVar4));
                        boolean v2 = i6 >= 34 ? q9.v(accessibilityManager) : true;
                        List j = s3h.j(4, s3hVar4);
                        int size = j.size();
                        boolean z5 = v2;
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            AccessibilityNodeInfo accessibilityNodeInfo3 = daVar3.a;
                            if (i9 < size) {
                                int i10 = size;
                                s3h s3hVar5 = (s3h) j.get(i9);
                                List list2 = j;
                                p6a s = dzVar3.s();
                                int i11 = i9;
                                int i12 = s3hVar5.f;
                                if (s.a(i12)) {
                                    b50 b50Var = xyVar3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(s3hVar5.c);
                                    if (i12 != -1) {
                                        if (b50Var != null) {
                                            obtain.addChild(b50Var);
                                        } else {
                                            u3h u3hVar2 = (u3h) dzVar3.s().b(i12);
                                            if (u3hVar2 == null || (s3hVar3 = u3hVar2.a) == null) {
                                                z4 = false;
                                            } else {
                                                Object g6 = s3hVar3.k().a.g(w3h.o);
                                                if (g6 == null) {
                                                    g6 = null;
                                                }
                                                z4 = Intrinsics.c(g6, Boolean.TRUE);
                                            }
                                            if (z5 || !z4) {
                                                accessibilityNodeInfo3.addChild(xyVar3, i12);
                                            }
                                        }
                                        szcVar2.f(i12, i8);
                                        i8++;
                                    }
                                }
                                i9 = i11 + 1;
                                j = list2;
                                size = i10;
                            } else {
                                if (i == dzVar3.k) {
                                    accessibilityNodeInfo3.setAccessibilityFocused(true);
                                    daVar3.b(x9.g);
                                } else {
                                    accessibilityNodeInfo3.setAccessibilityFocused(false);
                                    daVar3.b(x9.f);
                                }
                                q80 B = wkn.B(s3hVar4);
                                if (B != null) {
                                    sf8 fontFamilyResolver = xyVar3.getFontFamilyResolver();
                                    kx4 density = xyVar3.getDensity();
                                    l2a l2aVar = dzVar3.F;
                                    xyVar = xyVar3;
                                    String str2 = B.b;
                                    dzVar = dzVar3;
                                    List list3 = B.a;
                                    SpannableString spannableString2 = new SpannableString(str2);
                                    ArrayList arrayList2 = B.c;
                                    szcVar = szcVar2;
                                    if (arrayList2 != null) {
                                        int size2 = arrayList2.size();
                                        int i13 = 0;
                                        while (i13 < size2) {
                                            int i14 = i13;
                                            p80 p80Var = (p80) arrayList2.get(i13);
                                            ArrayList arrayList3 = arrayList2;
                                            pwh pwhVar = (pwh) p80Var.a;
                                            int i15 = size2;
                                            int i16 = p80Var.b;
                                            int i17 = p80Var.c;
                                            u5g u5gVar4 = u5gVar3;
                                            l3h l3hVar3 = l3hVar2;
                                            s3h s3hVar6 = s3hVar4;
                                            pwh a = pwh.a(pwhVar, 0L, 65503);
                                            tf8 tf8Var = a.f;
                                            ycj ycjVar = a.a;
                                            zcj zcjVar = a.j;
                                            v8j v8jVar = a.m;
                                            Resources resources3 = resources2;
                                            rg8 rg8Var = a.d;
                                            AccessibilityNodeInfo accessibilityNodeInfo4 = obtain;
                                            da daVar4 = daVar3;
                                            jca.Q(spannableString2, ycjVar.b(), i16, i17);
                                            SpannableString spannableString3 = spannableString2;
                                            jca.R(spannableString3, a.b, density, i16, i17);
                                            wg8 wg8Var = a.c;
                                            if (wg8Var == null && rg8Var == null) {
                                                i3 = 33;
                                            } else {
                                                if (wg8Var == null) {
                                                    wg8Var = wg8.g;
                                                }
                                                StyleSpan styleSpan = new StyleSpan(n4o.C(rg8Var != null ? rg8Var.a : 0, wg8Var));
                                                i3 = 33;
                                                spannableString3.setSpan(styleSpan, i16, i17, 33);
                                            }
                                            if (tf8Var != null) {
                                                if (tf8Var instanceof mw8) {
                                                    spannableString3.setSpan(new TypefaceSpan(((mw8) tf8Var).f), i16, i17, i3);
                                                } else if (Build.VERSION.SDK_INT >= 28) {
                                                    sg8 sg8Var = a.e;
                                                    Object value = sf8.a(fontFamilyResolver, tf8Var, null, sg8Var != null ? sg8Var.a : 65535, 6).getValue();
                                                    value.getClass();
                                                    i3 = 33;
                                                    spannableString3.setSpan(c90.l((Typeface) value), i16, i17, 33);
                                                } else {
                                                    i3 = 33;
                                                }
                                            }
                                            if (v8jVar != null) {
                                                int i18 = v8jVar.a;
                                                if ((i18 | 1) == i18) {
                                                    spannableString3.setSpan(new UnderlineSpan(), i16, i17, i3);
                                                }
                                                if ((i18 | 2) == i18) {
                                                    spannableString3.setSpan(new StrikethroughSpan(), i16, i17, i3);
                                                }
                                            }
                                            if (zcjVar != null) {
                                                spannableString3.setSpan(new ScaleXSpan(zcjVar.a), i16, i17, i3);
                                            }
                                            jca.T(spannableString3, a.k, i16, i17);
                                            long j2 = a.l;
                                            if (j2 != 16) {
                                                spannableString3.setSpan(new BackgroundColorSpan(hkg.s0(j2)), i16, i17, 33);
                                            }
                                            spannableString2 = spannableString3;
                                            i13 = i14 + 1;
                                            arrayList2 = arrayList3;
                                            size2 = i15;
                                            l3hVar2 = l3hVar3;
                                            u5gVar3 = u5gVar4;
                                            s3hVar4 = s3hVar6;
                                            resources2 = resources3;
                                            obtain = accessibilityNodeInfo4;
                                            daVar3 = daVar4;
                                        }
                                    }
                                    s3hVar = s3hVar4;
                                    resources = resources2;
                                    u5gVar = u5gVar3;
                                    l3hVar = l3hVar2;
                                    accessibilityNodeInfo = obtain;
                                    da daVar5 = daVar3;
                                    SpannableString spannableString4 = spannableString2;
                                    int length = str2.length();
                                    if (list3 != null) {
                                        r5 = new ArrayList(list3.size());
                                        int size3 = list3.size();
                                        for (int i19 = 0; i19 < size3; i19++) {
                                            Object obj = list3.get(i19);
                                            p80 p80Var2 = (p80) obj;
                                            if ((p80Var2.a instanceof eok) && r80.b(0, length, p80Var2.b, p80Var2.c)) {
                                                r5.add(obj);
                                            }
                                        }
                                    } else {
                                        r5 = km5.a;
                                    }
                                    r5.getClass();
                                    int size4 = r5.size();
                                    for (int i20 = 0; i20 < size4; i20++) {
                                        p80 p80Var3 = (p80) r5.get(i20);
                                        eok eokVar = (eok) p80Var3.a;
                                        int i21 = p80Var3.b;
                                        int i22 = p80Var3.c;
                                        if (!(eokVar instanceof eok)) {
                                            zzl.b();
                                            return null;
                                        }
                                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(eokVar.a).build(), i21, i22, 33);
                                    }
                                    int length2 = str2.length();
                                    if (list3 != null) {
                                        r52 = new ArrayList(list3.size());
                                        int size5 = list3.size();
                                        for (int i23 = 0; i23 < size5; i23++) {
                                            Object obj2 = list3.get(i23);
                                            p80 p80Var4 = (p80) obj2;
                                            if ((p80Var4.a instanceof mek) && r80.b(0, length2, p80Var4.b, p80Var4.c)) {
                                                r52.add(obj2);
                                            }
                                        }
                                    } else {
                                        r52 = km5.a;
                                    }
                                    r52.getClass();
                                    int size6 = r52.size();
                                    for (int i24 = 0; i24 < size6; i24++) {
                                        p80 p80Var5 = (p80) r52.get(i24);
                                        mek mekVar = (mek) p80Var5.a;
                                        int i25 = p80Var5.b;
                                        int i26 = p80Var5.c;
                                        WeakHashMap weakHashMap = (WeakHashMap) l2aVar.b;
                                        Object obj3 = weakHashMap.get(mekVar);
                                        if (obj3 == null) {
                                            obj3 = new URLSpan(mekVar.a);
                                            weakHashMap.put(mekVar, obj3);
                                        }
                                        spannableString4.setSpan((URLSpan) obj3, i25, i26, 33);
                                    }
                                    List a2 = B.a(str2.length());
                                    int size7 = a2.size();
                                    for (int i27 = 0; i27 < size7; i27++) {
                                        p80 p80Var6 = (p80) a2.get(i27);
                                        int i28 = p80Var6.b;
                                        Object obj4 = p80Var6.a;
                                        int i29 = p80Var6.c;
                                        if (i28 != i29) {
                                            gbb gbbVar = (gbb) obj4;
                                            if (gbbVar instanceof fbb) {
                                                obj4.getClass();
                                                fbb fbbVar = (fbb) obj4;
                                                p80 p80Var7 = new p80(fbbVar, i28, i29);
                                                WeakHashMap weakHashMap2 = (WeakHashMap) l2aVar.c;
                                                Object obj5 = weakHashMap2.get(p80Var7);
                                                if (obj5 == null) {
                                                    obj5 = new URLSpan(fbbVar.a);
                                                    weakHashMap2.put(p80Var7, obj5);
                                                }
                                                spannableString4.setSpan((URLSpan) obj5, i28, i29, 33);
                                            } else {
                                                WeakHashMap weakHashMap3 = (WeakHashMap) l2aVar.d;
                                                Object obj6 = weakHashMap3.get(p80Var6);
                                                if (obj6 == null) {
                                                    obj6 = new ae3(gbbVar);
                                                    weakHashMap3.put(p80Var6, obj6);
                                                }
                                                spannableString4.setSpan((ClickableSpan) obj6, i28, i29, 33);
                                            }
                                        }
                                    }
                                    spannableString = (SpannableString) dz.P(spannableString4);
                                    daVar = daVar5;
                                } else {
                                    dzVar = dzVar3;
                                    xyVar = xyVar3;
                                    szcVar = szcVar2;
                                    s3hVar = s3hVar4;
                                    resources = resources2;
                                    u5gVar = u5gVar3;
                                    l3hVar = l3hVar2;
                                    accessibilityNodeInfo = obtain;
                                    daVar = daVar3;
                                    spannableString = null;
                                }
                                daVar.s(spannableString);
                                a4h a4hVar = w3h.O;
                                if (x0dVar.c(a4hVar)) {
                                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                                    accessibilityNodeInfo2.setContentInvalid(true);
                                    Object g7 = x0dVar.g(a4hVar);
                                    if (g7 == null) {
                                        g7 = null;
                                    }
                                    accessibilityNodeInfo3.setError((CharSequence) g7);
                                } else {
                                    accessibilityNodeInfo2 = accessibilityNodeInfo;
                                }
                                s3h s3hVar7 = s3hVar;
                                Resources resources4 = resources;
                                daVar.r(wkn.A(s3hVar7, resources4));
                                accessibilityNodeInfo3.setCheckable(wkn.z(s3hVar7));
                                l3h l3hVar4 = l3hVar;
                                vjj vjjVar = (vjj) qea.v(l3hVar4, w3h.L);
                                if (vjjVar != null) {
                                    if (vjjVar == vjj.a) {
                                        accessibilityNodeInfo3.setChecked(true);
                                    } else if (vjjVar == vjj.b) {
                                        accessibilityNodeInfo3.setChecked(false);
                                    }
                                    Unit unit2 = Unit.a;
                                }
                                Boolean bool = (Boolean) qea.v(l3hVar4, w3h.K);
                                if (bool != null) {
                                    boolean booleanValue = bool.booleanValue();
                                    if (u5gVar == null) {
                                        u5gVar2 = u5gVar;
                                    } else {
                                        u5gVar2 = u5gVar;
                                        if (u5gVar2.a == 4) {
                                            accessibilityNodeInfo2.setSelected(booleanValue);
                                            Unit unit3 = Unit.a;
                                        }
                                    }
                                    accessibilityNodeInfo3.setChecked(booleanValue);
                                    Unit unit32 = Unit.a;
                                } else {
                                    u5gVar2 = u5gVar;
                                }
                                if (!l3hVar4.c || s3hVar7.m().isEmpty()) {
                                    List list4 = (List) qea.v(l3hVar4, w3h.a);
                                    accessibilityNodeInfo3.setContentDescription(list4 != null ? (String) CollectionsKt.firstOrNull(list4) : null);
                                }
                                String str3 = (String) qea.v(l3hVar4, w3h.A);
                                if (str3 != null) {
                                    s3h s3hVar8 = s3hVar7;
                                    while (true) {
                                        if (s3hVar8 != null) {
                                            l3h l3hVar5 = s3hVar8.d;
                                            a4h a4hVar2 = x3h.a;
                                            if (l3hVar5.a.c(a4hVar2)) {
                                                z3 = ((Boolean) l3hVar5.d(a4hVar2)).booleanValue();
                                            } else {
                                                s3hVar8 = s3hVar8.l();
                                            }
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                    if (z3) {
                                        accessibilityNodeInfo2.setViewIdResourceName(str3);
                                    }
                                }
                                if (((Unit) qea.v(l3hVar4, w3h.h)) != null) {
                                    daVar.n(true);
                                    Unit unit4 = Unit.a;
                                }
                                if (((Unit) qea.v(l3hVar4, w3h.i)) != null) {
                                    daVar.t();
                                    Unit unit5 = Unit.a;
                                }
                                i2 = i;
                                if (i2 != -1) {
                                    int d3 = szcVar.d(s3hVar7.f);
                                    if (d3 != -1) {
                                        accessibilityNodeInfo2.setDrawingOrder(d3);
                                        Unit unit6 = Unit.a;
                                    }
                                }
                                accessibilityNodeInfo2.setPassword(x0dVar.c(w3h.N));
                                Object v3 = qea.v(l3hVar4, w3h.Q);
                                Boolean bool2 = Boolean.TRUE;
                                accessibilityNodeInfo2.setEditable(Intrinsics.c(v3, bool2));
                                Integer num = (Integer) qea.v(l3hVar4, w3h.R);
                                accessibilityNodeInfo3.setMaxTextLength(num != null ? num.intValue() : -1);
                                accessibilityNodeInfo3.setEnabled(wkn.x(s3hVar7));
                                a4h a4hVar3 = w3h.l;
                                accessibilityNodeInfo3.setFocusable(x0dVar.c(a4hVar3));
                                if (accessibilityNodeInfo2.isFocusable()) {
                                    accessibilityNodeInfo3.setFocused(((Boolean) l3hVar4.d(a4hVar3)).booleanValue());
                                    if (accessibilityNodeInfo2.isFocused()) {
                                        daVar.a(2);
                                        dzVar2 = dzVar;
                                        dzVar2.l = i2;
                                    } else {
                                        dzVar2 = dzVar;
                                        z = true;
                                        daVar.a(1);
                                        accessibilityNodeInfo3.setVisibleToUser(rd0.J(s3hVar7) ^ z);
                                        if (s3hVar7.o()) {
                                            s3hVar2 = s3hVar7;
                                        } else {
                                            s3hVar2 = s3hVar7.l();
                                            s3hVar2.getClass();
                                        }
                                        if (s3hVar2.n().h()) {
                                            accessibilityNodeInfo3.setVisibleToUser(false);
                                        }
                                        yebVar = (yeb) qea.v(l3hVar4, w3h.k);
                                        if (yebVar != null) {
                                            int i30 = yebVar.a;
                                            accessibilityNodeInfo2.setLiveRegion((i30 != 0 && i30 == 1) ? 2 : 1);
                                            Unit unit7 = Unit.a;
                                        }
                                        accessibilityNodeInfo3.setClickable(false);
                                        m9Var = (m9) qea.v(l3hVar4, k3h.b);
                                        if (m9Var != null) {
                                            boolean c2 = Intrinsics.c(qea.v(l3hVar4, w3h.K), bool2);
                                            boolean z6 = (u5gVar2 != null && u5gVar2.a == 4) || (u5gVar2 != null && u5gVar2.a == 3);
                                            accessibilityNodeInfo3.setClickable(!z6 || (z6 && !c2));
                                            if (wkn.x(s3hVar7) && accessibilityNodeInfo2.isClickable()) {
                                                daVar.b(new x9(16, m9Var.a));
                                            }
                                            Unit unit8 = Unit.a;
                                        }
                                        accessibilityNodeInfo3.setLongClickable(false);
                                        m9Var2 = (m9) qea.v(l3hVar4, k3h.c);
                                        if (m9Var2 != null) {
                                            accessibilityNodeInfo3.setLongClickable(true);
                                            if (wkn.x(s3hVar7)) {
                                                daVar.b(new x9(32, m9Var2.a));
                                            }
                                            Unit unit9 = Unit.a;
                                        }
                                        m9Var3 = (m9) qea.v(l3hVar4, k3h.q);
                                        if (m9Var3 != null) {
                                            daVar.b(new x9(16384, m9Var3.a));
                                            Unit unit10 = Unit.a;
                                        }
                                        if (wkn.x(s3hVar7)) {
                                            m9 m9Var5 = (m9) qea.v(l3hVar4, k3h.k);
                                            if (m9Var5 != null) {
                                                daVar.b(new x9(2097152, m9Var5.a));
                                                Unit unit11 = Unit.a;
                                            }
                                            m9 m9Var6 = (m9) qea.v(l3hVar4, k3h.p);
                                            if (m9Var6 != null) {
                                                daVar.b(new x9(android.R.id.accessibilityActionImeEnter, m9Var6.a));
                                                Unit unit12 = Unit.a;
                                            }
                                            m9 m9Var7 = (m9) qea.v(l3hVar4, k3h.r);
                                            if (m9Var7 != null) {
                                                daVar.b(new x9(C.DEFAULT_BUFFER_SEGMENT_SIZE, m9Var7.a));
                                                Unit unit13 = Unit.a;
                                            }
                                            m9 m9Var8 = (m9) qea.v(l3hVar4, k3h.s);
                                            if (m9Var8 != null) {
                                                if (accessibilityNodeInfo2.isFocused()) {
                                                    ClipDescription primaryClipDescription = xyVar.m920getClipboardManager().a().getPrimaryClipDescription();
                                                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                                        daVar.b(new x9(32768, m9Var8.a));
                                                    }
                                                }
                                                Unit unit14 = Unit.a;
                                            }
                                        }
                                        t = dz.t(s3hVar7);
                                        if (t != null && t.length() != 0) {
                                            accessibilityNodeInfo2.setTextSelection(dzVar2.r(s3hVar7), dzVar2.q(s3hVar7));
                                            m9 m9Var9 = (m9) qea.v(l3hVar4, k3h.j);
                                            daVar.b(new x9(131072, m9Var9 == null ? m9Var9.a : null));
                                            daVar.a(NotificationCompat.FLAG_LOCAL_ONLY);
                                            daVar.a(512);
                                            accessibilityNodeInfo3.setMovementGranularities(11);
                                            list = (List) qea.v(l3hVar4, w3h.a);
                                            if ((list != null || list.isEmpty()) && x0dVar.c(k3h.a) && (!x0dVar.c(w3h.G) || Intrinsics.c(qea.v(l3hVar4, a4hVar3), bool2))) {
                                                v = wmaVar2.v();
                                                while (true) {
                                                    if (v == null) {
                                                        v = null;
                                                    } else {
                                                        l3h x = v.x();
                                                        if (x != null && x.c) {
                                                            if (x.a.c(w3h.G)) {
                                                            }
                                                        }
                                                        v = v.v();
                                                    }
                                                }
                                                if (v != null) {
                                                    l3h x2 = v.x();
                                                    if (x2 != null) {
                                                        Object g8 = x2.a.g(a4hVar3);
                                                        if (g8 == null) {
                                                            g8 = null;
                                                        }
                                                        z2 = Intrinsics.c(g8, bool2);
                                                        break;
                                                    } else {
                                                        z2 = false;
                                                        break;
                                                    }
                                                }
                                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add("androidx.compose.ui.semantics.id");
                                        g = daVar.g();
                                        if (g != null && g.length() != 0 && x0dVar.c(k3h.a)) {
                                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (x0dVar.c(w3h.A)) {
                                            arrayList.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (x0dVar.c(w3h.S)) {
                                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        accessibilityNodeInfo2.setAvailableExtraData(arrayList);
                                        dcfVar = (dcf) qea.v(l3hVar4, w3h.c);
                                        if (dcfVar != null) {
                                            float f2 = dcfVar.a;
                                            lz2 lz2Var = dcfVar.b;
                                            a4h a4hVar4 = k3h.i;
                                            if (x0dVar.c(a4hVar4)) {
                                                daVar.k("android.widget.SeekBar");
                                            } else {
                                                daVar.k("android.widget.ProgressBar");
                                            }
                                            if (dcfVar != dcf.c) {
                                                lz2Var.getClass();
                                                accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueOf.floatValue(), ((Number) lz2Var.a()).floatValue(), f2));
                                            }
                                            if (x0dVar.c(a4hVar4) && wkn.x(s3hVar7)) {
                                                float floatValue = ((Number) lz2Var.a()).floatValue();
                                                float floatValue2 = valueOf.floatValue();
                                                if (floatValue < floatValue2) {
                                                    floatValue = floatValue2;
                                                }
                                                if (f2 < floatValue) {
                                                    daVar.b(x9.h);
                                                }
                                                float floatValue3 = valueOf.floatValue();
                                                float floatValue4 = ((Number) lz2Var.a()).floatValue();
                                                if (floatValue3 > floatValue4) {
                                                    floatValue3 = floatValue4;
                                                }
                                                if (f2 > floatValue3) {
                                                    daVar.b(x9.i);
                                                }
                                            }
                                        }
                                        if (wkn.x(s3hVar7) && (m9Var4 = (m9) qea.v(l3hVar4, k3h.i)) != null) {
                                            daVar.b(new x9(android.R.id.accessibilityActionSetProgress, m9Var4.a));
                                        }
                                        f13Var = (f13) qea.v(s3hVar7.k(), w3h.f);
                                        if (f13Var == null) {
                                            daVar.l(ca.b(f13Var.a, f13Var.b, 0, false));
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            if (qea.v(s3hVar7.k(), w3h.e) != null) {
                                                List m = s3hVar7.m();
                                                int size8 = m.size();
                                                for (int i31 = 0; i31 < size8; i31++) {
                                                    s3h s3hVar9 = (s3h) m.get(i31);
                                                    if (s3hVar9.k().a.c(w3h.K)) {
                                                        arrayList4.add(s3hVar9);
                                                    }
                                                }
                                            }
                                            if (!arrayList4.isEmpty()) {
                                                boolean v4 = f5p.v(arrayList4);
                                                daVar.l(ca.b(v4 ? 1 : arrayList4.size(), v4 ? arrayList4.size() : 1, 0, false));
                                            }
                                        }
                                        f5p.K(daVar, s3hVar7);
                                        wtgVar = (wtg) qea.v(l3hVar4, w3h.v);
                                        m9 m9Var10 = (m9) qea.v(l3hVar4, k3h.d);
                                        if (wtgVar != null && m9Var10 != null) {
                                            g3 = s3hVar7.k().a.g(w3h.f);
                                            if (g3 == null) {
                                                g3 = null;
                                            }
                                            if (g3 == null) {
                                                Object g9 = s3hVar7.k().a.g(w3h.e);
                                                if (g9 == null) {
                                                    g9 = null;
                                                }
                                                if (g9 == null) {
                                                    daVar.k("android.widget.HorizontalScrollView");
                                                }
                                            }
                                            if (((Number) wtgVar.b.invoke()).floatValue() > f) {
                                                daVar.q(true);
                                            }
                                            if (wkn.x(s3hVar7)) {
                                                if (dz.z(wtgVar)) {
                                                    daVar.b(x9.h);
                                                    wmaVar = wmaVar2;
                                                    daVar.b(wmaVar.z == ema.b ? x9.n : x9.p);
                                                } else {
                                                    wmaVar = wmaVar2;
                                                }
                                                if (dz.y(wtgVar)) {
                                                    daVar.b(x9.i);
                                                    daVar.b(wmaVar.z == ema.b ? x9.p : x9.n);
                                                }
                                            }
                                        }
                                        wtgVar2 = (wtg) qea.v(l3hVar4, w3h.w);
                                        if (wtgVar2 != null && m9Var10 != null) {
                                            g2 = s3hVar7.k().a.g(w3h.f);
                                            if (g2 == null) {
                                                g2 = null;
                                            }
                                            if (g2 == null) {
                                                Object g10 = s3hVar7.k().a.g(w3h.e);
                                                if (g10 == null) {
                                                    g10 = null;
                                                }
                                                if (g10 == null) {
                                                    daVar.k("android.widget.ScrollView");
                                                }
                                            }
                                            if (((Number) wtgVar2.b.invoke()).floatValue() > f) {
                                                daVar.q(true);
                                            }
                                            if (wkn.x(s3hVar7)) {
                                                if (dz.z(wtgVar2)) {
                                                    daVar.b(x9.h);
                                                    daVar.b(x9.o);
                                                }
                                                if (dz.y(wtgVar2)) {
                                                    daVar.b(x9.i);
                                                    daVar.b(x9.m);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            c5n.r(daVar, s3hVar7);
                                        }
                                        daVar.o((CharSequence) qea.v(l3hVar4, w3h.d));
                                        if (wkn.x(s3hVar7)) {
                                            m9 m9Var11 = (m9) qea.v(l3hVar4, k3h.t);
                                            if (m9Var11 != null) {
                                                daVar.b(new x9(262144, m9Var11.a));
                                                Unit unit15 = Unit.a;
                                            }
                                            m9 m9Var12 = (m9) qea.v(l3hVar4, k3h.u);
                                            if (m9Var12 != null) {
                                                daVar.b(new x9(524288, m9Var12.a));
                                                Unit unit16 = Unit.a;
                                            }
                                            m9 m9Var13 = (m9) qea.v(l3hVar4, k3h.v);
                                            if (m9Var13 != null) {
                                                daVar.b(new x9(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, m9Var13.a));
                                                Unit unit17 = Unit.a;
                                            }
                                            a4h a4hVar5 = k3h.x;
                                            if (x0dVar.c(a4hVar5)) {
                                                List list5 = (List) l3hVar4.d(a4hVar5);
                                                int size9 = list5.size();
                                                tzc tzcVar = dz.N;
                                                if (size9 < tzcVar.b) {
                                                    zwh zwhVar3 = new zwh(0);
                                                    h0d a3 = vjd.a();
                                                    zwh zwhVar4 = zwhVar;
                                                    if (zwhVar4.a) {
                                                        gz8.H(zwhVar4);
                                                    }
                                                    if (kik.h(zwhVar4.d, i2, zwhVar4.b) >= 0) {
                                                        h0d h0dVar = (h0d) gz8.C(zwhVar4, i2);
                                                        int[] iArr = tzcVar.a;
                                                        int i32 = tzcVar.b;
                                                        int[] iArr2 = new int[16];
                                                        int i33 = 0;
                                                        int i34 = 0;
                                                        while (i33 < i32) {
                                                            int i35 = iArr[i33];
                                                            int i36 = i32;
                                                            int i37 = i34 + 1;
                                                            int i38 = i33;
                                                            if (iArr2.length < i37) {
                                                                iArr2 = Arrays.copyOf(iArr2, Math.max(i37, (iArr2.length * 3) / 2));
                                                            }
                                                            iArr2[i34] = i35;
                                                            i33 = i38 + 1;
                                                            i34 = i37;
                                                            i32 = i36;
                                                        }
                                                        ArrayList arrayList5 = new ArrayList();
                                                        if (list5.size() > 0) {
                                                            wt3.z(list5.get(0));
                                                            h0dVar.getClass();
                                                            throw null;
                                                        }
                                                        if (arrayList5.size() > 0) {
                                                            wt3.z(arrayList5.get(0));
                                                            if (i34 > 0) {
                                                                int i39 = iArr2[0];
                                                                throw null;
                                                            }
                                                            zzl.r("Index must be between 0 and size");
                                                        }
                                                    } else if (list5.size() > 0) {
                                                        wt3.z(list5.get(0));
                                                        tzcVar.c(0);
                                                        throw null;
                                                    }
                                                    dzVar2.r.d(i2, zwhVar3);
                                                    zwhVar4.d(i2, a3);
                                                } else {
                                                    a70.r(fc6.h(tzcVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                return null;
                                            }
                                        }
                                        daVar.p(wkn.F(s3hVar7, resources4));
                                        d = dzVar2.B.d(i2);
                                        if (d == -1) {
                                            b50 G2 = yfa.G(xyVar.getAndroidViewsHandler$ui(), d);
                                            if (G2 != null) {
                                                accessibilityNodeInfo3.setTraversalBefore(G2);
                                                xyVar2 = xyVar;
                                            } else {
                                                xyVar2 = xyVar;
                                                accessibilityNodeInfo3.setTraversalBefore(xyVar2, d);
                                            }
                                            bundle = null;
                                            dzVar2.j(i2, daVar, dzVar2.D, null);
                                        } else {
                                            xyVar2 = xyVar;
                                            bundle = null;
                                        }
                                        d2 = dzVar2.C.d(i2);
                                        if (d2 != -1 && (G = yfa.G(xyVar2.getAndroidViewsHandler$ui(), d2)) != null) {
                                            accessibilityNodeInfo3.setTraversalAfter(G);
                                            dzVar2.j(i2, daVar, dzVar2.E, bundle);
                                        }
                                        str = (String) qea.v(l3hVar4, x3h.b);
                                        if (str != null) {
                                            daVar.k(str);
                                            Unit unit18 = Unit.a;
                                        }
                                        daVar2 = daVar;
                                        if (!dzVar2.o) {
                                        }
                                    }
                                } else {
                                    dzVar2 = dzVar;
                                }
                                z = true;
                                accessibilityNodeInfo3.setVisibleToUser(rd0.J(s3hVar7) ^ z);
                                if (s3hVar7.o()) {
                                }
                                if (s3hVar2.n().h()) {
                                }
                                yebVar = (yeb) qea.v(l3hVar4, w3h.k);
                                if (yebVar != null) {
                                }
                                accessibilityNodeInfo3.setClickable(false);
                                m9Var = (m9) qea.v(l3hVar4, k3h.b);
                                if (m9Var != null) {
                                }
                                accessibilityNodeInfo3.setLongClickable(false);
                                m9Var2 = (m9) qea.v(l3hVar4, k3h.c);
                                if (m9Var2 != null) {
                                }
                                m9Var3 = (m9) qea.v(l3hVar4, k3h.q);
                                if (m9Var3 != null) {
                                }
                                if (wkn.x(s3hVar7)) {
                                }
                                t = dz.t(s3hVar7);
                                if (t != null) {
                                    accessibilityNodeInfo2.setTextSelection(dzVar2.r(s3hVar7), dzVar2.q(s3hVar7));
                                    m9 m9Var92 = (m9) qea.v(l3hVar4, k3h.j);
                                    daVar.b(new x9(131072, m9Var92 == null ? m9Var92.a : null));
                                    daVar.a(NotificationCompat.FLAG_LOCAL_ONLY);
                                    daVar.a(512);
                                    accessibilityNodeInfo3.setMovementGranularities(11);
                                    list = (List) qea.v(l3hVar4, w3h.a);
                                    if (list != null) {
                                    }
                                    v = wmaVar2.v();
                                    while (true) {
                                        if (v == null) {
                                        }
                                        v = v.v();
                                    }
                                    if (v != null) {
                                    }
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                }
                                arrayList = new ArrayList();
                                arrayList.add("androidx.compose.ui.semantics.id");
                                g = daVar.g();
                                if (g != null) {
                                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (x0dVar.c(w3h.A)) {
                                }
                                if (x0dVar.c(w3h.S)) {
                                }
                                accessibilityNodeInfo2.setAvailableExtraData(arrayList);
                                dcfVar = (dcf) qea.v(l3hVar4, w3h.c);
                                if (dcfVar != null) {
                                }
                                if (wkn.x(s3hVar7)) {
                                    daVar.b(new x9(android.R.id.accessibilityActionSetProgress, m9Var4.a));
                                }
                                f13Var = (f13) qea.v(s3hVar7.k(), w3h.f);
                                if (f13Var == null) {
                                }
                                f5p.K(daVar, s3hVar7);
                                wtgVar = (wtg) qea.v(l3hVar4, w3h.v);
                                m9 m9Var102 = (m9) qea.v(l3hVar4, k3h.d);
                                if (wtgVar != null) {
                                    g3 = s3hVar7.k().a.g(w3h.f);
                                    if (g3 == null) {
                                    }
                                    if (g3 == null) {
                                    }
                                    if (((Number) wtgVar.b.invoke()).floatValue() > f) {
                                    }
                                    if (wkn.x(s3hVar7)) {
                                    }
                                }
                                wtgVar2 = (wtg) qea.v(l3hVar4, w3h.w);
                                if (wtgVar2 != null) {
                                    g2 = s3hVar7.k().a.g(w3h.f);
                                    if (g2 == null) {
                                    }
                                    if (g2 == null) {
                                    }
                                    if (((Number) wtgVar2.b.invoke()).floatValue() > f) {
                                    }
                                    if (wkn.x(s3hVar7)) {
                                    }
                                }
                                if (Build.VERSION.SDK_INT >= 29) {
                                }
                                daVar.o((CharSequence) qea.v(l3hVar4, w3h.d));
                                if (wkn.x(s3hVar7)) {
                                }
                                daVar.p(wkn.F(s3hVar7, resources4));
                                d = dzVar2.B.d(i2);
                                if (d == -1) {
                                }
                                d2 = dzVar2.C.d(i2);
                                if (d2 != -1) {
                                    accessibilityNodeInfo3.setTraversalAfter(G);
                                    dzVar2.j(i2, daVar, dzVar2.E, bundle);
                                }
                                str = (String) qea.v(l3hVar4, x3h.b);
                                if (str != null) {
                                }
                                daVar2 = daVar;
                                if (!dzVar2.o) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                return new da(AccessibilityNodeInfo.obtain(((aj6) p9Var).q(i).a));
        }
    }

    @Override // defpackage.j0l
    public final da p(int i) {
        int i2 = this.f;
        p9 p9Var = this.g;
        switch (i2) {
            case 0:
                dz dzVar = (dz) p9Var;
                if (i != 1) {
                    if (i == 2) {
                        return l(dzVar.k);
                    }
                    a70.p(ljg.j(i, "Unknown focus type: "));
                    return null;
                }
                int i3 = dzVar.l;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return l(i3);
            default:
                aj6 aj6Var = (aj6) p9Var;
                int i4 = i == 2 ? aj6Var.k : aj6Var.l;
                if (i4 == Integer.MIN_VALUE) {
                    return null;
                }
                return l(i4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0224, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (r6 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x07de, code lost:
    
        if (r1 != 16) goto L534;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0881  */
    /* JADX WARN: Type inference failed for: r12v8, types: [r9, u9] */
    /* JADX WARN: Type inference failed for: r12v9, types: [r9, t9] */
    /* JADX WARN: Type inference failed for: r4v30, types: [v9] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [r9, v9] */
    @Override // defpackage.j0l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i, int i2, Bundle bundle) {
        boolean z;
        s3h s3hVar;
        boolean z2;
        int i3;
        s9 s9Var;
        int i4;
        int i5;
        aej q;
        Function0 function0;
        int i6;
        int i7;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function1 function1;
        m9 m9Var;
        long j;
        float f;
        float f2;
        float f3;
        float f4;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        Function1 function12;
        Function0 function010;
        Float f5;
        boolean z3;
        m9 m9Var2;
        Function0 function011;
        float intBitsToFloat;
        m9 m9Var3;
        Function0 function012;
        Function1 function13;
        Function0 function013;
        Function0 function014;
        Function0 function015;
        Function0 function016;
        boolean z4;
        int i8;
        int i9 = this.f;
        p9 p9Var = this.g;
        switch (i9) {
            case 0:
                dz dzVar = (dz) p9Var;
                AccessibilityManager accessibilityManager = dzVar.g;
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                xy xyVar = dzVar.d;
                u3h u3hVar = (u3h) dzVar.s().b(i);
                if (u3hVar != null && (s3hVar = u3hVar.a) != null) {
                    wma wmaVar = s3hVar.c;
                    int i10 = s3hVar.f;
                    l3h l3hVar = s3hVar.d;
                    x0d x0dVar = l3hVar.a;
                    Object g = x0dVar.g(w3h.o);
                    if (g == null) {
                        g = null;
                    }
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.c(g, bool)) {
                        if (Build.VERSION.SDK_INT < 34) {
                            z4 = true;
                            break;
                        } else {
                            z4 = q9.v(accessibilityManager);
                            break;
                        }
                    }
                    if (i2 == 64) {
                        z2 = true;
                        z = false;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = dzVar.k) != i) {
                            if (i3 != Integer.MIN_VALUE) {
                                dz.E(dzVar, i3, C.DEFAULT_BUFFER_SEGMENT_SIZE, null, 12);
                            }
                            dzVar.k = i;
                            xyVar.invalidate();
                            dz.E(dzVar, i, 32768, null, 12);
                            return z2;
                        }
                        return z;
                    }
                    if (i2 == 128) {
                        z2 = true;
                        z = false;
                        if (dzVar.k == i) {
                            dzVar.k = Integer.MIN_VALUE;
                            dzVar.m = null;
                            xyVar.invalidate();
                            dz.E(dzVar, i, C.DEFAULT_BUFFER_SEGMENT_SIZE, null, 12);
                        }
                        return z;
                    }
                    if (i2 == 256 || i2 == 512) {
                        if (bundle != null) {
                            int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                            boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                            boolean z6 = i2 == 256;
                            Integer num = dzVar.u;
                            if (num == null || i10 != num.intValue()) {
                                dzVar.t = -1;
                                dzVar.u = Integer.valueOf(i10);
                            }
                            String t = dz.t(s3hVar);
                            if (t != null && t.length() != 0) {
                                String t2 = dz.t(s3hVar);
                                if (t2 != null && t2.length() != 0) {
                                    if (i11 == 1) {
                                        Locale locale = xyVar.getContext().getResources().getConfiguration().locale;
                                        s9 s9Var2 = s9.e;
                                        if (s9Var2 == null) {
                                            s9Var2 = new s9(0);
                                            s9Var2.d = BreakIterator.getCharacterInstance(locale);
                                            s9.e = s9Var2;
                                        }
                                        s9 s9Var3 = s9Var2;
                                        s9Var3.G(t2);
                                        s9Var = s9Var3;
                                    } else if (i11 != 2) {
                                        if (i11 != 4) {
                                            if (i11 != 8) {
                                                break;
                                            } else {
                                                ?? r4 = v9.c;
                                                if (r4 == null) {
                                                    r4 = new v9(0, false);
                                                    v9.c = r4;
                                                }
                                                s9 s9Var4 = r4;
                                                s9Var4.a = t2;
                                                s9Var = s9Var4;
                                            }
                                        }
                                        if (x0dVar.c(k3h.a) && (q = yfa.q(l3hVar)) != null) {
                                            if (i11 == 4) {
                                                t9 t9Var = t9.d;
                                                if (t9Var == null) {
                                                    t9Var = new t9(0, false);
                                                    t9.d = t9Var;
                                                }
                                                ?? r12 = t9Var;
                                                r12.a = t2;
                                                r12.c = q;
                                                s9Var = r12;
                                            } else {
                                                u9 u9Var = u9.e;
                                                if (u9Var == null) {
                                                    u9Var = new u9(0, false);
                                                    new Rect();
                                                    u9.e = u9Var;
                                                }
                                                ?? r122 = u9Var;
                                                r122.a = t2;
                                                r122.c = q;
                                                r122.d = s3hVar;
                                                s9Var = r122;
                                            }
                                        }
                                    } else {
                                        Locale locale2 = xyVar.getContext().getResources().getConfiguration().locale;
                                        s9 s9Var5 = s9.f;
                                        if (s9Var5 == null) {
                                            s9Var5 = new s9(1);
                                            s9Var5.d = BreakIterator.getWordInstance(locale2);
                                            s9.f = s9Var5;
                                        }
                                        s9 s9Var6 = s9Var5;
                                        s9Var6.G(t2);
                                        s9Var = s9Var6;
                                    }
                                    if (s9Var != null) {
                                        int q2 = dzVar.q(s3hVar);
                                        if (q2 == -1) {
                                            q2 = z6 ? 0 : t.length();
                                        }
                                        int[] g2 = z6 ? s9Var.g(q2) : s9Var.y(q2);
                                        if (g2 != null) {
                                            int i12 = g2[0];
                                            int i13 = g2[1];
                                            if (z5 && !x0dVar.c(w3h.a) && x0dVar.c(w3h.G)) {
                                                i4 = dzVar.r(s3hVar);
                                                if (i4 == -1) {
                                                    i4 = z6 ? i12 : i13;
                                                }
                                                i5 = z6 ? i13 : i12;
                                            } else {
                                                i4 = z6 ? i13 : i12;
                                                i5 = i4;
                                            }
                                            dzVar.y = new zy(s3hVar, z6 ? 256 : 512, i11, i12, i13, SystemClock.uptimeMillis());
                                            z2 = true;
                                            dzVar.K(s3hVar, i4, i5, true);
                                        }
                                    }
                                }
                                s9Var = null;
                                if (s9Var != null) {
                                }
                            }
                        }
                    } else if (i2 == 16384) {
                        Object g3 = x0dVar.g(k3h.q);
                        m9 m9Var4 = (m9) (g3 == null ? null : g3);
                        if (m9Var4 != null && (function0 = (Function0) m9Var4.b) != null) {
                            return ((Boolean) function0.invoke()).booleanValue();
                        }
                    } else {
                        if (i2 == 131072) {
                            if (bundle != null) {
                                i6 = -1;
                                i7 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                            } else {
                                i6 = -1;
                                i7 = -1;
                            }
                            boolean K = dzVar.K(s3hVar, i7, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i6) : -1, false);
                            if (!K) {
                                return K;
                            }
                            dz.E(dzVar, dzVar.A(i10), 0, null, 12);
                            return K;
                        }
                        if (wkn.x(s3hVar)) {
                            if (i2 == 1) {
                                if (xyVar.isInTouchMode()) {
                                    xyVar.requestFocusFromTouch();
                                }
                                Object g4 = x0dVar.g(k3h.w);
                                m9 m9Var5 = (m9) (g4 == null ? null : g4);
                                if (m9Var5 != null && (function02 = (Function0) m9Var5.b) != null) {
                                    return ((Boolean) function02.invoke()).booleanValue();
                                }
                            } else if (i2 != 2) {
                                switch (i2) {
                                    case 16:
                                        Object g5 = x0dVar.g(k3h.b);
                                        if (g5 == null) {
                                            g5 = null;
                                        }
                                        m9 m9Var6 = (m9) g5;
                                        Boolean bool2 = (m9Var6 == null || (function03 = (Function0) m9Var6.b) == null) ? null : (Boolean) function03.invoke();
                                        dz.E(dzVar, i, 1, null, 12);
                                        if (bool2 != null) {
                                            return bool2.booleanValue();
                                        }
                                        break;
                                    case 32:
                                        Object g6 = x0dVar.g(k3h.c);
                                        m9 m9Var7 = (m9) (g6 == null ? null : g6);
                                        if (m9Var7 != null && (function04 = (Function0) m9Var7.b) != null) {
                                            return ((Boolean) function04.invoke()).booleanValue();
                                        }
                                        break;
                                    case 4096:
                                    case 8192:
                                        boolean z7 = i2 == 4096;
                                        boolean z8 = i2 == 8192;
                                        boolean z9 = i2 == 16908345;
                                        boolean z10 = i2 == 16908347;
                                        boolean z11 = i2 == 16908344;
                                        boolean z12 = i2 == 16908346;
                                        boolean z13 = z9 || z10 || z7 || z8;
                                        boolean z14 = z11 || z12 || z7 || z8;
                                        if (z7 || z8) {
                                            Object g7 = x0dVar.g(w3h.c);
                                            if (g7 == null) {
                                                g7 = null;
                                            }
                                            dcf dcfVar = (dcf) g7;
                                            Object g8 = x0dVar.g(k3h.i);
                                            if (g8 == null) {
                                                g8 = null;
                                            }
                                            m9 m9Var8 = (m9) g8;
                                            if (dcfVar != null) {
                                                lz2 lz2Var = dcfVar.b;
                                                if (m9Var8 != null) {
                                                    float floatValue = Float.valueOf(lz2Var.a).floatValue();
                                                    float floatValue2 = valueOf.floatValue();
                                                    if (floatValue < floatValue2) {
                                                        floatValue = floatValue2;
                                                    }
                                                    float floatValue3 = valueOf.floatValue();
                                                    float floatValue4 = Float.valueOf(lz2Var.a).floatValue();
                                                    if (floatValue3 > floatValue4) {
                                                        floatValue3 = floatValue4;
                                                    }
                                                    float f6 = (floatValue - floatValue3) / 20.0f;
                                                    if (z8) {
                                                        f6 = -f6;
                                                    }
                                                    Function1 function14 = (Function1) m9Var8.b;
                                                    if (function14 != null) {
                                                        return ((Boolean) function14.invoke(Float.valueOf(dcfVar.a + f6))).booleanValue();
                                                    }
                                                }
                                            }
                                        }
                                        long e = o6a.l((z3a) wmaVar.F.d).e();
                                        ArrayList arrayList = new ArrayList();
                                        Object g9 = x0dVar.g(k3h.C);
                                        if (g9 == null) {
                                            g9 = null;
                                        }
                                        m9 m9Var9 = (m9) g9;
                                        Float f7 = (m9Var9 == null || (function13 = (Function1) m9Var9.b) == null || !((Boolean) function13.invoke(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                        Object g10 = x0dVar.g(k3h.d);
                                        if (g10 == null) {
                                            g10 = null;
                                        }
                                        m9 m9Var10 = (m9) g10;
                                        if (m9Var10 != null) {
                                            dt8 dt8Var = m9Var10.b;
                                            Object g11 = x0dVar.g(w3h.v);
                                            if (g11 == null) {
                                                g11 = null;
                                            }
                                            wtg wtgVar = (wtg) g11;
                                            if (wtgVar == null || !z13) {
                                                f5 = f7;
                                                z3 = z8;
                                            } else {
                                                if (f7 != null) {
                                                    intBitsToFloat = f7.floatValue();
                                                    f5 = f7;
                                                    z3 = z8;
                                                } else {
                                                    f5 = f7;
                                                    z3 = z8;
                                                    intBitsToFloat = Float.intBitsToFloat((int) (e >> 32));
                                                }
                                                if (z9 || z3) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (wmaVar.z == ema.b && (z9 || z10)) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (dz.x(wtgVar, intBitsToFloat)) {
                                                    a4h a4hVar = k3h.z;
                                                    if (x0dVar.c(a4hVar) || x0dVar.c(k3h.B)) {
                                                        if (intBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                            Object g12 = x0dVar.g(k3h.B);
                                                            m9Var3 = (m9) (g12 == null ? null : g12);
                                                        } else {
                                                            Object g13 = x0dVar.g(a4hVar);
                                                            m9Var3 = (m9) (g13 == null ? null : g13);
                                                        }
                                                        if (m9Var3 != null && (function012 = (Function0) m9Var3.b) != null) {
                                                            return ((Boolean) function012.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        Function2 function2 = (Function2) dt8Var;
                                                        if (function2 != null) {
                                                            return ((Boolean) function2.invoke(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                        }
                                                    }
                                                }
                                            }
                                            Object g14 = x0dVar.g(w3h.w);
                                            if (g14 == null) {
                                                g14 = null;
                                            }
                                            wtg wtgVar2 = (wtg) g14;
                                            if (wtgVar2 != null && z14) {
                                                float floatValue5 = f5 != null ? f5.floatValue() : Float.intBitsToFloat((int) (e & 4294967295L));
                                                if (z11 || z3) {
                                                    floatValue5 = -floatValue5;
                                                }
                                                if (dz.x(wtgVar2, floatValue5)) {
                                                    a4h a4hVar2 = k3h.y;
                                                    if (x0dVar.c(a4hVar2) || x0dVar.c(k3h.A)) {
                                                        if (floatValue5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                            Object g15 = x0dVar.g(k3h.A);
                                                            m9Var2 = (m9) (g15 == null ? null : g15);
                                                        } else {
                                                            Object g16 = x0dVar.g(a4hVar2);
                                                            m9Var2 = (m9) (g16 == null ? null : g16);
                                                        }
                                                        if (m9Var2 != null && (function011 = (Function0) m9Var2.b) != null) {
                                                            return ((Boolean) function011.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        Function2 function22 = (Function2) dt8Var;
                                                        if (function22 != null) {
                                                            return ((Boolean) function22.invoke(valueOf, Float.valueOf(floatValue5))).booleanValue();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 32768:
                                        Object g17 = x0dVar.g(k3h.s);
                                        m9 m9Var11 = (m9) (g17 == null ? null : g17);
                                        if (m9Var11 != null && (function05 = (Function0) m9Var11.b) != null) {
                                            return ((Boolean) function05.invoke()).booleanValue();
                                        }
                                        break;
                                    case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                                        Object g18 = x0dVar.g(k3h.r);
                                        m9 m9Var12 = (m9) (g18 == null ? null : g18);
                                        if (m9Var12 != null && (function06 = (Function0) m9Var12.b) != null) {
                                            return ((Boolean) function06.invoke()).booleanValue();
                                        }
                                        break;
                                    case 262144:
                                        Object g19 = x0dVar.g(k3h.t);
                                        m9 m9Var13 = (m9) (g19 == null ? null : g19);
                                        if (m9Var13 != null && (function07 = (Function0) m9Var13.b) != null) {
                                            return ((Boolean) function07.invoke()).booleanValue();
                                        }
                                        break;
                                    case 524288:
                                        Object g20 = x0dVar.g(k3h.u);
                                        m9 m9Var14 = (m9) (g20 == null ? null : g20);
                                        if (m9Var14 != null && (function08 = (Function0) m9Var14.b) != null) {
                                            return ((Boolean) function08.invoke()).booleanValue();
                                        }
                                        break;
                                    case ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES /* 1048576 */:
                                        Object g21 = x0dVar.g(k3h.v);
                                        m9 m9Var15 = (m9) (g21 == null ? null : g21);
                                        if (m9Var15 != null && (function09 = (Function0) m9Var15.b) != null) {
                                            return ((Boolean) function09.invoke()).booleanValue();
                                        }
                                        break;
                                    case 2097152:
                                        String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                        Object g22 = x0dVar.g(k3h.k);
                                        m9 m9Var16 = (m9) (g22 == null ? null : g22);
                                        if (m9Var16 != null && (function1 = (Function1) m9Var16.b) != null) {
                                            if (string == null) {
                                                string = "";
                                            }
                                            return ((Boolean) function1.invoke(new q80(string))).booleanValue();
                                        }
                                        break;
                                    case android.R.id.accessibilityActionShowOnScreen:
                                        s3h l = s3hVar.l();
                                        if (l != null) {
                                            Object g23 = l.d.a.g(k3h.d);
                                            if (g23 == null) {
                                                g23 = null;
                                            }
                                            m9Var = (m9) g23;
                                            while (m9Var == null && l != null) {
                                                l = l.l();
                                                if (l != null) {
                                                    Object g24 = l.d.a.g(k3h.d);
                                                    if (g24 == null) {
                                                        g24 = null;
                                                    }
                                                    m9Var = (m9) g24;
                                                }
                                            }
                                            if (l == null) {
                                                oqf g25 = s3hVar.g();
                                                return xyVar.requestRectangleOnScreen(new Rect((int) Math.floor(g25.a), (int) Math.floor(g25.b), wzb.b((float) Math.ceil(g25.c)), wzb.b((float) Math.ceil(g25.d))));
                                            }
                                            long j2 = 0;
                                            long j3 = 0;
                                            boolean z15 = false;
                                            while (l != null) {
                                                wma wmaVar2 = l.c;
                                                x0d x0dVar2 = l.d.a;
                                                Object g26 = x0dVar2.g(k3h.d);
                                                if (g26 == null) {
                                                    g26 = null;
                                                }
                                                m9 m9Var17 = (m9) g26;
                                                if (m9Var17 != null) {
                                                    oqf l2 = o6a.l((z3a) wmaVar2.F.d);
                                                    dma K2 = ((z3a) wmaVar2.F.d).K();
                                                    oqf k = l2.k(K2 != null ? ((wdd) K2).P(j2) : j2);
                                                    wdd d = s3hVar.d();
                                                    if (d != null) {
                                                        if (!d.e1().n) {
                                                            d = null;
                                                        }
                                                        if (d != null) {
                                                            j = d.P(j2);
                                                            long i14 = dnd.i(j, j3);
                                                            wdd d2 = s3hVar.d();
                                                            oqf r = jca.r(i14, d7a.I(d2 == null ? d2.c : j2));
                                                            f = r.a - k.a;
                                                            f2 = r.c - k.c;
                                                            if (Math.signum(f) == Math.signum(f2)) {
                                                                f = 0.0f;
                                                            } else if (Math.abs(f) >= Math.abs(f2)) {
                                                                f = f2;
                                                            }
                                                            f3 = r.b - k.b;
                                                            f4 = r.d - k.d;
                                                            if (Math.signum(f3) == Math.signum(f4)) {
                                                                f3 = 0.0f;
                                                            } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                                f3 = f4;
                                                            }
                                                            floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                                            if (dnd.c(floatToRawIntBits, j2)) {
                                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                                                float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                                                                Object g27 = x0dVar2.g(w3h.v);
                                                                if (g27 == null) {
                                                                    g27 = null;
                                                                }
                                                                if (wmaVar.z == ema.b) {
                                                                    intBitsToFloat2 = -intBitsToFloat2;
                                                                }
                                                                Object g28 = x0dVar2.g(w3h.w);
                                                                if (g28 == null) {
                                                                    g28 = null;
                                                                }
                                                                floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                                                            } else {
                                                                floatToRawIntBits2 = floatToRawIntBits;
                                                            }
                                                            Function2 function23 = (Function2) m9Var17.b;
                                                            boolean z16 = (function23 == null && ((Boolean) function23.invoke(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L))))).booleanValue()) || z15;
                                                            j3 = dnd.h(j3, floatToRawIntBits);
                                                            z15 = z16;
                                                        }
                                                    }
                                                    j = j2;
                                                    long i142 = dnd.i(j, j3);
                                                    wdd d22 = s3hVar.d();
                                                    oqf r2 = jca.r(i142, d7a.I(d22 == null ? d22.c : j2));
                                                    f = r2.a - k.a;
                                                    f2 = r2.c - k.c;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                    }
                                                    f3 = r2.b - k.b;
                                                    f4 = r2.d - k.d;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                    }
                                                    floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                                                    if (dnd.c(floatToRawIntBits, j2)) {
                                                    }
                                                    Function2 function232 = (Function2) m9Var17.b;
                                                    if (function232 == null) {
                                                    }
                                                    j3 = dnd.h(j3, floatToRawIntBits);
                                                    z15 = z16;
                                                }
                                                l = l.l();
                                                j2 = 0;
                                            }
                                            return z15;
                                        }
                                        m9Var = null;
                                        break;
                                    case android.R.id.accessibilityActionSetProgress:
                                        if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                            Object g29 = x0dVar.g(k3h.i);
                                            m9 m9Var18 = (m9) (g29 == null ? null : g29);
                                            if (m9Var18 != null && (function12 = (Function1) m9Var18.b) != null) {
                                                return ((Boolean) function12.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                            }
                                        }
                                        break;
                                    case android.R.id.accessibilityActionImeEnter:
                                        Object g30 = x0dVar.g(k3h.p);
                                        m9 m9Var19 = (m9) (g30 == null ? null : g30);
                                        if (m9Var19 != null && (function010 = (Function0) m9Var19.b) != null) {
                                            return ((Boolean) function010.invoke()).booleanValue();
                                        }
                                        break;
                                    default:
                                        switch (i2) {
                                            case android.R.id.accessibilityActionScrollUp:
                                            case android.R.id.accessibilityActionScrollLeft:
                                            case android.R.id.accessibilityActionScrollDown:
                                            case android.R.id.accessibilityActionScrollRight:
                                                break;
                                            default:
                                                switch (i2) {
                                                    case android.R.id.accessibilityActionPageUp:
                                                        Object g31 = x0dVar.g(k3h.y);
                                                        m9 m9Var20 = (m9) (g31 == null ? null : g31);
                                                        if (m9Var20 != null && (function013 = (Function0) m9Var20.b) != null) {
                                                            return ((Boolean) function013.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageDown:
                                                        Object g32 = x0dVar.g(k3h.A);
                                                        m9 m9Var21 = (m9) (g32 == null ? null : g32);
                                                        if (m9Var21 != null && (function014 = (Function0) m9Var21.b) != null) {
                                                            return ((Boolean) function014.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageLeft:
                                                        Object g33 = x0dVar.g(k3h.z);
                                                        m9 m9Var22 = (m9) (g33 == null ? null : g33);
                                                        if (m9Var22 != null && (function015 = (Function0) m9Var22.b) != null) {
                                                            return ((Boolean) function015.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageRight:
                                                        Object g34 = x0dVar.g(k3h.B);
                                                        m9 m9Var23 = (m9) (g34 == null ? null : g34);
                                                        if (m9Var23 != null && (function016 = (Function0) m9Var23.b) != null) {
                                                            return ((Boolean) function016.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    default:
                                                        zwh zwhVar = dzVar.r;
                                                        zwhVar.getClass();
                                                        zwh zwhVar2 = (zwh) gz8.C(zwhVar, i);
                                                        if (zwhVar2 != null && ((CharSequence) gz8.C(zwhVar2, i2)) != null) {
                                                            Object g35 = x0dVar.g(k3h.x);
                                                            List list = (List) (g35 == null ? null : g35);
                                                            if (list != null && list.size() > 0) {
                                                                list.get(0).getClass();
                                                                pvd.j();
                                                                return false;
                                                            }
                                                        }
                                                        break;
                                                }
                                        }
                                }
                            } else {
                                Object g36 = x0dVar.g(w3h.l);
                                if (g36 == null) {
                                    g36 = null;
                                }
                                if (Intrinsics.c(g36, bool)) {
                                    ((yd8) xyVar.getFocusOwner()).c(8, false, true);
                                    return true;
                                }
                            }
                        }
                    }
                    return z2;
                }
                z = false;
                return z;
            default:
                aj6 aj6Var = (aj6) p9Var;
                View view = aj6Var.i;
                if (i == -1) {
                    return view.performAccessibilityAction(i2, bundle);
                }
                if (i2 == 1) {
                    return aj6Var.v(i);
                }
                if (i2 == 2) {
                    return aj6Var.j(i);
                }
                if (i2 == 64) {
                    AccessibilityManager accessibilityManager2 = aj6Var.h;
                    if (accessibilityManager2.isEnabled() && accessibilityManager2.isTouchExplorationEnabled() && (i8 = aj6Var.k) != i) {
                        if (i8 != Integer.MIN_VALUE) {
                            aj6Var.k = Integer.MIN_VALUE;
                            view.invalidate();
                            aj6Var.w(i8, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                        }
                        aj6Var.k = i;
                        view.invalidate();
                        aj6Var.w(i, 32768);
                        return true;
                    }
                } else {
                    if (i2 != 128) {
                        return aj6Var.r(i, i2, bundle);
                    }
                    if (aj6Var.k == i) {
                        aj6Var.k = Integer.MIN_VALUE;
                        view.invalidate();
                        aj6Var.w(i, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                        return true;
                    }
                }
                return false;
        }
    }
}
