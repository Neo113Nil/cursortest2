package Uf;

import Uf.j;
import android.app.Activity;
import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.J;
import com.facebook.hermes.intl.Constants;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.listeners.InitListener;
import com.zoho.livechat.android.listeners.RegisterListener;
import com.zoho.livechat.android.listeners.UnRegisterListener;
import com.zoho.livechat.android.modules.authentication.ui.models.SalesIQJWTAuth;
import com.zoho.livechat.android.modules.triggers.domain.entities.TriggerAlarm;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.ui.activities.ChatActivity;
import com.zoho.livechat.android.utils.AbstractC3932a;
import com.zoho.livechat.android.utils.C3938g;
import com.zoho.livechat.android.utils.CustomTypefaceSpan;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.P;
import com.zoho.livechat.android.utils.Q;
import com.zoho.livechat.android.utils.y;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import od.AbstractC5884j;
import od.AbstractC5886l;
import od.EnumC5876b;
import od.p;
import od.q;
import od.r;
import od.t;
import od.u;
import og.AbstractC5892d;
import rd.C6218a;
import ue.C6549a;
import zf.C6966g;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: i, reason: collision with root package name */
    public static Handler f12219i;

    /* renamed from: k, reason: collision with root package name */
    public static Activity f12221k;

    /* renamed from: l, reason: collision with root package name */
    public static Activity f12222l;

    /* renamed from: a, reason: collision with root package name */
    public Application f12233a;

    /* renamed from: c, reason: collision with root package name */
    public nd.e f12235c;

    /* renamed from: d, reason: collision with root package name */
    public InitListener f12236d;

    /* renamed from: j, reason: collision with root package name */
    public static HashMap f12220j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static Hashtable f12223m = new Hashtable();

    /* renamed from: n, reason: collision with root package name */
    public static boolean f12224n = false;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f12225o = false;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f12226p = false;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f12227q = false;

    /* renamed from: r, reason: collision with root package name */
    public static LinkedHashMap f12228r = new LinkedHashMap();

    /* renamed from: s, reason: collision with root package name */
    public static ArrayList f12229s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public static boolean f12230t = false;

    /* renamed from: u, reason: collision with root package name */
    public static final J f12231u = new c();

    /* renamed from: v, reason: collision with root package name */
    public static final ViewTreeObserver.OnGlobalLayoutListener f12232v = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Uf.g
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            j.e();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public HashMap f12234b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public RegisterListener f12237e = null;

    /* renamed from: f, reason: collision with root package name */
    public UnRegisterListener f12238f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f12239g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f12240h = null;

    public class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.L();
        }
    }

    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f12241a;

        public class a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f12242a;

            public a(View view) {
                this.f12242a = view;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((WindowManager) j.n().getSystemService("window")).removeViewImmediate(this.f12242a);
                j.L();
            }
        }

        public b(Activity activity) {
            this.f12241a = activity;
        }

        public static /* synthetic */ void a(View view, View view2) {
            ((WindowManager) j.n().getSystemService("window")).removeViewImmediate(view);
            C6966g.n0(!(j.n() instanceof ChatActivity));
            j.M(false);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (j.n() != null) {
                    View rootView = j.n().getWindow().getDecorView().getRootView();
                    Rect rect = new Rect();
                    rootView.getWindowVisibleDisplayFrame(rect);
                    int min = Math.min(rect.bottom, rootView.getMeasuredHeight() - C6218a.G());
                    File takeScreenshot = y.INSTANCE.takeScreenshot(j.n().getWindow().getDecorView().getRootView(), min);
                    j.O(j.n());
                    if (takeScreenshot == null || takeScreenshot.length() <= 0) {
                        j.L();
                        return;
                    }
                    sd.c.f64855b = takeScreenshot;
                    final View inflate = ((LayoutInflater) j.n().getSystemService("layout_inflater")).inflate(r.f60736F, (ViewGroup) null);
                    ImageView imageView = (ImageView) inflate.findViewById(q.f60562j5);
                    ImageView imageView2 = (ImageView) inflate.findViewById(q.f60622p5);
                    TextView textView = (TextView) inflate.findViewById(q.f60632q5);
                    CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(C6218a.P());
                    SpannableString spannableString = new SpannableString(textView.getContext().getString(t.f61121u1));
                    spannableString.setSpan(customTypefaceSpan, 0, spannableString.length(), 33);
                    textView.setText(spannableString);
                    androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(this.f12241a, ZohoSalesIQ.getStyleForCurrentThemeMode());
                    FrameLayout frameLayout = (FrameLayout) inflate.findViewById(q.f60582l5);
                    frameLayout.setBackground(P.c(1, P.e(dVar, AbstractC5886l.f59896v1)));
                    ((ImageView) inflate.findViewById(q.f60572k5)).setImageDrawable(AbstractC5892d.c(dVar, p.f59952B3, -1));
                    imageView.setImageDrawable(Drawable.createFromPath(takeScreenshot.getAbsolutePath()));
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                    layoutParams.type = 2;
                    layoutParams.flags = EnumC3631g.SDK_ASSET_LOADING_INDICATOR_VALUE;
                    ((WindowManager) j.n().getSystemService("window")).addView(inflate, layoutParams);
                    imageView2.setOnClickListener(new a(inflate));
                    frameLayout.setOnClickListener(new View.OnClickListener() { // from class: Uf.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            j.b.a(inflate, view2);
                        }
                    });
                }
            } catch (Exception e10) {
                Log.e("Mobilisten", e10.getLocalizedMessage(), e10);
                sd.c.f64855b = null;
            }
        }
    }

    public class c implements J {
        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            LiveChatUtil.log("Keyboard visibility changed: " + f02.q(F0.p.b()));
            return AbstractC2082d0.X(view, f02);
        }
    }

    public j(Application application) {
        this.f12233a = application;
        C6549a.l(application, false);
        if (f12227q) {
            return;
        }
        application.registerReceiver(new qd.f(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        f12227q = true;
    }

    public static void A(Activity activity, Bundle bundle) {
        LiveChatUtil.log("App onActivityCreated");
        f12221k = activity;
    }

    public static void B(final Activity activity) {
        LiveChatUtil.log("App onActivityDestroyed " + activity.getClass().getCanonicalName());
        int c10 = og.i.c(f12229s, new Function1() { // from class: Uf.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean valueOf;
                Activity activity2 = activity;
                valueOf = Boolean.valueOf(r1.intValue() == r0.hashCode());
                return valueOf;
            }
        });
        if (c10 > -1) {
            Integer num = (Integer) f12229s.get(c10);
            f12229s.remove(c10);
            if (num != null) {
                f12228r.remove(num);
            }
        }
        try {
            ne.j.t0(activity);
            Hashtable hashtable = (Hashtable) f12223m.get(EnumC5876b.CHAT);
            if (hashtable != null) {
                Activity activity2 = f12221k;
                if (activity2 != null) {
                    if (hashtable.containsKey(activity2.getClass().getCanonicalName())) {
                    }
                }
                hashtable.remove(activity.getClass().getCanonicalName());
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
        if (Q.f44447F.f44469d && Ag.c.b(activity)) {
            Td.e.P0(Vd.a.AudioOutgoingUICleared);
            Q q10 = Q.f44447F;
            q10.f44468c = false;
            q10.f44469d = false;
            q10.f44470e = false;
        }
    }

    public static void C(Activity activity) {
        f12221k = null;
        N(activity);
        if (!z()) {
            f12230t = true;
        }
        try {
            if (sd.c.f64854a) {
                O(activity);
            } else {
                L();
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
        if (Ag.c.b(activity)) {
            Td.e.P0(Vd.a.AudioUICleared);
        }
    }

    public static void D(final Activity activity) {
        LiveChatUtil.log("App onActivityResumed " + activity.getClass().getCanonicalName());
        f12221k = activity;
        q().postDelayed(new Runnable() { // from class: Uf.b
            @Override // java.lang.Runnable
            public final void run() {
                j.b(activity);
            }
        }, 1500L);
        try {
            if (sd.c.f64854a && sd.c.f64855b == null) {
                X(activity);
            } else if (!sd.c.f64854a) {
                L();
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
        if (!(activity instanceof Yf.c) && !Ag.c.b(activity)) {
            f12222l = activity;
        }
        j(activity);
        if (Ag.c.b(activity)) {
            String str = Q.f44447F.f44471f;
            if (str != null && str.equals(Td.e.L())) {
                Td.e.P0(Vd.a.AudioInvitationShown);
            }
            if (Q.f44447F.f44468c && Ag.c.b(activity)) {
                Q q10 = Q.f44447F;
                q10.f44468c = false;
                q10.f44469d = true;
            }
            Td.e.P0(Vd.a.AudioUIShown);
        }
    }

    public static void F(Activity activity) {
        f12221k = activity;
        LiveChatUtil.log("App onActivityStarted " + activity.getClass().getCanonicalName());
        if (!f12229s.contains(Integer.valueOf(activity.hashCode()))) {
            f12229s.add(Integer.valueOf(activity.hashCode()));
        }
        f12228r.put(Integer.valueOf(activity.hashCode()), "Started");
        x(activity, true);
        if (LiveChatUtil.isEmbedAllowed() || !(activity instanceof Yf.c)) {
            return;
        }
        activity.finish();
    }

    public static void G(Activity activity) {
        LiveChatUtil.log("App onActivityStopped");
        if (y(activity.hashCode())) {
            f12228r.put(Integer.valueOf(activity.hashCode()), "Stopped");
        }
    }

    public static void H() {
        LiveChatUtil.log("App onAllActivitiesDestroyed");
        if (qd.c.h()) {
            LiveChatUtil.log("PEX | WMS ALIVE ON APP DESTROY");
            if (Td.e.m0()) {
                LiveChatUtil.log("PEX | DISCONNECT RETURNED FOR ACTIVE CALL");
            } else {
                LiveChatUtil.log("PEX | DISCONNECT CALLED FROM APP MANAGER");
                qd.c.e();
                qd.c.b();
            }
        }
        if (UTSAdapter.isUtsConnected()) {
            LiveChatUtil.log("UTS DISCONNECT CALLED FROM APP MANAGER");
            UTSAdapter.disconnect();
        } else {
            LiveChatUtil.log("UTS ALREADY DISCONNECTED");
        }
        LiveChatUtil.log("App all activities destroyed, handled cleanup");
    }

    public static void L() {
        M(true);
    }

    public static void M(boolean z10) {
        if (z10) {
            sd.c.f64854a = false;
            sd.c.f64855b = null;
        }
        try {
            Iterator it = f12220j.entrySet().iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) ((Map.Entry) it.next()).getKey();
                if (f12220j.containsKey(activity)) {
                    try {
                        ((WindowManager) activity.getSystemService("window")).removeViewImmediate((View) f12220j.get(activity));
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                }
            }
            f12220j.clear();
        } catch (Exception e11) {
            LiveChatUtil.log(e11);
        }
    }

    public static void N(Activity activity) {
        try {
            activity.getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(f12232v);
            ne.j.x0(false);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void O(Activity activity) {
        try {
            WindowManager windowManager = (WindowManager) activity.getSystemService("window");
            if (f12220j.containsKey(activity)) {
                windowManager.removeViewImmediate((View) f12220j.get(activity));
            }
            f12220j.remove(activity);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static void X(Activity activity) {
        try {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(activity, u.f61162h);
            View inflate = View.inflate(dVar, r.f60757P0, null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(q.f60614o7);
            linearLayout.setBackground(P.d(0, P.e(linearLayout.getContext(), AbstractC5886l.f59892u1), C6218a.b(25.0f), 0, 0));
            ((ImageView) inflate.findViewById(q.f60634q7)).setImageDrawable(LiveChatUtil.changeDrawableColor(dVar, p.f59947A3, -1));
            ImageView imageView = (ImageView) inflate.findViewById(q.f60604n7);
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(p.f60158r3));
            ((RelativeLayout) inflate.findViewById(q.f60594m7)).setOnClickListener(new a());
            ((RelativeLayout) inflate.findViewById(q.f60624p7)).setOnClickListener(new b(activity));
            WindowManager windowManager = (WindowManager) activity.getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.gravity = 17;
            layoutParams.type = 2;
            layoutParams.flags = 40;
            layoutParams.format = -3;
            if (f12220j.containsKey(activity)) {
                return;
            }
            windowManager.addView(inflate, layoutParams);
            f12220j.put(activity, inflate);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static /* synthetic */ void b(Activity activity) {
        if (f12221k == activity) {
            if (f12230t || !z()) {
                x(activity, false);
                f12230t = false;
            }
        }
    }

    public static /* synthetic */ void c() {
        if (LiveChatUtil.canConnectToWMS()) {
            rd.b.b();
        }
    }

    public static /* synthetic */ Unit d(InitListener initListener, nd.e eVar) {
        AbstractC3932a.b(initListener, eVar);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void e() {
        try {
            ne.j.Y();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static /* synthetic */ Unit f(we.d dVar) {
        if (dVar.a() != 6301) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            edit.remove("screenname");
            edit.remove(PublisherMetadata.APP_ID);
            edit.remove("android_channel");
            edit.putBoolean("embednotallowed", true);
            edit.apply();
            f12224n = false;
            ne.j.q0();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void g(Activity activity) {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                Bundle extras = activity.getIntent().getExtras();
                if (extras != null && extras.containsKey("groupid") && extras.containsKey("timeuuid")) {
                    String string = extras.getString("groupid");
                    String string2 = extras.getString("timeuuid");
                    com.zoho.livechat.android.provider.a aVar = com.zoho.livechat.android.provider.a.INSTANCE;
                    cursor = aVar.executeRawQuery("SELECT * FROM SIQ_NOTIFICATIONS WHERE TYPE=" + b.EnumC0639b.SIQ.ordinal() + " AND TIMEUID=? ORDER BY STIME DESC");
                    if (cursor.getCount() > 0) {
                        new C3938g(string, string2, true).start();
                        aVar.delete(MobilistenInitProvider.k().getContentResolver(), b.c.f44270a, "TIMEUID=?", new String[]{string2});
                        AbstractC5884j.i(string2);
                    }
                } else {
                    com.zoho.livechat.android.provider.a aVar2 = com.zoho.livechat.android.provider.a.INSTANCE;
                    Cursor executeRawQuery = aVar2.executeRawQuery("SELECT * FROM SIQ_NOTIFICATIONS WHERE TYPE=" + b.EnumC0639b.SIQ.ordinal() + " ORDER BY STIME DESC");
                    try {
                        if (executeRawQuery.getCount() > 0) {
                            new C3938g("all", null, false).start();
                            aVar2.delete(MobilistenInitProvider.k().getContentResolver(), b.c.f44270a, null, null);
                            AbstractC5884j.h(1477);
                        }
                        cursor = executeRawQuery;
                    } catch (Exception e10) {
                        e = e10;
                        cursor2 = executeRawQuery;
                        LiveChatUtil.log(e);
                        if (cursor2 != null) {
                            cursor2.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = executeRawQuery;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                cursor.close();
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static /* synthetic */ void h(j jVar) {
        jVar.getClass();
        boolean isEmpty = LiveChatUtil.getAllOpenChatIds().isEmpty();
        Rf.a aVar = Rf.a.LandedOnApp;
        TriggerAlarm v10 = Tf.b.v(aVar, null);
        String o10 = Tf.b.o(aVar);
        jVar.f12239g = o10;
        if (o10 != null && isEmpty && v10 == null) {
            Tf.b.N(aVar);
        }
        Rf.a aVar2 = Rf.a.AccessedAnyPageOnApp;
        TriggerAlarm v11 = Tf.b.v(aVar2, null);
        String o11 = Tf.b.o(aVar2);
        jVar.f12240h = o11;
        if (o11 != null && isEmpty && v11 == null) {
            Tf.b.N(aVar2);
        }
    }

    public static void j(Activity activity) {
        try {
            activity.getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalLayoutListener(f12232v);
        } catch (Exception unused) {
        }
    }

    public static Activity n() {
        return f12221k;
    }

    public static Handler q() {
        synchronized (j.class) {
            try {
                if (f12219i == null) {
                    f12219i = new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12219i;
    }

    public static void x(Activity activity, boolean z10) {
        try {
            if (ne.j.c0(activity)) {
                ne.j.r0(z10);
            } else {
                ne.j.t0(activity);
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static boolean y(int i10) {
        if (f12229s.size() > 1) {
            return ((Integer) f12229s.get(f12228r.size() - 1)).intValue() == i10 || ((Integer) f12229s.get(f12228r.size() + (-2))).intValue() == i10;
        }
        return false;
    }

    public static boolean z() {
        if (f12229s.size() <= 1) {
            return true;
        }
        return "Stopped".equals(f12228r.get((Integer) f12229s.get(r0.size() - 2)));
    }

    public void I() {
        LiveChatUtil.log("App onMoveToBackground");
        try {
            if (!sd.c.f64854a) {
                L();
            }
            C6218a.o0(false);
            qd.c.g();
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: Uf.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.h(j.this);
                }
            });
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public void J() {
        K(null, null);
    }

    public void K(final InitListener initListener, final nd.e eVar) {
        LiveChatUtil.log("App onMoveToForeground");
        C6218a.o0(true);
        String str = this.f12239g;
        if (str != null) {
            Tf.b.Q(Rf.a.LandedOnApp, str);
        }
        String str2 = this.f12240h;
        if (str2 != null) {
            Tf.b.Q(Rf.a.AccessedAnyPageOnApp, str2);
        }
        if (LiveChatUtil.isSupportedVersion()) {
            if (C6218a.c0()) {
                if (f12225o && (LiveChatUtil.getAppID() == null || !f12224n || LiveChatUtil.getAndroidChannel() == null)) {
                    LiveChatUtil.submitTaskToExecutorServiceSafely(new pd.h(initListener, eVar));
                } else if (LiveChatUtil.getAnnonID() == null) {
                    Bd.b t10 = Ed.a.t();
                    if (t10 instanceof SalesIQJWTAuth) {
                        Ed.a.e(t10, Bd.a.Initialisation, new Function0() { // from class: Uf.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return j.d(InitListener.this, eVar);
                            }
                        }, new Function1() { // from class: Uf.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j.f((we.d) obj);
                            }
                        });
                    } else {
                        LiveChatUtil.submitTaskToExecutorServiceSafely(new pd.j(LiveChatUtil.getVisitorName(), initListener, eVar));
                    }
                }
            }
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: Uf.e
                @Override // java.lang.Runnable
                public final void run() {
                    j.c();
                }
            });
            SharedPreferences M10 = C6218a.M();
            if (!M10.contains("pushstatus") && "true".equals(M10.getString("pushallowed", Constants.CASEFIRST_FALSE)) && Ye.d.c(De.a.FcmToken)) {
                MobilistenUtil.n();
            }
            final Activity activity = f12221k;
            if (f12226p || activity == null) {
                return;
            }
            f12226p = true;
            AbstractC5884j.h(1479);
            LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: Uf.f
                @Override // java.lang.Runnable
                public final void run() {
                    j.g(activity);
                }
            });
        }
    }

    public void P(String str) {
        this.f12234b.remove(str);
    }

    public void Q(Activity activity) {
        f12222l = activity;
    }

    public void R(Activity activity) {
        f12221k = activity;
    }

    public void S(String str) {
        this.f12234b.put(f12221k.getClass().getCanonicalName(), str);
    }

    public void T(InitListener initListener) {
        this.f12236d = initListener;
    }

    public void U(nd.e eVar) {
        this.f12235c = eVar;
    }

    public void V(RegisterListener registerListener) {
        this.f12237e = registerListener;
    }

    public void W(UnRegisterListener unRegisterListener) {
        this.f12238f = unRegisterListener;
    }

    public void k(InitListener initListener, nd.e eVar) {
        if (C6549a.k()) {
            K(initListener, eVar);
        }
    }

    public Activity l() {
        return f12222l;
    }

    public Application m() {
        return MobilistenInitProvider.l() != null ? MobilistenInitProvider.l() : this.f12233a;
    }

    public Application o() {
        return this.f12233a;
    }

    public Handler p() {
        return q();
    }

    public InitListener r() {
        return this.f12236d;
    }

    public Hashtable s() {
        return f12223m;
    }

    public nd.e t() {
        return this.f12235c;
    }

    public RegisterListener u() {
        return this.f12237e;
    }

    public HashMap v() {
        return this.f12234b;
    }

    public UnRegisterListener w() {
        return this.f12238f;
    }

    public static void E(Activity activity, Bundle bundle) {
    }
}
