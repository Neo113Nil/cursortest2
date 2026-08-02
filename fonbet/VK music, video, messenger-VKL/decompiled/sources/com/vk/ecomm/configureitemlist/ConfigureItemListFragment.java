package com.vk.ecomm.configureitemlist;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.vk.ecomm.configureitemlist.api.model.ConfigureItem;
import com.vk.mvi.androidx.MviImplFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.a0j;
import xsna.ao50;
import xsna.dkg;
import xsna.e0j;
import xsna.f4z;
import xsna.foi;
import xsna.ies;
import xsna.izi;
import xsna.j5g;
import xsna.km50;
import xsna.lzi;
import xsna.mk50;
import xsna.msy;
import xsna.oz50;
import xsna.uzi;
import xsna.vds;
import xsna.vk50;
import xsna.wg1;
import xsna.xn50;

/* compiled from: ConfigureItemListFragment.kt */
/* loaded from: classes.dex */
public final class ConfigureItemListFragment extends MviImplFragment<uzi, e0j, izi> implements ies, vds {
    public static final /* synthetic */ int S = 0;
    public lzi Q;
    public final Object R = msy.a(LazyThreadSafetyMode.NONE, new foi(this, 1));

    /* compiled from: ConfigureItemListFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        lzi lziVar = new lzi(this, requireContext());
        this.Q = lziVar;
        return new mk50.c(lziVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        e0j e0jVar = (e0j) ao50Var;
        lzi lziVar = this.Q;
        if (lziVar == null) {
            lziVar = null;
        }
        lziVar.f(e0jVar, new wg1(this));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((f4z) ((uzi) vk50Var).U()).a(new dkg(this, 7), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, izi.d.b);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        List list;
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("extra_item_list", ConfigureItem.class) : arguments.getParcelableArrayList("extra_item_list");
            if (parcelableArrayList != null) {
                list = j5g.O0(parcelableArrayList);
            }
        }
        list = EmptyList.b;
        return new uzi(list, new a0j());
    }
}
