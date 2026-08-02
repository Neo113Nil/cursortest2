package ru.ozon.app.android.ugc.widgets.reviewsPreview.image;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.common.ReviewsPreviewDecoration;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewImageDTO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00020$j\b\u0012\u0004\u0012\u00020\u0002`%2\n\u0010#\u001a\u00060!j\u0002`\"H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020)2\b\u0010\u0016\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+R<\u0010/\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040-j\b\u0012\u0004\u0012\u00020\u0004`.0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/di/ReviewsPreviewComponent;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewImageDTO;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "state", "item", "Lru/ozon/composer/ui/widget/h$b;", "getWidgetSpan", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewImageDTO;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;)Lru/ozon/composer/ui/widget/h$b;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewImageMapper;", "mapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewsPreviewImageViewMapper extends WidgetViewMapper2<ReviewsPreviewComponent, ReviewsPreviewImageDTO, ReviewsPreviewVO.ReviewsPreviewImageVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<ReviewsPreviewVO.ReviewsPreviewImageVO>> holderProducer = new ReviewsPreviewImageViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReviewsPreviewImageDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        component().getImagePrefetchInfoProviderStorage().addProvider(N.b(ReviewsPreviewVO.ReviewsPreviewImageVO.class), component().getImagePrefetchInfoProvider());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ReviewsPreviewImageView(context);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<ReviewsPreviewDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ReviewsPreviewDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ReviewsPreviewVO.ReviewsPreviewImageVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReviewsPreviewComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReviewsPreviewComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ReviewsPreviewImageMapper getMapper() {
        return component().getImageMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h.b getWidgetSpan(@NotNull ReviewsPreviewImageDTO state, @NotNull ReviewsPreviewVO.ReviewsPreviewImageVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }
}
