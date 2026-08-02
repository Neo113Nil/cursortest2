package ru.ozon.app.android.ugc.core.widgets.singlereview.buttons;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.holders.ButtonBaseAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ButtonsVO;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$layout;
import ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.di.SingleReviewButtonsComponent;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.ButtonIconAtom;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonIcon;

@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001)\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00020\u000ej\u0002`\u000f2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R2\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR \u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/buttons/ButtonsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/buttons/di/SingleReviewButtonsComponent;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/buttons/ButtonsViewHolder;", "holderProducer", "getHolderProducer", "", "Lru/ozon/uni/atoms/af/Atom$ConfCondition;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "leftButtonConfigs", "Ljava/util/Map;", "rightButtonConfigs", "ru/ozon/app/android/ugc/core/widgets/singlereview/buttons/ButtonsViewMapper$buttonsDecorator$1", "buttonsDecorator", "Lru/ozon/app/android/ugc/core/widgets/singlereview/buttons/ButtonsViewMapper$buttonsDecorator$1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonsViewMapper extends WidgetViewMapper2<SingleReviewButtonsComponent, ButtonsVO, ButtonsVO> {
    private final int layout = R$layout.item_single_review_buttons;

    @NotNull
    private final Function2<ButtonsVO, d, List<ButtonsVO>> mapper = ButtonsViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, ButtonsViewHolder> holderProducer = new ButtonsViewMapper$holderProducer$1(this);

    @NotNull
    private final Map<Atom.ConfCondition, Atom.AtomConfiguration> leftButtonConfigs = U.j(new Pair(new Atom.ConfCondition(ButtonIcon.class, null, 2, null), new ButtonIconAtom.Configuration(0, 0, 0, 0, 32, null, 32, null)), new Pair(new Atom.ConfCondition(CommonButton.ButtonBlueSmall.class, null, 2, null), new ButtonBaseAtom.Configuration(0, 0, 0, 0, false, 0, new ButtonBaseAtom.InnerPaddings(12, 12, 0, 0, 12, null), 48, null)));

    @NotNull
    private final Map<Atom.ConfCondition, Atom.AtomConfiguration> rightButtonConfigs = U.j(new Pair(new Atom.ConfCondition(ButtonIcon.class, null, 2, null), new ButtonIconAtom.Configuration(0, 0, 0, 0, 24, null, 32, null)), new Pair(new Atom.ConfCondition(CommonButton.ButtonBorderlessSmall.class, null, 2, null), new ButtonBaseAtom.Configuration(0, 0, 0, 0, false, 0, new ButtonBaseAtom.InnerPaddings(0, 0, 0, 0, 12, null), 48, null)));

    @NotNull
    private final ButtonsViewMapper$buttonsDecorator$1 buttonsDecorator = new HorizontalAtomsDecorator() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.ButtonsViewMapper$buttonsDecorator$1
        @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
        public void decorate(Canvas canvas, Rect rect, int i11, boolean z11) {
            HorizontalAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
        }

        @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
        public LinearLayout.LayoutParams modifyHorizontalLayoutParams(LinearLayout.LayoutParams lp, AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            lp.setMarginEnd(!last ? Dimens.INSTANCE.getDP_8() : 0);
            return lp;
        }
    };

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ButtonsVO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ButtonsViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ButtonsVO, d, List<ButtonsVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SingleReviewButtonsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SingleReviewButtonsComponent.INSTANCE.create(storage);
    }
}
