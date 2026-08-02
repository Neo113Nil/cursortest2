package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.view;

import Bi.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CmlCellListView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataCardsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardsTitleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getCardsTitleTv", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "cardsSubtitleLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getCardsSubtitleLayout", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "cellListView", "Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListView;", "getCellListView", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/presenation/CmlCellListView;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealDataCardsView extends ConstraintLayout {

    @NotNull
    private final VerticalAtomsLayout cardsSubtitleLayout;

    @NotNull
    private final TextAtomV2View cardsTitleTv;

    @NotNull
    private final CmlCellListView cellListView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int titleId = View.generateViewId();
    private static final int subtitleId = View.generateViewId();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataCardsView$Companion;", "", "<init>", "()V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SecureDealDataCardsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final VerticalAtomsLayout getCardsSubtitleLayout() {
        return this.cardsSubtitleLayout;
    }

    @NotNull
    public final TextAtomV2View getCardsTitleTv() {
        return this.cardsTitleTv;
    }

    @NotNull
    public final CmlCellListView getCellListView() {
        return this.cellListView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureDealDataCardsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        int i12 = titleId;
        ConstraintLayout.b d11 = b.d(textAtomV2View, i12, -1, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDp16();
        d11.setMarginStart(dimens.getDp16());
        d11.setMarginEnd(dimens.getDp16());
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.cardsTitleTv = textAtomV2View;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        int i13 = subtitleId;
        verticalAtomsLayout.setId(i13);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.f41638j = i12;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDp4();
        bVar.setMarginStart(dimens.getDp16());
        bVar.setMarginEnd(dimens.getDp16());
        bVar.f41660x = dimens.getDp16();
        verticalAtomsLayout.setLayoutParams(bVar);
        verticalAtomsLayout.setAdapter(new AtomsAdapter(null, null, null, null, 15, null));
        this.cardsSubtitleLayout = verticalAtomsLayout;
        CmlCellListView cmlCellListView = new CmlCellListView(context, null, 0, 6, null);
        cmlCellListView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-1, -2);
        bVar2.f41638j = i13;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = dimens.getDp12();
        cmlCellListView.setLayoutParams(bVar2);
        cmlCellListView.setItemAnimator(null);
        this.cellListView = cmlCellListView;
        addView(textAtomV2View);
        addView(verticalAtomsLayout);
        addView(cmlCellListView);
    }
}
