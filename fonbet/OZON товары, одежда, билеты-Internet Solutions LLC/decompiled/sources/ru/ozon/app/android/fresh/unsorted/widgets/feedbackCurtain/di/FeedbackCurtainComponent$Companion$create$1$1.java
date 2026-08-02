package ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data.FeedbackCurtainApi;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di.FeedbackCurtainComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation.FeedbackCurtainMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation.FeedbackCurtainViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/di/FeedbackCurtainComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/di/FeedbackCurtainComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeedbackCurtainComponent$Companion$create$1$1 implements FeedbackCurtainComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(FeedbackCurtainComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<FeedbackCurtainViewModel> viewModelProvider;

    FeedbackCurtainComponent$Companion$create$1$1(final C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new a() { // from class: mx.a
            @Override // Pc.a
            public final Object get() {
                FeedbackCurtainViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = FeedbackCurtainComponent$Companion$create$1$1.viewModelProvider$lambda$0(C7475g.this);
                return viewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FeedbackCurtainViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        Object create = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getRetrofit().create(FeedbackCurtainApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new FeedbackCurtainViewModel((FeedbackCurtainApi) create);
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di.FeedbackCurtainComponent
    public FeedbackCurtainMapper getMapper() {
        return (FeedbackCurtainMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di.FeedbackCurtainComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di.FeedbackCurtainComponent
    public a<FeedbackCurtainViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
