package com.sofascore.results.stagesport;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.c2i;
import defpackage.d2i;
import defpackage.duf;
import defpackage.e2i;
import defpackage.eqb;
import defpackage.g8i;
import defpackage.gz8;
import defpackage.h8i;
import defpackage.imf;
import defpackage.m2i;
import defpackage.mqi;
import defpackage.mz1;
import defpackage.otk;
import defpackage.qfg;
import defpackage.rq3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/StageConstructorActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "dff", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageConstructorActivity extends CollapsibleToolbarActivity {
    public static final /* synthetic */ int R = 0;
    public final otk L;
    public final mqi M;
    public Function0 N;
    public m2i O;
    public boolean P;
    public NotificationsActionButton Q;

    public StageConstructorActivity() {
        int i = 0;
        int i2 = 1;
        this.L = new otk(duf.a.getOrCreateKotlinClass(h8i.class), new e2i(this, i2), new e2i(this, i), new e2i(this, 2));
        this.M = ypa.b(new c2i(this, i));
        this.N = new c2i(this, i2);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        h8i X = X();
        xw3.L(un0.z(X), null, null, new g8i(X, null), 3);
    }

    public final h8i X() {
        return (h8i) this.L.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x.a = Integer.valueOf(X().g);
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().g;
        Q().l.setOnRefreshListener(new imf(this, 12));
        rq3 rq3Var = null;
        I(Q().b, null);
        Bundle extras = getIntent().getExtras();
        this.O = extras != null ? (m2i) gz8.M(extras, "INITIAL_TAB", m2i.class) : null;
        z8e.x(this, X().s, new d2i(this, rq3Var, 0));
        z8e.x(this, X().t, new d2i(this, rq3Var, 1));
        X().k.e(this, new eqb(25, new qfg(this, 29)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_driver_menu, menu);
        View actionView = menu.findItem(R.id.add_to_favorites).getActionView();
        this.Q = actionView != null ? (NotificationsActionButton) actionView.findViewById(R.id.notifications_button) : null;
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        NotificationsActionButton notificationsActionButton;
        menu.getClass();
        Team l = X().l();
        if (l != null && (notificationsActionButton = this.Q) != null) {
            notificationsActionButton.i(l, (FavoritesEventsData) X().t.a.getValue(), true);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "ConstructorScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(X().g, super.y(), " id:");
    }
}
