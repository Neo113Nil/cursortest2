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
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeView;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataTopView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTv", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getSubtitleLayout", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "inputView", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "getInputView", "()Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeView;", "disclaimerView", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "getDisclaimerView", "()Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealDataTopView extends ConstraintLayout {

    @NotNull
    private final DisclaimerView disclaimerView;

    @NotNull
    private final InputMoleculeView inputView;

    @NotNull
    private final VerticalAtomsLayout subtitleLayout;

    @NotNull
    private final TextAtomV2View titleTv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int titleId = View.generateViewId();
    private static final int subtitleId = View.generateViewId();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataTopView$Companion;", "", "<init>", "()V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SecureDealDataTopView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final DisclaimerView getDisclaimerView() {
        return this.disclaimerView;
    }

    @NotNull
    public final InputMoleculeView getInputView() {
        return this.inputView;
    }

    @NotNull
    public final VerticalAtomsLayout getSubtitleLayout() {
        return this.subtitleLayout;
    }

    @NotNull
    public final TextAtomV2View getTitleTv() {
        return this.titleTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureDealDataTopView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        int i12 = titleId;
        ConstraintLayout.b d11 = b.d(textAtomV2View, i12, 0, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDp16();
        d11.setMarginStart(dimens.getDp16());
        d11.setMarginEnd(dimens.getDp16());
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTv = textAtomV2View;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        int i13 = subtitleId;
        verticalAtomsLayout.setId(i13);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41638j = i12;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDp4();
        bVar.setMarginStart(dimens.getDp16());
        bVar.setMarginEnd(dimens.getDp16());
        verticalAtomsLayout.setLayoutParams(bVar);
        verticalAtomsLayout.setAdapter(new AtomsAdapter(null, null, null, null, 15, null));
        this.subtitleLayout = verticalAtomsLayout;
        InputMoleculeView inputMoleculeView = new InputMoleculeView(context, null, 0, 6, null);
        inputMoleculeView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = i13;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = dimens.getDp12();
        bVar2.setMarginStart(dimens.getDp16());
        bVar2.setMarginEnd(dimens.getDp16());
        bVar2.f41660x = dimens.getDp12();
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = dimens.getDp16();
        inputMoleculeView.setLayoutParams(bVar2);
        inputMoleculeView.setVisibility(8);
        this.inputView = inputMoleculeView;
        DisclaimerView disclaimerView = new DisclaimerView(context, null, 0, 0, 14, null);
        disclaimerView.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = dimens.getDp12();
        bVar3.setMarginStart(dimens.getDp16());
        bVar3.setMarginEnd(dimens.getDp16());
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = dimens.getDp16();
        bVar3.f41638j = i13;
        bVar3.f41642l = 0;
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        disclaimerView.setLayoutParams(bVar3);
        disclaimerView.setVisibility(8);
        this.disclaimerView = disclaimerView;
        addView(textAtomV2View);
        addView(verticalAtomsLayout);
        addView(inputMoleculeView);
        addView(disclaimerView);
    }
}
