package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsManager;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.download.Command;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.buzzer.BuzzerActivity;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements qqd, msi, xd, OnSuccessListener, kpd, og0, NativeCustomFormatAd.OnCustomFormatAdLoadedListener, dpi, SuccessContinuation, yu4, ec3, Continuation, pdb, qdb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        x9l applySafeAreaInsets$lambda$6;
        applySafeAreaInsets$lambda$6 = AndroidWebViewContainer.applySafeAreaInsets$lambda$6((AndroidWebViewContainer) this.b, view, x9lVar);
        return applySafeAreaInsets$lambda$6;
    }

    public bm2 a(l2a l2aVar) {
        cm2 cm2Var = (cm2) this.b;
        URL url = (URL) l2aVar.b;
        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(C4094gc.b);
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", C4427z5.M);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) l2aVar.d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    d4a d4aVar = cm2Var.a;
                    js0 js0Var = (js0) l2aVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    lfa lfaVar = (lfa) d4aVar.b;
                    pha phaVar = new pha(bufferedWriter, lfaVar.a, lfaVar.b, lfaVar.c, lfaVar.d);
                    phaVar.h(js0Var);
                    phaVar.j();
                    phaVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", valueOf);
                    }
                    d7a.t(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    d7a.t(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new bm2(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new bm2(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            bm2 bm2Var = new bm2(responseCode, (URL) null, qu0.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bm2Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException | UnknownHostException unused) {
            d7a.A("CctTransportBackend");
            return new bm2(500, (URL) null, 0L);
        } catch (IOException | mn5 unused2) {
            d7a.A("CctTransportBackend");
            return new bm2(400, (URL) null, 0L);
        }
    }

    @Override // defpackage.yu4
    public void b(vff vffVar) {
        ((ow3) this.b).b.set((ow3) vffVar.get());
    }

    @Override // defpackage.og0
    public int c(int i, ema emaVar) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 5:
                return ((fo) obj).a(0, i, emaVar);
            default:
                return ((kv1) obj).a(0, i, emaVar);
        }
    }

    @Override // defpackage.msi
    public void d(jsi jsiVar, int i) {
        s8 s8Var = (s8) this.b;
        Object obj = s8Var.l.get(i);
        obj.getClass();
        SpannableString spannableString = new SpannableString(s8Var.H((Enum) obj));
        if (StringsKt.M(spannableString, "●")) {
            spannableString.setSpan(new ForegroundColorSpan(s8Var.I()), spannableString.length() - 1, spannableString.length(), 33);
        }
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(spannableString)) {
            jsiVar.e.setContentDescription(spannableString);
        }
        jsiVar.a = spannableString;
        lsi lsiVar = jsiVar.e;
        if (lsiVar != null) {
            lsiVar.e();
            jsi jsiVar2 = lsiVar.a;
            lsiVar.setSelected(jsiVar2 != null && jsiVar2.a());
        }
    }

    @Override // defpackage.dpi
    public void g() {
        BuzzerActivity buzzerActivity = (BuzzerActivity) this.b;
        int i = BuzzerActivity.O;
        ((k92) buzzerActivity.L.getValue()).k(false);
        xw3.L(wca.x(buzzerActivity.getLifecycle()), null, null, new q3(buzzerActivity, null, 13), 3);
    }

    @Override // defpackage.pdb
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 24:
                dm4 dm4Var = (dm4) obj2;
                r6c r6cVar = (r6c) ((rv) obj);
                r6cVar.x += dm4Var.h;
                r6cVar.y += dm4Var.f;
                break;
            case 25:
                ((r6c) ((rv) obj)).v = ((l6c) obj2).a;
                break;
            case 26:
                ((s6c) ((sv) obj)).o = (dke) obj2;
                break;
            case 27:
                dm4 dm4Var2 = (dm4) obj2;
                s6c s6cVar = (s6c) ((sv) obj);
                s6cVar.y += dm4Var2.h;
                s6cVar.z += dm4Var2.f;
                break;
            case 28:
                s6c s6cVar2 = (s6c) ((sv) obj);
                s6cVar2.getClass();
                s6cVar2.w = ((m6c) obj2).a;
                break;
            default:
                ((r6c) ((rv) obj)).n = (sf6) obj2;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        rd4 rd4Var;
        String str;
        String str2;
        Object obj;
        jd0 a;
        int i;
        final ng2 ng2Var;
        Task task;
        Task onSuccessTask;
        TimeUnit timeUnit;
        r18 r18Var;
        Context context;
        boolean h0;
        String str3;
        NetworkInfo activeNetworkInfo;
        bah f;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
        int i2 = CrashlyticsRegistrar.d;
        System.currentTimeMillis();
        r38 r38Var = (r38) vngVar.e(r38.class);
        l48 l48Var = (l48) vngVar.e(l48.class);
        nvd l = vngVar.l(ow3.class);
        nvd l2 = vngVar.l(iu.class);
        nvd l3 = vngVar.l(k58.class);
        ExecutorService executorService = (ExecutorService) vngVar.h(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) vngVar.h(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) vngVar.h(crashlyticsRegistrar.c);
        r38Var.a();
        Context context2 = r38Var.a;
        String packageName = context2.getPackageName();
        hcc hccVar = new hcc(executorService, executorService2);
        r18 r18Var2 = new r18(context2);
        rd4 rd4Var2 = new rd4(r38Var);
        ar9 ar9Var = new ar9(context2, packageName, l48Var, rd4Var2);
        ow3 ow3Var = new ow3(l);
        lu luVar = new lu(l2);
        ew3 ew3Var = new ew3(rd4Var2, r18Var2);
        v58 v58Var = v58.a;
        r8h r8hVar = r8h.a;
        v58 v58Var2 = v58.a;
        t58 a2 = v58.a(r8hVar);
        if (a2.b != null) {
            r8hVar.toString();
        } else {
            a2.b = ew3Var;
            r8hVar.toString();
            a2.a.countDown();
        }
        final nw3 nw3Var = new nw3(r38Var, ar9Var, ow3Var, rd4Var2, new ku(luVar), new ku(luVar), r18Var2, ew3Var, new bka(l3, 14), hccVar);
        hcc hccVar2 = nw3Var.o;
        r38Var.a();
        String str4 = r38Var.c.b;
        int q0 = k53.q0(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (q0 == 0) {
            q0 = k53.q0(context2, "com.crashlytics.android.build_id", "string");
        }
        String string = q0 != 0 ? context2.getResources().getString(q0) : null;
        ArrayList arrayList = new ArrayList();
        int q02 = k53.q0(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int q03 = k53.q0(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int q04 = k53.q0(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (q02 == 0 || q03 == 0 || q04 == 0) {
            rd4Var = rd4Var2;
            str = str4;
            str2 = null;
            String.format("Could not find resources: %d %d %d", Integer.valueOf(q02), Integer.valueOf(q03), Integer.valueOf(q04));
        } else {
            String[] stringArray = context2.getResources().getStringArray(q02);
            String[] stringArray2 = context2.getResources().getStringArray(q03);
            String[] stringArray3 = context2.getResources().getStringArray(q04);
            str2 = null;
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i3 = 0;
                while (i3 < stringArray3.length) {
                    int i4 = i3;
                    arrayList.add(new s62(stringArray[i3], stringArray2[i4], stringArray3[i4]));
                    i3 = i4 + 1;
                    str4 = str4;
                    rd4Var2 = rd4Var2;
                }
                rd4Var = rd4Var2;
                str = str4;
            } else {
                rd4Var = rd4Var2;
                str = str4;
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str5 = ((s62) it.next()).a;
        }
        String str6 = str;
        try {
            a = jd0.a(context2, ar9Var, str6, string, arrayList, new fp4(context2, 4));
            rik rikVar = new rik(25);
            String str7 = a.f;
            String str8 = a.g;
            String d = ar9Var.d();
            omf omfVar = new omf(3);
            bka bkaVar = new bka(omfVar, 19);
            yf2 yf2Var = new yf2(r18Var2);
            Locale locale = Locale.US;
            ih2 ih2Var = new ih2(lnb.o("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str6, "/settings"), rikVar);
            String str9 = Build.MANUFACTURER;
            String str10 = ar9.h;
            String i5 = wv8.i(str9.replaceAll(str10, ""), "/", Build.MODEL.replaceAll(str10, ""));
            String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
            String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
            int q05 = k53.q0(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (q05 == 0) {
                q05 = k53.q0(context2, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {q05 != 0 ? context2.getResources().getString(q05) : str2, str6, str8, str7};
            ArrayList arrayList2 = new ArrayList();
            int i6 = 0;
            while (i6 < 4) {
                String str11 = strArr[i6];
                int i7 = i6;
                if (str11 != null) {
                    arrayList2.add(str11.replace("-", "").toLowerCase(Locale.US));
                }
                i6 = i7 + 1;
            }
            Collections.sort(arrayList2);
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
            }
            String sb2 = sb.toString();
            i = 1;
            boolean z = false;
            ng2Var = new ng2(context2, new nah(str6, i5, replaceAll, replaceAll2, ar9Var, sb2.length() > 0 ? k53.y0(sb2) : str2, str8, str7, me4.a(d != null ? 4 : 1)), omfVar, bkaVar, yf2Var, ih2Var, rd4Var);
            AtomicReference atomicReference = (AtomicReference) ng2Var.h;
            AtomicReference atomicReference2 = (AtomicReference) ng2Var.g;
            if (!((Context) ng2Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((nah) ng2Var.b).f) || (f = ng2Var.f(1)) == null) {
                bah f2 = ng2Var.f(3);
                if (f2 != null) {
                    atomicReference2.set(f2);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(f2);
                }
                rd4 rd4Var3 = (rd4) ng2Var.f;
                Task task2 = ((TaskCompletionSource) rd4Var3.f).getTask();
                synchronized (rd4Var3.d) {
                    task = ((TaskCompletionSource) rd4Var3.e).getTask();
                }
                onSuccessTask = dy0.C(task2, task).onSuccessTask((xx3) hccVar.b, new y3g(ng2Var, hccVar, z, 10));
            } else {
                atomicReference2.set(f);
                ((TaskCompletionSource) atomicReference.get()).trySetResult(f);
                onSuccessTask = Tasks.forResult(str2);
            }
            onSuccessTask.addOnFailureListener(executorService3, new hg6(12));
            timeUnit = TimeUnit.SECONDS;
            r18Var = nw3Var.i;
            context = nw3Var.a;
            h0 = k53.h0(context, "com.google.firebase.crashlytics.RequireBuildId", k53.h0(context, "com.crashlytics.RequireBuildId", true));
            str3 = a.b;
        } catch (PackageManager.NameNotFoundException unused) {
            obj = str2;
        }
        if (h0 && TextUtils.isEmpty(str3)) {
            String str12 = str2;
            a70.r("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            return str12;
        }
        String str13 = new jd2().a;
        try {
            int i8 = 19;
            nw3Var.f = new z41(i8, "crash_marker", r18Var);
            nw3Var.e = new z41(i8, "initialization_marker", r18Var);
            r18 r18Var3 = new r18(str13, r18Var, hccVar2);
            f4a f4aVar = new f4a(r18Var);
            wj9 wj9Var = new wj9(new y0i[]{new jpe(i)});
            ((nvd) nw3Var.n.b).a(new imf(new pw3(r18Var3), 7));
            nw3Var.g = new jw3(nw3Var.a, nw3Var.h, nw3Var.b, nw3Var.i, nw3Var.f, a, r18Var3, f4aVar, q8h.d(nw3Var.a, nw3Var.h, nw3Var.i, a, f4aVar, r18Var3, wj9Var, ng2Var, nw3Var.c, nw3Var.l, nw3Var.o), nw3Var.m, nw3Var.k, nw3Var.l, nw3Var.o);
            z41 z41Var = nw3Var.e;
            boolean exists = new File((File) ((r18) z41Var.c).c, (String) z41Var.b).exists();
            try {
                Boolean.TRUE.equals((Boolean) ((ExecutorService) ((xx3) hccVar2.b).b).submit(new ji2(nw3Var, 3)).get(3L, timeUnit));
            } catch (Exception unused2) {
            }
            jw3 jw3Var = nw3Var.g;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            ((xx3) jw3Var.e.b).g(new mc3(2, jw3Var, str13));
            wx3 wx3Var = new wx3(new t9d(jw3Var), ng2Var, defaultUncaughtExceptionHandler, jw3Var.j);
            jw3Var.n = wx3Var;
            Thread.setDefaultUncaughtExceptionHandler(wx3Var);
            if (Build.VERSION.SDK_INT >= 37) {
                nw3Var.g.c(str13);
            }
            if (!exists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                final int i9 = 0;
                ((xx3) hccVar2.b).g(new Runnable() { // from class: kw3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i9;
                        ng2 ng2Var2 = ng2Var;
                        nw3 nw3Var2 = nw3Var;
                        switch (i10) {
                            case 0:
                                nw3Var2.a(ng2Var2);
                                break;
                            default:
                                nw3Var2.a(ng2Var2);
                                break;
                        }
                    }
                });
            } else {
                final int i10 = 1;
                try {
                    ((ExecutorService) ((xx3) hccVar2.b).b).submit(new Runnable() { // from class: kw3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i102 = i10;
                            ng2 ng2Var2 = ng2Var;
                            nw3 nw3Var2 = nw3Var;
                            switch (i102) {
                                case 0:
                                    nw3Var2.a(ng2Var2);
                                    break;
                                default:
                                    nw3Var2.a(ng2Var2);
                                    break;
                            }
                        }
                    }).get(3L, timeUnit);
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused4) {
                }
            }
        } catch (Exception unused5) {
            nw3Var.g = str2;
        }
        obj = new s38(nw3Var);
        System.currentTimeMillis();
        return obj;
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                ((Function1) ((e1d) obj2).getValue()).invoke(obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                gk gkVar = ((BaseActivity) obj2).v;
                if (gkVar != null) {
                    gkVar.invoke(bool);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener
    public void onCustomFormatAdLoaded(NativeCustomFormatAd nativeCustomFormatAd) {
        BlazeCustomNativeAdsManager.requestAd$lambda$0((Function1) this.b, nativeCustomFormatAd);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 3:
                ((u2) obj2).invoke(obj);
                break;
            case 19:
                ((r82) obj2).invoke(obj);
                break;
            case 20:
                ((r82) obj2).invoke(obj);
                break;
            case 21:
                ((cz3) obj2).invoke(obj);
                break;
            case 22:
                ((dz3) obj2).invoke(obj);
                break;
            default:
                ((ez3) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                return (Task) ((Callable) obj).call();
            default:
                ((Runnable) obj).run();
                return Tasks.forResult(null);
        }
    }

    public /* synthetic */ l1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ l1(Object obj, Object obj2, Object obj3, IOException iOException, boolean z, int i) {
        this.a = i;
        this.b = obj3;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((ii3) this.b);
    }
}
