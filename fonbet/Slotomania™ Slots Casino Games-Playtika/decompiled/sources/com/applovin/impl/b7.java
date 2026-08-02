package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.d;
import com.applovin.impl.d7;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.u2;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b7 extends p3 {
    private com.applovin.impl.sdk.l a;
    private u2 b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final List g = new ArrayList();

    class a extends u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? b7.this.c() : b7.this.a();
        }

        @Override // com.applovin.impl.u2
        protected int d(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? new x4("IAB TCF Parameters") : new x4("CMP CONFIGURATION");
        }
    }

    class b implements u2.a {
        final /* synthetic */ c7 a;
        final /* synthetic */ com.applovin.impl.sdk.l b;

        class a implements d.b {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.a, this.b, b.this.b);
            }
        }

        /* renamed from: com.applovin.impl.b7$b$b, reason: collision with other inner class name */
        class C0097b implements d.b {
            C0097b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(b7.this.e, b7.this.f, b7.this.c, b7.this.d, b7.this.g, b.this.b);
            }
        }

        b(c7 c7Var, com.applovin.impl.sdk.l lVar) {
            this.a = c7Var;
            this.b = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            String a2;
            String c;
            if (l2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (l2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    com.applovin.impl.d.a(b7.this, MaxDebuggerCmpNetworksListActivity.class, this.b.e(), new C0097b());
                    return;
                } else {
                    q7.a(t2Var.c(), t2Var.b(), b7.this);
                    return;
                }
            }
            if (l2Var.a() == d.TC_STRING.ordinal()) {
                a2 = b5.x.a();
                c = this.a.j();
            } else {
                a2 = b5.y.a();
                c = this.a.c();
            }
            com.applovin.impl.d.a(b7.this, MaxDebuggerTcfStringActivity.class, this.b.e(), new a(a2, c));
        }
    }

    private enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    private enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        return this.a;
    }

    public void initialize(List<d7> list, com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        c7 t0 = lVar.t0();
        a(list);
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(t0, lVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        u2 u2Var = this.b;
        if (u2Var != null) {
            u2Var.a((u2.a) null);
        }
    }

    private void a(List list) {
        boolean b2 = this.a.t0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d7 d7Var = (d7) it.next();
            if (d7Var.f() == d7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(d7Var.a())) {
                    a(d7Var, this.c);
                } else {
                    a(d7Var, this.e);
                }
            } else if (d7Var.f() != d7.a.ATP_NETWORK) {
                this.g.add(d7Var);
            } else if (!b2) {
                this.g.add(d7Var);
            } else if (Boolean.TRUE.equals(d7Var.a())) {
                a(d7Var, this.d);
            } else {
                a(d7Var, this.f);
            }
        }
    }

    private t2 b() {
        String a2 = b5.u.a();
        Integer e2 = this.a.t0().e();
        t2.b a3 = StringUtils.isValidString(this.a.t0().d()) ? t2.a(t2.c.RIGHT_DETAIL) : t2.a(t2.c.DETAIL).b("Unknown CMP SDK ID").a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a2 + " is " + e2 + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(getColor(R.color.applovin_sdk_warningColor)).a(true);
        a3.d(a2);
        a3.c(e2 != null ? e2.toString() : "No value set");
        a3.c(e2 != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK);
        return a3.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g = this.a.t0().g();
        String j = this.a.t0().j();
        String c2 = this.a.t0().c();
        arrayList.add(a(b5.w.a(), g));
        arrayList.add(a(b5.x.a(), j, !f7.b(j)));
        arrayList.add(a(b5.y.a(), c2, false));
        return arrayList;
    }

    private void a(d7 d7Var, List list) {
        if (d7Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (d7Var.d().equals(((d7) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(d7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.e.size() + this.f.size();
        arrayList.add(b());
        arrayList.add(a(b5.v.a(), this.a.t0().f()));
        arrayList.add(t2.a(t2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        arrayList.add(t2.a(t2.c.RIGHT_DETAIL).d("Configured CMP Networks").c(size > 0 ? "Missing " + size + " network(s)" : "").c(size > 0 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).a(this).a(true).a());
        return arrayList;
    }

    private t2 a(String str, Integer num) {
        return t2.a(t2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK).a();
    }

    private t2 a(String str, String str2, boolean z) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        t2.b d2 = t2.a(t2.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        t2.b a2 = d2.c(str2).c(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).a(isValidString);
        if (isValidString) {
            a2.a(this);
        }
        return a2.a();
    }
}
