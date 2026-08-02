package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view;

import FK.a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.presentation.BuyTogetherVO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.utils.RoundedOutlineProvider;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(R$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/view/BuyTogetherServiceView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "createLogoImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "createAddButtonIcon", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "", "id", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "layoutParams", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "createTextAtomView", "(ILandroidx/constraintlayout/widget/ConstraintLayout$b;)Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "", "setUpRoot", "()V", "setUpAddButtonBackground", "performAction", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded$ServiceVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded$ServiceVO;Lkotlin/jvm/functions/Function1;)V", "margin", "I", "logoImage", "Landroidx/appcompat/widget/AppCompatImageView;", "addButtonIcon", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "priceTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "descriptionTextView", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded$ServiceVO;", "Lkotlin/jvm/functions/Function1;", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BuyTogetherServiceView extends ConstraintLayoutWithBorder {

    @NotNull
    private final SmallIconButtonView addButtonIcon;

    @NotNull
    private final TextAtomView descriptionTextView;
    private BuyTogetherVO.Loaded.ServiceVO item;

    @NotNull
    private final AppCompatImageView logoImage;
    private final int margin;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final TextAtomView priceTextView;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyTogetherServiceView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.margin = px;
        AppCompatImageView createLogoImage = createLogoImage();
        this.logoImage = createLogoImage;
        SmallIconButtonView createAddButtonIcon = createAddButtonIcon();
        this.addButtonIcon = createAddButtonIcon;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41655s = createLogoImage.getId();
        bVar.f41657u = createAddButtonIcon.getId();
        bVar.setMarginStart(px);
        bVar.setMarginEnd(px);
        bVar.f41640k = 5;
        bVar.f41604K = 2;
        Unit unit = Unit.f71690a;
        TextAtomView createTextAtomView = createTextAtomView(4, bVar);
        this.priceTextView = createTextAtomView;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = createTextAtomView.getId();
        bVar2.f41655s = createLogoImage.getId();
        bVar2.f41657u = createAddButtonIcon.getId();
        bVar2.f41642l = 0;
        bVar2.setMarginStart(px);
        bVar2.setMarginEnd(px);
        TextAtomView createTextAtomView2 = createTextAtomView(5, bVar2);
        this.descriptionTextView = createTextAtomView2;
        setUpRoot();
        setUpAddButtonBackground();
        addView(createLogoImage);
        addView(createAddButtonIcon);
        addView(createTextAtomView);
        addView(createTextAtomView2);
    }

    private final SmallIconButtonView createAddButtonIcon() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(32, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SmallIconButtonView smallIconButtonView = new SmallIconButtonView(context2, null, 0, 6, null);
        smallIconButtonView.setId(3);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px, px);
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        Context context3 = smallIconButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        bVar.setMarginEnd(ResourceExtKt.toPx(8, context3));
        smallIconButtonView.setLayoutParams(bVar);
        Context context4 = smallIconButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int px2 = ResourceExtKt.toPx(8, context4);
        smallIconButtonView.setPadding(px2, px2, px2, px2);
        Context context5 = smallIconButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(8, context5);
        smallIconButtonView.setClipToOutline(true);
        smallIconButtonView.setOutlineProvider(new RoundedOutlineProvider(pxF));
        Context context6 = smallIconButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        smallIconButtonView.setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context6, R$attr.bgActionSecondary), pxF));
        return smallIconButtonView;
    }

    private final AppCompatImageView createLogoImage() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(56, context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(1);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px, px);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41642l = 0;
        appCompatImageView.setLayoutParams(bVar);
        appCompatImageView.setClipToOutline(true);
        Context context2 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatImageView.setOutlineProvider(new RoundedOutlineProvider(ResourceExtKt.toPxF(8, context2)));
        return appCompatImageView;
    }

    private final TextAtomView createTextAtomView(int id2, ConstraintLayout.b layoutParams) {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
        textAtomView.setId(id2);
        textAtomView.setLayoutParams(layoutParams);
        return textAtomView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performAction() {
        AtomAction addServiceAction;
        Function1<? super AtomAction, Unit> function1;
        BuyTogetherVO.Loaded.ServiceVO serviceVO = this.item;
        if (serviceVO == null || (addServiceAction = serviceVO.getAddServiceAction()) == null || (function1 = this.onAction) == null) {
            return;
        }
        function1.invoke(addServiceAction);
    }

    private final void setUpAddButtonBackground() {
        this.addButtonIcon.setOnClickListener(new a(this, 1));
    }

    private final void setUpRoot() {
        setOnClickListener(new AS.a(this, 3));
    }

    public final void bind(@NotNull BuyTogetherVO.Loaded.ServiceVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (item.getWidth() > 0) {
            int width = item.getWidth();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = ResourceExtKt.toPx(width, context);
        } else {
            i11 = -1;
        }
        if (getLayoutParams() != null && getLayoutParams().width != i11) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i11;
            setLayoutParams(layoutParams);
        }
        this.item = item;
        this.onAction = onAction;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBorderColor(styleParser.parseColor(context2, item.getBorderColor()));
        AppCompatImageView appCompatImageView = this.logoImage;
        Context context3 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context3, item.getImageBackgroundColor());
        if (parseColor != null) {
            appCompatImageView.setBackgroundColor(parseColor.intValue());
        }
        ImageViewExtKt.load$default(appCompatImageView, item.getImageUrl(), null, null, null, null, false, null, 126, null);
        WrappedIconButtonHolderKt.bind(this.addButtonIcon, item.getAddServiceButton(), onAction);
        TextAtomHolderKt.bind$default(this.priceTextView, item.getPrice(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(this.descriptionTextView, item.getDescription(), null, 2, null);
    }
}
