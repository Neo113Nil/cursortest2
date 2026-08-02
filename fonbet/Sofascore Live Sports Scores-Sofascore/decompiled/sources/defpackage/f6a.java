package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.text.Layout;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.shared.results.z0;
import com.facebook.d0;
import com.facebook.internal.k0;
import com.facebook.w;
import com.facebook.z;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhg;
import com.google.android.gms.internal.fido.zzhh;
import com.google.android.gms.internal.fido.zzhi;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhk;
import com.google.android.gms.internal.fido.zzhl;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzhn;
import com.google.android.gms.internal.fido.zzhp;
import com.google.android.gms.internal.fido.zzhr;
import com.google.android.gms.internal.fido.zzhs;
import com.ironsource.C4331u;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.internal.publisher.h0;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.weeklyChallenge.WeeklyLeaderboardUser;
import com.sofascore.results.R;
import com.sofascore.results.view.EventListScoreTextView;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class f6a implements zzagn {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    public static final String A(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() != 4) {
            return "";
        }
        String text = xmlPullParser.getText();
        text.getClass();
        String obj = StringsKt.l0(text).toString();
        xmlPullParser.nextTag();
        return obj;
    }

    public static final mlk B(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, null, "TrackingEvents");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.c(xmlPullParser.getName(), "Tracking")) {
                    xmlPullParser.require(2, null, "Tracking");
                    arrayList.add(new llk(A(xmlPullParser), xmlPullParser.getAttributeValue(null, "event")));
                } else {
                    H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "TrackingEvents");
        return new mlk(arrayList);
    }

    public static final xtc D(xtc xtcVar, float f2, float f3) {
        return (f2 == 1.0f && f3 == 1.0f) ? xtcVar : s02.O(xtcVar, f2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 524284);
    }

    public static final void E(String str, JSONArray jSONArray, z zVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject n = k0.n();
            if (n != null) {
                Iterator<String> keys = n.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, n.get(next));
                }
            }
            String str2 = d0.j;
            h0.C(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{w.b()}, 1)), jSONObject, zVar).d();
        } catch (JSONException unused) {
        }
    }

    public static final boolean F(Context context) {
        SharedPreferences d2;
        context.getClass();
        context.getClass();
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
        return sharedPreferences.getBoolean("PREF_SHOW_EVENT_DIALOG", true);
    }

    public static final boolean G(Context context) {
        SharedPreferences d2;
        context.getClass();
        context.getClass();
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
        return sharedPreferences.getBoolean("PREF_SHOW_STAGE_DIALOG", true);
    }

    public static final void H(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            zzl.s();
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final xk0 I(InputStream inputStream) {
        inputStream.getClass();
        return new xk0(inputStream, new pij());
    }

    public static final e5f J(String str) {
        str.getClass();
        return new e5f(str);
    }

    public static final wtj K(Context context, Event event) {
        event.getClass();
        context.getClass();
        int id = event.getId();
        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
        huj hujVar = new huj(homeTeam$default.getId(), tba.p(context, homeTeam$default));
        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
        return new wtj(id, hujVar, new huj(awayTeam$default.getId(), tba.p(context, awayTeam$default)), event.getStatusType(), yid.m(Event.getHomeScore$default(event, null, 1, null).getDisplay()), yid.m(Event.getAwayScore$default(event, null, 1, null).getDisplay()), Event.getWinnerCode$default(event, null, 1, null), event.getSportSlug());
    }

    public static final slf L(WeeklyLeaderboardUser weeklyLeaderboardUser, int i, boolean z, boolean z2, String str, String str2) {
        weeklyLeaderboardUser.getClass();
        str.getClass();
        str2.getClass();
        String id = weeklyLeaderboardUser.getId();
        if (!Intrinsics.c(weeklyLeaderboardUser.getId(), str)) {
            str2 = weeklyLeaderboardUser.getNickname();
        }
        return new slf(id, str2, weeklyLeaderboardUser.getScore(), i, z, z2, Intrinsics.c(weeklyLeaderboardUser.getId(), str), weeklyLeaderboardUser.getUserBadge(), weeklyLeaderboardUser.getCurrentWeeklyChallengeWeeklyStreak());
    }

    public static final dfj N(dfj dfjVar) {
        dfjVar.getClass();
        return dfj.a(dfjVar, 0L, 0L, null, null, 0L, null, 0, 3, 0L, null, null, 0, 16711679);
    }

    public static final void O(String str, String str2) {
        File o = o();
        if (o == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(o, str));
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static final zzhp P(zzhs zzhsVar) {
        try {
            zzhr k = zzhsVar.k();
            if (k == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte b2 = k.b;
                byte b3 = k.a;
                int i = 0;
                if (b3 == Byte.MIN_VALUE) {
                    long h = zzhsVar.h();
                    if (h > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    Q(b2, h);
                    zzhp[] zzhpVarArr = new zzhp[(int) h];
                    while (i < h) {
                        zzhpVarArr[i] = P(zzhsVar);
                        i++;
                    }
                    return new zzhg(zzcc.s(zzhpVarArr));
                }
                try {
                    if (b3 != -96) {
                        if (b3 == -64) {
                            throw new zzhj("Tags are currently unsupported");
                        }
                        if (b3 == -32) {
                            return new zzhh(zzhsVar.m());
                        }
                        if (b3 == 0 || b3 == 32) {
                            long zzb = zzhsVar.zzb();
                            Q(b2, zzb > 0 ? zzb : ~zzb);
                            return new zzhk(zzb);
                        }
                        if (b3 == 64) {
                            zzhsVar.t((byte) 64);
                            byte[] H = zzhsVar.H();
                            int length = H.length;
                            Q(b2, length);
                            return new zzhi(zzgx.r(length, H));
                        }
                        if (b3 != 96) {
                            throw new zzhj("Unidentifiable major type: " + ((b3 >> 5) & 7));
                        }
                        zzhsVar.t((byte) 96);
                        String str = new String(zzhsVar.H(), StandardCharsets.UTF_8);
                        Q(b2, str.length());
                        return new zzhn(str);
                    }
                    long zzc = zzhsVar.zzc();
                    if (zzc > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR map");
                    }
                    Q(b2, zzc);
                    int i2 = (int) zzc;
                    zzhl[] zzhlVarArr = new zzhl[i2];
                    zzhp zzhpVar = null;
                    int i3 = 0;
                    while (i3 < zzc) {
                        zzhp P = P(zzhsVar);
                        if (zzhpVar != null && P.compareTo(zzhpVar) <= 0) {
                            throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + zzhpVar.toString() + "\nCurrent key: " + P.toString());
                        }
                        zzhlVarArr[i3] = new zzhl(P, P(zzhsVar));
                        i3++;
                        zzhpVar = P;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i < i2) {
                        zzhl zzhlVar = zzhlVarArr[i];
                        if (treeMap.containsKey(zzhlVar.a)) {
                            throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put(zzhlVar.a, zzhlVar.b);
                        i++;
                    }
                    return new zzhm(zzcj.j(treeMap));
                } catch (RuntimeException e2) {
                    e = e2;
                    throw new zzhj(e);
                }
            } catch (IOException | RuntimeException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            throw new zzhj(e4);
        }
    }

    public static final void Q(byte b2, long j) {
        switch (b2) {
            case 24:
                if (j < 24) {
                    throw new zzhf(vxd.m("Integer value ", j, " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new zzhf(vxd.m("Integer value ", j, " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new zzhf(vxd.m("Integer value ", j, " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new zzhf(vxd.m("Integer value ", j, " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final a6e a6eVar, xtc xtcVar, p3e p3eVar, e5e e5eVar, int i, float f2, lv1 lv1Var, gnh gnhVar, boolean z, e9d e9dVar, lnh lnhVar, myd mydVar, final tc3 tc3Var, of3 of3Var, final int i2, final int i3, final int i4) {
        xtc xtcVar2;
        int i5;
        p3e p3eVar2;
        int i6;
        e5e e5eVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        lv1 lv1Var2;
        int i13;
        int i14;
        int i15;
        int i16;
        final boolean z2;
        final xtc xtcVar3;
        final p3e p3eVar3;
        final float f4;
        final lv1 lv1Var3;
        final e5e e5eVar3;
        final int i17;
        final gnh gnhVar2;
        final e9d e9dVar2;
        final lnh lnhVar2;
        final myd mydVar2;
        eqf u;
        int i18;
        int i19;
        xtc xtcVar4;
        p3e p3eVar4;
        gnh gnhVar3;
        lnh lnhVar3;
        myd mydVar3;
        e5e e5eVar4;
        lv1 lv1Var4;
        int i20;
        float f5;
        boolean z3;
        int i21;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1860873769);
        int i22 = (av8Var.g(a6eVar) ? 4 : 2) | i2;
        int i23 = i4 & 2;
        if (i23 != 0) {
            i22 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i22 |= av8Var.g(xtcVar2) ? 32 : 16;
            i5 = i4 & 4;
            if (i5 == 0) {
                i22 |= 384;
            } else if ((i2 & 384) == 0) {
                p3eVar2 = p3eVar;
                i22 |= av8Var.g(p3eVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i6 = i4 & 8;
                if (i6 != 0) {
                    i7 = i22 | 3072;
                    e5eVar2 = e5eVar;
                } else {
                    e5eVar2 = e5eVar;
                    i7 = i22 | (av8Var.g(e5eVar2) ? a.o : 1024);
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i10 = i7 | 24576;
                    i9 = i;
                } else {
                    i9 = i;
                    i10 = i7 | (av8Var.e(i9) ? 16384 : 8192);
                }
                i11 = i4 & 32;
                if (i11 != 0) {
                    i10 |= 196608;
                    f3 = f2;
                } else {
                    f3 = f2;
                    if ((i2 & 196608) == 0) {
                        i10 |= av8Var.d(f3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    }
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                    i10 |= 1572864;
                    lv1Var2 = lv1Var;
                } else {
                    lv1Var2 = lv1Var;
                    if ((i2 & 1572864) == 0) {
                        i10 |= av8Var.g(lv1Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                }
                int i24 = i10 | 4194304;
                i13 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i13 != 0) {
                    i14 = i10 | 104857600;
                } else {
                    i14 = i24 | (av8Var.h(z) ? 67108864 : 33554432);
                }
                i15 = i14 | 805306368;
                int i25 = i3 | 406;
                if ((i3 & 3072) == 0) {
                    if ((i4 & 8192) == 0 && av8Var.g(mydVar)) {
                        i21 = a.o;
                        i16 = i25 | i21;
                    }
                    i21 = 1024;
                    i16 = i25 | i21;
                } else {
                    i16 = i25;
                }
                if (av8Var.T(i15 & 1, (i15 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
                    av8Var.Y();
                    if ((i2 & 1) == 0 || av8Var.B()) {
                        xtc xtcVar5 = i23 != 0 ? utc.a : xtcVar2;
                        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        p3e t3eVar = i5 != 0 ? new t3e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : p3eVar2;
                        e5e e5eVar5 = i6 != 0 ? wib.e : e5eVar2;
                        int i26 = i8 == 0 ? i9 : 0;
                        if (i11 == 0) {
                            f6 = f3;
                        }
                        lv1 lv1Var5 = i12 != 0 ? uxf.m : lv1Var2;
                        gnh q = b6a.q(a6eVar, av8Var, (i15 & 14) | 196608);
                        int i27 = i15 & (-29360129);
                        boolean z4 = i13 == 0 ? z : true;
                        or4 x = b6a.x(a6eVar, ewd.b, av8Var, (i15 & 14) | 432);
                        int i28 = i16 & (-113);
                        rik rikVar = rik.h;
                        if ((i4 & 8192) != 0) {
                            p3e p3eVar5 = t3eVar;
                            mydVar3 = nyd.b(av8Var);
                            xtcVar4 = xtcVar5;
                            p3eVar4 = p3eVar5;
                            i18 = i27;
                            e9dVar2 = x;
                            i19 = 24966;
                            gnhVar3 = q;
                            lnhVar3 = rikVar;
                        } else {
                            i18 = i27;
                            e9dVar2 = x;
                            i19 = i28;
                            xtcVar4 = xtcVar5;
                            p3eVar4 = t3eVar;
                            gnhVar3 = q;
                            lnhVar3 = rikVar;
                            mydVar3 = mydVar;
                        }
                        e5eVar4 = e5eVar5;
                        lv1Var4 = lv1Var5;
                        i20 = i26;
                        f5 = f6;
                        z3 = z4;
                    } else {
                        av8Var.W();
                        int i29 = i15 & (-29360129);
                        int i30 = i16 & (-113);
                        if ((i4 & 8192) != 0) {
                            z3 = z;
                            lnhVar3 = lnhVar;
                            xtcVar4 = xtcVar2;
                            e5eVar4 = e5eVar2;
                            i20 = i9;
                            mydVar3 = mydVar;
                            i19 = 24966;
                            lv1Var4 = lv1Var2;
                            gnhVar3 = gnhVar;
                        } else {
                            gnhVar3 = gnhVar;
                            z3 = z;
                            lnhVar3 = lnhVar;
                            e5eVar4 = e5eVar2;
                            i20 = i9;
                            i19 = i30;
                            xtcVar4 = xtcVar2;
                            lv1Var4 = lv1Var2;
                            mydVar3 = mydVar;
                        }
                        i18 = i29;
                        p3eVar4 = p3eVar2;
                        f5 = f3;
                        e9dVar2 = e9dVar;
                    }
                    av8Var.t();
                    xtc xtcVar6 = xtcVar4;
                    int i31 = i18 >> 6;
                    int i32 = ((i18 >> 3) & 14) | 24576 | ((i18 << 3) & 112) | (i18 & 896) | 3072 | (i31 & 3670016) | ((i19 << 12) & 29360128);
                    int i33 = i18 << 12;
                    wba.e(xtcVar6, a6eVar, p3eVar4, ewd.b, gnhVar3, z3, mydVar3, i20, f5, e5eVar4, e9dVar2, uxf.p, lv1Var4, lnhVar3, tc3Var, av8Var, i32 | (i33 & 234881024) | (i33 & 1879048192), ((i18 >> 9) & 14) | 3456 | (i31 & 57344) | 1769472);
                    float f7 = f5;
                    gnhVar2 = gnhVar3;
                    e5eVar3 = e5eVar4;
                    z2 = z3;
                    i17 = i20;
                    lv1Var3 = lv1Var4;
                    mydVar2 = mydVar3;
                    f4 = f7;
                    p3eVar3 = p3eVar4;
                    lnhVar2 = lnhVar3;
                    xtcVar3 = xtcVar6;
                } else {
                    av8Var.W();
                    z2 = z;
                    xtcVar3 = xtcVar2;
                    p3eVar3 = p3eVar2;
                    f4 = f3;
                    lv1Var3 = lv1Var2;
                    e5eVar3 = e5eVar2;
                    i17 = i9;
                    gnhVar2 = gnhVar;
                    e9dVar2 = e9dVar;
                    lnhVar2 = lnhVar;
                    mydVar2 = mydVar;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: l5e
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int K = aba.K(i2 | 1);
                            int K2 = aba.K(i3);
                            f6a.a(a6e.this, xtcVar3, p3eVar3, e5eVar3, i17, f4, lv1Var3, gnhVar2, z2, e9dVar2, lnhVar2, mydVar2, tc3Var, (of3) obj, K, K2, i4);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            p3eVar2 = p3eVar;
            i6 = i4 & 8;
            if (i6 != 0) {
            }
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i11 = i4 & 32;
            if (i11 != 0) {
            }
            i12 = i4 & 64;
            if (i12 != 0) {
            }
            int i242 = i10 | 4194304;
            i13 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i13 != 0) {
            }
            i15 = i14 | 805306368;
            int i252 = i3 | 406;
            if ((i3 & 3072) == 0) {
            }
            if (av8Var.T(i15 & 1, (i15 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i5 = i4 & 4;
        if (i5 == 0) {
        }
        p3eVar2 = p3eVar;
        i6 = i4 & 8;
        if (i6 != 0) {
        }
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i11 = i4 & 32;
        if (i11 != 0) {
        }
        i12 = i4 & 64;
        if (i12 != 0) {
        }
        int i2422 = i10 | 4194304;
        i13 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i13 != 0) {
        }
        i15 = i14 | 805306368;
        int i2522 = i3 | 406;
        if ((i3 & 3072) == 0) {
        }
        if (av8Var.T(i15 & 1, (i15 & 306783379) == 306783378 || (i16 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void b(int i, int i2, int i3, Function1 function1, xtc xtcVar, of3 of3Var, int i4) {
        int i5;
        a99 a99Var;
        Object rkfVar;
        long j;
        z69 z69Var;
        boolean z;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1911261195);
        if ((i4 & 6) == 0) {
            i5 = (av8Var.e(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.e(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= av8Var.e(i3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= av8Var.i(function1) ? a.o : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i5 & 1, (i5 & 9363) != 9362)) {
            View view = (View) av8Var.k(nz.f);
            z69 z69Var2 = (z69) av8Var.k(dh3.l);
            float g2 = ((hsk) av8Var.k(dh3.t)).g();
            boolean z2 = ((Configuration) av8Var.k(nz.a)).getLayoutDirection() == 1;
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = e.f(null);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            dsf dsfVar = new dsf();
            Object O2 = av8Var.O();
            if (O2 == a99Var2) {
                O2 = -1;
                av8Var.n0(O2);
            }
            dsfVar.a = ((Number) O2).intValue();
            long D = lz.D(R.color.neutral_variant, av8Var);
            Integer valueOf = Integer.valueOf(i3);
            boolean z3 = (i5 & 896) == 256;
            Object O3 = av8Var.O();
            if (z3 || O3 == a99Var2) {
                O3 = new c27(i3, e1dVar, (rq3) null);
                av8Var.n0(O3);
            }
            hz8.o(av8Var, valueOf, (Function2) O3);
            Integer valueOf2 = Integer.valueOf(i2);
            Integer valueOf3 = Integer.valueOf(i);
            int i6 = i5;
            boolean i7 = ((i5 & 7168) == 2048) | av8Var.i(z69Var2) | av8Var.h(z2) | ((i6 & 14) == 4) | ((i6 & 112) == 32);
            Object O4 = av8Var.O();
            if (i7 || O4 == a99Var2) {
                a99Var = a99Var2;
                j = D;
                z69Var = z69Var2;
                rkfVar = new rkf(function1, z69Var, e1dVar, z2, i, i2);
                e1dVar = e1dVar;
                z = z2;
                av8Var.n0(rkfVar);
            } else {
                a99Var = a99Var2;
                rkfVar = O4;
                j = D;
                z69Var = z69Var2;
                z = z2;
            }
            long j2 = j;
            e1d e1dVar2 = e1dVar;
            xtc b2 = koi.b(koi.b(xtcVar, valueOf2, valueOf3, (PointerInputEventHandler) rkfVar), Integer.valueOf(i2), Integer.valueOf(i), new tkf(view, g2, z, i, i2, dsfVar, function1, z69Var, e1dVar2));
            boolean f2 = av8Var.f(j2);
            Object O5 = av8Var.O();
            if (f2 || O5 == a99Var) {
                O5 = new o76(e1dVar2, j2, 3);
                av8Var.n0(O5);
            }
            nq8.h(av8Var, td4.X(b2, (Function1) O5));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hu7(i, i2, i3, function1, xtcVar, i4);
        }
    }

    public static final void c(a6e a6eVar, xtc xtcVar, t3e t3eVar, e5e e5eVar, int i, fo foVar, gnh gnhVar, boolean z, e9d e9dVar, lnh lnhVar, myd mydVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        e5e e5eVar2;
        fo foVar2;
        gnh gnhVar2;
        boolean z2;
        e9d e9dVar2;
        lnh lnhVar2;
        myd mydVar2;
        boolean z3;
        gnh gnhVar3;
        e5e e5eVar3;
        fo foVar3;
        e9d e9dVar3;
        int i4;
        int i5;
        myd b2;
        lnh lnhVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1590376023);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(a6eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(t3eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i6 |= av8Var.e(i) ? 16384 : 8192;
        }
        int i7 = i6 | 1769472;
        if ((12582912 & i2) == 0) {
            i7 = 5963776 | i6;
        }
        int i8 = 905969664 | i7;
        if (av8Var.T(i8 & 1, (306783379 & i8) != 306783378)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                wib wibVar = wib.e;
                kv1 kv1Var = uxf.p;
                gnh q = b6a.q(a6eVar, av8Var, (i8 & 14) | 196608);
                int i9 = (-29360129) & i8;
                or4 x = b6a.x(a6eVar, ewd.a, av8Var, (i8 & 14) | 432);
                rik rikVar = rik.h;
                z3 = true;
                gnhVar3 = q;
                e5eVar3 = wibVar;
                foVar3 = kv1Var;
                e9dVar3 = x;
                i4 = 1769472;
                i5 = i9;
                b2 = nyd.b(av8Var);
                lnhVar3 = rikVar;
            } else {
                av8Var.W();
                i5 = i8 & (-29360129);
                e5eVar3 = e5eVar;
                foVar3 = foVar;
                gnhVar3 = gnhVar;
                z3 = z;
                e9dVar3 = e9dVar;
                lnhVar3 = lnhVar;
                i4 = 1769472;
                b2 = mydVar;
            }
            av8Var.t();
            int i10 = i5 << 12;
            int i11 = ((i5 >> 3) & 14) | 24576 | ((i5 << 3) & 112) | (i5 & 896) | ((i5 >> 18) & 7168) | ((i5 >> 6) & 3670016) | (i10 & 234881024) | (i10 & 1879048192);
            int i12 = i5 >> 9;
            wba.e(xtcVar, a6eVar, t3eVar, ewd.a, gnhVar3, z3, b2, i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e5eVar3, e9dVar3, foVar3, uxf.m, lnhVar3, tc3Var, av8Var, i11, (i12 & 7168) | (i12 & 14) | 24960 | i4);
            fo foVar4 = foVar3;
            mydVar2 = b2;
            foVar2 = foVar4;
            gnhVar2 = gnhVar3;
            z2 = z3;
            e5eVar2 = e5eVar3;
            e9dVar2 = e9dVar3;
            lnhVar2 = lnhVar3;
        } else {
            av8Var.W();
            e5eVar2 = e5eVar;
            foVar2 = foVar;
            gnhVar2 = gnhVar;
            z2 = z;
            e9dVar2 = e9dVar;
            lnhVar2 = lnhVar;
            mydVar2 = mydVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new to1(a6eVar, xtcVar, t3eVar, e5eVar2, i, foVar2, gnhVar2, z2, e9dVar2, lnhVar2, mydVar2, tc3Var, i2);
        }
    }

    public static final void e(cgl cglVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        cgl cglVar2;
        Function1 function12 = function1;
        cglVar.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1845720423);
        int i2 = 16;
        int i3 = i | (av8Var.g(cglVar) ? 4 : 2) | (av8Var.i(function12) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtc q = n9e.q(wnn.A(l98.d0(bkh.d(xtcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e);
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
                O2 = wzj.q;
                av8Var.n0(O2);
            }
            xtc b0 = l98.b0(tol.y(q, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function12, cglVar, i2), av8Var, 0), 16.0f);
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 6);
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
            xtc d2 = bkh.d(utcVar, 1.0f);
            lv1 lv1Var = uxf.m;
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            kq9.b(s6a.N(R.drawable.ic_leagues, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.value, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 12.0f));
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String a4 = cglVar.e.a(av8Var);
            yf8 yf8Var = xth.a;
            int i4 = 6;
            udj.c(a4, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
            ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var);
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            xtc A = wnn.A(l98.b0(bkh.l(utcVar, 28.0f), 2.0f), o7g.a);
            long D3 = lz.D(R.color.n_lv_4, av8Var);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = mz1.e(av8Var);
            }
            wzc wzcVar2 = (wzc) O3;
            Object[] objArr2 = new Object[0];
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = wzj.r;
                av8Var.n0(O4);
            }
            kq9.b(N, null, tol.y(A, true, true, true, D3, wzcVar2, new uel(2, (boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), function12), av8Var, 0), D2, av8Var, 48, 0);
            av8Var.s(true);
            xtc O5 = kda.O(bkh.d(utcVar, 1.0f), "wc26_player_of_the_tournament_card", av8Var);
            l8g a5 = k8g.a(new ng0(16.0f, true, new a70(i4)), lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, O5);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            td4.C(cglVar.a, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u23 a6 = t23.a(new ng0(4.0f, true, new a70(i4)), kv1Var, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, goaVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            udj.c(cglVar.b, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            l8g a7 = k8g.a(new ng0(4.0f, true, new a70(i4)), lv1Var, av8Var, 54);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C5 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a7, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C5, f50Var3);
            cglVar2 = cglVar;
            td4.G(cglVar.c, bkh.l(utcVar, 16.0f), false, 0L, av8Var, 48, 12);
            udj.c(cglVar2.d, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var.s(true);
            av8Var.s(true);
            i9a.i(Double.valueOf(cglVar2.f), false, null, new p75(22.0f), Integer.valueOf(R.color.n_lv_1), new p75(20.0f), false, av8Var, 12779952, 280);
            av8Var.s(true);
            xtc d3 = bkh.d(utcVar, 1.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode6 = Long.hashCode(av8Var.T);
            aee m6 = av8Var.m();
            xtc C6 = fqj.C(av8Var, d3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m6, ff3Var);
            bf3.s(hashCode6, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C6, f50Var3);
            String v = oea.v(R.string.see_more, av8Var);
            boolean z = (i3 & 112) == 32;
            Object O6 = av8Var.O();
            if (z || O6 == a99Var) {
                function12 = function1;
                O6 = new b4j(13, function12);
                av8Var.n0(O6);
            } else {
                function12 = function1;
            }
            bea.f(v, null, null, false, (Function0) O6, Integer.valueOf(R.drawable.ic_chevron_right_large_16), av8Var, 0, 14);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            cglVar2 = cglVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(cglVar2, function12, xtcVar, i, 29);
        }
    }

    public static final boolean f(Application application) {
        try {
            Object systemService = application.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                return accessibilityManager.isTouchExplorationEnabled();
            }
            return false;
        } catch (Exception e2) {
            j1m j1mVar = j1m.a;
            z0 z0Var = new z0();
            z0Var.f = e2;
            j1m.a(z0Var);
            return false;
        }
    }

    public static final void g(TextView textView, jfj jfjVar) {
        Integer num;
        textView.getClass();
        textView.setText(jfjVar != null ? jfjVar.a : null);
        if (jfjVar != null && (num = jfjVar.b) != null) {
            textView.setTextColor(textView.getContext().getColor(num.intValue()));
        }
        textView.setPaintFlags((jfjVar == null || !jfjVar.c) ? textView.getPaintFlags() & (-17) : textView.getPaintFlags() | 16);
        textView.setVisibility(jfjVar != null ? 0 : 8);
    }

    public static final void h(EventListScoreTextView eventListScoreTextView, jfj jfjVar, boolean z, Boolean bool) {
        ArrayList arrayList;
        Integer num;
        eventListScoreTextView.getClass();
        String str = jfjVar != null ? jfjVar.a : null;
        boolean c2 = Intrinsics.c(bool, Boolean.TRUE);
        if (!z) {
            int i = c2 ? 255 : 0;
            if (!eventListScoreTextView.a.isEmpty() || eventListScoreTextView.b != null || eventListScoreTextView.c != null || eventListScoreTextView.g != null || eventListScoreTextView.h != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !Intrinsics.c(str, eventListScoreTextView.f)) {
                eventListScoreTextView.a();
                ObjectAnimator objectAnimator = eventListScoreTextView.b;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator objectAnimator2 = eventListScoreTextView.c;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                eventListScoreTextView.b = null;
                eventListScoreTextView.c = null;
                eventListScoreTextView.getBackground().setAlpha(0);
                eventListScoreTextView.getBackground().setAlpha(i);
                eventListScoreTextView.f = str;
                eventListScoreTextView.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                eventListScoreTextView.g = null;
                eventListScoreTextView.requestLayout();
                eventListScoreTextView.invalidate();
            } else if (eventListScoreTextView.getBackground().getAlpha() != i) {
                eventListScoreTextView.getBackground().setAlpha(i);
                eventListScoreTextView.invalidate();
            }
        } else if (eventListScoreTextView.a.isEmpty() && Intrinsics.c(str, eventListScoreTextView.f)) {
            eventListScoreTextView.d(c2);
        } else {
            if (!eventListScoreTextView.a.isEmpty()) {
                a26 a26Var = (a26) CollectionsKt.j0(eventListScoreTextView.a);
                if (Intrinsics.c(str, a26Var != null ? a26Var.a : null)) {
                    eventListScoreTextView.d(c2);
                }
            }
            int i2 = 2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setStartDelay(350L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new s2(eventListScoreTextView, 11));
            ofFloat.addListener(new i6(i2, eventListScoreTextView, str));
            ofFloat.addListener(new c26(eventListScoreTextView, i2));
            if (eventListScoreTextView.a.isEmpty()) {
                eventListScoreTextView.a.add(new a26(str, ofFloat, c2));
                eventListScoreTextView.d(c2);
                ofFloat.start();
            } else {
                while (true) {
                    int size = eventListScoreTextView.a.size();
                    arrayList = eventListScoreTextView.a;
                    if (size <= 1) {
                        break;
                    } else {
                        arrayList.remove(b.i(arrayList));
                    }
                }
                arrayList.add(new a26(str, ofFloat, c2));
            }
        }
        if (jfjVar != null && (num = jfjVar.b) != null) {
            eventListScoreTextView.setTextColor(eventListScoreTextView.getContext().getColor(num.intValue()));
        }
        eventListScoreTextView.setVisibility(jfjVar == null ? 8 : 0);
    }

    public static b8d i(TypedValue typedValue, b8d b8dVar, b8d b8dVar2, String str, String str2) {
        if (b8dVar == null || b8dVar == b8dVar2) {
            return b8dVar == null ? b8dVar2 : b8dVar;
        }
        StringBuilder s = mz1.s("Type is ", str, " but found ", str2, ": ");
        s.append(typedValue.data);
        throw new XmlPullParserException(s.toString());
    }

    public static void j(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void k(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final void m(String str) {
        File o = o();
        if (o == null || str == null) {
            return;
        }
        new File(o, str).delete();
    }

    public static final File o() {
        File file = new File(w.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final int p(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static void s(int i, Exception exc, pcd pcdVar) {
        pcdVar.getClass();
        pcdVar.onError(i != -2 ? i != 404 ? i != 429 ? new qcd(3, "Unknown network error", exc) : new qcd(3, "Too many requests", exc) : new qcd(2, "No bid for request", exc) : new qcd(3, "Error parsing Nimbus response", exc));
    }

    public static void t(wcd wcdVar, vcd vcdVar) {
        vcdVar.getClass();
        StringBuilder sb = new StringBuilder("Network: ");
        sv1 sv1Var = wcdVar.a;
        sb.append(sv1Var.l);
        sb.append(" | ID: ");
        sb.append(sv1Var.b);
        sb.append(" | ");
        sb.append(sv1Var.a);
        cjb.a(sb.toString());
        vcdVar.onAdResponse(wcdVar);
    }

    public static final boolean u(StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        String className = stackTraceElement.getClassName();
        className.getClass();
        if (c.v(className, "com.facebook", false)) {
            return true;
        }
        String className2 = stackTraceElement.getClassName();
        className2.getClass();
        return c.v(className2, "com.meta", false);
    }

    public static final boolean v(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (u(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (!c.v(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = stackTraceElement.getClassName();
                        className2.getClass();
                        if (!c.v(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    methodName.getClass();
                    if (c.v(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        methodName2.getClass();
                        if (c.v(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            methodName3.getClass();
                            if (!c.v(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void w(uj2 uj2Var, aej aejVar) {
        uj2 uj2Var2;
        Throwable th;
        n52 c2;
        xcj xcjVar;
        eyc eycVar = aejVar.b;
        boolean d2 = aejVar.d();
        zdj zdjVar = aejVar.a;
        boolean z = d2 && zdjVar.f != 3;
        if (z) {
            long j = aejVar.c;
            oqf r = jca.r(0L, (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            uj2Var.o();
            uj2.t(uj2Var, r);
        }
        pwh pwhVar = zdjVar.b.a;
        v8j v8jVar = pwhVar.m;
        ycj ycjVar = pwhVar.a;
        if (v8jVar == null) {
            v8jVar = v8j.b;
        }
        v8j v8jVar2 = v8jVar;
        qah qahVar = pwhVar.n;
        if (qahVar == null) {
            qahVar = qah.d;
        }
        qah qahVar2 = qahVar;
        ja5 ja5Var = pwhVar.p;
        if (ja5Var == null) {
            ja5Var = e28.a;
        }
        ja5 ja5Var2 = ja5Var;
        try {
            c2 = ycjVar.c();
            xcjVar = xcj.a;
        } catch (Throwable th2) {
            th = th2;
            uj2Var2 = uj2Var;
        }
        try {
            if (c2 != null) {
                float a2 = ycjVar != xcjVar ? ycjVar.a() : 1.0f;
                uj2Var2 = uj2Var;
                try {
                    rfo.z(eycVar, uj2Var2, c2, a2, qahVar2, v8jVar2, ja5Var2);
                    uj2Var2 = uj2Var2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z) {
                    }
                }
            } else {
                long b2 = ycjVar != xcjVar ? ycjVar.b() : r13.b;
                uj2Var2 = uj2Var;
                try {
                    eyc.j(eycVar, uj2Var2, b2, qahVar2, v8jVar2, ja5Var2, 32);
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    uj2Var2.h();
                    throw th;
                }
            }
            if (z) {
                uj2Var2.h();
            }
        } catch (Throwable th5) {
            th = th5;
            uj2Var2 = uj2Var;
            if (!z) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static final olk x(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        wkk wkkVar;
        wkk wkkVar2;
        Object next;
        String str8;
        String str9;
        Object obj;
        String str10;
        String str11;
        String str12;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj2;
        Object obj3;
        ukk ukkVar;
        String str13;
        String str14;
        String str15;
        String str16;
        Object obj4;
        String str17;
        String str18;
        ArrayList arrayList3;
        String str19;
        Object obj5;
        String str20;
        Object obj6;
        String str21;
        Object obj7;
        String str22;
        String str23;
        Integer intOrNull;
        Integer intOrNull2;
        String str24;
        Object obj8;
        String str25;
        String str26;
        Integer intOrNull3;
        Integer intOrNull4;
        ukk ukkVar2;
        ArrayList arrayList4;
        Object obj9;
        str.getClass();
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        String str27 = null;
        String attributeValue = newPullParser.getAttributeValue(null, "version");
        int i = 2;
        String str28 = "VAST";
        newPullParser.require(2, null, "VAST");
        tkk tkkVar = null;
        while (true) {
            int i2 = 3;
            if (newPullParser.next() == 3) {
                String str29 = attributeValue;
                newPullParser.require(3, str27, str28);
                str29.getClass();
                olk olkVar = new olk();
                olkVar.a = str29;
                olkVar.b = tkkVar;
                return olkVar;
            }
            if (newPullParser.getEventType() == i) {
                String str30 = "Ad";
                if (Intrinsics.c(newPullParser.getName(), "Ad")) {
                    newPullParser.require(i, str27, "Ad");
                    flk flkVar = str27;
                    while (newPullParser.next() != i2) {
                        if (newPullParser.getEventType() == i) {
                            String str31 = "InLine";
                            if (Intrinsics.c(newPullParser.getName(), "InLine")) {
                                String str32 = "";
                                ukk ukkVar3 = new ukk("");
                                ArrayList arrayList5 = new ArrayList();
                                ArrayList arrayList6 = new ArrayList();
                                newPullParser.require(i, str27, "InLine");
                                Object obj10 = str27;
                                Object obj11 = obj10;
                                ukk ukkVar4 = ukkVar3;
                                String str33 = "";
                                Object obj12 = obj11;
                                while (newPullParser.next() != i2) {
                                    if (newPullParser.getEventType() == i) {
                                        String name = newPullParser.getName();
                                        if (name != null) {
                                            String str34 = "type";
                                            str10 = str32;
                                            switch (name.hashCode()) {
                                                case -2077435339:
                                                    str8 = attributeValue;
                                                    str9 = str28;
                                                    obj = obj12;
                                                    str12 = str30;
                                                    str11 = str31;
                                                    arrayList = arrayList6;
                                                    str13 = str33;
                                                    ukkVar = ukkVar4;
                                                    arrayList2 = arrayList5;
                                                    obj3 = obj10;
                                                    obj2 = obj11;
                                                    if (name.equals("AdVerifications")) {
                                                        obj11 = y(newPullParser);
                                                        str33 = str13;
                                                        ukkVar4 = ukkVar;
                                                        obj10 = obj3;
                                                        obj12 = obj;
                                                        break;
                                                    }
                                                    H(newPullParser);
                                                    str33 = str13;
                                                    ukkVar4 = ukkVar;
                                                    obj10 = obj3;
                                                    obj11 = obj2;
                                                    obj12 = obj;
                                                case -1692490108:
                                                    str13 = str33;
                                                    ukkVar = ukkVar4;
                                                    arrayList2 = arrayList5;
                                                    obj3 = obj10;
                                                    if (name.equals("Creatives")) {
                                                        ArrayList arrayList7 = new ArrayList();
                                                        String str35 = null;
                                                        int i3 = 2;
                                                        newPullParser.require(2, null, "Creatives");
                                                        while (newPullParser.next() != 3) {
                                                            if (newPullParser.getEventType() == i3) {
                                                                if (Intrinsics.c(newPullParser.getName(), "Creative")) {
                                                                    newPullParser.require(i3, str35, "Creative");
                                                                    hlk hlkVar = null;
                                                                    ykk ykkVar = null;
                                                                    while (true) {
                                                                        arrayList3 = arrayList6;
                                                                        if (newPullParser.next() == 3) {
                                                                            str14 = attributeValue;
                                                                            str15 = str34;
                                                                            str16 = str28;
                                                                            obj4 = obj12;
                                                                            str17 = str30;
                                                                            str18 = str31;
                                                                            obj5 = obj11;
                                                                            str19 = null;
                                                                            newPullParser.require(3, null, "Creative");
                                                                            arrayList7.add(new zkk(hlkVar, ykkVar));
                                                                        } else if (newPullParser.getEventType() != 2) {
                                                                            arrayList6 = arrayList3;
                                                                        } else {
                                                                            String name2 = newPullParser.getName();
                                                                            String str36 = attributeValue;
                                                                            String str37 = "height";
                                                                            String str38 = str28;
                                                                            String str39 = "width";
                                                                            String str40 = str30;
                                                                            if (Intrinsics.c(name2, "Linear")) {
                                                                                km5 km5Var = km5.a;
                                                                                mlk mlkVar = new mlk(km5Var);
                                                                                jlk jlkVar = new jlk(km5Var);
                                                                                newPullParser.require(2, null, "Linear");
                                                                                jlk jlkVar2 = jlkVar;
                                                                                mlk mlkVar2 = mlkVar;
                                                                                blk blkVar = null;
                                                                                nlk nlkVar = null;
                                                                                while (true) {
                                                                                    obj7 = obj11;
                                                                                    if (newPullParser.next() == 3) {
                                                                                        str20 = str34;
                                                                                        obj6 = obj12;
                                                                                        str21 = str31;
                                                                                        newPullParser.require(3, null, "Linear");
                                                                                        hlkVar = new hlk(blkVar, mlkVar2, nlkVar, jlkVar2);
                                                                                    } else if (newPullParser.getEventType() != 2) {
                                                                                        obj11 = obj7;
                                                                                    } else {
                                                                                        String name3 = newPullParser.getName();
                                                                                        if (name3 != null) {
                                                                                            switch (name3.hashCode()) {
                                                                                                case -2049897434:
                                                                                                    str24 = str34;
                                                                                                    obj8 = obj12;
                                                                                                    str25 = str31;
                                                                                                    if (name3.equals("VideoClicks")) {
                                                                                                        newPullParser.require(2, null, "VideoClicks");
                                                                                                        String str41 = str10;
                                                                                                        String str42 = str41;
                                                                                                        while (newPullParser.next() != 3) {
                                                                                                            if (newPullParser.getEventType() == 2) {
                                                                                                                String name4 = newPullParser.getName();
                                                                                                                if (Intrinsics.c(name4, "ClickThrough")) {
                                                                                                                    str41 = A(newPullParser);
                                                                                                                } else if (Intrinsics.c(name4, "ClickTracking")) {
                                                                                                                    str42 = A(newPullParser);
                                                                                                                } else {
                                                                                                                    H(newPullParser);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        newPullParser.require(3, null, "VideoClicks");
                                                                                                        nlkVar = new nlk(str41, str42);
                                                                                                        break;
                                                                                                    }
                                                                                                    H(newPullParser);
                                                                                                    break;
                                                                                                case -1927368268:
                                                                                                    str24 = str34;
                                                                                                    obj8 = obj12;
                                                                                                    str25 = str31;
                                                                                                    if (name3.equals("Duration")) {
                                                                                                        blkVar = new blk(A(newPullParser));
                                                                                                        break;
                                                                                                    }
                                                                                                    H(newPullParser);
                                                                                                    break;
                                                                                                case -385055469:
                                                                                                    if (name3.equals("MediaFiles")) {
                                                                                                        ArrayList arrayList8 = new ArrayList();
                                                                                                        obj8 = obj12;
                                                                                                        str25 = str31;
                                                                                                        newPullParser.require(2, null, "MediaFiles");
                                                                                                        while (newPullParser.next() != 3) {
                                                                                                            if (newPullParser.getEventType() == 2) {
                                                                                                                if (Intrinsics.c(newPullParser.getName(), "MediaFile")) {
                                                                                                                    String attributeValue2 = newPullParser.getAttributeValue(null, C4331u.g);
                                                                                                                    String attributeValue3 = newPullParser.getAttributeValue(null, str34);
                                                                                                                    String attributeValue4 = newPullParser.getAttributeValue(null, "bitrate");
                                                                                                                    String attributeValue5 = newPullParser.getAttributeValue(null, "width");
                                                                                                                    String attributeValue6 = newPullParser.getAttributeValue(null, "height");
                                                                                                                    str26 = str34;
                                                                                                                    String attributeValue7 = newPullParser.getAttributeValue(null, "maintainAspectRatio");
                                                                                                                    String attributeValue8 = newPullParser.getAttributeValue(null, "scalable");
                                                                                                                    String A = A(newPullParser);
                                                                                                                    Integer intOrNull5 = attributeValue4 != null ? StringsKt.toIntOrNull(attributeValue4) : null;
                                                                                                                    int intValue = (attributeValue6 == null || (intOrNull4 = StringsKt.toIntOrNull(attributeValue6)) == null) ? 0 : intOrNull4.intValue();
                                                                                                                    int intValue2 = (attributeValue5 == null || (intOrNull3 = StringsKt.toIntOrNull(attributeValue5)) == null) ? 0 : intOrNull3.intValue();
                                                                                                                    attributeValue2.getClass();
                                                                                                                    Boolean valueOf = attributeValue7 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue7)) : null;
                                                                                                                    Boolean valueOf2 = attributeValue8 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue8)) : null;
                                                                                                                    attributeValue3.getClass();
                                                                                                                    arrayList8.add(new ilk(A, intOrNull5, intValue, intValue2, attributeValue2, valueOf, valueOf2, attributeValue3));
                                                                                                                } else {
                                                                                                                    str26 = str34;
                                                                                                                    H(newPullParser);
                                                                                                                }
                                                                                                                str34 = str26;
                                                                                                            }
                                                                                                        }
                                                                                                        str24 = str34;
                                                                                                        newPullParser.require(3, null, "MediaFiles");
                                                                                                        jlkVar2 = new jlk(arrayList8);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                case 611554000:
                                                                                                    if (name3.equals("TrackingEvents")) {
                                                                                                        str24 = str34;
                                                                                                        obj8 = obj12;
                                                                                                        str25 = str31;
                                                                                                        mlkVar2 = B(newPullParser);
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            obj11 = obj7;
                                                                                            obj12 = obj8;
                                                                                            str31 = str25;
                                                                                            str34 = str24;
                                                                                        }
                                                                                        str24 = str34;
                                                                                        obj8 = obj12;
                                                                                        str25 = str31;
                                                                                        H(newPullParser);
                                                                                        obj11 = obj7;
                                                                                        obj12 = obj8;
                                                                                        str31 = str25;
                                                                                        str34 = str24;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                str20 = str34;
                                                                                obj6 = obj12;
                                                                                str21 = str31;
                                                                                obj7 = obj11;
                                                                                String str43 = null;
                                                                                if (Intrinsics.c(name2, "CompanionAds")) {
                                                                                    ArrayList arrayList9 = new ArrayList();
                                                                                    int i4 = 2;
                                                                                    newPullParser.require(2, null, "CompanionAds");
                                                                                    while (newPullParser.next() != 3) {
                                                                                        if (newPullParser.getEventType() == i4) {
                                                                                            if (Intrinsics.c(newPullParser.getName(), "Companion")) {
                                                                                                String attributeValue9 = newPullParser.getAttributeValue(str43, "id");
                                                                                                String attributeValue10 = newPullParser.getAttributeValue(str43, str39);
                                                                                                String attributeValue11 = newPullParser.getAttributeValue(str43, str37);
                                                                                                mlk mlkVar3 = new mlk(km5.a);
                                                                                                ArrayList arrayList10 = new ArrayList();
                                                                                                str22 = str37;
                                                                                                str23 = str39;
                                                                                                int i5 = 2;
                                                                                                newPullParser.require(2, null, "Companion");
                                                                                                mlk mlkVar4 = mlkVar3;
                                                                                                String str44 = null;
                                                                                                klk klkVar = null;
                                                                                                String str45 = null;
                                                                                                String str46 = null;
                                                                                                while (newPullParser.next() != 3) {
                                                                                                    if (newPullParser.getEventType() == i5) {
                                                                                                        String name5 = newPullParser.getName();
                                                                                                        if (name5 != null) {
                                                                                                            switch (name5.hashCode()) {
                                                                                                                case -375340334:
                                                                                                                    if (name5.equals("IFrameResource")) {
                                                                                                                        str45 = A(newPullParser);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case -348198615:
                                                                                                                    if (name5.equals("CompanionClickThrough")) {
                                                                                                                        str44 = A(newPullParser);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 611554000:
                                                                                                                    if (name5.equals("TrackingEvents")) {
                                                                                                                        mlkVar4 = B(newPullParser);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 676623548:
                                                                                                                    if (name5.equals("StaticResource")) {
                                                                                                                        klkVar = new klk(A(newPullParser), newPullParser.getAttributeValue(null, "creativeType"));
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1877773523:
                                                                                                                    if (name5.equals("CompanionClickTracking")) {
                                                                                                                        arrayList10.add(A(newPullParser));
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1928285401:
                                                                                                                    if (name5.equals("HTMLResource")) {
                                                                                                                        str46 = A(newPullParser);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            i5 = 2;
                                                                                                        }
                                                                                                        H(newPullParser);
                                                                                                        i5 = 2;
                                                                                                    }
                                                                                                }
                                                                                                newPullParser.require(3, null, "Companion");
                                                                                                arrayList9.add(new xkk(attributeValue9, mlkVar4, str44, arrayList10, klkVar, str45, str46, (attributeValue10 == null || (intOrNull2 = StringsKt.toIntOrNull(attributeValue10)) == null) ? 0 : intOrNull2.intValue(), (attributeValue11 == null || (intOrNull = StringsKt.toIntOrNull(attributeValue11)) == null) ? 0 : intOrNull.intValue()));
                                                                                            } else {
                                                                                                str22 = str37;
                                                                                                str23 = str39;
                                                                                                H(newPullParser);
                                                                                            }
                                                                                            str39 = str23;
                                                                                            str37 = str22;
                                                                                            i4 = 2;
                                                                                            str43 = null;
                                                                                        }
                                                                                    }
                                                                                    newPullParser.require(3, str43, "CompanionAds");
                                                                                    ykkVar = new ykk(arrayList9);
                                                                                } else {
                                                                                    H(newPullParser);
                                                                                }
                                                                            }
                                                                            arrayList6 = arrayList3;
                                                                            attributeValue = str36;
                                                                            str28 = str38;
                                                                            str30 = str40;
                                                                            obj11 = obj7;
                                                                            obj12 = obj6;
                                                                            str31 = str21;
                                                                            str34 = str20;
                                                                        }
                                                                    }
                                                                } else {
                                                                    str14 = attributeValue;
                                                                    str15 = str34;
                                                                    str16 = str28;
                                                                    obj4 = obj12;
                                                                    str17 = str30;
                                                                    str18 = str31;
                                                                    arrayList3 = arrayList6;
                                                                    str19 = str35;
                                                                    obj5 = obj11;
                                                                    H(newPullParser);
                                                                }
                                                                str35 = str19;
                                                                arrayList6 = arrayList3;
                                                                attributeValue = str14;
                                                                str28 = str16;
                                                                str30 = str17;
                                                                obj11 = obj5;
                                                                obj12 = obj4;
                                                                str31 = str18;
                                                                str34 = str15;
                                                                i3 = 2;
                                                            }
                                                        }
                                                        str8 = attributeValue;
                                                        str9 = str28;
                                                        str12 = str30;
                                                        str11 = str31;
                                                        arrayList = arrayList6;
                                                        newPullParser.require(3, str35, "Creatives");
                                                        obj10 = new alk(arrayList7);
                                                        str33 = str13;
                                                        ukkVar4 = ukkVar;
                                                        break;
                                                    }
                                                    str8 = attributeValue;
                                                    str9 = str28;
                                                    obj = obj12;
                                                    str12 = str30;
                                                    str11 = str31;
                                                    arrayList = arrayList6;
                                                    obj2 = obj11;
                                                    H(newPullParser);
                                                    str33 = str13;
                                                    ukkVar4 = ukkVar;
                                                    obj10 = obj3;
                                                    obj11 = obj2;
                                                    obj12 = obj;
                                                    break;
                                                case -1633884078:
                                                    str13 = str33;
                                                    ukkVar = ukkVar4;
                                                    arrayList2 = arrayList5;
                                                    obj3 = obj10;
                                                    if (name.equals("AdSystem")) {
                                                        str8 = attributeValue;
                                                        str33 = A(newPullParser);
                                                        str9 = str28;
                                                        str12 = str30;
                                                        str11 = str31;
                                                        arrayList = arrayList6;
                                                        ukkVar4 = ukkVar;
                                                        obj10 = obj3;
                                                        break;
                                                    }
                                                    str8 = attributeValue;
                                                    str9 = str28;
                                                    obj = obj12;
                                                    str12 = str30;
                                                    str11 = str31;
                                                    arrayList = arrayList6;
                                                    obj2 = obj11;
                                                    H(newPullParser);
                                                    str33 = str13;
                                                    ukkVar4 = ukkVar;
                                                    obj10 = obj3;
                                                    obj11 = obj2;
                                                    obj12 = obj;
                                                    break;
                                                case 67232232:
                                                    str13 = str33;
                                                    ukkVar = ukkVar4;
                                                    arrayList2 = arrayList5;
                                                    obj3 = obj10;
                                                    if (name.equals("Error")) {
                                                        arrayList6.add(A(newPullParser));
                                                        str8 = attributeValue;
                                                        str9 = str28;
                                                        obj = obj12;
                                                        str12 = str30;
                                                        str11 = str31;
                                                        arrayList = arrayList6;
                                                        obj2 = obj11;
                                                        str33 = str13;
                                                        ukkVar4 = ukkVar;
                                                        obj10 = obj3;
                                                        obj11 = obj2;
                                                        obj12 = obj;
                                                        break;
                                                    }
                                                    str8 = attributeValue;
                                                    str9 = str28;
                                                    obj = obj12;
                                                    str12 = str30;
                                                    str11 = str31;
                                                    arrayList = arrayList6;
                                                    obj2 = obj11;
                                                    H(newPullParser);
                                                    str33 = str13;
                                                    ukkVar4 = ukkVar;
                                                    obj10 = obj3;
                                                    obj11 = obj2;
                                                    obj12 = obj;
                                                case 184043572:
                                                    if (name.equals("Extensions")) {
                                                        ArrayList arrayList11 = new ArrayList();
                                                        String str47 = str33;
                                                        newPullParser.require(2, null, "Extensions");
                                                        while (newPullParser.next() != 3) {
                                                            if (newPullParser.getEventType() == 2) {
                                                                if (Intrinsics.c(newPullParser.getName(), "Extension")) {
                                                                    ukkVar2 = ukkVar4;
                                                                    String attributeValue12 = newPullParser.getAttributeValue(null, "type");
                                                                    arrayList4 = arrayList5;
                                                                    ArrayList arrayList12 = new ArrayList();
                                                                    obj9 = obj10;
                                                                    newPullParser.require(2, null, "Extension");
                                                                    while (newPullParser.next() != 3) {
                                                                        if (newPullParser.getEventType() == 2) {
                                                                            if (Intrinsics.c(newPullParser.getName(), "AdVerifications")) {
                                                                                o13.v(y(newPullParser).a, arrayList12);
                                                                            } else {
                                                                                H(newPullParser);
                                                                            }
                                                                        }
                                                                    }
                                                                    newPullParser.require(3, null, "Extension");
                                                                    arrayList11.add(new clk(attributeValue12, new wkk(arrayList12)));
                                                                } else {
                                                                    ukkVar2 = ukkVar4;
                                                                    arrayList4 = arrayList5;
                                                                    obj9 = obj10;
                                                                    H(newPullParser);
                                                                }
                                                                ukkVar4 = ukkVar2;
                                                                arrayList5 = arrayList4;
                                                                obj10 = obj9;
                                                            }
                                                        }
                                                        arrayList2 = arrayList5;
                                                        obj3 = obj10;
                                                        newPullParser.require(3, null, "Extensions");
                                                        str8 = attributeValue;
                                                        obj12 = new dlk(arrayList11);
                                                        str9 = str28;
                                                        str12 = str30;
                                                        str11 = str31;
                                                        arrayList = arrayList6;
                                                        str33 = str47;
                                                        obj10 = obj3;
                                                        break;
                                                    }
                                                    str8 = attributeValue;
                                                    str9 = str28;
                                                    obj = obj12;
                                                    break;
                                                case 501930965:
                                                    if (name.equals("AdTitle")) {
                                                        str8 = attributeValue;
                                                        ukkVar4 = new ukk(A(newPullParser));
                                                        str9 = str28;
                                                        str12 = str30;
                                                        str11 = str31;
                                                        arrayList = arrayList6;
                                                        arrayList2 = arrayList5;
                                                        break;
                                                    }
                                                    str8 = attributeValue;
                                                    str9 = str28;
                                                    obj = obj12;
                                                    break;
                                                case 2114088489:
                                                    if (name.equals("Impression")) {
                                                        newPullParser.require(2, null, "Impression");
                                                        arrayList5.add(new elk(A(newPullParser), newPullParser.getAttributeValue(null, "id")));
                                                        str8 = attributeValue;
                                                        str9 = str28;
                                                        obj = obj12;
                                                        str12 = str30;
                                                        str11 = str31;
                                                        arrayList = arrayList6;
                                                        str13 = str33;
                                                        ukkVar = ukkVar4;
                                                        arrayList2 = arrayList5;
                                                        obj3 = obj10;
                                                        obj2 = obj11;
                                                        str33 = str13;
                                                        ukkVar4 = ukkVar;
                                                        obj10 = obj3;
                                                        obj11 = obj2;
                                                        obj12 = obj;
                                                        break;
                                                    }
                                                    str8 = attributeValue;
                                                    str9 = str28;
                                                    obj = obj12;
                                                    break;
                                                default:
                                                    str8 = attributeValue;
                                                    str9 = str28;
                                                    obj = obj12;
                                                    break;
                                            }
                                            str32 = str10;
                                            arrayList5 = arrayList2;
                                            arrayList6 = arrayList;
                                            attributeValue = str8;
                                            str28 = str9;
                                            str30 = str12;
                                            str31 = str11;
                                            i = 2;
                                            i2 = 3;
                                        } else {
                                            str8 = attributeValue;
                                            str9 = str28;
                                            obj = obj12;
                                            str10 = str32;
                                        }
                                        str12 = str30;
                                        str11 = str31;
                                        arrayList = arrayList6;
                                        str13 = str33;
                                        ukkVar = ukkVar4;
                                        arrayList2 = arrayList5;
                                        obj3 = obj10;
                                        obj2 = obj11;
                                        H(newPullParser);
                                        str33 = str13;
                                        ukkVar4 = ukkVar;
                                        obj10 = obj3;
                                        obj11 = obj2;
                                        obj12 = obj;
                                        str32 = str10;
                                        arrayList5 = arrayList2;
                                        arrayList6 = arrayList;
                                        attributeValue = str8;
                                        str28 = str9;
                                        str30 = str12;
                                        str31 = str11;
                                        i = 2;
                                        i2 = 3;
                                    }
                                }
                                str5 = attributeValue;
                                str6 = str28;
                                dlk dlkVar = obj12;
                                str7 = str30;
                                ArrayList arrayList13 = arrayList6;
                                String str48 = str33;
                                ukk ukkVar5 = ukkVar4;
                                ArrayList arrayList14 = arrayList5;
                                alk alkVar = obj10;
                                wkk wkkVar3 = obj11;
                                newPullParser.require(i2, null, str31);
                                if (dlkVar != 0) {
                                    ArrayList arrayList15 = dlkVar.a;
                                    ArrayList arrayList16 = new ArrayList(k13.r(arrayList15, 10));
                                    Iterator it = arrayList15.iterator();
                                    while (it.hasNext()) {
                                        arrayList16.add(((clk) it.next()).b);
                                    }
                                    Iterator it2 = arrayList16.iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        while (it2.hasNext()) {
                                            wkk wkkVar4 = (wkk) it2.next();
                                            wkk wkkVar5 = (wkk) next;
                                            if (wkkVar5 != null) {
                                                next = new wkk(CollectionsKt.w0(wkkVar4 != null ? wkkVar4.a : km5.a, wkkVar5.a));
                                            } else {
                                                next = null;
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                    wkkVar = (wkk) next;
                                } else {
                                    wkkVar = null;
                                }
                                alkVar.getClass();
                                if (wkkVar3 != 0) {
                                    wkkVar2 = new wkk(CollectionsKt.w0(wkkVar != null ? wkkVar.a : km5.a, wkkVar3.a));
                                } else {
                                    wkkVar2 = wkkVar;
                                }
                                flkVar = new flk(str48, ukkVar5, arrayList14, alkVar, wkkVar2, arrayList13, dlkVar);
                            } else {
                                str5 = attributeValue;
                                str6 = str28;
                                str7 = str30;
                                H(newPullParser);
                                flkVar = flkVar;
                            }
                            attributeValue = str5;
                            str28 = str6;
                            str30 = str7;
                            str27 = null;
                            i = 2;
                            i2 = 3;
                        }
                    }
                    str2 = attributeValue;
                    str3 = str27;
                    str4 = str28;
                    newPullParser.require(i2, str3, str30);
                    flkVar.getClass();
                    tkkVar = new tkk(flkVar);
                } else {
                    str2 = attributeValue;
                    str3 = str27;
                    str4 = str28;
                    H(newPullParser);
                }
                str27 = str3;
                attributeValue = str2;
                str28 = str4;
                i = 2;
            }
        }
    }

    public static final wkk y(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, null, "AdVerifications");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.c(xmlPullParser.getName(), "Verification")) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
                    ArrayList arrayList2 = new ArrayList();
                    xmlPullParser.require(2, null, "Verification");
                    mlk mlkVar = null;
                    String str = null;
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            String name = xmlPullParser.getName();
                            if (name != null) {
                                int hashCode = name.hashCode();
                                if (hashCode != 611554000) {
                                    if (hashCode != 1561251035) {
                                        if (hashCode == 1749252741 && name.equals("VerificationParameters")) {
                                            str = A(xmlPullParser);
                                        }
                                    } else if (name.equals("JavaScriptResource")) {
                                        String attributeValue2 = xmlPullParser.getAttributeValue(null, "apiFramework");
                                        String attributeValue3 = xmlPullParser.getAttributeValue(null, "browserOptional");
                                        arrayList2.add(new glk(attributeValue2, attributeValue3 != null ? Boolean.parseBoolean(attributeValue3) : false, A(xmlPullParser)));
                                    }
                                } else if (name.equals("TrackingEvents")) {
                                    mlkVar = B(xmlPullParser);
                                }
                            }
                            H(xmlPullParser);
                        }
                    }
                    xmlPullParser.require(3, null, "Verification");
                    arrayList.add(new vkk(arrayList2, mlkVar, attributeValue, str));
                } else {
                    H(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "AdVerifications");
        return new wkk(arrayList);
    }

    public static final JSONObject z(String str) {
        File o = o();
        if (o != null && str != null) {
            try {
                return new JSONObject(k0.I(new FileInputStream(new File(o, str))));
            } catch (Exception unused) {
                m(str);
            }
        }
        return null;
    }

    public abstract void C();

    public abstract void M(rk3 rk3Var, dfb dfbVar);

    public abstract o6a l(ejg ejgVar);

    public abstract ao2 n();

    public abstract ScheduledExecutorService q();

    public abstract xx3 r();
}
