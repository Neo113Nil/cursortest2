package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.google.android.material.appbar.MaterialToolbar;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class wkn implements hn5 {
    public static gmo a = null;
    public static final float j = 30.0f;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final tc3 f = new tc3(-2081135921, new qs2(22), false);
    public static final tc3 g = new tc3(-602668581, new gd3(3), false);
    public static final tc3 h = new tc3(325527028, new pd3(23), false);
    public static final sw9 i = new sw9(24);
    public static final ifa k = new ifa(2);
    public static final q6i l = new q6i(8);

    public static final String A(s3h s3hVar, Resources resources) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        l3h l3hVar = s3hVar.d;
        l3h l3hVar2 = s3hVar.d;
        Object g2 = l3hVar.a.g(w3h.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        x0d x0dVar = l3hVar2.a;
        Object g3 = x0dVar.g(w3h.L);
        if (g3 == null) {
            g3 = null;
        }
        vjj vjjVar = (vjj) g3;
        Object g4 = x0dVar.g(w3h.z);
        if (g4 == null) {
            g4 = null;
        }
        u5g u5gVar = (u5g) g4;
        if (vjjVar != null) {
            int ordinal = vjjVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    if (g2 == null) {
                        g2 = resources.getString(R.string.indeterminate);
                    }
                } else if (u5gVar != null && u5gVar.a == 2 && g2 == null) {
                    g2 = resources.getString(R.string.state_off);
                }
            } else if (u5gVar != null && u5gVar.a == 2 && g2 == null) {
                g2 = resources.getString(R.string.state_on);
            }
        }
        Object g5 = x0dVar.g(w3h.K);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((u5gVar == null || u5gVar.a != 4) && g2 == null) {
                g2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object g6 = x0dVar.g(w3h.c);
        if (g6 == null) {
            g6 = null;
        }
        dcf dcfVar = (dcf) g6;
        if (dcfVar != null) {
            if (dcfVar != dcf.c) {
                if (g2 == null) {
                    lz2 lz2Var = dcfVar.b;
                    float floatValue = Float.valueOf(lz2Var.a).floatValue() - valueOf.floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (dcfVar.a - valueOf.floatValue()) / (Float.valueOf(lz2Var.a).floatValue() - valueOf.floatValue());
                    if (floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        floatValue = 0.0f;
                    }
                    if (floatValue > 1.0f) {
                        floatValue = 1.0f;
                    }
                    g2 = resources.getString(R.string.template_percent, Integer.valueOf(floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : floatValue == 1.0f ? 100 : llf.c(Math.round(floatValue * 100.0f), 1, 99)));
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        a4h a4hVar = w3h.G;
        if (x0dVar.c(a4hVar)) {
            x0d x0dVar2 = new s3h(s3hVar.a, true, s3hVar.c, l3hVar2).k().a;
            Object g7 = x0dVar2.g(w3h.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = x0dVar2.g(w3h.C);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = x0dVar2.g(a4hVar);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final q80 B(s3h s3hVar) {
        Object g2 = s3hVar.d.a.g(w3h.G);
        if (g2 == null) {
            g2 = null;
        }
        q80 q80Var = (q80) g2;
        Object g3 = s3hVar.d.a.g(w3h.C);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return q80Var == null ? list != null ? (q80) CollectionsKt.firstOrNull(list) : null : q80Var;
    }

    public static ArrayList C(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static int E(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return o23.d(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean F(s3h s3hVar, Resources resources) {
        Object g2 = s3hVar.d.a.g(w3h.a);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return !rd0.J(s3hVar) && (s3hVar.d.c || (s3hVar.q() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || B(s3hVar) != null || A(s3hVar, resources) != null || z(s3hVar))));
    }

    public static float G(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static ke2 H(fad fadVar) {
        int i2;
        String str;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Map.Entry entry : fadVar.a.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) CollectionsKt.firstOrNull((List) entry.getValue());
            if (str4 != null) {
                int i6 = 1;
                if (c.o(str3, "Cache-Control", true)) {
                    if (str2 == null) {
                        str2 = str4;
                    }
                } else if (c.o(str3, "Pragma", true)) {
                }
                int i7 = 0;
                while (i7 < str4.length()) {
                    xj4 xj4Var = djk.a;
                    int length = str4.length();
                    int i8 = i7;
                    while (true) {
                        if (i8 >= length) {
                            i8 = str4.length();
                            break;
                        }
                        if (StringsKt.K("=,;", str4.charAt(i8))) {
                            break;
                        }
                        i8++;
                    }
                    String obj = StringsKt.l0(str4.substring(i7, i8)).toString();
                    if (i8 == str4.length() || str4.charAt(i8) == ',' || str4.charAt(i8) == ';') {
                        i2 = i8 + 1;
                        str = null;
                    } else {
                        int i9 = i8 + 1;
                        int length2 = str4.length();
                        while (true) {
                            if (i9 >= length2) {
                                i9 = str4.length();
                                break;
                            }
                            char charAt = str4.charAt(i9);
                            if (charAt != ' ' && charAt != '\t') {
                                break;
                            }
                            i9++;
                        }
                        if (i9 >= str4.length() || str4.charAt(i9) != '\"') {
                            int length3 = str4.length();
                            int i10 = i9;
                            while (true) {
                                if (i10 >= length3) {
                                    i10 = str4.length();
                                    break;
                                }
                                if (StringsKt.K(",;", str4.charAt(i10))) {
                                    break;
                                }
                                i10++;
                            }
                            String obj2 = StringsKt.l0(str4.substring(i9, i10)).toString();
                            i2 = i10;
                            str = obj2;
                        } else {
                            int i11 = i9 + 1;
                            int O = StringsKt.O(str4, '\"', i11, 4);
                            str = str4.substring(i11, O);
                            i2 = O + i6;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(obj)) {
                        i7 = i2;
                        z = true;
                    } else if ("no-store".equalsIgnoreCase(obj)) {
                        i7 = i2;
                        z2 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(obj)) {
                            i3 = djk.a(-1, str);
                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                            djk.a(-1, str);
                        } else if (!"private".equalsIgnoreCase(obj) && !"public".equalsIgnoreCase(obj)) {
                            if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i7 = i2;
                                z3 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i4 = djk.a(Integer.MAX_VALUE, str);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i5 = djk.a(-1, str);
                            } else if (!"only-if-cached".equalsIgnoreCase(obj) && !"no-transform".equalsIgnoreCase(obj)) {
                                "immutable".equalsIgnoreCase(obj);
                            }
                        }
                        i7 = i2;
                    }
                    i6 = 1;
                }
            }
        }
        return new ke2(z, z2, i3, z3, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b8, code lost:
    
        if (r5 == r26.length()) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c0, code lost:
    
        if (r26.charAt(r5) != 'S') goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
    
        r2 = (r14 * 1000000000) + r15;
        r14 = r9;
        r4 = defpackage.be5.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d2, code lost:
    
        switch(r4.ordinal()) {
            case 0: goto L128;
            case 1: goto L127;
            case 2: goto L126;
            case 3: goto L125;
            case 4: goto L124;
            case 5: goto L123;
            case 6: goto L122;
            default: goto L121;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d5, code lost:
    
        defpackage.cp4.g(r4, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01dd, code lost:
    
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0206, code lost:
    
        r2 = defpackage.wzb.c(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e3, code lost:
    
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e9, code lost:
    
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ef, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f5, code lost:
    
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fb, code lost:
    
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0201, code lost:
    
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0104, code lost:
    
        defpackage.a70.p("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0107, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00f2, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r5 >= r26.length()) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        r3 = r26.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if ('0' > r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r3 >= ':') goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r5 == r26.length()) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        if (r2 == '+') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        if (r2 == '-') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if (r5 == (r23 + r2)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        r20 = 4611686018427387903L;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[LOOP:5: B:75:0x015a->B:76:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195 A[LOOP:7: B:87:0x0193->B:88:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long I(String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int min;
        int i8;
        char charAt;
        int i9;
        int i10;
        if (str.length() == 0) {
            a70.p("The string is empty");
            return 0L;
        }
        char charAt2 = str.charAt(0);
        int i11 = 1;
        char c2 = '-';
        char c3 = '+';
        if (charAt2 != '+') {
            i3 = charAt2 != '-' ? 0 : 1;
            i2 = i3;
        } else {
            i2 = 0;
            i3 = 1;
        }
        if (str.length() <= i3) {
            a70.p("No components");
            return 0L;
        }
        if (str.charAt(i3) != 'P') {
            a70.p("");
            return 0L;
        }
        int i12 = i3 + 1;
        if (i12 == str.length()) {
            a70.p("");
            return 0L;
        }
        int i13 = 0;
        be5 be5Var = null;
        long j3 = 0;
        long j4 = 0;
        while (i12 < str.length()) {
            char charAt3 = str.charAt(i12);
            if (charAt3 != 'T') {
                wjb wjbVar = wjb.c;
                int i14 = i11;
                char charAt4 = str.charAt(i12);
                if (charAt4 == c3) {
                    i4 = i12 + 1;
                } else {
                    if (charAt4 == c2) {
                        i4 = i12 + 1;
                        i5 = -1;
                        while (i4 < str.length() && str.charAt(i4) == '0') {
                            i4++;
                        }
                        j2 = 0;
                        while (true) {
                            if (i4 >= str.length()) {
                                char charAt5 = str.charAt(i4);
                                i6 = i12;
                                if ('0' <= charAt5 && charAt5 < ':') {
                                    i9 = charAt5 - '0';
                                    i10 = i2;
                                    long j5 = wjbVar.a;
                                    if (j2 <= j5 && (j2 != j5 || i9 <= wjbVar.b)) {
                                        j2 = (j2 << 3) + (j2 << i14) + i9;
                                        i4++;
                                        i12 = i6;
                                        wjbVar = wjbVar;
                                        i2 = i10;
                                    }
                                }
                            } else {
                                i6 = i12;
                            }
                        }
                        int i15 = i2;
                        if (i4 != str.length()) {
                            if (i4 == i6 + ((charAt3 == '+' || charAt3 == '-') ? i14 : 0)) {
                            }
                            long j6 = j2;
                            if (str.charAt(i4) == '.') {
                                int i16 = i4 + 1;
                                int min2 = Math.min(i4 + 7, str.length());
                                int i17 = 0;
                                for (int i18 = i16; i18 < min2; i18++) {
                                    char charAt6 = str.charAt(i18);
                                    if ('0' <= charAt6 && charAt6 < ':') {
                                        i17 = (charAt6 - '0') + (i17 << 3) + (i17 << 1);
                                    }
                                    for (i7 = 0; i7 < 6 - (i18 - i16); i7++) {
                                        i17 = (i17 << 1) + (i17 << 3);
                                    }
                                    min = Math.min(i18 + 9, str.length());
                                    i4 = i18;
                                    int i19 = 0;
                                    while (i4 < min) {
                                        char charAt7 = str.charAt(i4);
                                        int i20 = min;
                                        if ('0' <= charAt7 && charAt7 < ':') {
                                            i19 = (charAt7 - '0') + (i19 << 3) + (i19 << 1);
                                            i4++;
                                            min = i20;
                                        }
                                        for (i8 = 0; i8 < 9 - (i4 - i18); i8++) {
                                            i19 = (i19 << 1) + (i19 << 3);
                                        }
                                        while (i4 < str.length() && '0' <= (charAt = str.charAt(i4)) && charAt < ':') {
                                            i4++;
                                        }
                                        a70.p("");
                                        return 0L;
                                    }
                                    while (i8 < 9 - (i4 - i18)) {
                                    }
                                    while (i4 < str.length()) {
                                        i4++;
                                    }
                                    a70.p("");
                                    return 0L;
                                }
                                while (i7 < 6 - (i18 - i16)) {
                                }
                                min = Math.min(i18 + 9, str.length());
                                i4 = i18;
                                int i192 = 0;
                                while (i4 < min) {
                                }
                                while (i8 < 9 - (i4 - i18)) {
                                }
                                while (i4 < str.length()) {
                                }
                                a70.p("");
                                return 0L;
                            }
                            char charAt8 = str.charAt(i4);
                            be5 be5Var2 = charAt8 != 'D' ? charAt8 != 'H' ? charAt8 != 'M' ? charAt8 != 'S' ? null : be5.SECONDS : be5.MINUTES : be5.HOURS : be5.DAYS;
                            if (be5Var2 == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                            }
                            if (be5Var != null && be5Var.compareTo(be5Var2) <= 0) {
                                a70.p("Unexpected order of duration components");
                                return 0L;
                            }
                            if (be5Var2 == be5.DAYS) {
                                if (i13 != 0) {
                                    a70.p("");
                                    return 0L;
                                }
                                j3 = de5.b(j6, be5Var2) * i5;
                            } else {
                                if (i13 == 0) {
                                    a70.p("");
                                    return 0L;
                                }
                                long p = p(j3, de5.b(j6, be5Var2) * i5);
                                if (p == 9223372036854759646L) {
                                    a70.p("");
                                    return 0L;
                                }
                                j3 = p;
                            }
                            i12 = i4 + 1;
                            be5Var = be5Var2;
                            i11 = i14;
                            i2 = i15;
                            c2 = '-';
                            c3 = '+';
                        }
                        a70.p("");
                        return 0L;
                    }
                    i4 = i12;
                }
                i5 = i14;
                while (i4 < str.length()) {
                    i4++;
                }
                j2 = 0;
                while (true) {
                    if (i4 >= str.length()) {
                    }
                    j2 = (j2 << 3) + (j2 << i14) + i9;
                    i4++;
                    i12 = i6;
                    wjbVar = wjbVar;
                    i2 = i10;
                }
                int i152 = i2;
                if (i4 != str.length()) {
                }
                a70.p("");
                return 0L;
            }
            if (i13 != 0 || (i12 = i12 + 1) == str.length()) {
                a70.p("");
                return 0L;
            }
            i13 = i11;
        }
        int i21 = i2;
        long i22 = xd5.i(S(j3, be5.MILLISECONDS), S(j4, be5.NANOSECONDS));
        if (i21 == 0) {
            return i22;
        }
        xd5.b.getClass();
        return !xd5.d(i22, xd5.e) ? xd5.m(i22) : i22;
    }

    public static void J(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                hda.L(new IllegalStateException(vxd.l(j4, "More produced than requested: ")));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
    }

    public static int K(int i2, nkk nkkVar) {
        switch (i2) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return nkkVar.s() + 1;
            case 7:
                return nkkVar.x() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i2 - 8);
            default:
                return -1;
        }
    }

    public static final Object M(ne8 ne8Var, int i2, Function1 function1) {
        int i3;
        int i4;
        Object obj;
        wtc wtcVar;
        gqa o1;
        c40 c40Var;
        if (!ne8Var.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        wtc wtcVar2 = ne8Var.a.e;
        wma c0 = c6o.c0(ne8Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            obj = null;
            if (c0 == null) {
                wtcVar = null;
                break;
            }
            if ((((wtc) c0.F.g).d & 1024) != 0) {
                while (wtcVar2 != null) {
                    if ((wtcVar2.c & 1024) != 0) {
                        wtcVar = wtcVar2;
                        i1d i1dVar = null;
                        while (wtcVar != null) {
                            if (wtcVar instanceof ne8) {
                                break loop0;
                            }
                            if ((wtcVar.c & 1024) != 0 && (wtcVar instanceof bw4)) {
                                int i5 = 0;
                                for (wtc wtcVar3 = ((bw4) wtcVar).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                    if ((wtcVar3.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            wtcVar = wtcVar3;
                                        } else {
                                            if (i1dVar == null) {
                                                i1dVar = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar != null) {
                                                i1dVar.b(wtcVar);
                                                wtcVar = null;
                                            }
                                            i1dVar.b(wtcVar3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            wtcVar = c6o.X(i1dVar);
                        }
                    }
                    wtcVar2 = wtcVar2.e;
                }
            }
            c0 = c0.v();
            wtcVar2 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
        }
        ne8 ne8Var2 = (ne8) wtcVar;
        if ((ne8Var2 == null || !Intrinsics.c(ne8Var2.o1(), ne8Var.o1())) && (o1 = ne8Var.o1()) != null) {
            int i6 = 5;
            if (i2 != 5) {
                i6 = 6;
                if (i2 != 6) {
                    i6 = 3;
                    if (i2 != 3) {
                        i6 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i4 = 2;
                            } else if (i2 != 2) {
                                a70.r("Unsupported direction for beyond bounds layout");
                            }
                            if (o1.o.getItemCount() > 0 || !o1.o.b() || !o1.n) {
                                return function1.invoke(gqa.r);
                            }
                            boolean l1 = o1.l1(i4);
                            hqa hqaVar = o1.o;
                            int d2 = l1 ? hqaVar.d() : hqaVar.c();
                            fsf fsfVar = new fsf();
                            cqa cqaVar = o1.p;
                            cqaVar.getClass();
                            bqa bqaVar = new bqa(d2, d2);
                            ((i1d) cqaVar.a).b(bqaVar);
                            fsfVar.a = bqaVar;
                            int a2 = o1.o.a() * 2;
                            int itemCount = o1.o.getItemCount();
                            if (a2 > itemCount) {
                                a2 = itemCount;
                            }
                            while (obj == null && o1.k1((bqa) fsfVar.a, i4) && i3 < a2) {
                                bqa bqaVar2 = (bqa) fsfVar.a;
                                int i7 = bqaVar2.a;
                                int i8 = bqaVar2.b;
                                if (o1.l1(i4)) {
                                    i8++;
                                } else {
                                    i7--;
                                }
                                cqa cqaVar2 = o1.p;
                                cqaVar2.getClass();
                                bqa bqaVar3 = new bqa(i7, i8);
                                ((i1d) cqaVar2.a).b(bqaVar3);
                                ((i1d) o1.p.a).q((bqa) fsfVar.a);
                                fsfVar.a = bqaVar3;
                                i3++;
                                c6o.c0(o1).l();
                                obj = function1.invoke(new fqa(o1, fsfVar, i4));
                            }
                            ((i1d) o1.p.a).q((bqa) fsfVar.a);
                            c6o.c0(o1).l();
                            return obj;
                        }
                    }
                }
            }
            i4 = i6;
            if (o1.o.getItemCount() > 0) {
            }
            return function1.invoke(gqa.r);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean O(bp4 bp4Var, boolean z) {
        int i2;
        j9e j9eVar = new j9e(16);
        boolean z2 = true;
        while (true) {
            j9eVar.K(8);
            if (!bp4Var.peekFully(j9eVar.a, 0, 8, true)) {
                break;
            }
            long C = j9eVar.C();
            int m2 = j9eVar.m();
            if (C != 1) {
                i2 = 8;
            } else {
                if (!bp4Var.peekFully(j9eVar.a, 8, 8, true)) {
                    break;
                }
                C = j9eVar.G();
                i2 = 16;
            }
            long j2 = i2;
            if (C < j2) {
                break;
            }
            int i3 = (int) (C - j2);
            if (z2) {
                if (m2 != 1718909296 || i3 < 8) {
                    break;
                }
                j9eVar.K(4);
                bp4Var.peekFully(j9eVar.a, 0, 4, false);
                if (j9eVar.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    break;
                }
                bp4Var.c(i3 - 4, false);
                z2 = false;
            } else {
                if (m2 == 1836086884) {
                    break;
                }
                if (i3 != 0) {
                    bp4Var.c(i3, false);
                }
            }
        }
        return false;
    }

    public static final long Q(double d2, be5 be5Var) {
        be5Var.getClass();
        double a2 = ce5.a(d2, be5Var, be5.NANOSECONDS);
        if (Double.isNaN(a2)) {
            a70.p("Duration value cannot be NaN.");
            return 0L;
        }
        long c2 = wzb.c(a2);
        return (-4611686018426999999L > c2 || c2 >= 4611686018427000000L) ? v(wzb.c(ce5.a(d2, be5Var, be5.MILLISECONDS))) : w(c2);
    }

    public static final long R(int i2, be5 be5Var) {
        if (be5Var.compareTo(be5.SECONDS) > 0) {
            return S(i2, be5Var);
        }
        long j2 = i2;
        be5 be5Var2 = be5.NANOSECONDS;
        return w(TimeUnit.NANOSECONDS.convert(j2, be5Var.a));
    }

    public static final long S(long j2, be5 be5Var) {
        be5Var.getClass();
        be5 be5Var2 = be5.NANOSECONDS;
        TimeUnit timeUnit = be5Var.a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j2 && j2 <= convert) {
            return w(timeUnit2.convert(j2, timeUnit));
        }
        if (be5Var.compareTo(be5.MILLISECONDS) < 0) {
            return u(llf.e(TimeUnit.MILLISECONDS.convert(j2, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long signum = Long.signum(j2);
        if (j2 < C.TIME_UNSET) {
            j2 = -9223372036854775807L;
        }
        return u(de5.b(Math.abs(j2), be5Var) * signum);
    }

    public static float T() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Object obj, xtc xtcVar, j38 j38Var, Function1 function1, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        xtc xtcVar2;
        int i5;
        int i6;
        Function1 function12;
        j38 j38Var2;
        Function1 function13;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1964690758);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? av8Var.g(obj) : av8Var.i(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? 32 : 16;
            i5 = i4 | 384;
            i6 = i3 & 8;
            if (i6 == 0) {
                i5 = i4 | 3456;
            } else if ((i2 & 3072) == 0) {
                function12 = function1;
                i5 |= av8Var.i(function12) ? a.o : 1024;
                if ((i2 & 24576) == 0) {
                    i5 |= av8Var.i(tc3Var) ? 16384 : 8192;
                }
                if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
                    xtc xtcVar3 = i7 != 0 ? utc.a : xtcVar2;
                    i4k h0 = s02.h0(0, 0, null, 7);
                    if (i6 != 0) {
                        Object O = av8Var.O();
                        if (O == nf3.a) {
                            O = new q73(13);
                            av8Var.n0(O);
                        }
                        function12 = (Function1) O;
                    }
                    Function1 function14 = function12;
                    xtc xtcVar4 = xtcVar3;
                    wnn.b(yso.L(obj, "", av8Var, (i5 & 8) | 48 | (i5 & 14), 0), xtcVar4, h0, function14, tc3Var, av8Var, i5 & 65520, 0);
                    xtcVar2 = xtcVar4;
                    j38Var2 = h0;
                    function13 = function14;
                } else {
                    av8Var.W();
                    j38Var2 = j38Var;
                    function13 = function12;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new ei(obj, xtcVar2, j38Var2, function13, tc3Var, i2, i3);
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i2 & 24576) == 0) {
            }
            if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i4 | 384;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        function12 = function1;
        if ((i2 & 24576) == 0) {
        }
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(xtc xtcVar, long j2, Gender gender, String str, long j3, boolean z, Integer num, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        int i4;
        long j4;
        int i5;
        int i6;
        int i7;
        String str2;
        int i8;
        long j5;
        int i9;
        int i10;
        boolean z2;
        int i11;
        Integer num2;
        int i12;
        int i13;
        final Gender gender2;
        final String str3;
        final long j6;
        final boolean z3;
        final Integer num3;
        final xtc xtcVar3;
        final long j7;
        eqf u;
        int i14;
        String str4;
        long j8;
        int i15;
        xtc xtcVar4;
        Gender gender3;
        long j9;
        Integer num4;
        boolean z4;
        long j10;
        boolean z5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-38705536);
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i2 | 6;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i2 | (av8Var.g(xtcVar2) ? 4 : 2);
        }
        if ((i3 & 2) == 0) {
            j4 = j2;
            if (av8Var.f(j4)) {
                i5 = 32;
                int i17 = i4 | i5;
                i6 = i3 & 4;
                if (i6 == 0) {
                    i7 = i17 | 384;
                } else {
                    i7 = i17 | (av8Var.e(gender == null ? -1 : gender.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
                }
                if ((i3 & 8) != 0) {
                    str2 = str;
                    if (av8Var.g(str2)) {
                        i8 = a.o;
                        int i18 = i7 | i8;
                        if ((i3 & 16) == 0) {
                            j5 = j3;
                            if (av8Var.f(j5)) {
                                i9 = 16384;
                                int i19 = i18 | i9;
                                i10 = i3 & 32;
                                if (i10 == 0) {
                                    i19 |= 196608;
                                } else if ((i2 & 196608) == 0) {
                                    z2 = z;
                                    i19 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                    i11 = i3 & 64;
                                    if (i11 != 0) {
                                        i12 = i19 | 1572864;
                                        num2 = num;
                                    } else {
                                        num2 = num;
                                        i12 = i19 | (av8Var.g(num2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
                                    }
                                    i13 = i12;
                                    if (av8Var.T(i13 & 1, (599187 & i12) != 599186)) {
                                        av8Var.Y();
                                        int i20 = i2 & 1;
                                        utc utcVar = utc.a;
                                        if (i20 == 0 || av8Var.B()) {
                                            if (i16 != 0) {
                                                xtcVar2 = utcVar;
                                            }
                                            if ((i3 & 2) != 0) {
                                                j4 = lz.D(R.color.primary_default, av8Var);
                                                i14 = i13 & (-113);
                                            } else {
                                                i14 = i13;
                                            }
                                            Gender gender4 = i6 != 0 ? null : gender;
                                            if ((i3 & 8) != 0) {
                                                str4 = s02.H(R.string.player_of_the_match, gender4, null, av8Var, 4);
                                                i14 &= -7169;
                                            } else {
                                                str4 = str2;
                                            }
                                            if ((i3 & 16) != 0) {
                                                j8 = lz.D(R.color.n_lv_1, av8Var);
                                                i14 &= -57345;
                                            } else {
                                                j8 = j5;
                                            }
                                            if (i10 != 0) {
                                                z2 = false;
                                            }
                                            if (i11 != 0) {
                                                num4 = null;
                                                i15 = i14;
                                                xtcVar4 = xtcVar2;
                                                gender3 = gender4;
                                                j9 = j8;
                                                z4 = z2;
                                                av8Var.t();
                                                lv1 lv1Var = uxf.m;
                                                xtc d0 = l98.d0(xtcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                                                l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                                                int hashCode = Long.hashCode(av8Var.T);
                                                aee m2 = av8Var.m();
                                                xtc C = fqj.C(av8Var, d0);
                                                if3.k7.getClass();
                                                zg3 zg3Var = hf3.b;
                                                av8Var.h0();
                                                if (av8Var.S) {
                                                    av8Var.q0();
                                                } else {
                                                    av8Var.l(zg3Var);
                                                }
                                                waa.K(av8Var, a2, hf3.g);
                                                waa.K(av8Var, m2, hf3.f);
                                                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                                waa.J(av8Var, hf3.k);
                                                waa.K(av8Var, C, hf3.d);
                                                if (z4) {
                                                    av8Var.d0(1013944887);
                                                    long j11 = j4;
                                                    c5n.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i15 >> 3) & 14, 30, j11, 0L, av8Var, null);
                                                    j10 = j11;
                                                    z5 = false;
                                                    av8Var.s(false);
                                                } else {
                                                    av8Var.d0(1013857684);
                                                    c5n.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i15 & 112, 29, j4, 0L, av8Var, null);
                                                    z5 = false;
                                                    av8Var.s(false);
                                                    j10 = j4;
                                                }
                                                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                                                yf8 yf8Var = xth.a;
                                                xtc xtcVar5 = xtcVar4;
                                                String str5 = str4;
                                                udj.c(str5, null, j9, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, ((i15 >> 9) & 14) | ((i15 >> 6) & 896), 24960, 110586);
                                                av8Var = av8Var;
                                                if (num4 != null) {
                                                    av8Var.d0(1014298596);
                                                    av8Var.s(false);
                                                } else {
                                                    ljg.r(4.0f, 1014298597, av8Var, av8Var, utcVar);
                                                    kq9.b(s6a.N(num4.intValue(), ((i15 >> 15) & 112) | 6, av8Var), null, bkh.l(utcVar, 16.0f), j9, av8Var, ((i15 >> 3) & 7168) | 432, 0);
                                                    av8Var.s(false);
                                                }
                                                av8Var.s(true);
                                                j6 = j9;
                                                str3 = str5;
                                                gender2 = gender3;
                                                z3 = z4;
                                                num3 = num4;
                                                j7 = j10;
                                                xtcVar3 = xtcVar5;
                                            } else {
                                                i15 = i14;
                                                xtcVar4 = xtcVar2;
                                                gender3 = gender4;
                                                j9 = j8;
                                            }
                                        } else {
                                            av8Var.W();
                                            int i21 = (i3 & 2) != 0 ? i13 & (-113) : i13;
                                            if ((i3 & 8) != 0) {
                                                i21 &= -7169;
                                            }
                                            if ((i3 & 16) != 0) {
                                                i21 &= -57345;
                                            }
                                            gender3 = gender;
                                            i15 = i21;
                                            xtcVar4 = xtcVar2;
                                            str4 = str2;
                                            j9 = j5;
                                        }
                                        z4 = z2;
                                        num4 = num2;
                                        av8Var.t();
                                        lv1 lv1Var2 = uxf.m;
                                        xtc d02 = l98.d0(xtcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                                        l8g a22 = k8g.a(ww9.b, lv1Var2, av8Var, 48);
                                        int hashCode2 = Long.hashCode(av8Var.T);
                                        aee m22 = av8Var.m();
                                        xtc C2 = fqj.C(av8Var, d02);
                                        if3.k7.getClass();
                                        zg3 zg3Var2 = hf3.b;
                                        av8Var.h0();
                                        if (av8Var.S) {
                                        }
                                        waa.K(av8Var, a22, hf3.g);
                                        waa.K(av8Var, m22, hf3.f);
                                        waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                                        waa.J(av8Var, hf3.k);
                                        waa.K(av8Var, C2, hf3.d);
                                        if (z4) {
                                        }
                                        nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                                        yf8 yf8Var2 = xth.a;
                                        xtc xtcVar52 = xtcVar4;
                                        String str52 = str4;
                                        udj.c(str52, null, j9, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, ((i15 >> 9) & 14) | ((i15 >> 6) & 896), 24960, 110586);
                                        av8Var = av8Var;
                                        if (num4 != null) {
                                        }
                                        av8Var.s(true);
                                        j6 = j9;
                                        str3 = str52;
                                        gender2 = gender3;
                                        z3 = z4;
                                        num3 = num4;
                                        j7 = j10;
                                        xtcVar3 = xtcVar52;
                                    } else {
                                        av8Var.W();
                                        gender2 = gender;
                                        str3 = str2;
                                        j6 = j5;
                                        z3 = z2;
                                        num3 = num2;
                                        xtcVar3 = xtcVar2;
                                        j7 = j4;
                                    }
                                    u = av8Var.u();
                                    if (u != null) {
                                        u.d = new Function2() { // from class: j56
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                wkn.b(xtc.this, j7, gender2, str3, j6, z3, num3, (of3) obj, aba.K(i2 | 1), i3);
                                                return Unit.a;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                                z2 = z;
                                i11 = i3 & 64;
                                if (i11 != 0) {
                                }
                                i13 = i12;
                                if (av8Var.T(i13 & 1, (599187 & i12) != 599186)) {
                                }
                                u = av8Var.u();
                                if (u != null) {
                                }
                            }
                        } else {
                            j5 = j3;
                        }
                        i9 = 8192;
                        int i192 = i18 | i9;
                        i10 = i3 & 32;
                        if (i10 == 0) {
                        }
                        z2 = z;
                        i11 = i3 & 64;
                        if (i11 != 0) {
                        }
                        i13 = i12;
                        if (av8Var.T(i13 & 1, (599187 & i12) != 599186)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                } else {
                    str2 = str;
                }
                i8 = 1024;
                int i182 = i7 | i8;
                if ((i3 & 16) == 0) {
                }
                i9 = 8192;
                int i1922 = i182 | i9;
                i10 = i3 & 32;
                if (i10 == 0) {
                }
                z2 = z;
                i11 = i3 & 64;
                if (i11 != 0) {
                }
                i13 = i12;
                if (av8Var.T(i13 & 1, (599187 & i12) != 599186)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
        } else {
            j4 = j2;
        }
        i5 = 16;
        int i172 = i4 | i5;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        i8 = 1024;
        int i1822 = i7 | i8;
        if ((i3 & 16) == 0) {
        }
        i9 = 8192;
        int i19222 = i1822 | i9;
        i10 = i3 & 32;
        if (i10 == 0) {
        }
        z2 = z;
        i11 = i3 & 64;
        if (i11 != 0) {
        }
        i13 = i12;
        if (av8Var.T(i13 & 1, (599187 & i12) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(mte mteVar, Function1 function1, xtc xtcVar, boolean z, boolean z2, of3 of3Var, int i2, int i3) {
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        boolean z6;
        av8 av8Var;
        eqf u;
        r13 r13Var;
        long j2;
        int i6;
        r13 e2;
        long j3;
        mte mteVar2 = mteVar;
        mteVar2.getClass();
        Double d2 = mteVar2.c;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(580467109);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(mteVar2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            z3 = z;
            i4 |= av8Var2.h(z3) ? a.o : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z4 = z2;
                i4 |= av8Var2.h(z4) ? 16384 : 8192;
                if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
                    boolean z7 = i7 != 0 ? true : z3;
                    boolean z8 = i5 != 0 ? false : z4;
                    boolean z9 = av8Var2.k(dh3.n) == ema.b;
                    float f2 = z9 ? 0.15f : 0.0f;
                    float f3 = z9 ? 0.0f : 0.15f;
                    if (d2 == null) {
                        av8Var2.d0(1157717926);
                        av8Var2.s(false);
                        r13Var = null;
                    } else {
                        av8Var2.d0(1157717927);
                        long x = kpg.x(d2.doubleValue(), av8Var2);
                        av8Var2.s(false);
                        r13Var = new r13(x);
                    }
                    if (r13Var == null) {
                        j2 = ljg.f(av8Var2, -516841774, R.color.rating_90, av8Var2, false);
                    } else {
                        av8Var2.d0(-516844037);
                        av8Var2.s(false);
                        j2 = r13Var.a;
                    }
                    boolean f4 = av8Var2.f(j2) | av8Var2.d(f2) | av8Var2.d(f3);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    Object obj = O;
                    if (f4 || O == a99Var) {
                        Pair[] pairArr = {new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new r13(r13.c(j2, f2))), new Pair(Float.valueOf(1.0f), new r13(r13.c(j2, f3)))};
                        av8Var2.n0(pairArr);
                        obj = pairArr;
                    }
                    Pair[] pairArr2 = (Pair[]) obj;
                    av8Var2.d0(-516826525);
                    xtc p = n9e.p(wnn.A(bkh.d(n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var2), oyn.e), 1.0f), o7g.a(8.0f)), wxf.t((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6);
                    utc utcVar = utc.a;
                    if (!z8) {
                        p = p.z(yso.o(utcVar, 1.0f, lz.D(R.color.n_lv_4, av8Var2), o7g.a(8.0f)));
                    }
                    av8Var2.s(false);
                    long D = lz.D(R.color.n_lv_4, av8Var2);
                    Object O2 = av8Var2.O();
                    if (O2 == a99Var) {
                        O2 = mz1.e(av8Var2);
                    }
                    wzc wzcVar = (wzc) O2;
                    Object[] objArr = new Object[0];
                    Object O3 = av8Var2.O();
                    if (O3 == a99Var) {
                        O3 = b74.v;
                        av8Var2.n0(O3);
                    }
                    xtc c0 = l98.c0(tol.y(p, true, true, true, D, wzcVar, new qz5((boh) o3a.N(objArr, (Function0) O3, av8Var2, 48), function1, mteVar2, 2), av8Var2, 0), 16.0f, 8.0f);
                    p4h p4hVar = ww9.d;
                    kv1 kv1Var = uxf.o;
                    boolean z10 = false;
                    u23 a2 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C = fqj.C(av8Var2, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
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
                    Gender gender = mteVar2.h;
                    if (d2 == null) {
                        av8Var2.d0(2129413487);
                        av8Var2.s(false);
                        e2 = null;
                    } else {
                        av8Var2.d0(2129413488);
                        double doubleValue = d2.doubleValue();
                        if (doubleValue != 0.0d) {
                            if (doubleValue < 6.0d) {
                                i6 = R.color.rating_10;
                            } else if (doubleValue < 6.5d) {
                                i6 = R.color.rating_60;
                            } else if (doubleValue < 7.0d) {
                                i6 = R.color.rating_65;
                            } else if (doubleValue < 8.0d) {
                                i6 = R.color.rating_70;
                            } else if (doubleValue < 9.0d) {
                                i6 = R.color.rating_80;
                            } else if (doubleValue <= 10.0d) {
                                i6 = R.color.rating_90;
                            }
                            z10 = false;
                            e2 = vxd.e(av8Var2, false, lz.D(i6, av8Var2));
                        }
                        i6 = R.color.rating_00;
                        z10 = false;
                        e2 = vxd.e(av8Var2, false, lz.D(i6, av8Var2));
                    }
                    if (e2 == null) {
                        j3 = ljg.f(av8Var2, 484334978, R.color.primary_default, av8Var2, z10);
                    } else {
                        av8Var2.d0(484332312);
                        av8Var2.s(z10);
                        j3 = e2.a;
                    }
                    int i8 = i4;
                    b(null, j3, gender, null, 0L, false, null, av8Var2, 0, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                    xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
                    lv1 lv1Var = uxf.m;
                    wxf wxfVar = ww9.b;
                    l8g a3 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, d0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a3, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    td4.C(mteVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 48, 12);
                    goa d3 = bf3.d(utcVar, 8.0f, av8Var2, 1.0f, true);
                    u23 a4 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m4 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, d3);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a4, f50Var);
                    waa.K(av8Var2, m4, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    String str = mteVar.b;
                    yf8 yf8Var = xth.a;
                    udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110586);
                    nq8.h(av8Var2, bkh.e(utcVar, 2.0f));
                    l8g a5 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
                    int hashCode4 = Long.hashCode(av8Var2.T);
                    aee m5 = av8Var2.m();
                    xtc C4 = fqj.C(av8Var2, utcVar);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a5, f50Var);
                    waa.K(av8Var2, m5, ff3Var);
                    bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C4, f50Var3);
                    mteVar2 = mteVar;
                    td4.G(mteVar2.f, bkh.l(utcVar, 16.0f), false, 0L, av8Var2, 48, 12);
                    nq8.h(av8Var2, bkh.p(utcVar, 2.0f));
                    udj.c(mteVar2.g, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
                    av8Var2.s(true);
                    av8Var2.s(true);
                    nq8.h(av8Var2, bkh.p(utcVar, 16.0f));
                    boolean z11 = z7;
                    i9a.j(mteVar2.c, false, z11, bkh.l(utcVar, 32.0f), false, true, new p75(18.0f), av8Var2, ((i8 >> 3) & 896) | 1772592, 16);
                    av8 av8Var3 = av8Var2;
                    av8Var3.s(true);
                    av8Var3.s(true);
                    z5 = z11;
                    z6 = z8;
                    av8Var = av8Var3;
                } else {
                    av8Var2.W();
                    z5 = z3;
                    z6 = z4;
                    av8Var = av8Var2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new e82(mteVar2, function1, xtcVar, z5, z6, i2, i3, 1);
                    return;
                }
                return;
            }
            z4 = z2;
            if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z3 = z;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z4 = z2;
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void d(int i2, BrandingFantasyCompetition brandingFantasyCompetition, boolean z, xtc xtcVar, tc3 tc3Var, of3 of3Var, int i3) {
        av8 av8Var;
        long j2;
        Brand brand;
        Brand brand2;
        Brand brand3;
        BrandColors color;
        String E;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-903532363);
        int i4 = i3 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.i(brandingFantasyCompetition) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            String str = null;
            r13 r13Var = (brandingFantasyCompetition == null || (brand3 = brandingFantasyCompetition.getBrand()) == null || (color = brand3.getColor()) == null || (E = tz9.E(color, (Context) av8Var2.k(nz.b))) == null) ? null : new r13(hkg.b(Color.parseColor(E)));
            if (r13Var == null) {
                j2 = ljg.f(av8Var2, -711196088, R.color.primary_default, av8Var2, false);
            } else {
                av8Var2.d0(-711198475);
                av8Var2.s(false);
                j2 = r13Var.a;
            }
            r13 r13Var2 = new r13(j2);
            if (!z) {
                r13Var2 = null;
            }
            Integer valueOf = (brandingFantasyCompetition == null || (brand2 = brandingFantasyCompetition.getBrand()) == null) ? null : Integer.valueOf(brand2.getId());
            String url = brandingFantasyCompetition != null ? brandingFantasyCompetition.getUrl() : null;
            if (brandingFantasyCompetition != null && (brand = brandingFantasyCompetition.getBrand()) != null) {
                str = brand.getSlug();
            }
            av8Var = av8Var2;
            s02.b(r13Var2, valueOf, url, str, BrandLocation.Fantasy, i2, null, xtcVar, BrandType.STRIPE, lz.D(R.color.surface_1, av8Var2), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, tc3Var, av8Var, ((i4 << 15) & 458752) | 102260736 | ((i4 << 12) & 29360128), 3078, 6144);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(i2, brandingFantasyCompetition, z, xtcVar, tc3Var, i3);
        }
    }

    public static final void e(Long l2, Function0 function0, of3 of3Var, int i2) {
        Function0 function02 = function0;
        lv1 lv1Var = uxf.l;
        kv1 kv1Var = uxf.o;
        p4h p4hVar = ww9.d;
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1405571722);
        int i3 = i2 | (av8Var.g(l2) ? 4 : 2) | (av8Var.i(function02) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            e1d N = hda.N(l2 != null ? l2.longValue() : Long.MAX_VALUE, av8Var, 0);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = goh.b(new h84(25, l2, N));
                av8Var.n0(O);
            }
            cdi cdiVar = (cdi) O;
            utc utcVar = utc.a;
            xtc u0 = hkg.u0(n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), lz.D(R.color.surface_P, av8Var), oyn.e), hkg.o0(av8Var), false, 14);
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, u0);
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
            mv1 mv1Var = uxf.g;
            xtc e2 = bkh.e(bkh.d(utcVar, 1.0f), 182.0f);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e2);
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
            k(haa.t(R.drawable.remove_ads_visual, 0, av8Var), null, bkh.d(utcVar, 1.0f), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
            e12.a(0, av8Var, n9e.q(bkh.e(bkh.p(l98.f0(n12.a.a(utcVar, uxf.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 48.0f), 4.0f), lz.D(R.color.neutral_default, av8Var), o7g.a(24.0f)));
            u23 a3 = t23.a(ww9.f, uxf.p, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            l8g a4 = k8g.a(new ng0(16.0f, true, new a70(6)), lv1Var, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            av8Var.d0(1254710709);
            for (glj gljVar : b.j(glj.ENGLAND, glj.GERMANY, glj.FRANCE)) {
                z8e.c(gljVar.a.a(av8Var), gljVar.b, null, av8Var, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            l8g a5 = k8g.a(new ng0(16.0f, true, new a70(6)), lv1Var, av8Var, 6);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m6 = av8Var.m();
            xtc C5 = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, hf3.g);
            waa.K(av8Var, m6, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode5), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C5, hf3.d);
            av8Var.d0(-2113302132);
            for (glj gljVar2 : b.j(glj.SPAIN, glj.ITALY)) {
                z8e.c(gljVar2.a.a(av8Var), gljVar2.b, null, av8Var, 0);
            }
            i.p(av8Var, false, true, true, true);
            xtc d0 = l98.d0(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a6 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode6 = Long.hashCode(av8Var.T);
            aee m7 = av8Var.m();
            xtc C6 = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var3 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, hf3.g);
            waa.K(av8Var, m7, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode6), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C6, hf3.d);
            String upperCase = oea.v(R.string.fantasy_elite_faceoff_intro_header, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            udj.c(bf3.g(4.0f, R.string.fantasy_elite_faceoff_intro_main_title, av8Var, av8Var, utcVar), null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.h(), av8Var, 0, 24960, 110586);
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            rz8.i(s6a.N(R.drawable.ic_leagues_empty, 6, av8Var), oea.v(R.string.fantasy_elite_faceoff_intro_title_1, av8Var), oea.v(R.string.fantasy_elite_faceoff_intro_text_1, av8Var), null, av8Var, 0);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            rz8.i(s6a.N(R.drawable.ic_euro_x, 6, av8Var), oea.v(R.string.fantasy_elite_faceoff_intro_title_2, av8Var), oea.v(R.string.fantasy_elite_faceoff_intro_text_2, av8Var), null, av8Var, 0);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            rz8.i(s6a.N(R.drawable.ic_refresh, 6, av8Var), oea.v(R.string.fantasy_elite_faceoff_intro_title_3, av8Var), oea.v(R.string.fantasy_elite_faceoff_intro_text_3, av8Var), null, av8Var, 0);
            nq8.h(av8Var, bkh.e(utcVar, 36.0f));
            fz8.b(x23.a, (((Boolean) cdiVar.getValue()).booleanValue() || l2 == null) ? false : true, null, null, null, null, yqo.H(1293374522, av8Var, new s16(l2, 10)), av8Var, 1572870, 30);
            function02 = function0;
            mha.h(oea.v(R.string.fantasy_play_elite_fantasy_button, av8Var), function02, bkh.d(utcVar, 1.0f), null, null, ((Boolean) cdiVar.getValue()).booleanValue(), false, false, 0L, 0, 0, av8Var, (i3 & 112) | 384, 0, 2008);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(l2, function02, i2, 27);
        }
    }

    public static final void f(s67 s67Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        r13 r13Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1799823833);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.e(s67Var.ordinal()) ? 4 : 2) | i2;
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
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(4.0f, true, new a70(6));
            xtc b0 = l98.b0(tol.y(n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e), false, false, false, 0L, null, function0, av8Var, 31), 8.0f);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 54);
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
            mv1 mv1Var = uxf.g;
            xtc l2 = bkh.l(l98.b0(xtcVar, 2.0f), 20.0f);
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, l2);
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
            g28 g28Var = bkh.c;
            Integer num = s67Var.d;
            if (num == null) {
                av8Var.d0(-1196029165);
                i4 = 0;
                av8Var.s(false);
                r13Var = null;
            } else {
                i4 = 0;
                r13Var = new r13(wv8.b(av8Var, -1196029164, num, av8Var, false));
            }
            kq9.a(haa.t(s67Var.c, i4, av8Var), null, g28Var, r13Var != null ? r13Var.a : r13.i, av8Var, 440, 0);
            av8Var.s(true);
            String v = oea.v(s67Var.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(s67Var.b, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(s67Var, function0, xtcVar, i2, 27);
        }
    }

    public static final void g(final Function0 function0, final s67 s67Var, final Function0 function02, xtc xtcVar, final s67 s67Var2, Function0 function03, s67 s67Var3, final Function0 function04, of3 of3Var, int i2) {
        int i3;
        Function0 function05;
        s67 s67Var4;
        final s67 s67Var5;
        xtc xtcVar2;
        float f2;
        Context context;
        s67 s67Var6;
        final Context context2;
        Object obj;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1992788901);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.e(s67Var == null ? -1 : s67Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.e(s67Var2 == null ? -1 : s67Var2.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function05 = function03;
            i4 |= av8Var.i(function05) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            function05 = function03;
        }
        if ((1572864 & i2) == 0) {
            i4 |= av8Var.e(s67Var3 != null ? s67Var3.ordinal() : -1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= av8Var.i(function04) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (av8Var.T(i5 & 1, (4793491 & i5) != 4793490)) {
            final Context context3 = (Context) av8Var.k(nz.b);
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            utc utcVar = utc.a;
            xtc Y = fz8.Y(bkh.d(utcVar, 1.0f), n9a.b);
            l8g a2 = k8g.a(ng0Var, uxf.l, av8Var, 6);
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
            a99 a99Var = nf3.a;
            p8g p8gVar = p8g.a;
            if (s67Var == null) {
                av8Var.d0(1660807517);
                av8Var.s(false);
                context = context3;
                f2 = 1.0f;
            } else {
                av8Var.d0(1660807518);
                xtc a3 = p8gVar.a(1.0f, bkh.c(utcVar, 1.0f), true);
                boolean i6 = av8Var.i(context3) | ((i5 & 112) == 32) | ((i5 & 14) == 4) | ((i5 & 896) == 256);
                Object O = av8Var.O();
                if (i6 || O == a99Var) {
                    final int i7 = 0;
                    f2 = 1.0f;
                    Function0 function06 = new Function0() { // from class: r67
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i8 = i7;
                            Function0 function07 = function02;
                            Function0 function08 = function0;
                            s67 s67Var7 = s67Var;
                            Context context4 = context3;
                            switch (i8) {
                                case 0:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function08.invoke();
                                    if (function07 != null) {
                                        function07.invoke();
                                    }
                                    break;
                                case 1:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function08.invoke();
                                    if (function07 != null) {
                                        function07.invoke();
                                    }
                                    break;
                                default:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function08.invoke();
                                    if (function07 != null) {
                                        function07.invoke();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    context = context3;
                    s67Var6 = s67Var;
                    av8Var.n0(function06);
                    O = function06;
                } else {
                    s67Var6 = s67Var;
                    context = context3;
                    f2 = 1.0f;
                }
                f(s67Var6, (Function0) O, a3, av8Var, (i5 >> 3) & 14);
                av8Var.s(false);
            }
            if (s67Var2 == null) {
                av8Var.d0(1661278810);
                av8Var.s(false);
                s67Var4 = s67Var2;
                context2 = context;
            } else {
                av8Var.d0(1661278811);
                xtc a4 = p8gVar.a(f2, bkh.c(utcVar, f2), true);
                boolean i8 = av8Var.i(context) | ((57344 & i5) == 16384) | ((i5 & 14) == 4) | ((458752 & i5) == 131072);
                Object O2 = av8Var.O();
                if (i8 || O2 == a99Var) {
                    final int i9 = 1;
                    context2 = context;
                    final Function0 function07 = function05;
                    Function0 function08 = new Function0() { // from class: r67
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i9;
                            Function0 function072 = function07;
                            Function0 function082 = function0;
                            s67 s67Var7 = s67Var2;
                            Context context4 = context2;
                            switch (i82) {
                                case 0:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function082.invoke();
                                    if (function072 != null) {
                                        function072.invoke();
                                    }
                                    break;
                                case 1:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function082.invoke();
                                    if (function072 != null) {
                                        function072.invoke();
                                    }
                                    break;
                                default:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function082.invoke();
                                    if (function072 != null) {
                                        function072.invoke();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    s67Var4 = s67Var2;
                    av8Var.n0(function08);
                    O2 = function08;
                } else {
                    s67Var4 = s67Var2;
                    context2 = context;
                }
                f(s67Var4, (Function0) O2, a4, av8Var, (i5 >> 12) & 14);
                av8Var.s(false);
            }
            if (s67Var3 == null) {
                av8Var.d0(1661751901);
                av8Var.s(false);
                s67Var5 = s67Var3;
            } else {
                av8Var.d0(1661751902);
                xtc a5 = p8gVar.a(f2, bkh.c(utcVar, f2), true);
                boolean i10 = av8Var.i(context2) | ((3670016 & i5) == 1048576) | ((i5 & 14) == 4) | ((29360128 & i5) == 8388608);
                Object O3 = av8Var.O();
                if (i10 || O3 == a99Var) {
                    final int i11 = 2;
                    s67Var5 = s67Var3;
                    obj = new Function0() { // from class: r67
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i82 = i11;
                            Function0 function072 = function04;
                            Function0 function082 = function0;
                            s67 s67Var7 = s67Var5;
                            Context context4 = context2;
                            switch (i82) {
                                case 0:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function082.invoke();
                                    if (function072 != null) {
                                        function072.invoke();
                                    }
                                    break;
                                case 1:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function082.invoke();
                                    if (function072 != null) {
                                        function072.invoke();
                                    }
                                    break;
                                default:
                                    nv.A(context4, "player_modal", s67Var7.e);
                                    function082.invoke();
                                    if (function072 != null) {
                                        function072.invoke();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(obj);
                } else {
                    obj = O3;
                    s67Var5 = s67Var3;
                }
                f(s67Var5, (Function0) obj, a5, av8Var, (i5 >> 18) & 14);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            s67Var4 = s67Var2;
            s67Var5 = s67Var3;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e41(function0, s67Var, function02, xtcVar2, s67Var4, function03, s67Var5, function04, i2);
        }
    }

    public static final void h(FantasyCompetitionType fantasyCompetitionType, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        FantasyCompetitionType fantasyCompetitionType2;
        int i3;
        int i4;
        fantasyCompetitionType.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-946578344);
        int i5 = 4;
        int i6 = i2 | (av8Var.e(fantasyCompetitionType.ordinal()) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i6 & 1, (i6 & 147) != 146)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            boolean z = ((i6 & 14) == 4) | ((i6 & 112) == 32);
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                fantasyCompetitionType2 = fantasyCompetitionType;
                O2 = new n37(i5, (Object) fantasyCompetitionType2, function1);
                av8Var.n0(O2);
            } else {
                fantasyCompetitionType2 = fantasyCompetitionType;
            }
            xtc f0 = l98.f0(oyn.u(d2, wzcVar, null, false, null, null, (Function0) O2, 28), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            yf8 yf8Var = xth.a;
            dfj l2 = xth.l();
            long D = lz.D(R.color.n_lv_1, av8Var);
            goa goaVar = new goa(1.0f, false);
            int i7 = r87.a[fantasyCompetitionType2.ordinal()];
            if (i7 == 1) {
                i3 = 909614126;
                i4 = R.string.fantasy_season_long_duration;
            } else {
                if (i7 != 2) {
                    throw dmi.h(av8Var, 909612290, false);
                }
                i3 = 909617577;
                i4 = R.string.fantasy_weekly_duration;
            }
            udj.c(ljg.k(av8Var, i3, i4, av8Var, false), goaVar, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l2, av8Var, 0, 0, 131064);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            mv1 mv1Var = uxf.g;
            xtc a3 = f1a.a(wnn.A(bkh.l(utcVar, 24.0f), o7g.a), wzcVar, n5g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true));
            k1c c2 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, a3);
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
            kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(fantasyCompetitionType, function1, xtcVar2, i2, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    public static final void i(List list, xtc xtcVar, of3 of3Var, int i2) {
        float f2;
        float f3;
        long j2;
        boolean z;
        List list2;
        list.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1088347553);
        int i3 = (av8Var.i(list) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            float H0 = kx4Var.H0(4.0f);
            float H02 = kx4Var.H0(3.0f);
            long D = lz.D(R.color.neutral_default, av8Var);
            boolean z2 = list.size() < 2;
            ?? r4 = list.size() > 1 ? list : 0;
            if (r4 == 0) {
                r4 = new ArrayList(3);
                for (int i4 = 0; i4 < 3; i4++) {
                    r4.add(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
            }
            List list3 = r4;
            boolean g2 = av8Var.g(list3);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g2 || O == a99Var) {
                f2 = 2.0f;
                ArrayList arrayList = new ArrayList(k13.r(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf((((Number) it.next()).floatValue() - CollectionsKt.r0(list3)) * 10.0f));
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf(6.0f - ((Number) it2.next()).floatValue()));
                }
                Float q0 = CollectionsKt.q0(arrayList2);
                float floatValue = q0 != null ? q0.floatValue() : 0.0f;
                Float m0 = CollectionsKt.m0(arrayList2);
                float floatValue2 = (6.0f - ((m0 != null ? m0.floatValue() : 0.0f) - floatValue)) / 2.0f;
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Float.valueOf(((Number) it3.next()).floatValue() - floatValue2));
                }
                av8Var.n0(arrayList3);
                O = arrayList3;
            } else {
                f2 = 2.0f;
            }
            List list4 = (List) O;
            av8Var.d0(-2069994252);
            xbb b2 = kotlin.collections.a.b();
            float f4 = H0;
            b2.add(new r13(lz.D(R.color.rating_65, av8Var)));
            av8Var.d0(-2069991441);
            int i5 = b.i(list4);
            if (1 <= i5) {
                int i6 = 1;
                char c2 = 0;
                while (true) {
                    float f5 = -(((Number) list4.get(i6)).floatValue() - ((Number) list4.get(i6 - 1)).floatValue());
                    ?? r8 = -1;
                    if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f3 = f4;
                        av8Var.d0(1715177603);
                        if (c2 != 65535) {
                            if (c2 != 0) {
                                av8Var.d0(1715346026);
                                z = false;
                                av8Var.s(false);
                                list2 = list4;
                            } else {
                                av8Var.d0(1440805674);
                                list2 = list4;
                                b2.add(new r13(lz.D(R.color.rating_70, av8Var)));
                                z = false;
                                av8Var.s(false);
                            }
                            j2 = D;
                        } else {
                            list2 = list4;
                            z = false;
                            av8Var.d0(1440804010);
                            j2 = D;
                            b2.add(new r13(lz.D(R.color.rating_65, av8Var)));
                            av8Var.s(false);
                        }
                        b2.add(new r13(lz.D(R.color.secondary_variant, av8Var)));
                        av8Var.s(z);
                        r8 = 1;
                    } else {
                        f3 = f4;
                        j2 = D;
                        list2 = list4;
                        if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            av8Var.d0(1715502080);
                            if (c2 != 65535) {
                                av8Var.d0(1715547712);
                                b2.add(new r13(lz.D(R.color.rating_65, av8Var)));
                                z = false;
                                av8Var.s(false);
                            } else {
                                z = false;
                                av8Var.d0(1715618826);
                                av8Var.s(false);
                            }
                            b2.add(new r13(lz.D(R.color.rating_10, av8Var)));
                            av8Var.s(z);
                        } else {
                            av8Var.d0(1715763937);
                            if (c2 == 65535) {
                                av8Var.d0(1715809600);
                                b2.add(new r13(lz.D(R.color.rating_60, av8Var)));
                                z = false;
                                av8Var.s(false);
                            } else {
                                z = false;
                                av8Var.d0(1715880714);
                                av8Var.s(false);
                            }
                            b2.add(new r13(lz.D(R.color.rating_65, av8Var)));
                            av8Var.s(z);
                            r8 = z;
                        }
                    }
                    if (i6 == i5) {
                        break;
                    }
                    i6++;
                    c2 = r8;
                    list4 = list2;
                    f4 = f3;
                    D = j2;
                }
            } else {
                f3 = f4;
                j2 = D;
                z = false;
                list2 = list4;
            }
            av8Var.s(z);
            xbb a2 = kotlin.collections.a.a(b2);
            av8Var.s(z);
            v7b v7bVar = new v7b(a2, null, 0L, 9187343241974906880L);
            xtc b0 = l98.b0(xtcVar, f2);
            long j3 = j2;
            float f6 = f3;
            boolean i7 = av8Var.i(list3) | av8Var.i(list2) | av8Var.h(z2) | av8Var.f(j3) | av8Var.d(H02) | av8Var.d(f6) | av8Var.g(v7bVar);
            Object O2 = av8Var.O();
            if (i7 || O2 == a99Var) {
                xe7 xe7Var = new xe7(list3, z2, j3, H02, f6, v7bVar, list2);
                av8Var.n0(xe7Var);
                O2 = xe7Var;
            }
            lz.d(0, av8Var, b0, (Function1) O2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(list, xtcVar, i2, 13);
        }
    }

    public static final void j(tl8 tl8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1034268372);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(tl8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            tc3 H = yqo.H(-483785363, av8Var2, new hl7(tl8Var, 18));
            tc3 H2 = yqo.H(1110587157, av8Var2, new pl8(tl8Var, 3));
            boolean i5 = av8Var2.i(tl8Var) | ((i3 & 112) == 32);
            Object O = av8Var2.O();
            if (i5 || O == nf3.a) {
                O = new ql8(function1, tl8Var, i4);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i3 >> 6) & 14) | 197040, 2008);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rl8(tl8Var, function1, xtcVar, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(d7e d7eVar, String str, xtc xtcVar, io ioVar, op3 op3Var, float f2, ay1 ay1Var, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        io ioVar2;
        int i5;
        op3 op3Var2;
        int i6;
        float f3;
        int i7;
        ay1 ay1Var2;
        int i8;
        io ioVar3;
        op3 op3Var3;
        float f4;
        ay1 ay1Var3;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1142754848);
        int i9 = ((i2 & 8) == 0 ? av8Var.g(d7eVar) : av8Var.i(d7eVar) ? 4 : 2) | i2;
        int i10 = i3 & 4;
        if (i10 != 0) {
            i9 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i9 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i4 = i3 & 8;
            if (i4 == 0) {
                i9 |= 3072;
            } else if ((i2 & 3072) == 0) {
                ioVar2 = ioVar;
                i9 |= av8Var.g(ioVar2) ? a.o : 1024;
                i5 = i3 & 16;
                if (i5 != 0) {
                    i9 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    op3Var2 = op3Var;
                    i9 |= av8Var.g(op3Var2) ? 16384 : 8192;
                    i6 = i3 & 32;
                    if (i6 == 0) {
                        i9 |= 196608;
                    } else if ((196608 & i2) == 0) {
                        f3 = f2;
                        i9 |= av8Var.d(f3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        i7 = i3 & 64;
                        if (i7 != 0) {
                            i8 = i9 | 1572864;
                            ay1Var2 = ay1Var;
                        } else {
                            ay1Var2 = ay1Var;
                            i8 = i9 | (av8Var.g(ay1Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
                        }
                        if (av8Var.T(i8 & 1, (599187 & i8) != 599186)) {
                            xtc xtcVar3 = utc.a;
                            xtc xtcVar4 = i10 != 0 ? xtcVar3 : xtcVar2;
                            io ioVar4 = i4 != 0 ? uxf.g : ioVar2;
                            op3 op3Var4 = i5 != 0 ? mp3.b : op3Var2;
                            float f5 = i6 != 0 ? 1.0f : f3;
                            ay1 ay1Var4 = i7 != 0 ? null : ay1Var2;
                            a99 a99Var = nf3.a;
                            if (str != null) {
                                av8Var.d0(1899222916);
                                Object O = av8Var.O();
                                if (O == a99Var) {
                                    O = new jp1(str, 20);
                                    av8Var.n0(O);
                                }
                                xtcVar3 = o3h.a(xtcVar3, false, (Function1) O);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(1899381698);
                                av8Var.s(false);
                            }
                            xtc Z = fz8.Z(wnn.B(xtcVar4.z(xtcVar3)), d7eVar, ioVar4, op3Var4, f5, ay1Var4, 2);
                            Object O2 = av8Var.O();
                            if (O2 == a99Var) {
                                O2 = g00.i;
                                av8Var.n0(O2);
                            }
                            k1c k1cVar = (k1c) O2;
                            int hashCode = Long.hashCode(av8Var.T);
                            xtc C = fqj.C(av8Var, Z);
                            aee m2 = av8Var.m();
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, k1cVar, hf3.g);
                            waa.K(av8Var, m2, hf3.f);
                            waa.J(av8Var, hf3.k);
                            waa.K(av8Var, C, hf3.d);
                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                            av8Var.s(true);
                            f4 = f5;
                            ay1Var3 = ay1Var4;
                            ioVar3 = ioVar4;
                            op3Var3 = op3Var4;
                            xtcVar2 = xtcVar4;
                        } else {
                            av8Var.W();
                            ioVar3 = ioVar2;
                            op3Var3 = op3Var2;
                            f4 = f3;
                            ay1Var3 = ay1Var2;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new ks9(d7eVar, str, xtcVar2, ioVar3, op3Var3, f4, ay1Var3, i2, i3);
                            return;
                        }
                        return;
                    }
                    f3 = f2;
                    i7 = i3 & 64;
                    if (i7 != 0) {
                    }
                    if (av8Var.T(i8 & 1, (599187 & i8) != 599186)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                op3Var2 = op3Var;
                i6 = i3 & 32;
                if (i6 == 0) {
                }
                f3 = f2;
                i7 = i3 & 64;
                if (i7 != 0) {
                }
                if (av8Var.T(i8 & 1, (599187 & i8) != 599186)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            ioVar2 = ioVar;
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            op3Var2 = op3Var;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            f3 = f2;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if (av8Var.T(i8 & 1, (599187 & i8) != 599186)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i3 & 8;
        if (i4 == 0) {
        }
        ioVar2 = ioVar;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        op3Var2 = op3Var;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        f3 = f2;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if (av8Var.T(i8 & 1, (599187 & i8) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void l(ImageVector imageVector, xtc xtcVar, mv1 mv1Var, op3 op3Var, float f2, ay1 ay1Var, of3 of3Var, int i2, int i3) {
        if ((i3 & 8) != 0) {
            mv1Var = uxf.g;
        }
        mv1 mv1Var2 = mv1Var;
        if ((i3 & 16) != 0) {
            op3Var = mp3.b;
        }
        k(o6a.J(imageVector, of3Var), null, xtcVar, mv1Var2, op3Var, (i3 & 32) != 0 ? 1.0f : f2, (i3 & 64) != 0 ? null : ay1Var, of3Var, (i2 & 896) | 56 | (i2 & 7168) | (57344 & i2) | (458752 & i2), 0);
    }

    public static final void m(a10 a10Var, xtc xtcVar, of3 of3Var, int i2) {
        mv1 mv1Var = uxf.g;
        av8 av8Var = (av8) of3Var;
        boolean g2 = av8Var.g(a10Var);
        Object O = av8Var.O();
        if (g2 || O == nf3.a) {
            O = n4o.b(a10Var, 1);
            av8Var.n0(O);
        }
        k((cx1) O, null, xtcVar, mv1Var, mp3.g, 1.0f, null, av8Var, (i2 & 896) | 24632, 0);
    }

    public static long n(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, o(j3, j2)));
        return j3;
    }

    public static long o(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static final long p(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : llf.e(j2 + j3, -4611686018427387903L, 4611686018427387903L);
        }
        if (-4611686018427387903L < j3 && j3 < 4611686018427387903L) {
            return j2;
        }
        if ((j3 ^ j2) >= 0) {
            return j2;
        }
        return 9223372036854759646L;
    }

    public static boolean r(nkk nkkVar, g78 g78Var, int i2, b78 b78Var) {
        long t = nkkVar.t();
        long j2 = t >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z = (j2 & 1) == 1;
        int i3 = (int) ((t >> 12) & 15);
        int i4 = (int) ((t >> 8) & 15);
        int i5 = (int) ((t >> 4) & 15);
        int i6 = (int) ((t >> 1) & 7);
        boolean z2 = (t & 1) == 1;
        if (i5 <= 7) {
            if (i5 != g78Var.h - 1) {
                return false;
            }
        } else if (i5 > 10 || g78Var.h != 2) {
            return false;
        }
        if (!(i6 == 0 || i6 == g78Var.j) || z2) {
            return false;
        }
        try {
            long A = nkkVar.A();
            if (!z) {
                A *= g78Var.c;
            }
            b78Var.a = A;
            int K = K(i3, nkkVar);
            if (K == -1 || K > g78Var.c) {
                return false;
            }
            int i7 = g78Var.f;
            if (i4 != 0) {
                if (i4 <= 11) {
                    if (i4 != g78Var.g) {
                        return false;
                    }
                } else if (i4 != 12) {
                    if (i4 > 14) {
                        return false;
                    }
                    int x = nkkVar.x();
                    if (i4 == 14) {
                        x *= 10;
                    }
                    if (x != i7) {
                        return false;
                    }
                } else if (nkkVar.s() * 1000 != i7) {
                    return false;
                }
            }
            int s = nkkVar.s();
            int i8 = nkkVar.b;
            byte[] bArr = nkkVar.a;
            int i9 = i8 - 1;
            int i10 = 0;
            for (int i11 = nkkVar.b; i11 < i9; i11++) {
                i10 = lik.k[i10 ^ (bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
            }
            int i12 = lik.a;
            return s == i10;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fg8 s(Context context) {
        ProviderInfo providerInfo;
        dg8 dg8Var;
        ApplicationInfo applicationInfo;
        int i2 = 20;
        kpg xo4Var = Build.VERSION.SDK_INT >= 28 ? new xo4(i2) : new kpg(i2);
        PackageManager packageManager = context.getPackageManager();
        l4a.j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] A = xo4Var.A(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : A) {
                    arrayList.add(signature.toByteArray());
                }
                dg8Var = new dg8(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (dg8Var != null) {
                return null;
            }
            return new fg8(new eg8(context, dg8Var));
        }
        dg8Var = null;
        if (dg8Var != null) {
        }
    }

    public static final ExecutorService t(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new pj3(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static final long u(long j2) {
        long j3 = (j2 << 1) + 1;
        xd5.b.getClass();
        int i2 = zd5.a;
        return j3;
    }

    public static final long v(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? u(llf.e(j2, -4611686018427387903L, 4611686018427387903L)) : w(j2 * 1000000);
    }

    public static final long w(long j2) {
        long j3 = j2 << 1;
        xd5.b.getClass();
        int i2 = zd5.a;
        return j3;
    }

    public static final boolean x(s3h s3hVar) {
        l3h k2 = s3hVar.k();
        return !k2.a.c(w3h.j);
    }

    public static final int y(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final boolean z(s3h s3hVar) {
        Object g2 = s3hVar.d.a.g(w3h.L);
        if (g2 == null) {
            g2 = null;
        }
        vjj vjjVar = (vjj) g2;
        x0d x0dVar = s3hVar.d.a;
        Object g3 = x0dVar.g(w3h.z);
        if (g3 == null) {
            g3 = null;
        }
        u5g u5gVar = (u5g) g3;
        boolean z = vjjVar != null;
        Object g4 = x0dVar.g(w3h.K);
        if (((Boolean) (g4 != null ? g4 : null)) == null || (u5gVar != null && u5gVar.a == 4)) {
            return z;
        }
        return true;
    }

    public abstract void D();

    public abstract void L();

    public abstract void N(Object obj);

    public abstract void P(c5n c5nVar, qic qicVar);

    public abstract void q(String str, Throwable th);
}
