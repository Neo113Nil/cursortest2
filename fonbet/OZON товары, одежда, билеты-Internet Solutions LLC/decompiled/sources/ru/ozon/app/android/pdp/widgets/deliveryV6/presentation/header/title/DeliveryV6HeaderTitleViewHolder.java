package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.header.title;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/header/title/DeliveryV6HeaderTitleViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Header$Title;", "view", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/composer/ComposerReferences;)V", "bind", "", "item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6HeaderTitleViewHolder extends TabEmbeddedWidgetViewHolder<DeliveryV6VO.Header.Title> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6HeaderTitleViewHolder(@NotNull TextAtomV2View view, @NotNull ComposerReferences composerReferences) {
        super(view, composerReferences, null, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.view = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r8 != (r1 != null ? r1.bottomMargin : 0)) goto L53;
     */
    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull DeliveryV6VO.Header.Title item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomV2View textAtomV2View = this.view;
        boolean z11 = item.getViewDTO() != null;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = z11 ? -2 : 0;
        layoutParams.height = i12;
        if (i11 != i12) {
            textAtomV2View.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            int i13 = marginLayoutParams.leftMargin;
            int i14 = marginLayoutParams.topMargin;
            int i15 = marginLayoutParams.rightMargin;
            int i16 = marginLayoutParams.bottomMargin;
            marginLayoutParams.topMargin = z11 ? SellerV4DisclosureViewFactory.INSTANCE.getDp12() : 0;
            marginLayoutParams.bottomMargin = z11 ? SellerV4DisclosureViewFactory.INSTANCE.getDp16() : 0;
            if (i13 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams3 = textAtomV2View.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i14 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = textAtomV2View.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i15 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams5 = textAtomV2View.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    }
                }
            }
            textAtomV2View.setLayoutParams(marginLayoutParams);
        }
        TextHolderKt.bindOrGone$default(textAtomV2View, item.getViewDTO(), null, 2, null);
    }
}
