package com.vk.profile.provider.di;

import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profile.user.api.data.CommunityProfileDeeplinkParams;
import com.vk.profile.user.api.data.UserProfileSkeletonParams;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import xsna.pwd0;
import xsna.pwj0;

/* compiled from: ProfileFragmentProviderComponent.kt */
/* loaded from: classes.dex */
public interface ProfileFragmentProviderComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ProfileFragmentProviderComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ProfileFragmentProviderComponent STUB = new ProfileFragmentProviderComponent() { // from class: com.vk.profile.provider.di.ProfileFragmentProviderComponent$Companion$STUB$1
            @Override // com.vk.profile.provider.di.ProfileFragmentProviderComponent
            public final pwd0 ye(UserId userId, String str) {
                return new ProfileFragmentProviderComponent.Companion.a();
            }
        };

        /* compiled from: ProfileFragmentProviderComponent.kt */
        /* loaded from: classes5.dex */
        public static final class a extends pwd0 {
            public a() {
                super(FragmentImpl.class, null, null);
            }

            @Override // xsna.pwd0
            public final pwd0 A() {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 B(boolean z) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 C(int i, UserId userId) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 D(FullSourceJoinApi.EntryServiceType entryServiceType, String str, String str2) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 F() {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 G(String str) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 H(SearchStatsLoggingInfo searchStatsLoggingInfo) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 I(String str) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 J() {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 K(String str) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 L(UserProfile userProfile) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 M(UserProfileSkeletonParams userProfileSkeletonParams) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 N(WallGetMode wallGetMode) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 O() {
                P();
                return this;
            }

            public final void P() {
                BuildInfo.Client client = BuildInfo.a;
                VKApplication vKApplication = com.vk.core.apps.a.a;
                if (!BuildInfo.m()) {
                    throw new UnsupportedOperationException("Use this stub only for autotests!");
                }
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.e, new Object[]{"ERROR! Stub used in production build!"});
            }

            @Override // xsna.pwd0
            public final pwd0 y(CatchUpBanner catchUpBanner) {
                P();
                return this;
            }

            @Override // xsna.pwd0
            public final pwd0 z(CommunityProfileDeeplinkParams communityProfileDeeplinkParams) {
                P();
                return this;
            }
        }

        public final ProfileFragmentProviderComponent getSTUB() {
            return STUB;
        }
    }

    default pwd0 E7(long j) {
        return ye(new UserId(j), null);
    }

    pwd0 ye(UserId userId, String str);
}
