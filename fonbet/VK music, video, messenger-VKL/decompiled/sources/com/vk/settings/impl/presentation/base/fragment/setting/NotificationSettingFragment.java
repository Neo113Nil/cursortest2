package com.vk.settings.impl.presentation.base.fragment.setting;

import android.os.Bundle;
import android.view.View;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.anm0;
import xsna.ao50;
import xsna.bpn0;
import xsna.cty;
import xsna.epx;
import xsna.f4z;
import xsna.fpf0;
import xsna.km50;
import xsna.le70;
import xsna.m7m;
import xsna.mf70;
import xsna.mgz;
import xsna.mk50;
import xsna.msy;
import xsna.n7w;
import xsna.nf3;
import xsna.nf70;
import xsna.p870;
import xsna.qcy;
import xsna.qe70;
import xsna.re70;
import xsna.t2l;
import xsna.vk50;
import xsna.wp40;
import xsna.xsw;

/* compiled from: NotificationSettingFragment.kt */
/* loaded from: classes11.dex */
public class NotificationSettingFragment extends MviImplFragment<qe70, nf70, le70> {
    public static final /* synthetic */ qcy<Object>[] W;
    public final bpn0 Q = new bpn0(new wp40(this, 5));
    public final bpn0 R = new bpn0(new t2l(this, 29));
    public final Object S;
    public final Object T;
    public final Object U;
    public final nf3 V;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(NotificationSettingFragment.class, "contentView", "getContentView()Lcom/vk/settings/impl/presentation/base/mvi/setting/NotificationSettingView;", 0);
        fpf0.a.getClass();
        W = new qcy[]{mutablePropertyReference1Impl};
    }

    public NotificationSettingFragment() {
        cty ctyVar = new cty(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, ctyVar);
        this.T = msy.a(lazyThreadSafetyMode, new n7w(this, 16));
        this.U = msy.a(lazyThreadSafetyMode, new xsw(this, 17));
        this.V = new nf3();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        mf70 mf70Var = new mf70(getFeature().V(), getViewLifecycleOwner(), requireContext());
        qcy<Object> qcyVar = W[0];
        nf3 nf3Var = this.V;
        nf3Var.c = mf70Var;
        return new mk50.c(((mf70) nf3Var.getValue(this, qcyVar)).getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((mf70) this.V.getValue(this, W[0])).f((nf70) ao50Var, new re70(getFeature()));
        ((f4z) getFeature().W()).a(new mgz(this, 15), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(le70.d.b);
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new qe70((p870) this.R.getValue(), (anm0) this.Q.getValue(), ((AttachmentMappersComponent) m7m.d(this).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3(), (String) this.S.getValue(), (String) this.T.getValue(), (NotificationsNotificationSettingRedesignDto) this.U.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        ?? r0 = this.S;
        if (epx.f((String) r0.getValue(), "new_stories") || epx.f((String) r0.getValue(), "new_posts")) {
            return;
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.SETTINGS, null, null, null, (String) r0.getValue(), null, 46, null);
    }
}
