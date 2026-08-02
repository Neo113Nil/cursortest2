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
public abstract class g7 extends p3 {
    private com.applovin.impl.sdk.l a;
    private List b;
    private List c;
    private u2 d;
    private List e;
    private List f;
    private ListView g;

    class a extends u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.u2
        protected t2 a() {
            return new t2.b(t2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.u2
        protected List c(int i) {
            return i == c.BIDDERS.ordinal() ? g7.this.e : g7.this.f;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i) {
            return i == c.BIDDERS.ordinal() ? g7.this.e.size() : g7.this.f.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i) {
            return i == c.BIDDERS.ordinal() ? new x4("BIDDERS") : new x4("WATERFALL");
        }
    }

    class b extends b4 {
        final /* synthetic */ w2 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g3 g3Var, Context context, w2 w2Var) {
            super(g3Var, context);
            this.p = w2Var;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int d() {
            if (g7.this.a.u0().b() == null || !g7.this.a.u0().b().equals(this.p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.b4, com.applovin.impl.t2
        public int e() {
            if (g7.this.a.u0().b() == null || !g7.this.a.u0().b().equals(this.p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.t2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.p.a(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }
    }

    enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public g7() {
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

    public void initialize(List<w2> list, List<w2> list2, final com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = list;
        this.c = list2;
        this.e = a(list);
        this.f = a(list2);
        a aVar = new a(this);
        this.d = aVar;
        aVar.a(new u2.a() { // from class: com.applovin.impl.g7$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.u2.a
            public final void a(l2 l2Var, t2 t2Var) {
                g7.this.a(lVar, l2Var, t2Var);
            }
        });
        this.d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.g = listView;
        listView.setAdapter((ListAdapter) this.d);
    }

    @Override // com.applovin.impl.p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.e = a(this.b);
        this.f = a(this.c);
        this.d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.l lVar, l2 l2Var, t2 t2Var) {
        List b2 = a(l2Var).b();
        if (b2.equals(lVar.u0().b())) {
            lVar.u0().a((List) null);
        } else {
            lVar.u0().a(b2);
        }
        this.d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w2 w2Var = (w2) it.next();
            arrayList.add(new b(w2Var.d(), this, w2Var));
        }
        return arrayList;
    }

    private w2 a(l2 l2Var) {
        if (l2Var.b() == c.BIDDERS.ordinal()) {
            return (w2) this.b.get(l2Var.a());
        }
        return (w2) this.c.get(l2Var.a());
    }
}
