package ru.ozon.app.android.pdp.widgets.galleryV5.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV5/core/GalleryV5Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV5FullStateBaseViewMapper$mapper$2 extends AbstractC7737t implements Function0<GalleryV5Mapper> {
    final /* synthetic */ GalleryV5FullStateBaseViewMapper this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5FullStateBaseViewMapper$mapper$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<GalleryV5PreCreationConfig, Unit> {
        final /* synthetic */ GalleryV5FullStateBaseViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GalleryV5FullStateBaseViewMapper galleryV5FullStateBaseViewMapper) {
            super(1);
            this.this$0 = galleryV5FullStateBaseViewMapper;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GalleryV5PreCreationConfig galleryV5PreCreationConfig) {
            invoke2(galleryV5PreCreationConfig);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GalleryV5PreCreationConfig it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.setGalleryConfig(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV5FullStateBaseViewMapper$mapper$2(GalleryV5FullStateBaseViewMapper galleryV5FullStateBaseViewMapper) {
        super(0);
        this.this$0 = galleryV5FullStateBaseViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GalleryV5Mapper invoke() {
        return new GalleryV5Mapper(this.this$0.component().getContext(), this.this$0.component().getAppType(), this.this$0.component().getButtonsOnBoardingRepository(), new AnonymousClass1(this.this$0), this.this$0.getIsSingleButton());
    }
}
