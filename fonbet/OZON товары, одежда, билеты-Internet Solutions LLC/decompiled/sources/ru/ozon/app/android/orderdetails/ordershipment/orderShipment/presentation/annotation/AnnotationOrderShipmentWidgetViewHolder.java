package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.annotation;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.method.LinkMovementMethod;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.utils.CharSequenceExtensionKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.ItemOrderShipmentLayoutAnnotationBinding;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/annotation/AnnotationOrderShipmentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutAnnotationBinding;", "binding", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutAnnotationBinding;)V", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO$AnnotationButton;", "buttons", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "mapAnnotationButtonsColor", "(Ljava/util/List;)Ljava/util/List;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/ItemOrderShipmentLayoutAnnotationBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnnotationOrderShipmentWidgetViewHolder extends k<OrderShipmentItemVO.AnnotationVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemOrderShipmentLayoutAnnotationBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnnotationOrderShipmentWidgetViewHolder(@NotNull ComposerReferences refs, @NotNull ItemOrderShipmentLayoutAnnotationBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final List<ButtonV3Atom.SmallBorderlessButton> mapAnnotationButtonsColor(List<OrderShipmentItemVO.AnnotationVO.AnnotationButton> buttons) {
        if (buttons == null) {
            return null;
        }
        List<OrderShipmentItemVO.AnnotationVO.AnnotationButton> list = buttons;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (OrderShipmentItemVO.AnnotationVO.AnnotationButton annotationButton : list) {
            OzonSpannableString text = annotationButton.getButton().getText();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(new ButtonV3Atom.SmallBorderlessButton(OzonSpannableStringKt.toOzonSpannableString(CharSequenceExtensionKt.setColor(text, styleParser.parseColor(context, annotationButton.getTextColor(), R$color.text_action))), annotationButton.getButton().getAction(), null, null, null, annotationButton.getButton().getTrackingInfo(), false, 92, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderShipmentItemVO.AnnotationVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ItemOrderShipmentLayoutAnnotationBinding itemOrderShipmentLayoutAnnotationBinding = this.binding;
        itemOrderShipmentLayoutAnnotationBinding.textTv.setText(item.getText());
        itemOrderShipmentLayoutAnnotationBinding.textTv.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView = itemOrderShipmentLayoutAnnotationBinding.textTv;
        StyleParser styleParser = StyleParser.INSTANCE;
        textView.setTextColor(styleParser.parseColor(getContext(), item.getTextColor(), R$color.text_tertiary));
        itemOrderShipmentLayoutAnnotationBinding.textTv.setLinkTextColor(a.getColor(getContext(), R$color.text_action_on_dark));
        ImageView iconIv = itemOrderShipmentLayoutAnnotationBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageViewExtKt.load$default(iconIv, item.getIcon(), null, null, null, null, false, null, 126, null);
        itemOrderShipmentLayoutAnnotationBinding.iconIv.setColorFilter(styleParser.parseColor(getContext(), item.getIconColor(), R$color.graphic_accent_primary), PorterDuff.Mode.SRC_IN);
        itemOrderShipmentLayoutAnnotationBinding.cardContainerCl.setBackgroundColor(styleParser.parseColor(getContext(), item.getBackgroundColor(), R$color.layer_floor_1));
        HorizontalFlexAtomsLayout flexBoxButtons = itemOrderShipmentLayoutAnnotationBinding.flexBoxButtons;
        Intrinsics.checkNotNullExpressionValue(flexBoxButtons, "flexBoxButtons");
        ViewExtKt.gone(flexBoxButtons);
        RecyclerView buttonsRv = itemOrderShipmentLayoutAnnotationBinding.buttonsRv;
        Intrinsics.checkNotNullExpressionValue(buttonsRv, "buttonsRv");
        ViewExtKt.gone(buttonsRv);
        List<ButtonV3Atom.SmallBorderlessButton> mapAnnotationButtonsColor = mapAnnotationButtonsColor(item.getButtons());
        if (mapAnnotationButtonsColor != null && mapAnnotationButtonsColor.size() == 2) {
            AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
            atomsAdapter.setOnAction(this.actionHandler);
            itemOrderShipmentLayoutAnnotationBinding.flexBoxButtons.setAdapter(atomsAdapter);
            HorizontalFlexAtomsLayout flexBoxButtons2 = itemOrderShipmentLayoutAnnotationBinding.flexBoxButtons;
            Intrinsics.checkNotNullExpressionValue(flexBoxButtons2, "flexBoxButtons");
            ViewExtKt.show(flexBoxButtons2);
            atomsAdapter.bind(getContext(), mapAnnotationButtonsColor);
            return;
        }
        OrderShipmentAnnotationButtonsAdapter orderShipmentAnnotationButtonsAdapter = new OrderShipmentAnnotationButtonsAdapter(this.actionHandler);
        itemOrderShipmentLayoutAnnotationBinding.buttonsRv.setAdapter(orderShipmentAnnotationButtonsAdapter);
        if (mapAnnotationButtonsColor == null) {
            RecyclerView buttonsRv2 = itemOrderShipmentLayoutAnnotationBinding.buttonsRv;
            Intrinsics.checkNotNullExpressionValue(buttonsRv2, "buttonsRv");
            ViewExtKt.gone(buttonsRv2);
        } else {
            RecyclerView buttonsRv3 = itemOrderShipmentLayoutAnnotationBinding.buttonsRv;
            Intrinsics.checkNotNullExpressionValue(buttonsRv3, "buttonsRv");
            ViewExtKt.show(buttonsRv3);
            orderShipmentAnnotationButtonsAdapter.submitList(mapAnnotationButtonsColor);
        }
    }
}
