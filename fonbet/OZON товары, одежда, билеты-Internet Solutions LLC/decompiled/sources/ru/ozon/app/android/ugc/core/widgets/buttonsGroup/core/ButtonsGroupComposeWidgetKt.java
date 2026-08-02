package ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core;

import d00.C6020f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.data.ButtonsGroupDTO;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.presentation.ButtonsGroupVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\r*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "ButtonsGroup", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "", "targetAuthorId", "", "isSubscribed", "updateButtonSelectorForAuthor", "(Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;Ljava/lang/String;Z)Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO$ButtonItem;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ButtonItem;", "toButtonItem", "(Ljava/util/List;)Ljava/util/List;", "", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "toItemVO", "(Ljava/lang/Object;)Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO$ItemVO;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonsGroupComposeWidgetKt {
    @NotNull
    public static final i ButtonsGroup(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("rpProduct", "buttonsGroup", null, new ButtonsGroupComposeWidgetKt$ButtonsGroup$1(jsonDeserializer), 4, null);
    }

    @NotNull
    public static final List<ButtonsGroupVO.ButtonItem> toButtonItem(@NotNull List<ButtonsGroupDTO.ButtonItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (ButtonsGroupDTO.ButtonItem buttonItem : list) {
            arrayList.add(new ButtonsGroupVO.ButtonItem(toItemVO(buttonItem.getButton()), buttonItem.isFullWidth()));
        }
        return arrayList;
    }

    private static final ButtonsGroupVO.ItemVO toItemVO(Object obj) {
        if (obj instanceof ButtonV3DTO) {
            return new ButtonsGroupVO.ItemVO.ButtonWrapper((ButtonV3DTO) obj);
        }
        if (obj instanceof IconButtonV3DTO) {
            return new ButtonsGroupVO.ItemVO.IconButtonWrapper((IconButtonV3DTO) obj);
        }
        if (!(obj instanceof ButtonsGroupDTO.ButtonSelector)) {
            return null;
        }
        ButtonsGroupDTO.ButtonSelector buttonSelector = (ButtonsGroupDTO.ButtonSelector) obj;
        return new ButtonsGroupVO.ItemVO.ButtonSelector(buttonSelector.isSelected(), buttonSelector.getNormal(), buttonSelector.getSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonsGroupVO updateButtonSelectorForAuthor(ButtonsGroupVO buttonsGroupVO, String str, boolean z11) {
        boolean z12;
        AtomActionDTO action;
        Map<String, String> params;
        List<ButtonsGroupVO.ButtonItem> buttons = buttonsGroupVO.getButtons();
        ArrayList arrayList = new ArrayList(C7714v.z(buttons, 10));
        for (ButtonsGroupVO.ButtonItem buttonItem : buttons) {
            if (buttonItem.getItem() instanceof ButtonsGroupVO.ItemVO.ButtonSelector) {
                ButtonsGroupVO.ItemVO.ButtonSelector buttonSelector = (ButtonsGroupVO.ItemVO.ButtonSelector) buttonItem.getItem();
                CommonControlSettings common = buttonSelector.getNormal().getCommon();
                if (Intrinsics.d((common == null || (action = common.getAction()) == null || (params = action.getParams()) == null) ? null : params.get("authorId"), str)) {
                    z12 = z11;
                    buttonItem = ButtonsGroupVO.ButtonItem.copy$default(buttonItem, ButtonsGroupVO.ItemVO.ButtonSelector.copy$default(buttonSelector, z12, null, null, 6, null), false, 2, null);
                    arrayList.add(buttonItem);
                    z11 = z12;
                }
            }
            z12 = z11;
            arrayList.add(buttonItem);
            z11 = z12;
        }
        return ButtonsGroupVO.copy$default(buttonsGroupVO, 0L, arrayList, null, null, null, null, null, 125, null);
    }
}
