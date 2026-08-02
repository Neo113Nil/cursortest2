package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.e1;
import com.applovin.impl.u2;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes4.dex */
public abstract class d1 extends Activity {
    private e1 a;
    private FrameLayout b;
    private ListView c;

    class a implements u2.a {
        final /* synthetic */ c a;

        /* renamed from: com.applovin.impl.d1$a$a, reason: collision with other inner class name */
        class C0098a implements d.b {
            final /* synthetic */ l2 a;

            C0098a(l2 l2Var) {
                this.a = l2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((r1) d1.this.a.d().get(this.a.a()), d1.this.a.e());
            }
        }

        a(c cVar) {
            this.a = cVar;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() != e1.a.RECENT_ADS.ordinal()) {
                return;
            }
            d.a(d1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.a, new C0098a(l2Var));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.b = (FrameLayout) findViewById(android.R.id.content);
        this.c = (ListView) findViewById(R.id.listView);
        g8.a(this.b, com.applovin.impl.sdk.l.E0);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        e1 e1Var = this.a;
        if (e1Var != null) {
            e1Var.a((u2.a) null);
            this.a.g();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        e1 e1Var = this.a;
        if (e1Var == null) {
            finish();
            return;
        }
        this.c.setAdapter((ListAdapter) e1Var);
        e1 e1Var2 = this.a;
        if (e1Var2 != null && !e1Var2.e().z().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        e1 e1Var3 = this.a;
        if (e1Var3 == null || !e1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(e1 e1Var, c cVar) {
        this.a = e1Var;
        e1Var.a(new a(cVar));
    }

    private void a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b.bringChildToFront(textView);
    }
}
