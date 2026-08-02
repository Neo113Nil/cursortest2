package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomButton", "Landroid/view/View;", "getBottomButton", "()Landroid/view/View;", "mainButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "secondaryButton", "bind", "", "item", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealButtonsView extends LinearLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int secondaryButtonBottomMargin = Dimens.INSTANCE.getDp4();

    @NotNull
    private final ButtonV3View mainButton;

    @NotNull
    private final ButtonV3View secondaryButton;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/buttons/SecureDealButtonsView$Companion;", "", "<init>", "()V", "secondaryButtonBottomMargin", "", "getSecondaryButtonBottomMargin", "()I", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSecondaryButtonBottomMargin() {
            return SecureDealButtonsView.secondaryButtonBottomMargin;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SecureDealButtonsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull SecureDealButtonsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bind(this.mainButton, item.getMainButton(), actionHandler);
        ButtonV3HolderKt.bindOrGone(this.secondaryButton, item.getSecondaryButton(), actionHandler);
    }

    @NotNull
    public final View getBottomButton() {
        ButtonV3View buttonV3View = this.secondaryButton;
        if (buttonV3View.getVisibility() != 0) {
            buttonV3View = null;
        }
        return buttonV3View != null ? buttonV3View : this.mainButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureDealButtonsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.topMargin = dimens.getDp16();
        layoutParams.setMarginStart(dimens.getDp16());
        layoutParams.setMarginEnd(dimens.getDp16());
        layoutParams.bottomMargin = dimens.getDp4();
        buttonV3View.setLayoutParams(layoutParams);
        this.mainButton = buttonV3View;
        ButtonV3View buttonV3View2 = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View2.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = dimens.getDp4();
        layoutParams2.setMarginStart(dimens.getDp16());
        layoutParams2.setMarginEnd(dimens.getDp16());
        layoutParams2.bottomMargin = secondaryButtonBottomMargin;
        buttonV3View2.setLayoutParams(layoutParams2);
        this.secondaryButton = buttonV3View2;
        setOrientation(1);
        setBackgroundColor(ResourceExtKt.color(context, R$color.layer_floor_1));
        addView(buttonV3View);
        addView(buttonV3View2);
    }
}
