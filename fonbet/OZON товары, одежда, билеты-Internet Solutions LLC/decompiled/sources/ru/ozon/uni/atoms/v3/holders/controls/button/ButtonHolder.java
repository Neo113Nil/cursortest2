package ru.ozon.uni.atoms.v3.holders.controls.button;

import Sc.InterfaceC3999a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.controls.button.ButtonApi;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonColorSettingsKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@InterfaceC3999a
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J%\u0010\u000f\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014J'\u0010\u0015\u001a\u00020\r*\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/button/ButtonHolder;", "Lru/ozon/uni/atoms/v3/holders/controls/button/ButtonAtomHolder;", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "Lru/ozon/uni/android/controls/button/ButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/button/ButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "iconTintColor", "", "(Lru/ozon/uni/android/controls/button/ButtonView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;Ljava/lang/Integer;)V", "bindSubtitle", "subtitle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonHolder extends ButtonAtomHolder<ButtonDTO, ButtonView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonHolder(@NotNull ButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void bindSubtitle(ButtonView buttonView, CommonAtomLabelDTO commonAtomLabelDTO, Integer num) {
        TestInfo testInfo;
        OzonSpannableString text;
        String str = null;
        buttonView.setSubtitleText((commonAtomLabelDTO == null || (text = commonAtomLabelDTO.getText()) == null) ? null : text.toString());
        buttonView.setTitleTruncatingMode(commonAtomLabelDTO != null ? commonAtomLabelDTO.getTruncatingMode() : null);
        Context context = buttonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonApi.DefaultImpls.setSubtitleIcon$default(buttonView, TokensExtKt.getIconResByToken(context, commonAtomLabelDTO != null ? commonAtomLabelDTO.getIcon() : null), null, num, 2, null);
        SmartLabel addonView = buttonView.getMainView().getAddonView();
        if (commonAtomLabelDTO != null && (testInfo = commonAtomLabelDTO.getTestInfo()) != null) {
            str = testInfo.getAutomatizationId();
        }
        addonView.setContentDescription(str);
    }

    private final void bindTitle(ButtonView buttonView, CommonAtomLabelDTO commonAtomLabelDTO, Integer num) {
        buttonView.setTitleText(commonAtomLabelDTO.getText().toString());
        buttonView.setTitleTruncatingMode(commonAtomLabelDTO.getTruncatingMode());
        Context context = buttonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonApi.DefaultImpls.setTitleIcon$default(buttonView, TokensExtKt.getIconResByToken(context, commonAtomLabelDTO.getIcon()), null, num, 2, null);
        SmartLabel mainView = buttonView.getMainView().getMainView();
        TestInfo testInfo = commonAtomLabelDTO.getTestInfo();
        mainView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonHolder(@NotNull Context context, String str) {
        this(new ButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ButtonHolder) item);
        ButtonView buttonView = (ButtonView) getContainerView();
        ButtonDTO.Preset preset = item.getPreset();
        if (preset == null) {
            preset = ButtonDTO.Preset.SIZE_400;
        }
        buttonView.setPreset(preset);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = buttonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String iconTintColor = item.getTitle().getIconTintColor();
        if (iconTintColor == null) {
            CommonAtomLabelDTO subtitle = item.getSubtitle();
            iconTintColor = subtitle != null ? subtitle.getIconTintColor() : null;
        }
        Integer mapColor = styleParser.mapColor(context, iconTintColor);
        try {
            buttonView.applyStyle$uni_release(ButtonColorSettingsKt.getStyleResource(item.getStyle()), mapColor);
        } catch (UnsupportedOperationException unused) {
            buttonView.applyStyle$uni_release(R$style.Button_ActionPrimary, mapColor);
        }
        bindTitle(buttonView, item.getTitle(), mapColor);
        bindSubtitle(buttonView, item.getSubtitle(), mapColor);
        Boolean isEnabled = item.isEnabled();
        buttonView.setButtonState(mapState(isEnabled != null ? isEnabled.booleanValue() : true));
    }
}
