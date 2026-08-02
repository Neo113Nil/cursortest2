package com.sofascore.results.tv;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.e;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.results.R;
import com.sofascore.results.tv.TVChannelEditorActivity;
import defpackage.af;
import defpackage.duf;
import defpackage.e1d;
import defpackage.ioe;
import defpackage.ke0;
import defpackage.luj;
import defpackage.mqi;
import defpackage.otk;
import defpackage.pri;
import defpackage.q8i;
import defpackage.rri;
import defpackage.sri;
import defpackage.t3k;
import defpackage.tc3;
import defpackage.u3k;
import defpackage.wrf;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/tv/TVChannelEditorActivity;", "Lcom/sofascore/results/base/BaseActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TVChannelEditorActivity extends Hilt_TVChannelEditorActivity {
    public static final /* synthetic */ int N = 0;
    public final otk J;
    public final mqi K;
    public final mqi L;
    public final e1d M = e.f(null);

    public TVChannelEditorActivity() {
        int i = 0;
        int i2 = 1;
        this.J = new otk(duf.a.getOrCreateKotlinClass(u3k.class), new sri(this, i2), new sri(this, i), new sri(this, 2));
        this.K = ypa.b(new pri(this, i));
        this.L = ypa.b(new pri(this, i2));
    }

    public final boolean M(TvChannel tvChannel) {
        Boolean bool;
        u3k P = P();
        tvChannel.getClass();
        if (P.k.size() >= 150) {
            bool = Boolean.FALSE;
        } else {
            if (!P.k.contains(tvChannel)) {
                tvChannel.setSelected(true);
                P.k.add(tvChannel);
                P.l.remove(tvChannel);
                Country country = (Country) P.h.d();
                if (country != null) {
                    if (!P.m.contains(country)) {
                        P.m.add(country);
                    }
                    P.f.c(country.getIso2Alpha(), P.k);
                    bool = Boolean.TRUE;
                }
            }
            bool = null;
        }
        if (!Intrinsics.c(bool, Boolean.FALSE)) {
            return true;
        }
        Calendar calendar = ke0.a;
        ke0.g(this, getString(R.string.max_channels_selected), 0);
        return false;
    }

    public final t3k N() {
        return (t3k) this.L.getValue();
    }

    public final af O() {
        return (af) this.K.getValue();
    }

    public final u3k P() {
        return (u3k) this.J.getValue();
    }

    public final void Q(TvChannel tvChannel) {
        tvChannel.setSelected(false);
        u3k P = P();
        ArrayList arrayList = N().i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((TvChannel) next).getIsSelected()) {
                arrayList2.add(next);
            }
        }
        P.k(tvChannel, arrayList2.isEmpty());
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(O().a);
        this.o = O().b;
        G();
        setTitle(R.string.edit_channels);
        final int i = 0;
        wrf.a(O().c, new Function1(this) { // from class: qri
            public final /* synthetic */ TVChannelEditorActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                TVChannelEditorActivity tVChannelEditorActivity = this.b;
                switch (i2) {
                    case 0:
                        float floatValue = ((Float) obj).floatValue();
                        int i3 = TVChannelEditorActivity.N;
                        tVChannelEditorActivity.O().e.setElevation(floatValue);
                        break;
                    case 1:
                        List list = (List) obj;
                        int i4 = TVChannelEditorActivity.N;
                        list.getClass();
                        Country country = (Country) CollectionsKt.firstOrNull(v9g.G(tVChannelEditorActivity, list));
                        if (country == null) {
                            country = (Country) CollectionsKt.firstOrNull(v9g.G(tVChannelEditorActivity, tVChannelEditorActivity.P().p));
                        }
                        if (country != null) {
                            u3k P = tVChannelEditorActivity.P();
                            P.g.j(country);
                            xw3.L(un0.z(P), null, null, new vki(P, country, null, 22), 3);
                        }
                        break;
                    case 2:
                        ((eoh) tVChannelEditorActivity.M).setValue((Country) obj);
                        break;
                    default:
                        List list2 = (List) obj;
                        int i5 = TVChannelEditorActivity.N;
                        t3k N2 = tVChannelEditorActivity.N();
                        list2.getClass();
                        N2.F(list2);
                        tVChannelEditorActivity.O().c.scrollToPosition(0);
                        break;
                }
                return Unit.a;
            }
        });
        final int i2 = 1;
        O().d.setContent(new tc3(1314952645, new q8i(this, 4), true));
        t3k N2 = N();
        rri rriVar = new rri(this, i);
        N2.getClass();
        N2.a.d = rriVar;
        O().c.setAdapter(N());
        z8e.b0(O().c, this, false, false, null, 30);
        P().o.e(this, new ioe(18, new Function1(this) { // from class: qri
            public final /* synthetic */ TVChannelEditorActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                TVChannelEditorActivity tVChannelEditorActivity = this.b;
                switch (i22) {
                    case 0:
                        float floatValue = ((Float) obj).floatValue();
                        int i3 = TVChannelEditorActivity.N;
                        tVChannelEditorActivity.O().e.setElevation(floatValue);
                        break;
                    case 1:
                        List list = (List) obj;
                        int i4 = TVChannelEditorActivity.N;
                        list.getClass();
                        Country country = (Country) CollectionsKt.firstOrNull(v9g.G(tVChannelEditorActivity, list));
                        if (country == null) {
                            country = (Country) CollectionsKt.firstOrNull(v9g.G(tVChannelEditorActivity, tVChannelEditorActivity.P().p));
                        }
                        if (country != null) {
                            u3k P = tVChannelEditorActivity.P();
                            P.g.j(country);
                            xw3.L(un0.z(P), null, null, new vki(P, country, null, 22), 3);
                        }
                        break;
                    case 2:
                        ((eoh) tVChannelEditorActivity.M).setValue((Country) obj);
                        break;
                    default:
                        List list2 = (List) obj;
                        int i5 = TVChannelEditorActivity.N;
                        t3k N22 = tVChannelEditorActivity.N();
                        list2.getClass();
                        N22.F(list2);
                        tVChannelEditorActivity.O().c.scrollToPosition(0);
                        break;
                }
                return Unit.a;
            }
        }));
        final int i3 = 2;
        P().h.e(this, new ioe(18, new Function1(this) { // from class: qri
            public final /* synthetic */ TVChannelEditorActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i3;
                TVChannelEditorActivity tVChannelEditorActivity = this.b;
                switch (i22) {
                    case 0:
                        float floatValue = ((Float) obj).floatValue();
                        int i32 = TVChannelEditorActivity.N;
                        tVChannelEditorActivity.O().e.setElevation(floatValue);
                        break;
                    case 1:
                        List list = (List) obj;
                        int i4 = TVChannelEditorActivity.N;
                        list.getClass();
                        Country country = (Country) CollectionsKt.firstOrNull(v9g.G(tVChannelEditorActivity, list));
                        if (country == null) {
                            country = (Country) CollectionsKt.firstOrNull(v9g.G(tVChannelEditorActivity, tVChannelEditorActivity.P().p));
                        }
                        if (country != null) {
                            u3k P = tVChannelEditorActivity.P();
                            P.g.j(country);
                            xw3.L(un0.z(P), null, null, new vki(P, country, null, 22), 3);
                        }
                        break;
                    case 2:
                        ((eoh) tVChannelEditorActivity.M).setValue((Country) obj);
                        break;
                    default:
                        List list2 = (List) obj;
                        int i5 = TVChannelEditorActivity.N;
                        t3k N22 = tVChannelEditorActivity.N();
                        list2.getClass();
                        N22.F(list2);
                        tVChannelEditorActivity.O().c.scrollToPosition(0);
                        break;
                }
                return Unit.a;
            }
        }));
        final int i4 = 3;
        P().j.e(this, new ioe(18, new Function1(this) { // from class: qri
            public final /* synthetic */ TVChannelEditorActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i4;
                TVChannelEditorActivity tVChannelEditorActivity = this.b;
                switch (i22) {
                    case 0:
                        float floatValue = ((Float) obj).floatValue();
                        int i32 = TVChannelEditorActivity.N;
                        tVChannelEditorActivity.O().e.setElevation(floatValue);
                        break;
                    case 1:
                        List list = (List) obj;
                        int i42 = TVChannelEditorActivity.N;
                        list.getClass();
                        Country country = (Country) CollectionsKt.firstOrNull(v9g.G(tVChannelEditorActivity, list));
                        if (country == null) {
                            country = (Country) CollectionsKt.firstOrNull(v9g.G(tVChannelEditorActivity, tVChannelEditorActivity.P().p));
                        }
                        if (country != null) {
                            u3k P = tVChannelEditorActivity.P();
                            P.g.j(country);
                            xw3.L(un0.z(P), null, null, new vki(P, country, null, 22), 3);
                        }
                        break;
                    case 2:
                        ((eoh) tVChannelEditorActivity.M).setValue((Country) obj);
                        break;
                    default:
                        List list2 = (List) obj;
                        int i5 = TVChannelEditorActivity.N;
                        t3k N22 = tVChannelEditorActivity.N();
                        list2.getClass();
                        N22.F(list2);
                        tVChannelEditorActivity.O().c.scrollToPosition(0);
                        break;
                }
                return Unit.a;
            }
        }));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.channel_editor_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.select_all) {
            Iterator it = N().i.iterator();
            while (it.hasNext()) {
                TvChannel tvChannel = (TvChannel) it.next();
                if (!M(tvChannel)) {
                    return true;
                }
                N().w(tvChannel);
            }
            return true;
        }
        if (itemId != R.id.remove_all) {
            return super.onOptionsItemSelected(menuItem);
        }
        Iterator it2 = N().i.iterator();
        while (it2.hasNext()) {
            TvChannel tvChannel2 = (TvChannel) it2.next();
            Q(tvChannel2);
            N().w(tvChannel2);
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        u3k P = P();
        xw3.L(P.h(), null, null, new luj(P, null, 4), 3);
        super.onStop();
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "EditTvChannelsScreen";
    }
}
