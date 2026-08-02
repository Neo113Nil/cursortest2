package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class n4o {
    public static final p4h a;
    public static final p4h b;
    public static final p4h c;
    public static final p4h d;
    public static final p4h e;
    public static final tc3 f = new tc3(1264361908, new ed3(26), false);
    public static final tc3 g = new tc3(291978125, new ud3(18), false);
    public static final int[] h = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, 1000000000};
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    static {
        int i2 = 22;
        a = new p4h(i2);
        b = new p4h(i2);
        c = new p4h(i2);
        d = new p4h(i2);
        e = new p4h(i2);
    }

    public static final void A(s18 s18Var, uae uaeVar) {
        try {
            IOException iOException = null;
            for (uae uaeVar2 : s18Var.m(uaeVar)) {
                try {
                    if (s18Var.n(uaeVar2).c) {
                        A(s18Var, uaeVar2);
                    }
                    s18Var.i(uaeVar2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static int B(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < 6; i3++) {
            int ceil = (int) Math.ceil(fArr[i3]);
            iArr[i3] = ceil;
            if (i2 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i2 = ceil;
            }
            if (i2 == ceil) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    public static final int C(int i2, wg8 wg8Var) {
        boolean z = wg8Var.compareTo(wg8.d) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static p22 D(String str, List list, boolean z) {
        switch (str.hashCode()) {
            case -2002238939:
                if (str.equals(Sports.ICE_HOCKEY)) {
                    list.getClass();
                    kp5 kp5Var = gn9.e;
                    return new p22(wib.u(kp5Var, wib.g(list, kp5Var), z, null));
                }
                return null;
            case -83759494:
                if (str.equals(Sports.AMERICAN_FOOTBALL)) {
                    list.getClass();
                    kp5 kp5Var2 = lp.e;
                    return new p22(wib.u(kp5Var2, wib.g(list, kp5Var2), z, null));
                }
                return null;
            case 1767150:
                if (str.equals(Sports.HANDBALL)) {
                    list.getClass();
                    kp5 kp5Var3 = e69.e;
                    return new p22(wib.u(kp5Var3, wib.g(list, kp5Var3), z, null));
                }
                return null;
            case 108869083:
                if (str.equals(Sports.RUGBY)) {
                    list.getClass();
                    kp5 kp5Var4 = l9g.d;
                    return new p22(wib.u(kp5Var4, wib.g(list, kp5Var4), z, null));
                }
                return null;
            case 727149765:
                if (str.equals(Sports.BASKETBALL)) {
                    list.getClass();
                    kp5 kp5Var5 = up1.d;
                    return new p22(wib.u(kp5Var5, wib.g(list, kp5Var5), z, null));
                }
                return null;
            default:
                return null;
        }
    }

    public static final iv4 E(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(d.Q7);
        iv4 iv4Var = element instanceof iv4 ? (iv4) element : null;
        return iv4Var == null ? zo4.a : iv4Var;
    }

    public static final String F(int i2, int i3) {
        LocalDateTime of = LocalDateTime.of(2025, 7, 10, i2, i3);
        of.getClass();
        String format = new DateTimeFormatterBuilder().appendLocalized(null, FormatStyle.SHORT).toFormatter(Locale.getDefault()).format(of);
        format.getClass();
        return format;
    }

    public static l22 G(l22 l22Var, Integer num, boolean z) {
        l22Var.getClass();
        gv5 gv5Var = l22Var.a;
        int i2 = l22Var.b;
        int intValue = num != null ? num.intValue() : i2;
        int i3 = b.i(gv5Var.a);
        int i4 = 0;
        if (i3 < 0) {
            i3 = 0;
        }
        int c2 = llf.c(intValue, 0, i3);
        gv9 W = l6g.W(CollectionsKt.H0(gv5Var.b, new cp(new cp(new yt5(z, c2, i4), 5), 6)));
        gv9 gv9Var = gv5Var.a;
        gv9Var.getClass();
        W.getClass();
        return new l22(new gv5(gv9Var, W), i2, l22Var.c, c2);
    }

    public static void H(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + "0000".substring(0, 4 - hexString.length()).concat(hexString) + ')');
    }

    public static boolean I(d2g d2gVar, qzf qzfVar) {
        qzfVar.getClass();
        int i2 = d2gVar.d;
        if (i2 != 200 && i2 != 410 && i2 != 414 && i2 != 501 && i2 != 203 && i2 != 204) {
            if (i2 != 307) {
                if (i2 != 308 && i2 != 404 && i2 != 405) {
                    switch (i2) {
                        case 300:
                        case MRAID_ERROR_VALUE:
                            break;
                        case INVALID_IFA_STATUS_VALUE:
                            break;
                        default:
                            return false;
                    }
                }
            }
            String a2 = d2gVar.f.a("Expires");
            if (a2 == null) {
                a2 = null;
            }
            if (a2 == null && d2gVar.h().c == -1 && !d2gVar.h().f && !d2gVar.h().e) {
                return false;
            }
        }
        return (d2gVar.h().b || qzfVar.a().b) ? false : true;
    }

    public static boolean J(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean K(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    public static boolean L(char c2) {
        if (c2 == '\r' || c2 == '*' || c2 == '>' || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0193, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a9, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b3, code lost:
    
        return 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int M(int i2, int i3, CharSequence charSequence) {
        float[] fArr;
        int i4;
        if (i2 >= charSequence.length()) {
            return i3;
        }
        float f2 = 2.0f;
        int i5 = 5;
        float f3 = 1.0f;
        int i6 = 2;
        if (i3 == 0) {
            fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i3] = 0.0f;
        }
        int i7 = 0;
        while (true) {
            int i8 = i2 + i7;
            if (i8 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int B = B(fArr, iArr, bArr);
                int i9 = 0;
                for (int i10 = 0; i10 < 6; i10++) {
                    i9 += bArr[i10];
                }
                if (iArr[0] != B) {
                    if (i9 == 1 && bArr[i5] > 0) {
                        return i5;
                    }
                    if (i9 != 1 || bArr[4] <= 0) {
                        if (i9 == 1 && bArr[i6] > 0) {
                            return i6;
                        }
                        if (i9 != 1 || bArr[3] <= 0) {
                            break;
                        }
                    }
                }
            } else {
                char charAt = charSequence.charAt(i8);
                i7++;
                if (J(charAt)) {
                    fArr[0] = fArr[0] + 0.5f;
                } else if (K(charAt)) {
                    float ceil = (float) Math.ceil(fArr[0]);
                    fArr[0] = ceil;
                    fArr[0] = ceil + f2;
                } else {
                    float ceil2 = (float) Math.ceil(fArr[0]);
                    fArr[0] = ceil2;
                    fArr[0] = ceil2 + f3;
                }
                int i11 = i5;
                float f4 = f3;
                if (charAt == ' ' || (charAt >= '0' && charAt <= '9')) {
                    i4 = i6;
                } else {
                    i4 = i6;
                    if (charAt < 'A' || charAt > 'Z') {
                        if (K(charAt)) {
                            fArr[1] = fArr[1] + 2.6666667f;
                        } else {
                            fArr[1] = fArr[1] + 1.3333334f;
                        }
                        if (charAt != ' ' || ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z'))) {
                            fArr[i4] = fArr[i4] + 0.6666667f;
                        } else if (K(charAt)) {
                            fArr[i4] = fArr[i4] + 2.6666667f;
                        } else {
                            fArr[i4] = fArr[i4] + 1.3333334f;
                        }
                        if (!L(charAt)) {
                            fArr[3] = fArr[3] + 0.6666667f;
                        } else if (K(charAt)) {
                            fArr[3] = fArr[3] + 4.3333335f;
                        } else {
                            fArr[3] = fArr[3] + 3.3333333f;
                        }
                        if (charAt < ' ' && charAt <= '^') {
                            fArr[4] = fArr[4] + 0.75f;
                        } else if (K(charAt)) {
                            fArr[4] = fArr[4] + 3.25f;
                        } else {
                            fArr[4] = fArr[4] + 4.25f;
                        }
                        fArr[i11] = fArr[i11] + f4;
                        if (i7 < 4) {
                            int[] iArr2 = new int[6];
                            byte[] bArr2 = new byte[6];
                            B(fArr, iArr2, bArr2);
                            int i12 = 0;
                            for (int i13 = 0; i13 < 6; i13++) {
                                i12 += bArr2[i13];
                            }
                            int i14 = iArr2[0];
                            int i15 = iArr2[i11];
                            if (i14 < i15 && i14 < iArr2[1] && i14 < iArr2[i4] && i14 < iArr2[3] && i14 < iArr2[4]) {
                                break;
                            }
                            if (i15 < i14) {
                                return i11;
                            }
                            byte b2 = bArr2[1];
                            byte b3 = bArr2[i4];
                            byte b4 = bArr2[3];
                            byte b5 = bArr2[4];
                            if (b2 + b3 + b4 + b5 == 0) {
                                return i11;
                            }
                            if (i12 == 1 && b5 > 0) {
                                break;
                            }
                            if (i12 == 1 && b3 > 0) {
                                return i4;
                            }
                            if (i12 == 1 && b4 > 0) {
                                break;
                            }
                            int i16 = iArr2[1];
                            int i17 = i16 + 1;
                            if (i17 < i14 && i17 < i15 && i17 < iArr2[4] && i17 < iArr2[i4]) {
                                int i18 = iArr2[3];
                                if (i16 < i18) {
                                    break;
                                }
                                if (i16 == i18) {
                                    for (int i19 = i2 + i7 + 1; i19 < charSequence.length(); i19++) {
                                        char charAt2 = charSequence.charAt(i19);
                                        if (charAt2 == '\r' || charAt2 == '*' || charAt2 == '>') {
                                            return 3;
                                        }
                                        if (!L(charAt2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i11;
                        f3 = f4;
                        i6 = i4;
                        f2 = 2.0f;
                    }
                }
                fArr[1] = fArr[1] + 0.6666667f;
                if (charAt != ' ') {
                }
                fArr[i4] = fArr[i4] + 0.6666667f;
                if (!L(charAt)) {
                }
                if (charAt < ' ') {
                }
                if (K(charAt)) {
                }
                fArr[i11] = fArr[i11] + f4;
                if (i7 < 4) {
                }
                i5 = i11;
                f3 = f4;
                i6 = i4;
                f2 = 2.0f;
            }
        }
        return 1;
    }

    public static wkc N(TeamSelection teamSelection, List list, List list2) {
        teamSelection.getClass();
        list.getClass();
        list2.getClass();
        int i2 = zt5.a[teamSelection.ordinal()];
        if (i2 == 1) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(S((MissingPlayerData) it.next()));
                }
                return new vkc(l6g.W(arrayList));
            }
        } else if (i2 == 2) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(S((MissingPlayerData) it2.next()));
                }
                return new vkc(l6g.W(arrayList2));
            }
        } else if (i2 == 3) {
            xbb M = yso.M(list, list2);
            ArrayList arrayList3 = new ArrayList(k13.r(M, 10));
            ListIterator listIterator = M.listIterator(0);
            while (true) {
                hc9 hc9Var = (hc9) listIterator;
                if (!hc9Var.hasNext()) {
                    break;
                }
                Pair pair = (Pair) hc9Var.next();
                MissingPlayerData missingPlayerData = (MissingPlayerData) pair.a;
                MissingPlayerData missingPlayerData2 = (MissingPlayerData) pair.b;
                arrayList3.add(new tkc(missingPlayerData != null ? S(missingPlayerData) : null, missingPlayerData2 != null ? S(missingPlayerData2) : null));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            if (arrayList3 != null) {
                return new ukc(l6g.W(arrayList3));
            }
        } else if (i2 != 4) {
            zzl.b();
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0247, code lost:
    
        if (r14 < 0) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gv9 O(boolean z, List list, Function1 function1, String str) {
        boolean z2;
        int i2;
        int i3;
        String H;
        List split$default;
        String str2;
        String str3 = str;
        String str4 = Sports.BASKETBALL;
        boolean c2 = Intrinsics.c(str3, Sports.BASKETBALL);
        int i4 = 10;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k22 k22Var = (k22) it.next();
            ArrayList arrayList2 = k22Var.b;
            m22 m22Var = k22Var.a;
            ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, i4));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                i22 i22Var = (i22) it2.next();
                Player player = i22Var.n;
                String C = tba.C(player);
                if (C == null) {
                    C = tba.t(player);
                }
                String str5 = C;
                int id = player.getId();
                String str6 = i22Var.q;
                if (str6 != null && Intrinsics.c(str3, str4) && str6.length() > 1) {
                    char[] charArray = str6.toCharArray();
                    charArray.getClass();
                    str6 = ph0.J(charArray, "-", null, 62);
                }
                String str7 = str6;
                String str8 = i22Var.o;
                ArrayList arrayList4 = i22Var.u;
                ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    y12 y12Var = (y12) it3.next();
                    Iterator it4 = it3;
                    String str9 = y12Var.i;
                    Regex regex = yid.a;
                    if (str9 == null) {
                        str9 = "-";
                    }
                    arrayList5.add(new o22(str9, y12Var.j, y12Var.h));
                    it3 = it4;
                    str4 = str4;
                    c2 = c2;
                }
                String str10 = str4;
                boolean z3 = c2;
                gv9 W = l6g.W(arrayList5);
                if (tba.C(player) != null) {
                    H = tba.C(player);
                    if (H == null) {
                        H = "";
                    }
                    split$default = StringsKt__StringsKt.split$default(H, new String[]{" "}, false, 0, 6, null);
                    String str11 = (String) CollectionsKt.firstOrNull(split$default);
                    if (str11 != null && (str2 = (String) CollectionsKt.j0(split$default)) != null) {
                        H = split$default.size() == 1 ? iii.H(6, str2) : lnb.o(str11, " ", iii.H(4, str2));
                    }
                } else if (n9e.F(player.getFirstName()) && n9e.F(player.getLastName())) {
                    String firstName = player.getFirstName();
                    Character valueOf = firstName != null ? Character.valueOf(iii.E(firstName)) : null;
                    String lastName = player.getLastName();
                    H = valueOf + ". " + (lastName != null ? iii.H(4, lastName) : null);
                } else {
                    H = iii.H(6, tba.t(player));
                }
                arrayList3.add(new ku5(id, str5, H, str7, str8, W, i22Var.A, (Integer) function1.invoke(i22Var), z3 && !Intrinsics.c(i22Var.r, Boolean.TRUE), z3 && Intrinsics.c(i22Var.C, Boolean.TRUE), Intrinsics.c(i22Var.t, Boolean.TRUE)));
                str3 = str;
                str4 = str10;
                c2 = z3;
            }
            String str12 = str4;
            boolean z4 = c2;
            gv9 W2 = l6g.W(arrayList3);
            if (z && (W2 == null || !W2.isEmpty())) {
                Iterator<E> it5 = W2.iterator();
                while (it5.hasNext()) {
                    if (((ku5) it5.next()).g != null) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            ArrayList arrayList6 = m22Var.c;
            ArrayList arrayList7 = new ArrayList(k13.r(arrayList6, 10));
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                x12 x12Var = (x12) it6.next();
                arrayList7.add(new w12(x12Var.b(), x12Var.d()));
            }
            gv9 W3 = l6g.W(arrayList7);
            if (z2) {
                i2 = 0;
                W3 = l6g.W(CollectionsKt.w0(W3, l6g.K(new w12(new q9k(R.string.sofascore_rating_stat_short), false))));
            } else {
                i2 = 0;
            }
            if (!z2) {
                Iterator it7 = W3.iterator();
                i3 = i2;
                while (true) {
                    if (!it7.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (Intrinsics.c(((w12) it7.next()).a, m22Var.f.b())) {
                        break;
                    }
                    i3++;
                }
            }
            i3 = i2;
            arrayList.add(new l22(new gv5(W3, W2), i3, list.size() == 1 ? new q9k(R.string.legend) : m22Var.b, i3));
            str3 = str;
            i4 = 10;
            str4 = str12;
            c2 = z4;
        }
        return l6g.W(arrayList);
    }

    public static f78 P(j9e j9eVar) {
        j9eVar.O(1);
        int D = j9eVar.D();
        long j2 = j9eVar.b + D;
        int i2 = D / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long u = j9eVar.u();
            if (u == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = u;
            jArr2[i3] = j9eVar.u();
            j9eVar.O(2);
            i3++;
        }
        j9eVar.O((int) (j2 - j9eVar.b));
        return new f78(jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gv9 Q(gv9 gv9Var, gv9 gv9Var2, boolean z) {
        boolean z2;
        l22 l22Var;
        gv9Var.getClass();
        ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
        int i2 = 0;
        for (Object obj : gv9Var) {
            int i3 = i2 + 1;
            Integer num = null;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            l22 l22Var2 = (l22) obj;
            Integer valueOf = (gv9Var2 == null || (l22Var = (l22) CollectionsKt.a0(i2, gv9Var2)) == null) ? null : Integer.valueOf(l22Var.d);
            if (valueOf != null) {
                int size = l22Var2.a.a.size();
                int intValue = valueOf.intValue();
                if (intValue >= 0 && intValue < size) {
                    z2 = true;
                    if (!z2) {
                        num = valueOf;
                    }
                    arrayList.add(G(l22Var2, num, z));
                    i2 = i3;
                }
            }
            z2 = false;
            if (!z2) {
            }
            arrayList.add(G(l22Var2, num, z));
            i2 = i3;
        }
        return l6g.W(arrayList);
    }

    public static final long R(long j2) {
        wd5 wd5Var = xd5.b;
        boolean z = j2 > 0;
        if (z) {
            return xd5.e(xd5.i(j2, wkn.S(999999L, be5.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        zzl.b();
        return 0L;
    }

    public static skc S(MissingPlayerData missingPlayerData) {
        int id = missingPlayerData.getPlayer().getId();
        String C = tba.C(missingPlayerData.getPlayer());
        if (C == null) {
            C = "";
        }
        String str = C;
        int s = wib.s(missingPlayerData.getReason());
        String type = missingPlayerData.getType();
        type.getClass();
        return new skc(id, s, type.equals("missing") ? R.color.error : R.color.alert, wib.t(missingPlayerData.getReason(), R.string.injury_status_out, missingPlayerData.getType(), missingPlayerData.getDescription()), str, wib.v(missingPlayerData.getReason()));
    }

    public static final void a(zo5 zo5Var, of6 of6Var, tc3 tc3Var, of3 of3Var, int i2) {
        of6 of6Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1445527058);
        int i3 = i2 | 384;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            of6 a2 = uo5.f(null, 3).a(uo5.l(null, null, 15));
            Object O = av8Var.O();
            Object obj = O;
            if (O == nf3.a) {
                h1d h1dVar = new h1d(Boolean.FALSE);
                h1dVar.R(Boolean.TRUE);
                av8Var.n0(h1dVar);
                obj = h1dVar;
            }
            fz8.c((h1d) obj, null, zo5Var, a2, null, yqo.H(1725253830, av8Var, new yw6(i3, i4, tc3Var)), av8Var, 200064, 18);
            of6Var2 = a2;
        } else {
            av8Var.W();
            of6Var2 = of6Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(zo5Var, of6Var2, tc3Var, i2, 2);
        }
    }

    public static cx1 b(a10 a10Var, int i2) {
        Bitmap bitmap = a10Var.a;
        cx1 cx1Var = new cx1(a10Var, (bitmap.getWidth() << 32) | (bitmap.getHeight() & 4294967295L));
        cx1Var.h = i2;
        return cx1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ylj yljVar, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-748736654);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(yljVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i4 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                xtc xtcVar4 = i6 != 0 ? utc.a : xtcVar2;
                v7b v7bVar = new v7b(b.j(new r13(hkg.d(4294944768L)), new r13(hkg.d(4289200128L)), new r13(hkg.d(4294944768L))), null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), 9187343241974906880L);
                int i7 = 3;
                if (yljVar.e) {
                    av8Var.d0(-1848116022);
                    n(xtcVar4, yqo.H(-983956017, av8Var, new ay7(tc3Var, i5)), av8Var, ((i4 >> 3) & 14) | 48);
                    av8Var.s(false);
                } else if (yljVar.f) {
                    av8Var.d0(-1847848182);
                    m(xtcVar4, yqo.H(180368555, av8Var, new ay7(tc3Var, i7)), av8Var, ((i4 >> 3) & 14) | 48);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1847598415);
                    xtc b0 = l98.b0(yso.p(n9e.q(qx9.p(xtcVar4, 0.98f), lz.D(R.color.darken_overlay_1, av8Var), o7g.a(16.0f)), 1.0f, v7bVar, o7g.a(16.0f)), 16.0f);
                    int i8 = (i4 << 3) & 7168;
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
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
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    tc3Var.invoke(n12.a, av8Var, Integer.valueOf(((i8 >> 6) & 112) | 6));
                    av8Var.s(true);
                    av8Var.s(false);
                }
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new r22(yljVar, xtcVar3, tc3Var, i2, i3, 15);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i2 & 384) == 0) {
        }
        if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void d(ev6 ev6Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        ev6Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(808717075);
        int i3 = (av8Var.g(ev6Var) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            td4.q(ev6Var.g, ev6Var.a, ev6Var.y, bkh.l(utcVar, 48.0f), av8Var, 3072);
            nq8.h(av8Var, bkh.p(utcVar, 12.0f));
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
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
            String str = ev6Var.e;
            yf8 yf8Var = xth.a;
            utc utcVar2 = utcVar;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var, 0, 24960, 110586);
            udj.c(bf3.g(2.0f, R.string.fantasy_chat_info_text, av8Var, av8Var, utcVar2), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ho6(ev6Var, xtcVar2, i2, 0);
        }
    }

    public static final void e(int i2, long j2, of3 of3Var, xtc xtcVar, String str) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1816268600);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.f(j2) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(utcVar, j2, a2), 8.0f, 4.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, i3 & 14, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l67(str, j2, xtcVar2, i2, 2);
        }
    }

    public static final void f(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(344654225);
        int i3 = i2 | 6;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtcVar2 = utc.a;
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
            jca.i(oea.v(R.string.fantasy_notifications_reminders_title, av8Var), oea.v(R.string.fantasy_notifications_reminders_body, av8Var), null, s6a.N(R.drawable.ic_main_fantasy, 6, av8Var), null, null, av8Var, 384, 48);
            jca.i(oea.v(R.string.fantasy_notifications_announcements_title, av8Var), oea.v(R.string.fantasy_notifications_announcements_body, av8Var), null, s6a.N(R.drawable.ic_main_fantasy, 6, av8Var), l98.d0(xtcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, av8Var, 24960, 32);
            jca.i(oea.v(R.string.fantasy_notifications_round_title, av8Var), oea.v(R.string.fantasy_notifications_round_body, av8Var), null, s6a.N(R.drawable.ic_main_fantasy, 6, av8Var), l98.d0(xtcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, av8Var, 24960, 32);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i2, 24);
        }
    }

    public static final void g(final int i2, final double d2, final double d3, long j2, final String str, final Function0 function0, final FantasyCompetitionType fantasyCompetitionType, xtc xtcVar, of3 of3Var, final int i3) {
        long j3;
        final xtc xtcVar2;
        f50 f50Var;
        lv1 lv1Var;
        Locale locale;
        String str2;
        char c2;
        long f2;
        av8 av8Var;
        boolean z;
        kv1 kv1Var = uxf.q;
        str.getClass();
        function0.getClass();
        fantasyCompetitionType.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1900098094);
        int i4 = i3 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.c(d2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.c(d3) ? a.o : 1024) | (av8Var2.f(j2) ? 16384 : 8192) | (av8Var2.g(str) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.e(fantasyCompetitionType.ordinal()) ? 8388608 : 4194304) | 100663296;
        if (av8Var2.T(i4 & 1, (38347923 & i4) != 38347922)) {
            Context context = (Context) av8Var2.k(nz.b);
            kv1 kv1Var2 = uxf.p;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, kv1Var2, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var2, a2, f50Var2);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var2, C, f50Var4);
            xtc d02 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            wxf wxfVar = ww9.b;
            lv1 lv1Var2 = uxf.l;
            l8g a3 = k8g.a(wxfVar, lv1Var2, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d02);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var2);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var3, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var4);
            p8g p8gVar = p8g.a;
            xtc a4 = p8gVar.a(1.0f, utcVar, true);
            l8g a5 = k8g.a(new ng0(4.0f, true, new l1(uxf.o, 5)), lv1Var2, av8Var2, 6);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, a4);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a5, f50Var2);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var3, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var4);
            String y = dmi.y(oea.v(R.string.players, av8Var2), ":");
            Locale locale2 = Locale.ROOT;
            String upperCase = y.toUpperCase(locale2);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, p8gVar.c(utcVar), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 4, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110584);
            context.getClass();
            utc utcVar2 = utcVar;
            udj.c(fc6.g(i2, 15, hkg.c0(context) ? "\\" : "/"), p8gVar.c(utcVar), i2 != 15 ? ljg.f(av8Var2, -1157730410, R.color.error, av8Var2, false) : ljg.f(av8Var2, -1157729896, R.color.success, av8Var2, false), null, 0L, null, 0L, null, null, 0L, 4, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110584);
            av8Var2.s(true);
            int i5 = j97.a[fantasyCompetitionType.ordinal()];
            if (i5 == 1) {
                av8Var2.d0(-390380198);
                xtc a6 = p8gVar.a(1.0f, utcVar2, true);
                l8g a7 = k8g.a(new ng0(4.0f, true, new l1(kv1Var, 5)), lv1Var2, av8Var2, 6);
                int hashCode4 = Long.hashCode(av8Var2.T);
                aee m4 = av8Var2.m();
                xtc C4 = fqj.C(av8Var2, a6);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a7, f50Var2);
                waa.K(av8Var2, m4, ff3Var);
                bf3.s(hashCode4, av8Var2, f50Var3, av8Var2, ryVar);
                waa.K(av8Var2, C4, f50Var4);
                String upperCase2 = (oea.v(R.string.bank, av8Var2) + ":").toUpperCase(locale2);
                upperCase2.getClass();
                f50Var = f50Var4;
                lv1Var = lv1Var2;
                locale = locale2;
                str2 = ":";
                udj.c(upperCase2, p8gVar.c(utcVar2), lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110584);
                Locale d4 = dla.d();
                Set set = o84.a;
                String format = String.format(d4, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Double.valueOf(d2)}, 2));
                dfj l2 = xth.l();
                if (d2 < 0.0d) {
                    f2 = ljg.f(av8Var2, 600184494, R.color.error, av8Var2, false);
                    c2 = 1392;
                } else {
                    c2 = 1392;
                    f2 = ljg.f(av8Var2, 600185005, R.color.n_lv_1, av8Var2, false);
                }
                udj.c(format, p8gVar.c(utcVar2), f2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, l2, av8Var2, 0, 24960, 110584);
                av8Var = av8Var2;
                z = true;
                av8Var.s(true);
                av8Var.s(false);
                Unit unit = Unit.a;
            } else {
                if (i5 != 2) {
                    throw dmi.h(av8Var2, 1788522111, false);
                }
                av8Var2.d0(-389193394);
                xtc a8 = p8gVar.a(1.0f, utcVar2, true);
                k1c c3 = e12.c(uxf.c, false);
                int hashCode5 = Long.hashCode(av8Var2.T);
                aee m5 = av8Var2.m();
                xtc C5 = fqj.C(av8Var2, a8);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c3, f50Var2);
                waa.K(av8Var2, m5, ff3Var);
                bf3.s(hashCode5, av8Var2, f50Var3, av8Var2, ryVar);
                waa.K(av8Var2, C5, f50Var4);
                lv1 lv1Var3 = uxf.m;
                ng0 ng0Var = new ng0(4.0f, true, new l1(kv1Var, 5));
                xtc y2 = tol.y(wnn.A(n12.a.a(utcVar2, uxf.h), o7g.a(4.0f)), false, false, false, 0L, null, function0, av8Var2, 31);
                l8g a9 = k8g.a(ng0Var, lv1Var3, av8Var2, 54);
                int hashCode6 = Long.hashCode(av8Var2.T);
                aee m6 = av8Var2.m();
                xtc C6 = fqj.C(av8Var2, y2);
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a9, f50Var2);
                waa.K(av8Var2, m6, ff3Var);
                bf3.s(hashCode6, av8Var2, f50Var3, av8Var2, ryVar);
                waa.K(av8Var2, C6, f50Var4);
                utcVar2 = utcVar2;
                kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var2), null, bkh.l(utcVar2, 16.0f), lz.D(R.color.primary_default, av8Var2), av8Var2, 432, 0);
                String upperCase3 = (oea.v(R.string.fantasy_expected_fantasy_points_short, av8Var2) + ":").toUpperCase(locale2);
                upperCase3.getClass();
                dfj b2 = xth.b();
                long D = lz.D(R.color.n_lv_3, av8Var2);
                xtc c4 = p8gVar.c(utcVar2);
                p8gVar = p8gVar;
                udj.c(upperCase3, c4, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var2, 0, 24960, 110584);
                udj.c(String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1)), p8gVar.c(utcVar2), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110584);
                av8Var = av8Var2;
                z = true;
                ljg.t(av8Var, true, true, false);
                Unit unit2 = Unit.a;
                f50Var = f50Var4;
                lv1Var = lv1Var2;
                locale = locale2;
                str2 = ":";
            }
            av8Var.s(z);
            boolean z2 = z;
            av8 av8Var3 = av8Var;
            p8g p8gVar2 = p8gVar;
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var3, null);
            ng0 ng0Var2 = new ng0(4.0f, z2, new a70(6));
            xtc d03 = l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, z2 ? 1 : 0);
            l8g a10 = k8g.a(ng0Var2, lv1Var, av8Var3, 6);
            int hashCode7 = Long.hashCode(av8Var3.T);
            aee m7 = av8Var3.m();
            xtc C7 = fqj.C(av8Var3, d03);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a10, f50Var2);
            waa.K(av8Var3, m7, ff3Var);
            bf3.s(hashCode7, av8Var3, f50Var3, av8Var3, ryVar);
            waa.K(av8Var3, C7, f50Var);
            String upperCase4 = (oea.w(R.string.fantasy_round_deadline, new Object[]{str}, av8Var3) + str2).toUpperCase(locale);
            upperCase4.getClass();
            udj.c(upperCase4, p8gVar2.c(utcVar2), lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 110584);
            bi4 bi4Var = bi4.PATTERN_DMMHHSS;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            j3 = j2;
            udj.c(fc6.i(j3, hk4.a(bi4Var.d())), p8gVar2.c(utcVar2), lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.l(), av8Var3, 0, 24960, 110584);
            av8Var2 = av8Var3;
            av8Var2.s(true);
            av8Var2.s(true);
            xtcVar2 = utcVar2;
        } else {
            j3 = j2;
            av8Var2.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var2.u();
        if (u != null) {
            final long j4 = j3;
            u.d = new Function2(i2, d2, d3, j4, str, function0, fantasyCompetitionType, xtcVar2, i3) { // from class: i97
                public final /* synthetic */ int a;
                public final /* synthetic */ double b;
                public final /* synthetic */ double c;
                public final /* synthetic */ long d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ FantasyCompetitionType g;
                public final /* synthetic */ xtc h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(49);
                    n4o.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(int i2, long j2, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i3) {
        av8 av8Var;
        x23 x23Var;
        mhj mhjVar;
        Function0 function03 = function0;
        function03.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1046999334);
        int i4 = i3 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.f(j2) ? 32 : 16) | (av8Var2.i(function03) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function02) ? a.o : 1024);
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) av8Var2.k(nz.b);
            cdi M = hda.M(j2, av8Var2, (i4 >> 3) & 14);
            mhj mhjVar2 = new mhj(((js8) M.getValue()).d, R.string.days_short);
            mhj mhjVar3 = new mhj(((js8) M.getValue()).e, R.string.hours_short);
            mhj mhjVar4 = new mhj(((js8) M.getValue()).f, R.string.minutes_short);
            mhj mhjVar5 = new mhj(((js8) M.getValue()).g, R.string.seconds_short);
            xtc E = d2a.E(bkh.e(bkh.d(xtcVar, 1.0f), 152.0f), 4.0f, o7g.a(16.0f), false, 0L, 28);
            ht9 ht9Var = new ht9(context);
            ht9Var.c = Integer.valueOf(R.drawable.fantasy_elite_faceoff);
            awj[] awjVarArr = {new ty1(-16777216, 20.0f, 2.5f)};
            sl6 sl6Var = st9.a;
            st9.b(ht9Var, ph0.X(awjVarArr));
            xtc q = n9e.q(fz8.Z(E, uaa.w(ht9Var.a(), av8Var2, 22), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 54), lz.D(R.color.darken_overlay_3, av8Var2), oyn.e);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, q);
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
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            ImageVector N = s6a.N(R.drawable.fantasy_pixel_pattern, 6, av8Var2);
            ay1 ay1Var = new ay1(lz.D(R.color.on_color_primary, av8Var2), 5);
            mv1 mv1Var = uxf.i;
            n12 n12Var = n12.a;
            utc utcVar = utc.a;
            wkn.l(N, bkh.c(n12Var.a(utcVar, mv1Var), 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var, av8Var2, 48, 56);
            wkn.l(s6a.N(R.drawable.fantasy_pixel_pattern, 6, av8Var2), bkh.c(f6a.D(n12Var.a(utcVar, uxf.k), -1.0f, 1.0f), 1.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(lz.D(R.color.on_color_primary, av8Var2), 5), av8Var2, 48, 56);
            kv1 kv1Var = uxf.p;
            xtc f0 = l98.f0(l98.d0(bkh.c, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            p4h p4hVar = ww9.d;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, f0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            lv1 lv1Var = uxf.m;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_calendar_date, 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.on_color_primary, av8Var2), av8Var2, 432, 0);
            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
            String w = oea.w(R.string.fantasy_round_reveal_countdown, new Object[]{Integer.valueOf(i2)}, av8Var2);
            long D = lz.D(R.color.on_color_primary, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(w, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 0, 24960, 110586);
            nq8.h(av8Var2, new goa(1.0f, true));
            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
            ImageVector N2 = s6a.N(R.drawable.ic_info, 6, av8Var2);
            long D2 = lz.D(R.color.on_color_primary, av8Var2);
            xtc l2 = bkh.l(utcVar, 24.0f);
            boolean z = (i4 & 7168) == 2048;
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = new ve7(1, function02);
                av8Var2.n0(O);
            }
            kq9.b(N2, null, tol.y(l2, false, false, false, 0L, null, (Function0) O, av8Var2, 29), D2, av8Var2, 48, 0);
            av8Var2.s(true);
            xtc x = gz8.x(utcVar, null, null, 3);
            x23 x23Var2 = x23.a;
            xtc a4 = x23Var2.a(1.0f, x, true);
            u23 a5 = t23.a(p4hVar, kv1Var, av8Var2, 48);
            int hashCode4 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C4 = fqj.C(av8Var2, a4);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a5, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C4, f50Var3);
            nq8.h(av8Var2, x23Var2.a(1.0f, utcVar, true));
            mhj mhjVar6 = ((js8) M.getValue()).d > 0 ? mhjVar2 : mhjVar3;
            if (((js8) M.getValue()).d > 0) {
                x23Var = x23Var2;
                mhjVar = mhjVar3;
            } else {
                x23Var = x23Var2;
                mhjVar = mhjVar4;
            }
            gvd.c(mhjVar6, mhjVar, ((js8) M.getValue()).d > 0 ? mhjVar4 : mhjVar5, lz.D(R.color.on_color_primary, av8Var2), null, null, v8a.v(16), 4.0f, av8Var2, 14155776, 48);
            udj.c(rik.j(context, j2, bi4.PATTERN_DMM, ", "), null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
            nq8.h(av8Var2, x23Var.a(1.0f, utcVar, true));
            function03 = function0;
            fz8.b(x23Var, !((js8) M.getValue()).a, null, null, null, null, yqo.H(1033229136, av8Var2, new r64(2, function03)), av8Var2, 1572870, 30);
            av8Var = av8Var2;
            ljg.t(av8Var, true, true, true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gj7(i2, j2, function03, function02, xtcVar, i3);
        }
    }

    public static final void i(do7 do7Var, Function1 function1, xtc xtcVar, boolean z, boolean z2, of3 of3Var, int i2) {
        xtc xtcVar2;
        long j2;
        do7 do7Var2 = do7Var;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1058100591);
        int i3 = 2;
        int i4 = i2 | (av8Var.g(do7Var2) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384 | (av8Var.h(z) ? a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192);
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            if (z) {
                j2 = ljg.f(av8Var, -1072572260, R.color.surface_2, av8Var, false);
            } else {
                av8Var.d0(-1072571462);
                av8Var.s(false);
                j2 = r13.h;
            }
            long f2 = z ? ljg.f(av8Var, -1072569892, R.color.surface_P, av8Var, false) : ljg.f(av8Var, -1072569284, R.color.surface_2, av8Var, false);
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.d(utcVar, 1.0f), j2, oyn.e);
            boolean z3 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object O = av8Var.O();
            if (z3 || O == nf3.a) {
                O = new vx6(function1, do7Var2, i3);
                av8Var.n0(O);
            }
            utc utcVar2 = utcVar;
            xtc c0 = l98.c0(tol.y(q, z2, false, false, 0L, null, (Function0) O, av8Var, 30), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            xtc l2 = bkh.l(utcVar2, 24.0f);
            ev6 ev6Var = do7Var2.c;
            td4.p(ev6Var.d, ev6Var.g, ev6Var.a, ev6Var.y, l2, av8Var, 24576);
            goa d2 = bf3.d(utcVar2, 16.0f, av8Var, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
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
            do7Var2 = do7Var;
            String str = do7Var2.b;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            nq8.h(av8Var, bkh.e(utcVar2, 2.0f));
            udj.c(dmi.q(ev6Var.x ? "[A] " : "", ev6Var.e), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            i.o(av8Var, true, utcVar2, 16.0f, av8Var);
            e(0, f2, av8Var, null, oea.v(ev6Var.i.m.a, av8Var));
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u93(do7Var2, function1, xtcVar2, z, z2, i2);
        }
    }

    public static final void j(v23 v23Var, ylj yljVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        int i4;
        boolean z;
        utc utcVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1228848282);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(v23Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(yljVar) ? 32 : 16;
        }
        int i5 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar2 = utc.a;
            nq8.h(av8Var2, v23Var.a(65.0f, utcVar2, true));
            n9k n9kVar = yljVar.j;
            r9k r9kVar = yljVar.k;
            String a2 = n9kVar.a(av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar2, 1.0f), lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 48, 0, 130040);
            nq8.h(av8Var2, v23Var.a(40.0f, utcVar2, true));
            c(yljVar, null, yqo.H(-874174814, av8Var2, new zlj(yljVar, i5)), av8Var2, ((i3 >> 3) & 14) | 384, 2);
            nq8.h(av8Var2, v23Var.a(40.0f, utcVar2, true));
            if (r9kVar != null) {
                av8Var2.d0(-1681549610);
                String a3 = r9kVar.a(av8Var2);
                dfj f2 = xth.f();
                long D = lz.D(R.color.on_color_primary, av8Var2);
                utcVar = utcVar2;
                i4 = 0;
                z = true;
                udj.c(a3, bkh.d(utcVar2, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, f2, av8Var2, 48, 0, 130040);
                av8Var = av8Var2;
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                z = true;
                i4 = 0;
                utcVar = utcVar2;
                av8Var.d0(-1681311096);
                av8Var.s(false);
            }
            nq8.h(av8Var, v23Var.a(70.0f, utcVar, z));
        } else {
            av8Var = av8Var2;
            i4 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new amj(v23Var, yljVar, i2, i4);
        }
    }

    public static final void k(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-417875232);
        int i3 = i2 | 6;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtcVar2 = utc.a;
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
            jca.i(oea.v(R.string.onboarding_notification_1_title, av8Var), oea.v(R.string.onboarding_notification_1_body_text, av8Var), F(18, 3), s6a.N(R.drawable.ic_sofascore_2, 6, av8Var), null, ww9.k, av8Var, 196608, 16);
            jca.i(oea.v(R.string.onboarding_notification_2_title, av8Var), oea.v(R.string.onboarding_notification_2_body_text, av8Var), F(17, 45), s6a.N(R.drawable.ic_sofascore_2, 6, av8Var), l98.d0(xtcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), ww9.l, av8Var, 221184, 0);
            jca.i(oea.v(R.string.onboarding_notification_3_title, av8Var), oea.v(R.string.onboarding_notification_3_body_text, av8Var), F(17, 35), s6a.N(R.drawable.ic_sofascore_2, 6, av8Var), l98.d0(xtcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), ww9.m, av8Var, 221184, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i2, 25);
        }
    }

    public static final void l(String str, String str2, tc3 tc3Var, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        str.getClass();
        str2.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2091257151);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function0) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.i(function02) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            g28 g28Var = bkh.c;
            xtc f0 = l98.f0(l98.d0(xtcVar.z(g28Var), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            int i4 = i3;
            tba.e(i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 4, av8Var, null, str, str2);
            goa goaVar = new goa(1.0f, true);
            mv1 mv1Var = uxf.g;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            ImageVector N = s6a.N(R.drawable.phone_frame, 6, av8Var);
            utc utcVar = utc.a;
            wkn.l(N, l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2).z(g28Var), mv1Var, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 28080, 96);
            int i5 = i4 >> 6;
            fc6.v(i5 & 14, tc3Var, av8Var, true);
            mha.h(oea.v(R.string.allow_notifications, av8Var), function0, kda.O(bkh.d(utcVar, 1.0f), "allow_notifications_button", av8Var), oqh.a, null, false, false, false, 0L, 0, 0, av8Var, (i5 & 112) | 3072, 0, 2032);
            mha.h(oea.v(R.string.onboarding_remind_me_later, av8Var), function02, kda.O(vxd.f(utcVar, 8.0f, av8Var, utcVar, 1.0f), "remind_me_later_button", av8Var), nqh.a, null, false, false, false, 0L, 0, 0, av8Var, ((i4 >> 9) & 112) | 3072, 0, 2032);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bi(str, str2, tc3Var, function0, function02, xtcVar, i2, 7);
        }
    }

    public static final void m(xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(520415647);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        int i5 = i3;
        if (av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            kwf kwfVar = new kwf(24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            xtc p = qx9.p(xtcVar, 0.7457714f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, p);
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
            i4 = 6;
            wkn.l(s6a.N(R.drawable.ic_ribbon, 6, av8Var), bkh.c, null, mp3.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25008, 104);
            mv1 mv1Var = uxf.d;
            n12 n12Var = n12.a;
            xtc A = wnn.A(qx9.p(n12Var.a(utc.a, mv1Var), 0.98002553f), kwfVar);
            k1c c3 = e12.c(uxf.g, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, A);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            tc3Var.invoke(n12Var, av8Var, Integer.valueOf(6 | (i5 & 112)));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            i4 = 6;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u30(xtcVar, tc3Var, i2, i4);
        }
    }

    public static final void n(xtc xtcVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(231790706);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new voi();
                av8Var.n0(O);
            }
            voi voiVar = (voi) O;
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            pvh pvhVar = new pvh(lz.D(R.color.darken_overlay_1, av8Var));
            v7b v7bVar = new v7b(b.j(new r13(hkg.d(4294944768L)), new r13(hkg.d(4289200128L)), new r13(hkg.d(4294944768L))), null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), 9187343241974906880L);
            xtc p = qx9.p(xtcVar, 0.98f);
            boolean g2 = av8Var.g(kx4Var) | av8Var.g(pvhVar);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                lwc lwcVar = new lwc(voiVar, kx4Var, pvhVar, v7bVar, 14);
                av8Var.n0(lwcVar);
                O2 = lwcVar;
            }
            xtc b0 = l98.b0(td4.Z(p, (Function1) O2), 16.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            tc3Var.invoke(n12.a, av8Var, Integer.valueOf((i3 & 112) | 6));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u30(xtcVar, tc3Var, i2, 5);
        }
    }

    public static final void o(v23 v23Var, ylj yljVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        boolean z;
        utc utcVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1296013603);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(v23Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(yljVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar2 = utc.a;
            nq8.h(av8Var, v23Var.a(40.0f, utcVar2, true));
            n9k n9kVar = yljVar.j;
            r9k r9kVar = yljVar.k;
            String a2 = n9kVar.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar2, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, v23Var.a(32.0f, utcVar2, true));
            av8Var = av8Var;
            c(yljVar, null, yqo.H(-485376213, av8Var, new zlj(yljVar, i5)), av8Var, ((i3 >> 3) & 14) | 384, 2);
            nq8.h(av8Var, v23Var.a(40.0f, utcVar2, true));
            if (r9kVar != null) {
                av8Var.d0(2080739629);
                i4 = 2;
                utcVar = utcVar2;
                z = true;
                udj.c(r9kVar.a(av8Var), bkh.d(utcVar2, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 130040);
                av8Var.s(false);
            } else {
                i4 = 2;
                z = true;
                utcVar = utcVar2;
                av8Var.d0(2080978143);
                av8Var.s(false);
            }
            nq8.h(av8Var, v23Var.a(70.0f, utcVar, z));
        } else {
            i4 = 2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new amj(v23Var, yljVar, i2, i4);
        }
    }

    public static final void p(v23 v23Var, ylj yljVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1416369954);
        int i5 = 4;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(v23Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(yljVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(65.0f, utcVar, true));
            String a2 = yljVar.j.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, v23Var.a(119.0f, utcVar, true));
            i4 = 3;
            av8Var = av8Var;
            c(yljVar, null, yqo.H(-963860694, av8Var, new zlj(yljVar, i5)), av8Var, ((i3 >> 3) & 14) | 384, 2);
            nq8.h(av8Var, v23Var.a(170.0f, utcVar, true));
        } else {
            i4 = 3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new amj(v23Var, yljVar, i2, i4);
        }
    }

    public static final void q(e9i e9iVar, ylj yljVar, of3 of3Var, int i2) {
        int i3;
        ylj yljVar2 = yljVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1224519379);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(yljVar2) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.p;
            xtc c0 = l98.c0(bkh.c, 12.0f, 30.0f);
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 54);
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
            String a3 = yljVar2.a.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj i4 = xth.i();
            long D = lz.D(R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            udj.c(a3, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, i4, av8Var, 48, 0, 130040);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            float a4 = e9iVar.a(1000, 2000);
            float f2 = (a4 * 0.1f) + 0.9f;
            xtc d2 = bkh.d(new goa(1.0f, true), 1.0f);
            boolean d3 = av8Var.d(a4) | av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d3 || O == a99Var) {
                O = new n28(22, a4, f2);
                av8Var.n0(O);
            }
            dy0.b(s02.M(d2, (Function1) O), uxf.g, yqo.H(25379297, av8Var, new zlj(yljVar, 1)), av8Var, 3120, 4);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            float a5 = e9iVar.a(2650, 500);
            float f3 = (0.1f * a5) + 0.9f;
            String a6 = yljVar.g.a(av8Var);
            dfj f4 = xth.f();
            long D2 = lz.D(R.color.on_color_primary, av8Var);
            xtc d4 = bkh.d(utcVar, 1.0f);
            boolean d5 = av8Var.d(a5) | av8Var.d(f3);
            Object O2 = av8Var.O();
            if (d5 || O2 == a99Var) {
                O2 = new n28(23, a5, f3);
                av8Var.n0(O2);
            }
            yljVar2 = yljVar;
            udj.c(a6, s02.M(d4, (Function1) O2), D2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, f4, av8Var, 0, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(e9iVar, yljVar2, i2, 12);
        }
    }

    public static final void r(ylj yljVar, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        String str;
        Team team;
        String p;
        ylj yljVar2 = yljVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1021141793);
        int i3 = i2 | (av8Var.g(yljVar2) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.p;
            g28 g28Var = bkh.c;
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
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
            Team team2 = yljVar2.c;
            Player player = yljVar2.b;
            if (team2 != null) {
                str = tba.p(context, team2);
            } else if (player == null || (str = tba.t(player)) == null) {
                str = "";
            }
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.i(), av8Var, 0, 24960, 109562);
            av8 av8Var2 = av8Var;
            utc utcVar = utc.a;
            nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
            lv1 lv1Var = uxf.m;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(kg0Var, lv1Var, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (team2 != null) {
                av8Var2.d0(1543417400);
                Country country = team2.getCountry();
                td4.k(country != null ? country.getAlpha2() : null, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var2, 48, 12);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            } else {
                av8Var2.d0(1543596735);
                td4.G((player == null || (team = player.getTeam()) == null) ? 0 : team.getId(), bkh.l(utcVar, 16.0f), false, 0L, av8Var2, 48, 12);
                av8Var2.s(false);
            }
            nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
            if (team2 != null) {
                Country country2 = team2.getCountry();
                p = tv3.c(context, country2 != null ? country2.getName() : null);
            } else {
                p = tba.p(context, player != null ? player.getTeam() : null);
            }
            av8 av8Var3 = av8Var2;
            utc utcVar2 = utcVar;
            udj.c(p, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var3, 0, 24960, 110586);
            bf3.t(av8Var3, true, utcVar2, 26.0f, av8Var3);
            if (player != null) {
                av8Var3.d0(1506597047);
                td4.C(player.getId(), bkh.l(utcVar2, 72.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 48, 12);
                av8Var3.s(false);
            } else {
                av8Var3.d0(1506686358);
                td4.G(team2 != null ? team2.getId() : 0, bkh.l(utcVar2, 72.0f), false, 0L, av8Var3, 48, 12);
                av8Var3.s(false);
            }
            udj.c(bf3.g(24.0f, R.string.season_25_top_player_profile_visits, av8Var3, av8Var3, utcVar2), null, lz.D(R.color.on_color_secondary, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var3, 0, 0, 131066);
            nq8.h(av8Var3, bkh.e(utcVar2, 2.0f));
            List list = dla.a;
            yljVar2 = yljVar;
            udj.c(dla.i(Integer.valueOf(yljVar.d)), null, lz.D(R.color.on_color_secondary, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var3, 0, 0, 131066);
            av8Var = av8Var3;
            av8Var.s(true);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(yljVar2, xtcVar2, i2, 0);
        }
    }

    public static final void s(v23 v23Var, ylj yljVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-610893054);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(v23Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(yljVar) ? 32 : 16;
        }
        int i4 = 1;
        if (!av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            av8Var.W();
        } else if (yljVar.e) {
            av8Var.d0(1342297888);
            j(v23Var, yljVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            av8Var.s(false);
        } else if (yljVar.f) {
            av8Var.d0(1342300132);
            o(v23Var, yljVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            av8Var.s(false);
        } else {
            av8Var.d0(1342301786);
            p(v23Var, yljVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new amj(v23Var, yljVar, i2, i4);
        }
    }

    public static float t(EdgeEffect edgeEffect, float f2, float f3, kx4 kx4Var) {
        float f4 = lg5.a;
        double j2 = kx4Var.j() * 386.0878f * 160.0f * 0.84f;
        double d2 = lg5.a * j2;
        float exp = (float) (Math.exp((lg5.b / lg5.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (exp > (i2 >= 31 ? qz.l(edgeEffect) : 0.0f) * f3) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int b2 = wzb.b(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(b2);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(b2);
        }
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(sq3 sq3Var) {
        jv4 jv4Var;
        int i2;
        if (sq3Var instanceof jv4) {
            jv4Var = (jv4) sq3Var;
            int i3 = jv4Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jv4Var.s = i3 - Integer.MIN_VALUE;
                Object obj = jv4Var.r;
                lu3 lu3Var = lu3.a;
                i2 = jv4Var.s;
                if (i2 != 0) {
                    y6a.M(obj);
                    jv4Var.s = 1;
                    lj2 lj2Var = new lj2(1, z9a.b(jv4Var));
                    lj2Var.t();
                    if (lj2Var.q() == lu3Var) {
                        return;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    y6a.M(obj);
                }
                pvd.x();
            }
        }
        jv4Var = new jv4(sq3Var);
        Object obj2 = jv4Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = jv4Var.s;
        if (i2 != 0) {
        }
        pvd.x();
    }

    public static final void v(xbb xbbVar, vm8 vm8Var) {
        if (vm8Var instanceof xn1) {
            xbbVar.add(((xn1) vm8Var).a);
            return;
        }
        if (vm8Var instanceof oh3) {
            Iterator it = ((oh3) vm8Var).a.iterator();
            while (it.hasNext()) {
                v(xbbVar, (fed) it.next());
            }
            return;
        }
        if (vm8Var instanceof el3) {
            return;
        }
        if (vm8Var instanceof zgh) {
            v(xbbVar, ((zgh) vm8Var).a);
            return;
        }
        if (!(vm8Var instanceof dp)) {
            if (vm8Var instanceof mvd) {
                v(xbbVar, ((mvd) vm8Var).b);
                return;
            } else {
                zzl.b();
                return;
            }
        }
        dp dpVar = (dp) vm8Var;
        v(xbbVar, dpVar.a);
        Iterator it2 = dpVar.b.iterator();
        while (it2.hasNext()) {
            v(xbbVar, (vm8) it2.next());
        }
    }

    public static final void w(zci zciVar, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            g1c g1cVar = (g1c) list.get(i2);
            Object A = ww9.A(g1cVar);
            if (A == null) {
                g1cVar.h();
                A = new mx9();
            }
            fm3 b2 = zciVar.b(A.toString());
            if (b2 != null) {
                b2.f0 = g1cVar;
                wm3 wm3Var = b2.g0;
                if (wm3Var != null) {
                    wm3Var.g0 = g1cVar;
                }
            }
            g1cVar.h();
        }
    }

    public static final void x(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                de6.a(th, th2);
            }
        }
    }

    public static final Object y(long j2, rq3 rq3Var) {
        if (j2 <= 0) {
            return Unit.a;
        }
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        if (j2 < Long.MAX_VALUE) {
            E(lj2Var.e).f(j2, lj2Var);
        }
        Object q = lj2Var.q();
        return q == lu3.a ? q : Unit.a;
    }

    public static final Object z(long j2, rq3 rq3Var) {
        Object y = y(R(j2), rq3Var);
        return y == lu3.a ? y : Unit.a;
    }
}
