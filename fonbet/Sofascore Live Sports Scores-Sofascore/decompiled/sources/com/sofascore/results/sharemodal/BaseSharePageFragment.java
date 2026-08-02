package com.sofascore.results.sharemodal;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.bdh;
import defpackage.g7;
import defpackage.hcb;
import defpackage.joa;
import defpackage.krk;
import defpackage.l61;
import defpackage.ldh;
import defpackage.nq8;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z0;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/sharemodal/BaseSharePageFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lbdh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseSharePageFragment extends AbstractFragment<bdh> {
    public final joa m = ypa.a(ysa.c, new z0(this, 25));

    public abstract void A();

    public abstract g7 B();

    public abstract String C();

    public abstract void D();

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.share_match_multipage_item, (ViewGroup) null, false);
        int i = R.id.content;
        if (((CardView) nq8.B(R.id.content, inflate)) != null) {
            i = R.id.gradient_overlay;
            View B = nq8.B(R.id.gradient_overlay, inflate);
            if (B != null) {
                i = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                if (recyclerView != null) {
                    return new bdh((FrameLayout) inflate, B, recyclerView);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public String p() {
        return "";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        View requireView;
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((bdh) krkVar).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((bdh) krkVar2).c.setNestedScrollingEnabled(false);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((bdh) krkVar3).c.setAdapter(B());
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (requireView = parentFragment.requireView()) != null) {
            krk krkVar4 = this.l;
            krkVar4.getClass();
            RecyclerView recyclerView2 = ((bdh) krkVar4).c;
            recyclerView2.setOnTouchListener(new ldh(requireView, false));
            recyclerView2.addOnItemTouchListener(new l61());
        }
        A();
        D();
        g7 B = B();
        LayoutInflater layoutInflater = getLayoutInflater();
        krk krkVar5 = this.l;
        krkVar5.getClass();
        g7.o(B, (ImageView) hcb.b(layoutInflater, ((bdh) krkVar5).a).b, 6);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final boolean w() {
        return false;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
