package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.common.ext.DrawableExtKt;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CmlCellListView;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeView;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.SecureDealDataVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;", "item", "", "inputValue", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "cardActionHandler", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataTopView;", "topContainerView", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataTopView;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataCardsView;", "cardsContainerView", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataCardsView;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "getInputView", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "inputView", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealDataView extends ConstraintLayout {

    @NotNull
    private final SecureDealDataCardsView cardsContainerView;

    @NotNull
    private final SecureDealDataTopView topContainerView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int topContainerId = View.generateViewId();
    private static final float containerCornerRadius = Dimens.INSTANCE.getDp16();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataView$Companion;", "", "<init>", "()V", "", "NO_RADIUS", "F", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SecureDealDataView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull SecureDealDataVO item, String inputValue, @NotNull Function1<? super AtomAction, Unit> cardActionHandler) {
        List<TextDTO> cardsSubtitle;
        List<CellItem> cards;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(cardActionHandler, "cardActionHandler");
        SecureDealDataTopView secureDealDataTopView = this.topContainerView;
        TextHolderKt.bind$default(secureDealDataTopView.getTitleTv(), item.getTitle(), null, 2, null);
        AtomsAdapter adapter = secureDealDataTopView.getSubtitleLayout().getAdapter();
        if (adapter != null) {
            Context context = secureDealDataTopView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            List<TextDTO> subtitle = item.getSubtitle();
            if (subtitle == null) {
                subtitle = K.f71697a;
            }
            adapter.bind(context, subtitle);
        }
        InputMoleculeView inputView = secureDealDataTopView.getInputView();
        inputView.setVisibility(item.getTopBlockInput() != null ? 0 : 8);
        InputMoleculeVO topBlockInput = item.getTopBlockInput();
        if (topBlockInput != null) {
            inputView.bind(topBlockInput, inputValue);
        }
        DSDisclaimerHolderKt.bindOrGone$default(secureDealDataTopView.getDisclaimerView(), item.getTopBlockDisclaimer(), null, 2, null);
        SecureDealDataCardsView secureDealDataCardsView = this.cardsContainerView;
        TextHolderKt.bindOrGone$default(secureDealDataCardsView.getCardsTitleTv(), item.getCardsTitle(), null, 2, null);
        AtomsAdapter adapter2 = secureDealDataCardsView.getCardsSubtitleLayout().getAdapter();
        if (adapter2 != null) {
            Context context2 = secureDealDataCardsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            List<TextDTO> cardsSubtitle2 = item.getCardsSubtitle();
            if (cardsSubtitle2 == null) {
                cardsSubtitle2 = K.f71697a;
            }
            adapter2.bind(context2, cardsSubtitle2);
        }
        CmlCellListView cellListView = secureDealDataCardsView.getCellListView();
        List<CellItem> cards2 = item.getCards();
        cellListView.setVisibility(!(cards2 == null || cards2.isEmpty()) ? 0 : 8);
        List<CellItem> cards3 = item.getCards();
        if (cards3 == null) {
            cards3 = K.f71697a;
        }
        cellListView.bind(cards3, cardActionHandler);
        this.cardsContainerView.setVisibility((item.getCardsTitle() == null || (cardsSubtitle = item.getCardsSubtitle()) == null || cardsSubtitle.isEmpty() || (cards = item.getCards()) == null || cards.isEmpty()) ? false : true ? 0 : 8);
        Drawable background = this.topContainerView.getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        DrawableExtKt.setCornerRadius$default((GradientDrawable) background, 0.0f, 0.0f, this.cardsContainerView.getVisibility() == 0 ? containerCornerRadius : 0.0f, this.cardsContainerView.getVisibility() == 0 ? containerCornerRadius : 0.0f, 3, null);
    }

    @NotNull
    public final InputMoleculeView getInputView() {
        return this.topContainerView.getInputView();
    }

    public final void setRecycledViewPool(@NotNull RecyclerView.u pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.cardsContainerView.getCellListView().setRecycledViewPool(pool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureDealDataView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SecureDealDataTopView secureDealDataTopView = new SecureDealDataTopView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        int i14 = topContainerId;
        secureDealDataTopView.setId(i14);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        secureDealDataTopView.setLayoutParams(bVar);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ResourceExtKt.color(context, R$color.layer_floor_1));
        gradientDrawable.setShape(0);
        float f7 = containerCornerRadius;
        DrawableExtKt.setCornerRadius$default(gradientDrawable, 0.0f, 0.0f, f7, f7, 3, null);
        secureDealDataTopView.setBackground(gradientDrawable);
        this.topContainerView = secureDealDataTopView;
        SecureDealDataCardsView secureDealDataCardsView = new SecureDealDataCardsView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        secureDealDataCardsView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = i14;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = Dimens.INSTANCE.getDp8();
        secureDealDataCardsView.setLayoutParams(bVar2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(ResourceExtKt.color(context, R$color.layer_floor_1));
        gradientDrawable2.setShape(0);
        DrawableExtKt.setCornerRadius$default(gradientDrawable2, f7, f7, 0.0f, 0.0f, 12, null);
        secureDealDataCardsView.setBackground(gradientDrawable2);
        this.cardsContainerView = secureDealDataCardsView;
        addView(secureDealDataTopView);
        addView(secureDealDataCardsView);
        setBackgroundColor(ResourceExtKt.color(context, R$color.layer_floor_0));
    }
}
