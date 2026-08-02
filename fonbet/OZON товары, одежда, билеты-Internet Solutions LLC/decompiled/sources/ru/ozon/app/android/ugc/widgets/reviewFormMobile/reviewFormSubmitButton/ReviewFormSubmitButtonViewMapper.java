package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModel;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModelImpl;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.ReviewFormSubmitButtonViewMapper;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/di/ReviewFormComponent;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonDTO;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormSubmitButton/ReviewFormSubmitButtonMapper;", "mapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewFormSubmitButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<ReviewFormComponent, ReviewFormSubmitButtonDTO, ReviewFormSubmitButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$4(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.setShowDividers(2);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Dimens dimens = Dimens.INSTANCE;
        shapeDrawable.setIntrinsicHeight(dimens.getDP_8());
        shapeDrawable.getPaint().setColor(0);
        parent.setDividerDrawable(shapeDrawable);
        parent.setPadding(parent.getPaddingLeft(), dimens.getDP_8(), parent.getPaddingRight(), dimens.getDP_8());
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ButtonV3View(context, null, 0, 0, 14, null);
    }

    private final ReviewFormSubmitButtonMapper getMapper() {
        return component().getSubmitButtonMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReviewFormSubmitButtonDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ReviewFormSubmitButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ReviewSubmitButtonViewHolder(container, (ReviewFormViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.ReviewFormSubmitButtonViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReviewFormViewModel formViewModel = ReviewFormSubmitButtonViewMapper.this.component().getFormViewModel();
                Intrinsics.g(formViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return formViewModel;
            }
        }).a(ReviewFormViewModel.class), (MediaPickerViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.ReviewFormSubmitButtonViewMapper$createHolder$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                MediaPickerViewModelImpl mediaPickerViewModel = ReviewFormSubmitButtonViewMapper.this.component().getMediaPickerViewModel();
                Intrinsics.g(mediaPickerViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return mediaPickerViewModel;
            }
        }).a(MediaPickerViewModelImpl.class), component().getTokenizedAnalytics(), component().getComposerNavigator(), component().isSelect(), new InterfaceC6068e() { // from class: wW.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$4;
                createHolder$lambda$4 = ReviewFormSubmitButtonViewMapper.createHolder$lambda$4((LinearLayout) viewGroup);
                return createHolder$lambda$4;
            }
        });
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
    public List<ReviewFormSubmitButtonVO> map(@NotNull ReviewFormSubmitButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
