package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation.FlightOrderDetailsV4VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4LuggageView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp16", "iconIV", "Landroidx/appcompat/widget/AppCompatImageView;", "getIconIV", "()Landroidx/appcompat/widget/AppCompatImageView;", "iconIV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;", "bindOrGone", "dto", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4LuggageView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightOrderDetailsV4LuggageView.class, "iconIV", "getIconIV()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(FlightOrderDetailsV4LuggageView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private final int dp16;
    private final int dp4;

    /* renamed from: iconIV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconIV;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV4LuggageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconIV = new PreCreationViewPoolDelegate(context2, N.b(AppCompatImageView.class), new FlightOrderDetailsV4LuggageView$special$$inlined$preCreationViewPool$default$1(this), new FlightOrderDetailsV4LuggageView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new FlightOrderDetailsV4LuggageView$special$$inlined$preCreationViewPool$default$3(this), new FlightOrderDetailsV4LuggageView$special$$inlined$preCreationViewPool$default$4(this));
        setOrientation(0);
        addView(getIconIV());
        addView(getTitleTAV());
    }

    private final AppCompatImageView getIconIV() {
        return (AppCompatImageView) this.iconIV.getValue(this, $$delegatedProperties[0]);
    }

    private final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO.LuggageItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(getIconIV(), item.getIcon().getIcon(), null, null, null, null, false, null, 126, null);
        AppCompatImageView iconIV = getIconIV();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(iconIV, styleParser.parseColor(context, item.getIcon().getTintColor()));
        TextHolderKt.bind$default(getTitleTAV(), item.getTitle(), null, 2, null);
    }

    public final void bindOrGone(FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO.LuggageItemVO dto) {
        if (dto == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
            bind(dto);
        }
    }
}
