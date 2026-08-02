package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.v3;

import CM.a;
import WZ.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewAviaSearchBonusToggleBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2(\u0010\u0012\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/view/v3/AviaSearchV3BonusToggleView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BonusToggleItem;", "item", "Lkotlin/Function3;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onBonusPayStateChangeListener", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BonusToggleItem;Lfd/n;)V", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewAviaSearchBonusToggleBinding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewAviaSearchBonusToggleBinding;", "dp16", "I", "", "dpf20", "F", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchV3BonusToggleView extends ConstraintLayoutWithBorder {

    @NotNull
    private final ViewAviaSearchBonusToggleBinding binding;
    private final int dp16;
    private final float dpf20;

    public /* synthetic */ AviaSearchV3BonusToggleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem bonusToggleItem, InterfaceC6511n interfaceC6511n, CompoundButton compoundButton, boolean z11) {
        interfaceC6511n.invoke(Boolean.valueOf(z11), bonusToggleItem.getAction(), z11 ? bonusToggleItem.getSetTrackingInfo() : bonusToggleItem.getUnsetTrackingInfo());
    }

    public final void bind(@NotNull AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem item, @NotNull InterfaceC6511n<? super Boolean, ? super AtomAction, ? super t, Unit> onBonusPayStateChangeListener) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onBonusPayStateChangeListener, "onBonusPayStateChangeListener");
        AppCompatImageView bonusPaymentIconAciv = this.binding.bonusPaymentIconAciv;
        Intrinsics.checkNotNullExpressionValue(bonusPaymentIconAciv, "bonusPaymentIconAciv");
        ImageViewExtKt.load$default(bonusPaymentIconAciv, item.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getIcon().getTintColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            AppCompatImageView bonusPaymentIconAciv2 = this.binding.bonusPaymentIconAciv;
            Intrinsics.checkNotNullExpressionValue(bonusPaymentIconAciv2, "bonusPaymentIconAciv");
            ThemeExtKt.tint(bonusPaymentIconAciv2, Integer.valueOf(intValue));
        }
        TextAtomView bonusPaymentTitleTav = this.binding.bonusPaymentTitleTav;
        Intrinsics.checkNotNullExpressionValue(bonusPaymentTitleTav, "bonusPaymentTitleTav");
        TextAtomHolderKt.bind$default(bonusPaymentTitleTav, item.getTitle(), null, 2, null);
        TextAtomView bonusPaymentSubtitleTav = this.binding.bonusPaymentSubtitleTav;
        Intrinsics.checkNotNullExpressionValue(bonusPaymentSubtitleTav, "bonusPaymentSubtitleTav");
        TextAtomHolderKt.bind$default(bonusPaymentSubtitleTav, item.getSubtitle(), null, 2, null);
        this.binding.bonusPaymentToggleSm.setOnCheckedChangeListener(null);
        this.binding.bonusPaymentToggleSm.setChecked(item.getIsBonusPay());
        this.binding.bonusPaymentToggleSm.setOnCheckedChangeListener(new a(0, item, onBonusPayStateChangeListener));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchV3BonusToggleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewAviaSearchBonusToggleBinding inflate = ViewAviaSearchBonusToggleBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        float pxF = ResourceExtKt.toPxF(20, context);
        this.dpf20 = pxF;
        setRadius(pxF);
        setPadding(px, 0, px, 0);
    }
}
