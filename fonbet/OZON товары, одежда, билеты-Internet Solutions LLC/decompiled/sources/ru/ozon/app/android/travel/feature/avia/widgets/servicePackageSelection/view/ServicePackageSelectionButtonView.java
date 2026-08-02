package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.view;

import Im.a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.button.ServicePackageSelectionButtonVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013J\b\u0010\u0015\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/view/ServicePackageSelectionButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp12", "", "dp16", "dp10", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bind", "", "data", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/button/ServicePackageSelectionButtonVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setupConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackageSelectionButtonView extends ConstraintLayout {
    public static final int $stable = BadgeView.$stable | ButtonV3View.$stable;

    @NotNull
    private final BadgeView badge;

    @NotNull
    private final ButtonV3View button;
    private final int dp10;
    private final int dp12;
    private final int dp16;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackageSelectionButtonView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        q qVar = q.f64554a;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        if (buttonV3View == null) {
            context2 = context;
            buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        buttonV3View.setId(R$id.servicePackageSelectionConfirmButton);
        buttonV3View.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(buttonV3View);
        this.button = buttonV3View;
        View g10 = qVar.g(N.b(BadgeView.class), context2);
        BadgeView badgeView = (BadgeView) g10;
        a.c(badgeView, R$id.servicePackageSelectionConfirmButtonBadge, -2, -2);
        addView(g10);
        this.badge = badgeView;
        setClipToPadding(false);
        setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        setupConstraints();
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new ServicePackageSelectionButtonView$setupConstraints$1(this));
    }

    public final void bind(@NotNull ServicePackageSelectionButtonVO data, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bind(this.button, data.getConfirmButton(), actionHandler);
        BadgeHolderKt.bindOrGone$default(this.badge, data.getMilesBadge(), (Function1) null, 2, (Object) null);
        int i11 = data.getMilesBadge() == null ? this.dp16 : this.dp10;
        int i12 = this.dp16;
        setPadding(i12, i11, i12, i12);
    }
}
