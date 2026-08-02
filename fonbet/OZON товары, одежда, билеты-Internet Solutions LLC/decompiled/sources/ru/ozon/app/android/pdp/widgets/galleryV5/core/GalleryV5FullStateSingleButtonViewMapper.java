package ru.ozon.app.android.pdp.widgets.galleryV5.core;

import WZ.l;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.flags.FreshTextureViewInPDPCurtainEnabled;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5DTO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5FullStateSingleButtonViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5FullStateView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel;
import ru.ozon.app.android.video.player.soundservice.SoundScope;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/core/GalleryV5FullStateSingleButtonViewMapper;", "Lru/ozon/app/android/pdp/widgets/galleryV5/core/GalleryV5FullStateBaseViewMapper;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;", "createViewHolder", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "isSingleButton", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GalleryV5FullStateSingleButtonViewMapper extends GalleryV5FullStateBaseViewMapper {
    private final boolean isSingleButton = true;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        GalleryV5DTO galleryV5DTO = state instanceof GalleryV5DTO ? (GalleryV5DTO) state : null;
        return (galleryV5DTO == null || galleryV5DTO.getButtons() == null || galleryV5DTO.getButtons().size() != 1) ? false : true;
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5FullStateBaseViewMapper
    @NotNull
    protected k<GalleryV5VO> createViewHolder(@NotNull View view, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        GalleryV5FullStateView galleryV5FullStateView = (GalleryV5FullStateView) view;
        l tokenizedAnalytics = component().getTokenizedAnalytics();
        GalleryV5OnboardingViewModel galleryV5OnboardingViewModel = (GalleryV5OnboardingViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5FullStateSingleButtonViewMapper$createViewHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                GalleryV5OnboardingViewModel onboardingViewModel = GalleryV5FullStateSingleButtonViewMapper.this.component().getOnboardingViewModel();
                Intrinsics.g(onboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onboardingViewModel;
            }
        }).a(GalleryV5OnboardingViewModel.class);
        GalleryV5PreCreationConfig galleryConfig = getGalleryConfig();
        if (galleryConfig == null) {
            galleryConfig = getDefaultPreCreationConfig();
        }
        return new GalleryV5FullStateSingleButtonViewHolder(galleryV5FullStateView, references, tokenizedAnalytics, galleryConfig, galleryV5OnboardingViewModel, new GalleryV5FullStateSingleButtonViewMapper$createViewHolder$3(this), component().getSoundService().getSoundController(SoundScope.COMMON), (GallerySyncViewModelImpl) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5FullStateSingleButtonViewMapper$createViewHolder$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                GallerySyncViewModelImpl gallerySyncVMP = GalleryV5FullStateSingleButtonViewMapper.this.component().getGallerySyncVMP();
                Intrinsics.g(gallerySyncVMP, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return gallerySyncVMP;
            }
        }).a(GallerySyncViewModelImpl.class), MiniAppExtKt.isExpress(galleryV5FullStateView.getContext()) && component().getFeatureChecker().isEnabled(FreshTextureViewInPDPCurtainEnabled.INSTANCE));
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5FullStateBaseViewMapper
    /* renamed from: isSingleButton, reason: from getter */
    protected boolean getIsSingleButton() {
        return this.isSingleButton;
    }
}
