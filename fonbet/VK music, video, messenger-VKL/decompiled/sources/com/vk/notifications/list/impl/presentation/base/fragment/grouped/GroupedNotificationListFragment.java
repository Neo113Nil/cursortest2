package com.vk.notifications.list.impl.presentation.base.fragment.grouped;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.cou;
import xsna.cqf;
import xsna.cvs;
import xsna.eou;
import xsna.f4z;
import xsna.fou;
import xsna.fpf0;
import xsna.gbh;
import xsna.gnu;
import xsna.km50;
import xsna.m2j;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.n1;
import xsna.oz50;
import xsna.pbe;
import xsna.qbj;
import xsna.qzg;
import xsna.tvj;
import xsna.vb70;
import xsna.vk50;
import xsna.vmu;
import xsna.vnu;
import xsna.wj50;
import xsna.xn50;

/* compiled from: GroupedNotificationListFragment.kt */
/* loaded from: classes.dex */
public final class GroupedNotificationListFragment extends MviImplFragment<gnu, eou, vmu> {
    public static final /* synthetic */ int Y = 0;
    public cou Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;

    /* compiled from: GroupedNotificationListFragment.kt */
    /* loaded from: classes4.dex */
    public static class a extends oz50 {
        public a() {
            super(GroupedNotificationListFragment.class, null, null);
        }
    }

    public GroupedNotificationListFragment() {
        n1 n1Var = new n1(18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, n1Var);
        int i = 15;
        this.S = msy.a(lazyThreadSafetyMode, new m2j(this, i));
        this.T = msy.a(lazyThreadSafetyMode, new qbj(this, i));
        this.U = msy.a(lazyThreadSafetyMode, new tvj(this, 12));
        this.V = msy.a(lazyThreadSafetyMode, new qzg(this, 22));
        this.W = msy.a(lazyThreadSafetyMode, new cvs(this, 2));
        this.X = msy.a(lazyThreadSafetyMode, new gbh(this, 21));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        cou couVar = new cou(requireContext(), getViewLifecycleOwner());
        this.Q = couVar;
        return new mk50.c(couVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        eou eouVar = (eou) ao50Var;
        cou couVar = this.Q;
        if (couVar != null) {
            couVar.f(eouVar, new pbe(getFeature()));
        }
        wj50<vnu> V = getFeature().V();
        f4z f4zVar = (f4z) V;
        f4zVar.a(new cqf(this, 24), getViewLifecycleOwner());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            finish();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        xn50.a.c(this, vmu.d.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        fou bVar;
        vb70 vb70Var = new vb70(((AttachmentMappersComponent) m7m.d(this).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3());
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("query") : null;
        if (string == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        Long valueOf = arguments2 != null ? Long.valueOf(arguments2.getLong("group_id", 0L)) : null;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("group_name") : null;
        if (valueOf == null || valueOf.longValue() == 0) {
            bVar = new fou.b(string);
        } else {
            long longValue = valueOf.longValue();
            if (string2 == null) {
                string2 = getString(R.string.not_notifications);
            }
            bVar = new fou.a(longValue, string2);
        }
        return new gnu(vb70Var, bVar);
    }
}
