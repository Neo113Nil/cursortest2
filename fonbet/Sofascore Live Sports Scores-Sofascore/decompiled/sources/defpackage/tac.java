package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tac extends wb0 {
    public final pbc g;
    public final aac h;
    public final Context i;
    public ibc j;
    public ArrayList k;
    public sac l;
    public RecyclerView m;
    public boolean n;
    public obc o;
    public final long p;
    public long q;
    public final gl0 r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tac(Context context) {
        super(r3, r0 == 0 ? hda.F(r3) : r0);
        ContextThemeWrapper u = hda.u(context, false);
        int I = hda.I(R.attr.mediaRouteTheme, u);
        this.j = ibc.c;
        this.r = new gl0(this, 8);
        Context context2 = getContext();
        this.g = pbc.d(context2);
        this.h = new aac(this, 3);
        this.i = context2;
        this.p = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void f() {
        if (this.o == null && this.n) {
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
                if (obcVar.d() || !obcVar.g || !obcVar.h(this.j)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, qe8.f);
            long uptimeMillis = SystemClock.uptimeMillis() - this.q;
            long j = this.p;
            if (uptimeMillis < j) {
                gl0 gl0Var = this.r;
                gl0Var.removeMessages(1);
                gl0Var.sendMessageAtTime(gl0Var.obtainMessage(1, arrayList), this.q + j);
            } else {
                this.q = SystemClock.uptimeMillis();
                this.k.clear();
                this.k.addAll(arrayList);
                this.l.o();
            }
        }
    }

    public final void g(ibc ibcVar) {
        if (ibcVar == null) {
            a70.p("selector must not be null");
            return;
        }
        if (this.j.equals(ibcVar)) {
            return;
        }
        this.j = ibcVar;
        if (this.n) {
            pbc pbcVar = this.g;
            aac aacVar = this.h;
            pbcVar.h(aacVar);
            pbcVar.a(ibcVar, aacVar, 1);
        }
        f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        this.g.a(this.j, this.h, 1);
        f();
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.i;
        decorView.setBackgroundColor(context.getColor(hda.J(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.k = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new cb(this, 4));
        this.l = new sac(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.m = recyclerView;
        recyclerView.setAdapter(this.l);
        this.m.setLayoutManager(new LinearLayoutManager());
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : wca.y(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        this.g.h(this.h);
        this.r.removeMessages(1);
    }
}
