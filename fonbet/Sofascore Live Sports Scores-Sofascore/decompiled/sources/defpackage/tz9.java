package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzadf;
import com.google.android.gms.internal.pal.zzadg;
import com.google.android.gms.internal.pal.zzadi;
import com.google.android.gms.internal.pal.zzafj;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandGradientColors;
import com.sofascore.local_persistance.BrandingBackgroundColors;
import com.sofascore.local_persistance.BrandingBoostedOdds;
import com.sofascore.local_persistance.BrandingEvent;
import com.sofascore.local_persistance.BrandingTeam;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.local_persistance.ImageDisplayType;
import com.sofascore.model.Country;
import com.sofascore.model.branding.ServerBrand;
import com.sofascore.model.branding.ServerBrandColors;
import com.sofascore.model.branding.ServerBrandingBoostedOdds;
import com.sofascore.model.branding.ServerBrandingEvent;
import com.sofascore.model.branding.ServerImageDisplayType;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class tz9 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static boolean e = true;
    public static Field f;
    public static boolean g;

    public static boolean A(Class cls, Method method) {
        method.getClass();
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static final v7b B(Context context, BrandColors brandColors, BrandingBackgroundColors brandingBackgroundColors) {
        c1g L = L(context, brandColors, brandingBackgroundColors);
        if (L == null) {
            return null;
        }
        int i = L.a;
        return wxf.s(b.j(new r13(hkg.b(i)), new r13(hkg.b(L.b)), new r13(hkg.b(i))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
    }

    public static final String C(String str) {
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            String host = url.getHost();
            String path = url.getPath();
            path.getClass();
            String path2 = url.getPath();
            path2.getClass();
            return protocol + "://" + host + path.substring(0, StringsKt.T("/", path2, 6) + 1);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public static final long D(BrandColors brandColors, of3 of3Var) {
        return hkg.b(Color.parseColor(hz8.O(of3Var) ? brandColors.getDark() : brandColors.getLight()));
    }

    public static final String E(BrandColors brandColors, Context context) {
        brandColors.getClass();
        context.getClass();
        String dark = brandColors.getDark();
        if (!hkg.b0(context)) {
            dark = null;
        }
        return dark == null ? brandColors.getLight() : dark;
    }

    public static final boolean G(BrandingTeam brandingTeam) {
        return (brandingTeam == null || !Intrinsics.c(brandingTeam.getBackground(), Boolean.TRUE) || (brandingTeam.getBackgroundGradientColor() == null && brandingTeam.getBackgroundColor() == null)) ? false : true;
    }

    public static final boolean H(BrandingTournament brandingTournament) {
        return (brandingTournament == null || !Intrinsics.c(brandingTournament.getBackground(), Boolean.TRUE) || (brandingTournament.getBackgroundGradientColor() == null && brandingTournament.getBackgroundColor() == null)) ? false : true;
    }

    public static final boolean I(Incident incident) {
        incident.getClass();
        return (incident instanceof Incident.CardIncident) || (incident instanceof Incident.GoalIncident) || (incident instanceof Incident.PenaltyShotIncident) || (incident instanceof Incident.SubstitutionIncident) || (incident instanceof Incident.SuspensionIncident) || (incident instanceof Incident.VarDecisionIncident);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x003e, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [kdf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList J(nkk nkkVar) {
        char c2;
        ArrayList arrayList;
        char c3;
        boolean z;
        ArrayList arrayList2;
        nkk nkkVar2 = nkkVar;
        ArrayList arrayList3 = null;
        if (nkkVar2.s() == 0) {
            char c4 = 7;
            nkkVar2.F(7);
            int f2 = nkkVar2.f();
            char c5 = 4;
            byte b2 = 0;
            boolean z2 = true;
            if (f2 == 1684433976) {
                nkk nkkVar3 = new nkk(4, false);
                Inflater inflater = new Inflater(true);
                try {
                    if (!lik.v(nkkVar2, nkkVar3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    nkkVar2 = nkkVar3;
                } finally {
                    inflater.end();
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int i = nkkVar2.b;
            int i2 = nkkVar2.c;
            while (i < i2) {
                int f3 = nkkVar2.f() + i;
                if (f3 > i && f3 <= i2) {
                    if (nkkVar2.f() == 1835365224) {
                        int f4 = nkkVar2.f();
                        if (f4 <= 10000) {
                            float[] fArr = new float[f4];
                            for (int i3 = b2; i3 < f4; i3++) {
                                fArr[i3] = Float.intBitsToFloat(nkkVar2.f());
                            }
                            int f5 = nkkVar2.f();
                            if (f5 <= 32000) {
                                double log = Math.log(2.0d);
                                c2 = c4;
                                arrayList = arrayList3;
                                int ceil = (int) Math.ceil(Math.log(f4 * 2.0d) / log);
                                c3 = c5;
                                byte[] bArr = nkkVar2.a;
                                z = z2;
                                nm2 nm2Var = new nm2(bArr, bArr.length, 2, b2);
                                nm2Var.q(nkkVar2.b * 8);
                                float[] fArr2 = new float[f5 * 5];
                                int i4 = 5;
                                int[] iArr = new int[5];
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    if (i5 < f5) {
                                        int i7 = 0;
                                        while (i7 < i4) {
                                            int i8 = iArr[i7];
                                            int i9 = nm2Var.i(ceil);
                                            int i10 = ((i9 >> 1) ^ (-(i9 & 1))) + i8;
                                            if (i10 >= f4 || i10 < 0) {
                                                break;
                                            }
                                            fArr2[i6] = fArr[i10];
                                            iArr[i7] = i10;
                                            i7++;
                                            i6++;
                                            i4 = 5;
                                        }
                                        i5++;
                                        i4 = 5;
                                    } else {
                                        nm2Var.q((nm2Var.g() + 7) & (-8));
                                        int i11 = 32;
                                        int i12 = nm2Var.i(32);
                                        mdf[] mdfVarArr = new mdf[i12];
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            int i14 = nm2Var.i(8);
                                            int i15 = nm2Var.i(8);
                                            int i16 = nm2Var.i(i11);
                                            if (i16 <= 128000) {
                                                nm2 nm2Var2 = nm2Var;
                                                int ceil2 = (int) Math.ceil(Math.log(f5 * 2.0d) / log);
                                                float[] fArr3 = new float[i16 * 3];
                                                float[] fArr4 = new float[i16 * 2];
                                                int i17 = 0;
                                                int i18 = 0;
                                                while (i17 < i16) {
                                                    int i19 = nm2Var2.i(ceil2);
                                                    int i20 = ceil2;
                                                    int i21 = ((i19 >> 1) ^ (-(i19 & 1))) + i18;
                                                    if (i21 >= 0 && i21 < f5) {
                                                        int i22 = i17 * 3;
                                                        int i23 = i21 * 5;
                                                        fArr3[i22] = fArr2[i23];
                                                        fArr3[i22 + 1] = fArr2[i23 + 1];
                                                        fArr3[i22 + 2] = fArr2[i23 + 2];
                                                        int i24 = i17 * 2;
                                                        fArr4[i24] = fArr2[i23 + 3];
                                                        fArr4[i24 + 1] = fArr2[i23 + 4];
                                                        i17++;
                                                        i18 = i21;
                                                        ceil2 = i20;
                                                    }
                                                }
                                                mdfVarArr[i13] = new mdf(i14, fArr3, fArr4, i15, 0);
                                                i13++;
                                                nm2Var = nm2Var2;
                                                i11 = 32;
                                            }
                                        }
                                        arrayList2 = new kdf(mdfVarArr);
                                    }
                                }
                                arrayList2 = arrayList;
                                if (arrayList2 != null) {
                                    return arrayList;
                                }
                                arrayList4.add(arrayList2);
                            }
                        }
                        c2 = c4;
                        ArrayList arrayList5 = arrayList3;
                        arrayList = arrayList5;
                        c3 = c5;
                        z = z2;
                        arrayList2 = arrayList5;
                        if (arrayList2 != null) {
                        }
                    } else {
                        c2 = c4;
                        arrayList = arrayList3;
                        c3 = c5;
                        z = z2;
                    }
                    nkkVar2.E(f3);
                    i = f3;
                    arrayList3 = arrayList;
                    c4 = c2;
                    c5 = c3;
                    z2 = z;
                    b2 = 0;
                }
            }
            return arrayList4;
        }
        return arrayList3;
    }

    public static final String K(String str, HashMap hashMap) {
        str.getClass();
        if (hashMap.isEmpty()) {
            return str;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            str = c.r(str, lnb.o(U3.j.d, str2, U3.j.e), (String) entry.getValue(), false);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c1g L(Context context, BrandColors brandColors, BrandingBackgroundColors brandingBackgroundColors) {
        BrandGradientColors brandGradientColors;
        int parseColor;
        String color2;
        if (brandingBackgroundColors != null) {
            context.getClass();
            brandGradientColors = brandingBackgroundColors.getDark();
            if (!hkg.b0(context)) {
                brandGradientColors = null;
            }
            if (brandGradientColors == null) {
                brandGradientColors = brandingBackgroundColors.getLight();
            }
        } else {
            brandGradientColors = null;
        }
        String E = brandColors != null ? E(brandColors, context) : null;
        int i = 0;
        if (brandGradientColors == null) {
            if (E == null) {
                return null;
            }
            try {
                i = Color.parseColor(E);
            } catch (Exception unused) {
            }
            return new c1g(i, i);
        }
        String color1 = brandGradientColors.getColor1();
        if (color1 != null) {
            try {
                parseColor = Color.parseColor(color1);
            } catch (Exception unused2) {
            }
            color2 = brandGradientColors.getColor2();
            if (color2 != null) {
                try {
                    i = Color.parseColor(color2);
                } catch (Exception unused3) {
                }
            }
            return new c1g(parseColor, i);
        }
        parseColor = 0;
        color2 = brandGradientColors.getColor2();
        if (color2 != null) {
        }
        return new c1g(parseColor, i);
    }

    public static final Object P(Function2 function2, sq3 sq3Var) {
        rmi rmiVar = new rmi(sq3Var, sq3Var.getContext());
        Object L = y6a.L(rmiVar, true, rmiVar, function2);
        lu3 lu3Var = lu3.a;
        return L;
    }

    public static final String Q(char c2) {
        String valueOf = String.valueOf(c2);
        valueOf.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c2));
        }
        if (c2 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        String lowerCase = upperCase.substring(1).toLowerCase(locale);
        lowerCase.getClass();
        return charAt + lowerCase;
    }

    public static final Pair R(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static final ImageDisplayType S(ServerImageDisplayType serverImageDisplayType) {
        int i = serverImageDisplayType == null ? -1 : n6h.a[serverImageDisplayType.ordinal()];
        return i != 1 ? i != 2 ? ImageDisplayType.UNKNOWN : ImageDisplayType.AD_UNIT : ImageDisplayType.BANNER;
    }

    public static final Brand T(ServerBrand serverBrand, Map map, String str) {
        int id = serverBrand.getId();
        String name = serverBrand.getName();
        String slug = serverBrand.getSlug();
        BrandColors U = U(serverBrand.getColor());
        BrandColors U2 = U(serverBrand.getTextColor());
        if (map == null) {
            map = lm5.a;
            map.getClass();
        }
        Map map2 = map;
        Boolean showBettingAge = serverBrand.getShowBettingAge();
        if (str == null) {
            str = serverBrand.getUrl();
        }
        return new Brand(id, name, slug, U, U2, map2, showBettingAge, str, null, NotificationCompat.FLAG_LOCAL_ONLY, null);
    }

    public static final BrandColors U(ServerBrandColors serverBrandColors) {
        return new BrandColors(serverBrandColors.getLight(), serverBrandColors.getDark(), null, 4, null);
    }

    public static final BrandingEvent V(ServerBrandingEvent serverBrandingEvent) {
        BrandingBoostedOdds brandingBoostedOdds;
        int id = serverBrandingEvent.getId();
        Brand W = W(1, serverBrandingEvent.getBrand(), serverBrandingEvent.getUrl());
        String url = serverBrandingEvent.getUrl();
        ServerBrandingBoostedOdds boostedOdds = serverBrandingEvent.getBoostedOdds();
        if (boostedOdds != null) {
            brandingBoostedOdds = new BrandingBoostedOdds(boostedOdds.getHome(), boostedOdds.getDraw(), boostedOdds.getAway(), boostedOdds.getHomeUrl(), boostedOdds.getDrawUrl(), boostedOdds.getAwayUrl(), null, 64, null);
        } else {
            brandingBoostedOdds = null;
        }
        return new BrandingEvent(id, W, url, brandingBoostedOdds, serverBrandingEvent.getBettorsOnly(), serverBrandingEvent.getOddsProviderId(), serverBrandingEvent.getOfferType(), null, 128, null);
    }

    public static /* synthetic */ Brand W(int i, ServerBrand serverBrand, String str) {
        if ((i & 2) != 0) {
            str = null;
        }
        return T(serverBrand, null, str);
    }

    public static AdError X(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError m = vha.m(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            m.toString();
            return m;
        }
        if (!TextUtils.isEmpty(str2)) {
            return null;
        }
        AdError m2 = vha.m(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
        m2.toString();
        return m2;
    }

    public static AdError Y(String str, String str2, String str3) {
        AdError X = X(str, str2);
        if (X != null) {
            return X;
        }
        if (!TextUtils.isEmpty(str3)) {
            return null;
        }
        AdError m = vha.m(103, "Missing or invalid Mintegral bidding signal in this ad request.");
        m.toString();
        return m;
    }

    public static final boolean Z(String str, Function0 function0) {
        try {
            return ((Boolean) function0.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
            return false;
        }
    }

    public static int a0(byte[] bArr, int i, d7n d7nVar) {
        int j0 = j0(bArr, i, d7nVar);
        int i2 = d7nVar.b;
        if (i2 < 0) {
            throw zzadi.h();
        }
        if (i2 > bArr.length - j0) {
            throw zzadi.j();
        }
        if (i2 == 0) {
            d7nVar.c = zzaby.b;
            return j0;
        }
        d7nVar.c = zzaby.u(j0, i2, bArr);
        return j0 + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, xtc xtcVar, float f2, of3 of3Var, int i, int i2) {
        float f3;
        av8 av8Var;
        float f4;
        xtc xtcVar2;
        eqf u;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1048004389);
        int i3 = (av8Var2.h(z) ? 4 : 2) | i;
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 432;
        } else if ((i & 384) == 0) {
            f3 = f2;
            i4 |= av8Var2.d(f3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var2.T(i4 & 1, (i4 & 147) == 146)) {
                av8Var = av8Var2;
                av8Var.W();
                f4 = f3;
                xtcVar2 = xtcVar;
            } else {
                if (i5 != 0) {
                    f3 = 44.0f;
                }
                utc utcVar = utc.a;
                xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                int hashCode = Long.hashCode(av8Var2.T);
                aee m = av8Var2.m();
                xtc C = fqj.C(av8Var2, f0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a2, hf3.g);
                waa.K(av8Var2, m, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                String v = oea.v(R.string.team, av8Var2);
                goa goaVar = new goa(1.0f, true);
                yf8 yf8Var = xth.a;
                udj.c(v, goaVar, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110584);
                av8 av8Var3 = av8Var2;
                if (z) {
                    av8Var3.d0(958211099);
                    udj.c(oea.v(R.string.any_sport_difference_short, av8Var3), bkh.p(utcVar, 56.0f), lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 48, 24960, 109560);
                    av8Var3 = av8Var3;
                    bf3.u(utcVar, 12.0f, av8Var3, false);
                } else {
                    av8Var3.d0(958649315);
                    av8Var3.s(false);
                }
                String upperCase = oea.v(R.string.points_short, av8Var3).toUpperCase(pie.a.P().c().a);
                upperCase.getClass();
                av8 av8Var4 = av8Var3;
                udj.c(upperCase, bkh.p(utcVar, f3), lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var4, 0, 24960, 109560);
                av8Var = av8Var4;
                av8Var.s(true);
                f4 = f3;
                xtcVar2 = utcVar;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new s2f(z, xtcVar2, f4, i, i2);
                return;
            }
            return;
        }
        f3 = f2;
        if (av8Var2.T(i4 & 1, (i4 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static BigDecimal b0(String str) {
        e0(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < Ua.s) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static final void c(int i, of3 of3Var, xtc xtcVar, String str) {
        String str2 = str;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-965378672);
        int i2 = i | (av8Var.g(str2) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc e0 = l98.e0(bkh.d(xtcVar, 1.0f), 8.0f, 16.0f, 16.0f, 16.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.hashtag, av8Var);
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            dfj m2 = xth.m();
            utc utcVar = utc.a;
            udj.c(v, bkh.p(utcVar, 24.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, m2, av8Var, 48, 0, 130040);
            udj.c(oea.v(R.string.team, av8Var), fn0.e(1.0f, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), true), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.m(), av8Var, 0, 0, 131064);
            str2 = str;
            udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.m(), av8Var, i2 & 14, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(str2, xtcVar, i, 5);
        }
    }

    public static int c0(int i, byte[] bArr) {
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(float f2, int i, int i2, long j, long j2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        int i3;
        long j3;
        long j4;
        xtc xtcVar3;
        long j5;
        float f3;
        eqf u;
        xtc xtcVar4;
        float f4;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1355629439);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            xtcVar2 = xtcVar;
        } else if ((i & 6) == 0) {
            xtcVar2 = xtcVar;
            i3 = (av8Var.g(xtcVar2) ? 4 : 2) | i;
        } else {
            xtcVar2 = xtcVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (av8Var.f(j3)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                j3 = j;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            j3 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            j4 = j2;
            i3 |= av8Var.f(j4) ? a.o : 1024;
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
                j5 = j3;
                f3 = f2;
            } else {
                av8Var.Y();
                if ((i & 1) == 0 || av8Var.B()) {
                    xtcVar4 = i5 != 0 ? utc.a : xtcVar2;
                    if ((i2 & 2) != 0) {
                        j3 = lz.D(R.color.n_lv_4, av8Var);
                        i3 &= -113;
                    }
                    float f5 = i6 != 0 ? 1.0f : f2;
                    if (i7 != 0) {
                        j5 = j3;
                        f4 = f5;
                        j4 = r13.i;
                    } else {
                        j5 = j3;
                        f4 = f5;
                    }
                } else {
                    av8Var.W();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    xtcVar4 = xtcVar2;
                    j5 = j3;
                    f4 = f2;
                }
                av8Var.t();
                td4.w(n9e.q(xtcVar4, j4, oyn.e), f4, j5, av8Var, ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0);
                xtcVar3 = xtcVar4;
                f3 = f4;
            }
            long j6 = j4;
            u = av8Var.u();
            if (u == null) {
                u.d = new f56(f3, i, i2, 1, j5, j6, xtcVar3);
                return;
            }
            return;
        }
        j4 = j2;
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        long j62 = j4;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static int d0(kcn kcnVar, byte[] bArr, int i, int i2, int i3, d7n d7nVar) {
        com.google.android.gms.internal.pal.c cVar = (com.google.android.gms.internal.pal.c) kcnVar;
        Object zze = cVar.zze();
        int x = cVar.x(zze, bArr, i, i2, i3, d7nVar);
        cVar.a(zze);
        d7nVar.c = zze;
        return x;
    }

    public static final void e(vnb vnbVar, Function1 function1, n52 n52Var, boolean z, xtc xtcVar, of3 of3Var, int i) {
        vnb vnbVar2;
        int i2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1346082017);
        if ((i & 6) == 0) {
            vnbVar2 = vnbVar;
            i2 = (av8Var2.g(vnbVar2) ? 4 : 2) | i;
        } else {
            vnbVar2 = vnbVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(n52Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.h(z) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 112) == 32;
            Object O = av8Var2.O();
            if (z2 || O == nf3.a) {
                O = new l77(23, function1);
                av8Var2.n0(O);
            }
            int i3 = (i2 & 14) | 100663296;
            int i4 = i2 >> 3;
            av8Var = av8Var2;
            ktm.s(vnbVar2, (Function0) O, z, xtcVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(1603733164, av8Var2, new hl6(6, (Object) n52Var, (Object) function1)), av8Var, i3 | (i4 & 896) | (i4 & 7168), 240);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(vnbVar, function1, n52Var, z, xtcVar, i, 7);
        }
    }

    public static void e0(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        throw new NumberFormatException(wt3.m("Number string too large: ", substring, new StringBuilder(substring.length() + 28), "..."));
    }

    public static final void f(fwa fwaVar, n52 n52Var, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        fwaVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1824682347);
        int i2 = i | (av8Var2.i(fwaVar) ? 4 : 2) | (av8Var2.g(n52Var) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            e1d x = rfo.x(fwaVar.f, av8Var2, 0);
            e1d x2 = rfo.x(fwaVar.j, av8Var2, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean i3 = av8Var2.i(fwaVar);
            Object O = av8Var2.O();
            if (i3 || O == nf3.a) {
                s26 s26Var = new s26(1, fwaVar, fwa.class, "onAction", "onAction(Lcom/sofascore/results/league/fragment/draft/LeagueDraftAction;)V", 0, 27);
                av8Var2.n0(s26Var);
                O = s26Var;
            }
            av8Var = av8Var2;
            e(vnbVar, (Function1) ((KFunction) O), n52Var, ((Boolean) x2.getValue()).booleanValue(), xtcVar, av8Var, ((i2 << 3) & 896) | (57344 & (i2 << 6)));
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(fwaVar, n52Var, xtcVar, i, 25);
        }
    }

    public static int f0(kcn kcnVar, byte[] bArr, int i, int i2, d7n d7nVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = k0(i4, bArr, i3, d7nVar);
            i4 = d7nVar.b;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzadi.j();
        }
        Object zze = kcnVar.zze();
        int i6 = i5 + i4;
        kcnVar.c(zze, bArr, i5, i6, d7nVar);
        kcnVar.a(zze);
        d7nVar.c = zze;
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(u2f u2fVar, boolean z, xtc xtcVar, float f2, dfj dfjVar, float f3, of3 of3Var, int i, int i2) {
        float f4;
        dfj dfjVar2;
        int i3;
        int i4;
        int i5;
        float f5;
        float f6;
        dfj dfjVar3;
        float f7;
        eqf u;
        float f8;
        int i6;
        dfj dfjVar4;
        boolean z2;
        u2fVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-627619166);
        int i7 = (av8Var.g(u2fVar) ? 4 : 2) | i | (av8Var.h(z) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i8 = i2 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i & 3072) == 0) {
            f4 = f2;
            i7 |= av8Var.d(f4) ? a.o : 1024;
            if ((i2 & 16) != 0) {
                dfjVar2 = dfjVar;
                if (av8Var.g(dfjVar2)) {
                    i3 = 16384;
                    i4 = i7 | i3;
                    i5 = i2 & 32;
                    if (i5 != 0) {
                        i4 |= 196608;
                    } else if ((196608 & i) == 0) {
                        f5 = f3;
                        i4 |= av8Var.d(f5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
                            av8Var.W();
                            f6 = f4;
                            dfjVar3 = dfjVar2;
                            f7 = f5;
                        } else {
                            av8Var.Y();
                            if ((i & 1) == 0 || av8Var.B()) {
                                if (i8 != 0) {
                                    f4 = 24.0f;
                                }
                                if ((i2 & 16) != 0) {
                                    yf8 yf8Var = xth.a;
                                    i4 &= -57345;
                                    dfjVar2 = xth.b();
                                }
                                if (i5 != 0) {
                                    f8 = 44.0f;
                                    i6 = i4;
                                    dfjVar4 = dfjVar2;
                                    av8Var.t();
                                    xtc d2 = bkh.d(xtcVar, 1.0f);
                                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                                    int hashCode = Long.hashCode(av8Var.T);
                                    aee m = av8Var.m();
                                    xtc C = fqj.C(av8Var, d2);
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
                                    waa.K(av8Var, m, ff3Var);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    f50 f50Var2 = hf3.j;
                                    waa.K(av8Var, valueOf, f50Var2);
                                    ry ryVar = hf3.k;
                                    waa.J(av8Var, ryVar);
                                    f50 f50Var3 = hf3.d;
                                    waa.K(av8Var, C, f50Var3);
                                    String valueOf2 = String.valueOf(u2fVar.c);
                                    utc utcVar = utc.a;
                                    xtc q = bkh.q(utcVar, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                    yf8 yf8Var2 = xth.a;
                                    dfj dfjVar5 = dfjVar4;
                                    float f9 = f4;
                                    udj.c(valueOf2, q, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 130040);
                                    nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                                    td4.G(u2fVar.a, bkh.l(utcVar, 24.0f), false, 0L, av8Var, 48, 12);
                                    nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                                    udj.c(u2fVar.b, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110584);
                                    if (z) {
                                        z2 = false;
                                        av8Var.d0(234583164);
                                        av8Var.s(false);
                                    } else {
                                        av8Var.d0(234373666);
                                        j(u2fVar.f, bkh.p(utcVar, 56.0f), av8Var, 48);
                                        z2 = false;
                                        bf3.u(utcVar, 12.0f, av8Var, false);
                                    }
                                    xtc p = bkh.p(utcVar, f8);
                                    k1c c2 = e12.c(uxf.g, z2);
                                    int hashCode2 = Long.hashCode(av8Var.T);
                                    aee m2 = av8Var.m();
                                    xtc C2 = fqj.C(av8Var, p);
                                    av8Var.h0();
                                    if (av8Var.S) {
                                        av8Var.q0();
                                    } else {
                                        av8Var.l(zg3Var);
                                    }
                                    waa.K(av8Var, c2, f50Var);
                                    waa.K(av8Var, m2, ff3Var);
                                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                                    waa.K(av8Var, C2, f50Var3);
                                    udj.c(String.valueOf(u2fVar.d), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, dfjVar5, av8Var, 0, ((i6 << 9) & 29360128) | 24576, 114682);
                                    av8Var = av8Var;
                                    av8Var.s(true);
                                    av8Var.s(true);
                                    f7 = f8;
                                    dfjVar3 = dfjVar5;
                                    f6 = f9;
                                }
                            } else {
                                av8Var.W();
                                if ((i2 & 16) != 0) {
                                    i4 &= -57345;
                                }
                            }
                            i6 = i4;
                            dfjVar4 = dfjVar2;
                            f8 = f5;
                            av8Var.t();
                            xtc d22 = bkh.d(xtcVar, 1.0f);
                            l8g a22 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                            int hashCode3 = Long.hashCode(av8Var.T);
                            aee m3 = av8Var.m();
                            xtc C3 = fqj.C(av8Var, d22);
                            if3.k7.getClass();
                            zg3 zg3Var2 = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                            }
                            f50 f50Var4 = hf3.g;
                            waa.K(av8Var, a22, f50Var4);
                            ff3 ff3Var2 = hf3.f;
                            waa.K(av8Var, m3, ff3Var2);
                            Integer valueOf3 = Integer.valueOf(hashCode3);
                            f50 f50Var22 = hf3.j;
                            waa.K(av8Var, valueOf3, f50Var22);
                            ry ryVar2 = hf3.k;
                            waa.J(av8Var, ryVar2);
                            f50 f50Var32 = hf3.d;
                            waa.K(av8Var, C3, f50Var32);
                            String valueOf22 = String.valueOf(u2fVar.c);
                            utc utcVar2 = utc.a;
                            xtc q2 = bkh.q(utcVar2, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                            yf8 yf8Var22 = xth.a;
                            dfj dfjVar52 = dfjVar4;
                            float f92 = f4;
                            udj.c(valueOf22, q2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 130040);
                            nq8.h(av8Var, bkh.p(utcVar2, 8.0f));
                            td4.G(u2fVar.a, bkh.l(utcVar2, 24.0f), false, 0L, av8Var, 48, 12);
                            nq8.h(av8Var, bkh.p(utcVar2, 8.0f));
                            udj.c(u2fVar.b, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110584);
                            if (z) {
                            }
                            xtc p2 = bkh.p(utcVar2, f8);
                            k1c c22 = e12.c(uxf.g, z2);
                            int hashCode22 = Long.hashCode(av8Var.T);
                            aee m22 = av8Var.m();
                            xtc C22 = fqj.C(av8Var, p2);
                            av8Var.h0();
                            if (av8Var.S) {
                            }
                            waa.K(av8Var, c22, f50Var4);
                            waa.K(av8Var, m22, ff3Var2);
                            bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                            waa.K(av8Var, C22, f50Var32);
                            udj.c(String.valueOf(u2fVar.d), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, dfjVar52, av8Var, 0, ((i6 << 9) & 29360128) | 24576, 114682);
                            av8Var = av8Var;
                            av8Var.s(true);
                            av8Var.s(true);
                            f7 = f8;
                            dfjVar3 = dfjVar52;
                            f6 = f92;
                        }
                        u = av8Var.u();
                        if (u == null) {
                            u.d = new t2f(u2fVar, z, xtcVar, f6, dfjVar3, f7, i, i2);
                            return;
                        }
                        return;
                    }
                    f5 = f3;
                    if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
            } else {
                dfjVar2 = dfjVar;
            }
            i3 = 8192;
            i4 = i7 | i3;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f5 = f3;
            if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        f4 = f2;
        if ((i2 & 16) != 0) {
        }
        i3 = 8192;
        i4 = i7 | i3;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f5 = f3;
        if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static int g0(kcn kcnVar, int i, byte[] bArr, int i2, int i3, zzadf zzadfVar, d7n d7nVar) {
        int f0 = f0(kcnVar, bArr, i2, i3, d7nVar);
        zzadfVar.add(d7nVar.c);
        while (f0 < i3) {
            int j0 = j0(bArr, f0, d7nVar);
            if (i != d7nVar.b) {
                break;
            }
            f0 = f0(kcnVar, bArr, j0, i3, d7nVar);
            zzadfVar.add(d7nVar.c);
        }
        return f0;
    }

    public static final void h(xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        tc3 tc3Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.e(null, f7a.k);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new tra(13, e1dVar);
                av8Var.n0(O2);
            }
            Function0 function0 = (Function0) O2;
            g2f g2fVar = ft4.a;
            ko1 D = hz8.D(s02.c, av8Var, 6);
            xtcVar2 = xtcVar;
            tc3Var2 = tc3Var;
            tol.c(new gb0[]{p8j.b.a(k53.w0(function0, av8Var, 2)), p8j.a.a(D)}, yqo.H(1070596993, av8Var, new ere(xtcVar2, e1dVar, tc3Var2, D, function0, 22)), av8Var, 56);
        } else {
            xtcVar2 = xtcVar;
            tc3Var2 = tc3Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u30(xtcVar2, tc3Var2, i, i3);
        }
    }

    public static int h0(byte[] bArr, int i, d7n d7nVar) {
        int j0 = j0(bArr, i, d7nVar);
        int i2 = d7nVar.b;
        if (i2 < 0) {
            throw zzadi.h();
        }
        if (i2 == 0) {
            d7nVar.c = "";
            return j0;
        }
        d7nVar.c = new String(bArr, j0, i2, zzadg.a);
        return j0 + i2;
    }

    public static final void i(xtc xtcVar, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(155925518);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        int i3 = 3;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            boolean z = av8Var.k(p8j.a) != null;
            boolean z2 = av8Var.k(p8j.b) != null;
            if (z && z2) {
                av8Var.d0(-1977187922);
                k1c c2 = e12.c(uxf.c, true);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
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
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                tc3Var.invoke(av8Var, Integer.valueOf((i2 >> 3) & 14));
                av8Var.s(true);
                av8Var.s(false);
            } else if (z) {
                av8Var.d0(-1976997706);
                k53.Q(xtcVar, tc3Var, av8Var, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            } else if (z2) {
                av8Var.d0(-1976846922);
                ft4.d(xtcVar, tc3Var, av8Var, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            } else {
                av8Var.d0(-1976716505);
                h(xtcVar, tc3Var, av8Var, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u30(xtcVar, tc3Var, i, i3);
        }
    }

    public static int i0(int i, byte[] bArr, int i2, int i3, zzafj zzafjVar, d7n d7nVar) {
        if ((i >>> 3) == 0) {
            throw new zzadi("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int m0 = m0(bArr, i2, d7nVar);
            zzafjVar.c(i, Long.valueOf(d7nVar.a));
            return m0;
        }
        if (i4 == 1) {
            zzafjVar.c(i, Long.valueOf(n0(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int j0 = j0(bArr, i2, d7nVar);
            int i5 = d7nVar.b;
            if (i5 < 0) {
                throw zzadi.h();
            }
            if (i5 > bArr.length - j0) {
                throw zzadi.j();
            }
            if (i5 == 0) {
                zzafjVar.c(i, zzaby.b);
            } else {
                zzafjVar.c(i, zzaby.u(j0, i5, bArr));
            }
            return j0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzadi("Protocol message contained an invalid tag (zero).");
            }
            zzafjVar.c(i, Integer.valueOf(c0(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzafj b2 = zzafj.b();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int j02 = j0(bArr, i2, d7nVar);
            i7 = d7nVar.b;
            if (i7 == i6) {
                i2 = j02;
                break;
            }
            i2 = i0(i7, bArr, j02, i3, b2, d7nVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzadi.i();
        }
        zzafjVar.c(i, b2);
        return i2;
    }

    public static final void j(Integer num, xtc xtcVar, of3 of3Var, int i) {
        boolean z;
        int i2;
        int i3;
        mv1 mv1Var = uxf.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(325533675);
        int i4 = i | (av8Var.g(num) ? 4 : 2);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            k1c c2 = e12.c(uxf.h, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            if (num == null) {
                av8Var.d0(-802508075);
                av8Var.s(false);
                z = true;
            } else {
                int intValue = num.intValue();
                utc utcVar = utc.a;
                if (intValue != 0) {
                    av8Var.d0(892125187);
                    if (num.intValue() > 0) {
                        i2 = -802505411;
                        i3 = R.color.success;
                    } else {
                        i2 = -802504837;
                        i3 = R.color.error;
                    }
                    long f2 = ljg.f(av8Var, i2, i3, av8Var, false);
                    float f3 = num.intValue() > 0 ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, utcVar);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    String valueOf2 = String.valueOf(Math.abs(num.intValue()));
                    yf8 yf8Var = xth.a;
                    float f4 = f3;
                    udj.c(valueOf2, null, f2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131066);
                    av8Var = av8Var;
                    xtc q = n9e.q(ljg.i(utcVar, 8.0f, av8Var, utcVar, 16.0f), f2, o7g.a);
                    k1c c3 = e12.c(mv1Var, false);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, q);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c3, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var3);
                    kq9.b(s6a.N(R.drawable.ic_chevron_down_large_16, 6, av8Var), null, haa.v(bkh.l(utcVar, 10.0f), f4), lz.D(R.color.surface_1, av8Var), av8Var, 48, 0);
                    z = true;
                    ljg.t(av8Var, true, true, false);
                } else {
                    z = true;
                    av8Var.d0(893310007);
                    xtc l = bkh.l(utcVar, 16.0f);
                    k1c c4 = e12.c(mv1Var, false);
                    int hashCode4 = Long.hashCode(av8Var.T);
                    aee m4 = av8Var.m();
                    xtc C4 = fqj.C(av8Var, l);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c4, f50Var);
                    waa.K(av8Var, m4, ff3Var);
                    bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C4, f50Var3);
                    e12.a(0, av8Var, n9e.q(bkh.l(utcVar, 8.0f), lz.D(R.color.n_lv_4, av8Var), o7g.a));
                    av8Var.s(true);
                    av8Var.s(false);
                }
            }
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(num, xtcVar, i, 10);
        }
    }

    public static int j0(byte[] bArr, int i, d7n d7nVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return k0(b2, bArr, i2, d7nVar);
        }
        d7nVar.b = b2;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(boolean z, Function0 function0, xtc xtcVar, qug qugVar, dfh dfhVar, String str, w8l w8lVar, ct8 ct8Var, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        dfh dfhVar2;
        int i4;
        String str2;
        w8l w8lVar2;
        int i5;
        ct8 ct8Var2;
        int i6;
        av8 av8Var;
        xtc xtcVar3;
        dfh dfhVar3;
        String str3;
        w8l w8lVar3;
        ct8 ct8Var3;
        eqf u;
        int i7;
        w8l w8lVar4;
        xtc xtcVar4;
        dfh dfhVar4;
        w8l w8lVar5;
        String str4;
        ct8 ct8Var4;
        int i8;
        int i9;
        function0.getClass();
        qugVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1773820459);
        if ((i & 6) == 0) {
            i3 = (av8Var2.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.i(function0) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i & 3072) == 0) {
                i3 |= av8Var2.g(qugVar) ? a.o : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    dfhVar2 = dfhVar;
                    if (av8Var2.g(dfhVar2)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                } else {
                    dfhVar2 = dfhVar;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                dfhVar2 = dfhVar;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                str2 = str;
                i3 |= av8Var2.g(str2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        w8lVar2 = w8lVar;
                        if (av8Var2.g(w8lVar2)) {
                            i8 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            i3 |= i8;
                        }
                    } else {
                        w8lVar2 = w8lVar;
                    }
                    i8 = 524288;
                    i3 |= i8;
                } else {
                    w8lVar2 = w8lVar;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    ct8Var2 = ct8Var;
                    i3 |= av8Var2.i(ct8Var2) ? 8388608 : 4194304;
                    if ((i & 100663296) == 0) {
                        i3 |= av8Var2.i(tc3Var) ? 67108864 : 33554432;
                    }
                    i6 = i3;
                    if (av8Var2.T(i6 & 1, (i6 & 38347923) == 38347922)) {
                        av8Var = av8Var2;
                        av8Var.W();
                        xtcVar3 = xtcVar2;
                        dfhVar3 = dfhVar2;
                        str3 = str2;
                        w8lVar3 = w8lVar2;
                        ct8Var3 = ct8Var2;
                    } else {
                        av8Var2.Y();
                        if ((i & 1) == 0 || av8Var2.B()) {
                            if (i10 != 0) {
                                xtcVar2 = utc.a;
                            }
                            if ((i2 & 16) != 0) {
                                dfhVar2 = ctc.g(null, av8Var2, 6, 2);
                                i7 = i6 & (-57345);
                            } else {
                                i7 = i6;
                            }
                            if (i4 != 0) {
                                str2 = null;
                            }
                            if ((i2 & 64) != 0) {
                                d02 d02Var = d02.a;
                                w8lVar4 = d02.b(av8Var2);
                                i7 &= -3670017;
                            } else {
                                w8lVar4 = w8lVar2;
                            }
                            if (i5 != 0) {
                                ct8Var4 = null;
                                xtcVar4 = xtcVar2;
                                dfhVar4 = dfhVar2;
                                w8lVar5 = w8lVar4;
                                str4 = str2;
                                av8Var2.t();
                                av8Var = av8Var2;
                                l(z, function0, xtcVar4, ((Boolean) z1a.P(qugVar, av8Var2).getValue()).booleanValue(), dfhVar4, str4, w8lVar5, ct8Var4, tc3Var, av8Var, i7 & 268428286, 0);
                                xtcVar3 = xtcVar4;
                                dfhVar3 = dfhVar4;
                                str3 = str4;
                                w8lVar3 = w8lVar5;
                                ct8Var3 = ct8Var4;
                            } else {
                                xtcVar4 = xtcVar2;
                                dfhVar4 = dfhVar2;
                                w8lVar5 = w8lVar4;
                                str4 = str2;
                            }
                        } else {
                            av8Var2.W();
                            i7 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                            if ((i2 & 64) != 0) {
                                i7 &= -3670017;
                            }
                            xtcVar4 = xtcVar2;
                            dfhVar4 = dfhVar2;
                            str4 = str2;
                            w8lVar5 = w8lVar2;
                        }
                        ct8Var4 = ct8Var2;
                        av8Var2.t();
                        av8Var = av8Var2;
                        l(z, function0, xtcVar4, ((Boolean) z1a.P(qugVar, av8Var2).getValue()).booleanValue(), dfhVar4, str4, w8lVar5, ct8Var4, tc3Var, av8Var, i7 & 268428286, 0);
                        xtcVar3 = xtcVar4;
                        dfhVar3 = dfhVar4;
                        str3 = str4;
                        w8lVar3 = w8lVar5;
                        ct8Var3 = ct8Var4;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new pm1(z, function0, xtcVar3, qugVar, dfhVar3, str3, w8lVar3, ct8Var3, tc3Var, i, i2);
                        return;
                    }
                    return;
                }
                ct8Var2 = ct8Var;
                if ((i & 100663296) == 0) {
                }
                i6 = i3;
                if (av8Var2.T(i6 & 1, (i6 & 38347923) == 38347922)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            ct8Var2 = ct8Var;
            if ((i & 100663296) == 0) {
            }
            i6 = i3;
            if (av8Var2.T(i6 & 1, (i6 & 38347923) == 38347922)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        ct8Var2 = ct8Var;
        if ((i & 100663296) == 0) {
        }
        i6 = i3;
        if (av8Var2.T(i6 & 1, (i6 & 38347923) == 38347922)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static int k0(int i, byte[] bArr, int i2, d7n d7nVar) {
        int i3 = i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            d7nVar.b = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            d7nVar.b = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            d7nVar.b = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            d7nVar.b = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                d7nVar.b = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(boolean z, Function0 function0, xtc xtcVar, boolean z2, dfh dfhVar, String str, w8l w8lVar, ct8 ct8Var, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        boolean z3;
        dfh dfhVar2;
        int i5;
        String str2;
        int i6;
        w8l w8lVar2;
        xtc xtcVar3;
        boolean z4;
        dfh dfhVar3;
        String str3;
        ct8 ct8Var2;
        eqf u;
        w8l w8lVar3;
        w8l w8lVar4;
        int i7;
        String str4;
        ct8 ct8Var3;
        Object O;
        a99 a99Var;
        e1d e1dVar;
        Object O2;
        Object O3;
        boolean z5;
        Object O4;
        int i8;
        int i9;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(591418737);
        if ((i & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= av8Var.h(z3) ? a.o : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        dfhVar2 = dfhVar;
                        if (av8Var.g(dfhVar2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        dfhVar2 = dfhVar;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    dfhVar2 = dfhVar;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    str2 = str;
                    i3 |= av8Var.g(str2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0 && av8Var.g(w8lVar)) {
                            i8 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            i3 |= i8;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= av8Var.i(ct8Var) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= av8Var.i(tc3Var) ? 67108864 : 33554432;
                    }
                    if (av8Var.T(i3 & 1, (i3 & 38347923) == 38347922)) {
                        av8Var.W();
                        w8lVar2 = w8lVar;
                        xtcVar3 = xtcVar2;
                        z4 = z3;
                        dfhVar3 = dfhVar2;
                        str3 = str2;
                        ct8Var2 = ct8Var;
                    } else {
                        av8Var.Y();
                        if ((i & 1) == 0 || av8Var.B()) {
                            if (i10 != 0) {
                                xtcVar2 = utc.a;
                            }
                            if (i4 != 0) {
                                z3 = false;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                dfhVar2 = ctc.g(null, av8Var, 6, 2);
                            }
                            if (i5 != 0) {
                                str2 = null;
                            }
                            if ((i2 & 64) != 0) {
                                d02 d02Var = d02.a;
                                w8lVar3 = d02.b(av8Var);
                                i3 &= -3670017;
                            } else {
                                w8lVar3 = w8lVar;
                            }
                            if (i6 != 0) {
                                w8lVar4 = w8lVar3;
                                i7 = i3;
                                str4 = str2;
                                ct8Var3 = null;
                                dfh dfhVar4 = dfhVar2;
                                av8Var.t();
                                O = av8Var.O();
                                a99Var = nf3.a;
                                if (O == a99Var) {
                                    O = e.f(Boolean.FALSE);
                                    av8Var.n0(O);
                                }
                                e1dVar = (e1d) O;
                                O2 = av8Var.O();
                                if (O2 == a99Var) {
                                    O2 = hz8.G(g.a, av8Var);
                                    av8Var.n0(O2);
                                }
                                ku3 ku3Var = (ku3) O2;
                                O3 = av8Var.O();
                                if (O3 == a99Var) {
                                    O3 = new m61((Object) ku3Var, (Object) dfhVar4, (Object) function0, e1dVar, 21);
                                    av8Var.n0(O3);
                                }
                                Function0 function02 = (Function0) O3;
                                Boolean valueOf = Boolean.valueOf(z);
                                z5 = (i7 & 14) == 4;
                                O4 = av8Var.O();
                                if (!z5 || O4 == a99Var) {
                                    O4 = new l84(z, function02, e1dVar, (rq3) null, 8);
                                    av8Var.n0(O4);
                                }
                                hz8.o(av8Var, valueOf, (Function2) O4);
                                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                                    av8Var.d0(1002010513);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(1000777364);
                                    ctc.a(function0, ml4.q0(xtcVar2), dfhVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), lz.D(R.color.surface_P, av8Var), 0L, 0L, yqo.H(2115071531, av8Var, new t60(z3, str4, ct8Var3)), new fvg(w8lVar4, 13), null, tc3Var, av8Var, ((i7 >> 3) & 14) | ((i7 >> 6) & 896), ((i7 >> 15) & 7168) | 6, 5016);
                                    av8Var.s(false);
                                }
                                boolean z6 = z3;
                                ct8Var2 = ct8Var3;
                                z4 = z6;
                                w8lVar2 = w8lVar4;
                                xtcVar3 = xtcVar2;
                                dfhVar3 = dfhVar4;
                                str3 = str4;
                            } else {
                                w8lVar4 = w8lVar3;
                            }
                        } else {
                            av8Var.W();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            w8lVar4 = w8lVar;
                        }
                        i7 = i3;
                        str4 = str2;
                        ct8Var3 = ct8Var;
                        dfh dfhVar42 = dfhVar2;
                        av8Var.t();
                        O = av8Var.O();
                        a99Var = nf3.a;
                        if (O == a99Var) {
                        }
                        e1dVar = (e1d) O;
                        O2 = av8Var.O();
                        if (O2 == a99Var) {
                        }
                        ku3 ku3Var2 = (ku3) O2;
                        O3 = av8Var.O();
                        if (O3 == a99Var) {
                        }
                        Function0 function022 = (Function0) O3;
                        Boolean valueOf2 = Boolean.valueOf(z);
                        if ((i7 & 14) == 4) {
                        }
                        O4 = av8Var.O();
                        if (!z5) {
                        }
                        O4 = new l84(z, function022, e1dVar, (rq3) null, 8);
                        av8Var.n0(O4);
                        hz8.o(av8Var, valueOf2, (Function2) O4);
                        if (((Boolean) e1dVar.getValue()).booleanValue()) {
                        }
                        boolean z62 = z3;
                        ct8Var2 = ct8Var3;
                        z4 = z62;
                        w8lVar2 = w8lVar4;
                        xtcVar3 = xtcVar2;
                        dfhVar3 = dfhVar42;
                        str3 = str4;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new a05(z, function0, xtcVar3, z4, dfhVar3, str3, w8lVar2, ct8Var2, tc3Var, i, i2);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((1572864 & i) == 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if (av8Var.T(i3 & 1, (i3 & 38347923) == 38347922)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (av8Var.T(i3 & 1, (i3 & 38347923) == 38347922)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 38347923) == 38347922)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static int l0(int i, byte[] bArr, int i2, int i3, zzadf zzadfVar, d7n d7nVar) {
        v9n v9nVar = (v9n) zzadfVar;
        int j0 = j0(bArr, i2, d7nVar);
        v9nVar.d(d7nVar.b);
        while (j0 < i3) {
            int j02 = j0(bArr, j0, d7nVar);
            if (i != d7nVar.b) {
                break;
            }
            j0 = j0(bArr, j02, d7nVar);
            v9nVar.d(d7nVar.b);
        }
        return j0;
    }

    public static final void m(int i, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(390821256);
        int i2 = (av8Var2.g(str) ? 4 : 2) | i | 48;
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            yf8 yf8Var = xth.a;
            dfj i3 = xth.i();
            long D = lz.D(R.color.n_lv_1, av8Var2);
            utc utcVar = utc.a;
            av8Var = av8Var2;
            udj.c(str, l98.f0(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, i3, av8Var, i2 & 14, 24960, 110584);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(str, xtcVar2, i, 7);
        }
    }

    public static int m0(byte[] bArr, int i, d7n d7nVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            d7nVar.a = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        d7nVar.a = j2;
        return i3;
    }

    public static final void n(String str, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        str.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1150033042);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            l8g a2 = k8g.a(ng0Var, uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var, i2 & 14, 24960, 110584);
            ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var);
            long D = lz.D(R.color.primary_default, av8Var);
            xtc y = tol.y(bkh.l(utcVar, 24.0f), false, false, false, 0L, null, function0, av8Var, 29);
            av8Var = av8Var;
            kq9.b(N, null, y, D, av8Var, 48, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new k05(str, function0, xtcVar2, i, 1);
        }
    }

    public static long n0(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static smi o() {
        return new smi(null);
    }

    public static final void p(int i, of3 of3Var, xtc xtcVar, Function0 function0, Function0 function02) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1313946316);
        int i2 = i | (av8Var.i(function0) ? 4 : 2) | (av8Var.i(function02) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            qug o0 = hkg.o0(av8Var);
            utc utcVar = utc.a;
            xtc e0 = l98.e0(hkg.u0(utcVar, o0, false, 14), 16.0f, 8.0f, 16.0f, 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.how_team_ratings_are_calculated_body, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            yfa.e(bf3.g(16.0f, R.string.rating_learn_more_button, av8Var, av8Var, utcVar), function0, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), dph.a, bph.a, s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), false, false, 0L, av8Var, ((i2 << 3) & 112) | 28032, 928);
            av8Var = av8Var;
            mha.h(bf3.g(16.0f, R.string.button_text_got_it, av8Var, av8Var, utcVar), function02, bkh.d(utcVar, 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var, (i2 & 112) | 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x51(function0, function02, xtcVar2, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(aoj aojVar, xtc xtcVar, Integer num, Function2 function2, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        Integer num2;
        int i5;
        Function2 function22;
        xtc xtcVar3;
        Integer num3;
        Function2 function23;
        eqf u;
        Function2 function24;
        f50 f50Var;
        umj umjVar;
        ry ryVar;
        lv1 lv1Var;
        utc utcVar;
        f50 f50Var2;
        Function2 function25;
        ff3 ff3Var;
        f50 f50Var3;
        float f2;
        boolean z;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1055452175);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(aojVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                num2 = num;
                i3 |= av8Var.g(num2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function22 = function2;
                    i3 |= av8Var.i(function22) ? a.o : 1024;
                    if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                        av8Var.W();
                        xtcVar3 = xtcVar2;
                        num3 = num2;
                        function23 = function22;
                    } else {
                        utc utcVar2 = utc.a;
                        xtc xtcVar4 = i6 != 0 ? utcVar2 : xtcVar2;
                        Unit unit = null;
                        Integer num4 = i4 != 0 ? null : num2;
                        a99 a99Var = nf3.a;
                        if (i5 != 0) {
                            Object O = av8Var.O();
                            if (O == a99Var) {
                                O = new t6j(17);
                                av8Var.n0(O);
                            }
                            function24 = (Function2) O;
                        } else {
                            function24 = function22;
                        }
                        Context context = (Context) av8Var.k(nz.b);
                        znj znjVar = aojVar.a;
                        umj umjVar2 = aojVar.b;
                        boolean g2 = av8Var.g(znjVar.d);
                        Object O2 = av8Var.O();
                        if (g2 || O2 == a99Var) {
                            ArrayList arrayList = dv3.a;
                            Country a2 = dv3.a(znjVar.d);
                            O2 = a2 != null ? a2.getName() : null;
                            av8Var.n0(O2);
                        }
                        String str = (String) O2;
                        long D = lz.D(R.color.n_lv_4, av8Var);
                        Object O3 = av8Var.O();
                        if (O3 == a99Var) {
                            O3 = mz1.e(av8Var);
                        }
                        wzc wzcVar = (wzc) O3;
                        Object[] objArr = new Object[0];
                        Object O4 = av8Var.O();
                        if (O4 == a99Var) {
                            O4 = nuh.y;
                            av8Var.n0(O4);
                        }
                        xtc y = tol.y(xtcVar4, true, true, true, D, wzcVar, new e32((boh) o3a.N(objArr, (Function0) O4, av8Var, 48), function24, context, aojVar, 7), av8Var, 0);
                        xtc xtcVar5 = xtcVar4;
                        av8 av8Var2 = av8Var;
                        xtc e0 = l98.e0(bkh.d(y, 1.0f), 8.0f, 8.0f, 16.0f, 8.0f);
                        lv1 lv1Var2 = uxf.m;
                        l8g a3 = k8g.a(ww9.b, lv1Var2, av8Var2, 48);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m = av8Var2.m();
                        xtc C = fqj.C(av8Var2, e0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        f50 f50Var4 = hf3.g;
                        waa.K(av8Var2, a3, f50Var4);
                        ff3 ff3Var2 = hf3.f;
                        waa.K(av8Var2, m, ff3Var2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        f50 f50Var5 = hf3.j;
                        waa.K(av8Var2, valueOf, f50Var5);
                        ry ryVar2 = hf3.k;
                        waa.J(av8Var2, ryVar2);
                        f50 f50Var6 = hf3.d;
                        waa.K(av8Var2, C, f50Var6);
                        if (num4 == null) {
                            av8Var2.d0(-313800574);
                            av8Var2.s(false);
                            f50Var2 = f50Var6;
                            function25 = function24;
                            umjVar = umjVar2;
                            f50Var3 = f50Var4;
                            f2 = 16.0f;
                            lv1Var = lv1Var2;
                            ff3Var = ff3Var2;
                            ryVar = ryVar2;
                            f50Var = f50Var5;
                            z = false;
                            utcVar = utcVar2;
                        } else {
                            av8Var2.d0(-313800573);
                            String valueOf2 = String.valueOf(num4.intValue() + 1);
                            yf8 yf8Var = xth.a;
                            f50Var = f50Var5;
                            umjVar = umjVar2;
                            ryVar = ryVar2;
                            lv1Var = lv1Var2;
                            utcVar = utcVar2;
                            f50Var2 = f50Var6;
                            function25 = function24;
                            ff3Var = ff3Var2;
                            f50Var3 = f50Var4;
                            f2 = 16.0f;
                            udj.c(valueOf2, bkh.p(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 16.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 48, 0, 130040);
                            av8Var2 = av8Var2;
                            Unit unit2 = Unit.a;
                            z = false;
                            av8Var2.s(false);
                            unit = Unit.a;
                        }
                        if (unit == null) {
                            ljg.r(8.0f, -313467788, av8Var2, av8Var2, utcVar);
                            Unit unit3 = Unit.a;
                            av8Var2.s(z);
                        } else {
                            av8Var2.d0(-1949785519);
                            av8Var2.s(z);
                        }
                        av8 av8Var3 = av8Var2;
                        td4.G(znjVar.a, bkh.l(utcVar, 40.0f), false, 0L, av8Var3, 48, 12);
                        xtc d0 = l98.d0(new goa(1.0f, true), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        int i7 = 6;
                        u23 a4 = t23.a(new ng0(4.0f, true, new a70(i7)), uxf.o, av8Var3, 6);
                        int hashCode2 = Long.hashCode(av8Var3.T);
                        aee m2 = av8Var3.m();
                        xtc C2 = fqj.C(av8Var3, d0);
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a4, f50Var3);
                        waa.K(av8Var3, m2, ff3Var);
                        f50 f50Var7 = f50Var;
                        bf3.s(hashCode2, av8Var3, f50Var7, av8Var3, ryVar);
                        f50 f50Var8 = f50Var2;
                        waa.K(av8Var3, C2, f50Var8);
                        String str2 = znjVar.b;
                        xtc O5 = kda.O(utcVar, "primary_label", av8Var3);
                        yf8 yf8Var2 = xth.a;
                        udj.c(str2, O5, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var3, 0, 0, 131064);
                        av8Var = av8Var3;
                        boolean z3 = true;
                        if (znjVar.e.intValue() != 1 || str == null) {
                            av8Var.d0(-2013583347);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-2014210353);
                            l8g a5 = k8g.a(new ng0(4.0f, true, new a70(i7)), lv1Var, av8Var, 54);
                            int hashCode3 = Long.hashCode(av8Var.T);
                            aee m3 = av8Var.m();
                            xtc C3 = fqj.C(av8Var, utcVar);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, a5, f50Var3);
                            waa.K(av8Var, m3, ff3Var);
                            bf3.s(hashCode3, av8Var, f50Var7, av8Var, ryVar);
                            waa.K(av8Var, C3, f50Var8);
                            td4.k(znjVar.d, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, 48, 12);
                            udj.c(str, kda.O(utcVar, "secondary_label", av8Var), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
                            av8Var = av8Var;
                            z3 = true;
                            av8Var.s(true);
                            av8Var.s(false);
                        }
                        av8Var.s(z3);
                        umj umjVar3 = umjVar;
                        if (Intrinsics.c(umjVar3.a, oea.v(R.string.average_sofascore_rating, av8Var))) {
                            av8Var.d0(-311911061);
                            Double f3 = kotlin.text.b.f(umjVar3.b);
                            if (f3 == null) {
                                av8Var.d0(-311911062);
                                z2 = false;
                                av8Var.s(false);
                            } else {
                                av8Var.d0(-311911061);
                                av8 av8Var4 = av8Var;
                                i9a.i(Double.valueOf(f3.doubleValue()), false, kda.O(utcVar, "rating_text", av8Var), null, null, null, false, av8Var4, 432, 496);
                                av8Var = av8Var4;
                                Unit unit4 = Unit.a;
                                z2 = false;
                                av8Var.s(false);
                            }
                            av8Var.s(z2);
                        } else {
                            av8Var.d0(-311614329);
                            av8 av8Var5 = av8Var;
                            udj.c(umjVar3.b, kda.O(utcVar, "stat_value", av8Var), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfj.a(xth.e(), 0L, 0L, null, null, 0L, null, 0, 1, 0L, null, null, 0, 16711679), av8Var5, 0, 0, 131064);
                            av8Var = av8Var5;
                            av8Var.s(false);
                            Unit unit5 = Unit.a;
                        }
                        av8Var.s(true);
                        function23 = function25;
                        num3 = num4;
                        xtcVar3 = xtcVar5;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new hj7(aojVar, xtcVar3, num3, function23, i, i2);
                        return;
                    }
                    return;
                }
                function22 = function2;
                if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            num2 = num;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function22 = function2;
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        num2 = num;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function22 = function2;
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(float f2, int i, int i2, long j, long j2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        int i3;
        long j3;
        int i4;
        int i5;
        int i6;
        xtc xtcVar3;
        long j4;
        av8 av8Var;
        float f3;
        long j5;
        eqf u;
        xtc xtcVar4;
        long j6;
        float f4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(337201775);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            xtcVar2 = xtcVar;
        } else if ((i & 6) == 0) {
            xtcVar2 = xtcVar;
            i3 = (av8Var2.g(xtcVar2) ? 4 : 2) | i;
        } else {
            xtcVar2 = xtcVar;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            j3 = j;
            if (av8Var2.f(j3)) {
                i4 = 32;
                int i8 = i3 | i4;
                i5 = i2 & 4;
                if (i5 == 0) {
                    i8 |= 384;
                } else if ((i & 384) == 0) {
                    i8 |= av8Var2.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                }
                i6 = i8 | 3072;
                if (av8Var2.T(i6 & 1, (i6 & 1171) == 1170)) {
                    av8Var2.W();
                    xtcVar3 = xtcVar2;
                    j4 = j3;
                    av8Var = av8Var2;
                    f3 = f2;
                    j5 = j2;
                } else {
                    av8Var2.Y();
                    if ((i & 1) == 0 || av8Var2.B()) {
                        xtc xtcVar5 = i7 != 0 ? utc.a : xtcVar2;
                        if ((i2 & 2) != 0) {
                            j3 = lz.D(R.color.n_lv_4, av8Var2);
                            i6 &= -113;
                        }
                        float f5 = i5 != 0 ? 1.0f : f2;
                        xtcVar4 = xtcVar5;
                        j6 = r13.i;
                        j4 = j3;
                        f4 = f5;
                    } else {
                        av8Var2.W();
                        if ((i2 & 2) != 0) {
                            i6 &= -113;
                        }
                        xtcVar4 = xtcVar2;
                        j4 = j3;
                        f4 = f2;
                        j6 = j2;
                    }
                    av8Var2.t();
                    td4.N(n9e.q(xtcVar4, j6, oyn.e), f4, j4, av8Var2, ((i6 << 3) & 896) | ((i6 >> 3) & 112), 0);
                    long j7 = j6;
                    av8Var = av8Var2;
                    j5 = j7;
                    f3 = f4;
                    xtcVar3 = xtcVar4;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new f56(f3, i, i2, 2, j4, j5, xtcVar3);
                    return;
                }
                return;
            }
        } else {
            j3 = j;
        }
        i4 = 16;
        int i82 = i3 | i4;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        i6 = i82 | 3072;
        if (av8Var2.T(i6 & 1, (i6 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(int i, int i2, of3 of3Var, xtc xtcVar, String str, Function0 function0) {
        int i3;
        xtc xtcVar2;
        av8 av8Var;
        xtc xtcVar3;
        eqf u;
        str.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1961222888);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.i(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if (av8Var2.T(i3 & 1, (i3 & 147) == 146)) {
                av8Var = av8Var2;
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtcVar3 = i4 != 0 ? utcVar : xtcVar2;
                xtc q = n9e.q(wnn.A(xtcVar3, o7g.a(8.0f)), lz.D(R.color.bg_primary_tonal, av8Var2), oyn.e);
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
                    O2 = wzj.j;
                    av8Var2.n0(O2);
                }
                xtc c0 = l98.c0(tol.y(q, true, true, true, D, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), function0, 28), av8Var2, 0), 12.0f, 8.0f);
                l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var2, 54);
                int hashCode = Long.hashCode(av8Var2.T);
                aee m = av8Var2.m();
                xtc C = fqj.C(av8Var2, c0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a2, hf3.g);
                waa.K(av8Var2, m, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                yf8 yf8Var = xth.a;
                udj.c(str, null, lz.D(R.color.primary_default, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, (dfj) xth.v.getValue(), av8Var2, i3 & 14, 0, 131066);
                av8Var = av8Var2;
                kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(true);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new r22(str, function0, xtcVar3, i, i2, 17);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var2.T(i3 & 1, (i3 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final Integer t(Iterable iterable, Object obj) {
        iterable.getClass();
        int b0 = CollectionsKt.b0(iterable, obj);
        if (b0 >= 0) {
            return Integer.valueOf(b0);
        }
        return null;
    }

    public static final long u(jwj jwjVar, lcj lcjVar, cej cejVar, long j) {
        long j2;
        long n = lcjVar.n();
        if ((9223372034707292159L & n) != 9205357640488583168L && jwjVar.d().c.length() != 0) {
            long j3 = jwjVar.d().d;
            k69 l = lcjVar.l();
            int i = l == null ? -1 : bbj.a[l.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = pej.c;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        zzl.b();
                        return 0L;
                    }
                    int i3 = pej.c;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                aej c2 = cejVar.c();
                if (c2 != null) {
                    eyc eycVar = c2.b;
                    float intBitsToFloat = Float.intBitsToFloat((int) (n >> 32));
                    int d2 = eycVar.d(i4);
                    float f2 = c2.f(d2);
                    float g2 = c2.g(d2);
                    float b2 = llf.b(intBitsToFloat, Math.min(f2, g2), Math.max(f2, g2));
                    if (c7a.a(j, 0L) || Math.abs(intBitsToFloat - b2) <= ((int) (j >> 32)) / 2) {
                        float f3 = eycVar.f(d2);
                        long floatToRawIntBits = (Float.floatToRawIntBits(((eycVar.b(d2) - f3) / 2.0f) + f3) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
                        dma e2 = cejVar.e();
                        dnd dndVar = null;
                        if (e2 != null) {
                            if (!e2.f()) {
                                e2 = null;
                            }
                            if (e2 != null) {
                                floatToRawIntBits = r4a.t(floatToRawIntBits, pea.H(e2));
                            }
                        }
                        dma e3 = cejVar.e();
                        if (e3 == null) {
                            return floatToRawIntBits;
                        }
                        if (!e3.f()) {
                            e3 = null;
                        }
                        if (e3 == null) {
                            return floatToRawIntBits;
                        }
                        dma dmaVar = (dma) ((eoh) cejVar.d).getValue();
                        if (dmaVar != null) {
                            if (!dmaVar.f()) {
                                dmaVar = null;
                            }
                            if (dmaVar != null) {
                                dndVar = new dnd(dmaVar.l(e3, floatToRawIntBits));
                            }
                        }
                        return dndVar != null ? dndVar.a : floatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final void v(int i, int i2) {
        if (i < 0 || i >= i2) {
            zzl.r(dmi.k(i, i2, "index: ", ", size: "));
        }
    }

    public static final void w(int i, int i2) {
        if (i < 0 || i > i2) {
            zzl.r(dmi.k(i, i2, "index: ", ", size: "));
        }
    }

    public static final void x(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            pvd.m(i3, lnb.s(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            a70.p(dmi.k(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final qfb y(qfb qfbVar, qfb qfbVar2, qfb qfbVar3, qfb qfbVar4) {
        return qfbVar4 == null ? qfbVar3 : qfbVar instanceof ofb ? ((qfbVar2 instanceof pfb) && (qfbVar4 instanceof pfb)) ? qfbVar4 : qfbVar : qfbVar4;
    }

    public static int z(Context context, float f2) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f2 + 0.5f, resources.getDisplayMetrics());
    }

    public float F(View view) {
        if (e) {
            try {
                return zrj.b(view);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    public void M(View view, float f2) {
        if (e) {
            try {
                zrj.g(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f2);
    }

    public void N(rkd rkdVar) {
        try {
            O(rkdVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            td4.w0(th);
            hda.L(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void O(rkd rkdVar);
}
