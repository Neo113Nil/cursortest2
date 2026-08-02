package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.view;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/view/TariffLuggageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp6", "", "dp12", "aspectAV", "Lru/ozon/uni/android/atom/aspect/AspectView;", "titleTV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTV", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TariffLuggageView extends ConstraintLayout {
    public static final int $stable = TextAtomV2View.$stable | AspectView.$stable;

    @NotNull
    private final AspectView aspectAV;
    private final int dp12;
    private final int dp6;

    @NotNull
    private final TextAtomV2View subtitleTV;

    @NotNull
    private final TextAtomV2View titleTV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffLuggageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp6 = UiExtKt.toPx(6, context);
        int px = UiExtKt.toPx(12, context);
        this.dp12 = px;
        AspectView aspectView = new AspectView(context, null, 0, 6, null);
        aspectView.setId(R$id.passengersLuggageSelectionTariffAspect);
        aspectView.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.aspectAV = aspectView;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View.setId(R$id.passengersLuggageSelectionTariffTitle);
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41616W = true;
        bVar.f41595B = px;
        textAtomV2View.setLayoutParams(bVar);
        this.titleTV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View2.setId(R$id.passengersLuggageSelectionTariffSubtitle);
        textAtomV2View2.setTextIsSelectable(false);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41616W = true;
        textAtomV2View2.setLayoutParams(bVar2);
        this.subtitleTV = textAtomV2View2;
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(this.aspectAV);
        addView(this.titleTV);
        addView(this.subtitleTV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new TariffLuggageView$setConstraints$1(this));
    }

    public final void bind(@NotNull PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        AspectHolderKt.bind(this.aspectAV, item.getAspect(), actionHandler);
        TextHolderKt.bind$default(this.titleTV, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTV, item.getSubtitle(), null, 2, null);
    }
}
