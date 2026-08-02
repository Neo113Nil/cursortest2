package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;
import com.applovin.impl.w0;
import com.applovin.impl.y0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class a1 {
    private final com.applovin.impl.sdk.l a;
    private final int b;
    private List d;
    private String e;
    private w0 f;
    private v0.c g;
    private w0 h;
    private Dialog i;
    private long j;
    private long k;
    private long l;
    private final u0 c = new u0();
    private v0.b m = new v0.b();
    private final com.applovin.impl.b n = new a();

    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || a1.this.h == null) {
                return;
            }
            if (a1.this.i != null) {
                a1 a1Var = a1.this;
                if (!com.applovin.impl.d.d(a1Var.a(a1Var.i))) {
                    a1.this.i.dismiss();
                }
                a1.this.i = null;
            }
            w0 w0Var = a1.this.h;
            a1.this.h = null;
            a1 a1Var2 = a1.this;
            a1Var2.a(a1Var2.f, w0Var, activity);
        }
    }

    class b implements DialogInterface.OnClickListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ y0 b;
        final /* synthetic */ w0 c;
        final /* synthetic */ Activity d;

        b(boolean z, y0 y0Var, w0 w0Var, Activity activity) {
            this.a = z;
            this.b = y0Var;
            this.c = w0Var;
            this.d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            a1.this.h = null;
            a1.this.i = null;
            HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - a1.this.l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.a), hashMap);
            a1.this.a.x0().d(f2.q, hashMap);
            w0 a = a1.this.a(this.b.a());
            if (a == null) {
                a1.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            a1.this.a(this.c, a, this.d);
            if (a.d() != w0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    class c extends ClickableSpan {
        final /* synthetic */ Uri a;
        final /* synthetic */ Activity b;

        c(Uri uri, Activity activity) {
            this.a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            q7.a(this.a, this.b, a1.this.a);
        }
    }

    class d extends ClickableSpan {
        final /* synthetic */ Uri a;
        final /* synthetic */ Activity b;

        d(Uri uri, Activity activity) {
            this.a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            q7.a(this.a, this.b, a1.this.a);
        }
    }

    class e implements CmpServiceImpl.e {
        final /* synthetic */ long a;
        final /* synthetic */ w0 b;
        final /* synthetic */ Activity c;

        e(long j, w0 w0Var, Activity activity) {
            this.a = j;
            this.b = w0Var;
            this.c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            a1.this.m.a(appLovinCmpError);
            a1.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.a);
            a1.this.a(this.b, this.c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class f implements CmpServiceImpl.e {
        final /* synthetic */ long a;
        final /* synthetic */ w0 b;
        final /* synthetic */ Activity c;

        f(long j, w0 w0Var, Activity activity) {
            this.a = j;
            this.b = w0Var;
            this.c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            a1.this.m.a(appLovinCmpError);
            a1.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.a);
            a1.this.a(this.b, this.c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class g implements CmpServiceImpl.f {
        final /* synthetic */ long a;
        final /* synthetic */ w0 b;
        final /* synthetic */ Activity c;

        g(long j, w0 w0Var, Activity activity) {
            this.a = j;
            this.b = w0Var;
            this.c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.a));
            if (appLovinCmpError != null) {
                a1.this.m.a(appLovinCmpError);
                hashMap.putAll(a1.this.a(appLovinCmpError));
                a1.this.a.x0().d(f2.v, hashMap);
            } else {
                a1.this.m.c();
                a1.this.a.x0().d(f2.w, hashMap);
            }
            a1.this.b(this.b, this.c);
        }
    }

    class h implements Runnable {
        final /* synthetic */ w0 a;

        h(w0 w0Var) {
            this.a = w0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a1 a1Var = a1.this;
            a1Var.a(a1Var.f, this.a, a1.this.a.w0());
        }
    }

    public a1(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = ((Integer) lVar.a(z4.l7)).intValue();
    }

    private void c(final w0 w0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.a1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                a1.this.a(w0Var, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(w0 w0Var, Activity activity) {
        a(w0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.j));
        CollectionUtils.putStringIfValid("details", this.c.toString(), hashMap);
        this.a.x0().d(f2.x, hashMap);
        this.d = null;
        this.f = null;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.c.a();
        this.a.e().b(this.n);
        v0.c cVar = this.g;
        if (cVar != null) {
            cVar.a(this.m);
            this.g = null;
        }
        this.m = new v0.b();
    }

    public void a(Activity activity, v0.c cVar) {
        a(w0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i, Activity activity, v0.c cVar) {
        if (this.d != null) {
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("ConsentFlowStateMachine", "Unable to start states: " + this.d);
            }
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.d);
            }
            cVar.a(new v0.b(new t0(t0.d, "Consent flow is already in progress.")));
            return;
        }
        List a2 = b1.a(this.a);
        this.d = a2;
        this.e = String.valueOf(a2);
        this.g = cVar;
        w0 a3 = a(i);
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.d + "\nInitial state: " + a3);
        }
        com.applovin.impl.sdk.l.a(activity).a(this.n);
        this.a.x0().a(f2.o);
        this.j = SystemClock.elapsedRealtime();
        a((w0) null, a3, activity);
    }

    public boolean a() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w0 w0Var, Activity activity, Boolean bool) {
        a(w0Var, a(w0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w0 w0Var, w0 w0Var2, Activity activity) {
        this.f = w0Var;
        c(w0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w0 w0Var, final Activity activity) {
        boolean z;
        SpannableString spannableString;
        if (w0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("ConsentFlowStateMachine", "Transitioning to state: " + w0Var);
        }
        long elapsedRealtime = this.f != null ? SystemClock.elapsedRealtime() - this.k : 0L;
        this.k = SystemClock.elapsedRealtime();
        this.c.a(w0Var, elapsedRealtime);
        if (w0Var.d() == w0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            }
            this.a.G().trackEvent("cf_start");
            x0 x0Var = (x0) w0Var;
            this.h = x0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri h2 = this.a.y().h();
            final boolean z2 = h2 != null;
            for (y0 y0Var : x0Var.f()) {
                b bVar = new b(z2, y0Var, w0Var, activity);
                if (y0Var.c() == y0.a.POSITIVE) {
                    builder.setPositiveButton(y0Var.d(), bVar);
                } else if (y0Var.c() == y0.a.NEGATIVE) {
                    builder.setNegativeButton(y0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(y0Var.d(), bVar);
                }
            }
            String h3 = x0Var.h();
            if (StringUtils.isValidString(h3)) {
                spannableString = new SpannableString(h3);
                String a2 = com.applovin.impl.sdk.l.a(R.string.applovin_terms_of_service_text);
                String a3 = com.applovin.impl.sdk.l.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(h3, Arrays.asList(a2, a3))) {
                    if (z2) {
                        StringUtils.addLinks(spannableString, Pattern.compile(a2), new c(h2, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(a3), new d(this.a.y().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog create = builder.setTitle(spannableString).setMessage(x0Var.g()).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.a1$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    a1.this.a(create, activity, z2, dialogInterface);
                }
            });
            this.i = create;
            create.show();
            this.m.d();
            return;
        }
        if (w0Var.d() == w0.b.POST_ALERT) {
            if (this.a.y().k() && this.a.y().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(w0Var);
                    return;
                } else {
                    this.a.x0().a(f2.r);
                    this.a.t().loadCmp(activity, new e(SystemClock.elapsedRealtime(), w0Var, activity));
                    return;
                }
            }
            a(w0Var, activity, Boolean.FALSE);
            return;
        }
        if (w0Var.d() == w0.b.EVENT) {
            z0 z0Var = (z0) w0Var;
            String g2 = z0Var.g();
            Map<String, ?> f2 = z0Var.f();
            if (f2 == null) {
                f2 = new HashMap<>(1);
            }
            f2.put("flow_type", "unified");
            this.a.G().trackEvent(g2, f2);
            b(z0Var, activity);
            return;
        }
        if (w0Var.d() == w0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            } else if (this.a.y().m()) {
                this.a.t().preloadCmp(activity);
                a(w0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.a.x0().a(f2.r);
                this.a.t().loadCmp(activity, new f(SystemClock.elapsedRealtime(), w0Var, activity));
                return;
            }
        }
        if (w0Var.d() == w0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(w0Var);
                return;
            }
            if (!this.a.y().m()) {
                this.a.G().trackEvent("cf_start");
            }
            this.a.x0().a(f2.u);
            this.a.t().showCmp(activity, new g(SystemClock.elapsedRealtime(), w0Var, activity));
            return;
        }
        if (w0Var.d() == w0.b.DECISION) {
            w0.a a4 = w0Var.a();
            if (a4 == w0.a.IS_AL_GDPR) {
                boolean k = this.a.y().k();
                this.c.a(w0Var, k, elapsedRealtime);
                a(w0Var, activity, Boolean.valueOf(k));
                return;
            } else if (a4 == w0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z = !this.a.B0() || ((Boolean) this.a.a(b5.t, Boolean.FALSE)).booleanValue();
                this.c.a(w0Var, z, elapsedRealtime);
                a(w0Var, activity, Boolean.valueOf(z));
                return;
            } else {
                if (a4 == w0.a.HAS_TERMS_OF_SERVICE_URI) {
                    z = this.a.y().h() != null;
                    this.c.a(w0Var, z, elapsedRealtime);
                    a(w0Var, activity, Boolean.valueOf(z));
                    return;
                }
                a("Invalid consent flow decision type: " + a4);
                return;
            }
        }
        if (w0Var.d() == w0.b.REINIT) {
            b();
        } else {
            a("Invalid consent flow destination state: " + w0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.l = SystemClock.elapsedRealtime();
        this.a.x0().d(f2.p, CollectionUtils.hashMap("details", String.valueOf(z)));
    }

    private void a(w0 w0Var) {
        this.c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(w0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        m1.a(str, new Object[0]);
        this.a.E().a(f2.X0, str, CollectionUtils.hashMap("details", "Last started states: " + this.e + "\nLast successful state: " + this.f));
        this.c.b(str);
        v0.b bVar = this.m;
        if (bVar != null) {
            bVar.a(new t0(t0.e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 a(int i) {
        List<w0> list = this.d;
        if (list == null) {
            return null;
        }
        for (w0 w0Var : list) {
            if (i == w0Var.c()) {
                return w0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j));
        if (appLovinCmpError == null) {
            this.a.x0().d(f2.s, hashMap);
        } else {
            hashMap.putAll(a(appLovinCmpError));
            this.a.x0().d(f2.t, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), hashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), hashMap);
        return hashMap;
    }
}
