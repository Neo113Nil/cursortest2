package ru.ozon.app.android.checkoutcomposer.deliveryQuantity.presentation;

import XU.a;
import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0014\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2*\b\u0002\u0010\u0010\u001a$\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/presentation/DeliverySwitchButtonsLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/DeliveryQuantityVO$Selector$SelectorElement;", "buttonsList", "Lkotlin/Function2;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "onSelected", "selectedColor", "Lru/ozon/app/android/utils/AppType;", "appType", "createItems", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lru/ozon/app/android/utils/AppType;)V", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliverySwitchButtonsLayout extends LinearLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float DELIVERY_SWITCH_BUTTON_CORNER_RADIUS = UiExtKt.toPxF(11);
    private static final float DELIVERY_SWITCH_BUTTON_CORNER_RADIUS_SELECT = UiExtKt.toPxF(22);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/deliveryQuantity/presentation/DeliverySwitchButtonsLayout$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySwitchButtonsLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        setGravity(16);
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createItems$lambda$5$lambda$3(Function2 function2, DeliveryQuantityVO.Selector.SelectorElement selectorElement, View view) {
        if (function2 != null) {
            String link = selectorElement.getAction().getLink();
            Intrinsics.f(link);
            function2.invoke(link, selectorElement.getTrackingInfo());
        }
    }

    public final void createItems(@NotNull List<DeliveryQuantityVO.Selector.SelectorElement> buttonsList, Function2<? super String, ? super Map<String, TokenizedTrackingInfo>, Unit> onSelected, @NotNull String selectedColor, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(buttonsList, "buttonsList");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(appType, "appType");
        removeAllViews();
        int i11 = 0;
        for (Object obj : buttonsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            DeliveryQuantityVO.Selector.SelectorElement selectorElement = (DeliveryQuantityVO.Selector.SelectorElement) obj;
            View h11 = q.f64554a.h(R$layout.delivery_switch_btn);
            if (h11 != null) {
                h11.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                addView(h11);
            } else {
                View.inflate(getContext(), R$layout.delivery_switch_btn, this);
            }
            View childAt = getChildAt(i11);
            Intrinsics.g(childAt, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) childAt;
            constraintLayout.setActivated(selectorElement.getIsSelected());
            TextAtomV2View textAtomV2View = (TextAtomV2View) constraintLayout.findViewById(R$id.switchTitle);
            textAtomV2View.setActivated(selectorElement.getIsSelected());
            TextHolderKt.bindOrGone$default(textAtomV2View, selectorElement.getTitle(), null, 2, null);
            textAtomV2View.setTextIsSelectable(false);
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) constraintLayout.findViewById(R$id.switchSubtitle);
            textAtomV2View2.setActivated(selectorElement.getIsSelected());
            TextHolderKt.bindOrGone$default(textAtomV2View2, selectorElement.getSubtitle(), null, 2, null);
            textAtomV2View2.setTextIsSelectable(false);
            if (selectorElement.getIsSelected()) {
                PaintDrawable paintDrawable = new PaintDrawable();
                float f7 = appType == AppType.SELECT ? DELIVERY_SWITCH_BUTTON_CORNER_RADIUS_SELECT : DELIVERY_SWITCH_BUTTON_CORNER_RADIUS;
                Paint paint = paintDrawable.getPaint();
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                paint.setColor(styleParser.parseColor(context, selectedColor, R.color.transparent));
                paintDrawable.setCornerRadius(f7);
                constraintLayout.setBackground(paintDrawable);
            } else {
                constraintLayout.setOnClickListener(new a(2, onSelected, selectorElement));
            }
            if (!selectorElement.getIsSelected() && C7714v.Q(i12, buttonsList) != null && !buttonsList.get(i12).getIsSelected()) {
                constraintLayout.findViewById(R$id.switchSeparator).setVisibility(0);
            }
            i11 = i12;
        }
    }
}
