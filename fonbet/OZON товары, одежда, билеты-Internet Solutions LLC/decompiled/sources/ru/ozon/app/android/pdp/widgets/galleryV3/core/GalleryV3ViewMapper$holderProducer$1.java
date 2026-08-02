package ru.ozon.app.android.pdp.widgets.galleryV3.core;

import WZ.l;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryAnalytics;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryRouter;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3ViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.app.android.video.player.soundservice.SoundScope;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class GalleryV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, GalleryV3ViewHolder> {
    final /* synthetic */ GalleryV3ViewMapper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.galleryV3.core.GalleryV3ViewMapper$holderProducer$1$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<GalleryVideoPlayer> {
        final /* synthetic */ GalleryV3ViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(GalleryV3ViewMapper galleryV3ViewMapper) {
            super(0);
            this.this$0 = galleryV3ViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final GalleryVideoPlayer invoke() {
            return this.this$0.component().getVideoPlayer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV3ViewMapper$holderProducer$1(GalleryV3ViewMapper galleryV3ViewMapper) {
        super(2);
        this.this$0 = galleryV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final GalleryV3ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        GalleryAnalytics analytics = this.this$0.component().getAnalytics();
        GalleryRouter router = this.this$0.component().getRouter();
        SoundController soundController = this.this$0.component().getSoundService().getSoundController(SoundScope.COMMON);
        B0 b11 = refs.getViewModelOwnerProvider().b();
        final GalleryV3ViewMapper galleryV3ViewMapper = this.this$0;
        return new GalleryV3ViewHolder(view, new AnonymousClass2(this.this$0), refs, tokenizedAnalytics, analytics, router, soundController, (GalleryV3ViewModelImpl) new z0(b11, new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.galleryV3.core.GalleryV3ViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                GalleryV3ViewModelImpl viewModel = GalleryV3ViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(GalleryV3ViewModelImpl.class));
    }
}
