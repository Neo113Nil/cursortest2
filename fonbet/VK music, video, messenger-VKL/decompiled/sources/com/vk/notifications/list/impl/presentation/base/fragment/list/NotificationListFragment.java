package com.vk.notifications.list.impl.presentation.base.fragment.list;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.network.kbh.state.NetworkState;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.toggle.d;
import com.vk.toggle.data.BannerScheduleLocation;
import com.vk.toggle.data.Repeat;
import core.NotificationBannerScheduleRepeat;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ad70;
import xsna.aj50;
import xsna.ao50;
import xsna.bc70;
import xsna.cvs;
import xsna.d6q0;
import xsna.dw20;
import xsna.efs;
import xsna.f4z;
import xsna.fpf0;
import xsna.fr20;
import xsna.gb70;
import xsna.ie70;
import xsna.k7z;
import xsna.km50;
import xsna.l26;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.nc70;
import xsna.oa70;
import xsna.ow90;
import xsna.q560;
import xsna.rzp0;
import xsna.so40;
import xsna.v100;
import xsna.va70;
import xsna.vb70;
import xsna.vk50;
import xsna.w100;
import xsna.wa70;
import xsna.wj50;
import xsna.wl50;
import xsna.xn50;
import xsna.z260;

/* compiled from: NotificationListFragment.kt */
/* loaded from: classes.dex */
public final class NotificationListFragment extends MviImplFragment<wl50, ad70, oa70> {
    public static final /* synthetic */ int a0 = 0;
    public nc70 Q;
    public dw20 R;
    public boolean S = true;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* compiled from: NotificationListFragment.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Repeat.values().length];
            try {
                iArr[Repeat.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Repeat.REPEAT_LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Repeat.CYCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: NotificationListFragment.kt */
    /* loaded from: classes4.dex */
    public static final class b implements q560 {
        public b() {
        }

        @Override // xsna.q560
        public final void a(NetworkState networkState) {
            dw20 dw20Var;
            if (networkState != NetworkState.UNSTABLE || (dw20Var = NotificationListFragment.this.R) == null) {
                return;
            }
            dw20Var.hide();
        }
    }

    public NotificationListFragment() {
        so40 so40Var = new so40(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, so40Var);
        this.U = msy.a(lazyThreadSafetyMode, new k7z(this, 12));
        this.V = msy.a(lazyThreadSafetyMode, new cvs(this, 29));
        int i = 13;
        this.W = msy.a(lazyThreadSafetyMode, new v100(this, i));
        this.X = msy.a(lazyThreadSafetyMode, new fr20(this, 8));
        this.Y = msy.a(lazyThreadSafetyMode, new z260(this, 4));
        this.Z = msy.a(lazyThreadSafetyMode, new w100(this, i));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.NOTIFICATIONS, null, false, 62).g();
        this.J = mzp0Var;
        mzp0Var.init();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        ow90 ow90Var = ow90.a;
        ((efs) ow90.n.getValue()).b(kn(), this.D, ScrollScreenType.NOTIFICATIONS, TimeUnit.SECONDS.toMillis(0L));
        nc70 nc70Var = new nc70(getViewLifecycleOwner(), requireContext(), this.J);
        this.Q = nc70Var;
        return new mk50.c(nc70Var.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ad70 ad70Var = (ad70) ao50Var;
        nc70 nc70Var = this.Q;
        if (nc70Var != null) {
            nc70Var.f(ad70Var, new gb70(getFeature()));
        }
        wj50<bc70> U = getFeature().U();
        f4z f4zVar = (f4z) U;
        f4zVar.a(new aj50(this, 3), getViewLifecycleOwner());
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(oa70.h.b);
        return true;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment
    /* renamed from: eo */
    public final km50 sf(Parcelable parcelable) {
        this.S = false;
        return null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        this.J = null;
        this.Q = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        xn50.a.c(this, oa70.d.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, oa70.e.b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        mzp0 mzp0Var;
        super.onViewCreated(view, bundle);
        if (bundle == null && (mzp0Var = this.J) != null) {
            mzp0Var.e(view);
        }
        d6q0.c(new b());
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.quk0
    public final Object sf(Parcelable parcelable) {
        this.S = false;
        return null;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.quk0
    public final Parcelable vb() {
        return new Bundle();
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        NotificationBannerScheduleRepeat notificationBannerScheduleRepeat;
        va70 va70Var;
        va70 va70Var2;
        vb70 vb70Var = new vb70(((AttachmentMappersComponent) m7m.d(this).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3());
        boolean z = this.S;
        ExtendedProfilesRepository extendedProfilesRepository = (ExtendedProfilesRepository) this.Z.getValue();
        mzp0 mzp0Var = this.J;
        ie70 b2 = d.j0.b();
        if (b2 == null) {
            va70Var2 = new va70(0);
        } else {
            l26 l26Var = (l26) b2.a.get(BannerScheduleLocation.NOTIFICATIONS);
            if (l26Var != null) {
                List<Integer> a2 = l26Var.a();
                int i = a.$EnumSwitchMapping$0[l26Var.b().ordinal()];
                if (i == 1) {
                    notificationBannerScheduleRepeat = NotificationBannerScheduleRepeat.STOP;
                } else if (i == 2) {
                    notificationBannerScheduleRepeat = NotificationBannerScheduleRepeat.REPEAT_LAST;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    notificationBannerScheduleRepeat = NotificationBannerScheduleRepeat.CYCLE;
                }
                va70Var = new va70(a2, notificationBannerScheduleRepeat);
                return new wa70(z, vb70Var, extendedProfilesRepository, mzp0Var, va70Var);
            }
            va70Var2 = new va70(0);
        }
        va70Var = va70Var2;
        return new wa70(z, vb70Var, extendedProfilesRepository, mzp0Var, va70Var);
    }
}
