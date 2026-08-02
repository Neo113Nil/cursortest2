package ru.ozon.app.android.ugc.widgets.selectionItemForm.core;

import Ih.a;
import Tc.b;
import WZ.t;
import WZ.x;
import e10.AbstractC6252b;
import j20.C7244b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.actionHandlers.ugc.updateCellSelectionFormMobile.data.SelectionFormCellDTO;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductPickerDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.cell.SelectionFormCellVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.cellSelector.SelectionFormCellSelectorVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.disclaimer.SelectionFormDisclaimerVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.SelectionFormProductPickerVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton.SelectionFormSubmitButtonVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001!B\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u0014*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/core/SelectionItemFormConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO;", "", "stateId", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVO;", "getHeaderVO", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO;Ljava/lang/String;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVO;", "", "", "getItemsVO", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;", "entityType", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;", "getFooterVO", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "supportedPlaceholders", "Ljava/util/Set;", "getSupportedPlaceholders", "()Ljava/util/Set;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionItemFormConfig extends AbstractC6252b {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final Set<String> supportedPlaceholders;
    public static final int $stable = 8;

    public SelectionItemFormConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.supportedPlaceholders = e0.h("headerSecondFloor");
    }

    private final SelectionFormSubmitButtonVO getFooterVO(SelectionItemFormDTO selectionItemFormDTO, String str, SelectionItemFormDTO.EntityType entityType) {
        long a11 = a.a("SubmitButton", str);
        Object footer = selectionItemFormDTO.getFooter();
        if (footer instanceof ButtonV3DTO) {
            return new SelectionFormSubmitButtonVO(a11, entityType, new SelectionFormSubmitButtonVO.ButtonWrapper.SingleButton((ButtonV3DTO) selectionItemFormDTO.getFooter()));
        }
        if (footer instanceof SelectionItemFormDTO.DoubleButton) {
            return new SelectionFormSubmitButtonVO(a11, entityType, new SelectionFormSubmitButtonVO.ButtonWrapper.DoubleButton(((SelectionItemFormDTO.DoubleButton) selectionItemFormDTO.getFooter()).getFirstButton(), ((SelectionItemFormDTO.DoubleButton) selectionItemFormDTO.getFooter()).getSecondButton()));
        }
        throw new IllegalStateException("undefined footer type");
    }

    private final SelectionFormHeaderVO getHeaderVO(SelectionItemFormDTO selectionItemFormDTO, String str) {
        long a11 = a.a("Header", str);
        IconButtonV3DTO backButton = selectionItemFormDTO.getHeader().getBackButton();
        TextDTO title = selectionItemFormDTO.getHeader().getTitle();
        TextDTO subtitle = selectionItemFormDTO.getHeader().getSubtitle();
        IconButtonV3DTO rightButton = selectionItemFormDTO.getHeader().getRightButton();
        SelectionItemFormDTO.BackSubmit backSubmit = selectionItemFormDTO.getHeader().getBackSubmit();
        Map<String, TokenizedTrackingInfo> trackingInfo = selectionItemFormDTO.getTrackingInfo();
        return new SelectionFormHeaderVO(a11, backButton, title, subtitle, rightButton, backSubmit, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(a11), null) : null);
    }

    private final List<Object> getItemsVO(SelectionItemFormDTO selectionItemFormDTO, String str) {
        Object selectionFormCellSelectorVO;
        List<Object> items = selectionItemFormDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            long hashCode = (i11 + str).hashCode();
            if (obj instanceof SelectionItemFormDTO.SelectionFormTextAreaDTO) {
                SelectionItemFormDTO.SelectionFormTextAreaDTO selectionFormTextAreaDTO = (SelectionItemFormDTO.SelectionFormTextAreaDTO) obj;
                String uploadKey = selectionFormTextAreaDTO.getUploadKey();
                String placeholder = selectionFormTextAreaDTO.getPlaceholder();
                String text = selectionFormTextAreaDTO.getText();
                String errorRequiredText = selectionFormTextAreaDTO.getErrorRequiredText();
                Boolean showCounter = selectionFormTextAreaDTO.getShowCounter();
                String hint = selectionFormTextAreaDTO.getHint();
                Integer maxCounterValue = selectionFormTextAreaDTO.getMaxCounterValue();
                Integer maxLinesCount = selectionFormTextAreaDTO.getMaxLinesCount();
                Map<String, TokenizedTrackingInfo> trackingInfo = selectionFormTextAreaDTO.getTrackingInfo();
                t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null;
                Map<String, TokenizedTrackingInfo> errorViewTrackingInfo = selectionFormTextAreaDTO.getErrorViewTrackingInfo();
                selectionFormCellSelectorVO = new SelectionFormInputVO(hashCode, uploadKey, placeholder, text, hint, errorRequiredText, showCounter, maxCounterValue, maxLinesCount, b11, errorViewTrackingInfo != null ? x.b(errorViewTrackingInfo, Long.valueOf(hashCode), null) : null);
            } else {
                if (obj instanceof SelectionFormCellDTO) {
                    obj = SelectionFormCellVO.INSTANCE.createFromSelectionFormCellDTO(hashCode, (SelectionFormCellDTO) obj);
                } else if (obj instanceof DisclaimerDTO) {
                    obj = new SelectionFormDisclaimerVO(hashCode, (DisclaimerDTO) obj);
                } else if (obj instanceof SelectionItemFormDTO.SelectionFormCellSelectorDTO) {
                    SelectionItemFormDTO.SelectionFormCellSelectorDTO selectionFormCellSelectorDTO = (SelectionItemFormDTO.SelectionFormCellSelectorDTO) obj;
                    selectionFormCellSelectorVO = new SelectionFormCellSelectorVO(hashCode, selectionFormCellSelectorDTO.getUploadKey(), selectionFormCellSelectorDTO.isSelected(), selectionFormCellSelectorDTO.getNormal(), selectionFormCellSelectorDTO.getSelected(), selectionFormCellSelectorDTO.getTrackingInfo());
                } else if (obj instanceof ProductPickerDTO) {
                    obj = SelectionFormProductPickerVO.INSTANCE.createFromProductPickerDTO(hashCode, (ProductPickerDTO) obj);
                }
                arrayList.add(obj);
                i11 = i12;
            }
            obj = selectionFormCellSelectorVO;
            arrayList.add(obj);
            i11 = i12;
        }
        return arrayList;
    }

    @Override // e10.AbstractC6252b, j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return this.supportedPlaceholders;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String c11 = state.c().c();
        JsonParser jsonParser = this.jsonDeserializer;
        String b11 = state.b();
        if (b11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        SelectionItemFormDTO selectionItemFormDTO = (SelectionItemFormDTO) jsonParser.fromJson(b11, SelectionItemFormDTO.class);
        b builder = C7714v.B();
        builder.add(getHeaderVO(selectionItemFormDTO, c11));
        builder.addAll(getItemsVO(selectionItemFormDTO, c11));
        builder.add(getFooterVO(selectionItemFormDTO, c11, selectionItemFormDTO.getEntityType()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
