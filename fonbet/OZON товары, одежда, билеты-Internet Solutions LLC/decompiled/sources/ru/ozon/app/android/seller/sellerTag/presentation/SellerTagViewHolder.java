package ru.ozon.app.android.seller.sellerTag.presentation;

import Eq.b;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.ui.databinding.ItemSellerTransparencyTagBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/seller/sellerTag/presentation/SellerTagViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/seller/sellerTag/presentation/SellerTagVO;", "item", "bind", "(Lru/ozon/app/android/seller/sellerTag/presentation/SellerTagVO;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/ui/databinding/ItemSellerTransparencyTagBinding;", "binding", "Lru/ozon/app/android/marketing/ui/databinding/ItemSellerTransparencyTagBinding;", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SellerTagViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemSellerTransparencyTagBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SellerTagViewHolder(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.containerView = containerView;
        this.actionHandler = actionHandler;
        ItemSellerTransparencyTagBinding bind = ItemSellerTransparencyTagBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(SellerTagViewHolder sellerTagViewHolder, SellerTagVO sellerTagVO, View view) {
        sellerTagViewHolder.actionHandler.invoke(sellerTagVO.getAction());
    }

    public final void bind(@NotNull SellerTagVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemSellerTransparencyTagBinding itemSellerTransparencyTagBinding = this.binding;
        ImageView imageView = itemSellerTransparencyTagBinding.imageIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, item.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, item.getIcon().getTintColor()));
        TextAtomView textTav = itemSellerTransparencyTagBinding.textTav;
        Intrinsics.checkNotNullExpressionValue(textTav, "textTav");
        TextAtomHolderKt.bind$default(textTav, item.getText(), null, 2, null);
        itemSellerTransparencyTagBinding.tagCv.setOnClickListener(new b(2, this, item));
        itemSellerTransparencyTagBinding.getConstraintLayout().setContentDescription(item.getText().getText().toString());
        itemSellerTransparencyTagBinding.imageIv.setContentDescription(item.getIcon().getImage());
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }
}
