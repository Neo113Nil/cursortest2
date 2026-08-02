package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget;

import Kk.c;
import WZ.t;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormDTO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.Unsupported;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00020 j\b\u0012\u0004\u0012\u00020\u0002`!2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiWidgetMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiModel;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiParamsVO;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "mapSubmitOnBackConfig", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "mapPlaceholdersSheetConfig", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormNoUiWidget/ReviewFormNoUiModel;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewFormNoUiWidgetMapper extends OverlayWidgetScreenViewItemMapper2<ReviewFormComponent, ReviewFormNoUiModel, ReviewFormNoUiParamsVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final ReviewFormHeaderVO.PlaceholdersSheetConfigVO mapPlaceholdersSheetConfig(ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig) {
        return new ReviewFormHeaderVO.PlaceholdersSheetConfigVO(AtomActionMapperKt.toAtomAction(placeholdersSheetConfig.getAction(), Unsupported.INSTANCE.getTrackingInfo()), placeholdersSheetConfig.getMinRating());
    }

    private final ReviewFormHeaderVO.SubmitOnBackConfigVO mapSubmitOnBackConfig(ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO) {
        int minRating = submitOnBackConfigDTO.getMinRating();
        AtomActionDTO submitAction = submitOnBackConfigDTO.getSubmitAction();
        Unsupported unsupported = Unsupported.INSTANCE;
        return new ReviewFormHeaderVO.SubmitOnBackConfigVO(minRating, AtomActionMapperKt.toAtomAction(submitAction, unsupported.getTrackingInfo()), AtomActionMapperKt.toAtomAction(submitOnBackConfigDTO.getBackAction(), unsupported.getTrackingInfo()), submitOnBackConfigDTO.getSubmitNotification(), submitOnBackConfigDTO.getSubmitActionTrackingInfo());
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReviewFormNoUiModel;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ReviewFormNoUiParamsVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ReviewFormNoUiWidgetViewHolder((ReviewFormViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormNoUiWidget.ReviewFormNoUiWidgetMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReviewFormViewModel formViewModel = ReviewFormNoUiWidgetMapper.this.component().getFormViewModel();
                Intrinsics.g(formViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return formViewModel;
            }
        }).a(ReviewFormViewModel.class), component().getTokenizedAnalytics(), component().getComposerNavigator(), container, component().getCustomActionHandlersStoreFactory());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ReviewFormNoUiParamsVO> map(@NotNull ReviewFormNoUiModel state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long a11 = c.a(info.d(), "UiLogicId");
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig = state.getSubmitOnBackConfig();
        ReviewFormHeaderVO.SubmitOnBackConfigVO mapSubmitOnBackConfig = submitOnBackConfig != null ? mapSubmitOnBackConfig(submitOnBackConfig) : null;
        Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo = state.getCloseReviewFormTrackingInfo();
        t tokenizedEvent$default = closeReviewFormTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(closeReviewFormTrackingInfo, Long.valueOf(a11), null, 2, null) : null;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = state.getPlaceholdersSheetConfig();
        return C7714v.a0(new ReviewFormNoUiParamsVO(a11, mapSubmitOnBackConfig, tokenizedEvent$default, placeholdersSheetConfig != null ? mapPlaceholdersSheetConfig(placeholdersSheetConfig) : null));
    }
}
