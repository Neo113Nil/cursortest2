package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Sports;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class qx9 {
    public static final tc3 a = new tc3(601036862, new qs2(12), false);
    public static final tc3 b = new tc3(-1314962678, new qs2(13), false);
    public static final tc3 c = new tc3(-51699941, new ud3(3), false);
    public static final m39 d = new m39(3);
    public static final StackTraceElement[] e = new StackTraceElement[0];
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public static final byte[] g = new byte[0];
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;

    public static final void A(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof q45) {
            th = ((q45) th).a;
        }
        try {
            cu3 cu3Var = (cu3) coroutineContext.get(bu3.a);
            if (cu3Var != null) {
                cu3Var.handleException(coroutineContext, th);
            } else {
                ww9.B(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                de6.a(runtimeException, th);
                th = runtimeException;
            }
            ww9.B(coroutineContext, th);
        }
    }

    public static final Object B(Class cls, Object obj, Method method, Object... objArr) {
        if (!cw3.a.contains(qx9.class)) {
            try {
                cls.getClass();
                method.getClass();
                if (obj != null) {
                    obj = cls.cast(obj);
                }
                try {
                    return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            } catch (Throwable th) {
                cw3.a(qx9.class, th);
                return null;
            }
        }
        return null;
    }

    public static final boolean C(int i2, int i3, long j2) {
        int j3 = an3.j(j2);
        if (i2 > an3.h(j2) || j3 > i2) {
            return false;
        }
        return i3 <= an3.g(j2) && an3.i(j2) <= i3;
    }

    public static kg8 D(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        int i4;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            pvd.r("No start tag found");
            return null;
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            F(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), xjf.b);
        int i5 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), xjf.c);
                        int i7 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = obtainAttributes2.getInt(i8, 0);
                        int i10 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i10, 0);
                        String string7 = obtainAttributes2.getString(i10);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            F(xmlResourceParser);
                        }
                        arrayList.add(new mg8(string7, i7, string6, i9, resourceId2, z));
                    } else {
                        F(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new lg8((mg8[]) arrayList.toArray(new mg8[0]));
        }
        List E = E(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), xjf.d);
                    try {
                        String string8 = obtainAttributes3.getString(i5);
                        String string9 = obtainAttributes3.getString(1);
                        i4 = integer;
                        String string10 = obtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            F(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i3 = i6;
                            try {
                                dg8 dg8Var = new dg8(string, string2, string8, E, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(dg8Var);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                F(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new ng8(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            a70.p("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new dg8(string, string2, string3, E, null, null));
        if (string4 != null) {
            arrayList2.add(new dg8(string, string2, string4, E, null, null));
        }
        return new ng8(arrayList2, i11, integer2, string5);
    }

    public static List E(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void F(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if ((r35 & 4) != 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ald aldVar, xtc xtcVar, long j2, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        long j3;
        int i4;
        int i5;
        xtc xtcVar3;
        long j4;
        eqf u;
        xtc xtcVar4;
        int i6;
        Integer num = aldVar.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1860419292);
        int i7 = i2 | (av8Var.g(aldVar) ? 4 : 2);
        int i8 = i3 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i7 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i3 & 4) != 0) {
                j3 = j2;
                if (av8Var.f(j3)) {
                    i4 = NotificationCompat.FLAG_LOCAL_ONLY;
                    i5 = i7 | i4;
                    if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
                        av8Var.Y();
                        int i9 = i2 & 1;
                        utc utcVar = utc.a;
                        if (i9 == 0 || av8Var.B()) {
                            if (i8 != 0) {
                                xtcVar2 = utcVar;
                            }
                            if ((i3 & 4) != 0) {
                                j3 = lz.D(R.color.n_lv_3, av8Var);
                                i5 &= -897;
                            }
                            int i10 = i5;
                            xtc xtcVar5 = xtcVar2;
                            long j5 = j3;
                            av8Var.t();
                            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                            int hashCode = Long.hashCode(av8Var.T);
                            aee m2 = av8Var.m();
                            xtc C = fqj.C(av8Var, xtcVar5);
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
                            if (num != null) {
                                av8Var.d0(-1766635401);
                                i6 = i10;
                                xtcVar4 = xtcVar5;
                                kq9.b(s6a.N(num.intValue(), 6, av8Var), null, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), j5, av8Var, ((i10 << 3) & 7168) | 432, 0);
                                j5 = j5;
                                av8Var.s(false);
                            } else {
                                xtcVar4 = xtcVar5;
                                i6 = i10;
                                av8Var.d0(-1766407334);
                                av8Var.s(false);
                            }
                            String v = oea.v(aldVar.a, av8Var);
                            yf8 yf8Var = xth.a;
                            udj.c(v, null, j5, null, 0L, null, 0L, null, new p7j(aldVar.c), 0L, 0, false, 0, 0, null, xth.g(), av8Var, i6 & 896, 0, 130042);
                            av8Var = av8Var;
                            av8Var.s(true);
                            xtcVar3 = xtcVar4;
                            j4 = j5;
                        } else {
                            av8Var.W();
                        }
                    } else {
                        av8Var.W();
                        xtcVar3 = xtcVar2;
                        j4 = j3;
                    }
                    u = av8Var.u();
                    if (u != null) {
                        u.d = new xj(aldVar, xtcVar3, j4, i2, i3, 0);
                        return;
                    }
                    return;
                }
            } else {
                j3 = j2;
            }
            i4 = 128;
            i5 = i7 | i4;
            if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i3 & 4) != 0) {
        }
        i4 = 128;
        i5 = i7 | i4;
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void b(zr1 zr1Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        int i4;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1485647229);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(zr1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = 0;
        int i6 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            fsf fsfVar = new fsf();
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = "ALL";
                av8Var2.n0("ALL");
            }
            fsfVar.a = (String) O;
            int i7 = zr1Var.g;
            x43 x43Var = zr1Var.r;
            String str = zr1Var.h;
            String str2 = zr1Var.i;
            boolean z = zr1Var.e;
            tc3 H = yqo.H(1725951127, av8Var2, new wr1(zr1Var, i5));
            tc3 H2 = yqo.H(-1905598051, av8Var2, new wr1(zr1Var, i6));
            tc3 H3 = yqo.H(315348443, av8Var2, new hl6(18, zr1Var, fsfVar));
            int i8 = i3 & 112;
            boolean i9 = (i8 == 32) | av8Var2.i(zr1Var);
            Object O2 = av8Var2.O();
            if (i9 || O2 == a99Var) {
                i4 = 0;
                O2 = new xr1(function1, zr1Var, i4);
                av8Var2.n0(O2);
            } else {
                i4 = 0;
            }
            Function0 function0 = (Function0) O2;
            if (i8 == 32) {
                i4 = 1;
            }
            int i10 = (av8Var2.i(zr1Var) ? 1 : 0) | i4;
            Object O3 = av8Var2.O();
            if (i10 != 0 || O3 == a99Var) {
                O3 = new xr1(function1, zr1Var, 1);
                av8Var2.n0(O3);
            }
            av8Var = av8Var2;
            pco.a(i7, x43Var, xtcVar, H, H2, null, H3, null, str, str2, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O3, av8Var, (i3 & 896) | 1600512, (i3 << 15) & 3670016, 62624);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yr1(zr1Var, function1, xtcVar, i2, 0);
        }
    }

    public static qa3 c() {
        return new qa3(null);
    }

    public static final void d(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1620384177);
        int i3 = 2;
        int i4 = 4;
        int i5 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            float f2 = 16.0f;
            xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q);
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
            rha.c(oea.v(R.string.teams_without_first_round_pick, av8Var), null, null, av8Var, 0, 6);
            utc utcVar = utc.a;
            nq8.h(av8Var, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            av8Var.d0(1622256414);
            Iterator it = CollectionsKt.Q(4, gv9Var).iterator();
            while (it.hasNext()) {
                ArrayList F = yso.F(4, null, (List) it.next());
                xtc d0 = l98.d0(utcVar, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3);
                l8g a3 = k8g.a(ww9.h, uxf.l, av8Var, 6);
                utc utcVar2 = utcVar;
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, d0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                av8Var.d0(1454697363);
                Iterator it2 = F.iterator();
                while (it2.hasNext()) {
                    z75 z75Var = (z75) it2.next();
                    if (z75Var != null) {
                        av8Var.d0(-1582265399);
                        if (0.25f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        e(z75Var, new goa(0.25f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.25f, true), av8Var, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1582062566);
                        if (0.25f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        nq8.h(av8Var, new goa(0.25f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.25f, true));
                        av8Var.s(false);
                    }
                }
                av8Var.s(false);
                av8Var.s(true);
                utcVar = utcVar2;
                i3 = 2;
                f2 = 16.0f;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, i4);
        }
    }

    public static final void e(z75 z75Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-779503488);
        int i3 = (av8Var.g(z75Var) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc A = wnn.A(xtcVar, o7g.a(16.0f));
            boolean i4 = av8Var.i(context) | ((i3 & 14) == 4);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new h84(8, (Object) context, (Object) z75Var);
                av8Var.n0(O);
            }
            xtc f0 = l98.f0(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
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
            td4.G(z75Var.a, bkh.l(utc.a, 40.0f), false, 0L, av8Var, 48, 12);
            String str = z75Var.b;
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(z75Var, xtcVar, i2, 9);
        }
    }

    public static final void f(String str, String str2, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        float f2;
        zg3 zg3Var;
        char c2;
        mv1 mv1Var;
        lv1 lv1Var = uxf.m;
        mv1 mv1Var2 = uxf.f;
        Float valueOf = Float.valueOf(0.1f);
        mv1 mv1Var3 = uxf.g;
        mv1 mv1Var4 = uxf.c;
        Float valueOf2 = Float.valueOf(0.4f);
        Float valueOf3 = Float.valueOf(0.2f);
        Float valueOf4 = Float.valueOf(0.3f);
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2094126933);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            int a2 = (int) (((ata) ((s8l) av8Var.k(dh3.u))).a() >> 32);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            boolean z = av8Var.k(dh3.n) == ema.b;
            p75 p75Var = new p75(kx4Var.C0(a2) - 260.0f);
            p75 p75Var2 = new p75(86.0f);
            if (p75Var.compareTo(p75Var2) > 0) {
                p75Var = p75Var2;
            }
            Object O = av8Var.O();
            if (O == nf3.a) {
                f2 = 1.0f;
                O = l6g.K(l6g.K(valueOf, valueOf3, valueOf4, valueOf3), l6g.K(valueOf4, valueOf2, Float.valueOf(0.5f), valueOf4), l6g.K(valueOf3, valueOf4, valueOf2, Float.valueOf(1.0f)), l6g.K(valueOf, valueOf3, valueOf4, valueOf2));
                av8Var.n0(O);
            } else {
                f2 = 1.0f;
            }
            b7 b7Var = (b7) O;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(hkg.u0(bkh.d(utcVar, f2), hkg.o0(av8Var), false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf5 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf5, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String v = oea.v(R.string.result_probability_matrix_body, av8Var);
            yf8 yf8Var = xth.a;
            p75 p75Var3 = p75Var;
            lv1 lv1Var2 = lv1Var;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            xtc f02 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, 5);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            lv1 lv1Var3 = uxf.n;
            wxf wxfVar = ww9.b;
            l8g a5 = k8g.a(wxfVar, lv1Var3, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            xtc e2 = bkh.e(l98.f0(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 24.0f);
            if (z) {
                c2 = 0;
                e2 = e2.z(f6a.D(utcVar, -1.0f, 1.0f));
            } else {
                c2 = 0;
            }
            zg3 zg3Var3 = zg3Var;
            kq9.b(s6a.N(R.drawable.ic_dotted_line_corner, 6, av8Var), null, e2, lz.D(R.color.neutral_default, av8Var), av8Var, 48, 0);
            udj.c(oea.w(R.string.result_probability_team_score, new Object[]{str}, av8Var), l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 6), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            av8Var.s(true);
            k1c c3 = e12.c(mv1Var4, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            String v2 = oea.v(R.string.most_likely_outcome, av8Var);
            dfj b2 = xth.b();
            long D = lz.D(R.color.n_lv_3, av8Var);
            xtc q = bkh.q(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, p75Var3.a, 1);
            n12 n12Var = n12.a;
            udj.c(v2, rd0.N(n12Var.a(q, mv1Var2), 232.0f, 16.0f), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, av8Var, 0, 0, 131064);
            av8 av8Var2 = av8Var;
            l8g a6 = k8g.a(wxfVar, uxf.l, av8Var2, 0);
            int hashCode5 = Long.hashCode(av8Var2.T);
            aee m6 = av8Var2.m();
            xtc C5 = fqj.C(av8Var2, utcVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var3);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a6, f50Var);
            waa.K(av8Var2, m6, ff3Var);
            bf3.s(hashCode5, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C5, f50Var3);
            xtc e3 = bkh.e(bkh.p(utcVar, 14.0f), 120.0f);
            k1c c4 = e12.c(mv1Var4, false);
            int hashCode6 = Long.hashCode(av8Var2.T);
            aee m7 = av8Var2.m();
            xtc C6 = fqj.C(av8Var2, e3);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var3);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c4, f50Var);
            waa.K(av8Var2, m7, ff3Var);
            bf3.s(hashCode6, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C6, f50Var3);
            mv1 mv1Var5 = mv1Var4;
            kq9.b(s6a.N(R.drawable.ic_arrow_head, 6, av8Var2), null, n12Var.a(bkh.e(haa.v(utcVar, 270.0f), 12.0f), uxf.d), lz.D(R.color.neutral_default, av8Var2), av8Var2, 48, 0);
            e12.a(0, av8Var2, bkh.p(bkh.e(n9e.q(n12Var.a(utcVar, mv1Var3), lz.D(R.color.neutral_default, av8Var2), o7g.a(4.0f)), 100.0f), 2.0f));
            kq9.b(s6a.N(R.drawable.ic_arrow_head, 6, av8Var2), null, n12Var.a(bkh.l(haa.v(utcVar, 90.0f), 12.0f), uxf.j), lz.D(R.color.neutral_default, av8Var2), av8Var2, 48, 0);
            boolean z2 = true;
            av8Var2.s(true);
            xtc f03 = l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            utc utcVar2 = utcVar;
            float f3 = 8.0f;
            u23 a7 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var2, 6);
            int hashCode7 = Long.hashCode(av8Var2.T);
            aee m8 = av8Var2.m();
            xtc C7 = fqj.C(av8Var2, f03);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var3);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a7, f50Var);
            waa.K(av8Var2, m8, ff3Var);
            bf3.s(hashCode7, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C7, f50Var3);
            av8Var2.d0(174371087);
            b7 b7Var2 = b7Var;
            ListIterator<Object> listIterator = b7Var2.listIterator(0);
            int i4 = 0;
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                b7 b7Var3 = (b7) next;
                lv1 lv1Var4 = lv1Var2;
                l8g a8 = k8g.a(new ng0(f3, z2, new a70(6)), lv1Var4, av8Var2, 54);
                int hashCode8 = Long.hashCode(av8Var2.T);
                aee m9 = av8Var2.m();
                xtc C8 = fqj.C(av8Var2, utcVar2);
                if3.k7.getClass();
                zg3 zg3Var4 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var4);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a8, hf3.g);
                waa.K(av8Var2, m9, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode8), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C8, hf3.d);
                String valueOf6 = String.valueOf(b.i(b7Var3) - i4);
                yf8 yf8Var2 = xth.a;
                utc utcVar3 = utcVar2;
                float f4 = f3;
                av8 av8Var3 = av8Var2;
                lv1 lv1Var5 = lv1Var4;
                boolean z3 = true;
                udj.c(valueOf6, null, lz.D(R.color.n_lv_3, av8Var2), null, v8a.v(10), null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 24576, 0, 131050);
                av8Var2 = av8Var3;
                av8Var2.d0(-1306804101);
                ListIterator<Object> listIterator2 = b7Var3.listIterator(0);
                while (listIterator2.hasNext()) {
                    float floatValue = ((Number) listIterator2.next()).floatValue();
                    xtc p = bkh.p(bkh.e(n9e.q(utcVar3, lz.D(R.color.surface_P, av8Var2), o7g.a(4.0f)), 24.0f), 36.0f);
                    mv1 mv1Var6 = mv1Var5;
                    k1c c5 = e12.c(mv1Var6, false);
                    int hashCode9 = Long.hashCode(av8Var2.T);
                    aee m10 = av8Var2.m();
                    xtc C9 = fqj.C(av8Var2, p);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var5);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var2, c5, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var2, m10, ff3Var2);
                    Integer valueOf7 = Integer.valueOf(hashCode9);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var2, valueOf7, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var2, ryVar2);
                    b7 b7Var4 = b7Var2;
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var2, C9, f50Var6);
                    ListIterator<Object> listIterator3 = listIterator;
                    ListIterator<Object> listIterator4 = listIterator2;
                    xtc z4 = n9e.q(utcVar3, r13.c(lz.D(R.color.primary_default, av8Var2), floatValue), o7g.a(4.0f)).z(bkh.c);
                    k1c c6 = e12.c(mv1Var6, false);
                    lv1 lv1Var6 = lv1Var5;
                    int hashCode10 = Long.hashCode(av8Var2.T);
                    aee m11 = av8Var2.m();
                    xtc C10 = fqj.C(av8Var2, z4);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var5);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c6, f50Var4);
                    waa.K(av8Var2, m11, ff3Var2);
                    bf3.s(hashCode10, av8Var2, f50Var5, av8Var2, ryVar2);
                    waa.K(av8Var2, C10, f50Var6);
                    if (floatValue == 1.0f) {
                        av8Var2.d0(1456642402);
                        long v3 = v8a.v(10);
                        yf8 yf8Var3 = xth.a;
                        mv1Var = mv1Var6;
                        av8 av8Var4 = av8Var2;
                        udj.c("1:3", n12Var.a(utcVar3, mv1Var3), lz.D(R.color.on_color_primary, av8Var2), null, v3, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var4, 24582, 0, 131048);
                        av8Var2 = av8Var4;
                        av8Var2.s(false);
                    } else {
                        mv1Var = mv1Var6;
                        av8Var2.d0(1457126250);
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                    av8Var2.s(true);
                    z3 = true;
                    listIterator = listIterator3;
                    listIterator2 = listIterator4;
                    lv1Var5 = lv1Var6;
                    mv1Var5 = mv1Var;
                    b7Var2 = b7Var4;
                }
                z2 = z3;
                av8Var2.s(false);
                av8Var2.s(z2);
                i4 = i5;
                utcVar2 = utcVar3;
                f3 = f4;
                b7Var2 = b7Var2;
                lv1Var2 = lv1Var5;
            }
            b7 b7Var5 = b7Var2;
            utc utcVar4 = utcVar2;
            mv1 mv1Var7 = mv1Var5;
            av8Var2.s(false);
            av8Var2.s(z2);
            kq9.b(s6a.N(R.drawable.ic_dotted_line_straight, 6, av8Var2), null, bkh.p(l98.f0(utcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 76.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 24.0f), lz.D(R.color.neutral_default, av8Var2), av8Var2, 432, 0);
            av8Var2.s(true);
            av8Var2.s(true);
            float f5 = 36.0f;
            float f6 = 168.0f;
            xtc p2 = bkh.p(l98.f0(utcVar4, 36.0f, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), 168.0f);
            l8g a9 = k8g.a(ww9.h, lv1Var2, av8Var2, 54);
            int hashCode11 = Long.hashCode(av8Var2.T);
            aee m12 = av8Var2.m();
            xtc C11 = fqj.C(av8Var2, p2);
            if3.k7.getClass();
            zg3 zg3Var6 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var6);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a9, hf3.g);
            waa.K(av8Var2, m12, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode11), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C11, hf3.d);
            av8Var2.d0(362629553);
            int size = b7Var5.size();
            int i6 = 0;
            while (i6 < size) {
                float f7 = f6;
                String valueOf8 = String.valueOf(i6);
                yf8 yf8Var4 = xth.a;
                av8 av8Var5 = av8Var2;
                udj.c(valueOf8, bkh.p(utcVar4, f5), lz.D(R.color.n_lv_3, av8Var2), null, v8a.v(10), null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var5, 24624, 0, 130024);
                av8Var2 = av8Var5;
                i6++;
                f6 = f7;
                f5 = 36.0f;
            }
            float f8 = f6;
            av8Var2.s(false);
            av8Var2.s(true);
            xtc p3 = bkh.p(l98.f0(utcVar4, 36.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), f8);
            k1c c7 = e12.c(mv1Var7, false);
            int hashCode12 = Long.hashCode(av8Var2.T);
            aee m13 = av8Var2.m();
            xtc C12 = fqj.C(av8Var2, p3);
            if3.k7.getClass();
            zg3 zg3Var7 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var7);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c7, hf3.g);
            waa.K(av8Var2, m13, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode12), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C12, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_arrow_head, 6, av8Var2), null, n12Var.a(bkh.e(haa.v(utcVar4, z ? 0.0f : 180.0f), 12.0f), mv1Var2), lz.D(R.color.neutral_default, av8Var2), av8Var2, 48, 0);
            e12.a(0, av8Var2, bkh.p(bkh.e(n9e.q(n12Var.a(utcVar4, mv1Var3), lz.D(R.color.neutral_default, av8Var2), o7g.a(4.0f)), 2.0f), 164.0f));
            kq9.b(s6a.N(R.drawable.ic_arrow_head, 6, av8Var2), null, n12Var.a(bkh.l(haa.v(utcVar4, z ? 180.0f : 0.0f), 12.0f), uxf.h), lz.D(R.color.neutral_default, av8Var2), av8Var2, 48, 0);
            av8Var2.s(true);
            xtc p4 = bkh.p(l98.f0(utcVar4, 36.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), f8);
            String w = oea.w(R.string.result_probability_team_score, new Object[]{str2}, av8Var2);
            yf8 yf8Var5 = xth.a;
            av8 av8Var6 = av8Var2;
            udj.c(w, p4, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var6, 48, 0, 130040);
            av8Var6.s(true);
            mha.h(oea.v(R.string.close_window_button, av8Var6), function0, bkh.d(utcVar4, 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var6, ((i3 >> 3) & 112) | 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            av8Var = av8Var6;
            av8Var.s(true);
            xtcVar2 = utcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 11, str, str2, function0, xtcVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final void g(FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel, FantasyCompetitionType fantasyCompetitionType, Function0 function0, boolean z, xtc xtcVar, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2;
        xtc xtcVar3;
        av8 av8Var;
        zg3 zg3Var;
        lv1 lv1Var;
        f50 f50Var;
        f50 f50Var2;
        zg3 zg3Var2;
        f50 f50Var3;
        ry ryVar;
        ?? r13;
        av8 av8Var2;
        mv1 mv1Var;
        f50 f50Var4;
        ry ryVar2;
        f50 f50Var5;
        boolean z2;
        boolean z3;
        av8 av8Var3;
        av8 av8Var4;
        Object obj;
        long f2;
        String str;
        zg3 zg3Var3;
        boolean z4;
        mv1 mv1Var2 = uxf.g;
        fantasyPlayerFixtureUiModel.getClass();
        fantasyCompetitionType.getClass();
        function0.getClass();
        av8 av8Var5 = (av8) of3Var;
        av8Var5.f0(1502974653);
        int i5 = i2 | (av8Var5.g(fantasyPlayerFixtureUiModel) ? 4 : 2) | (av8Var5.i(function0) ? 256 : 128) | (av8Var5.h(z) ? a.o : 1024);
        int i6 = i3 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i5 | (av8Var5.g(xtcVar2) ? 16384 : 8192);
        }
        if (av8Var5.T(i4 & 1, (i4 & 9363) != 9362)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i6 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var5.k(nz.b);
            Integer num = fantasyPlayerFixtureUiModel.q;
            Integer num2 = fantasyPlayerFixtureUiModel.r;
            Integer num3 = fantasyPlayerFixtureUiModel.c;
            Integer num4 = fantasyPlayerFixtureUiModel.b;
            boolean z5 = (num == null || fantasyPlayerFixtureUiModel.s == null || fantasyPlayerFixtureUiModel.t == null) ? false : true;
            lv1 lv1Var2 = uxf.m;
            xtc d2 = bkh.d(xtcVar4, 1.0f);
            boolean z6 = (i4 & 896) == 256;
            Object O = av8Var5.O();
            a99 a99Var = nf3.a;
            Object obj2 = O;
            if (z6 || O == a99Var) {
                v61 v61Var = new v61(28, function0);
                av8Var5.n0(v61Var);
                obj2 = v61Var;
            }
            xtc xtcVar5 = xtcVar4;
            int i7 = i4;
            xtc c0 = l98.c0(tol.y(d2, false, false, false, 0L, null, (Function0) obj2, av8Var5, 31), 16.0f, 8.0f);
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var2, av8Var5, 48);
            int hashCode = Long.hashCode(av8Var5.T);
            aee m2 = av8Var5.m();
            xtc C = fqj.C(av8Var5, c0);
            if3.k7.getClass();
            zg3 zg3Var4 = hf3.b;
            av8Var5.h0();
            if (av8Var5.S) {
                av8Var5.l(zg3Var4);
            } else {
                av8Var5.q0();
            }
            f50 f50Var6 = hf3.g;
            waa.K(av8Var5, a2, f50Var6);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var5, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var7 = hf3.j;
            waa.K(av8Var5, valueOf, f50Var7);
            ry ryVar3 = hf3.k;
            waa.J(av8Var5, ryVar3);
            f50 f50Var8 = hf3.d;
            waa.K(av8Var5, C, f50Var8);
            l8g a3 = k8g.a(wxfVar, lv1Var2, av8Var5, 48);
            int hashCode2 = Long.hashCode(av8Var5.T);
            aee m3 = av8Var5.m();
            xtc C2 = fqj.C(av8Var5, utcVar);
            av8Var5.h0();
            if (av8Var5.S) {
                av8Var5.l(zg3Var4);
            } else {
                av8Var5.q0();
            }
            waa.K(av8Var5, a3, f50Var6);
            waa.K(av8Var5, m3, ff3Var);
            bf3.s(hashCode2, av8Var5, f50Var7, av8Var5, ryVar3);
            waa.K(av8Var5, C2, f50Var8);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            u23 a4 = t23.a(ww9.d, uxf.o, av8Var5, 0);
            int hashCode3 = Long.hashCode(av8Var5.T);
            aee m4 = av8Var5.m();
            xtc C3 = fqj.C(av8Var5, goaVar);
            av8Var5.h0();
            if (av8Var5.S) {
                av8Var5.l(zg3Var4);
            } else {
                av8Var5.q0();
            }
            waa.K(av8Var5, a4, f50Var6);
            waa.K(av8Var5, m4, ff3Var);
            bf3.s(hashCode3, av8Var5, f50Var7, av8Var5, ryVar3);
            waa.K(av8Var5, C3, f50Var8);
            String C4 = f5p.C(context, fantasyPlayerFixtureUiModel.f, fantasyPlayerFixtureUiModel.e);
            yf8 yf8Var = xth.a;
            udj.c(C4, null, lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var5, 0, 0, 131066);
            udj.c(rik.j(context, fantasyPlayerFixtureUiModel.m, bi4.PATTERN_DMY_SHORT, " "), null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var5, 0, 24960, 110586);
            av8 av8Var6 = av8Var5;
            i.o(av8Var6, true, utcVar, 12.0f, av8Var6);
            l8g a5 = k8g.a(wxfVar, lv1Var2, av8Var6, 48);
            int hashCode4 = Long.hashCode(av8Var6.T);
            aee m5 = av8Var6.m();
            xtc C5 = fqj.C(av8Var6, utcVar);
            av8Var6.h0();
            if (av8Var6.S) {
                zg3Var = zg3Var4;
                av8Var6.l(zg3Var);
            } else {
                zg3Var = zg3Var4;
                av8Var6.q0();
            }
            waa.K(av8Var6, a5, f50Var6);
            waa.K(av8Var6, m5, ff3Var);
            bf3.s(hashCode4, av8Var6, f50Var7, av8Var6, ryVar3);
            waa.K(av8Var6, C5, f50Var8);
            if (num4 == null || num3 == null) {
                lv1Var = lv1Var2;
                f50Var = f50Var8;
                f50Var2 = f50Var7;
                zg3Var2 = zg3Var;
                f50Var3 = f50Var6;
                ryVar = ryVar3;
                r13 = 0;
                av8Var6.d0(765923281);
                av8Var6.s(false);
                av8Var2 = av8Var6;
            } else {
                av8Var6.d0(765442781);
                int intValue = num4.intValue();
                int intValue2 = num3.intValue();
                Integer num5 = fantasyPlayerFixtureUiModel.s;
                Integer num6 = fantasyPlayerFixtureUiModel.t;
                if (num != null || num5 == null || num6 == null) {
                    zg3Var3 = zg3Var;
                    z4 = false;
                } else {
                    zg3Var3 = zg3Var;
                    z4 = true;
                }
                lv1Var = lv1Var2;
                f50Var = f50Var8;
                f50Var3 = f50Var6;
                ryVar = ryVar3;
                zg3Var2 = zg3Var3;
                f50Var2 = f50Var7;
                lz.o(intValue, intValue2, num5, num6, z4, null, 0L, 0L, z, av8Var6, (i7 << 15) & 234881024, 224);
                av8 av8Var7 = av8Var6;
                r13 = 0;
                av8Var7.s(false);
                av8Var2 = av8Var7;
            }
            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
            if (z5) {
                av8Var2.d0(766059712);
                xtc l2 = bkh.l(utcVar, 24.0f);
                n7g n7gVar = o7g.a;
                if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 3)) {
                    f2 = ljg.f(av8Var2, -1637845276, R.color.neutral_default, av8Var2, r13);
                } else {
                    f2 = (num2 != null && num2.intValue() == num.intValue()) ? ljg.f(av8Var2, -1637841955, R.color.success, av8Var2, r13) : ljg.f(av8Var2, -1637840133, R.color.error, av8Var2, r13);
                }
                xtc q = n9e.q(l2, f2, n7gVar);
                k1c c2 = e12.c(mv1Var2, r13);
                int hashCode5 = Long.hashCode(av8Var2.T);
                aee m6 = av8Var2.m();
                xtc C6 = fqj.C(av8Var2, q);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var2);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c2, f50Var3);
                waa.K(av8Var2, m6, ff3Var);
                f50 f50Var9 = f50Var2;
                ry ryVar4 = ryVar;
                bf3.s(hashCode5, av8Var2, f50Var9, av8Var2, ryVar4);
                f50 f50Var10 = f50Var;
                waa.K(av8Var2, C6, f50Var10);
                dfj l3 = xth.l();
                long D = lz.D(R.color.on_color_primary, av8Var2);
                if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 3)) {
                    str = "D";
                } else {
                    str = (num2 != null && num2.intValue() == num.intValue()) ? "W" : "L";
                }
                mv1Var = mv1Var2;
                ryVar2 = ryVar4;
                f50Var4 = f50Var9;
                f50Var5 = f50Var10;
                fqj.a(str, l3, D, null, null, av8Var2, 0, 24);
                z2 = true;
                av8Var2.s(true);
                av8Var2.s(r13);
            } else {
                mv1Var = mv1Var2;
                f50Var4 = f50Var2;
                ryVar2 = ryVar;
                f50Var5 = f50Var;
                z2 = true;
                av8Var2.d0(767170225);
                av8Var2.s(r13);
            }
            av8Var2.s(z2);
            av8Var2.s(z2);
            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z2);
            l8g a6 = k8g.a(ww9.c, lv1Var, av8Var2, 54);
            int hashCode6 = Long.hashCode(av8Var2.T);
            aee m7 = av8Var2.m();
            xtc C7 = fqj.C(av8Var2, goaVar2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var2);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a6, f50Var3);
            waa.K(av8Var2, m7, ff3Var);
            f50 f50Var11 = f50Var4;
            ry ryVar5 = ryVar2;
            bf3.s(hashCode6, av8Var2, f50Var11, av8Var2, ryVar5);
            f50 f50Var12 = f50Var5;
            waa.K(av8Var2, C7, f50Var12);
            if (z5) {
                av8Var2.d0(-1383968653);
                Integer num7 = fantasyPlayerFixtureUiModel.j;
                fqj.a(String.valueOf(num7 != null ? num7.intValue() : r13), xth.j(), lz.D(R.color.n_lv_1, av8Var2), bkh.p(utcVar, 24.0f), new p7j(3), av8Var2, 3072, 0);
                if (fantasyCompetitionType == FantasyCompetitionType.WEEKLY) {
                    ljg.r(16.0f, -1383602946, av8Var2, av8Var2, utcVar);
                    k1c c3 = e12.c(mv1Var, r13);
                    int hashCode7 = Long.hashCode(av8Var2.T);
                    aee m8 = av8Var2.m();
                    xtc C8 = fqj.C(av8Var2, utcVar);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c3, f50Var3);
                    waa.K(av8Var2, m8, ff3Var);
                    bf3.s(hashCode7, av8Var2, f50Var11, av8Var2, ryVar5);
                    waa.K(av8Var2, C8, f50Var12);
                    ry ryVar6 = ry.v;
                    Object O2 = av8Var2.O();
                    Object obj3 = O2;
                    if (O2 == a99Var) {
                        e87 e87Var = new e87(10);
                        av8Var2.n0(e87Var);
                        obj3 = e87Var;
                    }
                    Function1 function1 = (Function1) obj3;
                    boolean z7 = (i7 & 14) == 4 ? true : r13;
                    Object O3 = av8Var2.O();
                    if (z7 || O3 == a99Var) {
                        fantasyPlayerFixtureUiModel2 = fantasyPlayerFixtureUiModel;
                        x16 x16Var = new x16(fantasyPlayerFixtureUiModel2, 19);
                        av8Var2.n0(x16Var);
                        obj = x16Var;
                    } else {
                        fantasyPlayerFixtureUiModel2 = fantasyPlayerFixtureUiModel;
                        obj = O3;
                    }
                    of3 of3Var2 = av8Var2;
                    td4.b(function1, null, ryVar6, null, (Function1) obj, of3Var2, 6, 10);
                    av8 av8Var8 = of3Var2;
                    z3 = true;
                    av8Var8.s(true);
                    av8Var8.s(r13);
                    av8Var4 = av8Var8;
                } else {
                    z3 = true;
                    fantasyPlayerFixtureUiModel2 = fantasyPlayerFixtureUiModel;
                    av8Var2.d0(-1382920636);
                    av8Var2.s(r13);
                    av8Var4 = av8Var2;
                }
                av8Var4.s(r13);
                av8Var3 = av8Var4;
            } else {
                fantasyPlayerFixtureUiModel2 = fantasyPlayerFixtureUiModel;
                z3 = z2;
                av8Var2.d0(-1382881452);
                if (fantasyCompetitionType == FantasyCompetitionType.WEEKLY) {
                    av8Var2.d0(-1382815174);
                    Locale d3 = dla.d();
                    Float f3 = fantasyPlayerFixtureUiModel2.k;
                    fqj.a(String.format(d3, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f3 != null ? f3.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)}, z3 ? 1 : 0)), xth.j(), lz.D(R.color.n_lv_1, av8Var2), bkh.p(utcVar, 24.0f), new p7j(3), av8Var2, 3072, 0);
                    bf3.u(utcVar, 16.0f, av8Var2, r13);
                } else {
                    av8Var2.d0(-1382375036);
                    av8Var2.s(r13);
                }
                ktm.q(fantasyPlayerFixtureUiModel2.p, null, av8Var2, r13);
                av8Var2.s(r13);
                av8Var3 = av8Var2;
            }
            av8Var3.s(z3);
            av8Var3.s(z3);
            xtcVar3 = xtcVar5;
            av8Var = av8Var3;
        } else {
            fantasyPlayerFixtureUiModel2 = fantasyPlayerFixtureUiModel;
            av8Var5.W();
            xtcVar3 = xtcVar2;
            av8Var = av8Var5;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(fantasyPlayerFixtureUiModel2, fantasyCompetitionType, function0, z, xtcVar3, i2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0178, code lost:
    
        if (r5.equals(com.sofascore.model.Sports.ICE_HOCKEY) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015e, code lost:
    
        if (r5.equals(com.sofascore.model.Sports.BASKETBALL) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017e, code lost:
    
        r7 = com.sofascore.results.R.string.feed_game_recap_card_title;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(v39 v39Var, Function1 function1, ct8 ct8Var, wla wlaVar, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        Function1 function12;
        boolean z;
        boolean z2;
        int i5;
        Boolean bool;
        String str = v39Var.p;
        function1.getClass();
        ct8Var.getClass();
        wlaVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1487945316);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(v39Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(ct8Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? av8Var.g(wlaVar) : av8Var.i(wlaVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            xtc d0 = l98.d0(n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            utc utcVar = utc.a;
            int i6 = i3;
            xtc e0 = l98.e0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f, 8.0f, 14.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e0);
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
            xtc g2 = bkh.g(utcVar, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            Set set = wyh.a;
            x43 x43Var = v39Var.q;
            int a4 = wyh.a(str);
            int hashCode3 = str.hashCode();
            if (hashCode3 != -2002238939) {
                if (hashCode3 != -877324069) {
                    if (hashCode3 == 727149765) {
                    }
                } else if (str.equals(Sports.TENNIS)) {
                    i4 = R.string.feed_tennis_match_recap_card_title;
                }
                i4 = R.string.feed_match_recap_card_title;
            }
            z8e.l(a4, i4, 384, av8Var, g2);
            w1l.o(1.0f, true, av8Var);
            boolean z3 = v39Var.e;
            a99 a99Var = nf3.a;
            if (z3 && ((bool = x43Var.e) == null || bool.equals(Boolean.FALSE))) {
                av8Var.d0(1276961614);
                xtc l2 = bkh.l(utcVar, 32.0f);
                boolean z4 = ((i6 & 112) == 32) | ((i6 & 14) == 4);
                Object O = av8Var.O();
                if (z4 || O == a99Var) {
                    function12 = function1;
                    O = new ij8(7, function12, v39Var);
                    av8Var.n0(O);
                } else {
                    function12 = function1;
                }
                z2 = 0;
                z = true;
                ao2.g((Function0) O, l2, false, null, null, c6o.c, av8Var, 1572912, 60);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                function12 = function1;
                z = true;
                z2 = 0;
                av8Var.d0(1277423328);
                av8Var.s(false);
            }
            av8Var.s(z);
            boolean z5 = (i6 & 14) == 4 ? z : z2;
            Object O2 = av8Var.O();
            if (z5 || O2 == a99Var) {
                i5 = 2;
                O2 = new sr8(v39Var, i5);
                av8Var.n0(O2);
            } else {
                i5 = 2;
            }
            pr4 b2 = c6e.b(z2, (Function0) O2, av8Var, 6, i5);
            av8 av8Var2 = av8Var;
            f6a.a(b2, null, b2.k() == 0 ? l98.C(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10) : l98.B(16.0f, i5), null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, yqo.H(-529212923, av8Var, new c61(8, wlaVar, v39Var, ct8Var)), av8Var2, 0, 27648, 8186);
            av8Var = av8Var2;
            if (v39Var.r) {
                av8Var.d0(2127726492);
                av8Var.s(z2);
            } else {
                av8Var.d0(2127238955);
                xtc f0 = l98.f0(utcVar, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                MediaReactionType mediaReactionType = x43Var.a;
                int i7 = x43Var.b;
                int i8 = x43Var.c;
                boolean z6 = z2;
                int i9 = v39Var.m;
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = new xt8(18);
                    av8Var.n0(O3);
                }
                pco.p(mediaReactionType, i7, i8, i9, f0, "main_stacked_card", 0L, true, function12, (Function0) O3, av8Var, ((i6 << 21) & 234881024) | 818110464, 64);
                av8Var.s(z6);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(v39Var, function1, ct8Var, wlaVar, xtcVar, i2, 6);
        }
    }

    public static final void i(fq9 fq9Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-115453954);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(fq9Var) ? 4 : 2) | i2;
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
            int i4 = ((i3 >> 6) & 14) | 24576;
            int i5 = i3 << 3;
            iz8.m((i5 & 896) | i4 | (i5 & 112), fq9Var, av8Var, null, fq9Var.m, fq9Var.n, xtcVar, fq9Var.o, function1);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new eq9(fq9Var, function1, xtcVar, i2, 0);
        }
    }

    public static final void j(String str, Function0 function0, xtc xtcVar, long j2, long j3, of3 of3Var, int i2) {
        av8 av8Var;
        long j4;
        long j5;
        long D;
        int i3;
        long j6;
        str.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(210042875);
        int i4 = 2;
        int i5 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 11264;
        if (av8Var2.T(i5 & 1, (74899 & i5) != 74898)) {
            av8Var2.Y();
            if ((i2 & 1) == 0 || av8Var2.B()) {
                long j7 = r13.h;
                D = lz.D(R.color.primary_default, av8Var2);
                i3 = i5 & (-57345);
                j6 = j7;
            } else {
                av8Var2.W();
                i3 = i5 & (-57345);
                j6 = j2;
                D = j3;
            }
            av8Var2.t();
            long j8 = D;
            iz8.o(function0, l98.c0(n9e.q(wnn.A(xtcVar, o7g.a(16.0f)), j6, oyn.e), 12.0f, 6.0f), false, null, q72.a(j6, j6, j6, j6, av8Var2, 0), null, yqo.H(1734890846, av8Var2, new ahf(str, j8, i4)), av8Var2, ((i3 >> 3) & 14) | 805306368, 492);
            av8Var = av8Var2;
            j5 = j8;
            j4 = j6;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            j4 = j2;
            j5 = j3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i82(str, function0, xtcVar, j4, j5, i2);
        }
    }

    public static final void k(Function0 function0, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1646555525);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            n((View) av8Var.k(nz.f), (kx4) av8Var.k(dh3.h), function0, av8Var, (i3 << 6) & 896);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nj6(i2, i4, function0);
        }
    }

    public static final void l(int i2, of3 of3Var, xtc xtcVar, String str, Function0 function0, boolean z) {
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1983840880);
        int i3 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(-1464044112, av8Var, new b82(xtcVar, function0, z, str)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b82(str, xtcVar, z, function0, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(final String str, final Function0 function0, xtc xtcVar, long j2, long j3, boolean z, of3 of3Var, final int i2, final int i3) {
        String str2;
        int i4;
        Function0 function02;
        xtc xtcVar2;
        long j4;
        long j5;
        int i5;
        boolean z2;
        final xtc xtcVar3;
        final long j6;
        final long j7;
        final boolean z3;
        eqf u;
        long j8;
        boolean z4;
        long j9;
        xtc xtcVar4;
        int i6;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-478245590);
        if ((i2 & 6) == 0) {
            str2 = str;
            i4 = (av8Var.g(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            function02 = function0;
            i4 |= av8Var.i(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (av8Var.f(j4)) {
                        i6 = a.o;
                        i4 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 1024;
                i4 |= i6;
            } else {
                j4 = j2;
            }
            if ((i2 & 24576) != 0) {
                j5 = j3;
                i4 |= ((i3 & 16) == 0 && av8Var.f(j5)) ? 16384 : 8192;
            } else {
                j5 = j3;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                z2 = z;
                i4 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
                    av8Var.Y();
                    if ((i2 & 1) == 0 || av8Var.B()) {
                        if (i7 != 0) {
                            xtcVar2 = utc.a;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = lz.D(R.color.primary_default, av8Var);
                        }
                        if ((i3 & 16) != 0) {
                            j5 = lz.D(R.color.surface_1, av8Var);
                        }
                        if (i5 != 0) {
                            j8 = j4;
                            z4 = true;
                            j9 = j5;
                            xtcVar4 = xtcVar2;
                            av8Var.t();
                            tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(401916010, av8Var, new g82(xtcVar4, j8, j9, function02, z4, str2)), av8Var, 56);
                            xtcVar3 = xtcVar4;
                            j6 = j8;
                            j7 = j9;
                            z3 = z4;
                        }
                    } else {
                        av8Var.W();
                    }
                    j9 = j5;
                    z4 = z2;
                    xtcVar4 = xtcVar2;
                    j8 = j4;
                    av8Var.t();
                    tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(401916010, av8Var, new g82(xtcVar4, j8, j9, function02, z4, str2)), av8Var, 56);
                    xtcVar3 = xtcVar4;
                    j6 = j8;
                    j7 = j9;
                    z3 = z4;
                } else {
                    av8Var.W();
                    xtcVar3 = xtcVar2;
                    j6 = j4;
                    j7 = j5;
                    z3 = z2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: h82
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            qx9.m(str, function0, xtcVar3, j6, j7, z3, (of3) obj, aba.K(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void n(View view, kx4 kx4Var, Function0 function0, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1319522472);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(view) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(kx4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function0) ? 256 : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            boolean i4 = av8Var.i(view) | ((i3 & 896) == 256);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new xw5(19, view, function0);
                av8Var.n0(O);
            }
            hz8.b(view, kx4Var, (Function1) O, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(view, kx4Var, function0, i2, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(String str, Function0 function0, xtc xtcVar, long j2, boolean z, of3 of3Var, int i2, int i3) {
        int i4;
        long j3;
        boolean z2;
        boolean z3;
        long j4;
        xtc xtcVar2;
        eqf u;
        boolean z4;
        long j5;
        xtc xtcVar3;
        int i5;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(780485540);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function0) ? 32 : 16;
        }
        int i6 = i4 | 384;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j3 = j2;
                if (av8Var.f(j3)) {
                    i5 = a.o;
                    i6 |= i5;
                }
            } else {
                j3 = j2;
            }
            i5 = 1024;
            i6 |= i5;
        } else {
            j3 = j2;
        }
        int i7 = i6 | 24576;
        int i8 = i3 & 32;
        if (i8 != 0) {
            i7 = 221184 | i6;
        } else if ((196608 & i2) == 0) {
            z2 = z;
            i7 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (av8Var.T(i7 & 1, (74899 & i7) == 74898)) {
                av8Var.W();
                z3 = z2;
                j4 = j3;
                xtcVar2 = xtcVar;
            } else {
                av8Var.Y();
                if ((i2 & 1) == 0 || av8Var.B()) {
                    if ((i3 & 8) != 0) {
                        j3 = lz.D(R.color.primary_default, av8Var);
                    }
                    utc utcVar = utc.a;
                    if (i8 != 0) {
                        j5 = j3;
                        z4 = true;
                    } else {
                        z4 = z2;
                        j5 = j3;
                    }
                    xtcVar3 = utcVar;
                } else {
                    av8Var.W();
                    xtcVar3 = xtcVar;
                    z4 = z2;
                    j5 = j3;
                }
                av8Var.t();
                tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(-1397893020, av8Var, new e30(xtcVar3, j5, function0, z4, str)), av8Var, 56);
                xtcVar2 = xtcVar3;
                j4 = j5;
                z3 = z4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new f82(str, function0, xtcVar2, j4, z3, i2, i3, 0);
                return;
            }
            return;
        }
        z2 = z;
        if (av8Var.T(i7 & 1, (74899 & i7) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static xtc p(xtc xtcVar, float f2) {
        return xtcVar.z(new th0(f2));
    }

    public static void q(String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(str);
    }

    public static void r(boolean z) {
        if (z) {
            return;
        }
        ilg.c();
    }

    public static void s(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void t(boolean z) {
        if (z) {
            return;
        }
        zzl.s();
    }

    public static void u(Object obj) {
        if (obj != null) {
            return;
        }
        zzl.s();
    }

    public static void v(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a70.r(str);
    }

    public static void w(re4 re4Var) {
        if (re4Var != null) {
            try {
                re4Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Class x(String str) {
        if (cw3.a.contains(qx9.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            cw3.a(qx9.class, th);
            return null;
        }
    }

    public static final Method y(Class cls, String str, Class... clsArr) {
        if (!cw3.a.contains(qx9.class)) {
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                cw3.a(qx9.class, th);
            }
        }
        return null;
    }

    public static final Method z(Class cls, String str, Class... clsArr) {
        if (!cw3.a.contains(qx9.class)) {
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                cw3.a(qx9.class, th);
            }
        }
        return null;
    }
}
