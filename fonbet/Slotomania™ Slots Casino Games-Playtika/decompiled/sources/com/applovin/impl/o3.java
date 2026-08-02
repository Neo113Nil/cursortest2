package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.d;
import com.applovin.impl.q3;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u2;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerAxonEventsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes.dex */
public abstract class o3 extends p3 {
    private q3 a;
    private DataSetObserver b;
    private FrameLayout c;
    private ListView d;
    private com.applovin.impl.a e;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            o3.this.a();
            o3 o3Var = o3.this;
            o3Var.b((Context) o3Var);
        }
    }

    class b implements u2.a {
        final /* synthetic */ com.applovin.impl.c a;

        class a implements d.b {
            a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(o3.this.a.u());
            }
        }

        /* renamed from: com.applovin.impl.o3$b$b, reason: collision with other inner class name */
        class C0105b implements d.b {
            C0105b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(o3.this.a.d(), o3.this.a.u());
            }
        }

        class c implements d.b {
            c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(o3.this.a.d(), o3.this.a.u());
            }
        }

        class d implements d.b {
            d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(o3.this.a.f(), false, o3.this.a.u());
            }
        }

        class e implements d.b {
            e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(o3.this.a.k(), o3.this.a.x(), o3.this.a.u());
            }
        }

        class f implements d.b {
            f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(o3.this.a.w(), o3.this.a.u());
            }
        }

        class g implements d.b {
            g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(o3.this.a.p(), true, o3.this.a.u());
            }
        }

        class h implements d.b {
            h() {
            }

            @Override // com.applovin.impl.d.b
            public void a(g0 g0Var) {
                g0Var.initialize(o3.this.a.u().G().getTrackedAxonEvents(), o3.this.a.u());
            }
        }

        class i implements d.b {
            final /* synthetic */ t2 a;

            i(t2 t2Var) {
                this.a = t2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((b4) this.a).r());
            }
        }

        b(com.applovin.impl.c cVar) {
            this.a = cVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            int b = l2Var.b();
            if (b == q3.e.APP_INFO.ordinal()) {
                q7.a(t2Var.c(), t2Var.b(), o3.this);
                return;
            }
            if (b == q3.e.MAX.ordinal()) {
                if (o3.this.a.a(t2Var)) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerUnifiedFlowActivity.class, this.a, new a());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), o3.this);
                    return;
                }
            }
            if (b == q3.e.PRIVACY.ordinal()) {
                if (l2Var.a() != q3.d.CMP.ordinal()) {
                    if (l2Var.a() == q3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(o3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(o3.this.a.u().t0().j())) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerTcfInfoListActivity.class, this.a, new C0105b());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), o3.this);
                    return;
                }
            }
            if (b != q3.e.ADS.ordinal()) {
                if (b == q3.e.EVENTS.ordinal()) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAxonEventsListActivity.class, this.a, new h());
                    return;
                } else {
                    if ((b == q3.e.INCOMPLETE_NETWORKS.ordinal() || b == q3.e.COMPLETED_NETWORKS.ordinal()) && (t2Var instanceof b4)) {
                        com.applovin.impl.d.a(o3.this, MaxDebuggerDetailActivity.class, this.a, new i(t2Var));
                        return;
                    }
                    return;
                }
            }
            if (l2Var.a() == q3.b.AD_UNITS.ordinal()) {
                if (o3.this.a.f().size() > 0) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAdUnitsListActivity.class, this.a, new d());
                    return;
                } else {
                    q7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", o3.this);
                    return;
                }
            }
            if (l2Var.a() == q3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (o3.this.a.k().size() <= 0 && o3.this.a.x().size() <= 0) {
                    q7.a("Complete Integrations", "Please complete integrations in order to access this.", o3.this);
                    return;
                } else if (o3.this.a.u().u0().c()) {
                    q7.a("Restart Required", t2Var.b(), o3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerTestLiveNetworkActivity.class, this.a, new e());
                    return;
                }
            }
            if (l2Var.a() != q3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (l2Var.a() == q3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(o3.this, MaxDebuggerAdUnitsListActivity.class, this.a, new g());
                }
            } else if (!o3.this.a.u().u0().c()) {
                o3.this.getSdk().u0().a();
                q7.a("Restart Required", t2Var.b(), o3.this);
            } else if (o3.this.a.w().size() > 0) {
                com.applovin.impl.d.a(o3.this, MaxDebuggerTestModeNetworkActivity.class, this.a, new f());
            } else {
                q7.a("Complete Integrations", "Please complete integrations in order to access this.", o3.this);
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, R.attr.progressBarStyleLarge);
        this.e = aVar;
        aVar.setColor(-3355444);
        this.c.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.c.bringChildToFront(this.e);
        this.e.a();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.a);
        p0.startActivity(p1);
    }

    @Override // com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        q3 q3Var = this.a;
        if (q3Var != null) {
            return q3Var.u();
        }
        return null;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.d = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        q3 q3Var = this.a;
        if (q3Var != null) {
            q3Var.unregisterDataSetObserver(this.b);
            this.a.a((u2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        q3 q3Var = this.a;
        if (q3Var == null || !q3Var.z()) {
            return;
        }
        this.a.c();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        q3 q3Var = this.a;
        if (q3Var == null || q3Var.z()) {
            return;
        }
        c();
    }

    public void setListAdapter(q3 q3Var, c cVar) {
        DataSetObserver dataSetObserver;
        q3 q3Var2 = this.a;
        if (q3Var2 != null && (dataSetObserver = this.b) != null) {
            q3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.a = q3Var;
        this.b = new a();
        b((Context) this);
        this.a.registerDataSetObserver(this.b);
        this.a.a(new b(cVar));
    }

    private void b() {
        q3 q3Var = this.a;
        if (q3Var == null) {
            return;
        }
        String q = q3Var.q();
        if (TextUtils.isEmpty(q)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", q);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.e;
        if (aVar != null) {
            aVar.b();
            this.c.removeView(this.e);
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        q7.a(this.a.i(), this.a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.a.h()) || this.a.y()) {
            return;
        }
        this.a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.o3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                o3.this.a(context);
            }
        });
    }
}
