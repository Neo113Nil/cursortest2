package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandingFeaturedTournament;
import com.sofascore.local_persistance.ImageDisplayType;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class nil {
    public static final void a(final vnb vnbVar, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final ksa ksaVar, final int i, final int i2, final Function1 function1, final Function1 function12, of3 of3Var, final int i3) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-819892736);
        int i4 = i3 | (av8Var.g(vnbVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z3) ? a.o : 1024) | (av8Var.h(z4) ? 16384 : 8192) | (av8Var.h(z5) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(ksaVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.e(i) ? 8388608 : 4194304) | (av8Var.e(i2) ? 67108864 : 33554432) | (av8Var.i(function1) ? 536870912 : 268435456);
        if (av8Var.T(i4 & 1, ((306783379 & i4) == 306783378 && ((av8Var.i(function12) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            final Context context = (Context) av8Var.k(nz.b);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new pcl(11);
                av8Var.n0(O);
            }
            wkn.a(vnbVar, null, null, (Function1) O, yqo.H(958492482, av8Var, new ct8() { // from class: hil
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x0155, code lost:
                
                    if (r7 != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:116:0x0161, code lost:
                
                    if (r7.isEmpty() == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:118:0x0167, code lost:
                
                    if (r1.g != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:120:0x016d, code lost:
                
                    if (r1.c != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:136:0x01a0, code lost:
                
                    if (r10 == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:141:0x01ac, code lost:
                
                    if (r7.isEmpty() == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
                
                    if (r1.v != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
                
                    if (r7.isEmpty() == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
                
                    if (r1.u != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
                
                    if (r1.s != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x00db, code lost:
                
                    if (r1.w != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x00e7, code lost:
                
                    if (r7 != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:77:0x00f2, code lost:
                
                    if (r7.isEmpty() == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x00fd, code lost:
                
                    if (r7.isEmpty() == false) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x0102, code lost:
                
                    if (r1.k != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:85:0x0107, code lost:
                
                    if (r1.e != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:87:0x010c, code lost:
                
                    if (r1.o != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x0111, code lost:
                
                    if (r1.j != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x0116, code lost:
                
                    if (r1.p != null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x011d, code lost:
                
                    if (r7 == null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x0120, code lost:
                
                    if (r7 == null) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x0125, code lost:
                
                    if (r1.d != null) goto L32;
                 */
                /* JADX WARN: Removed duplicated region for block: B:53:0x01b3 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:57:0x009c A[SYNTHETIC] */
                @Override // defpackage.ct8
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z6;
                    BrandColors brandColors;
                    gv9 gv9Var;
                    ksa ksaVar2;
                    ksa ksaVar3;
                    final vnb vnbVar2 = (vnb) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    vnbVar2.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(vnbVar2) ? 4 : 2;
                    }
                    av8 av8Var2 = (av8) of3Var2;
                    if (!av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                        av8Var2.W();
                    } else if (vnbVar2 instanceof unb) {
                        av8Var2.d0(1507802312);
                        oil oilVar = (oil) ((unb) vnbVar2).a;
                        final cdi M = hda.M(oilVar.a.c, av8Var2, 0);
                        Object O2 = av8Var2.O();
                        Object obj4 = nf3.a;
                        if (O2 == obj4) {
                            O2 = new wla();
                            av8Var2.n0(O2);
                        }
                        final wla wlaVar = (wla) O2;
                        boolean h = av8Var2.h(((js8) M.getValue()).a) | av8Var2.g(oilVar);
                        Object O3 = av8Var2.O();
                        if (h || O3 == obj4) {
                            bgl bglVar = oilVar.y;
                            boolean z7 = ((js8) M.getValue()).a;
                            bglVar.getClass();
                            b7 d = bglVar.d();
                            ArrayList arrayList = new ArrayList();
                            ListIterator<Object> listIterator = d.listIterator(0);
                            while (listIterator.hasNext()) {
                                Object next = listIterator.next();
                                ael aelVar = (ael) next;
                                aelVar.getClass();
                                BrandingFeaturedTournament brandingFeaturedTournament = oilVar.n;
                                switch (aelVar.ordinal()) {
                                    case 0:
                                        z6 = true;
                                        if (!z6) {
                                            arrayList.add(next);
                                        }
                                    case 1:
                                        z6 = z7;
                                        if (!z6) {
                                        }
                                        break;
                                    case 2:
                                        tee teeVar = oilVar.b;
                                        if (teeVar != null) {
                                            break;
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        break;
                                    case 3:
                                        if (brandingFeaturedTournament != null && brandingFeaturedTournament.getBrand() != null && ((brandingFeaturedTournament.getUpperBannerHeight() != null || brandingFeaturedTournament.getUpperAdUnitHeight() != null) && brandingFeaturedTournament.getUrl() != null && brandingFeaturedTournament.getUpperImageDisplayType() != null)) {
                                            Brand brand = brandingFeaturedTournament.getBrand();
                                            if ((brand != null ? brand.getColor() : null) != null) {
                                            }
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        gv9 gv9Var2 = oilVar.m;
                                        if (gv9Var2 != null) {
                                            break;
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        break;
                                    case 7:
                                        if (brandingFeaturedTournament != null && brandingFeaturedTournament.getBrand() != null && ((brandingFeaturedTournament.getLowerBannerHeight() != null || brandingFeaturedTournament.getLowerAdUnitHeight() != null) && brandingFeaturedTournament.getUrl() != null && brandingFeaturedTournament.getLowerImageDisplayType() != null)) {
                                            Brand brand2 = brandingFeaturedTournament.getBrand();
                                            if (brand2 == null) {
                                                brandColors = null;
                                                break;
                                            } else {
                                                brandColors = brand2.getColor();
                                                break;
                                            }
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        break;
                                    case 8:
                                        break;
                                    case 9:
                                        break;
                                    case 10:
                                        break;
                                    case 11:
                                        z6 = oilVar.l;
                                        if (!z6) {
                                        }
                                        break;
                                    case 12:
                                        break;
                                    case 13:
                                        break;
                                    case 14:
                                        break;
                                    case 15:
                                        break;
                                    case 16:
                                        break;
                                    case 17:
                                        gv9 gv9Var3 = oilVar.q;
                                        if (gv9Var3 != null) {
                                            break;
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        break;
                                    case 18:
                                        gv9 gv9Var4 = oilVar.r;
                                        if (gv9Var4 != null) {
                                            break;
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        break;
                                    case 19:
                                        yil yilVar = oilVar.t;
                                        if (yilVar == null) {
                                            gv9Var = null;
                                            break;
                                        } else {
                                            gv9Var = yilVar.b;
                                            break;
                                        }
                                    case 20:
                                        break;
                                    case 21:
                                        break;
                                    case 22:
                                        break;
                                    case 23:
                                        gv9 gv9Var5 = oilVar.x;
                                        if (gv9Var5 != null) {
                                            break;
                                        }
                                        z6 = false;
                                        if (!z6) {
                                        }
                                        break;
                                    case 24:
                                        break;
                                    default:
                                        zzl.b();
                                        return null;
                                }
                            }
                            O3 = l6g.W(arrayList);
                            av8Var2.n0(O3);
                        }
                        final gv9 gv9Var6 = (gv9) O3;
                        int i5 = i;
                        Integer valueOf = Integer.valueOf(i5);
                        boolean e = av8Var2.e(i5) | av8Var2.g(gv9Var6);
                        ksa ksaVar4 = ksaVar;
                        boolean g = e | av8Var2.g(ksaVar4);
                        Object O4 = av8Var2.O();
                        if (g || O4 == obj4) {
                            Object milVar = new mil(i5, gv9Var6, ksaVar4, null, 0);
                            ksaVar2 = ksaVar4;
                            av8Var2.n0(milVar);
                            O4 = milVar;
                        } else {
                            ksaVar2 = ksaVar4;
                        }
                        hz8.o(av8Var2, valueOf, (Function2) O4);
                        int i6 = i2;
                        Integer valueOf2 = Integer.valueOf(i6);
                        boolean e2 = av8Var2.e(i6) | av8Var2.g(gv9Var6) | av8Var2.g(ksaVar2);
                        Object O5 = av8Var2.O();
                        if (e2 || O5 == obj4) {
                            ksaVar3 = ksaVar2;
                            Object milVar2 = new mil(i6, gv9Var6, ksaVar3, null, 1);
                            av8Var2.n0(milVar2);
                            O5 = milVar2;
                        } else {
                            ksaVar3 = ksaVar2;
                        }
                        hz8.o(av8Var2, valueOf2, (Function2) O5);
                        xtc O6 = kda.O(b6a.s(n9e.q(bkh.c, lz.D(R.color.surface_0, av8Var2), oyn.e), wlaVar), "featured_scroll", av8Var2);
                        png pngVar = new png(16.0f, uxf.l);
                        t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hkg.u(48.0f, av8Var2, 0), 7);
                        boolean g2 = ((intValue & 14) == 4) | av8Var2.g(gv9Var6);
                        final boolean z8 = z;
                        boolean h2 = g2 | av8Var2.h(z8);
                        final boolean z9 = z2;
                        boolean h3 = h2 | av8Var2.h(z9);
                        final Function1 function13 = function12;
                        boolean g3 = h3 | av8Var2.g(function13);
                        final Context context2 = context;
                        boolean i7 = g3 | av8Var2.i(context2) | av8Var2.g(M) | av8Var2.i(wlaVar);
                        final boolean z10 = z3;
                        boolean h4 = i7 | av8Var2.h(z10);
                        final boolean z11 = z5;
                        boolean h5 = h4 | av8Var2.h(z11);
                        final Function1 function14 = function1;
                        boolean g4 = h5 | av8Var2.g(function14);
                        final boolean z12 = z4;
                        boolean h6 = g4 | av8Var2.h(z12);
                        Object O7 = av8Var2.O();
                        if (h6 || O7 == obj4) {
                            Object obj5 = new Function1() { // from class: jil
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    esa esaVar = (esa) obj6;
                                    esaVar.getClass();
                                    Iterator it = gv9.this.iterator();
                                    while (it.hasNext()) {
                                        final ael aelVar2 = (ael) it.next();
                                        String name = aelVar2.name();
                                        String name2 = aelVar2.name();
                                        final vnb vnbVar3 = vnbVar2;
                                        final boolean z13 = z8;
                                        final boolean z14 = z9;
                                        final Function1 function15 = function13;
                                        final Context context3 = context2;
                                        final cdi cdiVar = M;
                                        final wla wlaVar2 = wlaVar;
                                        final boolean z15 = z10;
                                        final boolean z16 = z11;
                                        final Function1 function16 = function14;
                                        Iterator it2 = it;
                                        final boolean z17 = z12;
                                        esaVar.f(name, name2, new tc3(1245313289, new ct8() { // from class: kil
                                            @Override // defpackage.ct8
                                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                r13 r13Var;
                                                r13 r13Var2;
                                                Brand brand3;
                                                Brand brand4;
                                                Brand brand5;
                                                Brand brand6;
                                                Brand brand7;
                                                Brand brand8;
                                                int intValue2;
                                                Integer upperBannerHeight;
                                                Brand brand9;
                                                int intValue3;
                                                Integer lowerBannerHeight;
                                                Brand brand10;
                                                r13 r13Var3;
                                                Brand brand11;
                                                Brand brand12;
                                                Brand brand13;
                                                xpa xpaVar = (xpa) obj7;
                                                of3 of3Var3 = (of3) obj8;
                                                int intValue4 = ((Integer) obj9).intValue();
                                                xpaVar.getClass();
                                                if ((intValue4 & 6) == 0) {
                                                    intValue4 |= ((av8) of3Var3).g(xpaVar) ? 4 : 2;
                                                }
                                                final int i8 = 0;
                                                av8 av8Var3 = (av8) of3Var3;
                                                if (av8Var3.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                    int ordinal = ael.this.ordinal();
                                                    utc utcVar = utc.a;
                                                    vnb vnbVar4 = vnbVar3;
                                                    Function1 function17 = function15;
                                                    final Context context4 = context3;
                                                    wla wlaVar3 = wlaVar2;
                                                    a99 a99Var = nf3.a;
                                                    String str = null;
                                                    str = null;
                                                    switch (ordinal) {
                                                        case 0:
                                                            av8Var3.d0(-1549801034);
                                                            z1a.e(((oil) ((unb) vnbVar4).a).a, z13, z14, function17, av8Var3, 0);
                                                            av8Var3.s(false);
                                                            Unit unit = Unit.a;
                                                            break;
                                                        case 1:
                                                            av8Var3.d0(-798140524);
                                                            av8Var3.d0(-1549759997);
                                                            xtc d0 = l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                                            Object obj10 = ((unb) vnbVar4).a;
                                                            BrandingFeaturedTournament brandingFeaturedTournament2 = ((oil) obj10).n;
                                                            String slug = (brandingFeaturedTournament2 == null || (brand8 = brandingFeaturedTournament2.getBrand()) == null) ? null : brand8.getSlug();
                                                            if (slug != null) {
                                                                boolean i9 = av8Var3.i(context4) | av8Var3.g(slug);
                                                                Object O8 = av8Var3.O();
                                                                if (i9 || O8 == a99Var) {
                                                                    O8 = new feh(context4, slug, 3);
                                                                    av8Var3.n0(O8);
                                                                }
                                                                d0 = d0.z(bea.Q(utcVar, (Function0) O8, 2));
                                                            }
                                                            xtc xtcVar = d0;
                                                            av8Var3.s(false);
                                                            js8 js8Var = (js8) cdiVar.getValue();
                                                            oil oilVar2 = (oil) obj10;
                                                            BrandingFeaturedTournament brandingFeaturedTournament3 = oilVar2.n;
                                                            Integer valueOf3 = (brandingFeaturedTournament3 == null || (brand7 = brandingFeaturedTournament3.getBrand()) == null) ? null : Integer.valueOf(brand7.getId());
                                                            BrandingFeaturedTournament brandingFeaturedTournament4 = oilVar2.n;
                                                            boolean c = brandingFeaturedTournament4 != null ? Intrinsics.c(brandingFeaturedTournament4.getTimerImage(), Boolean.TRUE) : false;
                                                            BrandingFeaturedTournament brandingFeaturedTournament5 = oilVar2.n;
                                                            BrandColors color = (brandingFeaturedTournament5 == null || (brand6 = brandingFeaturedTournament5.getBrand()) == null) ? null : brand6.getColor();
                                                            if (color == null) {
                                                                av8Var3.d0(-796798194);
                                                                av8Var3.s(false);
                                                                r13Var = null;
                                                            } else {
                                                                av8Var3.d0(-1549723821);
                                                                long D = tz9.D(color, av8Var3);
                                                                av8Var3.s(false);
                                                                r13Var = new r13(D);
                                                            }
                                                            BrandingFeaturedTournament brandingFeaturedTournament6 = oilVar2.n;
                                                            BrandColors textColor = (brandingFeaturedTournament6 == null || (brand5 = brandingFeaturedTournament6.getBrand()) == null) ? null : brand5.getTextColor();
                                                            if (textColor == null) {
                                                                av8Var3.d0(-796691058);
                                                                av8Var3.s(false);
                                                                r13Var2 = null;
                                                            } else {
                                                                av8Var3.d0(-1549720365);
                                                                long D2 = tz9.D(textColor, av8Var3);
                                                                av8Var3.s(false);
                                                                r13Var2 = new r13(D2);
                                                            }
                                                            BrandingFeaturedTournament brandingFeaturedTournament7 = oilVar2.n;
                                                            String url = (brandingFeaturedTournament7 == null || (brand4 = brandingFeaturedTournament7.getBrand()) == null) ? null : brand4.getUrl();
                                                            BrandingFeaturedTournament brandingFeaturedTournament8 = oilVar2.n;
                                                            if (brandingFeaturedTournament8 != null && (brand3 = brandingFeaturedTournament8.getBrand()) != null) {
                                                                str = brand3.getSlug();
                                                            }
                                                            i9a.o(js8Var, xtcVar, c, valueOf3, r13Var, r13Var2, url, str, null, av8Var3, 0, NotificationCompat.FLAG_LOCAL_ONLY);
                                                            av8Var3.s(false);
                                                            Unit unit2 = Unit.a;
                                                            break;
                                                        case 2:
                                                            av8Var3.d0(-796303371);
                                                            Object obj11 = ((unb) vnbVar4).a;
                                                            if (((oil) obj11).b == null) {
                                                                av8Var3.d0(-796303372);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-796303371);
                                                                oil oilVar3 = (oil) obj11;
                                                                i2a.o(oilVar3.b, oilVar3.e, oilVar3.f, wlaVar3, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_matches", av8Var3), function17, av8Var3, 0);
                                                                av8Var3 = av8Var3;
                                                                Unit unit3 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 3:
                                                            av8Var3.d0(-795344696);
                                                            Object obj12 = ((unb) vnbVar4).a;
                                                            BrandingFeaturedTournament brandingFeaturedTournament9 = ((oil) obj12).n;
                                                            final Brand brand14 = brandingFeaturedTournament9 != null ? brandingFeaturedTournament9.getBrand() : null;
                                                            oil oilVar4 = (oil) obj12;
                                                            BrandingFeaturedTournament brandingFeaturedTournament10 = oilVar4.n;
                                                            BrandColors color2 = (brandingFeaturedTournament10 == null || (brand9 = brandingFeaturedTournament10.getBrand()) == null) ? null : brand9.getColor();
                                                            BrandingFeaturedTournament brandingFeaturedTournament11 = oilVar4.n;
                                                            String url2 = brandingFeaturedTournament11 != null ? brandingFeaturedTournament11.getUrl() : null;
                                                            BrandingFeaturedTournament brandingFeaturedTournament12 = oilVar4.n;
                                                            ImageDisplayType upperImageDisplayType = brandingFeaturedTournament12 != null ? brandingFeaturedTournament12.getUpperImageDisplayType() : null;
                                                            if (brand14 != null && color2 != null && url2 != null && upperImageDisplayType != null) {
                                                                BrandingFeaturedTournament brandingFeaturedTournament13 = oilVar4.n;
                                                                if (brandingFeaturedTournament13 == null || (upperBannerHeight = brandingFeaturedTournament13.getUpperBannerHeight()) == null) {
                                                                    BrandingFeaturedTournament brandingFeaturedTournament14 = oilVar4.n;
                                                                    Integer upperAdUnitHeight = brandingFeaturedTournament14 != null ? brandingFeaturedTournament14.getUpperAdUnitHeight() : null;
                                                                    intValue2 = upperAdUnitHeight != null ? upperAdUnitHeight.intValue() : 0;
                                                                } else {
                                                                    intValue2 = upperBannerHeight.intValue();
                                                                }
                                                                xtc O9 = kda.O(l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), "wc26_brand_slot_upper", av8Var3);
                                                                boolean i10 = av8Var3.i(context4) | av8Var3.i(brand14);
                                                                Object O10 = av8Var3.O();
                                                                if (i10 || O10 == a99Var) {
                                                                    O10 = new Function0() { // from class: lil
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            int i11 = i8;
                                                                            Brand brand15 = brand14;
                                                                            Context context5 = context4;
                                                                            switch (i11) {
                                                                                case 0:
                                                                                    nv.q(context5, 16, BrandLocation.FeaturedTournament, brand15.getSlug(), BrandType.BANNER);
                                                                                    break;
                                                                                default:
                                                                                    nv.q(context5, 16, BrandLocation.FeaturedTournament, brand15.getSlug(), BrandType.BANNER);
                                                                                    break;
                                                                            }
                                                                            return Unit.a;
                                                                        }
                                                                    };
                                                                    av8Var3.n0(O10);
                                                                }
                                                                t62.b(brand14.getId(), tz9.D(color2, av8Var3), vxd.j(brand14.getId(), pco.F(), "branding/provider/", "/featured-unique-tournament/16/upper-banner"), intValue2, url2, BrandLocation.FeaturedTournament, upperImageDisplayType, brand14.getSlug(), bea.Q(O9, (Function0) O10, 2), av8Var3, 1769472);
                                                                av8Var3 = av8Var3;
                                                                Unit unit4 = Unit.a;
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 4:
                                                            av8Var3.d0(-792939437);
                                                            Object obj13 = ((unb) vnbVar4).a;
                                                            if (((oil) obj13).c == null) {
                                                                av8Var3.d0(-792939438);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-792939437);
                                                                r4a.p(((oil) obj13).c, function17, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_meet_the_teams", av8Var3), av8Var3, 0);
                                                                Unit unit5 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 5:
                                                            av8Var3.d0(-789212989);
                                                            Object obj14 = ((unb) vnbVar4).a;
                                                            if (((oil) obj14).g == null) {
                                                                av8Var3.d0(-789212990);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-789212989);
                                                                oil oilVar5 = (oil) obj14;
                                                                h5a.C(oilVar5.g, oilVar5.a.c, function17, z15, z16, oilVar5.h, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_my_national_team", av8Var3), av8Var3, 0);
                                                                av8Var3 = av8Var3;
                                                                Unit unit6 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 6:
                                                            av8Var3.d0(-792365224);
                                                            Object obj15 = ((unb) vnbVar4).a;
                                                            if (((oil) obj15).m == null) {
                                                                av8Var3.d0(-792365225);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-792365224);
                                                                oil oilVar6 = (oil) obj15;
                                                                o3a.j(0, av8Var3, oilVar6.m, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_key_players", av8Var3), function17, oilVar6.i);
                                                                av8Var3 = av8Var3;
                                                                Unit unit7 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 7:
                                                            av8Var3.d0(-791624696);
                                                            Object obj16 = ((unb) vnbVar4).a;
                                                            BrandingFeaturedTournament brandingFeaturedTournament15 = ((oil) obj16).n;
                                                            final Brand brand15 = brandingFeaturedTournament15 != null ? brandingFeaturedTournament15.getBrand() : null;
                                                            oil oilVar7 = (oil) obj16;
                                                            BrandingFeaturedTournament brandingFeaturedTournament16 = oilVar7.n;
                                                            BrandColors color3 = (brandingFeaturedTournament16 == null || (brand10 = brandingFeaturedTournament16.getBrand()) == null) ? null : brand10.getColor();
                                                            BrandingFeaturedTournament brandingFeaturedTournament17 = oilVar7.n;
                                                            String url3 = brandingFeaturedTournament17 != null ? brandingFeaturedTournament17.getUrl() : null;
                                                            BrandingFeaturedTournament brandingFeaturedTournament18 = oilVar7.n;
                                                            ImageDisplayType lowerImageDisplayType = brandingFeaturedTournament18 != null ? brandingFeaturedTournament18.getLowerImageDisplayType() : null;
                                                            if (brand15 != null && color3 != null && url3 != null && lowerImageDisplayType != null) {
                                                                BrandingFeaturedTournament brandingFeaturedTournament19 = oilVar7.n;
                                                                if (brandingFeaturedTournament19 == null || (lowerBannerHeight = brandingFeaturedTournament19.getLowerBannerHeight()) == null) {
                                                                    BrandingFeaturedTournament brandingFeaturedTournament20 = oilVar7.n;
                                                                    Integer lowerAdUnitHeight = brandingFeaturedTournament20 != null ? brandingFeaturedTournament20.getLowerAdUnitHeight() : null;
                                                                    intValue3 = lowerAdUnitHeight != null ? lowerAdUnitHeight.intValue() : 0;
                                                                } else {
                                                                    intValue3 = lowerBannerHeight.intValue();
                                                                }
                                                                xtc O11 = kda.O(l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), "wc26_brand_slot_lower", av8Var3);
                                                                boolean i11 = av8Var3.i(context4) | av8Var3.i(brand15);
                                                                Object O12 = av8Var3.O();
                                                                if (i11 || O12 == a99Var) {
                                                                    final int i12 = 1;
                                                                    O12 = new Function0() { // from class: lil
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            int i112 = i12;
                                                                            Brand brand152 = brand15;
                                                                            Context context5 = context4;
                                                                            switch (i112) {
                                                                                case 0:
                                                                                    nv.q(context5, 16, BrandLocation.FeaturedTournament, brand152.getSlug(), BrandType.BANNER);
                                                                                    break;
                                                                                default:
                                                                                    nv.q(context5, 16, BrandLocation.FeaturedTournament, brand152.getSlug(), BrandType.BANNER);
                                                                                    break;
                                                                            }
                                                                            return Unit.a;
                                                                        }
                                                                    };
                                                                    av8Var3.n0(O12);
                                                                }
                                                                t62.b(brand15.getId(), tz9.D(color3, av8Var3), vxd.j(brand15.getId(), pco.F(), "branding/provider/", "/featured-unique-tournament/16/lower-banner"), intValue3, url3, BrandLocation.FeaturedTournament, lowerImageDisplayType, brand15.getSlug(), bea.Q(O11, (Function0) O12, 2), av8Var3, 1769472);
                                                                av8Var3 = av8Var3;
                                                                Unit unit8 = Unit.a;
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 8:
                                                            av8Var3.d0(-787110011);
                                                            Object obj17 = ((unb) vnbVar4).a;
                                                            if (((oil) obj17).d == null) {
                                                                av8Var3.d0(-787110012);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-787110011);
                                                                xtc O13 = kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_historical_data", av8Var3);
                                                                sxa sxaVar = ((oil) obj17).d;
                                                                String v = oea.v(R.string.world_cup_history, av8Var3);
                                                                String upperCase = oea.v(R.string.football_champions, av8Var3).toUpperCase(Locale.ROOT);
                                                                upperCase.getClass();
                                                                boolean g5 = av8Var3.g(function17);
                                                                Object O14 = av8Var3.O();
                                                                if (g5 || O14 == a99Var) {
                                                                    O14 = new fuj(10, function17);
                                                                    av8Var3.n0(O14);
                                                                }
                                                                q5a.c(sxaVar, (Function1) O14, O13, null, false, v, upperCase, av8Var3, 0, 24);
                                                                av8Var3 = av8Var3;
                                                                Unit unit9 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 9:
                                                            av8Var3.d0(-782932606);
                                                            rz0.a(new sz0(AdType.Banner.FeaturedTournamentSmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("unique_tournament_id", "16"))), xpa.a(xpaVar, utcVar, 7), 0, 0, false, av8Var3, 384, 24);
                                                            av8Var3.s(false);
                                                            Unit unit10 = Unit.a;
                                                            break;
                                                        case 10:
                                                            av8Var3.d0(-782107324);
                                                            rz0.a(new sz0(AdType.Banner.FeaturedTournamentBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("unique_tournament_id", "16"))), xpa.a(xpaVar, utcVar, 7), 0, 0, false, av8Var3, 384, 24);
                                                            av8Var3.s(false);
                                                            Unit unit11 = Unit.a;
                                                            break;
                                                        case 11:
                                                            av8Var3.d0(-786171021);
                                                            t6a.j(0, av8Var3, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_fantasy", av8Var3), function17);
                                                            av8Var3.s(false);
                                                            Unit unit12 = Unit.a;
                                                            break;
                                                        case 12:
                                                            av8Var3.d0(-784127470);
                                                            gv9 gv9Var7 = ((oil) ((unb) vnbVar4).a).p;
                                                            if (gv9Var7 == null) {
                                                                av8Var3.d0(-784127471);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-784127470);
                                                                waa.n(0, av8Var3, gv9Var7, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_videos", av8Var3), function17);
                                                                Unit unit13 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 13:
                                                            av8Var3.d0(-785003716);
                                                            Object obj18 = ((unb) vnbVar4).a;
                                                            if (((oil) obj18).j == null) {
                                                                av8Var3.d0(-785003717);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-785003716);
                                                                xtc O15 = kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_news", av8Var3);
                                                                gv9 gv9Var8 = ((oil) obj18).j;
                                                                String v2 = oea.v(R.string.news, av8Var3);
                                                                boolean g6 = av8Var3.g(function17);
                                                                Object O16 = av8Var3.O();
                                                                if (g6 || O16 == a99Var) {
                                                                    O16 = new o34(14, function17);
                                                                    av8Var3.n0(O16);
                                                                }
                                                                Function2 function2 = (Function2) O16;
                                                                boolean g7 = av8Var3.g(function17);
                                                                Object O17 = av8Var3.O();
                                                                if (g7 || O17 == a99Var) {
                                                                    O17 = new b4j(14, function17);
                                                                    av8Var3.n0(O17);
                                                                }
                                                                jca.m(gv9Var8, function2, O15, false, null, v2, (Function0) O17, av8Var3, 3072, 16);
                                                                av8Var3 = av8Var3;
                                                                Unit unit14 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 14:
                                                            av8Var3.d0(-781306625);
                                                            Object obj19 = ((unb) vnbVar4).a;
                                                            if (((oil) obj19).o == null) {
                                                                av8Var3.d0(-781306626);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-781306625);
                                                                y6a.p(((oil) obj19).o, function17, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_standings", av8Var3), av8Var3, 0);
                                                                Unit unit15 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 15:
                                                            av8Var3.d0(-778761587);
                                                            Object obj20 = ((unb) vnbVar4).a;
                                                            if (((oil) obj20).e == null) {
                                                                av8Var3.d0(-778761588);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-778761587);
                                                                o3a.d(ke0.c, ((oil) obj20).e.e, l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var3, 0, 0);
                                                                av8Var3 = av8Var3;
                                                                Unit unit16 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 16:
                                                            av8Var3.d0(-785743159);
                                                            Object obj21 = ((unb) vnbVar4).a;
                                                            if (((oil) obj21).k == null) {
                                                                av8Var3.d0(-785743160);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-785743159);
                                                                xtc O18 = kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_power_rankings", av8Var3);
                                                                gv9 gv9Var9 = ((oil) obj21).k;
                                                                boolean g8 = av8Var3.g(function17);
                                                                Object O19 = av8Var3.O();
                                                                if (g8 || O19 == a99Var) {
                                                                    O19 = new b4j(18, function17);
                                                                    av8Var3.n0(O19);
                                                                }
                                                                Function0 function0 = (Function0) O19;
                                                                boolean g9 = av8Var3.g(function17);
                                                                Object O20 = av8Var3.O();
                                                                if (g9 || O20 == a99Var) {
                                                                    O20 = new fuj(11, function17);
                                                                    av8Var3.n0(O20);
                                                                }
                                                                o6a.j(0, av8Var3, gv9Var9, O18, function0, (Function1) O20);
                                                                av8Var3 = av8Var3;
                                                                Unit unit17 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 17:
                                                            av8Var3.d0(-788284012);
                                                            Object obj22 = ((unb) vnbVar4).a;
                                                            gv9 gv9Var10 = ((oil) obj22).q;
                                                            if (gv9Var10 == null) {
                                                                av8Var3.d0(-788284013);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-788284012);
                                                                xtc O21 = kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_matchday_highlights", av8Var3);
                                                                oil oilVar8 = (oil) obj22;
                                                                BrandingFeaturedTournament brandingFeaturedTournament21 = oilVar8.n;
                                                                boolean c2 = brandingFeaturedTournament21 != null ? Intrinsics.c(brandingFeaturedTournament21.getPlayerOfTheMatch(), Boolean.TRUE) : false;
                                                                BrandingFeaturedTournament brandingFeaturedTournament22 = oilVar8.n;
                                                                Integer valueOf4 = (brandingFeaturedTournament22 == null || (brand13 = brandingFeaturedTournament22.getBrand()) == null) ? null : Integer.valueOf(brand13.getId());
                                                                BrandingFeaturedTournament brandingFeaturedTournament23 = oilVar8.n;
                                                                BrandColors color4 = (brandingFeaturedTournament23 == null || (brand12 = brandingFeaturedTournament23.getBrand()) == null) ? null : brand12.getColor();
                                                                if (color4 == null) {
                                                                    av8Var3.d0(1159819898);
                                                                    av8Var3.s(false);
                                                                    r13Var3 = null;
                                                                } else {
                                                                    av8Var3.d0(2115623527);
                                                                    long D3 = tz9.D(color4, av8Var3);
                                                                    av8Var3.s(false);
                                                                    r13Var3 = new r13(D3);
                                                                }
                                                                BrandingFeaturedTournament brandingFeaturedTournament24 = oilVar8.n;
                                                                String slug2 = (brandingFeaturedTournament24 == null || (brand11 = brandingFeaturedTournament24.getBrand()) == null) ? null : brand11.getSlug();
                                                                BrandingFeaturedTournament brandingFeaturedTournament25 = oilVar8.n;
                                                                l98.J(gv9Var10, function16, function17, O21, c2, valueOf4, r13Var3, slug2, brandingFeaturedTournament25 != null ? brandingFeaturedTournament25.getUrl() : null, wlaVar3, av8Var3, 0);
                                                                av8Var3 = av8Var3;
                                                                Unit unit18 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 18:
                                                            av8Var3.d0(-778062878);
                                                            Object obj23 = ((unb) vnbVar4).a;
                                                            if (((oil) obj23).r == null) {
                                                                av8Var3.d0(-778062879);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-778062878);
                                                                oil oilVar9 = (oil) obj23;
                                                                haa.k(0, av8Var3, oilVar9.r, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_matchday_top_performers", av8Var3), function17, oilVar9.i);
                                                                av8Var3 = av8Var3;
                                                                Unit unit19 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 19:
                                                            av8Var3.d0(-780740937);
                                                            Object obj24 = ((unb) vnbVar4).a;
                                                            if (((oil) obj24).t == null) {
                                                                av8Var3.d0(-780740938);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-780740937);
                                                                oil oilVar10 = (oil) obj24;
                                                                d7a.n(oilVar10.t, function17, oilVar10.h, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_stats_leaders", av8Var3), av8Var3, 0);
                                                                Unit unit20 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 20:
                                                            av8Var3.d0(-780052861);
                                                            xxi xxiVar = ((oil) ((unb) vnbVar4).a).w;
                                                            if (xxiVar == null) {
                                                                av8Var3.d0(-780052862);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-780052861);
                                                                xtc O22 = kda.O(n9e.q(wnn.A(l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(8.0f)), lz.D(R.color.surface_1, av8Var3), oyn.e), "wc26_segment_team_of_the_round", av8Var3);
                                                                boolean g10 = av8Var3.g(function17);
                                                                Object O23 = av8Var3.O();
                                                                if (g10 || O23 == a99Var) {
                                                                    O23 = new fuj(8, function17);
                                                                    av8Var3.n0(O23);
                                                                }
                                                                Function1 function18 = (Function1) O23;
                                                                boolean g11 = av8Var3.g(function17);
                                                                Object O24 = av8Var3.O();
                                                                if (g11 || O24 == a99Var) {
                                                                    O24 = new fuj(9, function17);
                                                                    av8Var3.n0(O24);
                                                                }
                                                                Function1 function19 = (Function1) O24;
                                                                boolean g12 = av8Var3.g(function17);
                                                                Object O25 = av8Var3.O();
                                                                if (g12 || O25 == a99Var) {
                                                                    O25 = new b4j(15, function17);
                                                                    av8Var3.n0(O25);
                                                                }
                                                                Function0 function02 = (Function0) O25;
                                                                boolean g13 = av8Var3.g(function17);
                                                                Object O26 = av8Var3.O();
                                                                if (g13 || O26 == a99Var) {
                                                                    O26 = new b4j(16, function17);
                                                                    av8Var3.n0(O26);
                                                                }
                                                                Function0 function03 = (Function0) O26;
                                                                boolean g14 = av8Var3.g(function17);
                                                                Object O27 = av8Var3.O();
                                                                if (g14 || O27 == a99Var) {
                                                                    O27 = new b4j(17, function17);
                                                                    av8Var3.n0(O27);
                                                                }
                                                                aik.p(xxiVar, function18, function19, function02, function03, (Function0) O27, O22, av8Var3, 0, 0);
                                                                av8Var3 = av8Var3;
                                                                Unit unit21 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 21:
                                                            av8Var3.d0(-783584877);
                                                            efl eflVar = ((oil) ((unb) vnbVar4).a).s;
                                                            if (eflVar == null) {
                                                                av8Var3.d0(-783584878);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-783584877);
                                                                b0a.x(eflVar, z17, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_knockout", av8Var3), function17, av8Var3, 0);
                                                                Unit unit22 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 22:
                                                            av8Var3.d0(-798755595);
                                                            mjl mjlVar = ((oil) ((unb) vnbVar4).a).u;
                                                            if (mjlVar == null) {
                                                                av8Var3.d0(-798755596);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-798755595);
                                                                jaa.p(mjlVar, function17, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_tournament_winner", av8Var3), av8Var3, 0);
                                                                Unit unit23 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 23:
                                                            av8Var3.d0(-776546048);
                                                            gv9 gv9Var11 = ((oil) ((unb) vnbVar4).a).x;
                                                            if (gv9Var11 == null || gv9Var11.isEmpty()) {
                                                                gv9Var11 = null;
                                                            }
                                                            if (gv9Var11 == null) {
                                                                av8Var3.d0(-776546049);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-776546048);
                                                                w3a.j(0, av8Var3, gv9Var11, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_the_last_dance", av8Var3), function17);
                                                                Unit unit24 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        case 24:
                                                            av8Var3.d0(-777255731);
                                                            cgl cglVar = ((oil) ((unb) vnbVar4).a).v;
                                                            if (cglVar == null) {
                                                                av8Var3.d0(-777255732);
                                                                av8Var3.s(false);
                                                            } else {
                                                                av8Var3.d0(-777255731);
                                                                f6a.e(cglVar, function17, kda.O(xpa.a(xpaVar, utcVar, 7), "wc26_segment_player_of_the_tournament", av8Var3), av8Var3, 0);
                                                                Unit unit25 = Unit.a;
                                                                av8Var3.s(false);
                                                            }
                                                            av8Var3.s(false);
                                                            break;
                                                        default:
                                                            throw dmi.h(av8Var3, -1549780424, false);
                                                    }
                                                } else {
                                                    av8Var3.W();
                                                }
                                                return Unit.a;
                                            }
                                        }, true));
                                        it = it2;
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var2.n0(obj5);
                            O7 = obj5;
                        }
                        v8a.a(O6, ksaVar3, C, pngVar, null, null, false, null, (Function1) O7, av8Var2, 24576, 488);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1989090581);
                        s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var2, bkh.c);
                        av8Var2.s(false);
                    }
                    return Unit.a;
                }
            }), av8Var, (i4 & 14) | 27648, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(z, z2, z3, z4, z5, ksaVar, i, i2, function1, function12, i3) { // from class: iil
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ ksa g;
                public final /* synthetic */ int h;
                public final /* synthetic */ int i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ Function1 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    nil.a(vnb.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final qkl qklVar, zqb zqbVar, of3 of3Var, int i) {
        qkl qklVar2;
        av8 av8Var;
        e1d e1dVar;
        boolean i2;
        Object O;
        boolean i3;
        Object O2;
        boolean i4;
        Object O3;
        e1d e1dVar2;
        Context context;
        e1d e1dVar3;
        e1d e1dVar4;
        final e1d e1dVar5;
        final znh znhVar;
        final znh znhVar2;
        boolean i5;
        Object O4;
        qklVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1203597829);
        int i6 = (av8Var2.i(qklVar) ? 4 : 2) | i | (av8Var2.i(zqbVar) ? 32 : 16);
        final int i7 = 0;
        if (av8Var2.T(i6 & 1, (i6 & 19) != 18)) {
            final e1d x = rfo.x(qklVar.f, av8Var2, 0);
            e1d x2 = rfo.x(qklVar.D, av8Var2, 0);
            final e1d v = rfo.v(qklVar.z, Boolean.TRUE, av8Var2, 48);
            yf4 yf4Var = qklVar.B;
            Boolean bool = Boolean.FALSE;
            e1d v2 = rfo.v(yf4Var, bool, av8Var2, 48);
            e1d v3 = rfo.v(qklVar.C, bool, av8Var2, 48);
            final e1d x3 = rfo.x(qklVar.E, av8Var2, 0);
            e1d x4 = rfo.x(qklVar.j, av8Var2, 0);
            xhf J = x2a.J(av8Var2);
            Context context2 = (Context) av8Var2.k(nz.b);
            final d87 Q = u6h.Q(av8Var2);
            Object k = av8Var2.k(ngb.a);
            FragmentActivity fragmentActivity = k instanceof FragmentActivity ? (FragmentActivity) k : null;
            final ksa a = msa.a(0, 0, av8Var2, 0, 3);
            Object O5 = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O5 == a99Var) {
                O5 = e.c(0);
                av8Var2.n0(O5);
            }
            znh znhVar3 = (znh) O5;
            Object O6 = av8Var2.O();
            if (O6 == a99Var) {
                O6 = e.c(0);
                av8Var2.n0(O6);
            }
            znh znhVar4 = (znh) O6;
            if (((vnb) x.getValue()) instanceof unb) {
                yea yeaVar = j58.a;
                e58 f = e58.f();
                f.getClass();
                nxf[] nxfVarArr = nxf.a;
                if (f.c("show_pick_dream_team_banner")) {
                    av8Var2.d0(-1994612874);
                    e1dVar = x4;
                    p4h.d.f("https://www.sofascore.com/web-view/squad-builder/world-cup", av8Var2, 54);
                    av8Var2.s(false);
                    d6b d6bVar = d6b.ON_RESUME;
                    i2 = av8Var2.i(qklVar);
                    O = av8Var2.O();
                    if (!i2 || O == a99Var) {
                        O = new Function0() { // from class: fil
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i7;
                                qkl qklVar3 = qklVar;
                                switch (i8) {
                                    case 0:
                                        if (!qklVar3.P) {
                                            qklVar3.P = true;
                                            fcp.m0(new v98(new wj0(qklVar3.k, 2), new i3l(qklVar3, null, 9), 3), un0.z(qklVar3));
                                        }
                                        xw3.L(un0.z(qklVar3), null, null, new njl(qklVar3, null, 1), 3);
                                        break;
                                    default:
                                        qklVar3.getClass();
                                        ynb.m(qklVar3, new ej(qklVar3, null, 9));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O);
                    }
                    jca.b(d6bVar, null, (Function0) O, av8Var2, 6);
                    hof hofVar = zqbVar.H;
                    i3 = av8Var2.i(qklVar);
                    O2 = av8Var2.O();
                    if (!i3 || O2 == a99Var) {
                        O2 = new qdj(qklVar, 21);
                        av8Var2.n0(O2);
                    }
                    w1a.c(hofVar, null, (Function1) O2, av8Var2, 0, 14);
                    hof hofVar2 = qklVar.h;
                    i4 = av8Var2.i(context2) | av8Var2.i(qklVar);
                    O3 = av8Var2.O();
                    if (!i4 || O3 == a99Var) {
                        e1dVar2 = e1dVar;
                        lwc lwcVar = new lwc(context2, qklVar, znhVar3, znhVar4, 16);
                        context = context2;
                        e1dVar3 = x2;
                        e1dVar4 = v2;
                        e1dVar5 = v3;
                        znhVar = znhVar3;
                        znhVar2 = znhVar4;
                        av8Var2.n0(lwcVar);
                        O3 = lwcVar;
                    } else {
                        e1dVar2 = e1dVar;
                        e1dVar3 = x2;
                        e1dVar5 = v3;
                        znhVar2 = znhVar4;
                        e1dVar4 = v2;
                        znhVar = znhVar3;
                        context = context2;
                    }
                    w1a.c(hofVar2, null, (Function1) O3, av8Var2, 0, 14);
                    boolean booleanValue = ((Boolean) e1dVar2.getValue()).booleanValue();
                    xtc w = kda.w(bkh.c);
                    i5 = av8Var2.i(qklVar);
                    O4 = av8Var2.O();
                    if (!i5 || O4 == a99Var) {
                        final int i8 = 1;
                        O4 = new Function0() { // from class: fil
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i82 = i8;
                                qkl qklVar3 = qklVar;
                                switch (i82) {
                                    case 0:
                                        if (!qklVar3.P) {
                                            qklVar3.P = true;
                                            fcp.m0(new v98(new wj0(qklVar3.k, 2), new i3l(qklVar3, null, 9), 3), un0.z(qklVar3));
                                        }
                                        xw3.L(un0.z(qklVar3), null, null, new njl(qklVar3, null, 1), 3);
                                        break;
                                    default:
                                        qklVar3.getClass();
                                        ynb.m(qklVar3, new ej(qklVar3, null, 9));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O4);
                    }
                    tc3 H = yqo.H(-61097388, av8Var2, new ak1(J, e1dVar2, 8));
                    final FragmentActivity fragmentActivity2 = fragmentActivity;
                    final Context context3 = context;
                    final e1d e1dVar6 = e1dVar4;
                    final e1d e1dVar7 = e1dVar3;
                    ct8 ct8Var = new ct8() { // from class: gil
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                e1d e1dVar8 = x;
                                vnb vnbVar = (vnb) e1dVar8.getValue();
                                boolean booleanValue2 = ((Boolean) v.getValue()).booleanValue();
                                boolean booleanValue3 = ((Boolean) e1dVar7.getValue()).booleanValue();
                                boolean booleanValue4 = ((Boolean) e1dVar6.getValue()).booleanValue();
                                boolean booleanValue5 = ((Boolean) e1dVar5.getValue()).booleanValue();
                                boolean booleanValue6 = ((Boolean) x3.getValue()).booleanValue();
                                qkl qklVar3 = qkl.this;
                                boolean i9 = av8Var3.i(qklVar3);
                                Object O7 = av8Var3.O();
                                a99 a99Var2 = nf3.a;
                                if (i9 || O7 == a99Var2) {
                                    O7 = new wlj(1, qklVar3, qkl.class, "onVisibleHighlightsChanged", "onVisibleHighlightsChanged(Ljava/util/Set;)V", 0, 5);
                                    av8Var3.n0(O7);
                                }
                                int h = znhVar.h();
                                int h2 = znhVar2.h();
                                Function1 function1 = (Function1) ((KFunction) O7);
                                Context context4 = context3;
                                boolean i10 = av8Var3.i(context4) | av8Var3.i(qklVar3);
                                d87 d87Var = Q;
                                boolean g = i10 | av8Var3.g(d87Var) | av8Var3.g(e1dVar8);
                                FragmentActivity fragmentActivity3 = fragmentActivity2;
                                boolean i11 = g | av8Var3.i(fragmentActivity3);
                                Object O8 = av8Var3.O();
                                if (i11 || O8 == a99Var2) {
                                    ke keVar = new ke(context4, qklVar3, d87Var, fragmentActivity3, e1dVar8, 15);
                                    av8Var3.n0(keVar);
                                    O8 = keVar;
                                }
                                nil.a(vnbVar, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, a, h, h2, function1, (Function1) O8, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            return Unit.a;
                        }
                    };
                    qklVar2 = qklVar;
                    x2a.h(booleanValue, (Function0) O4, w, J, null, H, yqo.H(-26273451, av8Var2, ct8Var), av8Var2, 1769472);
                    av8Var = av8Var2;
                }
            }
            e1dVar = x4;
            av8Var2.d0(-1994535033);
            av8Var2.s(false);
            d6b d6bVar2 = d6b.ON_RESUME;
            i2 = av8Var2.i(qklVar);
            O = av8Var2.O();
            if (!i2) {
            }
            O = new Function0() { // from class: fil
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i82 = i7;
                    qkl qklVar3 = qklVar;
                    switch (i82) {
                        case 0:
                            if (!qklVar3.P) {
                                qklVar3.P = true;
                                fcp.m0(new v98(new wj0(qklVar3.k, 2), new i3l(qklVar3, null, 9), 3), un0.z(qklVar3));
                            }
                            xw3.L(un0.z(qklVar3), null, null, new njl(qklVar3, null, 1), 3);
                            break;
                        default:
                            qklVar3.getClass();
                            ynb.m(qklVar3, new ej(qklVar3, null, 9));
                            break;
                    }
                    return Unit.a;
                }
            };
            av8Var2.n0(O);
            jca.b(d6bVar2, null, (Function0) O, av8Var2, 6);
            hof hofVar3 = zqbVar.H;
            i3 = av8Var2.i(qklVar);
            O2 = av8Var2.O();
            if (!i3) {
            }
            O2 = new qdj(qklVar, 21);
            av8Var2.n0(O2);
            w1a.c(hofVar3, null, (Function1) O2, av8Var2, 0, 14);
            hof hofVar22 = qklVar.h;
            i4 = av8Var2.i(context2) | av8Var2.i(qklVar);
            O3 = av8Var2.O();
            if (i4) {
            }
            e1dVar2 = e1dVar;
            lwc lwcVar2 = new lwc(context2, qklVar, znhVar3, znhVar4, 16);
            context = context2;
            e1dVar3 = x2;
            e1dVar4 = v2;
            e1dVar5 = v3;
            znhVar = znhVar3;
            znhVar2 = znhVar4;
            av8Var2.n0(lwcVar2);
            O3 = lwcVar2;
            w1a.c(hofVar22, null, (Function1) O3, av8Var2, 0, 14);
            boolean booleanValue2 = ((Boolean) e1dVar2.getValue()).booleanValue();
            xtc w2 = kda.w(bkh.c);
            i5 = av8Var2.i(qklVar);
            O4 = av8Var2.O();
            if (!i5) {
            }
            final int i82 = 1;
            O4 = new Function0() { // from class: fil
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i822 = i82;
                    qkl qklVar3 = qklVar;
                    switch (i822) {
                        case 0:
                            if (!qklVar3.P) {
                                qklVar3.P = true;
                                fcp.m0(new v98(new wj0(qklVar3.k, 2), new i3l(qklVar3, null, 9), 3), un0.z(qklVar3));
                            }
                            xw3.L(un0.z(qklVar3), null, null, new njl(qklVar3, null, 1), 3);
                            break;
                        default:
                            qklVar3.getClass();
                            ynb.m(qklVar3, new ej(qklVar3, null, 9));
                            break;
                    }
                    return Unit.a;
                }
            };
            av8Var2.n0(O4);
            tc3 H2 = yqo.H(-61097388, av8Var2, new ak1(J, e1dVar2, 8));
            final FragmentActivity fragmentActivity22 = fragmentActivity;
            final Context context32 = context;
            final e1d e1dVar62 = e1dVar4;
            final e1d e1dVar72 = e1dVar3;
            ct8 ct8Var2 = new ct8() { // from class: gil
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((m12) obj).getClass();
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                        e1d e1dVar8 = x;
                        vnb vnbVar = (vnb) e1dVar8.getValue();
                        boolean booleanValue22 = ((Boolean) v.getValue()).booleanValue();
                        boolean booleanValue3 = ((Boolean) e1dVar72.getValue()).booleanValue();
                        boolean booleanValue4 = ((Boolean) e1dVar62.getValue()).booleanValue();
                        boolean booleanValue5 = ((Boolean) e1dVar5.getValue()).booleanValue();
                        boolean booleanValue6 = ((Boolean) x3.getValue()).booleanValue();
                        qkl qklVar3 = qkl.this;
                        boolean i9 = av8Var3.i(qklVar3);
                        Object O7 = av8Var3.O();
                        a99 a99Var2 = nf3.a;
                        if (i9 || O7 == a99Var2) {
                            O7 = new wlj(1, qklVar3, qkl.class, "onVisibleHighlightsChanged", "onVisibleHighlightsChanged(Ljava/util/Set;)V", 0, 5);
                            av8Var3.n0(O7);
                        }
                        int h = znhVar.h();
                        int h2 = znhVar2.h();
                        Function1 function1 = (Function1) ((KFunction) O7);
                        Context context4 = context32;
                        boolean i10 = av8Var3.i(context4) | av8Var3.i(qklVar3);
                        d87 d87Var = Q;
                        boolean g = i10 | av8Var3.g(d87Var) | av8Var3.g(e1dVar8);
                        FragmentActivity fragmentActivity3 = fragmentActivity22;
                        boolean i11 = g | av8Var3.i(fragmentActivity3);
                        Object O8 = av8Var3.O();
                        if (i11 || O8 == a99Var2) {
                            ke keVar = new ke(context4, qklVar3, d87Var, fragmentActivity3, e1dVar8, 15);
                            av8Var3.n0(keVar);
                            O8 = keVar;
                        }
                        nil.a(vnbVar, booleanValue22, booleanValue3, booleanValue4, booleanValue5, booleanValue6, a, h, h2, function1, (Function1) O8, av8Var3, 0);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            };
            qklVar2 = qklVar;
            x2a.h(booleanValue2, (Function0) O4, w2, J, null, H2, yqo.H(-26273451, av8Var2, ct8Var2), av8Var2, 1769472);
            av8Var = av8Var2;
        } else {
            qklVar2 = qklVar;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(qklVar2, zqbVar, i, 20);
        }
    }
}
