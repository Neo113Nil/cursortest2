package ru.ozon.app.android.sellerproducts.header;

import CC.a;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.common.skuBackgroundDelegate.BackgroundDelegate;
import ru.ozon.app.android.sellerproducts.databinding.ItemSellerProductHeaderBinding;
import ru.ozon.app.android.sellerproducts.header.model.HeaderVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/sellerproducts/header/HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/sellerproducts/header/model/HeaderVO;", "", "Lru/ozon/app/android/sellerproducts/databinding/ItemSellerProductHeaderBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Lru/ozon/app/android/sellerproducts/databinding/ItemSellerProductHeaderBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/sellerproducts/header/model/HeaderVO;Ll20/d;)V", "", "", "gradientColors", "bindBackground", "(Ljava/util/List;)V", "Lru/ozon/app/android/sellerproducts/databinding/ItemSellerProductHeaderBinding;", "getBinding", "()Lru/ozon/app/android/sellerproducts/databinding/ItemSellerProductHeaderBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeaderViewHolder extends k<HeaderVO> {
    private final /* synthetic */ BackgroundDelegate $$delegate_0;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemSellerProductHeaderBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HeaderViewHolder(@NotNull ItemSellerProductHeaderBinding binding, @NotNull ComposerReferences ref) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        this.$$delegate_0 = new BackgroundDelegate(constraintLayout2);
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        binding.getConstraintLayout().setOnClickListener(new a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(HeaderViewHolder headerViewHolder, View view) {
        AtomActionDTO action;
        HeaderVO boundedData = headerViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        headerViewHolder.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, boundedData.getTrackingInfo()));
    }

    public void bindBackground(@NotNull List<String> gradientColors) {
        Intrinsics.checkNotNullParameter(gradientColors, "gradientColors");
        this.$$delegate_0.bindBackground(gradientColors);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindBackground(item.getBackgroundGradient());
        TextAtomView headerTitleTa = this.binding.headerTitleTa;
        Intrinsics.checkNotNullExpressionValue(headerTitleTa, "headerTitleTa");
        TextAtomHolderKt.bind$default(headerTitleTa, item.getTitle(), null, 2, null);
        TextAtomView headerSubtitleTa = this.binding.headerSubtitleTa;
        Intrinsics.checkNotNullExpressionValue(headerSubtitleTa, "headerSubtitleTa");
        TextAtomHolderKt.bindOrGone$default(headerSubtitleTa, item.getSubtitle(), null, 2, null);
        SmallBorderlessButtonView headerLinkTa = this.binding.headerLinkTa;
        Intrinsics.checkNotNullExpressionValue(headerLinkTa, "headerLinkTa");
        WrappedBorderlessButtonHolderKt.bindOrGone(headerLinkTa, item.getSmallBorderlessButton(), this.actionHandler);
    }
}
