package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.internal.d;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dac extends wb0 {
    public final pbc g;
    public final aac h;
    public ibc i;
    public ArrayList j;
    public TextView k;
    public TextView l;
    public RelativeLayout m;
    public TextView n;
    public TextView o;
    public LinearLayout p;
    public Button q;
    public ProgressBar r;
    public ListView s;
    public cac t;
    public final d u;
    public boolean v;
    public long w;
    public final gl0 x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dac(Context context) {
        super(r2, r0 == 0 ? hda.F(r2) : r0);
        ContextThemeWrapper u = hda.u(context, false);
        int I = hda.I(R.attr.mediaRouteTheme, u);
        this.i = ibc.c;
        this.x = new gl0(this, 7);
        this.g = pbc.d(getContext());
        this.h = new aac(this, 1);
        this.u = new d(this, 4);
    }

    @Override // defpackage.wb0, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.u);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void f(List list) {
        this.w = SystemClock.uptimeMillis();
        this.j.clear();
        this.j.addAll(list);
        this.t.notifyDataSetChanged();
        gl0 gl0Var = this.x;
        gl0Var.removeMessages(3);
        gl0Var.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            gl0Var.sendMessageDelayed(gl0Var.obtainMessage(2), 5000L);
        }
    }

    public final void g() {
        if (this.v) {
            this.g.getClass();
            pbc.b();
            ArrayList arrayList = new ArrayList(pbc.c().i);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                obc obcVar = (obc) arrayList.get(i);
                if (obcVar.d() || !obcVar.g || !obcVar.h(this.i)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, qe8.e);
            if (SystemClock.uptimeMillis() - this.w >= 300) {
                f(arrayList);
                return;
            }
            gl0 gl0Var = this.x;
            gl0Var.removeMessages(1);
            gl0Var.sendMessageAtTime(gl0Var.obtainMessage(1, arrayList), this.w + 300);
        }
    }

    public final void h(ibc ibcVar) {
        if (ibcVar == null) {
            a70.p("selector must not be null");
            return;
        }
        if (this.i.equals(ibcVar)) {
            return;
        }
        this.i = ibcVar;
        if (this.v) {
            pbc pbcVar = this.g;
            aac aacVar = this.h;
            pbcVar.h(aacVar);
            pbcVar.a(ibcVar, aacVar, 1);
        }
        g();
    }

    public final void i(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.s.setVisibility(8);
            this.l.setVisibility(0);
            this.r.setVisibility(0);
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            this.o.setVisibility(8);
            this.m.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.s.setVisibility(0);
            this.l.setVisibility(8);
            this.r.setVisibility(8);
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            this.o.setVisibility(8);
            this.m.setVisibility(8);
            return;
        }
        if (i == 2) {
            setTitle(R.string.mr_chooser_title);
            this.s.setVisibility(8);
            this.l.setVisibility(8);
            this.r.setVisibility(0);
            this.p.setVisibility(8);
            this.q.setVisibility(8);
            this.o.setVisibility(4);
            this.m.setVisibility(0);
            return;
        }
        if (i != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.s.setVisibility(8);
        this.l.setVisibility(8);
        this.r.setVisibility(8);
        this.p.setVisibility(0);
        this.q.setVisibility(0);
        this.o.setVisibility(0);
        this.m.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
        this.g.a(this.i, this.h, 1);
        g();
        gl0 gl0Var = this.x;
        gl0Var.removeMessages(2);
        gl0Var.removeMessages(3);
        gl0Var.removeMessages(1);
        gl0Var.sendMessageDelayed(gl0Var.obtainMessage(2), 5000L);
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.j = new ArrayList();
        this.t = new cac(getContext(), this.j);
        this.k = (TextView) findViewById(R.id.mr_chooser_title);
        this.l = (TextView) findViewById(R.id.mr_chooser_searching);
        this.m = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.n = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.o = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.p = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.q = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.r = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        Boolean bool = pd0.n;
        boolean z2 = false;
        if (bool == null) {
            if (!pd0.D(context)) {
                PackageManager packageManager = context.getPackageManager();
                Boolean bool2 = pd0.r;
                if (bool2 == null) {
                    bool2 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    pd0.r = bool2;
                }
                if (!bool2.booleanValue()) {
                    PackageManager packageManager2 = context.getPackageManager();
                    Boolean bool3 = pd0.s;
                    if (bool3 == null) {
                        bool3 = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.automotive"));
                        pd0.s = bool3;
                    }
                    if (!bool3.booleanValue() && !pd0.E(context)) {
                        z = true;
                        bool = Boolean.valueOf(z);
                        pd0.n = bool;
                    }
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
            pd0.n = bool;
        }
        if (!bool.booleanValue()) {
            Boolean bool4 = pd0.p;
            if (bool4 == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                bool4 = Boolean.valueOf(z2);
                pd0.p = bool4;
            }
            if (!bool4.booleanValue()) {
                if (pd0.D(context) || pd0.C(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (pd0.E(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager3 = context.getPackageManager();
                    Boolean bool5 = pd0.r;
                    if (bool5 == null) {
                        bool5 = Boolean.valueOf(packageManager3.hasSystemFeature("android.hardware.type.watch"));
                        pd0.r = bool5;
                    }
                    if (bool5.booleanValue()) {
                        string = context.getString(R.string.mr_chooser_wifi_warning_description_watch);
                    } else {
                        PackageManager packageManager4 = context.getPackageManager();
                        Boolean bool6 = pd0.s;
                        if (bool6 == null) {
                            bool6 = Boolean.valueOf(packageManager4.hasSystemFeature("android.hardware.type.automotive"));
                            pd0.s = bool6;
                        }
                        string = bool6.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                    }
                }
                this.n.setText(string);
                this.o.setMovementMethod(LinkMovementMethod.getInstance());
                this.q.setOnClickListener(new cd5(this, 18));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.s = listView;
                listView.setAdapter((ListAdapter) this.t);
                this.s.setOnItemClickListener(this.t);
                this.s.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(wca.y(getContext()), -2);
                getContext().registerReceiver(this.u, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.n.setText(string);
        this.o.setMovementMethod(LinkMovementMethod.getInstance());
        this.q.setOnClickListener(new cd5(this, 18));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.s = listView2;
        listView2.setAdapter((ListAdapter) this.t);
        this.s.setOnItemClickListener(this.t);
        this.s.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(wca.y(getContext()), -2);
        getContext().registerReceiver(this.u, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.v = false;
        this.g.h(this.h);
        gl0 gl0Var = this.x;
        gl0Var.removeMessages(1);
        gl0Var.removeMessages(2);
        gl0Var.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.wb0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    @Override // defpackage.wb0, android.app.Dialog
    public final void setTitle(int i) {
        this.k.setText(i);
    }
}
