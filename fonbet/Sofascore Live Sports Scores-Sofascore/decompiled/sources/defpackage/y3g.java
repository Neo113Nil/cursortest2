package defpackage;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C4427z5;
import com.ironsource.L6;
import com.ironsource.Q3;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class y3g implements qh2, uqg, SuccessContinuation, hni, zhh, wd4, tti, m75, kli, nzg, ozg, kpd {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public y3g(Context context, int i) {
        this.a = i;
        byte b = 0;
        switch (i) {
            case 4:
                eee eeeVar = new eee(b, 27);
                context.getClass();
                this.b = context;
                this.c = eeeVar;
                break;
            case 5:
                context.getClass();
                WebView webView = new WebView(context);
                this.b = webView;
                this.c = webView;
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                webView.setScrollBarStyle(33554432);
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
                break;
            default:
                j9g j9gVar = new j9g(23);
                context.getClass();
                this.b = context;
                this.c = j9gVar;
                break;
        }
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        StageDetailsResultsFragment stageDetailsResultsFragment = (StageDetailsResultsFragment) this.b;
        r3i D = stageDetailsResultsFragment.D();
        if (D != null) {
            ShapeableImageView shapeableImageView = D.c;
            Resources resources = ((ShapeableImageView) this.c).getResources();
            resources.getClass();
            shapeableImageView.setImageDrawable(rfo.t(nr9Var, resources));
        }
        r3i D2 = stageDetailsResultsFragment.D();
        if (D2 != null) {
            tgj.p(D2.c, 0L, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [nig] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Class[], java.lang.Object[], ogg] */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v10, types: [qgg] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01ca -> B:13:0x01db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x02b4 -> B:20:0x02c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(Class cls, List list, pgg pggVar, mjg mjgVar, pig pigVar, qcg qcgVar, sq3 sq3Var) {
        mag magVar;
        int i;
        Object obj;
        mag magVar2;
        ArrayList<Pair> arrayList;
        String str;
        wbc wbcVar;
        Iterator it;
        mjg mjgVar2;
        pig pigVar2;
        qcg qcgVar2;
        pgg pggVar2;
        tgg tggVar;
        Class cls2;
        y3g y3gVar;
        String str2;
        mag magVar3;
        mjg mjgVar3;
        tgg tggVar2;
        ArrayList arrayList2;
        ?? r13;
        Iterator it2;
        pig pigVar3;
        qcg qcgVar3;
        jag jagVar;
        y3g y3gVar2;
        Class cls3;
        pgg pggVar3;
        Exception e;
        ArrayList<Pair> arrayList3;
        pgg pggVar4;
        qij e2;
        String str3;
        pgg pggVar5;
        pig pigVar4;
        qcg qcgVar4;
        jag jagVar2;
        wbc wbcVar2;
        ArrayList arrayList4;
        wbc wbcVar3;
        pig pigVar5;
        ArrayList arrayList5;
        Function2 function2;
        y3g y3gVar3;
        ?? r14;
        pgg pggVar6;
        ?? r11;
        int intValue;
        Class cls4;
        y3g y3gVar4;
        gcg gcgVar;
        kag kagVar;
        Class cls5;
        if (sq3Var instanceof mag) {
            magVar = (mag) sq3Var;
            int i2 = magVar.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                magVar.G = i2 - Integer.MIN_VALUE;
                Object obj2 = magVar.E;
                lu3 lu3Var = lu3.a;
                i = magVar.G;
                String str4 = "\n";
                if (i == 0) {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kagVar = magVar.D;
                    gcg gcgVar2 = magVar.C;
                    jagVar = magVar.B;
                    it2 = magVar.A;
                    function2 = magVar.z;
                    r14 = magVar.y;
                    tggVar2 = magVar.x;
                    qcgVar3 = magVar.w;
                    r11 = magVar.v;
                    mjg mjgVar4 = magVar.u;
                    pgg pggVar7 = magVar.t;
                    Class cls6 = magVar.s;
                    y3g y3gVar5 = magVar.r;
                    try {
                        y6a.M(obj2);
                        mjgVar3 = mjgVar4;
                        pggVar5 = pggVar7;
                        y3gVar4 = y3gVar5;
                        magVar3 = magVar;
                        str2 = "\n";
                        str = "unknown";
                        gcgVar = gcgVar2;
                        cls4 = cls6;
                        r11 = r11;
                        function2 = function2;
                        r14 = r14;
                    } catch (ClassNotFoundException unused) {
                        mjgVar3 = mjgVar4;
                        cls2 = cls6;
                        y3gVar3 = y3gVar5;
                        str2 = "\n";
                        str = "unknown";
                        pggVar6 = pggVar7;
                        pgg pggVar8 = pggVar6;
                        mag magVar4 = magVar;
                        function2.invoke(jagVar, new wo0(bf3.k("The ad whose insertion id is ", jagVar.d, " wants to use the adapter class '", jagVar.a, "', but this class can not be found. Please be sure your SDK is up-to-date.")));
                        pig pigVar6 = r11;
                        qcgVar2 = qcgVar3;
                        pigVar2 = pigVar6;
                        y3gVar = y3gVar3;
                        pggVar2 = pggVar8;
                        cls5 = cls2;
                        tggVar = tggVar2;
                        arrayList = r14;
                        wbcVar = function2;
                        it = it2;
                        magVar2 = magVar4;
                        mjgVar2 = mjgVar3;
                        str4 = str2;
                        obj = null;
                        cls2 = cls5;
                        if (!it.hasNext()) {
                        }
                    } catch (qij e3) {
                        e2 = e3;
                        pggVar4 = pggVar7;
                        str2 = "\n";
                        str = "unknown";
                        arrayList3 = r14;
                        jeg jegVar = jeg.d;
                        String.valueOf(e2);
                        jegVar.f(1);
                        ((qgg) pggVar4).f(e2);
                        str3 = jagVar.x;
                        String str5 = jagVar.d;
                        if (str3 != null) {
                        }
                        jegVar.f(1);
                        String str6 = "Timeout hit while loading ad whose insertion id is " + str5;
                        if (!arrayList3.isEmpty()) {
                        }
                        throw new fbg(str6);
                    } catch (Exception e4) {
                        e = e4;
                        mjgVar3 = mjgVar4;
                        cls3 = cls6;
                        magVar3 = magVar;
                        str2 = "\n";
                        str = "unknown";
                        y3gVar2 = y3gVar5;
                        pggVar3 = pggVar7;
                        pigVar3 = r11;
                        r13 = function2;
                        arrayList2 = r14;
                        r13.invoke(jagVar, e);
                        y3g y3gVar6 = y3gVar2;
                        pggVar2 = pggVar3;
                        y3gVar = y3gVar6;
                        pig pigVar7 = pigVar3;
                        qcgVar2 = qcgVar3;
                        pigVar2 = pigVar7;
                        tggVar = tggVar2;
                        arrayList = arrayList2;
                        wbcVar = r13;
                        it = it2;
                        magVar2 = magVar3;
                        cls5 = cls3;
                        mjgVar2 = mjgVar3;
                        str4 = str2;
                        obj = null;
                        cls2 = cls5;
                        if (!it.hasNext()) {
                        }
                    }
                    try {
                    } catch (ClassNotFoundException unused2) {
                        y3gVar3 = y3gVar4;
                        cls2 = cls4;
                        pggVar6 = pggVar5;
                        magVar = magVar3;
                        pgg pggVar82 = pggVar6;
                        mag magVar42 = magVar;
                        function2.invoke(jagVar, new wo0(bf3.k("The ad whose insertion id is ", jagVar.d, " wants to use the adapter class '", jagVar.a, "', but this class can not be found. Please be sure your SDK is up-to-date.")));
                        pig pigVar62 = r11;
                        qcgVar2 = qcgVar3;
                        pigVar2 = pigVar62;
                        y3gVar = y3gVar3;
                        pggVar2 = pggVar82;
                        cls5 = cls2;
                        tggVar = tggVar2;
                        arrayList = r14;
                        wbcVar = function2;
                        it = it2;
                        magVar2 = magVar42;
                        mjgVar2 = mjgVar3;
                        str4 = str2;
                        obj = null;
                        cls2 = cls5;
                        if (!it.hasNext()) {
                        }
                    } catch (qij e5) {
                        e2 = e5;
                        pggVar4 = pggVar5;
                        arrayList3 = r14;
                        jeg jegVar2 = jeg.d;
                        String.valueOf(e2);
                        jegVar2.f(1);
                        ((qgg) pggVar4).f(e2);
                        str3 = jagVar.x;
                        String str52 = jagVar.d;
                        if (str3 != null) {
                        }
                        jegVar2.f(1);
                        String str62 = "Timeout hit while loading ad whose insertion id is " + str52;
                        if (!arrayList3.isEmpty()) {
                        }
                        throw new fbg(str62);
                    } catch (Exception e6) {
                        e = e6;
                        Class cls7 = cls4;
                        y3gVar2 = y3gVar4;
                        cls3 = cls7;
                        pggVar3 = pggVar5;
                        pigVar3 = r11;
                        r13 = function2;
                        arrayList2 = r14;
                        r13.invoke(jagVar, e);
                        y3g y3gVar62 = y3gVar2;
                        pggVar2 = pggVar3;
                        y3gVar = y3gVar62;
                        pig pigVar72 = pigVar3;
                        qcgVar2 = qcgVar3;
                        pigVar2 = pigVar72;
                        tggVar = tggVar2;
                        arrayList = arrayList2;
                        wbcVar = r13;
                        it = it2;
                        magVar2 = magVar3;
                        cls5 = cls3;
                        mjgVar2 = mjgVar3;
                        str4 = str2;
                        obj = null;
                        cls2 = cls5;
                        if (!it.hasNext()) {
                        }
                    }
                    System.currentTimeMillis();
                    jeg jegVar3 = jeg.d;
                    String str7 = jagVar.a;
                    jegVar3.f(1);
                    return new nag(kagVar, jagVar, gcgVar);
                }
                obj = null;
                y6a.M(obj2);
                tgg tggVar3 = (tgg) ((Function1) this.c).invoke(pggVar);
                ArrayList arrayList6 = new ArrayList();
                magVar2 = magVar;
                arrayList = arrayList6;
                str = "unknown";
                wbcVar = new wbc(23, arrayList6, pggVar, tggVar3);
                it = list.iterator();
                mjgVar2 = mjgVar;
                pigVar2 = pigVar;
                qcgVar2 = qcgVar;
                pggVar2 = pggVar;
                tggVar = tggVar3;
                cls2 = cls;
                y3gVar = this;
                if (!it.hasNext()) {
                    String str8 = str4;
                    fsf fsfVar = new fsf();
                    fsfVar.a = "No valid adapter could be found to successfully load and render an ad";
                    if (!arrayList.isEmpty()) {
                        fsfVar.a = fsfVar.a + "\nDetailed error per ad:\n";
                        for (Pair pair : arrayList) {
                            Object obj3 = fsfVar.a;
                            String str9 = (String) pair.a;
                            if (str9 == null) {
                                str9 = str;
                            }
                            fsfVar.a = obj3 + "- insertion id " + str9 + ": " + pair.b + str8;
                        }
                    }
                    String str10 = (String) fsfVar.a;
                    str10.getClass();
                    throw new abg(str10);
                }
                Iterator it3 = it;
                jag jagVar3 = (jag) it.next();
                try {
                } catch (ClassNotFoundException unused3) {
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                    str2 = str4;
                    pigVar4 = pigVar2;
                    qcgVar4 = qcgVar2;
                    magVar3 = magVar2;
                    jagVar2 = jagVar3;
                    wbcVar2 = wbcVar;
                } catch (qij e7) {
                    e2 = e7;
                    pggVar5 = pggVar2;
                    str2 = str4;
                } catch (Exception e8) {
                    e = e8;
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                    str2 = str4;
                    pigVar4 = pigVar2;
                    qcgVar4 = qcgVar2;
                    magVar3 = magVar2;
                    jagVar2 = jagVar3;
                    wbcVar2 = wbcVar;
                }
                jagVar3.getClass();
                rag ragVar = jagVar3.b;
                List list2 = jagVar3.h;
                if (list2 == null) {
                    list2 = km5.a;
                }
                gcg gcgVar3 = new gcg(ragVar, list2, jagVar3.j, jagVar3.k, jagVar3.l, jagVar3.m, jagVar3.n);
                wbcVar2 = wbcVar;
                try {
                } catch (ClassNotFoundException unused4) {
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                    str2 = str4;
                } catch (qij e9) {
                    e2 = e9;
                    pggVar5 = pggVar2;
                    str2 = str4;
                } catch (Exception e10) {
                    e = e10;
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                    str2 = str4;
                }
                str2 = str4;
                try {
                } catch (ClassNotFoundException unused5) {
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                } catch (qij e11) {
                    e2 = e11;
                    pggVar5 = pggVar2;
                } catch (Exception e12) {
                    e = e12;
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                }
                ((qgg) pggVar2).p = jagVar3.G;
                try {
                } catch (ClassNotFoundException unused6) {
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                    pigVar4 = pigVar2;
                    qcgVar4 = qcgVar2;
                    magVar3 = magVar2;
                    jagVar2 = jagVar3;
                    it2 = it3;
                    function2 = wbcVar2;
                    y3gVar3 = y3gVar;
                    r14 = arrayList;
                    jagVar = jagVar2;
                    pggVar6 = pggVar5;
                    r11 = pigVar4;
                    qcgVar3 = qcgVar4;
                    magVar = magVar3;
                    tggVar2 = tggVar;
                    pgg pggVar822 = pggVar6;
                    mag magVar422 = magVar;
                    function2.invoke(jagVar, new wo0(bf3.k("The ad whose insertion id is ", jagVar.d, " wants to use the adapter class '", jagVar.a, "', but this class can not be found. Please be sure your SDK is up-to-date.")));
                    pig pigVar622 = r11;
                    qcgVar2 = qcgVar3;
                    pigVar2 = pigVar622;
                    y3gVar = y3gVar3;
                    pggVar2 = pggVar822;
                    cls5 = cls2;
                    tggVar = tggVar2;
                    arrayList = r14;
                    wbcVar = function2;
                    it = it2;
                    magVar2 = magVar422;
                    mjgVar2 = mjgVar3;
                    str4 = str2;
                    obj = null;
                    cls2 = cls5;
                    if (!it.hasNext()) {
                    }
                } catch (qij e13) {
                    e2 = e13;
                    pggVar5 = pggVar2;
                    jagVar2 = jagVar3;
                    arrayList5 = arrayList;
                    jagVar = jagVar2;
                    pggVar4 = pggVar5;
                    tggVar2 = tggVar;
                    arrayList3 = arrayList5;
                    jeg jegVar22 = jeg.d;
                    String.valueOf(e2);
                    jegVar22.f(1);
                    ((qgg) pggVar4).f(e2);
                    str3 = jagVar.x;
                    String str522 = jagVar.d;
                    if (str3 != null) {
                        tggVar2.a(qkg.t, jagVar.y, str3);
                    }
                    jegVar22.f(1);
                    String str622 = "Timeout hit while loading ad whose insertion id is " + str522;
                    if (!arrayList3.isEmpty()) {
                        str622 = ((Object) str622) + "\nPreviously encountered error per ad:\n";
                        for (Pair pair2 : arrayList3) {
                            String str11 = (String) pair2.a;
                            if (str11 == null) {
                                str11 = str;
                            }
                            str622 = ((Object) str622) + "- insertion id " + str11 + ": " + pair2.b + str2;
                        }
                    }
                    throw new fbg(str622);
                } catch (Exception e14) {
                    e = e14;
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                    pigVar4 = pigVar2;
                    qcgVar4 = qcgVar2;
                    magVar3 = magVar2;
                    jagVar2 = jagVar3;
                    it2 = it3;
                    wbcVar3 = wbcVar2;
                    y3gVar2 = y3gVar;
                    arrayList4 = arrayList;
                    jagVar = jagVar2;
                    pggVar3 = pggVar5;
                    pigVar5 = pigVar4;
                    qcgVar3 = qcgVar4;
                    tggVar2 = tggVar;
                    cls3 = cls2;
                    pigVar3 = pigVar5;
                    r13 = wbcVar3;
                    arrayList2 = arrayList4;
                    r13.invoke(jagVar, e);
                    y3g y3gVar622 = y3gVar2;
                    pggVar2 = pggVar3;
                    y3gVar = y3gVar622;
                    pig pigVar722 = pigVar3;
                    qcgVar2 = qcgVar3;
                    pigVar2 = pigVar722;
                    tggVar = tggVar2;
                    arrayList = arrayList2;
                    wbcVar = r13;
                    it = it2;
                    magVar2 = magVar3;
                    cls5 = cls3;
                    mjgVar2 = mjgVar3;
                    str4 = str2;
                    obj = null;
                    cls2 = cls5;
                    if (!it.hasNext()) {
                    }
                }
                rag ragVar2 = jagVar3.b;
                ragVar2.getClass();
                ((qgg) pggVar2).q = ragVar2;
                ((qgg) pggVar2).r = jagVar3.a;
                fff fffVar = mgg.b;
                Integer num = jagVar3.S;
                if (num != null) {
                    try {
                    } catch (ClassNotFoundException unused7) {
                        qcg qcgVar5 = qcgVar2;
                        r11 = pigVar2;
                        qcgVar3 = qcgVar5;
                        y3gVar3 = y3gVar;
                        pggVar6 = pggVar2;
                        mjgVar3 = mjgVar2;
                        magVar = magVar2;
                        jagVar = jagVar3;
                        r14 = arrayList;
                        it2 = it3;
                        function2 = wbcVar2;
                        tggVar2 = tggVar;
                        pgg pggVar8222 = pggVar6;
                        mag magVar4222 = magVar;
                        function2.invoke(jagVar, new wo0(bf3.k("The ad whose insertion id is ", jagVar.d, " wants to use the adapter class '", jagVar.a, "', but this class can not be found. Please be sure your SDK is up-to-date.")));
                        pig pigVar6222 = r11;
                        qcgVar2 = qcgVar3;
                        pigVar2 = pigVar6222;
                        y3gVar = y3gVar3;
                        pggVar2 = pggVar8222;
                        cls5 = cls2;
                        tggVar = tggVar2;
                        arrayList = r14;
                        wbcVar = function2;
                        it = it2;
                        magVar2 = magVar4222;
                        mjgVar2 = mjgVar3;
                        str4 = str2;
                        obj = null;
                        cls2 = cls5;
                        if (!it.hasNext()) {
                        }
                    } catch (qij e15) {
                        e2 = e15;
                        pggVar4 = pggVar2;
                        jagVar = jagVar3;
                        arrayList5 = arrayList;
                        tggVar2 = tggVar;
                        arrayList3 = arrayList5;
                        jeg jegVar222 = jeg.d;
                        String.valueOf(e2);
                        jegVar222.f(1);
                        ((qgg) pggVar4).f(e2);
                        str3 = jagVar.x;
                        String str5222 = jagVar.d;
                        if (str3 != null) {
                        }
                        jegVar222.f(1);
                        String str6222 = "Timeout hit while loading ad whose insertion id is " + str5222;
                        if (!arrayList3.isEmpty()) {
                        }
                        throw new fbg(str6222);
                    } catch (Exception e16) {
                        e = e16;
                        pgg pggVar9 = pggVar2;
                        y3gVar2 = y3gVar;
                        pggVar3 = pggVar9;
                        qcg qcgVar6 = qcgVar2;
                        pigVar5 = pigVar2;
                        qcgVar3 = qcgVar6;
                        mjgVar3 = mjgVar2;
                        magVar3 = magVar2;
                        jagVar = jagVar3;
                        arrayList4 = arrayList;
                        it2 = it3;
                        wbcVar3 = wbcVar2;
                        tggVar2 = tggVar;
                        cls3 = cls2;
                        pigVar3 = pigVar5;
                        r13 = wbcVar3;
                        arrayList2 = arrayList4;
                        r13.invoke(jagVar, e);
                        y3g y3gVar6222 = y3gVar2;
                        pggVar2 = pggVar3;
                        y3gVar = y3gVar6222;
                        pig pigVar7222 = pigVar3;
                        qcgVar2 = qcgVar3;
                        pigVar2 = pigVar7222;
                        tggVar = tggVar2;
                        arrayList = arrayList2;
                        wbcVar = r13;
                        it = it2;
                        magVar2 = magVar3;
                        cls5 = cls3;
                        mjgVar2 = mjgVar3;
                        str4 = str2;
                        obj = null;
                        cls2 = cls5;
                        if (!it.hasNext()) {
                        }
                    }
                    intValue = num.intValue();
                } else {
                    intValue = -1;
                }
                fffVar.getClass();
                ((qgg) pggVar2).t = fff.b(intValue);
                ?? r142 = obj;
                ((qgg) pggVar2).k(r142);
                ?? cls8 = Class.forName(jagVar3.a);
                if (!cls2.isAssignableFrom(cls8)) {
                    pggVar5 = pggVar2;
                    mjgVar3 = mjgVar2;
                    pigVar4 = pigVar2;
                    qcgVar4 = qcgVar2;
                    magVar3 = magVar2;
                    jagVar2 = jagVar3;
                    throw new wo0("A " + cls8 + " was received but a subclass of " + cls2 + " was expected.");
                }
                Object newInstance = cls8.getDeclaredConstructor(r142).newInstance(r142);
                newInstance.getClass();
                kag kagVar2 = (kag) newInstance;
                System.currentTimeMillis();
                Context context = (Context) y3gVar.b;
                magVar2.r = y3gVar;
                magVar2.s = cls2;
                magVar2.t = pggVar2;
                magVar2.u = mjgVar2;
                magVar2.v = pigVar2;
                magVar2.w = qcgVar2;
                magVar2.x = tggVar;
                magVar2.y = arrayList;
                magVar2.z = wbcVar2;
                magVar2.A = it3;
                magVar2.B = jagVar3;
                magVar2.C = gcgVar3;
                magVar2.D = kagVar2;
                magVar2.G = 1;
                pggVar5 = pggVar2;
                mjgVar3 = mjgVar2;
                pigVar4 = pigVar2;
                qcgVar4 = qcgVar2;
                magVar3 = magVar2;
                jagVar2 = jagVar3;
                try {
                } catch (ClassNotFoundException unused8) {
                    it2 = it3;
                    function2 = wbcVar2;
                    y3gVar3 = y3gVar;
                    r14 = arrayList;
                    jagVar = jagVar2;
                    pggVar6 = pggVar5;
                    r11 = pigVar4;
                    qcgVar3 = qcgVar4;
                    magVar = magVar3;
                    tggVar2 = tggVar;
                    pgg pggVar82222 = pggVar6;
                    mag magVar42222 = magVar;
                    function2.invoke(jagVar, new wo0(bf3.k("The ad whose insertion id is ", jagVar.d, " wants to use the adapter class '", jagVar.a, "', but this class can not be found. Please be sure your SDK is up-to-date.")));
                    pig pigVar62222 = r11;
                    qcgVar2 = qcgVar3;
                    pigVar2 = pigVar62222;
                    y3gVar = y3gVar3;
                    pggVar2 = pggVar82222;
                    cls5 = cls2;
                    tggVar = tggVar2;
                    arrayList = r14;
                    wbcVar = function2;
                    it = it2;
                    magVar2 = magVar42222;
                    mjgVar2 = mjgVar3;
                    str4 = str2;
                    obj = null;
                    cls2 = cls5;
                    if (!it.hasNext()) {
                    }
                } catch (qij e17) {
                    e2 = e17;
                    arrayList5 = arrayList;
                    jagVar = jagVar2;
                    pggVar4 = pggVar5;
                    tggVar2 = tggVar;
                    arrayList3 = arrayList5;
                    jeg jegVar2222 = jeg.d;
                    String.valueOf(e2);
                    jegVar2222.f(1);
                    ((qgg) pggVar4).f(e2);
                    str3 = jagVar.x;
                    String str52222 = jagVar.d;
                    if (str3 != null) {
                    }
                    jegVar2222.f(1);
                    String str62222 = "Timeout hit while loading ad whose insertion id is " + str52222;
                    if (!arrayList3.isEmpty()) {
                    }
                    throw new fbg(str62222);
                } catch (Exception e18) {
                    e = e18;
                    it2 = it3;
                    wbcVar3 = wbcVar2;
                    y3gVar2 = y3gVar;
                    arrayList4 = arrayList;
                    jagVar = jagVar2;
                    pggVar3 = pggVar5;
                    pigVar5 = pigVar4;
                    qcgVar3 = qcgVar4;
                    tggVar2 = tggVar;
                    cls3 = cls2;
                    pigVar3 = pigVar5;
                    r13 = wbcVar3;
                    arrayList2 = arrayList4;
                    r13.invoke(jagVar, e);
                    y3g y3gVar62222 = y3gVar2;
                    pggVar2 = pggVar3;
                    y3gVar = y3gVar62222;
                    pig pigVar72222 = pigVar3;
                    qcgVar2 = qcgVar3;
                    pigVar2 = pigVar72222;
                    tggVar = tggVar2;
                    arrayList = arrayList2;
                    wbcVar = r13;
                    it = it2;
                    magVar2 = magVar3;
                    cls5 = cls3;
                    mjgVar2 = mjgVar3;
                    str4 = str2;
                    obj = null;
                    cls2 = cls5;
                    if (!it.hasNext()) {
                    }
                }
                if (kagVar2.loadAd(context, jagVar2, pggVar5, mjgVar3, pigVar4, qcgVar4, null, magVar3) == lu3Var) {
                    return lu3Var;
                }
                it2 = it3;
                function2 = wbcVar2;
                cls4 = cls2;
                r14 = arrayList;
                jagVar = jagVar2;
                r11 = pigVar4;
                qcgVar3 = qcgVar4;
                y3gVar4 = y3gVar;
                tggVar2 = tggVar;
                gcgVar = gcgVar3;
                kagVar = kagVar2;
                System.currentTimeMillis();
                jeg jegVar32 = jeg.d;
                String str72 = jagVar.a;
                jegVar32.f(1);
                return new nag(kagVar, jagVar, gcgVar);
            }
        }
        magVar = new mag(this, sq3Var);
        Object obj22 = magVar.E;
        lu3 lu3Var2 = lu3.a;
        i = magVar.G;
        String str42 = "\n";
        if (i == 0) {
        }
    }

    public void C(ilg ilgVar) {
        this.c = ilgVar;
        View findViewById = ((StartActivity) this.b).findViewById(R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new vxh(this, findViewById, 0));
    }

    public cci E(qbl qblVar) {
        cci F;
        synchronized (this.c) {
            F = ((by9) this.b).F(qblVar);
        }
        return F;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    @Override // defpackage.kpd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x9l L(View view, x9l x9lVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 28:
                suk sukVar = (suk) this.c;
                x9l l = bsk.l(view, x9lVar);
                if (l.a.s()) {
                    return l;
                }
                Rect rect = (Rect) this.b;
                rect.left = l.b();
                rect.top = l.d();
                rect.right = l.c();
                rect.bottom = l.a();
                int childCount = sukVar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    x9l c = bsk.c(sukVar.getChildAt(i), l);
                    rect.left = Math.min(c.b(), rect.left);
                    rect.top = Math.min(c.d(), rect.top);
                    rect.right = Math.min(c.c(), rect.right);
                    rect.bottom = Math.min(c.a(), rect.bottom);
                }
                return l.f(rect.left, rect.top, rect.right, rect.bottom);
            default:
                fjg fjgVar = (fjg) this.b;
                k9 k9Var = (k9) this.c;
                int i2 = k9Var.a;
                int i3 = k9Var.b;
                int i4 = k9Var.c;
                u9l u9lVar = x9lVar.a;
                u4a i5 = u9lVar.i(519);
                u4a i6 = u9lVar.i(32);
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) fjgVar.b;
                int i7 = i5.b;
                int i8 = i5.c;
                int i9 = i5.a;
                bottomSheetBehavior.x = i7;
                boolean z3 = true;
                boolean z4 = view.getLayoutDirection() == 1;
                int paddingBottom = view.getPaddingBottom();
                int paddingLeft = view.getPaddingLeft();
                int paddingRight = view.getPaddingRight();
                boolean z5 = bottomSheetBehavior.p;
                if (z5) {
                    int a = x9lVar.a();
                    bottomSheetBehavior.w = a;
                    paddingBottom = a + i4;
                }
                if (bottomSheetBehavior.q) {
                    paddingLeft = (z4 ? i3 : i2) + i9;
                }
                if (bottomSheetBehavior.r) {
                    if (!z4) {
                        i2 = i3;
                    }
                    paddingRight = i2 + i8;
                }
                int i10 = paddingRight;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (!bottomSheetBehavior.t || marginLayoutParams.leftMargin == i9) {
                    z = false;
                } else {
                    marginLayoutParams.leftMargin = i9;
                    z = true;
                }
                if (bottomSheetBehavior.u && marginLayoutParams.rightMargin != i8) {
                    marginLayoutParams.rightMargin = i8;
                    z = true;
                }
                if (bottomSheetBehavior.v) {
                    int i11 = marginLayoutParams.topMargin;
                    int i12 = i5.b;
                    if (i11 != i12) {
                        marginLayoutParams.topMargin = i12;
                        if (z3) {
                            view.setLayoutParams(marginLayoutParams);
                        }
                        view.setPadding(paddingLeft, view.getPaddingTop(), i10, paddingBottom);
                        z2 = fjgVar.a;
                        if (z2) {
                            bottomSheetBehavior.n = i6.d;
                        }
                        if (!z5 || z2) {
                            bottomSheetBehavior.T();
                        }
                        return x9lVar;
                    }
                }
                z3 = z;
                if (z3) {
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), i10, paddingBottom);
                z2 = fjgVar.a;
                if (z2) {
                }
                if (!z5) {
                }
                bottomSheetBehavior.T();
                return x9lVar;
        }
    }

    @Override // defpackage.zhh
    public void a(k55 k55Var) {
        ((zhh) this.b).a(k55Var);
    }

    @Override // defpackage.ozg
    public void b(j9e j9eVar) {
        z1k z1kVar = (z1k) this.c;
        SparseArray sparseArray = z1kVar.h;
        nm2 nm2Var = (nm2) this.b;
        if (j9eVar.A() == 0 && (j9eVar.A() & 128) != 0) {
            j9eVar.O(6);
            int a = j9eVar.a() / 4;
            for (int i = 0; i < a; i++) {
                j9eVar.k(nm2Var.d, 0, 4);
                nm2Var.q(0);
                int i2 = nm2Var.i(16);
                nm2Var.t(3);
                if (i2 == 0) {
                    nm2Var.t(13);
                } else {
                    int i3 = nm2Var.i(13);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new qzg(new gtj(z1kVar, i3)));
                        z1kVar.n++;
                    }
                }
            }
            if (z1kVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.wd4
    public void d(Exception exc) {
        gwh gwhVar = (gwh) this.c;
        ntc ntcVar = (ntc) this.b;
        ntc ntcVar2 = gwhVar.f;
        if (ntcVar2 == null || ntcVar2 != ntcVar) {
            return;
        }
        gwh gwhVar2 = (gwh) this.c;
        ntc ntcVar3 = (ntc) this.b;
        tl4 tl4Var = gwhVar2.b;
        qd4 qd4Var = gwhVar2.g;
        xd4 xd4Var = ntcVar3.c;
        tl4Var.c(qd4Var, exc, xd4Var, xd4Var.e());
    }

    public void e() {
        ((jqi) this.b).b = true;
        ((ScheduledFuture) this.c).cancel(false);
    }

    @Override // defpackage.nzg
    public void f(nkk nkkVar) {
        y1k y1kVar = (y1k) this.c;
        SparseArray sparseArray = y1kVar.g;
        nm2 nm2Var = (nm2) this.b;
        if (nkkVar.s() == 0 && (nkkVar.s() & 128) != 0) {
            nkkVar.F(6);
            int c = nkkVar.c() / 4;
            for (int i = 0; i < c; i++) {
                nkkVar.e(nm2Var.d, 0, 4);
                nm2Var.q(0);
                int i2 = nm2Var.i(16);
                nm2Var.t(3);
                if (i2 == 0) {
                    nm2Var.t(13);
                } else {
                    int i3 = nm2Var.i(13);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new pzg(new gtj(y1kVar, i3)));
                        y1kVar.m++;
                    }
                }
            }
            if (y1kVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.uqg
    public Object g(lpg lpgVar, Object obj) {
        return ((Function2) this.b).invoke(lpgVar, obj);
    }

    @Override // defpackage.kli
    public List getCues(long j) {
        l74 l74Var;
        int e = lik.e((long[]) this.c, j, false);
        return (e == -1 || (l74Var = ((l74[]) this.b)[e]) == l74.r) ? Collections.EMPTY_LIST : Collections.singletonList(l74Var);
    }

    @Override // defpackage.kli
    public long getEventTime(int i) {
        long[] jArr = (long[]) this.c;
        qx9.r(i >= 0);
        qx9.r(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.kli
    public int getEventTimeCount() {
        return ((long[]) this.c).length;
    }

    @Override // defpackage.kli
    public int getNextEventTimeIndex(long j) {
        long[] jArr = (long[]) this.c;
        int b = lik.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    @Override // defpackage.hni
    public String h() {
        return (String) this.b;
    }

    @Override // defpackage.hni
    public void i(gni gniVar) {
        v8a.k(gniVar, (Object[]) this.c);
    }

    @Override // defpackage.uqg
    public Object k(Object obj) {
        return ((Function1) this.c).invoke(obj);
    }

    @Override // defpackage.wd4
    public void l(Object obj) {
        gwh gwhVar = (gwh) this.c;
        ntc ntcVar = (ntc) this.b;
        ntc ntcVar2 = gwhVar.f;
        if (ntcVar2 == null || ntcVar2 != ntcVar) {
            return;
        }
        gwh gwhVar2 = (gwh) this.c;
        ntc ntcVar3 = (ntc) this.b;
        t35 t35Var = gwhVar2.a.p;
        if (obj == null || !t35Var.a(ntcVar3.c.e())) {
            tl4 tl4Var = gwhVar2.b;
            pia piaVar = ntcVar3.a;
            xd4 xd4Var = ntcVar3.c;
            tl4Var.a(piaVar, obj, xd4Var, xd4Var.e(), gwhVar2.g);
            return;
        }
        gwhVar2.e = obj;
        tl4 tl4Var2 = gwhVar2.b;
        tl4Var2.E = 2;
        jo5 jo5Var = tl4Var2.p;
        (jo5Var.l ? jo5Var.h : jo5Var.g).execute(tl4Var2);
    }

    public boolean m(qbl qblVar) {
        boolean containsKey;
        synchronized (this.c) {
            containsKey = ((LinkedHashMap) ((by9) this.b).a).containsKey(qblVar);
        }
        return containsKey;
    }

    public void o() {
        e1d e1dVar = (e1d) this.c;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            kfj kfjVar = (kfj) ((eoh) e1dVar).getValue();
            if (kfjVar != null) {
                z9k z9kVar = (z9k) this.b;
                SnapshotStateList snapshotStateList = z9kVar.b;
                SnapshotStateList snapshotStateList2 = z9kVar.c;
                snapshotStateList2.clear();
                while (snapshotStateList2.size() + snapshotStateList.size() > z9kVar.a - 1) {
                    o13.B(snapshotStateList);
                }
                snapshotStateList.add(kfjVar);
            }
            ((eoh) e1dVar).setValue(null);
        } finally {
            bea.K(w, C, e);
        }
    }

    @Override // defpackage.zhh
    public void onError(Throwable th) {
        ((zhh) this.b).onError(th);
    }

    @Override // defpackage.qh2
    public void onFailure(ah2 ah2Var, IOException iOException) {
        fjg.c().f(1);
        synchronized (((dkg) this.c).a) {
            ((dkg) this.c).a.addAll((ArrayList) this.b);
        }
    }

    @Override // defpackage.qh2
    public void onResponse(ah2 ah2Var, d2g d2gVar) {
        if (d2gVar.q) {
            fjg.c().f(1);
        } else {
            fjg.c().f(1);
        }
        try {
            d2gVar.close();
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.zhh
    public void onSuccess(Object obj) {
        zhh zhhVar = (zhh) this.b;
        try {
            ((xn3) ((ekd) this.c).c).accept(obj);
            zhhVar.onSuccess(obj);
        } catch (Throwable th) {
            td4.w0(th);
            zhhVar.onError(th);
        }
    }

    @Override // defpackage.m75
    public void p() {
        uqf uqfVar = (uqf) this.b;
        synchronized (uqfVar) {
            uqfVar.c = uqfVar.a.length;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: JSONException -> 0x00a9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00a9, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x0033, B:13:0x004d, B:22:0x0063, B:24:0x006c, B:26:0x0076, B:28:0x007a, B:30:0x0091, B:31:0x0098, B:34:0x0099, B:35:0x00a0, B:37:0x00a1, B:38:0x00a8), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: JSONException -> 0x00a9, TryCatch #1 {JSONException -> 0x00a9, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x0033, B:13:0x004d, B:22:0x0063, B:24:0x006c, B:26:0x0076, B:28:0x007a, B:30:0x0091, B:31:0x0098, B:34:0x0099, B:35:0x00a0, B:37:0x00a1, B:38:0x00a8), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public av0 q(fi3 fi3Var) {
        String string;
        JSONArray jSONArray = fi3Var.g;
        long j = fi3Var.f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2);
                }
                String optString = jSONArray2.optString(0, "");
                fi3 c = ((di3) this.b).c();
                String str = null;
                if (c != null) {
                    try {
                        string = c.b.getString(optString);
                    } catch (JSONException unused) {
                    }
                    if (string == null) {
                        fi3 c2 = ((di3) this.c).c();
                        if (c2 != null) {
                            try {
                                str = c2.b.getString(optString);
                            } catch (JSONException unused2) {
                            }
                        }
                        string = str != null ? str : "";
                    }
                    int i2 = x5g.a;
                    xu0 xu0Var = new xu0();
                    if (string2 != null) {
                        throw new NullPointerException("Null rolloutId");
                    }
                    xu0Var.a = string2;
                    String string3 = jSONObject.getString("variantId");
                    if (string3 == null) {
                        throw new NullPointerException("Null variantId");
                    }
                    xu0Var.b = string3;
                    if (optString == null) {
                        throw new NullPointerException("Null parameterKey");
                    }
                    xu0Var.c = optString;
                    xu0Var.d = string;
                    xu0Var.e = j;
                    xu0Var.f = (byte) (xu0Var.f | 1);
                    hashSet.add(xu0Var.a());
                }
                string = null;
                if (string == null) {
                }
                int i22 = x5g.a;
                xu0 xu0Var2 = new xu0();
                if (string2 != null) {
                }
            } catch (JSONException e) {
                throw new f58("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new av0(hashSet);
    }

    @Override // defpackage.m75
    public void r(dx1 dx1Var, Bitmap bitmap) {
        IOException iOException = ((ce6) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            dx1Var.i(bitmap);
            throw iOException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(long j, sq3 sq3Var) {
        kgg kggVar;
        int i;
        g62 g62Var;
        Object U;
        String localizedMessage;
        zjg zjgVar;
        if (sq3Var instanceof kgg) {
            kggVar = (kgg) sq3Var;
            int i2 = kggVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kggVar.u = i2 - Integer.MIN_VALUE;
                Object obj = kggVar.s;
                lu3 lu3Var = lu3.a;
                i = kggVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    boolean z = false;
                    g62 g = ml4.g(0, 7, null);
                    akg akgVar = (akg) ((Function2) this.c).invoke((Context) this.b, new lgg(g));
                    int i3 = (int) j;
                    qc4 qc4Var = akgVar.e;
                    zjg zjgVar2 = akgVar.f;
                    boolean z2 = zjgVar2 != null;
                    long j2 = 0;
                    try {
                        if (qc4Var != null) {
                            String g2 = me4.g(i3, "-", new StringBuilder(akgVar.d));
                            Context context = qc4Var.b;
                            String string = context.getSharedPreferences(a5f.e(context), 0).getString(g2, null);
                            if (string != null && !string.isEmpty()) {
                                try {
                                    JSONObject jSONObject = new JSONObject(string);
                                    j2 = jSONObject.optLong("expirationDate");
                                    akgVar.c(jSONObject, i3, false);
                                } catch (JSONException unused) {
                                }
                                if (z) {
                                    lgg lggVar = akgVar.a;
                                    zjgVar2.getClass();
                                    xw3.L(s9a.c(z45.a), null, null, new gje(lggVar.a, zjgVar2, rq3Var, 29), 3);
                                }
                                if (j2 <= System.currentTimeMillis()) {
                                    String replace = akgVar.b.replace("SITEID_PLACEHOLDER", "" + i3);
                                    pzf pzfVar = new pzf();
                                    pzfVar.f(replace);
                                    qzf qzfVar = new qzf(pzfVar);
                                    jod jodVar = akgVar.c;
                                    jodVar.getClass();
                                    FirebasePerfOkHttpClient.enqueue(new pof(jodVar, qzfVar), new yz1(akgVar, i3, 11));
                                }
                                w9g w9gVar = new w9g(g, rq3Var, 5);
                                kggVar.r = g;
                                kggVar.u = 1;
                                U = wba.U(5000L, w9gVar, kggVar);
                                if (U != lu3Var) {
                                    return lu3Var;
                                }
                                g62Var = g;
                                obj = U;
                            }
                        }
                        w9g w9gVar2 = new w9g(g, rq3Var, 5);
                        kggVar.r = g;
                        kggVar.u = 1;
                        U = wba.U(5000L, w9gVar2, kggVar);
                        if (U != lu3Var) {
                        }
                    } catch (Exception e) {
                        e = e;
                        g62Var = g;
                        g62Var.r(null);
                        localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null) {
                        }
                        throw new wo0(localizedMessage);
                    }
                    z = z2;
                    if (z) {
                    }
                    if (j2 <= System.currentTimeMillis()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g62Var = kggVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Exception e2) {
                        e = e2;
                        g62Var.r(null);
                        localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "Cause : " + e;
                        }
                        throw new wo0(localizedMessage);
                    }
                }
                zjgVar = (zjg) obj;
                if (zjgVar.c.d > 3131) {
                    jeg jegVar = jeg.d;
                    jegVar.f(3);
                    jegVar.f(3);
                }
                return zjgVar;
            }
        }
        kggVar = new kgg(this, sq3Var);
        Object obj2 = kggVar.s;
        lu3 lu3Var2 = lu3.a;
        i = kggVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        zjgVar = (zjg) obj2;
        if (zjgVar.c.d > 3131) {
        }
        return zjgVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FileWriter fileWriter;
        ng2 ng2Var = (ng2) this.c;
        JSONObject jSONObject = (JSONObject) ((ExecutorService) ((xx3) ((hcc) this.b).d).b).submit(new ji2(this, 9)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            bah b = (jSONObject.getInt("settings_version") != 3 ? new uic(21) : new n2f(2)).b((omf) ((bka) ng2Var.c).b, jSONObject);
            yf2 yf2Var = (yf2) ng2Var.d;
            try {
                jSONObject.put("expires_at", b.c);
                fileWriter = new FileWriter(yf2Var.a);
            } catch (Exception unused) {
                fileWriter = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                k53.a0(fileWriter2);
                throw th;
            }
            k53.a0(fileWriter);
            jSONObject.toString();
            String str = ((nah) ng2Var.b).f;
            SharedPreferences.Editor edit = ((Context) ng2Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit.putString("existing_instance_identifier", str);
            edit.apply();
            ((AtomicReference) ng2Var.g).set(b);
            ((TaskCompletionSource) ((AtomicReference) ng2Var.h).get()).trySetResult(b);
        }
        return Tasks.forResult(null);
    }

    public String u(pia piaVar) {
        String str;
        synchronized (((dy9) this.b)) {
            str = (String) ((dy9) this.b).c(piaVar);
        }
        if (str == null) {
            vog vogVar = (vog) ((sx2) this.c).c();
            try {
                piaVar.b(vogVar.a);
                byte[] digest = vogVar.a.digest();
                char[] cArr = kik.b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i];
                        int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        int i3 = i * 2;
                        char[] cArr2 = kik.a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((sx2) this.c).b(vogVar);
            }
        }
        synchronized (((dy9) this.b)) {
            ((dy9) this.b).f(piaVar, str);
        }
        return str;
    }

    public void v() {
        int i;
        TypedValue typedValue = new TypedValue();
        StartActivity startActivity = (StartActivity) this.b;
        Resources.Theme theme = startActivity.getTheme();
        theme.resolveAttribute(com.sofascore.results.R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(com.sofascore.results.R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            td4.d0(typedValue.resourceId, startActivity);
        }
        theme.resolveAttribute(com.sofascore.results.R.attr.splashScreenIconSize, typedValue, true);
        if (!theme.resolveAttribute(com.sofascore.results.R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        startActivity.setTheme(i);
    }

    public void w() {
        Context context = (Context) this.b;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.remove("AUTH_TOKEN");
        Unit unit = Unit.a;
        edit.apply();
        hs4 hs4Var = z45.a;
        f5p.D(context, hq4.c, new gje((bfk) this.c, context, null, 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02dc A[Catch: qij -> 0x003a, Exception -> 0x02e4, ufg -> 0x034d, TryCatch #5 {Exception -> 0x02e4, blocks: (B:15:0x02cb, B:18:0x02d6, B:22:0x02dc, B:23:0x02e3), top: B:14:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15, types: [qgg] */
    /* JADX WARN: Type inference failed for: r1v16, types: [qgg] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(qbg qbgVar, zjg zjgVar, pgg pggVar, sq3 sq3Var) {
        pag pagVar;
        int i;
        String str;
        int i2;
        ?? r1;
        String str2;
        Map map;
        Map map2;
        Iterator it;
        ckg a;
        ckg a2;
        boolean z;
        try {
            try {
                if (sq3Var instanceof pag) {
                    pagVar = (pag) sq3Var;
                    int i3 = pagVar.u;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pagVar.u = i3 - Integer.MIN_VALUE;
                        Object obj = pagVar.s;
                        lu3 lu3Var = lu3.a;
                        i = pagVar.u;
                        String str3 = "";
                        if (i != 0) {
                            y6a.M(obj);
                            pbg pbgVar = (pbg) ((Function2) this.c).invoke(qbgVar, zjgVar);
                            yjg yjgVar = pbgVar.c.c;
                            qbg qbgVar2 = pbgVar.a;
                            hbg hbgVar = qbgVar2.a;
                            qcg qcgVar = pbgVar.b;
                            fig figVar = qcgVar.c;
                            b10 b10Var = qcgVar.b;
                            StringBuilder sb = new StringBuilder(yjgVar.b);
                            sb.append("/ac?");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            xjg xjgVar = yjgVar.c;
                            if (xjgVar != null) {
                                Map map3 = xjgVar.a;
                                i2 = 1;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                Iterator it2 = map3.entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it2.next();
                                    Object key = entry.getKey();
                                    Iterator it3 = it2;
                                    if ((key instanceof String ? (String) key : null) != null) {
                                        Object value = entry.getValue();
                                        if ((value instanceof String ? (String) value : null) != null) {
                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    it2 = it3;
                                }
                                ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                                Iterator it4 = linkedHashMap2.entrySet().iterator();
                                while (it4.hasNext()) {
                                    Map.Entry entry2 = (Map.Entry) it4.next();
                                    arrayList.add(new Pair(String.valueOf(entry2.getKey()), String.valueOf(entry2.getValue())));
                                    it4 = it4;
                                    str3 = str3;
                                }
                                str = str3;
                                linkedHashMap.putAll(tub.o(arrayList));
                            } else {
                                str = "";
                                i2 = 1;
                            }
                            hbgVar.getClass();
                            linkedHashMap.put("siteid", String.valueOf(415167L));
                            linkedHashMap.put("pgid", String.valueOf(hbgVar.a));
                            linkedHashMap.put("fmtid", String.valueOf(hbgVar.b));
                            String str4 = hbgVar.c;
                            if (str4 == null) {
                                str4 = str;
                            }
                            if (!b10Var.f()) {
                                str4 = lnb.o(str4, str4.length() == 0 ? str : ";", "consent=rejected");
                            }
                            linkedHashMap.put("tgt", str4);
                            linkedHashMap.put("visit", PlayerKt.FOOTBALL_MIDFIELDER);
                            linkedHashMap.put("tmstp", qbgVar2.b);
                            linkedHashMap.put("vct", "4");
                            linkedHashMap.put("vrn", "8.6.1");
                            ekg p = b10Var.p();
                            if (p != null) {
                                linkedHashMap.put(InMobiSdk.IM_GDPR_CONSENT_IAB, (String) p.d);
                            }
                            pp4 m = b10Var.m();
                            if (m != null) {
                                linkedHashMap.put("us_privacy", (String) m.d);
                            }
                            Map p2 = tub.p(linkedHashMap);
                            Iterator it5 = CollectionsKt.G0(p2.keySet()).iterator();
                            while (it5.hasNext()) {
                                String str5 = (String) it5.next();
                                String str6 = (String) p2.get(str5);
                                if (str6 != null) {
                                    sb.append(str5);
                                    sb.append(U3.j.b);
                                    try {
                                        String encode = URLEncoder.encode(str6, C.UTF8_NAME);
                                        encode.getClass();
                                        map2 = p2;
                                        it = it5;
                                        try {
                                            str6 = c.r(encode, "+", "%20", false);
                                        } catch (UnsupportedEncodingException e) {
                                            e = e;
                                            e.printStackTrace();
                                            sb.append(str6);
                                            sb.append(U3.j.c);
                                            p2 = map2;
                                            it5 = it;
                                        }
                                    } catch (UnsupportedEncodingException e2) {
                                        e = e2;
                                        map2 = p2;
                                        it = it5;
                                    }
                                    sb.append(str6);
                                    sb.append(U3.j.c);
                                } else {
                                    map2 = p2;
                                    it = it5;
                                }
                                p2 = map2;
                                it5 = it;
                            }
                            String substring = sb.substring(0, sb.length() - 1);
                            substring.getClass();
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            xjg xjgVar2 = pbgVar.c.c.c;
                            if (xjgVar2 != null && (map = xjgVar2.b) != null) {
                                linkedHashMap3.putAll(map);
                            }
                            linkedHashMap3.put("appname", (String) figVar.b);
                            linkedHashMap3.put(C4427z5.d, (String) figVar.d);
                            linkedHashMap3.put("sdkversionid", 3131);
                            linkedHashMap3.put(L6.H, U3.d);
                            linkedHashMap3.put("version", "8.6.1");
                            linkedHashMap3.put("rev", "f3b8c791");
                            linkedHashMap3.put("csdkrev", (String) qcgVar.a.d);
                            linkedHashMap3.put("connexion", qcgVar.d == jjg.NETWORK_CONNECTION_TYPE_WIFI ? Q3.b : "cell");
                            String language = Locale.getDefault().getLanguage();
                            language.getClass();
                            linkedHashMap3.put("language", language);
                            linkedHashMap3.put("tracking", Boolean.valueOf(!b10Var.t()));
                            en0 n = b10Var.n();
                            if (n != null) {
                                linkedHashMap3.put("gpp", (String) n.c);
                                linkedHashMap3.put("gpp_sid", (String) n.d);
                            }
                            if (b10Var.f() && (str2 = (String) b10Var.c) != null) {
                                linkedHashMap3.put("ifa", str2);
                            }
                            hbgVar.getClass();
                            hbgVar.getClass();
                            Map p3 = tub.p(linkedHashMap3);
                            try {
                                qgg qggVar = (qgg) pggVar;
                                qggVar.a(qbgVar.a, substring, p3);
                                try {
                                    bka bkaVar = (bka) this.b;
                                    pagVar.r = qggVar;
                                    pagVar.u = i2;
                                    obj = bkaVar.f(substring, p3, pagVar);
                                    if (obj == lu3Var) {
                                        return lu3Var;
                                    }
                                    r1 = qggVar;
                                } catch (qij e3) {
                                    e = e3;
                                    r1 = qggVar;
                                    qgg qggVar2 = (qgg) r1;
                                    qggVar2.getClass();
                                    ngg nggVar = qggVar2.b;
                                    String obj2 = e.toString();
                                    String str7 = qggVar2.h;
                                    Map map4 = qggVar2.i;
                                    a = nggVar.a("Ad call timeout", bkg.WARNING, "ad_call_timeout", qggVar2.d, qggVar2.c(new meg(obj2, null, str7, map4 == null ? yfa.O(map4) : null)));
                                    if (a != null) {
                                    }
                                    throw new qag("Timeout hit during ad call.");
                                } catch (Exception e4) {
                                    e = e4;
                                    r1 = qggVar;
                                    qgg qggVar3 = (qgg) r1;
                                    qggVar3.getClass();
                                    ngg nggVar2 = qggVar3.b;
                                    String obj3 = e.toString();
                                    String str8 = qggVar3.h;
                                    Map map5 = qggVar3.i;
                                    a2 = nggVar2.a("Ad call error", bkg.ERROR, "ad_call_error", qggVar3.d, qggVar3.c(new meg(obj3, null, str8, map5 != null ? yfa.O(map5) : null)));
                                    if (a2 != null) {
                                    }
                                    String message = e.getMessage();
                                    throw new oag(message == null ? str : message);
                                }
                            } catch (qij e5) {
                                e = e5;
                                r1 = pggVar;
                            } catch (Exception e6) {
                                e = e6;
                                r1 = pggVar;
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r1 = pagVar.r;
                            try {
                                try {
                                    y6a.M(obj);
                                    str = "";
                                    r1 = r1;
                                } catch (Exception e7) {
                                    e = e7;
                                    str = "";
                                    qgg qggVar32 = (qgg) r1;
                                    qggVar32.getClass();
                                    ngg nggVar22 = qggVar32.b;
                                    String obj32 = e.toString();
                                    String str82 = qggVar32.h;
                                    Map map52 = qggVar32.i;
                                    a2 = nggVar22.a("Ad call error", bkg.ERROR, "ad_call_error", qggVar32.d, qggVar32.c(new meg(obj32, null, str82, map52 != null ? yfa.O(map52) : null)));
                                    if (a2 != null) {
                                        nggVar22.e(a2, qggVar32.e, qggVar32.f, qggVar32.a, qggVar32.q, qggVar32.p, qggVar32.r, qggVar32.t, false);
                                    }
                                    String message2 = e.getMessage();
                                    throw new oag(message2 == null ? str : message2);
                                }
                            } catch (qij e8) {
                                e = e8;
                                qgg qggVar22 = (qgg) r1;
                                qggVar22.getClass();
                                ngg nggVar3 = qggVar22.b;
                                String obj22 = e.toString();
                                String str72 = qggVar22.h;
                                Map map42 = qggVar22.i;
                                a = nggVar3.a("Ad call timeout", bkg.WARNING, "ad_call_timeout", qggVar22.d, qggVar22.c(new meg(obj22, null, str72, map42 == null ? yfa.O(map42) : null)));
                                if (a != null) {
                                    nggVar3.e(a, qggVar22.e, qggVar22.f, qggVar22.a, qggVar22.q, qggVar22.p, qggVar22.r, qggVar22.t, false);
                                }
                                throw new qag("Timeout hit during ad call.");
                            }
                        }
                        String str9 = (String) obj;
                        z = str9.length() != 0;
                        r1.d(str9, z);
                        if (z) {
                            return str9;
                        }
                        throw new ufg("The server did not return any ad.");
                    }
                }
                String str92 = (String) obj;
                if (str92.length() != 0) {
                }
                r1.d(str92, z);
                if (z) {
                }
            } catch (Exception e9) {
                e = e9;
                qgg qggVar322 = (qgg) r1;
                qggVar322.getClass();
                ngg nggVar222 = qggVar322.b;
                String obj322 = e.toString();
                String str822 = qggVar322.h;
                Map map522 = qggVar322.i;
                a2 = nggVar222.a("Ad call error", bkg.ERROR, "ad_call_error", qggVar322.d, qggVar322.c(new meg(obj322, null, str822, map522 != null ? yfa.O(map522) : null)));
                if (a2 != null) {
                }
                String message22 = e.getMessage();
                throw new oag(message22 == null ? str : message22);
            }
            if (i != 0) {
            }
        } catch (ufg e10) {
            throw e10;
        }
        pagVar = new pag(this, sq3Var);
        Object obj4 = pagVar.s;
        lu3 lu3Var2 = lu3.a;
        i = pagVar.u;
        String str32 = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(kfj kfjVar) {
        kfj kfjVar2;
        kfj kfjVar3;
        e1d e1dVar = (e1d) this.c;
        String str = kfjVar.c;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            kfj kfjVar4 = (kfj) ((eoh) e1dVar).getValue();
            if (kfjVar4 == null) {
                ((eoh) e1dVar).setValue(kfjVar);
                return;
            }
            boolean z = kfjVar4.g;
            String str2 = kfjVar4.b;
            String str3 = kfjVar4.c;
            int i = kfjVar4.a;
            f9j f9jVar = kfjVar4.h;
            if (z) {
                boolean z2 = kfjVar.g;
                String str4 = kfjVar.b;
                int i2 = kfjVar.a;
                if (z2) {
                    long j = kfjVar.f;
                    long j2 = kfjVar4.f;
                    if (j >= j2 && j - j2 < 5000 && !Intrinsics.c(str3, "\n") && !Intrinsics.c(str3, "\r\n") && !Intrinsics.c(str, "\n") && !Intrinsics.c(str, "\r\n") && f9jVar == kfjVar.h) {
                        if (f9jVar == f9j.a && str3.length() + i == i2) {
                            kfjVar3 = new kfj(kfjVar4.a, "", dmi.q(str3, str), kfjVar4.d, kfjVar.e, kfjVar4.f, false, 64);
                        } else if (f9jVar == f9j.b && kfjVar4.a() == kfjVar.a() && (kfjVar4.a() == y8j.a || kfjVar4.a() == y8j.b)) {
                            if (i == str4.length() + i2) {
                                kfjVar3 = new kfj(kfjVar.a, dmi.q(str4, str2), "", kfjVar4.d, kfjVar.e, kfjVar4.f, false, 64);
                            } else {
                                int i3 = kfjVar4.a;
                                if (i3 == i2) {
                                    kfjVar2 = new kfj(i3, dmi.y(str2, str4), "", kfjVar4.d, kfjVar.e, kfjVar4.f, false, 64);
                                    if (kfjVar2 != null) {
                                        ((eoh) e1dVar).setValue(kfjVar2);
                                        return;
                                    } else {
                                        o();
                                        ((eoh) e1dVar).setValue(kfjVar);
                                        return;
                                    }
                                }
                            }
                        }
                        kfjVar2 = kfjVar3;
                        if (kfjVar2 != null) {
                        }
                    }
                }
            }
            kfjVar2 = null;
            if (kfjVar2 != null) {
            }
        } finally {
            bea.K(w, C, e);
        }
    }

    public cci z(qbl qblVar) {
        cci w;
        qblVar.getClass();
        synchronized (this.c) {
            w = ((by9) this.b).w(qblVar);
        }
        return w;
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
    }

    public /* synthetic */ y3g(int i, boolean z) {
        this.a = i;
    }

    @Override // defpackage.ozg
    public void c(djj djjVar, pl6 pl6Var, c2k c2kVar) {
    }

    @Override // defpackage.nzg
    public void j(cjj cjjVar, ol6 ol6Var, c2k c2kVar) {
    }

    public /* synthetic */ y3g(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public y3g(qcg qcgVar) {
        this.a = 3;
        bka bkaVar = new bka(qcgVar.b);
        t1d t1dVar = new t1d(qcgVar, 28);
        this.b = bkaVar;
        this.c = t1dVar;
    }

    public y3g(int i) {
        this.a = i;
        switch (i) {
            case 26:
                this.b = new ubf(3);
                this.c = new zmb(16);
                break;
            default:
                this.b = new dy9(1000L);
                this.c = m6k.d0(10, new kif(1));
                break;
        }
    }

    public y3g(String str, Object[] objArr) {
        this.a = 11;
        str.getClass();
        this.b = str;
        this.c = objArr;
    }

    public /* synthetic */ y3g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public y3g(kfj kfjVar, z9k z9kVar) {
        this.a = 23;
        this.b = z9kVar;
        this.c = e.f(kfjVar);
    }

    public y3g(by9 by9Var) {
        this.a = 22;
        this.b = by9Var;
        this.c = new Object();
    }

    public y3g(jqi jqiVar, ScheduledFuture scheduledFuture) {
        this.a = 21;
        this.b = jqiVar;
        z1a.y(scheduledFuture, "future");
        this.c = scheduledFuture;
    }

    public y3g(StartActivity startActivity) {
        this.a = 15;
        this.b = startActivity;
        this.c = new ilg(20);
    }

    public y3g(suk sukVar) {
        this.a = 28;
        this.c = sukVar;
        this.b = new Rect();
    }

    public y3g(y1k y1kVar) {
        this.a = 24;
        this.c = y1kVar;
        this.b = new nm2(new byte[4], 4, 2, (byte) 0);
    }

    public y3g(z1k z1kVar) {
        this.a = 25;
        this.c = z1kVar;
        this.b = new nm2(new byte[4], 4, 3, (byte) 0);
    }
}
