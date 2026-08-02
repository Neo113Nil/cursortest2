package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter;

import B3.D;
import B90.C2618u;
import Bi.b;
import Kk.C3531a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "roundedDrawable", "Landroid/graphics/drawable/GradientDrawable;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "backgroundView", "Landroid/view/View;", "avatarIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.COMMENT_FOOTER_FIELD_NAME, "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/CommentFooterVO;", "onCommentsClick", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentFooterView extends ConstraintLayout {

    @NotNull
    private final IconView avatarIconView;

    @NotNull
    private CornerRadius backgroundCornerRadius;

    @NotNull
    private final View backgroundView;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final GradientDrawable roundedDrawable;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentFooterView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundCornerRadius = CornerRadius.RADIUS_300;
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadius(ResourceExtKt.toPxF(this.backgroundCornerRadius.getPx()));
        this.roundedDrawable = b11;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.commentFooterButton, -2, -2);
        e11.f41658v = 0;
        e11.f41636i = 0;
        e11.f41642l = 0;
        buttonV3View.setLayoutParams(e11);
        addView(buttonV3View);
        this.buttonView = buttonV3View;
        View view = new View(context);
        view.setId(R$id.commentFooterBg);
        Dimens dimens = Dimens.INSTANCE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, dimens.getDP_32());
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41657u = buttonV3View.getId();
        bVar.setMarginEnd(dimens.getDP_6());
        view.setLayoutParams(bVar);
        view.setBackground(b11);
        addView(view);
        this.backgroundView = view;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.commentFooterAvatarIcon, -2, -2);
        a11.f41656t = 0;
        a11.f41636i = 0;
        a11.f41642l = 0;
        a11.setMarginStart(dimens.getDP_4());
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.avatarIconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.commentFooterTitle, 0, -2);
        d11.f41655s = iconView.getId();
        d11.f41636i = iconView.getId();
        d11.f41642l = iconView.getId();
        d11.f41658v = view.getId();
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }

    public final void bind(@NotNull CommentFooterVO commentFooter, @NotNull Function1<? super AtomAction, Unit> onCommentsClick) {
        Intrinsics.checkNotNullParameter(commentFooter, "commentFooter");
        Intrinsics.checkNotNullParameter(onCommentsClick, "onCommentsClick");
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_16(), getPaddingTop(), dimens.getDP_16(), commentFooter.getIsInItems() ? 0 : dimens.getDP_16());
        GradientDrawable gradientDrawable = this.roundedDrawable;
        if (commentFooter.getCornerRadius() != this.backgroundCornerRadius) {
            gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(commentFooter.getCornerRadius().getPx()));
            this.backgroundCornerRadius = commentFooter.getCornerRadius();
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, commentFooter.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()));
        IconHolderKt.bind$default(this.avatarIconView, commentFooter.getAvatarIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, commentFooter.getTitle(), null, 2, null);
        ButtonV3HolderKt.bind(this.buttonView, commentFooter.getCommentsButton(), onCommentsClick);
    }
}
