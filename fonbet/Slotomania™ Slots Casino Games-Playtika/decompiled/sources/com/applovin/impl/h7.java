package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.u2;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class h7 extends p3 {
    private com.applovin.impl.sdk.l a;
    private List b;
    private u2 c;
    private List d;
    private ListView e;

    class a extends u2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.e = list;
        }

        @Override // com.applovin.impl.u2
        protected t2 a() {
            return new t2.b(t2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i) {
            return h7.this.d;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i) {
            return this.e.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i) {
            return new x4("TEST MODE NETWORKS");
        }
    }

    class b implements u2.a {
        final /* synthetic */ List a;
        final /* synthetic */ com.applovin.impl.sdk.l b;

        b(List list, com.applovin.impl.sdk.l lVar) {
            this.a = list;
            this.b = lVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            List u = ((g3) this.a.get(l2Var.a())).u();
            if (u.equals(this.b.u0().b())) {
                this.b.u0().a((List) null);
            } else {
                this.b.u0().a(u);
            }
            h7.this.c.notifyDataSetChanged();
        }
    }

    class c extends b4 {
        final /* synthetic */ g3 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g3 g3Var, Context context, g3 g3Var2) {
            super(g3Var, context);
            this.p = g3Var2;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int d() {
            if (this.p.u().equals(h7.this.a.u0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int e() {
            if (this.p.u().equals(h7.this.a.u0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.t2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.p.g(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    public h7() {
        this.communicatorTopics.add("network_sdk_version_updated");
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

    public void initialize(List<g3> list, com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = list;
        this.d = a(list);
        a aVar = new a(this, list);
        this.c = aVar;
        aVar.a(new b(list, lVar));
        this.c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.e = listView;
        listView.setAdapter((ListAdapter) this.c);
    }

    @Override // com.applovin.impl.p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.d = a(this.b);
        this.c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            arrayList.add(new c(g3Var, this, g3Var));
        }
        return arrayList;
    }
}
