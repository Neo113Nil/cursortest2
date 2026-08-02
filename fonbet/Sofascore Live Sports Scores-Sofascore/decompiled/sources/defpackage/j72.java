package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Country;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.newNetwork.CategoryWrapper;
import com.sofascore.model.newNetwork.DistinctEventSet;
import com.sofascore.model.newNetwork.TimezoneEventsInfo;
import com.sofascore.model.newNetwork.commentary.BaseballActionOutcome;
import com.sofascore.model.newNetwork.commentary.BaseballPitchType;
import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class j72 {
    public static final tc3 a = new tc3(2078417601, new gd3(21), false);
    public static final tc3 b = new tc3(2087078734, new pd3(4), false);
    public static final y73 c = new y73(16);
    public static final rm0 d = new rm0("io.grpc.internal.GrpcAttributes.securityLevel");
    public static final rm0 e = new rm0("io.grpc.internal.GrpcAttributes.clientEagAttrs");
    public static final Object f = new Object();
    public static final byte[] g = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] h = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;

    public static vvf A(h72 h72Var, ArrayList arrayList) {
        zu9 s = hv9.s();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bundle bundle = (Bundle) arrayList.get(i2);
            bundle.getClass();
            s.c(h72Var.g(bundle));
        }
        return s.g();
    }

    public static final mdi B(SnapshotStateList snapshotStateList) {
        mdi mdiVar = snapshotStateList.a;
        mdiVar.getClass();
        return (mdi) snh.s(mdiVar, snapshotStateList);
    }

    public static final int C(SnapshotStateList snapshotStateList) {
        mdi mdiVar = snapshotStateList.a;
        mdiVar.getClass();
        return ((mdi) snh.f(mdiVar)).e;
    }

    public static boolean D(String str) {
        str.getClass();
        List L = L();
        if (L != null && L.isEmpty()) {
            return false;
        }
        Iterator it = L.iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(((uc6) it.next()).a, str)) {
                return true;
            }
        }
        return false;
    }

    public static final Category E(CategoryWrapper categoryWrapper) {
        List<Integer> list;
        List<Integer> eventIds;
        categoryWrapper.getClass();
        Category copy$default = Category.copy$default(categoryWrapper.getCategory(), 0, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
        TimezoneEventsInfo timezoneDetail = categoryWrapper.getTimezoneDetail();
        if ((timezoneDetail != null ? timezoneDetail.getTimezones() : null) != null) {
            TimezoneEventsInfo timezoneDetail2 = categoryWrapper.getTimezoneDetail();
            if (timezoneDetail2 != null) {
                Map<String, Integer> timezones = timezoneDetail2.getTimezones();
                Calendar calendar = ke0.a;
                Integer num = timezones.get(String.valueOf(ke0.c()));
                if (num != null) {
                    int intValue = num.intValue();
                    TimezoneEventsInfo timezoneDetail3 = categoryWrapper.getTimezoneDetail();
                    DistinctEventSet distinctEventSet = timezoneDetail3 != null ? timezoneDetail3.getEventSets().get(intValue) : null;
                    copy$default.setTotalEvents((distinctEventSet == null || (eventIds = distinctEventSet.getEventIds()) == null) ? 0 : eventIds.size());
                    copy$default.setLiveEvents(distinctEventSet != null ? distinctEventSet.getLiveEvents() : 0);
                    if (distinctEventSet == null || (list = distinctEventSet.getUniqueTournamentIds()) == null) {
                        list = km5.a;
                    }
                    copy$default.setUniqueTournamentIds(list);
                }
            }
        } else {
            Integer totalEvents = categoryWrapper.getTotalEvents();
            copy$default.setTotalEvents(totalEvents != null ? totalEvents.intValue() : 0);
            copy$default.setUniqueTournamentIds(categoryWrapper.getUniqueTournamentIds());
        }
        copy$default.setTeamIds(categoryWrapper.getTeamIds());
        copy$default.setHasEventPlayerStatistics(categoryWrapper.getHasEventPlayerStatistics());
        copy$default.setHasVideos(categoryWrapper.getHasVideos());
        ArrayList arrayList = dv3.a;
        Country a2 = dv3.a(copy$default.getAlpha2());
        copy$default.setMccList(a2 != null ? a2.getMccList() : null);
        return copy$default;
    }

    public static final boolean F(SnapshotStateList snapshotStateList, Function1 function1) {
        int i2;
        c7 c7Var;
        Object invoke;
        nnh h2;
        boolean u;
        do {
            synchronized (f) {
                mdi mdiVar = snapshotStateList.a;
                mdiVar.getClass();
                mdi mdiVar2 = (mdi) snh.f(mdiVar);
                i2 = mdiVar2.d;
                c7Var = mdiVar2.c;
                Unit unit = Unit.a;
            }
            c7Var.getClass();
            ife m2 = c7Var.m();
            invoke = function1.invoke(m2);
            c7 d2 = m2.d();
            if (Intrinsics.c(d2, c7Var)) {
                break;
            }
            mdi mdiVar3 = snapshotStateList.a;
            mdiVar3.getClass();
            synchronized (snh.c) {
                h2 = snh.h();
                u = u((mdi) snh.w(mdiVar3, snapshotStateList, h2), i2, d2, true);
            }
            snh.l(h2, snapshotStateList);
        } while (!u);
        return ((Boolean) invoke).booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(Function0 function0, Function2 function2, sq3 sq3Var) {
        iw iwVar;
        int i2;
        if (sq3Var instanceof iw) {
            iwVar = (iw) sq3Var;
            int i3 = iwVar.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iwVar.s = i3 - Integer.MIN_VALUE;
                Object obj = iwVar.r;
                lu3 lu3Var = lu3.a;
                i2 = iwVar.s;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    ow owVar = new ow(function0, function2, rq3Var, 0);
                    iwVar.s = 1;
                    if (s9a.r(owVar, iwVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        iwVar = new iw(sq3Var);
        Object obj2 = iwVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = iwVar.s;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return Unit.a;
    }

    public static r5a H(int i2, nl6 nl6Var, j9e j9eVar) {
        r5a e2 = r5a.e(nl6Var, j9eVar);
        while (true) {
            int i3 = e2.a;
            if (i3 == i2) {
                return e2;
            }
            fn0.r(i3, "Ignoring unknown WAV chunk: ");
            long j2 = e2.b;
            long j3 = 8 + j2;
            if (j2 % 2 != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                throw s9e.c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            nl6Var.skipFully((int) j3);
            e2 = r5a.e(nl6Var, j9eVar);
        }
    }

    public static String I(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(Color.alpha(i2) / 255.0d)};
        String str = nik.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final wl1 J(BaseballPitch baseballPitch) {
        Object obj;
        Object obj2;
        baseballPitch.getClass();
        it7 it7Var = m91.e;
        BaseballPitchType pitchCode = baseballPitch.getPitchCode();
        it7Var.getClass();
        Iterator<E> it = m91.g.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (CollectionsKt.R(((m91) obj2).a, pitchCode)) {
                break;
            }
        }
        m91 m91Var = (m91) obj2;
        k03 k03Var = l91.e;
        BaseballActionOutcome outcome = baseballPitch.getOutcome();
        k03Var.getClass();
        Iterator<E> it2 = l91.p.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (CollectionsKt.R(((l91) next).a, outcome)) {
                obj = next;
                break;
            }
        }
        return new wl1(m91Var, (l91) obj, baseballPitch.getPitchSpeed(), baseballPitch.getMlbX(), baseballPitch.getMlbY(), baseballPitch.getMlbHitCordX(), baseballPitch.getMlbHitCordY(), baseballPitch.getMlbZone());
    }

    public static final void K(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static List L() {
        return b.j(rc6.s, rc6.m, rc6.t, rc6.C, rc6.k, rc6.u, rc6.c, rc6.v, rc6.d, rc6.w, rc6.e, rc6.x, rc6.f, rc6.y, rc6.g, rc6.z, rc6.h, rc6.A, rc6.i, rc6.B, rc6.j, rc6.r, rc6.n, rc6.q, rc6.o, rc6.p, rc6.D, rc6.E, tc6.d, tc6.c, rc6.l);
    }

    public static final Bundle M(String str) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w22 w22Var, BrandLocation brandLocation, xtc xtcVar, Integer num, boolean z, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        boolean z2;
        av8 av8Var;
        xtc xtcVar3;
        boolean z3;
        eqf u;
        Context context;
        boolean z4;
        xtc xtcVar4;
        xtc xtcVar5;
        Object m61Var;
        w22 w22Var2 = w22Var;
        w22Var2.getClass();
        int i5 = w22Var2.a;
        brandLocation.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-883603939);
        int i6 = (av8Var2.g(w22Var2) ? 4 : 2) | i2;
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i6 | (av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i8 = i4 | (av8Var2.g(num) ? 2048 : 1024);
        int i9 = i3 & 16;
        if (i9 != 0) {
            i8 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            i8 |= av8Var2.h(z2) ? 16384 : 8192;
            if (av8Var2.T(i8 & 1, (i8 & 9363) == 9362)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar3 = xtcVar2;
                z3 = z2;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar6 = i7 != 0 ? utcVar : xtcVar2;
                boolean z5 = i9 != 0 ? true : z2;
                Context context2 = (Context) av8Var2.k(nz.b);
                boolean e2 = av8Var2.e(i5);
                Object O = av8Var2.O();
                a99 a99Var = nf3.a;
                if (e2 || O == a99Var) {
                    O = (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/") + "branding/provider/" + i5 + "/powered-by-image";
                    av8Var2.n0(O);
                }
                String str = (String) O;
                av8Var2.d0(1260167073);
                av8Var2.d0(1260158584);
                xtc q = n9e.q(bkh.e(bkh.d(xtcVar6, 1.0f), 24.0f), w22Var2.c, oyn.e);
                if (z5) {
                    boolean i10 = av8Var2.i(context2) | ((i8 & 7168) == 2048) | ((i8 & 14) == 4);
                    Object O2 = av8Var2.O();
                    if (i10 || O2 == a99Var) {
                        m61Var = new m61(context2, num, brandLocation, w22Var2, 1);
                        context = context2;
                        w22Var2 = w22Var2;
                        av8Var2.n0(m61Var);
                    } else {
                        m61Var = O2;
                        context = context2;
                    }
                    q = q.z(bea.Q(utcVar, (Function0) m61Var, 2));
                } else {
                    context = context2;
                }
                av8Var2.s(false);
                if (w22Var2.d != null) {
                    long D = lz.D(R.color.n_lv_4, av8Var2);
                    Object O3 = av8Var2.O();
                    if (O3 == a99Var) {
                        O3 = mz1.e(av8Var2);
                    }
                    wzc wzcVar = (wzc) O3;
                    Object[] objArr = new Object[0];
                    Object O4 = av8Var2.O();
                    if (O4 == a99Var) {
                        O4 = fi.o;
                        av8Var2.n0(O4);
                    }
                    b32 b32Var = new b32((boh) o3a.N(objArr, (Function0) O4, av8Var2, 48), context, num, brandLocation, w22Var);
                    z4 = false;
                    av8Var = av8Var2;
                    xtcVar4 = xtcVar6;
                    xtcVar5 = q.z(tol.y(utcVar, true, true, true, D, wzcVar, b32Var, av8Var, 0));
                } else {
                    z4 = false;
                    av8Var = av8Var2;
                    xtcVar4 = xtcVar6;
                    xtcVar5 = q;
                }
                av8Var.s(z4);
                haa.a(str, null, xtcVar5, null, mp3.b, av8Var, 1572912, 1976);
                xtcVar3 = xtcVar4;
                z3 = z5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ci(w22Var, brandLocation, xtcVar3, num, z3, i2, i3, 1);
                return;
            }
            return;
        }
        z2 = z;
        if (av8Var2.T(i8 & 1, (i8 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(int i2, int i3, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-843977766);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtc Y = fz8.Y(bkh.d(xtcVar, 1.0f), n9a.a);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
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
            utc utcVar = utc.a;
            e12.a(0, av8Var, n9e.q(bkh.p(bkh.c(utcVar, 1.0f), 1.0f), lz.D(R.color.primary_default, av8Var), oyn.e));
            String v = oea.v(i2, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.d(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar, i3, 9);
        }
    }

    public static final void c(t83 t83Var, String str, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        ry ryVar;
        f50 f50Var;
        f50 f50Var2;
        ff3 ff3Var;
        f50 f50Var3;
        boolean z;
        float f2;
        float f3;
        boolean z2;
        function1.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1999710752);
        int i3 = 2;
        int i4 = i2 | (av8Var.g(t83Var) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function12) ? a.o : 1024) | 24576;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            utc utcVar = utc.a;
            xtc b2 = bkh.b(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, 1);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = fi.q;
                av8Var.n0(O2);
            }
            xtc f0 = l98.f0(tol.y(b2, true, true, true, D, wzcVar, new gi(i3, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, t83Var), av8Var, 0), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            if (t83Var instanceof r83) {
                av8Var.d0(-660012342);
                f50Var2 = f50Var6;
                f50Var = f50Var5;
                ryVar = ryVar2;
                td4.C(((r83) t83Var).a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
                av8Var.s(false);
                f2 = 16.0f;
                ff3Var = ff3Var2;
                f50Var3 = f50Var4;
                z = false;
                z2 = true;
                f3 = 1.0f;
            } else {
                ryVar = ryVar2;
                f50Var = f50Var5;
                f50Var2 = f50Var6;
                if (!(t83Var instanceof s83)) {
                    throw dmi.h(av8Var, -660014285, false);
                }
                av8Var.d0(1014636470);
                if (wyh.e(str)) {
                    av8Var.d0(1014694998);
                    td4.J(((s83) t83Var).a, 48, av8Var, bkh.l(utcVar, 40.0f));
                    av8Var.s(false);
                    z = false;
                    ff3Var = ff3Var2;
                    f50Var3 = f50Var4;
                } else {
                    av8Var.d0(1014875325);
                    ff3Var = ff3Var2;
                    f50Var3 = f50Var4;
                    z = false;
                    td4.G(((s83) t83Var).a, bkh.l(utcVar, 40.0f), false, 0L, av8Var, 48, 12);
                    av8Var.s(false);
                }
                av8Var.s(z);
                f2 = 16.0f;
                f3 = 1.0f;
                z2 = true;
            }
            goa d2 = bf3.d(utcVar, f2, av8Var, f3, z2);
            u23 a3 = t23.a(new ng0(4.0f, z2, new a70(6)), uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var3);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var2);
            String name = t83Var.getName();
            yf8 yf8Var = xth.a;
            boolean z3 = z2;
            udj.c(name, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            int i5 = i4 & 14;
            o(t83Var, av8Var, i5);
            av8Var.s(z3);
            if (t83Var.isRecent()) {
                av8Var.d0(1015562564);
                boolean z4 = (i5 == 4 ? z3 : false) | ((i4 & 7168) == 2048 ? z3 : false);
                Object O3 = av8Var.O();
                if (z4 || O3 == a99Var) {
                    O3 = new ix1(20, function12, t83Var);
                    av8Var.n0(O3);
                }
                f(0, av8Var, null, (Function0) O3);
                av8Var.s(false);
            } else {
                av8Var.d0(1015625990);
                av8Var.s(false);
            }
            av8Var.s(z3);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere((Object) t83Var, (Object) str, (Object) function1, (Object) function12, (Object) xtcVar2, i2, 1);
        }
    }

    public static final void d(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1309313410);
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            long D = lz.D(R.color.surface_1, av8Var);
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(utcVar, D, a2), 8.0f);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
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
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-1080518807);
            for (int i4 = 0; i4 < 2; i4++) {
                goa goaVar = new goa(1.0f, true);
                u23 a4 = t23.a(ww9.d, uxf.p, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, goaVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                av8Var.d0(-1417437938);
                for (int i5 = 0; i5 < 2; i5++) {
                    fs3 fs3Var = (fs3) CollectionsKt.a0((i5 * 2) + i4, gv9Var);
                    if (fs3Var == null) {
                        av8Var.d0(164633983);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(164633984);
                        e(fs3Var, null, av8Var, 0);
                        av8Var.s(false);
                    }
                }
                av8Var.s(false);
                av8Var.s(true);
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, 3);
        }
    }

    public static final void e(fs3 fs3Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1388334342);
        int i3 = i2 | (av8Var.g(fs3Var) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc b0 = l98.b0(utcVar, 8.0f);
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
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
            kq9.b(s6a.N(fs3Var.b, 6, av8Var), null, bkh.l(utcVar, 40.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 432, 0);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(fs3Var.c, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            udj.c(fs3Var.a.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(fs3Var, xtcVar2, i2, 25);
        }
    }

    public static final void f(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1456712141);
        int i3 = (av8Var2.i(function0) ? 4 : 2) | i2 | 48;
        int i4 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var2);
            long D = lz.D(R.color.n_lv_3, av8Var2);
            utc utcVar = utc.a;
            xtc l2 = bkh.l(utcVar, 40.0f);
            long D2 = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = fi.r;
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            kq9.b(N, null, l98.b0(tol.y(l2, true, false, true, D2, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), 5), av8Var, 0), 12.0f), D, av8Var, 48, 0);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(function0, xtcVar2, i2, i4);
        }
    }

    public static final void g(nn6 nn6Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        nn6Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1913109017);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(nn6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
            boolean z = (i3 & 112) == 32;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new v61(18, function0);
                av8Var.n0(O);
            }
            xtc d0 = l98.d0(l98.f0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            int i4 = 6;
            u23 a2 = t23.a(new ng0(16.0f, true, new a70(i4)), uxf.o, av8Var, 6);
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
            l8g a3 = k8g.a(new ng0(8.0f, true, new a70(i4)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            utc utcVar = utc.a;
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
            wkn.k(haa.t(nn6Var.a, 0, av8Var), null, wnn.A(bkh.l(utcVar, 24.0f), o7g.a), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, 120);
            String str = nn6Var.b;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110586);
            av8Var.s(true);
            udj.c(nn6Var.c, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.g(), av8Var, 48, 384, 126968);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(nn6Var, function0, xtcVar, i2, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(xtc xtcVar, Integer num, Integer num2, Integer num3, boolean z, p3e p3eVar, int i2, long j2, of3 of3Var, final int i3, final int i4) {
        int i5;
        Integer num4;
        int i6;
        Integer num5;
        int i7;
        Integer num6;
        int i8;
        int i9;
        p3e p3eVar2;
        int i10;
        int i11;
        final xtc xtcVar2;
        av8 av8Var;
        final Integer num7;
        final Integer num8;
        final Integer num9;
        final p3e p3eVar3;
        final boolean z2;
        final int i12;
        final long j3;
        eqf u;
        xtc xtcVar3;
        boolean z3;
        int i13;
        long j4;
        xtc xtcVar4;
        boolean z4;
        int i14;
        boolean z5;
        long j5;
        av8 av8Var2;
        int i15;
        int i16;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1488427124);
        int i17 = i4 & 1;
        if (i17 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (av8Var3.g(xtcVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i18 = i4 & 2;
        if (i18 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            num4 = num;
            i5 |= av8Var3.g(num4) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                num5 = num2;
                i5 |= av8Var3.g(num5) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    num6 = num3;
                    i5 |= av8Var3.g(num6) ? a.o : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i5 |= av8Var3.h(z) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                        } else if ((196608 & i3) == 0) {
                            p3eVar2 = p3eVar;
                            i5 |= av8Var3.g(p3eVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            i10 = i4 & 64;
                            if (i10 == 0) {
                                i5 |= 1572864;
                                i11 = i17;
                            } else {
                                i11 = i17;
                                if ((i3 & 1572864) == 0) {
                                    i5 |= av8Var3.e(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                                }
                            }
                            if ((i3 & 12582912) == 0) {
                                if ((i4 & 128) == 0 && av8Var3.f(j2)) {
                                    i16 = 8388608;
                                    i5 |= i16;
                                }
                                i16 = 4194304;
                                i5 |= i16;
                            }
                            if (av8Var3.T(i5 & 1, (i5 & 4793491) == 4793490)) {
                                av8Var3.W();
                                xtcVar2 = xtcVar;
                                av8Var = av8Var3;
                                num7 = num4;
                                num8 = num5;
                                num9 = num6;
                                p3eVar3 = p3eVar2;
                                z2 = z;
                                i12 = i2;
                                j3 = j2;
                            } else {
                                av8Var3.Y();
                                int i19 = i3 & 1;
                                utc utcVar = utc.a;
                                if (i19 == 0 || av8Var3.B()) {
                                    xtcVar3 = i11 != 0 ? utcVar : xtcVar;
                                    if (i18 != 0) {
                                        num4 = null;
                                    }
                                    if (i6 != 0) {
                                        num5 = null;
                                    }
                                    Integer num10 = i7 == 0 ? num6 : null;
                                    z3 = i8 != 0 ? true : z;
                                    p3eVar3 = i9 != 0 ? new t3e(32.0f, 32.0f, 32.0f, 48.0f) : p3eVar2;
                                    i13 = i10 != 0 ? 3 : i2;
                                    if ((i4 & 128) != 0) {
                                        j4 = lz.D(R.color.n_lv_1, av8Var3);
                                        i5 &= -29360129;
                                    } else {
                                        j4 = j2;
                                    }
                                    num6 = num10;
                                } else {
                                    av8Var3.W();
                                    if ((i4 & 128) != 0) {
                                        i5 &= -29360129;
                                    }
                                    xtcVar3 = xtcVar;
                                    z3 = z;
                                    i13 = i2;
                                    p3eVar3 = p3eVar2;
                                    j4 = j2;
                                }
                                av8Var3.t();
                                kg0 kg0Var = ww9.f;
                                kv1 kv1Var = uxf.p;
                                int i20 = i5;
                                xtc d2 = bkh.d(xtcVar3, 1.0f);
                                if (z3) {
                                    xtcVar4 = xtcVar3;
                                    d2 = d2.z(l98.a0(utcVar, p3eVar3));
                                } else {
                                    xtcVar4 = xtcVar3;
                                }
                                u23 a2 = t23.a(kg0Var, kv1Var, av8Var3, 54);
                                int hashCode = Long.hashCode(av8Var3.T);
                                aee m2 = av8Var3.m();
                                xtc C = fqj.C(av8Var3, d2);
                                if3.k7.getClass();
                                boolean z6 = z3;
                                zg3 zg3Var = hf3.b;
                                av8Var3.h0();
                                Integer num11 = num4;
                                if (av8Var3.S) {
                                    av8Var3.l(zg3Var);
                                } else {
                                    av8Var3.q0();
                                }
                                waa.K(av8Var3, a2, hf3.g);
                                waa.K(av8Var3, m2, hf3.f);
                                waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                                waa.J(av8Var3, hf3.k);
                                waa.K(av8Var3, C, hf3.d);
                                if (num11 == null) {
                                    av8Var3.d0(-459574819);
                                    z4 = false;
                                    av8Var3.s(false);
                                } else {
                                    av8Var3.d0(-459574818);
                                    kq9.a(haa.t(num11.intValue(), (i20 >> 3) & 14, av8Var3), null, bkh.l(utcVar, 96.0f), r13.i, av8Var3, 3512, 0);
                                    z4 = false;
                                    av8Var3.s(false);
                                }
                                nq8.h(av8Var3, bkh.e(utcVar, 16.0f));
                                if (num5 == null) {
                                    av8Var3.d0(-459265749);
                                    av8Var3.s(z4);
                                    av8Var2 = av8Var3;
                                    j5 = j4;
                                    z5 = true;
                                    i14 = 3;
                                } else {
                                    av8Var3.d0(-459265748);
                                    String v = oea.v(num5.intValue(), av8Var3);
                                    yf8 yf8Var = xth.a;
                                    i14 = 3;
                                    z5 = true;
                                    udj.c(v, null, j4, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.j(), av8Var3, (i20 >> 15) & 896, 24960, 109562);
                                    j5 = j4;
                                    av8Var2 = av8Var3;
                                    Unit unit = Unit.a;
                                    av8Var2.s(z4);
                                }
                                if (num6 == null) {
                                    av8Var2.d0(-458922052);
                                    av8Var2.s(z4);
                                    i15 = i13;
                                } else {
                                    av8Var2.d0(-458922051);
                                    if (num5 == null) {
                                        av8Var2.d0(932131456);
                                        av8Var2.s(z4);
                                    } else {
                                        bf3.r(16.0f, 932131457, av8Var2, av8Var2, utcVar);
                                        Unit unit2 = Unit.a;
                                        av8Var2.s(z4);
                                    }
                                    String v2 = oea.v(num6.intValue(), av8Var2);
                                    yf8 yf8Var2 = xth.a;
                                    i15 = i13;
                                    udj.c(v2, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(i14), 0L, 2, false, i15, 0, null, xth.e(), av8Var2, 0, (57344 & (i20 >> 6)) | 384, 109562);
                                    Unit unit3 = Unit.a;
                                    av8Var2.s(z4);
                                }
                                av8Var2.s(z5);
                                av8Var = av8Var2;
                                num8 = num5;
                                num9 = num6;
                                i12 = i15;
                                xtcVar2 = xtcVar4;
                                z2 = z6;
                                num7 = num11;
                                j3 = j5;
                            }
                            u = av8Var.u();
                            if (u == null) {
                                u.d = new Function2() { // from class: vm5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        j72.h(xtc.this, num7, num8, num9, z2, p3eVar3, i12, j3, (of3) obj, aba.K(i3 | 1), i4);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        p3eVar2 = p3eVar;
                        i10 = i4 & 64;
                        if (i10 == 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        if (av8Var3.T(i5 & 1, (i5 & 4793491) == 4793490)) {
                        }
                        u = av8Var.u();
                        if (u == null) {
                        }
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    p3eVar2 = p3eVar;
                    i10 = i4 & 64;
                    if (i10 == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if (av8Var3.T(i5 & 1, (i5 & 4793491) == 4793490)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
                num6 = num3;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                p3eVar2 = p3eVar;
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if (av8Var3.T(i5 & 1, (i5 & 4793491) == 4793490)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            num5 = num2;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            num6 = num3;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            p3eVar2 = p3eVar;
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if (av8Var3.T(i5 & 1, (i5 & 4793491) == 4793490)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        num4 = num;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        num5 = num2;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        num6 = num3;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        p3eVar2 = p3eVar;
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if (av8Var3.T(i5 & 1, (i5 & 4793491) == 4793490)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void i(final t77 t77Var, boolean z, final Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        float f2;
        t77Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1579236325);
        int i3 = i2 | (av8Var.g(t77Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        final int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            lv1 lv1Var = uxf.m;
            float f3 = 1.0f;
            xtc c0 = l98.c0(bkh.d(xtcVar, 1.0f), 4.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            s77 s77Var = t77Var.b;
            boolean z2 = t77Var.d;
            int i5 = i3 & 896;
            int i6 = i3 & 14;
            boolean z3 = (i5 == 256) | (i6 == 4);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z3 || O == a99Var) {
                O = new Function0() { // from class: q47
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i4;
                        t77 t77Var2 = t77Var;
                        Function1 function12 = function1;
                        switch (i7) {
                            case 0:
                                function12.invoke(t77Var2.b);
                                break;
                            default:
                                function12.invoke(t77Var2.c);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
                f2 = Float.MAX_VALUE;
            } else {
                f2 = Float.MAX_VALUE;
            }
            int i7 = ((i3 << 3) & 896) | 3072;
            j(s77Var, z2, z, false, function0, new goa(f3, true), av8Var, i7);
            s77 s77Var2 = t77Var.c;
            boolean z4 = t77Var.e;
            boolean z5 = (i5 == 256) | (i6 == 4);
            Object O2 = av8Var.O();
            if (z5 || O2 == a99Var) {
                final int i8 = 1;
                O2 = new Function0() { // from class: q47
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i8;
                        t77 t77Var2 = t77Var;
                        Function1 function12 = function1;
                        switch (i72) {
                            case 0:
                                function12.invoke(t77Var2.b);
                                break;
                            default:
                                function12.invoke(t77Var2.c);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            }
            Function0 function02 = (Function0) O2;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            j(s77Var2, z4, z, true, function02, new goa(1.0f > f2 ? f2 : 1.0f, true), av8Var, i7);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(t77Var, z, function1, xtcVar, i2, 8);
        }
    }

    public static final void j(final s77 s77Var, final boolean z, final boolean z2, final boolean z3, final Function0 function0, final xtc xtcVar, of3 of3Var, final int i2) {
        int i3;
        av8 av8Var;
        int i4;
        long f2;
        tc3 tc3Var;
        boolean z4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1952731967);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(s77Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.h(z3) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i5 = 0;
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            int i6 = R.color.n_lv_3;
            final long f3 = (!z2 || z) ? ljg.f(av8Var2, -325279064, R.color.n_lv_1, av8Var2, false) : ljg.f(av8Var2, -325279544, R.color.n_lv_3, av8Var2, false);
            if (z2) {
                if (z) {
                    i4 = -325276014;
                    i6 = R.color.primary_default;
                } else {
                    i4 = -325274872;
                }
                f2 = ljg.f(av8Var2, i4, i6, av8Var2, false);
            } else {
                f2 = ljg.f(av8Var2, -325276984, R.color.n_lv_1, av8Var2, false);
            }
            tc3 H = yqo.H(-1241396635, av8Var2, new jo6(s77Var, 23));
            tc3 H2 = yqo.H(-1597752257, av8Var2, new ct8() { // from class: n47
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    n8g n8gVar = (n8g) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    n8gVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(n8gVar) ? 4 : 2;
                    }
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                        xtc a2 = n8gVar.a(1.0f, utc.a, true);
                        u23 a3 = t23.a(ww9.d, z3 ? uxf.q : uxf.o, av8Var3, 0);
                        int hashCode = Long.hashCode(av8Var3.T);
                        aee m2 = av8Var3.m();
                        xtc C = fqj.C(av8Var3, a2);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a3, hf3.g);
                        waa.K(av8Var3, m2, hf3.f);
                        waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var3, hf3.k);
                        waa.K(av8Var3, C, hf3.d);
                        s77 s77Var2 = s77Var;
                        String str = s77Var2.c;
                        yf8 yf8Var = xth.a;
                        udj.c(str, null, f3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var3, 0, 24960, 110586);
                        String str2 = s77Var2.e;
                        if (str2 == null) {
                            av8Var3.d0(-1455469551);
                            av8Var3.s(false);
                        } else {
                            av8Var3.d0(-1455469550);
                            udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var3, 0, 24960, 110586);
                            av8Var3.s(false);
                        }
                        av8Var3.s(true);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            });
            tc3 H3 = yqo.H(-2126412839, av8Var2, new o47(s77Var, f2, i5));
            lv1 lv1Var = uxf.m;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc A = wnn.A(xtcVar, o7g.a(4.0f));
            if (s77Var.a == null || s77Var.b == null) {
                tc3Var = H;
                z4 = false;
            } else {
                tc3Var = H;
                z4 = true;
            }
            tc3 tc3Var2 = tc3Var;
            xtc y = tol.y(A, z4, false, false, 0L, null, function0, av8Var2, 30);
            av8Var = av8Var2;
            xtc b0 = l98.b0(y, 4.0f);
            l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
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
            p8g p8gVar = p8g.a;
            if (z3) {
                av8Var.d0(-698297894);
                H3.invoke(av8Var, 6);
                H2.invoke(p8gVar, av8Var, 54);
                tc3Var2.invoke(av8Var, 6);
                av8Var.s(false);
            } else {
                av8Var.d0(-698223494);
                tc3Var2.invoke(av8Var, 6);
                H2.invoke(p8gVar, av8Var, 54);
                H3.invoke(av8Var, 6);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: p47
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j72.j(s77.this, z, z2, z3, function0, xtcVar, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(f93 f93Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        Object qk7Var;
        q50 q50Var;
        q50 q50Var2;
        zg3 zg3Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2007730270);
        int i4 = i2 | (av8Var.g(f93Var) ? 4 : 2) | 48;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            long D = lz.D(R.color.home_primary_highlight, av8Var);
            long D2 = lz.D(R.color.away_primary_highlight, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var.n0(O);
            }
            q50 q50Var3 = (q50) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var.n0(O2);
            }
            q50 q50Var4 = (q50) O2;
            nc7 nc7Var = f93Var.c;
            boolean i5 = av8Var.i(q50Var3) | ((i4 & 14) == 4) | av8Var.f(D) | av8Var.i(q50Var4) | av8Var.f(D2);
            Object O3 = av8Var.O();
            if (i5 || O3 == a99Var) {
                q50Var = q50Var3;
                q50Var2 = q50Var4;
                qk7Var = new qk7(q50Var, f93Var, D, q50Var2, D2, null);
                av8Var.n0(qk7Var);
            } else {
                qk7Var = O3;
                q50Var = q50Var3;
                q50Var2 = q50Var4;
            }
            hz8.o(av8Var, nc7Var, (Function2) qk7Var);
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.h;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
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
            q50 q50Var5 = q50Var;
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            mv1 mv1Var = uxf.f;
            q50 q50Var6 = q50Var2;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String str = f93Var.a;
            if (str == null) {
                str = "-";
            }
            yf8 yf8Var = xth.a;
            dfj e2 = xth.e();
            long D3 = lz.D(R.color.n_lv_1, av8Var);
            xtc c0 = l98.c0(n9e.q(utcVar, r13.c(D, ((Number) q50Var5.d()).floatValue()), o7g.a(12.0f)), 12.0f, 4.0f);
            xtcVar2 = utcVar;
            i3 = 1;
            udj.c(str, c0, D3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e2, av8Var, 0, 24960, 110584);
            av8Var.s(true);
            udj.c(oea.v(f93Var.e, av8Var), l98.d0(xtcVar2, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.m(), av8Var, 48, 24960, 110584);
            mv1 mv1Var2 = uxf.h;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            k1c c3 = e12.c(mv1Var2, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String str2 = f93Var.b;
            udj.c(str2 == null ? "-" : str2, l98.c0(n9e.q(xtcVar2, r13.c(D2, ((Number) q50Var6.d()).floatValue()), o7g.a(12.0f)), 12.0f, 4.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            i3 = 1;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ok7(f93Var, xtcVar2, i2, i3);
        }
    }

    public static final void l(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2087751636);
        int i3 = 2;
        int i4 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            boolean z = (i4 & 14) == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new uo(i3, gv9Var);
                av8Var.n0(O);
            }
            v8a.a(d2, null, null, null, null, null, false, null, (Function1) O, av8Var, 0, 510);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new y81(gv9Var, xtcVar, i2, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r14v16, types: [int] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v20 */
    public static final void m(ysd ysdVar, osa osaVar, boolean z, Function1 function1, final Function1 function12, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        ysd ysdVar2;
        av8 av8Var;
        cdi N;
        final Function1 function13;
        final ?? r14;
        osaVar.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        ?? r13 = (av8) of3Var;
        r13.f0(-788532043);
        int i3 = i2 | (r13.g(ysdVar) ? 4 : 2) | (r13.i(osaVar) ? 32 : 16) | (r13.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (r13.i(function1) ? a.o : 1024) | (r13.i(function12) ? 16384 : 8192) | (r13.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (r13.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        final int i4 = 0;
        if (r13.T(i3 & 1, (i3 & 599187) != 599186)) {
            final wd8 wd8Var = (wd8) r13.k(dh3.i);
            Object[] objArr = new Object[0];
            Object O = r13.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new ild(12);
                r13.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, r13, 48);
            qpa a2 = tpa.a(0, 3, r13);
            qpa a3 = tpa.a(0, 3, r13);
            if (((Boolean) e1dVar.getValue()).booleanValue()) {
                r13.d0(-1981358529);
                N = z1a.N(a3, r13);
                r13.s(false);
            } else {
                r13.d0(-1981306790);
                N = z1a.N(a2, r13);
                r13.s(false);
            }
            cdi cdiVar = N;
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            int i5 = i3 & 57344;
            boolean i6 = r13.i(wd8Var) | (i5 == 16384);
            Object O2 = r13.O();
            if (i6 || O2 == obj) {
                O2 = new Function0() { // from class: ssd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                wd8.a(wd8Var);
                                function12.invoke("");
                                break;
                            default:
                                wd8.a(wd8Var);
                                function12.invoke("");
                                break;
                        }
                        return Unit.a;
                    }
                };
                r13.n0(O2);
            }
            tol.a(0, 0, r13, (Function0) O2, booleanValue);
            g28 g28Var = bkh.c;
            xtc q = n9e.q(g28Var, lz.D(R.color.onboarding_surface_1, r13), oyn.e);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(r13.T);
            aee m2 = r13.m();
            xtc C = fqj.C(r13, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            r13.h0();
            if (r13.S) {
                r13.l(zg3Var);
            } else {
                r13.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(r13, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(r13, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(r13, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(r13, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(r13, C, f50Var3);
            int i7 = 6;
            cdi b2 = a60.b(z ? 1.0f : 0.0f, s02.h0(600, 0, null, 6), null, r13, 48, 28);
            cdi a4 = a60.a(!ysdVar.d.isEmpty() ? 200.0f : 48.0f, s02.h0(300, 0, null, 6), null, null, r13, 48, 12);
            cdi a5 = a60.a(((Boolean) cdiVar.getValue()).booleanValue() ? 4.0f : 0.0f, s02.h0(100, 0, null, 6), null, null, r13, 48, 12);
            Object O3 = r13.O();
            if (O3 == obj) {
                O3 = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                r13.n0(O3);
            }
            xnh xnhVar = (xnh) O3;
            Object O4 = r13.O();
            if (O4 == obj) {
                O4 = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                r13.n0(O4);
            }
            xnh xnhVar2 = (xnh) O4;
            Object O5 = r13.O();
            if (O5 == obj) {
                O5 = new tsd(xnhVar2, xnhVar);
                r13.n0(O5);
            }
            xtc J = lz.J(xtcVar.z(g28Var), (tsd) O5, null);
            boolean g2 = r13.g(b2);
            Object O6 = r13.O();
            if (g2 || O6 == obj) {
                O6 = new cl1(b2, 9);
                r13.n0(O6);
            }
            xtc M = s02.M(J, (Function1) O6);
            u23 a6 = t23.a(ww9.d, uxf.o, r13, 0);
            int hashCode2 = Long.hashCode(r13.T);
            aee m3 = r13.m();
            xtc C2 = fqj.C(r13, M);
            r13.h0();
            if (r13.S) {
                r13.l(zg3Var);
            } else {
                r13.q0();
            }
            waa.K(r13, a6, f50Var);
            waa.K(r13, m3, ff3Var);
            bf3.s(hashCode2, r13, f50Var2, r13, ryVar);
            waa.K(r13, C2, f50Var3);
            String v = oea.v(R.string.start_by_adding_favourites_header, r13);
            String v2 = oea.v(R.string.start_by_adding_favourites_body_text, r13);
            utc utcVar = utc.a;
            xtc B = wnn.B(utcVar);
            Object O7 = r13.O();
            if (O7 == obj) {
                O7 = new yya(i7, xnhVar, xnhVar2);
                r13.n0(O7);
            }
            tba.e(0, 0, r13, s9a.A(B, (ct8) O7), v, v2);
            String str = ysdVar.e;
            String v3 = oea.v(R.string.search_sofascore, r13);
            long D = lz.D(R.color.n_lv_5, r13);
            xtc G = mha.G(bkh.d(utcVar, 1.0f), 1.0f);
            float f2 = ((p75) a5.getValue()).a;
            G.getClass();
            xtc c0 = l98.c0(td4.X(G, new s81(f2, 7)), 16.0f, 8.0f);
            boolean i8 = r13.i(wd8Var) | (i5 == 16384);
            Object O8 = r13.O();
            if (i8 || O8 == obj) {
                function13 = function12;
                r14 = 1;
                O8 = new Function0() { // from class: ssd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (r14) {
                            case 0:
                                wd8.a(wd8Var);
                                function13.invoke("");
                                break;
                            default:
                                wd8.a(wd8Var);
                                function13.invoke("");
                                break;
                        }
                        return Unit.a;
                    }
                };
                r13.n0(O8);
            } else {
                function13 = function12;
                r14 = 1;
            }
            Function0 function02 = (Function0) O8;
            boolean g3 = r13.g(e1dVar);
            Object O9 = r13.O();
            if (g3 || O9 == obj) {
                O9 = new fw6(20, e1dVar);
                r13.n0(O9);
            }
            int i9 = i3 >> 9;
            boolean z2 = r14;
            uaa.f(str, function13, v3, c0, false, D, function02, (Function1) O9, r13, i9 & 112);
            av8 av8Var2 = r13;
            Boolean bool = (Boolean) e1dVar.getValue();
            bool.getClass();
            ysdVar2 = ysdVar;
            wnn.d(bool, null, s02.h0(150, 0, null, 6), null, yqo.H(348519792, av8Var2, new s64(ysdVar, osaVar, a3, function1, a2, a4)), av8Var2, 24960, 10);
            av8Var2.s(z2);
            s((i9 & 896) | ((i3 >> 6) & 112), av8Var2, ysdVar2.d, n12.a.a(utcVar, uxf.j), function0, function1);
            av8Var2.s(z2);
            av8Var = av8Var2;
        } else {
            ysdVar2 = ysdVar;
            r13.W();
            av8Var = r13;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc7(ysdVar2, osaVar, z, function1, function12, function0, xtcVar, i2, 5);
        }
    }

    public static final void n(ysd ysdVar, qpa qpaVar, float f2, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-388020175);
        int i3 = i2 | (av8Var.g(ysdVar) ? 4 : 2) | (av8Var.g(qpaVar) ? 32 : 16) | (av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? 2048 : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            l39 l39Var = new l39();
            t3e t3eVar = new t3e(16.0f, 16.0f, 16.0f, f2);
            int i4 = 6;
            ng0 ng0Var = new ng0(8.0f, true, new a70(i4));
            ng0 ng0Var2 = new ng0(8.0f, true, new a70(i4));
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object O = av8Var.O();
            int i5 = 3;
            if (z || O == nf3.a) {
                O = new ord(i5, ysdVar, function1);
                av8Var.n0(O);
            }
            haa.d(l39Var, null, qpaVar, t3eVar, ng0Var2, ng0Var, null, false, null, (Function1) O, av8Var, ((i3 << 3) & 896) | 1769472, 914);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8b(ysdVar, qpaVar, f2, function1, i2);
        }
    }

    public static final void o(t83 t83Var, of3 of3Var, int i2) {
        int i3;
        lv1 lv1Var = uxf.m;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-968452959);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(t83Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            boolean z = t83Var instanceof r83;
            utc utcVar = utc.a;
            int i4 = 6;
            if (z) {
                av8Var.d0(-1886606935);
                l8g a2 = k8g.a(new ng0(8.0f, true, new a70(i4)), lv1Var, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
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
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                r83 r83Var = (r83) t83Var;
                Integer num = r83Var.d;
                if (num != null) {
                    av8Var.d0(1768903492);
                    td4.G(num.intValue(), bkh.l(utcVar, 16.0f), false, 0L, av8Var, 48, 12);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    av8Var.d0(1769050525);
                    av8Var.s(false);
                }
                String str = r83Var.e;
                if (str == null) {
                    str = ljg.k(av8Var, -912763213, R.string.transfer_no_team, av8Var, false);
                } else {
                    av8Var.d0(-912763740);
                    av8Var.s(false);
                }
                String str2 = str;
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
                av8Var = av8Var2;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                if (!(t83Var instanceof s83)) {
                    throw dmi.h(av8Var, 1324613604, false);
                }
                av8Var.d0(-1885913372);
                s83 s83Var = (s83) t83Var;
                if (s83Var.d != null) {
                    av8Var.d0(-1885854534);
                    l8g a3 = k8g.a(new ng0(8.0f, true, new a70(i4)), lv1Var, av8Var, 54);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, utcVar);
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
                    if (s83Var.e != null) {
                        av8Var.d0(-1374680047);
                        td4.k(s83Var.e, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, 48, 12);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1374480159);
                        av8Var.s(false);
                    }
                    String str3 = s83Var.d;
                    yf8 yf8Var2 = xth.a;
                    udj.c(str3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                    av8Var = av8Var;
                    av8Var.s(true);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1885126623);
                    av8Var.s(false);
                }
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(t83Var, i2, 2);
        }
    }

    public static final void p(int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1560721590);
        int i3 = i2 | 6;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            xtcVar = utc.a;
            xtc b0 = l98.b0(bkh.d(xtcVar, 1.0f), 32.0f);
            k1c c2 = e12.c(uxf.g, false);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            t62.h(null, null, oea.v(R.string.empty_adjust_search_text, av8Var), null, null, false, 0L, av8Var, 0, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i2, i4);
        }
    }

    public static final void q(ysd ysdVar, osa osaVar, qpa qpaVar, float f2, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1715618482);
        int i3 = i2 | (av8Var.g(ysdVar) ? 4 : 2) | (av8Var.i(osaVar) ? 32 : 16) | (av8Var.g(qpaVar) ? 256 : 128) | (av8Var.d(f2) ? a.o : 1024) | (av8Var.i(function1) ? 16384 : 8192);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            mvh mvhVar = (mvh) av8Var.k(dh3.q);
            int i4 = i3 & 896;
            boolean g2 = (i4 == 256) | av8Var.g(mvhVar);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g2 || O == a99Var) {
                O = new gjb(qpaVar, mvhVar, null, 22);
                av8Var.n0(O);
            }
            hz8.o(av8Var, qpaVar, (Function2) O);
            l39 l39Var = new l39();
            t3e t3eVar = new t3e(16.0f, 16.0f, 16.0f, f2);
            int i5 = 6;
            ng0 ng0Var = new ng0(8.0f, true, new a70(i5));
            ng0 ng0Var2 = new ng0(8.0f, true, new a70(i5));
            boolean z = ((i3 & 112) == 32 || av8Var.i(osaVar)) | ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new vsc(4, osaVar, ysdVar, function1);
                av8Var.n0(O2);
            }
            haa.d(l39Var, null, qpaVar, t3eVar, ng0Var2, ng0Var, null, false, null, (Function1) O2, av8Var, i4 | 1769472, 914);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xn6(ysdVar, osaVar, qpaVar, f2, function1, i2);
        }
    }

    public static final void r(int i2, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        xtc xtcVar2;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1789149877);
        int i3 = (av8Var2.g(str) ? 4 : 2) | i2 | 48;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            yf8 yf8Var = xth.a;
            dfj b2 = xth.b();
            long D = lz.D(R.color.n_lv_1, av8Var2);
            utc utcVar = utc.a;
            av8Var = av8Var2;
            udj.c(str, l98.e0(bkh.d(utcVar, 1.0f), 16.0f, 16.0f, 8.0f, 8.0f), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, av8Var, i3 & 14, 0, 131064);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(str, xtcVar2, i2, 1);
        }
    }

    public static final void s(int i2, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function0 function0, Function1 function1) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(194937663);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? av8Var.g(gv9Var) : av8Var.i(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            Object firstOrNull = CollectionsKt.firstOrNull(gv9Var);
            boolean g2 = av8Var.g(a2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            rq3 rq3Var = null;
            if (g2 || O == a99Var) {
                O = new ck1(13, rq3Var, a2);
                av8Var.n0(O);
            }
            hz8.o(av8Var, firstOrNull, (Function2) O);
            boolean z = !gv9Var.isEmpty();
            i4k h0 = s02.h0(300, 0, null, 6);
            Object O2 = av8Var.O();
            int i4 = 12;
            if (O2 == a99Var) {
                O2 = new yt6(i4);
                av8Var.n0(O2);
            }
            zo5 n = uo5.n(h0, (Function1) O2);
            i4k h02 = s02.h0(300, 0, null, 6);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new yt6(i4);
                av8Var.n0(O3);
            }
            fz8.e(z, xtcVar, n, uo5.p(h02, (Function1) O3), null, yqo.H(1061580647, av8Var, new er6(23, a2, gv9Var, function0, function1)), av8Var, ((i3 >> 6) & 112) | 196608, 16);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(gv9Var, function1, function0, xtcVar, i2, 23);
        }
    }

    public static fu3 t(z88 z88Var) {
        g gVar = g.a;
        z88Var.getClass();
        gVar.getClass();
        g33 g33Var = new g33(z88Var, null, 2);
        fu3 fu3Var = new fu3();
        smi smiVar = new smi(null);
        hs4 hs4Var = z45.a;
        fu3Var.m = new ox9(fu3Var, g33Var, s9a.c(rob.a.f.plus(gVar).plus(smiVar)), new h63(fu3Var, 7));
        if (z88Var instanceof ddi) {
            if (ig0.G().H()) {
                fu3Var.j(((ddi) z88Var).getValue());
                return fu3Var;
            }
            fu3Var.k(((ddi) z88Var).getValue());
        }
        return fu3Var;
    }

    public static final boolean u(mdi mdiVar, int i2, c7 c7Var, boolean z) {
        boolean z2;
        synchronized (f) {
            try {
                int i3 = mdiVar.d;
                if (i3 == i2) {
                    mdiVar.c = c7Var;
                    z2 = true;
                    if (z) {
                        mdiVar.e++;
                    }
                    mdiVar.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static i25 v(o02 o02Var) {
        int i2;
        m25 m25Var;
        int i3;
        l25 l25Var;
        int i4;
        int i5;
        m25 m25Var2;
        m25 m25Var3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int X = o02Var.X();
        int W = o02Var.W();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        l25 l25Var2 = new l25();
        int i15 = 0;
        l25Var2.a = 0;
        l25Var2.b = X;
        l25Var2.c = 0;
        l25Var2.d = W;
        arrayList2.add(l25Var2);
        int i16 = X + W;
        int i17 = 1;
        int i18 = (((i16 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i18];
        int i19 = i18 / 2;
        int[] iArr2 = new int[i18];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            l25 l25Var3 = (l25) arrayList2.remove(arrayList2.size() - i17);
            if (l25Var3.b() >= i17 && l25Var3.a() >= i17) {
                int a2 = ((l25Var3.a() + l25Var3.b()) + i17) / 2;
                int i20 = i17 + i19;
                iArr[i20] = l25Var3.a;
                iArr2[i20] = l25Var3.b;
                int i21 = i15;
                while (i21 < a2) {
                    int i22 = Math.abs(l25Var3.b() - l25Var3.a()) % 2 == i17 ? i17 : i15;
                    int b2 = l25Var3.b() - l25Var3.a();
                    int i23 = -i21;
                    int i24 = i23;
                    while (true) {
                        if (i24 > i21) {
                            i4 = i15;
                            i2 = i19;
                            i5 = a2;
                            m25Var2 = null;
                            break;
                        }
                        if (i24 == i23 || (i24 != i21 && iArr[i24 + 1 + i19] > iArr[(i24 - 1) + i19])) {
                            i10 = iArr[i24 + 1 + i19];
                            i11 = i10;
                        } else {
                            i10 = iArr[(i24 - 1) + i19];
                            i11 = i10 + 1;
                        }
                        i2 = i19;
                        int i25 = ((i11 - l25Var3.a) + l25Var3.c) - i24;
                        if (i21 == 0 || i11 != i10) {
                            i12 = i11;
                            i13 = i25;
                        } else {
                            i12 = i11;
                            i13 = i25 - 1;
                        }
                        int i26 = i24;
                        int i27 = i25;
                        int i28 = i12;
                        i5 = a2;
                        while (i28 < l25Var3.b && i27 < l25Var3.d && o02Var.I(i28, i27)) {
                            i28++;
                            i27++;
                        }
                        iArr[i26 + i2] = i28;
                        if (i22 != 0) {
                            int i29 = b2 - i26;
                            i14 = i22;
                            if (i29 >= i23 + 1 && i29 <= i21 - 1 && iArr2[i29 + i2] <= i28) {
                                m25Var2 = new m25();
                                m25Var2.a = i10;
                                m25Var2.b = i13;
                                m25Var2.c = i28;
                                m25Var2.d = i27;
                                i4 = 0;
                                m25Var2.e = false;
                                break;
                            }
                        } else {
                            i14 = i22;
                        }
                        i24 = i26 + 2;
                        i15 = 0;
                        i19 = i2;
                        a2 = i5;
                        i22 = i14;
                    }
                    if (m25Var2 != null) {
                        m25Var = m25Var2;
                        break;
                    }
                    int i30 = (l25Var3.b() - l25Var3.a()) % 2 == 0 ? 1 : i4;
                    int b3 = l25Var3.b() - l25Var3.a();
                    int i31 = i23;
                    while (true) {
                        if (i31 > i21) {
                            m25Var3 = null;
                            break;
                        }
                        if (i31 == i23 || (i31 != i21 && iArr2[i31 + 1 + i2] < iArr2[(i31 - 1) + i2])) {
                            i6 = iArr2[i31 + 1 + i2];
                            i7 = i6;
                        } else {
                            i6 = iArr2[(i31 - 1) + i2];
                            i7 = i6 - 1;
                        }
                        int i32 = l25Var3.d - ((l25Var3.b - i7) - i31);
                        int i33 = (i21 == 0 || i7 != i6) ? i32 : i32 + 1;
                        int i34 = i30;
                        while (i7 > l25Var3.a && i32 > l25Var3.c) {
                            i8 = b3;
                            if (!o02Var.I(i7 - 1, i32 - 1)) {
                                break;
                            }
                            i7--;
                            i32--;
                            b3 = i8;
                        }
                        i8 = b3;
                        iArr2[i31 + i2] = i7;
                        if (i34 != 0 && (i9 = i8 - i31) >= i23 && i9 <= i21 && iArr[i9 + i2] >= i7) {
                            m25Var3 = new m25();
                            m25Var3.a = i7;
                            m25Var3.b = i32;
                            m25Var3.c = i6;
                            m25Var3.d = i33;
                            m25Var3.e = true;
                            break;
                        }
                        i31 += 2;
                        i30 = i34;
                        b3 = i8;
                    }
                    if (m25Var3 != null) {
                        m25Var = m25Var3;
                        break;
                    }
                    i21++;
                    i19 = i2;
                    a2 = i5;
                    i17 = 1;
                    i15 = 0;
                }
            }
            i2 = i19;
            m25Var = null;
            if (m25Var != null) {
                if (m25Var.a() > 0) {
                    int i35 = m25Var.d;
                    int i36 = m25Var.b;
                    int i37 = i35 - i36;
                    int i38 = m25Var.c;
                    int i39 = m25Var.a;
                    int i40 = i38 - i39;
                    arrayList.add(i37 != i40 ? m25Var.e ? new h25(i39, i36, m25Var.a()) : i37 > i40 ? new h25(i39, i36 + 1, m25Var.a()) : new h25(i39 + 1, i36, m25Var.a()) : new h25(i39, i36, i40));
                }
                if (arrayList3.isEmpty()) {
                    l25Var = new l25();
                    i3 = 1;
                } else {
                    i3 = 1;
                    l25Var = (l25) arrayList3.remove(arrayList3.size() - 1);
                }
                l25Var.a = l25Var3.a;
                l25Var.c = l25Var3.c;
                l25Var.b = m25Var.a;
                l25Var.d = m25Var.b;
                arrayList2.add(l25Var);
                l25Var3.b = l25Var3.b;
                l25Var3.d = l25Var3.d;
                l25Var3.a = m25Var.c;
                l25Var3.c = m25Var.d;
                arrayList2.add(l25Var3);
            } else {
                i3 = 1;
                arrayList3.add(l25Var3);
            }
            i19 = i2;
            i17 = i3;
            i15 = 0;
        }
        Collections.sort(arrayList, c);
        return new i25(o02Var, arrayList, iArr, iArr2);
    }

    public static boolean w(nl6 nl6Var) {
        j9e j9eVar = new j9e(8);
        int i2 = r5a.e(nl6Var, j9eVar).a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        nl6Var.peekFully(j9eVar.a, 0, 4);
        j9eVar.N(0);
        int m2 = j9eVar.m();
        if (m2 == 1463899717) {
            return true;
        }
        tgj.z("Unsupported form type: " + m2);
        return false;
    }

    public static final vy8 x(vy8 vy8Var, za zaVar) {
        return vy8Var.d(new ic(zaVar));
    }

    public static final j80 y(j80 j80Var) {
        j80 c2 = j80Var.c();
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(j80Var.a(i2), i2);
        }
        return c2;
    }

    public static final xtc z(xtc xtcVar, dx dxVar, Function2 function2) {
        ewd ewdVar = ewd.a;
        return xtcVar.z(new q95(dxVar, function2));
    }
}
