package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.appevents.l;
import com.facebook.d0;
import com.facebook.w;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.auth.b;
import com.google.android.gms.internal.auth.zzef;
import com.google.android.gms.internal.auth.zzev;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzfb;
import com.google.android.gms.internal.auth.zzha;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.moloco.sdk.internal.publisher.h0;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.EventGraphPoint;
import com.sofascore.model.profile.CrowdsourcingAggregates;
import com.sofascore.model.profile.EditorAggregates;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.model.profile.VoteStatistics;
import com.sofascore.model.profile.VoteStatisticsWrapper;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.shootout.PenaltiesGridView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class cga {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static final String A(Stage stage, Context context, boolean z) {
        stage.getClass();
        context.getClass();
        String str = null;
        if (Boolean.valueOf(yid.m(stage.getSequence()) > 0).equals(Boolean.TRUE)) {
            ServerType type = stage.getType();
            switch (type == null ? -1 : iwc.a[type.ordinal()]) {
                case 1:
                case 2:
                    str = context.getString(z ? R.string.motorsport_free_practice_short : R.string.motorsport_practice_number, Integer.valueOf(yid.m(stage.getSequence())));
                    break;
                case 3:
                case 4:
                    str = context.getString(z ? R.string.motorsport_qualifying_stage_short : R.string.motorsport_qualifying_number, Integer.valueOf(yid.m(stage.getSequence())));
                    break;
                case 5:
                case 6:
                    str = context.getString(R.string.motorsport_sprint_qualifying_stage_short, Integer.valueOf(yid.m(stage.getSequence())));
                    break;
            }
        }
        if (str != null) {
            return str;
        }
        DayOfWeek dayOfWeek = hwc.a;
        return hwc.d(context, stage.getDescription(), z);
    }

    public static final String B(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.k(nz.a);
        return ((Context) av8Var.k(nz.b)).getResources().getString(i);
    }

    public static File C(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static final int D(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] E(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        mh0.i(0, i, 6, objArr, objArr2);
        mh0.d(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b5 -> B:10:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(zvj zvjVar, tl tlVar, sq3 sq3Var) {
        v4h v4hVar;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        v4h v4hVar2;
        ct8 ct8Var;
        zvj zvjVar2;
        int size;
        int i2;
        if (sq3Var instanceof v4h) {
            v4hVar = (v4h) sq3Var;
            int i3 = v4hVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v4hVar.z = i3 - Integer.MIN_VALUE;
                Object obj = v4hVar.y;
                lu3 lu3Var = lu3.a;
                i = v4hVar.z;
                if (i != 0) {
                    y6a.M(obj);
                    List list = zvjVar.b;
                    if (list.isEmpty()) {
                        return zvjVar;
                    }
                    int size2 = list.size() + 4;
                    ArrayList arrayList3 = new ArrayList(size2);
                    ArrayList arrayList4 = new ArrayList(size2);
                    arrayList3.add(CollectionsKt.Y(list));
                    List list2 = zvjVar.d;
                    arrayList4.add(new Integer(list2 != null ? ((Number) CollectionsKt.Y(list2)).intValue() : 0));
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    v4hVar2 = v4hVar;
                    ct8Var = tlVar;
                    zvjVar2 = zvjVar;
                    size = list.size();
                    i2 = 1;
                    if (i2 < size) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    size = v4hVar.x;
                    int i4 = v4hVar.w;
                    Object obj2 = v4hVar.v;
                    ArrayList arrayList5 = v4hVar.u;
                    arrayList = v4hVar.t;
                    ct8 ct8Var2 = v4hVar.s;
                    zvj zvjVar3 = v4hVar.r;
                    y6a.M(obj);
                    ArrayList arrayList6 = arrayList5;
                    v4h v4hVar3 = v4hVar;
                    ct8Var = ct8Var2;
                    ArrayList arrayList7 = arrayList;
                    ArrayList arrayList8 = arrayList6;
                    if (obj != null) {
                        arrayList7.add(obj);
                        arrayList8.add(new Integer(i4));
                    }
                    arrayList7.add(obj2);
                    arrayList8.add(new Integer(i4));
                    i2 = i4 + 1;
                    v4hVar2 = v4hVar3;
                    arrayList2 = arrayList8;
                    arrayList = arrayList7;
                    zvjVar2 = zvjVar3;
                    if (i2 < size) {
                        Object obj3 = zvjVar2.b.get(i2);
                        Object obj4 = zvjVar2.b.get(i2 - 1);
                        v4hVar2.r = zvjVar2;
                        v4hVar2.s = ct8Var;
                        v4hVar2.t = arrayList;
                        v4hVar2.u = arrayList2;
                        v4hVar2.v = obj3;
                        v4hVar2.w = i2;
                        v4hVar2.x = size;
                        v4hVar2.z = 1;
                        Object invoke = ct8Var.invoke(obj4, obj3, v4hVar2);
                        if (invoke == lu3Var) {
                            return lu3Var;
                        }
                        zvjVar3 = zvjVar2;
                        i4 = i2;
                        obj = invoke;
                        arrayList6 = arrayList2;
                        v4hVar3 = v4hVar2;
                        obj2 = obj3;
                        ArrayList arrayList72 = arrayList;
                        ArrayList arrayList82 = arrayList6;
                        if (obj != null) {
                        }
                        arrayList72.add(obj2);
                        arrayList82.add(new Integer(i4));
                        i2 = i4 + 1;
                        v4hVar2 = v4hVar3;
                        arrayList2 = arrayList82;
                        arrayList = arrayList72;
                        zvjVar2 = zvjVar3;
                        if (i2 < size) {
                            return arrayList.size() == zvjVar2.b.size() ? zvjVar2 : new zvj(zvjVar2.a, arrayList, zvjVar2.c, arrayList2);
                        }
                    }
                }
            }
        }
        v4hVar = new v4h(sq3Var);
        Object obj5 = v4hVar.y;
        lu3 lu3Var2 = lu3.a;
        i = v4hVar.z;
        if (i != 0) {
        }
    }

    public static final boolean G(UniqueStage uniqueStage) {
        Category category;
        return (uniqueStage == null || (category = uniqueStage.getCategory()) == null || category.getId() != 1325) ? false : true;
    }

    public static boolean H(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void I(ha5 ha5Var, boolean z, Function1 function1) {
        ha5Var.getClass();
        if (!z) {
            function1.invoke(ha5Var);
            return;
        }
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            hpo.H((hpo) L0.a, -1.0f, 1.0f);
            function1.invoke(ha5Var);
        } finally {
            mz1.v(L0, D);
        }
    }

    public static final void J(l9j l9jVar) {
        mo2 mo2Var = l9jVar.c;
        int length = mo2Var.length();
        int length2 = mo2Var.length() + 1;
        if (length < 0 || length >= length2) {
            u3a.a("Expected " + length + " to be in [0, " + length2 + ')');
        }
        l9jVar.e = t6a.g(length, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(String str, String str2, float[] fArr) {
        boolean contains;
        boolean contains2;
        hmi hmiVar = hmi.a;
        if (!cw3.a.contains(hmi.class)) {
            try {
                str.getClass();
                contains = hmi.c.contains(str);
            } catch (Throwable th) {
                cw3.a(hmi.class, th);
            }
            if (!contains) {
                l lVar = new l(w.a(), (String) null);
                if (cw3.a.contains(lVar)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("_is_suggested_event", "1");
                    bundle.putString("_button_text", str2);
                    lVar.d(bundle, str);
                    return;
                } catch (Throwable th2) {
                    cw3.a(lVar, th2);
                    return;
                }
            }
            if (!cw3.a.contains(hmi.class)) {
                try {
                    str.getClass();
                    contains2 = hmi.d.contains(str);
                } catch (Throwable th3) {
                    cw3.a(hmi.class, th3);
                }
                if (contains2) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putString("event_name", str);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    for (float f : fArr) {
                        sb.append(f);
                        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                    }
                    jSONObject.put("dense", sb.toString());
                    jSONObject.put("button_text", str2);
                    bundle2.putString(TtmlNode.TAG_METADATA, jSONObject.toString());
                    String str3 = d0.j;
                    d0 C = h0.C(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{w.b()}, 1)), null, null);
                    C.d = bundle2;
                    C.c();
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            contains2 = false;
            if (contains2) {
            }
        }
        contains = false;
        if (!contains) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r5 = defpackage.me4.h("[^a-z]+", r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r4.equals("r4") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r4.equals("r5") == false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void L(HashMap hashMap, String str, String str2) {
        switch (str.hashCode()) {
            case 3585:
                if (str.equals("r3")) {
                    if (!c.v(str2, InneractiveMediationDefs.GENDER_MALE, false) && !c.v(str2, "b", false) && !c.v(str2, "ge", false)) {
                        str2 = InneractiveMediationDefs.GENDER_FEMALE;
                        break;
                    } else {
                        str2 = InneractiveMediationDefs.GENDER_MALE;
                        break;
                    }
                }
                break;
            case 3588:
                if (str.equals("r6") && StringsKt.J(str2, "-", false)) {
                    str2 = ((String[]) new Regex("-").h(str2).toArray(new String[0]))[0];
                    break;
                }
                break;
        }
        hashMap.put(str, str2);
    }

    public static boolean M(String str, String str2) {
        v3f v3fVar = v3f.a;
        String str3 = null;
        if (!cw3.a.contains(v3f.class)) {
            try {
                LinkedHashMap linkedHashMap = v3f.b;
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                }
            } catch (Throwable th) {
                cw3.a(v3f.class, th);
            }
        }
        int i = 0;
        if (str3 == null) {
            return false;
        }
        if (str3.equals("other")) {
            return true;
        }
        try {
            w.c().execute(new ztk(str3, str2, i));
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static final Object[] N(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        mh0.i(0, i, 6, objArr, objArr2);
        mh0.d(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void O(v82 v82Var, ArrayList arrayList, int i) {
        List<? extends tce> L0 = CollectionsKt.L0(CollectionsKt.y0(arrayList, i5h.p(e5h.d(new t2e(9)), i)), i);
        List<? extends tce> S = CollectionsKt.S(arrayList, i);
        ((PenaltiesGridView) v82Var.f).setOutcomes(L0);
        ((PenaltiesGridView) v82Var.h).setOutcomes(S);
    }

    public static final void P(l9j l9jVar, int i, int i2) {
        l9jVar.f(t6a.g(llf.c(i, 0, l9jVar.c.length()), llf.c(i2, 0, l9jVar.c.length())));
    }

    public static final void Q(v82 v82Var, int i, int i2, int i3, boolean z) {
        as9.o((ImageView) v82Var.d, i);
        TextView textView = (TextView) v82Var.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        Context context = constraintLayout.getContext();
        context.getClass();
        textView.setTextColor(z ? context.getColor(R.color.live) : i3 >= 0 ? context.getColor(R.color.n_lv_1) : context.getColor(R.color.n_lv_3));
        textView.setText(String.valueOf(i2));
        View view = (View) v82Var.c;
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        view.setBackgroundTintList(ColorStateList.valueOf(z ? context2.getColor(R.color.surface_2) : i3 >= 0 ? context2.getColor(R.color.neutral_highlight) : context2.getColor(R.color.surface_2)));
    }

    public static File R(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, dmi.y(str2, ".temp"));
    }

    public static void S(Activity activity) {
        View z;
        int hashCode = activity.hashCode();
        HashMap hashMap = null;
        if (!cw3.a.contains(hjc.class)) {
            try {
                hashMap = hjc.e;
            } catch (Throwable th) {
                cw3.a(hjc.class, th);
            }
        }
        Integer valueOf = Integer.valueOf(hashCode);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new hjc(activity);
            hashMap.put(valueOf, obj);
        }
        hjc hjcVar = (hjc) obj;
        Set set = cw3.a;
        if (set.contains(hjc.class)) {
            return;
        }
        try {
            if (set.contains(hjcVar)) {
                return;
            }
            try {
                if (!hjcVar.d.getAndSet(true) && (z = pd0.z((Activity) hjcVar.c.get())) != null) {
                    ViewTreeObserver viewTreeObserver = z.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(hjcVar);
                    }
                }
            } catch (Throwable th2) {
                cw3.a(hjcVar, th2);
            }
        } catch (Throwable th3) {
            cw3.a(hjc.class, th3);
        }
    }

    public static final qbf T(ProfileData profileData, String str, gta gtaVar) {
        String str2;
        String ranking;
        Integer previousRanking;
        Integer currentRanking;
        Integer previousRanking2;
        Integer currentRanking2;
        VoteStatisticsWrapper voteStatistics = profileData.getVoteStatistics();
        VoteStatistics current = voteStatistics != null ? voteStatistics.getCurrent() : null;
        CrowdsourcingAggregates userCrowdsourcingAggregates = profileData.getUserCrowdsourcingAggregates();
        EditorAggregates userEditorScoreAggregates = profileData.getUserEditorScoreAggregates();
        boolean z = str != null && str.equals(profileData.getId());
        int ordinal = gtaVar.ordinal();
        if (ordinal == 0) {
            String str3 = "-";
            DecimalFormat decimalFormat = new DecimalFormat("0.00", new DecimalFormatSymbols(dla.d()));
            decimalFormat.setPositivePrefix("+");
            String id = profileData.getId();
            if (current != null && (ranking = current.getRanking()) != null) {
                str3 = ranking;
            }
            String imageURL = profileData.getImageURL();
            String str4 = imageURL == null ? "" : imageURL;
            String nickname = profileData.getNickname();
            String str5 = nickname == null ? "" : nickname;
            if (current == null || (str2 = current.getTotal()) == null) {
                str2 = "0";
            }
            String str6 = str2;
            String percentage = current != null ? current.getPercentage() : null;
            String format = decimalFormat.format(current != null ? Float.valueOf(current.getRoi()) : 0);
            format.getClass();
            r6 = current != null ? current.getRankingMove() : 0;
            return new qbf(id, str3, str4, str5, z, str6, percentage, format, Integer.valueOf(r6 <= 9999 ? r6 : 9999));
        }
        if (ordinal == 1) {
            Object obj = "-";
            String id2 = profileData.getId();
            if (userCrowdsourcingAggregates != null && (currentRanking = userCrowdsourcingAggregates.getCurrentRanking()) != null) {
                obj = currentRanking;
            }
            String obj2 = obj.toString();
            String imageURL2 = profileData.getImageURL();
            String str7 = imageURL2 == null ? "" : imageURL2;
            String nickname2 = profileData.getNickname();
            String str8 = nickname2 == null ? "" : nickname2;
            Double credibilityScore = profileData.getCredibilityScore();
            String valueOf = String.valueOf(credibilityScore != null ? (int) credibilityScore.doubleValue() : 0);
            CrowdsourcingAggregates userCrowdsourcingAggregates2 = profileData.getUserCrowdsourcingAggregates();
            String valueOf2 = String.valueOf(userCrowdsourcingAggregates2 != null ? wzb.b(userCrowdsourcingAggregates2.getScore()) : 0);
            if (userCrowdsourcingAggregates != null && (previousRanking = userCrowdsourcingAggregates.getPreviousRanking()) != null) {
                Integer num = previousRanking.intValue() > 0 ? previousRanking : null;
                if (num != null) {
                    int intValue = num.intValue();
                    Integer currentRanking3 = userCrowdsourcingAggregates.getCurrentRanking();
                    r6 = intValue - (currentRanking3 != null ? currentRanking3.intValue() : 0);
                }
            }
            return new qbf(id2, obj2, str7, str8, z, null, valueOf, valueOf2, Integer.valueOf(r6 <= 9999 ? r6 : 9999));
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        Object obj3 = "-";
        String id3 = profileData.getId();
        if (userEditorScoreAggregates != null && (currentRanking2 = userEditorScoreAggregates.getCurrentRanking()) != null) {
            obj3 = currentRanking2;
        }
        String obj4 = obj3.toString();
        String imageURL3 = profileData.getImageURL();
        String str9 = imageURL3 == null ? "" : imageURL3;
        String nickname3 = profileData.getNickname();
        String str10 = nickname3 == null ? "" : nickname3;
        EditorAggregates userEditorScoreAggregates2 = profileData.getUserEditorScoreAggregates();
        String valueOf3 = String.valueOf(wzb.b(userEditorScoreAggregates2 != null ? userEditorScoreAggregates2.getScore() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (userEditorScoreAggregates != null && (previousRanking2 = userEditorScoreAggregates.getPreviousRanking()) != null) {
            Integer num2 = previousRanking2.intValue() > 0 ? previousRanking2 : null;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Integer currentRanking4 = userEditorScoreAggregates.getCurrentRanking();
                r6 = intValue2 - (currentRanking4 != null ? currentRanking4.intValue() : 0);
            }
        }
        return new qbf(id3, obj4, str9, str10, z, null, null, valueOf3, Integer.valueOf(r6 <= 9999 ? r6 : 9999));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(sq3 sq3Var) {
        Object obj;
        Object obj2;
        Object obj3;
        CoroutineContext context = sq3Var.getContext();
        bea.u(context);
        rq3 b2 = z9a.b(sq3Var);
        s45 s45Var = b2 instanceof s45 ? (s45) b2 : null;
        if (s45Var == null) {
            obj3 = Unit.a;
        } else {
            au3 au3Var = s45Var.d;
            if (t45.c(au3Var, context)) {
                Object obj4 = Unit.a;
                s45Var.f = obj4;
                s45Var.c = 1;
                au3Var.a0(context, s45Var);
                obj2 = obj4;
            } else {
                qnl qnlVar = new qnl(qnl.c);
                CoroutineContext plus = context.plus(qnlVar);
                obj = Unit.a;
                s45Var.f = obj;
                s45Var.c = 1;
                au3Var.a0(plus, s45Var);
                if (qnlVar.b) {
                    g26 a2 = cgj.a();
                    vg0 vg0Var = a2.e;
                    if (!(vg0Var != null ? vg0Var.isEmpty() : true)) {
                        if (a2.c >= 4294967296L) {
                            s45Var.f = obj;
                            s45Var.c = 1;
                            a2.j0(s45Var);
                            obj3 = lu3.a;
                            return obj3 == lu3.a ? obj3 : obj;
                        }
                        a2.n0(true);
                        try {
                            s45Var.run();
                            do {
                            } while (a2.u0());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    obj3 = Unit.a;
                } else {
                    obj2 = obj;
                }
            }
            obj = obj2;
            obj3 = lu3.a;
            if (obj3 == lu3.a) {
            }
        }
        obj = obj3;
        if (obj3 == lu3.a) {
        }
    }

    public static int W(byte[] bArr, int i, bm2 bm2Var) {
        int b0 = b0(bArr, i, bm2Var);
        int i2 = bm2Var.c;
        if (i2 < 0) {
            throw zzfb.g();
        }
        if (i2 > bArr.length - b0) {
            throw zzfb.h();
        }
        if (i2 == 0) {
            bm2Var.d = zzef.b;
            return b0;
        }
        bm2Var.d = zzef.s(b0, i2, bArr);
        return b0 + i2;
    }

    public static int X(int i, byte[] bArr) {
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int Y(ido idoVar, byte[] bArr, int i, int i2, int i3, bm2 bm2Var) {
        zzev zzd = idoVar.zzd();
        int e0 = e0(zzd, idoVar, bArr, i, i2, i3, bm2Var);
        idoVar.a(zzd);
        bm2Var.d = zzd;
        return e0;
    }

    public static int Z(ido idoVar, int i, byte[] bArr, int i2, int i3, zzez zzezVar, bm2 bm2Var) {
        zzev zzd = idoVar.zzd();
        ido idoVar2 = idoVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        bm2 bm2Var2 = bm2Var;
        int f0 = f0(zzd, idoVar2, bArr2, i2, i4, bm2Var2);
        idoVar2.a(zzd);
        bm2Var2.d = zzd;
        zzezVar.add(zzd);
        while (f0 < i4) {
            bm2 bm2Var3 = bm2Var2;
            int i5 = i4;
            int b0 = b0(bArr2, f0, bm2Var3);
            if (i != bm2Var3.c) {
                break;
            }
            byte[] bArr3 = bArr2;
            ido idoVar3 = idoVar2;
            zzev zzd2 = idoVar3.zzd();
            f0 = f0(zzd2, idoVar3, bArr3, b0, i5, bm2Var3);
            idoVar2 = idoVar3;
            bArr2 = bArr3;
            i4 = i5;
            bm2Var2 = bm2Var3;
            idoVar2.a(zzd2);
            bm2Var2.d = zzd2;
            zzezVar.add(zzd2);
        }
        return f0;
    }

    public static final void a(final double d2, final long j, final xtc xtcVar, of3 of3Var, final int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1086419136);
        if ((i & 6) == 0) {
            i2 = (av8Var.c(d2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.h(false) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            final long f = ljg.f(av8Var, -371729587, R.color.surface_P, av8Var, false);
            final long f2 = ljg.f(av8Var, -371727027, R.color.surface_2, av8Var, false);
            final long D = lz.D(R.color.neutral_default, av8Var);
            xtc d3 = bkh.d(bkh.e(xtcVar, 6.0f), 1.0f);
            boolean f3 = ((i2 & 14) == 4) | av8Var.f(f2) | av8Var.f(f) | av8Var.f(D) | ((i2 & 112) == 32);
            Object O = av8Var.O();
            if (f3 || O == nf3.a) {
                Function1 function1 = new Function1() { // from class: szd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f4;
                        float f5;
                        float f6;
                        long j2;
                        long j3;
                        te2 te2Var = (te2) obj;
                        te2Var.getClass();
                        final float j4 = te2Var.j() * 1.0f;
                        final float j5 = te2Var.j() * 2.0f;
                        final float j6 = te2Var.j() * 3.0f;
                        float j7 = te2Var.j() * 4.0f;
                        float j8 = te2Var.j() * 6.0f;
                        float intBitsToFloat = Float.intBitsToFloat((int) (te2Var.a.n() >> 32));
                        final float intBitsToFloat2 = Float.intBitsToFloat((int) (te2Var.a.n() & 4294967295L));
                        final float f7 = intBitsToFloat / 2.0f;
                        ema layoutDirection = te2Var.a.getLayoutDirection();
                        ema emaVar = ema.a;
                        double d4 = d2;
                        double d5 = layoutDirection == emaVar ? d4 : -d4;
                        double intBitsToFloat3 = d5 * ((Float.intBitsToFloat((int) (te2Var.a.n() >> 32)) / 2.0f) + j5);
                        if (d5 > 0.0d) {
                            float f8 = f7 + j6;
                            f4 = intBitsToFloat;
                            double d6 = j8;
                            if (intBitsToFloat3 < d6) {
                                intBitsToFloat3 = d6;
                            }
                            f6 = ((float) intBitsToFloat3) + f7;
                            j3 = d4 >= 0.999d ? (Float.floatToRawIntBits(j7) << 32) | (Float.floatToRawIntBits(j7) & 4294967295L) : 0L;
                            f5 = f8;
                            j2 = 0;
                        } else {
                            f4 = intBitsToFloat;
                            if (d5 < 0.0d) {
                                double d7 = -j8;
                                if (intBitsToFloat3 > d7) {
                                    intBitsToFloat3 = d7;
                                }
                                float f9 = f7 + ((float) intBitsToFloat3);
                                f6 = f7 - j6;
                                j2 = d4 >= 0.999d ? (Float.floatToRawIntBits(j7) << 32) | (Float.floatToRawIntBits(j7) & 4294967295L) : 0L;
                                f5 = f9;
                                j3 = 0;
                            } else {
                                f5 = f7;
                                f6 = f5;
                                j2 = 0;
                                j3 = 0;
                            }
                        }
                        final b20 a2 = e20.a();
                        float f10 = intBitsToFloat2 / 2.0f;
                        b20.c(a2, new e7g(f5, f10 - 6.0f, f6, f10 + 6.0f, j2, j3, j3, j2));
                        final long j9 = f2;
                        final long j10 = f;
                        final long j11 = D;
                        final long j12 = j;
                        final float f11 = f4;
                        return te2Var.a(new Function1() { // from class: rzd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                b20 b20Var = a2;
                                long j13 = j12;
                                float f12 = j5;
                                ha5 ha5Var = (ha5) obj2;
                                ha5Var.getClass();
                                float f13 = intBitsToFloat2 / 2.0f;
                                long floatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
                                float f14 = f11;
                                ha5.W0(ha5Var, j9, floatToRawIntBits, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), 12.0f, 1, null, 480);
                                float f15 = f7;
                                float f16 = j6;
                                ha5.W0(ha5Var, j10, (Float.floatToRawIntBits(f15 - f16) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f16 + f15) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), 12.0f, 0, null, 496);
                                ha5.W0(ha5Var, j11, (Float.floatToRawIntBits(f15 - r6) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f15 + j4) << 32), 12.0f, 0, null, 496);
                                sx2 L0 = ha5Var.L0();
                                long D2 = L0.D();
                                L0.t().o();
                                try {
                                    ((hpo) L0.a).p(b20Var);
                                    ha5.W0(ha5Var, j13, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(f14 + f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), 12.0f, 0, null, 496);
                                    mz1.v(L0, D2);
                                    return Unit.a;
                                } catch (Throwable th) {
                                    mz1.v(L0, D2);
                                    throw th;
                                }
                            }
                        });
                    }
                };
                av8Var.n0(function1);
                O = function1;
            }
            nq8.h(av8Var, td4.Y(d3, (Function1) O));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: tzd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cga.a(d2, j, xtcVar, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static int a0(int i, byte[] bArr, int i2, int i3, zzha zzhaVar, bm2 bm2Var) {
        if ((i >>> 3) == 0) {
            throw new zzfb("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int d0 = d0(bArr, i2, bm2Var);
            zzhaVar.b(i, Long.valueOf(bm2Var.b));
            return d0;
        }
        if (i4 == 1) {
            zzhaVar.b(i, Long.valueOf(g0(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int b0 = b0(bArr, i2, bm2Var);
            int i5 = bm2Var.c;
            if (i5 < 0) {
                throw zzfb.g();
            }
            if (i5 > bArr.length - b0) {
                throw zzfb.h();
            }
            if (i5 == 0) {
                zzhaVar.b(i, zzef.b);
            } else {
                zzhaVar.b(i, zzef.s(b0, i5, bArr));
            }
            return b0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzfb("Protocol message contained an invalid tag (zero).");
            }
            zzhaVar.b(i, Integer.valueOf(X(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzha a2 = zzha.a();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int b02 = b0(bArr, i2, bm2Var);
            i7 = bm2Var.c;
            if (i7 == i6) {
                i2 = b02;
                break;
            }
            i2 = a0(i7, bArr, b02, i3, a2, bm2Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw new zzfb("Failed to parse the message.");
        }
        zzhaVar.b(i, a2);
        return i2;
    }

    public static final void b(float f, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-709510159);
        int i2 = (av8Var.d(f) ? 4 : 2) | i;
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            kq9.b(s6a.N(R.drawable.ic_arrow_drop_down_16, 6, av8Var), null, bkh.l(haa.v(utc.a, f), 16.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ty6(f, i, i3);
        }
    }

    public static int b0(byte[] bArr, int i, bm2 bm2Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return c0(b2, i2, bm2Var, bArr);
        }
        bm2Var.c = b2;
        return i2;
    }

    public static bga c(Function1 function1) {
        xea xeaVar = yea.d;
        xeaVar.getClass();
        function1.getClass();
        efa efaVar = new efa();
        gfa gfaVar = xeaVar.a;
        efaVar.a = gfaVar.a;
        efaVar.b = gfaVar.f;
        efaVar.c = gfaVar.b;
        efaVar.d = gfaVar.c;
        efaVar.e = gfaVar.e;
        String str = gfaVar.g;
        efaVar.f = str;
        efaVar.g = gfaVar.h;
        efaVar.h = gfaVar.i;
        efaVar.i = gfaVar.k;
        efaVar.j = gfaVar.j;
        efaVar.k = gfaVar.d;
        efaVar.l = xeaVar.b;
        efaVar.m = gfaVar.l;
        function1.invoke(efaVar);
        if (efaVar.e) {
            if (!Intrinsics.c(str, "    ")) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        ogj.h("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str));
                        return null;
                    }
                }
            }
        } else if (!Intrinsics.c(str, "    ")) {
            a70.p("Indent should not be specified when default printing mode is used");
            return null;
        }
        gfa gfaVar2 = new gfa(efaVar.a, efaVar.c, efaVar.d, efaVar.k, efaVar.e, efaVar.b, efaVar.f, efaVar.g, efaVar.h, efaVar.j, efaVar.i, efaVar.m);
        p5c p5cVar = efaVar.l;
        p5cVar.getClass();
        bga bgaVar = new bga(gfaVar2, p5cVar);
        if (p5cVar != h6h.a) {
            p5cVar.f(new r0a(gfaVar2));
        }
        return bgaVar;
    }

    public static int c0(int i, int i2, bm2 bm2Var, byte[] bArr) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        if (b2 >= 0) {
            bm2Var.c = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            bm2Var.c = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bm2Var.c = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bm2Var.c = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                bm2Var.c = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static final void d(vw0 vw0Var, tc3 tc3Var, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        Function2 function2;
        xtc xtcVar2;
        boolean z;
        int i2;
        int i3;
        vw0 vw0Var2 = vw0Var;
        vw0Var2.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(574554552);
        int i4 = i | (av8Var.g(vw0Var2) ? 4 : 2) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.g(bkh.d(utcVar, 1.0f), 56.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f, 8.0f);
            lv1 lv1Var = uxf.m;
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
            String a3 = vw0Var2.b().a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.k(), av8Var, 0, 24960, 110584);
            xtc A = wnn.A(utcVar, o7g.a(8.0f));
            boolean z2 = vw0Var.a() != null;
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
                O2 = o67.z;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, z2, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 7), av8Var, 0);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String a5 = vw0Var.c().a(av8Var);
            dfj g = xth.g();
            vw0Var2 = vw0Var;
            if (vw0Var2 instanceof sw0) {
                i2 = 2061154041;
                i3 = R.color.n_lv_3;
                z = false;
            } else {
                z = false;
                i2 = 2061154521;
                i3 = R.color.n_lv_1;
            }
            udj.c(a5, l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), ljg.f(av8Var, i2, i3, av8Var, z), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, g, av8Var, 48, 24960, 110584);
            av8Var = av8Var;
            function2 = tc3Var;
            function2.invoke(av8Var, 6);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            function2 = tc3Var;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 2, vw0Var2, function2, function0, xtcVar2);
        }
    }

    public static int d0(byte[] bArr, int i, bm2 bm2Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            bm2Var.b = j;
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
        bm2Var.b = j2;
        return i3;
    }

    public static final void e(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(555839063);
        if (av8Var.T(i & 1, i != 0)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc e2 = bkh.e(bkh.d(utcVar, 1.0f), 16.0f);
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e2);
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
            String string = context.getString(R.string.football_rating_impact);
            string.getClass();
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            dfj b2 = xth.b();
            p8g p8gVar = p8g.a;
            udj.c(string, p8gVar.a(0.4f, utcVar, true), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, av8Var, 0, 0, 131064);
            xtc a3 = p8gVar.a(0.6f, utcVar, true);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, a3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            udj.c("-", p8gVar.a(1.0f, utcVar, true), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 6, 0, 130040);
            udj.c("0", p8gVar.a(1.0f, utcVar, true), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 6, 0, 130040);
            udj.c("+", p8gVar.a(1.0f, utcVar, true), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(6), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 6, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mpa(i, 23);
        }
    }

    public static int e0(Object obj, ido idoVar, byte[] bArr, int i, int i2, int i3, bm2 bm2Var) {
        int k = ((b) idoVar).k(obj, bArr, i, i2, i3, bm2Var);
        bm2Var.d = obj;
        return k;
    }

    public static final void f(h9b h9bVar, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        float f;
        float f2;
        String str;
        float f3;
        float f4;
        Integer num = h9bVar.a;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1616467281);
        int i2 = i | (av8Var.g(h9bVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
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
            r9k r9kVar = h9bVar.e;
            fk2 fk2Var = h9bVar.c;
            String str2 = h9bVar.b;
            boolean z = num != null;
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            boolean z2 = z;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = jxa.h;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(bkh.d(tol.y(xtcVar, z2, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 11), av8Var, 0), 1.0f), 16.0f, 8.0f);
            lv1 lv1Var = uxf.m;
            l8g a3 = k8g.a(new ng0(16.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
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
            td4.z(num, bkh.l(utcVar, 40.0f), av8Var, 48);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
                f2 = Float.MAX_VALUE;
            } else {
                f = 1.0f;
                f2 = Float.MAX_VALUE;
            }
            goa goaVar = new goa(f, true);
            u23 a4 = t23.a(new ng0(4.0f, true, new a70(6)), kv1Var, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar);
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
            l8g a5 = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > f2 ? f2 : 1.0f, false);
            if (str2 == null) {
                str = ljg.k(av8Var, 856321526, R.string.coach, av8Var, false);
            } else {
                av8Var.d0(856321278);
                av8Var.s(false);
                str = str2;
            }
            yf8 yf8Var = xth.a;
            udj.c(str, goaVar2, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            if (fk2Var == null) {
                av8Var.d0(776482428);
                av8Var.s(false);
                f3 = 16.0f;
            } else {
                av8Var.d0(776482429);
                f3 = 16.0f;
                kq9.b(s6a.N(fk2Var.a, 6, av8Var), null, bkh.l(utcVar, 16.0f), r13.i, av8Var, V2.b.f, 0);
                av8Var.s(false);
            }
            av8Var.s(true);
            if (h9bVar.d) {
                av8Var.d0(-2026015600);
                if (r9kVar == null) {
                    av8Var.d0(-2026015601);
                    av8Var.s(false);
                    f4 = f3;
                } else {
                    av8Var.d0(-2026015600);
                    f4 = f3;
                    udj.c(r9kVar.a(av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                    av8Var = av8Var;
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                f4 = f3;
                av8Var.d0(-2025578252);
                udj.c(oea.v(str2 != null ? R.string.coach : R.string.value_unknown, av8Var), null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(false);
                Unit unit = Unit.a;
            }
            av8Var.s(true);
            av8Var.s(true);
            if (h9bVar.f) {
                av8Var.d0(-637040176);
                td4.w(l98.f0(utcVar, 72.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
                av8Var.s(false);
            } else {
                av8Var.d0(-636920051);
                av8Var.s(false);
            }
            av8Var.s(true);
            Unit unit2 = Unit.a;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(h9bVar, function0, xtcVar, i, 18);
        }
    }

    public static int f0(Object obj, ido idoVar, byte[] bArr, int i, int i2, bm2 bm2Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = c0(i4, i3, bm2Var, bArr);
            i4 = bm2Var.c;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzfb.h();
        }
        int i6 = i5 + i4;
        idoVar.b(obj, bArr, i5, i6, bm2Var);
        bm2Var.d = obj;
        return i6;
    }

    public static final void g(uzd uzdVar, of3 of3Var, int i) {
        uzdVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-950963809);
        int i2 = 4;
        int i3 = (av8Var.g(uzdVar) ? 4 : 2) | i;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            h(Double.valueOf(uzdVar.a), uzdVar.b, uzdVar.c, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t1d(uzdVar, i, i2);
        }
    }

    public static long g0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static final void h(Double d2, gv9 gv9Var, Gender gender, of3 of3Var, int i) {
        gv9 gv9Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1226234410);
        int i2 = i | (av8Var.g(d2) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.e(gender == null ? -1 : gender.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            long D = lz.D(R.color.surface_P, av8Var);
            jf9 jf9Var = oyn.e;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(n9e.q(utcVar, D, jf9Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
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
            lv1 lv1Var = uxf.m;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
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
            i9a.j(d2, false, false, null, false, true, null, av8Var, (i2 & 14) | 197040, 88);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            String string = context.getString(R.string.football_rating_breakdown);
            string.getClass();
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(string, null, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            w1l.o(1.0f, true, av8Var);
            ImageVector N = s6a.N(R.drawable.ic_info, 6, av8Var);
            long D3 = lz.D(R.color.n_lv_1, av8Var);
            xtc l = bkh.l(utcVar, 24.0f);
            long D4 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = jxa.s;
                av8Var.n0(O2);
            }
            kq9.b(N, "Info", tol.y(l, true, false, true, D4, wzcVar, new gi(19, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), context, gender), av8Var, 0), D3, av8Var, 48, 0);
            av8Var = av8Var;
            av8Var.s(true);
            gv9Var2 = gv9Var;
            i(gv9Var2, null, av8Var, (i2 >> 3) & 14);
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            av8Var.s(true);
        } else {
            gv9Var2 = gv9Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(d2, gv9Var2, gender, i, 6);
        }
    }

    public static final void i(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i) {
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(685111359);
        int i2 = ((i & 6) == 0 ? (av8Var.g(gv9Var) ? 4 : 2) | i : i) | 432;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            bf3.r(12.0f, 1437285812, av8Var, av8Var, utcVar);
            e(0, av8Var);
            av8Var.s(false);
            nq8.h(av8Var, bkh.e(utcVar, 12.0f));
            av8Var.d0(-369272513);
            int i3 = 0;
            for (Object obj : gv9Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                k((qzd) obj, av8Var, (i2 >> 3) & 112);
                if (i3 != gv9Var.size() - 1) {
                    bf3.r(16.0f, 907316213, av8Var, av8Var, utcVar);
                    av8Var.s(false);
                } else {
                    av8Var.d0(907386366);
                    av8Var.s(false);
                }
                i3 = i4;
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new j73(gv9Var, xtcVar, i, 5);
        }
    }

    public static final void j(dze dzeVar, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        int i2;
        int i3;
        dfj dfjVar;
        boolean z;
        int i4;
        int i5;
        final dze dzeVar2 = dzeVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-522918737);
        int i6 = i | (av8Var.i(dzeVar2) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i6 & 1, (i6 & 19) != 18)) {
            final gv9 gv9Var = dzeVar2.a;
            boolean z2 = dzeVar2.g;
            boolean z3 = av8Var.k(dh3.n) == ema.b;
            final long D = lz.D(R.color.secondary_highlight, av8Var);
            final long D2 = lz.D(R.color.primary_highlight, av8Var);
            final long D3 = lz.D(R.color.n_lv_5, av8Var);
            final long D4 = lz.D(R.color.home_primary, av8Var);
            final long D5 = lz.D(R.color.away_primary, av8Var);
            final long D6 = lz.D(R.color.secondary_default_40, av8Var);
            final long D7 = lz.D(R.color.away_primary_40, av8Var);
            final long D8 = lz.D(R.color.n_lv_1, av8Var);
            final long D9 = lz.D(R.color.live, av8Var);
            final long D10 = lz.D(R.color.value, av8Var);
            final jej Q = h5a.Q(2, 6, 0, av8Var);
            yf8 yf8Var = xth.a;
            dfj l = xth.l();
            if (z2) {
                i2 = -13707847;
                i3 = R.color.value;
            } else {
                i2 = -13707336;
                i3 = R.color.n_lv_1;
            }
            dfj a2 = dfj.a(l, ljg.f(av8Var, i2, i3, av8Var, false), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            dfj l2 = xth.l();
            if (z2) {
                i4 = -13704037;
                i5 = R.color.value_60;
                dfjVar = a2;
                z = false;
            } else {
                dfjVar = a2;
                z = false;
                i4 = -13703464;
                i5 = R.color.n_lv_3;
            }
            final dfj a3 = dfj.a(l2, ljg.f(av8Var, i4, i5, av8Var, z), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            final dfj a4 = dfj.a(xth.l(), lz.D(R.color.live, av8Var), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            boolean g = av8Var.g(dfjVar) | av8Var.f(D9) | av8Var.i(dzeVar2) | av8Var.h(z3) | av8Var.f(D) | av8Var.f(D2) | av8Var.i(gv9Var) | av8Var.f(D4) | av8Var.f(D5) | av8Var.f(D3) | av8Var.g(Q) | av8Var.g(a4) | av8Var.f(D10) | av8Var.f(D8) | av8Var.f(D6) | av8Var.f(D7) | av8Var.g(a3);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                dzeVar2 = dzeVar;
                final boolean z4 = z3;
                final dfj dfjVar2 = dfjVar;
                O = new Function1() { // from class: wze
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        long j;
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        final float H0 = ha5Var.H0(32.0f);
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                        final dze dzeVar3 = dze.this;
                        gv9 gv9Var2 = dzeVar3.a;
                        boolean z5 = dzeVar3.g;
                        final float b2 = (1.0f - llf.b(yid.m(((EventGraphPoint) CollectionsKt.j0(gv9Var2)) != null ? Integer.valueOf(r6.getSequence()) : null) / dzeVar3.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)) * intBitsToFloat;
                        final long j2 = D;
                        final long j3 = D2;
                        final gv9 gv9Var3 = gv9Var;
                        final long j4 = D4;
                        final long j5 = D5;
                        final long j6 = D3;
                        Function1 function1 = new Function1() { // from class: xze
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ha5 ha5Var2;
                                long j7 = j2;
                                long j8 = j3;
                                gv9 gv9Var4 = gv9Var3;
                                long j9 = j4;
                                long j10 = j5;
                                dze dzeVar4 = dzeVar3;
                                long j11 = j6;
                                ha5 ha5Var3 = (ha5) obj2;
                                ha5Var3.getClass();
                                hpo hpoVar = (hpo) ha5Var3.L0().a;
                                float f = H0;
                                float f2 = b2;
                                hpoVar.y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, f);
                                try {
                                    cga.s(ha5Var3, j7, j8);
                                    int i7 = dzeVar4.e;
                                    ha5Var2 = ha5Var3;
                                    try {
                                        cga.t(ha5Var2, gv9Var4, j9, j10, i7);
                                        float f3 = -f;
                                        ((hpo) ha5Var2.L0().a).y(-0.0f, f3, -f2, f3);
                                        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - f2;
                                            ((hpo) ha5Var2.L0().a).y(intBitsToFloat2, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
                                            try {
                                                ha5.o0(ha5Var2, j11, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                            } finally {
                                                ((hpo) ha5Var2.L0().a).y(-intBitsToFloat2, f3, -0.0f, f3);
                                            }
                                        }
                                        return Unit.a;
                                    } catch (Throwable th) {
                                        th = th;
                                        float f4 = -f;
                                        ((hpo) ha5Var2.L0().a).y(-0.0f, f4, -f2, f4);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    ha5Var2 = ha5Var3;
                                }
                            }
                        };
                        boolean z6 = z4;
                        cga.I(ha5Var, z6, function1);
                        boolean z7 = dzeVar3.d;
                        jej jejVar = Q;
                        if (z7) {
                            cga.I(ha5Var, z6, new l65(D9, 2, b2));
                            EventGraphPoint eventGraphPoint = (EventGraphPoint) CollectionsKt.j0(gv9Var2);
                            int m = yid.m(eventGraphPoint != null ? Integer.valueOf(eventGraphPoint.getValue()) : null);
                            EventGraphPoint eventGraphPoint2 = (EventGraphPoint) CollectionsKt.a0(gv9Var2.size() - 2, gv9Var2);
                            int m2 = m - yid.m(eventGraphPoint2 != null ? Integer.valueOf(eventGraphPoint2.getValue()) : null);
                            int i7 = dzeVar3.b;
                            boolean z8 = m2 > 0;
                            dfj dfjVar3 = a4;
                            cga.u(ha5Var, true, i7, z8, b2, jejVar, dfjVar3, z6);
                            cga.u(ha5Var, false, dzeVar3.c, m2 < 0, b2, jejVar, dfjVar3, z6);
                        } else {
                            int i8 = dzeVar3.b;
                            int i9 = dzeVar3.c;
                            boolean z9 = i8 > i9;
                            boolean z10 = i9 > i8;
                            long j7 = D10;
                            long j8 = D8;
                            long j9 = (z9 && z5) ? j7 : z9 ? j8 : D6;
                            if (!z10 || !z5) {
                                if (z10) {
                                    j = j8;
                                    cga.I(ha5Var, z6, new k76(j9, j, 3));
                                    int i10 = dzeVar3.b;
                                    dfj dfjVar4 = dfjVar2;
                                    dfj dfjVar5 = a3;
                                    cga.w(ha5Var, true, i10, b2, jejVar, !z9 ? dfjVar4 : dfjVar5, z6);
                                    cga.w(ha5Var, false, dzeVar3.c, b2, jejVar, !z10 ? dfjVar4 : dfjVar5, z6);
                                } else {
                                    j7 = D7;
                                }
                            }
                            j = j7;
                            cga.I(ha5Var, z6, new k76(j9, j, 3));
                            int i102 = dzeVar3.b;
                            dfj dfjVar42 = dfjVar2;
                            dfj dfjVar52 = a3;
                            cga.w(ha5Var, true, i102, b2, jejVar, !z9 ? dfjVar42 : dfjVar52, z6);
                            cga.w(ha5Var, false, dzeVar3.c, b2, jejVar, !z10 ? dfjVar42 : dfjVar52, z6);
                        }
                        return Unit.a;
                    }
                };
                av8Var = av8Var;
                av8Var.n0(O);
            } else {
                dzeVar2 = dzeVar;
            }
            xtcVar2 = xtcVar;
            lz.d((i6 >> 3) & 14, av8Var, xtcVar2, (Function1) O);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gme(dzeVar2, xtcVar2, i, 9);
        }
    }

    public static final void k(qzd qzdVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1074381166);
        if ((i & 6) == 0) {
            i2 = i | (av8Var.g(qzdVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(false) ? 32 : 16;
        }
        int i3 = i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            xtc d2 = bkh.d(utc.a, 1.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            String str = qzdVar.a;
            long f = ljg.f(av8Var, -1233606409, R.color.n_lv_1, av8Var, false);
            yf8 yf8Var = xth.a;
            dfj e2 = xth.e();
            if (0.4f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            udj.c(str, new goa(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true), f, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e2, av8Var, 0, 0, 131064);
            av8Var = av8Var;
            double d3 = qzdVar.b;
            long D = lz.D(d3 < -0.5d ? R.color.rating_10 : d3 < 0.0d ? R.color.rating_60 : d3 < 0.25d ? R.color.rating_65 : d3 < 0.5d ? R.color.rating_70 : d3 < 0.75d ? R.color.rating_80 : R.color.rating_90, av8Var);
            if (0.6f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            float f2 = 0.6f;
            if (0.6f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            a(d3, D, new goa(f2, true), av8Var, (i3 << 6) & 7168);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(qzdVar, i, 11);
        }
    }

    public static final void l(Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1066521975);
        int i2 = (av8Var2.i(function0) ? 4 : 2) | i;
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            xtc A = wnn.A(bkh.l(utc.a, 20.0f), o7g.a);
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
                O2 = mce.z;
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            kq9.b(s6a.N(R.drawable.ic_remove_no_padding, 6, av8Var), null, tol.y(A, true, true, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), 5), av8Var, 0), lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f91(i, 10, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r76v2, types: [rq3] */
    public static final void m(final bfc bfcVar, final gv9 gv9Var, final Function1 function1, xtc xtcVar, xtc xtcVar2, final String str, Function1 function12, final boolean z, boolean z2, boolean z3, boolean z4, long j, dfj dfjVar, int i, int i2, int i3, final int i4, final oqf oqfVar, final boolean z5, of3 of3Var, final int i5, final int i6) {
        Function1 function13;
        int i7;
        final xtc xtcVar3;
        final xtc xtcVar4;
        final boolean z6;
        final boolean z7;
        final long j2;
        final dfj dfjVar2;
        final int i8;
        final int i9;
        final int i10;
        final Function1 function14;
        av8 av8Var;
        final boolean z8;
        xtc xtcVar5;
        dfj dfjVar3;
        String str2;
        xtc xtcVar6;
        int i11;
        int i12;
        boolean z9;
        boolean z10;
        int i13;
        long j3;
        final boolean z11;
        dfj dfjVar4;
        int i14;
        Object W;
        final scj scjVar;
        Function1 function15;
        final e1d e1dVar;
        e1d e1dVar2;
        gv9Var.getClass();
        function1.getClass();
        ?? r10 = (av8) of3Var;
        r10.f0(28746189);
        int i15 = i5 | (r10.g(bfcVar) ? 4 : 2) | (r10.g(gv9Var) ? 32 : 16) | (r10.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 27648 | (r10.g(str) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i16 = 1572864 | i15;
        int i17 = i6 & 128;
        if (i17 != 0) {
            i7 = i15 | 14155776;
            function13 = function12;
        } else {
            function13 = function12;
            i7 = i16 | (r10.i(function13) ? 8388608 : 4194304);
        }
        int i18 = i7 | 100663296 | (r10.h(z) ? 536870912 : 268435456);
        int i19 = 54 | (r10.g(oqfVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (r10.h(z5) ? a.o : 1024);
        if (r10.T(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 1171) == 1170) ? false : true)) {
            r10.Y();
            if ((i5 & 1) == 0 || r10.B()) {
                if (i17 != 0) {
                    function13 = null;
                }
                long D = lz.D(R.color.surface_2, r10);
                yf8 yf8Var = xth.a;
                dfj a2 = dfj.a(xth.d(), lz.D(R.color.n_lv_1, r10), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                xtcVar5 = utc.a;
                dfjVar3 = a2;
                str2 = null;
                xtcVar6 = xtcVar5;
                i11 = Integer.MAX_VALUE;
                i12 = 1;
                z9 = true;
                z10 = true;
                i13 = 7;
                j3 = D;
                z11 = true;
            } else {
                r10.W();
                xtcVar6 = xtcVar;
                xtcVar5 = xtcVar2;
                z9 = z2;
                z11 = z4;
                j3 = j;
                dfjVar3 = dfjVar;
                i12 = i;
                i13 = i2;
                i11 = i3;
                str2 = null;
                z10 = z3;
            }
            r10.t();
            final wd8 wd8Var = (wd8) r10.k(dh3.i);
            Function1 function16 = function13;
            Object O = r10.O();
            final int i20 = i12;
            Object obj = nf3.a;
            if (O == obj) {
                O = hz8.G(g.a, r10);
                r10.n0(O);
            }
            final ku3 ku3Var = (ku3) O;
            final boolean z12 = z9;
            boolean z13 = (i18 & 14) == 4;
            Object O2 = r10.O();
            if (z13 || O2 == obj) {
                String str3 = bfcVar != null ? bfcVar.c : str2;
                if (str3 == null) {
                    str3 = "";
                }
                O2 = str3;
                r10.n0(O2);
            }
            final String str4 = (String) O2;
            scj D2 = w1a.D(str4, r10, 0);
            final dfj dfjVar5 = dfjVar3;
            Object[] objArr = new Object[0];
            Object O3 = r10.O();
            if (O3 == obj) {
                O3 = new b7h(19);
                r10.n0(O3);
            }
            e1d e1dVar3 = (e1d) o3a.N(objArr, (Function0) O3, r10, 48);
            Object O4 = r10.O();
            if (O4 == obj) {
                O4 = e.f(Boolean.FALSE);
                r10.n0(O4);
            }
            e1d e1dVar4 = (e1d) O4;
            Object O5 = r10.O();
            if (O5 == obj) {
                O5 = e.f(Boolean.FALSE);
                r10.n0(O5);
            }
            final e1d e1dVar5 = (e1d) O5;
            final boolean z14 = z10;
            final cdi b2 = a60.b(((Boolean) e1dVar4.getValue()).booleanValue() ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(400, 0, jg5.a, 2), "dropdown_arrow_rotation_animation", r10, 3072, 20);
            final boolean z15 = (((Boolean) e1dVar3.getValue()).booleanValue() || D2.c().c.length() != 0 || str == null) ? false : true;
            yf8 yf8Var2 = xth.a;
            dfj a3 = dfj.a(xth.d(), lz.D(R.color.n_lv_3, r10), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            boolean g = ((i18 & 112) == 32) | r10.g(D2.c().c);
            Object O6 = r10.O();
            if (g || O6 == obj) {
                if (D2.c().c.length() < i4) {
                    W = rlh.b;
                    dfjVar4 = a3;
                    i14 = i11;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = gv9Var.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Iterator it2 = it;
                        dfj dfjVar6 = a3;
                        if (StringsKt.J(((bfc) next).c, D2.c().c.toString(), true)) {
                            arrayList.add(next);
                        }
                        it = it2;
                        a3 = dfjVar6;
                    }
                    dfjVar4 = a3;
                    i14 = i11;
                    W = l6g.W(CollectionsKt.L0(arrayList, i14));
                }
                r10.n0(W);
            } else {
                W = O6;
                dfjVar4 = a3;
                i14 = i11;
            }
            final gv9 gv9Var2 = (gv9) W;
            boolean g2 = r10.g(D2) | ((29360128 & i18) == 8388608) | r10.g(e1dVar3);
            Object O7 = r10.O();
            if (g2 || O7 == obj) {
                O7 = new mj5(D2, function16, i4, e1dVar3, e1dVar4, (rq3) null, 11);
                scjVar = D2;
                function15 = function16;
                e1dVar = e1dVar3;
                e1dVar2 = e1dVar4;
                r10.n0(O7);
            } else {
                function15 = function16;
                e1dVar = e1dVar3;
                scjVar = D2;
                e1dVar2 = e1dVar4;
            }
            hz8.o(r10, scjVar, (Function2) O7);
            boolean g3 = r10.g(str4) | r10.g(scjVar);
            Object O8 = r10.O();
            if (g3 || O8 == obj) {
                O8 = new k50(str4, scjVar, e1dVar5, str2, 26);
                r10.n0(O8);
            }
            hz8.o(r10, str4, (Function2) O8);
            boolean z16 = ((Boolean) e1dVar2.getValue()).booleanValue() && !gv9Var2.isEmpty();
            boolean g4 = r10.g(scjVar) | ((i18 & 896) == 256) | r10.i(wd8Var);
            Object O9 = r10.O();
            if (g4 || O9 == obj) {
                O9 = new ke(scjVar, function1, e1dVar5, wd8Var, e1dVar2);
                r10.n0(O9);
            }
            Function1 function17 = (Function1) O9;
            Object O10 = r10.O();
            int i21 = 18;
            if (O10 == obj) {
                O10 = new tra(i21, e1dVar2);
                r10.n0(O10);
            }
            Function0 function0 = (Function0) O10;
            boolean i22 = r10.i(wd8Var);
            Object O11 = r10.O();
            if (i22 || O11 == obj) {
                O11 = new deh(6, wd8Var, e1dVar2);
                r10.n0(O11);
            }
            final e1d e1dVar6 = e1dVar2;
            av8Var = r10;
            final int i23 = i13;
            final long j4 = j3;
            final dfj dfjVar7 = dfjVar4;
            final xtc xtcVar7 = xtcVar5;
            i8 = i20;
            int i24 = i19 << 18;
            xtc xtcVar8 = xtcVar6;
            i9a.c(gv9Var2, function17, z16, function0, (Function0) O11, xtcVar8, null, oqfVar, z5, yqo.H(-1589573472, av8Var, new Function2() { // from class: iph
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    abj abjVar;
                    xtc xtcVar9;
                    Object gjVar;
                    e1d e1dVar7;
                    e1d e1dVar8;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                        kja kjaVar = new kja(0, i20, i23, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
                        wd8 wd8Var2 = wd8Var;
                        boolean i25 = av8Var2.i(wd8Var2);
                        Object O12 = av8Var2.O();
                        e1d e1dVar9 = e1dVar6;
                        a99 a99Var = nf3.a;
                        if (i25 || O12 == a99Var) {
                            O12 = new hph(wd8Var2, e1dVar9);
                            av8Var2.n0(O12);
                        }
                        fja fjaVar = (fja) O12;
                        boolean z17 = z12;
                        dfj dfjVar8 = z17 ? dfjVar5 : dfjVar7;
                        pvh pvhVar = new pvh(lz.D(R.color.n_lv_3, av8Var2));
                        boolean z18 = z14;
                        if (z18) {
                            abjVar = dti.h;
                        } else {
                            abj.B7.getClass();
                            abjVar = kpg.h;
                        }
                        xtc d2 = bkh.d(xtcVar7, 1.0f);
                        e1d e1dVar10 = e1dVar;
                        boolean g5 = av8Var2.g(e1dVar10);
                        ku3 ku3Var2 = ku3Var;
                        boolean i26 = g5 | av8Var2.i(ku3Var2);
                        scj scjVar2 = scjVar;
                        boolean g6 = i26 | av8Var2.g(scjVar2);
                        gv9 gv9Var3 = gv9Var2;
                        boolean g7 = g6 | av8Var2.g(gv9Var3);
                        String str5 = str4;
                        boolean g8 = g7 | av8Var2.g(str5);
                        Object O13 = av8Var2.O();
                        e1d e1dVar11 = e1dVar5;
                        if (g8 || O13 == a99Var) {
                            xtcVar9 = d2;
                            e1dVar7 = e1dVar11;
                            e1dVar8 = e1dVar9;
                            gjVar = new gj(ku3Var2, gv9Var3, scjVar2, str5, e1dVar10, e1dVar8, e1dVar7);
                            av8Var2.n0(gjVar);
                        } else {
                            gjVar = O13;
                            xtcVar9 = d2;
                            e1dVar7 = e1dVar11;
                            e1dVar8 = e1dVar9;
                        }
                        yo1.b(scjVar2, kik.L(xtcVar9, (Function1) gjVar), z17, null, dfjVar8, kjaVar, fjaVar, abjVar, pvhVar, new oph(bfcVar, z, scjVar2, z15, str, z17, j4, z18, z11, function1, wd8Var2, e1dVar7, e1dVar8, b2, e1dVar10), null, av8Var2, 0, 0, 22040);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, (234881024 & i24) | 1772544 | (i24 & 1879048192));
            xtcVar3 = xtcVar8;
            z6 = z12;
            xtcVar4 = xtcVar7;
            z8 = z14;
            dfjVar2 = dfjVar5;
            j2 = j4;
            z7 = z11;
            i9 = i23;
            i10 = i14;
            function14 = function15;
        } else {
            r10.W();
            xtcVar3 = xtcVar;
            xtcVar4 = xtcVar2;
            z6 = z2;
            z7 = z4;
            j2 = j;
            dfjVar2 = dfjVar;
            i8 = i;
            i9 = i2;
            i10 = i3;
            function14 = function13;
            av8Var = r10;
            z8 = z3;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(gv9Var, function1, xtcVar3, xtcVar4, str, function14, z, z6, z8, z7, j2, dfjVar2, i8, i9, i10, i4, oqfVar, z5, i5, i6) { // from class: jph
                public final /* synthetic */ gv9 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ xtc d;
                public final /* synthetic */ xtc e;
                public final /* synthetic */ String f;
                public final /* synthetic */ Function1 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ long l;
                public final /* synthetic */ dfj m;
                public final /* synthetic */ int n;
                public final /* synthetic */ int o;
                public final /* synthetic */ int p;
                public final /* synthetic */ int q;
                public final /* synthetic */ oqf r;
                public final /* synthetic */ boolean s;
                public final /* synthetic */ int t;

                {
                    this.t = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int K = aba.K(1);
                    cga.m(bfc.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (of3) obj2, K, this.t);
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(List list, Object obj, zvj zvjVar, zvj zvjVar2, int i, int i2) {
        list.getClass();
        int[] iArr = zvjVar != null ? zvjVar.a : null;
        int[] iArr2 = zvjVar2 != null ? zvjVar2.a : null;
        if (iArr != null && iArr2 != null) {
            int[] p = mh0.p(iArr, iArr2);
            LinkedHashSet linkedHashSet = new LinkedHashSet(sub.c(p.length));
            for (int i3 : p) {
                linkedHashSet.add(Integer.valueOf(i3));
            }
            iArr = CollectionsKt.R0(CollectionsKt.G0(CollectionsKt.S0(linkedHashSet)));
        } else if (iArr == null && iArr2 != null) {
            iArr = iArr2;
        } else if (iArr == null || iArr2 != null) {
            a70.p("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
            return;
        }
        if (obj == null) {
            return;
        }
        list.add(new zvj(iArr, kotlin.collections.a.c(obj), i, kotlin.collections.a.c(Integer.valueOf(i2))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long o(int i, int i2, int i3, long j) {
        int i4;
        int g = pej.g(j);
        int f = pej.f(j);
        if (f < i) {
            return j;
        }
        if (g > i || i2 > f) {
            if (g > i && f < i2) {
                i += i3;
                g = i;
            } else if (g >= i2) {
                i4 = i3 - (i2 - i);
            } else if (i < g) {
                g = i + i3;
                i = (i3 - (i2 - i)) + f;
            }
            return t6a.g(g, i);
        }
        i4 = i3 - (i2 - i);
        g += i4;
        i = f + i4;
        return t6a.g(g, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void p(View view, View view2, String str) {
        HashSet hashSet;
        Field field;
        Field field2;
        Object obj;
        view.getClass();
        str.getClass();
        int hashCode = view.hashCode();
        HashSet hashSet2 = auk.e;
        HashSet hashSet3 = null;
        if (!cw3.a.contains(auk.class)) {
            try {
                hashSet = auk.e;
            } catch (Throwable th) {
                cw3.a(auk.class, th);
            }
            if (hashSet.contains(Integer.valueOf(hashCode))) {
                auk aukVar = new auk(view, view2, str);
                if (!cw3.a.contains(xsk.class)) {
                    try {
                        try {
                            field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                            try {
                                field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                            } catch (ClassNotFoundException | NoSuchFieldException unused) {
                                field2 = null;
                                if (field != null) {
                                }
                                view.setOnClickListener(aukVar);
                                if (!cw3.a.contains(auk.class)) {
                                }
                                hashSet3.add(Integer.valueOf(hashCode));
                                return;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                            field = null;
                        }
                        if (field != null || field2 == null) {
                            view.setOnClickListener(aukVar);
                        } else {
                            field.setAccessible(true);
                            field2.setAccessible(true);
                            try {
                                field.setAccessible(true);
                                obj = field.get(view);
                            } catch (IllegalAccessException unused3) {
                                obj = null;
                            }
                            if (obj == null) {
                                view.setOnClickListener(aukVar);
                            } else {
                                field2.set(obj, aukVar);
                            }
                        }
                    } catch (Exception unused4) {
                    } catch (Throwable th2) {
                        cw3.a(xsk.class, th2);
                    }
                }
                if (!cw3.a.contains(auk.class)) {
                    try {
                        hashSet3 = auk.e;
                    } catch (Throwable th3) {
                        cw3.a(auk.class, th3);
                    }
                }
                hashSet3.add(Integer.valueOf(hashCode));
                return;
            }
            return;
        }
        hashSet = null;
        if (hashSet.contains(Integer.valueOf(hashCode))) {
        }
    }

    public static boolean q(w6 w6Var, Map.Entry entry) {
        entry.getClass();
        V v = w6Var.get(entry.getKey());
        return v != 0 ? v.equals(entry.getValue()) : entry.getValue() == null && w6Var.containsKey(entry.getKey());
    }

    public static final void s(ha5 ha5Var, long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
        ha5.o0(ha5Var, j, 0L, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
        float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
        ha5.o0(ha5Var, j2, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
    }

    public static final void t(ha5 ha5Var, gv9 gv9Var, long j, long j2, int i) {
        EventGraphPoint eventGraphPoint = (EventGraphPoint) CollectionsKt.j0(gv9Var);
        if (eventGraphPoint != null) {
            int sequence = eventGraphPoint.getSequence();
            float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) / 2.0f;
            b20 a2 = e20.a();
            a2.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat);
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                EventGraphPoint eventGraphPoint2 = (EventGraphPoint) it.next();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                float sequence2 = (intBitsToFloat2 * eventGraphPoint2.getSequence()) / sequence;
                float value = (0.5f - (eventGraphPoint2.getValue() / i)) * Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(sequence2) << 32) | (Float.floatToRawIntBits(value) & 4294967295L);
                a2.f(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
            }
            a2.f(Float.intBitsToFloat((int) (ha5Var.n() >> 32)), intBitsToFloat);
            a2.d();
            b20 a3 = e20.a();
            b20.b(a3, jca.q(0L, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)));
            sx2 L0 = ha5Var.L0();
            long D = L0.D();
            L0.t().o();
            try {
                ((hpo) L0.a).p(a3);
                ha5.X0(ha5Var, a2, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                L0.t().h();
                L0.N(D);
                b20 a4 = e20.a();
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
                float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                b20.b(a4, jca.q(floatToRawIntBits2, (4294967295L & Float.floatToRawIntBits(intBitsToFloat4)) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)));
                L0 = ha5Var.L0();
                D = L0.D();
                L0.t().o();
                try {
                    ((hpo) L0.a).p(a4);
                    ha5.X0(ha5Var, a2, j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                } finally {
                }
            } finally {
            }
        }
    }

    public static final void u(ha5 ha5Var, boolean z, int i, boolean z2, float f, jej jejVar, dfj dfjVar, boolean z3) {
        aej a2 = jej.a(jejVar, z2 ? mz1.i(i, "●") : String.valueOf(i), dfjVar, 1020);
        long j = a2.c;
        long j2 = jej.a(jejVar, String.valueOf(i), dfjVar, 1020).c;
        float H0 = z ? ha5Var.H0(8.0f) : (Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - ha5Var.H0(8.0f)) - ((int) (j2 & 4294967295L));
        float intBitsToFloat = (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - f) - (((int) (j2 >> 32)) / 2);
        float f2 = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - f2;
        if (intBitsToFloat2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            intBitsToFloat2 = 0.0f;
        }
        float b2 = llf.b(intBitsToFloat, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2);
        if (z3) {
            b2 = (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - b2) - f2;
        }
        o6a.w(ha5Var, a2, dfjVar.c(), (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 248);
    }

    public static final void v(ha5 ha5Var, boolean z, long j) {
        float H0 = ha5Var.H0(32.0f);
        float H02 = ha5Var.H0(8.0f);
        float H03 = ha5Var.H0(1.0f);
        float H04 = ha5Var.H0(1.0f) / 2.0f;
        float f = z ? H04 : -H04;
        if (!z) {
            H0 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - H0;
        }
        float f2 = H0;
        float f3 = z ? f2 - H02 : f2 + H02;
        float f4 = f + f2;
        ha5.W0(ha5Var, j, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() >> 32))) << 32), H03, 0, null, 496);
        ha5.W0(ha5Var, j, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H04) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - H04) << 32), H03, 0, null, 496);
    }

    public static final void w(ha5 ha5Var, boolean z, int i, float f, jej jejVar, dfj dfjVar, boolean z2) {
        aej a2 = jej.a(jejVar, String.valueOf(i), dfjVar, 1020);
        long j = a2.c;
        float H0 = z ? ha5Var.H0(8.0f) : (Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L)) - ha5Var.H0(8.0f)) - ((int) (j & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - f;
        float f2 = intBitsToFloat - (r12 / 2);
        float f3 = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - f3;
        if (intBitsToFloat2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            intBitsToFloat2 = 0.0f;
        }
        float b2 = llf.b(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2);
        if (z2) {
            b2 = (Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - b2) - f3;
        }
        o6a.w(ha5Var, a2, dfjVar.c(), (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 248);
    }

    public static String y(URL url, String[] strArr) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        byteArrayOutputStream2 = null;
        r0 = null;
        String str = null;
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                InputStream inputStream = uRLConnection.getInputStream();
                if (strArr != null && strArr.length > 0) {
                    strArr[0] = uRLConnection.getURL().toString();
                }
                bufferedInputStream2 = new BufferedInputStream(inputStream, 4096);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(4096);
                    try {
                        byte[] bArr = new byte[4096];
                        for (int i = 0; i != -1; i = bufferedInputStream2.read(bArr)) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        String byteArrayOutputStream3 = byteArrayOutputStream.toString();
                        byteArrayOutputStream.close();
                        bufferedInputStream2.close();
                        return byteArrayOutputStream3;
                    } catch (IOException unused) {
                        if (byteArrayOutputStream != null) {
                            str = byteArrayOutputStream.toString();
                            byteArrayOutputStream.close();
                        }
                        if (bufferedInputStream2 != null) {
                            bufferedInputStream2.close();
                        }
                        return str;
                    } catch (Throwable th) {
                        bufferedInputStream = bufferedInputStream2;
                        th = th;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.toString();
                                byteArrayOutputStream2.close();
                            } catch (IOException unused2) {
                                throw th;
                            }
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    bufferedInputStream = bufferedInputStream2;
                    th = th2;
                }
            } catch (IOException unused4) {
                return str;
            }
        } catch (IOException unused5) {
            bufferedInputStream2 = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    public static final boolean z(UniqueStage uniqueStage) {
        Category category;
        return !(uniqueStage == null || (category = uniqueStage.getCategory()) == null || category.getId() != 36) || G(uniqueStage);
    }

    public abstract int V(o7p o7pVar);

    public abstract String r(int i, int i2, byte[] bArr);

    public abstract int x(String str, byte[] bArr, int i, int i2);
}
