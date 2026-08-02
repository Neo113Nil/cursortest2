package ru.ozon.app.android.limb2.di.modules;

import Hb0.f;
import Kb0.K;
import Ld0.c;
import Sc.InterfaceC4008j;
import Tb0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.AbTool;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.network.auth.flags.AdParamsEnabled;
import ru.ozon.app.android.network.auth.flags.AntibotChallengesStartDelay;
import ru.ozon.app.android.network.auth.flags.AntibotJSChallengeCounterEnabled;
import ru.ozon.app.android.network.auth.flags.AntibotMfTimeout;
import ru.ozon.app.android.network.auth.flags.AsyncMfDelay;
import ru.ozon.app.android.network.auth.flags.AsyncMfEnabled;
import ru.ozon.app.android.network.auth.flags.LogAccountManagerNotAvailable;
import ru.ozon.app.android.network.auth.flags.LogCookieInfoCompatNotSupported;
import ru.ozon.app.android.network.auth.flags.LogOzonIdSDKInitTime;
import ru.ozon.app.android.network.auth.flags.OzonIdSdkAntibotIsUnskippable;
import ru.ozon.app.android.network.auth.flags.OzonidTrackErrorPageView;
import ru.ozon.app.android.network.auth.flags.RetryAfterAntibotChallengesDelay;
import ru.ozon.app.android.network.auth.flags.ShouldLogSharedSessionErrorEnabled;
import ru.ozon.app.android.network.auth.flags.TestCookieTrackingEnabled;
import ru.ozon.app.android.network.auth.flags.WebViewSyncIntervalAndroidFlag;
import ru.ozon.app.android.storage.user.UserStatusStorage;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLd0/c;", "diStore", "", "invoke", "(LLd0/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$featureFlagsProvider$1 extends AbstractC7737t implements Function1<c, Unit> {
    final /* synthetic */ InterfaceC4008j<UserStatusStorage> $userStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$featureFlagsProvider$1(InterfaceC4008j<? extends UserStatusStorage> interfaceC4008j) {
        super(1);
        this.$userStorage = interfaceC4008j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(c cVar) {
        invoke2(cVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        AbTool abTool = (AbTool) diStore.e(AbToolBaseApi.class);
        Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$featureFlagsProvider$1$1$1 value = new Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$featureFlagsProvider$1$1$1(this.$userStorage);
        Intrinsics.checkNotNullParameter(value, "value");
        K k11 = a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.z().getValue().c(f.h.f10803a, value);
        WebViewSyncIntervalAndroidFlag webViewSyncIntervalAndroidFlag = WebViewSyncIntervalAndroidFlag.INSTANCE;
        long long$default = AbToolBaseApi.DefaultImpls.getLong$default(abTool, webViewSyncIntervalAndroidFlag.getFeatureName(), webViewSyncIntervalAndroidFlag.getServiceName(), null, 4, null);
        K k12 = a.f26975d;
        if (k12 == null) {
            throw new Lb0.a();
        }
        k12.z().getValue().c(f.s.f10817a, Long.valueOf(long$default));
        LogOzonIdSDKInitTime logOzonIdSDKInitTime = LogOzonIdSDKInitTime.INSTANCE;
        boolean boolean$default = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, logOzonIdSDKInitTime.getFeatureName(), logOzonIdSDKInitTime.getServiceName(), null, 4, null);
        K k13 = a.f26975d;
        if (k13 == null) {
            throw new Lb0.a();
        }
        k13.z().getValue().c(f.l.f10809a, Boolean.valueOf(boolean$default));
        LogAccountManagerNotAvailable logAccountManagerNotAvailable = LogAccountManagerNotAvailable.INSTANCE;
        boolean boolean$default2 = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, logAccountManagerNotAvailable.getFeatureName(), logAccountManagerNotAvailable.getServiceName(), null, 4, null);
        K k14 = a.f26975d;
        if (k14 == null) {
            throw new Lb0.a();
        }
        k14.z().getValue().c(f.j.f10807a, Boolean.valueOf(boolean$default2));
        LogCookieInfoCompatNotSupported logCookieInfoCompatNotSupported = LogCookieInfoCompatNotSupported.INSTANCE;
        boolean boolean$default3 = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, logCookieInfoCompatNotSupported.getFeatureName(), logCookieInfoCompatNotSupported.getServiceName(), null, 4, null);
        K k15 = a.f26975d;
        if (k15 == null) {
            throw new Lb0.a();
        }
        k15.z().getValue().c(f.k.f10808a, Boolean.valueOf(boolean$default3));
        OzonIdSdkAntibotIsUnskippable ozonIdSdkAntibotIsUnskippable = OzonIdSdkAntibotIsUnskippable.INSTANCE;
        boolean boolean$default4 = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, ozonIdSdkAntibotIsUnskippable.getFeatureName(), ozonIdSdkAntibotIsUnskippable.getServiceName(), null, 4, null);
        K k16 = a.f26975d;
        if (k16 == null) {
            throw new Lb0.a();
        }
        k16.z().getValue().c(f.i.f10806a, Boolean.valueOf(boolean$default4));
        TestCookieTrackingEnabled testCookieTrackingEnabled = TestCookieTrackingEnabled.INSTANCE;
        boolean boolean$default5 = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, testCookieTrackingEnabled.getFeatureName(), testCookieTrackingEnabled.getServiceName(), null, 4, null);
        K k17 = a.f26975d;
        if (k17 == null) {
            throw new Lb0.a();
        }
        k17.z().getValue().c(f.q.f10815a, Boolean.valueOf(boolean$default5));
        AntibotJSChallengeCounterEnabled antibotJSChallengeCounterEnabled = AntibotJSChallengeCounterEnabled.INSTANCE;
        boolean boolean$default6 = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, antibotJSChallengeCounterEnabled.getFeatureName(), antibotJSChallengeCounterEnabled.getServiceName(), null, 4, null);
        K k18 = a.f26975d;
        if (k18 == null) {
            throw new Lb0.a();
        }
        k18.z().getValue().c(f.d.f10798a, Boolean.valueOf(boolean$default6));
        K k19 = a.f26975d;
        if (k19 == null) {
            throw new Lb0.a();
        }
        k19.z().getValue().c(f.a.f10795a, Boolean.TRUE);
        OzonidTrackErrorPageView ozonidTrackErrorPageView = OzonidTrackErrorPageView.INSTANCE;
        boolean boolean$default7 = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, ozonidTrackErrorPageView.getFeatureName(), ozonidTrackErrorPageView.getServiceName(), null, 4, null);
        K k21 = a.f26975d;
        if (k21 == null) {
            throw new Lb0.a();
        }
        k21.z().getValue().c(f.r.f10816a, Boolean.valueOf(boolean$default7));
        AntibotChallengesStartDelay antibotChallengesStartDelay = AntibotChallengesStartDelay.INSTANCE;
        long long$default2 = AbToolBaseApi.DefaultImpls.getLong$default(abTool, antibotChallengesStartDelay.getFeatureName(), antibotChallengesStartDelay.getServiceName(), null, 4, null);
        K k22 = a.f26975d;
        if (k22 == null) {
            throw new Lb0.a();
        }
        k22.z().getValue().c(f.c.f10797a, Long.valueOf(long$default2));
        RetryAfterAntibotChallengesDelay retryAfterAntibotChallengesDelay = RetryAfterAntibotChallengesDelay.INSTANCE;
        long long$default3 = AbToolBaseApi.DefaultImpls.getLong$default(abTool, retryAfterAntibotChallengesDelay.getFeatureName(), retryAfterAntibotChallengesDelay.getServiceName(), null, 4, null);
        K k23 = a.f26975d;
        if (k23 == null) {
            throw new Lb0.a();
        }
        k23.z().getValue().c(f.m.f10810a, Long.valueOf(long$default3));
        AntibotMfTimeout antibotMfTimeout = AntibotMfTimeout.INSTANCE;
        long long$default4 = AbToolBaseApi.DefaultImpls.getLong$default(abTool, antibotMfTimeout.getFeatureName(), antibotMfTimeout.getServiceName(), null, 4, null);
        K k24 = a.f26975d;
        if (k24 == null) {
            throw new Lb0.a();
        }
        k24.z().getValue().c(f.e.f10799a, Long.valueOf(long$default4));
        ShouldLogSharedSessionErrorEnabled shouldLogSharedSessionErrorEnabled = ShouldLogSharedSessionErrorEnabled.INSTANCE;
        String value2 = AbToolBaseApi.DefaultImpls.getString$default(abTool, shouldLogSharedSessionErrorEnabled.getFeatureName(), shouldLogSharedSessionErrorEnabled.getServiceName(), null, 4, null);
        Intrinsics.checkNotNullParameter(value2, "value");
        K k25 = a.f26975d;
        if (k25 == null) {
            throw new Lb0.a();
        }
        k25.z().getValue().c(f.n.f10811a, value2);
        AsyncMfEnabled asyncMfEnabled = AsyncMfEnabled.INSTANCE;
        boolean boolean$default8 = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, asyncMfEnabled.getFeatureName(), asyncMfEnabled.getServiceName(), null, 4, null);
        K k26 = a.f26975d;
        if (k26 == null) {
            throw new Lb0.a();
        }
        k26.z().getValue().c(f.g.f10802a, Boolean.valueOf(boolean$default8));
        AsyncMfDelay asyncMfDelay = AsyncMfDelay.INSTANCE;
        long long$default5 = AbToolBaseApi.DefaultImpls.getLong$default(abTool, asyncMfDelay.getFeatureName(), asyncMfDelay.getServiceName(), null, 4, null);
        K k27 = a.f26975d;
        if (k27 == null) {
            throw new Lb0.a();
        }
        k27.z().getValue().c(f.C0219f.f10800a, Long.valueOf(long$default5));
        AdParamsEnabled adParamsEnabled = AdParamsEnabled.INSTANCE;
        boolean boolean$default9 = AbToolBaseApi.DefaultImpls.getBoolean$default(abTool, adParamsEnabled.getFeatureName(), adParamsEnabled.getServiceName(), null, 4, null);
        K k28 = a.f26975d;
        if (k28 == null) {
            throw new Lb0.a();
        }
        k28.z().getValue().c(f.b.f10796a, Boolean.valueOf(boolean$default9));
    }
}
