package ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.view;

import Nh.b;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
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
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "T", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$5 extends AbstractC7737t implements Function0<Image> {
    final /* synthetic */ View $this_preCreationViewPool$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$5(View view) {
        super(0);
        this.$this_preCreationViewPool$inlined = view;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Image invoke() {
        KeyEvent.Callback indicatorView;
        new DefaultPreCreationViewPoolDelegateAtomsFactory();
        Context context = this.$this_preCreationViewPool$inlined.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d b11 = N.b(Image.class);
        if (b11.equals(N.b(TextAtomView.class))) {
            indicatorView = new TextAtomView(context, null, 0, 6, null);
        } else if (b11.equals(N.b(SmallIconButtonView.class))) {
            indicatorView = new SmallIconButtonView(context, null, 0, 6, null);
        } else if (b11.equals(N.b(PriceView.class))) {
            indicatorView = new PriceView(context, null, 0, 6, null);
        } else if (b11.equals(N.b(SingleAtom.class))) {
            indicatorView = new SingleAtom(context, null, 0, 0, 14, null);
        } else if (b11.equals(N.b(TextAtomV2View.class))) {
            indicatorView = new TextAtomV2View(context, null, 0, 6, null);
        } else if (b11.equals(N.b(PriceAtomView.class))) {
            indicatorView = new PriceAtomView(context, null, 0, 6, null);
        } else if (b11.equals(N.b(CellView.class))) {
            indicatorView = new CellView(context, null, 0, 0, null, 30, null);
        } else if (b11.equals(N.b(IconView.class))) {
            indicatorView = new IconView(context, null, 0, 6, null);
        } else if (b11.equals(N.b(Image.class))) {
            indicatorView = new Image(context, null, 0, 6, null);
        } else if (b11.equals(N.b(BadgeView.class))) {
            indicatorView = new BadgeView(context, null, 0, 0, 14, null);
        } else if (b11.equals(N.b(AppCompatImageView.class))) {
            indicatorView = new AppCompatImageView(context);
        } else if (b11.equals(N.b(SmallButtonView.class))) {
            indicatorView = new SmallButtonView(context, null, 0, 6, null);
        } else if (b11.equals(N.b(IconButtonV3View.class))) {
            indicatorView = new IconButtonV3View(context, null, 0, 0, 14, null);
        } else if (b11.equals(N.b(ButtonV3View.class))) {
            indicatorView = new ButtonV3View(context, null, 0, 0, 14, null);
        } else if (b11.equals(N.b(DisclaimerContainer.class))) {
            indicatorView = new DisclaimerContainer(context, null, 0, 6, null);
        } else if (b11.equals(N.b(TagButtonView.class))) {
            indicatorView = new TagButtonView(context, null, 0, 0, 14, null);
        } else if (b11.equals(N.b(AppCompatTextView.class))) {
            indicatorView = new AppCompatTextView(context);
        } else if (b11.equals(N.b(DisclaimerView.class))) {
            indicatorView = new DisclaimerView(context, null, 0, 0, 14, null);
        } else {
            if (!b11.equals(N.b(IndicatorView.class))) {
                throw b.b(b11);
            }
            indicatorView = new IndicatorView(context, null, 0, 0, 14, null);
        }
        return (Image) indicatorView;
    }
}
