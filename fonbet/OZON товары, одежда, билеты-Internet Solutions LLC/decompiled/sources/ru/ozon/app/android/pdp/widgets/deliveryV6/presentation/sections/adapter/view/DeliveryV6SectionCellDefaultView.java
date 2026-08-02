package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.view;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/view/DeliveryV6SectionCellDefaultView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/widget/TextView;", "textView", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "", "textColor", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "colorDisabledAsEnabled", "", "bindText", "(Landroid/widget/TextView;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Z)V", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$CellDefault;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem$CellDefault;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "deliveryTitle$delegate", "LSc/j;", "getDeliveryTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "deliveryTitle", "deliverySubtitle$delegate", "getDeliverySubtitle", "deliverySubtitle", "Landroid/widget/ImageView;", "deliveryDisclosureIcon$delegate", "getDeliveryDisclosureIcon", "()Landroid/widget/ImageView;", "deliveryDisclosureIcon", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionCellDefaultView extends ConstraintLayout {

    /* renamed from: deliveryDisclosureIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j deliveryDisclosureIcon;

    /* renamed from: deliverySubtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j deliverySubtitle;

    /* renamed from: deliveryTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j deliveryTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6SectionCellDefaultView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.deliveryTitle = k.b(new DeliveryV6SectionCellDefaultView$deliveryTitle$2(context));
        this.deliverySubtitle = k.b(new DeliveryV6SectionCellDefaultView$deliverySubtitle$2(context));
        this.deliveryDisclosureIcon = k.b(new DeliveryV6SectionCellDefaultView$deliveryDisclosureIcon$2(context));
        setBackgroundColor(context.getColor(R$color.layer_floor_1));
        addView(getDeliveryTitle());
        addView(getDeliverySubtitle());
        addView(getDeliveryDisclosureIcon());
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(dVar, getDeliveryTitle(), getDeliverySubtitle());
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, getDeliveryTitle(), getDeliveryDisclosureIcon());
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, getDeliveryTitle());
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, getDeliveryTitle());
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, getDeliverySubtitle());
        ConstraintSetExtKt.layoutConstraintEndToEndOf(dVar, getDeliverySubtitle(), getDeliveryTitle());
        ConstraintSetExtKt.layoutConstraintStartToStartOf(dVar, getDeliverySubtitle(), getDeliveryTitle());
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, getDeliverySubtitle(), getDeliveryTitle());
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, getDeliveryDisclosureIcon());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, getDeliveryDisclosureIcon());
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, getDeliveryDisclosureIcon(), getDeliveryTitle());
        dVar.f(this);
    }

    private final void bindText(TextView textView, OzonSpannableString text, String textColor, AtomActionDTO action, boolean colorDisabledAsEnabled) {
        if (text == null) {
            ViewExtKt.gone(textView);
            return;
        }
        ViewExtKt.show(textView);
        textView.setText(text);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        if (!OzonSpannableStringKt.hasClickableSpan(text)) {
            linkMovementMethod = null;
        }
        textView.setMovementMethod(linkMovementMethod);
        if (action != null || colorDisabledAsEnabled) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setLinkTextColor(ThemeExtKt.themeColor(context, R$attr.textAction));
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView.setTextColor(styleParser.parseColor(context2, textColor, R$color.text_primary));
        }
    }

    private final ImageView getDeliveryDisclosureIcon() {
        return (ImageView) this.deliveryDisclosureIcon.getValue();
    }

    private final TextAtomV2View getDeliverySubtitle() {
        return (TextAtomV2View) this.deliverySubtitle.getValue();
    }

    private final TextAtomV2View getDeliveryTitle() {
        return (TextAtomV2View) this.deliveryTitle.getValue();
    }

    public final void bind(@NotNull DeliveryV6SectionItem.CellDefault item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell = item.getCell();
        bindText(getDeliveryTitle(), cell.getTitle(), cell.getTitleColor(), cell.getAction(), cell.getColorDisabledAsEnabled());
        bindText(getDeliverySubtitle(), cell.getSubtitle(), cell.getSubtitleColor(), cell.getAction(), cell.getColorDisabledAsEnabled());
        getDeliveryDisclosureIcon().setVisibility(cell.getHideDisclosure() ? 8 : 0);
    }
}
