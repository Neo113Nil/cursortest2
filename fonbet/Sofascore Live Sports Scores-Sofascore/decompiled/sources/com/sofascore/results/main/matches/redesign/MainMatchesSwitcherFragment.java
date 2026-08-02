package com.sofascore.results.main.matches.redesign;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import defpackage.duf;
import defpackage.eqb;
import defpackage.fqb;
import defpackage.ida;
import defpackage.k03;
import defpackage.krk;
import defpackage.nq8;
import defpackage.otk;
import defpackage.uo8;
import defpackage.uxb;
import defpackage.wrf;
import defpackage.yhk;
import defpackage.zqb;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/MainMatchesSwitcherFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Luo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainMatchesSwitcherFragment extends Hilt_MainMatchesSwitcherFragment<uo8> {
    public final otk r = new otk(duf.a.getOrCreateKotlinClass(zqb.class), new fqb(this, 0), new fqb(this, 2), new fqb(this, 1));

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_main_switch, (ViewGroup) null, false);
        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
        if (viewPager2 != null) {
            return new uo8((FrameLayout) inflate, viewPager2);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.view_pager)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        ViewPager2 viewPager2 = ((uo8) krkVar).b;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ViewPager2 viewPager22 = ((uo8) krkVar2).b;
        uxb uxbVar = new uxb(this);
        wrf.d(viewPager22, 1);
        viewPager22.setPageTransformer(new k03());
        viewPager2.setAdapter(uxbVar);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        int i = 0;
        ((uo8) krkVar3).b.setUserInputEnabled(false);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ViewPager2 viewPager23 = ((uo8) krkVar4).b;
        otk otkVar = this.r;
        String str = (String) ((zqb) otkVar.getValue()).u.d();
        viewPager23.c((str != null && str.hashCode() == 402433684 && str.equals("competitions")) ? 1 : 0, false);
        ((zqb) otkVar.getValue()).u.e(getViewLifecycleOwner(), new eqb(i, new ida(this, 20)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
