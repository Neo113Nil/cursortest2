package ru.ozon.uni.atoms.v3.holders.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.controls.button.IconCellCardView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.atoms.data.controls.button.IconCellCardDTO;
import ru.ozon.uni.atoms.data.controls.button.IconCellCardDTOKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolderKt;
import ru.ozon.uni.core.UniGradient;

@InterfaceC3999a
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J \u0010\u000f\u001a\u00020\r*\u00020\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/button/IconCellCardHolder;", "Lru/ozon/uni/atoms/v3/holders/controls/button/ButtonAtomHolder;", "Lru/ozon/uni/atoms/data/controls/button/IconCellCardDTO;", "Lru/ozon/uni/android/controls/button/IconCellCardView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/button/IconCellCardView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "applyStyle", "style", "", "colorBg", "Lru/ozon/uni/android/uikitsdk/Color;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconCellCardHolder extends ButtonAtomHolder<IconCellCardDTO, IconCellCardView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconCellCardHolder(@NotNull IconCellCardView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void applyStyle(IconCellCardView iconCellCardView, int i11, Color color) {
        Color color2;
        Color color3;
        TypedArray obtainStyledAttributes = iconCellCardView.getContext().obtainStyledAttributes(i11, R$styleable.IconCellCardView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        iconCellCardView.setBackgroundColorDefault$uni_release(new Color.Solid(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_backgroundColor, iconCellCardView.getDefaultBackgroundColor())));
        iconCellCardView.setBackgroundColorActive$uni_release(new Color.Solid(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_backgroundColorActive, iconCellCardView.getDefaultBackgroundColor())));
        iconCellCardView.setBackgroundColorDisabled$uni_release(new Color.Solid(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_backgroundColorDisabled, iconCellCardView.getDefaultBackgroundColor())));
        iconCellCardView.setTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_mainTextColor, iconCellCardView.getDefaultBackgroundColor()));
        iconCellCardView.setTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_mainTextColorActive, iconCellCardView.getTitleColorDefault()));
        iconCellCardView.setTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_mainTextColorDisabled, iconCellCardView.getDefaultBackgroundColor()));
        iconCellCardView.setSubTitleColorDefault$uni_release(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_addonTextColor, iconCellCardView.getDefaultBackgroundColor()));
        iconCellCardView.setSubTitleColorActive$uni_release(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_addonTextColorActive, iconCellCardView.getDefaultBackgroundColor()));
        iconCellCardView.setSubTitleColorDisabled$uni_release(obtainStyledAttributes.getColor(R$styleable.IconCellCardView_addonTextColorDisabled, iconCellCardView.getDefaultBackgroundColor()));
        if (color == null) {
            Context context = iconCellCardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            color2 = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.IconCellCardView_iconBackgroundGradient, R$styleable.IconCellCardView_iconBackgroundColor, -1);
        } else {
            color2 = color;
        }
        iconCellCardView.setIconBackgroundColorDefault$uni_release(color2);
        if (color == null) {
            Context context2 = iconCellCardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            color3 = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context2, R$styleable.IconCellCardView_iconBackgroundGradient, R$styleable.IconCellCardView_iconBackgroundColorDisabled, iconCellCardView.getIconBackgroundColorDefault());
        } else {
            color3 = color;
        }
        iconCellCardView.setIconBackgroundColorDisabled$uni_release(color3);
        if (color == null) {
            Context context3 = iconCellCardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            color = TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context3, R$styleable.IconCellCardView_iconBackgroundGradient, R$styleable.IconCellCardView_iconBackgroundColorActive, iconCellCardView.getIconBackgroundColorDefault());
        }
        iconCellCardView.setIconBackgroundColorActive$uni_release(color);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconCellCardHolder(@NotNull Context context, String str) {
        this(new IconCellCardView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBind(@NotNull IconCellCardDTO item) {
        Color solid;
        String backgroundColor;
        UniGradient gradientByToken;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((IconCellCardHolder) item);
        IconCellCardView iconCellCardView = (IconCellCardView) getContainerView();
        IconCellCardDTO.Preset preset = item.getPreset();
        if (preset == null) {
            preset = IconCellCardDTO.Preset.SIZE_400;
        }
        iconCellCardView.setPreset(preset);
        int styleResource = IconCellCardDTOKt.getStyleResource(item.getStyle());
        IconDTO icon = item.getIcon();
        if (icon != null && (backgroundColor = icon.getBackgroundColor()) != null && (gradientByToken = TokensExtKt.getGradientByToken(backgroundColor)) != null) {
            Context context = iconCellCardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            solid = TokensExtKt.toGradient(gradientByToken, context);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = iconCellCardView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        IconDTO icon2 = item.getIcon();
        Integer mapColor = styleParser.mapColor(context2, icon2 != null ? icon2.getBackgroundColor() : null);
        solid = mapColor != null ? new Color.Solid(mapColor.intValue()) : null;
        applyStyle(iconCellCardView, styleResource, solid);
        IconTitleSubtitleCellHolderKt.bindCellData(iconCellCardView.getMainView(), item.getTitle(), item.getSubtitle(), item.getIcon());
        Boolean isEnabled = item.isEnabled();
        iconCellCardView.setButtonState(mapState(isEnabled != null ? isEnabled.booleanValue() : true));
    }
}
