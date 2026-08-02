package com.applovin.impl;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.d;
import com.applovin.impl.g3;
import com.applovin.impl.i3;
import com.applovin.impl.u2;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes.dex */
public abstract class h3 extends p3 {
    private i3 a;
    private ListView b;

    class a implements u2.a {
        final /* synthetic */ g3 a;

        /* renamed from: com.applovin.impl.h3$a$a, reason: collision with other inner class name */
        class C0100a implements d.b {
            C0100a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.a);
            }
        }

        a(g3 g3Var) {
            this.a = g3Var;
        }

        @Override // com.applovin.impl.u2.a
        public void a(l2 l2Var, t2 t2Var) {
            if (l2Var.b() != i3.a.TEST_ADS.ordinal()) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
                return;
            }
            com.applovin.impl.sdk.l o = this.a.o();
            g3.b y = this.a.y();
            if (!h3.this.a.a(l2Var)) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
                return;
            }
            if (g3.b.READY == y) {
                d.a(h3.this, MaxDebuggerMultiAdActivity.class, o.e(), new C0100a());
            } else if (g3.b.DISABLED != y) {
                q7.a(t2Var.c(), t2Var.b(), h3.this);
            } else {
                o.u0().a();
                q7.a(t2Var.c(), t2Var.b(), h3.this);
            }
        }
    }

    public h3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.p3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.p3
    protected com.applovin.impl.sdk.l getSdk() {
        i3 i3Var = this.a;
        if (i3Var != null) {
            return i3Var.h().o();
        }
        return null;
    }

    public void initialize(g3 g3Var) {
        setTitle(g3Var.g());
        i3 i3Var = new i3(g3Var, this);
        this.a = i3Var;
        i3Var.a(new a(g3Var));
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.b = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // com.applovin.impl.p3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.a.k();
            this.a.c();
        }
    }
}
