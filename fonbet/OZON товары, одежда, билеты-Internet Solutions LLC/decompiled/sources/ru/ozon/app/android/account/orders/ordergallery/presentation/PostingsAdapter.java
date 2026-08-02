package ru.ozon.app.android.account.orders.ordergallery.presentation;

import Ey.ViewOnClickListenerC2975b;
import Vg.c;
import Yk.a;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.account.orders.ordergallery.presentation.OrderGalleryVO;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetOrderGalleryPostingItemBinding;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB3\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/PostingsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$PostingVO;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/PostingsAdapter$PostingVH;", "Lkotlin/Function0;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStoreProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;", "widgetViewHolder", "<init>", "(Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/account/orders/ordergallery/presentation/PostingsAdapter$PostingVH;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/account/orders/ordergallery/presentation/PostingsAdapter$PostingVH;I)V", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "PostingVH", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PostingsAdapter extends t<OrderGalleryVO.PostingVO, PostingVH> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final Function0<c> customActionHandlersStoreProvider;

    @NotNull
    private final k<OrderGalleryVO> widgetViewHolder;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/PostingsAdapter$PostingVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderGalleryPostingItemBinding;", "binding", "Lkotlin/Function0;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStoreProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;", "widgetViewHolder", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetOrderGalleryPostingItemBinding;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "imageUrls", "", "openGallery", "(Landroid/content/Context;Ljava/util/List;)V", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$PostingVO;", "postingVO", "bind", "(Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$PostingVO;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderGalleryPostingItemBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "item", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO$PostingVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PostingVH extends RecyclerView.C {

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;

        @NotNull
        private final WidgetOrderGalleryPostingItemBinding binding;

        @NotNull
        private final ComposerReferences composerReferences;
        private OrderGalleryVO.PostingVO item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostingVH(@NotNull WidgetOrderGalleryPostingItemBinding binding, @NotNull Function0<? extends c> customActionHandlersStoreProvider, @NotNull ComposerReferences composerReferences, @NotNull k<OrderGalleryVO> widgetViewHolder) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(customActionHandlersStoreProvider, "customActionHandlersStoreProvider");
            Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
            Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
            this.binding = binding;
            this.composerReferences = composerReferences;
            this.actionHandler = new ActionHandler.Builder(composerReferences, widgetViewHolder).customActionHandlers(customActionHandlersStoreProvider).buildHandler();
            binding.descriptionContainer.setOnClickListener(new ViewOnClickListenerC2975b(this, 6));
            binding.hintTv.setMovementMethod(LinkMovementMethod.getInstance());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(PostingVH postingVH, View view) {
            OrderGalleryVO.CopyActionVO copyAction;
            OrderGalleryVO.PostingVO postingVO = postingVH.item;
            if (postingVO == null) {
                Intrinsics.n("item");
                throw null;
            }
            OrderGalleryVO.CopyItemVO copyItem = postingVO.getCopyItem();
            if (copyItem == null || (copyAction = copyItem.getCopyAction()) == null) {
                return;
            }
            RestrictionsUtilsKt.showRestrictionAndCopy(postingVH.composerReferences, copyAction.getClipboardText(), copyAction.getRestrictionMessage());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$11$lambda$10$lambda$5$lambda$4(PostingVH postingVH, WidgetOrderGalleryPostingItemBinding widgetOrderGalleryPostingItemBinding, List list, View view) {
            Context context = widgetOrderGalleryPostingItemBinding.imageIv.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            postingVH.openGallery(context, list);
        }

        private final void openGallery(Context context, List<? extends GalleryRequest.GalleryItem> imageUrls) {
            context.startActivity(GalleryActivity.INSTANCE.newIntent(context, new GalleryRequest(imageUrls, 0)));
        }

        public final void bind(@NotNull OrderGalleryVO.PostingVO postingVO) {
            Intrinsics.checkNotNullParameter(postingVO, "postingVO");
            WidgetOrderGalleryPostingItemBinding widgetOrderGalleryPostingItemBinding = this.binding;
            this.item = postingVO;
            TextView titleTv = widgetOrderGalleryPostingItemBinding.titleTv;
            Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
            TextViewExtKt.setTextOrGone(titleTv, postingVO.getTitle());
            TextView descriptionTv = widgetOrderGalleryPostingItemBinding.descriptionTv;
            Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
            TextViewExtKt.setTextOrGone(descriptionTv, postingVO.getDescription());
            TextView hintTv = widgetOrderGalleryPostingItemBinding.hintTv;
            Intrinsics.checkNotNullExpressionValue(hintTv, "hintTv");
            TextViewExtKt.setTextOrGone(hintTv, postingVO.getHint());
            if (postingVO.getImage() != null) {
                ImageView imageIv = widgetOrderGalleryPostingItemBinding.imageIv;
                Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
                ImageViewExtKt.loadWithPlaceholder(imageIv, postingVO.getImage());
                ImageView imageIv2 = widgetOrderGalleryPostingItemBinding.imageIv;
                Intrinsics.checkNotNullExpressionValue(imageIv2, "imageIv");
                ViewExtKt.show(imageIv2);
            } else {
                ImageView imageIv3 = widgetOrderGalleryPostingItemBinding.imageIv;
                Intrinsics.checkNotNullExpressionValue(imageIv3, "imageIv");
                ViewExtKt.gone(imageIv3);
            }
            List<GalleryRequest.GalleryItem> imageUrls = postingVO.getImageUrls();
            if (imageUrls != null) {
                widgetOrderGalleryPostingItemBinding.imageIv.setOnClickListener(new a(this, widgetOrderGalleryPostingItemBinding, imageUrls, 0));
            } else {
                widgetOrderGalleryPostingItemBinding.imageIv.setOnClickListener(null);
            }
            ImageView zoomIv = widgetOrderGalleryPostingItemBinding.zoomIv;
            Intrinsics.checkNotNullExpressionValue(zoomIv, "zoomIv");
            ImageViewExtKt.loadImageOrGone(zoomIv, postingVO.getIconImage());
            TextView descriptionTitleTv = widgetOrderGalleryPostingItemBinding.descriptionTitleTv;
            Intrinsics.checkNotNullExpressionValue(descriptionTitleTv, "descriptionTitleTv");
            TextViewExtKt.setTextOrGone(descriptionTitleTv, postingVO.getDescriptionTitle());
            OrderGalleryVO.CopyItemVO copyItem = postingVO.getCopyItem();
            if (copyItem != null) {
                AppCompatImageView copyIcon = widgetOrderGalleryPostingItemBinding.copyIcon;
                Intrinsics.checkNotNullExpressionValue(copyIcon, "copyIcon");
                ViewExtKt.show(copyIcon);
                AppCompatImageView copyIcon2 = widgetOrderGalleryPostingItemBinding.copyIcon;
                Intrinsics.checkNotNullExpressionValue(copyIcon2, "copyIcon");
                ImageViewExtKt.load$default(copyIcon2, copyItem.getIcon(), null, null, null, null, false, null, 126, null);
            } else {
                AppCompatImageView copyIcon3 = widgetOrderGalleryPostingItemBinding.copyIcon;
                Intrinsics.checkNotNullExpressionValue(copyIcon3, "copyIcon");
                ViewExtKt.gone(copyIcon3);
            }
            ButtonV3Atom.LargeButton downloadAction = postingVO.getDownloadAction();
            if (downloadAction == null) {
                LargeButtonView downloadActionLBV = widgetOrderGalleryPostingItemBinding.downloadActionLBV;
                Intrinsics.checkNotNullExpressionValue(downloadActionLBV, "downloadActionLBV");
                ViewExtKt.gone(downloadActionLBV);
            } else {
                LargeButtonView downloadActionLBV2 = widgetOrderGalleryPostingItemBinding.downloadActionLBV;
                Intrinsics.checkNotNullExpressionValue(downloadActionLBV2, "downloadActionLBV");
                LargeButtonHolderKt.bind(downloadActionLBV2, downloadAction, this.actionHandler);
                LargeButtonView downloadActionLBV3 = widgetOrderGalleryPostingItemBinding.downloadActionLBV;
                Intrinsics.checkNotNullExpressionValue(downloadActionLBV3, "downloadActionLBV");
                ViewExtKt.show(downloadActionLBV3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PostingsAdapter(@NotNull Function0<? extends c> customActionHandlersStoreProvider, @NotNull ComposerReferences composerReferences, @NotNull k<OrderGalleryVO> widgetViewHolder) {
        super(new PostingItemCallback());
        Intrinsics.checkNotNullParameter(customActionHandlersStoreProvider, "customActionHandlersStoreProvider");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.customActionHandlersStoreProvider = customActionHandlersStoreProvider;
        this.composerReferences = composerReferences;
        this.widgetViewHolder = widgetViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PostingVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OrderGalleryVO.PostingVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PostingVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetOrderGalleryPostingItemBinding inflate = WidgetOrderGalleryPostingItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.f(inflate);
        return new PostingVH(inflate, this.customActionHandlersStoreProvider, this.composerReferences, this.widgetViewHolder);
    }
}
