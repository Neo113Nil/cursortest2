package ru.ozon.app.android.pdp.widgets.galleryV4.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4PreCreationConfig;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV4/core/GalleryV4Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class GalleryV4SimpleStateViewMapper$mapper$2 extends AbstractC7737t implements Function0<GalleryV4Mapper> {
    final /* synthetic */ GalleryV4SimpleStateViewMapper this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GalleryV4PreCreationConfig;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.galleryV4.core.GalleryV4SimpleStateViewMapper$mapper$2$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<GalleryV4PreCreationConfig, Unit> {
        final /* synthetic */ GalleryV4SimpleStateViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GalleryV4SimpleStateViewMapper galleryV4SimpleStateViewMapper) {
            super(1);
            this.this$0 = galleryV4SimpleStateViewMapper;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GalleryV4PreCreationConfig galleryV4PreCreationConfig) {
            invoke2(galleryV4PreCreationConfig);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GalleryV4PreCreationConfig it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.galleryConfig = it;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV4SimpleStateViewMapper$mapper$2(GalleryV4SimpleStateViewMapper galleryV4SimpleStateViewMapper) {
        super(0);
        this.this$0 = galleryV4SimpleStateViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GalleryV4Mapper invoke() {
        return new GalleryV4Mapper(this.this$0.component().getContext(), new AnonymousClass1(this.this$0));
    }
}
