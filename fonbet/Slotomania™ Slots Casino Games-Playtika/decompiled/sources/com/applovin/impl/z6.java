package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d7;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class z6 extends p3 {
    private com.applovin.impl.sdk.l a;
    private u2 b;

    class a extends u2 {
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.e = arrayList;
            this.f = arrayList2;
            this.g = z;
        }

        @Override // com.applovin.impl.u2
        protected int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.u2
        protected List c(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.e : this.f;
        }

        @Override // com.applovin.impl.u2
        protected int d(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.e.size() : this.f.size();
        }

        @Override // com.applovin.impl.u2
        protected t2 e(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return new x4("TCF VENDORS (TC STRING)");
            }
            return new x4(this.g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private t2 a(String str, String str2) {
        return t2.a().d(str).c(str2).a();
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
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a2 = q0.b().a(this);
        boolean b2 = lVar.t0().b();
        if (!b2) {
            arrayList2.add(a("Has User Consent", a2));
        }
        for (d7 d7Var : list) {
            Boolean a3 = d7Var.a();
            if (a3 != null) {
                if (d7Var.f() == d7.a.TCF_VENDOR) {
                    arrayList.add(a(d7Var.b(), String.valueOf(a3)));
                } else if (d7Var.f() == d7.a.ATP_NETWORK) {
                    arrayList2.add(a(d7Var.b(), String.valueOf(a3)));
                }
            } else if (b2 && d7Var.f() == d7.a.ATP_NETWORK) {
                arrayList2.add(a(d7Var.b(), a2));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b2);
        this.b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }
}
