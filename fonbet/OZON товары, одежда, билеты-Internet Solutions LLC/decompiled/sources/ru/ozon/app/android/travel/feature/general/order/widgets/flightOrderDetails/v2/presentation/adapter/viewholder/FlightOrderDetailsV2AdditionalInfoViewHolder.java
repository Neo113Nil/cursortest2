package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder;

import Nh.b;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder;
import ru.ozon.app.android.travel.utils.delegate.DefaultPreCreationViewPoolDelegateAtomsFactory;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ+\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/FlightOrderDetailsV2AdditionalInfoViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/viewholder/api/FlightOrderDetailsV2ViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment$AdditionalInfo;", "view", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindTyped", "", "segment", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindTyped-7S-_ZFw", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lkotlin/jvm/functions/Function1;)V", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2AdditionalInfoViewHolder extends FlightOrderDetailsV2ViewHolder<FlightOrderDetailsV2VO.Segment.AdditionalInfo> {
    public static final int $stable = TextAtomView.$stable;

    @NotNull
    private final TextAtomView view;

    private FlightOrderDetailsV2AdditionalInfoViewHolder(TextAtomView textAtomView) {
        super(textAtomView);
        this.view = textAtomView;
    }

    @Override // ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.viewholder.api.FlightOrderDetailsV2ViewHolder
    public /* bridge */ /* synthetic */ void bindTyped(FlightOrderDetailsV2VO.Segment.AdditionalInfo additionalInfo, Function1 function1) {
        m1306bindTyped7S_ZFw(additionalInfo.getAdditionalInfo(), function1);
    }

    /* renamed from: bindTyped-7S-_ZFw, reason: not valid java name */
    protected void m1306bindTyped7S_ZFw(@NotNull TextAtom segment, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextAtomHolderKt.bind$default(this.view, segment, null, 2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FlightOrderDetailsV2AdditionalInfoViewHolder(@NotNull Context context) {
        this(r0);
        Context context2;
        KeyEvent.Callback indicatorView;
        KeyEvent.Callback appCompatTextView;
        Intrinsics.checkNotNullParameter(context, "context");
        KeyEvent.Callback i11 = q.f64554a.i(N.b(TextAtomView.class), context);
        if (i11 == null) {
            new DefaultPreCreationViewPoolDelegateAtomsFactory();
            d b11 = N.b(TextAtomView.class);
            if (b11.equals(N.b(TextAtomView.class))) {
                appCompatTextView = new TextAtomView(context, null, 0, 6, null);
                context2 = context;
            } else {
                context2 = context;
                if (b11.equals(N.b(SmallIconButtonView.class))) {
                    indicatorView = new SmallIconButtonView(context2, null, 0, 6, null);
                } else if (b11.equals(N.b(PriceView.class))) {
                    indicatorView = new PriceView(context2, null, 0, 6, null);
                } else if (b11.equals(N.b(SingleAtom.class))) {
                    indicatorView = new SingleAtom(context2, null, 0, 0, 14, null);
                } else if (b11.equals(N.b(TextAtomV2View.class))) {
                    indicatorView = new TextAtomV2View(context2, null, 0, 6, null);
                } else if (b11.equals(N.b(PriceAtomView.class))) {
                    indicatorView = new PriceAtomView(context2, null, 0, 6, null);
                } else if (b11.equals(N.b(CellView.class))) {
                    indicatorView = new CellView(context2, null, 0, 0, null, 30, null);
                } else if (b11.equals(N.b(IconView.class))) {
                    indicatorView = new IconView(context2, null, 0, 6, null);
                } else if (b11.equals(N.b(Image.class))) {
                    indicatorView = new Image(context2, null, 0, 6, null);
                } else if (b11.equals(N.b(BadgeView.class))) {
                    indicatorView = new BadgeView(context2, null, 0, 0, 14, null);
                } else if (b11.equals(N.b(AppCompatImageView.class))) {
                    appCompatTextView = new AppCompatImageView(context2);
                } else if (b11.equals(N.b(SmallButtonView.class))) {
                    indicatorView = new SmallButtonView(context2, null, 0, 6, null);
                } else if (b11.equals(N.b(IconButtonV3View.class))) {
                    indicatorView = new IconButtonV3View(context2, null, 0, 0, 14, null);
                } else if (b11.equals(N.b(ButtonV3View.class))) {
                    indicatorView = new ButtonV3View(context2, null, 0, 0, 14, null);
                } else if (b11.equals(N.b(DisclaimerContainer.class))) {
                    indicatorView = new DisclaimerContainer(context2, null, 0, 6, null);
                } else if (b11.equals(N.b(TagButtonView.class))) {
                    indicatorView = new TagButtonView(context2, null, 0, 0, 14, null);
                } else if (b11.equals(N.b(AppCompatTextView.class))) {
                    appCompatTextView = new AppCompatTextView(context2);
                } else if (b11.equals(N.b(DisclaimerView.class))) {
                    indicatorView = new DisclaimerView(context2, null, 0, 0, 14, null);
                } else if (b11.equals(N.b(IndicatorView.class))) {
                    indicatorView = new IndicatorView(context2, null, 0, 0, 14, null);
                } else {
                    throw b.b(b11);
                }
                appCompatTextView = indicatorView;
            }
            i11 = (TextAtomView) appCompatTextView;
        } else {
            context2 = context;
        }
        TextAtomView textAtomView = (TextAtomView) i11;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(12, context2);
        textAtomView.setLayoutParams(layoutParams);
    }
}
