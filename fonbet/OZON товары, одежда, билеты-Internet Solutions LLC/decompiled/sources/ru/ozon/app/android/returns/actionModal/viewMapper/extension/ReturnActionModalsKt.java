package ru.ozon.app.android.returns.actionModal.viewMapper.extension;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.returns.R$string;
import ru.ozon.app.android.returns.actionModal.data.dto.ReturnActionModalDto;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.common.presentation.untils.LegacyTextMapperKt;
import ru.ozon.app.android.returns.ui.data.components.Component;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniTextStyles;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u00020\u0002H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\fH\u0002¨\u0006\r"}, d2 = {"toVO", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO;", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "stateId", "", "mapComponents", "", "Lru/ozon/app/android/returns/actionModal/presentation/viewObject/ReturnActionModalVO$ActionComponent;", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponent;", "key", "toTabsDTO", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "details_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnActionModalsKt {
    private static final List<ReturnActionModalVO.ActionComponent> mapComponents(ReturnActionModalDto returnActionModalDto) {
        Map<String, ReturnActionModalDto.ActionComponent> components;
        List<ReturnActionModalDto.ActionComponentGroup> componentGroups = returnActionModalDto.getComponentGroups();
        if (componentGroups == null || (components = returnActionModalDto.getComponents()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ReturnActionModalDto.ActionComponentGroup> it = componentGroups.iterator();
        while (it.hasNext()) {
            for (String str : it.next().getComponentKeys()) {
                ReturnActionModalDto.ActionComponent actionComponent = components.get(str);
                if (actionComponent != null) {
                    arrayList.add(toVO(actionComponent, str));
                }
            }
        }
        return arrayList;
    }

    private static final TabsDTO toTabsDTO(Tabs tabs) {
        List<Tabs.TabsItem> tabItems = tabs.getTabItems();
        ArrayList arrayList = new ArrayList(C7714v.z(tabItems, 10));
        for (Tabs.TabsItem tabsItem : tabItems) {
            String obj = tabsItem.getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            arrayList.add(new TabsDTO.TabDTO(obj, null, null, null, null, new CommonControlSettings(tabsItem.getAction(), tabsItem.getTrackingInfo(), tabsItem.getTestInfo()), null, null, null, null, 990, null));
        }
        Iterator<Tabs.TabsItem> it = tabs.getTabItems().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().isSelected()) {
                break;
            }
            i11++;
        }
        return new TabsDTO(arrayList, i11, null, null, tabs.getTrackingInfo(), null, null, null, tabs.getBackgroundColor(), 236, null);
    }

    @NotNull
    public static final ReturnActionModalVO toVO(@NotNull ReturnActionModalDto returnActionModalDto, @NotNull String stateId) {
        ButtonV3DTO buttonV3DTO;
        TextDTO textDTO;
        Intrinsics.checkNotNullParameter(returnActionModalDto, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        Gallery photos = returnActionModalDto.getPhotos();
        List<ReturnActionModalVO.ActionComponent> mapComponents = mapComponents(returnActionModalDto);
        String returnNumber = returnActionModalDto.getReturnNumber();
        String obj = returnActionModalDto.getSubmitButton().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        CommonControlSettings commonControlSettings = new CommonControlSettings(returnActionModalDto.getSubmitButton().getAction(), returnActionModalDto.getSubmitButton().getTrackingInfo(), returnActionModalDto.getSubmitButton().getTestInfo());
        ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_600;
        ButtonV3DTO buttonV3DTO2 = new ButtonV3DTO(null, sizes, obj, null, null, null, null, null, null, null, null, null, null, commonControlSettings, null, null, null, null, 253945, null);
        ButtonV3Atom.LargeButton cancelButton = returnActionModalDto.getCancelButton();
        if (cancelButton != null) {
            String obj2 = cancelButton.getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
            buttonV3DTO = new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_SECONDARY, sizes, obj2, null, null, null, null, null, null, null, null, null, null, new CommonControlSettings(cancelButton.getAction(), cancelButton.getTrackingInfo(), cancelButton.getTestInfo()), null, null, null, null, 253944, null);
        } else {
            buttonV3DTO = null;
        }
        Map<String, String> extraValues = returnActionModalDto.getExtraValues();
        String action = returnActionModalDto.getAction();
        TextAtom title = returnActionModalDto.getTitle();
        TextDTO copy$default = (title == null || (textDTO = LegacyTextMapperKt.toTextDTO(title)) == null) ? null : TextDTO.copy$default(textDTO, null, null, null, null, null, null, null, UniTextStyles.HEADLINE_700_X_LARGE.getToken(), null, null, null, null, null, false, null, null, null, null, null, 524159, null);
        TextAtom subtitle = returnActionModalDto.getSubtitle();
        TextDTO textDTO2 = subtitle != null ? LegacyTextMapperKt.toTextDTO(subtitle) : null;
        Tabs tabs = returnActionModalDto.getTabs();
        return new ReturnActionModalVO(hashCode, returnNumber, action, copy$default, textDTO2, tabs != null ? toTabsDTO(tabs) : null, returnActionModalDto.getHint(), photos, mapComponents, buttonV3DTO2, buttonV3DTO, extraValues);
    }

    private static final ReturnActionModalVO.ActionComponent toVO(ReturnActionModalDto.ActionComponent actionComponent, String str) {
        Component input = actionComponent.getInput();
        if (input != null || (input = actionComponent.getTextArea()) != null || (input = actionComponent.getUploadPhotos()) != null) {
            Component component = input;
            TextPreset textPreset = TextPreset.PRESET_CUSTOM;
            String emptyComponentErrorText = actionComponent.getEmptyComponentErrorText();
            if (emptyComponentErrorText == null) {
                emptyComponentErrorText = StringProvider.getString(R$string.required_field);
            }
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(emptyComponentErrorText);
            UniTheme uniTheme = UniTheme.INSTANCE;
            TextDTO textDTO = new TextDTO(ozonSpannableString, null, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getBody300XSmall().getId(), uniTheme.getColorTokens().getGraphicAccentPrimary().getId(), null, null, null, null, false, null, null, null, null, null, 523838, null);
            TextAtom subtitle = actionComponent.getSubtitle();
            return new ReturnActionModalVO.ActionComponent(str, LegacyTextMapperKt.toTextDTO(actionComponent.getTitle()), subtitle != null ? LegacyTextMapperKt.toTextDTO(subtitle) : null, false, textDTO, component);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
