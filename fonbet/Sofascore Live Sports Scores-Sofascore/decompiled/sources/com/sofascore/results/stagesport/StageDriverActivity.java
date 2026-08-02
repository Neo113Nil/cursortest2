package com.sofascore.results.stagesport;

import android.app.assist.AssistContent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import defpackage.b5i;
import defpackage.duf;
import defpackage.e8i;
import defpackage.eqb;
import defpackage.g2i;
import defpackage.g8i;
import defpackage.gz8;
import defpackage.h8i;
import defpackage.imf;
import defpackage.mqi;
import defpackage.mz1;
import defpackage.otk;
import defpackage.q4i;
import defpackage.r4i;
import defpackage.s4i;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.z8e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/StageDriverActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "pff", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageDriverActivity extends CollapsibleToolbarActivity {
    public static final /* synthetic */ int R = 0;
    public final otk L;
    public final mqi M;
    public Function0 N;
    public b5i O;
    public boolean P;
    public NotificationsActionButton Q;

    public StageDriverActivity() {
        int i = 0;
        int i2 = 1;
        this.L = new otk(duf.a.getOrCreateKotlinClass(h8i.class), new s4i(this, i2), new s4i(this, i), new s4i(this, 2));
        this.M = ypa.b(new q4i(this, i));
        this.N = new q4i(this, i2);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        h8i X = X();
        xw3.L(un0.z(X), null, null, new g8i(X, null), 3);
    }

    public final h8i X() {
        return (h8i) this.L.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x.a = Integer.valueOf(X().g);
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().g;
        Q().l.setOnRefreshListener(new imf(this, 13));
        I(Q().b, null);
        z8e.x(this, X().s, new r4i(this, 0 == true ? 1 : 0, 0));
        z8e.w(this, X().t, new r4i(this, 0 == true ? 1 : 0, 1));
        Bundle extras = getIntent().getExtras();
        this.O = extras != null ? (b5i) gz8.M(extras, "INITIAL_TAB", b5i.class) : null;
        X().k.e(this, new eqb(27, new g2i(this, 3)));
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
        e8i e8iVar = (e8i) X().k.d();
        Team team = e8iVar != null ? e8iVar.a : null;
        if (team != null && (notificationsActionButton = this.Q) != null) {
            notificationsActionButton.i(team, (FavoritesEventsData) X().t.a.getValue(), true);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        Team team;
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        e8i e8iVar = (e8i) X().k.d();
        if (e8iVar == null || (team = e8iVar.a) == null) {
            return;
        }
        assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), team.getWebUrl(), ""}, 3))));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "StageDriverScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(X().g, super.y(), " id:");
    }
}
