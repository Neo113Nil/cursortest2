package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views.SingleReviewGalleryOneRowView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryType;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext.SingleReviewGalleryViewUtilsKt;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowDO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/widgets/mediaRow/SingleReviewGalleryRowViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "getMapper", "mapper", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleReviewGalleryRowViewMapper extends WidgetViewMapper2<SingleReviewGalleryRowComponent, SingleReviewGalleryRowDO, SingleReviewGalleryRowVO> {

    @NotNull
    private final Function2<View, ComposerReferences, SingleReviewGalleryRowViewHolder> holderProducer = SingleReviewGalleryRowViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof SingleReviewGalleryRowDO)) {
            return false;
        }
        SingleReviewGalleryRowDO singleReviewGalleryRowDO = (SingleReviewGalleryRowDO) state;
        return singleReviewGalleryRowDO.getGalleryType() == SingleReviewGalleryType.PHOTO_LIST || component().getMapper().hasGalleryBottomRow(singleReviewGalleryRowDO);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PlayerPreloader playerPreloader = component().getPlayerPreloader();
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SingleReviewGalleryOneRowView singleReviewGalleryOneRowView = new SingleReviewGalleryOneRowView(context, playerPreloader, SingleReviewGalleryViewUtilsKt.getIconPlayBitmap(context2));
        singleReviewGalleryOneRowView.setLayoutParams(new RecyclerView.p(-1, -2));
        Context context3 = singleReviewGalleryOneRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        singleReviewGalleryOneRowView.setBackgroundColor(ThemeExtKt.themeColor(context3, R$attr.layerFloor1));
        return singleReviewGalleryOneRowView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SingleReviewGalleryRowViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SingleReviewGalleryRowDO, d, List<SingleReviewGalleryRowVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SingleReviewGalleryRowComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SingleReviewGalleryRowComponent.INSTANCE.create(storage);
    }
}
