package ru.ozon.uni.atoms.v3.holders.icon;

import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/icon/IconHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/icon/IconView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconHolder extends AtomV3<IconDTO, IconView> implements WrappedAtomHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconHolder(@NotNull IconView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconHolder(@NotNull Context context, String str) {
        this(new IconView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r1 != null) goto L27;
     */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBind(@NotNull IconDTO item) {
        Color solid;
        UniGradient gradientByToken;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((IconHolder) item);
        IconView containerView = getContainerView();
        IconDTO.IconSize size = item.getSize();
        if (size == null) {
            size = IconDTO.IconSize.SIZE_500;
        }
        containerView.setSize(size);
        containerView.setShape(item.getCompatShape());
        Boolean hasParanja = item.getHasParanja();
        containerView.setHasParanja(hasParanja != null ? hasParanja.booleanValue() : false);
        containerView.setBorderWidth(item.getBorderWidth());
        containerView.setContentType(item.getText() != null ? IconDTO.ContentType.TEXT : item.getIcon() != null ? IconDTO.ContentType.GRAPHIC : IconDTO.ContentType.NONE);
        IconDTO.FitType backgroundImageFitType = item.getBackgroundImageFitType();
        if (backgroundImageFitType == null) {
            backgroundImageFitType = IconDTO.FitType.FILL_CENTER;
        }
        containerView.setBackgroundFitType(backgroundImageFitType);
        containerView.setBackgroundImage(item.getBackgroundImage());
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor != null && (gradientByToken = TokensExtKt.getGradientByToken(backgroundColor)) != null) {
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            solid = TokensExtKt.toGradient(gradientByToken, context);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        solid = new Color.Solid(styleParser.parseColor(context2, item.getBackgroundColor(), R$color.bg_primary));
        containerView.setBackColor(solid);
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer mapColor = styleParser2.mapColor(context3, item.getBorderColor());
        containerView.setBorderColor(mapColor != null ? Integer.valueOf(a.getColor(containerView.getContext(), mapColor.intValue())) : null);
        containerView.setLabel(item.getText());
        Integer parseTextStyle = styleParser2.parseTextStyle(item.getTextStyle());
        if (parseTextStyle != null) {
            containerView.applyTextStyle(parseTextStyle.intValue());
        }
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        Integer mapColor2 = styleParser2.mapColor(context4, item.getTextColor());
        containerView.setLabelColor(Integer.valueOf(a.getColor(containerView.getContext(), mapColor2 != null ? mapColor2.intValue() : R$color.text_primary)));
        CommonAtomIconDTO icon = item.getIcon();
        if (icon != null) {
            String tintColor = icon.getTintColor();
            containerView.setGraphicGradient(tintColor != null ? TokensExtKt.getGradientByToken(tintColor) : null);
            Context context5 = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            Integer mapColor3 = styleParser2.mapColor(context5, icon.getTintColor());
            containerView.setGraphicColor(mapColor3 != null ? Integer.valueOf(a.getColor(containerView.getContext(), mapColor3.intValue())) : null);
            containerView.setGraphicDrawable(DrawableResource.INSTANCE.fromToken(icon.getIcon()));
        }
    }
}
