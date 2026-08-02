package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.ActionMode;
import android.view.Choreographer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.custom_views.BlazeDefaultTimeBar;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.equativ.displaysdk.coresdkdisplay.util.SCSGoogleServicesApiProxy;
import com.facebook.b;
import com.facebook.d0;
import com.facebook.i0;
import com.facebook.internal.a0;
import com.facebook.internal.k0;
import com.facebook.w;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.slider.RangeSlider;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.inmobi.media.B0;
import com.inmobi.media.Ci;
import com.ironsource.Ae;
import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
import com.ironsource.InterfaceC4292re;
import com.ironsource.Te;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.dialog.BaseFullScreenDialog;
import com.sofascore.results.tutorial.AbstractTutorialActivity;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03d0  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        i0 i0Var;
        i0 i0Var2;
        String str;
        Throwable th;
        ?? r0;
        String str2;
        i0 i0Var3;
        HttpURLConnection httpURLConnection;
        String sb;
        Set<String> keySet;
        od0 od0Var;
        i0 i0Var4;
        i0 i0Var5;
        String str3;
        String str4;
        char c;
        int i;
        String str5;
        ArrayList arrayList;
        a94 a94Var;
        String str6;
        int i2;
        int i3;
        td0 td0Var;
        int i4;
        d0 d0Var = (d0) this.b;
        i0 i0Var6 = i0.a;
        HashSet hashSet = xd0.a;
        i0 i0Var7 = i0.b;
        String str7 = "CAPITransformerWebRequests";
        String str8 = d0Var.b;
        String str9 = null;
        List split$default = str8 != null ? StringsKt__StringsKt.split$default(str8, new String[]{"/"}, false, 0, 6, null) : null;
        if (split$default == null || split$default.size() != 2) {
            b bVar = a0.a;
            b.k(i0Var7, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", d0Var);
            return;
        }
        try {
            vd0 vd0Var = xd0.c;
            try {
                if (vd0Var == null) {
                    Intrinsics.i("credentials");
                    throw null;
                }
                String str10 = vd0Var.b;
                if (vd0Var == null) {
                    Intrinsics.i("credentials");
                    throw null;
                }
                String str11 = str10 + "/capi/" + vd0Var.a + "/events";
                String str12 = "custom_events";
                JSONObject jSONObject = d0Var.c;
                if (jSONObject != null) {
                    ?? linkedHashMap = new LinkedHashMap(k0.g(jSONObject));
                    String str13 = d0Var.e;
                    str13.getClass();
                    linkedHashMap.put("custom_events", str13);
                    StringBuilder sb2 = new StringBuilder();
                    for (String str14 : linkedHashMap.keySet()) {
                        sb2.append(str14);
                        sb2.append(" : ");
                        sb2.append(linkedHashMap.get(str14));
                        sb2.append(System.getProperty("line.separator"));
                    }
                    b bVar2 = a0.a;
                    synchronized (w.b) {
                    }
                    Map map = ud0.a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    Object obj = linkedHashMap.get("event");
                    obj.getClass();
                    String str15 = (String) obj;
                    th = null;
                    int i5 = 3;
                    int i6 = str15.equals("MOBILE_APP_INSTALL") ? 1 : str15.equals("CUSTOM_APP_EVENTS") ? 2 : 3;
                    if (i6 != 3) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            String str16 = (String) entry.getKey();
                            Object value = entry.getValue();
                            str16.getClass();
                            od0[] values = od0.values();
                            int length = values.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    od0Var = null;
                                    break;
                                }
                                int i8 = i7;
                                od0Var = values[i8];
                                int i9 = length;
                                if (od0Var.a.equals(str16)) {
                                    break;
                                }
                                i7 = i8 + 1;
                                length = i9;
                            }
                            if (od0Var != null) {
                                value.getClass();
                                Map map2 = ud0.a;
                                td0 td0Var2 = (td0) map2.get(od0Var);
                                if (td0Var2 == null || (i2 = td0Var2.a) == 0) {
                                    i0Var4 = i0Var7;
                                } else {
                                    int C = wt3.C(i2);
                                    if (C != 0) {
                                        i0Var4 = i0Var7;
                                        if (C == 1 && (td0Var = (td0) map2.get(od0Var)) != null && (i4 = td0Var.b) != 0) {
                                            linkedHashMap3.put(bf3.b(i4), value);
                                        }
                                    } else {
                                        i0Var4 = i0Var7;
                                        if (od0Var == od0.USER_DATA) {
                                            try {
                                                linkedHashMap2.putAll(k0.g(new JSONObject((String) value)));
                                            } catch (JSONException unused) {
                                                b bVar3 = a0.a;
                                                synchronized (w.b) {
                                                }
                                            }
                                        } else {
                                            td0 td0Var3 = (td0) map2.get(od0Var);
                                            if (td0Var3 != null && (i3 = td0Var3.b) != 0) {
                                                linkedHashMap2.put(bf3.b(i3), value);
                                            }
                                        }
                                    }
                                }
                                i0Var5 = i0Var6;
                                str3 = str7;
                                str4 = str12;
                            } else {
                                i0Var4 = i0Var7;
                                boolean equals = str16.equals(str12);
                                boolean z = value instanceof String;
                                if (i6 == 2 && equals && z) {
                                    String str17 = (String) value;
                                    ArrayList arrayList3 = new ArrayList();
                                    try {
                                        Iterator it = k0.f(new JSONArray(str17)).iterator();
                                        while (it.hasNext()) {
                                            arrayList3.add(k0.g(new JSONObject((String) it.next())));
                                        }
                                        if (arrayList3.isEmpty()) {
                                            arrayList = null;
                                        } else {
                                            arrayList = new ArrayList();
                                            Iterator it2 = arrayList3.iterator();
                                            while (it2.hasNext()) {
                                                ?? r8 = (Map) it2.next();
                                                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                                Iterator it3 = it2;
                                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                for (String str18 : r8.keySet()) {
                                                    str18.getClass();
                                                    String str19 = str12;
                                                    a94[] values2 = a94.values();
                                                    i0 i0Var8 = i0Var6;
                                                    int length2 = values2.length;
                                                    int i10 = 0;
                                                    while (true) {
                                                        if (i10 >= length2) {
                                                            a94Var = null;
                                                            break;
                                                        }
                                                        int i11 = length2;
                                                        a94Var = values2[i10];
                                                        int i12 = i10;
                                                        if (a94Var.a.equals(str18)) {
                                                            break;
                                                        }
                                                        i10 = i12 + 1;
                                                        length2 = i11;
                                                    }
                                                    sd0 sd0Var = (sd0) ud0.b.get(a94Var);
                                                    if (a94Var == null || sd0Var == null) {
                                                        str6 = str7;
                                                    } else {
                                                        str6 = str7;
                                                        int i13 = sd0Var.b;
                                                        int i14 = sd0Var.a;
                                                        if (i14 == 0) {
                                                            try {
                                                                String a = bf3.a(i13);
                                                                if (a94Var == a94.EVENT_NAME && ((String) r8.get(str18)) != null) {
                                                                    Object obj2 = r8.get(str18);
                                                                    obj2.getClass();
                                                                    String str20 = (String) obj2;
                                                                    Map map3 = ud0.c;
                                                                    if (map3.containsKey(str20)) {
                                                                        os3 os3Var = (os3) map3.get(str20);
                                                                        str20 = os3Var != null ? os3Var.a : "";
                                                                    }
                                                                    linkedHashMap6.put(a, str20);
                                                                } else if (a94Var == a94.EVENT_TIME && ((Integer) r8.get(str18)) != null) {
                                                                    Object obj3 = r8.get(str18);
                                                                    obj3.getClass();
                                                                    Object a2 = ud0.a(obj3, str18);
                                                                    a2.getClass();
                                                                    linkedHashMap6.put(a, a2);
                                                                }
                                                            } catch (ClassCastException e) {
                                                                b bVar4 = a0.a;
                                                                de6.b(e);
                                                                synchronized (w.b) {
                                                                }
                                                            }
                                                        } else if (i14 == 3) {
                                                            String a3 = bf3.a(i13);
                                                            Object obj4 = r8.get(str18);
                                                            obj4.getClass();
                                                            Object a4 = ud0.a(obj4, str18);
                                                            a4.getClass();
                                                            linkedHashMap5.put(a3, a4);
                                                        }
                                                    }
                                                    str12 = str19;
                                                    i0Var6 = i0Var8;
                                                    str7 = str6;
                                                }
                                                i0 i0Var9 = i0Var6;
                                                String str21 = str7;
                                                String str22 = str12;
                                                if (!linkedHashMap5.isEmpty()) {
                                                    linkedHashMap6.put("custom_data", linkedHashMap5);
                                                }
                                                arrayList.add(linkedHashMap6);
                                                it2 = it3;
                                                str12 = str22;
                                                i0Var6 = i0Var9;
                                                str7 = str21;
                                            }
                                        }
                                        i0Var5 = i0Var6;
                                        str3 = str7;
                                        str4 = str12;
                                    } catch (JSONException unused2) {
                                        i0Var5 = i0Var6;
                                        str3 = str7;
                                        str4 = str12;
                                        b bVar5 = a0.a;
                                        synchronized (w.b) {
                                            arrayList = null;
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList2.addAll(arrayList);
                                    }
                                } else {
                                    i0Var5 = i0Var6;
                                    str3 = str7;
                                    str4 = str12;
                                    int i15 = 3;
                                    int[] D = wt3.D(3);
                                    int length3 = D.length;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= length3) {
                                            c = 2;
                                            i = 0;
                                            break;
                                        }
                                        i = D[i16];
                                        if (i != 1) {
                                            c = 2;
                                            if (i == 2) {
                                                str5 = "data_processing_options_country";
                                            } else {
                                                if (i != i15) {
                                                    throw null;
                                                }
                                                str5 = "data_processing_options_state";
                                            }
                                        } else {
                                            c = 2;
                                            str5 = "data_processing_options";
                                        }
                                        if (str5.equals(str16)) {
                                            break;
                                        }
                                        i16++;
                                        i15 = 3;
                                    }
                                    if (i != 0) {
                                        linkedHashMap4.put(str16, value);
                                    }
                                    i0Var7 = i0Var4;
                                    str12 = str4;
                                    i0Var6 = i0Var5;
                                    str7 = str3;
                                    i5 = 3;
                                }
                            }
                            c = 2;
                            i0Var7 = i0Var4;
                            str12 = str4;
                            i0Var6 = i0Var5;
                            str7 = str3;
                            i5 = 3;
                        }
                    }
                    i0Var = i0Var6;
                    i0Var2 = i0Var7;
                    str = str7;
                    if (i6 != i5) {
                        Object obj5 = linkedHashMap.get("install_timestamp");
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                        linkedHashMap7.put("action_source", "app");
                        linkedHashMap7.put("user_data", linkedHashMap2);
                        linkedHashMap7.put("app_data", linkedHashMap3);
                        linkedHashMap7.putAll(linkedHashMap4);
                        int C2 = wt3.C(i6);
                        if (C2 != 0) {
                            if (C2 == 1 && !arrayList2.isEmpty()) {
                                r0 = new ArrayList();
                                Iterator it4 = arrayList2.iterator();
                                while (it4.hasNext()) {
                                    Map map4 = (Map) it4.next();
                                    LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                    linkedHashMap8.putAll(linkedHashMap7);
                                    linkedHashMap8.putAll(map4);
                                    r0.add(linkedHashMap8);
                                }
                            }
                        } else if (obj5 != null) {
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            linkedHashMap9.putAll(linkedHashMap7);
                            linkedHashMap9.put("event_name", "MobileAppInstall");
                            linkedHashMap9.put("event_time", obj5);
                            r0 = a.c(linkedHashMap9);
                        }
                        if (r0 != 0) {
                            return;
                        }
                        xd0.a().addAll(r0);
                        int max = Math.max(0, xd0.a().size() - 1000);
                        if (max > 0) {
                            List S = CollectionsKt.S(xd0.a(), max);
                            S.getClass();
                            xd0.d = i5k.b(S);
                        }
                        int min = Math.min(xd0.a().size(), 10);
                        List a5 = xd0.a();
                        IntRange intRange = new IntRange(0, min - 1, 1);
                        List S0 = intRange.isEmpty() ? km5.a : CollectionsKt.S0(a5.subList(0, intRange.b + 1));
                        xd0.a().subList(0, min).clear();
                        JSONArray jSONArray = new JSONArray((Collection) S0);
                        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                        linkedHashMap10.put("data", jSONArray);
                        vd0 vd0Var2 = xd0.c;
                        if (vd0Var2 == null) {
                            Throwable th2 = th;
                            Intrinsics.i("credentials");
                            throw th2;
                        }
                        linkedHashMap10.put("accessKey", vd0Var2.c);
                        String jSONObject2 = new JSONObject(linkedHashMap10).toString();
                        ?? o = wv8.o("Content-Type", C4427z5.M);
                        wd0 wd0Var = new wd0(S0, 0 == true ? 1 : 0);
                        try {
                            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str11).openConnection());
                            uRLConnection.getClass();
                            httpURLConnection = (HttpURLConnection) uRLConnection;
                            httpURLConnection.setRequestMethod(C4094gc.b);
                            if (o != null && (keySet = o.keySet()) != null) {
                                for (String str23 : keySet) {
                                    httpURLConnection.setRequestProperty(str23, (String) o.get(str23));
                                }
                            }
                            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals(C4094gc.b) || httpURLConnection.getRequestMethod().equals("PUT"));
                            httpURLConnection.setConnectTimeout(60000);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, C.UTF8_NAME));
                            bufferedWriter.write(jSONObject2);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            bufferedOutputStream.close();
                            StringBuilder sb3 = new StringBuilder();
                            if (xd0.a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), C.UTF8_NAME));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        } else {
                                            sb3.append(readLine);
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            throw th3;
                                        } catch (Throwable th4) {
                                            n4o.x(bufferedReader, th3);
                                            throw th4;
                                        }
                                    }
                                }
                                Unit unit = Unit.a;
                                bufferedReader.close();
                            }
                            sb = sb3.toString();
                            b bVar6 = a0.a;
                            i0Var3 = i0Var;
                            str2 = str;
                        } catch (UnknownHostException e2) {
                            e = e2;
                            i0Var3 = i0Var;
                            str2 = str;
                            b bVar7 = a0.a;
                            b.k(i0Var3, str2, "Connection failed, retrying: \n%s", e.toString());
                            wd0Var.invoke(th, Integer.valueOf(PglCryptUtils.COMPRESS_FAILED));
                            return;
                        } catch (IOException e3) {
                            e = e3;
                            str2 = str;
                            b bVar8 = a0.a;
                            b.k(i0Var2, str2, "Send to server failed: \n%s", e.toString());
                            return;
                        }
                        try {
                            b.k(i0Var3, str2, "\nResponse Received: \n%s\n%s", sb, Integer.valueOf(httpURLConnection.getResponseCode()));
                            wd0Var.invoke(sb, Integer.valueOf(httpURLConnection.getResponseCode()));
                            return;
                        } catch (UnknownHostException e4) {
                            e = e4;
                            b bVar72 = a0.a;
                            b.k(i0Var3, str2, "Connection failed, retrying: \n%s", e.toString());
                            wd0Var.invoke(th, Integer.valueOf(PglCryptUtils.COMPRESS_FAILED));
                            return;
                        } catch (IOException e5) {
                            e = e5;
                            b bVar82 = a0.a;
                            b.k(i0Var2, str2, "Send to server failed: \n%s", e.toString());
                            return;
                        }
                    }
                } else {
                    i0Var = i0Var6;
                    i0Var2 = i0Var7;
                    str = "CAPITransformerWebRequests";
                    th = null;
                }
                r0 = th;
                if (r0 != 0) {
                }
            } catch (iak e6) {
                e = e6;
                b bVar9 = a0.a;
                b.k(i0Var6, str9, "\n Credentials not initialized Error when logging: \n%s", e);
            }
        } catch (iak e7) {
            e = e7;
            i0Var6 = i0Var7;
            str9 = "CAPITransformerWebRequests";
        }
    }

    private final void b() {
        ml0 ml0Var = (ml0) this.b;
        synchronized (ml0Var.b) {
            try {
                if (ml0Var.l) {
                    return;
                }
                long j = ml0Var.k - 1;
                ml0Var.k = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    ml0Var.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (ml0Var.b) {
                    ml0Var.m = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        ll0 ll0Var = (ll0) this.b;
        synchronized (ll0Var.a) {
            try {
                if (ll0Var.l) {
                    return;
                }
                long j = ll0Var.k - 1;
                ll0Var.k = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    ll0Var.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (ll0Var.a) {
                    ll0Var.m = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x041f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0423, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Status status;
        Object obj;
        int[] iArr;
        int[] iArr2;
        int i;
        long j;
        float f;
        boolean z;
        long j2;
        int i2;
        long j3;
        int i3;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ((a3) this.b).b();
                return;
            case 1:
                ConstraintLayout constraintLayout = ((k6) this.b).d.a;
                constraintLayout.getClass();
                constraintLayout.setVisibility(0);
                return;
            case 2:
                es1 es1Var = (es1) this.b;
                jy4 jy4Var = es1Var.d;
                tgj.q(jy4Var.s.b, null, 14);
                Event event = es1Var.e;
                if (Intrinsics.c((event == null || (status = event.getStatus()) == null) ? null : status.getType(), StatusKt.STATUS_IN_PROGRESS)) {
                    tgj.p(jy4Var.n, 300L, 2);
                    return;
                }
                return;
            case 3:
                AbstractTutorialActivity abstractTutorialActivity = (AbstractTutorialActivity) this.b;
                int i4 = AbstractTutorialActivity.R;
                if (abstractTutorialActivity.V(0) != null) {
                    i8 i8Var = i8.a;
                    return;
                }
                return;
            case 4:
                Activity activity = (Activity) this.b;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = vd.g;
                Method method = vd.f;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i5 != 26 && i5 != 27) || method != null) && (vd.e != null || vd.d != null)) {
                    try {
                        Object obj2 = vd.c.get(activity);
                        if (obj2 != null && (obj = vd.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            ud udVar = new ud(activity);
                            application.registerActivityLifecycleCallbacks(udVar);
                            handler.post(new vlo(1, udVar, obj2));
                            try {
                                if (i5 == 26 || i5 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new a8p(1, application, udVar));
                                return;
                            } finally {
                                handler.post(new a8p(1, application, udVar));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 5:
                final ia0 ia0Var = (ia0) this.b;
                MetaData metaData = new MetaData(ia0Var);
                if (zic.u(ia0Var) == 1) {
                    metaData.set("gdpr.consent", Boolean.valueOf(zic.z(ia0Var)));
                    MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings(Boolean.valueOf(zic.z(ia0Var)), (Boolean) null, (Boolean) null, 6, (DefaultConstructorMarker) null));
                }
                metaData.set("privacy.consent", Boolean.TRUE);
                metaData.set("user.nonbehavioral", Boolean.FALSE);
                metaData.commit();
                PangleMediationAdapter.setPAConsent(1);
                if (mx9.x(false)) {
                    if (!wib.g) {
                        wib.g = true;
                        if (!hkg.d) {
                            hkg.d = true;
                            synchronized (hkg.class) {
                                hkg.a = ia0Var.getApplicationContext();
                                try {
                                    hkg.e = GoogleApiAvailability.e.b(ia0Var, GoogleApiAvailabilityLight.a) == 0;
                                } catch (Throwable unused2) {
                                }
                                if (hkg.e) {
                                    hkg.b = new SCSGoogleServicesApiProxy(ia0Var);
                                } else {
                                    try {
                                        hkg.b = Class.forName("com.equativ.support.huawei.SCSHuaweiServicesApiProxy").getConstructor(Context.class).newInstance(ia0Var);
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                            ujg.P(ia0Var.getApplicationContext());
                            hkg.c = ((UiModeManager) ia0Var.getSystemService("uimode")).getCurrentModeType() == 4;
                            ia0Var.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
                            dlg dlgVar = dlg.d;
                            if (dlgVar.b == null) {
                                SharedPreferences sharedPreferences = ia0Var.getApplicationContext().getSharedPreferences("SCSWebviewCookieJar", 0);
                                dlgVar.b = sharedPreferences;
                                Set<String> stringSet = sharedPreferences.getStringSet("equativ_sdk_cookie_hosts", null);
                                if (stringSet != null) {
                                    dlgVar.c.addAll(stringSet);
                                }
                            }
                        }
                        mjg.a().c(ia0Var);
                    }
                    nv.d(ia0Var, ru.EQUATIV);
                }
                try {
                    yea yeaVar = j58.a;
                    if (j58.l(false)) {
                        gcd.a(ia0Var);
                        cp cpVar = ocd.a;
                        nv.d(ia0Var, ru.NIMBUS);
                    }
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext = ia0Var.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences2 = a5f.d(applicationContext);
                            uic.j = sharedPreferences2;
                        }
                        sharedPreferences2.getClass();
                    }
                    if (!sharedPreferences2.getBoolean("DEV_MODE_FORCE_BIDDING_ADAPTERS", false)) {
                        e58 f2 = e58.f();
                        f2.getClass();
                        if (!f2.c("bidding_adapters_enabled")) {
                            MobileAds.disableMediationAdapterInitialization(ia0Var);
                        }
                    }
                    RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
                    SharedPreferences sharedPreferences3 = uic.j;
                    if (sharedPreferences3 == null) {
                        Context applicationContext2 = ia0Var.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences3 = a5f.d(applicationContext2);
                            uic.j = sharedPreferences3;
                        }
                        sharedPreferences3.getClass();
                    }
                    if (sharedPreferences3.getInt("IABTCF_gdprApplies", 0) == 1) {
                        builder.setTagForUnderAgeOfConsent(0);
                    } else {
                        builder.setTagForChildDirectedTreatment(0);
                    }
                    RequestConfiguration build = builder.build();
                    build.getClass();
                    MobileAds.setRequestConfiguration(build);
                    MobileAds.initialize(ia0Var, new OnInitializationCompleteListener() { // from class: qk
                        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                        public final void onInitializationComplete(InitializationStatus initializationStatus) {
                            initializationStatus.getClass();
                            z8e.U(ia0.this, true);
                            MobileAds.setAppVolume(0.5f);
                            MobileAds.setAppMuted(true);
                            ad2 ad2Var = qv5.a;
                            qv5.a(w42.a);
                        }
                    });
                    nv.d(ia0Var, ru.GOOGLE);
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 6:
                Ae.b((Te) this.b);
                return;
            case 7:
                Ae.a((InterfaceC4292re) this.b);
                return;
            case 8:
                Ae.a((IronSourceError) this.b);
                return;
            case 9:
                dz dzVar = (dz) this.b;
                Trace.beginSection("measureAndLayout");
                try {
                    dzVar.d.z(true);
                    Unit unit = Unit.a;
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        dzVar.n();
                        Trace.endSection();
                        dzVar.I = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 10:
                tz tzVar = (tz) this.b;
                boolean f3 = tzVar.f();
                xy xyVar = tzVar.a;
                if (f3) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        xyVar.z(true);
                        uzc uzcVar = tzVar.j;
                        int[] iArr3 = uzcVar.b;
                        long[] jArr = uzcVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j4 = jArr[i6];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    long j5 = j4;
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((255 & j5) < 128) {
                                            int i9 = iArr3[(i6 << 3) + i8];
                                            if (!tzVar.d().a(i9)) {
                                                iArr2 = iArr3;
                                                tzVar.d.add(new ho3(i9, tzVar.i, io3.b, null));
                                                tzVar.g.d(Unit.a);
                                                j5 >>= 8;
                                                i8++;
                                                iArr3 = iArr2;
                                            }
                                        }
                                        iArr2 = iArr3;
                                        j5 >>= 8;
                                        i8++;
                                        iArr3 = iArr2;
                                    }
                                    iArr = iArr3;
                                    if (i7 == 8) {
                                    }
                                } else {
                                    iArr = iArr3;
                                }
                                if (i6 != length) {
                                    i6++;
                                    iArr3 = iArr;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        tzVar.l(xyVar.getSemanticsOwner().a(), tzVar.k);
                        Unit unit2 = Unit.a;
                        Trace.endSection();
                        tzVar.b(tzVar.d());
                        tzVar.q();
                        tzVar.l = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 11:
                ActionMode actionMode = ((t30) this.b).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 12:
                y70 y70Var = (y70) ((y70) this.b).c.b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = y70Var.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    d0i d0iVar = (d0i) arrayList.get(i10);
                    if (d0iVar != null) {
                        fhh fhhVar = y70Var.a;
                        Long l = (Long) fhhVar.get(d0iVar);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                fhhVar.remove(d0iVar);
                            }
                        }
                        long j6 = d0iVar.i;
                        if (j6 == 0) {
                            d0iVar.i = uptimeMillis;
                            d0iVar.d(d0iVar.b);
                        } else {
                            long j7 = uptimeMillis - j6;
                            d0iVar.i = uptimeMillis;
                            float f4 = d0i.b().g;
                            long j8 = f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2147483647L : (long) (j7 / f4);
                            boolean z3 = d0iVar.o;
                            float f5 = d0iVar.n;
                            if (z3) {
                                if (f5 != Float.MAX_VALUE) {
                                    d0iVar.m.i = f5;
                                    d0iVar.n = Float.MAX_VALUE;
                                }
                                d0iVar.b = (float) d0iVar.m.i;
                                d0iVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                d0iVar.o = z2;
                                j = uptimeMillis2;
                            } else {
                                e0i e0iVar = d0iVar.m;
                                float f6 = d0iVar.b;
                                float f7 = d0iVar.a;
                                if (f5 != Float.MAX_VALUE) {
                                    j = uptimeMillis2;
                                    long j9 = j8 / 2;
                                    qh0 c = e0iVar.c(f6, f7, j9);
                                    e0i e0iVar2 = d0iVar.m;
                                    e0iVar2.i = d0iVar.n;
                                    d0iVar.n = Float.MAX_VALUE;
                                    qh0 c2 = e0iVar2.c(c.a, c.b, j9);
                                    f = c2.a;
                                    d0iVar.b = f;
                                    d0iVar.a = c2.b;
                                } else {
                                    j = uptimeMillis2;
                                    qh0 c3 = e0iVar.c(f6, f7, j8);
                                    f = c3.a;
                                    d0iVar.b = f;
                                    d0iVar.a = c3.b;
                                }
                                float max = Math.max(f, d0iVar.h);
                                d0iVar.b = max;
                                d0iVar.b = Math.min(max, d0iVar.g);
                                float f8 = d0iVar.a;
                                e0i e0iVar3 = d0iVar.m;
                                e0iVar3.getClass();
                                if (Math.abs(f8) >= e0iVar3.e || Math.abs(r5 - ((float) e0iVar3.i)) >= e0iVar3.d) {
                                    z = false;
                                    float min = Math.min(d0iVar.b, d0iVar.g);
                                    d0iVar.b = min;
                                    float max2 = Math.max(min, d0iVar.h);
                                    d0iVar.b = max2;
                                    d0iVar.d(max2);
                                    if (z) {
                                        j2 = uptimeMillis;
                                        i2 = i10;
                                        i10 = i2 + 1;
                                        uptimeMillis = j2;
                                        uptimeMillis2 = j;
                                        z2 = false;
                                    } else {
                                        ArrayList arrayList2 = d0iVar.k;
                                        d0iVar.f = false;
                                        y70 b = d0i.b();
                                        b.a.remove(d0iVar);
                                        ArrayList arrayList3 = b.b;
                                        int indexOf = arrayList3.indexOf(d0iVar);
                                        if (indexOf >= 0) {
                                            arrayList3.set(indexOf, null);
                                            b.f = true;
                                        }
                                        d0iVar.i = 0L;
                                        d0iVar.c = false;
                                        int i11 = 0;
                                        while (i11 < arrayList2.size()) {
                                            if (arrayList2.get(i11) != null) {
                                                h51 h51Var = (h51) arrayList2.get(i11);
                                                float f9 = d0iVar.b;
                                                switch (h51Var.a) {
                                                    case 0:
                                                        j3 = uptimeMillis;
                                                        i3 = i10;
                                                        k51 k51Var = (k51) h51Var.b;
                                                        if (k51Var.getProgressDrawable() != null && k51Var.getProgressDrawable().getLevel() == 10000) {
                                                            i51 i51Var = k51Var.l;
                                                            if (k51Var.getVisibility() != 0) {
                                                                k51Var.removeCallbacks(k51Var.k);
                                                                break;
                                                            } else {
                                                                k51Var.removeCallbacks(i51Var);
                                                                long uptimeMillis3 = SystemClock.uptimeMillis() - k51Var.e;
                                                                long j10 = k51Var.d;
                                                                if (uptimeMillis3 >= j10) {
                                                                    i51Var.run();
                                                                    break;
                                                                } else {
                                                                    k51Var.postDelayed(i51Var, j10 - uptimeMillis3);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        swj swjVar = (swj) h51Var.b;
                                                        ogj ogjVar = ogj.c;
                                                        jxj jxjVar = swjVar.h;
                                                        if (f9 < 1.0f) {
                                                            long j11 = jxjVar.x;
                                                            xwj Q = jxjVar.Q(0);
                                                            xwj xwjVar = Q.s;
                                                            Q.s = null;
                                                            j3 = uptimeMillis;
                                                            i3 = i10;
                                                            jxjVar.E(-1L, swjVar.a);
                                                            jxjVar.E(j11, -1L);
                                                            swjVar.a = j11;
                                                            Runnable runnable = swjVar.g;
                                                            if (runnable != null) {
                                                                runnable.run();
                                                            }
                                                            jxjVar.u.clear();
                                                            if (xwjVar != null) {
                                                                xwjVar.x(xwjVar, ogjVar, true);
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        } else {
                                                            j3 = uptimeMillis;
                                                            i3 = i10;
                                                            jxjVar.x(jxjVar, ogjVar, false);
                                                            break;
                                                        }
                                                }
                                            } else {
                                                j3 = uptimeMillis;
                                                i3 = i10;
                                            }
                                            i11++;
                                            uptimeMillis = j3;
                                            i10 = i3;
                                        }
                                        j2 = uptimeMillis;
                                        i2 = i10;
                                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                        i10 = i2 + 1;
                                        uptimeMillis = j2;
                                        uptimeMillis2 = j;
                                        z2 = false;
                                    }
                                } else {
                                    d0iVar.b = (float) d0iVar.m.i;
                                    d0iVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                            }
                            z = true;
                            float min2 = Math.min(d0iVar.b, d0iVar.g);
                            d0iVar.b = min2;
                            float max22 = Math.max(min2, d0iVar.h);
                            d0iVar.b = max22;
                            d0iVar.d(max22);
                            if (z) {
                            }
                        }
                    }
                    j2 = uptimeMillis;
                    j = uptimeMillis2;
                    i2 = i10;
                    i10 = i2 + 1;
                    uptimeMillis = j2;
                    uptimeMillis2 = j;
                    z2 = false;
                }
                if (y70Var.f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        y70Var.h.b();
                    }
                    i = 0;
                    y70Var.f = false;
                } else {
                    i = 0;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) y70Var.e.b).postFrameCallback(new x70(i, y70Var.d));
                    return;
                }
                return;
            case 13:
                a();
                return;
            case 14:
                c();
                return;
            case 15:
                b();
                return;
            case 16:
                dn0 dn0Var = (dn0) this.b;
                if (dn0Var.c.b) {
                    vg6 vg6Var = dn0Var.a.a;
                    int i12 = vg6.r0;
                    vg6Var.g0(3, false);
                    return;
                }
                return;
            case 17:
                ((i1k) this.b).i();
                return;
            case 18:
                vdb vdbVar = (vdb) this.b;
                vdbVar.getClass();
                if (Thread.currentThread() == ((Thread) vdbVar.c)) {
                    vdbVar.g(-1, new a70(11));
                    return;
                }
                return;
            case 19:
                B0.a((B0) this.b);
                return;
            case 20:
                az0 az0Var = (az0) this.b;
                y3g y3gVar = az0Var.d;
                if (y3gVar != null) {
                    jqi jqiVar = (jqi) y3gVar.b;
                    if (!jqiVar.c && !jqiVar.b) {
                        y3gVar.e();
                    }
                }
                az0Var.c = null;
                return;
            case 21:
                ((e21) this.b).i();
                return;
            case 22:
                BaseFullScreenDialog baseFullScreenDialog = (BaseFullScreenDialog) this.b;
                if (!baseFullScreenDialog.isAdded() || baseFullScreenDialog.getParentFragmentManager().S()) {
                    return;
                }
                baseFullScreenDialog.k(false, false);
                return;
            case 23:
                RangeSlider rangeSlider = (RangeSlider) this.b;
                rangeSlider.setActiveThumbIndex(-1);
                rangeSlider.invalidate();
                return;
            case 24:
                BlazeDefaultTimeBar blazeDefaultTimeBar = (BlazeDefaultTimeBar) this.b;
                BlazeDefaultTimeBar.a aVar = BlazeDefaultTimeBar.e0;
                blazeDefaultTimeBar.f(false);
                return;
            case 25:
                ((CarouselLayoutManager) this.b).requestLayout();
                return;
            case 26:
                ChatActivity chatActivity = (ChatActivity) this.b;
                int i13 = ChatActivity.Z;
                chatActivity.R().h.requestLayout();
                return;
            case 27:
                Ci.a((Ci) this.b);
                return;
            case 28:
                ((jw2) this.b).s(true);
                return;
            default:
                p03 p03Var = (p03) this.b;
                if (cw3.a.contains(p03.class)) {
                    return;
                }
                try {
                    p03Var.q();
                    return;
                } catch (Throwable th) {
                    cw3.a(p03.class, th);
                    return;
                }
        }
    }
}
