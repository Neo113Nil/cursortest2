package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.EdgeEffect;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.mvvm.model.Event;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class oyn {
    public static final tc3 a = new tc3(-971850561, new hd3(0, 1), false);
    public static final tc3 b = new tc3(-449967121, new ud3(17), false);
    public static final int[] c = {R.attr.theme, com.sofascore.results.R.attr.theme};
    public static final int[] d = {com.sofascore.results.R.attr.materialThemeOverlay};
    public static final jf9 e = new jf9(2);
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:42|43))(2:44|45)|13|14|(4:19|20|(6:22|23|(1:27)(1:25)|13|14|(2:16|17)(0))|30)(0))(7:46|47|23|(0)(0)|13|14|(0)(0)))(3:48|14|(0)(0))))|50|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (kotlin.Unit.a == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        r0.r = r2;
        r0.s = r10;
        r0.t = r9;
        r0.v = 3;
        r11 = r2.k1(new defpackage.mw2(r5, r3, r6), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        if (r11 != defpackage.lu3.a) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (kotlin.Unit.a == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0047, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004a, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[Catch: CancellationException -> 0x004a, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x004a, blocks: (B:23:0x0079, B:27:0x0095, B:45:0x0044, B:47:0x0054), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [fdl] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [qze] */
    /* JADX WARN: Type inference failed for: r2v14, types: [qze] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [qze] */
    /* JADX WARN: Type inference failed for: r2v3, types: [qze] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [qze] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v13, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(qze qzeVar, fdl fdlVar, sq3 sq3Var) {
        cm8 cm8Var;
        ooi ooiVar;
        Object k1;
        CoroutineContext coroutineContext;
        qze qzeVar2;
        if (sq3Var instanceof cm8) {
            cm8Var = (cm8) sq3Var;
            int i = cm8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                cm8Var.v = i - Integer.MIN_VALUE;
                Object obj = cm8Var.u;
                lu3 lu3Var = lu3.a;
                ooiVar = cm8Var.v;
                rq3 rq3Var = null;
                int i2 = 2;
                int i3 = 1;
                if (ooiVar != 0) {
                    y6a.M(obj);
                    coroutineContext = cm8Var.getContext();
                    qzeVar2 = qzeVar;
                    fdlVar = fdlVar;
                    if (!bea.B(coroutineContext)) {
                    }
                } else if (ooiVar != 1) {
                    if (ooiVar == 2) {
                        qzeVar = cm8Var.t;
                        fdlVar = cm8Var.s;
                        ooiVar = cm8Var.r;
                        y6a.M(obj);
                    } else {
                        if (ooiVar != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qzeVar = cm8Var.t;
                        fdlVar = cm8Var.s;
                        ooiVar = cm8Var.r;
                        y6a.M(obj);
                    }
                    coroutineContext = qzeVar;
                    qzeVar2 = ooiVar;
                    fdlVar = fdlVar;
                    if (!bea.B(coroutineContext)) {
                        try {
                        } catch (CancellationException e2) {
                            ooiVar = qzeVar2;
                            qzeVar = coroutineContext;
                            e = e2;
                            if (!bea.B(qzeVar)) {
                            }
                        }
                        cm8Var.r = qzeVar2;
                        cm8Var.s = fdlVar;
                        cm8Var.t = coroutineContext;
                        cm8Var.v = 1;
                        if (fdlVar.invoke(qzeVar2, cm8Var) != lu3Var) {
                            ooiVar = qzeVar2;
                            qzeVar = coroutineContext;
                            fdlVar = fdlVar;
                            cm8Var.r = ooiVar;
                            cm8Var.s = fdlVar;
                            cm8Var.t = qzeVar;
                            cm8Var.v = 2;
                            k1 = ooiVar.k1(new mw2(i2, rq3Var, i3), cm8Var);
                            if (k1 != lu3.a) {
                            }
                            coroutineContext = qzeVar;
                            qzeVar2 = ooiVar;
                            fdlVar = fdlVar;
                            if (!bea.B(coroutineContext)) {
                                return Unit.a;
                            }
                        }
                        return lu3Var;
                    }
                } else {
                    CoroutineContext coroutineContext2 = cm8Var.t;
                    Function2 function2 = cm8Var.s;
                    qze qzeVar3 = cm8Var.r;
                    y6a.M(obj);
                    ooiVar = qzeVar3;
                    qzeVar = coroutineContext2;
                    fdlVar = function2;
                    cm8Var.r = ooiVar;
                    cm8Var.s = fdlVar;
                    cm8Var.t = qzeVar;
                    cm8Var.v = 2;
                    k1 = ooiVar.k1(new mw2(i2, rq3Var, i3), cm8Var);
                    if (k1 != lu3.a) {
                    }
                    coroutineContext = qzeVar;
                    qzeVar2 = ooiVar;
                    fdlVar = fdlVar;
                    if (!bea.B(coroutineContext)) {
                    }
                }
            }
        }
        cm8Var = new cm8(sq3Var);
        Object obj2 = cm8Var.u;
        lu3 lu3Var2 = lu3.a;
        ooiVar = cm8Var.v;
        rq3 rq3Var2 = null;
        int i22 = 2;
        int i32 = 1;
        if (ooiVar != 0) {
        }
    }

    public static String B(Context context, Event event) {
        context.getClass();
        Integer aggregated = Event.getHomeScore$default(event, null, 1, null).getAggregated();
        Integer aggregated2 = Event.getAwayScore$default(event, null, 1, null).getAggregated();
        if (aggregated == null || aggregated2 == null) {
            return null;
        }
        int intValue = aggregated2.intValue();
        int intValue2 = aggregated.intValue();
        boolean c0 = hkg.c0(context);
        Integer valueOf = Integer.valueOf(c0 ? intValue : intValue2);
        if (c0) {
            intValue = intValue2;
        }
        return context.getString(com.sofascore.results.R.string.header_football_aggregates_score, valueOf, Integer.valueOf(intValue));
    }

    public static jfj C(Context context, Event event) {
        String nameCode;
        Integer valueOf = Integer.valueOf(com.sofascore.results.R.color.n_lv_3);
        context.getClass();
        event.getClass();
        Integer F = o3a.F(event.getTournament());
        if (F != null && F.intValue() == 132) {
            Integer series = Event.getHomeScore$default(event, null, 1, null).getSeries();
            Integer series2 = Event.getAwayScore$default(event, null, 1, null).getSeries();
            if (series != null && series2 != null) {
                int intValue = series2.intValue();
                int intValue2 = series.intValue();
                if (intValue2 != 0 || intValue != 0) {
                    int i = 4;
                    if (intValue2 > intValue) {
                        nameCode = Event.getHomeTeam$default(event, null, 1, null).getNameCode();
                    } else {
                        if (intValue2 >= intValue) {
                            return new jfj(i, context.getString(com.sofascore.results.R.string.result_tied_score, fc6.g(intValue2, intValue, "-")), valueOf);
                        }
                        nameCode = Event.getAwayTeam$default(event, null, 1, null).getNameCode();
                    }
                    if (nameCode == null) {
                        nameCode = "";
                    }
                    Pair pair = intValue2 > intValue ? new Pair(Integer.valueOf(intValue2), Integer.valueOf(intValue)) : new Pair(Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    int intValue3 = ((Number) pair.a).intValue();
                    return new jfj(i, context.getString(intValue3 == 4 ? com.sofascore.results.R.string.any_sport_team_won_score : com.sofascore.results.R.string.any_sport_team_leads_score, nameCode, fc6.g(intValue3, ((Number) pair.b).intValue(), "-")), valueOf);
                }
            }
        }
        return null;
    }

    public static float D(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? kg5.b(edgeEffect) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static za9 E(Fragment fragment, qtk qtkVar) {
        gc4 gc4Var = ((jc4) ((tu4) fz8.Q(tu4.class, fragment))).c;
        loa a2 = gc4Var.a();
        z41 z41Var = new z41(21, gc4Var.a, gc4Var.b);
        qtkVar.getClass();
        return new za9(a2, qtkVar, z41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1 A[LOOP:0: B:12:0x009f->B:13:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static et5 F(JSONObject jSONObject) {
        String str;
        int i;
        String upperCase;
        int length;
        int i2;
        JSONArray optJSONArray;
        jSONObject.getClass();
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        string2.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        int i3 = 2;
        if (upperCase2 != null) {
            if (upperCase2.equals("MANUAL")) {
                str = "Name is null";
                i = 1;
            } else if (upperCase2.equals("INFERENCE")) {
                str = "Name is null";
                i = 2;
            } else {
                a70.p("No enum constant com.facebook.appevents.codeless.internal.EventBinding.MappingMethod.".concat(upperCase2));
            }
            String string3 = jSONObject.getString("event_type");
            string3.getClass();
            upperCase = string3.toUpperCase(locale);
            upperCase.getClass();
            if (upperCase == null) {
                if (upperCase.equals("CLICK")) {
                    i3 = 1;
                } else if (!upperCase.equals("SELECTED")) {
                    if (upperCase.equals("TEXT_CHANGED")) {
                        i3 = 3;
                    } else {
                        a70.p("No enum constant com.facebook.appevents.codeless.internal.EventBinding.ActionType.".concat(upperCase));
                    }
                }
                String string4 = jSONObject.getString("app_version");
                JSONArray jSONArray = jSONObject.getJSONArray("path");
                ArrayList arrayList = new ArrayList();
                length = jSONArray.length();
                for (i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    arrayList.add(new wae(jSONObject2));
                }
                String optString = jSONObject.optString("path_type", "absolute");
                optJSONArray = jSONObject.optJSONArray("parameters");
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray != null) {
                    int length2 = optJSONArray.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i4);
                        jSONObject3.getClass();
                        arrayList2.add(new i8e(jSONObject3));
                    }
                }
                String optString2 = jSONObject.optString("component_id");
                String optString3 = jSONObject.optString("activity_name");
                string.getClass();
                string4.getClass();
                optString2.getClass();
                optString.getClass();
                optString3.getClass();
                return new et5(string, i, i3, string4, arrayList, arrayList2, optString2, optString, optString3);
            }
            yhk.s(str);
            i3 = 0;
            String string42 = jSONObject.getString("app_version");
            JSONArray jSONArray2 = jSONObject.getJSONArray("path");
            ArrayList arrayList3 = new ArrayList();
            length = jSONArray2.length();
            while (i2 < length) {
            }
            String optString4 = jSONObject.optString("path_type", "absolute");
            optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList22 = new ArrayList();
            if (optJSONArray != null) {
            }
            String optString22 = jSONObject.optString("component_id");
            String optString32 = jSONObject.optString("activity_name");
            string.getClass();
            string42.getClass();
            optString22.getClass();
            optString4.getClass();
            optString32.getClass();
            return new et5(string, i, i3, string42, arrayList3, arrayList22, optString22, optString4, optString32);
        }
        yhk.s("Name is null");
        str = "Name is null";
        i = 0;
        String string32 = jSONObject.getString("event_type");
        string32.getClass();
        upperCase = string32.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase == null) {
        }
        i3 = 0;
        String string422 = jSONObject.getString("app_version");
        JSONArray jSONArray22 = jSONObject.getJSONArray("path");
        ArrayList arrayList32 = new ArrayList();
        length = jSONArray22.length();
        while (i2 < length) {
        }
        String optString42 = jSONObject.optString("path_type", "absolute");
        optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList222 = new ArrayList();
        if (optJSONArray != null) {
        }
        String optString222 = jSONObject.optString("component_id");
        String optString322 = jSONObject.optString("activity_name");
        string.getClass();
        string422.getClass();
        optString222.getClass();
        optString42.getClass();
        optString322.getClass();
        return new et5(string, i, i3, string422, arrayList32, arrayList222, optString222, optString42, optString322);
    }

    public static String G(String str, String str2) {
        return fc6.n("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static final boolean K(KeyEvent keyEvent) {
        long w = u0a.w(keyEvent);
        int i = qia.O;
        return qia.a(w, qia.h) || qia.a(w, qia.r) || qia.a(w, qia.E) || qia.a(w, qia.q);
    }

    public static float L(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kg5.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static Metadata M(ml6 ml6Var, boolean z) {
        is8 is8Var = z ? null : wq9.i;
        nkk nkkVar = new nkk(10);
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                ml6Var.peekFully(nkkVar.a, 0, 10);
                nkkVar.E(0);
                if (nkkVar.u() != 4801587) {
                    break;
                }
                nkkVar.F(3);
                int r = nkkVar.r();
                int i2 = r + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(nkkVar.a, 0, bArr, 0, 10);
                    ml6Var.peekFully(bArr, 10, r);
                    metadata = new wq9(is8Var).G(i2, bArr);
                } else {
                    ml6Var.advancePeekPosition(r);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ml6Var.resetPeekPosition();
        ml6Var.advancePeekPosition(i);
        if (metadata == null || metadata.a.length == 0) {
            return null;
        }
        return metadata;
    }

    public static zad N(lof lofVar) {
        int parseInt = Integer.parseInt(lofVar.n(Long.MAX_VALUE));
        long parseLong = Long.parseLong(lofVar.n(Long.MAX_VALUE));
        long parseLong2 = Long.parseLong(lofVar.n(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int parseInt2 = Integer.parseInt(lofVar.n(Long.MAX_VALUE));
        for (int i = 0; i < parseInt2; i++) {
            String n = lofVar.n(Long.MAX_VALUE);
            int O = StringsKt.O(n, ':', 0, 6);
            if (O == -1) {
                ogj.h("Unexpected header: ".concat(n));
                return null;
            }
            String obj = StringsKt.l0(n.substring(0, O)).toString();
            String substring = n.substring(O + 1);
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object obj2 = linkedHashMap.get(lowerCase);
            if (obj2 == null) {
                obj2 = wv8.n(linkedHashMap, lowerCase);
            }
            ((List) obj2).add(substring);
        }
        return new zad(parseInt, parseLong, parseLong2, new fad(tub.p(linkedHashMap)), null, null);
    }

    public static f78 O(nkk nkkVar) {
        nkkVar.F(1);
        int u = nkkVar.u();
        long j = nkkVar.b + u;
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long m = nkkVar.m();
            if (m == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = m;
            jArr2[i2] = nkkVar.m();
            nkkVar.F(2);
            i2++;
        }
        nkkVar.F((int) (j - nkkVar.b));
        return new f78(jArr, jArr2);
    }

    public static final Bitmap P(Bitmap bitmap, int i) {
        bitmap.getClass();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, (int) (i / (bitmap.getWidth() / bitmap.getHeight())), true);
        createScaledBitmap.getClass();
        return createScaledBitmap;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final defpackage.gy2 Q(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final List R(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.Y(list)) : km5.a;
    }

    public static final Map S(Map map) {
        int size = map.size();
        if (size == 0) {
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            return lm5Var;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.X(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static Context T(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d, i, i2);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof lq3) && ((lq3) context).a == i3;
        if (i3 == 0 || z) {
            return context;
        }
        lq3 lq3Var = new lq3(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = obtainStyledAttributes2.getResourceId(i4, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                lq3Var.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, c);
        int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
        obtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            lq3Var.getTheme().applyStyle(resourceId, true);
        }
        return lq3Var;
    }

    public static Context U(Context context, AttributeSet attributeSet, int i, int i2) {
        return T(i, i2, context, attributeSet, new int[0]);
    }

    public static void V(zad zadVar, kof kofVar) {
        kofVar.m(zadVar.a);
        kofVar.writeByte(10);
        kofVar.m(zadVar.b);
        kofVar.writeByte(10);
        kofVar.m(zadVar.c);
        kofVar.writeByte(10);
        Set<Map.Entry> entrySet = zadVar.d.a.entrySet();
        Iterator it = entrySet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        kofVar.m(i);
        kofVar.writeByte(10);
        for (Map.Entry entry : entrySet) {
            for (String str : (List) entry.getValue()) {
                kofVar.S((String) entry.getKey());
                kofVar.S(":");
                kofVar.S(str);
                kofVar.writeByte(10);
            }
        }
    }

    public static final void a(s24 s24Var, Function0 function0, Function0 function02, of3 of3Var, int i) {
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2079845215);
        int i2 = i | (av8Var.i(s24Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(utcVar, 24.0f, 16.0f);
            long D = lz.D(com.sofascore.results.R.color.surface_P, av8Var);
            jf9 jf9Var = e;
            xtc q = n9e.q(c0, D, jf9Var);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            ey4 ey4Var = s24Var.a;
            TeamSide teamSide = ey4Var.h;
            int i3 = teamSide == null ? -1 : r24.a[teamSide.ordinal()];
            if (i3 == -1) {
                av8Var.d0(-848201269);
                av8Var.s(false);
            } else if (i3 == 1) {
                av8Var.d0(-1828481559);
                a34.c(ey4Var, q, av8Var, 0, 0);
                av8Var.s(false);
            } else {
                if (i3 != 2) {
                    throw dmi.h(av8Var, -1828483645, false);
                }
                av8Var.d0(-1828478935);
                a34.b(ey4Var, q, av8Var, 0, 0);
                av8Var.s(false);
            }
            k44.a((i2 & 112) | 24576 | (i2 & 896), av8Var, n9e.q(utcVar, lz.D(com.sofascore.results.R.color.surface_P, av8Var), jf9Var), oea.v(com.sofascore.results.R.string.delete, av8Var), function0, function02, s24Var.b, true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(s24Var, function0, function02, i, 16);
        }
    }

    public static final void b(Function0 function0, z15 z15Var, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        int i3;
        int i4;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(826668973);
        int i5 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(z15Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i2;
        if (av8Var.T(i6 & 1, (i6 & 147) != 146)) {
            View view = (View) av8Var.k(nz.f);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            ema emaVar = (ema) av8Var.k(dh3.n);
            a S = z8e.S(av8Var);
            e1d g2 = e.g(tc3Var, av8Var);
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            Object obj2 = O;
            if (O == a99Var) {
                mz mzVar = mz.o;
                av8Var.n0(mzVar);
                obj2 = mzVar;
            }
            UUID uuid = (UUID) o3a.N(objArr, (Function0) obj2, av8Var, 48);
            boolean e2 = av8Var.e(z15Var.g) | av8Var.g(view) | av8Var.g(kx4Var) | av8Var.g(null);
            Object O2 = av8Var.O();
            if (e2 || O2 == a99Var) {
                f25 f25Var = new f25(function0, z15Var, view, emaVar, kx4Var, uuid);
                i3 = 1;
                tc3 tc3Var2 = new tc3(-1338939603, new z2(g2, i5), true);
                w15 w15Var = f25Var.h;
                w15Var.setParentCompositionContext(S);
                ((eoh) w15Var.l).setValue(tc3Var2);
                w15Var.p = true;
                w15Var.d();
                av8Var.n0(f25Var);
                O2 = f25Var;
            } else {
                i3 = 1;
            }
            f25 f25Var2 = (f25) O2;
            boolean i7 = av8Var.i(f25Var2);
            Object O3 = av8Var.O();
            if (i7 || O3 == a99Var) {
                i4 = 0;
                d00 d00Var = new d00(f25Var2, i4);
                av8Var.n0(d00Var);
                obj = d00Var;
            } else {
                i4 = 0;
                obj = O3;
            }
            hz8.d(f25Var2, (Function1) obj, av8Var);
            int i8 = (av8Var.i(f25Var2) ? 1 : 0) | ((i6 & 14) == 4 ? i3 : i4) | ((i6 & 112) == 32 ? i3 : i4) | (av8Var.e(emaVar.ordinal()) ? 1 : 0);
            Object O4 = av8Var.O();
            if (i8 != 0 || O4 == a99Var) {
                mc mcVar = new mc(f25Var2, function0, z15Var, emaVar, 1);
                av8Var.n0(mcVar);
                O4 = mcVar;
            }
            hz8.t((Function0) O4, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e00(function0, z15Var, tc3Var, i, 0);
        }
    }

    public static final void c(xtc xtcVar, Function2 function2, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1090521195);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i | (av8Var.i(function2) ? 32 : 16);
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = g00.b;
                av8Var.n0(O);
            }
            k1c k1cVar = (k1c) O;
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            int i4 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, k1cVar, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            me4.l((i4 >> 6) & 14, function2, av8Var, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sz(xtcVar, function2, i, i3);
        }
    }

    public static final void d(Integer num, Integer num2, long j, boolean z, boolean z2, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        xtc xtcVar2;
        String E;
        String lowerCase;
        utc utcVar;
        boolean z3;
        boolean z4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1539009192);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(num2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.h(z) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.h(z2) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            if (z2) {
                E = num != null ? yid.r(num.intValue()) : null;
                if (E == null) {
                    E = "";
                }
            } else {
                E = uxf.E(j, 62, false);
            }
            String str = E;
            if (z2) {
                av8Var2.d0(153482534);
                int intValue = num2 != null ? num2.intValue() : 0;
                Integer valueOf = intValue < 1000 ? Integer.valueOf(intValue) : null;
                lowerCase = oea.t(com.sofascore.results.R.plurals.number_of_votes, valueOf != null ? valueOf.intValue() : 100, new Object[]{uxf.E(intValue, 62, false)}, av8Var2);
                av8Var2.s(false);
            } else {
                av8Var2.d0(153771237);
                lowerCase = oea.v(com.sofascore.results.R.string.total_votes, av8Var2).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                av8Var2.s(false);
            }
            kv1 kv1Var = uxf.p;
            long D = lz.D(com.sofascore.results.R.color.surface_1, av8Var2);
            n7g a2 = o7g.a(2.0f);
            utc utcVar2 = utc.a;
            xtc c0 = l98.c0(n9e.q(utcVar2, D, a2), 4.0f, 2.0f);
            u23 a3 = t23.a(ww9.d, kv1Var, av8Var2, 48);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf2, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            l8g a4 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, utcVar2);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (z && z2) {
                av8Var2.d0(2042804619);
                long D2 = lz.D(com.sofascore.results.R.color.primary_default, av8Var2);
                utcVar = utcVar2;
                z3 = true;
                z4 = false;
                c5n.a(12.0f, 384, 25, D2, 0L, av8Var2, null);
                av8Var = av8Var2;
                bf3.u(utcVar, 4.0f, av8Var, false);
            } else {
                av8Var = av8Var2;
                utcVar = utcVar2;
                z3 = true;
                z4 = false;
                av8Var.d0(2043013156);
                av8Var.s(false);
            }
            yf8 yf8Var = xth.a;
            av8 av8Var3 = av8Var;
            udj.c(str, null, z2 ? ljg.f(av8Var, -72636281, com.sofascore.results.R.color.n_lv_1, av8Var, z4) : ljg.f(av8Var, -72635801, com.sofascore.results.R.color.n_lv_3, av8Var, z4), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var3, 0, 24960, 110586);
            av8Var.s(z3);
            udj.c(lowerCase, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var3, 0, 24960, 110586);
            av8Var.s(z3);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oz5(num, num2, j, z, z2, xtcVar2, i);
        }
    }

    public static final void e(qpb qpbVar, boolean z, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1491582959);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(qpbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i3 = i2 | 3072;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new yn6(8);
                av8Var.n0(O);
            }
            wkn.a(qpbVar, null, null, (Function1) O, yqo.H(-370943443, av8Var, new hs5(function1, z)), av8Var, (i3 & 14) | 27648, 6);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(qpbVar, z, function1, xtcVar2, i, 11);
        }
    }

    public static final void f(int i, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        int i3;
        p8g p8gVar;
        int i4;
        boolean z3;
        kv1 kv1Var = uxf.q;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(105560721);
        int i5 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.i(function02) ? 16384 : 8192) | (av8Var.i(function03) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | 1572864;
        if (av8Var.T(i5 & 1, (599187 & i5) != 599186)) {
            cdi b2 = a60.b(i <= 0 ? 0.0f : 1.0f, s02.h0(400, 0, null, 6), null, av8Var, 48, 28);
            utc utcVar = utc.a;
            xtc b0 = l98.b0(ml4.f0(n9e.q(d2a.E(bkh.d(utcVar, 1.0f), 8.0f, null, false, 0L, 30), lz.D(com.sofascore.results.R.color.surface_1, av8Var), e)), 16.0f);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            float floatValue = ((Number) b2.getValue()).floatValue();
            p8g p8gVar2 = p8g.a;
            if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                av8Var.d0(1659186437);
                int i6 = ((i5 >> 9) & 112) | 3072;
                i3 = i5;
                xtcVar2 = utcVar;
                p8gVar = p8gVar2;
                z3 = false;
                i4 = 6;
                mha.h(oea.v(com.sofascore.results.R.string.fantasy_clear_button, av8Var), function02, l98.f0(p8gVar2.a(((Number) b2.getValue()).floatValue(), utcVar, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) b2.getValue()).floatValue() * 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), gqh.a, new bqh(s6a.N(com.sofascore.results.R.drawable.ic_refresh, 6, av8Var), kv1Var), false, false, false, 0L, 0, 0, av8Var, i6, 0, 2016);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                i3 = i5;
                xtcVar2 = utcVar;
                p8gVar = p8gVar2;
                i4 = 6;
                z3 = false;
                av8Var.d0(1659642261);
                av8Var.s(false);
            }
            if (i == 15) {
                av8Var.d0(1659732719);
                av8 av8Var2 = av8Var;
                mha.h(oea.v(com.sofascore.results.R.string.save, av8Var), function03, p8gVar.a(1.0f, xtcVar2, true), kqh.a, new bqh(s6a.N(com.sofascore.results.R.drawable.ic_arrow, i4, av8Var), kv1Var), z, false, false, 0L, 0, 0, av8Var2, ((i3 >> 12) & 112) | 3072 | (458752 & (i3 << 12)), 0, 1984);
                av8Var = av8Var2;
                av8Var.s(z3);
            } else {
                av8Var.d0(1660150103);
                av8 av8Var3 = av8Var;
                mha.h(oea.v(com.sofascore.results.R.string.fantasy_auto_select, av8Var), function0, p8gVar.a(1.0f, xtcVar2, true), kqh.a, new bqh(s6a.N(com.sofascore.results.R.drawable.ic_wand, i4, av8Var), kv1Var), !z2, false, false, 0L, 0, 0, av8Var3, ((i3 >> 6) & 112) | 3072, 0, 1984);
                av8Var = av8Var3;
                av8Var.s(z3);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i44(i, z, z2, function0, function02, function03, xtcVar2, i2);
        }
    }

    public static final void g(re7 re7Var, Function2 function2, boolean z, ksa ksaVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1321776797);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(re7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(ksaVar) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            g28 g28Var = bkh.c;
            k1c c2 = e12.c(uxf.c, false);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object O = av8Var.O();
            int i3 = 6;
            if (z2 || O == nf3.a) {
                O = new gk(re7Var, function2, z, i3);
                av8Var.n0(O);
            }
            v8a.a(g28Var, ksaVar, C2, null, null, null, false, null, (Function1) O, av8Var, ((i2 >> 6) & 112) | 390, PglCryptUtils.BASE64_FAILED);
            s6a.a(re7Var.a, g28Var, av8Var, 48);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(re7Var, function2, z, ksaVar, i, 12);
        }
    }

    public static final void h(te7 te7Var, boolean z, ksa ksaVar, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(483810180);
        int i2 = (av8Var2.i(te7Var) ? 4 : 2) | i | (av8Var2.h(z) ? 32 : 16) | (av8Var2.g(ksaVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var2.Y();
            if ((i & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            re7 k = te7Var.k();
            boolean i3 = av8Var2.i(te7Var);
            Object O = av8Var2.O();
            if (i3 || O == nf3.a) {
                p1 p1Var = new p1(2, te7Var, te7.class, "togglePlayer", "togglePlayer(II)V", 0, 6);
                av8Var2.n0(p1Var);
                O = p1Var;
            }
            av8Var = av8Var2;
            g(k, (Function2) ((KFunction) O), z, ksaVar, av8Var, (i2 << 3) & 8064);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(te7Var, z, ksaVar, i, 13);
        }
    }

    public static final void i(gf7 gf7Var, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-733340640);
        int i2 = (av8Var.i(gf7Var) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = goh.b(new ni4(a2, 6));
                av8Var.n0(O);
            }
            cdi cdiVar = (cdi) O;
            ef7 ef7Var = gf7Var.b;
            boolean g2 = av8Var.g(a2);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                O2 = new hs6(a2, cdiVar, (rq3) null, 24);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, ef7Var, (Function2) O2);
            wkn.a(Boolean.valueOf(gf7Var.a), null, null, null, yqo.H(-594380641, av8Var, new ff7(a2, function1, gf7Var, context, cdiVar, 0)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz6(gf7Var, function1, i, 14);
        }
    }

    public static final void j(if7 if7Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1927821884);
        int i2 = (av8Var.i(if7Var) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            gf7 gf7Var = (gf7) rfo.x(if7Var.g, av8Var, 0).getValue();
            boolean i3 = av8Var.i(context) | av8Var.i(if7Var);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new w47(10, (Object) context, (Object) if7Var);
                av8Var.n0(O);
            }
            i(gf7Var, (Function1) O, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jo6(if7Var, i, 29);
        }
    }

    public static final void k(do7 do7Var, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        do7Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(124668126);
        int i2 = i | (av8Var.g(do7Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            ev6 ev6Var = do7Var.c;
            cdi M = hda.M(ev6Var.i.d, av8Var, 0);
            if (ev6Var.y) {
                av8Var.d0(-1158158343);
                boolean g2 = av8Var.g(ev6Var);
                Object O = av8Var.O();
                if (g2 || O == nf3.a) {
                    String str = "FANTASY_PARTNER_SPLASH_SHOWN_TIMESTAMP_" + ev6Var.c;
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
                    long j = sharedPreferences.getLong(str, 0L);
                    LocalDate t = fc6.t(Instant.ofEpochSecond(yaa.w()));
                    Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).toLocalDate().getClass();
                    O = Boolean.valueOf(!t.isEqual(r12));
                    av8Var.n0(O);
                }
                if (((Boolean) O).booleanValue()) {
                    av8Var.d0(-1157815452);
                    Unit unit = Unit.a;
                    boolean i4 = av8Var.i(context) | av8Var.g(ev6Var);
                    Object O2 = av8Var.O();
                    if (i4 || O2 == nf3.a) {
                        O2 = new qa7(context, ev6Var, null, 9);
                        av8Var.n0(O2);
                    }
                    hz8.o(av8Var, unit, (Function2) O2);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1157538684);
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                av8Var.d0(-1157532732);
                av8Var.s(false);
            }
            ek2 t2 = rd0.t(lz.D(com.sofascore.results.R.color.graphics_dark, av8Var), av8Var, 0);
            n7g a2 = o7g.a(16.0f);
            gk2 u = rd0.u(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 62);
            qz1 H = fcp.H(lz.D(com.sofascore.results.R.color.n_lv_4, av8Var), 1.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object O3 = av8Var.O();
            if (z || O3 == nf3.a) {
                O3 = new vx6(function1, do7Var, i3);
                av8Var.n0(O3);
            }
            un0.a(wnn.A(tol.n(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function0) O3, 3), o7g.a(16.0f)), a2, t2, u, H, yqo.H(-380953556, av8Var, new d67(27, ev6Var, do7Var, M)), av8Var, 196608, 0);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new wx6(do7Var, function1, xtcVar, i, 1);
        }
    }

    public static final void l(ImageVector imageVector, String str, xtc xtcVar, long j, of3 of3Var, int i) {
        xtc xtcVar2;
        xtc xtcVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-152485832);
        int i2 = i | (av8Var.g(imageVector) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | 384 | (av8Var.f(j) ? com.ironsource.mediationsdk.metadata.a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            av8Var.Y();
            int i3 = i & 1;
            utc utcVar = utc.a;
            if (i3 == 0 || av8Var.B()) {
                xtcVar3 = utcVar;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
            }
            av8Var.t();
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar3);
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
            kq9.b(imageVector, null, bkh.l(utcVar, 16.0f), j, av8Var, (i2 & 14) | 432 | (i2 & 7168), 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, null, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, (i2 >> 3) & 910, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = xtcVar3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lv3(imageVector, str, xtcVar2, j, i);
        }
    }

    public static final void m(ecd ecdVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1403655328);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(ecdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
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
            utc utcVar = utc.a;
            xtc d3 = bkh.d(utcVar, 1.0f);
            String str = ecdVar.b;
            if (str == null) {
                str = "";
            }
            yf8 yf8Var = xth.a;
            udj.c(str, d3, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 4, 0, null, xth.h(), av8Var, 48, 24960, 110584);
            xtc e2 = fn0.e(1.0f, l98.d0(n9e.q(utcVar, lz.D(com.sofascore.results.R.color.surface_1, av8Var), e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), true);
            String str2 = ecdVar.c;
            String str3 = str2 != null ? str2 : "";
            udj.c(str3, e2, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.f(), av8Var, 0, 384, 126968);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(ecdVar, xtcVar, i, 11);
        }
    }

    public static final void n(ecd ecdVar, boolean z, xtc xtcVar, Function0 function0, of3 of3Var, int i) {
        int i2;
        boolean z2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-655246651);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(ecdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= av8Var2.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.i(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            int i3 = 12;
            gn8 c3 = wv8.c(lz.D(com.sofascore.results.R.color.n_lv_3, av8Var2), 5, haa.t(com.sofascore.results.R.drawable.sofascore_lockup, 0, av8Var2), 12);
            gn8 c4 = wv8.c(lz.D(com.sofascore.results.R.color.n_lv_3, av8Var2), 5, haa.t(com.sofascore.results.R.drawable.sofascore_lockup, 0, av8Var2), 12);
            String str = ecdVar.f;
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.n_lv_4, av8Var2), e);
            Object O = av8Var2.O();
            if (O == nf3.a) {
                O = new qaj(i3);
                av8Var2.n0(O);
            }
            haa.b(str, null, td4.Z(q, (Function1) O), c4, c3, null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 36912, 6, 31712);
            jca.n(ecdVar.g, ecdVar.d, l98.b0(n12.a.a(utcVar, uxf.i), 16.0f), true, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var2), lz.D(com.sofascore.results.R.color.on_color_secondary, av8Var2), av8Var2, 3072, 0);
            fz8.e(z2, null, uo5.e(null, 3), uo5.f(null, 3), null, yqo.H(-885857501, av8Var2, new e6i(13, xtcVar, function0)), av8Var2, ((i2 >> 3) & 14) | 200064, 18);
            av8Var = av8Var2;
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73((Object) ecdVar, z, xtcVar, (dt8) function0, i, 21);
        }
    }

    public static final void o(ecd ecdVar, int i, boolean z, boolean z2, boolean z3, Function0 function0, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2021521223);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(ecdVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.h(z2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            xtc q = n9e.q(bkh.c, lz.D(com.sofascore.results.R.color.surface_1, av8Var), e);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Context context = (Context) av8Var.k(nz.b);
            x23 x23Var = x23.a;
            utc utcVar = utc.a;
            int i5 = i4 & 14;
            n(ecdVar, z, x23Var.a(1.0f, utcVar, true), function0, av8Var, ((i4 >> 3) & 112) | i5 | ((i4 >> 6) & 7168));
            m(ecdVar, l98.f0(x23Var.a(1.0f, utcVar, true), 16.0f, 8.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), av8Var, i5);
            xtc d0 = l98.d0(x23Var.b(utcVar), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
            String upperCase = oea.v(com.sofascore.results.R.string.read_article, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            boolean i6 = ((57344 & i4) == 16384) | (i5 == 4) | av8Var.i(context) | ((i4 & 112) == 32);
            Object O = av8Var.O();
            if (i6 || O == nf3.a) {
                O = new q93(z3, ecdVar, context, i);
                av8Var.n0(O);
            }
            qx9.j(upperCase, (Function0) O, d0, 0L, 0L, av8Var, 196608);
            if (z2) {
                av8Var.d0(-1314673359);
                av8Var.s(false);
            } else {
                av8Var.d0(-1314747356);
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var, l98.b0(utcVar, 16.0f));
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new a25(ecdVar, i, z, z2, z3, function0, i2);
        }
    }

    public static final void p(int i, of3 of3Var, xtc xtcVar, Function0 function0) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1553551692);
        int i2 = i | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xlb I = x2a.I(new ylb(com.sofascore.results.R.raw.swipe_animation_vertical), av8Var);
            flb N = yaa.N(av8Var);
            boolean g2 = av8Var.g(N) | av8Var.g(I);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            rq3 rq3Var = null;
            if (g2 || O == a99Var) {
                O = new vki(N, I, rq3Var, 14);
                av8Var.n0(O);
            }
            hz8.o(av8Var, N, (Function2) O);
            Boolean bool = (Boolean) N.n.getValue();
            bool.booleanValue();
            boolean g3 = av8Var.g(N) | ((i2 & 112) == 32);
            Object O2 = av8Var.O();
            if (g3 || O2 == a99Var) {
                O2 = new m1f(N, function0, rq3Var, 29);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, bool, (Function2) O2);
            xtc f0 = l98.f0(n9e.q(xtcVar.z(bkh.c), lz.D(com.sofascore.results.R.color.darken_overlay_2, av8Var), e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, 7);
            u23 a2 = t23.a(ww9.e, uxf.p, av8Var, 54);
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
            xtc l = bkh.l(utc.a, 180.0f);
            plb plbVar = (plb) I.getValue();
            boolean g4 = av8Var.g(N);
            Object O3 = av8Var.O();
            if (g4 || O3 == a99Var) {
                O3 = new w1i(N, 24);
                av8Var.n0(O3);
            }
            aba.c(plbVar, (Function0) O3, l, false, false, false, false, null, false, null, null, null, false, false, null, null, false, av8Var, 384, 0, 131064);
            yf8 yf8Var = xth.a;
            udj.c(oea.v(com.sofascore.results.R.string.swipe_for_more_content, av8Var), null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(xtcVar, function0, i, 11);
        }
    }

    public static final void q(plj pljVar, boolean z, xtc xtcVar, Function1 function1, Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-863942027);
        int i2 = i | (av8Var2.g(pljVar) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? 2048 : 1024) | (av8Var2.i(function0) ? 16384 : 8192);
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = pljVar.b;
            boolean z2 = (i2 & 14) == 4;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new w1i(pljVar, 23);
                av8Var2.n0(O);
            }
            pr4 b2 = c6e.b(i3, (Function0) O, av8Var2, 0, 2);
            boolean g2 = av8Var2.g(b2) | ((i2 & 7168) == 2048);
            Object O2 = av8Var2.O();
            if (g2 || O2 == a99Var) {
                O2 = new vki(b2, function1, null, 15);
                av8Var2.n0(O2);
            }
            hz8.o(av8Var2, b2, (Function2) O2);
            av8Var = av8Var2;
            f6a.c(b2, xtcVar, l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7), null, 1, null, null, false, null, null, null, yqo.H(-143841884, av8Var2, new r73(pljVar, z, function0, 3)), av8Var, ((i2 >> 3) & 112) | 24960);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(pljVar, z, xtcVar, function1, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(noi noiVar, gze gzeVar, h21 h21Var) {
        bm8 bm8Var;
        int i;
        int size;
        int i2;
        if (h21Var instanceof bm8) {
            bm8Var = (bm8) h21Var;
            int i3 = bm8Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bm8Var.u = i3 - Integer.MIN_VALUE;
                Object obj = bm8Var.t;
                lu3 lu3Var = lu3.a;
                i = bm8Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    List list = noiVar.f.s.a;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (((mze) list.get(i4)).d) {
                            bm8Var.r = noiVar;
                            bm8Var.s = gzeVar;
                            bm8Var.u = 1;
                            obj = noiVar.b(gzeVar, bm8Var);
                            if (obj == lu3Var) {
                            }
                            List list2 = ((fze) obj).a;
                            size = list2.size();
                            i2 = 0;
                            while (i2 < size) {
                            }
                            return Unit.a;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gze gzeVar2 = bm8Var.s;
                noi noiVar2 = bm8Var.r;
                y6a.M(obj);
                gzeVar = gzeVar2;
                noiVar = noiVar2;
                List list22 = ((fze) obj).a;
                size = list22.size();
                i2 = 0;
                while (i2 < size) {
                    if (((mze) list22.get(i2)).d) {
                        bm8Var.r = noiVar;
                        bm8Var.s = gzeVar;
                        bm8Var.u = 1;
                        obj = noiVar.b(gzeVar, bm8Var);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        List list222 = ((fze) obj).a;
                        size = list222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    } else {
                        i2++;
                    }
                }
                return Unit.a;
            }
        }
        bm8Var = new bm8(h21Var);
        Object obj2 = bm8Var.t;
        lu3 lu3Var2 = lu3.a;
        i = bm8Var.u;
        if (i != 0) {
        }
    }

    public static final Object s(qze qzeVar, Function2 function2, rq3 rq3Var) {
        Object k1 = ((ooi) qzeVar).k1(new kj6(rq3Var.getContext(), function2, null, 1), rq3Var);
        return k1 == lu3.a ? k1 : Unit.a;
    }

    public static final xtc t(xtc xtcVar, wzc wzcVar, d1a d1aVar, boolean z, String str, u5g u5gVar, Function0 function0) {
        xtc z2;
        if (d1aVar instanceof j1a) {
            z2 = new qw2(wzcVar, (j1a) d1aVar, false, z, str, u5gVar, function0);
        } else if (d1aVar == null) {
            z2 = new qw2(wzcVar, null, false, z, str, u5gVar, function0);
        } else {
            utc utcVar = utc.a;
            z2 = wzcVar != null ? f1a.a(utcVar, wzcVar, d1aVar).z(new qw2(wzcVar, null, false, z, str, u5gVar, function0)) : fqj.q(utcVar, new rw2(d1aVar, z, str, u5gVar, function0));
        }
        return xtcVar.z(z2);
    }

    public static /* synthetic */ xtc u(xtc xtcVar, wzc wzcVar, d1a d1aVar, boolean z, String str, u5g u5gVar, Function0 function0, int i) {
        u5g u5gVar2;
        xtc xtcVar2;
        wzc wzcVar2;
        d1a d1aVar2;
        Function0 function02;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            u5gVar2 = null;
            wzcVar2 = wzcVar;
            d1aVar2 = d1aVar;
            function02 = function0;
            xtcVar2 = xtcVar;
        } else {
            u5gVar2 = u5gVar;
            xtcVar2 = xtcVar;
            wzcVar2 = wzcVar;
            d1aVar2 = d1aVar;
            function02 = function0;
        }
        return t(xtcVar2, wzcVar2, d1aVar2, z2, str2, u5gVar2, function02);
    }

    public static xtc v(xtc xtcVar, u5g u5gVar, Function0 function0, int i) {
        String str = (i & 2) != 0 ? null : NativeAdContent.ViewTag.CTA;
        if ((i & 4) != 0) {
            u5gVar = null;
        }
        return fqj.q(xtcVar, new d67(8, str, u5gVar, function0));
    }

    public static xtc w(xtc xtcVar, boolean z, String str, wzc wzcVar, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return xtcVar.z(new qw2((i & 8) != 0 ? null : wzcVar, null, true, z, (i & 2) != 0 ? null : str, null, function0));
    }

    public static final Bitmap x(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap z = z(bitmap, 150);
        Bitmap z2 = z(bitmap2, 150);
        int width = z2.getWidth() / 2;
        int height = z2.getHeight() / 2;
        Bitmap createBitmap = Bitmap.createBitmap(z.getWidth() + width, z.getHeight() + height, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        canvas.drawBitmap(z2, width, height, (Paint) null);
        return createBitmap;
    }

    public static xtc y(xtc xtcVar, wzc wzcVar, Function0 function0) {
        return xtcVar.z(new h33(wzcVar, function0));
    }

    public static final Bitmap z(Bitmap bitmap, int i) {
        bitmap.getClass();
        return (bitmap.getWidth() == i || bitmap.getHeight() == i) ? bitmap : P(bitmap, i);
    }

    public abstract int H(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int I();

    public abstract ViewPropertyAnimator J(int i, View view);
}
