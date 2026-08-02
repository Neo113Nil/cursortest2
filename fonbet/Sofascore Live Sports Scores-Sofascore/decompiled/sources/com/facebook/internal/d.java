package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbz;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzes;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzql;
import com.google.android.gms.internal.ads.zzqr;
import com.google.android.gms.internal.cast.zzek;
import com.google.android.gms.internal.pal.zzeb;
import com.google.android.play.core.install.zza;
import defpackage.an0;
import defpackage.chi;
import defpackage.cw3;
import defpackage.dac;
import defpackage.f79;
import defpackage.gjc;
import defpackage.gl5;
import defpackage.i1k;
import defpackage.jdk;
import defpackage.jn0;
import defpackage.kso;
import defpackage.lik;
import defpackage.mbd;
import defpackage.nbd;
import defpackage.nfi;
import defpackage.nkn;
import defpackage.qz;
import defpackage.r9;
import defpackage.rik;
import defpackage.rqn;
import defpackage.rt1;
import defpackage.st1;
import defpackage.t4f;
import defpackage.tt1;
import defpackage.tvn;
import defpackage.ujg;
import defpackage.vdb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {
    public static d c;
    public final /* synthetic */ int a;
    public final Object b;

    public d(Context context) {
        this.a = 0;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
    }

    public static final d a() {
        if (cw3.a.contains(d.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            cw3.a(d.class, th);
            return null;
        }
    }

    public void finalize() {
        switch (this.a) {
            case 0:
                Set set = cw3.a;
                if (!set.contains(this)) {
                    try {
                        if (!set.contains(this)) {
                            try {
                                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance((Context) this.b);
                                localBroadcastManager.getClass();
                                localBroadcastManager.unregisterReceiver(this);
                                break;
                            } catch (Throwable th) {
                                cw3.a(this, th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        cw3.a(this, th2);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0260, code lost:
    
        if (defpackage.lik.a >= 29) goto L98;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        int i = 9;
        int i2 = 8;
        boolean z = false;
        switch (this.a) {
            case 0:
                if (cw3.a.contains(this)) {
                    return;
                }
                try {
                    com.facebook.appevents.l lVar = new com.facebook.appevents.l(context, (String) null);
                    StringBuilder sb = new StringBuilder("bf_");
                    sb.append(intent != null ? intent.getStringExtra("event_name") : null);
                    String sb2 = sb.toString();
                    Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                    Bundle bundle = new Bundle();
                    Set<String> keySet = bundleExtra != null ? bundleExtra.keySet() : null;
                    if (keySet != null) {
                        for (String str : keySet) {
                            str.getClass();
                            bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(str, "-"), ""), ""), (String) bundleExtra.get(str));
                        }
                    }
                    com.facebook.w wVar = com.facebook.w.a;
                    if (com.facebook.k0.c()) {
                        lVar.d(bundle, sb2);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    cw3.a(this, th);
                    return;
                }
            case 1:
                ((r9) this.b).x();
                return;
            case 2:
                i1k i1kVar = (i1k) this.b;
                if (isInitialStickyBroadcast()) {
                    return;
                }
                i1kVar.d(jn0.b(context, intent, (an0) i1kVar.k, (AudioDeviceInfo) i1kVar.j, i1kVar.b()));
                return;
            case 3:
                context.getClass();
                intent.getClass();
                rt1 rt1Var = (rt1) this.b;
                int i3 = rt1Var.g;
                intent.getClass();
                switch (i3) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        rik o = rik.o();
                        int i4 = st1.a;
                        o.getClass();
                        switch (action.hashCode()) {
                            case -1886648615:
                                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    rt1Var.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action.equals("android.os.action.DISCHARGING")) {
                                    rt1Var.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action.equals("android.os.action.CHARGING")) {
                                    rt1Var.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    rt1Var.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 1:
                        if (intent.getAction() == null) {
                            return;
                        }
                        rik o2 = rik.o();
                        int i5 = tt1.a;
                        intent.getAction();
                        o2.getClass();
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            int hashCode = action2.hashCode();
                            if (hashCode == -1980154005) {
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    rt1Var.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    rt1Var.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        if (intent.getAction() == null) {
                            return;
                        }
                        rik o3 = rik.o();
                        int i6 = nfi.a;
                        intent.getAction();
                        o3.getClass();
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int hashCode2 = action3.hashCode();
                            if (hashCode2 == -1181163412) {
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    rt1Var.b(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    rt1Var.b(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            case 4:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((dac) this.b).dismiss();
                    return;
                }
                return;
            case 5:
                mbd mbdVar = (mbd) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i = type != 9 ? 8 : 7;
                                        }
                                        i = 5;
                                    }
                                }
                                i = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    i = 2;
                                    break;
                                case 20:
                                    break;
                            }
                        } else {
                            i = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (lik.a >= 31 || i != 5) {
                        mbdVar.f(i);
                        return;
                    } else {
                        qz.d(context, mbdVar);
                        return;
                    }
                }
                i = 0;
                if (lik.a >= 31) {
                }
                mbdVar.f(i);
                return;
            case 6:
                ((Executor) ((nbd) this.b).c).execute(new gjc(i, this, context));
                return;
            case 7:
                ((vdb) this.b).f();
                return;
            case 8:
                ((ujg) this.b).Y();
                return;
            case 9:
                chi chiVar = (chi) this.b;
                chiVar.b.post(new t4f(chiVar, 11));
                return;
            case 10:
                context.getClass();
                intent.getClass();
                ((CustomTabActivity) this.b).finish();
                return;
            case 11:
                context.getClass();
                intent.getClass();
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) this.b;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i7 = CustomTabMainActivity.c;
                intent2.setAction("CustomTabMainActivity.action_refresh");
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                return;
            case 12:
                ((zzbcn) this.b).c();
                return;
            case 13:
                ((zzbfi) this.b).d(3);
                return;
            case 14:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((zzea) this.b).f(new gl5(i2));
                    return;
                }
                return;
            case 15:
                tvn tvnVar = (tvn) this.b;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    tvnVar.a(true, tvnVar.c);
                    tvnVar.b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        tvnVar.a(false, tvnVar.c);
                        tvnVar.b = false;
                        return;
                    }
                    return;
                }
            case 16:
                zzeb zzebVar = (zzeb) this.b;
                Handler handler = zzeb.e;
                zzebVar.b();
                return;
            case 17:
                ((zzek) this.b).c();
                return;
            case 18:
                ((zzes) this.b).a.execute(new nkn(this, context, z, 19));
                return;
            case 19:
                zzfwu zzfwuVar = (zzfwu) this.b;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    zzfwuVar.a(true, zzfwuVar.c);
                    zzfwuVar.b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        zzfwuVar.a(false, zzfwuVar.c);
                        zzfwuVar.b = false;
                        return;
                    }
                    return;
                }
            case 20:
                ((kso) this.b).c();
                return;
            case 21:
                rqn rqnVar = (rqn) this.b;
                boolean equals = context.getPackageName().equals(intent.getStringExtra("package.name"));
                f79 f79Var = rqnVar.a;
                if (!equals) {
                    f79Var.c("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                f79Var.c("List of extras in received intent:", new Object[0]);
                for (String str2 : intent.getExtras().keySet()) {
                    rqnVar.a.c("Key: %s; value: %s", str2, intent.getExtras().get(str2));
                }
                f79 f79Var2 = rqnVar.a;
                f79Var2.c("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                f79Var2.c("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                f79Var2.c("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                rqnVar.a.c("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (rqnVar) {
                    Iterator it = new HashSet(rqnVar.d).iterator();
                    while (it.hasNext()) {
                        ((jdk) it.next()).a(zzaVar);
                    }
                }
                return;
            default:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                zzqr zzqrVar = (zzqr) this.b;
                zzqrVar.b(zzql.a(context, intent, zzqrVar.j, zzqrVar.i, zzqrVar.a()));
                return;
        }
    }

    public /* synthetic */ d(zzbz zzbzVar, zzea zzeaVar) {
        this.a = 14;
        this.b = zzeaVar;
    }

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
