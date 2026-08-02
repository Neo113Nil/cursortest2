package ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.view;

import D40.d;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.MainTabsVO;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/view/MainTabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "logoImageView", "Lru/ozon/uni/android/atom/image/Image;", "nameTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO$Tab;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainTabView extends ConstraintLayout {
    public static final int $stable = (TextAtomV2View.$stable | Image.$stable) | IconButtonV3View.$stable;
    private final int dp8;

    @NotNull
    private final IconButtonV3View iconButtonView;

    @NotNull
    private final Image logoImageView;

    @NotNull
    private final TextAtomV2View nameTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainTabView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        int px2 = ResourceExtKt.toPx(56, context);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, 131, px2, px2);
        c11.f41636i = 0;
        c11.f41656t = 0;
        c11.f41658v = 0;
        c11.setMarginEnd(px);
        c11.setMarginStart(px);
        iconButtonV3View.setLayoutParams(c11);
        this.iconButtonView = iconButtonV3View;
        Image image = new Image(context, null, 0, 6, null);
        image.setVisibility(8);
        int px3 = ResourceExtKt.toPx(64, context);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px3, px3);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 131;
        bVar.f41640k = 131;
        image.setLayoutParams(bVar);
        this.logoImageView = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = 131;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41616W = true;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = ResourceExtKt.toPx(4, context);
        textAtomV2View.setLayoutParams(bVar2);
        this.nameTextView = textAtomV2View;
        addView(iconButtonV3View);
        addView(image);
        addView(textAtomV2View);
    }

    public final void bind(@NotNull MainTabsVO.Tab item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        IconButtonV3HolderKt.bind(this.iconButtonView, item.getIconButton(), actionHandler);
        ImageHolderKt.bindOrGone$default(this.logoImageView, item.getTopImage(), null, 2, null);
        TextHolderKt.bind$default(this.nameTextView, item.getSubtitle(), null, 2, null);
        ViewExtensionsKt.safeUpdateMargins$default(this.iconButtonView, null, null, Integer.valueOf(item.getTabHorizontalPadding()), Integer.valueOf(item.getTabHorizontalPadding()), 3, null);
    }
}
