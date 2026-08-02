package ru.ozon.uni.atoms.v3.holders.indicator;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u001e\u0010\u0010\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010\u0013\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0017H\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/indicator/IndicatorHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "applyCustomStyle", "preset", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$CustomStyle;", "applyCustom", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Custom;", "getStyle", "", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Style;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndicatorHolder extends AtomV3<IndicatorDTO, IndicatorView> implements WrappedAtomHolder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndicatorDTO.Style.values().length];
            try {
                iArr[IndicatorDTO.Style.ACCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndicatorDTO.Style.ACCENT_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndicatorDTO.Style.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndicatorDTO.Style.NEUTRAL_TRANSPARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IndicatorDTO.Style.LIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IndicatorDTO.Style.LIGHT_NEUTRAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IndicatorDTO.Style.STATIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IndicatorDTO.Style.NEUTRAL_ON_DARK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorHolder(@NotNull IndicatorView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void applyCustom(IndicatorView indicatorView, IndicatorDTO.Custom custom) {
        Integer backgroundColor = custom.getBackgroundColor();
        if (backgroundColor != null) {
            indicatorView.setBackColor(Integer.valueOf(backgroundColor.intValue()));
        }
        Integer borderColor = custom.getBorderColor();
        if (borderColor != null) {
            indicatorView.setBorderColor(borderColor.intValue());
        }
        Integer iconColor = custom.getIconColor();
        if (iconColor != null) {
            indicatorView.setIconColor(iconColor.intValue());
        }
        Integer textColor = custom.getTextColor();
        if (textColor != null) {
            indicatorView.setTextColor(textColor.intValue());
        }
    }

    private final void applyCustomStyle(IndicatorView indicatorView, Context context, IndicatorDTO.CustomStyle customStyle) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(context, customStyle != null ? customStyle.getBackgroundColor() : null);
        if (parseColor == null) {
            parseColor = Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.bgAccentPrimary));
        }
        indicatorView.setBackColor(parseColor);
        Integer parseColor2 = styleParser.parseColor(context, customStyle != null ? customStyle.getTextColor() : null);
        indicatorView.setTextColor(parseColor2 != null ? parseColor2.intValue() : ThemeExtKt.themeColor(context, R$attr.textLightKey));
        Integer parseColor3 = styleParser.parseColor(context, customStyle != null ? customStyle.getIconColor() : null);
        indicatorView.setIconColor(parseColor3 != null ? parseColor3.intValue() : ThemeExtKt.themeColor(context, R$attr.graphicLightKey));
        Integer parseColor4 = styleParser.parseColor(context, customStyle != null ? customStyle.getBorderColor() : null);
        if (parseColor4 != null) {
            indicatorView.setBorderColor(parseColor4.intValue());
        }
    }

    private final int getStyle(IndicatorDTO.Style preset) {
        switch (preset == null ? -1 : WhenMappings.$EnumSwitchMapping$0[preset.ordinal()]) {
            case 1:
                return R$style.Indicator_Accent;
            case 2:
                return R$style.Indicator_Accent_Secondary;
            case 3:
                return R$style.Indicator_Neutral;
            case 4:
                return R$style.Indicator_Neutral_Transparent;
            case 5:
                return R$style.Indicator_Light;
            case 6:
                return R$style.Indicator_Light_Neutral;
            case 7:
                return R$style.Indicator_Static;
            case 8:
                return R$style.Indicator_Neutral_OnDark;
            default:
                return R$style.Indicator_Accent;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndicatorHolder(@NotNull Context context, String str) {
        this(new IndicatorView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull IndicatorDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((IndicatorHolder) item);
        IndicatorView containerView = getContainerView();
        IndicatorDTO.IndicatorSize size = item.getSize();
        if (size != null) {
            containerView.setSize(size);
        }
        containerView.setText(item.getText());
        containerView.setIconDrawable(DrawableResource.INSTANCE.fromToken(item.getIcon()));
        containerView.setContent(item.getContent());
        IndicatorDTO.Style compatStyle = item.getCompatStyle();
        if (compatStyle == IndicatorDTO.Style.CUSTOM) {
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            applyCustomStyle(containerView, context, item.getCustomStyle());
        } else {
            IndicatorHolderKt.applyStyle(containerView, getStyle(compatStyle));
        }
        if (item.getCustomPreset() != null) {
            applyCustom(containerView, item.getCustomPreset());
        }
    }
}
