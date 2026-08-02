package ru.ozon.uni.atoms.v3.holders.controls.buttonV3;

import RI.d;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
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
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/buttonV3/ButtonV3Holder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "setStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonV3Holder extends AtomV3<ButtonV3DTO, ButtonV3View> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonV3Holder(@NotNull ButtonV3View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new d(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(ButtonV3Holder buttonV3Holder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        ButtonV3DTO buttonV3DTO = (ButtonV3DTO) buttonV3Holder.getData();
        Boolean isDisabled = buttonV3DTO.isDisabled();
        if (isDisabled != null ? isDisabled.booleanValue() : false) {
            return;
        }
        CommonControlSettings common = buttonV3DTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, buttonV3DTO.getTrackingInfo())) != null) {
            buttonV3Holder.handleAction(atomAction);
            return;
        }
        Object parent = buttonV3Holder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setStyle(ButtonV3DTO item) {
        Integer parseColor;
        Integer parseColor2;
        UniGradient gradientByToken;
        Integer parseColor3;
        UniGradient gradientByToken2;
        Integer parseColor4;
        UniGradient gradientByToken3;
        Integer parseColor5;
        UniGradient gradientByToken4;
        UniGradient gradientByToken5;
        ButtonV3View containerView = getContainerView();
        ButtonV3DTO.StyleTypes styleType = item.getStyleType();
        if (styleType == null) {
            styleType = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
        }
        containerView.setStyle(styleType);
        if (item.getStyleType() != ButtonV3DTO.StyleTypes.CUSTOM) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor6 = styleParser.parseColor(context, item.getHoverColor());
        Color color = null;
        containerView.setHoverColor(parseColor6 != null ? new Color.Solid(parseColor6.intValue()) : null);
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor != null && (gradientByToken5 = TokensExtKt.getGradientByToken(backgroundColor)) != null) {
            Context context2 = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(gradientByToken5, context2);
            if (gradient != null) {
                color = gradient;
                if (color != null) {
                    containerView.setBackColor(color);
                }
                Context context3 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                parseColor = styleParser.parseColor(context3, item.getDataBackgroundColor());
                if (parseColor != null) {
                    containerView.setDataBackColor(parseColor.intValue());
                }
                Context context4 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                parseColor2 = styleParser.parseColor(context4, item.getTitleColor());
                if (parseColor2 == null) {
                    int intValue = parseColor2.intValue();
                    containerView.setTitleColor(intValue);
                    containerView.setDataTextColor(intValue);
                    containerView.setSubtitleColor(intValue);
                } else {
                    String titleColor = item.getTitleColor();
                    if (titleColor != null && (gradientByToken = TokensExtKt.getGradientByToken(titleColor)) != null) {
                        Context context5 = containerView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        Color.Gradient gradient2 = TokensExtKt.toGradient(gradientByToken, context5);
                        if (gradient2 != null) {
                            containerView.setTitleGradient(gradient2);
                        }
                    }
                }
                Context context6 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                parseColor3 = styleParser.parseColor(context6, item.getDataTextColor());
                if (parseColor3 == null) {
                    containerView.setDataTextColor(parseColor3.intValue());
                } else {
                    String dataTextColor = item.getDataTextColor();
                    if (dataTextColor != null && (gradientByToken2 = TokensExtKt.getGradientByToken(dataTextColor)) != null) {
                        Context context7 = containerView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                        Color.Gradient gradient3 = TokensExtKt.toGradient(gradientByToken2, context7);
                        if (gradient3 != null) {
                            containerView.setDataTextGradient(gradient3);
                        }
                    }
                }
                Context context8 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                parseColor4 = styleParser.parseColor(context8, item.getIconColor());
                if (parseColor4 == null) {
                    containerView.setIconColor(parseColor4.intValue());
                } else {
                    String iconColor = item.getIconColor();
                    if (iconColor != null && (gradientByToken3 = TokensExtKt.getGradientByToken(iconColor)) != null) {
                        Context context9 = containerView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                        Color.Gradient gradient4 = TokensExtKt.toGradient(gradientByToken3, context9);
                        if (gradient4 != null) {
                            containerView.setIconGradient(gradient4);
                        }
                    }
                }
                Context context10 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                parseColor5 = styleParser.parseColor(context10, item.getSubtitleColor());
                if (parseColor5 == null) {
                    containerView.setSubtitleColor(parseColor5.intValue());
                    return;
                }
                String subtitleColor = item.getSubtitleColor();
                if (subtitleColor == null || (gradientByToken4 = TokensExtKt.getGradientByToken(subtitleColor)) == null) {
                    return;
                }
                Context context11 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                Color.Gradient gradient5 = TokensExtKt.toGradient(gradientByToken4, context11);
                if (gradient5 != null) {
                    containerView.setSubtitleGradient(gradient5);
                    return;
                }
                return;
            }
        }
        Context context12 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
        Integer parseColor7 = styleParser.parseColor(context12, item.getBackgroundColor());
        if (parseColor7 != null) {
            color = new Color.Solid(parseColor7.intValue());
        }
        if (color != null) {
        }
        Context context32 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context32, "getContext(...)");
        parseColor = styleParser.parseColor(context32, item.getDataBackgroundColor());
        if (parseColor != null) {
        }
        Context context42 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context42, "getContext(...)");
        parseColor2 = styleParser.parseColor(context42, item.getTitleColor());
        if (parseColor2 == null) {
        }
        Context context62 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context62, "getContext(...)");
        parseColor3 = styleParser.parseColor(context62, item.getDataTextColor());
        if (parseColor3 == null) {
        }
        Context context82 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context82, "getContext(...)");
        parseColor4 = styleParser.parseColor(context82, item.getIconColor());
        if (parseColor4 == null) {
        }
        Context context102 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context102, "getContext(...)");
        parseColor5 = styleParser.parseColor(context102, item.getSubtitleColor());
        if (parseColor5 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3DTO item) {
        boolean roundCornersFlag;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ButtonV3Holder) item);
        ButtonV3View containerView = getContainerView();
        Rounds round = item.getRound();
        if (round != null) {
            roundCornersFlag = round.getRoundCorners();
        } else {
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag(context);
        }
        containerView.setRounded$uni_release(roundCornersFlag);
        ButtonV3DTO.Sizes size = item.getSize();
        if (size == null) {
            size = ButtonV3DTO.Sizes.SIZE_500;
        }
        containerView.setSize(size);
        Boolean isDisabled = item.isDisabled();
        containerView.setDisabled(isDisabled != null ? isDisabled.booleanValue() : false);
        Boolean isHoverDisabled = item.isHoverDisabled();
        containerView.setHoverDisabled(isHoverDisabled != null ? isHoverDisabled.booleanValue() : false);
        if (!containerView.getDisabled()) {
            setStyle(item);
        }
        containerView.setTitle(item.getTitle());
        containerView.setDataText(item.getDataText());
        containerView.setIconResource(DrawableResource.INSTANCE.fromToken(item.getIcon()));
        containerView.setSubtitle(item.getSubtitle());
        A11yInfo a11yInfo = item.getA11yInfo();
        containerView.setAccessibilityContentDescription(a11yInfo != null ? a11yInfo.getCombinedLabel() : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonV3Holder(@NotNull Context context, String str) {
        this(new ButtonV3View(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
