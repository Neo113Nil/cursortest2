package com.vk.settings.impl.presentation.base.fragment.settings;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.im.notification.settings.MessengerNotificationSettingsComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.pushes.PushComponent;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bk70;
import xsna.e550;
import xsna.f4z;
import xsna.fpf0;
import xsna.hg70;
import xsna.hlu0;
import xsna.iia0;
import xsna.j630;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.mlf0;
import xsna.msn;
import xsna.msy;
import xsna.nf3;
import xsna.nlf0;
import xsna.or50;
import xsna.q69;
import xsna.qcy;
import xsna.qlf0;
import xsna.rf70;
import xsna.rka0;
import xsna.th70;
import xsna.uh70;
import xsna.vk50;
import xsna.w8i;

/* compiled from: RedesignNotificationSettingsFragment.kt */
/* loaded from: classes11.dex */
public class RedesignNotificationSettingsFragment extends MviImplFragment<hg70, uh70, rf70> implements w8i {
    public static final a Y;
    public static final /* synthetic */ qcy<Object>[] Z;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final nf3 U;
    public final qlf0 V;
    public final j630 W;
    public final nlf0 X;

    /* compiled from: RedesignNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static void a(Bundle bundle) {
            bundle.putBoolean("show_dnd_arg_key", true);
        }

        public static boolean b(Bundle bundle) {
            return bundle.getBoolean("show_dnd_arg_key", false);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(RedesignNotificationSettingsFragment.class, "contentView", "getContentView()Lcom/vk/settings/impl/presentation/base/mvi/settings/NotificationSettingsView;", 0);
        fpf0.a.getClass();
        Z = new qcy[]{mutablePropertyReference1Impl};
        Y = new a();
    }

    public RedesignNotificationSettingsFragment() {
        e550 e550Var = new e550(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, e550Var);
        this.R = msy.a(lazyThreadSafetyMode, new mlf0(this, 0));
        this.S = msy.a(lazyThreadSafetyMode, new rka0(this, 11));
        this.T = msy.a(lazyThreadSafetyMode, new iia0(this, 15));
        this.U = new nf3();
        this.V = new qlf0();
        this.W = new j630(this, 13);
        this.X = new nlf0(this, 0);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        th70 th70Var = new th70(getFeature().U(), getViewLifecycleOwner(), requireContext());
        qcy<Object> qcyVar = Z[0];
        nf3 nf3Var = this.U;
        nf3Var.c = th70Var;
        return new mk50.c(((th70) nf3Var.getValue(this, qcyVar)).getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((th70) this.U.getValue(this, Z[0])).f((uh70) ao50Var, new q69(this));
        ((f4z) getFeature().V()).a(new or50(this, 16), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (((String) this.R.getValue()) != null) {
            return false;
        }
        kn().getOnBackPressedDispatcher().d();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (((String) this.R.getValue()) != null) {
            kn().getSupportFragmentManager().f("notification_setting_status_change");
            return;
        }
        FragmentManager supportFragmentManager = kn().getSupportFragmentManager();
        supportFragmentManager.f("notification_setting_status_change");
        supportFragmentManager.f("UPDATE_SETTING_FROM_SECTION_KEY");
        supportFragmentManager.f("notification_section_status_change");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        hlu0 experiments = ((VkClientMultiAccountComponent) ((k7m) m7m.f(this)).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
        msn msnVar = (msn) this.Q.getValue();
        Y.getClass();
        boolean b = a.b(bundle);
        ?? r8 = this.R;
        return new hg70(experiments, msnVar, b, ((String) r8.getValue()) != null ? new bk70((String) r8.getValue(), (String) this.S.getValue(), (NotificationsNotificationSettingsSectionRedesignDto) this.T.getValue()) : null, ((PushComponent) ((k7m) m7m.f(this)).a(fpf0.a(PushComponent.class))).sc(), ((MessengerNotificationSettingsComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MessengerNotificationSettingsComponent.class))).b());
    }
}
