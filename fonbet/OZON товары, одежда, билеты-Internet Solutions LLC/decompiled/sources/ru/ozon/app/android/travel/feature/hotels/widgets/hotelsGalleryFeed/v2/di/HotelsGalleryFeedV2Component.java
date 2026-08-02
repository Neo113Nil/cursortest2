package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.data.HotelsGalleryFeedV2Mapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/di/HotelsGalleryFeedV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2Mapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsGalleryFeedV2Component implements InterfaceC6958a {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final RetainComposerComponentApi retainComposerComponentApi;

    public HotelsGalleryFeedV2Component(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.retainComposerComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.mapper = k.b(HotelsGalleryFeedV2Component$mapper$2.INSTANCE);
    }

    @NotNull
    public final HotelsGalleryFeedV2Mapper getMapper() {
        return (HotelsGalleryFeedV2Mapper) this.mapper.getValue();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
