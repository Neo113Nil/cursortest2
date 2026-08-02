package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.text.Layout;
import android.util.TypedValue;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.adsbynimbus.render.mraid.Host;
import com.google.android.gms.internal.ads.zzhbr;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.results.R;
import com.sofascore.results.service.SyncWorker;
import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.text.Bidi;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class w3a {
    public static volatile dad a;
    public static volatile t9d b;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    public static l6d A(stk stkVar) {
        stkVar.getClass();
        ne neVar = m6d.a;
        jy3 jy3Var = jy3.b;
        neVar.getClass();
        jy3Var.getClass();
        g7h g7hVar = new g7h(stkVar, neVar, jy3Var);
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(l6d.class);
        orCreateKotlinClass.getClass();
        String t = kik.t(orCreateKotlinClass);
        if (t != null) {
            return (l6d) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t), orCreateKotlinClass);
        }
        a70.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final int B(ydj ydjVar, Layout layout, p03 p03Var, int i, RectF rectF, j1h j1hVar, t21 t21Var, boolean z) {
        gma[] gmaVarArr;
        gma[] gmaVarArr2;
        int i2;
        int i3;
        int f2;
        int i4;
        int i5;
        int e2;
        Bidi createLineBidi;
        boolean z2;
        float a2;
        float a3;
        float f3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = ydjVar.f;
        int lineStart2 = layout2.getLineStart(i);
        int f4 = ydjVar.f(i);
        if (i6 < (f4 - lineStart2) * 2) {
            s3a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        ef9 ef9Var = new ef9(ydjVar);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i7 = 0;
        while (lineStart2 < f4) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                a2 = ef9Var.a(z3, z3, true, lineStart2);
                f3 = ef9Var.a(true, true, true, lineStart2 + 1);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f3 = ef9Var.a(false, false, false, lineStart2);
                a2 = ef9Var.a(true, true, false, lineStart2 + 1);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    a3 = ef9Var.a(false, false, true, lineStart2);
                    a2 = ef9Var.a(true, true, true, lineStart2 + 1);
                } else {
                    a2 = ef9Var.a(false, false, false, lineStart2);
                    a3 = ef9Var.a(true, true, false, lineStart2 + 1);
                }
                f3 = a3;
            }
            fArr[i7] = a2;
            fArr[i7 + 1] = f3;
            i7 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) p03Var.b;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int k = p03Var.k(lineStart3, false);
        int l = p03Var.l(k);
        int i8 = lineStart3 - l;
        int i9 = lineEnd2 - l;
        Bidi g2 = p03Var.g(k);
        if (g2 == null || (createLineBidi = g2.createLineBidi(i8, i9)) == null) {
            gmaVarArr = new gma[]{new gma(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            gmaVarArr = new gma[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                gmaVarArr[i10] = new gma(createLineBidi.getRunStart(i10) + lineStart3, createLineBidi.getRunLimit(i10) + lineStart3, createLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
        }
        a intRange = z ? new IntRange(0, gmaVarArr.length - 1, 1) : llf.h(gmaVarArr.length - 1, 0);
        int i12 = intRange.a;
        int i13 = intRange.b;
        int i14 = intRange.c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            gma gmaVar = gmaVarArr[i12];
            boolean z5 = gmaVar.c;
            int i15 = gmaVar.a;
            int i16 = gmaVar.b;
            float f5 = z5 ? fArr[((i16 - 1) - lineStart) * 2] : fArr[(i15 - lineStart) * 2];
            float v = z5 ? v(i15, lineStart, fArr) : v(i16 - 1, lineStart, fArr);
            float f6 = rectF.left;
            int i17 = i14;
            if (z) {
                if (v >= f6) {
                    float f7 = rectF.right;
                    if (f5 <= f7) {
                        if ((z5 || f6 > f5) && (!z5 || f7 < v)) {
                            int i18 = i16;
                            int i19 = i15;
                            while (true) {
                                i4 = i18;
                                if (i18 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i4 + i19) / 2;
                                float f8 = fArr[(i20 - lineStart) * 2];
                                if ((z5 || f8 <= rectF.left) && (!z5 || f8 >= rectF.right)) {
                                    i18 = i4;
                                    i19 = i20;
                                } else {
                                    i18 = i20;
                                }
                            }
                            i5 = z5 ? i4 : i19;
                        } else {
                            i5 = i15;
                        }
                        int f9 = j1hVar.f(i5);
                        if (f9 != -1 && (e2 = j1hVar.e(f9)) < i16) {
                            if (e2 >= i15) {
                                i15 = e2;
                            }
                            if (f9 > i16) {
                                f9 = i16;
                            }
                            gmaVarArr2 = gmaVarArr;
                            RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineTop, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineBottom);
                            int i21 = f9;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i21 - 1) - lineStart) * 2] : fArr[(i15 - lineStart) * 2];
                                rectF2.right = z5 ? v(i15, lineStart, fArr) : v(i21 - 1, lineStart, fArr);
                                if (!((Boolean) t21Var.invoke(rectF2, rectF)).booleanValue()) {
                                    i15 = j1hVar.c(i15);
                                    if (i15 == -1 || i15 >= i16) {
                                        break;
                                    }
                                    i21 = j1hVar.f(i15);
                                    if (i21 > i16) {
                                        i21 = i16;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i15 = -1;
                        }
                    }
                }
                gmaVarArr2 = gmaVarArr;
                i15 = -1;
            } else {
                gmaVarArr2 = gmaVarArr;
                if (v >= f6) {
                    float f10 = rectF.right;
                    if (f5 <= f10) {
                        if ((z5 || f10 < v) && (!z5 || f6 > f5)) {
                            int i22 = i16;
                            int i23 = i15;
                            while (i22 - i23 > 1) {
                                int i24 = (i22 + i23) / 2;
                                float f11 = fArr[(i24 - lineStart) * 2];
                                int i25 = i22;
                                if ((z5 || f11 <= rectF.right) && (!z5 || f11 >= rectF.left)) {
                                    i22 = i25;
                                    i23 = i24;
                                } else {
                                    i22 = i24;
                                }
                            }
                            i3 = z5 ? i22 : i23;
                        } else {
                            i3 = i16 - 1;
                        }
                        int e3 = j1hVar.e(i3 + 1);
                        if (e3 != -1 && (f2 = j1hVar.f(e3)) > i15) {
                            if (e3 < i15) {
                                e3 = i15;
                            }
                            if (f2 <= i16) {
                                i16 = f2;
                            }
                            RectF rectF3 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineTop, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lineBottom);
                            int i26 = e3;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i16 - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
                                rectF3.right = z5 ? v(i26, lineStart, fArr) : v(i16 - 1, lineStart, fArr);
                                if (!((Boolean) t21Var.invoke(rectF3, rectF)).booleanValue()) {
                                    i16 = j1hVar.g(i16);
                                    if (i16 == -1 || i16 <= i15) {
                                        break;
                                    }
                                    i26 = j1hVar.e(i16);
                                    if (i26 < i15) {
                                        i26 = i15;
                                    }
                                } else {
                                    i2 = i16;
                                    break;
                                }
                            }
                        }
                    }
                }
                i2 = -1;
                i15 = i2;
            }
            if (i15 >= 0) {
                return i15;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i17;
            i14 = i17;
            gmaVarArr = gmaVarArr2;
        }
    }

    public static final String C(Season season, Context context) {
        season.getClass();
        context.getClass();
        String string = season.isAllTimeSeason() ? context.getString(R.string.all_time) : season.getYear();
        string.getClass();
        return string;
    }

    public static wmd D(Context context, Stage stage) {
        Category category;
        stage.getClass();
        int id = stage.getId();
        ServerType type = stage.getType();
        m9k m9kVar = new m9k(cga.A(stage, context, false));
        Stage raceStage = stage.getRaceStage();
        Long valueOf = raceStage != null ? Long.valueOf(raceStage.getStartDateTimestamp()) : null;
        String statusType = stage.getStatusType();
        Country country = stage.getCountry();
        String alpha2 = country != null ? country.getAlpha2() : null;
        UniqueStage uniqueStage = stage.getUniqueStage();
        Integer valueOf2 = (uniqueStage == null || (category = uniqueStage.getCategory()) == null) ? null : Integer.valueOf(category.getId());
        Stage raceStage2 = stage.getRaceStage();
        return new wmd(id, type, m9kVar, valueOf, statusType, alpha2, valueOf2, raceStage2 != null ? D(context, raceStage2) : null);
    }

    public static final boolean E(oqf oqfVar, oqf oqfVar2, oqf oqfVar3, int i) {
        if (!F(i, oqfVar, oqfVar3)) {
            return false;
        }
        if (F(i, oqfVar2, oqfVar3) && !m(oqfVar3, oqfVar, oqfVar2, i)) {
            return !m(oqfVar3, oqfVar2, oqfVar, i) && G(i, oqfVar3, oqfVar) < G(i, oqfVar3, oqfVar2);
        }
        return true;
    }

    public static final boolean F(int i, oqf oqfVar, oqf oqfVar2) {
        if (i == 3) {
            float f2 = oqfVar2.c;
            float f3 = oqfVar2.a;
            float f4 = oqfVar.c;
            return (f2 > f4 || f3 >= f4) && f3 > oqfVar.a;
        }
        if (i == 4) {
            float f5 = oqfVar2.a;
            float f6 = oqfVar2.c;
            float f7 = oqfVar.a;
            return (f5 < f7 || f6 <= f7) && f6 < oqfVar.c;
        }
        if (i == 5) {
            float f8 = oqfVar2.d;
            float f9 = oqfVar2.b;
            float f10 = oqfVar.d;
            return (f8 > f10 || f9 >= f10) && f9 > oqfVar.b;
        }
        if (i != 6) {
            a70.r("This function should only be used for 2-D focus search");
            return false;
        }
        float f11 = oqfVar2.b;
        float f12 = oqfVar2.d;
        float f13 = oqfVar.b;
        return (f11 < f13 || f12 <= f13) && f12 < oqfVar.d;
    }

    public static final long G(int i, oqf oqfVar, oqf oqfVar2) {
        float f2;
        float f3;
        float e2;
        float f4;
        float f5;
        if (i == 3) {
            f2 = oqfVar.a;
            f3 = oqfVar2.c;
        } else if (i == 4) {
            f2 = oqfVar2.a;
            f3 = oqfVar.c;
        } else if (i == 5) {
            f2 = oqfVar.b;
            f3 = oqfVar2.d;
        } else {
            if (i != 6) {
                a70.r("This function should only be used for 2-D focus search");
                return 0L;
            }
            f2 = oqfVar2.b;
            f3 = oqfVar.d;
        }
        float f6 = f2 - f3;
        if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = oqfVar.b;
            e2 = wt3.e(oqfVar.d, f7, 2.0f, f7);
            f4 = oqfVar2.b;
            f5 = oqfVar2.d;
        } else {
            if (i != 5 && i != 6) {
                a70.r("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = oqfVar.a;
            e2 = wt3.e(oqfVar.c, f8, 2.0f, f8);
            f4 = oqfVar2.a;
            f5 = oqfVar2.c;
        }
        long j2 = (long) (e2 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static boolean H(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final void I(String str) {
        str.getClass();
        throw new IllegalArgumentException(lnb.o("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final void J(WebView webView, boolean z) {
        if (y0l.b("MUTE_AUDIO")) {
            v0l.e(webView, z);
            return;
        }
        webView.evaluateJavascript("try{[\"audio\", \"video\"].forEach(t => document.querySelectorAll(t).forEach(e => {e.defaultMuted=" + z + ",e.muted=" + z + ";}));}catch(e){}", null);
    }

    public static ArrayList K(Object... objArr) {
        int length = objArr.length;
        yqo.w(length, "arraySize");
        ArrayList arrayList = new ArrayList(jaa.M(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static t8e L(String str) {
        int i;
        str.getClass();
        if (str.length() - 1 < 0) {
            t8e.b.getClass();
            return mm5.c;
        }
        q1f q1fVar = t8e.b;
        v8e v8eVar = new v8e(8);
        int length = str.length() - 1;
        int i2 = 0;
        int i3 = -1;
        if (length >= 0) {
            int i4 = 0;
            i = 0;
            int i5 = -1;
            while (i2 != 1000) {
                char charAt = str.charAt(i4);
                if (charAt == '&') {
                    l(v8eVar, str, i, i5, i4);
                    i = i4 + 1;
                    i2++;
                    i5 = -1;
                } else if (charAt == '=' && i5 == -1) {
                    i5 = i4;
                }
                if (i4 != length) {
                    i4++;
                } else {
                    i3 = i5;
                }
            }
            return new w8e((Map) v8eVar.b);
        }
        i = 0;
        if (i2 != 1000) {
            l(v8eVar, str, i, i3, str.length());
        }
        return new w8e((Map) v8eVar.b);
    }

    public static final Object M(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static List O(List list) {
        return list instanceof hv9 ? ((hv9) list).C() : list instanceof ydb ? ((ydb) list).a : list instanceof RandomAccess ? new wdb(list) : new ydb(list);
    }

    public static final boolean P(int i, x40 x40Var, ne8 ne8Var, oqf oqfVar) {
        ne8 s;
        i1d i1dVar = new i1d(new ne8[16], 0);
        if (!ne8Var.a.n) {
            r3a.b("visitChildren called on an unattached node");
        }
        i1d i1dVar2 = new i1d(new wtc[16], 0);
        wtc wtcVar = ne8Var.a;
        wtc wtcVar2 = wtcVar.f;
        if (wtcVar2 == null) {
            c6o.x(i1dVar2, wtcVar);
        } else {
            i1dVar2.b(wtcVar2);
        }
        while (true) {
            int i2 = i1dVar2.c;
            if (i2 == 0) {
                break;
            }
            wtc wtcVar3 = (wtc) i1dVar2.r(i2 - 1);
            if ((wtcVar3.d & 1024) == 0) {
                c6o.x(i1dVar2, wtcVar3);
            } else {
                while (true) {
                    if (wtcVar3 == null) {
                        break;
                    }
                    if ((wtcVar3.c & 1024) != 0) {
                        i1d i1dVar3 = null;
                        while (wtcVar3 != null) {
                            if (wtcVar3 instanceof ne8) {
                                ne8 ne8Var2 = (ne8) wtcVar3;
                                if (ne8Var2.n) {
                                    i1dVar.b(ne8Var2);
                                }
                            } else if ((wtcVar3.c & 1024) != 0 && (wtcVar3 instanceof bw4)) {
                                int i3 = 0;
                                for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                    if ((wtcVar4.c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            wtcVar3 = wtcVar4;
                                        } else {
                                            if (i1dVar3 == null) {
                                                i1dVar3 = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar3 != null) {
                                                i1dVar3.b(wtcVar3);
                                                wtcVar3 = null;
                                            }
                                            i1dVar3.b(wtcVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            wtcVar3 = c6o.X(i1dVar3);
                        }
                    } else {
                        wtcVar3 = wtcVar3.f;
                    }
                }
            }
        }
        while (i1dVar.c != 0 && (s = s(i1dVar, oqfVar, i)) != null) {
            if (s.m1().a) {
                return ((Boolean) x40Var.invoke(s)).booleanValue();
            }
            if (u(i, x40Var, s, oqfVar)) {
                return true;
            }
            i1dVar.q(s);
        }
        return false;
    }

    public static void Q(Context context) {
        context.getClass();
        ia0 ia0Var = ia0.q;
        UserAccount e2 = ok3.p().e();
        if (ke0.h && e2.getIsLoggedIn()) {
            ktd A = mha.A(new ktd(SyncWorker.class));
            mha.y(A);
            vxd.h(context).b("SyncWorker-".concat(""), nf6.a, (ltd) A.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lrj R(Tournament tournament, Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Season season, int i) {
        String w;
        String groundType;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        if ((i & 32) != 0) {
            z5 = false;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if ((i & 64) != 0) {
            season = null;
        }
        tournament.getClass();
        context.getClass();
        lrj lrjVar = new lrj(tournament);
        ia0 ia0Var = ia0.q;
        Set e2 = ok3.p().h().e();
        UniqueTournament uniqueTournament = tournament.getUniqueTournament();
        if (uniqueTournament != null) {
            Set set = e2;
            UniqueTournament uniqueTournament2 = tournament.getUniqueTournament();
            uniqueTournament.setFavorite(CollectionsKt.R(set, uniqueTournament2 != null ? Integer.valueOf(uniqueTournament2.getId()) : null));
        }
        lrjVar.b = z;
        lrjVar.h = z2;
        int i2 = 6;
        if (z3) {
            lrjVar.c = new jfj(i2, wyh.c(context, tournament.getCategory().getSport().getSlug()), (Integer) (objArr7 == true ? 1 : 0));
        }
        if (z5) {
            UniqueTournament uniqueTournament3 = tournament.getUniqueTournament();
            w = uniqueTournament3 != null ? tba.x(uniqueTournament3) : null;
        } else {
            w = tba.w(tournament);
        }
        lrjVar.d = new jfj(i2, w, (Integer) (objArr6 == true ? 1 : 0));
        UniqueTournament uniqueTournament4 = tournament.getUniqueTournament();
        String x = (uniqueTournament4 == null || (groundType = uniqueTournament4.getGroundType()) == null) ? null : d2a.x(context, groundType, false);
        if (x != null) {
            lrjVar.e = new jfj(i2, o3a.u(context, tournament), (Integer) (objArr5 == true ? 1 : 0));
            lrjVar.f = new jfj(i2, x, (Integer) (objArr4 == true ? 1 : 0));
            UniqueTournament uniqueTournament5 = tournament.getUniqueTournament();
            lrjVar.j = uniqueTournament5 != null ? uniqueTournament5.getGroundType() : null;
            return lrjVar;
        }
        if (z4 && Intrinsics.c(tournament.getCategory().getSport().getSlug(), Sports.BASEBALL) && season != null) {
            lrjVar.e = new jfj(i2, season.getYear(), (Integer) (objArr3 == true ? 1 : 0));
            return lrjVar;
        }
        if (!Intrinsics.c(tournament.getCategory().getSport().getSlug(), Sports.MMA)) {
            lrjVar.e = new jfj(i2, o3a.u(context, tournament), (Integer) (objArr == true ? 1 : 0));
            return lrjVar;
        }
        UniqueTournament uniqueTournament6 = tournament.getUniqueTournament();
        lrjVar.e = new jfj(i2, uniqueTournament6 != null ? tba.x(uniqueTournament6) : null, (Integer) (objArr2 == true ? 1 : 0));
        return lrjVar;
    }

    public static AbstractList S(List list, xs8 xs8Var) {
        return list instanceof RandomAccess ? new aeb(list, xs8Var) : new beb(list, xs8Var);
    }

    public static final int T(int i, int i2, String str) {
        while (i2 > i && CharsKt.b(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static final int U(int i, int i2, String str) {
        while (i < i2 && CharsKt.b(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static final Boolean V(int i, x40 x40Var, ne8 ne8Var, oqf oqfVar) {
        int ordinal = ne8Var.p1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ne8 V = l98.V(ne8Var);
                if (V == null) {
                    a70.r("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = V.p1().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean V2 = V(i, x40Var, V, oqfVar);
                        if (!Intrinsics.c(V2, Boolean.FALSE)) {
                            return V2;
                        }
                        if (oqfVar == null) {
                            if (V.p1() != ie8.b) {
                                a70.r("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            ne8 R = l98.R(V);
                            if (R == null) {
                                a70.r("ActiveParent must have a focusedChild");
                                return null;
                            }
                            oqfVar = l98.S(R);
                        }
                        return Boolean.valueOf(u(i, x40Var, ne8Var, oqfVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            zzl.b();
                            return null;
                        }
                        a70.r("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (oqfVar == null) {
                    oqfVar = l98.S(V);
                }
                return Boolean.valueOf(u(i, x40Var, ne8Var, oqfVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return ne8Var.m1().a ? (Boolean) x40Var.invoke(ne8Var) : oqfVar == null ? Boolean.valueOf(t(ne8Var, i, x40Var)) : Boolean.valueOf(P(i, x40Var, ne8Var, oqfVar));
                }
                zzl.b();
                return null;
            }
        }
        return Boolean.valueOf(t(ne8Var, i, x40Var));
    }

    public static final wak W(UniqueTournamentSeasons uniqueTournamentSeasons) {
        uniqueTournamentSeasons.getClass();
        int id = uniqueTournamentSeasons.getUniqueTournament().getId();
        String x = tba.x(uniqueTournamentSeasons.getUniqueTournament());
        xbb b2 = kotlin.collections.a.b();
        b2.addAll(uniqueTournamentSeasons.getSeasons());
        Integer allTimeSeasonId = uniqueTournamentSeasons.getAllTimeSeasonId();
        if (allTimeSeasonId != null) {
            b2.add(new Season(allTimeSeasonId.intValue(), "", Season.YEAR_ALL_TIME));
        }
        Unit unit = Unit.a;
        return new wak(id, x, kotlin.collections.a.a(b2));
    }

    public static final void a(q1h q1hVar, boolean z, y1h y1hVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1212897115);
        int i3 = i & 6;
        n12 n12Var = n12.a;
        if (i3 == 0) {
            i2 = (av8Var2.g(n12Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(q1hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.h(true) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.g(y1hVar) ? 16384 : 8192;
        }
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            mv1 mv1Var = uxf.g;
            utc utcVar = utc.a;
            xtc a2 = n12Var.a(utcVar, mv1Var);
            l8g a3 = k8g.a(ww9.f, uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, a2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            q1hVar.b.invoke(bkh.l(utcVar, 24.0f), av8Var2, 6);
            nq8.h(av8Var2, bkh.p(utcVar, 6.0f));
            String str = q1hVar.d;
            yf8 yf8Var = xth.a;
            udj.c(str, null, y1hVar.a(z, true, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 0, 0, 131066);
            av8Var = av8Var2;
            nq8.h(av8Var, bkh.p(utcVar, 6.0f));
            q1hVar.c.invoke(bkh.l(utcVar, 24.0f), av8Var, 6);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(q1hVar, z, y1hVar, i, 12);
        }
    }

    public static final void b(String str, String str2, xtc xtcVar, of3 of3Var, int i) {
        q80 q80Var;
        e1d e1dVar;
        boolean z;
        Object obj;
        e1d e1dVar2;
        e1d e1dVar3;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1082956971);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (z2 || O == obj2) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar4 = (e1d) O;
            boolean z3 = i4 == 4;
            Object O2 = av8Var.O();
            if (z3 || O2 == obj2) {
                O2 = e.f(null);
                av8Var.n0(O2);
            }
            e1d e1dVar5 = (e1d) O2;
            boolean z4 = i4 == 4;
            Object O3 = av8Var.O();
            if (z4 || O3 == obj2) {
                O3 = e.f(Boolean.FALSE);
                av8Var.n0(O3);
            }
            e1d e1dVar6 = (e1d) O3;
            long D = lz.D(R.color.primary_default, av8Var);
            int i5 = i2 & 112;
            boolean h = (i5 == 32) | (i4 == 4) | av8Var.h(((Boolean) e1dVar4.getValue()).booleanValue()) | av8Var.g((Integer) e1dVar5.getValue());
            Object O4 = av8Var.O();
            if (h || O4 == obj2) {
                if (((Boolean) e1dVar4.getValue()).booleanValue()) {
                    q80Var = new q80(str);
                } else if (((Integer) e1dVar5.getValue()) != null) {
                    o80 o80Var = new o80();
                    Integer num = (Integer) e1dVar5.getValue();
                    o80Var.d(StringsKt.l0(str.substring(0, num != null ? num.intValue() : 0)).toString());
                    o80Var.d("… ");
                    int g2 = o80Var.g(new pwh(D, 0L, wg8.i, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65530));
                    try {
                        o80Var.d(str2);
                        Unit unit = Unit.a;
                        o80Var.f(g2);
                        q80Var = o80Var.h();
                    } catch (Throwable th) {
                        o80Var.f(g2);
                        throw th;
                    }
                } else {
                    q80Var = new q80(str);
                }
                O4 = q80Var;
                av8Var.n0(O4);
            }
            q80 q80Var2 = (q80) O4;
            av8Var.d0(-1339530845);
            if (!((Boolean) e1dVar6.getValue()).booleanValue() || ((Boolean) e1dVar4.getValue()).booleanValue()) {
                e1dVar = e1dVar4;
                z = false;
                obj = obj2;
                e1dVar2 = e1dVar5;
                e1dVar3 = e1dVar6;
                xtcVar2 = xtcVar;
            } else {
                boolean g3 = av8Var.g(e1dVar4);
                Object O5 = av8Var.O();
                if (g3 || O5 == obj2) {
                    O5 = new gfl(i3, e1dVar4);
                    av8Var.n0(O5);
                }
                e1dVar3 = e1dVar6;
                e1dVar = e1dVar4;
                e1dVar2 = e1dVar5;
                z = false;
                obj = obj2;
                xtcVar2 = xtcVar.z(tol.y(utc.a, false, false, false, 0L, null, (Function0) O5, av8Var, 31));
            }
            av8Var.s(z);
            int i6 = ((Boolean) e1dVar.getValue()).booleanValue() ? Integer.MAX_VALUE : 2;
            yf8 yf8Var = xth.a;
            dfj f2 = xth.f();
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            e1d e1dVar7 = e1dVar;
            boolean g4 = av8Var.g(e1dVar7) | av8Var.g(e1dVar3) | av8Var.g(e1dVar2) | (i5 == 32 ? true : z);
            Object O6 = av8Var.O();
            if (g4 || O6 == obj) {
                lwc lwcVar = new lwc(str2, e1dVar7, e1dVar3, e1dVar2, 15);
                av8Var.n0(lwcVar);
                O6 = lwcVar;
            }
            udj.d(q80Var2, xtcVar2, D2, null, 0L, 0L, null, 0L, 2, false, i6, 0, null, (Function1) O6, f2, av8Var, 0, 384, 110584);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cv3(str, str2, xtcVar, i, 6);
        }
    }

    public static final void c(r1h r1hVar, boolean z, y1h y1hVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1074332825);
        int i3 = i & 6;
        n12 n12Var = n12.a;
        if (i3 == 0) {
            i2 = (av8Var.g(n12Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(r1hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(y1hVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            r1hVar.b.invoke(n12Var.a(bkh.l(utc.a, 24.0f), uxf.g), new r13(y1hVar.a(z, true, av8Var)), av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(r1hVar, z, y1hVar, i, 13);
        }
    }

    public static boolean c0(byte b2) {
        return b2 > -65;
    }

    public static final void d(WorldCupLastDanceUiModel worldCupLastDanceUiModel, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1004328665);
        int i2 = i | (av8Var.g(worldCupLastDanceUiModel) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc A = wnn.A(utcVar, a2);
            long D = lz.D(R.color.surface_1, av8Var);
            jf9 jf9Var = oyn.e;
            xtc O = kda.O(n9e.q(A, D, jf9Var), "wc26_the_last_dance_card", av8Var);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, O);
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
            xtc q = n9e.q(qx9.p(bkh.d(utcVar, 1.0f), 0.8f), lz.D(R.color.n_lv_4, av8Var), jf9Var);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            a99 a99Var = nf3.a;
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = wzj.m;
                av8Var.n0(O3);
            }
            haa.b(worldCupLastDanceUiModel.c, null, tol.y(q, true, true, true, D2, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), function1, worldCupLastDanceUiModel, 13), av8Var, 0), wv8.c(lz.D(R.color.n_lv_3, av8Var), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 12), wv8.c(lz.D(R.color.n_lv_3, av8Var), 5, haa.t(R.drawable.sofascore_lockup, 0, av8Var), 12), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 36912, 6, 31712);
            xtc f0 = l98.f0(utcVar, 16.0f, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            String str = worldCupLastDanceUiModel.d;
            yf8 yf8Var = xth.a;
            udj.c(str, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            b(worldCupLastDanceUiModel.e, oea.v(R.string.show_more, av8Var), l98.e0(utcVar, 16.0f, 4.0f, 16.0f, 16.0f), av8Var, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(worldCupLastDanceUiModel, function1, xtcVar2, i, 25);
        }
    }

    public static final void e(t1h t1hVar, boolean z, Function0 function0, xtc xtcVar, y1h y1hVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        xtc xtcVar2;
        utc utcVar;
        int i3;
        boolean z2;
        float f2;
        boolean z3 = z;
        t1hVar.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1708603203);
        int i4 = i & 6;
        p8g p8gVar = p8g.a;
        if (i4 == 0) {
            i2 = (av8Var2.g(p8gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(t1hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.h(z3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.i(function0) ? 2048 : 1024;
        }
        int i5 = i2 | 24576;
        if ((196608 & i) == 0) {
            i5 |= av8Var2.g(y1hVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var2.T(i5 & 1, (74899 & i5) != 74898)) {
            int i6 = i5 & 112;
            boolean z4 = i6 == 32;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z4 || O == a99Var) {
                O = new p75(t1hVar instanceof s1h ? 6.0f : 2.0f);
                av8Var2.n0(O);
            }
            float f3 = ((p75) O).a;
            av8Var2.d0(-1290155491);
            utc utcVar2 = utc.a;
            xtc A = wnn.A(l98.d0(utcVar2, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f));
            if (t1hVar.isEnabled()) {
                boolean z5 = (i5 & 7168) == 2048;
                Object O2 = av8Var2.O();
                if (z5 || O2 == a99Var) {
                    O2 = new rsd(10, function0);
                    av8Var2.n0(O2);
                }
                i3 = i6;
                f2 = f3;
                z2 = false;
                xtc y = tol.y(utcVar2, false, false, false, 0L, null, (Function0) O2, av8Var2, 31);
                utcVar = utcVar2;
                av8Var = av8Var2;
                A = A.z(y);
            } else {
                utcVar = utcVar2;
                i3 = i6;
                z2 = false;
                av8Var = av8Var2;
                f2 = f3;
            }
            av8Var.s(z2);
            xtc c0 = l98.c0(bkh.c(p8gVar.a(1.0f, A, true), 1.0f), 8.0f, f2);
            k1c c2 = e12.c(uxf.c, z2);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (t1hVar instanceof s1h) {
                av8Var.d0(2071602292);
                s1h s1hVar = (s1h) t1hVar;
                h(s1hVar.b, z, s1hVar.c, y1hVar, av8Var, 6 | (i5 & 896) | ((i5 >> 3) & 57344));
                z3 = z;
                av8Var.s(z2);
            } else if (t1hVar instanceof r1h) {
                av8Var.d0(2071609313);
                c((r1h) t1hVar, z3, y1hVar, av8Var, ((i5 >> 6) & 7168) | 6 | i3 | (i5 & 896));
                av8Var.s(z2);
            } else {
                if (!(t1hVar instanceof q1h)) {
                    throw dmi.h(av8Var, 2071600968, z2);
                }
                av8Var.d0(2071615094);
                a((q1h) t1hVar, z3, y1hVar, av8Var, ((i5 >> 3) & 57344) | 6 | i3 | (i5 & 896));
                av8Var.s(z2);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ki4(t1hVar, z3, function0, xtcVar2, y1hVar, i);
        }
    }

    public static final void f(f6i f6iVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(820755391);
        int i2 = (av8Var.i(f6iVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            xhf J = x2a.J(av8Var);
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            c6i c6iVar = f6iVar.c;
            boolean g2 = av8Var.g(a2);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (g2 || O == obj) {
                O = new ck1(15, null, a2);
                av8Var.n0(O);
            }
            hz8.o(av8Var, c6iVar, (Function2) O);
            xtc d2 = bkh.d(utc.a, 1.0f);
            boolean z = true;
            boolean z2 = f6iVar.a;
            if ((i2 & 112) != 32) {
                z = false;
            }
            Object O2 = av8Var.O();
            if (z || O2 == obj) {
                O2 = new vbc(21, function1);
                av8Var.n0(O2);
            }
            x2a.h(z2, (Function0) O2, d2, J, null, yqo.H(-909253672, av8Var, new e6i(i3, f6iVar, J)), yqo.H(-1793989479, av8Var, new er6(f6iVar, function1, a2, context, 24)), av8Var, 1769856);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(f6iVar, function1, i, 10);
        }
    }

    public static final void g(j6i j6iVar, of3 of3Var, int i) {
        j6iVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-387930289);
        int i2 = (av8Var.i(j6iVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            f6i k = j6iVar.k();
            boolean i3 = av8Var.i(j6iVar);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new g2i(j6iVar, 6);
                av8Var.n0(O);
            }
            f(k, (Function1) O, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fvg(j6iVar, i, 28);
        }
    }

    public static final void h(String str, boolean z, boolean z2, y1h y1hVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        List split$default;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-926654335);
        int i3 = i & 6;
        n12 n12Var = n12.a;
        if (i3 == 0) {
            i2 = (av8Var2.g(n12Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.h(z2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.g(y1hVar) ? 16384 : 8192;
        }
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = (i2 & 112) == 32;
            Object O = av8Var2.O();
            if (z3 || O == nf3.a) {
                split$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
                O = Integer.valueOf(split$default.size());
                av8Var2.n0(O);
            }
            int intValue = ((Number) O).intValue();
            xtc a2 = n12Var.a(utc.a, uxf.g);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(upperCase, a2, y1hVar.a(z, z2, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, intValue == 1 ? 1 : 2, 0, null, (dfj) xth.r.getValue(), av8Var, 0, 384, 109560);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bl1(str, z, z2, y1hVar, i, 7);
        }
    }

    public static final void i(int i, jrj jrjVar, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        utc utcVar;
        boolean z;
        jrjVar.getClass();
        boolean z2 = jrjVar.c;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1512439064);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.g(jrjVar) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            av8Var.d0(1755005454);
            utc utcVar2 = utc.a;
            xtc A = wnn.A(l98.c0(bkh.d(utcVar2, 1.0f), 8.0f, 4.0f), o7g.a(8.0f));
            if (z2) {
                A = A.z(n9e.q(utcVar2, lz.D(R.color.surface_2, av8Var), oyn.e));
            }
            av8Var.s(false);
            if (jrjVar.a != 2521944) {
                utcVar = utcVar2;
                z = true;
            } else {
                utcVar = utcVar2;
                z = false;
            }
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
                O2 = o67.D;
                av8Var.n0(O2);
            }
            boh bohVar = (boh) o3a.N(objArr, (Function0) O2, av8Var, 48);
            utc utcVar3 = utcVar;
            xtc c0 = l98.c0(tol.y(A, z, true, true, D, wzcVar, new gi(15, bohVar, context, jrjVar), av8Var, 0), 8.0f, 4.0f);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String e2 = yid.e(3, null, Integer.valueOf(i));
            yf8 yf8Var = xth.a;
            utc utcVar4 = utcVar3;
            q5a.w(e2, bkh.p(utcVar3, 16.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.e(), av8Var, 48, 0, 131064);
            nq8.h(av8Var, bkh.p(utcVar4, 4.0f));
            td4.C(jrjVar.a, bkh.l(utcVar4, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            udj.c(jrjVar.b, l98.d0(new goa(1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
            av8 av8Var2 = av8Var;
            if (z2) {
                av8Var2.d0(-2018110948);
                udj.c(oea.v(R.string.my_pick, av8Var2), l98.d0(n9e.q(utcVar4, lz.D(R.color.primary_highlight, av8Var2), o7g.a(12.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.primary_default, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131064);
                av8Var2 = av8Var2;
                bf3.u(utcVar4, 6.0f, av8Var2, false);
            } else {
                av8Var2.d0(-2017693874);
                av8Var2.s(false);
            }
            av8 av8Var3 = av8Var2;
            udj.c(yid.q(jrjVar.d, 1), null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var3, 0, 0, 131066);
            av8Var = av8Var3;
            av8Var.s(true);
            xtcVar2 = utcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(i, jrjVar, xtcVar2, i2);
        }
    }

    public static final void j(int i, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1) {
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-487337548);
        int i2 = i | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc f0 = l98.f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            ng0 ng0Var = new ng0(12.0f, true, new a70(6));
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 6);
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
            boolean z = (i2 & 14) == 4;
            Object O = av8Var.O();
            int i3 = 3;
            Object obj = nf3.a;
            if (z || O == obj) {
                O = new b61(i3, gv9Var);
                av8Var.n0(O);
            }
            pr4 b2 = c6e.b(0, (Function0) O, av8Var, 0, 3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
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
            goa g2 = ljg.g(av8Var, C2, f50Var3, 1.0f, true);
            u23 a4 = t23.a(ww9.d, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, g2);
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
            String v = oea.v(R.string.fifa_wc_2026_end_of_an_era, av8Var);
            yf8 yf8Var = xth.a;
            int i4 = 1;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            udj.c(oea.v(R.string.fifa_wc_2026_end_of_an_era_body, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var.s(true);
            xtc O2 = kda.O(bkh.l(utcVar, 32.0f), "wc26_the_last_dance_share", av8Var);
            boolean g3 = av8Var.g(b2) | ((i2 & 112) == 32);
            Object O3 = av8Var.O();
            if (g3 || O3 == obj) {
                O3 = new fej(28, function1, b2);
                av8Var.n0(O3);
            }
            ao2.g((Function0) O3, O2, false, null, null, yqo.d, av8Var, 1572864, 60);
            av8Var.s(true);
            f6a.a(b2, bkh.d(utcVar, 1.0f), n9e.t(b2, 8.0f), null, 0, 8.0f, uxf.l, null, false, null, null, null, yqo.H(1553421867, av8Var, new c4j(gv9Var, function1, i4)), av8Var, 1769520, 24576, 16280);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tr6(gv9Var, function1, xtcVar, i, 5);
        }
    }

    public static Iterator k(Parcel parcel, Map map) {
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static final void l(v8e v8eVar, String str, int i, int i2, int i3) {
        if (i2 == -1) {
            int U = U(i, i3, str);
            int T = T(U, i3, str);
            if (T > U) {
                v8eVar.r(str.substring(U, T), km5.a);
                return;
            }
            return;
        }
        int U2 = U(i, i2, str);
        int T2 = T(U2, i2, str);
        if (T2 > U2) {
            String substring = str.substring(U2, T2);
            int U3 = U(i2 + 1, i3, str);
            v8eVar.i(substring, str.substring(U3, T(U3, i3, str)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.a70.r("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.a70.r("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m(oqf oqfVar, oqf oqfVar2, oqf oqfVar3, int i) {
        boolean n = n(i, oqfVar3, oqfVar);
        float f2 = oqfVar3.b;
        float f3 = oqfVar3.d;
        float f4 = oqfVar3.a;
        float f5 = oqfVar3.c;
        float f6 = oqfVar.d;
        float f7 = oqfVar.b;
        float f8 = oqfVar.c;
        float f9 = oqfVar.a;
        if (!n && n(i, oqfVar2, oqfVar)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            a70.r("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean n(int i, oqf oqfVar, oqf oqfVar2) {
        if (i == 3 || i == 4) {
            return oqfVar.d > oqfVar2.b && oqfVar.b < oqfVar2.d;
        }
        if (i == 5 || i == 6) {
            return oqfVar.c > oqfVar2.a && oqfVar.a < oqfVar2.c;
        }
        a70.r("This function should only be used for 2-D focus search");
        return false;
    }

    public static boolean o(Context context) {
        Object u2gVar;
        context.getClass();
        Calendar calendar = ke0.a;
        Integer a2 = ke0.a(context, true);
        String d2 = dv3.d(a2);
        if (a2 != null && a2.intValue() == 0) {
            return true;
        }
        yea yeaVar = j58.a;
        e58 f2 = e58.f();
        f2.getClass();
        String g2 = f2.g("vpn_countries");
        Object obj = null;
        if (g2.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(new xg0(uhi.a, 0)), g2);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a3 = w2g.a(u2gVar);
            if (a3 != null) {
                s38.a().c(a3);
            }
            if (!(u2gVar instanceof u2g)) {
                obj = u2gVar;
            }
        }
        Iterable iterable = (List) obj;
        if (iterable == null) {
            iterable = km5.a;
        }
        return CollectionsKt.R(iterable, d2);
    }

    public static final WebResourceResponse p(WebView webView, String str) {
        webView.getClass();
        Object tag = webView.getTag(R.id.controller);
        xdi xdiVar = tag instanceof xdi ? (xdi) tag : null;
        if (xdiVar != null) {
            if (!StringsKt.J(str, "mraid.js", true)) {
                xdiVar = null;
            }
            if (xdiVar != null) {
                InputStream open = webView.getResources().getAssets().open("nimbus_mraid.js", 2);
                Host n = xdiVar.n();
                boolean z = xdiVar.i;
                n.getClass();
                StringBuilder sb = new StringBuilder("window.MRAID_ENV=window.top.MRAID_ENV;mraid.b=window.top.Adsbynimbus;");
                sb.append("Object.assign(mraid.h," + t33.a.c(Host.Companion.serializer(), n) + ");");
                if (!z) {
                    sb.append("mraid.b.postMessage('ready');");
                }
                String sb2 = sb.toString();
                Charset charset = Charsets.UTF_8;
                byte[] bytes = sb2.getBytes(charset);
                bytes.getClass();
                return new WebResourceResponse("text/javascript", charset.name(), new SequenceInputStream(open, new ByteArrayInputStream(bytes)));
            }
        }
        return null;
    }

    public static void q(Object obj) {
        if (obj != null) {
            return;
        }
        yhk.s("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final void r(ne8 ne8Var, i1d i1dVar) {
        if (!ne8Var.a.n) {
            r3a.b("visitChildren called on an unattached node");
        }
        i1d i1dVar2 = new i1d(new wtc[16], 0);
        wtc wtcVar = ne8Var.a;
        wtc wtcVar2 = wtcVar.f;
        if (wtcVar2 == null) {
            c6o.x(i1dVar2, wtcVar);
        } else {
            i1dVar2.b(wtcVar2);
        }
        while (true) {
            int i = i1dVar2.c;
            if (i == 0) {
                return;
            }
            wtc wtcVar3 = (wtc) i1dVar2.r(i - 1);
            if ((wtcVar3.d & 1024) == 0) {
                c6o.x(i1dVar2, wtcVar3);
            } else {
                while (true) {
                    if (wtcVar3 == null) {
                        break;
                    }
                    if ((wtcVar3.c & 1024) != 0) {
                        i1d i1dVar3 = null;
                        while (wtcVar3 != null) {
                            if (wtcVar3 instanceof ne8) {
                                ne8 ne8Var2 = (ne8) wtcVar3;
                                if (ne8Var2.n && !c6o.c0(ne8Var2).Q) {
                                    if (ne8Var2.m1().a) {
                                        i1dVar.b(ne8Var2);
                                    } else {
                                        r(ne8Var2, i1dVar);
                                    }
                                }
                            } else if ((wtcVar3.c & 1024) != 0 && (wtcVar3 instanceof bw4)) {
                                int i2 = 0;
                                for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                    if ((wtcVar4.c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            wtcVar3 = wtcVar4;
                                        } else {
                                            if (i1dVar3 == null) {
                                                i1dVar3 = new i1d(new wtc[16], 0);
                                            }
                                            if (wtcVar3 != null) {
                                                i1dVar3.b(wtcVar3);
                                                wtcVar3 = null;
                                            }
                                            i1dVar3.b(wtcVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            wtcVar3 = c6o.X(i1dVar3);
                        }
                    } else {
                        wtcVar3 = wtcVar3.f;
                    }
                }
            }
        }
    }

    public static final ne8 s(i1d i1dVar, oqf oqfVar, int i) {
        oqf j;
        ne8 ne8Var = null;
        if (i == 3) {
            j = oqfVar.j((oqfVar.c - oqfVar.a) + 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i == 4) {
            j = oqfVar.j(-((oqfVar.c - oqfVar.a) + 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i == 5) {
            j = oqfVar.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (oqfVar.d - oqfVar.b) + 1.0f);
        } else {
            if (i != 6) {
                a70.r("This function should only be used for 2-D focus search");
                return null;
            }
            j = oqfVar.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -((oqfVar.d - oqfVar.b) + 1.0f));
        }
        Object[] objArr = i1dVar.a;
        int i2 = i1dVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            ne8 ne8Var2 = (ne8) objArr[i3];
            if (l98.Y(ne8Var2)) {
                oqf S = l98.S(ne8Var2);
                if (E(S, j, oqfVar, i)) {
                    ne8Var = ne8Var2;
                    j = S;
                }
            }
        }
        return ne8Var;
    }

    public static final boolean t(ne8 ne8Var, int i, Function1 function1) {
        oqf oqfVar;
        i1d i1dVar = new i1d(new ne8[16], 0);
        r(ne8Var, i1dVar);
        int i2 = i1dVar.c;
        if (i2 <= 1) {
            ne8 ne8Var2 = (ne8) (i2 == 0 ? null : i1dVar.a[0]);
            if (ne8Var2 != null) {
                return ((Boolean) function1.invoke(ne8Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                oqf S = l98.S(ne8Var);
                float f2 = S.a;
                float f3 = S.b;
                oqfVar = new oqf(f2, f3, f2, f3);
            } else {
                if (i != 3 && i != 5) {
                    a70.r("This function should only be used for 2-D focus search");
                    return false;
                }
                oqf S2 = l98.S(ne8Var);
                float f4 = S2.c;
                float f5 = S2.d;
                oqfVar = new oqf(f4, f5, f4, f5);
            }
            ne8 s = s(i1dVar, oqfVar, i);
            if (s != null) {
                return ((Boolean) function1.invoke(s)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean u(int i, x40 x40Var, ne8 ne8Var, oqf oqfVar) {
        if (P(i, x40Var, ne8Var, oqfVar)) {
            return true;
        }
        Boolean bool = (Boolean) wkn.M(ne8Var, i, new itd(((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).g(), ne8Var, oqfVar, i, x40Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final float v(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static ColorStateList w(Context context, l2a l2aVar, int i) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) l2aVar.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q = eq3.q(resourceId, context)) == null) ? l2aVar.m(i) : q;
    }

    public static ColorStateList x(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList q;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q = eq3.q(resourceId, context)) == null) ? typedArray.getColorStateList(i) : q;
    }

    public static int y(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable z(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable d0;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d0 = td4.d0(resourceId, context)) == null) ? typedArray.getDrawable(i) : d0;
    }

    public abstract void N();

    public abstract void X(flo floVar, Thread thread);

    public abstract void Y(flo floVar, flo floVar2);

    public abstract boolean Z(glo gloVar, flo floVar, flo floVar2);

    public abstract boolean a0(zzhbr zzhbrVar, zko zkoVar, zko zkoVar2);

    public abstract flo b0(zzhbr zzhbrVar);

    public abstract zko d0(zzhbr zzhbrVar);

    public abstract boolean e0(glo gloVar, Object obj, Object obj2);
}
