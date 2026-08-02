package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader;

import Ih.a;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import fO.C6480a;
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
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J+\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00020%j\b\u0012\u0004\u0012\u00020\u0002`&2\n\u0010$\u001a\u00060\"j\u0002`#H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderDTO;Ljava/lang/String;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "mapSubmitOnBackConfig", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$SubmitOnBackConfigDTO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$SubmitOnBackConfigVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "mapPlaceholdersSheetConfig", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormDTO$HeaderDTO$PlaceholdersSheetConfig;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderVO$PlaceholdersSheetConfigVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeader/ReviewFormHeaderDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewFormHeaderViewMapper extends OverlayWidgetScreenViewItemMapper2<ReviewFormComponent, ReviewFormHeaderDTO, ReviewFormHeaderVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ReviewFormHeaderView(context);
    }

    private final ReviewFormHeaderVO.PlaceholdersSheetConfigVO mapPlaceholdersSheetConfig(ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig) {
        return new ReviewFormHeaderVO.PlaceholdersSheetConfigVO(AtomActionMapperKt.toAtomAction(placeholdersSheetConfig.getAction(), Unsupported.INSTANCE.getTrackingInfo()), placeholdersSheetConfig.getMinRating());
    }

    private final ReviewFormHeaderVO.SubmitOnBackConfigVO mapSubmitOnBackConfig(ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfigDTO) {
        int minRating = submitOnBackConfigDTO.getMinRating();
        AtomActionDTO submitAction = submitOnBackConfigDTO.getSubmitAction();
        Unsupported unsupported = Unsupported.INSTANCE;
        return new ReviewFormHeaderVO.SubmitOnBackConfigVO(minRating, AtomActionMapperKt.toAtomAction(submitAction, unsupported.getTrackingInfo()), AtomActionMapperKt.toAtomAction(submitOnBackConfigDTO.getBackAction(), unsupported.getTrackingInfo()), submitOnBackConfigDTO.getSubmitNotification(), submitOnBackConfigDTO.getSubmitActionTrackingInfo());
    }

    private final ReviewFormHeaderVO toVO(ReviewFormHeaderDTO reviewFormHeaderDTO, String str) {
        long a11 = a.a("HeaderVO.", str);
        IconButtonV3DTO backButton = reviewFormHeaderDTO.getBackButton();
        CellDTO productCell = reviewFormHeaderDTO.getProductCell();
        ReviewFormDTO.HeaderDTO.SubmitOnBackConfigDTO submitOnBackConfig = reviewFormHeaderDTO.getSubmitOnBackConfig();
        ReviewFormHeaderVO.SubmitOnBackConfigVO mapSubmitOnBackConfig = submitOnBackConfig != null ? mapSubmitOnBackConfig(submitOnBackConfig) : null;
        Map<String, TokenizedTrackingInfo> closeReviewFormTrackingInfo = reviewFormHeaderDTO.getCloseReviewFormTrackingInfo();
        t tokenizedEvent$default = closeReviewFormTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(closeReviewFormTrackingInfo, Long.valueOf(a11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = reviewFormHeaderDTO.getTrackingInfo();
        t tokenizedEvent$default2 = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null) : null;
        ReviewFormDTO.HeaderDTO.PlaceholdersSheetConfig placeholdersSheetConfig = reviewFormHeaderDTO.getPlaceholdersSheetConfig();
        return new ReviewFormHeaderVO(a11, backButton, productCell, mapSubmitOnBackConfig, tokenizedEvent$default, tokenizedEvent$default2, placeholdersSheetConfig != null ? mapPlaceholdersSheetConfig(placeholdersSheetConfig) : null, reviewFormHeaderDTO.getBackgroundColor());
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReviewFormHeaderDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ReviewFormHeaderVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ReviewFormHeaderVH((ReviewFormViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReviewFormViewModel formViewModel = ReviewFormHeaderViewMapper.this.component().getFormViewModel();
                Intrinsics.g(formViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return formViewModel;
            }
        }).a(ReviewFormViewModel.class), component().getTokenizedAnalytics(), container, new C6480a(1));
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
    public List<ReviewFormHeaderVO> map(@NotNull ReviewFormHeaderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d()));
    }
}
