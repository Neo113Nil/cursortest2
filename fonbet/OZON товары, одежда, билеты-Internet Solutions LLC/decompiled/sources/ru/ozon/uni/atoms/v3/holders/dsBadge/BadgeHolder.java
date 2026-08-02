package ru.ozon.uni.atoms.v3.holders.dsBadge;

import android.content.Context;
import android.view.View;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.A11yInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolder;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0014\u0010\u0017\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/dsBadge/BadgeHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/badge/BadgeView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "bgSecondaryColor", "", "textSecondaryColor", "graphicTertiaryColor", "onBind", "", "item", "setCornerRadius", "straightCorners", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$StraightCorners;", "applyCustom", "preset", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BadgeHolder extends AtomV3<BadgeDTO, BadgeView> implements WrappedAtomHolder {
    private final int bgSecondaryColor;
    private final int graphicTertiaryColor;
    private final int textSecondaryColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeHolder(@NotNull BadgeView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.bgSecondaryColor = a.getColor(getContext(), R$color.bg_secondary);
        this.textSecondaryColor = a.getColor(getContext(), R$color.text_secondary);
        this.graphicTertiaryColor = a.getColor(getContext(), R$color.graphic_tertiary);
        view.setOnClickListener(new View.OnClickListener() { // from class: dl0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BadgeHolder._init_$lambda$1(BadgeHolder.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(BadgeHolder badgeHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        BadgeDTO badgeDTO = (BadgeDTO) badgeHolder.getData();
        CommonControlSettings common = badgeDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, badgeDTO.getTrackingInfo())) != null) {
            badgeHolder.handleAction(atomAction);
            return;
        }
        Object parent = badgeHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r1 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void applyCustom(BadgeView badgeView, BadgeDTO.CustomStyle customStyle) {
        Color solid;
        BadgeDTO.CustomBackground backgroundColor = customStyle.getBackgroundColor();
        String color = backgroundColor != null ? backgroundColor.getColor() : null;
        BadgeDTO.CustomBackground backgroundColor2 = customStyle.getBackgroundColor();
        UniGradient gradient = backgroundColor2 != null ? backgroundColor2.getGradient() : null;
        if (color != null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(color);
            if (gradientByToken != null) {
                Context context = badgeView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                solid = TokensExtKt.toGradient(gradientByToken, context);
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = badgeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, color);
            solid = new Color.Solid(parseColor != null ? parseColor.intValue() : this.bgSecondaryColor);
        } else if (gradient != null) {
            Context context3 = badgeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            solid = TokensExtKt.toGradient(gradient, context3);
        } else {
            solid = new Color.Solid(a.getColor(badgeView.getContext(), R$color.bg_secondary));
        }
        badgeView.setBackColor(solid);
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context4 = badgeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        Integer parseColor2 = styleParser2.parseColor(context4, customStyle.getTextColor());
        badgeView.setTextColor(parseColor2 != null ? parseColor2.intValue() : this.textSecondaryColor);
        Context context5 = badgeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        Integer parseColor3 = styleParser2.parseColor(context5, customStyle.getLeftGraphicColor());
        badgeView.setLeftIconColor(parseColor3 != null ? parseColor3.intValue() : this.graphicTertiaryColor);
        Context context6 = badgeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        Integer parseColor4 = styleParser2.parseColor(context6, customStyle.getRightGraphicColor());
        badgeView.setRightIconColor(parseColor4 != null ? parseColor4.intValue() : this.graphicTertiaryColor);
    }

    private final void setCornerRadius(BadgeDTO.StraightCorners straightCorners) {
        Boolean bottomRight;
        Boolean bottomLeft;
        Boolean topRight;
        Boolean topLeft;
        boolean z11 = false;
        boolean booleanValue = (straightCorners == null || (topLeft = straightCorners.getTopLeft()) == null) ? false : topLeft.booleanValue();
        boolean booleanValue2 = (straightCorners == null || (topRight = straightCorners.getTopRight()) == null) ? false : topRight.booleanValue();
        boolean booleanValue3 = (straightCorners == null || (bottomLeft = straightCorners.getBottomLeft()) == null) ? false : bottomLeft.booleanValue();
        if (straightCorners != null && (bottomRight = straightCorners.getBottomRight()) != null) {
            z11 = bottomRight.booleanValue();
        }
        getContainerView().setCornerRadius$uni_release(booleanValue, booleanValue2, booleanValue3, z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull BadgeDTO item) {
        boolean roundCornersFlag;
        int style;
        String combinedLabel;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((BadgeHolder) item);
        BadgeView containerView = getContainerView();
        BadgeDTO.BadgeSize size = item.getSize();
        if (size == null) {
            size = BadgeDTO.BadgeSize.SIZE_500;
        }
        containerView.setSize(size);
        containerView.setText(item.getText());
        Rounds round = item.getRound();
        if (round != null) {
            roundCornersFlag = round.getRoundCorners();
        } else {
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag(context);
        }
        containerView.setRoundCorners$uni_release(roundCornersFlag);
        containerView.setLeftIconDrawable(DrawableResource.INSTANCE.fromToken(item.getLeftIcon()));
        CommonControlSettings common = item.getCommon();
        containerView.setClickable((common != null ? common.getAction() : null) != null);
        containerView.setHideDisclosure(item.getHideDisclosure());
        setCornerRadius(item.getStraightCorners());
        if (item.getBadgeStyle() == BadgeDTO.Style.CUSTOM) {
            BadgeDTO.CustomStyle customBadgeStyle = item.getCustomBadgeStyle();
            if (customBadgeStyle != null) {
                applyCustom(containerView, customBadgeStyle);
            }
        } else {
            style = BadgeHolderKt.getStyle(item.getBadgeStyle());
            BadgeHolderKt.applyStyle(containerView, style);
        }
        A11yInfo a11yInfo = item.getA11yInfo();
        if (a11yInfo == null || (combinedLabel = a11yInfo.getCombinedLabel()) == null) {
            return;
        }
        containerView.setAccessibilityContentDescription(combinedLabel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeHolder(@NotNull Context context, String str) {
        this(new BadgeView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
