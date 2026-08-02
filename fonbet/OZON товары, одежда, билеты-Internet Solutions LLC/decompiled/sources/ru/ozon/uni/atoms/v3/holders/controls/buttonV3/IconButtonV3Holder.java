package ru.ozon.uni.atoms.v3.holders.controls.buttonV3;

import Dc0.n;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/buttonV3/IconButtonV3Holder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "setStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconButtonV3Holder extends AtomV3<IconButtonV3DTO, IconButtonV3View> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonV3Holder(@NotNull IconButtonV3View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new n(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(IconButtonV3Holder iconButtonV3Holder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        IconButtonV3DTO iconButtonV3DTO = (IconButtonV3DTO) iconButtonV3Holder.getData();
        Boolean isDisabled = iconButtonV3DTO.isDisabled();
        if (isDisabled != null ? isDisabled.booleanValue() : false) {
            return;
        }
        CommonControlSettings common = iconButtonV3DTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, iconButtonV3DTO.getTrackingInfo())) != null) {
            iconButtonV3Holder.handleAction(atomAction);
            return;
        }
        Object parent = iconButtonV3Holder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r1 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setStyle(IconButtonV3DTO item) {
        Color solid;
        UniGradient gradientByToken;
        IconButtonV3View containerView = getContainerView();
        ButtonV3DTO.StyleTypes styleType = item.getStyleType();
        if (styleType == null) {
            styleType = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
        }
        containerView.setStyle(styleType);
        if (item.getStyleType() == ButtonV3DTO.StyleTypes.CUSTOM) {
            String backgroundColor = item.getBackgroundColor();
            if (backgroundColor != null && (gradientByToken = TokensExtKt.getGradientByToken(backgroundColor)) != null) {
                Context context = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                solid = TokensExtKt.toGradient(gradientByToken, context);
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, item.getBackgroundColor());
            solid = parseColor != null ? new Color.Solid(parseColor.intValue()) : null;
            if (solid != null) {
                containerView.setBackColor(solid);
            }
            String iconColor = item.getIconColor();
            if (iconColor != null) {
                containerView.setGraphicGradient(TokensExtKt.getGradientByToken(iconColor));
                StyleParser styleParser2 = StyleParser.INSTANCE;
                Context context3 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Integer parseColor2 = styleParser2.parseColor(context3, iconColor);
                if (parseColor2 != null) {
                    containerView.setIconColor(parseColor2.intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull IconButtonV3DTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((IconButtonV3Holder) item);
        IconButtonV3View containerView = getContainerView();
        IconButtonV3DTO.IconButtonShape buttonShape = item.getButtonShape();
        if (buttonShape == null) {
            buttonShape = IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE;
        }
        containerView.setShape(buttonShape);
        IconButtonV3DTO.Sizes size = item.getSize();
        if (size == null) {
            size = IconButtonV3DTO.Sizes.SIZE_500;
        }
        containerView.setSize(size);
        Boolean isDisabled = item.isDisabled();
        containerView.setDisabled(isDisabled != null ? isDisabled.booleanValue() : false);
        Boolean isHoverDisabled = item.isHoverDisabled();
        containerView.setHoverDisabled(isHoverDisabled != null ? isHoverDisabled.booleanValue() : false);
        if (!containerView.getDisabled()) {
            setStyle(item);
        }
        containerView.setIconDrawable(DrawableResource.INSTANCE.fromToken(item.getIcon()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconButtonV3Holder(@NotNull Context context, String str) {
        this(new IconButtonV3View(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
