package ru.ozon.uni.atoms.v3.holders.text;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/text/TextHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "mapPreset", "", "preset", "Lru/ozon/uni/atoms/data/text/TextPreset;", "typographyToken", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextHolder extends AtomV3<TextDTO, TextAtomV2View> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextPreset.values().length];
            try {
                iArr[TextPreset.f97930H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextPreset.f97931H2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextPreset.f97932H3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextPreset.f97933H4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextPreset.PARAGRAPH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextPreset.PARAGRAPH_COMPACT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextPreset.UI_H2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TextPreset.UI_H2_COMPACT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TextPreset.UI_H1.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TextPreset.PRESET_CUSTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextHolder(@NotNull TextAtomV2View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final int mapPreset(TextPreset preset, String typographyToken) {
        switch (preset == null ? -1 : WhenMappings.$EnumSwitchMapping$0[preset.ordinal()]) {
            case 1:
                return R$style.TextAtom_H1;
            case 2:
                return R$style.TextAtom_H2;
            case 3:
                return R$style.TextAtom_H3;
            case 4:
                return R$style.TextAtom_H4;
            case 5:
                return R$style.TextAtom_Paragraph;
            case 6:
                return R$style.TextAtom_ParagraphCompact;
            case 7:
                return R$style.TextAtom_UIH2;
            case 8:
                return R$style.TextAtom_UIH2_Compact;
            case 9:
                return R$style.TextAtom_UIH1;
            case 10:
                Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(typographyToken);
                return parseTextStyle != null ? parseTextStyle.intValue() : R$style.TextAtom_Paragraph;
            default:
                return R$style.TextAtom_Paragraph;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextHolder(@NotNull Context context, String str) {
        this(new TextAtomV2View(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull TextDTO item) {
        OzonSpannableString ozonSpannableString;
        int viewAlign;
        int padding;
        int padding2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int dimension;
        int i11;
        int padding3;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TextHolder) item);
        TextAtomV2View containerView = getContainerView();
        if (item.getTagSupported()) {
            containerView.setMovementMethod(LinkMovementMethod.getInstance());
            ozonSpannableString = item.getText();
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            OzonSpannableStringExtKt.applyUnderlineFlag(ozonSpannableString, context);
        } else {
            String obj = item.getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            ozonSpannableString = new OzonSpannableString(obj);
        }
        OzonSpannableString ozonSpannableString2 = ozonSpannableString;
        viewAlign = TextHolderKt.getViewAlign(item.getTextAlignment());
        containerView.setTextAlignment(viewAlign);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, item.getTextColor());
        String textColor = item.getTextColor();
        UniGradient gradientByToken = textColor != null ? TokensExtKt.getGradientByToken(textColor) : null;
        Integer maxLines = item.getMaxLines();
        CommonAtomLabelDTO.TruncatingMode truncatingMode = item.getTruncatingMode();
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context3, item.getIcon());
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context4, item.getIconTintColor());
        CommonAtomLabelDTO.IconPosition iconPosition = item.getIconPosition();
        if (iconPosition == null) {
            iconPosition = CommonAtomLabelDTO.IconPosition.START;
        }
        CommonAtomLabelDTO.IconPosition iconPosition2 = iconPosition;
        Resources resources = containerView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        padding = TextHolderKt.getPadding(resources, item.getLeftPadding());
        Resources resources2 = containerView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        padding2 = TextHolderKt.getPadding(resources2, item.getRightPadding());
        int mapPreset = mapPreset(item.getPreset(), item.getTypographyToken());
        Context context5 = containerView.getContext();
        iArr = TextHolderKt.textAttrs;
        TypedArray obtainStyledAttributes = context5.obtainStyledAttributes(mapPreset, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        iArr2 = TextHolderKt.textAttrs;
        boolean z11 = obtainStyledAttributes.getBoolean(C7705l.L(iArr2, R.attr.textAllCaps), false);
        if (item.getPreset() == TextPreset.PRESET_CUSTOM) {
            Resources resources3 = containerView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            padding3 = TextHolderKt.getPadding(resources3, item.getTopPadding());
            Resources resources4 = containerView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            dimension = TextHolderKt.getPadding(resources4, item.getBottomPadding());
            i11 = padding3;
        } else {
            iArr3 = TextHolderKt.textAttrs;
            mapPreset = obtainStyledAttributes.getResourceId(C7705l.L(iArr3, R.attr.textAppearance), 0);
            iArr4 = TextHolderKt.textAttrs;
            int dimension2 = (int) obtainStyledAttributes.getDimension(C7705l.L(iArr4, R.attr.paddingTop), 0.0f);
            iArr5 = TextHolderKt.textAttrs;
            dimension = (int) obtainStyledAttributes.getDimension(C7705l.L(iArr5, R.attr.paddingBottom), 0.0f);
            i11 = dimension2;
        }
        obtainStyledAttributes.recycle();
        int i12 = mapPreset;
        Context context6 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        containerView.applyData$uni_release(context6, i12, parseColor, gradientByToken, maxLines, iconResByToken, parseColor2, iconPosition2, z11, truncatingMode, ozonSpannableString2, padding, padding2);
        containerView.setPadding(padding, i11, padding2, dimension);
    }
}
