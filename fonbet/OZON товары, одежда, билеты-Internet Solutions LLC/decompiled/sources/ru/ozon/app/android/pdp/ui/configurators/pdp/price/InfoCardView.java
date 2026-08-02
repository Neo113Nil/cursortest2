package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import Bi.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010J\b\u0010\u0012\u001a\u00020\fH\u0002J4\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/InfoCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cardIcon", "Landroid/widget/ImageView;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "disclosureIcon", "bind", "", "info", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$BonusInfo;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setupConstraints", "createImageView", "id", "", "width", "height", "imageResId", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class InfoCardView extends ConstraintLayout {

    @NotNull
    private final ImageView cardIcon;

    @NotNull
    private final ImageView disclosureIcon;

    @NotNull
    private final TextAtomV2View titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoCardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = R$id.priceInfoCardIcon;
        Dimens dimens = Dimens.INSTANCE;
        ImageView createImageView = createImageView(context, i11, dimens.getDP_16(), dimens.getDP_16(), R$drawable.ic_s_bonus);
        this.cardIcon = createImageView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.priceInfoCardTitle, 0, -2);
        d11.f41594A = dimens.getDP_12();
        textAtomV2View.setLayoutParams(d11);
        this.titleTAV = textAtomV2View;
        ImageView createImageView2 = createImageView(context, R$id.priceInfoCardDisclosure, -2, -2, R$drawable.ic_s_chevron_right_filled);
        this.disclosureIcon = createImageView2;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.setMarginStart(dimens.getDP_16());
        bVar.setMarginEnd(dimens.getDP_16());
        setPadding(dimens.getDP_12(), getPaddingTop(), dimens.getDP_12(), getPaddingBottom());
        setLayoutParams(bVar);
        addView(createImageView);
        addView(textAtomV2View);
        addView(createImageView2);
        setupConstraints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5$lambda$4(PriceV2VO$BonusInfo priceV2VO$BonusInfo, Function1 function1, View view) {
        AtomAction action = priceV2VO$BonusInfo.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    private final ImageView createImageView(Context context, int id2, int width, int height, int imageResId) {
        ImageView imageView = new ImageView(context);
        imageView.setId(id2);
        ConstraintLayout.b bVar = new ConstraintLayout.b(width, height);
        imageView.setImageResource(imageResId);
        imageView.setLayoutParams(bVar);
        return imageView;
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.cardIcon);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToTop$default(dVar, this.cardIcon.getId(), this.titleTAV.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.bottomToBottom$default(dVar, this.cardIcon.getId(), this.titleTAV.getId(), 0, 4, null);
        int id2 = this.titleTAV.getId();
        int id3 = this.cardIcon.getId();
        Dimens dimens = Dimens.INSTANCE;
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd(dVar, id2, id3, dimens.getDP_6());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToTop(dVar, this.titleTAV.getId(), 0, dimens.getDP_8());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToStart$default(dVar, this.titleTAV.getId(), this.disclosureIcon.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToTop$default(dVar, this.disclosureIcon.getId(), this.titleTAV.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.bottomToBottom$default(dVar, this.disclosureIcon.getId(), this.titleTAV.getId(), 0, 4, null);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.disclosureIcon);
        dVar.f(this);
    }

    public final void bind(@NotNull PriceV2VO$BonusInfo info, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ViewExtKt.bindOrGone$default(this.cardIcon, info.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleTAV, info.getText(), null, 2, null);
        this.titleTAV.setMovementMethod(null);
        this.disclosureIcon.setVisibility(info.getAction() == null ? 8 : 0);
        if (info.getAction() != null) {
            setPadding(getPaddingLeft(), getPaddingTop(), Dimens.INSTANCE.getDP_8(), getPaddingBottom());
        }
        ThemeExtKt.tint(this.disclosureIcon, Integer.valueOf(a.getColor(getContext(), UniColors.GRAPHIC_QUATERNARY.getResId())));
        setOnClickListener(new QD.b(5, info, actionHandler));
    }
}
