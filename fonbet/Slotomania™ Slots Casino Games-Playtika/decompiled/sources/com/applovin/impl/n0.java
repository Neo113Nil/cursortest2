package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.d7;
import com.applovin.impl.t2;
import com.applovin.impl.u2;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n0 extends p3 {
    private com.applovin.impl.sdk.l a;
    private u2 b;

    class a extends u2 {
        final /* synthetic */ List e;
        final /* synthetic */ List f;
        final /* synthetic */ List g;
        final /* synthetic */ List h;
        final /* synthetic */ List i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.e = list;
            this.f = list2;
            this.g = list3;
            this.h = list4;
            this.i = list5;
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i) {
            List list;
            boolean z = true;
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.e;
            } else if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f;
            } else {
                z = false;
                list = i == c.LISTED_TC_NETWORKS.ordinal() ? this.g : i == c.LISTED_AC_NETWORKS.ordinal() ? this.h : this.i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n0.this.a((d7) it.next(), z));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i) {
            return i == c.MISSING_TC_NETWORKS.ordinal() ? this.e.size() : i == c.MISSING_AC_NETWORKS.ordinal() ? this.f.size() : i == c.LISTED_TC_NETWORKS.ordinal() ? this.g.size() : i == c.LISTED_AC_NETWORKS.ordinal() ? this.h.size() : this.i.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i) {
            return i == c.MISSING_TC_NETWORKS.ordinal() ? new x4("MISSING TCF VENDORS (TC STRING)") : i == c.MISSING_AC_NETWORKS.ordinal() ? new x4("MISSING ATP NETWORKS (AC STRING)") : i == c.LISTED_TC_NETWORKS.ordinal() ? new x4("LISTED TCF VENDORS (TC STRING)") : i == c.LISTED_AC_NETWORKS.ordinal() ? new x4("LISTED ATP NETWORKS (AC STRING)") : new x4("NON-CONFIGURABLE NETWORKS");
        }
    }

    class b implements u2.a {
        b() {
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            q7.a(t2Var.c(), t2Var.b(), n0.this);
        }
    }

    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
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

    public void initialize(List<d7> list, List<d7> list2, List<d7> list3, List<d7> list4, List<d7> list5, com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.b = aVar;
        aVar.a(new b());
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t2 a(d7 d7Var, boolean z) {
        t2.b a2 = t2.a();
        boolean b2 = this.a.t0().b();
        d7.a f = d7Var.f();
        d7.a aVar = d7.a.TCF_VENDOR;
        if (f == aVar || (d7Var.f() == d7.a.ATP_NETWORK && b2)) {
            String c2 = d7Var.c();
            a2.d(c2).d(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).b(c2).a((d7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ") + d7Var.d()).a(true);
        } else {
            a2.d(d7Var.b());
        }
        return a2.a();
    }
}
