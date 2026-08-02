package com.vk.profile.community.members.impl.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.members.api.CommunityMembersFilter;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.profile.community.members.impl.ui.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ComFeatures;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.anj;
import xsna.c950;
import xsna.e2s;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.fkq0;
import xsna.fpf0;
import xsna.hf8;
import xsna.i8g0;
import xsna.j220;
import xsna.jai;
import xsna.msy;
import xsna.ncb;
import xsna.pvh;
import xsna.qcy;
import xsna.u1h0;
import xsna.w4u;
import xsna.z23;

/* compiled from: MviMembersListFragment.kt */
/* loaded from: classes5.dex */
public final class MviMembersListFragment extends FragmentImpl implements i8g0 {
    public static final a T;
    public static final /* synthetic */ qcy<Object>[] U;
    public final Object N;
    public final Object O;
    public final boolean P;
    public final u1h0 Q;
    public final Object R;
    public final MviMembersListFragment$receiver$1 S;

    /* compiled from: MviMembersListFragment.kt */
    public static final class a {
    }

    /* compiled from: MviMembersListFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityMembersFilter.values().length];
            try {
                iArr[CommunityMembersFilter.FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityMembersFilter.UNSURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityMembersFilter.DONUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityMembersFilter.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MviMembersListFragment.class, X3.i.U, "getStore()Lcom/vk/profile/community/members/impl/ui/MembersStore;", 0);
        fpf0.a.getClass();
        U = new qcy[]{propertyReference1Impl};
        T = new a();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.vk.profile.community.members.impl.ui.MviMembersListFragment$receiver$1] */
    public MviMembersListFragment() {
        w4u w4uVar = new w4u(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, w4uVar);
        this.O = msy.a(lazyThreadSafetyMode, new pvh(this, 28));
        ComFeatures comFeatures = ComFeatures.COM_DONUT_VISIBILITY;
        comFeatures.getClass();
        this.P = com.vk.toggle.b.A.a(comFeatures);
        this.Q = new u1h0(fpf0.d(j220.class).toString(), this, this, new e2s(this, 17));
        this.R = msy.a(lazyThreadSafetyMode, new c950(this, 2));
        this.S = new BroadcastReceiver() { // from class: com.vk.profile.community.members.impl.ui.MviMembersListFragment$receiver$1
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Object obj;
                Object parcelableExtra;
                if (epx.f(intent.getAction(), "com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelableExtra = intent.getParcelableExtra("id", UserId.class);
                        obj = (Parcelable) parcelableExtra;
                    } else {
                        Parcelable parcelableExtra2 = intent.getParcelableExtra("id");
                        if (!(parcelableExtra2 instanceof UserId)) {
                            parcelableExtra2 = null;
                        }
                        obj = (UserId) parcelableExtra2;
                    }
                    MviMembersListFragment.a aVar = MviMembersListFragment.T;
                    MviMembersListFragment mviMembersListFragment = MviMembersListFragment.this;
                    if (epx.f(obj, fkq0.e((UserId) mviMembersListFragment.N.getValue()))) {
                        mviMembersListFragment.eo().b(a.f.b);
                    }
                }
            }
        };
    }

    @Override // xsna.i8g0
    public final void Zm() {
        eo().b(a.i.b);
    }

    public final j220 eo() {
        qcy<Object> qcyVar = U[0];
        return (j220) this.Q.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.P) {
            IntentFilter a2 = z23.a("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            anj.d(context, this.S, a2, hf8.a, 4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(1081010431, new ncb(this, 11), true));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enj.s(context, this.S);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.P && isResumed()) {
            eo().b(new a.e(z));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        if (getArguments() == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP_MEMBERS_LIST;
        } else {
            int i = b.$EnumSwitchMapping$0[((CommunityMembersFilter) this.O.getValue()).ordinal()];
            if (i == 1) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_IN_GROUP;
            } else if (i == 2) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.UNSURE_MEMBERS_IN_GROUP;
            } else if (i == 3) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP_DONATORS_LIST;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.GROUP_MEMBERS_LIST;
            }
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }
}
