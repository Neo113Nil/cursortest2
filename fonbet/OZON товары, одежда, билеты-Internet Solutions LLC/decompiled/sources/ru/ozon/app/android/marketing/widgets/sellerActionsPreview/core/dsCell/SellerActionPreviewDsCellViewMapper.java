package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.dsCell;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.async.SellerActionsPreviewUpdateKey$Success;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di.SellerActionsPreviewComponent;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.dsCell.SellerActionPreviewDsCellView;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.dsCell.SellerActionPreviewDsCellViewHolder;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R,\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/core/dsCell/SellerActionPreviewDsCellViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/di/SellerActionsPreviewComponent;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$DsCell;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$DsCell;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$DsCell;)Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$DsCell;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/dsCell/SellerActionPreviewDsCellViewHolder;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/core/async/SellerActionsPreviewUpdateKey$Success;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerActionPreviewDsCellViewMapper extends WidgetViewMapper2<SellerActionsPreviewComponent, SellerActionsPreviewDtoWrapper.DsCell, SellerActionsPreviewVO.DsCell> {

    @NotNull
    private final Function2<SellerActionsPreviewDtoWrapper.DsCell, d, List<SellerActionsPreviewVO.DsCell>> mapper = new SellerActionPreviewDsCellViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, SellerActionPreviewDsCellViewHolder> holderProducer = new SellerActionPreviewDsCellViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<SellerActionsPreviewUpdateKey$Success>> supportedUpdates = C7714v.a0(SellerActionsPreviewUpdateKey$Success.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SellerActionsPreviewDtoWrapper.DsCell;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SellerActionPreviewDsCellView(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SellerActionPreviewDsCellViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SellerActionsPreviewDtoWrapper.DsCell, d, List<SellerActionsPreviewVO.DsCell>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SellerActionsPreviewUpdateKey$Success>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SellerActionsPreviewComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SellerActionsPreviewComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public SellerActionsPreviewVO.DsCell handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SellerActionsPreviewVO.DsCell oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof SellerActionsPreviewUpdateKey$Success)) {
            return null;
        }
        SellerActionsPreviewUpdateKey$Success sellerActionsPreviewUpdateKey$Success = (SellerActionsPreviewUpdateKey$Success) update;
        if ((sellerActionsPreviewUpdateKey$Success.getVo() instanceof SellerActionsPreviewVO.DsCell) && ((SellerActionsPreviewVO.DsCell) sellerActionsPreviewUpdateKey$Success.getVo()).getId() == oldItem.getId() && !Intrinsics.d(sellerActionsPreviewUpdateKey$Success.getVo(), oldItem)) {
            return (SellerActionsPreviewVO.DsCell) sellerActionsPreviewUpdateKey$Success.getVo();
        }
        return null;
    }
}
