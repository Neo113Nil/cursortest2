package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.LocaleList;
import android.text.Html;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.V2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Sports;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class jca {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xbe[] A(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = z(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                vp2.e(lnb.o("error in parsing \"", trim, "\""), e);
                                return null;
                            }
                        }
                        arrayList.add(new xbe(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new xbe(str.charAt(i3), new float[0]));
        }
        return (xbe[]) arrayList.toArray(new xbe[i]);
    }

    public static final String B(String str) {
        if (str != null) {
            return StringsKt.l0(Html.fromHtml(str, 63).toString()).toString();
        }
        return null;
    }

    public static final jyj C(bw4 bw4Var, Object obj) {
        c40 c40Var;
        if (!bw4Var.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar = bw4Var.a.e;
        wma c0 = c6o.c0(bw4Var);
        while (c0 != null) {
            if ((((wtc) c0.F.g).d & 262144) != 0) {
                while (wtcVar != null) {
                    if ((wtcVar.c & 262144) != 0) {
                        wtc wtcVar2 = wtcVar;
                        i1d i1dVar = null;
                        while (wtcVar2 != null) {
                            if (wtcVar2 instanceof jyj) {
                                jyj jyjVar = (jyj) wtcVar2;
                                if (obj.equals(jyjVar.s())) {
                                    return jyjVar;
                                }
                            }
                            if ((wtcVar2.c & 262144) != 0 && (wtcVar2 instanceof bw4)) {
                                int i = 0;
                                for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                    if ((wtcVar3.c & 262144) != 0) {
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
        return null;
    }

    public static final ChatUser D(UserAccount userAccount) {
        boolean z;
        boolean z2;
        userAccount.getClass();
        ia0 ia0Var = ia0.q;
        UserAccount e = ok3.p().e();
        String chatRole = e.getChatRole();
        if (Intrinsics.c(chatRole, "admin")) {
            z = true;
            z2 = false;
        } else if (Intrinsics.c(chatRole, "moderator")) {
            z2 = true;
            z = false;
        } else {
            z = false;
            z2 = false;
        }
        return new ChatUser(e.getId(), e.getNickname(), e.getIsLoggedIn(), z, false, z2, (String) null, (String) null, 0, 0, (UserBadge) null, 2000, (DefaultConstructorMarker) null);
    }

    public static k6c E(Context context) {
        SharedPreferences d;
        kp5 kp5Var = k6c.h;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        k6c k6cVar = (k6c) CollectionsKt.a0(sharedPreferences.getInt("PREF_FEED_DEFAULT_FILTER", 0), kp5Var);
        return k6cVar == null ? k6c.d : k6cVar;
    }

    public static Object F(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static final boolean G(UserAccount userAccount) {
        userAccount.getClass();
        if (userAccount.getForceAds()) {
            return true;
        }
        if (!userAccount.getHasServerAds() || userAccount.getPurchasedAds() || userAccount.getForceHideAds() || Intrinsics.c(userAccount.getDataSharingOptOut(), Boolean.TRUE)) {
            return false;
        }
        Boolean bool = y05.a;
        ia0 ia0Var = ia0.q;
        return !y05.a(ok3.p());
    }

    public static Object H(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return mz1.g(1, list);
        }
        yhk.d();
        return null;
    }

    public static final z0h I(Object obj) {
        if (obj != uh3.a) {
            return (z0h) obj;
        }
        a70.r("Does not contain segment");
        return null;
    }

    public static List J(StatisticsSeasonsResponse statisticsSeasonsResponse) {
        List<UniqueTournamentSeasons> uniqueTournamentSeasons = statisticsSeasonsResponse.getUniqueTournamentSeasons();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = uniqueTournamentSeasons.iterator();
        while (it.hasNext()) {
            o13.v(((UniqueTournamentSeasons) it.next()).getSeasons(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull(((Season) it2.next()).getYear());
            if (intOrNull != null) {
                arrayList2.add(intOrNull);
            }
        }
        List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList2));
        S0.getClass();
        i4g i4gVar = i4g.a;
        i4gVar.getClass();
        return CollectionsKt.H0(S0, i4gVar);
    }

    public static String K(Context context, UserBadge userBadge) {
        context.getClass();
        int i = userBadge == null ? -1 : u9f.a[userBadge.ordinal()];
        if (i == 1) {
            String string = context.getString(R.string.user_profile_moderator);
            string.getClass();
            return string;
        }
        if (i == 2) {
            String string2 = context.getString(R.string.user_status_editor);
            string2.getClass();
            return string2;
        }
        if (i == 3) {
            String string3 = context.getString(R.string.user_status_contributor);
            string3.getClass();
            return string3;
        }
        if (i != 4) {
            return "";
        }
        String string4 = context.getString(R.string.profile_badge_top_predictor);
        string4.getClass();
        return string4;
    }

    public static final boolean L(Object obj) {
        return obj == uh3.a;
    }

    public static final boolean M(UserAccount userAccount) {
        userAccount.getClass();
        return userAccount.getDevMod();
    }

    public static final float N(phe pheVar, boolean z, gf9[] gf9VarArr, float f) {
        float f2 = Float.NaN;
        for (gf9 gf9Var : gf9VarArr) {
            float a2 = pheVar.a(gf9Var);
            if (!Float.isNaN(f2)) {
                int i = z != (a2 > f2) ? i + 1 : 0;
            }
            f2 = a2;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O(xbe[] xbeVarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        xbe xbeVar;
        int i3;
        char c;
        float f;
        float f2;
        xbe xbeVar2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        xbe[] xbeVarArr2 = xbeVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = xbeVarArr2.length;
        int i4 = 0;
        int i5 = 0;
        char c2 = 'm';
        while (i5 < length) {
            xbe xbeVar3 = xbeVarArr2[i5];
            char c3 = xbeVar3.a;
            float[] fArr3 = xbeVar3.b;
            float f11 = fArr2[i4];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[3];
            float f15 = fArr2[4];
            int i6 = i4;
            float f16 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case INVALID_INDEX_URL_VALUE:
                    i = 4;
                    break;
                case 'Z':
                case INVALID_ADS_ENDPOINT_VALUE:
                    path2.close();
                    path2.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i7 = i6;
            while (i7 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i2 = i7;
                    xbeVar = xbeVar3;
                    float f21 = f19;
                    float f22 = f20;
                    i3 = i5;
                    c = c3;
                    int i8 = i2 + 5;
                    int i9 = i2 + 6;
                    xbe.a(path, f21, f22, fArr[i8], fArr[i9], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i6, fArr[i2 + 4] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i6);
                    f13 = fArr[i8];
                    f = fArr[i9];
                    f14 = f;
                    f2 = f13;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    xbeVar = xbeVar3;
                    c = c3;
                    int i10 = i2 + 2;
                    int i11 = i2 + 3;
                    int i12 = i2 + 4;
                    int i13 = i2 + 5;
                    path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i10], fArr[i11], fArr[i12], fArr[i13]);
                    float f23 = fArr[i12];
                    float f24 = fArr[i13];
                    f13 = fArr[i10];
                    f14 = fArr[i11];
                    f = f24;
                    f2 = f23;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i2 = i7;
                    xbeVar = xbeVar3;
                    c = c3;
                    f = f20;
                    i3 = i5;
                    path2.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    xbeVar = xbeVar3;
                    c = c3;
                    int i14 = i2 + 1;
                    int i15 = i2 + 2;
                    int i16 = i2 + 3;
                    path2.quadTo(fArr[i2], fArr[i14], fArr[i15], fArr[i16]);
                    float f25 = fArr[i2];
                    float f26 = fArr[i14];
                    float f27 = fArr[i15];
                    float f28 = fArr[i16];
                    f13 = f25;
                    f14 = f26;
                    f2 = f27;
                    f = f28;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i2 = i7;
                    i3 = i5;
                    xbeVar = xbeVar3;
                    f2 = f19;
                    c = c3;
                    path2.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i2 = i7;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        int i19 = i2 + 4;
                        int i20 = i2 + 5;
                        path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i17], fArr[i18], fArr[i19], fArr[i20]);
                        float f29 = fArr[i17] + f19;
                        float f30 = fArr[i18] + f20;
                        f19 += fArr[i19];
                        f20 += fArr[i20];
                        f13 = f29;
                        f14 = f30;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    int i21 = i2 + 1;
                                    path2.lineTo(fArr[i2], fArr[i21]);
                                    f2 = fArr[i2];
                                    f = fArr[i21];
                                } else if (c3 == 'M') {
                                    fArr = fArr3;
                                    i2 = i7;
                                    f2 = fArr[i2];
                                    f = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path2.lineTo(f2, f);
                                    } else {
                                        path2.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c3 != 'S') {
                                    if (c3 == 'T') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        int i22 = i2 + 1;
                                        path2.quadTo(f19, f20, fArr[i2], fArr[i22]);
                                        f2 = fArr[i2];
                                        f = fArr[i22];
                                        xbeVar = xbeVar3;
                                        f13 = f19;
                                        f14 = f20;
                                    } else if (c3 == 'l') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        int i23 = i2 + 1;
                                        path2.rLineTo(fArr[i2], fArr[i23]);
                                        f19 += fArr[i2];
                                        f6 = fArr[i23];
                                    } else if (c3 == 'm') {
                                        fArr = fArr3;
                                        i2 = i7;
                                        float f31 = fArr[i2];
                                        f19 += f31;
                                        float f32 = fArr[i2 + 1];
                                        f20 += f32;
                                        if (i2 > 0) {
                                            path2.rLineTo(f31, f32);
                                        } else {
                                            path2.rMoveTo(f31, f32);
                                            xbeVar = xbeVar3;
                                            f2 = f19;
                                            f17 = f2;
                                            f = f20;
                                            f18 = f;
                                        }
                                    } else if (c3 != 's') {
                                        if (c3 != 't') {
                                            fArr = fArr3;
                                            i2 = i7;
                                            xbeVar = xbeVar3;
                                            f2 = f19;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f9 = f19 - f13;
                                                f10 = f20 - f14;
                                            } else {
                                                f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            }
                                            int i24 = i7 + 1;
                                            path2.rQuadTo(f9, f10, fArr3[i7], fArr3[i24]);
                                            float f33 = f9 + f19;
                                            float f34 = f10 + f20;
                                            float f35 = f19 + fArr3[i7];
                                            f20 += fArr3[i24];
                                            f14 = f34;
                                            fArr = fArr3;
                                            i2 = i7;
                                            xbeVar = xbeVar3;
                                            f2 = f35;
                                            f13 = f33;
                                        }
                                        f = f20;
                                    } else {
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f7 = f20 - f14;
                                            f8 = f19 - f13;
                                        } else {
                                            f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        }
                                        int i25 = i7;
                                        int i26 = i25 + 1;
                                        int i27 = i25 + 2;
                                        int i28 = i25 + 3;
                                        fArr = fArr3;
                                        i2 = i25;
                                        path2.rCubicTo(f8, f7, fArr3[i25], fArr3[i26], fArr3[i27], fArr3[i28]);
                                        f3 = fArr[i2] + f19;
                                        f4 = fArr[i26] + f20;
                                        f19 += fArr[i27];
                                        f5 = fArr[i28];
                                    }
                                    i3 = i5;
                                    c = c3;
                                } else {
                                    fArr = fArr3;
                                    i2 = i7;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f36 = f19;
                                    float f37 = f20;
                                    int i29 = i2 + 1;
                                    int i30 = i2 + 2;
                                    int i31 = i2 + 3;
                                    path2.cubicTo(f36, f37, fArr[i2], fArr[i29], fArr[i30], fArr[i31]);
                                    f13 = fArr[i2];
                                    f14 = fArr[i29];
                                    f2 = fArr[i30];
                                    f = fArr[i31];
                                }
                                i3 = i5;
                                xbeVar = xbeVar3;
                                c = c3;
                            } else {
                                fArr = fArr3;
                                i2 = i7;
                                path2.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr[i2]);
                                f6 = fArr[i2];
                            }
                            f20 += f6;
                        } else {
                            fArr = fArr3;
                            i2 = i7;
                            int i32 = i2 + 1;
                            int i33 = i2 + 2;
                            int i34 = i2 + 3;
                            path2.rQuadTo(fArr[i2], fArr[i32], fArr[i33], fArr[i34]);
                            f3 = fArr[i2] + f19;
                            f4 = fArr[i32] + f20;
                            f19 += fArr[i33];
                            f5 = fArr[i34];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr = fArr3;
                        i2 = i7;
                        path2.rLineTo(fArr[i2], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        f19 += fArr[i2];
                    }
                    xbeVar = xbeVar3;
                    f2 = f19;
                    f = f20;
                    i3 = i5;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i2 = i7;
                    int i35 = i2 + 5;
                    float f38 = fArr[i35] + f19;
                    int i36 = i2 + 6;
                    float f39 = fArr[i36] + f20;
                    float f40 = fArr[i2];
                    float f41 = fArr[i2 + 1];
                    float f42 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        xbeVar2 = xbeVar3;
                        z = 1;
                    } else {
                        xbeVar2 = xbeVar3;
                        z = i6;
                    }
                    xbeVar = xbeVar2;
                    float f43 = f19;
                    c = c3;
                    float f44 = f20;
                    i3 = i5;
                    xbe.a(path, f43, f44, f38, f39, f40, f41, f42, z, fArr[i2 + 4] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i6);
                    f2 = f43 + fArr[i35];
                    f = f44 + fArr[i36];
                    f13 = f2;
                    f14 = f;
                }
                i7 = i2 + i;
                path2 = path;
                xbeVar3 = xbeVar;
                c3 = c;
                i5 = i3;
                f19 = f2;
                f20 = f;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i6] = f19;
            fArr2[1] = f20;
            fArr2[2] = f13;
            fArr2[3] = f14;
            fArr2[4] = f17;
            fArr2[5] = f18;
            c2 = xbeVar3.a;
            i5++;
            xbeVarArr2 = xbeVarArr;
            path2 = path;
            i4 = i6;
        }
    }

    public static final float P(long j, float f, kx4 kx4Var) {
        float c;
        long b2 = lfj.b(j);
        if (mfj.a(b2, 4294967296L)) {
            if (kx4Var.getFontScale() <= 1.05d) {
                return kx4Var.h0(j);
            }
            c = lfj.c(j) / lfj.c(kx4Var.O(f));
        } else {
            if (!mfj.a(b2, 8589934592L)) {
                return Float.NaN;
            }
            c = lfj.c(j);
        }
        return c * f;
    }

    public static final void Q(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(hkg.s0(j)), i, i2, 33);
        }
    }

    public static final void R(Spannable spannable, long j, kx4 kx4Var, int i, int i2) {
        long b2 = lfj.b(j);
        if (mfj.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(wzb.b(kx4Var.h0(j)), false), i, i2, 33);
        } else if (mfj.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(lfj.c(j)), i, i2, 33);
        }
    }

    public static final void S(ViewGroup viewGroup, Integer num, Integer num2) {
        viewGroup.getClass();
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (num != null) {
            layoutParams.width = num.intValue();
        }
        if (num2 != null) {
            layoutParams.height = num2.intValue();
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    public static final void T(Spannable spannable, eib eibVar, int i, int i2) {
        if (eibVar != null) {
            ArrayList arrayList = new ArrayList(k13.r(eibVar, 10));
            Iterator it = eibVar.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((dib) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static boolean U(Context context) {
        SharedPreferences d;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        String string = sharedPreferences.getString("PREF_HOME_SCREEN", "");
        String lowerCase = "FEED".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!Intrinsics.c(string, lowerCase)) {
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = context.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences2 = a5f.d(applicationContext2);
                    uic.j = sharedPreferences2;
                }
                sharedPreferences2.getClass();
            }
            if (!sharedPreferences2.getBoolean("PRIMARY_TAB_PROMPT_DISMISSED", false)) {
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = context.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext3);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences3 = d;
                }
                if (sharedPreferences3.getInt("NUMBER_OF_FEED_OPENINGS", 0) >= 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (r2.getLong("PREF_FEED_UPDATE_TIMESTAMP", 0) == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0089, code lost:
    
        if (r0 != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean V(Context context) {
        SharedPreferences d;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        boolean z = true;
        boolean z2 = 260720003 != sharedPreferences.getInt("PREF_FEED_UPDATE_ON_VERSION", 260720003);
        yea yeaVar = j58.a;
        e58 f = e58.f();
        f.getClass();
        if (260720003 < ((int) f.d("feed_min_version"))) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences2 = uic.j;
            if (sharedPreferences2 == null) {
                Context applicationContext2 = context.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences2 = a5f.d(applicationContext2);
                    uic.j = sharedPreferences2;
                }
                sharedPreferences2.getClass();
            }
            if (currentTimeMillis > sharedPreferences2.getLong("PREF_FEED_UPDATE_TIMESTAMP", 0L)) {
                SharedPreferences sharedPreferences3 = uic.j;
                if (sharedPreferences3 == null) {
                    Context applicationContext3 = context.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences3 = a5f.d(applicationContext3);
                        uic.j = sharedPreferences3;
                    }
                    sharedPreferences3.getClass();
                }
            }
        }
        z = false;
        if (z2) {
            SharedPreferences sharedPreferences4 = uic.j;
            if (sharedPreferences4 == null) {
                Context applicationContext4 = context.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext4);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences4 = d;
            }
            SharedPreferences.Editor edit = sharedPreferences4.edit();
            edit.getClass();
            edit.putInt("PREF_FEED_UPDATE_COUNTER", 0);
            Unit unit = Unit.a;
            edit.apply();
        }
        return z;
    }

    public static void W(List list, m3f m3fVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (m3fVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [wtc] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void X(xv4 xv4Var, Object obj, Function1 function1) {
        c40 c40Var;
        if (!((wtc) xv4Var).a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar = ((wtc) xv4Var).a.e;
        wma c0 = c6o.c0(xv4Var);
        while (c0 != null) {
            if ((((wtc) c0.F.g).d & 262144) != 0) {
                while (wtcVar != null) {
                    if ((wtcVar.c & 262144) != 0) {
                        bw4 bw4Var = wtcVar;
                        ?? r4 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof jyj) {
                                jyj jyjVar = (jyj) bw4Var;
                                if (!(obj.equals(jyjVar.s()) ? ((Boolean) function1.invoke(jyjVar)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((bw4Var.c & 262144) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar2 = bw4Var.p;
                                int i = 0;
                                bw4Var = bw4Var;
                                r4 = r4;
                                while (wtcVar2 != null) {
                                    if ((wtcVar2.c & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            bw4Var = wtcVar2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r4.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r4.b(wtcVar2);
                                        }
                                    }
                                    wtcVar2 = wtcVar2.f;
                                    bw4Var = bw4Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            bw4Var = c6o.X(r4);
                        }
                    }
                    wtcVar = wtcVar.e;
                }
            }
            c0 = c0.v();
            wtcVar = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, jyj, xv4] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [wtc] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [wtc] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void Y(jyj jyjVar, Function1 function1) {
        c40 c40Var;
        wtc wtcVar = (wtc) jyjVar;
        if (!wtcVar.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar2 = wtcVar.a.e;
        wma c0 = c6o.c0(jyjVar);
        while (c0 != null) {
            if ((((wtc) c0.F.g).d & 262144) != 0) {
                while (wtcVar2 != null) {
                    if ((wtcVar2.c & 262144) != 0) {
                        bw4 bw4Var = wtcVar2;
                        ?? r5 = 0;
                        while (bw4Var != 0) {
                            boolean z = true;
                            if (bw4Var instanceof jyj) {
                                jyj jyjVar2 = (jyj) bw4Var;
                                if (Intrinsics.c(jyjVar.s(), jyjVar2.s()) && jyjVar.getClass() == jyjVar2.getClass()) {
                                    z = ((Boolean) function1.invoke(jyjVar2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((bw4Var.c & 262144) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar3 = bw4Var.p;
                                int i = 0;
                                bw4Var = bw4Var;
                                r5 = r5;
                                while (wtcVar3 != null) {
                                    if ((wtcVar3.c & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            bw4Var = wtcVar3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r5.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r5.b(wtcVar3);
                                        }
                                    }
                                    wtcVar3 = wtcVar3.f;
                                    bw4Var = bw4Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            bw4Var = c6o.X(r5);
                        }
                    }
                    wtcVar2 = wtcVar2.e;
                }
            }
            c0 = c0.v();
            wtcVar2 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [wtc] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void Z(wtc wtcVar, String str, Function1 function1) {
        if (!wtcVar.a.n) {
            r3a.b("visitSubtreeIf called on an unattached node");
        }
        i1d i1dVar = new i1d(new wtc[16], 0);
        wtc wtcVar2 = wtcVar.a;
        wtc wtcVar3 = wtcVar2.f;
        if (wtcVar3 == null) {
            c6o.x(i1dVar, wtcVar2);
        } else {
            i1dVar.b(wtcVar3);
        }
        while (true) {
            int i = i1dVar.c;
            if (i == 0) {
                return;
            }
            wtc wtcVar4 = (wtc) i1dVar.r(i - 1);
            if ((wtcVar4.d & 262144) != 0) {
                for (wtc wtcVar5 = wtcVar4; wtcVar5 != null && wtcVar5.n; wtcVar5 = wtcVar5.f) {
                    if ((wtcVar5.c & 262144) != 0) {
                        bw4 bw4Var = wtcVar5;
                        ?? r7 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof jyj) {
                                jyj jyjVar = (jyj) bw4Var;
                                iyj iyjVar = str.equals(jyjVar.s()) ? (iyj) function1.invoke(jyjVar) : iyj.a;
                                if (iyjVar == iyj.c) {
                                    return;
                                }
                                if (iyjVar == iyj.b) {
                                    break;
                                }
                            } else if ((bw4Var.c & 262144) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar6 = bw4Var.p;
                                int i2 = 0;
                                bw4Var = bw4Var;
                                r7 = r7;
                                while (wtcVar6 != null) {
                                    if ((wtcVar6.c & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            bw4Var = wtcVar6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r7.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r7.b(wtcVar6);
                                        }
                                    }
                                    wtcVar6 = wtcVar6.f;
                                    bw4Var = bw4Var;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            bw4Var = c6o.X(r7);
                        }
                    }
                }
            }
            c6o.x(i1dVar, wtcVar4);
        }
    }

    public static final void a(Object obj, int i, bra braVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(braVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(tc3Var) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean g = av8Var.g(obj) | av8Var.g(braVar);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = new ara(obj, braVar);
                av8Var.n0(O);
            }
            ara araVar = (ara) O;
            araVar.c = i;
            e1d e1dVar = araVar.g;
            ff5 ff5Var = tge.a;
            ara araVar2 = (ara) av8Var.k(ff5Var);
            nnh w = bea.w();
            Function1 e = w != null ? w.e() : null;
            nnh C = bea.C(w);
            try {
                if (araVar2 != ((ara) ((eoh) e1dVar).getValue())) {
                    ((eoh) e1dVar).setValue(araVar2);
                    if (araVar.d > 0) {
                        ara araVar3 = araVar.e;
                        if (araVar3 != null) {
                            araVar3.b();
                        }
                        if (araVar2 != null) {
                            araVar2.a();
                        } else {
                            araVar2 = null;
                        }
                        araVar.e = araVar2;
                    }
                }
                Unit unit = Unit.a;
                bea.K(w, C, e);
                boolean g2 = av8Var.g(araVar);
                Object O2 = av8Var.O();
                if (g2 || O2 == a99Var) {
                    O2 = new ida(araVar, 7);
                    av8Var.n0(O2);
                }
                hz8.d(araVar, (Function1) O2, av8Var);
                tol.b(ff5Var.a(araVar), tc3Var, av8Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                bea.K(w, C, e);
                throw th;
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(obj, i, braVar, tc3Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, jyj] */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [wtc] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [wtc] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [i1d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [i1d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void a0(jyj jyjVar, Function1 function1) {
        wtc wtcVar = (wtc) jyjVar;
        if (!wtcVar.a.n) {
            r3a.b("visitSubtreeIf called on an unattached node");
        }
        i1d i1dVar = new i1d(new wtc[16], 0);
        wtc wtcVar2 = wtcVar.a;
        wtc wtcVar3 = wtcVar2.f;
        if (wtcVar3 == null) {
            c6o.x(i1dVar, wtcVar2);
        } else {
            i1dVar.b(wtcVar3);
        }
        while (true) {
            int i = i1dVar.c;
            if (i == 0) {
                return;
            }
            wtc wtcVar4 = (wtc) i1dVar.r(i - 1);
            if ((wtcVar4.d & 262144) != 0) {
                for (wtc wtcVar5 = wtcVar4; wtcVar5 != null && wtcVar5.n; wtcVar5 = wtcVar5.f) {
                    if ((wtcVar5.c & 262144) != 0) {
                        bw4 bw4Var = wtcVar5;
                        ?? r8 = 0;
                        while (bw4Var != 0) {
                            if (bw4Var instanceof jyj) {
                                jyj jyjVar2 = (jyj) bw4Var;
                                iyj iyjVar = (Intrinsics.c(jyjVar.s(), jyjVar2.s()) && jyjVar.getClass() == jyjVar2.getClass()) ? (iyj) function1.invoke(jyjVar2) : iyj.a;
                                if (iyjVar == iyj.c) {
                                    return;
                                }
                                if (iyjVar == iyj.b) {
                                    break;
                                }
                            } else if ((bw4Var.c & 262144) != 0 && (bw4Var instanceof bw4)) {
                                wtc wtcVar6 = bw4Var.p;
                                int i2 = 0;
                                bw4Var = bw4Var;
                                r8 = r8;
                                while (wtcVar6 != null) {
                                    if ((wtcVar6.c & 262144) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            bw4Var = wtcVar6;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new i1d(new wtc[16], 0);
                                            }
                                            if (bw4Var != 0) {
                                                r8.b(bw4Var);
                                                bw4Var = 0;
                                            }
                                            r8.b(wtcVar6);
                                        }
                                    }
                                    wtcVar6 = wtcVar6.f;
                                    bw4Var = bw4Var;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            bw4Var = c6o.X(r8);
                        }
                    }
                }
            }
            c6o.x(i1dVar, wtcVar4);
        }
    }

    public static final void b(d6b d6bVar, u6b u6bVar, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-709389590);
        int i2 = i | 16;
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                u6bVar = (u6b) av8Var.k(mhb.a);
            } else {
                av8Var.W();
            }
            av8Var.t();
            if (d6bVar == d6b.ON_DESTROY) {
                a70.p("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            e1d g = e.g(function0, av8Var);
            boolean g2 = av8Var.g(g) | av8Var.i(u6bVar);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                O = new dr6(24, u6bVar, d6bVar, g);
                av8Var.n0(O);
            }
            hz8.d(u6bVar, (Function1) O, av8Var);
        } else {
            av8Var.W();
        }
        u6b u6bVar2 = u6bVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(d6bVar, u6bVar2, function0, i, 12);
        }
    }

    public static /* synthetic */ String b0(int i, int i2, byte b2, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b2 + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public static final void c(Object obj, u6b u6bVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1220373486);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 16 | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                u6bVar = (u6b) av8Var.k(mhb.a);
            } else {
                av8Var.W();
            }
            int i4 = i3 & (-113);
            av8Var.t();
            boolean g = av8Var.g(obj) | av8Var.g(u6bVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new a7b(u6bVar.getLifecycle());
                av8Var.n0(O);
            }
            d(u6bVar, (a7b) O, function1, av8Var, i4 & 896);
        } else {
            av8Var.W();
        }
        u6b u6bVar2 = u6bVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(obj, u6bVar2, function1, i, 14);
        }
    }

    public static void c0(boolean z) {
        if (z) {
            return;
        }
        ilg.c();
    }

    public static final void d(u6b u6bVar, a7b a7bVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(912823238);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(u6bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(a7bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean i3 = av8Var.i(a7bVar) | ((i2 & 896) == 256) | av8Var.i(u6bVar);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new dr6(26, u6bVar, a7bVar, function1);
                av8Var.n0(O);
            }
            hz8.b(u6bVar, a7bVar, (Function1) O, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(u6bVar, a7bVar, function1, i, 11);
        }
    }

    public static void d0(String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(str);
    }

    public static final void e(Boolean bool, Object obj, u6b u6bVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(696924721);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function1) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                u6bVar = (u6b) av8Var.k(mhb.a);
            } else {
                av8Var.W();
            }
            int i3 = i2 & (-897);
            av8Var.t();
            boolean g = av8Var.g(bool) | av8Var.g(obj) | av8Var.g(u6bVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new f7b(u6bVar.getLifecycle());
                av8Var.n0(O);
            }
            g(u6bVar, (f7b) O, function1, av8Var, (i3 >> 3) & 896);
        } else {
            av8Var.W();
        }
        u6b u6bVar2 = u6bVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(bool, obj, u6bVar2, function1, i, 20);
        }
    }

    public static void e0(int i, int i2) {
        String O;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                O = wca.O("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a70.p(me4.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                O = wca.O("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(O);
        }
    }

    public static final void f(Object obj, u6b u6bVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1408314671);
        int i2 = i | 16 | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                u6bVar = (u6b) av8Var.k(mhb.a);
            } else {
                av8Var.W();
            }
            int i3 = i2 & (-113);
            av8Var.t();
            boolean g = av8Var.g(obj) | av8Var.g(u6bVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new f7b(u6bVar.getLifecycle());
                av8Var.n0(O);
            }
            g(u6bVar, (f7b) O, function1, av8Var, i3 & 896);
        } else {
            av8Var.W();
        }
        u6b u6bVar2 = u6bVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(i, 26, obj, u6bVar2, function1);
        }
    }

    public static void f0(int i, int i2) {
        if (i < 0 || i > i2) {
            zzl.r(h0(i, i2, "index"));
        }
    }

    public static final void g(u6b u6bVar, f7b f7bVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(228371534);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(u6bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(f7bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? 256 : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean i3 = av8Var.i(f7bVar) | ((i2 & 896) == 256) | av8Var.i(u6bVar);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new dr6(25, u6bVar, f7bVar, function1);
                av8Var.n0(O);
            }
            hz8.b(u6bVar, f7bVar, (Function1) O, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(u6bVar, f7bVar, function1, i, 13);
        }
    }

    public static void g0(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? h0(i, i3, "start index") : (i2 < 0 || i2 > i3) ? h0(i2, i3, "end index") : wca.O("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static final void h(xtc xtcVar, w31 w31Var, Function1 function1, ct8 ct8Var, wla wlaVar, of3 of3Var, int i) {
        xtcVar.getClass();
        w31Var.getClass();
        function1.getClass();
        ct8Var.getClass();
        wlaVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(954008745);
        int i2 = i | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.g(w31Var) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(ct8Var) ? a.o : 1024) | (av8Var.g(wlaVar) ? 16384 : 8192);
        if (!av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            av8Var.W();
        } else if (w31Var instanceof f41) {
            av8Var.d0(1076256024);
            f41 f41Var = (f41) w31Var;
            if (f41Var instanceof v39) {
                av8Var.d0(1974381784);
                qx9.h((v39) w31Var, function1, ct8Var, wlaVar, xtcVar, av8Var, ((i2 >> 3) & 8190) | ((i2 << 12) & 57344));
                av8Var.s(false);
            } else if (f41Var instanceof d49) {
                av8Var.d0(1974385812);
                j((d49) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
                av8Var.s(false);
            } else if (f41Var instanceof z39) {
                av8Var.d0(1974389046);
                int i3 = i2 >> 3;
                v9g.h((z39) w31Var, wlaVar, ct8Var, xtcVar, av8Var, (i3 & 896) | (i3 & 14) | ((i2 >> 9) & 112) | ((i2 << 9) & 7168));
                av8Var = av8Var;
                av8Var.s(false);
            } else if (f41Var instanceof f49) {
                av8Var.d0(1974393235);
                int i4 = i2 >> 3;
                h5a.t((f49) w31Var, wlaVar, ct8Var, xtcVar, av8Var, (i4 & 896) | (i4 & 14) | ((i2 >> 9) & 112) | ((i2 << 9) & 7168));
                av8Var = av8Var;
                av8Var.s(false);
            } else if (f41Var instanceof e49) {
                av8Var.d0(1974397572);
                jaa.i((e49) w31Var, wlaVar, function1, ct8Var, xtcVar, av8Var, ((i2 >> 3) & 14) | ((i2 >> 9) & 112) | (i2 & 896) | (i2 & 7168) | ((i2 << 12) & 57344));
                av8Var.s(false);
            } else if (f41Var instanceof b49) {
                av8Var.d0(1974402210);
                s9a.h((b49) w31Var, wlaVar, function1, ct8Var, xtcVar, av8Var, ((i2 >> 3) & 14) | ((i2 >> 9) & 112) | (i2 & 896) | (i2 & 7168) | ((i2 << 12) & 57344));
                av8Var.s(false);
            } else {
                av8Var.d0(1077025785);
                av8Var.s(false);
            }
            av8Var.s(false);
        } else if (w31Var instanceof c56) {
            av8Var.d0(1974408030);
            wca.d((c56) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof wa6) {
            av8Var.d0(1974411069);
            fcp.N((wa6) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof fdd) {
            av8Var.d0(1974413926);
            kda.c(i2 & 14, av8Var, xtcVar);
            av8Var.s(false);
        } else if (w31Var instanceof cqk) {
            av8Var.d0(1974416254);
            yaa.h((cqk) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof b94) {
            av8Var.d0(1974419067);
            ml4.m((b94) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof y80) {
            av8Var.d0(1974422174);
            ao2.b((y80) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof u8b) {
            av8Var.d0(1974425015);
            sea.c((u8b) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof bt1) {
            av8Var.d0(1974428134);
            l6g.c((bt1) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof jsh) {
            av8Var.d0(1974431388);
            u0a.l((jsh) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof zuh) {
            av8Var.d0(1974434431);
            v8a.e((zuh) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof gla) {
            av8Var.d0(1974437633);
            h5a.g((gla) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof z6j) {
            av8Var.d0(1974441062);
            wca.i((z6j) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof dh8) {
            av8Var.d0(1974444646);
            z8e.k((dh8) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof otg) {
            av8Var.d0(1974447933);
            d7a.i((otg) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof m6j) {
            av8Var.d0(1974450875);
            yaa.g((m6j) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof sk8) {
            av8Var.d0(1974454085);
            fqj.m((sk8) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof tl8) {
            av8Var.d0(1974457539);
            c5n.m((tl8) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof zr1) {
            av8Var.d0(1974461063);
            qx9.b((zr1) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof ss1) {
            av8Var.d0(1974464645);
            n9e.a((ss1) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof bq9) {
            av8Var.d0(1974468198);
            iz8.l((bq9) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof fq9) {
            av8Var.d0(1974471716);
            qx9.i((fq9) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof sre) {
            av8Var.d0(1974474941);
            g7a.g((sre) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else if (w31Var instanceof qu8) {
            av8Var.d0(1974477850);
            pd0.g((qu8) w31Var, function1, xtcVar, av8Var, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 << 6) & 896));
            av8Var.s(false);
        } else {
            if (!(w31Var instanceof zbd) && !(w31Var instanceof il6) && !(w31Var instanceof ShortVideoFeedCardModel) && !(w31Var instanceof c3f) && !(w31Var instanceof bmd) && !(w31Var instanceof nte) && !(w31Var instanceof mvc) && !(w31Var instanceof fnk) && !(w31Var instanceof daa) && !(w31Var instanceof euh)) {
                throw dmi.h(av8Var, 1974380274, false);
            }
            av8Var.d0(1079629847);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere(xtcVar, w31Var, function1, ct8Var, wlaVar, i, 21);
        }
    }

    public static String h0(int i, int i2, String str) {
        if (i < 0) {
            return wca.O("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wca.O("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a70.p(me4.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String str, String str2, String str3, ImageVector imageVector, xtc xtcVar, Function2 function2, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        Function2 function22;
        int i4;
        Function2 function23;
        eqf u;
        Function2 function24;
        utc utcVar;
        str.getClass();
        str2.getClass();
        imageVector.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1395954592);
        int i5 = (av8Var.g(str) ? 4 : 2) | i | (av8Var.g(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= av8Var.g(str3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i5 | (av8Var.g(imageVector) ? a.o : 1024);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 |= 24576;
        } else if ((i & 24576) == 0) {
            xtcVar2 = xtcVar;
            i6 |= av8Var.g(xtcVar2) ? 16384 : 8192;
            i3 = i2 & 32;
            if (i3 == 0) {
                i6 |= 196608;
            } else if ((196608 & i) == 0) {
                function22 = function2;
                i6 |= av8Var.i(function22) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i4 = i6;
                if (av8Var.T(i4 & 1, (i4 & 74899) != 74898)) {
                    utc utcVar2 = utc.a;
                    xtc xtcVar3 = i7 != 0 ? utcVar2 : xtcVar2;
                    if (i3 != 0) {
                        function22 = null;
                    }
                    lv1 lv1Var = uxf.m;
                    xtc xtcVar4 = xtcVar3;
                    xtc c0 = l98.c0(n9e.q(bkh.d(d2a.E(xtcVar3, 4.0f, o7g.a(16.0f), false, 0L, 28), 1.0f), lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f, 12.0f);
                    wxf wxfVar = ww9.b;
                    l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
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
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    Function2 function25 = function22;
                    kq9.b(imageVector, null, ljg.h(8.0f, bkh.l(utcVar2, 40.0f), lz.D(R.color.ic_launcher_background, av8Var), 4.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, ((i4 >> 9) & 14) | 48, 0);
                    nq8.h(av8Var, bkh.p(utcVar2, 12.0f));
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, goaVar);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, utcVar2);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a4, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var3);
                    yf8 yf8Var = xth.a;
                    dfj e = xth.e();
                    long D = lz.D(R.color.n_lv_1, av8Var);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    udj.c(str, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e, av8Var, i4 & 14, 24960, 110584);
                    av8 av8Var2 = av8Var;
                    if (str3 == null) {
                        av8Var2.d0(746306012);
                        av8Var2.s(false);
                        function24 = function25;
                        utcVar = utcVar2;
                    } else {
                        av8Var2.d0(746306013);
                        e12.a(0, av8Var2, n9e.q(bkh.l(l98.d0(utcVar2, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 3.0f), lz.D(R.color.n_lv_3, av8Var2), o7g.a));
                        function24 = function25;
                        utcVar = utcVar2;
                        udj.c(str3, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, (i4 >> 6) & 14, 0, 131066);
                        av8Var2 = av8Var2;
                        Unit unit = Unit.a;
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                    nq8.h(av8Var2, bkh.e(utcVar, 4.0f));
                    av8 av8Var3 = av8Var2;
                    utc utcVar3 = utcVar;
                    udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.g(), av8Var3, (i4 >> 3) & 14, 24960, 110586);
                    av8Var = av8Var3;
                    av8Var.s(true);
                    Function2 function26 = function24;
                    if (function26 == null) {
                        av8Var.d0(-95482676);
                        av8Var.s(false);
                    } else {
                        ljg.r(8.0f, -95482675, av8Var, av8Var, utcVar3);
                        function26.invoke(av8Var, 0);
                        Unit unit2 = Unit.a;
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    function23 = function26;
                    xtcVar2 = xtcVar4;
                } else {
                    av8Var.W();
                    function23 = function22;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new hk2(str, str2, str3, imageVector, xtcVar2, function23, i, i2);
                    return;
                }
                return;
            }
            function22 = function2;
            i4 = i6;
            if (av8Var.T(i4 & 1, (i4 & 74899) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        function22 = function2;
        i4 = i6;
        if (av8Var.T(i4 & 1, (i4 & 74899) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void j(d49 d49Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        gv9 gv9Var = d49Var.m;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(919559518);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(d49Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i2 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            xtcVar2 = xtcVar;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean g = av8Var.g(gv9Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zbd) it.next()).n());
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            int i3 = d49Var.o;
            boolean z = (i2 & 112) == 32;
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                O2 = new o34(11, function1);
                av8Var.n0(O2);
            }
            m(gv9Var2, (Function2) O2, xtcVar2, false, Integer.valueOf(i3), null, null, av8Var, i2 & 896, 104);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(d49Var, function1, xtcVar, i, 21);
        }
    }

    public static final void k(Integer num, String str, xtc xtcVar, boolean z, Function0 function0, of3 of3Var, int i) {
        int i2;
        boolean z2;
        String str2;
        boolean z3;
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1295242928);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.h(z) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function0) ? 16384 : 8192;
        }
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z) {
                av8Var.d0(1128217253);
                z2 = false;
                kq9.b(s6a.N(R.drawable.ic_menu_list_whats_new, 6, av8Var), null, null, lz.D(R.color.primary_default, av8Var), av8Var, 48, 4);
                av8Var.s(false);
            } else {
                z2 = false;
                av8Var.d0(1128428022);
                av8Var.s(false);
            }
            float f = z ? 16.0f : 8.0f;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            if (str == null) {
                av8Var.d0(1128558966);
                if (num != null && num.intValue() == 0) {
                    i3 = 174953591;
                    i4 = R.string.feed_top_news;
                } else if (num != null && num.intValue() == 1) {
                    i3 = 174955686;
                    i4 = R.string.feed_based_on_your_interests;
                } else {
                    i3 = 174958336;
                    i4 = R.string.feed_more_news_for_you;
                }
                str2 = ljg.k(av8Var, i3, i4, av8Var, z2);
                av8Var.s(z2);
            } else {
                av8Var.d0(174952181);
                av8Var.s(z2);
                str2 = str;
            }
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str2, f0, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131064);
            w1l.o(1.0f, true, av8Var);
            if (function0 != null) {
                av8Var.d0(1128986456);
                String v = oea.v(R.string.see_more, av8Var);
                av8Var = av8Var;
                z3 = true;
                tz9.s((i2 >> 9) & 112, 4, av8Var, null, v, function0);
                bf3.u(utcVar, 8.0f, av8Var, z2);
            } else {
                av8Var = av8Var;
                z3 = true;
                av8Var.d0(1129199798);
                av8Var.s(z2);
            }
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(num, str, xtcVar, z, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(ecd ecdVar, xtc xtcVar, boolean z, boolean z2, Function2 function2, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        Function2 function22;
        xtc xtcVar3;
        boolean z5;
        boolean z6;
        Function2 function23;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-546022543);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(ecdVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= av8Var.h(z3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= av8Var.h(z4) ? a.o : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function22 = function2;
                        i3 |= av8Var.i(function22) ? 16384 : 8192;
                        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
                            xtc xtcVar4 = i7 != 0 ? utc.a : xtcVar2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            boolean z7 = i5 != 0 ? false : z4;
                            Function2 function24 = i6 != 0 ? null : function22;
                            un0.a(l98.f0(xtcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 7), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), rd0.u(z7 ? 4.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62), null, yqo.H(386895807, av8Var, new l4b(z3, function24, ecdVar, 6)), av8Var, 196608, 16);
                            z6 = z7;
                            z5 = z3;
                            function23 = function24;
                            xtcVar3 = xtcVar4;
                        } else {
                            av8Var.W();
                            xtcVar3 = xtcVar2;
                            z5 = z3;
                            z6 = z4;
                            function23 = function22;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new e82(ecdVar, xtcVar3, z5, z6, function23, i, i2);
                            return;
                        }
                        return;
                    }
                    function22 = function2;
                    if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function22 = function2;
                if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function22 = function2;
            if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function22 = function2;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(gv9 gv9Var, Function2 function2, xtc xtcVar, boolean z, Integer num, String str, Function0 function0, of3 of3Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        String str2;
        int i6;
        boolean z3;
        av8 av8Var;
        String str3;
        Integer num2;
        Function0 function02;
        eqf u;
        gv9Var.getClass();
        function2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-325269884);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(gv9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= av8Var2.h(z2) ? a.o : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= av8Var2.g(num) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    str2 = str;
                    i3 |= av8Var2.g(str2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        i3 |= av8Var2.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
                            boolean z4 = i7 != 0 ? true : z2;
                            Integer num3 = i4 != 0 ? null : num;
                            String str4 = i5 != 0 ? null : str2;
                            Function0 function03 = i6 != 0 ? null : function0;
                            if (gv9Var.size() >= 3) {
                                av8Var2.d0(-668538865);
                                xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var2, 6);
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
                                int i8 = i3 >> 12;
                                k(num3, str4, l98.f0(utc.a, 4.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 4), z4, function03, av8Var2, (i8 & 112) | (i8 & 14) | 384 | (i3 & 7168) | ((i3 >> 6) & 57344));
                                int i9 = i3;
                                wba.d(((ecd) gv9Var.get(0)).a, ((ecd) gv9Var.get(0)).f, ((ecd) gv9Var.get(0)).b, Long.valueOf(((ecd) gv9Var.get(0)).d), ((ecd) gv9Var.get(0)).g, function2, null, null, av8Var2, (i3 << 12) & 458752, PsExtractor.AUDIO_STREAM);
                                av8Var2 = av8Var2;
                                l((ecd) gv9Var.get(1), null, false, false, function2, av8Var2, (i9 << 9) & 57344, 14);
                                o(gv9Var.subList(2, gv9Var.size()), function2, av8Var2, i9 & 112);
                                av8Var2.s(true);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(-667540386);
                                av8Var2.s(false);
                            }
                            av8Var = av8Var2;
                            num2 = num3;
                            str3 = str4;
                            z3 = z4;
                            function02 = function03;
                        } else {
                            av8Var2.W();
                            z3 = z2;
                            av8Var = av8Var2;
                            str3 = str2;
                            num2 = num;
                            function02 = function0;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new x72(gv9Var, function2, xtcVar, z3, num2, str3, function02, i, i2);
                            return;
                        }
                        return;
                    }
                    if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final NewsProvider newsProvider, long j, xtc xtcVar, boolean z, long j2, long j3, of3 of3Var, final int i, final int i2) {
        xtc xtcVar2;
        int i3;
        boolean z2;
        long j4;
        int i4;
        long j5;
        int i5;
        int i6;
        final xtc xtcVar3;
        final boolean z3;
        final long j6;
        final long j7;
        eqf u;
        long j8;
        int i7;
        long j9;
        long j10;
        utc utcVar;
        int i8;
        String str;
        final long j11 = j;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-893819352);
        int i9 = (av8Var.i(newsProvider) ? 4 : 2) | i | (av8Var.f(j11) ? 32 : 16);
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 = i9 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i9 | (av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= av8Var.h(z2) ? a.o : 1024;
            if ((i2 & 16) != 0) {
                j4 = j2;
                if (av8Var.f(j4)) {
                    i4 = 16384;
                    int i12 = i3 | i4;
                    if ((i2 & 32) == 0) {
                        j5 = j3;
                        if (av8Var.f(j5)) {
                            i5 = 131072;
                            i6 = i12 | i5;
                            if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
                                av8Var.W();
                                xtcVar3 = xtcVar2;
                                z3 = z2;
                                j6 = j4;
                                j7 = j5;
                            } else {
                                av8Var.Y();
                                int i13 = i & 1;
                                utc utcVar2 = utc.a;
                                if (i13 == 0 || av8Var.B()) {
                                    if (i10 != 0) {
                                        xtcVar2 = utcVar2;
                                    }
                                    if (i11 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 16) != 0) {
                                        j8 = lz.D(R.color.n_lv_3, av8Var);
                                        i6 &= -57345;
                                    } else {
                                        j8 = j4;
                                    }
                                    if ((i2 & 32) != 0) {
                                        j10 = j8;
                                        i7 = i6 & (-458753);
                                        j9 = lz.D(R.color.n_lv_4, av8Var);
                                    } else {
                                        i7 = i6;
                                        j9 = j5;
                                        j10 = j8;
                                    }
                                } else {
                                    av8Var.W();
                                    if ((i2 & 16) != 0) {
                                        i6 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i6 &= -458753;
                                    }
                                    i7 = i6;
                                    j9 = j5;
                                    j10 = j4;
                                }
                                av8Var.t();
                                int i14 = i7 >> 6;
                                l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                                int hashCode = Long.hashCode(av8Var.T);
                                aee m = av8Var.m();
                                xtc C = fqj.C(av8Var, xtcVar2);
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
                                td4.A(newsProvider != null ? newsProvider.getId() : 0, 48, av8Var, bkh.l(utcVar2, 16.0f));
                                if (z2) {
                                    av8Var.d0(878038581);
                                    xtc f0 = l98.f0(utcVar2, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                                    utcVar = utcVar2;
                                    if (newsProvider == null || (str = newsProvider.getName()) == null) {
                                        str = "";
                                    }
                                    String str2 = str;
                                    yf8 yf8Var = xth.a;
                                    udj.c(str2, f0, j10, null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.g(), av8Var, (i14 & 896) | 48, 384, 126968);
                                    i8 = 0;
                                    av8Var.s(false);
                                } else {
                                    utcVar = utcVar2;
                                    i8 = 0;
                                    av8Var.d0(878295478);
                                    av8Var.s(false);
                                }
                                e12.a(i8, av8Var, n9e.q(bkh.l(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 6.0f), j9, o7g.a(6.0f)));
                                bi4 bi4Var = bi4.PATTERN_DDMMY;
                                ConcurrentHashMap concurrentHashMap = hk4.a;
                                j11 = j;
                                String i15 = fc6.i(j11, hk4.a(bi4Var.d()));
                                yf8 yf8Var2 = xth.a;
                                udj.c(i15, null, j10, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, i14 & 896, 0, 131066);
                                av8Var.s(true);
                                z3 = z2;
                                j7 = j9;
                                xtcVar3 = xtcVar2;
                                j6 = j10;
                            }
                            u = av8Var.u();
                            if (u == null) {
                                u.d = new Function2() { // from class: dcd
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        jca.n(NewsProvider.this, j11, xtcVar3, z3, j6, j7, (of3) obj, aba.K(i | 1), i2);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    } else {
                        j5 = j3;
                    }
                    i5 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i6 = i12 | i5;
                    if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
            } else {
                j4 = j2;
            }
            i4 = 8192;
            int i122 = i3 | i4;
            if ((i2 & 32) == 0) {
            }
            i5 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i6 = i122 | i5;
            if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        i4 = 8192;
        int i1222 = i3 | i4;
        if ((i2 & 32) == 0) {
        }
        i5 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        i6 = i1222 | i5;
        if (av8Var.T(i6 & 1, (74899 & i6) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void o(gv9 gv9Var, Function2 function2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1857948498);
        int i2 = (i & 6) == 0 ? (av8Var.g(gv9Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function2) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            ArrayList U0 = CollectionsKt.U0(CollectionsKt.L0(gv9Var, 3));
            if (U0.size() < 3) {
                int size = 3 - U0.size();
                for (int i3 = 0; i3 < size; i3++) {
                    U0.add(CollectionsKt.Y(gv9Var));
                }
            }
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            l((ecd) U0.get(2), wnn.A(yqo.u(l98.f0(utcVar, 20.0f, 20.0f, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 2.0f, 2.0f, null), o7g.a(12.0f)), false, true, null, av8Var, 3456, 16);
            l((ecd) U0.get(1), wnn.A(yqo.u(l98.f0(utcVar, 10.0f, 10.0f, 10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 2.0f, 2.0f, null), o7g.a(12.0f)), false, true, null, av8Var, 3456, 16);
            l((ecd) U0.get(0), null, false, true, function2, av8Var, ((i2 << 9) & 57344) | 3072, 6);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(gv9Var, function2, i, 11);
        }
    }

    public static final void p(c56 c56Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-516538939);
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(c56Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i2 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            xtcVar2 = xtcVar;
        }
        int i3 = 0;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            tc3 H = yqo.H(523438750, av8Var2, new t1d(c56Var, 12));
            tc3 H2 = yqo.H(-1744558522, av8Var2, new qwe(c56Var, i3));
            tc3 tc3Var = gz8.b;
            boolean i4 = av8Var2.i(c56Var) | ((i2 & 112) == 32);
            Object O = av8Var2.O();
            if (i4 || O == nf3.a) {
                O = new rwe(function1, c56Var, i3);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar2, H, H2, tc3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i2 >> 6) & 14) | V2.b.f, 2032);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new swe(c56Var, function1, xtcVar, i, 0);
        }
    }

    public static final oqf q(long j, long j2) {
        return new oqf(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final oqf r(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new oqf(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(wn1 wn1Var, long j, boolean z, xtc xtcVar, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        int i4;
        boolean z2;
        String c;
        boolean i5;
        Object O;
        int i6;
        av8 av8Var;
        float f;
        int i7;
        long j2;
        boolean z3;
        wn1Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1580219197);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(wn1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? a.o : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= av8Var2.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 16384 : 8192;
            }
            if (av8Var2.T(i3 & 1, (i3 & 9363) == 9362)) {
                av8Var2.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i8 != 0 ? utcVar : xtcVar2;
                Context context = (Context) av8Var2.k(nz.b);
                boolean c2 = wn1Var.c();
                Integer num = wn1Var.k;
                Integer num2 = wn1Var.j;
                if (c2) {
                    av8Var2.d0(-1827765826);
                    i4 = i3;
                    c = oea.v(R.string.menu_live, av8Var2) + " (" + num2 + " - " + num + ")";
                    z2 = false;
                    av8Var2.s(false);
                } else {
                    i4 = i3;
                    if (wn1Var.b()) {
                        av8Var2.d0(-1827761781);
                        c = oea.v(R.string.status_full_time_short, av8Var2) + " (" + num2 + " - " + num + ")";
                        z2 = false;
                        av8Var2.s(false);
                    } else {
                        z2 = false;
                        if (wn1Var.d()) {
                            av8Var2.d0(-1827756747);
                            av8Var2.s(false);
                            c = rik.j(context, wn1Var.p, bi4.PATTERN_DM, " • ");
                        } else {
                            av8Var2.d0(-1827752996);
                            av8Var2.s(false);
                            c = afi.c(context, wn1Var.q, Sports.FOOTBALL, true);
                            long f2 = !wn1Var.c() ? ljg.f(av8Var2, -1827749370, R.color.live, av8Var2, z2) : ljg.f(av8Var2, -1827748890, R.color.n_lv_3, av8Var2, z2);
                            long f3 = !wn1Var.c() ? ljg.f(av8Var2, -1827747034, R.color.live, av8Var2, z2) : ljg.f(av8Var2, -1827746554, R.color.n_lv_1, av8Var2, z2);
                            kv1 kv1Var = uxf.p;
                            av8Var2.d0(-1827735863);
                            xtc E = d2a.E(bkh.g(bkh.q(xtcVar4, 96.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 52.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, o7g.a(8.0f), true, 0L, 24);
                            jf9 jf9Var = oyn.e;
                            xtc q = n9e.q(E, j, jf9Var);
                            if (wn1Var.c()) {
                                q = q.z(n9e.q(utcVar, r13.c(lz.D(R.color.live, av8Var2), 0.1f), jf9Var));
                            }
                            xtc xtcVar5 = q;
                            av8Var2.s(false);
                            i5 = av8Var2.i(context) | ((i4 & 14) != 4);
                            O = av8Var2.O();
                            if (!i5 || O == nf3.a) {
                                i6 = 2;
                                O = new px6(context, wn1Var, i6);
                                av8Var2.n0(O);
                            } else {
                                i6 = 2;
                            }
                            xtc xtcVar6 = xtcVar4;
                            int i9 = i6;
                            String str = c;
                            xtc b0 = l98.b0(tol.y(xtcVar5, false, false, false, 0L, null, (Function0) O, av8Var2, 31), 4.0f);
                            u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m = av8Var2.m();
                            xtc C = fqj.C(av8Var2, b0);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.q0();
                            } else {
                                av8Var2.l(zg3Var);
                            }
                            f50 f50Var = hf3.g;
                            waa.K(av8Var2, a2, f50Var);
                            ff3 ff3Var = hf3.f;
                            waa.K(av8Var2, m, ff3Var);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var2 = hf3.j;
                            waa.K(av8Var2, valueOf, f50Var2);
                            ry ryVar = hf3.k;
                            waa.J(av8Var2, ryVar);
                            f50 f50Var3 = hf3.d;
                            waa.K(av8Var2, C, f50Var3);
                            yf8 yf8Var = xth.a;
                            udj.c(str, null, f2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var2, 0, 24960, 110586);
                            av8Var = av8Var2;
                            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
                            lv1 lv1Var = uxf.m;
                            xtc g = bkh.g(l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i9), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i9);
                            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                            int hashCode2 = Long.hashCode(av8Var.T);
                            aee m2 = av8Var.m();
                            xtc C2 = fqj.C(av8Var, g);
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.q0();
                            } else {
                                av8Var.l(zg3Var);
                            }
                            waa.K(av8Var, a3, f50Var);
                            waa.K(av8Var, m2, ff3Var);
                            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                            waa.K(av8Var, C2, f50Var3);
                            if (z) {
                                f = 24.0f;
                                i7 = 48;
                                j2 = f3;
                                z3 = false;
                                av8Var.d0(-973991501);
                                td4.u(wn1Var.b, 48, av8Var, bkh.l(utcVar, 24.0f));
                                av8Var.s(false);
                            } else {
                                av8Var.d0(-974315482);
                                String str2 = wn1Var.f;
                                if (str2 == null && (str2 = wn1Var.e) == null) {
                                    str2 = wn1Var.d;
                                }
                                f = 24.0f;
                                i7 = 48;
                                udj.c(str2, null, f3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
                                j2 = f3;
                                av8Var = av8Var;
                                z3 = false;
                                av8Var.s(false);
                            }
                            av8 av8Var3 = av8Var;
                            boolean z4 = z3;
                            udj.c(oea.v(R.string.versus, av8Var), l98.d0(bkh.q(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i9), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i9), f2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var3, 48, 24960, 110584);
                            av8Var2 = av8Var3;
                            if (z) {
                                av8Var2.d0(-973112558);
                                td4.u(wn1Var.c, i7, av8Var2, bkh.l(utcVar, f));
                                av8Var2.s(z4);
                            } else {
                                av8Var2.d0(-973439453);
                                String str3 = wn1Var.i;
                                if (str3 == null && (str3 = wn1Var.h) == null) {
                                    str3 = wn1Var.g;
                                }
                                udj.c(str3, null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110586);
                                av8Var2 = av8Var2;
                                av8Var2.s(z4);
                            }
                            av8Var2.s(true);
                            av8Var2.s(true);
                            xtcVar3 = xtcVar6;
                        }
                    }
                }
                long f22 = !wn1Var.c() ? ljg.f(av8Var2, -1827749370, R.color.live, av8Var2, z2) : ljg.f(av8Var2, -1827748890, R.color.n_lv_3, av8Var2, z2);
                long f32 = !wn1Var.c() ? ljg.f(av8Var2, -1827747034, R.color.live, av8Var2, z2) : ljg.f(av8Var2, -1827746554, R.color.n_lv_1, av8Var2, z2);
                kv1 kv1Var2 = uxf.p;
                av8Var2.d0(-1827735863);
                xtc E2 = d2a.E(bkh.g(bkh.q(xtcVar4, 96.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 52.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, o7g.a(8.0f), true, 0L, 24);
                jf9 jf9Var2 = oyn.e;
                xtc q2 = n9e.q(E2, j, jf9Var2);
                if (wn1Var.c()) {
                }
                xtc xtcVar52 = q2;
                av8Var2.s(false);
                i5 = av8Var2.i(context) | ((i4 & 14) != 4);
                O = av8Var2.O();
                if (i5) {
                }
                i6 = 2;
                O = new px6(context, wn1Var, i6);
                av8Var2.n0(O);
                xtc xtcVar62 = xtcVar4;
                int i92 = i6;
                String str4 = c;
                xtc b02 = l98.b0(tol.y(xtcVar52, false, false, false, 0L, null, (Function0) O, av8Var2, 31), 4.0f);
                u23 a22 = t23.a(ww9.d, kv1Var2, av8Var2, 48);
                int hashCode3 = Long.hashCode(av8Var2.T);
                aee m3 = av8Var2.m();
                xtc C3 = fqj.C(av8Var2, b02);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                }
                f50 f50Var4 = hf3.g;
                waa.K(av8Var2, a22, f50Var4);
                ff3 ff3Var2 = hf3.f;
                waa.K(av8Var2, m3, ff3Var2);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                f50 f50Var22 = hf3.j;
                waa.K(av8Var2, valueOf2, f50Var22);
                ry ryVar2 = hf3.k;
                waa.J(av8Var2, ryVar2);
                f50 f50Var32 = hf3.d;
                waa.K(av8Var2, C3, f50Var32);
                yf8 yf8Var2 = xth.a;
                udj.c(str4, null, f22, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var2, 0, 24960, 110586);
                av8Var = av8Var2;
                nq8.h(av8Var, bkh.e(utcVar, 4.0f));
                lv1 lv1Var2 = uxf.m;
                xtc g2 = bkh.g(l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i92), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i92);
                l8g a32 = k8g.a(ww9.b, lv1Var2, av8Var, 48);
                int hashCode22 = Long.hashCode(av8Var.T);
                aee m22 = av8Var.m();
                xtc C22 = fqj.C(av8Var, g2);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a32, f50Var4);
                waa.K(av8Var, m22, ff3Var2);
                bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                waa.K(av8Var, C22, f50Var32);
                if (z) {
                }
                av8 av8Var32 = av8Var;
                boolean z42 = z3;
                udj.c(oea.v(R.string.versus, av8Var), l98.d0(bkh.q(utcVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i92), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i92), f22, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var32, 48, 24960, 110584);
                av8Var2 = av8Var32;
                if (z) {
                }
                av8Var2.s(true);
                av8Var2.s(true);
                xtcVar3 = xtcVar62;
            }
            u = av8Var2.u();
            if (u == null) {
                u.d = new plh(wn1Var, j, z, xtcVar3, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i2 & 16) == 0) {
        }
        if (av8Var2.T(i3 & 1, (i3 & 9363) == 9362)) {
        }
        u = av8Var2.u();
        if (u == null) {
        }
    }

    public static final void t(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1041586769);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            kv1 kv1Var = uxf.p;
            kg0 kg0Var = ww9.f;
            xtc h = ljg.h(8.0f, bkh.g(bkh.q(xtcVar, 96.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 52.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_P, av8Var), 4.0f);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, h);
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
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            e12.a(0, av8Var, n9e.q(bkh.e(bkh.q(utcVar, 58.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 8.0f), lz.D(R.color.n_lv_4, av8Var), o7g.a(4.0f)));
            nq8.h(av8Var, bkh.e(utcVar, 4.0f));
            lv1 lv1Var = uxf.m;
            xtc d0 = l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(R.drawable.team_logo_placeholder, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            String v = oea.v(R.string.versus, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, l98.d0(bkh.q(utcVar, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 48, 24960, 110584);
            av8Var = av8Var;
            kq9.b(s6a.N(R.drawable.team_logo_placeholder, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 26);
        }
    }

    public static final void u(xtc xtcVar, long j, Function0 function0, Function0 function02, of3 of3Var, int i) {
        int i2;
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1011043973);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.f(j) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function02) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED) != 1042)) {
            cdi M = hda.M(j, av8Var, (i2 >> 3) & 14);
            Context context = (Context) av8Var.k(nz.b);
            int i3 = ((js8) M.getValue()).d;
            int i4 = ((js8) M.getValue()).e;
            String string = context.getString(R.string.days_short);
            string.getClass();
            String string2 = context.getString(R.string.hours_short);
            string2.getClass();
            String string3 = context.getString(R.string.minute_short);
            string3.getClass();
            String string4 = context.getString(R.string.seconds_short);
            string4.getClass();
            String format = i3 > 0 ? String.format("%s%s %s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i3), string, Integer.valueOf(i4), string2}, 4)) : i4 > 0 ? String.format("%s%s %s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i4), string2, Integer.valueOf(((js8) M.getValue()).f), string3}, 4)) : String.format("%s%s %s%s", Arrays.copyOf(new Object[]{Integer.valueOf(((js8) M.getValue()).f), string3, Integer.valueOf(((js8) M.getValue()).g), string4}, 4));
            lv1 lv1Var = uxf.m;
            kg0 kg0Var = ww9.f;
            String str = format;
            xtc q = n9e.q(d2a.E(xtcVar, 4.0f, o7g.a(20.0f), false, 0L, 28), lz.D(R.color.surface_P, av8Var), o7g.a(20.0f));
            boolean z = (i2 & 7168) == 2048;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new rsd(16, function02);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 12.0f, 8.0f);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            wkn.k(haa.t(R.drawable.ic_access_time_outline, 0, av8Var), "", null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.n_lv_1, av8Var), 5), av8Var, 56, 60);
            xtc f0 = l98.f0(utc.a, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            yf8 yf8Var = xth.a;
            udj.c(str, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gj7(xtcVar, j, function0, function02, i);
        }
    }

    public static final void v(final int i, final boolean z, final Bitmap bitmap, final Bitmap bitmap2, final Integer num, final jfj jfjVar, final jfj jfjVar2, final String str, final jfj jfjVar3, final jfj jfjVar4, final String str2, final String str3, final jfj jfjVar5, final jfj jfjVar6, final String str4, final String str5, final int i2, of3 of3Var, final int i3, final int i4) {
        int i5;
        jfj jfjVar7;
        int i6;
        av8 av8Var;
        me4.p(str, str2, str3);
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-873310971);
        int i7 = i3 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16);
        boolean i8 = av8Var2.i(bitmap);
        int i9 = NotificationCompat.FLAG_LOCAL_ONLY;
        int i10 = i7 | (i8 ? 256 : 128) | (av8Var2.i(bitmap2) ? 2048 : 1024) | (av8Var2.g(num) ? 16384 : 8192);
        boolean g = av8Var2.g(jfjVar);
        int i11 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i12 = i10 | (g ? 131072 : 65536) | (av8Var2.g(jfjVar2) ? 1048576 : 524288) | (av8Var2.g(str) ? 8388608 : 4194304) | (av8Var2.g(jfjVar3) ? 67108864 : 33554432) | (av8Var2.g(jfjVar4) ? 536870912 : 268435456);
        if ((i4 & 6) == 0) {
            i5 = i4 | (av8Var2.g(str2) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var2.g(str3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            jfjVar7 = jfjVar5;
            if (!av8Var2.g(jfjVar7)) {
                i9 = 128;
            }
            i5 |= i9;
        } else {
            jfjVar7 = jfjVar5;
        }
        if ((i4 & 3072) == 0) {
            i5 |= av8Var2.g(jfjVar6) ? 2048 : 1024;
        }
        int i13 = i5;
        if ((i4 & 24576) == 0) {
            i6 = i13 | (av8Var2.g(str4) ? 16384 : 8192);
        } else {
            i6 = i13;
        }
        if ((i4 & 196608) == 0) {
            if (av8Var2.g(str5)) {
                i11 = 131072;
            }
            i6 |= i11;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= av8Var2.e(i2) ? 1048576 : 524288;
        }
        int i14 = i4 & 12582912;
        ty8 ty8Var = ty8.a;
        if (i14 == 0) {
            i6 |= av8Var2.g(ty8Var) ? 8388608 : 4194304;
        }
        int i15 = i6;
        if (av8Var2.T(i12 & 1, ((i12 & 306783379) == 306783378 && (i15 & 4793491) == 4793490) ? false : true)) {
            int i16 = i15 >> 15;
            av8Var = av8Var2;
            z9.a(i, i2, ty8Var, yqo.H(1455724034, av8Var2, new g6l(z, bitmap, num, jfjVar, 2)), yqo.H(2032919747, av8Var2, new qn6(str, jfjVar3, jfjVar4, str2, str3, jfjVar7, jfjVar6, str4, str5)), yqo.H(-1684851836, av8Var2, new g6l(z, bitmap2, num, jfjVar2, 3)), av8Var, (i12 & 14) | 224256 | (i16 & 112) | (i16 & 896));
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, z, bitmap, bitmap2, num, jfjVar, jfjVar2, str, jfjVar3, jfjVar4, str2, str3, jfjVar5, jfjVar6, str4, str5, i2, i3, i4) { // from class: q7l
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Bitmap c;
                public final /* synthetic */ Bitmap d;
                public final /* synthetic */ Integer e;
                public final /* synthetic */ jfj f;
                public final /* synthetic */ jfj g;
                public final /* synthetic */ String h;
                public final /* synthetic */ jfj i;
                public final /* synthetic */ jfj j;
                public final /* synthetic */ String k;
                public final /* synthetic */ String l;
                public final /* synthetic */ jfj m;
                public final /* synthetic */ jfj n;
                public final /* synthetic */ String o;
                public final /* synthetic */ String p;
                public final /* synthetic */ int q;
                public final /* synthetic */ int r;

                {
                    this.r = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    int K2 = aba.K(this.r);
                    jca.v(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (of3) obj, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void w(final boolean z, final String str, final jfj jfjVar, final jfj jfjVar2, final String str2, final String str3, final jfj jfjVar3, final jfj jfjVar4, final String str4, final String str5, vy8 vy8Var, of3 of3Var, int i) {
        vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-969761375);
        int i2 = i | (av8Var.h(z) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(jfjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(jfjVar2) ? a.o : 1024) | (av8Var.g(str2) ? 16384 : 8192) | (av8Var.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(jfjVar3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(jfjVar4) ? 8388608 : 4194304) | (av8Var.g(str4) ? 67108864 : 33554432) | (av8Var.g(str5) ? 536870912 : 268435456);
        if (av8Var.T(i2 & 1, (306783379 & i2) != 306783378)) {
            vy8Var2 = ty8.a;
            rd0.b(h5a.O(nq8.A(vy8Var2), 16.0f, 2), 1, 1, yqo.H(-2099253781, av8Var, new ct8() { // from class: r7l
                /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
                
                    if (r9 != false) goto L61;
                 */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
                @Override // defpackage.ct8
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str6;
                    final String str7;
                    final int i3;
                    String str8;
                    of3 of3Var2 = (of3) obj2;
                    ((Integer) obj3).getClass();
                    ((w23) obj).getClass();
                    boolean z2 = z;
                    boolean z3 = z2 && Intrinsics.c(str, StatusKt.STATUS_IN_PROGRESS);
                    String str9 = str5;
                    final boolean z4 = z2 && !z3 && (str9 == null || str9.length() == 0);
                    String str10 = str2;
                    String o = ((str9 == null || str9.length() == 0) && (str6 = str4) != null) ? lnb.o(str6, " | ", str10) : str10;
                    jfj jfjVar5 = jfjVar;
                    if (!z2) {
                        str9 = jfjVar5.a;
                        if (str9 == null) {
                            str9 = "";
                        }
                    } else {
                        if (z3) {
                            str7 = str10;
                            int i4 = R.color.live;
                            if (z2) {
                                Integer num = jfjVar5.b;
                                i3 = num != null ? num.intValue() : R.color.n_lv_1;
                            } else {
                                i3 = z3 ? R.color.live : R.color.n_lv_3;
                            }
                            final jfj jfjVar6 = jfjVar3;
                            final jfj jfjVar7 = jfjVar4;
                            nq8.g(null, 1, 0, yqo.H(-1560400377, of3Var2, new ct8() { // from class: t7l
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    String str11;
                                    String str12;
                                    of3 of3Var3 = (of3) obj5;
                                    ((Integer) obj6).getClass();
                                    ((o8g) obj4).getClass();
                                    boolean z5 = z4;
                                    jfj jfjVar8 = jfjVar6;
                                    if (!z5 || (str11 = jfjVar8.a) == null) {
                                        str11 = "";
                                    }
                                    yf8 yf8Var = xth.a;
                                    dfj k = xth.k();
                                    Integer num2 = jfjVar8.b;
                                    int i5 = R.color.n_lv_3;
                                    o3a.i(str11, null, l98.j0(k, Integer.valueOf(num2 != null ? num2.intValue() : R.color.n_lv_3), of3Var3), 0, of3Var3, 0, 10);
                                    o3a.i(str7, null, l98.j0(xth.k(), Integer.valueOf(i3), of3Var3), 0, of3Var3, 0, 10);
                                    jfj jfjVar9 = jfjVar7;
                                    String str13 = (!z5 || (str12 = jfjVar9.a) == null) ? "" : str12;
                                    dfj k2 = xth.k();
                                    Integer num3 = jfjVar9.b;
                                    if (num3 != null) {
                                        i5 = num3.intValue();
                                    }
                                    o3a.i(str13, null, l98.j0(k2, Integer.valueOf(i5), of3Var3), 0, of3Var3, 0, 10);
                                    return Unit.a;
                                }
                            }), of3Var2, 3072, 5);
                            jfj jfjVar8 = jfjVar2;
                            if (z2) {
                                str8 = jfjVar8.a;
                                if (str8 == null) {
                                    o = "-";
                                }
                                o = str8;
                            } else if (z3) {
                                str8 = str3;
                                o = str8;
                            }
                            yf8 yf8Var = xth.a;
                            dfj c = xth.c();
                            if (z2) {
                                Integer num2 = jfjVar8.b;
                                if (num2 != null) {
                                    i4 = num2.intValue();
                                }
                                i4 = R.color.n_lv_3;
                            }
                            o3a.i(o, null, l98.j0(c, Integer.valueOf(i4), of3Var2), 0, of3Var2, 0, 10);
                            return Unit.a;
                        }
                        if (str9 == null || str9.length() == 0) {
                            str9 = " - ";
                        }
                    }
                    str7 = str9;
                    int i42 = R.color.live;
                    if (z2) {
                    }
                    final jfj jfjVar62 = jfjVar3;
                    final jfj jfjVar72 = jfjVar4;
                    nq8.g(null, 1, 0, yqo.H(-1560400377, of3Var2, new ct8() { // from class: t7l
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            String str11;
                            String str12;
                            of3 of3Var3 = (of3) obj5;
                            ((Integer) obj6).getClass();
                            ((o8g) obj4).getClass();
                            boolean z5 = z4;
                            jfj jfjVar82 = jfjVar62;
                            if (!z5 || (str11 = jfjVar82.a) == null) {
                                str11 = "";
                            }
                            yf8 yf8Var2 = xth.a;
                            dfj k = xth.k();
                            Integer num22 = jfjVar82.b;
                            int i5 = R.color.n_lv_3;
                            o3a.i(str11, null, l98.j0(k, Integer.valueOf(num22 != null ? num22.intValue() : R.color.n_lv_3), of3Var3), 0, of3Var3, 0, 10);
                            o3a.i(str7, null, l98.j0(xth.k(), Integer.valueOf(i3), of3Var3), 0, of3Var3, 0, 10);
                            jfj jfjVar9 = jfjVar72;
                            String str13 = (!z5 || (str12 = jfjVar9.a) == null) ? "" : str12;
                            dfj k2 = xth.k();
                            Integer num3 = jfjVar9.b;
                            if (num3 != null) {
                                i5 = num3.intValue();
                            }
                            o3a.i(str13, null, l98.j0(k2, Integer.valueOf(i5), of3Var3), 0, of3Var3, 0, 10);
                            return Unit.a;
                        }
                    }), of3Var2, 3072, 5);
                    jfj jfjVar82 = jfjVar2;
                    if (z2) {
                    }
                    yf8 yf8Var2 = xth.a;
                    dfj c2 = xth.c();
                    if (z2) {
                    }
                    o3a.i(o, null, l98.j0(c2, Integer.valueOf(i42), of3Var2), 0, of3Var2, 0, 10);
                    return Unit.a;
                }
            }), av8Var, 3072, 0);
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s7l(z, str, jfjVar, jfjVar2, str2, str3, jfjVar3, jfjVar4, str4, str5, vy8Var2, i);
        }
    }

    public static final int x(xlm xlmVar) {
        if (!xlmVar.e || xlmVar.a() != 0) {
            int size = xlmVar.b.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    break;
                }
                n4m n4mVar = (n4m) CollectionsKt.a0(size, xlmVar.b);
                n4m n4mVar2 = (n4m) CollectionsKt.a0(size - 1, xlmVar.b);
                if (n4mVar != null ? Intrinsics.c(n4mVar.m, Boolean.FALSE) : false) {
                    if (n4mVar2 != null ? Intrinsics.c(n4mVar2.m, Boolean.TRUE) : false) {
                        return size;
                    }
                }
            }
        }
        return 0;
    }

    public static final Map y(xlm xlmVar) {
        gim gimVar;
        xlmVar.getClass();
        n4m n4mVar = (n4m) CollectionsKt.firstOrNull(xlmVar.b);
        if (n4mVar == null || (gimVar = n4mVar.b) == null) {
            return null;
        }
        Pair a2 = yjm.a(gimVar);
        Map map = (Map) a2.a;
        return map;
    }

    public static float[] z(float[] fArr, int i) {
        if (i < 0) {
            ilg.c();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }
}
