package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.R$id;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0000¢\u0006\u0002\b\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "defaultMargin", "deleteButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsView", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bind$services_prodGoogleAllVendorsRelease", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupV4StickyView extends ConstraintLayout {
    public static final int $stable = (VerticalAtomsLayout.$stable | AtomsAdapter.$stable) | IconButtonV3View.$stable;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final VerticalAtomsLayout buttonsView;
    private final int defaultMargin;

    @NotNull
    private final IconButtonV3View deleteButton;
    private final int dp8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPopupV4StickyView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.defaultMargin = px2;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), context);
        if (iconButtonV3View == null) {
            context2 = context;
            iconButtonV3View = new IconButtonV3View(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        iconButtonV3View.setId(R$id.travelInfoPopupV4DeleteButton);
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconButtonV3View);
        this.deleteButton = iconButtonV3View;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAdapter = atomsAdapter;
        Context context3 = context2;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context3, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.travelInfoPopupV4Buttons);
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(new InfoPopupV4ButtonsDecorator(context3, px2, px));
        addView(verticalAtomsLayout);
        this.buttonsView = verticalAtomsLayout;
        setBackgroundColor(ThemeExtKt.themeColor(context3, R$attr.layerFloor1));
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, iconButtonV3View, px2);
        ConstraintLayoutExtensionsKt.startToParent(dVar, iconButtonV3View, px2);
        ConstraintLayoutExtensionsKt.topToParent(dVar, verticalAtomsLayout, px2);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, verticalAtomsLayout, iconButtonV3View, px2);
        ConstraintLayoutExtensionsKt.endToParent(dVar, verticalAtomsLayout, px2);
        dVar.f(this);
    }

    public final void bind$services_prodGoogleAllVendorsRelease(@NotNull InfoPopupV4StickyVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconButtonV3HolderKt.bindOrGone(this.deleteButton, item.getDeleteServiceButton(), actionHandler);
        this.buttonsAdapter.setOnAction(actionHandler);
        AtomsAdapter atomsAdapter = this.buttonsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getButtons());
    }
}
