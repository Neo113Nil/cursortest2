package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class yia implements bt8, j55, m8f, zhh, qyh, sa, OnSuccessListener {
    public final /* synthetic */ int a;
    public Object b;

    public yia(byte b, int i) {
        this.a = i;
        int i2 = 0;
        switch (i) {
            case 10:
                this.b = Build.VERSION.SDK_INT >= 28 ? new tla() : new wje(i2);
                break;
            case 13:
                this.b = new AtomicLong();
                break;
            case 14:
                dkg dkgVar = new dkg("https://browser-http-intake.logs.datadoghq.eu/v1/input/pub90f1ace94bc00d03844b3905f9519282?&service=ad-display-feedback&ddtags=adFeedback&ddsource=displaysdk");
                this.b = dkgVar;
                dkgVar.e = Math.max(0, 1);
                dkgVar.f = Math.max(0, 1);
                dkgVar.g = Math.max(0, 1);
                dkgVar.h = Math.max(0, 1);
                dkgVar.i = bkg.DEBUG;
                break;
            case 15:
                this.b = beh.b(0, 0, null, 7);
                break;
            case 26:
                this.b = new ou4(0);
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public static dra i(yia yiaVar, int i) {
        ksa ksaVar = (ksa) yiaVar.b;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            csa csaVar = (csa) ((eoh) ksaVar.f).getValue();
            bea.K(w, C, e);
            return ksaVar.q.a(i, csaVar.j, ksaVar.d, new isa(i, csaVar));
        } catch (Throwable th) {
            bea.K(w, C, e);
            throw th;
        }
    }

    @Override // defpackage.zhh
    public void a(k55 k55Var) {
        ((zhh) this.b).a(k55Var);
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        return ((uxf) ((m0c) this.b).c).apply(new Object[]{obj});
    }

    @Override // defpackage.qyh
    public Iterator b(a02 a02Var, CharSequence charSequence) {
        return new oyh(this, a02Var, charSequence, 0);
    }

    @Override // defpackage.j55
    public zu4 c() {
        return (av4) this.b;
    }

    public long d(long j) {
        ou4 ou4Var = (ou4) this.b;
        if (vmk.b(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || vmk.c(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            r3a.b("maximumVelocity should be a positive value. You specified=" + ((Object) vmk.g(j)));
        }
        return t6a.i(((xmk) ou4Var.b).b(vmk.b(j)), ((xmk) ou4Var.c).b(vmk.c(j)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(yn2 yn2Var, sq3 sq3Var) {
        qkd qkdVar;
        int i;
        if (sq3Var instanceof qkd) {
            qkdVar = (qkd) sq3Var;
            int i2 = qkdVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qkdVar.t = i2 - Integer.MIN_VALUE;
                Object obj = qkdVar.r;
                lu3 lu3Var = lu3.a;
                i = qkdVar.t;
                if (i == 0) {
                    if (i == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    y6a.M(obj);
                    fdi fdiVar = (fdi) this.b;
                    qkdVar.t = 1;
                    fdiVar.collect(yn2Var, qkdVar);
                    return;
                }
            }
        }
        qkdVar = new qkd(this, sq3Var);
        Object obj2 = qkdVar.r;
        lu3 lu3Var2 = lu3.a;
        i = qkdVar.t;
        if (i == 0) {
        }
    }

    public zq4 f() {
        int i;
        e45 g;
        en0 en0Var = (en0) this.b;
        m45 m45Var = (m45) en0Var.e;
        synchronized (m45Var) {
            i = 1;
            en0Var.j(true);
            g = m45Var.g(((b45) en0Var.c).a);
        }
        if (g != null) {
            return new zq4(g, i);
        }
        return null;
    }

    public void g() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void h(String str, tn3 tn3Var) {
        WeeklyChallengeViewModel D = ((WeeklyLeaderboardFragment) this.b).D();
        xw3.L(un0.z(D), null, null, new z23(str, D, tn3Var, (rq3) null, 23), 3);
    }

    public void j() {
        View view;
        View view2 = (View) this.b;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new rj4(3, view));
    }

    @Override // defpackage.sa
    public boolean n(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.b;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = bsk.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        j0l j0lVar = swipeDismissBehavior.b;
        if (j0lVar != null) {
            j0lVar.r(view);
        }
        return true;
    }

    @Override // defpackage.zhh
    public void onError(Throwable th) {
        try {
            th.getMessage();
        } catch (Throwable th2) {
            td4.w0(th2);
            th = new yf3(th, th2);
        }
        ((zhh) this.b).onError(th);
    }

    @Override // defpackage.zhh
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 17:
                ((zhh) this.b).onSuccess(obj);
                break;
            default:
                ((x09) this.b).invoke(obj);
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yia(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public yia(u6b u6bVar) {
        this.a = 28;
        u6bVar.getClass();
        this.b = new WeakReference(u6bVar);
    }

    public yia(whh whhVar, zhh zhhVar) {
        this.a = 17;
        this.b = zhhVar;
    }

    public yia(Context context) {
        boolean isEmpty;
        this.a = 20;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public /* synthetic */ yia(char c, int i) {
        this.a = i;
    }

    public yia(int i) {
        this.a = 7;
        this.b = gdi.a(new int[i]);
    }
}
