package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.view;

import Lc.a;
import android.content.Context;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/CustomMethodView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/view/AbstractCardView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v4/presentation/TravelPaymentV4VO$CustomMethodVO;", "placeView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomMethodView extends AbstractCardView {
    public static final int $stable = TextAtomV2View.$stable | IconView.$stable;

    @NotNull
    private final IconView icon;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomMethodView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        if (iconView == null) {
            context2 = context;
            iconView = new IconView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        iconView.setId(R$id.travelPaymentV4CardIcon);
        iconView.setLayoutParams(new ConstraintLayout.b(getDp24(), getDp24()));
        iconView.setScaleType(ImageView.ScaleType.FIT_START);
        this.icon = iconView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        a.d(textAtomV2View, R$id.travelPaymentV4CardTitle, -2, -2, false);
        this.title = textAtomV2View;
        setLayoutParams(new ConstraintLayout.b(-2, getCardHeight()));
        setMinWidth(getCardWidth());
        setPadding(getDp14(), 0, getDp14(), getDp12());
        placeView();
    }

    private final void placeView() {
        addView(this.title);
        addView(this.icon);
        ConstraintLayoutExtKt.updateConstraints(this, new CustomMethodView$placeView$1(this));
        placeBadge();
    }

    public final void bind(@NotNull TravelPaymentV4VO.CustomMethodVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(this.title, item.getTitle(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.icon, item.getIcon(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(getBadge(), item.getBadge(), (Function1) null, 2, (Object) null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBorderColor(Integer.valueOf(styleParser.parseColor(context, item.getBorderColor(), UniColors.GRAPHIC_NEUTRAL.getResId())));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context2, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
    }
}
