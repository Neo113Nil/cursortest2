package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.common.b;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.protobuf.ExtensionRegistryLite;
import com.ironsource.U3;
import com.mbridge.msdk.config.component.load.downloader.core.g;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.tv.TVScheduleActivity;
import com.sofascore.results.tv.fragments.TVScheduleFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow9 implements bt8, ec3, q3c, wn3, v08, yu4, vfh, ya, Continuation, kpd, klg, li6, msi, lqi, vh2, c.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ow9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        qz.z((Function0) this.b, (gkg) this.c, view, x9lVar);
        return x9lVar;
    }

    @Override // defpackage.q3c
    public int a(Object obj) {
        Context context = (Context) this.b;
        b bVar = (b) this.c;
        a3c a3cVar = (a3c) obj;
        String str = a3cVar.b;
        return ((str.equals(bVar.o) || str.equals(s3c.c(bVar))) && a3cVar.c(context, bVar, false) && a3cVar.d(bVar)) ? 1 : 0;
    }

    @Override // defpackage.wn3
    public void accept(Object obj) {
        b10 b10Var = (b10) this.b;
        ((edc) obj).g(b10Var.b, (scc) b10Var.c, (m6c) this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: all -> 0x0117, TryCatch #4 {all -> 0x0117, blocks: (B:25:0x008b, B:27:0x0091, B:29:0x00a1, B:31:0x00ad), top: B:24:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    @Override // defpackage.bt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        String str;
        Throwable th;
        Throwable th2;
        int i;
        Cursor query;
        ListIterator listIterator;
        boolean z = false;
        switch (this.a) {
            case 0:
                tw9 tw9Var = (tw9) this.b;
                ri2 ri2Var = (ri2) this.c;
                ku0 ku0Var = (ku0) obj;
                m90 m90Var = tw9Var.e;
                dgf dgfVar = m90Var.d;
                dgfVar.getClass();
                try {
                    ProviderInstaller.a(dgfVar.a);
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                }
                i49 i49Var = (i49) m90Var.a.get();
                sy7 j = ty7.j();
                r38 r38Var = m90Var.b;
                r38Var.a();
                j.i(r38Var.c.e);
                j.d(ri2Var.i());
                wx2 h = xx2.h();
                h.i(String.valueOf(Build.VERSION.SDK_INT));
                h.h(Locale.getDefault().toString());
                h.j(TimeZone.getDefault().getID());
                Application application = m90Var.c;
                try {
                    str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.getMessage();
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    h.d(str);
                }
                j.h((xx2) h.build());
                xw2 h2 = zw2.h();
                r38 r38Var2 = m90Var.b;
                r38Var2.a();
                h2.i(r38Var2.c.b);
                h2.d(ku0Var.a);
                h2.h(ku0Var.b.a);
                j.j((zw2) h2.build());
                ty7 ty7Var = (ty7) j.build();
                vw9 vw9Var = i49Var.a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                mn2 mn2Var = vw9Var.a;
                jh2 jh2Var = vw9Var.b;
                if (timeUnit == null) {
                    yhk.s("units");
                    return null;
                }
                hl4 hl4Var = new hl4(30000000000L);
                nc3 b = jh2.b(jh2Var);
                b.a = hl4Var;
                jh2 jh2Var2 = new jh2(b);
                ujg ujgVar = ww9.a;
                if (ujgVar == null) {
                    synchronized (ww9.class) {
                        try {
                            ujgVar = ww9.a;
                            if (ujgVar == null) {
                                ty7 i2 = ty7.i();
                                ExtensionRegistryLite extensionRegistryLite = bff.a;
                                ujg ujgVar2 = new ujg("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing/FetchEligibleCampaigns", new aff(i2), new aff(wy7.h()));
                                ww9.a = ujgVar2;
                                ujgVar = ujgVar2;
                            }
                        } finally {
                        }
                    }
                }
                Logger logger = jx2.a;
                hx2 hx2Var = new hx2();
                nc3 b2 = jh2.b(jh2Var2.c(jx2.c, gx2.a));
                b2.b = hx2Var;
                wkn f = mn2Var.f(ujgVar, new jh2(b2));
                try {
                    try {
                        fx2 b3 = jx2.b(f, ty7Var);
                        while (!b3.isDone()) {
                            try {
                                hx2Var.m();
                            } catch (InterruptedException e3) {
                                try {
                                    f.q("Thread interrupted", e3);
                                    z = true;
                                } catch (Error e4) {
                                    e = e4;
                                    th = e;
                                    jx2.a(f, th);
                                    throw null;
                                } catch (RuntimeException e5) {
                                    e = e5;
                                    th = e;
                                    jx2.a(f, th);
                                    throw null;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    z = true;
                                    if (!z) {
                                        throw th2;
                                    }
                                    Thread.currentThread().interrupt();
                                    throw th2;
                                }
                            }
                        }
                        hx2Var.shutdown();
                        Object c = jx2.c(b3);
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        wy7 wy7Var = (wy7) c;
                        if (wy7Var.i() < System.currentTimeMillis() + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS || wy7Var.i() > System.currentTimeMillis() + 259200000) {
                            vy7 vy7Var = (vy7) wy7Var.toBuilder();
                            vy7Var.d(System.currentTimeMillis() + 86400000);
                            wy7Var = (wy7) vy7Var.build();
                        }
                        return wy7Var;
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                } catch (Error | RuntimeException e6) {
                    th = e6;
                }
                break;
            case 7:
                umf umfVar = (umf) this.b;
                wu0 wu0Var = (wu0) this.c;
                rmf rmfVar = (rmf) obj;
                qmf k = rmf.k(rmfVar);
                k.i();
                k.k(rmfVar.getValue() + 1);
                rmf rmfVar2 = (rmf) k.build();
                smf k2 = umf.k(umfVar);
                wu0Var.getClass();
                k2.d(rmfVar2);
                return (umf) k2.build();
            default:
                mlg mlgVar = (mlg) this.b;
                jv0 jv0Var = (jv0) this.c;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                eu0 eu0Var = mlgVar.d;
                ArrayList k3 = mlgVar.k(sQLiteDatabase, jv0Var, eu0Var.b);
                for (i7f i7fVar : i7f.values()) {
                    if (i7fVar != jv0Var.c) {
                        int size = eu0Var.b - k3.size();
                        if (size <= 0) {
                            HashMap hashMap = new HashMap();
                            StringBuilder sb = new StringBuilder("event_id IN (");
                            for (i = 0; i < k3.size(); i++) {
                                sb.append(((su0) k3.get(i)).a);
                                if (i < k3.size() - 1) {
                                    sb.append(',');
                                }
                            }
                            sb.append(')');
                            query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", U3.i.X}, sb.toString(), null, null, null, null);
                            while (query.moveToNext()) {
                                try {
                                    long j2 = query.getLong(0);
                                    Set set = (Set) hashMap.get(Long.valueOf(j2));
                                    if (set == null) {
                                        set = new HashSet();
                                        hashMap.put(Long.valueOf(j2), set);
                                    }
                                    set.add(new llg(query.getString(1), query.getString(2)));
                                } catch (Throwable th5) {
                                    query.close();
                                    throw th5;
                                }
                            }
                            query.close();
                            listIterator = k3.listIterator();
                            while (listIterator.hasNext()) {
                                su0 su0Var = (su0) listIterator.next();
                                long j3 = su0Var.a;
                                if (hashMap.containsKey(Long.valueOf(j3))) {
                                    c40 c2 = su0Var.c.c();
                                    for (llg llgVar : (Set) hashMap.get(Long.valueOf(j3))) {
                                        c2.h(llgVar.a, llgVar.b);
                                    }
                                    listIterator.set(new su0(j3, su0Var.b, c2.i()));
                                }
                            }
                            return k3;
                        }
                        k3.addAll(mlgVar.k(sQLiteDatabase, jv0Var.b(i7fVar), size));
                    }
                }
                HashMap hashMap2 = new HashMap();
                StringBuilder sb2 = new StringBuilder("event_id IN (");
                while (i < k3.size()) {
                }
                sb2.append(')');
                query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", U3.i.X}, sb2.toString(), null, null, null, null);
                while (query.moveToNext()) {
                }
                query.close();
                listIterator = k3.listIterator();
                while (listIterator.hasNext()) {
                }
                return k3;
        }
    }

    @Override // defpackage.yu4
    public void b(vff vffVar) {
        yu4 yu4Var = (yu4) this.b;
        yu4 yu4Var2 = (yu4) this.c;
        yu4Var.b(vffVar);
        yu4Var2.b(vffVar);
    }

    @Override // defpackage.v08
    public void c(File file) {
        rtc rtcVar = (rtc) this.b;
        rtcVar.g = (ktc) this.c;
        rtcVar.f = file;
        Runnable runnable = rtcVar.h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.msi
    public void d(jsi jsiVar, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 15:
                h4k h4kVar = (h4k) obj2;
                TVScheduleFragment tVScheduleFragment = (TVScheduleFragment) h4kVar.l.get(i);
                LayoutInflater from = LayoutInflater.from((TVScheduleActivity) obj);
                SofaTabLayout sofaTabLayout = h4kVar.k;
                boolean z = false;
                View inflate = from.inflate(R.layout.tv_tab_view, (ViewGroup) sofaTabLayout, false);
                int i3 = R.id.tv_tab_text_lower;
                TextView textView = (TextView) nq8.B(R.id.tv_tab_text_lower, inflate);
                if (textView != null) {
                    i3 = R.id.tv_tab_text_upper;
                    TextView textView2 = (TextView) nq8.B(R.id.tv_tab_text_upper, inflate);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        String displayName = ((Calendar) tVScheduleFragment.t.getValue()).getDisplayName(7, 1, Locale.getDefault());
                        if (displayName == null) {
                            displayName = "";
                        }
                        textView2.setText(displayName);
                        textView2.setTextColor(sofaTabLayout.getTabTextColors());
                        textView.setText(String.valueOf(((Calendar) tVScheduleFragment.t.getValue()).get(5)));
                        textView.setTextColor(sofaTabLayout.getTabTextColors());
                        jsiVar.c = linearLayout;
                        lsi lsiVar = jsiVar.e;
                        if (lsiVar != null) {
                            lsiVar.e();
                            jsi jsiVar2 = lsiVar.a;
                            if (jsiVar2 != null && jsiVar2.a()) {
                                z = true;
                            }
                            lsiVar.setSelected(z);
                            break;
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                break;
            default:
                zgm.p((zgm) obj2, (eum) obj, jsiVar, i);
                break;
        }
    }

    @Override // defpackage.vfh
    public boolean e() {
        q5f q5fVar = (q5f) this.b;
        xv0 xv0Var = (xv0) this.c;
        boolean z = q5fVar.q;
        if (z) {
            return z;
        }
        q5fVar.h();
        long a = xv0.a(q5fVar.o, xv0Var.a);
        xv0Var.a = a;
        boolean z2 = !q5fVar.g(q5fVar.n, a + xv0Var.b);
        q5fVar.q = z2;
        return z2;
    }

    @Override // defpackage.li6
    public void f(boolean z) {
        ((l0k) this.b).m.put(Integer.valueOf(((k04) this.c).d), Boolean.valueOf(z));
    }

    @Override // defpackage.vh2
    public Object g(uh2 uh2Var) {
        Executor executor = (Executor) this.b;
        Function0 function0 = (Function0) this.c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        edb edbVar = new edb(atomicBoolean, 1);
        e35 e35Var = e35.a;
        b1g b1gVar = uh2Var.c;
        if (b1gVar != null) {
            b1gVar.addListener(edbVar, e35Var);
        }
        executor.execute(new fdb(atomicBoolean, uh2Var, function0, 1));
        return Unit.a;
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        String str = (String) this.b;
        hg6 hg6Var = (hg6) this.c;
        Context context = (Context) vngVar.e(Context.class);
        String str2 = "";
        switch (hg6Var.a) {
            case 8:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    str2 = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                break;
            case 9:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 != null) {
                    str2 = String.valueOf(applicationInfo2.minSdkVersion);
                    break;
                }
                break;
            case 10:
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                str2 = "embedded";
                                break;
                            }
                        } else {
                            str2 = "auto";
                            break;
                        }
                    } else {
                        str2 = "watch";
                        break;
                    }
                } else {
                    str2 = "tv";
                    break;
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    str2 = FirebaseCommonRegistrar.a(installerPackageName);
                    break;
                }
                break;
        }
        return new nu0(str, str2);
    }

    @Override // defpackage.ya
    public void run() {
        zmf zmfVar = (zmf) this.b;
        umf umfVar = (umf) this.c;
        zmfVar.getClass();
        zmfVar.c = g0c.a(umfVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        k1d k1dVar = (k1d) this.b;
        String str = (String) this.c;
        synchronized (k1dVar) {
            ((dh0) k1dVar.c).remove(str);
        }
        return task;
    }

    @Override // defpackage.lqi
    public Object v() {
        int i = this.a;
        Object obj = this.c;
        ji3 ji3Var = (ji3) this.b;
        switch (i) {
            case 16:
                Iterable iterable = (Iterable) obj;
                mlg mlgVar = (mlg) ji3Var.d;
                mlgVar.getClass();
                if (iterable.iterator().hasNext()) {
                    mlgVar.h().compileStatement("DELETE FROM events WHERE _id in ".concat(mlg.p(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((mlg) ji3Var.i).m(((Integer) r2.getValue()).intValue(), qib.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        ((g) this.b).a((CountDownLatch) this.c, bVar);
    }
}
