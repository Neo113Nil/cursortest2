package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.di.HotelsGalleryComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.view.HotelsGalleryView;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.app.android.video.player.soundservice.SoundScope;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class HotelsGalleryViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HotelsGalleryWidgetViewHolder> {
    final /* synthetic */ HotelsGalleryViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryViewMapper$holderProducer$1(HotelsGalleryViewMapper hotelsGalleryViewMapper) {
        super(2);
        this.this$0 = hotelsGalleryViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final HotelsGalleryWidgetViewHolder invoke(View view, ComposerReferences refs) {
        WeakReference weakReference;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        HotelsGalleryView hotelsGalleryView = (HotelsGalleryView) view;
        weakReference = this.this$0.composerScreenUiContainer;
        i iVar = weakReference != null ? (i) weakReference.get() : null;
        C c11 = new C(this.this$0.component()) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryViewMapper$holderProducer$1.1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((HotelsGalleryComponent) this.receiver).getVideoPlayer();
            }
        };
        SoundController soundController = this.this$0.component().getSoundService().getSoundController(SoundScope.COMMON);
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final HotelsGalleryComponent component = this.this$0.component();
        return new HotelsGalleryWidgetViewHolder(hotelsGalleryView, soundController, c11, refs, (HotelsGalleryViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HotelsGalleryViewModel viewModel = HotelsGalleryComponent.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(HotelsGalleryViewModel.class), this.this$0.component().getGalleryRouter(), iVar, this.this$0.component().getTokenizedAnalytics());
    }
}
