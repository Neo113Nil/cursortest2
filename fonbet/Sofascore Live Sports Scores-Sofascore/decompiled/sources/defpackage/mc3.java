package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.g;
import androidx.fragment.app.y;
import androidx.media3.common.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.viewpager2.widget.ViewPager2;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.c;
import com.google.android.material.textfield.TextInputLayout;
import com.ironsource.Ef;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.main.navigation.DynamicBottomNavigation;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class mc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mc3(nw3 nw3Var, Throwable th) {
        this.a = 4;
        Map map = Collections.EMPTY_MAP;
        this.b = nw3Var;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pj5 adapter;
        pj5 adapter2;
        pj5 adapter3;
        Integer num = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                usa usaVar = (usa) this.b;
                vff vffVar = (vff) this.c;
                synchronized (usaVar) {
                    try {
                        if (usaVar.b == null) {
                            usaVar.a.add(vffVar);
                        } else {
                            usaVar.b.add(vffVar.get());
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                List list = (List) this.b;
                um3 um3Var = (um3) this.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((f21) it.next()).a(um3Var.e);
                }
                return;
            case 2:
                ((jw3) this.b).b((String) this.c, Boolean.FALSE);
                return;
            case 3:
                nw3 nw3Var = (nw3) this.b;
                String str = (String) this.c;
                r18 r18Var = nw3Var.g.d;
                String a = wja.a(1024, str);
                synchronized (((AtomicMarkableReference) r18Var.g)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) r18Var.g).getReference();
                        if (a != null) {
                            z = a.equals(str2);
                        } else if (str2 == null) {
                            z = true;
                        }
                        if (z) {
                            return;
                        }
                        ((AtomicMarkableReference) r18Var.g).set(a, true);
                        ((xx3) ((hcc) r18Var.c).c).g(new t4f(r18Var, 19));
                        return;
                    } finally {
                    }
                }
            case 4:
                nw3 nw3Var2 = (nw3) this.b;
                Throwable th = (Throwable) this.c;
                Map map = Collections.EMPTY_MAP;
                jw3 jw3Var = nw3Var2.g;
                Thread currentThread = Thread.currentThread();
                jw3Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                wx3 wx3Var = jw3Var.n;
                if (wx3Var == null || !wx3Var.e.get()) {
                    long j = currentTimeMillis / 1000;
                    String d = jw3Var.d();
                    if (d == null) {
                        return;
                    }
                    jw3Var.m.g(th, currentThread, "error", new v36(j, d, map), false);
                    return;
                }
                return;
            case 5:
                ((ty3) this.b).d().c(((fsf) this.c).a);
                return;
            case 6:
                ((ty3) this.b).d().c((dx8) this.c);
                return;
            case 7:
                ((ty3) this.b).d().onResult((gx8) this.c);
                return;
            case 8:
                ((oy3) this.b).c(this.c);
                return;
            case 9:
                ((yy3) this.b).e().c(((fsf) this.c).a);
                return;
            case 10:
                ((yy3) this.b).e().onResult((gx8) this.c);
                return;
            case 11:
                ((yy3) this.b).e().c((hx8) this.c);
                return;
            case 12:
                ((yy3) this.b).e().c((dx8) this.c);
                return;
            case 13:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0((oy3) this.b, (Exception) this.c);
                return;
            case 14:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0((oy3) this.b, (fsf) this.c);
                return;
            case 15:
                RecyclerView recyclerView = (RecyclerView) this.b;
                CupTreeExtendedView cupTreeExtendedView = (CupTreeExtendedView) this.c;
                if (recyclerView.getScrollState() == 0) {
                    adapter = cupTreeExtendedView.getAdapter();
                    nr1 nr1Var = cupTreeExtendedView.d;
                    znh znhVar = adapter.o;
                    n layoutManager = ((RecyclerView) nr1Var.i).getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                        Integer valueOf = Integer.valueOf(findFirstCompletelyVisibleItemPosition);
                        if (findFirstCompletelyVisibleItemPosition >= 0) {
                            num = valueOf;
                        }
                    }
                    znhVar.i(yid.m(num));
                    adapter2 = cupTreeExtendedView.getAdapter();
                    cupTreeExtendedView.e = adapter2.o.h();
                    TypeHeaderView typeHeaderView = (TypeHeaderView) nr1Var.h;
                    adapter3 = cupTreeExtendedView.getAdapter();
                    typeHeaderView.setSelectedIndex(adapter3.o.h());
                    return;
                }
                return;
            case 16:
                la4 la4Var = (la4) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(la4Var.c);
                StrictMode.ThreadPolicy threadPolicy = la4Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 17:
                c cVar = (c) this.b;
                String str3 = (String) this.c;
                TextInputLayout textInputLayout = cVar.a;
                SimpleDateFormat simpleDateFormat = cVar.c;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str3.replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(lhk.d().getTimeInMillis())).replace(' ', (char) 160)));
                vhh vhhVar = (vhh) cVar;
                SingleDateSelector singleDateSelector = vhhVar.k;
                vhhVar.j.getError();
                singleDateSelector.getClass();
                vhhVar.i.a();
                return;
            case 18:
                AudioTrack audioTrack = (AudioTrack) this.b;
                r0a r0aVar = (r0a) this.c;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    r0aVar.j();
                    synchronized (on4.d0) {
                        try {
                            int i = on4.f0 - 1;
                            on4.f0 = i;
                            if (i == 0) {
                                on4.e0.shutdown();
                                on4.e0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    r0aVar.j();
                    synchronized (on4.d0) {
                        try {
                            int i2 = on4.f0 - 1;
                            on4.f0 = i2;
                            if (i2 == 0) {
                                on4.e0.shutdown();
                                on4.e0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 19:
                ro4 ro4Var = (ro4) this.b;
                b bVar = (b) this.c;
                so4 so4Var = ro4Var.d;
                if (so4Var.o == 0 || ro4Var.c) {
                    return;
                }
                Looper looper = so4Var.s;
                looper.getClass();
                ro4Var.b = so4Var.f(looper, ro4Var.a, bVar, false);
                so4Var.m.add(ro4Var);
                return;
            case 20:
                rp4 rp4Var = (rp4) this.b;
                Uri uri = (Uri) this.c;
                rp4Var.j = false;
                rp4Var.c(uri);
                return;
            case 21:
                mq8.j((Rect) this.c, (View) this.b);
                return;
            case 22:
                g gVar = (g) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                viewGroup.getClass();
                Iterator it2 = gVar.c.iterator();
                while (it2.hasNext()) {
                    y yVar = ((at4) it2.next()).a;
                    View view = yVar.c.getView();
                    if (view != null) {
                        ljg.a(yVar.a, view, viewGroup);
                    }
                }
                return;
            case 23:
                ((ru4) ((fp4) this.b).c).h.onVideoSizeChanged((zqk) this.c);
                return;
            case 24:
                Callable callable = (Callable) this.b;
                kw4 kw4Var = (kw4) ((t9d) this.c).a;
                try {
                    kw4Var.j(callable.call());
                    return;
                } catch (Exception e) {
                    kw4Var.k(e);
                    return;
                }
            case 25:
                py4 py4Var = (py4) this.b;
                lw9 lw9Var = (lw9) this.c;
                g01 g01Var = py4Var.r;
                Context context2 = g01Var.a;
                String str4 = g01Var.b;
                KProperty[] kPropertyArr = BaseActivity.H;
                context2.getClass();
                String str5 = (String) lw9Var.b.c;
                str4.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putString(Payload.CAMPAIGN_ID, str5);
                firebaseBundle.putString("location", str4);
                ia0 ia0Var = ia0.q;
                me4.d((f5d) me4.e(), "in_app_message_impression", firebaseBundle, context2).a.e(n9e.K(firebaseBundle), null, "in_app_message_impression", false);
                return;
            case 26:
                u05 u05Var = (u05) this.b;
                Context context3 = (Context) this.c;
                if (u05Var.a != null || context3 == null) {
                    return;
                }
                u05Var.a = context3.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case 27:
                r45 r45Var = (r45) this.b;
                if (((ArrayDeque) r45Var.d).offer((Runnable) this.c)) {
                    r45Var.a();
                    return;
                } else {
                    a70.r("cannot enqueue any more runnables");
                    return;
                }
            case 28:
                DynamicBottomNavigation.n((ViewPager2) this.b, (DynamicBottomNavigation) this.c);
                return;
            default:
                Ef.a((WeakReference) this.b, (Function1) this.c);
                return;
        }
    }

    public /* synthetic */ mc3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ mc3(mq8 mq8Var, View view, Rect rect) {
        this.a = 21;
        this.b = view;
        this.c = rect;
    }
}
