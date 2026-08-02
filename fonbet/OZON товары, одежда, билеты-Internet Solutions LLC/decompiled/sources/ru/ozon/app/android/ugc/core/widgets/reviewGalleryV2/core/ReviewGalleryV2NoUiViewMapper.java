package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core;

import A00.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.updates.ConfigurationChangedEvent;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryNoUiViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModel;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewmodel.ReviewGalleryV2MainViewModelImpl;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\f\u0012\u0004\u0012\u00020\u00020\u001ej\u0002`\u001f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryV2NoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/di/ReviewGalleryComponent;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryNoUiV2VO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryNoUiV2VO;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/core/ReviewGalleryNoUiV2VO;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/updates/ConfigurationChangedEvent;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewGalleryV2NoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<ReviewGalleryComponent, ReviewGalleryV2DTO, ReviewGalleryNoUiV2VO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<ConfigurationChangedEvent>> supportedUpdates = C7714v.a0(ConfigurationChangedEvent.class);

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReviewGalleryV2DTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ReviewGalleryNoUiV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Object a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryV2NoUiViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReviewGalleryV2MainViewModelImpl reviewGalleryV2MainViewModelImpl = ReviewGalleryV2NoUiViewMapper.this.component().getMainViewModel().get();
                Intrinsics.g(reviewGalleryV2MainViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return reviewGalleryV2MainViewModelImpl;
            }
        }).a(ReviewGalleryV2MainViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new ReviewGalleryNoUiViewHolder(container, (ReviewGalleryV2MainViewModel) a11);
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<ConfigurationChangedEvent>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewGalleryComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewGalleryComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public ReviewGalleryNoUiV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ReviewGalleryNoUiV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof ConfigurationChangedEvent ? ReviewGalleryNoUiV2VO.copy$default(oldItem, 0L, null, ((ConfigurationChangedEvent) update).getNewConfig().orientation, null, 11, null) : oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ReviewGalleryNoUiV2VO> map(@NotNull ReviewGalleryV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        Integer selectedIndex = state.getSelectedIndex();
        ReviewGalleryV2DTO.OnBackConfigDTO onBackConfig = state.getOnBackConfig();
        return C7714v.a0(new ReviewGalleryNoUiV2VO(hashCode, selectedIndex, 0, onBackConfig != null ? onBackConfig.getOnBackConfigKey() : null, 4, null));
    }
}
