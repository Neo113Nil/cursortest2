package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.os.Bundle;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase;
import com.facebook.appevents.l;
import com.facebook.w;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.ironsource.Ae;
import com.ironsource.Cf;
import com.ironsource.InterfaceC4044dg;
import com.ironsource.InterfaceC4292re;
import com.ironsource.W3;
import com.ironsource.environment.thread.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseSuggestChangesDialog;
import com.sofascore.results.mvvm.base.AbstractActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0(Bundle bundle, String str) {
        this.a = 27;
        this.c = str;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1k i1kVar;
        Integer c;
        yu4 yu4Var;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        switch (this.a) {
            case 0:
                TextView textView = (TextView) this.b;
                String str = (String) this.c;
                int i4 = AbstractActivity.I;
                textView.setText(str);
                return;
            case 1:
                c9 c9Var = (c9) this.b;
                yi6 yi6Var = (yi6) this.c;
                c9Var.getClass();
                try {
                    yi6Var.toString();
                    l38 l38Var = c9Var.a;
                    b9 b9Var = new b9(yi6Var.i(), yi6Var.n(), yi6Var.l(), new Date(yi6Var.j()), yi6Var.m(), yi6Var.k());
                    l38Var.d();
                    b9.d(b9Var.c());
                    ArrayList arrayList = new ArrayList();
                    HashMap c2 = b9Var.c();
                    c2.remove("triggerEvent");
                    arrayList.add(b9.a(c2));
                    l38Var.a(arrayList);
                    return;
                } catch (a9 e) {
                    e.getMessage();
                    return;
                }
            case 2:
                ah ahVar = (ah) this.b;
                ale aleVar = (ale) this.c;
                if (!ahVar.z.equals(kg.g) && ahVar.B && aleVar.h() == null) {
                    cjn cjnVar = ahVar.u;
                    if (cjnVar != null) {
                        cjnVar.e(JavaScriptMessage$MsgType.pause);
                    }
                    kg kgVar = ahVar.z;
                    long T = ahVar.G ? nik.T(aleVar.getCurrentPosition()) : 0L;
                    if (kgVar.c != T) {
                        kgVar = new kg(kgVar.a, kgVar.f, T, kgVar.d, kgVar.e);
                    }
                    ahVar.z = kgVar;
                }
                ale aleVar2 = ahVar.q;
                if (aleVar2 == null) {
                    i3 = ahVar.t;
                } else if (aleVar2.k(22)) {
                    i3 = (int) (aleVar2.getVolume() * 100.0f);
                } else if (aleVar2.i().a(1)) {
                    i3 = 100;
                }
                ahVar.t = i3;
                ahVar.s = ahVar.d();
                ahVar.r = ahVar.f();
                aleVar.z(ahVar);
                ahVar.q = null;
                return;
            case 3:
                f4a f4aVar = (f4a) this.b;
                scc sccVar = (scc) this.c;
                wk wkVar = (wk) f4aVar.c;
                hr9 hr9Var = wkVar.n;
                int i5 = sccVar.b;
                int i6 = sccVar.c;
                if (hr9Var.l == null) {
                    return;
                }
                ah ahVar2 = (ah) hr9Var.f.get(wkVar);
                ahVar2.getClass();
                ArrayList arrayList2 = ahVar2.j;
                yg ygVar = new yg(i5, i6);
                ahVar2.a.getClass();
                o79 o79Var = ahVar2.l;
                k79 k79Var = o79Var.p;
                if (k79Var == null) {
                    k79Var = new k79(o79Var);
                    o79Var.p = k79Var;
                }
                dg dgVar = (dg) k79Var.get(ygVar);
                if (dgVar == null) {
                    tgj.d0("Unexpected prepared ad " + ygVar);
                    return;
                }
                while (i3 < arrayList2.size()) {
                    ((qyo) ((bpk) arrayList2.get(i3))).a(JavaScriptMessage$MsgType.loaded, dgVar, null);
                    i3++;
                }
                return;
            case 4:
                vk vkVar = (vk) this.b;
                kg kgVar2 = (kg) this.c;
                if (vkVar.b) {
                    return;
                }
                wk wkVar2 = vkVar.c;
                kg kgVar3 = wkVar2.x;
                if (kgVar3 == null) {
                    int i7 = kgVar2.b;
                    kgVar2.a();
                    uk[][] ukVarArr = new uk[i7][];
                    wkVar2.y = ukVarArr;
                    Arrays.fill(ukVarArr, new uk[0]);
                } else {
                    kgVar3.a();
                    int i8 = kgVar3.b;
                    kgVar2.a();
                    int i9 = kgVar2.b - i8;
                    z1a.E(i9 >= 0);
                    for (int i10 = kgVar2.e; i10 < i8; i10++) {
                        hg b = kgVar3.b(i10);
                        b.getClass();
                        int i11 = b.b;
                        hg b2 = kgVar2.b(i10);
                        z1a.E(i11 <= b2.b);
                        z1a.E(b.a == b2.a);
                        for (int i12 = 0; i12 < i11; i12++) {
                            h6c h6cVar = b.e[i12];
                            if (h6cVar != null) {
                                z1a.E(h6cVar.equals(b2.e[i12]));
                            }
                        }
                    }
                    if (i9 > 0) {
                        uk[][] ukVarArr2 = wkVar2.y;
                        int length = ukVarArr2.length + i9;
                        uk[][] ukVarArr3 = new uk[length][];
                        System.arraycopy(ukVarArr2, 0, ukVarArr3, 0, ukVarArr2.length);
                        for (int length2 = ukVarArr2.length; length2 < length; length2++) {
                            ukVarArr3[length2] = new uk[0];
                        }
                        wkVar2.y = ukVarArr3;
                    }
                }
                wkVar2.x = kgVar2;
                wkVar2.x();
                wkVar2.y();
                return;
            case 5:
                Ae.a((InterfaceC4292re) this.b, (IronSourceError) this.c);
                return;
            case 6:
                ((n33) this.b).t((ddb) this.c);
                return;
            case 7:
                ((n33) this.b).q((wu9) this.c);
                return;
            case 8:
                qz.f((tz) this.b, (LongSparseArray) this.c);
                return;
            case 9:
                n5h n5hVar = (n5h) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    n5hVar.a();
                }
            case 10:
                Integer num = (Integer) this.b;
                List list = (List) this.c;
                list.getClass();
                if (CollectionsKt.R(xd0.a, num) || !CollectionsKt.R(xd0.b, num)) {
                    return;
                }
                if (xd0.e >= 5) {
                    xd0.a().clear();
                    xd0.e = 0;
                    return;
                } else {
                    xd0.a().addAll(0, list);
                    xd0.e++;
                    return;
                }
            case 11:
                AppStartTrace appStartTrace = (AppStartTrace) this.b;
                csj csjVar = (csj) this.c;
                Timer timer = AppStartTrace.x;
                appStartTrace.b.c((fsj) csjVar.build(), of0.FOREGROUND_BACKGROUND);
                return;
            case 12:
                fl0 fl0Var = (fl0) this.b;
                yq5 yq5Var = (yq5) this.c;
                ((v2c) fl0Var.e).k();
                ml0 ml0Var = (ml0) fl0Var.d;
                synchronized (ml0Var.b) {
                    ml0Var.b();
                    yq5Var.run();
                }
                return;
            case 13:
                Context context = (Context) this.b;
                yh3 yh3Var = (yh3) this.c;
                un0.a = (AudioManager) context.getSystemService("audio");
                yh3Var.c();
                return;
            case 14:
                ro0 ro0Var = (ro0) this.b;
                synchronized (((dm4) this.c)) {
                }
                mg6 mg6Var = ro0Var.b;
                String str2 = nik.a;
                cn4 cn4Var = mg6Var.a.s;
                cn4Var.q(cn4Var.m((scc) cn4Var.d.e), W3.i, new ym4(i));
                return;
            case 15:
                qo0 qo0Var = (qo0) this.b;
                synchronized (((dm4) this.c)) {
                }
                lg6 lg6Var = qo0Var.b;
                int i13 = lik.a;
                bn4 bn4Var = lg6Var.a.r;
                bn4Var.z(bn4Var.u((rcc) bn4Var.d.f), W3.i, new eg4(i));
                return;
            case 16:
                ro0 ro0Var2 = (ro0) this.b;
                vz2 vz2Var = (vz2) this.c;
                mg6 mg6Var2 = ro0Var2.b;
                String str3 = nik.a;
                mg6Var2.a.F.F(vz2Var);
                return;
            case 17:
                g7h g7hVar = (g7h) this.b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) g7hVar.d).post(new r0(18, g7hVar, routedDevice));
                    return;
                }
                return;
            case 18:
                g7h g7hVar2 = (g7h) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (((gp0) g7hVar2.e) == null || (i1kVar = ((mp0) ((hpo) g7hVar2.c).a).h) == null || audioDeviceInfo.equals((AudioDeviceInfo) i1kVar.j)) {
                    return;
                }
                i1kVar.j = audioDeviceInfo;
                Context context2 = (Context) i1kVar.b;
                an0 an0Var = (an0) i1kVar.k;
                List b3 = i1kVar.b();
                vvf vvfVar = jn0.e;
                i1kVar.d(jn0.b(context2, fn0.f("android.media.action.HDMI_AUDIO_PLUG", context2, null), an0Var, audioDeviceInfo, b3));
                return;
            case 19:
                jy0 jy0Var = (jy0) this.b;
                Object apply = ((kg6) this.c).apply(jy0Var.f);
                jy0Var.f = apply;
                iy0 iy0Var = new iy0(jy0Var, apply, i2);
                zqi zqiVar = (zqi) jy0Var.c;
                if (zqiVar.a.getLooper().getThread().isAlive()) {
                    zqiVar.e(iy0Var);
                    return;
                }
                return;
            case 20:
                y21 y21Var = (y21) this.b;
                Function0 function0 = (Function0) this.c;
                s9a.G(y21Var);
                function0.invoke();
                return;
            case 21:
                BaseSuggestChangesDialog baseSuggestChangesDialog = (BaseSuggestChangesDialog) this.b;
                ViewStub viewStub = ((c25) this.c).b;
                b71 b71Var = new b71(baseSuggestChangesDialog, i);
                hpo hpoVar = baseSuggestChangesDialog.v;
                hpoVar.getClass();
                View inflate = viewStub.inflate();
                int i14 = R.id.banner_action_text;
                TextView textView2 = (TextView) nq8.B(R.id.banner_action_text, inflate);
                if (textView2 != null) {
                    i14 = R.id.banner_description_text;
                    TextView textView3 = (TextView) nq8.B(R.id.banner_description_text, inflate);
                    if (textView3 != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        hpoVar.a = inflate;
                        linearLayout.getClass();
                        linearLayout.setVisibility(8);
                        textView3.setText(R.string.sign_in_suggest_changes);
                        textView2.setText(R.string.user_sign_in);
                        textView2.setOnClickListener(new s0(b71Var, 3));
                        View view = (View) hpoVar.a;
                        if (view != null) {
                            view.setOnTouchListener(new ab(0));
                        }
                        View view2 = (View) hpoVar.a;
                        if (view2 != null) {
                            view2.postDelayed(new jd(m35.FROM_TOP, 500L, view2, 3), 200L);
                            return;
                        }
                        return;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i14)));
                return;
            case 22:
                bv1 bv1Var = (bv1) this.b;
                km1 km1Var = (km1) this.c;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) bv1Var.j;
                tug tugVar = (tug) km1Var.e;
                if (tugVar != null && (c = tugVar.c()) != null) {
                    i3 = c.intValue();
                } else if (hkg.c0(km1Var.b)) {
                    i3 = scrollInterceptorHorizontalScrollView.getChildAt(0).getWidth();
                }
                scrollInterceptorHorizontalScrollView.setScrollX(i3);
                return;
            case 23:
                ((mm3) this.b).a((ConstraintLayout) ((ns1) this.c).j.d);
                return;
            case 24:
                WorkDatabase workDatabase = (WorkDatabase) this.b;
                xbl xblVar = (xbl) this.c;
                qcl g = workDatabase.g();
                g.getClass();
                Iterator it = ((List) gz8.S(g.a, true, false, new nxk(28))).iterator();
                while (it.hasNext()) {
                    fcp.b0(xblVar, (String) it.next());
                }
                return;
            case 25:
                xbl xblVar2 = (xbl) this.b;
                String uuid = ((UUID) this.c).toString();
                uuid.getClass();
                fcp.b0(xblVar2, uuid);
                return;
            case 26:
                Cf.a((InterfaceC4044dg) this.b, (a) this.c);
                return;
            case 27:
                String str4 = (String) this.c;
                Bundle bundle = (Bundle) this.b;
                if (cw3.a.contains(k03.class)) {
                    return;
                }
                try {
                    str4.getClass();
                    new l(w.a(), (String) null).d(bundle, str4);
                    return;
                } catch (Throwable th) {
                    cw3.a(k03.class, th);
                    return;
                }
            case 28:
                ComponentActivity componentActivity = (ComponentActivity) this.b;
                upd updVar = (upd) this.c;
                int i15 = ComponentActivity.a;
                componentActivity.getLifecycle().a(new ob3(i3, updVar, componentActivity));
                return;
            default:
                nvd nvdVar = (nvd) this.b;
                vff vffVar = (vff) this.c;
                if (nvdVar.b != nvd.d) {
                    a70.r("provide() can be called only once.");
                    return;
                }
                synchronized (nvdVar) {
                    yu4Var = nvdVar.a;
                    nvdVar.a = null;
                    nvdVar.b = vffVar;
                }
                yu4Var.b(vffVar);
                return;
        }
    }

    public /* synthetic */ r0(n33 n33Var, int i, ddb ddbVar) {
        this.a = 6;
        this.b = n33Var;
        this.c = ddbVar;
    }

    public /* synthetic */ r0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
