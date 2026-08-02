package ru.ozon.app.android.pdp.widgets.galleryFullView.core;

import WZ.l;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.gallery.common.VolumeContentObserver;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewLayout;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;
import ru.ozon.app.android.video.player.soundservice.SoundService;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class GalleryFullViewViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, GalleryFullViewViewHolder> {
    final /* synthetic */ GalleryFullViewViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryFullViewViewMapper$holderProducer$1(GalleryFullViewViewMapper galleryFullViewViewMapper) {
        super(2);
        this.this$0 = galleryFullViewViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final GalleryFullViewViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        GalleryFullViewLayout.ViewBinding bind = this.this$0.component().getLayout().bind(view);
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        VideoMoleculePlayerDelegateProvider playerDelegateProvider = this.this$0.component().getPlayerDelegateProvider();
        SoundService soundService = this.this$0.component().getSoundService();
        VolumeContentObserver volumeContentObserver = this.this$0.component().getVolumeContentObserver();
        B0 b11 = refs.getViewModelOwnerProvider().b();
        final GalleryFullViewViewMapper galleryFullViewViewMapper = this.this$0;
        return new GalleryFullViewViewHolder(bind, refs, tokenizedAnalytics, (GallerySyncViewModelImpl) new z0(b11, new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.galleryFullView.core.GalleryFullViewViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                GallerySyncViewModelImpl viewModelProvider = GalleryFullViewViewMapper.this.component().getViewModelProvider();
                Intrinsics.g(viewModelProvider, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModelProvider;
            }
        }).a(GallerySyncViewModelImpl.class), playerDelegateProvider, volumeContentObserver, soundService, this.this$0.component().getAppType());
    }
}
