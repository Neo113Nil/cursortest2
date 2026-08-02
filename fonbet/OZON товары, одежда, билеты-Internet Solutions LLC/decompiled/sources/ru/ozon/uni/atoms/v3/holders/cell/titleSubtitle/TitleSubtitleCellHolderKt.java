package ru.ozon.uni.atoms.v3.holders.cell.titleSubtitle;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.TitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.BindExtKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "", "bindCellData", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;)V", "bindTitle", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;)V", "bindSubTitle", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "position", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "getIconPosition", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$IconPosition;)Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;Lkotlin/jvm/functions/Function1;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TitleSubtitleCellHolderKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonAtomLabelDTO.IconPosition.values().length];
            try {
                iArr[CommonAtomLabelDTO.IconPosition.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonAtomLabelDTO.IconPosition.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC3999a
    public static final void bind(@NotNull TitleSubtitleCellView titleSubtitleCellView, @NotNull TitleSubtitleCellDTO dto, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(titleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        BindExtKt.bindHolder(titleSubtitleCellView, dto, new TitleSubtitleCellHolderKt$bind$provider$1(titleSubtitleCellView), function1);
    }

    public static /* synthetic */ void bind$default(TitleSubtitleCellView titleSubtitleCellView, TitleSubtitleCellDTO titleSubtitleCellDTO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        bind(titleSubtitleCellView, titleSubtitleCellDTO, function1);
    }

    @InterfaceC3999a
    public static final void bindCellData(@NotNull TitleSubtitleCellView titleSubtitleCellView, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO) {
        Intrinsics.checkNotNullParameter(titleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        bindTitle(titleSubtitleCellView, title);
        titleSubtitleCellView.setSubtitleVisible(commonAtomLabelDTO != null);
        if (commonAtomLabelDTO != null) {
            bindSubTitle(titleSubtitleCellView, commonAtomLabelDTO);
        }
    }

    @InterfaceC3999a
    public static final void bindSubTitle(@NotNull TitleSubtitleCellView titleSubtitleCellView, CommonAtomLabelDTO commonAtomLabelDTO) {
        TestInfo testInfo;
        Integer num;
        Integer numberOfLines;
        Intrinsics.checkNotNullParameter(titleSubtitleCellView, "<this>");
        titleSubtitleCellView.setSubtitleTagSupported(commonAtomLabelDTO != null ? commonAtomLabelDTO.getTagSupported() : false);
        String str = null;
        titleSubtitleCellView.setSubtitleText(commonAtomLabelDTO != null ? commonAtomLabelDTO.getText() : null);
        if (commonAtomLabelDTO != null && (numberOfLines = commonAtomLabelDTO.getNumberOfLines()) != null) {
            titleSubtitleCellView.setSubtitleNumberOfLines(numberOfLines.intValue());
        }
        titleSubtitleCellView.setSubtitleTruncatingMode(commonAtomLabelDTO != null ? commonAtomLabelDTO.getTruncatingMode() : null);
        if (commonAtomLabelDTO != null) {
            Context context = titleSubtitleCellView.getContext();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = titleSubtitleCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            String textColor = commonAtomLabelDTO.getTextColor();
            if (textColor == null) {
                textColor = "textSecondary";
            }
            Integer mapColor = styleParser.mapColor(context2, textColor);
            TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(titleSubtitleCellView, a.getColor(context, mapColor != null ? mapColor.intValue() : R$color.text_secondary), 0.0f, 2, null);
            String icon = commonAtomLabelDTO.getIcon();
            if (icon != null) {
                Context context3 = titleSubtitleCellView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                num = TokensExtKt.getIconResByToken(context3, icon);
            } else {
                num = null;
            }
            CommonAtomLabelDTO.IconPosition iconPosition = commonAtomLabelDTO.getIconPosition();
            if (iconPosition == null) {
                iconPosition = CommonAtomLabelDTO.IconPosition.END;
            }
            AddonSide iconPosition2 = getIconPosition(iconPosition);
            Context context4 = titleSubtitleCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            titleSubtitleCellView.setSubtitleIcon(num, iconPosition2, styleParser.mapColor(context4, commonAtomLabelDTO.getIconTintColor()));
        }
        SmartLabel addonView = titleSubtitleCellView.getAddonView();
        if (commonAtomLabelDTO != null && (testInfo = commonAtomLabelDTO.getTestInfo()) != null) {
            str = testInfo.getAutomatizationId();
        }
        addonView.setContentDescription(str);
    }

    @InterfaceC3999a
    public static final void bindTitle(@NotNull TitleSubtitleCellView titleSubtitleCellView, @NotNull CommonAtomLabelDTO title) {
        Integer num;
        Intrinsics.checkNotNullParameter(titleSubtitleCellView, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        titleSubtitleCellView.setTitleTagSupported(title.getTagSupported());
        titleSubtitleCellView.setTitleText(title.getText());
        Integer numberOfLines = title.getNumberOfLines();
        if (numberOfLines != null) {
            titleSubtitleCellView.setTitleNumberOfLines(numberOfLines.intValue());
        }
        titleSubtitleCellView.setTitleTruncatingMode(title.getTruncatingMode());
        Context context = titleSubtitleCellView.getContext();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = titleSubtitleCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String textColor = title.getTextColor();
        if (textColor == null) {
            textColor = "textPrimary";
        }
        Integer mapColor = styleParser.mapColor(context2, textColor);
        TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(titleSubtitleCellView, a.getColor(context, mapColor != null ? mapColor.intValue() : R$color.text_primary), 0.0f, 2, null);
        String icon = title.getIcon();
        if (icon != null) {
            Context context3 = titleSubtitleCellView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            num = TokensExtKt.getIconResByToken(context3, icon);
        } else {
            num = null;
        }
        CommonAtomLabelDTO.IconPosition iconPosition = title.getIconPosition();
        if (iconPosition == null) {
            iconPosition = CommonAtomLabelDTO.IconPosition.END;
        }
        AddonSide iconPosition2 = getIconPosition(iconPosition);
        Context context4 = titleSubtitleCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        titleSubtitleCellView.setTitleIcon(num, iconPosition2, styleParser.mapColor(context4, title.getIconTintColor()));
        SmartLabel mainView = titleSubtitleCellView.getMainView();
        TestInfo testInfo = title.getTestInfo();
        mainView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    @InterfaceC3999a
    @NotNull
    public static final AddonSide getIconPosition(@NotNull CommonAtomLabelDTO.IconPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        int i11 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i11 == 1) {
            return AddonSide.START;
        }
        if (i11 == 2) {
            return AddonSide.END;
        }
        throw new o();
    }
}
