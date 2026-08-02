package ru.ozon.app.android.ugc.widgets.additionalReview.core;

import HQ.a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.ugc.databinding.WidgetAdditionalReviewBinding;
import ru.ozon.app.android.ugc.widgets.additionalReview.data.AdditionalReviewDTO;
import ru.ozon.app.android.ugc.widgets.additionalReview.di.AdditionalReviewComponent;
import ru.ozon.app.android.ugc.widgets.additionalReview.presentation.AdditionalReviewNoUIViewHolder;
import ru.ozon.app.android.ugc.widgets.additionalReview.presentation.AdditionalReviewVO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/core/AdditionalReviewNoUIViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/widgets/additionalReview/di/AdditionalReviewComponent;", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO;", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/ugc/widgets/additionalReview/core/AdditionalReviewMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/additionalReview/core/AdditionalReviewMapper;", "mapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdditionalReviewNoUIViewMapper extends OverlayWidgetScreenViewItemMapper2<AdditionalReviewComponent, AdditionalReviewDTO, AdditionalReviewVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        CardView constraintLayout = WidgetAdditionalReviewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false).getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    private final AdditionalReviewMapper getMapper() {
        return component().getMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        AdditionalReviewDTO additionalReviewDTO = state instanceof AdditionalReviewDTO ? (AdditionalReviewDTO) state : null;
        return (additionalReviewDTO != null ? additionalReviewDTO.getDisplayType() : null) == AdditionalReviewDTO.DisplayType.OVERLAY;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AdditionalReviewVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ScrollExtKt.scrollEnable(ComposerViewExtensionKt.composerRecyclerView(container.Z()), false);
        return new AdditionalReviewNoUIViewHolder(container, component().getTokenizedAnalytics(), component().getFeatureChecker(), new a(1));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AdditionalReviewComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AdditionalReviewComponent.INSTANCE.getInstance(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AdditionalReviewVO> map(@NotNull AdditionalReviewDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
