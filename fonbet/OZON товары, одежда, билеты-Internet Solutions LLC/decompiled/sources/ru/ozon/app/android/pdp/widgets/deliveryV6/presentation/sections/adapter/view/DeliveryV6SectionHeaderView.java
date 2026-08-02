package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6SectionHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$SectionHeader;", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$SectionHeader;)V", "Landroid/widget/ImageView;", "deliveryVariantIcon$delegate", "LSc/j;", "getDeliveryVariantIcon", "()Landroid/widget/ImageView;", "deliveryVariantIcon", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "deliveryVariantTitle$delegate", "getDeliveryVariantTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "deliveryVariantTitle", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionHeaderView extends LinearLayout {

    /* renamed from: deliveryVariantIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j deliveryVariantIcon;

    /* renamed from: deliveryVariantTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j deliveryVariantTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6SectionHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.deliveryVariantIcon = k.b(new DeliveryV6SectionHeaderView$deliveryVariantIcon$2(context));
        this.deliveryVariantTitle = k.b(new DeliveryV6SectionHeaderView$deliveryVariantTitle$2(context));
        setOrientation(0);
        addView(getDeliveryVariantIcon());
        addView(getDeliveryVariantTitle());
    }

    private final ImageView getDeliveryVariantIcon() {
        return (ImageView) this.deliveryVariantIcon.getValue();
    }

    private final TextAtomV2View getDeliveryVariantTitle() {
        return (TextAtomV2View) this.deliveryVariantTitle.getValue();
    }

    public final void bind(@NotNull DeliveryV6SectionItem.SectionHeader item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(getDeliveryVariantTitle(), item.getText(), null, 2, null);
        String icon = item.getIcon();
        if (icon != null) {
            ViewExtKt.show(getDeliveryVariantIcon());
            ImageViewExtKt.load$default(getDeliveryVariantIcon(), icon, null, null, null, null, false, null, 126, null);
        } else {
            ViewExtKt.invisible(getDeliveryVariantIcon());
        }
        String iconTint = item.getIconTint();
        if (iconTint == null) {
            getDeliveryVariantIcon().clearColorFilter();
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(getDeliveryVariantIcon(), styleParser.parseColor(context, iconTint));
    }
}
