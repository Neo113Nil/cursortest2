package ru.ozon.app.android.account.orders.ordergallery.core;

import As.C2444a;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.ordergallery.data.OrderGalleryDTO;
import ru.ozon.app.android.account.orders.ordergallery.di.OrderGalleryComponent;
import ru.ozon.app.android.account.orders.ordergallery.presentation.OrderGalleryVO;
import ru.ozon.app.android.account.orders.ordergallery.presentation.OrderGalleryViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010J\u0013\u0010\f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\f\u0010\u0013J\u0013\u0010\f\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\f\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R2\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R,\u0010+\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'¨\u0006-"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/core/OrderGalleryViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/ordergallery/di/OrderGalleryComponent;", "Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;", "<init>", "()V", "Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$PostingDTO;", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "imageUrls", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$PostingVO;", "toVo", "(Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$PostingDTO;Ljava/util/List;)Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$PostingVO;", "", "id", "(Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO;J)Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;", "Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyItemDTO;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyItemVO;", "(Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyItemDTO;)Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyItemVO;", "Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyActionDTO;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyActionVO;", "(Lru/ozon/app/android/account/orders/ordergallery/data/OrderGalleryDTO$CopyActionDTO;)Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$CopyActionVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryViewHolder;", "holderProducer", "getHolderProducer", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderGalleryViewMapper extends WidgetViewMapper2<OrderGalleryComponent, OrderGalleryDTO, OrderGalleryVO> {
    private final int layout = R$layout.widget_order_gallery;

    @NotNull
    private final Function2<OrderGalleryDTO, d, List<OrderGalleryVO>> mapper = new OrderGalleryViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, OrderGalleryViewHolder> holderProducer = new OrderGalleryViewMapper$holderProducer$1(this);

    private final OrderGalleryVO.PostingVO toVo(OrderGalleryDTO.PostingDTO postingDTO, List<? extends GalleryRequest.GalleryItem> list) {
        String title = postingDTO.getTitle();
        String image = postingDTO.getImage();
        String description = postingDTO.getDescription();
        String descriptionTitle = postingDTO.getDescriptionTitle();
        OzonHtmlParser.Companion companion = OzonHtmlParser.INSTANCE;
        String hint = postingDTO.getHint();
        if (hint == null) {
            hint = "";
        }
        OzonSpannableString parseHtml$default = OzonHtmlParser.Companion.parseHtml$default(companion, hint, 0, 2, null);
        OrderGalleryDTO.DownloadActionDTO downloadAction = postingDTO.getDownloadAction();
        ButtonV3Atom.LargeButton button = downloadAction != null ? downloadAction.getButton() : null;
        String iconImage = postingDTO.getIconImage();
        OrderGalleryDTO.CopyItemDTO copyItem = postingDTO.getCopyItem();
        return new OrderGalleryVO.PostingVO(title, image, iconImage, description, descriptionTitle, parseHtml$default, button, list, copyItem != null ? toVo(copyItem) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderGalleryComponent widgetComponent$lambda$0(C7475g c7475g) {
        return OrderGalleryComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, OrderGalleryViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderGalleryDTO, d, List<OrderGalleryVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderGalleryComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(OrderGalleryComponent.class), new C2444a(storage, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderGalleryVO toVo(OrderGalleryDTO orderGalleryDTO, long j11) {
        List<OrderGalleryDTO.PostingDTO> postings = orderGalleryDTO.getPostings();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = postings.iterator();
        while (it.hasNext()) {
            String image = ((OrderGalleryDTO.PostingDTO) it.next()).getImage();
            GalleryRequest.GalleryItem.Image image2 = image != null ? new GalleryRequest.GalleryItem.Image(image, null, false, 6, null) : null;
            if (image2 != null) {
                arrayList.add(image2);
            }
        }
        String title = orderGalleryDTO.getTitle();
        List<OrderGalleryDTO.PostingDTO> postings2 = orderGalleryDTO.getPostings();
        ArrayList arrayList2 = new ArrayList(C7714v.z(postings2, 10));
        Iterator<T> it2 = postings2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toVo((OrderGalleryDTO.PostingDTO) it2.next(), arrayList));
        }
        return new OrderGalleryVO(j11, title, arrayList2, orderGalleryDTO.getDownloadAllAction());
    }

    private final OrderGalleryVO.CopyItemVO toVo(OrderGalleryDTO.CopyItemDTO copyItemDTO) {
        return new OrderGalleryVO.CopyItemVO(copyItemDTO.getIcon(), toVo(copyItemDTO.getAction()));
    }

    private final OrderGalleryVO.CopyActionVO toVo(OrderGalleryDTO.CopyActionDTO copyActionDTO) {
        return new OrderGalleryVO.CopyActionVO(copyActionDTO.getClipboardText(), copyActionDTO.getRestrictionMessage());
    }
}
