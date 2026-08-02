package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcni;
import com.google.android.gms.internal.ads.zzdus;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.cast.zzc;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.C4094gc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.UniqueStage;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class hcc implements ay2, lt9, ProductDetailsResponseListener, qh2, nzg, qf0, q2c, RemoteCall, zzcgq, MediationAdLoadCallback, zzcni {
    public static int e;
    public static final yx3 f = new yx3();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public hcc(Context context, ComponentName componentName, PendingIntent pendingIntent) {
        dcc dccVar;
        this.a = 0;
        this.d = new ArrayList();
        ComponentName componentName2 = null;
        if (context == null) {
            a70.p("context must not be null");
            throw null;
        }
        if (TextUtils.isEmpty("CastMediaSession")) {
            a70.p("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = xdc.b;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                queryBroadcastReceivers.size();
            }
            componentName = componentName2;
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            dccVar = new fcc(context);
            this.b = dccVar;
        } else if (i2 >= 28) {
            dccVar = new ecc(context);
            this.b = dccVar;
        } else {
            dccVar = new dcc(context);
            this.b = dccVar;
        }
        Z(new acc(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        dccVar.a.setMediaButtonReceiver(pendingIntent);
        this.c = new wj9(context, this);
        if (e == 0) {
            e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static Object G(Task task) {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            cp4.i("SERVICE_NOT_AVAILABLE", e2);
            return null;
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e3);
        }
    }

    public static final void K() {
        if (((Boolean) new ny(0, f, yx3.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 3).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
    }

    public static final void L() {
        if (((Boolean) new ny(0, f, yx3.class, "isBlockingThread", "isBlockingThread()Z", 0, 4).invoke()).booleanValue()) {
            return;
        }
        Thread.currentThread().getName();
    }

    public static void O(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(hcc.class.getClassLoader());
        }
    }

    @Override // defpackage.qf0
    public void A() {
        ((tzc) this.b).a(0);
    }

    @Override // defpackage.ay2
    public void B() {
        ((ex2) this.d).p.getClass();
    }

    @Override // defpackage.q2c
    public void C(int i, boolean z) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.q2c
    public void D(int i, d74 d74Var, long j) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, d74Var.i, j, 0);
    }

    @Override // defpackage.lt9
    public void E(fq5 fq5Var) {
        UniqueStage uniqueStage;
        Category category;
        String str = (String) this.d;
        Stage stage = (Stage) this.b;
        Country country = stage.getCountry();
        Integer num = null;
        num = null;
        num = null;
        String alpha2 = country != null ? country.getAlpha2() : null;
        ImageView imageView = (ImageView) this.c;
        if (alpha2 != null) {
            Country country2 = stage.getCountry();
            as9.c(imageView, country2 != null ? country2.getAlpha2() : null, false, str, 2);
            return;
        }
        StageSeason stageSeason = stage.getStageSeason();
        if (stageSeason != null && (uniqueStage = stageSeason.getUniqueStage()) != null && (category = uniqueStage.getCategory()) != null) {
            num = Integer.valueOf(category.getId());
        }
        as9.b(imageView, num, str);
    }

    @Override // defpackage.q2c
    public void F(z3c z3cVar, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new cl0(this, z3cVar, 1), handler);
    }

    public jv0 H() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((i7f) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new jv0((String) this.b, (byte[]) this.c, (i7f) this.d);
        }
        a70.r("Missing required properties:".concat(str));
        return null;
    }

    public String I(String str, long j, int i, long j2) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) this.d;
            if (i2 >= size) {
                sb.append((String) arrayList3.get(arrayList2.size()));
                return sb.toString();
            }
            sb.append((String) arrayList3.get(i2));
            if (((Integer) arrayList2.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) arrayList2.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j)));
            } else if (((Integer) arrayList2.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Integer.valueOf(i)));
            } else if (((Integer) arrayList2.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j2)));
            }
            i2++;
        }
    }

    public void J() {
        Set hashSet;
        if (((z38) this.b) == null || TextUtils.isEmpty((String) this.c)) {
            return;
        }
        synchronized (((iz7) this.d).b) {
            try {
                if (((iz7) this.d).b.containsKey((String) this.c)) {
                    hashSet = (Set) ((iz7) this.d).b.get((String) this.c);
                } else {
                    hashSet = new HashSet();
                    ((iz7) this.d).b.put((String) this.c, hashSet);
                }
                if (!hashSet.contains((z38) this.b)) {
                    hashSet.add((z38) this.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void M(xei xeiVar, qic qicVar) {
        ex2 ex2Var = (ex2) this.d;
        hl4 hl4Var = ex2Var.w.a;
        ex2Var.t.getClass();
        if (hl4Var == null) {
            hl4Var = null;
        }
        if (xeiVar.a == vei.CANCELLED && hl4Var != null && hl4Var.a()) {
            zl1 zl1Var = new zl1(3);
            ex2Var.x.x(zl1Var);
            xeiVar = xei.h.b("ClientCall was cancelled at or after deadline. " + zl1Var);
            qicVar = new qic();
        }
        jde.b();
        ex2Var.q.execute(new cx2(this, xeiVar, qicVar));
    }

    public boolean N(wma wmaVar) {
        return !(wmaVar.h == null) && (((yvh) ((dad) this.b).b).contains(wmaVar) || ((yvh) ((dad) this.c).b).contains(wmaVar));
    }

    public eib P() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((ubf) this.d)) {
            try {
                eib eibVar = (eib) this.c;
                if (eibVar != null && localeList == ((LocaleList) this.b)) {
                    return eibVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new dib(localeList.get(i)));
                }
                eib eibVar2 = new eib(arrayList);
                this.b = localeList;
                this.c = eibVar2;
                return eibVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long Q() {
        bp4 bp4Var = (bp4) this.d;
        if (bp4Var != null) {
            return bp4Var.d;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void R(re4 re4Var, Uri uri, Map map, long j, long j2, ddf ddfVar) {
        ll6 ll6Var;
        bp4 bp4Var = new bp4(re4Var, j, j2);
        this.d = bp4Var;
        if (((ll6) this.c) != null) {
            return;
        }
        ll6[] c = ((ql6) this.b).c(uri, map);
        zu9 t = hv9.t(c.length);
        boolean z = true;
        int i = 0;
        if (c.length == 1) {
            ll6Var = c[0];
            this.c = ll6Var;
        } else {
            int length = c.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                ll6 ll6Var2 = c[i2];
                try {
                } catch (EOFException unused) {
                    if (((ll6) this.c) == null) {
                    }
                } catch (Throwable th) {
                    if (((ll6) this.c) == null && bp4Var.d != j) {
                        z = false;
                    }
                    z1a.E(z);
                    bp4Var.f = 0;
                    throw th;
                }
                if (ll6Var2.a(bp4Var)) {
                    this.c = ll6Var2;
                    bp4Var.f = 0;
                    break;
                }
                t.e(ll6Var2.d());
                if (((ll6) this.c) == null) {
                }
                boolean z2 = true;
                z1a.E(z2);
                bp4Var.f = 0;
                i2++;
            }
            ll6 ll6Var3 = (ll6) this.c;
            if (ll6Var3 == null) {
                String str = "None of the available extractors (" + new ih2(", ").e(w3a.S(hv9.w(c), new m72(i))) + ") could read the stream.";
                uri.getClass();
                throw new ick(str, t.g());
            }
            ll6Var = ll6Var3;
        }
        ll6Var.e(ddfVar);
    }

    public boolean S() {
        return !(((yvh) ((dad) this.b).b).isEmpty() && ((yvh) ((dad) this.d).b).isEmpty() && ((yvh) ((dad) this.c).b).isEmpty());
    }

    public void T(String str, String str2, String str3, String str4) {
        r38 r38Var = (r38) this.c;
        if (str2 == null || str3 == null) {
            is8.e("FIS auth token or FIS ID is empty");
            return;
        }
        r38Var.a();
        s48 s48Var = r38Var.c;
        String str5 = s48Var.h;
        r38Var.a();
        String str6 = s48Var.a;
        if (str5 == null) {
            is8.e("Project ID or API Key is missing");
            return;
        }
        URL url = new URL(wt3.m(str, ":", mz1.s("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/"), str4));
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            url.toString();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod(C4094gc.b);
        httpURLConnection.setRequestProperty("x-goog-api-key", str6);
        httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
        httpURLConnection.setDoOutput(false);
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode < 200 || responseCode >= 300) {
                    if (responseCode == 404 || responseCode == 403) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            httpURLConnection.getResponseMessage();
                        }
                        StringBuilder q = wt3.q("Topic ", str4, " failed: ");
                        q.append(httpURLConnection.getResponseMessage());
                        throw new IOException(q.toString());
                    }
                    if (responseCode >= 500) {
                        is8.e("INTERNAL_SERVER_ERROR");
                    } else {
                        is8.e(dmi.l(responseCode, "Topic ", str4, " failed with status: "));
                    }
                }
            } catch (IOException e2) {
                throw new IOException("SERVICE_NOT_AVAILABLE", e2);
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public void U(y0 y0Var, qn2 qn2Var) {
        Exception exc;
        Exception exc2;
        int i;
        int i2;
        tzc tzcVar = (tzc) this.b;
        int i3 = tzcVar.b;
        l0d l0dVar = (l0d) this.c;
        l0d l0dVar2 = new l0d();
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i4 + 1;
            try {
                try {
                    switch (tzcVar.c(i4)) {
                        case 0:
                            y0Var.A();
                            i4 = i6;
                        case 1:
                            int i7 = i5 + 1;
                            y0Var.x(l0dVar.f(i5));
                            i5 = i7;
                            i4 = i6;
                        case 2:
                            int i8 = i4 + 2;
                            i4 += 3;
                            y0Var.p(tzcVar.c(i6), tzcVar.c(i8));
                        case 3:
                            int i9 = i4 + 2;
                            try {
                                i = i4 + 3;
                            } catch (Exception e2) {
                                exc = e2;
                                i4 = i9;
                            }
                            try {
                                i4 += 4;
                                y0Var.k(tzcVar.c(i6), tzcVar.c(i9), tzcVar.c(i));
                            } catch (Exception e3) {
                                exc = e3;
                                i4 = i;
                                throw new se3(l0dVar, l0dVar2, tzcVar, i4 - 1, exc);
                            }
                        case 4:
                            y0Var.b();
                            i4 = i6;
                        case 5:
                            i4 += 2;
                            i2 = i5 + 1;
                            y0Var.w(tzcVar.c(i6), l0dVar.f(i5));
                            i5 = i2;
                        case 6:
                            i4 += 2;
                            try {
                                i2 = i5 + 1;
                                y0Var.s(tzcVar.c(i6), l0dVar.f(i5));
                                i5 = i2;
                            } catch (Exception e4) {
                                exc2 = e4;
                                exc = exc2;
                                throw new se3(l0dVar, l0dVar2, tzcVar, i4 - 1, exc);
                            }
                        case 7:
                            int i10 = i5 + 1;
                            Object f2 = l0dVar.f(i5);
                            f2.getClass();
                            i5k.e(2, f2);
                            i5 += 2;
                            y0Var.r(l0dVar.f(i10), (Function2) f2);
                            i4 = i6;
                        case 8:
                            Object obj = y0Var.b;
                            if (obj instanceof qe3) {
                                qe3 qe3Var = (qe3) obj;
                                if (((i1d) qn2Var.f).q(qe3Var)) {
                                    qe3Var.a();
                                }
                            }
                            l0dVar2.a(obj);
                            y0Var.y();
                            i4 = i6;
                        default:
                            i4 = i6;
                    }
                } catch (Exception e5) {
                    exc2 = e5;
                    i4 = i6;
                    exc = exc2;
                    throw new se3(l0dVar, l0dVar2, tzcVar, i4 - 1, exc);
                }
            } catch (Throwable th) {
                y0Var.t();
                throw th;
            }
        }
        if (i5 != l0dVar.b) {
            sf3.a("Applier operation size mismatch");
        }
        l0dVar.d();
        tzcVar.b = 0;
        y0Var.t();
    }

    public void V(d6b d6bVar) {
        o8a o8aVar = (o8a) this.d;
        if (o8aVar != null) {
            o8aVar.run();
        }
        o8a o8aVar2 = new o8a((y6b) this.b, d6bVar);
        this.d = o8aVar2;
        ((Handler) this.c).postAtFrontOfQueue(o8aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [qfb] */
    public void W(rfb rfbVar, rfb rfbVar2) {
        Object value;
        qfb qfbVar;
        qfb qfbVar2;
        p33 p33Var;
        ?? r11;
        rfbVar.getClass();
        fdi fdiVar = (fdi) this.c;
        do {
            value = fdiVar.getValue();
            p33 p33Var2 = (p33) value;
            rfbVar.getClass();
            pfb pfbVar = pfb.c;
            if (p33Var2 == null || (qfbVar = p33Var2.a) == null) {
                qfbVar = pfbVar;
            }
            qfb qfbVar3 = rfbVar.a;
            qfb y = tz9.y(qfbVar, qfbVar3, qfbVar3, rfbVar2 != null ? rfbVar2.a : null);
            if (p33Var2 == null || (qfbVar2 = p33Var2.b) == null) {
                qfbVar2 = pfbVar;
            }
            qfb y2 = tz9.y(qfbVar2, qfbVar3, rfbVar.b, rfbVar2 != null ? rfbVar2.b : null);
            if (p33Var2 != null && (r11 = p33Var2.c) != 0) {
                pfbVar = r11;
            }
            p33Var = new p33(y, y2, tz9.y(pfbVar, qfbVar3, rfbVar.c, rfbVar2 != null ? rfbVar2.c : null), rfbVar, rfbVar2);
            if (Intrinsics.c(p33Var2, p33Var)) {
                return;
            }
        } while (!fdiVar.k(value, p33Var));
        Iterator it = ((nh0) this.b).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(p33Var);
        }
    }

    public void X(List list) {
        z1a.r("addrs is empty", !list.isEmpty());
        this.b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void Y(String str) {
        if (str != null) {
            this.b = str;
        } else {
            yhk.s("Null backendName");
        }
    }

    public void Z(ccc cccVar, Handler handler) {
        dcc dccVar = (dcc) this.b;
        if (cccVar == null) {
            dccVar.c(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        dccVar.c(cccVar, handler);
    }

    public void a(wma wmaVar, paa paaVar) {
        dad dadVar = (dad) this.b;
        dad dadVar2 = (dad) this.c;
        dad dadVar3 = (dad) this.d;
        int ordinal = paaVar.ordinal();
        if (ordinal == 0) {
            dadVar.s(wmaVar);
            dadVar3.s(wmaVar);
            return;
        }
        if (ordinal == 1) {
            dadVar2.s(wmaVar);
            dadVar3.s(wmaVar);
            return;
        }
        if (ordinal == 2) {
            if (wmaVar.h != null) {
                dadVar3.s(wmaVar);
                return;
            } else {
                dadVar.s(wmaVar);
                return;
            }
        }
        if (ordinal != 3) {
            zzl.b();
        } else if (wmaVar.h != null) {
            dadVar3.s(wmaVar);
        } else {
            dadVar2.s(wmaVar);
        }
    }

    public void a0(MediaMetadataCompat mediaMetadataCompat) {
        dcc dccVar = (dcc) this.b;
        dccVar.g = mediaMetadataCompat;
        MediaSession mediaSession = dccVar.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public void b(efb efbVar) {
        Object[][] objArr;
        it7 it7Var;
        int i = 0;
        while (true) {
            objArr = (Object[][]) this.d;
            int length = objArr.length;
            it7Var = ffb.d;
            if (i >= length) {
                i = -1;
                break;
            } else if (it7Var == objArr[i][0]) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + 1, 2);
            Object[][] objArr3 = (Object[][]) this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.d = objArr2;
            objArr = objArr2;
            i = objArr2.length - 1;
        }
        objArr[i] = new Object[]{it7Var, efbVar};
    }

    @Override // defpackage.q2c
    public void c(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.q2c
    public void d(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.q2c
    public MediaFormat e() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    @Override // defpackage.nzg
    public void f(nkk nkkVar) {
        long c;
        long j;
        qx9.u((cjj) this.c);
        int i = lik.a;
        cjj cjjVar = (cjj) this.c;
        synchronized (cjjVar) {
            try {
                long j2 = cjjVar.c;
                c = j2 != C.TIME_UNSET ? j2 + cjjVar.b : cjjVar.c();
            } finally {
            }
        }
        cjj cjjVar2 = (cjj) this.c;
        synchronized (cjjVar2) {
            j = cjjVar2.b;
        }
        if (c == C.TIME_UNSET || j == C.TIME_UNSET) {
            return;
        }
        sm8 sm8Var = (sm8) this.b;
        if (j != sm8Var.p) {
            pm8 a = sm8Var.a();
            a.o = j;
            sm8 sm8Var2 = new sm8(a);
            this.b = sm8Var2;
            ((usj) this.d).a(sm8Var2);
        }
        int c2 = nkkVar.c();
        ((usj) this.d).d(c2, nkkVar);
        ((usj) this.d).c(c, 1, c2, 0, null);
    }

    @Override // defpackage.q2c
    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    @Override // defpackage.qf0
    public Object g() {
        return this.d;
    }

    @Override // defpackage.q2c
    public ByteBuffer h(int i) {
        return lik.a >= 21 ? ((MediaCodec) this.b).getInputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    @Override // defpackage.q2c
    public void i(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    @Override // defpackage.nzg
    public void j(cjj cjjVar, ol6 ol6Var, c2k c2kVar) {
        this.c = cjjVar;
        c2kVar.a();
        c2kVar.b();
        usj track = ol6Var.track(c2kVar.e, 5);
        this.d = track;
        track.a((sm8) this.b);
    }

    @Override // defpackage.qf0
    public void k(int i, int i2, int i3) {
        tzc tzcVar = (tzc) this.b;
        tzcVar.a(3);
        tzcVar.a(i);
        tzcVar.a(i2);
        tzcVar.a(i3);
    }

    @Override // defpackage.q2c
    public void l(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.q2c
    public int m() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    @Override // defpackage.q2c
    public int n(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        MediaCodec mediaCodec = (MediaCodec) this.b;
        do {
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && lik.a < 21) {
                this.d = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.q2c
    public ByteBuffer o(int i) {
        return lik.a >= 21 ? ((MediaCodec) this.b).getOutputBuffer(i) : ((ByteBuffer[]) this.d)[i];
    }

    @Override // defpackage.qh2
    public void onFailure(ah2 ah2Var, IOException iOException) {
        ok3.J(new j8c((fsf) this.b, iOException, (g62) this.c, (rq3) null, 18));
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        boolean z;
        jx9 jx9Var = (jx9) this.b;
        billingResult.getClass();
        queryProductDetailsResult.getClass();
        if (billingResult.getResponseCode() == 0) {
            List<ProductDetails> productDetailsList = queryProductDetailsResult.getProductDetailsList();
            productDetailsList.getClass();
            if (!productDetailsList.isEmpty()) {
                z = true;
                jx9Var.b(z);
                ((BillingClient) this.c).endConnection();
                jx9.a((oog) this.d, Boolean.valueOf(z));
            }
        }
        z = false;
        jx9Var.b(z);
        ((BillingClient) this.c).endConnection();
        jx9.a((oog) this.d, Boolean.valueOf(z));
    }

    @Override // defpackage.qh2
    public void onResponse(ah2 ah2Var, d2g d2gVar) {
        ok3.J(new va8(d2gVar, (g62) this.c, (fsf) this.d, (rq3) null, 27));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* synthetic */ Object onSuccess(Object obj) {
        zzbxq zzbxqVar = (zzbxq) this.b;
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                ((zzbyg) this.d).d = mediationRewardedAd;
                zzbxqVar.zze();
            } catch (RemoteException e2) {
                zzo.zzg("", e2);
            }
            return new fqn((zzbwa) this.c);
        }
        zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            zzbxqVar.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e3) {
            zzo.zzg("", e3);
            return null;
        }
    }

    @Override // defpackage.qf0
    public void p(int i, int i2) {
        tzc tzcVar = (tzc) this.b;
        tzcVar.a(2);
        tzcVar.a(i);
        tzcVar.a(i2);
    }

    @Override // defpackage.ay2
    public void q(qic qicVar) {
        ex2 ex2Var = (ex2) this.d;
        jde.c();
        try {
            jde.a();
            jde.b();
            ex2Var.q.execute(new bx2(this, qicVar));
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qf0
    public void r(Object obj, Function2 function2) {
        ((tzc) this.b).a(7);
        l0d l0dVar = (l0d) this.c;
        l0dVar.a(function2);
        l0dVar.a(obj);
    }

    @Override // defpackage.q2c
    public void release() {
        this.c = null;
        this.d = null;
        ((MediaCodec) this.b).release();
    }

    @Override // defpackage.qf0
    public void s(int i, Object obj) {
        tzc tzcVar = (tzc) this.b;
        tzcVar.a(6);
        tzcVar.a(i);
        ((l0d) this.c).a(obj);
    }

    @Override // defpackage.q2c
    public void setVideoScalingMode(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        switch (this.a) {
            case 25:
                zzbm zzbmVar = (zzbm) this.b;
                Cast.MessageReceivedCallback messageReceivedCallback = (Cast.MessageReceivedCallback) this.c;
                String str = (String) this.d;
                zzy zzyVar = (zzy) anyClient;
                Preconditions.k("Not active connection", zzbmVar.G != 1);
                if (messageReceivedCallback != null) {
                    zzah zzahVar = (zzah) zzyVar.getService();
                    zzyVar.getContext();
                    ApiMetadata a = zzff.a();
                    Parcel J = zzahVar.J();
                    J.writeString(str);
                    zzc.b(J, a);
                    zzahVar.l2(J, 12);
                }
                taskCompletionSource.setResult(null);
                return;
            default:
                zzy zzyVar2 = (zzy) anyClient;
                zzbm zzbmVar2 = (zzbm) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                zzbmVar2.m();
                zzah zzahVar2 = (zzah) zzyVar2.getService();
                zzyVar2.getContext();
                ApiMetadata a2 = zzff.a();
                Parcel J2 = zzahVar2.J();
                J2.writeString(str2);
                J2.writeString(str3);
                int i = zzc.a;
                J2.writeInt(0);
                zzc.b(J2, a2);
                zzahVar2.l2(J2, 14);
                synchronized (zzbmVar2.s) {
                    try {
                        if (zzbmVar2.p != null) {
                            zzbmVar2.o(2477);
                        }
                        zzbmVar2.p = taskCompletionSource;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // defpackage.ay2
    public void v(cqa cqaVar) {
        ex2 ex2Var = (ex2) this.d;
        jde.c();
        try {
            jde.a();
            jde.b();
            ex2Var.q.execute(new bx2(this, cqaVar));
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qf0
    public void w(int i, Object obj) {
        tzc tzcVar = (tzc) this.b;
        tzcVar.a(5);
        tzcVar.a(i);
        ((l0d) this.c).a(obj);
    }

    @Override // defpackage.qf0
    public void x(Object obj) {
        ((tzc) this.b).a(1);
        ((l0d) this.c).a(obj);
    }

    @Override // defpackage.qf0
    public void y() {
        ((tzc) this.b).a(8);
    }

    @Override // defpackage.ay2
    public void z(xei xeiVar, zx2 zx2Var, qic qicVar) {
        jde.c();
        try {
            jde.a();
            M(xeiVar, qicVar);
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcni
    public void zza(boolean z, int i, String str, String str2) {
        zzdus zzdusVar = (zzdus) this.b;
        zzclm zzclmVar = (zzclm) this.c;
        zzcgn zzcgnVar = (zzcgn) this.d;
        if (z) {
            zzfw zzfwVar = zzdusVar.a.a;
            if (zzfwVar != null && zzclmVar.zzh() != null) {
                zzclmVar.zzh().E4(zzfwVar);
            }
            zzcgnVar.b();
            return;
        }
        zzdusVar.getClass();
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        fn0.s(i, "Html video Web View failed to load. Error code: ", ", Description: ", str, sb);
        zzcgnVar.zzd(new zzeqf(1, mz1.o(sb, ", Failing URL: ", str2)));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((zzbxq) this.b).a(adError.zza());
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // defpackage.lt9
    public void onSuccess() {
    }

    @Override // com.google.android.gms.internal.ads.zzcgq
    /* renamed from: zza */
    public void mo17zza() {
        zzfrj zzfrjVar;
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbum zzbumVar = (zzbum) this.d;
        synchronized (zzbumVar.a) {
            try {
                zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                zzbumVar.g = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                ((zzbul) this.b).f();
                if (((Boolean) zzbla.d.c()).booleanValue() && (zzfrjVar = zzbumVar.e) != null) {
                    zzfqw zzfqwVar = (zzfqw) this.c;
                    zzfqwVar.zzk("Failed loading new engine");
                    zzfqwVar.zzd(false);
                    zzfrjVar.b(zzfqwVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }

    public /* synthetic */ hcc(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ hcc(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public hcc(Context context, ia9 ia9Var) {
        this.a = 23;
        context.getClass();
        this.b = context;
        this.c = ia9Var;
    }

    public hcc(SystemForegroundService systemForegroundService) {
        this.a = 19;
        this.b = new y6b(systemForegroundService, true);
        this.c = new Handler(Looper.getMainLooper());
    }

    public hcc(ExecutorService executorService, ExecutorService executorService2) {
        this.a = 1;
        executorService.getClass();
        executorService2.getClass();
        this.b = new xx3(executorService);
        this.c = new xx3(executorService);
        Tasks.forResult(null);
        this.d = new xx3(executorService2);
    }

    public hcc(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = new dad(21);
                this.c = new dad(21);
                this.d = new dad(21);
                break;
            case 14:
                this.b = new nh0();
                fdi a = gdi.a(null);
                this.c = a;
                this.d = un0.u(a);
                break;
            default:
                this.d = new ubf(3);
                break;
        }
    }

    public hcc(String str) {
        this.a = 16;
        pm8 pm8Var = new pm8();
        pm8Var.k = str;
        this.b = new sm8(pm8Var);
    }

    public hcc(r38 r38Var, FirebaseMessaging firebaseMessaging, l48 l48Var) {
        this.a = 21;
        this.b = l48Var;
        this.c = r38Var;
        this.d = firebaseMessaging;
    }

    public hcc(iyb iybVar, View view) {
        Object jybVar;
        this.a = 13;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            jybVar = new lyb();
        } else {
            jybVar = i >= 33 ? new jyb() : null;
        }
        this.b = jybVar;
        this.c = iybVar;
        this.d = view;
    }

    public hcc(ql6 ql6Var) {
        this.a = 4;
        this.b = ql6Var;
    }

    public hcc(MediaCodec mediaCodec) {
        this.a = 20;
        this.b = mediaCodec;
        if (lik.a < 21) {
            this.c = mediaCodec.getInputBuffers();
            this.d = mediaCodec.getOutputBuffers();
        }
    }

    public hcc(iz7 iz7Var, c0g c0gVar) {
        this.a = 9;
        this.d = iz7Var;
    }

    public hcc(Object obj) {
        this.a = 17;
        this.b = new tzc();
        this.c = new l0d();
        this.d = obj;
    }

    public hcc(sn5 sn5Var, hih hihVar, jo5 jo5Var) {
        this.a = 8;
        this.d = sn5Var;
        this.c = hihVar;
        this.b = jo5Var;
    }

    public /* synthetic */ hcc(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public hcc(ex2 ex2Var, c5n c5nVar) {
        this.a = 5;
        this.d = ex2Var;
        this.b = c5nVar;
    }
}
