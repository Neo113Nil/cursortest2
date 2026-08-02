package com.sofascore.results.transfers;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a5f;
import defpackage.am8;
import defpackage.av8;
import defpackage.bga;
import defpackage.bkh;
import defpackage.duf;
import defpackage.dvj;
import defpackage.eqb;
import defpackage.eqf;
import defpackage.f6a;
import defpackage.fxe;
import defpackage.g7;
import defpackage.gxe;
import defpackage.hxe;
import defpackage.ixe;
import defpackage.jdd;
import defpackage.kq9;
import defpackage.l98;
import defpackage.mme;
import defpackage.mqi;
import defpackage.of3;
import defpackage.otk;
import defpackage.ovj;
import defpackage.p2g;
import defpackage.pte;
import defpackage.pvj;
import defpackage.rvj;
import defpackage.s38;
import defpackage.s6a;
import defpackage.sub;
import defpackage.u2g;
import defpackage.uic;
import defpackage.utc;
import defpackage.uvj;
import defpackage.vga;
import defpackage.w2g;
import defpackage.ye;
import defpackage.ypa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/transfers/PlayerTransfersActivity;", "Lcom/sofascore/results/base/BaseActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerTransfersActivity extends BaseActivity {
    public static final /* synthetic */ int R = 0;
    public final mqi I = ypa.b(new fxe(this, 0));
    public final otk J = new otk(duf.a.getOrCreateKotlinClass(uvj.class), new ixe(this, 1), new ixe(this, 0), new ixe(this, 2));
    public final mqi K = ypa.b(new fxe(this, 1));
    public final mqi L = ypa.b(new fxe(this, 2));
    public final mqi M = ypa.b(new fxe(this, 3));
    public final mqi N = ypa.b(new fxe(this, 4));
    public final mqi O = ypa.b(new fxe(this, 5));
    public final mqi P = ypa.b(new fxe(this, 6));
    public final mqi Q = ypa.b(new fxe(this, 7));

    public final void M(long j, boolean z, of3 of3Var, int i) {
        int i2;
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-506072157);
        if ((i & 6) == 0) {
            i2 = (av8Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            j2 = j;
            kq9.b(s6a.N(R.drawable.ic_arrow_drop_down, 6, av8Var), null, f6a.D(bkh.l(utc.a, 16.0f), 1.0f, z ? 1.0f : -1.0f), j2, av8Var, ((i2 << 9) & 7168) | 48, 0);
        } else {
            j2 = j;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gxe(this, j2, z, i);
        }
    }

    public final ye N() {
        return (ye) this.I.getValue();
    }

    public final rvj O() {
        return (rvj) this.M.getValue();
    }

    public final uvj P() {
        return (uvj) this.J.getValue();
    }

    public final void Q(PlayerTransferFilterData playerTransferFilterData) {
        O().s();
        uvj P = P();
        P.g = playerTransferFilterData;
        P.e = true;
        P.d = 0;
        P.f(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [u2g] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object] */
    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PlayerTransferFilterData u2gVar;
        super.onCreate(bundle);
        setContentView(N().a);
        this.o = N().c;
        I(N().b, sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL)));
        G();
        setTitle(R.string.player_transfers);
        RecyclerView recyclerView = N().d;
        Context context = recyclerView.getContext();
        context.getClass();
        z8e.b0(recyclerView, context, false, false, null, 30);
        recyclerView.setAdapter(O());
        recyclerView.addOnScrollListener(new hxe(this));
        uvj P = P();
        ovj ovjVar = (ovj) this.K.getValue();
        ovjVar.getClass();
        P.h = ovjVar;
        rvj O = O();
        pvj pvjVar = P().g().b;
        O.getClass();
        pvjVar.getClass();
        O.n = pvjVar;
        O.s();
        r7.p(O().g.size(), (dvj) this.N.getValue());
        r7.p(O().g.size(), (TypeHeaderView) this.O.getValue());
        rvj O2 = O();
        LinearLayout linearLayout = ((am8) this.P.getValue()).a;
        linearLayout.getClass();
        g7.o(O2, linearLayout, 6);
        g7.o(O(), ((jdd) this.Q.getValue()).a, 6);
        rvj O3 = O();
        pte pteVar = new pte(this, 2);
        O3.getClass();
        O3.a.d = pteVar;
        P().n = new fxe(this, 8);
        P().l.e(this, new eqb(14, new mme(this, 4)));
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        PlayerTransferFilterData playerTransferFilterData = null;
        String string = sharedPreferences.getString("PREF_TRANSFER_FILTER_DATA", null);
        if (string != null) {
            bga bgaVar = vga.a;
            if (string.length() != 0) {
                try {
                    p2g p2gVar = w2g.b;
                    bgaVar.getClass();
                    u2gVar = bgaVar.b(l98.W(PlayerTransferFilterData.INSTANCE.serializer()), string);
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                Throwable a = w2g.a(u2gVar);
                if (a != null) {
                    s38.a().c(a);
                }
                if (!(u2gVar instanceof u2g)) {
                    playerTransferFilterData = u2gVar;
                }
            }
            playerTransferFilterData = playerTransferFilterData;
        }
        if (playerTransferFilterData != null) {
            ((dvj) this.N.getValue()).setFilters(playerTransferFilterData);
        }
        Q(playerTransferFilterData);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "PlayerTransfersScreen";
    }
}
