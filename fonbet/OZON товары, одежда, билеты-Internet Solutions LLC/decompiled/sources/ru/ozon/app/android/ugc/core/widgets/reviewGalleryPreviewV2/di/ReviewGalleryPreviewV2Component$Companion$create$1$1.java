package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.core.ReviewGalleryPreviewV2Mapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.PreviewItemListAdapter;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryImagePrefetcher;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewGalleryItemSizeHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.utils.ReviewGalleryPreviewLayoutParamsProvider;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"ru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/di/ReviewGalleryPreviewV2Component$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/di/ReviewGalleryPreviewV2Component;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/core/ReviewGalleryPreviewV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/core/ReviewGalleryPreviewV2Mapper;", "mapper", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$VideoPreloader;", "videoPreloader$delegate", "getVideoPreloader", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$VideoPreloader;", "videoPreloader", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$Factory;", "adapterFactory$delegate", "getAdapterFactory", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/PreviewItemListAdapter$Factory;", "adapterFactory", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewViewModelImpl;", "reviewGalleryPreviewViewModelProvider", "LPc/a;", "getReviewGalleryPreviewViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryPreviewV2Component$Companion$create$1$1 implements ReviewGalleryPreviewV2Component {
    final /* synthetic */ NetworkComponentApi $networkComponentApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerComponentApi;

    /* renamed from: adapterFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adapterFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;
    private final a<ReviewGalleryPreviewViewModelImpl> reviewGalleryPreviewViewModelProvider;

    /* renamed from: videoPreloader$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j videoPreloader;

    ReviewGalleryPreviewV2Component$Companion$create$1$1(NetworkComponentApi networkComponentApi, RetainComposerComponentApi retainComposerComponentApi, PreviewGalleryItemSizeHolder previewGalleryItemSizeHolder, final InterfaceC4008j<PreviewGalleryImagePrefetcher> interfaceC4008j, PlayerPreloader playerPreloader, ReviewGalleryPreviewLayoutParamsProvider reviewGalleryPreviewLayoutParamsProvider, final C7475g c7475g) {
        this.$networkComponentApi = networkComponentApi;
        this.$retainComposerComponentApi = retainComposerComponentApi;
        this.mapper = k.b(new ReviewGalleryPreviewV2Component$Companion$create$1$1$mapper$2(previewGalleryItemSizeHolder, interfaceC4008j));
        this.videoPreloader = k.b(new ReviewGalleryPreviewV2Component$Companion$create$1$1$videoPreloader$2(playerPreloader));
        this.adapterFactory = k.b(new ReviewGalleryPreviewV2Component$Companion$create$1$1$adapterFactory$2(this, reviewGalleryPreviewLayoutParamsProvider));
        this.reviewGalleryPreviewViewModelProvider = new a() { // from class: aV.a
            @Override // Pc.a
            public final Object get() {
                ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelProvider$lambda$0;
                reviewGalleryPreviewViewModelProvider$lambda$0 = ReviewGalleryPreviewV2Component$Companion$create$1$1.reviewGalleryPreviewViewModelProvider$lambda$0(C7475g.this, interfaceC4008j);
                return reviewGalleryPreviewViewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReviewGalleryPreviewViewModelImpl reviewGalleryPreviewViewModelProvider$lambda$0(C7475g c7475g, InterfaceC4008j interfaceC4008j) {
        return new ReviewGalleryPreviewViewModelImpl(((ActionComponentApi) c7475g.getComponent(ActionComponentApi.class)).getActionRepository(), interfaceC4008j);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component
    public PreviewItemListAdapter.Factory getAdapterFactory() {
        return (PreviewItemListAdapter.Factory) this.adapterFactory.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component
    public FeatureChecker getFeatureChecker() {
        return this.$networkComponentApi.getFeatureChecker();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component
    public ReviewGalleryPreviewV2Mapper getMapper() {
        return (ReviewGalleryPreviewV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component
    public a<ReviewGalleryPreviewViewModelImpl> getReviewGalleryPreviewViewModelProvider() {
        return this.reviewGalleryPreviewViewModelProvider;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component
    public l getTokenizedAnalytics() {
        return this.$retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component
    public PreviewItemListAdapter.VideoPreloader getVideoPreloader() {
        return (PreviewItemListAdapter.VideoPreloader) this.videoPreloader.getValue();
    }
}
