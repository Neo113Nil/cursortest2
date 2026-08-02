package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zzoc;
import com.google.android.gms.measurement.internal.zzpp;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.ArrayDeque;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gt7 implements Application.ActivityLifecycleCallbacks, zzkw {
    public final /* synthetic */ int a;
    public final Object b;

    public gt7() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[Catch: all -> 0x0028, RuntimeException -> 0x002c, TryCatch #1 {RuntimeException -> 0x002c, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x001f, B:12:0x004a, B:15:0x0051, B:19:0x0063, B:23:0x0070, B:27:0x002f, B:29:0x0036, B:31:0x0042), top: B:2:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(zzdd zzddVar, Bundle bundle) {
        Uri uri;
        zzic zzicVar = (zzic) ((zzlj) this.b).b;
        try {
            try {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.o.a("onActivityCreated");
                Intent intent = zzddVar.c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data != null) {
                        if (!data.isHierarchical()) {
                        }
                        uri = data;
                        if (uri != null && uri.isHierarchical()) {
                            zzic.k(zzicVar.i);
                            String str = !zzpp.S0(intent) ? "gs" : "auto";
                            String queryParameter = uri.getQueryParameter(Payload.RFR);
                            boolean z = bundle != null;
                            zzhz zzhzVar = zzicVar.g;
                            zzic.m(zzhzVar);
                            zzhzVar.Z(new dbo(this, z, uri, str, queryParameter));
                        }
                    }
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                            uri = data;
                            if (uri != null) {
                                zzic.k(zzicVar.i);
                                String str2 = !zzpp.S0(intent) ? "gs" : "auto";
                                String queryParameter2 = uri.getQueryParameter(Payload.RFR);
                                boolean z2 = bundle != null;
                                zzhz zzhzVar2 = zzicVar.g;
                                zzic.m(zzhzVar2);
                                zzhzVar2.Z(new dbo(this, z2, uri, str2, queryParameter2));
                            }
                        }
                    }
                    uri = null;
                    if (uri != null) {
                    }
                }
            } catch (RuntimeException e) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.b(e, "Throwable caught in onActivityCreated");
            }
        } finally {
            zzmb zzmbVar = zzicVar.l;
            zzic.l(zzmbVar);
            zzmbVar.X(zzddVar, bundle);
        }
    }

    public void n(zzdd zzddVar) {
        zzmb zzmbVar = ((zzic) ((zzlj) this.b).b).l;
        zzic.l(zzmbVar);
        synchronized (zzmbVar.m) {
            try {
                if (Objects.equals(zzmbVar.h, zzddVar)) {
                    zzmbVar.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((zzic) zzmbVar.b).d.f0()) {
            zzmbVar.g.remove(Integer.valueOf(zzddVar.a));
        }
    }

    public void o(zzdd zzddVar) {
        zzic zzicVar = (zzic) ((zzlj) this.b).b;
        zzmb zzmbVar = zzicVar.l;
        zzic.l(zzmbVar);
        synchronized (zzmbVar.m) {
            zzmbVar.l = false;
            zzmbVar.i = true;
        }
        zzic zzicVar2 = (zzic) zzmbVar.b;
        zzicVar2.k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzicVar2.d.f0()) {
            zzlu a0 = zzmbVar.a0(zzddVar);
            zzmbVar.e = zzmbVar.d;
            zzmbVar.d = null;
            zzhz zzhzVar = zzicVar2.g;
            zzic.m(zzhzVar);
            zzhzVar.Z(new jcn(zzmbVar, a0, elapsedRealtime));
        } else {
            zzmbVar.d = null;
            zzhz zzhzVar2 = zzicVar2.g;
            zzic.m(zzhzVar2);
            zzhzVar2.Z(new dx2(zzmbVar, elapsedRealtime));
        }
        zzoc zzocVar = zzicVar.h;
        zzic.l(zzocVar);
        zzic zzicVar3 = (zzic) zzocVar.b;
        zzicVar3.k.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        zzhz zzhzVar3 = zzicVar3.g;
        zzic.m(zzhzVar3);
        zzhzVar3.Z(new izo(zzocVar, elapsedRealtime2, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        iu iuVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) obj;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (arrayDeque.contains(string)) {
                                    break;
                                } else {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc")) && (iuVar = (iu) r38.c().b(iu.class)) != null) {
                            String string2 = bundle2.getString("google.c.a.c_id");
                            iuVar.g(string2, "fcm");
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("source", "Firebase");
                            bundle3.putString("medium", "notification");
                            bundle3.putString(MBInterstitialActivity.INTENT_CAMAPIGN, string2);
                            iuVar.b("fcm", "_cmp", bundle3);
                        }
                        qea.B(bundle2, "_no");
                        break;
                    }
                }
                break;
            case 1:
                break;
            case 2:
                ((zzez) obj).c(new tzn(this, bundle, activity));
                break;
            default:
                m(zzdd.Y0(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                c7o c7oVar = (c7o) obj;
                if (c7oVar.e == activity) {
                    c7oVar.e = null;
                    c7oVar.c();
                    break;
                }
                break;
            case 2:
                ((zzez) obj).c(new x5o(this, activity, 4));
                break;
            default:
                n(zzdd.Y0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                c7o c7oVar = (c7o) obj;
                Activity activity2 = c7oVar.e;
                if (activity2 == null || activity2 == activity) {
                    c7oVar.e = activity;
                    mha.I(c7oVar.e("", "", "inactive"), new c0l((Object) c7oVar, (Object) JavaScriptMessage$MsgType.appStateChanged, false, 7), c7oVar.g);
                    break;
                }
            case 2:
                ((zzez) obj).c(new x5o(this, activity, 2));
                break;
            default:
                o(zzdd.Y0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                c7o c7oVar = (c7o) obj;
                if (c7oVar.e == activity) {
                    mha.I(c7oVar.e("", "", "active"), new c0l((Object) c7oVar, (Object) JavaScriptMessage$MsgType.appStateChanged, false, 7), c7oVar.g);
                    break;
                }
                break;
            case 2:
                ((zzez) obj).c(new x5o(this, activity, 1));
                break;
            default:
                p(zzdd.Y0(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                zzcm zzcmVar = new zzcm();
                ((zzez) this.b).c(new tzn(this, activity, zzcmVar));
                Bundle Z1 = zzcmVar.Z1(50L);
                if (Z1 != null) {
                    bundle.putAll(Z1);
                    break;
                }
                break;
            default:
                q(zzdd.Y0(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 2:
                ((zzez) this.b).c(new x5o(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 2:
                ((zzez) this.b).c(new x5o(this, activity, 3));
                break;
        }
    }

    public void p(zzdd zzddVar) {
        zzic zzicVar = (zzic) ((zzlj) this.b).b;
        zzoc zzocVar = zzicVar.h;
        zzic.l(zzocVar);
        zzic zzicVar2 = (zzic) zzocVar.b;
        zzicVar2.k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzhz zzhzVar = zzicVar2.g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new izo(zzocVar, elapsedRealtime, 0));
        zzmb zzmbVar = zzicVar.l;
        zzic.l(zzmbVar);
        Object obj = zzmbVar.m;
        synchronized (obj) {
            try {
                zzmbVar.l = true;
                if (!Objects.equals(zzddVar, zzmbVar.h)) {
                    synchronized (obj) {
                        zzmbVar.h = zzddVar;
                        zzmbVar.i = false;
                        zzic zzicVar3 = (zzic) zzmbVar.b;
                        if (zzicVar3.d.f0()) {
                            zzmbVar.j = null;
                            zzhz zzhzVar2 = zzicVar3.g;
                            zzic.m(zzhzVar2);
                            zzhzVar2.Z(new vwo(zzmbVar, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzic zzicVar4 = (zzic) zzmbVar.b;
        if (!zzicVar4.d.f0()) {
            zzmbVar.d = zzmbVar.j;
            zzhz zzhzVar3 = zzicVar4.g;
            zzic.m(zzhzVar3);
            zzhzVar3.Z(new vwo(zzmbVar, 0));
            return;
        }
        zzmbVar.Y(zzddVar.b, zzmbVar.a0(zzddVar), false);
        zzd zzdVar = ((zzic) zzmbVar.b).n;
        zzic.j(zzdVar);
        zzic zzicVar5 = (zzic) zzdVar.b;
        zzicVar5.k.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        zzhz zzhzVar4 = zzicVar5.g;
        zzic.m(zzhzVar4);
        zzhzVar4.Z(new dx2(zzdVar, elapsedRealtime2));
    }

    public void q(zzdd zzddVar, Bundle bundle) {
        zzlu zzluVar;
        zzmb zzmbVar = ((zzic) ((zzlj) this.b).b).l;
        zzic.l(zzmbVar);
        if (!((zzic) zzmbVar.b).d.f0() || bundle == null || (zzluVar = (zzlu) zzmbVar.g.get(Integer.valueOf(zzddVar.a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzluVar.c);
        bundle2.putString("name", zzluVar.a);
        bundle2.putString("referrer_name", zzluVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public /* synthetic */ gt7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    private final void k(Activity activity) {
    }

    private final void l(Activity activity) {
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity, Bundle bundle) {
    }
}
