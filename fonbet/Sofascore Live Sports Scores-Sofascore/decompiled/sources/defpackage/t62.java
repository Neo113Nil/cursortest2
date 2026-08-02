package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Process;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.appsflyer.internal.i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.stats.WakeLock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.V2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.ImageDisplayType;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.profile.ContributionStatus;
import com.sofascore.model.profile.ContributionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.view.SofascoreRatingView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class t62 implements qs3 {
    public static volatile FirebaseAnalytics a;
    public static final Object b = new Object();
    public static final tc3 c = new tc3(-1439431513, new gd3(17), false);
    public static final tc3 d = new tc3(-478186728, new gd3(18), false);
    public static final tc3 e = new tc3(-1822942295, new gd3(19), false);
    public static final tc3 f = new tc3(1924631479, new gd3(20), false);
    public static final tc3 g = new tc3(1220276927, new pd3(3), false);
    public static final tc3 h = new tc3(915310850, new qd3(14), false);
    public static final tc3 i = new tc3(-281510371, new gd3(4), false);
    public static final rm0 j = new rm0("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");
    public static final rm0 k = new rm0("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");
    public static final rm0 l = new rm0("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");
    public static final xlh m = new xlh(0);
    public static final ylh n = new ylh(0);
    public static final Object o = new Object();
    public static WakeLock p;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final /* synthetic */ int s = 0;

    public t62() {
        db8 db8Var = db8.a;
    }

    public static void A(Intent intent) {
        synchronized (o) {
            try {
                if (p != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    p.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static d80 B(d80 d80Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) ((eoh) d80Var.b).getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((f80) d80Var.c).a;
        }
        return new d80(d80Var.a, Float.valueOf(f2), new f80(f3), d80Var.d, d80Var.e, d80Var.f);
    }

    public static Intent C(Context context, Class cls, int i2, pzc pzcVar) {
        Intent putExtra = new Intent(context, (Class<?>) ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i2);
        Map unmodifiableMap = Collections.unmodifiableMap(pzcVar.a);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            kc kcVar = (kc) entry.getKey();
            arrayList.add(new Pair(kcVar.a, entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        putExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", hz8.E((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return putExtra;
    }

    public static final xbb D(Collection collection, boolean z, LinkedHashSet linkedHashSet) {
        collection.getClass();
        xbb b2 = a.b();
        if (!z) {
            b2.add(new ml1(R.string.baseball_all_pitch_outcomes));
        }
        Collection<l91> collection2 = collection;
        ArrayList arrayList = new ArrayList(k13.r(collection2, 10));
        for (l91 l91Var : collection2) {
            boolean z2 = linkedHashSet == null || linkedHashSet.contains(l91Var);
            String name = l91Var.name();
            int i2 = l91Var.c;
            arrayList.add(new ml1(i2, z ? l91Var.b : i2, name, z2, Integer.valueOf(l91Var.d)));
        }
        b2.addAll(arrayList);
        return a.a(b2);
    }

    public static final xbb E(Collection collection, boolean z, LinkedHashSet linkedHashSet) {
        collection.getClass();
        xbb b2 = a.b();
        if (!z) {
            b2.add(new ml1(R.string.baseball_all_pitch_types));
        }
        Collection<m91> collection2 = collection;
        ArrayList arrayList = new ArrayList(k13.r(collection2, 10));
        for (m91 m91Var : collection2) {
            boolean z2 = linkedHashSet == null || linkedHashSet.contains(m91Var);
            String name = m91Var.name();
            int i2 = m91Var.c;
            arrayList.add(new ml1(i2, z ? m91Var.b : i2, name, z2, Integer.valueOf(m91Var.d)));
        }
        b2.addAll(arrayList);
        return a.a(b2);
    }

    public static final List F(ArrayList arrayList) {
        return CollectionsKt.H0(arrayList, new cp(new qe8(14), 2));
    }

    public static final int G(ll1 ll1Var, gl1 gl1Var) {
        int i2 = il1.a[ll1Var.ordinal()];
        return (i2 == 1 && gl1Var == gl1.b) ? R.string.baseball_hit_spray_event_empty_state : i2 == 1 ? R.string.baseball_hit_spray_season_empty_state : R.string.baseball_chart_general_empty_state;
    }

    public static final List H(ArrayList arrayList, m91 m91Var, l91 l91Var) {
        ArrayList arrayList2;
        if (Boolean.valueOf((m91Var == null && l91Var == null) ? false : true).equals(Boolean.TRUE)) {
            arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                wl1 wl1Var = (wl1) next;
                if (m91Var == null || m91Var == wl1Var.a) {
                    if (l91Var == null || l91Var == wl1Var.b) {
                        arrayList2.add(next);
                    }
                }
            }
        } else {
            arrayList2 = null;
        }
        return arrayList2 == null ? arrayList : arrayList2;
    }

    public static /* synthetic */ List I(ArrayList arrayList, m91 m91Var, l91 l91Var, int i2) {
        if ((i2 & 1) != 0) {
            m91Var = null;
        }
        if ((i2 & 2) != 0) {
            l91Var = null;
        }
        return H(arrayList, m91Var, l91Var);
    }

    public static boolean J(Category category) {
        category.getClass();
        return c.o(category.getFlag(), "international", true) || c.o(category.getFlag(), "europe", true) || c.o(category.getFlag(), "africa", true) || c.o(category.getFlag(), "asia", true) || c.o(category.getFlag(), "oceania", true) || c.n(category.getFlag(), "america", false);
    }

    public static final void K(int i2, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1596273599);
        int i3 = 0;
        if (av8Var.T(i2 & 1, i2 != 0)) {
            rgh rghVar = ((sgh) av8Var.k(uhb.a)).a;
            Unit unit = Unit.a;
            boolean i4 = av8Var.i(rghVar);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new rrd(rghVar, null, i3);
                av8Var.n0(O);
            }
            hz8.o(av8Var, unit, (Function2) O);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mpa(i2, 18);
        }
    }

    public static void L(ArrayList arrayList, i1g i1gVar, boolean z) {
        int i2 = 1;
        int i3 = 0;
        try {
            yl2 yl2Var = new yl2(z, i3);
            Locale locale = Locale.getDefault();
            locale.getClass();
            n13.u(new xl2(yl2Var, new xl2(Collator.getInstance(locale), i1gVar, i3), i2), arrayList);
        } catch (Exception e2) {
            s38 a2 = s38.a();
            a2.b("Broken sort for locale=" + Locale.getDefault().getLanguage());
            a2.c(e2);
            yl2 yl2Var2 = new yl2(z, i2);
            Locale locale2 = Locale.US;
            locale2.getClass();
            n13.u(new xl2(yl2Var2, new xl2(Collator.getInstance(locale2), i1gVar, i3), i2), arrayList);
        }
    }

    public static ComponentName M(Context context, Intent intent) {
        synchronized (o) {
            try {
                y(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    p.a();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String N(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(Color.alpha(i2) / 255.0d)};
        int i3 = lik.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final String O(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f3 = f2 * pow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / pow;
        return max > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final Exception P(String str, FileNotFoundException fileNotFoundException) {
        int i2;
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i2 = obtain.readInt();
            } catch (Throwable unused) {
                i2 = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i2 + ".ce_available", "false");
            invoke.getClass();
            z = ((String) invoke).equals("true");
        } catch (Throwable th) {
            de6.a(fileNotFoundException, th);
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new d35(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static d80 a(int i2, float f2, float f3) {
        if ((i2 & 2) != 0) {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return new d80(lz.f, Float.valueOf(f2), new f80(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(final int i2, final long j2, final String str, final float f2, final String str2, final BrandLocation brandLocation, final ImageDisplayType imageDisplayType, final String str3, final xtc xtcVar, of3 of3Var, final int i3) {
        av8 av8Var;
        brandLocation.getClass();
        str3.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1503285059);
        int i4 = i3 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.f(j2) ? 32 : 16) | (av8Var2.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.d(f2) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var2.g(str2) ? 16384 : 8192) | (av8Var2.e(imageDisplayType.ordinal()) ? 8388608 : 4194304) | (av8Var2.g(str3) ? 67108864 : 33554432) | (av8Var2.g(xtcVar) ? 536870912 : 268435456);
        if (av8Var2.T(i4 & 1, (306783379 & i4) != 306783378)) {
            Context context = (Context) av8Var2.k(nz.b);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            ImageDisplayType imageDisplayType2 = ImageDisplayType.BANNER;
            utc utcVar = utc.a;
            if (imageDisplayType == imageDisplayType2) {
                d2 = d2.z(n9e.q(wnn.A(utcVar, o7g.a(16.0f)), j2, oyn.e));
            }
            xtc xtcVar2 = d2;
            long D = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = fi.n;
                av8Var2.n0(O2);
            }
            xtc y = tol.y(xtcVar2, true, true, false, D, wzcVar, new b32((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), context, brandLocation, str3, str2, 0), av8Var2, 0);
            av8Var = av8Var2;
            xtc b0 = l98.b0(y, 2.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            if (imageDisplayType == imageDisplayType2) {
                av8Var.d0(808091252);
                td4.h(48, av8Var, bkh.e(bkh.d(utcVar, 1.0f), 24.0f), vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "branding/provider/", "/powered-by-image"));
                av8Var.s(false);
            } else {
                av8Var.d0(808305865);
                av8Var.s(false);
            }
            xtc e2 = bkh.e(bkh.d(utcVar, 1.0f), f2);
            if (imageDisplayType == imageDisplayType2) {
                e2 = e2.z(wnn.A(utcVar, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)));
            }
            td4.f(str, imageDisplayType == imageDisplayType2 ? mp3.a : mp3.b, e2, av8Var, (i4 >> 6) & 14);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i2, j2, str, f2, str2, brandLocation, imageDisplayType, str3, xtcVar, i3) { // from class: a32
                public final /* synthetic */ int a;
                public final /* synthetic */ long b;
                public final /* synthetic */ String c;
                public final /* synthetic */ float d;
                public final /* synthetic */ String e;
                public final /* synthetic */ BrandLocation f;
                public final /* synthetic */ ImageDisplayType g;
                public final /* synthetic */ String h;
                public final /* synthetic */ xtc i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1769473);
                    t62.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(kfk kfkVar, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        long f2;
        long f3;
        int i5;
        long f4;
        int i6;
        boolean z;
        long f5;
        int i7;
        boolean z2;
        long j2;
        long j3;
        kfkVar.getClass();
        int i8 = kfkVar.l;
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2072965390);
        int i9 = i2 | (av8Var.g(kfkVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i9 & 1, (i9 & 1171) != 1170)) {
            ContributionType contributionType = kfkVar.j;
            Integer num = kfkVar.m;
            boolean z3 = kfkVar.f;
            int i10 = contributionType == null ? -1 : cs3.a[contributionType.ordinal()];
            int i11 = R.drawable.ic_contribution_match_start;
            if (i10 != -1 && i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    i11 = R.drawable.ic_contribution_score;
                } else if (i10 == 4) {
                    i11 = R.drawable.ic_contribution_scorer;
                } else {
                    if (i10 != 5) {
                        zzl.b();
                        return;
                    }
                    i11 = R.drawable.ic_contribution_assistant;
                }
            }
            int i12 = i11;
            ContributionStatus contributionStatus = kfkVar.k;
            int i13 = contributionStatus != null ? cs3.b[contributionStatus.ordinal()] : -1;
            if (i13 == 1) {
                i3 = 745109470;
                i4 = R.color.success;
            } else if (i13 != 2) {
                f2 = ljg.f(av8Var, 745111995, R.color.n_lv_3, av8Var, false);
                long j4 = f2;
                if (!z3) {
                    i5 = 745114491;
                } else if (num != null && num.intValue() == 1) {
                    i5 = 745115803;
                } else {
                    f3 = ljg.f(av8Var, 745116283, R.color.n_lv_3, av8Var, false);
                    long j5 = f3;
                    if (z3) {
                        i6 = 745118587;
                    } else if (num != null && num.intValue() == 2) {
                        i6 = 745119899;
                    } else {
                        f4 = ljg.f(av8Var, 745120379, R.color.n_lv_3, av8Var, false);
                        long j6 = f4;
                        xtc y = tol.y(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), false, false, false, 0L, null, function0, av8Var, 31);
                        l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C = fqj.C(av8Var, y);
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
                        utc utcVar = utc.a;
                        xtc d2 = bkh.d(bkh.p(l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 56.0f), 1.0f);
                        u23 a3 = t23.a(new ng0(2.0f, true, new a70(6)), uxf.p, av8Var, 54);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, d2);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a3, f50Var);
                        waa.K(av8Var, m3, ff3Var);
                        bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C2, f50Var3);
                        yf8 yf8Var = xth.a;
                        udj.c(kfkVar.b, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                        dfj g2 = xth.g();
                        if (z3) {
                            z = false;
                            f5 = ljg.f(av8Var, -657947775, R.color.n_lv_3, av8Var, false);
                        } else {
                            z = false;
                            f5 = ljg.f(av8Var, -657948658, R.color.crowdsourcing_live, av8Var, false);
                        }
                        udj.c(kfkVar.c, null, f5, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g2, av8Var, 0, 0, 131066);
                        av8Var.s(true);
                        td4.N(bkh.e(bkh.p(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 1.0f), 36.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
                        xtc d0 = l98.d0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        u23 a4 = t23.a(ww9.d, uxf.o, av8Var, 0);
                        int hashCode3 = Long.hashCode(av8Var.T);
                        aee m4 = av8Var.m();
                        xtc C3 = fqj.C(av8Var, d0);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a4, f50Var);
                        waa.K(av8Var, m4, ff3Var);
                        bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C3, f50Var3);
                        ms3 ms3Var = kfkVar.d;
                        if (z3) {
                            i7 = R.color.crowdsourcing_live;
                            z2 = false;
                            av8Var.d0(-657573010);
                            av8Var.s(false);
                            j2 = j5;
                        } else {
                            i7 = R.color.crowdsourcing_live;
                            z2 = false;
                            j2 = ljg.f(av8Var, -657573897, R.color.crowdsourcing_live, av8Var, false);
                        }
                        int i14 = i7;
                        boolean z4 = z2;
                        d(ms3Var, j5, j2, av8Var, 0);
                        ms3 ms3Var2 = kfkVar.e;
                        if (z3) {
                            av8Var.d0(-657565426);
                            av8Var.s(z4);
                            j3 = j6;
                        } else {
                            j3 = ljg.f(av8Var, -657566313, i14, av8Var, z4);
                        }
                        d(ms3Var2, j6, j3, av8Var, 0);
                        av8Var.s(true);
                        td4.N(bkh.e(bkh.p(utcVar, 1.0f), 36.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
                        xtc y2 = tol.y(utcVar, false, false, false, 0L, null, function02, av8Var, 31);
                        av8Var = av8Var;
                        k1c c2 = e12.c(uxf.c, false);
                        int hashCode4 = Long.hashCode(av8Var.T);
                        aee m5 = av8Var.m();
                        xtc C4 = fqj.C(av8Var, y2);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, c2, f50Var);
                        waa.K(av8Var, m5, ff3Var);
                        bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C4, f50Var3);
                        kq9.b(s6a.N(i12, 6, av8Var), null, bkh.l(l98.b0(utcVar, 12.0f), 28.0f), j4, av8Var, 432, 0);
                        if (i8 <= 1) {
                            av8Var.d0(393118518);
                            udj.c(String.valueOf(i8), bkh.e(bkh.p(n9e.q(l98.f0(n12.a.a(utcVar, uxf.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), lz.D(R.color.primary_default, av8Var), o7g.a(6.0f)), 23.0f), 12.0f), lz.D(R.color.surface_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 130040);
                            av8Var = av8Var;
                            av8Var.s(false);
                        } else {
                            av8Var.d0(393659034);
                            av8Var.s(false);
                        }
                        av8Var.s(true);
                        av8Var.s(true);
                    }
                    f4 = ljg.f(av8Var, i6, R.color.n_lv_1, av8Var, false);
                    long j62 = f4;
                    xtc y3 = tol.y(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), false, false, false, 0L, null, function0, av8Var, 31);
                    l8g a22 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode5 = Long.hashCode(av8Var.T);
                    aee m22 = av8Var.m();
                    xtc C5 = fqj.C(av8Var, y3);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var, a22, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var, m22, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    f50 f50Var22 = hf3.j;
                    waa.K(av8Var, valueOf2, f50Var22);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var, ryVar2);
                    f50 f50Var32 = hf3.d;
                    waa.K(av8Var, C5, f50Var32);
                    utc utcVar2 = utc.a;
                    xtc d22 = bkh.d(bkh.p(l98.f0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 56.0f), 1.0f);
                    u23 a32 = t23.a(new ng0(2.0f, true, new a70(6)), uxf.p, av8Var, 54);
                    int hashCode22 = Long.hashCode(av8Var.T);
                    aee m32 = av8Var.m();
                    xtc C22 = fqj.C(av8Var, d22);
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, a32, f50Var4);
                    waa.K(av8Var, m32, ff3Var2);
                    bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                    waa.K(av8Var, C22, f50Var32);
                    yf8 yf8Var2 = xth.a;
                    udj.c(kfkVar.b, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                    dfj g22 = xth.g();
                    if (z3) {
                    }
                    udj.c(kfkVar.c, null, f5, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g22, av8Var, 0, 0, 131066);
                    av8Var.s(true);
                    td4.N(bkh.e(bkh.p(l98.f0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 1.0f), 36.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
                    xtc d02 = l98.d0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a42 = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode32 = Long.hashCode(av8Var.T);
                    aee m42 = av8Var.m();
                    xtc C32 = fqj.C(av8Var, d02);
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, a42, f50Var4);
                    waa.K(av8Var, m42, ff3Var2);
                    bf3.s(hashCode32, av8Var, f50Var22, av8Var, ryVar2);
                    waa.K(av8Var, C32, f50Var32);
                    ms3 ms3Var3 = kfkVar.d;
                    if (z3) {
                    }
                    int i142 = i7;
                    boolean z42 = z2;
                    d(ms3Var3, j5, j2, av8Var, 0);
                    ms3 ms3Var22 = kfkVar.e;
                    if (z3) {
                    }
                    d(ms3Var22, j62, j3, av8Var, 0);
                    av8Var.s(true);
                    td4.N(bkh.e(bkh.p(utcVar2, 1.0f), 36.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
                    xtc y22 = tol.y(utcVar2, false, false, false, 0L, null, function02, av8Var, 31);
                    av8Var = av8Var;
                    k1c c22 = e12.c(uxf.c, false);
                    int hashCode42 = Long.hashCode(av8Var.T);
                    aee m52 = av8Var.m();
                    xtc C42 = fqj.C(av8Var, y22);
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, c22, f50Var4);
                    waa.K(av8Var, m52, ff3Var2);
                    bf3.s(hashCode42, av8Var, f50Var22, av8Var, ryVar2);
                    waa.K(av8Var, C42, f50Var32);
                    kq9.b(s6a.N(i12, 6, av8Var), null, bkh.l(l98.b0(utcVar2, 12.0f), 28.0f), j4, av8Var, 432, 0);
                    if (i8 <= 1) {
                    }
                    av8Var.s(true);
                    av8Var.s(true);
                }
                f3 = ljg.f(av8Var, i5, R.color.n_lv_1, av8Var, false);
                long j52 = f3;
                if (z3) {
                }
                f4 = ljg.f(av8Var, i6, R.color.n_lv_1, av8Var, false);
                long j622 = f4;
                xtc y32 = tol.y(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), false, false, false, 0L, null, function0, av8Var, 31);
                l8g a222 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode52 = Long.hashCode(av8Var.T);
                aee m222 = av8Var.m();
                xtc C52 = fqj.C(av8Var, y32);
                if3.k7.getClass();
                zg3 zg3Var22 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                f50 f50Var42 = hf3.g;
                waa.K(av8Var, a222, f50Var42);
                ff3 ff3Var22 = hf3.f;
                waa.K(av8Var, m222, ff3Var22);
                Integer valueOf22 = Integer.valueOf(hashCode52);
                f50 f50Var222 = hf3.j;
                waa.K(av8Var, valueOf22, f50Var222);
                ry ryVar22 = hf3.k;
                waa.J(av8Var, ryVar22);
                f50 f50Var322 = hf3.d;
                waa.K(av8Var, C52, f50Var322);
                utc utcVar22 = utc.a;
                xtc d222 = bkh.d(bkh.p(l98.f0(utcVar22, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 56.0f), 1.0f);
                u23 a322 = t23.a(new ng0(2.0f, true, new a70(6)), uxf.p, av8Var, 54);
                int hashCode222 = Long.hashCode(av8Var.T);
                aee m322 = av8Var.m();
                xtc C222 = fqj.C(av8Var, d222);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a322, f50Var42);
                waa.K(av8Var, m322, ff3Var22);
                bf3.s(hashCode222, av8Var, f50Var222, av8Var, ryVar22);
                waa.K(av8Var, C222, f50Var322);
                yf8 yf8Var22 = xth.a;
                udj.c(kfkVar.b, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                dfj g222 = xth.g();
                if (z3) {
                }
                udj.c(kfkVar.c, null, f5, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g222, av8Var, 0, 0, 131066);
                av8Var.s(true);
                td4.N(bkh.e(bkh.p(l98.f0(utcVar22, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 1.0f), 36.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
                xtc d022 = l98.d0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                u23 a422 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode322 = Long.hashCode(av8Var.T);
                aee m422 = av8Var.m();
                xtc C322 = fqj.C(av8Var, d022);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a422, f50Var42);
                waa.K(av8Var, m422, ff3Var22);
                bf3.s(hashCode322, av8Var, f50Var222, av8Var, ryVar22);
                waa.K(av8Var, C322, f50Var322);
                ms3 ms3Var32 = kfkVar.d;
                if (z3) {
                }
                int i1422 = i7;
                boolean z422 = z2;
                d(ms3Var32, j52, j2, av8Var, 0);
                ms3 ms3Var222 = kfkVar.e;
                if (z3) {
                }
                d(ms3Var222, j622, j3, av8Var, 0);
                av8Var.s(true);
                td4.N(bkh.e(bkh.p(utcVar22, 1.0f), 36.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
                xtc y222 = tol.y(utcVar22, false, false, false, 0L, null, function02, av8Var, 31);
                av8Var = av8Var;
                k1c c222 = e12.c(uxf.c, false);
                int hashCode422 = Long.hashCode(av8Var.T);
                aee m522 = av8Var.m();
                xtc C422 = fqj.C(av8Var, y222);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, c222, f50Var42);
                waa.K(av8Var, m522, ff3Var22);
                bf3.s(hashCode422, av8Var, f50Var222, av8Var, ryVar22);
                waa.K(av8Var, C422, f50Var322);
                kq9.b(s6a.N(i12, 6, av8Var), null, bkh.l(l98.b0(utcVar22, 12.0f), 28.0f), j4, av8Var, 432, 0);
                if (i8 <= 1) {
                }
                av8Var.s(true);
                av8Var.s(true);
            } else {
                i3 = 745111132;
                i4 = R.color.error;
            }
            f2 = ljg.f(av8Var, i3, i4, av8Var, false);
            long j42 = f2;
            if (!z3) {
            }
            f3 = ljg.f(av8Var, i5, R.color.n_lv_1, av8Var, false);
            long j522 = f3;
            if (z3) {
            }
            f4 = ljg.f(av8Var, i6, R.color.n_lv_1, av8Var, false);
            long j6222 = f4;
            xtc y322 = tol.y(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e), false, false, false, 0L, null, function0, av8Var, 31);
            l8g a2222 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode522 = Long.hashCode(av8Var.T);
            aee m2222 = av8Var.m();
            xtc C522 = fqj.C(av8Var, y322);
            if3.k7.getClass();
            zg3 zg3Var222 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            f50 f50Var422 = hf3.g;
            waa.K(av8Var, a2222, f50Var422);
            ff3 ff3Var222 = hf3.f;
            waa.K(av8Var, m2222, ff3Var222);
            Integer valueOf222 = Integer.valueOf(hashCode522);
            f50 f50Var2222 = hf3.j;
            waa.K(av8Var, valueOf222, f50Var2222);
            ry ryVar222 = hf3.k;
            waa.J(av8Var, ryVar222);
            f50 f50Var3222 = hf3.d;
            waa.K(av8Var, C522, f50Var3222);
            utc utcVar222 = utc.a;
            xtc d2222 = bkh.d(bkh.p(l98.f0(utcVar222, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 56.0f), 1.0f);
            u23 a3222 = t23.a(new ng0(2.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode2222 = Long.hashCode(av8Var.T);
            aee m3222 = av8Var.m();
            xtc C2222 = fqj.C(av8Var, d2222);
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a3222, f50Var422);
            waa.K(av8Var, m3222, ff3Var222);
            bf3.s(hashCode2222, av8Var, f50Var2222, av8Var, ryVar222);
            waa.K(av8Var, C2222, f50Var3222);
            yf8 yf8Var222 = xth.a;
            udj.c(kfkVar.b, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            dfj g2222 = xth.g();
            if (z3) {
            }
            udj.c(kfkVar.c, null, f5, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g2222, av8Var, 0, 0, 131066);
            av8Var.s(true);
            td4.N(bkh.e(bkh.p(l98.f0(utcVar222, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 1.0f), 36.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
            xtc d0222 = l98.d0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a4222 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode3222 = Long.hashCode(av8Var.T);
            aee m4222 = av8Var.m();
            xtc C3222 = fqj.C(av8Var, d0222);
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a4222, f50Var422);
            waa.K(av8Var, m4222, ff3Var222);
            bf3.s(hashCode3222, av8Var, f50Var2222, av8Var, ryVar222);
            waa.K(av8Var, C3222, f50Var3222);
            ms3 ms3Var322 = kfkVar.d;
            if (z3) {
            }
            int i14222 = i7;
            boolean z4222 = z2;
            d(ms3Var322, j522, j2, av8Var, 0);
            ms3 ms3Var2222 = kfkVar.e;
            if (z3) {
            }
            d(ms3Var2222, j6222, j3, av8Var, 0);
            av8Var.s(true);
            td4.N(bkh.e(bkh.p(utcVar222, 1.0f), 36.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
            xtc y2222 = tol.y(utcVar222, false, false, false, 0L, null, function02, av8Var, 31);
            av8Var = av8Var;
            k1c c2222 = e12.c(uxf.c, false);
            int hashCode4222 = Long.hashCode(av8Var.T);
            aee m5222 = av8Var.m();
            xtc C4222 = fqj.C(av8Var, y2222);
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, c2222, f50Var422);
            waa.K(av8Var, m5222, ff3Var222);
            bf3.s(hashCode4222, av8Var, f50Var2222, av8Var, ryVar222);
            waa.K(av8Var, C4222, f50Var3222);
            kq9.b(s6a.N(i12, 6, av8Var), null, bkh.l(l98.b0(utcVar222, 12.0f), 28.0f), j42, av8Var, 432, 0);
            if (i8 <= 1) {
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 6, kfkVar, function0, function02, xtcVar);
        }
    }

    public static final void d(final ms3 ms3Var, final long j2, final long j3, of3 of3Var, final int i2) {
        String str;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1839974451);
        int i3 = i2 | (av8Var.g(ms3Var) ? 4 : 2) | (av8Var.f(j2) ? 32 : 16) | (av8Var.f(j3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
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
            int i4 = ms3Var.a;
            Integer num = ms3Var.d;
            td4.G(i4, bkh.l(utcVar, 16.0f), false, 0L, av8Var, 48, 12);
            goa goaVar = new goa(1.0f, true);
            yf8 yf8Var = xth.a;
            udj.c(ms3Var.b, goaVar, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, (i3 << 3) & 896, 24960, 110584);
            dfj e2 = xth.e();
            Integer num2 = ms3Var.c;
            if (num2 == null || (str = String.valueOf(num2.intValue())) == null) {
                str = "-";
            }
            int i5 = i3 & 896;
            udj.c(str, null, j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e2, av8Var, i5, 0, 131066);
            av8Var = av8Var;
            if (num != null) {
                av8Var.d0(-402313444);
                udj.c("(" + num + ")", null, j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, i5, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(-402158413);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(j2, j3, i2) { // from class: bs3
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    t62.d(ms3.this, this.b, this.c, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(j05 j05Var, Function1 function1, of3 of3Var, int i2) {
        int i3;
        Function1 function12;
        j05 j05Var2;
        j05 j05Var3 = j05Var;
        Function1 function13 = function1;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1744864629);
        int i4 = 2;
        int i5 = i2 | (av8Var.g(j05Var3) ? 4 : 2) | (av8Var.i(function13) ? 32 : 16);
        if (av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            wd8 wd8Var = (wd8) av8Var.k(dh3.i);
            mvh mvhVar = (mvh) av8Var.k(dh3.q);
            boolean z = j05Var3.u;
            int i6 = i5 & 112;
            boolean z2 = i6 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new ri(26, function13);
                av8Var.n0(O);
            }
            un0.f(z, (Function0) O, false, false, yqo.H(-850431494, av8Var, new o34(i4, function13)), av8Var, 24576, 12);
            boolean z3 = j05Var3.v;
            boolean z4 = i6 == 32;
            Object O2 = av8Var.O();
            if (z4 || O2 == a99Var) {
                O2 = new ri(27, function13);
                av8Var.n0(O2);
            }
            tz9.l(z3, (Function0) O2, null, false, null, "Trigger popup", null, null, yqo.H(1050648686, av8Var, new y47(i4, function13)), av8Var, 100859904, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            g28 g28Var = bkh.c;
            xtc q2 = n9e.q(g28Var, lz.D(R.color.surface_0, av8Var), oyn.e);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O3;
            boolean i7 = av8Var.i(wd8Var) | av8Var.g(mvhVar);
            Object O4 = av8Var.O();
            if (i7 || O4 == a99Var) {
                O4 = new h84(5, wd8Var, mvhVar);
                av8Var.n0(O4);
            }
            xtc Y = ml4.Y(oyn.u(q2, wzcVar, null, false, null, null, (Function0) O4, 28));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, Y);
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
            i3 = 6;
            ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var);
            int i8 = i5 & 14;
            boolean z5 = (i6 == 32) | (i8 == 4);
            Object O5 = av8Var.O();
            if (z5 || O5 == a99Var) {
                function12 = function1;
                O5 = new vz4(j05Var, function12);
                av8Var.n0(O5);
            } else {
                function12 = function1;
            }
            boolean z6 = false;
            pea.k("Developer Options", (Function0) O5, null, 0L, 0L, N, yqo.H(-703536697, av8Var, new y47(3, function12)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 1572870, TTAdConstant.IMAGE_URL_CODE);
            av8Var = av8Var;
            t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 48.0f);
            ng0 ng0Var = new ng0(8.0f, true, new a70(i3));
            boolean z7 = i8 == 4;
            if (i6 == 32) {
                z6 = true;
            }
            boolean z8 = z7 | z6;
            Object O6 = av8Var.O();
            if (z8 || O6 == a99Var) {
                j05Var2 = j05Var;
                O6 = new r82(17, j05Var2, function1);
                av8Var.n0(O6);
            } else {
                j05Var2 = j05Var;
            }
            Function1 function14 = (Function1) O6;
            function13 = function1;
            j05Var3 = j05Var2;
            v8a.a(g28Var, null, t3eVar, ng0Var, null, null, false, null, function14, av8Var, 24966, 490);
            av8Var.s(true);
        } else {
            i3 = 6;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(j05Var3, function13, i2, i3);
        }
    }

    public static final void f(q05 q05Var, Function0 function0, Function0 function02, of3 of3Var, int i2) {
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(670225355);
        int i3 = i2 | (av8Var.i(q05Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function02) ? 256 : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            j05 j05Var = (j05) rfo.x(q05Var.n, av8Var, 0).getValue();
            boolean i4 = ((i3 & 112) == 32) | av8Var.i(context) | av8Var.i(q05Var) | ((i3 & 896) == 256);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                l50 l50Var = new l50(function0, context, q05Var, function02, 10);
                av8Var.n0(l50Var);
                O = l50Var;
            }
            e(j05Var, (Function1) O, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(q05Var, function0, function02, i2, 20);
        }
    }

    public static final void g(ux6 ux6Var, ux6 ux6Var2, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        long j2;
        boolean z2;
        char c2;
        boolean z3;
        ImageVector N;
        boolean z4 = z;
        ux6Var.getClass();
        ux6Var2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(842234451);
        int i3 = (i2 & 6) == 0 ? (av8Var.g(ux6Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(ux6Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        boolean z5 = true;
        boolean z6 = false;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc A = wnn.A(bkh.e(bkh.p(xtcVar, 72.0f), 40.0f), o7g.a(8.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, A);
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
            av8Var.d0(-1236788729);
            for (ux6 ux6Var3 : b.j(ux6Var, ux6Var2)) {
                o68 o68Var = ux6Var3.c;
                r13 r13Var = null;
                Integer valueOf = o68Var != null ? Integer.valueOf(o68Var.a) : null;
                if (valueOf == null) {
                    av8Var.d0(-1148612991);
                    av8Var.s(z6);
                } else {
                    r13Var = new r13(wv8.b(av8Var, -1148612990, valueOf, av8Var, z6));
                }
                if (r13Var == null) {
                    j2 = ljg.f(av8Var, -37051110, R.color.neutral_default, av8Var, z6);
                } else {
                    av8Var.d0(-37052722);
                    av8Var.s(z6);
                    j2 = r13Var.a;
                }
                lv1 lv1Var = uxf.m;
                kg0 kg0Var = ww9.f;
                utc utcVar = utc.a;
                xtc q2 = n9e.q(fn0.e(1.0f, bkh.d(utcVar, 1.0f), z5), j2, oyn.e);
                boolean i4 = av8Var.i(context) | av8Var.g(ux6Var3);
                Object O = av8Var.O();
                if (i4 || O == nf3.a) {
                    O = new ht7(context, ux6Var3, 3);
                    av8Var.n0(O);
                }
                av8 av8Var2 = av8Var;
                Context context2 = context;
                xtc y = tol.y(q2, false, false, false, 0L, null, (Function0) O, av8Var2, 31);
                av8Var = av8Var2;
                l8g a3 = k8g.a(kg0Var, lv1Var, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, y);
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
                waa.K(av8Var, m3, ff3Var);
                Integer valueOf2 = Integer.valueOf(hashCode2);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf2, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C2, f50Var3);
                if (z4) {
                    av8Var.d0(-1009979717);
                    String a4 = ux6Var3.a();
                    yf8 yf8Var = xth.a;
                    q5a.w(a4, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.k(), av8Var, 0, 24960, 110586);
                    av8Var = av8Var;
                    av8Var.s(false);
                    Unit unit = Unit.a;
                    z3 = false;
                    z2 = true;
                    c2 = 0;
                } else {
                    av8Var.d0(-1009647614);
                    xtc b0 = l98.b0(n9e.q(utcVar, lz.D(R.color.on_color_primary, av8Var), o7g.a(4.0f)), 1.0f);
                    k1c c3 = e12.c(uxf.c, false);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m4 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, b0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var2);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c3, f50Var);
                    waa.K(av8Var, m4, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var3);
                    td4.u(ux6Var3.b, 48, av8Var, bkh.l(utcVar, 16.0f));
                    z2 = true;
                    av8Var.s(true);
                    p68 p68Var = ux6Var3.d;
                    if (p68Var == null) {
                        av8Var.d0(-1009182088);
                        av8Var.s(false);
                        z3 = false;
                        c2 = 0;
                    } else {
                        c2 = 0;
                        ljg.r(8.0f, -1009182087, av8Var, av8Var, utcVar);
                        xtc l2 = bkh.l(utcVar, 16.0f);
                        long D = lz.D(R.color.on_color_primary, av8Var);
                        int ordinal = p68Var.ordinal();
                        if (ordinal == 0) {
                            z3 = false;
                            av8Var.d0(2010777801);
                            N = s6a.N(R.drawable.ic_home, 6, av8Var);
                            av8Var.s(false);
                        } else {
                            if (ordinal != 1) {
                                throw dmi.h(av8Var, 2010775029, false);
                            }
                            av8Var.d0(2010781385);
                            N = s6a.N(R.drawable.ic_away, 6, av8Var);
                            z3 = false;
                            av8Var.s(false);
                        }
                        kq9.b(N, null, l2, D, av8Var, 432, 0);
                        Unit unit2 = Unit.a;
                        av8Var.s(z3);
                    }
                    av8Var.s(z3);
                }
                av8Var.s(z2);
                z5 = z2;
                z6 = z3;
                z4 = z;
                context = context2;
            }
            av8Var.s(z6);
            av8Var.s(z5);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(ux6Var, ux6Var2, z, xtcVar, i2, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(xtc xtcVar, String str, final String str2, ImageVector imageVector, Function0 function0, boolean z, long j2, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        int i4;
        String str3;
        int i5;
        ImageVector imageVector2;
        int i6;
        int i7;
        Function0 function02;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        final long j3;
        final String str4;
        final Function0 function03;
        final boolean z3;
        final xtc xtcVar3;
        final ImageVector imageVector3;
        eqf u;
        String str5;
        ImageVector imageVector4;
        xtc xtcVar4;
        int i12;
        boolean z4;
        long D;
        String str6;
        ImageVector imageVector5;
        Function0 function04;
        boolean z5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1791554847);
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i2 | 6;
            xtcVar2 = xtcVar;
        } else if ((i2 & 6) == 0) {
            xtcVar2 = xtcVar;
            i4 = i2 | (av8Var.g(xtcVar2) ? 4 : 2);
        } else {
            xtcVar2 = xtcVar;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            str3 = str;
            if (av8Var.g(str3)) {
                i5 = 32;
                int i14 = i4 | i5 | (!av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
                if ((i3 & 8) != 0) {
                    imageVector2 = imageVector;
                    if (av8Var.g(imageVector2)) {
                        i6 = com.ironsource.mediationsdk.metadata.a.o;
                        int i15 = i14 | i6;
                        i7 = i3 & 16;
                        if (i7 != 0) {
                            i8 = i15 | 24576;
                            function02 = function0;
                        } else {
                            function02 = function0;
                            i8 = i15 | (av8Var.i(function02) ? 16384 : 8192);
                        }
                        i9 = i3 & 32;
                        if (i9 != 0) {
                            i10 = i8 | 196608;
                            z2 = z;
                        } else {
                            z2 = z;
                            i10 = i8 | (av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
                        }
                        i11 = i10 | 524288;
                        if (av8Var.T(i11 & 1, (599187 & i11) != 599186)) {
                            av8Var.Y();
                            int i16 = i2 & 1;
                            utc utcVar = utc.a;
                            if (i16 == 0 || av8Var.B()) {
                                if (i13 != 0) {
                                    xtcVar2 = utcVar;
                                }
                                if ((i3 & 2) != 0) {
                                    str5 = oea.v(R.string.loading_error_title, av8Var);
                                    i11 &= -113;
                                } else {
                                    str5 = str3;
                                }
                                if ((i3 & 8) != 0) {
                                    imageVector4 = s6a.N(R.drawable.check_back_later, 6, av8Var);
                                    i11 &= -7169;
                                } else {
                                    imageVector4 = imageVector2;
                                }
                                if (i7 != 0) {
                                    function02 = null;
                                }
                                if (i9 != 0) {
                                    z2 = false;
                                }
                                xtcVar4 = xtcVar2;
                                i12 = i11 & (-3670017);
                                z4 = z2;
                                D = lz.D(R.color.surface_1, av8Var);
                                str6 = str5;
                                imageVector5 = imageVector4;
                            } else {
                                av8Var.W();
                                if ((i3 & 2) != 0) {
                                    i11 &= -113;
                                }
                                if ((i3 & 8) != 0) {
                                    i11 &= -7169;
                                }
                                i12 = i11 & (-3670017);
                                xtcVar4 = xtcVar2;
                                imageVector5 = imageVector2;
                                z4 = z2;
                                D = j2;
                                str6 = str3;
                            }
                            Function0 function05 = function02;
                            av8Var.t();
                            kv1 kv1Var = uxf.p;
                            xtc h2 = ljg.h(16.0f, bkh.d(xtcVar4, 1.0f), D, 8.0f);
                            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
                            int hashCode = Long.hashCode(av8Var.T);
                            aee m2 = av8Var.m();
                            xtc C = fqj.C(av8Var, h2);
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
                            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
                            long j4 = D;
                            int i17 = i12 >> 9;
                            kq9.b(imageVector5, null, bkh.l(utcVar, 96.0f), r13.i, av8Var, (i17 & 14) | V2.b.f, 0);
                            ImageVector imageVector6 = imageVector5;
                            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
                            yf8 yf8Var = xth.a;
                            xtc xtcVar5 = xtcVar4;
                            String str7 = str6;
                            udj.c(str7, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var, (i12 >> 3) & 14, 0, 130042);
                            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
                            udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var, (i12 >> 6) & 14, 0, 130042);
                            av8Var = av8Var;
                            if (function05 != null) {
                                bf3.r(24.0f, 1379324330, av8Var, av8Var, utcVar);
                                String upperCase = oea.v(R.string.refresh_button, av8Var).toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                function04 = function05;
                                z5 = z4;
                                mha.h(upperCase, function04, bkh.d(utcVar, 1.0f), oqh.a, null, false, z5, false, 0L, 0, 0, av8Var, (i17 & 112) | 3456 | (3670016 & (i12 << 3)), 0, 1968);
                                av8Var = av8Var;
                                av8Var.s(false);
                            } else {
                                function04 = function05;
                                z5 = z4;
                                bf3.r(16.0f, 1379682721, av8Var, av8Var, utcVar);
                                av8Var.s(false);
                            }
                            av8Var.s(true);
                            function03 = function04;
                            z3 = z5;
                            j3 = j4;
                            imageVector3 = imageVector6;
                            str4 = str7;
                            xtcVar3 = xtcVar5;
                        } else {
                            av8Var.W();
                            j3 = j2;
                            str4 = str3;
                            function03 = function02;
                            z3 = z2;
                            xtcVar3 = xtcVar2;
                            imageVector3 = imageVector2;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new Function2() { // from class: um5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    t62.h(xtc.this, str4, str2, imageVector3, function03, z3, j3, (of3) obj, aba.K(i2 | 1), i3);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                } else {
                    imageVector2 = imageVector;
                }
                i6 = 1024;
                int i152 = i14 | i6;
                i7 = i3 & 16;
                if (i7 != 0) {
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                i11 = i10 | 524288;
                if (av8Var.T(i11 & 1, (599187 & i11) != 599186)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
        } else {
            str3 = str;
        }
        i5 = 16;
        int i142 = i4 | i5 | (!av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i3 & 8) != 0) {
        }
        i6 = 1024;
        int i1522 = i142 | i6;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i11 = i10 | 524288;
        if (av8Var.T(i11 & 1, (599187 & i11) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void i(final gv9 gv9Var, final ev6 ev6Var, xtc xtcVar, final Function1 function1, of3 of3Var, int i2) {
        xtc xtcVar2;
        gv9Var.getClass();
        ev6Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-381443064);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.g(ev6Var) ? 32 : 16) | 384 | (av8Var.i(function1) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            final double d2 = ((Configuration) av8Var.k(nz.a)).screenWidthDp / 360.0d;
            tol.b(thb.a.a(Double.valueOf(d2)), yqo.H(-1444579128, av8Var, new Function2() { // from class: wy6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    zg3 zg3Var;
                    ev6 ev6Var2;
                    boolean z;
                    char c2;
                    il8 il8Var;
                    of3 of3Var2 = (of3) obj;
                    int intValue = ((Integer) obj2).intValue();
                    kv1 kv1Var = uxf.p;
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                        double d3 = d2;
                        float f2 = (float) (6.0d * d3);
                        float f3 = (float) (2.0d * d3);
                        float f4 = (float) (4.0d * d3);
                        v66 v66Var = new v66(12);
                        ArrayList arrayList = new ArrayList();
                        gv9 gv9Var2 = gv9Var;
                        for (Object obj3 : gv9Var2) {
                            if (((oz6) obj3).getA() == rz6.h) {
                                arrayList.add(obj3);
                            }
                        }
                        List H0 = CollectionsKt.H0(arrayList, v66Var);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : gv9Var2) {
                            if (((oz6) obj4).getA() == rz6.i) {
                                arrayList2.add(obj4);
                            }
                        }
                        List H02 = CollectionsKt.H0(arrayList2, v66Var);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : gv9Var2) {
                            if (((oz6) obj5).getA() == rz6.j) {
                                arrayList3.add(obj5);
                            }
                        }
                        List H03 = CollectionsKt.H0(arrayList3, v66Var);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj6 : gv9Var2) {
                            if (((oz6) obj6).getA() == rz6.k) {
                                arrayList4.add(obj6);
                            }
                        }
                        List H04 = CollectionsKt.H0(arrayList4, v66Var);
                        lmk J = o6a.J(s6a.N(R.drawable.fantasy_football_pitch, 6, av8Var2), av8Var2);
                        u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        utc utcVar = utc.a;
                        xtc C = fqj.C(av8Var2, utcVar);
                        if3.k7.getClass();
                        int i4 = 2;
                        zg3 zg3Var2 = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var2);
                        } else {
                            av8Var2.q0();
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var2, a2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var2, m2, ff3Var);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var2, valueOf, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var2, ryVar);
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var2, C, f50Var3);
                        ev6 ev6Var3 = ev6Var;
                        o02.o(ev6Var3, null, av8Var2, 0);
                        k1c c3 = e12.c(uxf.c, false);
                        boolean z2 = false;
                        int hashCode2 = Long.hashCode(av8Var2.T);
                        aee m3 = av8Var2.m();
                        xtc C2 = fqj.C(av8Var2, utcVar);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            zg3Var = zg3Var2;
                            av8Var2.l(zg3Var);
                        } else {
                            zg3Var = zg3Var2;
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, c3, f50Var);
                        waa.K(av8Var2, m3, ff3Var);
                        bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                        waa.K(av8Var2, C2, f50Var3);
                        zg3 zg3Var3 = zg3Var;
                        ev6 ev6Var4 = ev6Var3;
                        float f5 = f3;
                        wkn.k(J, null, qx9.p(bkh.d(utcVar, 1.0f), Float.intBitsToFloat((int) (J.i() >> 32)) / Float.intBitsToFloat((int) (J.i() & 4294967295L))), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
                        ng0 ng0Var = new ng0(f2, true, new a70(6));
                        xtc f0 = l98.f0(qx9.p(bkh.d(utcVar, 1.0f), Float.intBitsToFloat((int) (J.i() >> 32)) / Float.intBitsToFloat((int) (J.i() & 4294967295L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        u23 a3 = t23.a(ng0Var, kv1Var, av8Var2, 48);
                        int hashCode3 = Long.hashCode(av8Var2.T);
                        aee m4 = av8Var2.m();
                        xtc C3 = fqj.C(av8Var2, f0);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var3);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a3, f50Var);
                        waa.K(av8Var2, m4, ff3Var);
                        bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                        waa.K(av8Var2, C3, f50Var3);
                        av8Var2.d0(-216123084);
                        for (List list : b.j(H0, H02, H03, H04)) {
                            float f6 = f5;
                            ng0 ng0Var2 = new ng0(f6, true, new l1(kv1Var, 5));
                            xtc d0 = l98.d0(gz8.x(bkh.t(utcVar, 3), null, null, 3), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i4);
                            l8g a4 = k8g.a(ng0Var2, uxf.l, av8Var2, z2 ? 1 : 0);
                            int hashCode4 = Long.hashCode(av8Var2.T);
                            aee m5 = av8Var2.m();
                            xtc C4 = fqj.C(av8Var2, d0);
                            if3.k7.getClass();
                            zg3 zg3Var4 = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(zg3Var4);
                            } else {
                                av8Var2.q0();
                            }
                            waa.K(av8Var2, a4, hf3.g);
                            waa.K(av8Var2, m5, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode4), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C4, hf3.d);
                            av8Var2.d0(-1364177508);
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                oz6 oz6Var = (oz6) list.get(i5);
                                av8Var2.a0(2028442039, Integer.valueOf(oz6Var.getE()));
                                boolean z3 = oz6Var instanceof FantasyFootballPlayerPlaceholder;
                                Function1 function12 = function1;
                                if (z3) {
                                    av8Var2.d0(-1542697264);
                                    ev6 ev6Var5 = ev6Var4;
                                    ev6Var2 = ev6Var5;
                                    av8 av8Var3 = av8Var2;
                                    fkf.k(oz6Var, ev6Var5.A, null, function12, av8Var3, 0);
                                    z = false;
                                    av8Var3.s(false);
                                    av8Var2 = av8Var3;
                                } else {
                                    av8 av8Var4 = av8Var2;
                                    ev6 ev6Var6 = ev6Var4;
                                    if (oz6Var instanceof FantasyRoundPlayerUiModel) {
                                        av8Var4.d0(-1542168776);
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) oz6Var;
                                        int i6 = xy6.a[ev6Var6.d.ordinal()];
                                        if (i6 != 1) {
                                            c2 = 2;
                                            if (i6 != 2) {
                                                zzl.b();
                                                return null;
                                            }
                                            il8Var = il8.i;
                                        } else {
                                            c2 = 2;
                                            il8Var = il8.h;
                                        }
                                        ev6Var2 = ev6Var6;
                                        dy0.g(fantasyRoundPlayerUiModel, il8Var, false, false, function12, ev6Var6.A, null, false, av8Var4, 3456, PsExtractor.AUDIO_STREAM);
                                        av8Var2 = av8Var4;
                                        z = false;
                                        av8Var2.s(false);
                                    } else {
                                        ev6Var2 = ev6Var6;
                                        z = false;
                                        av8Var2 = av8Var4;
                                        av8Var2.d0(-1541283137);
                                        av8Var2.s(false);
                                    }
                                }
                                av8Var2.s(z);
                                i5++;
                                ev6Var4 = ev6Var2;
                            }
                            av8Var2.s(false);
                            av8Var2.s(true);
                            f5 = f6;
                            z2 = false;
                            i4 = 2;
                        }
                        i.p(av8Var2, z2, true, true, true);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 56);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 19, gv9Var, ev6Var, xtcVar2, function1);
        }
    }

    public static final void j(int i2, Function0 function0, xtc xtcVar, Function0 function02, of3 of3Var, int i3, int i4) {
        int i5;
        xtc xtcVar2;
        Function0 function03;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1070064200);
        int i6 = 2;
        int i7 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        int i8 = i7 | 384;
        int i9 = i4 & 8;
        if (i9 != 0) {
            i5 = i7 | 3456;
        } else {
            i5 = i8 | (av8Var.i(function02) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        }
        if (av8Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            Function0 function04 = i9 != 0 ? null : function02;
            ek2 t = rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0);
            n7g a2 = o7g.a(16.0f);
            tc3 H = yqo.H(802227078, av8Var, new w54(function04, i2, function0, i6));
            xtcVar2 = utc.a;
            un0.a(xtcVar2, a2, t, null, null, H, av8Var, 196614, 24);
            function03 = function04;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            function03 = function02;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(i2, function0, xtcVar2, function03, i3, i4);
        }
    }

    public static final void k(d97 d97Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2084740842);
        int i3 = i2 | (av8Var.g(d97Var) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            qug o0 = hkg.o0(av8Var);
            int i4 = i3 >> 3;
            tz9.k(true, function0, xtcVar, o0, null, d97Var.a.getTitle().a(av8Var), null, null, yqo.H(1804269197, av8Var, new qm4(17, d97Var, o0)), av8Var, (i4 & 112) | 100663302 | (i4 & 896), Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(d97Var, function0, xtcVar, i2, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void l(final f93 f93Var, xtc xtcVar, of3 of3Var, int i2) {
        ?? r1;
        xtc xtcVar2;
        av8 av8Var;
        boolean z;
        Object obj;
        f50 f50Var;
        ry ryVar;
        f50 f50Var2;
        Unit unit;
        utc utcVar;
        a99 a99Var;
        f50 f50Var3;
        zg3 zg3Var;
        f50 f50Var4;
        ff3 ff3Var;
        ry ryVar2;
        f50 f50Var5;
        av8 av8Var2;
        boolean z2;
        utc utcVar2;
        av8 av8Var3;
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(-439141954);
        int i3 = i2 | (av8Var4.g(f93Var) ? 4 : 2) | 48;
        if (av8Var4.T(i3 & 1, (i3 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.h;
            utc utcVar3 = utc.a;
            xtc b0 = l98.b0(bkh.d(utcVar3, 1.0f), 8.0f);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var4, 54);
            int hashCode = Long.hashCode(av8Var4.T);
            aee m2 = av8Var4.m();
            xtc C = fqj.C(av8Var4, b0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var2);
            } else {
                av8Var4.q0();
            }
            f50 f50Var6 = hf3.g;
            waa.K(av8Var4, a2, f50Var6);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var4, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var7 = hf3.j;
            waa.K(av8Var4, valueOf, f50Var7);
            ry ryVar3 = hf3.k;
            waa.J(av8Var4, ryVar3);
            f50 f50Var8 = hf3.d;
            waa.K(av8Var4, C, f50Var8);
            mv1 mv1Var = uxf.f;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var4.T);
            aee m3 = av8Var4.m();
            xtc C2 = fqj.C(av8Var4, goaVar);
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var2);
            } else {
                av8Var4.q0();
            }
            waa.K(av8Var4, c2, f50Var6);
            waa.K(av8Var4, m3, ff3Var2);
            bf3.s(hashCode2, av8Var4, f50Var7, av8Var4, ryVar3);
            waa.K(av8Var4, C2, f50Var8);
            String str = f93Var.a;
            a99 a99Var2 = nf3.a;
            Unit unit2 = null;
            if (str == null) {
                av8Var4.d0(1573570430);
                z = false;
                av8Var4.s(false);
                ryVar = ryVar3;
                f50Var2 = f50Var7;
                f50Var = f50Var8;
                unit = null;
            } else {
                av8Var4.d0(1573570431);
                Object O = av8Var4.O();
                Object obj2 = O;
                if (O == a99Var2) {
                    e87 e87Var = new e87(27);
                    av8Var4.n0(e87Var);
                    obj2 = e87Var;
                }
                Function1 function1 = (Function1) obj2;
                boolean z3 = (i3 & 14) == 4;
                Object O2 = av8Var4.O();
                if (z3 || O2 == a99Var2) {
                    z = false;
                    final boolean z4 = false ? 1 : 0;
                    Function1 function12 = new Function1() { // from class: nk7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i4 = z4;
                            f93 f93Var2 = f93Var;
                            SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) obj3;
                            switch (i4) {
                                case 0:
                                    sofascoreRatingView.getClass();
                                    sofascoreRatingView.setRating(f93Var2.a);
                                    break;
                                default:
                                    sofascoreRatingView.getClass();
                                    sofascoreRatingView.setRating(f93Var2.b);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var4.n0(function12);
                    obj = function12;
                } else {
                    z = false;
                    obj = O2;
                }
                f50Var = f50Var8;
                ryVar = ryVar3;
                f50Var2 = f50Var7;
                td4.a(function1, null, (Function1) obj, av8Var4, 6, 2);
                Unit unit3 = Unit.a;
                av8Var4.s(z);
                unit = Unit.a;
            }
            if (unit == null) {
                av8Var4.d0(1573765173);
                yf8 yf8Var = xth.a;
                a99Var = a99Var2;
                f50Var3 = f50Var;
                boolean z5 = z;
                zg3Var = zg3Var2;
                f50Var4 = f50Var6;
                ff3Var = ff3Var2;
                ryVar2 = ryVar;
                f50Var5 = f50Var2;
                utcVar = utcVar3;
                udj.c("-", l98.c0(utcVar3, 4.0f, 2.0f), lz.D(R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var4, 54, 24960, 110584);
                av8 av8Var5 = av8Var4;
                Unit unit4 = Unit.a;
                av8Var5.s(z5);
                z2 = z5;
                av8Var2 = av8Var5;
            } else {
                utcVar = utcVar3;
                a99Var = a99Var2;
                boolean z6 = z;
                f50Var3 = f50Var;
                zg3Var = zg3Var2;
                f50Var4 = f50Var6;
                ff3Var = ff3Var2;
                ryVar2 = ryVar;
                f50Var5 = f50Var2;
                av8Var4.d0(-1473260638);
                av8Var4.s(z6);
                z2 = z6;
                av8Var2 = av8Var4;
            }
            av8Var2.s(true);
            String v = oea.v(f93Var.e, av8Var2);
            yf8 yf8Var2 = xth.a;
            av8 av8Var6 = av8Var2;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var6), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.m(), av8Var6, 0, 24960, 110586);
            av8 av8Var7 = av8Var6;
            mv1 mv1Var2 = uxf.h;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            k1c c3 = e12.c(mv1Var2, z2);
            int hashCode3 = Long.hashCode(av8Var7.T);
            aee m4 = av8Var7.m();
            xtc C3 = fqj.C(av8Var7, goaVar2);
            av8Var7.h0();
            if (av8Var7.S) {
                av8Var7.l(zg3Var);
            } else {
                av8Var7.q0();
            }
            waa.K(av8Var7, c3, f50Var4);
            waa.K(av8Var7, m4, ff3Var);
            bf3.s(hashCode3, av8Var7, f50Var5, av8Var7, ryVar2);
            waa.K(av8Var7, C3, f50Var3);
            if (f93Var.b == null) {
                av8Var7.d0(-1237947994);
                av8Var7.s(z2);
            } else {
                av8Var7.d0(-1237947993);
                Object O3 = av8Var7.O();
                a99 a99Var3 = a99Var;
                Object obj3 = O3;
                if (O3 == a99Var3) {
                    e87 e87Var2 = new e87(28);
                    av8Var7.n0(e87Var2);
                    obj3 = e87Var2;
                }
                Function1 function13 = (Function1) obj3;
                boolean z7 = (i3 & 14) == 4 ? true : z2 ? 1 : 0;
                Object O4 = av8Var7.O();
                Object obj4 = O4;
                if (z7 || O4 == a99Var3) {
                    final int i4 = 1;
                    Function1 function14 = new Function1() { // from class: nk7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj32) {
                            int i42 = i4;
                            f93 f93Var2 = f93Var;
                            SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) obj32;
                            switch (i42) {
                                case 0:
                                    sofascoreRatingView.getClass();
                                    sofascoreRatingView.setRating(f93Var2.a);
                                    break;
                                default:
                                    sofascoreRatingView.getClass();
                                    sofascoreRatingView.setRating(f93Var2.b);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var7.n0(function14);
                    obj4 = function14;
                }
                td4.a(function13, null, (Function1) obj4, av8Var7, 6, 2);
                Unit unit5 = Unit.a;
                av8Var7.s(z2);
                unit2 = Unit.a;
            }
            if (unit2 == null) {
                av8Var7.d0(-1237752290);
                utc utcVar4 = utcVar;
                utcVar2 = utcVar4;
                udj.c("-", l98.c0(utcVar4, 4.0f, 2.0f), lz.D(R.color.n_lv_1, av8Var7), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var7, 54, 24960, 110584);
                av8 av8Var8 = av8Var7;
                Unit unit6 = Unit.a;
                av8Var8.s(z2);
                av8Var3 = av8Var8;
            } else {
                utcVar2 = utcVar;
                av8Var7.d0(1345539163);
                av8Var7.s(z2);
                av8Var3 = av8Var7;
            }
            av8Var3.s(true);
            av8Var3.s(true);
            xtcVar2 = utcVar2;
            r1 = z2;
            av8Var = av8Var3;
        } else {
            r1 = 0;
            av8Var4.W();
            xtcVar2 = xtcVar;
            av8Var = av8Var4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ok7(f93Var, xtcVar2, i2, r1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(boolean z, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-619349100);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i4 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            int i6 = 1;
            int i7 = 0;
            if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                xtcVar3 = i5 != 0 ? utc.a : xtcVar2;
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = e.c(0);
                    av8Var.n0(O);
                }
                znh znhVar = (znh) O;
                cdi b2 = a60.b(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(600, 0, null, 6), null, av8Var, 48, 28);
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = new t07(znhVar, i6);
                    av8Var.n0(O2);
                }
                xtc h0 = o02.h0(xtcVar3, (Function1) O2);
                boolean g2 = av8Var.g(b2);
                Object O3 = av8Var.O();
                if (g2 || O3 == a99Var) {
                    O3 = new ord(i7, b2, znhVar);
                    av8Var.n0(O3);
                }
                xtc M = s02.M(h0, (Function1) O3);
                k1c c2 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, M);
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
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                fc6.v((i4 >> 6) & 14, tc3Var, av8Var, true);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new x80(z, xtcVar3, tc3Var, i2, i3, 8);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i2 & 384) == 0) {
        }
        int i62 = 1;
        int i72 = 0;
        if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void n(boolean z, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1448807869);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            int i4 = 6;
            if (O == nf3.a) {
                O = new ild(i4);
                av8Var.n0(O);
            }
            m(z, xtcVar, yqo.H(1218228100, av8Var, new wbc(5, (e1d) o3a.N(objArr, (Function0) O, av8Var, 48), function0, function02)), av8Var, (i3 & 14) | 384 | ((i3 >> 6) & 112), 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(z, function0, function02, xtcVar, i2, 17);
        }
    }

    public static final void o(boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1568497739);
        if ((i2 & 48) == 0) {
            i3 = (av8Var.g(xtcVar) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            String v = oea.v(R.string.welcome_to_sofascore_header, av8Var);
            long D = lz.D(R.color.on_color_primary, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, d2, D, null, 0L, null, 0L, null, new p7j(z ? 3 : 5), 0L, 0, false, 0, 0, null, xth.h(), av8Var, 48, 0, 130040);
            udj.c(oea.v(R.string.welcome_to_sofascore_body_text, av8Var), vxd.f(utcVar, z ? 24.0f : 8.0f, av8Var, utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(z ? 3 : 5), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gs5(z, xtcVar, i2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v42 */
    public static final void p(Function0 function0, Function1 function1, xtc xtcVar, of3 of3Var, int i2, int i3) {
        Function0 function02;
        int i4;
        xtc xtcVar2;
        int i5;
        xtc xtcVar3;
        av8 av8Var;
        boolean z;
        e1d e1dVar;
        Unit unit;
        e1d e1dVar2;
        Unit unit2;
        ?? r8;
        av8 av8Var2;
        av8 av8Var3;
        String str;
        float f2;
        e1d e1dVar3;
        a99 a99Var;
        float f3;
        av8 av8Var4;
        jf9 jf9Var = oyn.e;
        function0.getClass();
        function1.getClass();
        av8 av8Var5 = (av8) of3Var;
        av8Var5.f0(1299760935);
        if ((i2 & 6) == 0) {
            function02 = function0;
            i4 = i2 | (av8Var5.i(function02) ? 4 : 2);
        } else {
            function02 = function0;
            i4 = i2;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i5 = i4 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i4 | (av8Var5.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i7 = i5;
        if (av8Var5.T(i7 & 1, (i7 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i6 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var5.k(nz.b);
            w05 w05Var = (w05) av8Var5.k(jhb.a);
            boolean booleanValue = ((Boolean) av8Var5.k(f5a.a)).booleanValue();
            boolean g2 = av8Var5.g(context);
            Object O = av8Var5.O();
            a99 a99Var2 = nf3.a;
            if (g2 || O == a99Var2) {
                O = Boolean.valueOf(y05.a(context));
                av8Var5.n0(O);
            }
            boolean booleanValue2 = ((Boolean) O).booleanValue();
            Object O2 = av8Var5.O();
            if (O2 == a99Var2) {
                O2 = e.f(Boolean.FALSE);
                av8Var5.n0(O2);
            }
            e1d e1dVar4 = (e1d) O2;
            Object O3 = av8Var5.O();
            if (O3 == a99Var2) {
                O3 = e.f(Boolean.FALSE);
                av8Var5.n0(O3);
            }
            e1d e1dVar5 = (e1d) O3;
            Object O4 = av8Var5.O();
            if (O4 == a99Var2) {
                O4 = e.f(Boolean.FALSE);
                av8Var5.n0(O4);
            }
            e1d e1dVar6 = (e1d) O4;
            Object O5 = av8Var5.O();
            rq3 rq3Var = null;
            if (O5 == a99Var2) {
                O5 = e.f(null);
                av8Var5.n0(O5);
            }
            e1d e1dVar7 = (e1d) O5;
            Unit unit3 = Unit.a;
            Object O6 = av8Var5.O();
            if (O6 == a99Var2) {
                z = booleanValue2;
                O6 = new j8c(e1dVar4, e1dVar5, e1dVar6, rq3Var, 20);
                e1dVar = e1dVar4;
                unit = null;
                av8Var5.n0(O6);
            } else {
                z = booleanValue2;
                e1dVar = e1dVar4;
                unit = null;
            }
            hz8.o(av8Var5, unit3, (Function2) O6);
            if (booleanValue || z) {
                e1dVar2 = e1dVar7;
                unit2 = unit;
                r8 = 0;
                av8Var5.d0(2049291513);
                av8Var5.s(false);
                e1dVar.setValue(Boolean.TRUE);
            } else {
                av8Var5.d0(2048858784);
                boolean i8 = av8Var5.i(context);
                Object O7 = av8Var5.O();
                if (i8 || O7 == a99Var2) {
                    e1dVar2 = e1dVar7;
                    O7 = new lwc(context, e1dVar5, e1dVar6, e1dVar2, 2);
                    av8Var5.n0(O7);
                } else {
                    e1dVar2 = e1dVar7;
                }
                unit2 = null;
                jca.f(unit3, null, (Function1) O7, av8Var5, 6);
                r8 = 0;
                av8Var5.s(false);
            }
            if (booleanValue) {
                av8Var5.d0(2049385691);
                av8Var5.s(r8);
            } else {
                av8Var5.d0(2049347251);
                K(r8, av8Var5);
                av8Var5.s(r8);
            }
            if (w05Var.a) {
                e1d e1dVar8 = e1dVar;
                av8Var5.d0(2050837018);
                g28 g28Var = bkh.c;
                xtc r0 = ml4.r0(n9e.q(xtcVar4.z(g28Var), lz.D(R.color.graphics_dark, av8Var5), jf9Var));
                k1c c2 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var5.T);
                aee m2 = av8Var5.m();
                xtc C = fqj.C(av8Var5, r0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var);
                } else {
                    av8Var5.q0();
                }
                waa.K(av8Var5, c2, hf3.g);
                waa.K(av8Var5, m2, hf3.f);
                waa.K(av8Var5, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var5, hf3.k);
                waa.K(av8Var5, C, hf3.d);
                ale aleVar = (ale) e1dVar2.getValue();
                if (aleVar == null) {
                    av8Var5.d0(-485473620);
                    av8Var5.s(false);
                    av8Var2 = av8Var5;
                } else {
                    av8Var5.d0(-485473619);
                    v(aleVar, ((Boolean) e1dVar5.getValue()).booleanValue(), ((Boolean) e1dVar6.getValue()).booleanValue(), true, g28Var, av8Var5, 27648);
                    av8 av8Var6 = av8Var5;
                    av8Var6.s(false);
                    av8Var2 = av8Var6;
                }
                mv1 mv1Var = uxf.d;
                n12 n12Var = n12.a;
                o(true, l98.f0(l98.d0(n12Var.a(utcVar, mv1Var), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5), av8Var2, 6);
                xtc d2 = bkh.d(l98.f0(n12Var.a(utcVar, uxf.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7), 0.5f);
                boolean booleanValue3 = ((Boolean) e1dVar8.getValue()).booleanValue();
                Object O8 = av8Var2.O();
                if (O8 == a99Var2) {
                    O8 = new vbc(11, function1);
                    av8Var2.n0(O8);
                }
                n(booleanValue3, function0, (Function0) O8, d2, av8Var2, (i7 << 3) & 112);
                av8Var2.s(true);
                av8Var2.s(false);
                av8Var3 = av8Var2;
            } else {
                av8Var5.d0(2049465268);
                xtc f0 = ml4.f0(n9e.q(xtcVar4.z(bkh.c), lz.D(R.color.graphics_dark, av8Var5), jf9Var));
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var5, 0);
                int hashCode2 = Long.hashCode(av8Var5.T);
                aee m3 = av8Var5.m();
                xtc C2 = fqj.C(av8Var5, f0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var2);
                } else {
                    av8Var5.q0();
                }
                waa.K(av8Var5, a2, hf3.g);
                waa.K(av8Var5, m3, hf3.f);
                waa.K(av8Var5, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var5, hf3.k);
                waa.K(av8Var5, C2, hf3.d);
                ale aleVar2 = (ale) e1dVar2.getValue();
                if (aleVar2 == null) {
                    av8Var5.d0(450227060);
                    av8Var5.s(false);
                    unit3 = unit2;
                    f3 = 1.0f;
                    e1dVar3 = e1dVar;
                    str = "invalid weight; must be greater than zero";
                    f2 = Float.MAX_VALUE;
                    a99Var = a99Var2;
                    av8Var4 = av8Var5;
                } else {
                    av8Var5.d0(450227061);
                    str = "invalid weight; must be greater than zero";
                    f2 = Float.MAX_VALUE;
                    if (1.0f <= 0.0d) {
                        p3a.a(str);
                    }
                    e1dVar3 = e1dVar;
                    a99Var = a99Var2;
                    f3 = 1.0f;
                    v(aleVar2, ((Boolean) e1dVar5.getValue()).booleanValue(), ((Boolean) e1dVar6.getValue()).booleanValue(), false, bkh.d(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), av8Var5, 3072);
                    av8 av8Var7 = av8Var5;
                    av8Var7.s(false);
                    av8Var4 = av8Var7;
                }
                if (unit3 == null) {
                    av8Var4.d0(450585669);
                    if (f3 <= 0.0d) {
                        p3a.a(str);
                    }
                    if (f3 > f2) {
                        f3 = f2;
                    }
                    nq8.h(av8Var4, new goa(f3, true));
                    av8Var4.s(false);
                } else {
                    av8Var4.d0(-539666056);
                    av8Var4.s(false);
                }
                av8 av8Var8 = av8Var4;
                m(((Boolean) e1dVar3.getValue()).booleanValue(), null, g, av8Var8, 384, 2);
                av8 av8Var9 = av8Var8;
                xtc f02 = l98.f0(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5);
                boolean booleanValue4 = ((Boolean) e1dVar3.getValue()).booleanValue();
                Object O9 = av8Var9.O();
                if (O9 == a99Var) {
                    O9 = new vbc(10, function1);
                    av8Var9.n0(O9);
                }
                n(booleanValue4, function02, (Function0) O9, f02, av8Var9, ((i7 << 3) & 112) | 3072);
                av8Var9.s(true);
                av8Var9.s(false);
                av8Var3 = av8Var9;
            }
            xtcVar3 = xtcVar4;
            av8Var = av8Var3;
        } else {
            av8Var5.W();
            xtcVar3 = xtcVar2;
            av8Var = av8Var5;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(function0, function1, xtcVar3, i2, i3, 10);
        }
    }

    public static final void q(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1925352865);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtcVar2 = xtcVar;
            kq9.b(s6a.N(R.drawable.ic_sofascore_logomark, 6, av8Var), null, xtcVar2, lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i2, 21);
        }
    }

    public static final void r(ux6 ux6Var, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        long j2;
        lv1 lv1Var;
        utc utcVar;
        kg0 kg0Var;
        boolean z2;
        boolean z3;
        boolean z4;
        ImageVector N;
        o68 o68Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1999401467);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(ux6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            r13 r13Var = null;
            Integer valueOf = (ux6Var == null || (o68Var = ux6Var.c) == null) ? null : Integer.valueOf(o68Var.a);
            if (valueOf == null) {
                av8Var.d0(-1562420477);
                av8Var.s(false);
            } else {
                r13Var = new r13(wv8.b(av8Var, -1562420476, valueOf, av8Var, false));
            }
            if (r13Var == null) {
                j2 = ljg.f(av8Var, -1574420392, R.color.neutral_default, av8Var, false);
            } else {
                av8Var.d0(-1574422035);
                av8Var.s(false);
                j2 = r13Var.a;
            }
            lv1 lv1Var2 = uxf.m;
            kg0 kg0Var2 = ww9.f;
            av8Var.d0(-1574410190);
            xtc q2 = n9e.q(wnn.A(bkh.e(bkh.p(xtcVar, 72.0f), 40.0f), o7g.a(8.0f)), j2, oyn.e);
            utc utcVar2 = utc.a;
            if (ux6Var != null) {
                boolean i5 = ((i3 & 14) == 4) | av8Var.i(context);
                Object O = av8Var.O();
                if (i5 || O == nf3.a) {
                    O = new ht7(context, ux6Var, i4);
                    av8Var.n0(O);
                }
                utcVar = utcVar2;
                kg0Var = kg0Var2;
                lv1Var = lv1Var2;
                z2 = false;
                q2 = q2.z(tol.y(utcVar, false, false, false, 0L, null, (Function0) O, av8Var, 31));
            } else {
                lv1Var = lv1Var2;
                utcVar = utcVar2;
                kg0Var = kg0Var2;
                z2 = false;
            }
            av8Var.s(z2);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
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
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            if (ux6Var != null) {
                av8Var.d0(1102825928);
                if (z) {
                    av8Var.d0(1102844373);
                    String a3 = ux6Var.a();
                    yf8 yf8Var = xth.a;
                    q5a.w(a3, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.l(), av8Var, 0, 24960, 110586);
                    av8Var = av8Var;
                    av8Var.s(z2);
                    Unit unit = Unit.a;
                    z4 = true;
                } else {
                    av8Var.d0(1103146592);
                    xtc b0 = l98.b0(n9e.q(utcVar, lz.D(R.color.on_color_primary, av8Var), o7g.a(4.0f)), 1.0f);
                    k1c c2 = e12.c(uxf.c, z2);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, b0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    td4.u(ux6Var.b, 48, av8Var, bkh.l(utcVar, 16.0f));
                    av8Var.s(true);
                    p68 p68Var = ux6Var.d;
                    if (p68Var == null) {
                        av8Var.d0(1103569958);
                        av8Var.s(z2);
                        z4 = true;
                    } else {
                        ljg.r(8.0f, 1103569959, av8Var, av8Var, utcVar);
                        xtc l2 = bkh.l(utcVar, 16.0f);
                        long D = lz.D(R.color.on_color_primary, av8Var);
                        int ordinal = p68Var.ordinal();
                        if (ordinal != 0) {
                            z4 = true;
                            if (ordinal != 1) {
                                throw dmi.h(av8Var, -794783518, z2);
                            }
                            av8Var.d0(-794777406);
                            N = s6a.N(R.drawable.ic_away, 6, av8Var);
                            av8Var.s(z2);
                        } else {
                            z4 = true;
                            av8Var.d0(-794780862);
                            N = s6a.N(R.drawable.ic_home, 6, av8Var);
                            av8Var.s(z2);
                        }
                        kq9.b(N, null, l2, D, av8Var, 432, 0);
                        Unit unit2 = Unit.a;
                        av8Var.s(z2);
                    }
                    av8Var.s(z2);
                }
                av8Var.s(z2);
                z3 = z4;
            } else {
                av8Var.d0(1104188750);
                yf8 yf8Var2 = xth.a;
                z3 = true;
                udj.c("-", null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 6, 0, 131066);
                av8Var = av8Var;
                av8Var.s(z2);
                Unit unit3 = Unit.a;
            }
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(ux6Var, z, xtcVar, i2, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(final String str, final Object obj, final Function1 function1, List list, final Function1 function12, xtc xtcVar, ct8 ct8Var, boolean z, boolean z2, of3 of3Var, int i2, int i3) {
        ct8 ct8Var2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        av8 av8Var;
        xtc xtcVar2;
        ct8 ct8Var3;
        boolean z5;
        boolean z6;
        eqf u;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-464149367);
        int i7 = i2 | (av8Var2.g(obj) ? 32 : 16) | (av8Var2.i(list) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var2.i(function12) ? 16384 : 8192);
        int i8 = 196608 | i7;
        int i9 = i3 & 64;
        if (i9 != 0) {
            i8 = 1769472 | i7;
        } else if ((i2 & 1572864) == 0) {
            ct8Var2 = ct8Var;
            i8 |= av8Var2.i(ct8Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            i4 = i3 & 128;
            if (i4 == 0) {
                i8 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                z3 = z;
                i8 |= av8Var2.h(z3) ? 8388608 : 4194304;
                i5 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i5 != 0) {
                    i6 = i8 | 100663296;
                    z4 = z2;
                } else {
                    z4 = z2;
                    i6 = i8 | (av8Var2.h(z4) ? 67108864 : 33554432);
                }
                if (av8Var2.T(i6 & 1, (38347923 & i6) != 38347922)) {
                    if (i9 != 0) {
                        ct8Var2 = null;
                    }
                    ct8 ct8Var4 = ct8Var2;
                    if (i4 != 0) {
                        z3 = false;
                    }
                    final boolean z7 = i5 != 0 ? true : z4;
                    wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
                    boolean z8 = (i6 & 112) == 32;
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (z8 || O == a99Var) {
                        O = e.f(function1.invoke(obj));
                        av8Var2.n0(O);
                    }
                    e1d e1dVar = (e1d) O;
                    Object O2 = av8Var2.O();
                    if (O2 == a99Var) {
                        O2 = e.f(Boolean.FALSE);
                        av8Var2.n0(O2);
                    }
                    final e1d e1dVar2 = (e1d) O2;
                    Object O3 = av8Var2.O();
                    if (O3 == a99Var) {
                        O3 = e.f(Boolean.FALSE);
                        av8Var2.n0(O3);
                    }
                    final e1d e1dVar3 = (e1d) O3;
                    e1d e1dVar4 = e1dVar;
                    final ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        wd8 wd8Var2 = wd8Var;
                        e1d e1dVar5 = e1dVar4;
                        ct8 ct8Var5 = ct8Var4;
                        if (StringsKt.J((CharSequence) function1.invoke(obj2), (String) e1dVar4.getValue(), true) || Intrinsics.c((String) e1dVar5.getValue(), function1.invoke(obj)) || ((String) e1dVar5.getValue()).length() == 0) {
                            arrayList.add(obj2);
                        }
                        wd8Var = wd8Var2;
                        e1dVar4 = e1dVar5;
                        ct8Var4 = ct8Var5;
                    }
                    final wd8 wd8Var3 = wd8Var;
                    final e1d e1dVar6 = e1dVar4;
                    final ct8 ct8Var6 = ct8Var4;
                    boolean booleanValue = ((Boolean) e1dVar2.getValue()).booleanValue();
                    Object O4 = av8Var2.O();
                    if (O4 == a99Var) {
                        O4 = new w30(21, e1dVar2);
                        av8Var2.n0(O4);
                    }
                    final int i10 = i6;
                    final boolean z9 = z3;
                    tc3 H = yqo.H(-1667205985, av8Var2, new ct8() { // from class: zz4
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            e1d e1dVar7;
                            Function1 function13;
                            boolean z10;
                            tc3 tc3Var;
                            jj6 jj6Var = (jj6) obj3;
                            of3 of3Var2 = (of3) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            jj6Var.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= (intValue & 8) == 0 ? ((av8) of3Var2).g(jj6Var) : ((av8) of3Var2).i(jj6Var) ? 4 : 2;
                            }
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                                final e1d e1dVar8 = e1dVar6;
                                String str2 = (String) e1dVar8.getValue();
                                xtc b2 = jj6Var.b(n9e.q(bkh.d(utc.a, 1.0f), lz.D(R.color.surface_1, av8Var3), oyn.e), "PrimaryEditable");
                                boolean z11 = z9;
                                boolean h2 = av8Var3.h(z11) | av8Var3.g(e1dVar8);
                                Function1 function14 = function1;
                                boolean g2 = h2 | av8Var3.g(function14);
                                Object obj6 = obj;
                                boolean i11 = g2 | av8Var3.i(obj6);
                                Object O5 = av8Var3.O();
                                e1d e1dVar9 = e1dVar3;
                                a99 a99Var2 = nf3.a;
                                if (i11 || O5 == a99Var2) {
                                    e1dVar7 = e1dVar9;
                                    b05 b05Var = new b05(0, function14, obj6, e1dVar7, e1dVar8, z11);
                                    function13 = function14;
                                    z10 = z11;
                                    av8Var3.n0(b05Var);
                                    O5 = b05Var;
                                } else {
                                    e1dVar7 = e1dVar9;
                                    z10 = z11;
                                    function13 = function14;
                                }
                                xtc L = kik.L(b2, (Function1) O5);
                                final ct8 ct8Var7 = ct8Var6;
                                final int i12 = i10;
                                if (ct8Var7 == null) {
                                    av8Var3.d0(-730397443);
                                    av8Var3.s(false);
                                    tc3Var = null;
                                } else {
                                    av8Var3.d0(-730397442);
                                    tc3 H2 = yqo.H(-599081269, av8Var3, new c05(ct8Var7, obj6, i12, 0));
                                    av8Var3.s(false);
                                    tc3Var = H2;
                                }
                                n7g a2 = o7g.a(16.0f);
                                yf8 yf8Var = xth.a;
                                dfj d2 = xth.d();
                                kja kjaVar = kja.g;
                                kja a3 = kja.a();
                                final wd8 wd8Var4 = wd8Var3;
                                boolean i13 = av8Var3.i(wd8Var4);
                                Object O6 = av8Var3.O();
                                final e1d e1dVar10 = e1dVar2;
                                if (i13 || O6 == a99Var2) {
                                    O6 = new d05(wd8Var4, e1dVar10, 0);
                                    av8Var3.n0(O6);
                                }
                                ija ijaVar = new ija((Function1) O6, null, 62);
                                long D = lz.D(R.color.n_lv_1, av8Var3);
                                long D2 = lz.D(R.color.n_lv_3, av8Var3);
                                long D3 = lz.D(R.color.surface_1, av8Var3);
                                long D4 = lz.D(R.color.surface_1, av8Var3);
                                long D5 = lz.D(R.color.n_lv_4, av8Var3);
                                long D6 = lz.D(R.color.primary_default, av8Var3);
                                long D7 = lz.D(R.color.primary_default, av8Var3);
                                long D8 = lz.D(R.color.n_lv_3, av8Var3);
                                long D9 = lz.D(R.color.primary_default, av8Var3);
                                long D10 = lz.D(R.color.n_lv_1, av8Var3);
                                long d3 = i23.d(kxd.l, av8Var3);
                                long j2 = r13.h;
                                long d4 = i23.d(kxd.k, av8Var3);
                                wej wejVar = (wej) av8Var3.k(xej.a);
                                long c2 = r13.c(i23.d(kxd.e, av8Var3), kxd.f);
                                long d5 = i23.d(kxd.o, av8Var3);
                                long d6 = i23.d(kxd.q, av8Var3);
                                long d7 = i23.d(kxd.s, av8Var3);
                                long c3 = r13.c(i23.d(kxd.c, av8Var3), kxd.d);
                                long d8 = i23.d(kxd.n, av8Var3);
                                long d9 = i23.d(kxd.r, av8Var3);
                                long d10 = i23.d(kxd.u, av8Var3);
                                long c4 = r13.c(i23.d(kxd.i, av8Var3), kxd.j);
                                long d11 = i23.d(kxd.p, av8Var3);
                                long c5 = r13.c(i23.d(kxd.a, av8Var3), kxd.b);
                                long d12 = i23.d(kxd.m, av8Var3);
                                h23 h23Var = kxd.t;
                                long d13 = i23.d(h23Var, av8Var3);
                                long d14 = i23.d(h23Var, av8Var3);
                                h23 h23Var2 = kxd.g;
                                int i14 = intValue;
                                long d15 = i23.d(h23Var2, av8Var3);
                                float f2 = kxd.h;
                                e1d e1dVar11 = e1dVar7;
                                n9j s2 = a99.s(D, D10, D2, d3, D4, D3, j2, j2, D7, d4, wejVar, D6, D5, c2, d5, d6, d7, c3, d8, d9, d10, c4, d11, D9, D8, c5, d12, d13, d14, r13.c(d15, f2), i23.d(h23Var, av8Var3), i23.d(h23Var, av8Var3), i23.d(h23Var, av8Var3), r13.c(i23.d(h23Var2, av8Var3), f2), i23.d(h23Var, av8Var3), i23.d(h23Var, av8Var3), i23.d(h23Var, av8Var3), r13.c(i23.d(h23Var2, av8Var3), f2), i23.d(h23Var, av8Var3), av8Var3, 3072, 0, 15);
                                boolean g3 = av8Var3.g(e1dVar8);
                                Object O7 = av8Var3.O();
                                if (g3 || O7 == a99Var2) {
                                    O7 = new r82(16, e1dVar8, e1dVar10);
                                    av8Var3.n0(O7);
                                }
                                tc3 H3 = yqo.H(1482946745, av8Var3, new tk1(str, 1));
                                tc3 H4 = yqo.H(846067734, av8Var3, new ns4(4, e1dVar10, e1dVar11));
                                boolean z12 = true;
                                ufa.b(str2, (Function1) O7, L, z7, z10, d2, H3, tc3Var, H4, null, a3, ijaVar, true, 0, 0, a2, s2, av8Var3, 806879232, 1866880);
                                boolean booleanValue2 = ((Boolean) e1dVar10.getValue()).booleanValue();
                                final ArrayList arrayList2 = arrayList;
                                if (!booleanValue2 || arrayList2.isEmpty()) {
                                    z12 = false;
                                }
                                Object O8 = av8Var3.O();
                                if (O8 == a99Var2) {
                                    O8 = new v30(15, e1dVar10);
                                    av8Var3.n0(O8);
                                }
                                long D11 = lz.D(R.color.surface_P, av8Var3);
                                final Function1 function15 = function12;
                                final Function1 function16 = function13;
                                jj6Var.a(z12, (Function0) O8, null, null, false, null, D11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yqo.H(841955677, av8Var3, new ct8() { // from class: e05
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                        tc3 H5;
                                        of3 of3Var3 = (of3) obj8;
                                        int intValue2 = ((Integer) obj9).intValue();
                                        ((v23) obj7).getClass();
                                        av8 av8Var4 = (av8) of3Var3;
                                        if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            Iterator it = arrayList2.iterator();
                                            while (it.hasNext()) {
                                                Object next = it.next();
                                                ct8 ct8Var8 = ct8Var7;
                                                if (ct8Var8 == null) {
                                                    av8Var4.d0(-1196193110);
                                                    av8Var4.s(false);
                                                    H5 = null;
                                                } else {
                                                    av8Var4.d0(-1196193109);
                                                    H5 = yqo.H(-420487932, av8Var4, new c05(ct8Var8, next, i12, 1));
                                                    av8Var4.s(false);
                                                }
                                                Function1 function17 = function16;
                                                tc3 H6 = yqo.H(1793436810, av8Var4, new ns4(5, function17, next));
                                                e1d e1dVar12 = e1dVar8;
                                                boolean g4 = av8Var4.g(e1dVar12) | av8Var4.g(function17) | av8Var4.i(next);
                                                Function1 function18 = function15;
                                                boolean g5 = g4 | av8Var4.g(function18);
                                                wd8 wd8Var5 = wd8Var4;
                                                boolean i15 = g5 | av8Var4.i(wd8Var5);
                                                Object O9 = av8Var4.O();
                                                if (i15 || O9 == nf3.a) {
                                                    O9 = new f05(function17, next, function18, wd8Var5, e1dVar12, e1dVar10);
                                                    av8Var4.n0(O9);
                                                }
                                                u10.b(H6, (Function0) O9, null, H5, false, null, null, null, av8Var4, 6, 500);
                                            }
                                        } else {
                                            av8Var4.W();
                                        }
                                        return Unit.a;
                                    }
                                }), av8Var3, 48, 6 | ((i14 << 3) & 112));
                            } else {
                                av8Var3.W();
                            }
                            return Unit.a;
                        }
                    });
                    utc utcVar = utc.a;
                    av8Var = av8Var2;
                    ww9.d(booleanValue, (Function1) O4, utcVar, H, av8Var, V2.b.f);
                    xtcVar2 = utcVar;
                    z5 = z9;
                    z6 = z7;
                    ct8Var3 = ct8Var6;
                } else {
                    av8Var = av8Var2;
                    av8Var.W();
                    xtcVar2 = xtcVar;
                    ct8Var3 = ct8Var2;
                    z5 = z3;
                    z6 = z4;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new a05(str, obj, function1, list, function12, xtcVar2, ct8Var3, z5, z6, i2, i3);
                    return;
                }
                return;
            }
            z3 = z;
            i5 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i5 != 0) {
            }
            if (av8Var2.T(i6 & 1, (38347923 & i6) != 38347922)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        ct8Var2 = ct8Var;
        i4 = i3 & 128;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i5 != 0) {
        }
        if (av8Var2.T(i6 & 1, (38347923 & i6) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void t(String str, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        int i3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1951343817);
        int i4 = i2 | (av8Var2.g(str) ? 4 : 2);
        int i5 = 0;
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(str);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            String str2 = (String) e1dVar.getValue();
            xtc q2 = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var2), oyn.e);
            n7g a2 = o7g.a(16.0f);
            yf8 yf8Var = xth.a;
            dfj d2 = xth.d();
            kja kjaVar = kja.g;
            kja a3 = kja.a();
            boolean i6 = av8Var2.i(wd8Var);
            Object O2 = av8Var2.O();
            if (i6 || O2 == a99Var) {
                O2 = new wz4(wd8Var, i5);
                av8Var2.n0(O2);
            }
            ija ijaVar = new ija((Function1) O2, null, 62);
            long D = lz.D(R.color.n_lv_1, av8Var2);
            long D2 = lz.D(R.color.n_lv_3, av8Var2);
            long D3 = lz.D(R.color.surface_1, av8Var2);
            long D4 = lz.D(R.color.surface_1, av8Var2);
            long D5 = lz.D(R.color.n_lv_4, av8Var2);
            long D6 = lz.D(R.color.primary_default, av8Var2);
            n9j s2 = a99.s(D, lz.D(R.color.n_lv_1, av8Var2), D2, 0L, D4, D3, 0L, 0L, lz.D(R.color.primary_default, av8Var2), 0L, null, D6, D5, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, lz.D(R.color.primary_default, av8Var2), lz.D(R.color.n_lv_3, av8Var2), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, av8Var2, 3072, 2122311368, 4095);
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                i3 = 0;
                O3 = new xz4(function1, e1dVar, i3);
                av8Var2.n0(O3);
            } else {
                i3 = 0;
            }
            ufa.b(str2, (Function1) O3, q2, false, false, d2, yqo.H(1643762897, av8Var2, new xt3(10)), null, yqo.H(967711470, av8Var2, new yz4(function1, e1dVar, i3)), null, a3, ijaVar, true, 0, 0, a2, s2, av8Var2, 806879232, 1867160);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(str, function1, xtcVar, i2, 19);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0332, code lost:
    
        if (r7 == r14) goto L100;
     */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(ux6 ux6Var, ux6 ux6Var2, ux6 ux6Var3, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        r13 r13Var;
        char c2;
        long j2;
        a99 a99Var;
        char c3;
        char c4;
        ImageVector N;
        boolean z2;
        boolean z3;
        r13 r13Var2;
        long j3;
        int i3;
        jf9 jf9Var = oyn.e;
        kg0 kg0Var = ww9.f;
        ux6Var.getClass();
        ux6Var2.getClass();
        ux6Var3.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1344053539);
        int i4 = (i2 & 6) == 0 ? (av8Var.g(ux6Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(ux6Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(ux6Var3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.h(z) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            List<ux6> j4 = b.j(ux6Var, ux6Var2, ux6Var3);
            utc utcVar = utc.a;
            a99 a99Var2 = nf3.a;
            char c5 = 0;
            if (z) {
                av8Var.d0(1281556028);
                xtc A = wnn.A(bkh.e(bkh.p(xtcVar, 72.0f), 40.0f), o7g.a(8.0f));
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, A);
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
                av8Var.d0(473949959);
                Iterator it = j4.iterator();
                while (it.hasNext()) {
                    ux6 ux6Var4 = (ux6) it.next();
                    o68 o68Var = ux6Var4.c;
                    Integer valueOf = o68Var != null ? Integer.valueOf(o68Var.a) : null;
                    if (valueOf == null) {
                        av8Var.d0(1037373692);
                        z3 = false;
                        av8Var.s(false);
                        r13Var2 = null;
                    } else {
                        z3 = false;
                        r13Var2 = new r13(wv8.b(av8Var, 1037373693, valueOf, av8Var, false));
                    }
                    if (r13Var2 == null) {
                        j3 = ljg.f(av8Var, 1696032575, R.color.neutral_default, av8Var, z3);
                    } else {
                        av8Var.d0(1696030963);
                        av8Var.s(z3);
                        j3 = r13Var2.a;
                    }
                    lv1 lv1Var = uxf.m;
                    Iterator it2 = it;
                    xtc q2 = n9e.q(fn0.e(1.0f, bkh.d(utcVar, 1.0f), true), j3, jf9Var);
                    boolean i5 = av8Var.i(context) | av8Var.g(ux6Var4);
                    Object O = av8Var.O();
                    if (i5 || O == a99Var2) {
                        i3 = 0;
                        O = new ht7(context, ux6Var4, i3);
                        av8Var.n0(O);
                    } else {
                        i3 = 0;
                    }
                    utc utcVar2 = utcVar;
                    a99 a99Var3 = a99Var2;
                    Context context2 = context;
                    xtc y = tol.y(q2, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                    l8g a3 = k8g.a(kg0Var, lv1Var, av8Var, 54);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, y);
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
                    String a4 = ux6Var4.a();
                    yf8 yf8Var = xth.a;
                    av8 av8Var2 = av8Var;
                    q5a.w(a4, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, 0L, null, 0L, 2, false, 1, 0, xth.k(), av8Var2, 0, 24960, 110586);
                    av8Var = av8Var2;
                    av8Var.s(true);
                    it = it2;
                    utcVar = utcVar2;
                    a99Var2 = a99Var3;
                    context = context2;
                }
                ljg.t(av8Var, false, true, false);
            } else {
                Context context3 = context;
                boolean z4 = false;
                a99 a99Var4 = a99Var2;
                ?? r2 = 1;
                int i6 = 54;
                av8Var.d0(1282677205);
                xtc A2 = wnn.A(bkh.e(bkh.p(xtcVar, 72.0f), 40.0f), o7g.a(8.0f));
                l8g a5 = k8g.a(ww9.b, uxf.l, av8Var, 0);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C3 = fqj.C(av8Var, A2);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var3);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a5, hf3.g);
                waa.K(av8Var, m4, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode3), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C3, hf3.d);
                av8Var.d0(-772096408);
                for (ux6 ux6Var5 : j4) {
                    o68 o68Var2 = ux6Var5.c;
                    Integer valueOf2 = o68Var2 != null ? Integer.valueOf(o68Var2.a) : null;
                    if (valueOf2 == null) {
                        av8Var.d0(269270501);
                        av8Var.s(z4);
                        r13Var = null;
                    } else {
                        r13Var = new r13(wv8.b(av8Var, 269270502, valueOf2, av8Var, z4));
                    }
                    if (r13Var == null) {
                        c2 = 1400;
                        j2 = ljg.f(av8Var, -1238238922, R.color.neutral_default, av8Var, z4);
                    } else {
                        c2 = 1400;
                        av8Var.d0(-1238240534);
                        av8Var.s(z4);
                        j2 = r13Var.a;
                    }
                    kv1 kv1Var = uxf.p;
                    xtc q3 = n9e.q(fn0.e(1.0f, bkh.c(utcVar, 1.0f), r2), j2, jf9Var);
                    Context context4 = context3;
                    boolean i7 = av8Var.i(context4) | av8Var.g(ux6Var5);
                    Object O2 = av8Var.O();
                    if (i7) {
                        a99Var = a99Var4;
                    } else {
                        a99Var = a99Var4;
                    }
                    O2 = new ht7(context4, ux6Var5, r2);
                    av8Var.n0(O2);
                    context3 = context4;
                    a99 a99Var5 = a99Var;
                    jf9 jf9Var2 = jf9Var;
                    xtc y2 = tol.y(q3, false, false, false, 0L, null, (Function0) O2, av8Var, 31);
                    u23 a6 = t23.a(kg0Var, kv1Var, av8Var, i6);
                    int hashCode4 = Long.hashCode(av8Var.T);
                    aee m5 = av8Var.m();
                    xtc C4 = fqj.C(av8Var, y2);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var4);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a6, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m5, ff3Var);
                    Integer valueOf3 = Integer.valueOf(hashCode4);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf3, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C4, f50Var3);
                    xtc b0 = l98.b0(n9e.q(utcVar, lz.D(R.color.on_color_primary, av8Var), o7g.a(4.0f)), 1.0f);
                    k1c c6 = e12.c(uxf.c, false);
                    kg0 kg0Var2 = kg0Var;
                    int hashCode5 = Long.hashCode(av8Var.T);
                    aee m6 = av8Var.m();
                    xtc C5 = fqj.C(av8Var, b0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var4);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c6, f50Var);
                    waa.K(av8Var, m6, ff3Var);
                    bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C5, f50Var3);
                    td4.u(ux6Var5.b, 48, av8Var, bkh.l(utcVar, 16.0f));
                    bf3.t(av8Var, true, utcVar, 4.0f, av8Var);
                    p68 p68Var = ux6Var5.d;
                    if (p68Var == null) {
                        av8Var.d0(-1940863254);
                        av8Var.s(false);
                        z2 = false;
                        c4 = 1408;
                        c3 = 0;
                    } else {
                        c3 = 0;
                        ljg.r(8.0f, -1940863253, av8Var, av8Var, utcVar);
                        xtc l2 = bkh.l(utcVar, 16.0f);
                        c4 = 1408;
                        long D = lz.D(R.color.on_color_primary, av8Var);
                        int ordinal = p68Var.ordinal();
                        if (ordinal == 0) {
                            av8Var.d0(71613843);
                            N = s6a.N(R.drawable.ic_home, 6, av8Var);
                            av8Var.s(false);
                        } else {
                            if (ordinal != 1) {
                                throw dmi.h(av8Var, 71611071, false);
                            }
                            av8Var.d0(71617427);
                            N = s6a.N(R.drawable.ic_away, 6, av8Var);
                            av8Var.s(false);
                        }
                        ImageVector imageVector = N;
                        z2 = false;
                        kq9.b(imageVector, null, l2, D, av8Var, 432, 0);
                        Unit unit = Unit.a;
                        av8Var.s(false);
                    }
                    r2 = 1;
                    av8Var.s(true);
                    z4 = z2;
                    c5 = c3;
                    jf9Var = jf9Var2;
                    a99Var4 = a99Var5;
                    i6 = 54;
                    kg0Var = kg0Var2;
                }
                boolean z5 = z4;
                ljg.t(av8Var, z5, r2, z5);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(ux6Var, ux6Var2, ux6Var3, z, xtcVar, i2, 3);
        }
    }

    public static final void v(ale aleVar, boolean z, boolean z2, boolean z3, xtc xtcVar, of3 of3Var, int i2) {
        boolean z4;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-106578396);
        int i4 = (av8Var.i(aleVar) ? 4 : 2) | i2 | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = i4 & 14;
            d6f K = s6a.K(aleVar, av8Var, i5);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            zo5 e2 = uo5.e(null, 3);
            of6 f2 = uo5.f(null, 3);
            mv1 mv1Var = uxf.g;
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            fz8.e(z2, n12Var.a(utcVar, mv1Var), e2, f2, null, h, av8Var, ((i4 >> 6) & 14) | 200064, 16);
            if (z2) {
                z4 = false;
                av8Var.d0(1752007608);
                av8Var.s(false);
            } else {
                av8Var.d0(1750797709);
                long D = lz.D(R.color.graphics_dark, av8Var);
                xtc F = fqj.F(mp3.a, (njh) ((eoh) K.a).getValue(), av8Var);
                boolean f3 = av8Var.f(D);
                Object O = av8Var.O();
                if (f3 || O == nf3.a) {
                    i3 = 0;
                    O = new prd(D, i3);
                    av8Var.n0(O);
                } else {
                    i3 = 0;
                }
                hda.d(aleVar, td4.Z(F, (Function1) O), i3, av8Var, i5);
                fz8.e(((Boolean) ((eoh) K.b).getValue()).booleanValue(), null, uo5.e(null, 3), uo5.f(null, 3), null, i, av8Var, 200064, 18);
                z4 = false;
                av8Var.s(false);
            }
            fz8.e((!z || ((Boolean) ((eoh) K.b).getValue()).booleanValue()) ? z4 : true, l98.d0(l98.f0(n12Var.a(utcVar, z3 ? mv1Var : uxf.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z3 ? 0.0f : 48.0f, 7), z3 ? 0.0f : 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), uo5.e(null, 3), uo5.f(null, 3), null, yqo.H(-1701673735, av8Var, new pu5(z3, aleVar, 2)), av8Var, 200064, 16);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ny6(aleVar, z, z2, z3, xtcVar, i2);
        }
    }

    public static final nl1 w(nl1 nl1Var) {
        gv9<ml1> gv9Var = nl1Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : gv9Var) {
            if (((ml1) obj).e) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != 1) {
            return nl1Var;
        }
        String str = ((ml1) CollectionsKt.D0(arrayList)).a;
        ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
        for (ml1 ml1Var : gv9Var) {
            arrayList2.add(new ml1(ml1Var.b, ml1Var.c, ml1Var.a, false, ml1Var.d));
        }
        gv9 W = l6g.W(arrayList2);
        int i2 = nl1Var.a;
        W.getClass();
        return new nl1(i2, W, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(CupTree cupTree) {
        int order;
        CupTreeRound cupTreeRound;
        Object obj;
        if (cupTree == null) {
            return false;
        }
        List<CupTreeRound> rounds = cupTree.getRounds();
        if (rounds != null) {
            Iterator<T> it = rounds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CupTreeRound) obj).getOrder() == cupTree.getCurrentRound()) {
                    break;
                }
            }
            CupTreeRound cupTreeRound2 = (CupTreeRound) obj;
            if (cupTreeRound2 != null) {
                order = cupTreeRound2.getType();
                List<CupTreeRound> rounds2 = cupTree.getRounds();
                ArrayList arrayList = rounds2 == null ? new ArrayList(rounds2) : new ArrayList();
                v02.j(arrayList);
                List B0 = CollectionsKt.B0(arrayList);
                return cupTree.getType() != 1 ? false : false;
            }
        }
        List<CupTreeRound> rounds3 = cupTree.getRounds();
        order = (rounds3 == null || (cupTreeRound = (CupTreeRound) CollectionsKt.firstOrNull(rounds3)) == null) ? Integer.MAX_VALUE : cupTreeRound.getOrder();
        List<CupTreeRound> rounds22 = cupTree.getRounds();
        if (rounds22 == null) {
        }
        v02.j(arrayList);
        List B02 = CollectionsKt.B0(arrayList);
        return cupTree.getType() != 1 ? false : false;
    }

    public static void y(Context context) {
        if (p == null) {
            WakeLock wakeLock = new WakeLock(context);
            p = wakeLock;
            synchronized (wakeLock.a) {
                wakeLock.g = true;
            }
        }
    }

    public static int z(y53 y53Var, y53 y53Var2) {
        y53Var2.getClass();
        long H = y53Var.H(y53Var2);
        xd5.b.getClass();
        return xd5.c(H, 0L);
    }
}
